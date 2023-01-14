package p174e.p247e.p253d.p264k;

/* renamed from: e.e.d.k.e */
public enum C6109e {
    YES,
    NO,
    UNSET;

    /* renamed from: e.e.d.k.e$a */
    static /* synthetic */ class C6110a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16763a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                e.e.d.k.e[] r0 = p174e.p247e.p253d.p264k.C6109e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16763a = r0
                e.e.d.k.e r1 = p174e.p247e.p253d.p264k.C6109e.YES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16763a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.e.d.k.e r1 = p174e.p247e.p253d.p264k.C6109e.NO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16763a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.e.d.k.e r1 = p174e.p247e.p253d.p264k.C6109e.UNSET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p253d.p264k.C6109e.C6110a.<clinit>():void");
        }
    }

    /* renamed from: h */
    public static C6109e m22994h(boolean z) {
        return z ? YES : NO;
    }

    /* renamed from: e */
    public boolean mo18109e() {
        int i = C6110a.f16763a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
        throw new IllegalStateException("No boolean equivalent for UNSET");
    }

    /* renamed from: g */
    public boolean mo18110g() {
        return this != UNSET;
    }
}
