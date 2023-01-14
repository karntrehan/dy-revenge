package p174e.p181b.p182a.p184u.p186c;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p183a0.C5420d;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p188w.p189j.C5544l;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.u.c.o */
public class C5519o {

    /* renamed from: a */
    private final Matrix f15560a = new Matrix();

    /* renamed from: b */
    private final Matrix f15561b;

    /* renamed from: c */
    private final Matrix f15562c;

    /* renamed from: d */
    private final Matrix f15563d;

    /* renamed from: e */
    private final float[] f15564e;

    /* renamed from: f */
    private C5499a<PointF, PointF> f15565f;

    /* renamed from: g */
    private C5499a<?, PointF> f15566g;

    /* renamed from: h */
    private C5499a<C5420d, C5420d> f15567h;

    /* renamed from: i */
    private C5499a<Float, Float> f15568i;

    /* renamed from: j */
    private C5499a<Integer, Integer> f15569j;

    /* renamed from: k */
    private C5507c f15570k;

    /* renamed from: l */
    private C5507c f15571l;

    /* renamed from: m */
    private C5499a<?, Float> f15572m;

    /* renamed from: n */
    private C5499a<?, Float> f15573n;

    public C5519o(C5544l lVar) {
        this.f15565f = lVar.mo16700c() == null ? null : lVar.mo16700c().mo16693a();
        this.f15566g = lVar.mo16703f() == null ? null : lVar.mo16703f().mo16693a();
        this.f15567h = lVar.mo16705h() == null ? null : lVar.mo16705h().mo16693a();
        this.f15568i = lVar.mo16704g() == null ? null : lVar.mo16704g().mo16693a();
        C5507c cVar = lVar.mo16706i() == null ? null : (C5507c) lVar.mo16706i().mo16693a();
        this.f15570k = cVar;
        if (cVar != null) {
            this.f15561b = new Matrix();
            this.f15562c = new Matrix();
            this.f15563d = new Matrix();
            this.f15564e = new float[9];
        } else {
            this.f15561b = null;
            this.f15562c = null;
            this.f15563d = null;
            this.f15564e = null;
        }
        this.f15571l = lVar.mo16707j() == null ? null : (C5507c) lVar.mo16707j().mo16693a();
        if (lVar.mo16702e() != null) {
            this.f15569j = lVar.mo16702e().mo16693a();
        }
        if (lVar.mo16708k() != null) {
            this.f15572m = lVar.mo16708k().mo16693a();
        } else {
            this.f15572m = null;
        }
        if (lVar.mo16701d() != null) {
            this.f15573n = lVar.mo16701d().mo16693a();
        } else {
            this.f15573n = null;
        }
    }

