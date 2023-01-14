package p174e.p319f.p393c.p394a.p395a0;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import p174e.p319f.p393c.p394a.p395a0.C9196n;

/* renamed from: e.f.c.a.a0.m */
public final class C9195m<T_WRAPPER extends C9196n<T_ENGINE>, T_ENGINE> {

    /* renamed from: a */
    private static final Logger f25101a = Logger.getLogger(C9195m.class.getName());

    /* renamed from: b */
    private static final List<Provider> f25102b = (C9213v.m30604b() ? m30563b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList<>());

    /* renamed from: c */
    public static final C9195m<C9196n.C9197a, Cipher> f25103c = new C9195m<>(new C9196n.C9197a());

    /* renamed from: d */
    public static final C9195m<C9196n.C9201e, Mac> f25104d = new C9195m<>(new C9196n.C9201e());

    /* renamed from: e */
    public static final C9195m<C9196n.C9203g, Signature> f25105e = new C9195m<>(new C9196n.C9203g());

    /* renamed from: f */
    public static final C9195m<C9196n.C9202f, MessageDigest> f25106f = new C9195m<>(new C9196n.C9202f());

    /* renamed from: g */
    public static final C9195m<C9196n.C9198b, KeyAgreement> f25107g = new C9195m<>(new C9196n.C9198b());

    /* renamed from: h */
    public static final C9195m<C9196n.C9200d, KeyPairGenerator> f25108h = new C9195m<>(new C9196n.C9200d());

    /* renamed from: i */
    public static final C9195m<C9196n.C9199c, KeyFactory> f25109i = new C9195m<>(new C9196n.C9199c());

    /* renamed from: j */
    private T_WRAPPER f25110j;

    /* renamed from: k */
    private List<Provider> f25111k = f25102b;

    /* renamed from: l */
    private boolean f25112l = true;

    public C9195m(T_WRAPPER t_wrapper) {
        this.f25110j = t_wrapper;
    }

    /* renamed from: b */
    public static List<Provider> m30563b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f25101a.info(String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public T_ENGINE mo23175a(String str) {
        Exception exc = null;
        for (Provider a : this.f25111k) {
            try {
                return this.f25110j.mo23176a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (this.f25112l) {
            return this.f25110j.mo23176a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
