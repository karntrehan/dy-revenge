package p174e.p319f.p393c.p394a;

import java.security.GeneralSecurityException;
import p174e.p319f.p393c.p394a.C9227h;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9443c0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9537s0;

/* renamed from: e.f.c.a.f */
public class C9222f<PrimitiveT, KeyProtoT extends C9537s0> implements C9221e<PrimitiveT> {

    /* renamed from: a */
    private final C9227h<KeyProtoT> f25128a;

    /* renamed from: b */
    private final Class<PrimitiveT> f25129b;

    /* renamed from: e.f.c.a.f$a */
    private static class C9223a<KeyFormatProtoT extends C9537s0, KeyProtoT extends C9537s0> {

        /* renamed from: a */
        final C9227h.C9228a<KeyFormatProtoT, KeyProtoT> f25130a;

        C9223a(C9227h.C9228a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f25130a = aVar;
        }

        /* renamed from: b */
        private KeyProtoT m30630b(KeyFormatProtoT keyformatprotot) {
            this.f25130a.mo23210d(keyformatprotot);
            return (C9537s0) this.f25130a.mo23207a(keyformatprotot);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public KeyProtoT mo23196a(C9468i iVar) {
            return m30630b(this.f25130a.mo23209c(iVar));
        }
    }

    public C9222f(C9227h<KeyProtoT> hVar, Class<PrimitiveT> cls) {
        if (hVar.mo23205h().contains(cls) || Void.class.equals(cls)) {
            this.f25128a = hVar;
            this.f25129b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{hVar.toString(), cls.getName()}));
    }

    /* renamed from: f */
    private C9223a<?, KeyProtoT> m30623f() {
        return new C9223a<>(this.f25128a.mo23202e());
    }

    /* renamed from: g */
    private PrimitiveT m30624g(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.f25129b)) {
            this.f25128a.mo23206i(keyprotot);
            return this.f25128a.mo23201d(keyprotot, this.f25129b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: a */
    public final boolean mo23191a(String str) {
        return str.equals(mo23195e());
    }

    /* renamed from: b */
    public final C9537s0 mo23192b(C9468i iVar) {
        try {
            return m30623f().mo23196a(iVar);
        } catch (C9443c0 e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f25128a.mo23202e().mo23208b().getName(), e);
        }
    }

    /* renamed from: c */
    public final C9419y mo23193c(C9468i iVar) {
        try {
            return (C9419y) C9419y.m31372U().mo23471B(mo23195e()).mo23472C(m30623f().mo23196a(iVar).mo23477f()).mo23473z(this.f25128a.mo23203f()).mo23985b();
        } catch (C9443c0 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: d */
    public final PrimitiveT mo23194d(C9468i iVar) {
        try {
            return m30624g(this.f25128a.mo23204g(iVar));
        } catch (C9443c0 e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f25128a.mo23199b().getName(), e);
        }
    }

    /* renamed from: e */
    public final String mo23195e() {
        return this.f25128a.mo23200c();
    }
}
