package p027c.p100v;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.v.l0 */
class C2175l0 implements C2181n0 {

    /* renamed from: a */
    protected C2176a f6380a;

    /* renamed from: c.v.l0$a */
    static class C2176a extends ViewGroup {

        /* renamed from: f */
        static Method f6381f;

        /* renamed from: o */
        ViewGroup f6382o;

        /* renamed from: p */
        View f6383p;

        /* renamed from: q */
        ArrayList<Drawable> f6384q = null;

        /* renamed from: r */
        C2175l0 f6385r;

        /* renamed from: s */
        private boolean f6386s;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f6381f = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C2176a(Context context, ViewGroup viewGroup, View view, C2175l0 l0Var) {
            super(context);
            this.f6382o = viewGroup;
            this.f6383p = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f6385r = l0Var;
        }

        /* renamed from: c */
        private void m9238c() {
            if (this.f6386s) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m9239d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f6384q;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f6386s = true;
                    this.f6382o.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m9240e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f6382o.getLocationOnScreen(iArr2);
            this.f6383p.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo7291a(Drawable drawable) {
            m9238c();
            if (this.f6384q == null) {
                this.f6384q = new ArrayList<>();
            }
            if (!this.f6384q.contains(drawable)) {
                this.f6384q.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo7292b(View view) {
            m9238c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f6382o || viewGroup.getParent() == null || !C1988t.m8359Q(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f6382o.getLocationOnScreen(iArr2);
                    C1988t.m8366X(view, iArr[0] - iArr2[0]);
                    C1988t.m8367Y(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f6382o.getLocationOnScreen(iArr);
            this.f6383p.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f6383p.getWidth(), this.f6383p.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f6384q;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f6384q.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void mo7295f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f6384q;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                m9239d();
            }
        }

        /* renamed from: g */
        public void mo7296g(View view) {
            super.removeView(view);
            m9239d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f6382o == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f6382o instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m9240e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f6384q;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f6384q
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p100v.C2175l0.C2176a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    C2175l0(Context context, ViewGroup viewGroup, View view) {
        this.f6380a = new C2176a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    static C2175l0 m9234e(View view) {
        ViewGroup f = m9235f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C2176a) {
                return ((C2176a) childAt).f6385r;
            }
        }
        return new C2159g0(f.getContext(), f, view);
    }

    /* renamed from: f */
    static ViewGroup m9235f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo7276a(Drawable drawable) {
        this.f6380a.mo7291a(drawable);
    }

    /* renamed from: b */
    public void mo7277b(Drawable drawable) {
        this.f6380a.mo7295f(drawable);
    }
}
