package p174e.p199d.p218c.p231p;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.p.f */
public class C5850f extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16326f;

    /* renamed from: e.d.c.p.f$a */
    static /* synthetic */ class C5851a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16327a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.d.c.p.f$b[] r0 = p174e.p199d.p218c.p231p.C5850f.C5852b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16327a = r0
                e.d.c.p.f$b r1 = p174e.p199d.p218c.p231p.C5850f.C5852b.DO_NOT_DISPOSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16327a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.d.c.p.f$b r1 = p174e.p199d.p218c.p231p.C5850f.C5852b.INVALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16327a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.d.c.p.f$b r1 = p174e.p199d.p218c.p231p.C5850f.C5852b.NOT_SPECIFIED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16327a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.d.c.p.f$b r1 = p174e.p199d.p218c.p231p.C5850f.C5852b.RESTORE_TO_BACKGROUND_COLOR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16327a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.d.c.p.f$b r1 = p174e.p199d.p218c.p231p.C5850f.C5852b.RESTORE_TO_PREVIOUS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f16327a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.d.c.p.f$b r1 = p174e.p199d.p218c.p231p.C5850f.C5852b.TO_BE_DEFINED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p231p.C5850f.C5851a.<clinit>():void");
        }
    }

    /* renamed from: e.d.c.p.f$b */
    public enum C5852b {
        NOT_SPECIFIED,
        DO_NOT_DISPOSE,
        RESTORE_TO_BACKGROUND_COLOR,
        RESTORE_TO_PREVIOUS,
        TO_BE_DEFINED,
        INVALID;

        /* renamed from: e */
        public static C5852b m22242e(int i) {
            switch (i) {
                case 0:
                    return NOT_SPECIFIED;
                case 1:
                    return DO_NOT_DISPOSE;
                case 2:
                    return RESTORE_TO_BACKGROUND_COLOR;
                case 3:
                    return RESTORE_TO_PREVIOUS;
                case 4:
                case 5:
                case 6:
                case 7:
                    return TO_BE_DEFINED;
                default:
                    return INVALID;
            }
        }

        public String toString() {
            switch (C5851a.f16327a[ordinal()]) {
                case 1:
                    return "Don't Dispose";
                case 2:
                    return "Invalid value";
                case 3:
                    return "Not Specified";
                case 4:
                    return "Restore to Background Color";
                case 5:
                    return "Restore to Previous";
                case 6:
                    return "To Be Defined";
                default:
                    return super.toString();
            }
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16326f = hashMap;
        hashMap.put(1, "Delay");
        hashMap.put(2, "Disposal Method");
        hashMap.put(3, "User Input Flag");
        hashMap.put(4, "Transparent Color Flag");
        hashMap.put(5, "Transparent Color Index");
    }

    public C5850f() {
        mo17120E(new C5849e(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "GIF Control";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16326f;
    }
}
