package p174e.p319f.p320a.p363d.p364a0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C1165b;
import androidx.core.util.C1173d;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p364a0.C9001l;
import p174e.p319f.p320a.p363d.p364a0.C9004m;
import p174e.p319f.p320a.p363d.p372q.C9052a;
import p174e.p319f.p320a.p363d.p375t.C9055a;
import p174e.p319f.p320a.p363d.p381z.C9072a;

/* renamed from: e.f.a.d.a0.g */
public class C8990g extends Drawable implements C1165b, C9012n {

    /* renamed from: f */
    private static final Paint f24412f = new Paint(1);

    /* renamed from: A */
    private final Paint f24413A;

    /* renamed from: B */
    private final Paint f24414B;

    /* renamed from: C */
    private final C9072a f24415C;

    /* renamed from: D */
    private final C9001l.C9002a f24416D;

    /* renamed from: E */
    private final C9001l f24417E;

    /* renamed from: F */
    private PorterDuffColorFilter f24418F;

    /* renamed from: G */
    private PorterDuffColorFilter f24419G;

    /* renamed from: H */
    private Rect f24420H;

    /* renamed from: I */
    private final RectF f24421I;

    /* renamed from: o */
    private C8993c f24422o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C9004m.C9011g[] f24423p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C9004m.C9011g[] f24424q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f24425r;

    /* renamed from: s */
    private final Matrix f24426s;

    /* renamed from: t */
    private final Path f24427t;

    /* renamed from: u */
    private final Path f24428u;

    /* renamed from: v */
    private final RectF f24429v;

    /* renamed from: w */
    private final RectF f24430w;

    /* renamed from: x */
    private final Region f24431x;

    /* renamed from: y */
    private final Region f24432y;

    /* renamed from: z */
    private C8997k f24433z;

    /* renamed from: e.f.a.d.a0.g$a */
    class C8991a implements C9001l.C9002a {
        C8991a() {
        }

        /* renamed from: a */
        public void mo22844a(C9004m mVar, Matrix matrix, int i) {
            C8990g.this.f24423p[i] = mVar.mo22889e(matrix);
        }

        /* renamed from: b */
        public void mo22845b(C9004m mVar, Matrix matrix, int i) {
            C8990g.this.f24424q[i] = mVar.mo22889e(matrix);
        }
    }

    /* renamed from: e.f.a.d.a0.g$b */
    class C8992b implements C8997k.C9000c {

        /* renamed from: a */
        final /* synthetic */ float f24435a;

        C8992b(float f) {
            this.f24435a = f;
        }

        /* renamed from: a */
        public C8986c mo22846a(C8986c cVar) {
            return cVar instanceof C8995i ? cVar : new C8985b(this.f24435a, cVar);
        }
    }

    /* renamed from: e.f.a.d.a0.g$c */
    static final class C8993c extends Drawable.ConstantState {

        /* renamed from: a */
        public C8997k f24437a;

        /* renamed from: b */
        public C9055a f24438b;

        /* renamed from: c */
        public ColorFilter f24439c;

        /* renamed from: d */
        public ColorStateList f24440d = null;

        /* renamed from: e */
        public ColorStateList f24441e = null;

        /* renamed from: f */
        public ColorStateList f24442f = null;

        /* renamed from: g */
        public ColorStateList f24443g = null;

        /* renamed from: h */
        public PorterDuff.Mode f24444h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f24445i = null;

        /* renamed from: j */
        public float f24446j = 1.0f;

        /* renamed from: k */
        public float f24447k = 1.0f;

        /* renamed from: l */
        public float f24448l;

        /* renamed from: m */
        public int f24449m = 255;

        /* renamed from: n */
        public float f24450n = 0.0f;

        /* renamed from: o */
        public float f24451o = 0.0f;

        /* renamed from: p */
        public float f24452p = 0.0f;

        /* renamed from: q */
        public int f24453q = 0;

        /* renamed from: r */
        public int f24454r = 0;

        /* renamed from: s */
        public int f24455s = 0;

        /* renamed from: t */
        public int f24456t = 0;

        /* renamed from: u */
        public boolean f24457u = false;

