package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.facebook.react.modules.i18nmanager.C2822a;
import com.facebook.react.uimanager.C2939e;
import com.facebook.react.uimanager.C3001m0;
import com.facebook.yoga.C3307g;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.react.views.view.e */
public class C3240e extends Drawable {

    /* renamed from: a */
    private C3001m0 f9126a;

    /* renamed from: b */
    private C3001m0 f9127b;

    /* renamed from: c */
    private C3001m0 f9128c;

    /* renamed from: d */
    private C3243c f9129d;

    /* renamed from: e */
    private Path f9130e;

    /* renamed from: f */
    private Path f9131f;

    /* renamed from: g */
    private Path f9132g;

    /* renamed from: h */
    private Path f9133h;

    /* renamed from: i */
    private Path f9134i = new Path();

    /* renamed from: j */
    private Path f9135j;

    /* renamed from: k */
    private RectF f9136k;

    /* renamed from: l */
    private RectF f9137l;

    /* renamed from: m */
    private RectF f9138m;

    /* renamed from: n */
    private RectF f9139n;

    /* renamed from: o */
    private PointF f9140o;

    /* renamed from: p */
    private PointF f9141p;

    /* renamed from: q */
    private PointF f9142q;

    /* renamed from: r */
    private PointF f9143r;

    /* renamed from: s */
    private boolean f9144s = false;

    /* renamed from: t */
    private float f9145t = Float.NaN;

    /* renamed from: u */
    private final Paint f9146u = new Paint(1);

    /* renamed from: v */
    private int f9147v = 0;

    /* renamed from: w */
    private int f9148w = 255;

    /* renamed from: x */
    private float[] f9149x;

    /* renamed from: y */
    private final Context f9150y;

    /* renamed from: z */
    private int f9151z;

    /* renamed from: com.facebook.react.views.view.e$a */
    static /* synthetic */ class C3241a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9152a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.react.views.view.e$c[] r0 = com.facebook.react.views.view.C3240e.C3243c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9152a = r0
                com.facebook.react.views.view.e$c r1 = com.facebook.react.views.view.C3240e.C3243c.SOLID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9152a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.views.view.e$c r1 = com.facebook.react.views.view.C3240e.C3243c.DASHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9152a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.views.view.e$c r1 = com.facebook.react.views.view.C3240e.C3243c.DOTTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.C3240e.C3241a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.react.views.view.e$b */
    public enum C3242b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    /* renamed from: com.facebook.react.views.view.e$c */
    private enum C3243c {
        SOLID,
        DASHED,
        DOTTED;

        /* renamed from: e */
        public static PathEffect m12700e(C3243c cVar, float f) {
            int i = C3241a.f9152a[cVar.ordinal()];
            if (i == 2) {
                float f2 = f * 3.0f;
                return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
            } else if (i != 3) {
                return null;
            } else {
                return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
            }
        }
    }

    public C3240e(Context context) {
        this.f9150y = context;
    }

