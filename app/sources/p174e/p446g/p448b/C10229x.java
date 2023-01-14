package p174e.p446g.p448b;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: e.g.b.x */
public class C10229x {

    /* renamed from: a */
    private final Context f27433a;

    /* renamed from: b */
    private final C10231b f27434b;

    /* renamed from: c */
    private float f27435c;

    /* renamed from: d */
    private float f27436d;

    /* renamed from: e */
    private boolean f27437e;

    /* renamed from: f */
    private boolean f27438f;

    /* renamed from: g */
    private float f27439g;

    /* renamed from: h */
    private float f27440h;

    /* renamed from: i */
    private float f27441i;

    /* renamed from: j */
    private float f27442j;

    /* renamed from: k */
    private float f27443k;

    /* renamed from: l */
    private float f27444l;

    /* renamed from: m */
    private float f27445m;

    /* renamed from: n */
    private long f27446n;

    /* renamed from: o */
    private long f27447o;

    /* renamed from: p */
    private boolean f27448p;

    /* renamed from: q */
    private int f27449q;

    /* renamed from: r */
    private int f27450r;

    /* renamed from: s */
    private final Handler f27451s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f27452t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f27453u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f27454v;

    /* renamed from: w */
    private GestureDetector f27455w;

    /* renamed from: x */
    private boolean f27456x;