        /* renamed from: v */
        public Paint.Style f24458v = Paint.Style.FILL_AND_STROKE;

        public C8993c(C8993c cVar) {
            this.f24437a = cVar.f24437a;
            this.f24438b = cVar.f24438b;
            this.f24448l = cVar.f24448l;
            this.f24439c = cVar.f24439c;
            this.f24440d = cVar.f24440d;
            this.f24441e = cVar.f24441e;
            this.f24444h = cVar.f24444h;
            this.f24443g = cVar.f24443g;
            this.f24449m = cVar.f24449m;
            this.f24446j = cVar.f24446j;
            this.f24455s = cVar.f24455s;
            this.f24453q = cVar.f24453q;
            this.f24457u = cVar.f24457u;
            this.f24447k = cVar.f24447k;
            this.f24450n = cVar.f24450n;
            this.f24451o = cVar.f24451o;
            this.f24452p = cVar.f24452p;
            this.f24454r = cVar.f24454r;
            this.f24456t = cVar.f24456t;
            this.f24442f = cVar.f24442f;
            this.f24458v = cVar.f24458v;
            if (cVar.f24445i != null) {
                this.f24445i = new Rect(cVar.f24445i);
            }
        }

        public C8993c(C8997k kVar, C9055a aVar) {
            this.f24437a = kVar;
            this.f24438b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C8990g gVar = new C8990g(this, (C8991a) null);
            boolean unused = gVar.f24425r = true;
            return gVar;
        }
    }

    public C8990g() {
        this(new C8997k());
    }

