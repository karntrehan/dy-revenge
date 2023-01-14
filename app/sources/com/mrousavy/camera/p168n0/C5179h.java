package com.mrousavy.camera.p168n0;

/* renamed from: com.mrousavy.camera.n0.h */
public final class C5179h {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        r3 = r3.getClass();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.util.Range<java.lang.Integer> m19458a(java.lang.Object r3, java.lang.Object r4) {
        /*
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x001b
            android.util.Range r0 = new android.util.Range
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            java.util.Objects.requireNonNull(r4, r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.<init>(r3, r4)
            goto L_0x003f
        L_0x001b:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0040
            android.util.Range r0 = new android.util.Range
            java.lang.Number r3 = (java.lang.Number) r3
            double r1 = r3.doubleValue()
            int r3 = (int) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Double"
            java.util.Objects.requireNonNull(r4, r1)
            java.lang.Double r4 = (java.lang.Double) r4
            double r1 = r4.doubleValue()
            int r4 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.<init>(r3, r4)
        L_0x003f:
            return r0
        L_0x0040:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DeviceFormat: frameRateRanges contained a Range that didn't have minFrameRate/maxFrameRate of types Int/Double! Actual Type: "
            r1.append(r2)
            r2 = 0
            if (r3 != 0) goto L_0x0051
        L_0x004f:
            r3 = r2
            goto L_0x005c
        L_0x0051:
            java.lang.Class r3 = r3.getClass()
            if (r3 != 0) goto L_0x0058
            goto L_0x004f
        L_0x0058:
            java.lang.String r3 = r3.getName()
        L_0x005c:
            r1.append(r3)
            java.lang.String r3 = " & "
            r1.append(r3)
            if (r4 == 0) goto L_0x0071
            java.lang.Class r3 = r4.getClass()
            if (r3 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            java.lang.String r2 = r3.getName()
        L_0x0071:
            r1.append(r2)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.p168n0.C5179h.m19458a(java.lang.Object, java.lang.Object):android.util.Range");
    }
}
