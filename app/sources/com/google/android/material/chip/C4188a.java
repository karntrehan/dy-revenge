package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.graphics.drawable.C1165b;
import com.google.android.material.internal.C4270f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import okhttp3.HttpUrl;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p065d.C1827a;
import p027c.p064i.p071i.C1888a;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p366l.C9032h;
import p174e.p319f.p320a.p363d.p367m.C9036a;
import p174e.p319f.p320a.p363d.p374s.C9054a;
import p174e.p319f.p320a.p363d.p379x.C9063d;
import p174e.p319f.p320a.p363d.p380y.C9071b;

/* renamed from: com.google.android.material.chip.a */
public class C4188a extends C8990g implements C1165b, Drawable.Callback, C4270f.C4272b {

    /* renamed from: J */
    private static final int[] f11741J = {16842910};

    /* renamed from: K */
    private static final ShapeDrawable f11742K = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private int f11743A0;

    /* renamed from: B0 */
    private int f11744B0;

    /* renamed from: C0 */
    private int f11745C0;

    /* renamed from: D0 */
    private int f11746D0;

    /* renamed from: E0 */
    private int f11747E0;

    /* renamed from: F0 */
    private boolean f11748F0;

    /* renamed from: G0 */
    private int f11749G0;

    /* renamed from: H0 */
    private int f11750H0 = 255;

    /* renamed from: I0 */
    private ColorFilter f11751I0;

    /* renamed from: J0 */
    private PorterDuffColorFilter f11752J0;

    /* renamed from: K0 */
    private ColorStateList f11753K0;

    /* renamed from: L */
    private ColorStateList f11754L;

    /* renamed from: L0 */
    private PorterDuff.Mode f11755L0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: M */
    private ColorStateList f11756M;

    /* renamed from: M0 */
    private int[] f11757M0;

    /* renamed from: N */
    private float f11758N;

    /* renamed from: N0 */
    private boolean f11759N0;

    /* renamed from: O */
    private float f11760O;

    /* renamed from: O0 */
    private ColorStateList f11761O0;

    /* renamed from: P */
    private ColorStateList f11762P;

    /* renamed from: P0 */
    private WeakReference<C4189a> f11763P0 = new WeakReference<>((Object) null);

    /* renamed from: Q */
    private float f11764Q;

    /* renamed from: Q0 */
    private TextUtils.TruncateAt f11765Q0;

    /* renamed from: R */
    private ColorStateList f11766R;

    /* renamed from: R0 */
    private boolean f11767R0;

    /* renamed from: S */
    private CharSequence f11768S;

    /* renamed from: S0 */
    private int f11769S0;

    /* renamed from: T */
    private boolean f11770T;

    /* renamed from: T0 */
    private boolean f11771T0;

    /* renamed from: U */
    private Drawable f11772U;

    /* renamed from: V */
    private ColorStateList f11773V;

    /* renamed from: W */
    private float f11774W;

    /* renamed from: X */
    private boolean f11775X;

    /* renamed from: Y */
    private boolean f11776Y;

    /* renamed from: Z */
    private Drawable f11777Z;

    /* renamed from: a0 */
    private Drawable f11778a0;

    /* renamed from: b0 */
    private ColorStateList f11779b0;

    /* renamed from: c0 */
    private float f11780c0;

    /* renamed from: d0 */
    private CharSequence f11781d0;

    /* renamed from: e0 */
    private boolean f11782e0;

    /* renamed from: f0 */
    private boolean f11783f0;

    /* renamed from: g0 */
    private Drawable f11784g0;

    /* renamed from: h0 */
    private C9032h f11785h0;

    /* renamed from: i0 */
    private C9032h f11786i0;

    /* renamed from: j0 */
    private float f11787j0;

    /* renamed from: k0 */
    private float f11788k0;

    /* renamed from: l0 */
    private float f11789l0;

    /* renamed from: m0 */
    private float f11790m0;

    /* renamed from: n0 */
    private float f11791n0;

    /* renamed from: o0 */
    private float f11792o0;

    /* renamed from: p0 */
    private float f11793p0;

    /* renamed from: q0 */
    private float f11794q0;

    /* renamed from: r0 */
    private final Context f11795r0;

    /* renamed from: s0 */
    private final Paint f11796s0 = new Paint(1);

    /* renamed from: t0 */
    private final Paint f11797t0;

    /* renamed from: u0 */
    private final Paint.FontMetrics f11798u0 = new Paint.FontMetrics();

    /* renamed from: v0 */
    private final RectF f11799v0 = new RectF();

    /* renamed from: w0 */
    private final PointF f11800w0 = new PointF();

    /* renamed from: x0 */
    private final Path f11801x0 = new Path();

    /* renamed from: y0 */
    private final C4270f f11802y0;

    /* renamed from: z0 */
    private int f11803z0;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface C4189a {
        /* renamed from: a */
        void mo12840a();
    }

