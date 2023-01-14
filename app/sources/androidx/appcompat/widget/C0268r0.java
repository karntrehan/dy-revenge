package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.widget.C1194i;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p027c.p028a.C1435a;
import p027c.p028a.C1444j;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p028a.p034n.C1464a;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.widget.r0 */
public class C0268r0 extends CompoundButton {

    /* renamed from: f */
    private static final Property<C0268r0, Float> f1142f = new C0269a(Float.class, "thumbPos");

    /* renamed from: o */
    private static final int[] f1143o = {16842912};

    /* renamed from: A */
    private int f1144A;

    /* renamed from: B */
    private int f1145B;

    /* renamed from: C */
    private boolean f1146C;

    /* renamed from: D */
    private CharSequence f1147D;

    /* renamed from: E */
    private CharSequence f1148E;

    /* renamed from: F */
    private boolean f1149F;

    /* renamed from: G */
    private int f1150G;

    /* renamed from: H */
    private int f1151H;

    /* renamed from: I */
    private float f1152I;

    /* renamed from: J */
    private float f1153J;

    /* renamed from: K */
    private VelocityTracker f1154K;

    /* renamed from: L */
    private int f1155L;

    /* renamed from: M */
    float f1156M;

    /* renamed from: N */
    private int f1157N;

    /* renamed from: O */
    private int f1158O;

    /* renamed from: P */
    private int f1159P;

    /* renamed from: Q */
    private int f1160Q;

    /* renamed from: R */
    private int f1161R;

    /* renamed from: S */
    private int f1162S;

    /* renamed from: T */
    private int f1163T;

    /* renamed from: U */
    private final TextPaint f1164U;

    /* renamed from: V */
    private ColorStateList f1165V;

    /* renamed from: W */
    private Layout f1166W;

    /* renamed from: a0 */
    private Layout f1167a0;

    /* renamed from: b0 */
    private TransformationMethod f1168b0;

    /* renamed from: c0 */
    ObjectAnimator f1169c0;

    /* renamed from: d0 */
    private final C0293y f1170d0;

    /* renamed from: e0 */
    private final Rect f1171e0;

    /* renamed from: p */
    private Drawable f1172p;

    /* renamed from: q */
    private ColorStateList f1173q;

    /* renamed from: r */
    private PorterDuff.Mode f1174r;

    /* renamed from: s */
    private boolean f1175s;

    /* renamed from: t */
    private boolean f1176t;

    /* renamed from: u */
    private Drawable f1177u;

    /* renamed from: v */
    private ColorStateList f1178v;

    /* renamed from: w */
    private PorterDuff.Mode f1179w;

    /* renamed from: x */
    private boolean f1180x;

    /* renamed from: y */
    private boolean f1181y;

    /* renamed from: z */
    private int f1182z;

    /* renamed from: androidx.appcompat.widget.r0$a */
    class C0269a extends Property<C0268r0, Float> {
        C0269a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C0268r0 r0Var) {
            return Float.valueOf(r0Var.f1156M);
        }

