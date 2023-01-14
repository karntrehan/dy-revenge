package p027c.p058e.p059a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p027c.p058e.p059a.C1786h;

/* renamed from: c.e.a.d */
class C1781d implements C1784f {

    /* renamed from: a */
    final RectF f5276a = new RectF();

    /* renamed from: c.e.a.d$a */
    class C1782a implements C1786h.C1787a {
        C1782a() {
        }

        /* renamed from: a */
        public void mo6069a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C1781d.this.f5276a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C1781d.this.f5276a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C1781d.this.f5276a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C1781d.this.f5276a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C1781d.this.f5276a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = rectF2.top;
                canvas.drawRect((rectF2.left + f3) - 1.0f, f5, (rectF2.right - f3) + 1.0f, f5 + f3, paint2);
                float f6 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f3) - 1.0f, f6 - f3, (rectF2.right - f3) + 1.0f, f6, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C1781d() {
    }

    /* renamed from: n */
    private C1786h m7533n(C1783e eVar) {
        return (C1786h) eVar.mo6088e();
    }

    /* renamed from: a */
    public void mo6070a(C1783e eVar, float f) {
        m7533n(eVar).mo6121p(f);
        mo6083o(eVar);
    }

    /* renamed from: b */
    public float mo6071b(C1783e eVar) {
        return m7533n(eVar).mo6116l();
    }

    /* renamed from: c */
    public float mo6072c(C1783e eVar) {
        return m7533n(eVar).mo6108g();
    }

    /* renamed from: d */
    public void mo6073d(C1783e eVar) {
    }

    /* renamed from: e */
    public void mo6074e(C1783e eVar, float f) {
        m7533n(eVar).mo6123r(f);
    }

    /* renamed from: f */
    public float mo6075f(C1783e eVar) {
        return m7533n(eVar).mo6112i();
    }

    /* renamed from: g */
    public ColorStateList mo6076g(C1783e eVar) {
        return m7533n(eVar).mo6107f();
    }

    /* renamed from: h */
    public void mo6068h() {
        C1786h.f5290b = new C1782a();
    }

    /* renamed from: i */
    public float mo6077i(C1783e eVar) {
        return m7533n(eVar).mo6114j();
    }

    /* renamed from: j */
    public float mo6078j(C1783e eVar) {
        return m7533n(eVar).mo6115k();
    }

    /* renamed from: k */
    public void mo6079k(C1783e eVar) {
        m7533n(eVar).mo6117m(eVar.mo6086c());
        mo6083o(eVar);
    }

    /* renamed from: l */
    public void mo6080l(C1783e eVar, ColorStateList colorStateList) {
        m7533n(eVar).mo6118o(colorStateList);
    }

    /* renamed from: m */
    public void mo6081m(C1783e eVar, float f) {
        m7533n(eVar).mo6122q(f);
        mo6083o(eVar);
    }

    /* renamed from: o */
    public void mo6083o(C1783e eVar) {
        Rect rect = new Rect();
        m7533n(eVar).mo6111h(rect);
        eVar.mo6085b((int) Math.ceil((double) mo6078j(eVar)), (int) Math.ceil((double) mo6077i(eVar)));
        eVar.mo6084a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
