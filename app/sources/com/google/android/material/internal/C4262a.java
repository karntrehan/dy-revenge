package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import p027c.p064i.p068f.C1847a;
import p027c.p064i.p071i.C1896e;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.p366l.C9025a;
import p174e.p319f.p320a.p363d.p379x.C9059a;
import p174e.p319f.p320a.p363d.p379x.C9063d;

/* renamed from: com.google.android.material.internal.a */
public final class C4262a {

    /* renamed from: a */
    private static final boolean f12042a = (Build.VERSION.SDK_INT < 18);

    /* renamed from: b */
    private static final Paint f12043b;

    /* renamed from: A */
    private CharSequence f12044A;

    /* renamed from: B */
    private boolean f12045B;

    /* renamed from: C */
    private boolean f12046C;

    /* renamed from: D */
    private Bitmap f12047D;

    /* renamed from: E */
    private Paint f12048E;

    /* renamed from: F */
    private float f12049F;

    /* renamed from: G */
    private float f12050G;

    /* renamed from: H */
    private float f12051H;

    /* renamed from: I */
    private float f12052I;

    /* renamed from: J */
    private int[] f12053J;

    /* renamed from: K */
    private boolean f12054K;

    /* renamed from: L */
    private final TextPaint f12055L;

    /* renamed from: M */
    private final TextPaint f12056M;

    /* renamed from: N */
    private TimeInterpolator f12057N;

    /* renamed from: O */
    private TimeInterpolator f12058O;

    /* renamed from: P */
    private float f12059P;

    /* renamed from: Q */
    private float f12060Q;

    /* renamed from: R */
    private float f12061R;

    /* renamed from: S */
    private ColorStateList f12062S;

    /* renamed from: T */
    private float f12063T;

    /* renamed from: U */
    private float f12064U;

    /* renamed from: V */
    private float f12065V;

    /* renamed from: W */
    private ColorStateList f12066W;

    /* renamed from: c */
    private final View f12067c;

    /* renamed from: d */
    private boolean f12068d;

    /* renamed from: e */
    private float f12069e;

    /* renamed from: f */
    private final Rect f12070f;

    /* renamed from: g */
    private final Rect f12071g;

    /* renamed from: h */
    private final RectF f12072h;

    /* renamed from: i */
    private int f12073i = 16;

    /* renamed from: j */
    private int f12074j = 16;

    /* renamed from: k */
    private float f12075k = 15.0f;

    /* renamed from: l */
    private float f12076l = 15.0f;

    /* renamed from: m */
    private ColorStateList f12077m;

    /* renamed from: n */
    private ColorStateList f12078n;

    /* renamed from: o */
    private float f12079o;

    /* renamed from: p */
    private float f12080p;

    /* renamed from: q */
    private float f12081q;

    /* renamed from: r */
    private float f12082r;

    /* renamed from: s */
    private float f12083s;

    /* renamed from: t */
    private float f12084t;

    /* renamed from: u */
    private Typeface f12085u;

    /* renamed from: v */
    private Typeface f12086v;

    /* renamed from: w */
    private Typeface f12087w;

    /* renamed from: x */
    private C9059a f12088x;

    /* renamed from: y */
    private C9059a f12089y;

    /* renamed from: z */
    private CharSequence f12090z;

    /* renamed from: com.google.android.material.internal.a$a */
    class C4263a implements C9059a.C9060a {
        C4263a() {
        }

        /* renamed from: a */
        public void mo13484a(Typeface typeface) {
            C4262a.this.mo13461G(typeface);
        }
    }

