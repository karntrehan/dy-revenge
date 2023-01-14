package p174e.p319f.p393c.p394a.p395a0;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: e.f.c.a.a0.n */
public interface C9196n<T> {

    /* renamed from: e.f.c.a.a0.n$a */
    public static class C9197a implements C9196n<Cipher> {
        /* renamed from: b */
        public Cipher mo23176a(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* renamed from: e.f.c.a.a0.n$b */
    public static class C9198b implements C9196n<KeyAgreement> {
        /* renamed from: b */
        public KeyAgreement mo23176a(String str, Provider provider) {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    /* renamed from: e.f.c.a.a0.n$c */
    public static class C9199c implements C9196n<KeyFactory> {
        /* renamed from: b */
        public KeyFactory mo23176a(String str, Provider provider) {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    /* renamed from: e.f.c.a.a0.n$d */
    public static class C9200d implements C9196n<KeyPairGenerator> {
        /* renamed from: b */
        public KeyPairGenerator mo23176a(String str, Provider provider) {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* renamed from: e.f.c.a.a0.n$e */
    public static class C9201e implements C9196n<Mac> {
        /* renamed from: b */
        public Mac mo23176a(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    /* renamed from: e.f.c.a.a0.n$f */
    public static class C9202f implements C9196n<MessageDigest> {
        /* renamed from: b */
        public MessageDigest mo23176a(String str, Provider provider) {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    /* renamed from: e.f.c.a.a0.n$g */
    public static class C9203g implements C9196n<Signature> {
        /* renamed from: b */
        public Signature mo23176a(String str, Provider provider) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    /* renamed from: a */
    T mo23176a(String str, Provider provider);
}