    /* renamed from: e.g.b.x$a */
    class C10230a extends GestureDetector.SimpleOnGestureListener {
        C10230a() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            float unused = C10229x.this.f27452t = motionEvent.getX();
            float unused2 = C10229x.this.f27453u = motionEvent.getY();
            int unused3 = C10229x.this.f27454v = 1;
            return true;
        }
    }

    /* renamed from: e.g.b.x$b */
    public interface C10231b {
        /* renamed from: a */
        void mo25512a(C10229x xVar);

        /* renamed from: b */
        boolean mo25513b(C10229x xVar);

        /* renamed from: c */
        boolean mo25514c(C10229x xVar);
    }

    public C10229x(Context context, C10231b bVar) {
        this(context, bVar, (Handler) null);
    }

    public C10229x(Context context, C10231b bVar, Handler handler) {
        this.f27454v = 0;
        this.f27433a = context;
        this.f27434b = bVar;
        this.f27449q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f27450r = 0;
        this.f27451s = handler;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            mo25533k(true);
        }
        if (i > 22) {
            mo25534l(true);
        }
    }

    /* renamed from: i */
    private boolean m34764i() {
        return this.f27454v != 0;
    }

    /* renamed from: d */
    public float mo25527d() {
        return this.f27439g;
    }

    /* renamed from: e */
    public float mo25528e() {
        return this.f27435c;
    }

    /* renamed from: f */
    public float mo25529f() {
        return this.f27436d;
    }

    /* renamed from: g */
    public float mo25530g() {
        if (m34764i()) {
            boolean z = this.f27456x;
            boolean z2 = (z && this.f27439g < this.f27440h) || (!z && this.f27439g > this.f27440h);
            float abs = Math.abs(1.0f - (this.f27439g / this.f27440h)) * 0.5f;
            if (this.f27440h <= ((float) this.f27449q)) {
                return 1.0f;
            }
            return z2 ? 1.0f + abs : 1.0f - abs;
        }
        float f = this.f27440h;
        if (f > 0.0f) {
            return this.f27439g / f;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public long mo25531h() {
        return this.f27446n - this.f27447o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (r9 != false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005d A[RETURN] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25532j(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            long r2 = r18.getEventTime()
            r0.f27446n = r2
            int r2 = r18.getActionMasked()
            boolean r3 = r0.f27437e
            if (r3 == 0) goto L_0x0017
            android.view.GestureDetector r3 = r0.f27455w
            r3.onTouchEvent(r1)
        L_0x0017:
            int r3 = r18.getPointerCount()
            int r4 = r18.getButtonState()
            r4 = r4 & 32
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0027
            r4 = 1
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            int r7 = r0.f27454v
            r8 = 2
            if (r7 != r8) goto L_0x0031
            if (r4 != 0) goto L_0x0031
            r7 = 1
            goto L_0x0032
        L_0x0031:
            r7 = 0
        L_0x0032:
            if (r2 == r5) goto L_0x003c
            r9 = 3
            if (r2 == r9) goto L_0x003c
            if (r7 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r9 = 0
            goto L_0x003d
        L_0x003c:
            r9 = 1
        L_0x003d:
            r10 = 0
            if (r2 == 0) goto L_0x0042
            if (r9 == 0) goto L_0x005e
        L_0x0042:
            boolean r11 = r0.f27448p
            if (r11 == 0) goto L_0x0052
            e.g.b.x$b r11 = r0.f27434b
            r11.mo25512a(r0)
        L_0x004b:
            r0.f27448p = r6
            r0.f27441i = r10
            r0.f27454v = r6
            goto L_0x005b
        L_0x0052:
            boolean r11 = r17.m34764i()
            if (r11 == 0) goto L_0x005b
            if (r9 == 0) goto L_0x005b
            goto L_0x004b
        L_0x005b:
            if (r9 == 0) goto L_0x005e
            return r5
        L_0x005e:
            boolean r11 = r0.f27448p
            if (r11 != 0) goto L_0x0080
            boolean r11 = r0.f27438f
            if (r11 == 0) goto L_0x0080
            boolean r11 = r17.m34764i()
            if (r11 != 0) goto L_0x0080
            if (r9 != 0) goto L_0x0080
            if (r4 == 0) goto L_0x0080
            float r4 = r18.getX()
            r0.f27452t = r4
            float r4 = r18.getY()
            r0.f27453u = r4
            r0.f27454v = r8
            r0.f27441i = r10
        L_0x0080:
            r4 = 6
            if (r2 == 0) goto L_0x008d
            if (r2 == r4) goto L_0x008d
            r9 = 5
            if (r2 == r9) goto L_0x008d
            if (r7 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r7 = 0
            goto L_0x008e
        L_0x008d:
            r7 = 1
        L_0x008e:
            if (r2 != r4) goto L_0x0092
            r4 = 1
            goto L_0x0093
        L_0x0092:
            r4 = 0
        L_0x0093:
            if (r4 == 0) goto L_0x009a
            int r9 = r18.getActionIndex()
            goto L_0x009b
        L_0x009a:
            r9 = -1
        L_0x009b:
            if (r4 == 0) goto L_0x00a0
            int r4 = r3 + -1
            goto L_0x00a1
        L_0x00a0:
            r4 = r3
        L_0x00a1:
            boolean r11 = r17.m34764i()
            if (r11 == 0) goto L_0x00b9
            float r11 = r0.f27452t
            float r12 = r0.f27453u
            float r13 = r18.getY()
            int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r13 >= 0) goto L_0x00b6
            r0.f27456x = r5
            goto L_0x00d7
        L_0x00b6:
            r0.f27456x = r6
            goto L_0x00d7
        L_0x00b9:
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x00bc:
            if (r11 >= r3) goto L_0x00ce
            if (r9 != r11) goto L_0x00c1
            goto L_0x00cb
        L_0x00c1:
            float r14 = r1.getX(r11)
            float r12 = r12 + r14
            float r14 = r1.getY(r11)
            float r13 = r13 + r14
        L_0x00cb:
            int r11 = r11 + 1
            goto L_0x00bc
        L_0x00ce:
            float r11 = (float) r4
            float r12 = r12 / r11
            float r11 = r13 / r11
            r16 = r12
            r12 = r11
            r11 = r16
        L_0x00d7:
            r13 = 0
            r14 = 0
        L_0x00d9:
            if (r14 >= r3) goto L_0x00f5
            if (r9 != r14) goto L_0x00de
            goto L_0x00f2
        L_0x00de:
            float r15 = r1.getX(r14)
            float r15 = r15 - r11
            float r15 = java.lang.Math.abs(r15)
            float r10 = r10 + r15
            float r15 = r1.getY(r14)
            float r15 = r15 - r12
            float r15 = java.lang.Math.abs(r15)
            float r13 = r13 + r15
        L_0x00f2:
            int r14 = r14 + 1
            goto L_0x00d9
        L_0x00f5:
            float r1 = (float) r4
            float r10 = r10 / r1
            float r13 = r13 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 * r1
            float r13 = r13 * r1
            boolean r1 = r17.m34764i()
            if (r1 == 0) goto L_0x0106
            r1 = r13
            goto L_0x010d
        L_0x0106:
            double r3 = (double) r10
            double r14 = (double) r13
            double r3 = java.lang.Math.hypot(r3, r14)
            float r1 = (float) r3
        L_0x010d:
            boolean r3 = r0.f27448p
            r0.f27435c = r11
            r0.f27436d = r12
            boolean r4 = r17.m34764i()
            if (r4 != 0) goto L_0x012f
            boolean r4 = r0.f27448p
            if (r4 == 0) goto L_0x012f
            int r4 = r0.f27450r
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0126
            if (r7 == 0) goto L_0x012f
        L_0x0126:
            e.g.b.x$b r4 = r0.f27434b
            r4.mo25512a(r0)
            r0.f27448p = r6
            r0.f27441i = r1
        L_0x012f:
            if (r7 == 0) goto L_0x013f
            r0.f27442j = r10
            r0.f27444l = r10
            r0.f27443k = r13
            r0.f27445m = r13
            r0.f27439g = r1
            r0.f27440h = r1
            r0.f27441i = r1
        L_0x013f:
            boolean r4 = r17.m34764i()
            if (r4 == 0) goto L_0x0148
            int r4 = r0.f27449q
            goto L_0x014a
        L_0x0148:
            int r4 = r0.f27450r
        L_0x014a:
            boolean r6 = r0.f27448p
            if (r6 != 0) goto L_0x017c
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x017c
            if (r3 != 0) goto L_0x0164
            float r3 = r0.f27441i
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r0.f27449q
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x017c
        L_0x0164:
            r0.f27442j = r10
            r0.f27444l = r10
            r0.f27443k = r13
            r0.f27445m = r13
            r0.f27439g = r1
            r0.f27440h = r1
            long r3 = r0.f27446n
            r0.f27447o = r3
            e.g.b.x$b r3 = r0.f27434b
            boolean r3 = r3.mo25513b(r0)
            r0.f27448p = r3
        L_0x017c:
            if (r2 != r8) goto L_0x01a2
            r0.f27442j = r10
            r0.f27443k = r13
            r0.f27439g = r1
            boolean r1 = r0.f27448p
            if (r1 == 0) goto L_0x018f
            e.g.b.x$b r1 = r0.f27434b
            boolean r1 = r1.mo25514c(r0)
            goto L_0x0190
        L_0x018f:
            r1 = 1
        L_0x0190:
            if (r1 == 0) goto L_0x01a2
            float r1 = r0.f27442j
            r0.f27444l = r1
            float r1 = r0.f27443k
            r0.f27445m = r1
            float r1 = r0.f27439g
            r0.f27440h = r1
            long r1 = r0.f27446n
            r0.f27447o = r1
        L_0x01a2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p446g.p448b.C10229x.mo25532j(android.view.MotionEvent):boolean");
    }

    /* renamed from: k */
    public void mo25533k(boolean z) {
        this.f27437e = z;
        if (z && this.f27455w == null) {
            this.f27455w = new GestureDetector(this.f27433a, new C10230a(), this.f27451s);
        }
    }

    /* renamed from: l */
    public void mo25534l(boolean z) {
        this.f27438f = z;
    }
}
