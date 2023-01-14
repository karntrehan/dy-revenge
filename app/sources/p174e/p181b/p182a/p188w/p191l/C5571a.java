package p174e.p181b.p182a.p188w.p191l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p174e.p181b.p182a.C5422c;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p183a0.C5419c;
import p174e.p181b.p182a.p184u.C5475a;
import p174e.p181b.p182a.p184u.p185b.C5480c;
import p174e.p181b.p182a.p184u.p185b.C5482e;
import p174e.p181b.p182a.p184u.p186c.C5499a;
import p174e.p181b.p182a.p184u.p186c.C5507c;
import p174e.p181b.p182a.p184u.p186c.C5511g;
import p174e.p181b.p182a.p184u.p186c.C5519o;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.C5529f;
import p174e.p181b.p182a.p188w.p190k.C5553g;
import p174e.p181b.p182a.p188w.p190k.C5561l;
import p174e.p181b.p182a.p188w.p191l.C5577d;
import p174e.p181b.p182a.p195z.C5643d;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.w.l.a */
public abstract class C5571a implements C5482e, C5499a.C5501b, C5529f {

    /* renamed from: a */
    private final Path f15764a = new Path();

    /* renamed from: b */
    private final Matrix f15765b = new Matrix();

    /* renamed from: c */
    private final Paint f15766c = new C5475a(1);

    /* renamed from: d */
    private final Paint f15767d = new C5475a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e */
    private final Paint f15768e = new C5475a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f */
    private final Paint f15769f;

    /* renamed from: g */
    private final Paint f15770g;

    /* renamed from: h */
    private final RectF f15771h;

    /* renamed from: i */
    private final RectF f15772i;

    /* renamed from: j */
    private final RectF f15773j;

    /* renamed from: k */
    private final RectF f15774k;

    /* renamed from: l */
    private final String f15775l;

    /* renamed from: m */
    final Matrix f15776m;

    /* renamed from: n */
    final C5442g f15777n;

    /* renamed from: o */
    final C5577d f15778o;

    /* renamed from: p */
    private C5511g f15779p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C5507c f15780q;

    /* renamed from: r */
    private C5571a f15781r;

    /* renamed from: s */
    private C5571a f15782s;

    /* renamed from: t */
    private List<C5571a> f15783t;

    /* renamed from: u */
    private final List<C5499a<?, ?>> f15784u;

    /* renamed from: v */
    final C5519o f15785v;

    /* renamed from: w */
    private boolean f15786w;

    /* renamed from: x */
    private boolean f15787x;

    /* renamed from: y */
    private Paint f15788y;

    /* renamed from: e.b.a.w.l.a$a */
    class C5572a implements C5499a.C5501b {
        C5572a() {
        }

        /* renamed from: b */
        public void mo16587b() {
            C5571a aVar = C5571a.this;
            aVar.m20764J(aVar.f15780q.mo16628p() == 1.0f);
        }
    }

