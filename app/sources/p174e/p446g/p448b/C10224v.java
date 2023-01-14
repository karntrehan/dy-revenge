package p174e.p446g.p448b;

/* renamed from: e.g.b.v */
public final class C10224v {

    /* renamed from: a */
    private final C10225a f27418a;

    /* renamed from: b */
    private long f27419b;

    /* renamed from: c */
    private long f27420c;

    /* renamed from: d */
    private double f27421d;

    /* renamed from: e */
    private double f27422e;

    /* renamed from: f */
    private float f27423f;

    /* renamed from: g */
    private float f27424g;

    /* renamed from: h */
    private boolean f27425h;

    /* renamed from: i */
    private final int[] f27426i = new int[2];

    /* renamed from: e.g.b.v$a */
    public interface C10225a {
        /* renamed from: a */
        void mo25520a(C10224v vVar);

        /* renamed from: b */
        boolean mo25521b(C10224v vVar);

        /* renamed from: c */
        boolean mo25522c(C10224v vVar);
    }

    public C10224v(C10225a aVar) {
        this.f27418a = aVar;
    }

    /* renamed from: a */
    private final void m34738a() {
        if (this.f27425h) {
            this.f27425h = false;
            C10225a aVar = this.f27418a;
            if (aVar != null) {
                aVar.mo25520a(this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34739g(android.view.MotionEvent r7) {
        /*
            r6 = this;
            long r0 = r6.f27419b
            r6.f27420c = r0
            long r0 = r7.getEventTime()
            r6.f27419b = r0
            int[] r0 = r6.f27426i
            r1 = 0
            r0 = r0[r1]
            int r0 = r7.findPointerIndex(r0)
            int[] r1 = r6.f27426i
            r2 = 1
            r1 = r1[r2]
            int r1 = r7.findPointerIndex(r1)
            float r2 = r7.getX(r0)
            float r0 = r7.getY(r0)
            float r3 = r7.getX(r1)
            float r7 = r7.getY(r1)
            float r1 = r3 - r2
            float r4 = r7 - r0
            float r2 = r2 + r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            r6.f27423f = r2
            float r0 = r0 + r7
            float r0 = r0 * r3
            r6.f27424g = r0
            double r2 = (double) r4
            double r0 = (double) r1
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = -r0
            double r2 = r6.f27421d
            boolean r7 = java.lang.Double.isNaN(r2)
            if (r7 == 0) goto L_0x004e
            r2 = 0
            goto L_0x0051
        L_0x004e:
            double r2 = r6.f27421d
            double r2 = r2 - r0
        L_0x0051:
            r6.f27422e = r2
            r6.f27421d = r0
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0062
            double r2 = r2 - r0
        L_0x005f:
            r6.f27422e = r2
            goto L_0x006d
        L_0x0062:
            r4 = -4609115380302729960(0xc00921fb54442d18, double:-3.141592653589793)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x006d
            double r2 = r2 + r0
            goto L_0x005f
        L_0x006d:
            double r2 = r6.f27422e
            r4 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x007c
            double r2 = r2 - r0
        L_0x0079:
            r6.f27422e = r2
            goto L_0x0087
        L_0x007c:
            r4 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0087
            double r2 = r2 + r0
            goto L_0x0079
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p446g.p448b.C10224v.m34739g(android.view.MotionEvent):void");
    }

    /* renamed from: b */
    public final float mo25515b() {
        return this.f27423f;
    }

    /* renamed from: c */
    public final float mo25516c() {
        return this.f27424g;
    }

    /* renamed from: d */
    public final double mo25517d() {
        return this.f27422e;
    }

    /* renamed from: e */
    public final long mo25518e() {
        return this.f27419b - this.f27420c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r5 != r0[1]) goto L_0x007f;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25519f(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            p455g.p470y.p472d.C10457l.m35320e(r5, r0)
            int r0 = r5.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x006c
            if (r0 == r2) goto L_0x0068
            r3 = 2
            if (r0 == r3) goto L_0x0058
            r3 = 5
            if (r0 == r3) goto L_0x0030
            r3 = 6
            if (r0 == r3) goto L_0x0019
            goto L_0x007f
        L_0x0019:
            boolean r0 = r4.f27425h
            if (r0 == 0) goto L_0x007f
            int r0 = r5.getActionIndex()
            int r5 = r5.getPointerId(r0)
            int[] r0 = r4.f27426i
            r1 = r0[r1]
            if (r5 == r1) goto L_0x0068
            r0 = r0[r2]
            if (r5 != r0) goto L_0x007f
            goto L_0x0068
        L_0x0030:
            boolean r0 = r4.f27425h
            if (r0 != 0) goto L_0x007f
            int[] r0 = r4.f27426i
            int r1 = r5.getActionIndex()
            int r1 = r5.getPointerId(r1)
            r0[r2] = r1
            r4.f27425h = r2
            long r0 = r5.getEventTime()
            r4.f27420c = r0
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r4.f27421d = r0
            r4.m34739g(r5)
            e.g.b.v$a r5 = r4.f27418a
            if (r5 != 0) goto L_0x0054
            goto L_0x007f
        L_0x0054:
            r5.mo25522c(r4)
            goto L_0x007f
        L_0x0058:
            boolean r0 = r4.f27425h
            if (r0 == 0) goto L_0x007f
            r4.m34739g(r5)
            e.g.b.v$a r5 = r4.f27418a
            if (r5 != 0) goto L_0x0064
            goto L_0x007f
        L_0x0064:
            r5.mo25521b(r4)
            goto L_0x007f
        L_0x0068:
            r4.m34738a()
            goto L_0x007f
        L_0x006c:
            r4.f27425h = r1
            int[] r0 = r4.f27426i
            int r3 = r5.getActionIndex()
            int r5 = r5.getPointerId(r3)
            r0[r1] = r5
            int[] r5 = r4.f27426i
            r0 = -1
            r5[r2] = r0
        L_0x007f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p446g.p448b.C10224v.mo25519f(android.view.MotionEvent):boolean");
    }
}