    static {
        Paint paint = null;
        f12043b = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public C4262a(View view) {
        this.f12067c = view;
        TextPaint textPaint = new TextPaint(129);
        this.f12055L = textPaint;
        this.f12056M = new TextPaint(textPaint);
        this.f12071g = new Rect();
        this.f12070f = new Rect();
        this.f12072h = new RectF();
    }

    /* renamed from: A */
    private static boolean m16347A(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: H */
    private boolean m16348H(Typeface typeface) {
        C9059a aVar = this.f12089y;
        if (aVar != null) {
            aVar.mo23011c();
        }
        if (this.f12085u == typeface) {
            return false;
        }
        this.f12085u = typeface;
        return true;
    }

    /* renamed from: N */
    private boolean m16349N(Typeface typeface) {
        C9059a aVar = this.f12088x;
        if (aVar != null) {
            aVar.mo23011c();
        }
        if (this.f12086v == typeface) {
            return false;
        }
        this.f12086v = typeface;
        return true;
    }

    /* renamed from: P */
    private void m16350P(float f) {
        m16356g(f);
        boolean z = f12042a && this.f12051H != 1.0f;
        this.f12046C = z;
        if (z) {
            m16358j();
        }
        C1988t.m8376d0(this.f12067c);
    }

    /* renamed from: a */
    private static int m16351a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16352b() {
        /*
            r11 = this;
            float r0 = r11.f12052I
            float r1 = r11.f12076l
            r11.m16356g(r1)
            java.lang.CharSequence r1 = r11.f12044A
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0018
            android.text.TextPaint r4 = r11.f12055L
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            int r4 = r11.f12074j
            boolean r5 = r11.f12045B
            int r4 = p027c.p064i.p072j.C1915d.m8012b(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x0053
            if (r5 == r6) goto L_0x004d
            android.text.TextPaint r5 = r11.f12055L
            float r5 = r5.descent()
            android.text.TextPaint r9 = r11.f12055L
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.text.TextPaint r9 = r11.f12055L
            float r9 = r9.descent()
            float r5 = r5 - r9
            android.graphics.Rect r9 = r11.f12071g
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 + r5
            r11.f12080p = r9
            goto L_0x0061
        L_0x004d:
            android.graphics.Rect r5 = r11.f12071g
            int r5 = r5.bottom
            float r5 = (float) r5
            goto L_0x005f
        L_0x0053:
            android.graphics.Rect r5 = r11.f12071g
            int r5 = r5.top
            float r5 = (float) r5
            android.text.TextPaint r9 = r11.f12055L
            float r9 = r9.ascent()
            float r5 = r5 - r9
        L_0x005f:
            r11.f12080p = r5
        L_0x0061:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0079
            if (r4 == r9) goto L_0x0073
            android.graphics.Rect r1 = r11.f12071g
            int r1 = r1.left
            float r1 = (float) r1
            r11.f12082r = r1
            goto L_0x0084
        L_0x0073:
            android.graphics.Rect r4 = r11.f12071g
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0081
        L_0x0079:
            android.graphics.Rect r4 = r11.f12071g
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0081:
            float r4 = r4 - r1
            r11.f12082r = r4
        L_0x0084:
            float r1 = r11.f12075k
            r11.m16356g(r1)
            java.lang.CharSequence r1 = r11.f12044A
            if (r1 == 0) goto L_0x0097
            android.text.TextPaint r3 = r11.f12055L
            int r4 = r1.length()
            float r3 = r3.measureText(r1, r2, r4)
        L_0x0097:
            int r1 = r11.f12073i
            boolean r2 = r11.f12045B
            int r1 = p027c.p064i.p072j.C1915d.m8012b(r1, r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 == r7) goto L_0x00cb
            if (r2 == r6) goto L_0x00c5
            android.text.TextPaint r2 = r11.f12055L
            float r2 = r2.descent()
            android.text.TextPaint r4 = r11.f12055L
            float r4 = r4.ascent()
            float r2 = r2 - r4
            float r2 = r2 / r8
            android.text.TextPaint r4 = r11.f12055L
            float r4 = r4.descent()
            float r2 = r2 - r4
            android.graphics.Rect r4 = r11.f12070f
            int r4 = r4.centerY()
            float r4 = (float) r4
            float r4 = r4 + r2
            r11.f12079o = r4
            goto L_0x00d9
        L_0x00c5:
            android.graphics.Rect r2 = r11.f12070f
            int r2 = r2.bottom
            float r2 = (float) r2
            goto L_0x00d7
        L_0x00cb:
            android.graphics.Rect r2 = r11.f12070f
            int r2 = r2.top
            float r2 = (float) r2
            android.text.TextPaint r4 = r11.f12055L
            float r4 = r4.ascent()
            float r2 = r2 - r4
        L_0x00d7:
            r11.f12079o = r2
        L_0x00d9:
            r1 = r1 & r5
            if (r1 == r10) goto L_0x00ea
            if (r1 == r9) goto L_0x00e4
            android.graphics.Rect r1 = r11.f12070f
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x00f3
        L_0x00e4:
            android.graphics.Rect r1 = r11.f12070f
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x00f2
        L_0x00ea:
            android.graphics.Rect r1 = r11.f12070f
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r3 = r3 / r8
        L_0x00f2:
            float r1 = r1 - r3
        L_0x00f3:
            r11.f12081q = r1
            r11.m16357h()
            r11.m16350P(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C4262a.m16352b():void");
    }

    /* renamed from: d */
    private void m16353d() {
        m16355f(this.f12069e);
    }

    /* renamed from: e */
    private boolean m16354e(CharSequence charSequence) {
        boolean z = true;
        if (C1988t.m8417y(this.f12067c) != 1) {
            z = false;
        }
        return (z ? C1896e.f5587d : C1896e.f5586c).mo6435a(charSequence, 0, charSequence.length());
    }

    /* renamed from: f */
    private void m16355f(float f) {
        int i;
        TextPaint textPaint;
        m16363u(f);
        this.f12083s = m16365x(this.f12081q, this.f12082r, f, this.f12057N);
        this.f12084t = m16365x(this.f12079o, this.f12080p, f, this.f12057N);
        m16350P(m16365x(this.f12075k, this.f12076l, f, this.f12058O));
        if (this.f12078n != this.f12077m) {
            textPaint = this.f12055L;
            i = m16351a(m16360p(), mo13478n(), f);
        } else {
            textPaint = this.f12055L;
            i = mo13478n();
        }
        textPaint.setColor(i);
        this.f12055L.setShadowLayer(m16365x(this.f12063T, this.f12059P, f, (TimeInterpolator) null), m16365x(this.f12064U, this.f12060Q, f, (TimeInterpolator) null), m16365x(this.f12065V, this.f12061R, f, (TimeInterpolator) null), m16351a(m16359o(this.f12066W), m16359o(this.f12062S), f));
        C1988t.m8376d0(this.f12067c);
    }

    /* renamed from: g */
    private void m16356g(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.f12090z != null) {
            float width = (float) this.f12071g.width();
            float width2 = (float) this.f12070f.width();
            boolean z3 = true;
            if (m16364v(f, this.f12076l)) {
                f2 = this.f12076l;
                this.f12051H = 1.0f;
                Typeface typeface = this.f12087w;
                Typeface typeface2 = this.f12085u;
                if (typeface != typeface2) {
                    this.f12087w = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f12075k;
                Typeface typeface3 = this.f12087w;
                Typeface typeface4 = this.f12086v;
                if (typeface3 != typeface4) {
                    this.f12087w = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m16364v(f, f3)) {
                    this.f12051H = 1.0f;
                } else {
                    this.f12051H = f / this.f12075k;
                }
                float f4 = this.f12076l / this.f12075k;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                z = this.f12052I != f2 || this.f12054K || z;
                this.f12052I = f2;
                this.f12054K = false;
            }
            if (this.f12044A == null || z) {
                this.f12055L.setTextSize(this.f12052I);
                this.f12055L.setTypeface(this.f12087w);
                TextPaint textPaint = this.f12055L;
                if (this.f12051H == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.f12090z, this.f12055L, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f12044A)) {
                    this.f12044A = ellipsize;
                    this.f12045B = m16354e(ellipsize);
                }
            }
        }
    }

    /* renamed from: h */
    private void m16357h() {
        Bitmap bitmap = this.f12047D;
        if (bitmap != null) {
            bitmap.recycle();
            this.f12047D = null;
        }
    }

    /* renamed from: j */
    private void m16358j() {
        if (this.f12047D == null && !this.f12070f.isEmpty() && !TextUtils.isEmpty(this.f12044A)) {
            m16355f(0.0f);
            this.f12049F = this.f12055L.ascent();
            this.f12050G = this.f12055L.descent();
            TextPaint textPaint = this.f12055L;
            CharSequence charSequence = this.f12044A;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f12050G - this.f12049F);
            if (round > 0 && round2 > 0) {
                this.f12047D = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f12047D);
                CharSequence charSequence2 = this.f12044A;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f12055L.descent(), this.f12055L);
                if (this.f12048E == null) {
                    this.f12048E = new Paint(3);
                }
            }
        }
    }

    /* renamed from: o */
    private int m16359o(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f12053J;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: p */
    private int m16360p() {
        return m16359o(this.f12077m);
    }

    /* renamed from: s */
    private void m16361s(TextPaint textPaint) {
        textPaint.setTextSize(this.f12076l);
        textPaint.setTypeface(this.f12085u);
    }

    /* renamed from: t */
    private void m16362t(TextPaint textPaint) {
        textPaint.setTextSize(this.f12075k);
        textPaint.setTypeface(this.f12086v);
    }

    /* renamed from: u */
    private void m16363u(float f) {
        this.f12072h.left = m16365x((float) this.f12070f.left, (float) this.f12071g.left, f, this.f12057N);
        this.f12072h.top = m16365x(this.f12079o, this.f12080p, f, this.f12057N);
        this.f12072h.right = m16365x((float) this.f12070f.right, (float) this.f12071g.right, f, this.f12057N);
        this.f12072h.bottom = m16365x((float) this.f12070f.bottom, (float) this.f12071g.bottom, f, this.f12057N);
    }

    /* renamed from: v */
    private static boolean m16364v(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: x */
    private static float m16365x(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C9025a.m30120a(f, f2, f3);
    }

    /* renamed from: B */
    public void mo13456B(int i, int i2, int i3, int i4) {
        if (!m16347A(this.f12071g, i, i2, i3, i4)) {
            this.f12071g.set(i, i2, i3, i4);
            this.f12054K = true;
            mo13482y();
        }
    }

    /* renamed from: C */
    public void mo13457C(Rect rect) {
        mo13456B(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: D */
    public void mo13458D(int i) {
        C9063d dVar = new C9063d(this.f12067c.getContext(), i);
        ColorStateList colorStateList = dVar.f24882b;
        if (colorStateList != null) {
            this.f12078n = colorStateList;
        }
        float f = dVar.f24881a;
        if (f != 0.0f) {
            this.f12076l = f;
        }
        ColorStateList colorStateList2 = dVar.f24889i;
        if (colorStateList2 != null) {
            this.f12062S = colorStateList2;
        }
        this.f12060Q = dVar.f24890j;
        this.f12061R = dVar.f24891k;
        this.f12059P = dVar.f24892l;
        C9059a aVar = this.f12089y;
        if (aVar != null) {
            aVar.mo23011c();
        }
        this.f12089y = new C9059a(new C4263a(), dVar.mo23012e());
        dVar.mo23015h(this.f12067c.getContext(), this.f12089y);
        mo13483z();
    }

    /* renamed from: E */
    public void mo13459E(ColorStateList colorStateList) {
        if (this.f12078n != colorStateList) {
            this.f12078n = colorStateList;
            mo13483z();
        }
    }

    /* renamed from: F */
    public void mo13460F(int i) {
        if (this.f12074j != i) {
            this.f12074j = i;
            mo13483z();
        }
    }

    /* renamed from: G */
    public void mo13461G(Typeface typeface) {
        if (m16348H(typeface)) {
            mo13483z();
        }
    }

    /* renamed from: I */
    public void mo13462I(int i, int i2, int i3, int i4) {
        if (!m16347A(this.f12070f, i, i2, i3, i4)) {
            this.f12070f.set(i, i2, i3, i4);
            this.f12054K = true;
            mo13482y();
        }
    }

    /* renamed from: J */
    public void mo13463J(Rect rect) {
        mo13462I(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: K */
    public void mo13464K(ColorStateList colorStateList) {
        if (this.f12077m != colorStateList) {
            this.f12077m = colorStateList;
            mo13483z();
        }
    }

    /* renamed from: L */
    public void mo13465L(int i) {
        if (this.f12073i != i) {
            this.f12073i = i;
            mo13483z();
        }
    }

    /* renamed from: M */
    public void mo13466M(float f) {
        if (this.f12075k != f) {
            this.f12075k = f;
            mo13483z();
        }
    }

    /* renamed from: O */
    public void mo13467O(float f) {
        float a = C1847a.m7857a(f, 0.0f, 1.0f);
        if (a != this.f12069e) {
            this.f12069e = a;
            m16353d();
        }
    }

    /* renamed from: Q */
    public void mo13468Q(TimeInterpolator timeInterpolator) {
        this.f12057N = timeInterpolator;
        mo13483z();
    }

    /* renamed from: R */
    public final boolean mo13469R(int[] iArr) {
        this.f12053J = iArr;
        if (!mo13481w()) {
            return false;
        }
        mo13483z();
        return true;
    }

    /* renamed from: S */
    public void mo13470S(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f12090z, charSequence)) {
            this.f12090z = charSequence;
            this.f12044A = null;
            m16357h();
            mo13483z();
        }
    }

    /* renamed from: T */
    public void mo13471T(TimeInterpolator timeInterpolator) {
        this.f12058O = timeInterpolator;
        mo13483z();
    }

    /* renamed from: U */
    public void mo13472U(Typeface typeface) {
        boolean H = m16348H(typeface);
        boolean N = m16349N(typeface);
        if (H || N) {
            mo13483z();
        }
    }

    /* renamed from: c */
    public float mo13473c() {
        if (this.f12090z == null) {
            return 0.0f;
        }
        m16361s(this.f12056M);
        TextPaint textPaint = this.f12056M;
        CharSequence charSequence = this.f12090z;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: i */
    public void mo13474i(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f12044A != null && this.f12068d) {
            float f2 = this.f12083s;
            float f3 = this.f12084t;
            boolean z = this.f12046C && this.f12047D != null;
            if (z) {
                f = this.f12049F * this.f12051H;
            } else {
                f = this.f12055L.ascent() * this.f12051H;
                this.f12055L.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            float f5 = this.f12051H;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f12047D, f2, f4, this.f12048E);
            } else {
                CharSequence charSequence = this.f12044A;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.f12055L);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: k */
    public void mo13475k(RectF rectF) {
        boolean e = m16354e(this.f12090z);
        Rect rect = this.f12071g;
        float c = !e ? (float) rect.left : ((float) rect.right) - mo13473c();
        rectF.left = c;
        Rect rect2 = this.f12071g;
        rectF.top = (float) rect2.top;
        rectF.right = !e ? c + mo13473c() : (float) rect2.right;
        rectF.bottom = ((float) this.f12071g.top) + mo13477m();
    }

    /* renamed from: l */
    public ColorStateList mo13476l() {
        return this.f12078n;
    }

    /* renamed from: m */
    public float mo13477m() {
        m16361s(this.f12056M);
        return -this.f12056M.ascent();
    }

    /* renamed from: n */
    public int mo13478n() {
        return m16359o(this.f12078n);
    }

    /* renamed from: q */
    public float mo13479q() {
        m16362t(this.f12056M);
        return -this.f12056M.ascent();
    }

    /* renamed from: r */
    public float mo13480r() {
        return this.f12069e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f12077m;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13481w() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f12078n
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f12077m
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C4262a.mo13481w():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo13482y() {
        this.f12068d = this.f12071g.width() > 0 && this.f12071g.height() > 0 && this.f12070f.width() > 0 && this.f12070f.height() > 0;
    }

    /* renamed from: z */
    public void mo13483z() {
        if (this.f12067c.getHeight() > 0 && this.f12067c.getWidth() > 0) {
            m16352b();
            m16353d();
        }
    }
}
