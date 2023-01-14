package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p027c.p064i.p072j.C1988t;
import p027c.p077k.p079b.C2030c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C1087c<V> {

    /* renamed from: a */
    C2030c f11556a;

    /* renamed from: b */
    C4151b f11557b;

    /* renamed from: c */
    private boolean f11558c;

    /* renamed from: d */
    private float f11559d = 0.0f;

    /* renamed from: e */
    private boolean f11560e;

    /* renamed from: f */
    int f11561f = 2;

    /* renamed from: g */
    float f11562g = 0.5f;

    /* renamed from: h */
    float f11563h = 0.0f;

    /* renamed from: i */
    float f11564i = 0.5f;

    /* renamed from: j */
    private final C2030c.C2033c f11565j = new C4150a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C4150a extends C2030c.C2033c {

        /* renamed from: a */
        private int f11566a;

        /* renamed from: b */
        private int f11567b = -1;

        C4150a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m15650n(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = p027c.p064i.p072j.C1988t.m8417y(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f11561f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.f11566a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f11562g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C4150a.m15650n(android.view.View, float):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f11566a;
            r3 = r3.getWidth() + r5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo6782a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p027c.p064i.p072j.C1988t.m8417y(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f11561f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f11566a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f11566a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f11566a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f11566a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f11566a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.m15640G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C4150a.mo6782a(android.view.View, int, int):int");
        }

        /* renamed from: b */
        public int mo6783b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo6785d(View view) {
            return view.getWidth();
        }

        /* renamed from: i */
        public void mo6790i(View view, int i) {
            this.f11567b = i;
            this.f11566a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: j */
        public void mo6791j(int i) {
            C4151b bVar = SwipeDismissBehavior.this.f11557b;
            if (bVar != null) {
                bVar.mo12679b(i);
            }
        }

        /* renamed from: k */
        public void mo6792k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f11566a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f11563h);
            float width2 = ((float) this.f11566a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f11564i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m15639F(0.0f, 1.0f - SwipeDismissBehavior.m15642I(width, width2, f), 1.0f));
            }
        }

        /* renamed from: l */
        public void mo6793l(View view, float f, float f2) {
            boolean z;
            int i;
            C4151b bVar;
            this.f11567b = -1;
            int width = view.getWidth();
            if (m15650n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f11566a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f11566a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f11556a.mo6766M(i, view.getTop())) {
                C1988t.m8378e0(view, new C4152c(view, z));
            } else if (z && (bVar = SwipeDismissBehavior.this.f11557b) != null) {
                bVar.mo12678a(view);
            }
        }

        /* renamed from: m */
        public boolean mo6794m(View view, int i) {
            int i2 = this.f11567b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo12673E(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public interface C4151b {
        /* renamed from: a */
        void mo12678a(View view);

        /* renamed from: b */
        void mo12679b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    private class C4152c implements Runnable {

        /* renamed from: f */
        private final View f11569f;

        /* renamed from: o */
        private final boolean f11570o;

        C4152c(View view, boolean z) {
            this.f11569f = view;
            this.f11570o = z;
        }

        public void run() {
            C4151b bVar;
            C2030c cVar = SwipeDismissBehavior.this.f11556a;
            if (cVar != null && cVar.mo6774m(true)) {
                C1988t.m8378e0(this.f11569f, this);
            } else if (this.f11570o && (bVar = SwipeDismissBehavior.this.f11557b) != null) {
                bVar.mo12678a(this.f11569f);
            }
        }
    }

    /* renamed from: F */
    static float m15639F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m15640G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m15641H(ViewGroup viewGroup) {
        if (this.f11556a == null) {
            this.f11556a = this.f11560e ? C2030c.m8600n(viewGroup, this.f11559d, this.f11565j) : C2030c.m8601o(viewGroup, this.f11565j);
        }
    }

    /* renamed from: I */
    static float m15642I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: D */
    public boolean mo3472D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C2030c cVar = this.f11556a;
        if (cVar == null) {
            return false;
        }
        cVar.mo6762E(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo12673E(View view) {
        return true;
    }

    /* renamed from: J */
    public void mo12674J(float f) {
        this.f11564i = m15639F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void mo12675K(C4151b bVar) {
        this.f11557b = bVar;
    }

    /* renamed from: L */
    public void mo12676L(float f) {
        this.f11563h = m15639F(0.0f, f, 1.0f);
    }

    /* renamed from: M */
    public void mo12677M(int i) {
        this.f11561f = i;
    }

    /* renamed from: k */
    public boolean mo3483k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f11558c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo3417B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f11558c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11558c = false;
        }
        if (!z) {
            return false;
        }
        m15641H(coordinatorLayout);
        return this.f11556a.mo6767N(motionEvent);
    }
}
