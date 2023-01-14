package p174e.p181b.p182a.p184u.p186c;

import android.graphics.PointF;
import java.util.Collections;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5419c;

/* renamed from: e.b.a.u.c.m */
public class C5517m extends C5499a<PointF, PointF> {

    /* renamed from: i */
    private final PointF f15554i = new PointF();

    /* renamed from: j */
    private final PointF f15555j = new PointF();

    /* renamed from: k */
    private final C5499a<Float, Float> f15556k;

    /* renamed from: l */
    private final C5499a<Float, Float> f15557l;

    /* renamed from: m */
    protected C5419c<Float> f15558m;

    /* renamed from: n */
    protected C5419c<Float> f15559n;

    public C5517m(C5499a<Float, Float> aVar, C5499a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f15556k = aVar;
        this.f15557l = aVar2;
        mo16617m(mo16611f());
    }

    /* renamed from: m */
    public void mo16617m(float f) {
        this.f15556k.mo16617m(f);
        this.f15557l.mo16617m(f);
        this.f15554i.set(this.f15556k.mo16612h().floatValue(), this.f15557l.mo16612h().floatValue());
        for (int i = 0; i < this.f15526a.size(); i++) {
            this.f15526a.get(i).mo16587b();
        }
    }

    /* renamed from: p */
    public PointF mo16612h() {
        return mo16613i((C5417a<PointF>) null, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public PointF mo16613i(C5417a<PointF> aVar, float f) {
        Float f2;
        C5417a<Float> b;
        C5417a<Float> b2;
        Float f3 = null;
        if (this.f15558m == null || (b2 = this.f15556k.mo16607b()) == null) {
            f2 = null;
        } else {
            float d = this.f15556k.mo16609d();
            Float f4 = b2.f15120h;
            C5419c<Float> cVar = this.f15558m;
            float f5 = b2.f15119g;
            f2 = cVar.mo16370b(f5, f4 == null ? f5 : f4.floatValue(), b2.f15114b, b2.f15115c, f, f, d);
        }
        if (!(this.f15559n == null || (b = this.f15557l.mo16607b()) == null)) {
            float d2 = this.f15557l.mo16609d();
            Float f6 = b.f15120h;
            C5419c<Float> cVar2 = this.f15559n;
            float f7 = b.f15119g;
            f3 = cVar2.mo16370b(f7, f6 == null ? f7 : f6.floatValue(), b.f15114b, b.f15115c, f, f, d2);
        }
        if (f2 == null) {
            this.f15555j.set(this.f15554i.x, 0.0f);
        } else {
            this.f15555j.set(f2.floatValue(), 0.0f);
        }
        PointF pointF = this.f15555j;
        pointF.set(pointF.x, f3 == null ? this.f15554i.y : f3.floatValue());
        return this.f15555j;
    }

    /* renamed from: r */
    public void mo16647r(C5419c<Float> cVar) {
        C5419c<Float> cVar2 = this.f15558m;
        if (cVar2 != null) {
            cVar2.mo16371c((C5499a<?, ?>) null);
        }
        this.f15558m = cVar;
        if (cVar != null) {
            cVar.mo16371c(this);
        }
    }

    /* renamed from: s */
    public void mo16648s(C5419c<Float> cVar) {
        C5419c<Float> cVar2 = this.f15559n;
        if (cVar2 != null) {
            cVar2.mo16371c((C5499a<?, ?>) null);
        }
        this.f15559n = cVar;
        if (cVar != null) {
            cVar.mo16371c(this);
        }
    }
}
