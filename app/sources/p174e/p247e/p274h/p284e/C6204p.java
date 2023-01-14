package p174e.p247e.p274h.p284e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p274h.p284e.C6205q;

/* renamed from: e.e.h.e.p */
public class C6204p extends C6193g {

    /* renamed from: r */
    C6205q.C6207b f17192r;

    /* renamed from: s */
    Object f17193s;

    /* renamed from: t */
    PointF f17194t = null;

    /* renamed from: u */
    int f17195u = 0;

    /* renamed from: v */
    int f17196v = 0;

    /* renamed from: w */
    Matrix f17197w;

    /* renamed from: x */
    private Matrix f17198x = new Matrix();

    public C6204p(Drawable drawable, C6205q.C6207b bVar) {
        super((Drawable) C6062k.m22839g(drawable));
        this.f17192r = bVar;
    }

    /* renamed from: x */
    private void m23506x() {
        boolean z;
        C6205q.C6207b bVar = this.f17192r;
        boolean z2 = true;
        if (bVar instanceof C6205q.C6219n) {
            Object state = ((C6205q.C6219n) bVar).getState();
            z = state == null || !state.equals(this.f17193s);
            this.f17193s = state;
        } else {
            z = false;
        }
        if (this.f17195u == getCurrent().getIntrinsicWidth() && this.f17196v == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            mo18436w();
        }
    }

    /* renamed from: A */
    public void mo18434A(PointF pointF) {
        if (!C6058j.m22825a(this.f17194t, pointF)) {
            if (pointF == null) {
                this.f17194t = null;
            } else {
                if (this.f17194t == null) {
                    this.f17194t = new PointF();
                }
                this.f17194t.set(pointF);
            }
            mo18436w();
            invalidateSelf();
        }
    }

    /* renamed from: B */
    public void mo18435B(C6205q.C6207b bVar) {
        if (!C6058j.m22825a(this.f17192r, bVar)) {
            this.f17192r = bVar;
            this.f17193s = null;
            mo18436w();
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        m23506x();
        if (this.f17197w != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f17197w);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* renamed from: f */
    public void mo18341f(Matrix matrix) {
        mo18398t(matrix);
        m23506x();
        Matrix matrix2 = this.f17197w;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        mo18436w();
    }

    /* renamed from: u */
    public Drawable mo18399u(Drawable drawable) {
        Drawable u = super.mo18399u(drawable);
        mo18436w();
        return u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo18436w() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f17195u = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f17196v = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f17197w = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f17197w = null;
        } else if (this.f17192r == C6205q.C6207b.f17199a) {
            current.setBounds(bounds);
            this.f17197w = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            C6205q.C6207b bVar = this.f17192r;
            Matrix matrix = this.f17198x;
            PointF pointF = this.f17194t;
            bVar.mo18439a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.f17197w = this.f17198x;
        }
    }

    /* renamed from: y */
    public PointF mo18437y() {
        return this.f17194t;
    }

    /* renamed from: z */
    public C6205q.C6207b mo18438z() {
        return this.f17192r;
    }
}