    /* renamed from: B */
    private void m12670B() {
        float f;
        float f2;
        if (this.f9144s) {
            this.f9144s = false;
            if (this.f9130e == null) {
                this.f9130e = new Path();
            }
            if (this.f9131f == null) {
                this.f9131f = new Path();
            }
            if (this.f9132g == null) {
                this.f9132g = new Path();
            }
            if (this.f9135j == null) {
                this.f9135j = new Path();
            }
            if (this.f9136k == null) {
                this.f9136k = new RectF();
            }
            if (this.f9137l == null) {
                this.f9137l = new RectF();
            }
            if (this.f9138m == null) {
                this.f9138m = new RectF();
            }
            if (this.f9139n == null) {
                this.f9139n = new RectF();
            }
            this.f9130e.reset();
            this.f9131f.reset();
            this.f9132g.reset();
            this.f9135j.reset();
            this.f9136k.set(getBounds());
            this.f9137l.set(getBounds());
            this.f9138m.set(getBounds());
            this.f9139n.set(getBounds());
            RectF k = mo10630k();
            RectF rectF = this.f9136k;
            rectF.top += k.top;
            rectF.bottom -= k.bottom;
            rectF.left += k.left;
            rectF.right -= k.right;
            RectF rectF2 = this.f9139n;
            rectF2.top += k.top * 0.5f;
            rectF2.bottom -= k.bottom * 0.5f;
            rectF2.left += k.left * 0.5f;
            rectF2.right -= k.right * 0.5f;
            float m = mo10631m();
            float h = mo10627h(m, C3242b.TOP_LEFT);
            float h2 = mo10627h(m, C3242b.TOP_RIGHT);
            float h3 = mo10627h(m, C3242b.BOTTOM_LEFT);
            float h4 = mo10627h(m, C3242b.BOTTOM_RIGHT);
            boolean z = mo10633o() == 1;
            float g = mo10623g(C3242b.TOP_START);
            float g2 = mo10623g(C3242b.TOP_END);
            float g3 = mo10623g(C3242b.BOTTOM_START);
            float g4 = mo10623g(C3242b.BOTTOM_END);
            if (C2822a.m11246d().mo9190b(this.f9150y)) {
                if (!C3307g.m12971a(g)) {
                    h = g;
                }
                if (!C3307g.m12971a(g2)) {
                    h2 = g2;
                }
                if (!C3307g.m12971a(g3)) {
                    h3 = g3;
                }
                if (!C3307g.m12971a(g4)) {
                    h4 = g4;
                }
                f = z ? h2 : h;
                if (!z) {
                    h = h2;
                }
                f2 = z ? h4 : h3;
                if (z) {
                    h4 = h3;
                }
            } else {
                float f3 = z ? g2 : g;
                if (!z) {
                    g = g2;
                }
                float f4 = z ? g4 : g3;
                if (!z) {
                    g3 = g4;
                }
                if (!C3307g.m12971a(f3)) {
                    h = f3;
                }
                if (!C3307g.m12971a(g)) {
                    h2 = g;
                }
                if (!C3307g.m12971a(f4)) {
                    h3 = f4;
                }
                f = h;
                h = h2;
                f2 = h3;
                if (!C3307g.m12971a(g3)) {
                    h4 = g3;
                }
            }
            float max = Math.max(f - k.left, 0.0f);
            float max2 = Math.max(f - k.top, 0.0f);
            float max3 = Math.max(h - k.right, 0.0f);
            float max4 = Math.max(h - k.top, 0.0f);
            float max5 = Math.max(h4 - k.right, 0.0f);
            float max6 = Math.max(h4 - k.bottom, 0.0f);
            float max7 = Math.max(f2 - k.left, 0.0f);
            float max8 = Math.max(f2 - k.bottom, 0.0f);
            RectF rectF3 = k;
            float f5 = f2;
            this.f9130e.addRoundRect(this.f9136k, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Path.Direction.CW);
            this.f9131f.addRoundRect(this.f9137l, new float[]{f, f, h, h, h4, h4, f5, f5}, Path.Direction.CW);
            C3001m0 m0Var = this.f9126a;
            float a = m0Var != null ? m0Var.mo9735a(8) / 2.0f : 0.0f;
            float f6 = max6;
            float f7 = f + a;
            float f8 = h + a;
            float f9 = h4 + a;
            float f10 = f5 + a;
            this.f9132g.addRoundRect(this.f9138m, new float[]{f7, f7, f8, f8, f9, f9, f10, f10}, Path.Direction.CW);
            Path path = this.f9135j;
            RectF rectF4 = this.f9139n;
            float[] fArr = new float[8];
            RectF rectF5 = rectF3;
            float f11 = rectF5.left;
            float f12 = max5;
            fArr[0] = Math.max(f - (f11 * 0.5f), f11 > 0.0f ? f / f11 : 0.0f);
            float f13 = rectF5.top;
            fArr[1] = Math.max(f - (f13 * 0.5f), f13 > 0.0f ? f / f13 : 0.0f);
            float f14 = rectF5.right;
            fArr[2] = Math.max(h - (f14 * 0.5f), f14 > 0.0f ? h / f14 : 0.0f);
            float f15 = rectF5.top;
            fArr[3] = Math.max(h - (f15 * 0.5f), f15 > 0.0f ? h / f15 : 0.0f);
            float f16 = rectF5.right;
            fArr[4] = Math.max(h4 - (f16 * 0.5f), f16 > 0.0f ? h4 / f16 : 0.0f);
            float f17 = rectF5.bottom;
            fArr[5] = Math.max(h4 - (f17 * 0.5f), f17 > 0.0f ? h4 / f17 : 0.0f);
            float f18 = rectF5.left;
            fArr[6] = Math.max(f5 - (f18 * 0.5f), f18 > 0.0f ? f5 / f18 : 0.0f);
            float f19 = rectF5.bottom;
            fArr[7] = Math.max(f5 - (f19 * 0.5f), f19 > 0.0f ? f5 / f19 : 0.0f);
            path.addRoundRect(rectF4, fArr, Path.Direction.CW);
            if (this.f9140o == null) {
                this.f9140o = new PointF();
            }
            PointF pointF = this.f9140o;
            PointF pointF2 = pointF;
            RectF rectF6 = this.f9136k;
            float f20 = rectF6.left;
            pointF.x = f20;
            float f21 = rectF6.top;
            pointF.y = f21;
            RectF rectF7 = this.f9137l;
            m12679l((double) f20, (double) f21, (double) ((max * 2.0f) + f20), (double) ((max2 * 2.0f) + f21), (double) rectF7.left, (double) rectF7.top, (double) f20, (double) f21, pointF2);
            if (this.f9143r == null) {
                this.f9143r = new PointF();
            }
            PointF pointF3 = this.f9143r;
            PointF pointF4 = pointF3;
            RectF rectF8 = this.f9136k;
            float f22 = rectF8.left;
            pointF3.x = f22;
            float f23 = rectF8.bottom;
            pointF3.y = f23;
            RectF rectF9 = this.f9137l;
            m12679l((double) f22, (double) (f23 - (max8 * 2.0f)), (double) ((max7 * 2.0f) + f22), (double) f23, (double) rectF9.left, (double) rectF9.bottom, (double) f22, (double) f23, pointF4);
            if (this.f9141p == null) {
                this.f9141p = new PointF();
            }
            PointF pointF5 = this.f9141p;
            PointF pointF6 = pointF5;
            RectF rectF10 = this.f9136k;
            float f24 = rectF10.right;
            pointF5.x = f24;
            float f25 = rectF10.top;
            pointF5.y = f25;
            RectF rectF11 = this.f9137l;
            m12679l((double) (f24 - (max3 * 2.0f)), (double) f25, (double) f24, (double) ((max4 * 2.0f) + f25), (double) rectF11.right, (double) rectF11.top, (double) f24, (double) f25, pointF6);
            if (this.f9142q == null) {
                this.f9142q = new PointF();
            }
            PointF pointF7 = this.f9142q;
            PointF pointF8 = pointF7;
            RectF rectF12 = this.f9136k;
            float f26 = rectF12.right;
            pointF7.x = f26;
            float f27 = rectF12.bottom;
            pointF7.y = f27;
            RectF rectF13 = this.f9137l;
            m12679l((double) (f26 - (f12 * 2.0f)), (double) (f27 - (2.0f * f6)), (double) f26, (double) f27, (double) rectF13.right, (double) rectF13.bottom, (double) f26, (double) f27, pointF8);
        }
    }

