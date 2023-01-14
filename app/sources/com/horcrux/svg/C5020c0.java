package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.c0 */
class C5020c0 {

    /* renamed from: a */
    final double f14015a;

    /* renamed from: b */
    final C5022b f14016b;

    /* renamed from: com.horcrux.svg.c0$a */
    static /* synthetic */ class C5021a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14017a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14017a = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14017a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14017a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5020c0.C5021a.<clinit>():void");
        }
    }

    /* renamed from: com.horcrux.svg.c0$b */
    public enum C5022b {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    private C5020c0() {
        this.f14015a = 0.0d;
        this.f14016b = C5022b.UNKNOWN;
    }

    C5020c0(double d) {
        this.f14015a = d;
        this.f14016b = C5022b.NUMBER;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r6.f14016b = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c3, code lost:
        r7 = r7.substring(0, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C5020c0(java.lang.String r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r7 = r7.trim()
            int r0 = r7.length()
            int r1 = r0 + -1
            if (r0 == 0) goto L_0x00cf
            java.lang.String r2 = "normal"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0019
            goto L_0x00cf
        L_0x0019:
            int r2 = r7.codePointAt(r1)
            r3 = 37
            r4 = 0
            if (r2 != r3) goto L_0x0034
            com.horcrux.svg.c0$b r0 = com.horcrux.svg.C5020c0.C5022b.PERCENTAGE
            r6.f14016b = r0
            java.lang.String r7 = r7.substring(r4, r1)
        L_0x002a:
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            double r0 = r7.doubleValue()
            goto L_0x00d5
        L_0x0034:
            int r1 = r0 + -2
            if (r1 <= 0) goto L_0x00c9
            java.lang.String r2 = r7.substring(r1)
            r2.hashCode()
            r3 = -1
            int r5 = r2.hashCode()
            switch(r5) {
                case 3178: goto L_0x0096;
                case 3240: goto L_0x008b;
                case 3251: goto L_0x0080;
                case 3365: goto L_0x0075;
                case 3488: goto L_0x006a;
                case 3571: goto L_0x005f;
                case 3588: goto L_0x0054;
                case 3592: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x00a0
        L_0x0049:
            java.lang.String r5 = "px"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0052
            goto L_0x00a0
        L_0x0052:
            r3 = 7
            goto L_0x00a0
        L_0x0054:
            java.lang.String r5 = "pt"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x005d
            goto L_0x00a0
        L_0x005d:
            r3 = 6
            goto L_0x00a0
        L_0x005f:
            java.lang.String r5 = "pc"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0068
            goto L_0x00a0
        L_0x0068:
            r3 = 5
            goto L_0x00a0
        L_0x006a:
            java.lang.String r5 = "mm"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0073
            goto L_0x00a0
        L_0x0073:
            r3 = 4
            goto L_0x00a0
        L_0x0075:
            java.lang.String r5 = "in"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x007e
            goto L_0x00a0
        L_0x007e:
            r3 = 3
            goto L_0x00a0
        L_0x0080:
            java.lang.String r5 = "ex"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0089
            goto L_0x00a0
        L_0x0089:
            r3 = 2
            goto L_0x00a0
        L_0x008b:
            java.lang.String r5 = "em"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0094
            goto L_0x00a0
        L_0x0094:
            r3 = 1
            goto L_0x00a0
        L_0x0096:
            java.lang.String r5 = "cm"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r3 = 0
        L_0x00a0:
            switch(r3) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x00bc;
                case 2: goto L_0x00b9;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00a8;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            com.horcrux.svg.c0$b r1 = com.horcrux.svg.C5020c0.C5022b.NUMBER
            r6.f14016b = r1
            goto L_0x00c3
        L_0x00a8:
            com.horcrux.svg.c0$b r0 = com.horcrux.svg.C5020c0.C5022b.NUMBER
        L_0x00aa:
            r6.f14016b = r0
            goto L_0x00c2
        L_0x00ad:
            com.horcrux.svg.c0$b r0 = com.horcrux.svg.C5020c0.C5022b.PT
            goto L_0x00aa
        L_0x00b0:
            com.horcrux.svg.c0$b r0 = com.horcrux.svg.C5020c0.C5022b.PC
            goto L_0x00aa
        L_0x00b3:
            com.horcrux.svg.c0$b r0 = com.horcrux.svg.C5020c0.C5022b.MM
            goto L_0x00aa
        L_0x00b6:
            com.horcrux.svg.c0$b r0 = com.horcrux.svg.C5020c0.C5022b.IN
            goto L_0x00aa
        L_0x00b9:
            com.horcrux.svg.c0$b r0 = com.horcrux.svg.C5020c0.C5022b.EXS
            goto L_0x00aa
        L_0x00bc:
            com.horcrux.svg.c0$b r0 = com.horcrux.svg.C5020c0.C5022b.EMS
            goto L_0x00aa
        L_0x00bf:
            com.horcrux.svg.c0$b r0 = com.horcrux.svg.C5020c0.C5022b.CM
            goto L_0x00aa
        L_0x00c2:
            r0 = r1
        L_0x00c3:
            java.lang.String r7 = r7.substring(r4, r0)
            goto L_0x002a
        L_0x00c9:
            com.horcrux.svg.c0$b r0 = com.horcrux.svg.C5020c0.C5022b.NUMBER
            r6.f14016b = r0
            goto L_0x002a
        L_0x00cf:
            com.horcrux.svg.c0$b r7 = com.horcrux.svg.C5020c0.C5022b.UNKNOWN
            r6.f14016b = r7
            r0 = 0
        L_0x00d5:
            r6.f14015a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5020c0.<init>(java.lang.String):void");
    }

    /* renamed from: a */
    static ArrayList<C5020c0> m18970a(Dynamic dynamic) {
        ArrayList<C5020c0> arrayList;
        C5020c0 c0Var;
        int i = C5021a.f14017a[dynamic.getType().ordinal()];
        if (i == 1) {
            arrayList = new ArrayList<>(1);
            c0Var = new C5020c0(dynamic.asDouble());
        } else if (i == 2) {
            arrayList = new ArrayList<>(1);
            c0Var = new C5020c0(dynamic.asString());
        } else if (i != 3) {
            return null;
        } else {
            ReadableArray asArray = dynamic.asArray();
            int size = asArray.size();
            ArrayList<C5020c0> arrayList2 = new ArrayList<>(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(m18971b(asArray.getDynamic(i2)));
            }
            return arrayList2;
        }
        arrayList.add(c0Var);
        return arrayList;
    }

    /* renamed from: b */
    static C5020c0 m18971b(Dynamic dynamic) {
        int i = C5021a.f14017a[dynamic.getType().ordinal()];
        return i != 1 ? i != 2 ? new C5020c0() : new C5020c0(dynamic.asString()) : new C5020c0(dynamic.asDouble());
    }

    /* renamed from: c */
    static String m18972c(Dynamic dynamic) {
        int i = C5021a.f14017a[dynamic.getType().ordinal()];
        if (i == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i != 2) {
            return null;
        }
        return dynamic.asString();
    }
}