    /* renamed from: e.b.a.w.l.a$b */
    static /* synthetic */ class C5573b {

        /* renamed from: a */
        static final /* synthetic */ int[] f15790a;

        /* renamed from: b */
        static final /* synthetic */ int[] f15791b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                e.b.a.w.k.g$a[] r0 = p174e.p181b.p182a.p188w.p190k.C5553g.C5554a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15791b = r0
                r1 = 1
                e.b.a.w.k.g$a r2 = p174e.p181b.p182a.p188w.p190k.C5553g.C5554a.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f15791b     // Catch:{ NoSuchFieldError -> 0x001d }
                e.b.a.w.k.g$a r3 = p174e.p181b.p182a.p188w.p190k.C5553g.C5554a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f15791b     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.b.a.w.k.g$a r4 = p174e.p181b.p182a.p188w.p190k.C5553g.C5554a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f15791b     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.b.a.w.k.g$a r5 = p174e.p181b.p182a.p188w.p190k.C5553g.C5554a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                e.b.a.w.l.d$a[] r4 = p174e.p181b.p182a.p188w.p191l.C5577d.C5578a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f15790a = r4
                e.b.a.w.l.d$a r5 = p174e.p181b.p182a.p188w.p191l.C5577d.C5578a.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f15790a     // Catch:{ NoSuchFieldError -> 0x004e }
                e.b.a.w.l.d$a r4 = p174e.p181b.p182a.p188w.p191l.C5577d.C5578a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f15790a     // Catch:{ NoSuchFieldError -> 0x0058 }
                e.b.a.w.l.d$a r1 = p174e.p181b.p182a.p188w.p191l.C5577d.C5578a.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f15790a     // Catch:{ NoSuchFieldError -> 0x0062 }
                e.b.a.w.l.d$a r1 = p174e.p181b.p182a.p188w.p191l.C5577d.C5578a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f15790a     // Catch:{ NoSuchFieldError -> 0x006d }
                e.b.a.w.l.d$a r1 = p174e.p181b.p182a.p188w.p191l.C5577d.C5578a.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f15790a     // Catch:{ NoSuchFieldError -> 0x0078 }
                e.b.a.w.l.d$a r1 = p174e.p181b.p182a.p188w.p191l.C5577d.C5578a.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f15790a     // Catch:{ NoSuchFieldError -> 0x0083 }
                e.b.a.w.l.d$a r1 = p174e.p181b.p182a.p188w.p191l.C5577d.C5578a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p188w.p191l.C5571a.C5573b.<clinit>():void");
        }
    }

    C5571a(C5442g gVar, C5577d dVar) {
        C5475a aVar = new C5475a(1);
        this.f15769f = aVar;
        this.f15770g = new C5475a(PorterDuff.Mode.CLEAR);
        this.f15771h = new RectF();
        this.f15772i = new RectF();
        this.f15773j = new RectF();
        this.f15774k = new RectF();
        this.f15776m = new Matrix();
        this.f15784u = new ArrayList();
        this.f15786w = true;
        this.f15777n = gVar;
        this.f15778o = dVar;
        this.f15775l = dVar.mo16823g() + "#draw";
        aVar.setXfermode(dVar.mo16822f() == C5577d.C5579b.INVERT ? new PorterDuffXfermode(PorterDuff.Mode.DST_OUT) : new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        C5519o b = dVar.mo16838u().mo16699b();
        this.f15785v = b;
        b.mo16651b(this);
        if (dVar.mo16821e() != null && !dVar.mo16821e().isEmpty()) {
            C5511g gVar2 = new C5511g(dVar.mo16821e());
            this.f15779p = gVar2;
            for (C5499a<C5561l, Path> a : gVar2.mo16635a()) {
                a.mo16606a(this);
            }
            for (C5499a next : this.f15779p.mo16637c()) {
                mo16812j(next);
                next.mo16606a(this);
            }
        }
        m20765K();
    }

    /* renamed from: A */
    private void m20761A(RectF rectF, Matrix matrix) {
        if (mo16816y() && this.f15778o.mo16822f() != C5577d.C5579b.INVERT) {
            this.f15773j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f15781r.mo16590e(this.f15773j, matrix, true);
            if (!rectF.intersect(this.f15773j)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: B */
    private void m20762B() {
        this.f15777n.invalidateSelf();
    }

    /* renamed from: C */
    private void m20763C(float f) {
        this.f15777n.mo16546q().mo16468n().mo16581a(this.f15778o.mo16823g(), f);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m20764J(boolean z) {
        if (z != this.f15786w) {
            this.f15786w = z;
            m20762B();
        }
    }

    /* renamed from: K */
    private void m20765K() {
        boolean z = true;
        if (!this.f15778o.mo16819c().isEmpty()) {
            C5507c cVar = new C5507c(this.f15778o.mo16819c());
            this.f15780q = cVar;
            cVar.mo16616l();
            this.f15780q.mo16606a(new C5572a());
            if (((Float) this.f15780q.mo16612h()).floatValue() != 1.0f) {
                z = false;
            }
            m20764J(z);
            mo16812j(this.f15780q);
            return;
        }
        m20764J(true);
    }

    /* renamed from: k */
    private void m20768k(Canvas canvas, Matrix matrix, C5553g gVar, C5499a<C5561l, Path> aVar, C5499a<Integer, Integer> aVar2) {
        this.f15764a.set(aVar.mo16612h());
        this.f15764a.transform(matrix);
        this.f15766c.setAlpha((int) (((float) aVar2.mo16612h().intValue()) * 2.55f));
        canvas.drawPath(this.f15764a, this.f15766c);
    }

    /* renamed from: l */
    private void m20769l(Canvas canvas, Matrix matrix, C5553g gVar, C5499a<C5561l, Path> aVar, C5499a<Integer, Integer> aVar2) {
        C5647h.m21078m(canvas, this.f15771h, this.f15767d);
        this.f15764a.set(aVar.mo16612h());
        this.f15764a.transform(matrix);
        this.f15766c.setAlpha((int) (((float) aVar2.mo16612h().intValue()) * 2.55f));
        canvas.drawPath(this.f15764a, this.f15766c);
        canvas.restore();
    }

    /* renamed from: m */
    private void m20770m(Canvas canvas, Matrix matrix, C5553g gVar, C5499a<C5561l, Path> aVar, C5499a<Integer, Integer> aVar2) {
        C5647h.m21078m(canvas, this.f15771h, this.f15766c);
        canvas.drawRect(this.f15771h, this.f15766c);
        this.f15764a.set(aVar.mo16612h());
        this.f15764a.transform(matrix);
        this.f15766c.setAlpha((int) (((float) aVar2.mo16612h().intValue()) * 2.55f));
        canvas.drawPath(this.f15764a, this.f15768e);
        canvas.restore();
    }

    /* renamed from: n */
    private void m20771n(Canvas canvas, Matrix matrix, C5553g gVar, C5499a<C5561l, Path> aVar, C5499a<Integer, Integer> aVar2) {
        C5647h.m21078m(canvas, this.f15771h, this.f15767d);
        canvas.drawRect(this.f15771h, this.f15766c);
        this.f15768e.setAlpha((int) (((float) aVar2.mo16612h().intValue()) * 2.55f));
        this.f15764a.set(aVar.mo16612h());
        this.f15764a.transform(matrix);
        canvas.drawPath(this.f15764a, this.f15768e);
        canvas.restore();
    }

    /* renamed from: o */
    private void m20772o(Canvas canvas, Matrix matrix, C5553g gVar, C5499a<C5561l, Path> aVar, C5499a<Integer, Integer> aVar2) {
        C5647h.m21078m(canvas, this.f15771h, this.f15768e);
        canvas.drawRect(this.f15771h, this.f15766c);
        this.f15768e.setAlpha((int) (((float) aVar2.mo16612h().intValue()) * 2.55f));
        this.f15764a.set(aVar.mo16612h());
        this.f15764a.transform(matrix);
        canvas.drawPath(this.f15764a, this.f15768e);
        canvas.restore();
    }

    /* renamed from: p */
    private void m20773p(Canvas canvas, Matrix matrix) {
        C5422c.m20179a("Layer#saveLayer");
        C5647h.m21079n(canvas, this.f15771h, this.f15767d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m20777t(canvas);
        }
        C5422c.m20180b("Layer#saveLayer");
        for (int i = 0; i < this.f15779p.mo16636b().size(); i++) {
            C5553g gVar = this.f15779p.mo16636b().get(i);
            C5499a aVar = this.f15779p.mo16635a().get(i);
            C5499a aVar2 = this.f15779p.mo16637c().get(i);
            int i2 = C5573b.f15791b[gVar.mo16739a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f15766c.setColor(-16777216);
                        this.f15766c.setAlpha(255);
                        canvas.drawRect(this.f15771h, this.f15766c);
                    }
                    Canvas canvas2 = canvas;
                    Matrix matrix2 = matrix;
                    if (gVar.mo16742d()) {
                        m20772o(canvas2, matrix2, gVar, aVar, aVar2);
                    } else {
                        m20774q(canvas2, matrix2, gVar, aVar, aVar2);
                    }
                } else if (i2 == 3) {
                    Canvas canvas3 = canvas;
                    Matrix matrix3 = matrix;
                    if (gVar.mo16742d()) {
                        m20771n(canvas3, matrix3, gVar, aVar, aVar2);
                    } else {
                        m20769l(canvas3, matrix3, gVar, aVar, aVar2);
                    }
                } else if (i2 == 4) {
                    Canvas canvas4 = canvas;
                    Matrix matrix4 = matrix;
                    if (gVar.mo16742d()) {
                        m20770m(canvas4, matrix4, gVar, aVar, aVar2);
                    } else {
                        m20768k(canvas4, matrix4, gVar, aVar, aVar2);
                    }
                }
            } else if (m20775r()) {
                this.f15766c.setAlpha(255);
                canvas.drawRect(this.f15771h, this.f15766c);
            }
        }
        C5422c.m20179a("Layer#restoreLayer");
        canvas.restore();
        C5422c.m20180b("Layer#restoreLayer");
    }

    /* renamed from: q */
    private void m20774q(Canvas canvas, Matrix matrix, C5553g gVar, C5499a<C5561l, Path> aVar, C5499a<Integer, Integer> aVar2) {
        this.f15764a.set(aVar.mo16612h());
        this.f15764a.transform(matrix);
        canvas.drawPath(this.f15764a, this.f15768e);
    }

    /* renamed from: r */
    private boolean m20775r() {
        if (this.f15779p.mo16635a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f15779p.mo16636b().size(); i++) {
            if (this.f15779p.mo16636b().get(i).mo16739a() != C5553g.C5554a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m20776s() {
        if (this.f15783t == null) {
            if (this.f15782s == null) {
                this.f15783t = Collections.emptyList();
                return;
            }
            this.f15783t = new ArrayList();
            for (C5571a aVar = this.f15782s; aVar != null; aVar = aVar.f15782s) {
                this.f15783t.add(aVar);
            }
        }
    }

    /* renamed from: t */
    private void m20777t(Canvas canvas) {
        C5422c.m20179a("Layer#clearLayer");
        RectF rectF = this.f15771h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f15770g);
        C5422c.m20180b("Layer#clearLayer");
    }

    /* renamed from: v */
    static C5571a m20778v(C5577d dVar, C5442g gVar, C5433e eVar) {
        switch (C5573b.f15790a[dVar.mo16820d().ordinal()]) {
            case 1:
                return new C5581f(gVar, dVar);
            case 2:
                return new C5574b(gVar, dVar, eVar.mo16469o(dVar.mo16827k()), eVar);
            case 3:
                return new C5582g(gVar, dVar);
            case 4:
                return new C5576c(gVar, dVar);
            case 5:
                return new C5580e(gVar, dVar);
            case 6:
                return new C5583h(gVar, dVar);
            default:
                C5643d.m21027c("Unknown layer type " + dVar.mo16820d());
                return null;
        }
    }

    /* renamed from: z */
    private void m20779z(RectF rectF, Matrix matrix) {
        this.f15772i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (mo16815x()) {
            int size = this.f15779p.mo16636b().size();
            int i = 0;
            while (i < size) {
                C5553g gVar = this.f15779p.mo16636b().get(i);
                this.f15764a.set((Path) this.f15779p.mo16635a().get(i).mo16612h());
                this.f15764a.transform(matrix);
                int i2 = C5573b.f15791b[gVar.mo16739a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if ((i2 != 3 && i2 != 4) || !gVar.mo16742d()) {
                        this.f15764a.computeBounds(this.f15774k, false);
                        RectF rectF2 = this.f15772i;
                        if (i == 0) {
                            rectF2.set(this.f15774k);
                        } else {
                            rectF2.set(Math.min(rectF2.left, this.f15774k.left), Math.min(this.f15772i.top, this.f15774k.top), Math.max(this.f15772i.right, this.f15774k.right), Math.max(this.f15772i.bottom, this.f15774k.bottom));
                        }
                        i++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.f15772i)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: D */
    public void mo16806D(C5499a<?, ?> aVar) {
        this.f15784u.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo16807E(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo16808F(C5571a aVar) {
        this.f15781r = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo16809G(boolean z) {
        if (z && this.f15788y == null) {
            this.f15788y = new C5475a();
        }
        this.f15787x = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo16810H(C5571a aVar) {
        this.f15782s = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo16811I(float f) {
        this.f15785v.mo16658j(f);
        if (this.f15779p != null) {
            for (int i = 0; i < this.f15779p.mo16635a().size(); i++) {
                this.f15779p.mo16635a().get(i).mo16617m(f);
            }
        }
        C5507c cVar = this.f15780q;
        if (cVar != null) {
            cVar.mo16617m(f);
        }
        C5571a aVar = this.f15781r;
        if (aVar != null) {
            aVar.mo16811I(f);
        }
        for (int i2 = 0; i2 < this.f15784u.size(); i2++) {
            this.f15784u.get(i2).mo16617m(f);
        }
    }

    /* renamed from: b */
    public void mo16587b() {
        m20762B();
    }

    /* renamed from: c */
    public void mo16588c(List<C5480c> list, List<C5480c> list2) {
    }

    /* renamed from: d */
    public void mo16589d(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
        C5571a aVar = this.f15781r;
        if (aVar != null) {
            C5528e a = eVar2.mo16678a(aVar.getName());
            if (eVar.mo16679c(this.f15781r.getName(), i)) {
                list.add(a.mo16684i(this.f15781r));
            }
            if (eVar.mo16683h(getName(), i)) {
                this.f15781r.mo16807E(eVar, eVar.mo16681e(this.f15781r.getName(), i) + i, list, a);
            }
        }
        if (eVar.mo16682g(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo16678a(getName());
                if (eVar.mo16679c(getName(), i)) {
                    list.add(eVar2.mo16684i(this));
                }
            }
            if (eVar.mo16683h(getName(), i)) {
                mo16807E(eVar, i + eVar.mo16681e(getName(), i), list, eVar2);
            }
        }
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        this.f15771h.set(0.0f, 0.0f, 0.0f, 0.0f);
        m20776s();
        this.f15776m.set(matrix);
        if (z) {
            List<C5571a> list = this.f15783t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f15776m.preConcat(this.f15783t.get(size).f15785v.mo16654f());
                }
            } else {
                C5571a aVar = this.f15782s;
                if (aVar != null) {
                    this.f15776m.preConcat(aVar.f15785v.mo16654f());
                }
            }
        }
        this.f15776m.preConcat(this.f15785v.mo16654f());
    }

    /* renamed from: g */
    public void mo16591g(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        C5422c.m20179a(this.f15775l);
        if (!this.f15786w || this.f15778o.mo16839v()) {
            C5422c.m20180b(this.f15775l);
            return;
        }
        m20776s();
        C5422c.m20179a("Layer#parentMatrix");
        this.f15765b.reset();
        this.f15765b.set(matrix);
        for (int size = this.f15783t.size() - 1; size >= 0; size--) {
            this.f15765b.preConcat(this.f15783t.get(size).f15785v.mo16654f());
        }
        C5422c.m20180b("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (this.f15785v.mo16656h() == null ? 100 : this.f15785v.mo16656h().mo16612h().intValue()))) / 100.0f) * 255.0f);
        if (mo16816y() || mo16815x()) {
            C5422c.m20179a("Layer#computeBounds");
            mo16590e(this.f15771h, this.f15765b, false);
            m20761A(this.f15771h, matrix);
            this.f15765b.preConcat(this.f15785v.mo16654f());
            m20779z(this.f15771h, this.f15765b);
            if (!this.f15771h.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f15771h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C5422c.m20180b("Layer#computeBounds");
            if (this.f15771h.width() >= 1.0f && this.f15771h.height() >= 1.0f) {
                C5422c.m20179a("Layer#saveLayer");
                this.f15766c.setAlpha(255);
                C5647h.m21078m(canvas, this.f15771h, this.f15766c);
                C5422c.m20180b("Layer#saveLayer");
                m20777t(canvas);
                C5422c.m20179a("Layer#drawLayer");
                mo16813u(canvas, this.f15765b, intValue);
                C5422c.m20180b("Layer#drawLayer");
                if (mo16815x()) {
                    m20773p(canvas, this.f15765b);
                }
                if (mo16816y()) {
                    C5422c.m20179a("Layer#drawMatte");
                    C5422c.m20179a("Layer#saveLayer");
                    C5647h.m21079n(canvas, this.f15771h, this.f15769f, 19);
                    C5422c.m20180b("Layer#saveLayer");
                    m20777t(canvas);
                    this.f15781r.mo16591g(canvas, matrix, intValue);
                    C5422c.m20179a("Layer#restoreLayer");
                    canvas.restore();
                    C5422c.m20180b("Layer#restoreLayer");
                    C5422c.m20180b("Layer#drawMatte");
                }
                C5422c.m20179a("Layer#restoreLayer");
                canvas.restore();
                C5422c.m20180b("Layer#restoreLayer");
            }
            if (this.f15787x && (paint = this.f15788y) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f15788y.setColor(-251901);
                this.f15788y.setStrokeWidth(4.0f);
                canvas.drawRect(this.f15771h, this.f15788y);
                this.f15788y.setStyle(Paint.Style.FILL);
                this.f15788y.setColor(1357638635);
                canvas.drawRect(this.f15771h, this.f15788y);
            }
            m20763C(C5422c.m20180b(this.f15775l));
            return;
        }
        this.f15765b.preConcat(this.f15785v.mo16654f());
        C5422c.m20179a("Layer#drawLayer");
        mo16813u(canvas, this.f15765b, intValue);
        C5422c.m20180b("Layer#drawLayer");
        m20763C(C5422c.m20180b(this.f15775l));
    }

    public String getName() {
        return this.f15778o.mo16823g();
    }

    /* renamed from: h */
    public <T> void mo16592h(T t, C5419c<T> cVar) {
        this.f15785v.mo16652c(t, cVar);
    }

    /* renamed from: j */
    public void mo16812j(C5499a<?, ?> aVar) {
        if (aVar != null) {
            this.f15784u.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public abstract void mo16813u(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C5577d mo16814w() {
        return this.f15778o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo16815x() {
        C5511g gVar = this.f15779p;
        return gVar != null && !gVar.mo16635a().isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo16816y() {
        return this.f15781r != null;
    }
}
