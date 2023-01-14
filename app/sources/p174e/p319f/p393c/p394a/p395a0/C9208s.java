package p174e.p319f.p393c.p394a.p395a0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import p174e.p319f.p393c.p394a.p402x.C9308a;

/* renamed from: e.f.c.a.a0.s */
public final class C9208s implements C9308a {

    /* renamed from: a */
    private final ThreadLocal<Mac> f25116a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f25117b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Key f25118c;

    /* renamed from: d */
    private final int f25119d;

    /* renamed from: e.f.c.a.a0.s$a */
    class C9209a extends ThreadLocal<Mac> {
        C9209a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac a = C9195m.f25104d.mo23175a(C9208s.this.f25117b);
                a.init(C9208s.this.f25118c);
                return a;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C9208s(String str, Key key) {
        int i;
        C9209a aVar = new C9209a();
        this.f25116a = aVar;
        this.f25117b = str;
        this.f25118c = key;
        if (key.getEncoded().length >= 16) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = 20;
                    break;
                case 1:
                    i = 32;
                    break;
                case 2:
                    i = 48;
                    break;
                case 3:
                    i = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
            }
            this.f25119d = i;
            aVar.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    /* renamed from: a */
    public byte[] mo23184a(byte[] bArr, int i) {
        if (i <= this.f25119d) {
            this.f25116a.get().update(bArr);
            return Arrays.copyOf(this.f25116a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
