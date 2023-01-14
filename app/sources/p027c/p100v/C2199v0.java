package p027c.p100v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p027c.p100v.C2123a;
import p027c.p100v.C2214x;

/* renamed from: c.v.v0 */
public abstract class C2199v0 extends C2214x {

    /* renamed from: X */
    private static final String[] f6414X = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: Y */
    private int f6415Y = 3;

    /* renamed from: c.v.v0$a */
    class C2200a extends C2222y {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f6416a;

        /* renamed from: b */
        final /* synthetic */ View f6417b;

        /* renamed from: c */
        final /* synthetic */ View f6418c;

        C2200a(ViewGroup viewGroup, View view, View view2) {
            this.f6416a = viewGroup;
            this.f6417b = view;
            this.f6418c = view2;
        }

        /* renamed from: b */
        public void mo7238b(C2214x xVar) {
            C2169j0.m9215b(this.f6416a).mo7274d(this.f6417b);
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            this.f6418c.setTag(C2192s.save_overlay_view, (Object) null);
            C2169j0.m9215b(this.f6416a).mo7274d(this.f6417b);
            xVar.mo7177Z(this);
        }

        /* renamed from: e */
        public void mo7240e(C2214x xVar) {
            if (this.f6417b.getParent() == null) {
                C2169j0.m9215b(this.f6416a).mo7273c(this.f6417b);
            } else {
                C2199v0.this.cancel();
            }
        }
    }

    /* renamed from: c.v.v0$b */
    private static class C2201b extends AnimatorListenerAdapter implements C2214x.C2220f, C2123a.C2124a {

        /* renamed from: a */
        private final View f6420a;

        /* renamed from: b */
        private final int f6421b;

        /* renamed from: c */
        private final ViewGroup f6422c;

        /* renamed from: d */
        private final boolean f6423d;

        /* renamed from: e */
        private boolean f6424e;

        /* renamed from: f */
        boolean f6425f = false;

        C2201b(View view, int i, boolean z) {
            this.f6420a = view;
            this.f6421b = i;
            this.f6422c = (ViewGroup) view.getParent();
            this.f6423d = z;
            m9322g(true);
        }

