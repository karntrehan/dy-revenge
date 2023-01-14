package p493i.p494g0;

import java.security.MessageDigest;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.g0.d */
public final class C10612d {

    /* renamed from: i.g0.d$a */
    public static final class C10613a implements C10611c {

        /* renamed from: a */
        private final MessageDigest f28047a;

        /* renamed from: b */
        final /* synthetic */ String f28048b;

        C10613a(String str) {
            this.f28048b = str;
            this.f28047a = MessageDigest.getInstance(str);
        }

        /* renamed from: a */
        public byte[] mo26409a() {
            return this.f28047a.digest();
        }

        /* renamed from: b */
        public void mo26410b(byte[] bArr, int i, int i2) {
            C10457l.m35320e(bArr, "input");
            this.f28047a.update(bArr, i, i2);
        }
    }

    /* renamed from: a */
    public static final C10611c m36080a(String str) {
        C10457l.m35320e(str, "algorithm");
        return new C10613a(str);
    }
}
