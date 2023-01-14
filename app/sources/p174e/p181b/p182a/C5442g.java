package p174e.p181b.p182a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p187v.C5521a;
import p174e.p181b.p182a.p187v.C5522b;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.C5531h;
import p174e.p181b.p182a.p188w.p191l.C5574b;
import p174e.p181b.p182a.p193y.C5631s;
import p174e.p181b.p182a.p195z.C5643d;
import p174e.p181b.p182a.p195z.C5644e;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.g */
public class C5442g extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: A */
    C5416a f15219A;

    /* renamed from: B */
    C5474t f15220B;

    /* renamed from: C */
    private boolean f15221C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C5574b f15222D;

    /* renamed from: E */
    private int f15223E;

    /* renamed from: F */
    private boolean f15224F;

    /* renamed from: G */
    private boolean f15225G;

    /* renamed from: H */
    private boolean f15226H;

    /* renamed from: I */
    private boolean f15227I;

    /* renamed from: J */
    private boolean f15228J;

    /* renamed from: f */
    private final Matrix f15229f = new Matrix();

    /* renamed from: o */
    private C5433e f15230o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C5644e f15231p;

    /* renamed from: q */
    private float f15232q;

    /* renamed from: r */
    private boolean f15233r;

    /* renamed from: s */
    private boolean f15234s;

    /* renamed from: t */
    private boolean f15235t;

    /* renamed from: u */
    private final ArrayList<C5457o> f15236u;

    /* renamed from: v */
    private final ValueAnimator.AnimatorUpdateListener f15237v;

    /* renamed from: w */
    private C5522b f15238w;

    /* renamed from: x */
    private String f15239x;

    /* renamed from: y */
    private C5421b f15240y;

    /* renamed from: z */
    private C5521a f15241z;

    /* renamed from: e.b.a.g$a */
    class C5443a implements C5457o {

        /* renamed from: a */
        final /* synthetic */ String f15242a;

        C5443a(String str) {
            this.f15242a = str;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16516a0(this.f15242a);
        }
    }

    /* renamed from: e.b.a.g$b */
    class C5444b implements C5457o {

        /* renamed from: a */
        final /* synthetic */ int f15244a;

        /* renamed from: b */
        final /* synthetic */ int f15245b;

        C5444b(int i, int i2) {
            this.f15244a = i;
            this.f15245b = i2;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16515Z(this.f15244a, this.f15245b);
        }
    }

    /* renamed from: e.b.a.g$c */
    class C5445c implements C5457o {

        /* renamed from: a */
        final /* synthetic */ int f15247a;

        C5445c(int i) {
            this.f15247a = i;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16508S(this.f15247a);
        }
    }

    /* renamed from: e.b.a.g$d */
    class C5446d implements C5457o {

        /* renamed from: a */
        final /* synthetic */ float f15249a;

        C5446d(float f) {
            this.f15249a = f;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16525g0(this.f15249a);
        }
    }

    /* renamed from: e.b.a.g$e */
    class C5447e implements C5457o {

        /* renamed from: a */
        final /* synthetic */ C5528e f15251a;

        /* renamed from: b */
        final /* synthetic */ Object f15252b;

        /* renamed from: c */
        final /* synthetic */ C5419c f15253c;

        C5447e(C5528e eVar, Object obj, C5419c cVar) {
            this.f15251a = eVar;
            this.f15252b = obj;
            this.f15253c = cVar;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16520d(this.f15251a, this.f15252b, this.f15253c);
        }
    }

    /* renamed from: e.b.a.g$f */
    class C5448f implements ValueAnimator.AnimatorUpdateListener {
        C5448f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C5442g.this.f15222D != null) {
                C5442g.this.f15222D.mo16811I(C5442g.this.f15231p.mo16911k());
            }
        }
    }

    /* renamed from: e.b.a.g$g */
    class C5449g implements C5457o {
        C5449g() {
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16501L();
        }
    }

    /* renamed from: e.b.a.g$h */
    class C5450h implements C5457o {
        C5450h() {
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16503N();
        }
    }

    /* renamed from: e.b.a.g$i */
    class C5451i implements C5457o {

        /* renamed from: a */
        final /* synthetic */ int f15258a;

        C5451i(int i) {
            this.f15258a = i;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16517b0(this.f15258a);
        }
    }

    /* renamed from: e.b.a.g$j */
    class C5452j implements C5457o {

        /* renamed from: a */
        final /* synthetic */ float f15260a;

        C5452j(float f) {
            this.f15260a = f;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16521d0(this.f15260a);
        }
    }

    /* renamed from: e.b.a.g$k */
    class C5453k implements C5457o {

        /* renamed from: a */
        final /* synthetic */ int f15262a;

        C5453k(int i) {
            this.f15262a = i;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16512W(this.f15262a);
        }
    }

    /* renamed from: e.b.a.g$l */
    class C5454l implements C5457o {

        /* renamed from: a */
        final /* synthetic */ float f15264a;

        C5454l(float f) {
            this.f15264a = f;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16514Y(this.f15264a);
        }
    }

    /* renamed from: e.b.a.g$m */
    class C5455m implements C5457o {

        /* renamed from: a */
        final /* synthetic */ String f15266a;

        C5455m(String str) {
            this.f15266a = str;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16519c0(this.f15266a);
        }
    }

    /* renamed from: e.b.a.g$n */
    class C5456n implements C5457o {

        /* renamed from: a */
        final /* synthetic */ String f15268a;

        C5456n(String str) {
            this.f15268a = str;
        }

        /* renamed from: a */
        public void mo16558a(C5433e eVar) {
            C5442g.this.mo16513X(this.f15268a);
        }
    }

    /* renamed from: e.b.a.g$o */
    private interface C5457o {
        /* renamed from: a */
        void mo16558a(C5433e eVar);
    }

    public C5442g() {
        C5644e eVar = new C5644e();
        this.f15231p = eVar;
        this.f15232q = 1.0f;
        this.f15233r = true;
        this.f15234s = false;
        this.f15235t = false;
        this.f15236u = new ArrayList<>();
        C5448f fVar = new C5448f();
        this.f15237v = fVar;
        this.f15223E = 255;
        this.f15227I = true;
        this.f15228J = false;
        eVar.addUpdateListener(fVar);
    }

    /* renamed from: e */
    private boolean m20273e() {
        return this.f15233r || this.f15234s;
    }

    /* renamed from: f */
    private float m20274f(Rect rect) {
        return ((float) rect.width()) / ((float) rect.height());
    }

    /* renamed from: g */
    private boolean m20275g() {
        C5433e eVar = this.f15230o;
        return eVar == null || getBounds().isEmpty() || m20274f(getBounds()) == m20274f(eVar.mo16456b());
    }

    /* renamed from: h */
    private void m20276h() {
        C5574b bVar = new C5574b(this, C5631s.m20997a(this.f15230o), this.f15230o.mo16465k(), this.f15230o);
        this.f15222D = bVar;
        if (this.f15225G) {
            bVar.mo16809G(true);
        }
    }

    /* renamed from: k */
    private void m20277k(Canvas canvas) {
        if (!m20275g()) {
            m20278l(canvas);
        } else {
            m20279m(canvas);
        }
    }

    /* renamed from: l */
    private void m20278l(Canvas canvas) {
        float f;
        if (this.f15222D != null) {
            int i = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.f15230o.mo16456b().width());
            float height = ((float) bounds.height()) / ((float) this.f15230o.mo16456b().height());
            if (this.f15227I) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f = 1.0f / min;
                    width /= f;
                    height /= f;
                } else {
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width2 = ((float) bounds.width()) / 2.0f;
                    float height2 = ((float) bounds.height()) / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
            this.f15229f.reset();
            this.f15229f.preScale(width, height);
            this.f15222D.mo16591g(canvas, this.f15229f, this.f15223E);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: m */
    private void m20279m(Canvas canvas) {
        float f;
        if (this.f15222D != null) {
            float f2 = this.f15232q;
            float y = m20283y(canvas);
            if (f2 > y) {
                f = this.f15232q / y;
            } else {
                y = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.f15230o.mo16456b().width()) / 2.0f;
                float height = ((float) this.f15230o.mo16456b().height()) / 2.0f;
                float f3 = width * y;
                float f4 = height * y;
                canvas.translate((mo16494E() * width) - f3, (mo16494E() * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f15229f.reset();
            this.f15229f.preScale(y, y);
            this.f15222D.mo16591g(canvas, this.f15229f, this.f15223E);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: r */
    private Context m20280r() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: s */
    private C5521a m20281s() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f15241z == null) {
            this.f15241z = new C5521a(getCallback(), this.f15219A);
        }
        return this.f15241z;
    }

    /* renamed from: v */
    private C5522b m20282v() {
        if (getCallback() == null) {
            return null;
        }
        C5522b bVar = this.f15238w;
        if (bVar != null && !bVar.mo16662b(m20280r())) {
            this.f15238w = null;
        }
        if (this.f15238w == null) {
            this.f15238w = new C5522b(getCallback(), this.f15239x, this.f15240y, this.f15230o.mo16464j());
        }
        return this.f15238w;
    }

    /* renamed from: y */
    private float m20283y(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f15230o.mo16456b().width()), ((float) canvas.getHeight()) / ((float) this.f15230o.mo16456b().height()));
    }

    /* renamed from: A */
    public C5467o mo16490A() {
        C5433e eVar = this.f15230o;
        if (eVar != null) {
            return eVar.mo16468n();
        }
        return null;
    }

    /* renamed from: B */
    public float mo16491B() {
        return this.f15231p.mo16911k();
    }

    /* renamed from: C */
    public int mo16492C() {
        return this.f15231p.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: D */
    public int mo16493D() {
        return this.f15231p.getRepeatMode();
    }

    /* renamed from: E */
    public float mo16494E() {
        return this.f15232q;
    }

    /* renamed from: F */
    public float mo16495F() {
        return this.f15231p.mo16915q();
    }

    /* renamed from: G */
    public C5474t mo16496G() {
        return this.f15220B;
    }

    /* renamed from: H */
    public Typeface mo16497H(String str, String str2) {
        C5521a s = m20281s();
        if (s != null) {
            return s.mo16659b(str, str2);
        }
        return null;
    }

    /* renamed from: I */
    public boolean mo16498I() {
        C5644e eVar = this.f15231p;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    /* renamed from: J */
    public boolean mo16499J() {
        return this.f15226H;
    }

    /* renamed from: K */
    public void mo16500K() {
        this.f15236u.clear();
        this.f15231p.mo16916s();
    }

    /* renamed from: L */
    public void mo16501L() {
        if (this.f15222D == null) {
            this.f15236u.add(new C5449g());
            return;
        }
        if (m20273e() || mo16492C() == 0) {
            this.f15231p.mo16918t();
        }
        if (!m20273e()) {
            mo16508S((int) (mo16495F() < 0.0f ? mo16557z() : mo16556x()));
            this.f15231p.mo16910j();
        }
    }

    /* renamed from: M */
    public List<C5528e> mo16502M(C5528e eVar) {
        if (this.f15222D == null) {
            C5643d.m21027c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f15222D.mo16589d(eVar, 0, arrayList, new C5528e(new String[0]));
        return arrayList;
    }

    /* renamed from: N */
    public void mo16503N() {
        if (this.f15222D == null) {
            this.f15236u.add(new C5450h());
            return;
        }
        if (m20273e() || mo16492C() == 0) {
            this.f15231p.mo16922x();
        }
        if (!m20273e()) {
            mo16508S((int) (mo16495F() < 0.0f ? mo16557z() : mo16556x()));
            this.f15231p.mo16910j();
        }
    }

    /* renamed from: O */
    public void mo16504O() {
        this.f15231p.mo16923y();
    }

    /* renamed from: P */
    public void mo16505P(boolean z) {
        this.f15226H = z;
    }

    /* renamed from: Q */
    public boolean mo16506Q(C5433e eVar) {
        if (this.f15230o == eVar) {
            return false;
        }
        this.f15228J = false;
        mo16536j();
        this.f15230o = eVar;
        m20276h();
        this.f15231p.mo16924z(eVar);
        mo16525g0(this.f15231p.getAnimatedFraction());
        mo16538k0(this.f15232q);
        Iterator it = new ArrayList(this.f15236u).iterator();
        while (it.hasNext()) {
            C5457o oVar = (C5457o) it.next();
            if (oVar != null) {
                oVar.mo16558a(eVar);
            }
            it.remove();
        }
        this.f15236u.clear();
        eVar.mo16477v(this.f15224F);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable((Drawable) null);
        imageView.setImageDrawable(this);
        return true;
    }

    /* renamed from: R */
    public void mo16507R(C5416a aVar) {
        C5521a aVar2 = this.f15241z;
        if (aVar2 != null) {
            aVar2.mo16660c(aVar);
        }
    }

    /* renamed from: S */
    public void mo16508S(int i) {
        if (this.f15230o == null) {
            this.f15236u.add(new C5445c(i));
        } else {
            this.f15231p.mo16898B((float) i);
        }
    }

    /* renamed from: T */
    public void mo16509T(boolean z) {
        this.f15234s = z;
    }

    /* renamed from: U */
    public void mo16510U(C5421b bVar) {
        this.f15240y = bVar;
        C5522b bVar2 = this.f15238w;
        if (bVar2 != null) {
            bVar2.mo16663d(bVar);
        }
    }

    /* renamed from: V */
    public void mo16511V(String str) {
        this.f15239x = str;
    }

    /* renamed from: W */
    public void mo16512W(int i) {
        if (this.f15230o == null) {
            this.f15236u.add(new C5453k(i));
        } else {
            this.f15231p.mo16899C(((float) i) + 0.99f);
        }
    }

    /* renamed from: X */
    public void mo16513X(String str) {
        C5433e eVar = this.f15230o;
        if (eVar == null) {
            this.f15236u.add(new C5456n(str));
            return;
        }
        C5531h l = eVar.mo16466l(str);
        if (l != null) {
            mo16512W((int) (l.f15623c + l.f15624d));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: Y */
    public void mo16514Y(float f) {
        C5433e eVar = this.f15230o;
        if (eVar == null) {
            this.f15236u.add(new C5454l(f));
        } else {
            mo16512W((int) C5646g.m21063k(eVar.mo16470p(), this.f15230o.mo16460f(), f));
        }
    }

    /* renamed from: Z */
    public void mo16515Z(int i, int i2) {
        if (this.f15230o == null) {
            this.f15236u.add(new C5444b(i, i2));
        } else {
            this.f15231p.mo16900D((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: a0 */
    public void mo16516a0(String str) {
        C5433e eVar = this.f15230o;
        if (eVar == null) {
            this.f15236u.add(new C5443a(str));
            return;
        }
        C5531h l = eVar.mo16466l(str);
        if (l != null) {
            int i = (int) l.f15623c;
            mo16515Z(i, ((int) l.f15624d) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: b0 */
    public void mo16517b0(int i) {
        if (this.f15230o == null) {
            this.f15236u.add(new C5451i(i));
        } else {
            this.f15231p.mo16901F(i);
        }
    }

    /* renamed from: c */
    public void mo16518c(Animator.AnimatorListener animatorListener) {
        this.f15231p.addListener(animatorListener);
    }

    /* renamed from: c0 */
    public void mo16519c0(String str) {
        C5433e eVar = this.f15230o;
        if (eVar == null) {
            this.f15236u.add(new C5455m(str));
            return;
        }
        C5531h l = eVar.mo16466l(str);
        if (l != null) {
            mo16517b0((int) l.f15623c);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: d */
    public <T> void mo16520d(C5528e eVar, T t, C5419c<T> cVar) {
        C5574b bVar = this.f15222D;
        if (bVar == null) {
            this.f15236u.add(new C5447e(eVar, t, cVar));
            return;
        }
        boolean z = true;
        if (eVar == C5528e.f15616a) {
            bVar.mo16592h(t, cVar);
        } else if (eVar.mo16680d() != null) {
            eVar.mo16680d().mo16592h(t, cVar);
        } else {
            List<C5528e> M = mo16502M(eVar);
            for (int i = 0; i < M.size(); i++) {
                M.get(i).mo16680d().mo16592h(t, cVar);
            }
            z = true ^ M.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == C5462l.f15278C) {
                mo16525g0(mo16491B());
            }
        }
    }

    /* renamed from: d0 */
    public void mo16521d0(float f) {
        C5433e eVar = this.f15230o;
        if (eVar == null) {
            this.f15236u.add(new C5452j(f));
        } else {
            mo16517b0((int) C5646g.m21063k(eVar.mo16470p(), this.f15230o.mo16460f(), f));
        }
    }

    public void draw(Canvas canvas) {
        this.f15228J = false;
        C5422c.m20179a("Drawable#draw");
        if (this.f15235t) {
            try {
                m20277k(canvas);
            } catch (Throwable th) {
                C5643d.m21026b("Lottie crashed in draw!", th);
            }
        } else {
            m20277k(canvas);
        }
        C5422c.m20180b("Drawable#draw");
    }

    /* renamed from: e0 */
    public void mo16523e0(boolean z) {
        if (this.f15225G != z) {
            this.f15225G = z;
            C5574b bVar = this.f15222D;
            if (bVar != null) {
                bVar.mo16809G(z);
            }
        }
    }

    /* renamed from: f0 */
    public void mo16524f0(boolean z) {
        this.f15224F = z;
        C5433e eVar = this.f15230o;
        if (eVar != null) {
            eVar.mo16477v(z);
        }
    }

    /* renamed from: g0 */
    public void mo16525g0(float f) {
        if (this.f15230o == null) {
            this.f15236u.add(new C5446d(f));
            return;
        }
        C5422c.m20179a("Drawable#setProgress");
        this.f15231p.mo16898B(this.f15230o.mo16462h(f));
        C5422c.m20180b("Drawable#setProgress");
    }

    public int getAlpha() {
        return this.f15223E;
    }

    public int getIntrinsicHeight() {
        C5433e eVar = this.f15230o;
        if (eVar == null) {
            return -1;
        }
        return (int) (((float) eVar.mo16456b().height()) * mo16494E());
    }

    public int getIntrinsicWidth() {
        C5433e eVar = this.f15230o;
        if (eVar == null) {
            return -1;
        }
        return (int) (((float) eVar.mo16456b().width()) * mo16494E());
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h0 */
    public void mo16530h0(int i) {
        this.f15231p.setRepeatCount(i);
    }

    /* renamed from: i */
    public void mo16531i() {
        this.f15236u.clear();
        this.f15231p.cancel();
    }

    /* renamed from: i0 */
    public void mo16532i0(int i) {
        this.f15231p.setRepeatMode(i);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.f15228J) {
            this.f15228J = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return mo16498I();
    }

    /* renamed from: j */
    public void mo16536j() {
        if (this.f15231p.isRunning()) {
            this.f15231p.cancel();
        }
        this.f15230o = null;
        this.f15222D = null;
        this.f15238w = null;
        this.f15231p.mo16908i();
        invalidateSelf();
    }

    /* renamed from: j0 */
    public void mo16537j0(boolean z) {
        this.f15235t = z;
    }

    /* renamed from: k0 */
    public void mo16538k0(float f) {
        this.f15232q = f;
    }

    /* renamed from: l0 */
    public void mo16539l0(float f) {
        this.f15231p.mo16902G(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo16540m0(Boolean bool) {
        this.f15233r = bool.booleanValue();
    }

    /* renamed from: n */
    public void mo16541n(boolean z) {
        if (this.f15221C != z) {
            if (Build.VERSION.SDK_INT < 19) {
                C5643d.m21027c("Merge paths are not supported pre-Kit Kat.");
                return;
            }
            this.f15221C = z;
            if (this.f15230o != null) {
                m20276h();
            }
        }
    }

    /* renamed from: n0 */
    public void mo16542n0(C5474t tVar) {
    }

    /* renamed from: o */
    public boolean mo16543o() {
        return this.f15221C;
    }

    /* renamed from: o0 */
    public boolean mo16544o0() {
        return this.f15220B == null && this.f15230o.mo16457c().mo6283p() > 0;
    }

    /* renamed from: p */
    public void mo16545p() {
        this.f15236u.clear();
        this.f15231p.mo16910j();
    }

    /* renamed from: q */
    public C5433e mo16546q() {
        return this.f15230o;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        this.f15223E = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C5643d.m21027c("Use addColorFilter instead.");
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            mo16501L();
        }
    }

    public void stop() {
        mo16545p();
    }

    /* renamed from: t */
    public int mo16552t() {
        return (int) this.f15231p.mo16912l();
    }

    /* renamed from: u */
    public Bitmap mo16553u(String str) {
        C5522b v = m20282v();
        if (v != null) {
            return v.mo16661a(str);
        }
        C5433e eVar = this.f15230o;
        C5458h hVar = eVar == null ? null : eVar.mo16464j().get(str);
        if (hVar != null) {
            return hVar.mo16560a();
        }
        return null;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: w */
    public String mo16555w() {
        return this.f15239x;
    }

    /* renamed from: x */
    public float mo16556x() {
        return this.f15231p.mo16913n();
    }

    /* renamed from: z */
    public float mo16557z() {
        return this.f15231p.mo16914p();
    }
}
