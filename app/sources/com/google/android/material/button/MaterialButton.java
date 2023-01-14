package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0217f;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.widget.C1194i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.p364a0.C8994h;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p364a0.C9012n;

public class MaterialButton extends C0217f implements Checkable, C9012n {

    /* renamed from: p */
    private static final int[] f11674p = {16842911};

    /* renamed from: q */
    private static final int[] f11675q = {16842912};

    /* renamed from: r */
    private static final int f11676r = C9023j.Widget_MaterialComponents_Button;

    /* renamed from: A */
    private int f11677A;

    /* renamed from: B */
    private boolean f11678B;

    /* renamed from: C */
    private boolean f11679C;

    /* renamed from: D */
    private int f11680D;

    /* renamed from: s */
    private final C4179a f11681s;

    /* renamed from: t */
    private final LinkedHashSet<C4177a> f11682t;

    /* renamed from: u */
    private C4178b f11683u;

    /* renamed from: v */
    private PorterDuff.Mode f11684v;

    /* renamed from: w */
    private ColorStateList f11685w;

    /* renamed from: x */
    private Drawable f11686x;

    /* renamed from: y */
    private int f11687y;

    /* renamed from: z */
    private int f11688z;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C4177a {
        /* renamed from: a */
        void mo12814a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface C4178b {
        /* renamed from: a */
        void mo12815a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9013b.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f11676r
            android.content.Context r9 = com.google.android.material.internal.C4273g.m16424f(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f11682t = r9
            r9 = 0
            r8.f11678B = r9
            r8.f11679C = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p174e.p319f.p320a.p363d.C9024k.f24767r1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C4273g.m16429k(r0, r1, r2, r3, r4, r5)
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24550D1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f11677A = r1
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24565G1
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C4274h.m16433c(r1, r2)
            r8.f11684v = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24560F1
            android.content.res.ColorStateList r1 = p174e.p319f.p320a.p363d.p379x.C9062c.m30197a(r1, r0, r2)
            r8.f11685w = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p174e.p319f.p320a.p363d.C9024k.f24540B1
            android.graphics.drawable.Drawable r1 = p174e.p319f.p320a.p363d.p379x.C9062c.m30200d(r1, r0, r2)
            r8.f11686x = r1
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24545C1
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f11680D = r1
            int r1 = p174e.p319f.p320a.p363d.C9024k.f24555E1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f11687y = r1
            e.f.a.d.a0.k$b r10 = p174e.p319f.p320a.p363d.p364a0.C8997k.m29998e(r7, r10, r11, r6)
            e.f.a.d.a0.k r10 = r10.mo22872m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f11681s = r11
            r11.mo12828o(r0)
            r0.recycle()
            int r10 = r8.f11677A
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f11686x
            if (r10 == 0) goto L_0x0084
            r9 = 1
        L_0x0084:
            r8.m15791e(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: b */
    private boolean m15788b() {
        return C1988t.m8417y(this) == 1;
    }

    /* renamed from: c */
    private boolean m15789c() {
        C4179a aVar = this.f11681s;
        return aVar != null && !aVar.mo12826m();
    }

    /* renamed from: d */
    private void m15790d(boolean z) {
        if (z) {
            C1194i.m4702i(this, this.f11686x, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            C1194i.m4702i(this, (Drawable) null, (Drawable) null, this.f11686x, (Drawable) null);
        }
    }

    /* renamed from: e */
    private void m15791e(boolean z) {
        Drawable drawable = this.f11686x;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = C1164a.m4554r(drawable).mutate();
            this.f11686x = mutate;
            C1164a.m4551o(mutate, this.f11685w);
            PorterDuff.Mode mode = this.f11684v;
            if (mode != null) {
                C1164a.m4552p(this.f11686x, mode);
            }
            int i = this.f11687y;
            if (i == 0) {
                i = this.f11686x.getIntrinsicWidth();
            }
            int i2 = this.f11687y;
            if (i2 == 0) {
                i2 = this.f11686x.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f11686x;
            int i3 = this.f11688z;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f11680D;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            m15790d(z3);
            return;
        }
        Drawable[] a = C1194i.m4694a(this);
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[2];
        if ((z3 && drawable3 != this.f11686x) || (!z3 && drawable4 != this.f11686x)) {
            z2 = true;
        }
        if (z2) {
            m15790d(z3);
        }
    }

    /* renamed from: f */
    private void m15792f() {
        if (this.f11686x != null && getLayout() != null) {
            int i = this.f11680D;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f11688z = 0;
                m15791e(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.f11687y;
            if (i2 == 0) {
                i2 = this.f11686x.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - C1988t.m8337C(this)) - i2) - this.f11677A) - C1988t.m8339D(this)) / 2;
            boolean b = m15788b();
            if (this.f11680D != 4) {
                z = false;
            }
            if (b != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f11688z != measuredWidth) {
                this.f11688z = measuredWidth;
                m15791e(false);
            }
        }
    }

    private String getA11yClassName() {
        return (mo12766a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean mo12766a() {
        C4179a aVar = this.f11681s;
        return aVar != null && aVar.mo12827n();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m15789c()) {
            return this.f11681s.mo12817b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f11686x;
    }

    public int getIconGravity() {
        return this.f11680D;
    }

    public int getIconPadding() {
        return this.f11677A;
    }

    public int getIconSize() {
        return this.f11687y;
    }

    public ColorStateList getIconTint() {
        return this.f11685w;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11684v;
    }

    public ColorStateList getRippleColor() {
        if (m15789c()) {
            return this.f11681s.mo12820f();
        }
        return null;
    }

    public C8997k getShapeAppearanceModel() {
        if (m15789c()) {
            return this.f11681s.mo12821g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m15789c()) {
            return this.f11681s.mo12822h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m15789c()) {
            return this.f11681s.mo12823i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return m15789c() ? this.f11681s.mo12824j() : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m15789c() ? this.f11681s.mo12825k() : super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f11678B;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8994h.m29991f(this, this.f11681s.mo12819d());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo12766a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f11674p);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f11675q);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo12766a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C4179a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f11681s) != null) {
            aVar.mo12816B(i4 - i2, i3 - i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m15792f();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m15792f();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m15789c()) {
            this.f11681s.mo12829p(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (m15789c()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.f11681s.mo12830q();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C1445a.m6446d(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m15789c()) {
            this.f11681s.mo12831r(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo12766a() && isEnabled() && this.f11678B != z) {
            this.f11678B = z;
            refreshDrawableState();
            if (!this.f11679C) {
                this.f11679C = true;
                Iterator it = this.f11682t.iterator();
                while (it.hasNext()) {
                    ((C4177a) it.next()).mo12814a(this, this.f11678B);
                }
                this.f11679C = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m15789c()) {
            this.f11681s.mo12832s(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m15789c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m15789c()) {
            this.f11681s.mo12819d().mo22818S(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f11686x != drawable) {
            this.f11686x = drawable;
            m15791e(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f11680D != i) {
            this.f11680D = i;
            m15792f();
        }
    }

    public void setIconPadding(int i) {
        if (this.f11677A != i) {
            this.f11677A = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C1445a.m6446d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f11687y != i) {
            this.f11687y = i;
            m15791e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f11685w != colorStateList) {
            this.f11685w = colorStateList;
            m15791e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f11684v != mode) {
            this.f11684v = mode;
            m15791e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C1445a.m6445c(getContext(), i));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(C4178b bVar) {
        this.f11683u = bVar;
    }

    public void setPressed(boolean z) {
        C4178b bVar = this.f11683u;
        if (bVar != null) {
            bVar.mo12815a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m15789c()) {
            this.f11681s.mo12833t(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m15789c()) {
            setRippleColor(C1445a.m6445c(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C8997k kVar) {
        if (m15789c()) {
            this.f11681s.mo12834u(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m15789c()) {
            this.f11681s.mo12835v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m15789c()) {
            this.f11681s.mo12836w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m15789c()) {
            setStrokeColor(C1445a.m6445c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m15789c()) {
            this.f11681s.mo12837x(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m15789c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m15789c()) {
            this.f11681s.mo12838y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m15789c()) {
            this.f11681s.mo12839z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f11678B);
    }
}
