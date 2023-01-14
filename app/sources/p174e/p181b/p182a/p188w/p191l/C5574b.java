package p174e.p181b.p182a.p188w.p191l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p027c.p060f.C1793d;
import p174e.p181b.p182a.C5422c;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5520p;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.w.l.b */
public class C5574b extends C5571a {

    /* renamed from: A */
    private final List<C5571a> f15792A = new ArrayList();

    /* renamed from: B */
    private final RectF f15793B = new RectF();

    /* renamed from: C */
    private final RectF f15794C = new RectF();

    /* renamed from: D */
    private Paint f15795D = new Paint();

    /* renamed from: z */
    private C5499a<Float, Float> f15796z;

    /* renamed from: e.b.a.w.l.b$a */
    static /* synthetic */ class C5575a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15797a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                e.b.a.w.l.d$b[] r0 = p174e.p181b.p182a.p188w.p191l.C5577d.C5579b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15797a = r0
                e.b.a.w.l.d$b r1 = p174e.p181b.p182a.p188w.p191l.C5577d.C5579b.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15797a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.b.a.w.l.d$b r1 = p174e.p181b.p182a.p188w.p191l.C5577d.C5579b.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p188w.p191l.C5574b.C5575a.<clinit>():void");
        }
    }

    public C5574b(C5442g gVar, C5577d dVar, List<C5577d> list, C5433e eVar) {
        super(gVar, dVar);
        int i;
        C5571a aVar;
        C5534b s = dVar.mo16835s();
        if (s != null) {
            C5499a<Float, Float> a = s.mo16693a();
            this.f15796z = a;
            mo16812j(a);
            this.f15796z.mo16606a(this);
        } else {
            this.f15796z = null;
        }
        C1793d dVar2 = new C1793d(eVar.mo16465k().size());
        int size = list.size() - 1;
        C5571a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C5577d dVar3 = list.get(size);
            C5571a v = C5571a.m20778v(dVar3, gVar, eVar);
            if (v != null) {
                dVar2.mo6169m(v.mo16814w().mo16818b(), v);
                if (aVar2 != null) {
                    aVar2.mo16808F(v);
                    aVar2 = null;
                } else {
                    this.f15792A.add(0, v);
                    int i2 = C5575a.f15797a[dVar3.mo16822f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = v;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < dVar2.mo6172q(); i++) {
            C5571a aVar3 = (C5571a) dVar2.mo6165i(dVar2.mo6168l(i));
            if (!(aVar3 == null || (aVar = (C5571a) dVar2.mo6165i(aVar3.mo16814w().mo16824h())) == null)) {
                aVar3.mo16810H(aVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo16807E(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
        for (int i2 = 0; i2 < this.f15792A.size(); i2++) {
            this.f15792A.get(i2).mo16589d(eVar, i, list, eVar2);
        }
    }

    /* renamed from: G */
    public void mo16809G(boolean z) {
        super.mo16809G(z);
        for (C5571a G : this.f15792A) {
            G.mo16809G(z);
        }
    }

    /* renamed from: I */
    public void mo16811I(float f) {
        super.mo16811I(f);
        if (this.f15796z != null) {
            f = ((this.f15796z.mo16612h().floatValue() * this.f15778o.mo16817a().mo16463i()) - this.f15778o.mo16817a().mo16470p()) / (this.f15777n.mo16546q().mo16459e() + 0.01f);
        }
        if (this.f15796z == null) {
            f -= this.f15778o.mo16832p();
        }
        if (this.f15778o.mo16836t() != 0.0f && !"__container".equals(this.f15778o.mo16823g())) {
            f /= this.f15778o.mo16836t();
        }
        for (int size = this.f15792A.size() - 1; size >= 0; size--) {
            this.f15792A.get(size).mo16811I(f);
        }
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        super.mo16590e(rectF, matrix, z);
        for (int size = this.f15792A.size() - 1; size >= 0; size--) {
            this.f15793B.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f15792A.get(size).mo16590e(this.f15793B, this.f15776m, true);
            rectF.union(this.f15793B);
        }
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        super.mo16592h(t, cVar);
        if (t != C5462l.f15278C) {
            return;
        }
        if (cVar == null) {
            C5499a<Float, Float> aVar = this.f15796z;
            if (aVar != null) {
                aVar.mo16618n((C5419c<Float>) null);
                return;
            }
            return;
        }
        C5520p pVar = new C5520p(cVar);
        this.f15796z = pVar;
        pVar.mo16606a(this);
        mo16812j(this.f15796z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo16813u(Canvas canvas, Matrix matrix, int i) {
        C5422c.m20179a("CompositionLayer#draw");
        this.f15794C.set(0.0f, 0.0f, (float) this.f15778o.mo16826j(), (float) this.f15778o.mo16825i());
        matrix.mapRect(this.f15794C);
        boolean z = this.f15777n.mo16499J() && this.f15792A.size() > 1 && i != 255;
        if (z) {
            this.f15795D.setAlpha(i);
            C5647h.m21078m(canvas, this.f15794C, this.f15795D);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f15792A.size() - 1; size >= 0; size--) {
            if (!this.f15794C.isEmpty() ? canvas.clipRect(this.f15794C) : true) {
                this.f15792A.get(size).mo16591g(canvas, matrix, i);
            }
        }
        canvas.restore();
        C5422c.m20180b("CompositionLayer#draw");
    }
}
