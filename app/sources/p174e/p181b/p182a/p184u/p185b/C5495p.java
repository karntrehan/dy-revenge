package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5519o;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.p190k.C5560k;
import p174e.p181b.p182a.p188w.p191l.C5571a;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.u.b.p */
public class C5495p implements C5482e, C5491m, C5487j, C5499a.C5501b, C5488k {

    /* renamed from: a */
    private final Matrix f15497a = new Matrix();

    /* renamed from: b */
    private final Path f15498b = new Path();

    /* renamed from: c */
    private final C5442g f15499c;

    /* renamed from: d */
    private final C5571a f15500d;

    /* renamed from: e */
    private final String f15501e;

    /* renamed from: f */
    private final boolean f15502f;

    /* renamed from: g */
    private final C5499a<Float, Float> f15503g;

    /* renamed from: h */
    private final C5499a<Float, Float> f15504h;

    /* renamed from: i */
    private final C5519o f15505i;

    /* renamed from: j */
    private C5481d f15506j;

    public C5495p(C5442g gVar, C5571a aVar, C5560k kVar) {
        this.f15499c = gVar;
        this.f15500d = aVar;
        this.f15501e = kVar.mo16764c();
        this.f15502f = kVar.mo16767f();
        C5499a<Float, Float> a = kVar.mo16763b().mo16693a();
        this.f15503g = a;
        aVar.mo16812j(a);
        a.mo16606a(this);
        C5499a<Float, Float> a2 = kVar.mo16765d().mo16693a();
        this.f15504h = a2;
        aVar.mo16812j(a2);
        a2.mo16606a(this);
        C5519o b = kVar.mo16766e().mo16699b();
        this.f15505i = b;
        b.mo16650a(aVar);
        b.mo16651b(this);
    }

    /* renamed from: a */
    public Path mo16596a() {
        Path a = this.f15506j.mo16596a();
        this.f15498b.reset();
        float floatValue = this.f15503g.mo16612h().floatValue();
        float floatValue2 = this.f15504h.mo16612h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f15497a.set(this.f15505i.mo16655g(((float) i) + floatValue2));
            this.f15498b.addPath(a, this.f15497a);
        }
        return this.f15498b;
    }

    /* renamed from: b */
    public void mo16587b() {
        this.f15499c.invalidateSelf();
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
        this.f15506j.mo16588c(list, list2);
    }

    /* renamed from: d */
    public void mo16589d(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
        C5646g.m21065m(eVar, i, list, eVar2, this);
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        this.f15506j.mo16590e(rectF, matrix, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16599f(java.util.ListIterator<p174e.p181b.p182a.p184u.p185b.C5480c> r9) {
        /*
            r8 = this;
            e.b.a.u.b.d r0 = r8.f15506j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            e.b.a.u.b.d r9 = new e.b.a.u.b.d
            e.b.a.g r2 = r8.f15499c
            e.b.a.w.l.a r3 = r8.f15500d
            boolean r5 = r8.f15502f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f15506j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p184u.p185b.C5495p.mo16599f(java.util.ListIterator):void");
    }

    /* renamed from: g */
    public void mo16591g(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f15503g.mo16612h().floatValue();
        float floatValue2 = this.f15504h.mo16612h().floatValue();
        float floatValue3 = this.f15505i.mo16657i().mo16612h().floatValue() / 100.0f;
        float floatValue4 = this.f15505i.mo16653e().mo16612h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f15497a.set(matrix);
            float f = (float) i2;
            this.f15497a.preConcat(this.f15505i.mo16655g(f + floatValue2));
            this.f15506j.mo16591g(canvas, this.f15497a, (int) (((float) i) * C5646g.m21063k(floatValue3, floatValue4, f / floatValue)));
        }
    }

    public String getName() {
        return this.f15501e;
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        C5499a<Float, Float> aVar;
        if (!this.f15505i.mo16652c(t, cVar)) {
            if (t == C5462l.f15302s) {
                aVar = this.f15503g;
            } else if (t == C5462l.f15303t) {
                aVar = this.f15504h;
            } else {
                return;
            }
            aVar.mo16618n(cVar);
        }
    }
}