    /* renamed from: C */
    private void m12671C() {
        C3243c cVar = this.f9129d;
        this.f9146u.setPathEffect(cVar != null ? C3243c.m12700e(cVar, mo10632n()) : null);
    }

    /* renamed from: D */
    private void m12672D(int i) {
        C3243c cVar = this.f9129d;
        this.f9146u.setPathEffect(cVar != null ? C3243c.m12700e(cVar, (float) i) : null);
    }

    /* renamed from: a */
    private static int m12673a(float f, float f2) {
        return ((((int) f) << 24) & -16777216) | (((int) f2) & 16777215);
    }

    /* renamed from: b */
    private void m12674b(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i != 0) {
            if (this.f9133h == null) {
                this.f9133h = new Path();
            }
            this.f9146u.setColor(i);
            this.f9133h.reset();
            this.f9133h.moveTo(f, f2);
            this.f9133h.lineTo(f3, f4);
            this.f9133h.lineTo(f5, f6);
            this.f9133h.lineTo(f7, f8);
            this.f9133h.lineTo(f, f2);
            canvas.drawPath(this.f9133h, this.f9146u);
        }
    }

    /* renamed from: c */
    private void m12675c(Canvas canvas) {
        int i;
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        this.f9146u.setStyle(Paint.Style.FILL);
        int b = C3237b.m12661b(this.f9147v, this.f9148w);
        if (Color.alpha(b) != 0) {
            this.f9146u.setColor(b);
            canvas2.drawRect(getBounds(), this.f9146u);
        }
        RectF k = mo10630k();
        int round = Math.round(k.left);
        int round2 = Math.round(k.top);
        int round3 = Math.round(k.right);
        int round4 = Math.round(k.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            Rect bounds = getBounds();
            int f = m12678f(0);
            int f2 = m12678f(1);
            int f3 = m12678f(2);
            int f4 = m12678f(3);
            boolean z = mo10633o() == 1;
            int f5 = m12678f(4);
            int f6 = m12678f(5);
            if (C2822a.m11246d().mo9190b(this.f9150y)) {
                if (m12680q(4)) {
                    f = f5;
                }
                if (m12680q(5)) {
                    f3 = f6;
                }
                int i4 = z ? f3 : f;
                if (!z) {
                    f = f3;
                }
                i = f;
                i2 = i4;
            } else {
                int i5 = z ? f6 : f5;
                if (!z) {
                    f5 = f6;
                }
                boolean q = m12680q(4);
                boolean q2 = m12680q(5);
                boolean z2 = z ? q2 : q;
                if (!z) {
                    q = q2;
                }
                if (z2) {
                    f = i5;
                }
                i2 = f;
                i = q ? f5 : f3;
            }
            int i6 = bounds.left;
            int i7 = bounds.top;
            int i8 = round3;
            int i9 = i6;
            int e = m12677e(round, round2, round3, round4, i2, f2, i, f4);
            if (e == 0) {
                this.f9146u.setAntiAlias(false);
                int width = bounds.width();
                int height = bounds.height();
                if (round > 0) {
                    float f7 = (float) i9;
                    float f8 = (float) (i9 + round);
                    int i10 = i7 + height;
                    i3 = i7;
                    m12674b(canvas, i2, f7, (float) i7, f8, (float) (i7 + round2), f8, (float) (i10 - round4), f7, (float) i10);
                } else {
                    i3 = i7;
                }
                if (round2 > 0) {
                    float f9 = (float) i3;
                    float f10 = (float) (i3 + round2);
                    int i11 = i9 + width;
                    m12674b(canvas, f2, (float) i9, f9, (float) (i9 + round), f10, (float) (i11 - i8), f10, (float) i11, f9);
                }
                if (i8 > 0) {
                    int i12 = i9 + width;
                    float f11 = (float) i12;
                    int i13 = i3 + height;
                    float f12 = (float) (i12 - i8);
                    m12674b(canvas, i, f11, (float) i3, f11, (float) i13, f12, (float) (i13 - round4), f12, (float) (i3 + round2));
                }
                if (round4 > 0) {
                    int i14 = i3 + height;
                    float f13 = (float) i14;
                    int i15 = i9 + width;
                    float f14 = (float) (i14 - round4);
                    m12674b(canvas, f4, (float) i9, f13, (float) i15, f13, (float) (i15 - i8), f14, (float) (i9 + round), f14);
                }
                this.f9146u.setAntiAlias(true);
            } else if (Color.alpha(e) != 0) {
                int i16 = bounds.right;
                int i17 = bounds.bottom;
                this.f9146u.setColor(e);
                this.f9146u.setStyle(Paint.Style.STROKE);
                if (round > 0) {
                    this.f9134i.reset();
                    int round5 = Math.round(k.left);
                    m12672D(round5);
                    this.f9146u.setStrokeWidth((float) round5);
                    float f15 = (float) (i9 + (round5 / 2));
                    this.f9134i.moveTo(f15, (float) i7);
                    this.f9134i.lineTo(f15, (float) i17);
                    canvas2.drawPath(this.f9134i, this.f9146u);
                }
                if (round2 > 0) {
                    this.f9134i.reset();
                    int round6 = Math.round(k.top);
                    m12672D(round6);
                    this.f9146u.setStrokeWidth((float) round6);
                    float f16 = (float) (i7 + (round6 / 2));
                    this.f9134i.moveTo((float) i9, f16);
                    this.f9134i.lineTo((float) i16, f16);
                    canvas2.drawPath(this.f9134i, this.f9146u);
                }
                if (i8 > 0) {
                    this.f9134i.reset();
                    int round7 = Math.round(k.right);
                    m12672D(round7);
                    this.f9146u.setStrokeWidth((float) round7);
                    float f17 = (float) (i16 - (round7 / 2));
                    this.f9134i.moveTo(f17, (float) i7);
                    this.f9134i.lineTo(f17, (float) i17);
                    canvas2.drawPath(this.f9134i, this.f9146u);
                }
                if (round4 > 0) {
                    this.f9134i.reset();
                    int round8 = Math.round(k.bottom);
                    m12672D(round8);
                    this.f9146u.setStrokeWidth((float) round8);
                    float f18 = (float) (i17 - (round8 / 2));
                    this.f9134i.moveTo((float) i9, f18);
                    this.f9134i.lineTo((float) i16, f18);
                    canvas2.drawPath(this.f9134i, this.f9146u);
                }
            }
        }
    }

    /* renamed from: d */
    private void m12676d(Canvas canvas) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        m12670B();
        canvas.save();
        int b = C3237b.m12661b(this.f9147v, this.f9148w);
        if (Color.alpha(b) != 0) {
            this.f9146u.setColor(b);
            this.f9146u.setStyle(Paint.Style.FILL);
            canvas2.drawPath(this.f9130e, this.f9146u);
        }
        RectF k = mo10630k();
        boolean z = false;
        int f5 = m12678f(0);
        int f6 = m12678f(1);
        int f7 = m12678f(2);
        int f8 = m12678f(3);
        if (k.top > 0.0f || k.bottom > 0.0f || k.left > 0.0f || k.right > 0.0f) {
            float n = mo10632n();
            int f9 = m12678f(8);
            if (k.top != n || k.bottom != n || k.left != n || k.right != n || f5 != f9 || f6 != f9 || f7 != f9 || f8 != f9) {
                this.f9146u.setStyle(Paint.Style.FILL);
                canvas2.clipPath(this.f9131f, Region.Op.INTERSECT);
                canvas2.clipPath(this.f9130e, Region.Op.DIFFERENCE);
                if (mo10633o() == 1) {
                    z = true;
                }
                int f10 = m12678f(4);
                int f11 = m12678f(5);
                if (C2822a.m11246d().mo9190b(this.f9150y)) {
                    if (m12680q(4)) {
                        f5 = f10;
                    }
                    if (m12680q(5)) {
                        f7 = f11;
                    }
                    i2 = z ? f7 : f5;
                    if (!z) {
                        f5 = f7;
                    }
                    i = f5;
                } else {
                    int i3 = z ? f11 : f10;
                    if (!z) {
                        f10 = f11;
                    }
                    boolean q = m12680q(4);
                    boolean q2 = m12680q(5);
                    boolean z2 = z ? q2 : q;
                    if (!z) {
                        q = q2;
                    }
                    if (z2) {
                        f5 = i3;
                    }
                    if (q) {
                        i2 = f5;
                        i = f10;
                    } else {
                        i2 = f5;
                        i = f7;
                    }
                }
                RectF rectF = this.f9137l;
                float f12 = rectF.left;
                float f13 = rectF.right;
                float f14 = rectF.top;
                float f15 = rectF.bottom;
                if (k.left > 0.0f) {
                    PointF pointF = this.f9140o;
                    float f16 = pointF.x;
                    float f17 = pointF.y;
                    PointF pointF2 = this.f9143r;
                    f2 = f15;
                    f3 = f14;
                    f4 = f13;
                    f = f12;
                    m12674b(canvas, i2, f12, f14, f16, f17, pointF2.x, pointF2.y, f12, f2);
                } else {
                    f2 = f15;
                    f3 = f14;
                    f4 = f13;
                    f = f12;
                }
                if (k.top > 0.0f) {
                    PointF pointF3 = this.f9140o;
                    float f18 = pointF3.x;
                    float f19 = pointF3.y;
                    PointF pointF4 = this.f9141p;
                    m12674b(canvas, f6, f, f3, f18, f19, pointF4.x, pointF4.y, f4, f3);
                }
                if (k.right > 0.0f) {
                    PointF pointF5 = this.f9141p;
                    float f20 = pointF5.x;
                    float f21 = pointF5.y;
                    PointF pointF6 = this.f9142q;
                    m12674b(canvas, i, f4, f3, f20, f21, pointF6.x, pointF6.y, f4, f2);
                }
                if (k.bottom > 0.0f) {
                    PointF pointF7 = this.f9143r;
                    float f22 = pointF7.x;
                    float f23 = pointF7.y;
                    PointF pointF8 = this.f9142q;
                    m12674b(canvas, f8, f, f2, f22, f23, pointF8.x, pointF8.y, f4, f2);
                }
            } else if (n > 0.0f) {
                this.f9146u.setColor(C3237b.m12661b(f9, this.f9148w));
                this.f9146u.setStyle(Paint.Style.STROKE);
                this.f9146u.setStrokeWidth(n);
                canvas2.drawPath(this.f9135j, this.f9146u);
            }
        }
        canvas.restore();
    }

    /* renamed from: e */
    private static int m12677e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -1;
        int i10 = (i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1);
        if (i4 > 0) {
            i9 = i8;
        }
        int i11 = i9 & i10;
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        int i12 = i5 | i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        int i13 = i12 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i11 == (i13 | i8)) {
            return i11;
        }
        return 0;
    }

    /* renamed from: f */
    private int m12678f(int i) {
        C3001m0 m0Var = this.f9127b;
        float a = m0Var != null ? m0Var.mo9735a(i) : 0.0f;
        C3001m0 m0Var2 = this.f9128c;
        return m12673a(m0Var2 != null ? m0Var2.mo9735a(i) : 255.0f, a);
    }

    /* renamed from: l */
    private static void m12679l(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        PointF pointF2 = pointF;
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = (d13 * sqrt) + d14;
        double d22 = sqrt + d9;
        double d23 = d21 + d10;
        if (!Double.isNaN(d22) && !Double.isNaN(d23)) {
            PointF pointF3 = pointF;
            pointF3.x = (float) d22;
            pointF3.y = (float) d23;
        }
    }

    /* renamed from: q */
    private boolean m12680q(int i) {
        C3001m0 m0Var = this.f9127b;
        float f = Float.NaN;
        float a = m0Var != null ? m0Var.mo9735a(i) : Float.NaN;
        C3001m0 m0Var2 = this.f9128c;
        if (m0Var2 != null) {
            f = m0Var2.mo9735a(i);
        }
        return !C3307g.m12971a(a) && !C3307g.m12971a(f);
    }

    /* renamed from: s */
    private void m12681s(int i, float f) {
        if (this.f9128c == null) {
            this.f9128c = new C3001m0(255.0f);
        }
        if (!C2939e.m11588a(this.f9128c.mo9736b(i), f)) {
            this.f9128c.mo9737d(i, f);
            invalidateSelf();
        }
    }

    /* renamed from: u */
    private void m12682u(int i, float f) {
        if (this.f9127b == null) {
            this.f9127b = new C3001m0(0.0f);
        }
        if (!C2939e.m11588a(this.f9127b.mo9736b(i), f)) {
            this.f9127b.mo9737d(i, f);
            invalidateSelf();
        }
    }

    /* renamed from: A */
    public boolean mo10621A(int i) {
        if (this.f9151z == i) {
            return false;
        }
        this.f9151z = i;
        return mo10636r(i);
    }

    public void draw(Canvas canvas) {
        m12671C();
        if (!mo10635p()) {
            m12675c(canvas);
        } else {
            m12676d(canvas);
        }
    }

    /* renamed from: g */
    public float mo10623g(C3242b bVar) {
        return mo10627h(Float.NaN, bVar);
    }

    public int getAlpha() {
        return this.f9148w;
    }

    public int getOpacity() {
        return C3237b.m12660a(C3237b.m12661b(this.f9147v, this.f9148w));
    }

    public void getOutline(Outline outline) {
        if ((C3307g.m12971a(this.f9145t) || this.f9145t <= 0.0f) && this.f9149x == null) {
            outline.setRect(getBounds());
            return;
        }
        m12670B();
        outline.setConvexPath(this.f9132g);
    }

    /* renamed from: h */
    public float mo10627h(float f, C3242b bVar) {
        float[] fArr = this.f9149x;
        if (fArr == null) {
            return f;
        }
        float f2 = fArr[bVar.ordinal()];
        return C3307g.m12971a(f2) ? f : f2;
    }

    /* renamed from: i */
    public float mo10628i(float f, int i) {
        C3001m0 m0Var = this.f9126a;
        if (m0Var == null) {
            return f;
        }
        float b = m0Var.mo9736b(i);
        return C3307g.m12971a(b) ? f : b;
    }

    /* renamed from: j */
    public int mo10629j() {
        return this.f9147v;
    }

    @TargetApi(21)
    /* renamed from: k */
    public RectF mo10630k() {
        float i = mo10628i(0.0f, 8);
        boolean z = true;
        float i2 = mo10628i(i, 1);
        float i3 = mo10628i(i, 3);
        float i4 = mo10628i(i, 0);
        float i5 = mo10628i(i, 2);
        if (this.f9126a != null) {
            if (mo10633o() != 1) {
                z = false;
            }
            float b = this.f9126a.mo9736b(4);
            float b2 = this.f9126a.mo9736b(5);
            if (C2822a.m11246d().mo9190b(this.f9150y)) {
                if (!C3307g.m12971a(b)) {
                    i4 = b;
                }
                if (!C3307g.m12971a(b2)) {
                    i5 = b2;
                }
                float f = z ? i5 : i4;
                if (z) {
                    i5 = i4;
                }
                i4 = f;
            } else {
                float f2 = z ? b2 : b;
                if (!z) {
                    b = b2;
                }
                if (!C3307g.m12971a(f2)) {
                    i4 = f2;
                }
                if (!C3307g.m12971a(b)) {
                    i5 = b;
                }
            }
        }
        return new RectF(i4, i2, i5, i3);
    }

    /* renamed from: m */
    public float mo10631m() {
        if (C3307g.m12971a(this.f9145t)) {
            return 0.0f;
        }
        return this.f9145t;
    }

    /* renamed from: n */
    public float mo10632n() {
        C3001m0 m0Var = this.f9126a;
        if (m0Var == null || C3307g.m12971a(m0Var.mo9736b(8))) {
            return 0.0f;
        }
        return this.f9126a.mo9736b(8);
    }

    /* renamed from: o */
    public int mo10633o() {
        return this.f9151z;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9144s = true;
    }

    /* renamed from: p */
    public boolean mo10635p() {
        if (!C3307g.m12971a(this.f9145t) && this.f9145t > 0.0f) {
            return true;
        }
        float[] fArr = this.f9149x;
        if (fArr != null) {
            for (float f : fArr) {
                if (!C3307g.m12971a(f) && f > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo10636r(int i) {
        return false;
    }

    public void setAlpha(int i) {
        if (i != this.f9148w) {
            this.f9148w = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public void mo10639t(int i, float f, float f2) {
        m12682u(i, f);
        m12681s(i, f2);
    }

    /* renamed from: v */
    public void mo10640v(String str) {
        C3243c valueOf = str == null ? null : C3243c.valueOf(str.toUpperCase(Locale.US));
        if (this.f9129d != valueOf) {
            this.f9129d = valueOf;
            this.f9144s = true;
            invalidateSelf();
        }
    }

    /* renamed from: w */
    public void mo10641w(int i, float f) {
        if (this.f9126a == null) {
            this.f9126a = new C3001m0();
        }
        if (!C2939e.m11588a(this.f9126a.mo9736b(i), f)) {
            this.f9126a.mo9737d(i, f);
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                this.f9144s = true;
            }
            invalidateSelf();
        }
    }

    /* renamed from: x */
    public void mo10642x(int i) {
        this.f9147v = i;
        invalidateSelf();
    }

    /* renamed from: y */
    public void mo10643y(float f) {
        if (!C2939e.m11588a(this.f9145t, f)) {
            this.f9145t = f;
            this.f9144s = true;
            invalidateSelf();
        }
    }

    /* renamed from: z */
    public void mo10644z(float f, int i) {
        if (this.f9149x == null) {
            float[] fArr = new float[8];
            this.f9149x = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (!C2939e.m11588a(this.f9149x[i], f)) {
            this.f9149x[i] = f;
            this.f9144s = true;
            invalidateSelf();
        }
    }
}
