package p174e.p247e.p274h.p286g;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: e.e.h.g.a */
public class C6230a {

    /* renamed from: a */
    C6231a f17263a;

    /* renamed from: b */
    final float f17264b;

    /* renamed from: c */
    boolean f17265c;

    /* renamed from: d */
    boolean f17266d;

    /* renamed from: e */
    long f17267e;

    /* renamed from: f */
    float f17268f;

    /* renamed from: g */
    float f17269g;

    /* renamed from: e.e.h.g.a$a */
    public interface C6231a {
        /* renamed from: e */
        boolean mo18274e();
    }

    public C6230a(Context context) {
        this.f17264b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        mo18511a();
    }

    /* renamed from: c */
    public static C6230a m23618c(Context context) {
        return new C6230a(context);
    }

    /* renamed from: a */
    public void mo18511a() {
        this.f17263a = null;
        mo18514e();
    }

    /* renamed from: b */
    public boolean mo18512b() {
        return this.f17265c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (java.lang.Math.abs(r8.getY() - r7.f17269g) <= r7.f17264b) goto L_0x0093;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18513d(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x007d
            r2 = 0
            if (r0 == r1) goto L_0x003b
            r3 = 2
            if (r0 == r3) goto L_0x0018
            r8 = 3
            if (r0 == r8) goto L_0x0012
            goto L_0x0093
        L_0x0012:
            r7.f17265c = r2
        L_0x0014:
            r7.f17266d = r2
            goto L_0x0093
        L_0x0018:
            float r0 = r8.getX()
            float r3 = r7.f17268f
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f17264b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0014
            float r8 = r8.getY()
            float r0 = r7.f17269g
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            float r0 = r7.f17264b
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0093
            goto L_0x0014
        L_0x003b:
            r7.f17265c = r2
            float r0 = r8.getX()
            float r3 = r7.f17268f
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f17264b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            float r0 = r8.getY()
            float r3 = r7.f17269g
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f17264b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
        L_0x005f:
            r7.f17266d = r2
        L_0x0061:
            boolean r0 = r7.f17266d
            if (r0 == 0) goto L_0x0014
            long r3 = r8.getEventTime()
            long r5 = r7.f17267e
            long r3 = r3 - r5
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r5 = (long) r8
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0014
            e.e.h.g.a$a r8 = r7.f17263a
            if (r8 == 0) goto L_0x0014
            r8.mo18274e()
            goto L_0x0014
        L_0x007d:
            r7.f17265c = r1
            r7.f17266d = r1
            long r2 = r8.getEventTime()
            r7.f17267e = r2
            float r0 = r8.getX()
            r7.f17268f = r0
            float r8 = r8.getY()
            r7.f17269g = r8
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p286g.C6230a.mo18513d(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public void mo18514e() {
        this.f17265c = false;
        this.f17266d = false;
    }

    /* renamed from: f */
    public void mo18515f(C6231a aVar) {
        this.f17263a = aVar;
    }
}
