package com.facebook.react.views.scroll;

/* renamed from: com.facebook.react.views.scroll.i */
public enum C3147i {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    /* renamed from: com.facebook.react.views.scroll.i$a */
    static /* synthetic */ class C3148a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8820a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.views.scroll.i[] r0 = com.facebook.react.views.scroll.C3147i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8820a = r0
                com.facebook.react.views.scroll.i r1 = com.facebook.react.views.scroll.C3147i.BEGIN_DRAG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8820a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.views.scroll.i r1 = com.facebook.react.views.scroll.C3147i.END_DRAG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8820a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.views.scroll.i r1 = com.facebook.react.views.scroll.C3147i.SCROLL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8820a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.views.scroll.i r1 = com.facebook.react.views.scroll.C3147i.MOMENTUM_BEGIN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8820a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.views.scroll.i r1 = com.facebook.react.views.scroll.C3147i.MOMENTUM_END     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.C3147i.C3148a.<clinit>():void");
        }
    }

    /* renamed from: e */
    public static String m12384e(C3147i iVar) {
        int i = C3148a.f8820a[iVar.ordinal()];
        if (i == 1) {
            return "topScrollBeginDrag";
        }
        if (i == 2) {
            return "topScrollEndDrag";
        }
        if (i == 3) {
            return "topScroll";
        }
        if (i == 4) {
            return "topMomentumScrollBegin";
        }
        if (i == 5) {
            return "topMomentumScrollEnd";
        }
        throw new IllegalArgumentException("Unsupported ScrollEventType: " + iVar);
    }
}
