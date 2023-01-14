package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import p027c.p060f.C1793d;
import p174e.p181b.p182a.C5422c;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.C5462l;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.C5475a;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5520p;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.p190k.C5549c;
import p174e.p181b.p182a.p188w.p190k.C5550d;
import p174e.p181b.p182a.p188w.p190k.C5552f;
import p174e.p181b.p182a.p188w.p191l.C5571a;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.u.b.h */
public class C5485h implements C5482e, C5499a.C5501b, C5488k {

    /* renamed from: a */
    private final String f15436a;

    /* renamed from: b */
    private final boolean f15437b;

    /* renamed from: c */
    private final C5571a f15438c;

    /* renamed from: d */
    private final C1793d<LinearGradient> f15439d = new C1793d<>();

    /* renamed from: e */
    private final C1793d<RadialGradient> f15440e = new C1793d<>();

    /* renamed from: f */
    private final Path f15441f;

    /* renamed from: g */
    private final Paint f15442g;

    /* renamed from: h */
    private final RectF f15443h;

    /* renamed from: i */
    private final List<C5491m> f15444i;

    /* renamed from: j */
    private final C5552f f15445j;

    /* renamed from: k */
    private final C5499a<C5549c, C5549c> f15446k;

    /* renamed from: l */
    private final C5499a<Integer, Integer> f15447l;

    /* renamed from: m */
    private final C5499a<PointF, PointF> f15448m;

    /* renamed from: n */
    private final C5499a<PointF, PointF> f15449n;

    /* renamed from: o */
    private C5499a<ColorFilter, ColorFilter> f15450o;

    /* renamed from: p */
    private C5520p f15451p;

    /* renamed from: q */
    private final C5442g f15452q;

    /* renamed from: r */
    private final int f15453r;

    public C5485h(C5442g gVar, C5571a aVar, C5550d dVar) {
        Path path = new Path();
        this.f15441f = path;
        this.f15442g = new C5475a(1);
        this.f15443h = new RectF();
        this.f15444i = new ArrayList();
        this.f15438c = aVar;
        this.f15436a = dVar.mo16722f();
        this.f15437b = dVar.mo16725i();
        this.f15452q = gVar;
        this.f15445j = dVar.mo16721e();
        path.setFillType(dVar.mo16719c());
        this.f15453r = (int) (gVar.mo16546q().mo16458d() / 32.0f);
        C5499a<C5549c, C5549c> a = dVar.mo16720d().mo16693a();
        this.f15446k = a;
        a.mo16606a(this);
        aVar.mo16812j(a);
        C5499a<Integer, Integer> a2 = dVar.mo16723g().mo16693a();
        this.f15447l = a2;
        a2.mo16606a(this);
        aVar.mo16812j(a2);
        C5499a<PointF, PointF> a3 = dVar.mo16724h().mo16693a();
        this.f15448m = a3;
        a3.mo16606a(this);
        aVar.mo16812j(a3);
        C5499a<PointF, PointF> a4 = dVar.mo16718b().mo16693a();
        this.f15449n = a4;
        a4.mo16606a(this);
        aVar.mo16812j(a4);
    }