    /* renamed from: d */
    private void m20554d() {
        for (int i = 0; i < 9; i++) {
            this.f15564e[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public void mo16650a(C5571a aVar) {
        aVar.mo16812j(this.f15569j);
        aVar.mo16812j(this.f15572m);
        aVar.mo16812j(this.f15573n);
        aVar.mo16812j(this.f15565f);
        aVar.mo16812j(this.f15566g);
        aVar.mo16812j(this.f15567h);
        aVar.mo16812j(this.f15568i);
        aVar.mo16812j(this.f15570k);
        aVar.mo16812j(this.f15571l);
    }

    /* renamed from: b */
    public void mo16651b(C5499a.C5501b bVar) {
        C5499a<Integer, Integer> aVar = this.f15569j;
        if (aVar != null) {
            aVar.mo16606a(bVar);
        }
        C5499a<?, Float> aVar2 = this.f15572m;
        if (aVar2 != null) {
            aVar2.mo16606a(bVar);
        }
        C5499a<?, Float> aVar3 = this.f15573n;
        if (aVar3 != null) {
            aVar3.mo16606a(bVar);
        }
        C5499a<PointF, PointF> aVar4 = this.f15565f;
        if (aVar4 != null) {
            aVar4.mo16606a(bVar);
        }
        C5499a<?, PointF> aVar5 = this.f15566g;
        if (aVar5 != null) {
            aVar5.mo16606a(bVar);
        }
        C5499a<C5420d, C5420d> aVar6 = this.f15567h;
        if (aVar6 != null) {
            aVar6.mo16606a(bVar);
        }
        C5499a<Float, Float> aVar7 = this.f15568i;
        if (aVar7 != null) {
            aVar7.mo16606a(bVar);
        }
        C5507c cVar = this.f15570k;
        if (cVar != null) {
            cVar.mo16606a(bVar);
        }
        C5507c cVar2 = this.f15571l;
        if (cVar2 != null) {
            cVar2.mo16606a(bVar);
        }
    }

    /* renamed from: c */
    public <T> boolean mo16652c(T t, C5419c<T> cVar) {
        C5507c cVar2;
        C5499a aVar;
        C5507c cVar3;
        C5499a<?, Float> aVar2;
        if (t == C5462l.f15288e) {
            aVar = this.f15565f;
            if (aVar == null) {
                this.f15565f = new C5520p(cVar, new PointF());
                return true;
            }
        } else if (t == C5462l.f15289f) {
            aVar = this.f15566g;
            if (aVar == null) {
                this.f15566g = new C5520p(cVar, new PointF());
                return true;
            }
        } else {
            if (t == C5462l.f15290g) {
                C5499a<?, PointF> aVar3 = this.f15566g;
                if (aVar3 instanceof C5517m) {
                    ((C5517m) aVar3).mo16647r(cVar);
                    return true;
                }
            }
            if (t == C5462l.f15291h) {
                C5499a<?, PointF> aVar4 = this.f15566g;
                if (aVar4 instanceof C5517m) {
                    ((C5517m) aVar4).mo16648s(cVar);
                    return true;
                }
            }
            if (t == C5462l.f15296m) {
                aVar = this.f15567h;
                if (aVar == null) {
                    this.f15567h = new C5520p(cVar, new C5420d());
                    return true;
                }
            } else if (t == C5462l.f15297n) {
                aVar = this.f15568i;
                if (aVar == null) {
                    this.f15568i = new C5520p(cVar, Float.valueOf(0.0f));
                    return true;
                }
            } else if (t == C5462l.f15286c) {
                aVar = this.f15569j;
                if (aVar == null) {
                    this.f15569j = new C5520p(cVar, 100);
                    return true;
                }
            } else {
                if (t != C5462l.f15276A || (aVar2 = this.f15572m) == null) {
                    if (t != C5462l.f15277B || (aVar2 = this.f15573n) == null) {
                        if (t == C5462l.f15298o && (cVar3 = this.f15570k) != null) {
                            if (cVar3 == null) {
                                this.f15570k = new C5507c(Collections.singletonList(new C5417a(Float.valueOf(0.0f))));
                            }
                            aVar = this.f15570k;
                        } else if (t != C5462l.f15299p || (cVar2 = this.f15571l) == null) {
                            return false;
                        } else {
                            if (cVar2 == null) {
                                this.f15571l = new C5507c(Collections.singletonList(new C5417a(Float.valueOf(0.0f))));
                            }
                            aVar = this.f15571l;
                        }
                    } else if (aVar2 == null) {
                        this.f15573n = new C5520p(cVar, 100);
                        return true;
                    }
                } else if (aVar2 == null) {
                    this.f15572m = new C5520p(cVar, 100);
                    return true;
                }
                aVar2.mo16618n(cVar);
                return true;
            }
        }
        aVar.mo16618n(cVar);
        return true;
    }

    /* renamed from: e */
    public C5499a<?, Float> mo16653e() {
        return this.f15573n;
    }

    /* renamed from: f */
    public Matrix mo16654f() {
        this.f15560a.reset();
        C5499a<?, PointF> aVar = this.f15566g;
        if (aVar != null) {
            PointF h = aVar.mo16612h();
            float f = h.x;
            if (!(f == 0.0f && h.y == 0.0f)) {
                this.f15560a.preTranslate(f, h.y);
            }
        }
        C5499a<Float, Float> aVar2 = this.f15568i;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof C5520p ? aVar2.mo16612h().floatValue() : ((C5507c) aVar2).mo16628p();
            if (floatValue != 0.0f) {
                this.f15560a.preRotate(floatValue);
            }
        }
        if (this.f15570k != null) {
            C5507c cVar = this.f15571l;
            float cos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-cVar.mo16628p()) + 90.0f)));
            C5507c cVar2 = this.f15571l;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-cVar2.mo16628p()) + 90.0f)));
            m20554d();
            float[] fArr = this.f15564e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f15561b.setValues(fArr);
            m20554d();
            float[] fArr2 = this.f15564e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.f15570k.mo16628p()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f15562c.setValues(fArr2);
            m20554d();
            float[] fArr3 = this.f15564e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f15563d.setValues(fArr3);
            this.f15562c.preConcat(this.f15561b);
            this.f15563d.preConcat(this.f15562c);
            this.f15560a.preConcat(this.f15563d);
        }
        C5499a<C5420d, C5420d> aVar3 = this.f15567h;
        if (aVar3 != null) {
            C5420d h2 = aVar3.mo16612h();
            if (!(h2.mo16373b() == 1.0f && h2.mo16374c() == 1.0f)) {
                this.f15560a.preScale(h2.mo16373b(), h2.mo16374c());
            }
        }
        C5499a<PointF, PointF> aVar4 = this.f15565f;
        if (aVar4 != null) {
            PointF h3 = aVar4.mo16612h();
            float f3 = h3.x;
            if (!(f3 == 0.0f && h3.y == 0.0f)) {
                this.f15560a.preTranslate(-f3, -h3.y);
            }
        }
        return this.f15560a;
    }

    /* renamed from: g */
    public Matrix mo16655g(float f) {
        C5499a<?, PointF> aVar = this.f15566g;
        PointF pointF = null;
        PointF h = aVar == null ? null : aVar.mo16612h();
        C5499a<C5420d, C5420d> aVar2 = this.f15567h;
        C5420d h2 = aVar2 == null ? null : aVar2.mo16612h();
        this.f15560a.reset();
        if (h != null) {
            this.f15560a.preTranslate(h.x * f, h.y * f);
        }
        if (h2 != null) {
            double d = (double) f;
            this.f15560a.preScale((float) Math.pow((double) h2.mo16373b(), d), (float) Math.pow((double) h2.mo16374c(), d));
        }
        C5499a<Float, Float> aVar3 = this.f15568i;
        if (aVar3 != null) {
            float floatValue = aVar3.mo16612h().floatValue();
            C5499a<PointF, PointF> aVar4 = this.f15565f;
            if (aVar4 != null) {
                pointF = aVar4.mo16612h();
            }
            Matrix matrix = this.f15560a;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f15560a;
    }

    /* renamed from: h */
    public C5499a<?, Integer> mo16656h() {
        return this.f15569j;
    }

    /* renamed from: i */
    public C5499a<?, Float> mo16657i() {
        return this.f15572m;
    }

    /* renamed from: j */
    public void mo16658j(float f) {
        C5499a<Integer, Integer> aVar = this.f15569j;
        if (aVar != null) {
            aVar.mo16617m(f);
        }
        C5499a<?, Float> aVar2 = this.f15572m;
        if (aVar2 != null) {
            aVar2.mo16617m(f);
        }
        C5499a<?, Float> aVar3 = this.f15573n;
        if (aVar3 != null) {
            aVar3.mo16617m(f);
        }
        C5499a<PointF, PointF> aVar4 = this.f15565f;
        if (aVar4 != null) {
            aVar4.mo16617m(f);
        }
        C5499a<?, PointF> aVar5 = this.f15566g;
        if (aVar5 != null) {
            aVar5.mo16617m(f);
        }
        C5499a<C5420d, C5420d> aVar6 = this.f15567h;
        if (aVar6 != null) {
            aVar6.mo16617m(f);
        }
        C5499a<Float, Float> aVar7 = this.f15568i;
        if (aVar7 != null) {
            aVar7.mo16617m(f);
        }
        C5507c cVar = this.f15570k;
        if (cVar != null) {
            cVar.mo16617m(f);
        }
        C5507c cVar2 = this.f15571l;
        if (cVar2 != null) {
            cVar2.mo16617m(f);
        }
    }
}
