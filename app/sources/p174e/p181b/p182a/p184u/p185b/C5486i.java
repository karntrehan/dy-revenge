package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import p027c.p060f.C1793d;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5520p;
import p174e.p181b.p182a.p188w.p190k.C5549c;
import p174e.p181b.p182a.p188w.p190k.C5551e;
import p174e.p181b.p182a.p188w.p190k.C5552f;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.u.b.i */
public class C5486i extends C5476a {

    /* renamed from: o */
    private final String f15454o;

    /* renamed from: p */
    private final boolean f15455p;

    /* renamed from: q */
    private final C1793d<LinearGradient> f15456q = new C1793d<>();

    /* renamed from: r */
    private final C1793d<RadialGradient> f15457r = new C1793d<>();

    /* renamed from: s */
    private final RectF f15458s = new RectF();

    /* renamed from: t */
    private final C5552f f15459t;

    /* renamed from: u */
    private final int f15460u;

    /* renamed from: v */
    private final C5499a<C5549c, C5549c> f15461v;

    /* renamed from: w */
    private final C5499a<PointF, PointF> f15462w;

    /* renamed from: x */
    private final C5499a<PointF, PointF> f15463x;

    /* renamed from: y */
    private C5520p f15464y;

    public C5486i(C5442g gVar, C5571a aVar, C5551e eVar) {
        super(gVar, aVar, eVar.mo16726b().mo16797e(), eVar.mo16731g().mo16798e(), eVar.mo16733i(), eVar.mo16735k(), eVar.mo16737m(), eVar.mo16732h(), eVar.mo16727c());
        this.f15454o = eVar.mo16734j();
        this.f15459t = eVar.mo16730f();
        this.f15455p = eVar.mo16738n();
        this.f15460u = (int) (gVar.mo16546q().mo16458d() / 32.0f);
        C5499a<C5549c, C5549c> a = eVar.mo16729e().mo16693a();
        this.f15461v = a;
        a.mo16606a(this);
        aVar.mo16812j(a);
        C5499a<PointF, PointF> a2 = eVar.mo16736l().mo16693a();
        this.f15462w = a2;
        a2.mo16606a(this);
        aVar.mo16812j(a2);
        C5499a<PointF, PointF> a3 = eVar.mo16728d().mo16693a();
        this.f15463x = a3;
        a3.mo16606a(this);
        aVar.mo16812j(a3);
    }

    /* renamed from: j */
    private int[] m20430j(int[] iArr) {
        C5520p pVar = this.f15464y;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.mo16612h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: k */
    private int m20431k() {
        int round = Math.round(this.f15462w.mo16611f() * ((float) this.f15460u));
        int round2 = Math.round(this.f15463x.mo16611f() * ((float) this.f15460u));
        int round3 = Math.round(this.f15461v.mo16611f() * ((float) this.f15460u));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: l */
    private LinearGradient m20432l() {
        long k = (long) m20431k();
        LinearGradient i = this.f15456q.mo6165i(k);
        if (i != null) {
            return i;
        }
        PointF h = this.f15462w.mo16612h();
        PointF h2 = this.f15463x.mo16612h();
        C5549c h3 = this.f15461v.mo16612h();
        LinearGradient linearGradient = new LinearGradient(h.x, h.y, h2.x, h2.y, m20430j(h3.mo16714a()), h3.mo16715b(), Shader.TileMode.CLAMP);
        this.f15456q.mo6169m(k, linearGradient);
        return linearGradient;
    }

    /* renamed from: m */
    private RadialGradient m20433m() {
        long k = (long) m20431k();
        RadialGradient i = this.f15457r.mo6165i(k);
        if (i != null) {
            return i;
        }
        PointF h = this.f15462w.mo16612h();
        PointF h2 = this.f15463x.mo16612h();
        C5549c h3 = this.f15461v.mo16612h();
        int[] j = m20430j(h3.mo16714a());
        float[] b = h3.mo16715b();
        float f = h.x;
        float f2 = h.y;
        RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot((double) (h2.x - f), (double) (h2.y - f2)), j, b, Shader.TileMode.CLAMP);
        this.f15457r.mo6169m(k, radialGradient);
        return radialGradient;
    }

    /* renamed from: g */
    public void mo16591g(Canvas canvas, Matrix matrix, int i) {
        if (!this.f15455p) {
            mo16590e(this.f15458s, matrix, false);
            Shader l = this.f15459t == C5552f.LINEAR ? m20432l() : m20433m();
            l.setLocalMatrix(matrix);
            this.f15398i.setShader(l);
            super.mo16591g(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f15454o;
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        super.mo16592h(t, cVar);
        if (t == C5462l.f15281F) {
            C5520p pVar = this.f15464y;
            if (pVar != null) {
                this.f15395f.mo16806D(pVar);
            }
            if (cVar == null) {
                this.f15464y = null;
                return;
            }
            C5520p pVar2 = new C5520p(cVar);
            this.f15464y = pVar2;
            pVar2.mo16606a(this);
            this.f15395f.mo16812j(this.f15464y);
        }
    }
}