    private C4188a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo22815L(context);
        this.f11795r0 = context;
        C4270f fVar = new C4270f(this);
        this.f11802y0 = fVar;
        this.f11768S = HttpUrl.FRAGMENT_ENCODE_SET;
        fVar.mo13506e().density = context.getResources().getDisplayMetrics().density;
        this.f11797t0 = null;
        int[] iArr = f11741J;
        setState(iArr);
        mo13070b2(iArr);
        this.f11767R0 = true;
        if (C9071b.f24905a) {
            f11742K.setTint(-1);
        }
    }

    /* renamed from: C2 */
    private boolean m15873C2() {
        return this.f11783f0 && this.f11784g0 != null && this.f11748F0;
    }

    /* renamed from: D2 */
    private boolean m15874D2() {
        return this.f11770T && this.f11772U != null;
    }

    /* renamed from: E2 */
    private boolean m15875E2() {
        return this.f11776Y && this.f11777Z != null;
    }

    /* renamed from: F2 */
    private void m15876F2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: G2 */
    private void m15877G2() {
        this.f11761O0 = this.f11759N0 ? C9071b.m30223a(this.f11766R) : null;
    }

    @TargetApi(21)
    /* renamed from: H2 */
    private void m15878H2() {
        this.f11778a0 = new RippleDrawable(C9071b.m30223a(mo13060X0()), this.f11777Z, f11742K);
    }

    /* renamed from: R1 */
    private void m15879R1(ColorStateList colorStateList) {
        if (this.f11754L != colorStateList) {
            this.f11754L = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: d1 */
    private ColorFilter m15880d1() {
        ColorFilter colorFilter = this.f11751I0;
        return colorFilter != null ? colorFilter : this.f11752J0;
    }

    /* renamed from: f0 */
    private void m15881f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C1164a.m4549m(drawable, C1164a.m4542f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f11777Z) {
                if (drawable.isStateful()) {
                    drawable.setState(mo13047Q0());
                }
                C1164a.m4551o(drawable, this.f11779b0);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f11772U;
            if (drawable == drawable2 && this.f11775X) {
                C1164a.m4551o(drawable2, this.f11773V);
            }
        }
    }

    /* renamed from: f1 */
    private static boolean m15882f1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g0 */
    private void m15883g0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m15874D2() || m15873C2()) {
            float f = this.f11787j0 + this.f11788k0;
            if (C1164a.m4542f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.f11774W;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.f11774W;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f11774W;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: i0 */
    private void m15884i0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m15875E2()) {
            float f = this.f11794q0 + this.f11793p0 + this.f11780c0 + this.f11792o0 + this.f11791n0;
            if (C1164a.m4542f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: j0 */
    private void m15885j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m15875E2()) {
            float f = this.f11794q0 + this.f11793p0;
            if (C1164a.m4542f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f11780c0;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f11780c0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f11780c0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: j1 */
    private static boolean m15886j1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: k0 */
    private void m15887k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m15875E2()) {
            float f = this.f11794q0 + this.f11793p0 + this.f11780c0 + this.f11792o0 + this.f11791n0;
            if (C1164a.m4542f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: k1 */
    private static boolean m15888k1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f24882b;
     */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m15889l1(p174e.p319f.p320a.p363d.p379x.C9063d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f24882b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C4188a.m15889l1(e.f.a.d.x.d):boolean");
    }

    /* renamed from: m0 */
    private void m15890m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f11768S != null) {
            float h0 = this.f11787j0 + mo13086h0() + this.f11790m0;
            float l0 = this.f11794q0 + mo13095l0() + this.f11791n0;
            if (C1164a.m4542f(this) == 0) {
                rectF.left = ((float) rect.left) + h0;
                rectF.right = ((float) rect.right) - l0;
            } else {
                rectF.left = ((float) rect.left) + l0;
                rectF.right = ((float) rect.right) - h0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cc  */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15891m1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f11795r0
            int[] r2 = p174e.p319f.p320a.p363d.C9024k.f24623S
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C4273g.m16429k(r0, r1, r2, r3, r4, r5)
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24544C0
            boolean r10 = r9.hasValue(r10)
            r7.f11771T0 = r10
            android.content.Context r10 = r7.f11795r0
            int r0 = p174e.p319f.p320a.p363d.C9024k.f24754p0
            android.content.res.ColorStateList r10 = p174e.p319f.p320a.p363d.p379x.C9062c.m30197a(r10, r9, r0)
            r7.m15879R1(r10)
            android.content.Context r10 = r7.f11795r0
            int r0 = p174e.p319f.p320a.p363d.C9024k.f24676c0
            android.content.res.ColorStateList r10 = p174e.p319f.p320a.p363d.p379x.C9062c.m30197a(r10, r9, r0)
            r7.mo13122v1(r10)
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24724k0
            r0 = 0
            float r10 = r9.getDimension(r10, r0)
            r7.mo13034J1(r10)
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24682d0
            boolean r1 = r9.hasValue(r10)
            if (r1 == 0) goto L_0x0045
            float r10 = r9.getDimension(r10, r0)
            r7.mo13126x1(r10)
        L_0x0045:
            android.content.Context r10 = r7.f11795r0
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24742n0
            android.content.res.ColorStateList r10 = p174e.p319f.p320a.p363d.p379x.C9062c.m30197a(r10, r9, r1)
            r7.mo13042N1(r10)
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24748o0
            float r10 = r9.getDimension(r10, r0)
            r7.mo13046P1(r10)
            android.content.Context r10 = r7.f11795r0
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24539B0
            android.content.res.ColorStateList r10 = p174e.p319f.p320a.p363d.p379x.C9062c.m30197a(r10, r9, r1)
            r7.mo13101o2(r10)
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24648X
            java.lang.CharSequence r10 = r9.getText(r10)
            r7.mo13118t2(r10)
            android.content.Context r10 = r7.f11795r0
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24628T
            e.f.a.d.x.d r10 = p174e.p319f.p320a.p363d.p379x.C9062c.m30202f(r10, r9, r1)
            r7.mo13120u2(r10)
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24638V
            int r10 = r9.getInt(r10, r6)
            r1 = 1
            if (r10 == r1) goto L_0x008e
            r1 = 2
            if (r10 == r1) goto L_0x008b
            r1 = 3
            if (r10 == r1) goto L_0x0088
            goto L_0x0093
        L_0x0088:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            goto L_0x0090
        L_0x008b:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0090
        L_0x008e:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.START
        L_0x0090:
            r7.mo13079g2(r10)
        L_0x0093:
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24718j0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.mo13032I1(r10)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto L_0x00b9
            java.lang.String r1 = "chipIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x00b9
            java.lang.String r1 = "chipIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x00b9
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24700g0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo13032I1(r1)
        L_0x00b9:
            android.content.Context r1 = r7.f11795r0
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24694f0
            android.graphics.drawable.Drawable r1 = p174e.p319f.p320a.p363d.p379x.C9062c.m30200d(r1, r9, r2)
            r7.mo13017B1(r1)
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24712i0
            boolean r2 = r9.hasValue(r1)
            if (r2 == 0) goto L_0x00d5
            android.content.Context r2 = r7.f11795r0
            android.content.res.ColorStateList r1 = p174e.p319f.p320a.p363d.p379x.C9062c.m30197a(r2, r9, r1)
            r7.mo13026F1(r1)
        L_0x00d5:
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24706h0
            float r1 = r9.getDimension(r1, r0)
            r7.mo13022D1(r1)
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24796w0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo13076e2(r1)
            if (r8 == 0) goto L_0x0102
            java.lang.String r1 = "closeIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x0102
            java.lang.String r1 = "closeIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x0102
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24766r0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo13076e2(r1)
        L_0x0102:
            android.content.Context r1 = r7.f11795r0
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24760q0
            android.graphics.drawable.Drawable r1 = p174e.p319f.p320a.p363d.p379x.C9062c.m30200d(r1, r9, r2)
            r7.mo13051S1(r1)
            android.content.Context r1 = r7.f11795r0
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24790v0
            android.content.res.ColorStateList r1 = p174e.p319f.p320a.p363d.p379x.C9062c.m30197a(r1, r9, r2)
            r7.mo13072c2(r1)
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24778t0
            float r1 = r9.getDimension(r1, r0)
            r7.mo13061X1(r1)
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24653Y
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo13105p1(r1)
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24670b0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.mo13119u1(r1)
            if (r8 == 0) goto L_0x014e
            java.lang.String r1 = "checkedIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x014e
            java.lang.String r1 = "checkedIconVisible"
            java.lang.String r8 = r8.getAttributeValue(r10, r1)
            if (r8 != 0) goto L_0x014e
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24664a0
            boolean r8 = r9.getBoolean(r8, r6)
            r7.mo13119u1(r8)
        L_0x014e:
            android.content.Context r8 = r7.f11795r0
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24658Z
            android.graphics.drawable.Drawable r8 = p174e.p319f.p320a.p363d.p379x.C9062c.m30200d(r8, r9, r10)
            r7.mo13109r1(r8)
            android.content.Context r8 = r7.f11795r0
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24549D0
            e.f.a.d.l.h r8 = p174e.p319f.p320a.p363d.p366l.C9032h.m30132b(r8, r9, r10)
            r7.mo13110r2(r8)
            android.content.Context r8 = r7.f11795r0
            int r10 = p174e.p319f.p320a.p363d.C9024k.f24808y0
            e.f.a.d.l.h r8 = p174e.p319f.p320a.p363d.p366l.C9032h.m30132b(r8, r9, r10)
            r7.mo13088h2(r8)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24736m0
            float r8 = r9.getDimension(r8, r0)
            r7.mo13038L1(r8)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24533A0
            float r8 = r9.getDimension(r8, r0)
            r7.mo13096l2(r8)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24814z0
            float r8 = r9.getDimension(r8, r0)
            r7.mo13093j2(r8)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24559F0
            float r8 = r9.getDimension(r8, r0)
            r7.mo13129y2(r8)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24554E0
            float r8 = r9.getDimension(r8, r0)
            r7.mo13125w2(r8)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24784u0
            float r8 = r9.getDimension(r8, r0)
            r7.mo13065Z1(r8)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24772s0
            float r8 = r9.getDimension(r8, r0)
            r7.mo13055U1(r8)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24688e0
            float r8 = r9.getDimension(r8, r0)
            r7.mo13130z1(r8)
            int r8 = p174e.p319f.p320a.p363d.C9024k.f24643W
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r9.getDimensionPixelSize(r8, r10)
            r7.mo13099n2(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C4188a.m15891m1(android.util.AttributeSet, int, int):void");
    }

    /* renamed from: n0 */
    private float m15892n0() {
        this.f11802y0.mo13506e().getFontMetrics(this.f11798u0);
        Paint.FontMetrics fontMetrics = this.f11798u0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15893o1(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f11754L
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f11803z0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.f11803z0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.f11803z0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.f11756M
            if (r3 == 0) goto L_0x0024
            int r5 = r6.f11743A0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.f11743A0
            if (r5 == r3) goto L_0x002c
            r6.f11743A0 = r3
            r0 = 1
        L_0x002c:
            int r1 = p174e.p319f.p320a.p363d.p372q.C9052a.m30174e(r1, r3)
            int r3 = r6.f11744B0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            android.content.res.ColorStateList r5 = r6.mo22840w()
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r6.f11744B0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.mo22819T(r0)
            r0 = 1
        L_0x004d:
            android.content.res.ColorStateList r1 = r6.f11762P
            if (r1 == 0) goto L_0x0058
            int r3 = r6.f11745C0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r3 = r6.f11745C0
            if (r3 == r1) goto L_0x0060
            r6.f11745C0 = r1
            r0 = 1
        L_0x0060:
            android.content.res.ColorStateList r1 = r6.f11761O0
            if (r1 == 0) goto L_0x0073
            boolean r1 = p174e.p319f.p320a.p363d.p380y.C9071b.m30224b(r7)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r6.f11761O0
            int r3 = r6.f11746D0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r3 = r6.f11746D0
            if (r3 == r1) goto L_0x007f
            r6.f11746D0 = r1
            boolean r1 = r6.f11759N0
            if (r1 == 0) goto L_0x007f
            r0 = 1
        L_0x007f:
            com.google.android.material.internal.f r1 = r6.f11802y0
            e.f.a.d.x.d r1 = r1.mo13505d()
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.f r1 = r6.f11802y0
            e.f.a.d.x.d r1 = r1.mo13505d()
            android.content.res.ColorStateList r1 = r1.f24882b
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.f r1 = r6.f11802y0
            e.f.a.d.x.d r1 = r1.mo13505d()
            android.content.res.ColorStateList r1 = r1.f24882b
            int r3 = r6.f11747E0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            int r3 = r6.f11747E0
            if (r3 == r1) goto L_0x00a8
            r6.f11747E0 = r1
            r0 = 1
        L_0x00a8:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m15882f1(r1, r3)
            if (r1 == 0) goto L_0x00bb
            boolean r1 = r6.f11782e0
            if (r1 == 0) goto L_0x00bb
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            boolean r3 = r6.f11748F0
            if (r3 == r1) goto L_0x00d6
            android.graphics.drawable.Drawable r3 = r6.f11784g0
            if (r3 == 0) goto L_0x00d6
            float r0 = r6.mo13086h0()
            r6.f11748F0 = r1
            float r1 = r6.mo13086h0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            r1 = 1
            goto L_0x00d7
        L_0x00d5:
            r0 = 1
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            android.content.res.ColorStateList r3 = r6.f11753K0
            if (r3 == 0) goto L_0x00e2
            int r5 = r6.f11749G0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            int r5 = r6.f11749G0
            if (r5 == r3) goto L_0x00f4
            r6.f11749G0 = r3
            android.content.res.ColorStateList r0 = r6.f11753K0
            android.graphics.PorterDuff$Mode r3 = r6.f11755L0
            android.graphics.PorterDuffColorFilter r0 = p174e.p319f.p320a.p363d.p374s.C9054a.m30177a(r6, r0, r3)
            r6.f11752J0 = r0
            goto L_0x00f5
        L_0x00f4:
            r4 = r0
        L_0x00f5:
            android.graphics.drawable.Drawable r0 = r6.f11772U
            boolean r0 = m15888k1(r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.drawable.Drawable r0 = r6.f11772U
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0104:
            android.graphics.drawable.Drawable r0 = r6.f11784g0
            boolean r0 = m15888k1(r0)
            if (r0 == 0) goto L_0x0113
            android.graphics.drawable.Drawable r0 = r6.f11784g0
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0113:
            android.graphics.drawable.Drawable r0 = r6.f11777Z
            boolean r0 = m15888k1(r0)
            if (r0 == 0) goto L_0x0130
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.f11777Z
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0130:
            boolean r7 = p174e.p319f.p320a.p363d.p380y.C9071b.f24905a
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.f11778a0
            boolean r7 = m15888k1(r7)
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.f11778a0
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x0143:
            if (r4 == 0) goto L_0x0148
            r6.invalidateSelf()
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r6.mo13098n1()
        L_0x014d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C4188a.m15893o1(int[], int[]):boolean");
    }

    /* renamed from: p0 */
    private boolean m15894p0() {
        return this.f11783f0 && this.f11784g0 != null && this.f11782e0;
    }

    /* renamed from: q0 */
    public static C4188a m15895q0(Context context, AttributeSet attributeSet, int i, int i2) {
        C4188a aVar = new C4188a(context, attributeSet, i, i2);
        aVar.m15891m1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: r0 */
    private void m15896r0(Canvas canvas, Rect rect) {
        if (m15873C2()) {
            m15883g0(rect, this.f11799v0);
            RectF rectF = this.f11799v0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f11784g0.setBounds(0, 0, (int) this.f11799v0.width(), (int) this.f11799v0.height());
            this.f11784g0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: s0 */
    private void m15897s0(Canvas canvas, Rect rect) {
        if (!this.f11771T0) {
            this.f11796s0.setColor(this.f11743A0);
            this.f11796s0.setStyle(Paint.Style.FILL);
            this.f11796s0.setColorFilter(m15880d1());
            this.f11799v0.set(rect);
            canvas.drawRoundRect(this.f11799v0, mo13019C0(), mo13019C0(), this.f11796s0);
        }
    }

    /* renamed from: t0 */
    private void m15898t0(Canvas canvas, Rect rect) {
        if (m15874D2()) {
            m15883g0(rect, this.f11799v0);
            RectF rectF = this.f11799v0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f11772U.setBounds(0, 0, (int) this.f11799v0.width(), (int) this.f11799v0.height());
            this.f11772U.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: u0 */
    private void m15899u0(Canvas canvas, Rect rect) {
        if (this.f11764Q > 0.0f && !this.f11771T0) {
            this.f11796s0.setColor(this.f11745C0);
            this.f11796s0.setStyle(Paint.Style.STROKE);
            if (!this.f11771T0) {
                this.f11796s0.setColorFilter(m15880d1());
            }
            RectF rectF = this.f11799v0;
            float f = this.f11764Q;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f11760O - (this.f11764Q / 2.0f);
            canvas.drawRoundRect(this.f11799v0, f2, f2, this.f11796s0);
        }
    }

    /* renamed from: v0 */
    private void m15900v0(Canvas canvas, Rect rect) {
        if (!this.f11771T0) {
            this.f11796s0.setColor(this.f11803z0);
            this.f11796s0.setStyle(Paint.Style.FILL);
            this.f11799v0.set(rect);
            canvas.drawRoundRect(this.f11799v0, mo13019C0(), mo13019C0(), this.f11796s0);
        }
    }

    /* renamed from: w0 */
    private void m15901w0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (m15875E2()) {
            m15885j0(rect, this.f11799v0);
            RectF rectF = this.f11799v0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f11777Z.setBounds(0, 0, (int) this.f11799v0.width(), (int) this.f11799v0.height());
            if (C9071b.f24905a) {
                this.f11778a0.setBounds(this.f11777Z.getBounds());
                this.f11778a0.jumpToCurrentState();
                drawable = this.f11778a0;
            } else {
                drawable = this.f11777Z;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: x0 */
    private void m15902x0(Canvas canvas, Rect rect) {
        this.f11796s0.setColor(this.f11746D0);
        this.f11796s0.setStyle(Paint.Style.FILL);
        this.f11799v0.set(rect);
        if (!this.f11771T0) {
            canvas.drawRoundRect(this.f11799v0, mo13019C0(), mo13019C0(), this.f11796s0);
            return;
        }
        mo22828g(new RectF(rect), this.f11801x0);
        super.mo22834o(canvas, this.f11796s0, this.f11801x0, mo22838t());
    }

    /* renamed from: y0 */
    private void m15903y0(Canvas canvas, Rect rect) {
        Paint paint = this.f11797t0;
        if (paint != null) {
            paint.setColor(C1827a.m7759h(-16777216, 127));
            canvas.drawRect(rect, this.f11797t0);
            if (m15874D2() || m15873C2()) {
                m15883g0(rect, this.f11799v0);
                canvas.drawRect(this.f11799v0, this.f11797t0);
            }
            if (this.f11768S != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f11797t0);
            }
            if (m15875E2()) {
                m15885j0(rect, this.f11799v0);
                canvas.drawRect(this.f11799v0, this.f11797t0);
            }
            this.f11797t0.setColor(C1827a.m7759h(-65536, 127));
            m15884i0(rect, this.f11799v0);
            canvas.drawRect(this.f11799v0, this.f11797t0);
            this.f11797t0.setColor(C1827a.m7759h(-16711936, 127));
            m15887k0(rect, this.f11799v0);
            canvas.drawRect(this.f11799v0, this.f11797t0);
        }
    }

    /* renamed from: z0 */
    private void m15904z0(Canvas canvas, Rect rect) {
        if (this.f11768S != null) {
            Paint.Align o0 = mo13100o0(rect, this.f11800w0);
            m15890m0(rect, this.f11799v0);
            if (this.f11802y0.mo13505d() != null) {
                this.f11802y0.mo13506e().drawableState = getState();
                this.f11802y0.mo13511j(this.f11795r0);
            }
            this.f11802y0.mo13506e().setTextAlign(o0);
            int i = 0;
            boolean z = Math.round(this.f11802y0.mo13507f(mo13064Z0().toString())) > Math.round(this.f11799v0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f11799v0);
            }
            CharSequence charSequence = this.f11768S;
            if (z && this.f11765Q0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f11802y0.mo13506e(), this.f11799v0.width(), this.f11765Q0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f11800w0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f11802y0.mo13506e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: A0 */
    public Drawable mo13013A0() {
        return this.f11784g0;
    }

    /* renamed from: A1 */
    public void mo13014A1(int i) {
        mo13130z1(this.f11795r0.getResources().getDimension(i));
    }

    /* renamed from: A2 */
    public void mo13015A2(boolean z) {
        if (this.f11759N0 != z) {
            this.f11759N0 = z;
            m15877G2();
            onStateChange(getState());
        }
    }

    /* renamed from: B0 */
    public ColorStateList mo13016B0() {
        return this.f11756M;
    }

    /* renamed from: B1 */
    public void mo13017B1(Drawable drawable) {
        Drawable E0 = mo13023E0();
        if (E0 != drawable) {
            float h0 = mo13086h0();
            this.f11772U = drawable != null ? C1164a.m4554r(drawable).mutate() : null;
            float h02 = mo13086h0();
            m15876F2(E0);
            if (m15874D2()) {
                m15881f0(this.f11772U);
            }
            invalidateSelf();
            if (h0 != h02) {
                mo13098n1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public boolean mo13018B2() {
        return this.f11767R0;
    }

    /* renamed from: C0 */
    public float mo13019C0() {
        return this.f11771T0 ? mo22811E() : this.f11760O;
    }

    /* renamed from: C1 */
    public void mo13020C1(int i) {
        mo13017B1(C1445a.m6446d(this.f11795r0, i));
    }

    /* renamed from: D0 */
    public float mo13021D0() {
        return this.f11794q0;
    }

    /* renamed from: D1 */
    public void mo13022D1(float f) {
        if (this.f11774W != f) {
            float h0 = mo13086h0();
            this.f11774W = f;
            float h02 = mo13086h0();
            invalidateSelf();
            if (h0 != h02) {
                mo13098n1();
            }
        }
    }

    /* renamed from: E0 */
    public Drawable mo13023E0() {
        Drawable drawable = this.f11772U;
        if (drawable != null) {
            return C1164a.m4553q(drawable);
        }
        return null;
    }

    /* renamed from: E1 */
    public void mo13024E1(int i) {
        mo13022D1(this.f11795r0.getResources().getDimension(i));
    }

    /* renamed from: F0 */
    public float mo13025F0() {
        return this.f11774W;
    }

    /* renamed from: F1 */
    public void mo13026F1(ColorStateList colorStateList) {
        this.f11775X = true;
        if (this.f11773V != colorStateList) {
            this.f11773V = colorStateList;
            if (m15874D2()) {
                C1164a.m4551o(this.f11772U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: G0 */
    public ColorStateList mo13027G0() {
        return this.f11773V;
    }

    /* renamed from: G1 */
    public void mo13028G1(int i) {
        mo13026F1(C1445a.m6445c(this.f11795r0, i));
    }

    /* renamed from: H0 */
    public float mo13029H0() {
        return this.f11758N;
    }

    /* renamed from: H1 */
    public void mo13030H1(int i) {
        mo13032I1(this.f11795r0.getResources().getBoolean(i));
    }

    /* renamed from: I0 */
    public float mo13031I0() {
        return this.f11787j0;
    }

    /* renamed from: I1 */
    public void mo13032I1(boolean z) {
        if (this.f11770T != z) {
            boolean D2 = m15874D2();
            this.f11770T = z;
            boolean D22 = m15874D2();
            if (D2 != D22) {
                if (D22) {
                    m15881f0(this.f11772U);
                } else {
                    m15876F2(this.f11772U);
                }
                invalidateSelf();
                mo13098n1();
            }
        }
    }

    /* renamed from: J0 */
    public ColorStateList mo13033J0() {
        return this.f11762P;
    }

    /* renamed from: J1 */
    public void mo13034J1(float f) {
        if (this.f11758N != f) {
            this.f11758N = f;
            invalidateSelf();
            mo13098n1();
        }
    }

    /* renamed from: K0 */
    public float mo13035K0() {
        return this.f11764Q;
    }

    /* renamed from: K1 */
    public void mo13036K1(int i) {
        mo13034J1(this.f11795r0.getResources().getDimension(i));
    }

    /* renamed from: L0 */
    public Drawable mo13037L0() {
        Drawable drawable = this.f11777Z;
        if (drawable != null) {
            return C1164a.m4553q(drawable);
        }
        return null;
    }

    /* renamed from: L1 */
    public void mo13038L1(float f) {
        if (this.f11787j0 != f) {
            this.f11787j0 = f;
            invalidateSelf();
            mo13098n1();
        }
    }

    /* renamed from: M0 */
    public CharSequence mo13039M0() {
        return this.f11781d0;
    }

    /* renamed from: M1 */
    public void mo13040M1(int i) {
        mo13038L1(this.f11795r0.getResources().getDimension(i));
    }

    /* renamed from: N0 */
    public float mo13041N0() {
        return this.f11793p0;
    }

    /* renamed from: N1 */
    public void mo13042N1(ColorStateList colorStateList) {
        if (this.f11762P != colorStateList) {
            this.f11762P = colorStateList;
            if (this.f11771T0) {
                mo22826a0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: O0 */
    public float mo13043O0() {
        return this.f11780c0;
    }

    /* renamed from: O1 */
    public void mo13044O1(int i) {
        mo13042N1(C1445a.m6445c(this.f11795r0, i));
    }

    /* renamed from: P0 */
    public float mo13045P0() {
        return this.f11792o0;
    }

    /* renamed from: P1 */
    public void mo13046P1(float f) {
        if (this.f11764Q != f) {
            this.f11764Q = f;
            this.f11796s0.setStrokeWidth(f);
            if (this.f11771T0) {
                super.mo22827b0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: Q0 */
    public int[] mo13047Q0() {
        return this.f11757M0;
    }

    /* renamed from: Q1 */
    public void mo13048Q1(int i) {
        mo13046P1(this.f11795r0.getResources().getDimension(i));
    }

    /* renamed from: R0 */
    public ColorStateList mo13049R0() {
        return this.f11779b0;
    }

    /* renamed from: S0 */
    public void mo13050S0(RectF rectF) {
        m15887k0(getBounds(), rectF);
    }

    /* renamed from: S1 */
    public void mo13051S1(Drawable drawable) {
        Drawable L0 = mo13037L0();
        if (L0 != drawable) {
            float l0 = mo13095l0();
            this.f11777Z = drawable != null ? C1164a.m4554r(drawable).mutate() : null;
            if (C9071b.f24905a) {
                m15878H2();
            }
            float l02 = mo13095l0();
            m15876F2(L0);
            if (m15875E2()) {
                m15881f0(this.f11777Z);
            }
            invalidateSelf();
            if (l0 != l02) {
                mo13098n1();
            }
        }
    }

    /* renamed from: T0 */
    public TextUtils.TruncateAt mo13052T0() {
        return this.f11765Q0;
    }

    /* renamed from: T1 */
    public void mo13053T1(CharSequence charSequence) {
        if (this.f11781d0 != charSequence) {
            this.f11781d0 = C1888a.m7931c().mo6403h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: U0 */
    public C9032h mo13054U0() {
        return this.f11786i0;
    }

    /* renamed from: U1 */
    public void mo13055U1(float f) {
        if (this.f11793p0 != f) {
            this.f11793p0 = f;
            invalidateSelf();
            if (m15875E2()) {
                mo13098n1();
            }
        }
    }

    /* renamed from: V0 */
    public float mo13056V0() {
        return this.f11789l0;
    }

    /* renamed from: V1 */
    public void mo13057V1(int i) {
        mo13055U1(this.f11795r0.getResources().getDimension(i));
    }

    /* renamed from: W0 */
    public float mo13058W0() {
        return this.f11788k0;
    }

    /* renamed from: W1 */
    public void mo13059W1(int i) {
        mo13051S1(C1445a.m6446d(this.f11795r0, i));
    }

    /* renamed from: X0 */
    public ColorStateList mo13060X0() {
        return this.f11766R;
    }

    /* renamed from: X1 */
    public void mo13061X1(float f) {
        if (this.f11780c0 != f) {
            this.f11780c0 = f;
            invalidateSelf();
            if (m15875E2()) {
                mo13098n1();
            }
        }
    }

    /* renamed from: Y0 */
    public C9032h mo13062Y0() {
        return this.f11785h0;
    }

    /* renamed from: Y1 */
    public void mo13063Y1(int i) {
        mo13061X1(this.f11795r0.getResources().getDimension(i));
    }

    /* renamed from: Z0 */
    public CharSequence mo13064Z0() {
        return this.f11768S;
    }

    /* renamed from: Z1 */
    public void mo13065Z1(float f) {
        if (this.f11792o0 != f) {
            this.f11792o0 = f;
            invalidateSelf();
            if (m15875E2()) {
                mo13098n1();
            }
        }
    }

    /* renamed from: a */
    public void mo13066a() {
        mo13098n1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public C9063d mo13067a1() {
        return this.f11802y0.mo13505d();
    }

    /* renamed from: a2 */
    public void mo13068a2(int i) {
        mo13065Z1(this.f11795r0.getResources().getDimension(i));
    }

    /* renamed from: b1 */
    public float mo13069b1() {
        return this.f11791n0;
    }

    /* renamed from: b2 */
    public boolean mo13070b2(int[] iArr) {
        if (Arrays.equals(this.f11757M0, iArr)) {
            return false;
        }
        this.f11757M0 = iArr;
        if (m15875E2()) {
            return m15893o1(getState(), iArr);
        }
        return false;
    }

    /* renamed from: c1 */
    public float mo13071c1() {
        return this.f11790m0;
    }

    /* renamed from: c2 */
    public void mo13072c2(ColorStateList colorStateList) {
        if (this.f11779b0 != colorStateList) {
            this.f11779b0 = colorStateList;
            if (m15875E2()) {
                C1164a.m4551o(this.f11777Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: d2 */
    public void mo13073d2(int i) {
        mo13072c2(C1445a.m6445c(this.f11795r0, i));
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f11750H0;
            if (i2 < 255) {
                i = C9036a.m30150a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m15900v0(canvas, bounds);
            m15897s0(canvas, bounds);
            if (this.f11771T0) {
                super.draw(canvas);
            }
            m15899u0(canvas, bounds);
            m15902x0(canvas, bounds);
            m15898t0(canvas, bounds);
            m15896r0(canvas, bounds);
            if (this.f11767R0) {
                m15904z0(canvas, bounds);
            }
            m15901w0(canvas, bounds);
            m15903y0(canvas, bounds);
            if (this.f11750H0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public boolean mo13075e1() {
        return this.f11759N0;
    }

    /* renamed from: e2 */
    public void mo13076e2(boolean z) {
        if (this.f11776Y != z) {
            boolean E2 = m15875E2();
            this.f11776Y = z;
            boolean E22 = m15875E2();
            if (E2 != E22) {
                if (E22) {
                    m15881f0(this.f11777Z);
                } else {
                    m15876F2(this.f11777Z);
                }
                invalidateSelf();
                mo13098n1();
            }
        }
    }

    /* renamed from: f2 */
    public void mo13077f2(C4189a aVar) {
        this.f11763P0 = new WeakReference<>(aVar);
    }

    /* renamed from: g1 */
    public boolean mo13078g1() {
        return this.f11782e0;
    }

    /* renamed from: g2 */
    public void mo13079g2(TextUtils.TruncateAt truncateAt) {
        this.f11765Q0 = truncateAt;
    }

    public int getAlpha() {
        return this.f11750H0;
    }

    public ColorFilter getColorFilter() {
        return this.f11751I0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f11758N;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f11787j0 + mo13086h0() + this.f11790m0 + this.f11802y0.mo13507f(mo13064Z0().toString()) + this.f11791n0 + mo13095l0() + this.f11794q0), this.f11769S0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f11771T0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f11760O);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f11760O);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public float mo13086h0() {
        if (m15874D2() || m15873C2()) {
            return this.f11788k0 + this.f11774W + this.f11789l0;
        }
        return 0.0f;
    }

    /* renamed from: h1 */
    public boolean mo13087h1() {
        return m15888k1(this.f11777Z);
    }

    /* renamed from: h2 */
    public void mo13088h2(C9032h hVar) {
        this.f11786i0 = hVar;
    }

    /* renamed from: i1 */
    public boolean mo13089i1() {
        return this.f11776Y;
    }

    /* renamed from: i2 */
    public void mo13090i2(int i) {
        mo13088h2(C9032h.m30133c(this.f11795r0, i));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m15886j1(this.f11754L) || m15886j1(this.f11756M) || m15886j1(this.f11762P) || (this.f11759N0 && m15886j1(this.f11761O0)) || m15889l1(this.f11802y0.mo13505d()) || m15894p0() || m15888k1(this.f11772U) || m15888k1(this.f11784g0) || m15886j1(this.f11753K0);
    }

    /* renamed from: j2 */
    public void mo13093j2(float f) {
        if (this.f11789l0 != f) {
            float h0 = mo13086h0();
            this.f11789l0 = f;
            float h02 = mo13086h0();
            invalidateSelf();
            if (h0 != h02) {
                mo13098n1();
            }
        }
    }

    /* renamed from: k2 */
    public void mo13094k2(int i) {
        mo13093j2(this.f11795r0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public float mo13095l0() {
        if (m15875E2()) {
            return this.f11792o0 + this.f11780c0 + this.f11793p0;
        }
        return 0.0f;
    }

    /* renamed from: l2 */
    public void mo13096l2(float f) {
        if (this.f11788k0 != f) {
            float h0 = mo13086h0();
            this.f11788k0 = f;
            float h02 = mo13086h0();
            invalidateSelf();
            if (h0 != h02) {
                mo13098n1();
            }
        }
    }

    /* renamed from: m2 */
    public void mo13097m2(int i) {
        mo13096l2(this.f11795r0.getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n1 */
    public void mo13098n1() {
        C4189a aVar = (C4189a) this.f11763P0.get();
        if (aVar != null) {
            aVar.mo12840a();
        }
    }

    /* renamed from: n2 */
    public void mo13099n2(int i) {
        this.f11769S0 = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public Paint.Align mo13100o0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f11768S != null) {
            float h0 = this.f11787j0 + mo13086h0() + this.f11790m0;
            if (C1164a.m4542f(this) == 0) {
                pointF.x = ((float) rect.left) + h0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - h0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m15892n0();
        }
        return align;
    }

    /* renamed from: o2 */
    public void mo13101o2(ColorStateList colorStateList) {
        if (this.f11766R != colorStateList) {
            this.f11766R = colorStateList;
            m15877G2();
            onStateChange(getState());
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m15874D2()) {
            onLayoutDirectionChanged |= C1164a.m4549m(this.f11772U, i);
        }
        if (m15873C2()) {
            onLayoutDirectionChanged |= C1164a.m4549m(this.f11784g0, i);
        }
        if (m15875E2()) {
            onLayoutDirectionChanged |= C1164a.m4549m(this.f11777Z, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m15874D2()) {
            onLevelChange |= this.f11772U.setLevel(i);
        }
        if (m15873C2()) {
            onLevelChange |= this.f11784g0.setLevel(i);
        }
        if (m15875E2()) {
            onLevelChange |= this.f11777Z.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f11771T0) {
            super.onStateChange(iArr);
        }
        return m15893o1(iArr, mo13047Q0());
    }

    /* renamed from: p1 */
    public void mo13105p1(boolean z) {
        if (this.f11782e0 != z) {
            this.f11782e0 = z;
            float h0 = mo13086h0();
            if (!z && this.f11748F0) {
                this.f11748F0 = false;
            }
            float h02 = mo13086h0();
            invalidateSelf();
            if (h0 != h02) {
                mo13098n1();
            }
        }
    }

    /* renamed from: p2 */
    public void mo13106p2(int i) {
        mo13101o2(C1445a.m6445c(this.f11795r0, i));
    }

    /* renamed from: q1 */
    public void mo13107q1(int i) {
        mo13105p1(this.f11795r0.getResources().getBoolean(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q2 */
    public void mo13108q2(boolean z) {
        this.f11767R0 = z;
    }

    /* renamed from: r1 */
    public void mo13109r1(Drawable drawable) {
        if (this.f11784g0 != drawable) {
            float h0 = mo13086h0();
            this.f11784g0 = drawable;
            float h02 = mo13086h0();
            m15876F2(this.f11784g0);
            m15881f0(this.f11784g0);
            invalidateSelf();
            if (h0 != h02) {
                mo13098n1();
            }
        }
    }

    /* renamed from: r2 */
    public void mo13110r2(C9032h hVar) {
        this.f11785h0 = hVar;
    }

    /* renamed from: s1 */
    public void mo13111s1(int i) {
        mo13109r1(C1445a.m6446d(this.f11795r0, i));
    }

    /* renamed from: s2 */
    public void mo13112s2(int i) {
        mo13110r2(C9032h.m30133c(this.f11795r0, i));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f11750H0 != i) {
            this.f11750H0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f11751I0 != colorFilter) {
            this.f11751I0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f11753K0 != colorStateList) {
            this.f11753K0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f11755L0 != mode) {
            this.f11755L0 = mode;
            this.f11752J0 = C9054a.m30177a(this, this.f11753K0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m15874D2()) {
            visible |= this.f11772U.setVisible(z, z2);
        }
        if (m15873C2()) {
            visible |= this.f11784g0.setVisible(z, z2);
        }
        if (m15875E2()) {
            visible |= this.f11777Z.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t1 */
    public void mo13117t1(int i) {
        mo13119u1(this.f11795r0.getResources().getBoolean(i));
    }

    /* renamed from: t2 */
    public void mo13118t2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!TextUtils.equals(this.f11768S, charSequence)) {
            this.f11768S = charSequence;
            this.f11802y0.mo13510i(true);
            invalidateSelf();
            mo13098n1();
        }
    }

    /* renamed from: u1 */
    public void mo13119u1(boolean z) {
        if (this.f11783f0 != z) {
            boolean C2 = m15873C2();
            this.f11783f0 = z;
            boolean C22 = m15873C2();
            if (C2 != C22) {
                if (C22) {
                    m15881f0(this.f11784g0);
                } else {
                    m15876F2(this.f11784g0);
                }
                invalidateSelf();
                mo13098n1();
            }
        }
    }

    /* renamed from: u2 */
    public void mo13120u2(C9063d dVar) {
        this.f11802y0.mo13509h(dVar, this.f11795r0);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public void mo13122v1(ColorStateList colorStateList) {
        if (this.f11756M != colorStateList) {
            this.f11756M = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: v2 */
    public void mo13123v2(int i) {
        mo13120u2(new C9063d(this.f11795r0, i));
    }

    /* renamed from: w1 */
    public void mo13124w1(int i) {
        mo13122v1(C1445a.m6445c(this.f11795r0, i));
    }

    /* renamed from: w2 */
    public void mo13125w2(float f) {
        if (this.f11791n0 != f) {
            this.f11791n0 = f;
            invalidateSelf();
            mo13098n1();
        }
    }

    @Deprecated
    /* renamed from: x1 */
    public void mo13126x1(float f) {
        if (this.f11760O != f) {
            this.f11760O = f;
            setShapeAppearanceModel(mo22809B().mo22865w(f));
        }
    }

    /* renamed from: x2 */
    public void mo13127x2(int i) {
        mo13125w2(this.f11795r0.getResources().getDimension(i));
    }

    @Deprecated
    /* renamed from: y1 */
    public void mo13128y1(int i) {
        mo13126x1(this.f11795r0.getResources().getDimension(i));
    }

    /* renamed from: y2 */
    public void mo13129y2(float f) {
        if (this.f11790m0 != f) {
            this.f11790m0 = f;
            invalidateSelf();
            mo13098n1();
        }
    }

    /* renamed from: z1 */
    public void mo13130z1(float f) {
        if (this.f11794q0 != f) {
            this.f11794q0 = f;
            invalidateSelf();
            mo13098n1();
        }
    }

    /* renamed from: z2 */
    public void mo13131z2(int i) {
        mo13129y2(this.f11795r0.getResources().getDimension(i));
    }
}
