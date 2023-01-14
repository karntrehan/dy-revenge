package p027c.p100v;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import p027c.p064i.p072j.C1988t;

@SuppressLint({"ViewConstructor"})
/* renamed from: c.v.l */
class C2173l extends ViewGroup implements C2166i {

    /* renamed from: f */
    ViewGroup f6373f;

    /* renamed from: o */
    View f6374o;

    /* renamed from: p */
    final View f6375p;

    /* renamed from: q */
    int f6376q;

    /* renamed from: r */
    private Matrix f6377r;

    /* renamed from: s */
    private final ViewTreeObserver.OnPreDrawListener f6378s = new C2174a();

    /* renamed from: c.v.l$a */
    class C2174a implements ViewTreeObserver.OnPreDrawListener {
        C2174a() {
        }

        public boolean onPreDraw() {
            View view;
            C1988t.m8376d0(C2173l.this);
            C2173l lVar = C2173l.this;
            ViewGroup viewGroup = lVar.f6373f;
            if (viewGroup == null || (view = lVar.f6374o) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C1988t.m8376d0(C2173l.this.f6373f);
            C2173l lVar2 = C2173l.this;
            lVar2.f6373f = null;
            lVar2.f6374o = null;
            return true;
        }
    }

    C2173l(View view) {
        super(view.getContext());
        this.f6375p = view;
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
    }

    /* renamed from: b */
    static C2173l m9226b(View view, ViewGroup viewGroup, Matrix matrix) {
        C2168j jVar;
        if (view.getParent() instanceof ViewGroup) {
            C2168j b = C2168j.m9207b(viewGroup);
            C2173l e = m9229e(view);
            int i = 0;
            if (!(e == null || (jVar = (C2168j) e.getParent()) == b)) {
                i = e.f6376q;
                jVar.removeView(e);
                e = null;
            }
            if (e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m9227c(view, viewGroup, matrix);
                }
                e = new C2173l(view);
                e.mo7285h(matrix);
                if (b == null) {
                    b = new C2168j(viewGroup);
                } else {
                    b.mo7281g();
                }
                m9228d(viewGroup, b);
                m9228d(viewGroup, e);
                b.mo7280a(e);
                e.f6376q = i;
            } else if (matrix != null) {
                e.mo7285h(matrix);
            }
            e.f6376q++;
            return e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    static void m9227c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C2183o0.m9262j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        C2183o0.m9263k(viewGroup, matrix);
    }

    /* renamed from: d */
    static void m9228d(View view, View view2) {
        C2183o0.m9259g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    static C2173l m9229e(View view) {
        return (C2173l) view.getTag(C2192s.ghost_view);
    }

    /* renamed from: f */
    static void m9230f(View view) {
        C2173l e = m9229e(view);
        if (e != null) {
            int i = e.f6376q - 1;
            e.f6376q = i;
            if (i <= 0) {
                ((C2168j) e.getParent()).removeView(e);
            }
        }
    }

    /* renamed from: g */
    static void m9231g(View view, C2173l lVar) {
        view.setTag(C2192s.ghost_view, lVar);
    }

    /* renamed from: a */
    public void mo7278a(ViewGroup viewGroup, View view) {
        this.f6373f = viewGroup;
        this.f6374o = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7285h(Matrix matrix) {
        this.f6377r = matrix;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9231g(this.f6375p, this);
        this.f6375p.getViewTreeObserver().addOnPreDrawListener(this.f6378s);
        C2183o0.m9261i(this.f6375p, 4);
        if (this.f6375p.getParent() != null) {
            ((View) this.f6375p.getParent()).invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f6375p.getViewTreeObserver().removeOnPreDrawListener(this.f6378s);
        C2183o0.m9261i(this.f6375p, 0);
        m9231g(this.f6375p, (C2173l) null);
        if (this.f6375p.getParent() != null) {
            ((View) this.f6375p.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C2130c.m9105a(canvas, true);
        canvas.setMatrix(this.f6377r);
        C2183o0.m9261i(this.f6375p, 0);
        this.f6375p.invalidate();
        C2183o0.m9261i(this.f6375p, 4);
        drawChild(canvas, this.f6375p, getDrawingTime());
        C2130c.m9105a(canvas, false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m9229e(this.f6375p) == this) {
            C2183o0.m9261i(this.f6375p, i == 0 ? 4 : 0);
        }
    }
}
