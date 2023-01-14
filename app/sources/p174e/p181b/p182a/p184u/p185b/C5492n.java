package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.p190k.C5557i;
import p174e.p181b.p182a.p188w.p190k.C5569q;
import p174e.p181b.p182a.p188w.p191l.C5571a;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.u.b.n */
public class C5492n implements C5491m, C5499a.C5501b, C5488k {

    /* renamed from: a */
    private final Path f15472a = new Path();

    /* renamed from: b */
    private final String f15473b;

    /* renamed from: c */
    private final C5442g f15474c;

    /* renamed from: d */
    private final C5557i.C5558a f15475d;

    /* renamed from: e */
    private final boolean f15476e;

    /* renamed from: f */
    private final C5499a<?, Float> f15477f;

    /* renamed from: g */
    private final C5499a<?, PointF> f15478g;

    /* renamed from: h */
    private final C5499a<?, Float> f15479h;

    /* renamed from: i */
    private final C5499a<?, Float> f15480i;

    /* renamed from: j */
    private final C5499a<?, Float> f15481j;

    /* renamed from: k */
    private final C5499a<?, Float> f15482k;

    /* renamed from: l */
    private final C5499a<?, Float> f15483l;

    /* renamed from: m */
    private C5479b f15484m = new C5479b();

    /* renamed from: n */
    private boolean f15485n;