    /* renamed from: f */
    private int[] m20420f(int[] iArr) {
        C5520p pVar = this.f15451p;
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

    /* renamed from: i */
    private int m20421i() {
        int round = Math.round(this.f15448m.mo16611f() * ((float) this.f15453r));
        int round2 = Math.round(this.f15449n.mo16611f() * ((float) this.f15453r));
        int round3 = Math.round(this.f15446k.mo16611f() * ((float) this.f15453r));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: j */
    private LinearGradient m20422j() {
        long i = (long) m20421i();
        LinearGradient i2 = this.f15439d.mo6165i(i);
        if (i2 != null) {
            return i2;
        }
        PointF h = this.f15448m.mo16612h();
        PointF h2 = this.f15449n.mo16612h();
        C5549c h3 = this.f15446k.mo16612h();
        LinearGradient linearGradient = new LinearGradient(h.x, h.y, h2.x, h2.y, m20420f(h3.mo16714a()), h3.mo16715b(), Shader.TileMode.CLAMP);
        this.f15439d.mo6169m(i, linearGradient);
        return linearGradient;
    }

    /* renamed from: k */
    private RadialGradient m20423k() {
        long i = (long) m20421i();
        RadialGradient i2 = this.f15440e.mo6165i(i);
        if (i2 != null) {
            return i2;
        }
        PointF h = this.f15448m.mo16612h();
        PointF h2 = this.f15449n.mo16612h();
        C5549c h3 = this.f15446k.mo16612h();
        int[] f = m20420f(h3.mo16714a());
        float[] b = h3.mo16715b();
        float f2 = h.x;
        float f3 = h.y;
        float hypot = (float) Math.hypot((double) (h2.x - f2), (double) (h2.y - f3));
        RadialGradient radialGradient = new RadialGradient(f2, f3, hypot <= 0.0f ? 0.001f : hypot, f, b, Shader.TileMode.CLAMP);
        this.f15440e.mo6169m(i, radialGradient);
        return radialGradient;
    }

    /* renamed from: b */
    public void mo16587b() {
        this.f15452q.invalidateSelf();
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C5480c cVar = list2.get(i);
            if (cVar instanceof C5491m) {
                this.f15444i.add((C5491m) cVar);
            }
        }
    }

    /* renamed from: d */
    public void mo16589d(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
        C5646g.m21065m(eVar, i, list, eVar2, this);
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        this.f15441f.reset();
        for (int i = 0; i < this.f15444i.size(); i++) {
            this.f15441f.addPath(this.f15444i.get(i).mo16596a(), matrix);
        }
        this.f15441f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: g */
    public void mo16591g(Canvas canvas, Matrix matrix, int i) {
        if (!this.f15437b) {
            C5422c.m20179a("GradientFillContent#draw");
            this.f15441f.reset();
            for (int i2 = 0; i2 < this.f15444i.size(); i2++) {
                this.f15441f.addPath(this.f15444i.get(i2).mo16596a(), matrix);
            }
            this.f15441f.computeBounds(this.f15443h, false);
            Shader j = this.f15445j == C5552f.LINEAR ? m20422j() : m20423k();
            j.setLocalMatrix(matrix);
            this.f15442g.setShader(j);
            C5499a<ColorFilter, ColorFilter> aVar = this.f15450o;
            if (aVar != null) {
                this.f15442g.setColorFilter(aVar.mo16612h());
            }
            this.f15442g.setAlpha(C5646g.m21056d((int) ((((((float) i) / 255.0f) * ((float) this.f15447l.mo16612h().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f15441f, this.f15442g);
            C5422c.m20180b("GradientFillContent#draw");
        }
    }

    public String getName() {
        return this.f15436a;
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        C5571a aVar;
        C5499a aVar2;
        if (t == C5462l.f15287d) {
            this.f15447l.mo16618n(cVar);
            return;
        }
        if (t == C5462l.f15280E) {
            C5499a<ColorFilter, ColorFilter> aVar3 = this.f15450o;
            if (aVar3 != null) {
                this.f15438c.mo16806D(aVar3);
            }
            if (cVar == null) {
                this.f15450o = null;
                return;
            }
            C5520p pVar = new C5520p(cVar);
            this.f15450o = pVar;
            pVar.mo16606a(this);
            aVar = this.f15438c;
            aVar2 = this.f15450o;
        } else if (t == C5462l.f15281F) {
            C5520p pVar2 = this.f15451p;
            if (pVar2 != null) {
                this.f15438c.mo16806D(pVar2);
            }
            if (cVar == null) {
                this.f15451p = null;
                return;
            }
            this.f15439d.mo6162d();
            this.f15440e.mo6162d();
            C5520p pVar3 = new C5520p(cVar);
            this.f15451p = pVar3;
            pVar3.mo16606a(this);
            aVar = this.f15438c;
            aVar2 = this.f15451p;
        } else {
            return;
        }
        aVar.mo16812j(aVar2);
    }
}
