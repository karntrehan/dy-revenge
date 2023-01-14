package p174e.p319f.p393c.p394a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p174e.p319f.p393c.p394a.p403y.C9324c0;

/* renamed from: e.f.c.a.c */
public final class C9218c {

    /* renamed from: a */
    public static final byte[] f25126a = new byte[0];

    /* renamed from: e.f.c.a.c$a */
    static /* synthetic */ class C9219a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25127a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                e.f.c.a.y.i0[] r0 = p174e.p319f.p393c.p394a.p403y.C9364i0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25127a = r0
                e.f.c.a.y.i0 r1 = p174e.p319f.p393c.p394a.p403y.C9364i0.LEGACY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25127a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.c.a.y.i0 r1 = p174e.p319f.p393c.p394a.p403y.C9364i0.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25127a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.c.a.y.i0 r1 = p174e.p319f.p393c.p394a.p403y.C9364i0.TINK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25127a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.c.a.y.i0 r1 = p174e.p319f.p393c.p394a.p403y.C9364i0.RAW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.C9218c.C9219a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static byte[] m30616a(C9324c0.C9327c cVar) {
        ByteBuffer put;
        int i = C9219a.f25127a[cVar.mo23374T().ordinal()];
        if (i == 1 || i == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else if (i == 3) {
            put = ByteBuffer.allocate(5).put((byte) 1);
        } else if (i == 4) {
            return f25126a;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return put.putInt(cVar.mo23373S()).array();
    }
}