    /* renamed from: e.b.a.u.b.n$a */
    static /* synthetic */ class C5493a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15486a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                e.b.a.w.k.i$a[] r0 = p174e.p181b.p182a.p188w.p190k.C5557i.C5558a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15486a = r0
                e.b.a.w.k.i$a r1 = p174e.p181b.p182a.p188w.p190k.C5557i.C5558a.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15486a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.b.a.w.k.i$a r1 = p174e.p181b.p182a.p188w.p190k.C5557i.C5558a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p184u.p185b.C5492n.C5493a.<clinit>():void");
        }
    }

    public C5492n(C5442g gVar, C5571a aVar, C5557i iVar) {
        C5499a<Float, Float> aVar2;
        this.f15474c = gVar;
        this.f15473b = iVar.mo16749d();
        C5557i.C5558a j = iVar.mo16755j();
        this.f15475d = j;
        this.f15476e = iVar.mo16756k();
        C5499a<Float, Float> a = iVar.mo16752g().mo16693a();
        this.f15477f = a;
        C5499a<PointF, PointF> a2 = iVar.mo16753h().mo16693a();
        this.f15478g = a2;
        C5499a<Float, Float> a3 = iVar.mo16754i().mo16693a();
        this.f15479h = a3;
        C5499a<Float, Float> a4 = iVar.mo16750e().mo16693a();
        this.f15481j = a4;
        C5499a<Float, Float> a5 = iVar.mo16751f().mo16693a();
        this.f15483l = a5;
        C5557i.C5558a aVar3 = C5557i.C5558a.STAR;
        if (j == aVar3) {
            this.f15480i = iVar.mo16747b().mo16693a();
            aVar2 = iVar.mo16748c().mo16693a();
        } else {
            aVar2 = null;
            this.f15480i = null;
        }
        this.f15482k = aVar2;
        aVar.mo16812j(a);
        aVar.mo16812j(a2);
        aVar.mo16812j(a3);
        aVar.mo16812j(a4);
        aVar.mo16812j(a5);
        if (j == aVar3) {
            aVar.mo16812j(this.f15480i);
            aVar.mo16812j(this.f15482k);
        }
        a.mo16606a(this);
        a2.mo16606a(this);
        a3.mo16606a(this);
        a4.mo16606a(this);
        a5.mo16606a(this);
        if (j == aVar3) {
            this.f15480i.mo16606a(this);
            this.f15482k.mo16606a(this);
        }
    }

    /* renamed from: f */
    private void m20443f() {
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor((double) this.f15477f.mo16612h().floatValue());
        C5499a<?, Float> aVar = this.f15479h;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) aVar.mo16612h().floatValue()) - 90.0d);
        double d4 = (double) floor;
        float floatValue = this.f15483l.mo16612h().floatValue() / 100.0f;
        float floatValue2 = this.f15481j.mo16612h().floatValue();
        double d5 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f15472a.moveTo(cos, sin);
        double d6 = (double) ((float) (6.283185307179586d / d4));
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (((double) i2) < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d3 = d5;
                i = i2;
                d2 = d7;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d = d6;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f = floatValue2 * floatValue * 0.25f;
                this.f15472a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d2 = d7;
                d3 = d5;
                d = d6;
                i = i2;
                this.f15472a.lineTo(cos2, sin2);
            }
            d7 = d2 + d;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d3;
            d6 = d;
        }
        PointF h = this.f15478g.mo16612h();
        this.f15472a.offset(h.x, h.y);
        this.f15472a.close();
    }

    /* renamed from: i */
    private void m20444i() {
        double d;
        int i;
        float f;
        float f2;
        float f3;
        double d2;
        float f4;
        float f5;
        double d3;
        float f6;
        float f7;
        float f8;
        float f9;
        float floatValue = this.f15477f.mo16612h().floatValue();
        C5499a<?, Float> aVar = this.f15479h;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) aVar.mo16612h().floatValue()) - 90.0d);
        double d4 = (double) floatValue;
        float f10 = (float) (6.283185307179586d / d4);
        float f11 = f10 / 2.0f;
        float f12 = floatValue - ((float) ((int) floatValue));
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f12) * f11);
        }
        float floatValue2 = this.f15481j.mo16612h().floatValue();
        float floatValue3 = this.f15480i.mo16612h().floatValue();
        C5499a<?, Float> aVar2 = this.f15482k;
        float floatValue4 = aVar2 != null ? aVar2.mo16612h().floatValue() / 100.0f : 0.0f;
        C5499a<?, Float> aVar3 = this.f15483l;
        float floatValue5 = aVar3 != null ? aVar3.mo16612h().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f = ((floatValue2 - floatValue3) * f12) + floatValue3;
            i = i2;
            double d5 = (double) f;
            d = d4;
            f3 = (float) (d5 * Math.cos(radians));
            f2 = (float) (d5 * Math.sin(radians));
            this.f15472a.moveTo(f3, f2);
            d2 = radians + ((double) ((f10 * f12) / 2.0f));
        } else {
            d = d4;
            i = i2;
            double d6 = (double) floatValue2;
            float cos = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.f15472a.moveTo(cos, sin);
            d2 = radians + ((double) f11);
            f3 = cos;
            f2 = sin;
            f = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        float f13 = floatValue2;
        float f14 = floatValue3;
        int i3 = 0;
        boolean z = false;
        while (true) {
            double d7 = (double) i3;
            if (d7 < ceil) {
                float f15 = z ? f13 : f14;
                int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i4 == 0 || d7 != ceil - 2.0d) {
                    f4 = f10;
                    f5 = f11;
                } else {
                    f4 = f10;
                    f5 = (f10 * f12) / 2.0f;
                }
                if (i4 == 0 || d7 != ceil - 1.0d) {
                    f6 = f11;
                    d3 = d7;
                    f7 = f15;
                } else {
                    f6 = f11;
                    d3 = d7;
                    f7 = f;
                }
                double d8 = (double) f7;
                double d9 = ceil;
                float cos2 = (float) (d8 * Math.cos(d2));
                float sin2 = (float) (d8 * Math.sin(d2));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f15472a.lineTo(cos2, sin2);
                    f9 = floatValue4;
                    f8 = f;
                } else {
                    f9 = floatValue4;
                    f8 = f;
                    double atan2 = (double) ((float) (Math.atan2((double) f2, (double) f3) - 1.5707963267948966d));
                    float sin3 = (float) Math.sin(atan2);
                    float cos3 = (float) Math.cos(atan2);
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f16 = z ? f9 : floatValue5;
                    float f17 = z ? floatValue5 : f9;
                    float f18 = (z ? f14 : f13) * f16 * 0.47829f;
                    float f19 = cos3 * f18;
                    float f20 = f18 * sin3;
                    float f21 = (z ? f13 : f14) * f17 * 0.47829f;
                    float f22 = cos4 * f21;
                    float f23 = f21 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f19 *= f12;
                            f20 *= f12;
                        } else if (d3 == d9 - 1.0d) {
                            f22 *= f12;
                            f23 *= f12;
                        }
                    }
                    this.f15472a.cubicTo(f3 - f19, f2 - f20, cos2 + f22, sin2 + f23, cos2, sin2);
                }
                d2 += (double) f5;
                z = !z;
                i3++;
                f3 = cos2;
                f2 = sin2;
                floatValue4 = f9;
                f = f8;
                f11 = f6;
                f10 = f4;
                ceil = d9;
            } else {
                PointF h = this.f15478g.mo16612h();
                this.f15472a.offset(h.x, h.y);
                this.f15472a.close();
                return;
            }
        }
    }

    /* renamed from: j */
    private void m20445j() {
        this.f15485n = false;
        this.f15474c.invalidateSelf();
    }

    /* renamed from: a */
    public Path mo16596a() {
        if (this.f15485n) {
            return this.f15472a;
        }
        this.f15472a.reset();
        if (!this.f15476e) {
            int i = C5493a.f15486a[this.f15475d.ordinal()];
            if (i == 1) {
                m20444i();
            } else if (i == 2) {
                m20443f();
            }
            this.f15472a.close();
            this.f15484m.mo16594b(this.f15472a);
        }
        this.f15485n = true;
        return this.f15472a;
    }

    /* renamed from: b */
    public void mo16587b() {
        m20445j();
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C5480c cVar = list.get(i);
            if (cVar instanceof C5498s) {
                C5498s sVar = (C5498s) cVar;
                if (sVar.mo16604j() == C5569q.C5570a.SIMULTANEOUSLY) {
                    this.f15484m.mo16593a(sVar);
                    sVar.mo16600d(this);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo16589d(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
        C5646g.m21065m(eVar, i, list, eVar2, this);
    }

    public String getName() {
        return this.f15473b;
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        C5499a aVar;
        C5499a<?, Float> aVar2;
        if (t == C5462l.f15304u) {
            aVar = this.f15477f;
        } else if (t == C5462l.f15305v) {
            aVar = this.f15479h;
        } else if (t == C5462l.f15295l) {
            aVar = this.f15478g;
        } else {
            if (t != C5462l.f15306w || (aVar2 = this.f15480i) == null) {
                if (t == C5462l.f15307x) {
                    aVar = this.f15481j;
                } else if (t != C5462l.f15308y || (aVar2 = this.f15482k) == null) {
                    if (t == C5462l.f15309z) {
                        aVar = this.f15483l;
                    } else {
                        return;
                    }
                }
            }
            aVar2.mo16618n(cVar);
            return;
        }
        aVar.mo16618n(cVar);
    }
}