        /* renamed from: b */
        public void set(C0268r0 r0Var, Float f) {
            r0Var.setThumbPosition(f.floatValue());
        }
    }

    public C0268r0(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0268r0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.switchStyle);
    }

    public C0268r0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1173q = null;
        this.f1174r = null;
        this.f1175s = false;
        this.f1176t = false;
        this.f1178v = null;
        this.f1179w = null;
        this.f1180x = false;
        this.f1181y = false;
        this.f1154K = VelocityTracker.obtain();
        this.f1171e0 = new Rect();
        C0271s0.m1349a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1164U = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C1444j.f4243I2;
        C0292x0 v = C0292x0.m1407v(context, attributeSet, iArr, i, 0);
        C1988t.m8390k0(this, context, iArr, attributeSet, v.mo1801r(), i, 0);
        Drawable g = v.mo1790g(C1444j.f4258L2);
        this.f1172p = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v.mo1790g(C1444j.f4303U2);
        this.f1177u = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        this.f1147D = v.mo1799p(C1444j.f4248J2);
        this.f1148E = v.mo1799p(C1444j.f4253K2);
        this.f1149F = v.mo1784a(C1444j.f4263M2, true);
        this.f1182z = v.mo1789f(C1444j.f4288R2, 0);
        this.f1144A = v.mo1789f(C1444j.f4273O2, 0);
        this.f1145B = v.mo1789f(C1444j.f4278P2, 0);
        this.f1146C = v.mo1784a(C1444j.f4268N2, false);
        ColorStateList c = v.mo1786c(C1444j.f4293S2);
        if (c != null) {
            this.f1173q = c;
            this.f1175s = true;
        }
        PorterDuff.Mode e = C0215e0.m1121e(v.mo1794k(C1444j.f4298T2, -1), (PorterDuff.Mode) null);
        if (this.f1174r != e) {
            this.f1174r = e;
            this.f1176t = true;
        }
        if (this.f1175s || this.f1176t) {
            m1336b();
        }
        ColorStateList c2 = v.mo1786c(C1444j.f4308V2);
        if (c2 != null) {
            this.f1178v = c2;
            this.f1180x = true;
        }
        PorterDuff.Mode e2 = C0215e0.m1121e(v.mo1794k(C1444j.f4313W2, -1), (PorterDuff.Mode) null);
        if (this.f1179w != e2) {
            this.f1179w = e2;
            this.f1181y = true;
        }
        if (this.f1180x || this.f1181y) {
            m1337c();
        }
        int n = v.mo1797n(C1444j.f4283Q2, 0);
        if (n != 0) {
            mo1659i(context, n);
        }
        C0293y yVar = new C0293y(this);
        this.f1170d0 = yVar;
        yVar.mo1814m(attributeSet, i);
        v.mo1803w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1151H = viewConfiguration.getScaledTouchSlop();
        this.f1155L = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private void m1335a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1142f, new float[]{z ? 1.0f : 0.0f});
        this.f1169c0 = ofFloat;
        ofFloat.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1169c0.setAutoCancel(true);
        }
        this.f1169c0.start();
    }

    /* renamed from: b */
    private void m1336b() {
        Drawable drawable = this.f1172p;
        if (drawable == null) {
            return;
        }
        if (this.f1175s || this.f1176t) {
            Drawable mutate = C1164a.m4554r(drawable).mutate();
            this.f1172p = mutate;
            if (this.f1175s) {
                C1164a.m4551o(mutate, this.f1173q);
            }
            if (this.f1176t) {
                C1164a.m4552p(this.f1172p, this.f1174r);
            }
            if (this.f1172p.isStateful()) {
                this.f1172p.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    private void m1337c() {
        Drawable drawable = this.f1177u;
        if (drawable == null) {
            return;
        }
        if (this.f1180x || this.f1181y) {
            Drawable mutate = C1164a.m4554r(drawable).mutate();
            this.f1177u = mutate;
            if (this.f1180x) {
                C1164a.m4551o(mutate, this.f1178v);
            }
            if (this.f1181y) {
                C1164a.m4552p(this.f1177u, this.f1179w);
            }
            if (this.f1177u.isStateful()) {
                this.f1177u.setState(getDrawableState());
            }
        }
    }

    /* renamed from: d */
    private void m1338d() {
        ObjectAnimator objectAnimator = this.f1169c0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: e */
    private void m1339e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: f */
    private static float m1340f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: g */
    private boolean m1341g(float f, float f2) {
        if (this.f1172p == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1172p.getPadding(this.f1171e0);
        int i = this.f1161R;
        int i2 = this.f1151H;
        int i3 = i - i2;
        int i4 = (this.f1160Q + thumbOffset) - i2;
        Rect rect = this.f1171e0;
        return f > ((float) i4) && f < ((float) ((((this.f1159P + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f1163T + i2));
    }

    private boolean getTargetCheckedState() {
        return this.f1156M > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0213d1.m1104b(this) ? 1.0f - this.f1156M : this.f1156M) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1177u;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1171e0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1172p;
        Rect d = drawable2 != null ? C0215e0.m1120d(drawable2) : C0215e0.f949c;
        return ((((this.f1157N - this.f1159P) - rect.left) - rect.right) - d.left) - d.right;
    }

    /* renamed from: h */
    private Layout m1342h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1168b0;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f1164U;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: k */
    private void m1343k(int i, int i2) {
        mo1660j(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* renamed from: l */
    private void m1344l(MotionEvent motionEvent) {
        this.f1150G = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f1154K.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
            float xVelocity = this.f1154K.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f1155L)) {
                z = getTargetCheckedState();
            } else if (!C0213d1.m1104b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m1339e(motionEvent);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f1171e0;
        int i3 = this.f1160Q;
        int i4 = this.f1161R;
        int i5 = this.f1162S;
        int i6 = this.f1163T;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1172p;
        Rect d = drawable != null ? C0215e0.m1120d(drawable) : C0215e0.f949c;
        Drawable drawable2 = this.f1177u;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d != null) {
                int i8 = d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1177u.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1177u.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1172p;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f1159P + rect.right;
            this.f1172p.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C1164a.m4548l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f1172p;
        if (drawable != null) {
            C1164a.m4547k(drawable, f, f2);
        }
        Drawable drawable2 = this.f1177u;
        if (drawable2 != null) {
            C1164a.m4547k(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1172p;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1177u;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0213d1.m1104b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1157N;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1145B : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0213d1.m1104b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1157N;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1145B : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1149F;
    }

    public boolean getSplitTrack() {
        return this.f1146C;
    }

    public int getSwitchMinWidth() {
        return this.f1144A;
    }

    public int getSwitchPadding() {
        return this.f1145B;
    }

    public CharSequence getTextOff() {
        return this.f1148E;
    }

    public CharSequence getTextOn() {
        return this.f1147D;
    }

    public Drawable getThumbDrawable() {
        return this.f1172p;
    }

    public int getThumbTextPadding() {
        return this.f1182z;
    }

    public ColorStateList getThumbTintList() {
        return this.f1173q;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1174r;
    }

    public Drawable getTrackDrawable() {
        return this.f1177u;
    }

    public ColorStateList getTrackTintList() {
        return this.f1178v;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1179w;
    }

    /* renamed from: i */
    public void mo1659i(Context context, int i) {
        C0292x0 t = C0292x0.m1405t(context, i, C1444j.f4318X2);
        ColorStateList c = t.mo1786c(C1444j.f4338b3);
        if (c == null) {
            c = getTextColors();
        }
        this.f1165V = c;
        int f = t.mo1789f(C1444j.f4323Y2, 0);
        if (f != 0) {
            float f2 = (float) f;
            if (f2 != this.f1164U.getTextSize()) {
                this.f1164U.setTextSize(f2);
                requestLayout();
            }
        }
        m1343k(t.mo1794k(C1444j.f4328Z2, -1), t.mo1794k(C1444j.f4333a3, -1));
        this.f1168b0 = t.mo1784a(C1444j.f4373i3, false) ? new C1464a(getContext()) : null;
        t.mo1803w();
    }

    /* renamed from: j */
    public void mo1660j(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
            TextPaint textPaint = this.f1164U;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f1164U;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f1164U.setFakeBoldText(false);
        this.f1164U.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1172p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1177u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1169c0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1169c0.end();
            this.f1169c0 = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1143o);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1171e0;
        Drawable drawable = this.f1177u;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1161R;
        int i3 = this.f1163T;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1172p;
        if (drawable != null) {
            if (!this.f1146C || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0215e0.m1120d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1166W : this.f1167a0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1165V;
            if (colorStateList != null) {
                this.f1164U.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1164U.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1147D : this.f1148E;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1172p != null) {
            Rect rect = this.f1171e0;
            Drawable drawable = this.f1177u;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0215e0.m1120d(this.f1172p);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0213d1.m1104b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1157N + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1157N) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f1158O;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f1158O;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1158O;
            this.f1160Q = i7;
            this.f1161R = i9;
            this.f1163T = i8;
            this.f1162S = i6;
        }
        i8 = i10 + i9;
        this.f1160Q = i7;
        this.f1161R = i9;
        this.f1163T = i8;
        this.f1162S = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1149F) {
            if (this.f1166W == null) {
                this.f1166W = m1342h(this.f1147D);
            }
            if (this.f1167a0 == null) {
                this.f1167a0 = m1342h(this.f1148E);
            }
        }
        Rect rect = this.f1171e0;
        Drawable drawable = this.f1172p;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1172p.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1172p.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f1159P = Math.max(this.f1149F ? Math.max(this.f1166W.getWidth(), this.f1167a0.getWidth()) + (this.f1182z * 2) : 0, i4);
        Drawable drawable2 = this.f1177u;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1177u.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1172p;
        if (drawable3 != null) {
            Rect d = C0215e0.m1120d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f1144A, (this.f1159P * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f1157N = max;
        this.f1158O = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1147D : this.f1148E;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1154K
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.f1150G
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x001e
            goto L_0x00b9
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1152I
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            boolean r0 = androidx.appcompat.widget.C0213d1.m1104b(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.f1156M
            float r0 = r0 + r2
            float r0 = m1340f(r0, r4, r3)
            float r2 = r6.f1156M
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.f1152I = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1152I
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1151H
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.f1153J
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1151H
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.f1150G = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1152I = r0
            r6.f1153J = r3
            return r1
        L_0x008b:
            int r0 = r6.f1150G
            if (r0 != r2) goto L_0x0096
            r6.m1344l(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.f1150G = r0
            android.view.VelocityTracker r0 = r6.f1154K
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.m1341g(r0, r2)
            if (r3 == 0) goto L_0x00b9
            r6.f1150G = r1
            r6.f1152I = r0
            r6.f1153J = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0268r0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C1988t.m8361S(this)) {
            m1338d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m1335a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1194i.m4709p(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f1149F != z) {
            this.f1149F = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1146C = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1144A = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1145B = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1164U.getTypeface() != null && !this.f1164U.getTypeface().equals(typeface)) || (this.f1164U.getTypeface() == null && typeface != null)) {
            this.f1164U.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1148E = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1147D = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1172p;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1172p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f1156M = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C1445a.m6446d(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1182z = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1173q = colorStateList;
        this.f1175s = true;
        m1336b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1174r = mode;
        this.f1176t = true;
        m1336b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1177u;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1177u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C1445a.m6446d(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1178v = colorStateList;
        this.f1180x = true;
        m1337c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1179w = mode;
        this.f1181y = true;
        m1337c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1172p || drawable == this.f1177u;
    }
}
