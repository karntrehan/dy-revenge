package p027c.p100v;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: c.v.v */
public class C2198v extends C2213w0 {

    /* renamed from: b */
    private float f6412b = 3.0f;

    /* renamed from: c */
    private int f6413c = 80;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r4 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m9302h(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f6413c
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L_0x0019
            int r7 = p027c.p064i.p072j.C1988t.m8417y(r7)
            if (r7 != r4) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            if (r4 == 0) goto L_0x0017
        L_0x0015:
            r0 = 5
            goto L_0x0029
        L_0x0017:
            r0 = 3
            goto L_0x0029
        L_0x0019:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L_0x0029
            int r7 = p027c.p064i.p072j.C1988t.m8417y(r7)
            if (r7 != r4) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            if (r4 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0029:
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x0048
            r7 = 48
            if (r0 == r7) goto L_0x003f
            r7 = 80
            if (r0 == r7) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L_0x0059
        L_0x003f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L_0x0059
        L_0x0048:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L_0x0059
        L_0x0051:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p100v.C2198v.m9302h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    /* renamed from: i */
    private int m9303i(ViewGroup viewGroup) {
        int i = this.f6413c;
        return (i == 3 || i == 5 || i == 8388611 || i == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    /* renamed from: c */
    public long mo7175c(ViewGroup viewGroup, C2214x xVar, C2144d0 d0Var, C2144d0 d0Var2) {
        int i;
        int i2;
        int i3;
        C2144d0 d0Var3 = d0Var;
        if (d0Var3 == null && d0Var2 == null) {
            return 0;
        }
        Rect u = xVar.mo7390u();
        if (d0Var2 == null || mo7370e(d0Var3) == 0) {
            i = -1;
        } else {
            d0Var3 = d0Var2;
            i = 1;
        }
        int f = mo7371f(d0Var3);
        int g = mo7372g(d0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (u != null) {
            i3 = u.centerX();
            i2 = u.centerY();
        } else {
            i3 = (round + width) / 2;
            i2 = (round2 + height) / 2;
        }
        float h = ((float) m9302h(viewGroup, f, g, i3, i2, round, round2, width, height)) / ((float) m9303i(viewGroup));
        long t = xVar.mo7388t();
        if (t < 0) {
            t = 300;
        }
        return (long) Math.round((((float) (t * ((long) i))) / this.f6412b) * h);
    }

    /* renamed from: j */
    public void mo7358j(int i) {
        this.f6413c = i;
    }
}