        /* renamed from: f */
        private void m9321f() {
            if (!this.f6425f) {
                C2183o0.m9261i(this.f6420a, this.f6421b);
                ViewGroup viewGroup = this.f6422c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m9322g(false);
        }

        /* renamed from: g */
        private void m9322g(boolean z) {
            ViewGroup viewGroup;
            if (this.f6423d && this.f6424e != z && (viewGroup = this.f6422c) != null) {
                this.f6424e = z;
                C2169j0.m9217d(viewGroup, z);
            }
        }

        /* renamed from: a */
        public void mo7208a(C2214x xVar) {
        }

        /* renamed from: b */
        public void mo7238b(C2214x xVar) {
            m9322g(false);
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            m9321f();
            xVar.mo7177Z(this);
        }

        /* renamed from: d */
        public void mo7239d(C2214x xVar) {
        }

        /* renamed from: e */
        public void mo7240e(C2214x xVar) {
            m9322g(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f6425f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m9321f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f6425f) {
                C2183o0.m9261i(this.f6420a, this.f6421b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f6425f) {
                C2183o0.m9261i(this.f6420a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: c.v.v0$c */
    private static class C2202c {

        /* renamed from: a */
        boolean f6426a;

        /* renamed from: b */
        boolean f6427b;

        /* renamed from: c */
        int f6428c;

        /* renamed from: d */
        int f6429d;

        /* renamed from: e */
        ViewGroup f6430e;

        /* renamed from: f */
        ViewGroup f6431f;

        C2202c() {
        }
    }

    /* renamed from: o0 */
    private void m9306o0(C2144d0 d0Var) {
        d0Var.f6290a.put("android:visibility:visibility", Integer.valueOf(d0Var.f6291b.getVisibility()));
        d0Var.f6290a.put("android:visibility:parent", d0Var.f6291b.getParent());
        int[] iArr = new int[2];
        d0Var.f6291b.getLocationOnScreen(iArr);
        d0Var.f6290a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f6430e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f6428c == 0) goto L_0x0093;
     */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p027c.p100v.C2199v0.C2202c m9307p0(p027c.p100v.C2144d0 r8, p027c.p100v.C2144d0 r9) {
        /*
            r7 = this;
            c.v.v0$c r0 = new c.v.v0$c
            r0.<init>()
            r1 = 0
            r0.f6426a = r1
            r0.f6427b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6290a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6290a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f6428c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6290a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f6430e = r6
            goto L_0x0037
        L_0x0033:
            r0.f6428c = r4
            r0.f6430e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f6290a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f6290a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f6429d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f6290a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f6431f = r2
            goto L_0x005e
        L_0x005a:
            r0.f6429d = r4
            r0.f6431f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.f6428c
            int r9 = r0.f6429d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.f6430e
            android.view.ViewGroup r4 = r0.f6431f
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            if (r9 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.f6431f
            if (r8 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            android.view.ViewGroup r8 = r0.f6430e
            if (r8 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008d
            int r8 = r0.f6429d
            if (r8 != 0) goto L_0x008d
        L_0x0088:
            r0.f6427b = r2
        L_0x008a:
            r0.f6426a = r2
            goto L_0x0096
        L_0x008d:
            if (r9 != 0) goto L_0x0096
            int r8 = r0.f6428c
            if (r8 != 0) goto L_0x0096
        L_0x0093:
            r0.f6427b = r1
            goto L_0x008a
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p100v.C2199v0.m9307p0(c.v.d0, c.v.d0):c.v.v0$c");
    }

    /* renamed from: K */
    public String[] mo7209K() {
        return f6414X;
    }

    /* renamed from: N */
    public boolean mo7359N(C2144d0 d0Var, C2144d0 d0Var2) {
        if (d0Var == null && d0Var2 == null) {
            return false;
        }
        if (d0Var != null && d0Var2 != null && d0Var2.f6290a.containsKey("android:visibility:visibility") != d0Var.f6290a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C2202c p0 = m9307p0(d0Var, d0Var2);
        if (p0.f6426a) {
            return p0.f6428c == 0 || p0.f6429d == 0;
        }
        return false;
    }

    /* renamed from: i */
    public void mo7187i(C2144d0 d0Var) {
        m9306o0(d0Var);
    }

    /* renamed from: l */
    public void mo7191l(C2144d0 d0Var) {
        m9306o0(d0Var);
    }

    /* renamed from: q */
    public Animator mo7210q(ViewGroup viewGroup, C2144d0 d0Var, C2144d0 d0Var2) {
        C2202c p0 = m9307p0(d0Var, d0Var2);
        if (!p0.f6426a) {
            return null;
        }
        if (p0.f6430e == null && p0.f6431f == null) {
            return null;
        }
        if (p0.f6427b) {
            return mo7360r0(viewGroup, d0Var, p0.f6428c, d0Var2, p0.f6429d);
        }
        return mo7361t0(viewGroup, d0Var, p0.f6428c, d0Var2, p0.f6429d);
    }

    /* renamed from: q0 */
    public abstract Animator mo7264q0(ViewGroup viewGroup, View view, C2144d0 d0Var, C2144d0 d0Var2);

    /* renamed from: r0 */
    public Animator mo7360r0(ViewGroup viewGroup, C2144d0 d0Var, int i, C2144d0 d0Var2, int i2) {
        if ((this.f6415Y & 1) != 1 || d0Var2 == null) {
            return null;
        }
        if (d0Var == null) {
            View view = (View) d0Var2.f6291b.getParent();
            if (m9307p0(mo7393x(view, false), mo7379M(view, false)).f6426a) {
                return null;
            }
        }
        return mo7264q0(viewGroup, d0Var2.f6291b, d0Var, d0Var2);
    }

    /* renamed from: s0 */
    public abstract Animator mo7265s0(ViewGroup viewGroup, View view, C2144d0 d0Var, C2144d0 d0Var2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f6458M != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo7361t0(android.view.ViewGroup r18, p027c.p100v.C2144d0 r19, int r20, p027c.p100v.C2144d0 r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f6415Y
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f6291b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f6291b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = p027c.p100v.C2192s.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            c.v.d0 r14 = r0.mo7379M(r13, r12)
            c.v.d0 r15 = r0.mo7393x(r13, r12)
            c.v.v0$c r14 = r0.m9307p0(r14, r15)
            boolean r14 = r14.f6426a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = p027c.p100v.C2131c0.m9106a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f6458M
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f6290a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            c.v.i0 r4 = p027c.p100v.C2169j0.m9215b(r18)
            r4.mo7273c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo7265s0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            c.v.i0 r1 = p027c.p100v.C2169j0.m9215b(r18)
            r1.mo7274d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            c.v.v0$a r3 = new c.v.v0$a
            r3.<init>(r1, r10, r5)
            r0.mo7180c(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            p027c.p100v.C2183o0.m9261i(r8, r11)
            android.animation.Animator r1 = r0.mo7265s0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            c.v.v0$b r2 = new c.v.v0$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            p027c.p100v.C2123a.m9063a(r1, r2)
            r0.mo7180c(r2)
            goto L_0x0106
        L_0x0103:
            p027c.p100v.C2183o0.m9261i(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p100v.C2199v0.mo7361t0(android.view.ViewGroup, c.v.d0, int, c.v.d0, int):android.animation.Animator");
    }

    /* renamed from: u0 */
    public void mo7362u0(int i) {
        if ((i & -4) == 0) {
            this.f6415Y = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
