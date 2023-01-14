package p174e.p247e.p274h.p285f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p274h.p284e.C6188c;
import p174e.p247e.p274h.p284e.C6191f;
import p174e.p247e.p274h.p284e.C6193g;
import p174e.p247e.p274h.p284e.C6194h;
import p174e.p247e.p274h.p284e.C6204p;
import p174e.p247e.p274h.p284e.C6205q;
import p174e.p247e.p274h.p287h.C6234c;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.f.a */
public class C6224a implements C6234c {

    /* renamed from: a */
    private final Drawable f17221a;

    /* renamed from: b */
    private final Resources f17222b;

    /* renamed from: c */
    private C6227d f17223c;

    /* renamed from: d */
    private final C6226c f17224d;

    /* renamed from: e */
    private final C6191f f17225e;

    /* renamed from: f */
    private final C6193g f17226f;

    C6224a(C6225b bVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f17221a = colorDrawable;
        if (C6394b.m24481d()) {
            C6394b.m24478a("GenericDraweeHierarchy()");
        }
        this.f17222b = bVar.mo18487o();
        this.f17223c = bVar.mo18490r();
        C6193g gVar = new C6193g(colorDrawable);
        this.f17226f = gVar;
        int i = 1;
        int size = bVar.mo18481i() != null ? bVar.mo18481i().size() : 1;
        int i2 = (size == 0 ? 1 : size) + (bVar.mo18484l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[(i2 + 6)];
        drawableArr[0] = m23537j(bVar.mo18477e(), (C6205q.C6207b) null);
        drawableArr[1] = m23537j(bVar.mo18482j(), bVar.mo18483k());
        drawableArr[2] = m23536i(gVar, bVar.mo18476d(), bVar.mo18475c(), bVar.mo18474b());
        drawableArr[3] = m23537j(bVar.mo18485m(), bVar.mo18486n());
        drawableArr[4] = m23537j(bVar.mo18488p(), bVar.mo18489q());
        drawableArr[5] = m23537j(bVar.mo18479g(), bVar.mo18480h());
        if (i2 > 0) {
            if (bVar.mo18481i() != null) {
                i = 0;
                for (Drawable j : bVar.mo18481i()) {
                    drawableArr[i + 6] = m23537j(j, (C6205q.C6207b) null);
                    i++;
                }
            }
            if (bVar.mo18484l() != null) {
                drawableArr[i + 6] = m23537j(bVar.mo18484l(), (C6205q.C6207b) null);
            }
        }
        C6191f fVar = new C6191f(drawableArr, false, 2);
        this.f17225e = fVar;
        fVar.mo18381v(bVar.mo18478f());
        C6226c cVar = new C6226c(C6229e.m23611e(fVar, this.f17223c));
        this.f17224d = cVar;
        cVar.mutate();
        m23545u();
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* renamed from: B */
    private void m23535B(float f) {
        Drawable b = this.f17225e.mo18336b(3);
        if (b != null) {
            if (f >= 0.999f) {
                if (b instanceof Animatable) {
                    ((Animatable) b).stop();
                }
                m23540m(3);
            } else {
                if (b instanceof Animatable) {
                    ((Animatable) b).start();
                }
                m23538k(3);
            }
            b.setLevel(Math.round(f * 10000.0f));
        }
    }

    /* renamed from: i */
    private Drawable m23536i(Drawable drawable, C6205q.C6207b bVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return C6229e.m23613g(drawable, bVar, pointF);
    }

    /* renamed from: j */
    private Drawable m23537j(Drawable drawable, C6205q.C6207b bVar) {
        return C6229e.m23612f(C6229e.m23610d(drawable, this.f17223c, this.f17222b), bVar);
    }

    /* renamed from: k */
    private void m23538k(int i) {
        if (i >= 0) {
            this.f17225e.mo18376m(i);
        }
    }

    /* renamed from: l */
    private void m23539l() {
        m23540m(1);
        m23540m(2);
        m23540m(3);
        m23540m(4);
        m23540m(5);
    }

    /* renamed from: m */
    private void m23540m(int i) {
        if (i >= 0) {
            this.f17225e.mo18377n(i);
        }
    }

    /* renamed from: p */
    private C6188c m23541p(int i) {
        C6188c d = this.f17225e.mo18338d(i);
        if (d.mo18363r() instanceof C6194h) {
            d = (C6194h) d.mo18363r();
        }
        return d.mo18363r() instanceof C6204p ? (C6204p) d.mo18363r() : d;
    }

    /* renamed from: r */
    private C6204p m23542r(int i) {
        C6188c p = m23541p(i);
        return p instanceof C6204p ? (C6204p) p : C6229e.m23617k(p, C6205q.C6207b.f17199a);
    }

    /* renamed from: s */
    private boolean m23543s(int i) {
        return m23541p(i) instanceof C6204p;
    }

    /* renamed from: t */
    private void m23544t() {
        this.f17226f.mo18362k(this.f17221a);
    }

    /* renamed from: u */
    private void m23545u() {
        C6191f fVar = this.f17225e;
        if (fVar != null) {
            fVar.mo18372h();
            this.f17225e.mo18375k();
            m23539l();
            m23538k(1);
            this.f17225e.mo18378o();
            this.f17225e.mo18374j();
        }
    }

    /* renamed from: x */
    private void m23546x(int i, Drawable drawable) {
        if (drawable == null) {
            this.f17225e.mo18342g(i, (Drawable) null);
            return;
        }
        m23541p(i).mo18362k(C6229e.m23610d(drawable, this.f17223c, this.f17222b));
    }

    /* renamed from: A */
    public void mo18455A(Drawable drawable, C6205q.C6207b bVar) {
        m23546x(1, drawable);
        m23542r(1).mo18435B(bVar);
    }

    /* renamed from: C */
    public void mo18456C(Drawable drawable) {
        m23546x(3, drawable);
    }

    /* renamed from: D */
    public void mo18457D(C6227d dVar) {
        this.f17223c = dVar;
        C6229e.m23616j(this.f17224d, dVar);
        for (int i = 0; i < this.f17225e.mo18340e(); i++) {
            C6229e.m23615i(m23541p(i), this.f17223c, this.f17222b);
        }
    }

    /* renamed from: a */
    public void mo18458a() {
        m23544t();
        m23545u();
    }

    /* renamed from: b */
    public Rect mo18459b() {
        return this.f17224d.getBounds();
    }

    /* renamed from: c */
    public void mo18460c(Drawable drawable) {
        this.f17224d.mo18494w(drawable);
    }

    /* renamed from: d */
    public void mo18461d(Throwable th) {
        this.f17225e.mo18372h();
        m23539l();
        if (this.f17225e.mo18336b(4) != null) {
            m23538k(4);
        } else {
            m23538k(1);
        }
        this.f17225e.mo18374j();
    }

    /* renamed from: e */
    public void mo18462e(Throwable th) {
        this.f17225e.mo18372h();
        m23539l();
        if (this.f17225e.mo18336b(5) != null) {
            m23538k(5);
        } else {
            m23538k(1);
        }
        this.f17225e.mo18374j();
    }

    /* renamed from: f */
    public void mo18463f(float f, boolean z) {
        if (this.f17225e.mo18336b(3) != null) {
            this.f17225e.mo18372h();
            m23535B(f);
            if (z) {
                this.f17225e.mo18378o();
            }
            this.f17225e.mo18374j();
        }
    }

    /* renamed from: g */
    public Drawable mo18464g() {
        return this.f17224d;
    }

    /* renamed from: h */
    public void mo18465h(Drawable drawable, float f, boolean z) {
        Drawable d = C6229e.m23610d(drawable, this.f17223c, this.f17222b);
        d.mutate();
        this.f17226f.mo18362k(d);
        this.f17225e.mo18372h();
        m23539l();
        m23538k(2);
        m23535B(f);
        if (z) {
            this.f17225e.mo18378o();
        }
        this.f17225e.mo18374j();
    }

    /* renamed from: n */
    public PointF mo18466n() {
        if (!m23543s(2)) {
            return null;
        }
        return m23542r(2).mo18437y();
    }

    /* renamed from: o */
    public C6205q.C6207b mo18467o() {
        if (!m23543s(2)) {
            return null;
        }
        return m23542r(2).mo18438z();
    }

    /* renamed from: q */
    public C6227d mo18468q() {
        return this.f17223c;
    }

    /* renamed from: v */
    public void mo18469v(C6205q.C6207b bVar) {
        C6062k.m22839g(bVar);
        m23542r(2).mo18435B(bVar);
    }

    /* renamed from: w */
    public void mo18470w(Drawable drawable) {
        m23546x(0, drawable);
    }

    /* renamed from: y */
    public void mo18471y(int i) {
        this.f17225e.mo18381v(i);
    }

    /* renamed from: z */
    public void mo18472z(C6191f.C6192a aVar) {
        this.f17225e.mo18380u(aVar);
    }
}