    public C8990g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C8997k.m29998e(context, attributeSet, i, i2).mo22872m());
    }

    private C8990g(C8993c cVar) {
        this.f24423p = new C9004m.C9011g[4];
        this.f24424q = new C9004m.C9011g[4];
        this.f24426s = new Matrix();
        this.f24427t = new Path();
        this.f24428u = new Path();
        this.f24429v = new RectF();
        this.f24430w = new RectF();
        this.f24431x = new Region();
        this.f24432y = new Region();
        Paint paint = new Paint(1);
        this.f24413A = paint;
        Paint paint2 = new Paint(1);
        this.f24414B = paint2;
        this.f24415C = new C9072a();
        this.f24417E = new C9001l();
        this.f24421I = new RectF();
        this.f24422o = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f24412f;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m29939d0();
        m29937c0(getState());
        this.f24416D = new C8991a();
    }

    /* synthetic */ C8990g(C8993c cVar, C8991a aVar) {
        this(cVar);
    }

    public C8990g(C8997k kVar) {
        this(new C8993c(kVar, (C9055a) null));
    }

    /* renamed from: C */
    private float m29927C() {
        if (m29930K()) {
            return this.f24414B.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: I */
    private boolean m29928I() {
        C8993c cVar = this.f24422o;
        int i = cVar.f24453q;
        return i != 1 && cVar.f24454r > 0 && (i == 2 || m29934R());
    }

    /* renamed from: J */
    private boolean m29929J() {
        Paint.Style style = this.f24422o.f24458v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: K */
    private boolean m29930K() {
        Paint.Style style = this.f24422o.f24458v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f24414B.getStrokeWidth() > 0.0f;
    }

    /* renamed from: M */
    private void m29931M() {
        super.invalidateSelf();
    }

    /* renamed from: P */
    private static int m29932P(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: Q */
    private void m29933Q(Canvas canvas) {
        int y = mo22842y();
        int z = mo22843z();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f24422o.f24454r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(y, z);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) y, (float) z);
    }

    /* renamed from: R */
    private boolean m29934R() {
        return Build.VERSION.SDK_INT < 21 || (!mo22817O() && !this.f24427t.isConvex());
    }

    /* renamed from: c0 */
    private boolean m29937c0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f24422o.f24440d == null || (color2 = this.f24413A.getColor()) == (colorForState2 = this.f24422o.f24440d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f24413A.setColor(colorForState2);
            z = true;
        }
        if (this.f24422o.f24441e == null || (color = this.f24414B.getColor()) == (colorForState = this.f24422o.f24441e.getColorForState(iArr, color))) {
            return z;
        }
        this.f24414B.setColor(colorForState);
        return true;
    }

    /* renamed from: d0 */
    private boolean m29939d0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f24418F;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f24419G;
        C8993c cVar = this.f24422o;
        this.f24418F = m29945j(cVar.f24443g, cVar.f24444h, this.f24413A, true);
        C8993c cVar2 = this.f24422o;
        this.f24419G = m29945j(cVar2.f24442f, cVar2.f24444h, this.f24414B, false);
        C8993c cVar3 = this.f24422o;
        if (cVar3.f24457u) {
            this.f24415C.mo23035d(cVar3.f24443g.getColorForState(getState(), 0));
        }
        return !C1173d.m4572a(porterDuffColorFilter, this.f24418F) || !C1173d.m4572a(porterDuffColorFilter2, this.f24419G);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter m29940e(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.m29946k(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p363d.p364a0.C8990g.m29940e(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* renamed from: e0 */
    private void m29941e0() {
        float H = mo22814H();
        this.f24422o.f24454r = (int) Math.ceil((double) (0.75f * H));
        this.f24422o.f24455s = (int) Math.ceil((double) (H * 0.25f));
        m29939d0();
        m29931M();
    }

    /* renamed from: f */
    private void m29942f(RectF rectF, Path path) {
        mo22828g(rectF, path);
        if (this.f24422o.f24446j != 1.0f) {
            this.f24426s.reset();
            Matrix matrix = this.f24426s;
            float f = this.f24422o.f24446j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f24426s);
        }
        path.computeBounds(this.f24421I, true);
    }

    /* renamed from: h */
    private void m29943h() {
        C8997k x = mo22809B().mo22866x(new C8992b(-m29927C()));
        this.f24433z = x;
        this.f24417E.mo22885d(x, this.f24422o.f24447k, m29952u(), this.f24428u);
    }

    /* renamed from: i */
    private PorterDuffColorFilter m29944i(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m29946k(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m29945j(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? m29940e(paint, z) : m29944i(colorStateList, mode, z);
    }

    /* renamed from: k */
    private int m29946k(int i) {
        float H = mo22814H() + mo22841x();
        C9055a aVar = this.f24422o.f24438b;
        return aVar != null ? aVar.mo23007c(i, H) : i;
    }

    /* renamed from: l */
    public static C8990g m29947l(Context context, float f) {
        int b = C9052a.m30171b(context, C9013b.colorSurface, C8990g.class.getSimpleName());
        C8990g gVar = new C8990g();
        gVar.mo22815L(context);
        gVar.mo22819T(ColorStateList.valueOf(b));
        gVar.mo22818S(f);
        return gVar;
    }

    /* renamed from: m */
    private void m29948m(Canvas canvas) {
        if (this.f24422o.f24455s != 0) {
            canvas.drawPath(this.f24427t, this.f24415C.mo23034c());
        }
        for (int i = 0; i < 4; i++) {
            this.f24423p[i].mo22900b(this.f24415C, this.f24422o.f24454r, canvas);
            this.f24424q[i].mo22900b(this.f24415C, this.f24422o.f24454r, canvas);
        }
        int y = mo22842y();
        int z = mo22843z();
        canvas.translate((float) (-y), (float) (-z));
        canvas.drawPath(this.f24427t, f24412f);
        canvas.translate((float) y, (float) z);
    }

    /* renamed from: n */
    private void m29949n(Canvas canvas) {
        m29950p(canvas, this.f24413A, this.f24427t, this.f24422o.f24437a, mo22838t());
    }

    /* renamed from: p */
    private void m29950p(Canvas canvas, Paint paint, Path path, C8997k kVar, RectF rectF) {
        if (kVar.mo22863u(rectF)) {
            float a = kVar.mo22862t().mo22801a(rectF);
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: q */
    private void m29951q(Canvas canvas) {
        m29950p(canvas, this.f24414B, this.f24428u, this.f24433z, m29952u());
    }

    /* renamed from: u */
    private RectF m29952u() {
        RectF t = mo22838t();
        float C = m29927C();
        this.f24430w.set(t.left + C, t.top + C, t.right - C, t.bottom - C);
        return this.f24430w;
    }

    /* renamed from: A */
    public int mo22808A() {
        return this.f24422o.f24454r;
    }

    /* renamed from: B */
    public C8997k mo22809B() {
        return this.f24422o.f24437a;
    }

    /* renamed from: D */
    public ColorStateList mo22810D() {
        return this.f24422o.f24443g;
    }

    /* renamed from: E */
    public float mo22811E() {
        return this.f24422o.f24437a.mo22860r().mo22801a(mo22838t());
    }

    /* renamed from: F */
    public float mo22812F() {
        return this.f24422o.f24437a.mo22862t().mo22801a(mo22838t());
    }

    /* renamed from: G */
    public float mo22813G() {
        return this.f24422o.f24452p;
    }

    /* renamed from: H */
    public float mo22814H() {
        return mo22839v() + mo22813G();
    }

    /* renamed from: L */
    public void mo22815L(Context context) {
        this.f24422o.f24438b = new C9055a(context);
        m29941e0();
    }

    /* renamed from: N */
    public boolean mo22816N() {
        C9055a aVar = this.f24422o.f24438b;
        return aVar != null && aVar.mo23008d();
    }

    /* renamed from: O */
    public boolean mo22817O() {
        return this.f24422o.f24437a.mo22863u(mo22838t());
    }

    /* renamed from: S */
    public void mo22818S(float f) {
        C8993c cVar = this.f24422o;
        if (cVar.f24451o != f) {
            cVar.f24451o = f;
            m29941e0();
        }
    }

    /* renamed from: T */
    public void mo22819T(ColorStateList colorStateList) {
        C8993c cVar = this.f24422o;
        if (cVar.f24440d != colorStateList) {
            cVar.f24440d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: U */
    public void mo22820U(float f) {
        C8993c cVar = this.f24422o;
        if (cVar.f24447k != f) {
            cVar.f24447k = f;
            this.f24425r = true;
            invalidateSelf();
        }
    }

    /* renamed from: V */
    public void mo22821V(int i, int i2, int i3, int i4) {
        C8993c cVar = this.f24422o;
        if (cVar.f24445i == null) {
            cVar.f24445i = new Rect();
        }
        this.f24422o.f24445i.set(i, i2, i3, i4);
        this.f24420H = this.f24422o.f24445i;
        invalidateSelf();
    }

    /* renamed from: W */
    public void mo22822W(float f) {
        C8993c cVar = this.f24422o;
        if (cVar.f24450n != f) {
            cVar.f24450n = f;
            m29941e0();
        }
    }

    /* renamed from: X */
    public void mo22823X(int i) {
        C8993c cVar = this.f24422o;
        if (cVar.f24456t != i) {
            cVar.f24456t = i;
            m29931M();
        }
    }

    /* renamed from: Y */
    public void mo22824Y(float f, int i) {
        mo22827b0(f);
        mo22826a0(ColorStateList.valueOf(i));
    }

    /* renamed from: Z */
    public void mo22825Z(float f, ColorStateList colorStateList) {
        mo22827b0(f);
        mo22826a0(colorStateList);
    }

    /* renamed from: a0 */
    public void mo22826a0(ColorStateList colorStateList) {
        C8993c cVar = this.f24422o;
        if (cVar.f24441e != colorStateList) {
            cVar.f24441e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: b0 */
    public void mo22827b0(float f) {
        this.f24422o.f24448l = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f24413A.setColorFilter(this.f24418F);
        int alpha = this.f24413A.getAlpha();
        this.f24413A.setAlpha(m29932P(alpha, this.f24422o.f24449m));
        this.f24414B.setColorFilter(this.f24419G);
        this.f24414B.setStrokeWidth(this.f24422o.f24448l);
        int alpha2 = this.f24414B.getAlpha();
        this.f24414B.setAlpha(m29932P(alpha2, this.f24422o.f24449m));
        if (this.f24425r) {
            m29943h();
            m29942f(mo22838t(), this.f24427t);
            this.f24425r = false;
        }
        if (m29928I()) {
            canvas.save();
            m29933Q(canvas);
            int width = (int) (this.f24421I.width() - ((float) getBounds().width()));
            int height = (int) (this.f24421I.height() - ((float) getBounds().height()));
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f24421I.width()) + (this.f24422o.f24454r * 2) + width, ((int) this.f24421I.height()) + (this.f24422o.f24454r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f24422o.f24454r) - width);
            float f2 = (float) ((getBounds().top - this.f24422o.f24454r) - height);
            canvas2.translate(-f, -f2);
            m29948m(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (m29929J()) {
            m29949n(canvas);
        }
        if (m29930K()) {
            m29951q(canvas);
        }
        this.f24413A.setAlpha(alpha);
        this.f24414B.setAlpha(alpha2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo22828g(RectF rectF, Path path) {
        C9001l lVar = this.f24417E;
        C8993c cVar = this.f24422o;
        C8997k kVar = cVar.f24437a;
        float f = cVar.f24447k;
        lVar.mo22886e(kVar, f, rectF, this.f24416D, path);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f24422o;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f24422o.f24453q != 2) {
            if (mo22817O()) {
                outline.setRoundRect(getBounds(), mo22811E());
                return;
            }
            m29942f(mo22838t(), this.f24427t);
            if (this.f24427t.isConvex()) {
                outline.setConvexPath(this.f24427t);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f24420H;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f24431x.set(getBounds());
        m29942f(mo22838t(), this.f24427t);
        this.f24432y.setPath(this.f24427t, this.f24431x);
        this.f24431x.op(this.f24432y, Region.Op.DIFFERENCE);
        return this.f24431x;
    }

    public void invalidateSelf() {
        this.f24425r = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f24422o.f24441e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f24422o.f24440d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f24422o.f24443g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f24422o.f24442f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            e.f.a.d.a0.g$c r0 = r1.f24422o
            android.content.res.ColorStateList r0 = r0.f24443g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            e.f.a.d.a0.g$c r0 = r1.f24422o
            android.content.res.ColorStateList r0 = r0.f24442f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            e.f.a.d.a0.g$c r0 = r1.f24422o
            android.content.res.ColorStateList r0 = r0.f24441e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            e.f.a.d.a0.g$c r0 = r1.f24422o
            android.content.res.ColorStateList r0 = r0.f24440d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p363d.p364a0.C8990g.isStateful():boolean");
    }

    public Drawable mutate() {
        this.f24422o = new C8993c(this.f24422o);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo22834o(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m29950p(canvas, paint, path, this.f24422o.f24437a, rectF);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f24425r = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = m29937c0(iArr) || m29939d0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: r */
    public float mo22836r() {
        return this.f24422o.f24437a.mo22853j().mo22801a(mo22838t());
    }

    /* renamed from: s */
    public float mo22837s() {
        return this.f24422o.f24437a.mo22855l().mo22801a(mo22838t());
    }

    public void setAlpha(int i) {
        C8993c cVar = this.f24422o;
        if (cVar.f24449m != i) {
            cVar.f24449m = i;
            m29931M();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24422o.f24439c = colorFilter;
        m29931M();
    }

    public void setShapeAppearanceModel(C8997k kVar) {
        this.f24422o.f24437a = kVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f24422o.f24443g = colorStateList;
        m29939d0();
        m29931M();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C8993c cVar = this.f24422o;
        if (cVar.f24444h != mode) {
            cVar.f24444h = mode;
            m29939d0();
            m29931M();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public RectF mo22838t() {
        Rect bounds = getBounds();
        this.f24429v.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        return this.f24429v;
    }

    /* renamed from: v */
    public float mo22839v() {
        return this.f24422o.f24451o;
    }

    /* renamed from: w */
    public ColorStateList mo22840w() {
        return this.f24422o.f24440d;
    }

    /* renamed from: x */
    public float mo22841x() {
        return this.f24422o.f24450n;
    }

    /* renamed from: y */
    public int mo22842y() {
        C8993c cVar = this.f24422o;
        return (int) (((double) cVar.f24455s) * Math.sin(Math.toRadians((double) cVar.f24456t)));
    }

    /* renamed from: z */
    public int mo22843z() {
        C8993c cVar = this.f24422o;
        return (int) (((double) cVar.f24455s) * Math.cos(Math.toRadians((double) cVar.f24456t)));
    }
}
