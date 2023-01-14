package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: kotlinx.coroutines.p0 */
public final class C10819p0 {

    /* renamed from: a */
    private static final boolean f28362a = false;

    /* renamed from: b */
    private static final boolean f28363b;

    /* renamed from: c */
    private static final boolean f28364c;

    /* renamed from: d */
    private static final AtomicLong f28365d = new AtomicLong(0);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r0.equals("auto") != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r0.equals("on") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r0.equals(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET) != false) goto L_0x0042;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.C10764w.m36599d(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0064
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x003a
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x0031
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x0027
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x0044
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
            goto L_0x0064
        L_0x0027:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0068
        L_0x0031:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
            goto L_0x0042
        L_0x003a:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0044
        L_0x0042:
            r0 = 1
            goto L_0x0068
        L_0x0044:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0064:
            boolean r0 = m36781a()
        L_0x0068:
            f28363b = r0
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.C10764w.m36600e(r0, r2)
            if (r0 == 0) goto L_0x0075
            r1 = 1
        L_0x0075:
            f28364c = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            f28365d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10819p0.<clinit>():void");
    }

    /* renamed from: a */
    public static final boolean m36781a() {
        return f28362a;
    }

    /* renamed from: b */
    public static final AtomicLong m36782b() {
        return f28365d;
    }

    /* renamed from: c */
    public static final boolean m36783c() {
        return f28363b;
    }

    /* renamed from: d */
    public static final boolean m36784d() {
        return f28364c;
    }
}
