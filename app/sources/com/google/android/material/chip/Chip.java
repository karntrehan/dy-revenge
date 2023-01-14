package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0221g;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.material.chip.C4188a;
import com.google.android.material.internal.C4273g;
import com.google.android.material.internal.C4274h;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import okhttp3.HttpUrl;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p077k.p079b.C2022a;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9022i;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p364a0.C8994h;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p364a0.C9012n;
import p174e.p319f.p320a.p363d.p366l.C9032h;
import p174e.p319f.p320a.p363d.p379x.C9062c;
import p174e.p319f.p320a.p363d.p379x.C9063d;
import p174e.p319f.p320a.p363d.p379x.C9067f;
import p174e.p319f.p320a.p363d.p380y.C9071b;

public class Chip extends C0221g implements C4188a.C4189a, C9012n {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final Rect f11708q = new Rect();

    /* renamed from: r */
    private static final int[] f11709r = {16842913};

    /* renamed from: s */
    private static final int[] f11710s = {16842911};

    /* renamed from: A */
    private boolean f11711A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f11712B;

    /* renamed from: C */
    private boolean f11713C;

    /* renamed from: D */
    private int f11714D;

    /* renamed from: E */
    private int f11715E;

    /* renamed from: F */
    private final C4182c f11716F;

    /* renamed from: G */
    private final Rect f11717G;

    /* renamed from: H */
    private final RectF f11718H;

    /* renamed from: I */
    private final C9067f f11719I;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C4188a f11720t;

    /* renamed from: u */
    private InsetDrawable f11721u;

    /* renamed from: v */
    private RippleDrawable f11722v;

    /* renamed from: w */
    private View.OnClickListener f11723w;

    /* renamed from: x */
    private CompoundButton.OnCheckedChangeListener f11724x;

    /* renamed from: y */
    private boolean f11725y;

    /* renamed from: z */
    private boolean f11726z;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C4180a extends C9067f {
        C4180a() {
        }

        /* renamed from: a */
        public void mo12978a(int i) {
        }

        /* renamed from: b */
        public void mo12979b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f11720t.mo13018B2() ? Chip.this.f11720t.mo13064Z0() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C4181b extends ViewOutlineProvider {
        C4181b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f11720t != null) {
                Chip.this.f11720t.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C4182c extends C2022a {
        C4182c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public int mo6735B(float f, float f2) {
            return (!Chip.this.m15838m() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo6736C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m15838m() && Chip.this.mo12883r()) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public boolean mo6739J(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo12884s();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M */
        public void mo6742M(C1955c cVar) {
            cVar.mo6575Y(Chip.this.mo12882q());
            cVar.mo6580b0(Chip.this.isClickable());
            cVar.mo6578a0((Chip.this.mo12882q() || Chip.this.isClickable()) ? Chip.this.mo12882q() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.mo6554B0(text);
            } else {
                cVar.mo6585e0(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: N */
        public void mo6743N(int i, C1955c cVar) {
            CharSequence charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C9022i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                cVar.mo6585e0(closeIconContentDescription);
                cVar.mo6573W(Chip.this.getCloseIconTouchBoundsInt());
                cVar.mo6579b(C1955c.C1956a.f5707e);
                cVar.mo6590h0(Chip.this.isEnabled());
                return;
            }
            cVar.mo6585e0(charSequence);
            cVar.mo6573W(Chip.f11708q);
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public void mo6744O(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f11712B = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9013b.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11717G = new Rect();
        this.f11718H = new RectF();
        this.f11719I = new C4180a();
        m15827B(attributeSet);
        int i2 = C9023j.Widget_MaterialComponents_Chip_Action;
        C4188a q0 = C4188a.m15895q0(context, attributeSet, i, i2);
        m15839n(context, attributeSet, i);
        setChipDrawable(q0);
        q0.mo22818S(C1988t.m8407t(this));
        TypedArray k = C4273g.m16429k(context, attributeSet, C9024k.f24623S, i, i2, new int[0]);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            setTextColor(C9062c.m30197a(context, k, C9024k.f24633U));
        }
        boolean hasValue = k.hasValue(C9024k.f24544C0);
        k.recycle();
        C4182c cVar = new C4182c(this);
        this.f11716F = cVar;
        if (i3 >= 24) {
            C1988t.m8394m0(this, cVar);
        } else {
            m15844w();
        }
        if (!hasValue) {
            m15840o();
        }
        setChecked(this.f11725y);
        setText(q0.mo13064Z0());
        setEllipsize(q0.mo13052T0());
        setIncludeFontPadding(false);
        m15826A();
        if (!this.f11720t.mo13018B2()) {
            setSingleLine();
        }
        setGravity(8388627);
        m15847z();
        if (mo12977u()) {
            setMinHeight(this.f11715E);
        }
        this.f11714D = C1988t.m8417y(this);
    }

    /* renamed from: A */
    private void m15826A() {
        TextPaint paint = getPaint();
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C9063d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo23016i(getContext(), paint, this.f11719I);
        }
    }

    /* renamed from: B */
    private void m15827B(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f11718H.setEmpty();
        if (m15838m()) {
            this.f11720t.mo13050S0(this.f11718H);
        }
        return this.f11718H;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f11717G.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f11717G;
    }

    private C9063d getTextAppearance() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13067a1();
        }
        return null;
    }

    /* renamed from: h */
    private void m15834h(C4188a aVar) {
        aVar.mo13077f2(this);
    }

    /* renamed from: i */
    private int[] m15835i() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f11712B) {
            i2++;
        }
        if (this.f11711A) {
            i2++;
        }
        if (this.f11726z) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f11712B) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f11711A) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f11726z) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: k */
    private void m15836k() {
        if (getBackgroundDrawable() == this.f11721u && this.f11720t.getCallback() == null) {
            this.f11720t.setCallback(this.f11721u);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: l */
    private boolean m15837l(MotionEvent motionEvent) {
        Class<C2022a> cls = C2022a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("p");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f11716F)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("V", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f11716F, new Object[]{Integer.valueOf(RecyclerView.UNDEFINED_DURATION)});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public boolean m15838m() {
        C4188a aVar = this.f11720t;
        return (aVar == null || aVar.mo13037L0() == null) ? false : true;
    }

    /* renamed from: n */
    private void m15839n(Context context, AttributeSet attributeSet, int i) {
        TypedArray k = C4273g.m16429k(context, attributeSet, C9024k.f24623S, i, C9023j.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f11713C = k.getBoolean(C9024k.f24802x0, false);
        this.f11715E = (int) Math.ceil((double) k.getDimension(C9024k.f24730l0, (float) Math.ceil((double) C4274h.m16431a(getContext(), 48))));
        k.recycle();
    }

    /* renamed from: o */
    private void m15840o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C4181b());
        }
    }

    /* renamed from: p */
    private void m15841p(int i, int i2, int i3, int i4) {
        this.f11721u = new InsetDrawable(this.f11720t, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f11711A != z) {
            this.f11711A = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f11726z != z) {
            this.f11726z = z;
            refreshDrawableState();
        }
    }

    /* renamed from: t */
    private void m15842t() {
        if (this.f11721u != null) {
            this.f11721u = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m15845x();
        }
    }

    /* renamed from: v */
    private void m15843v(C4188a aVar) {
        if (aVar != null) {
            aVar.mo13077f2((C4188a.C4189a) null);
        }
    }

    /* renamed from: w */
    private void m15844w() {
        if (Build.VERSION.SDK_INT < 24) {
            C1988t.m8394m0(this, (!m15838m() || !mo12883r()) ? null : this.f11716F);
        }
    }

    /* renamed from: x */
    private void m15845x() {
        if (C9071b.f24905a) {
            m15846y();
            return;
        }
        this.f11720t.mo13015A2(true);
        C1988t.m8400p0(this, getBackgroundDrawable());
        m15836k();
    }

    /* renamed from: y */
    private void m15846y() {
        this.f11722v = new RippleDrawable(C9071b.m30223a(this.f11720t.mo13060X0()), getBackgroundDrawable(), (Drawable) null);
        this.f11720t.mo13015A2(false);
        C1988t.m8400p0(this, this.f11722v);
    }

    /* renamed from: z */
    private void m15847z() {
        C4188a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f11720t) != null) {
            C1988t.m8336B0(this, (int) (this.f11720t.mo13031I0() + this.f11720t.mo13071c1() + this.f11720t.mo13086h0()), getPaddingTop(), (int) (aVar.mo13021D0() + this.f11720t.mo13069b1() + this.f11720t.mo13095l0()), getPaddingBottom());
        }
    }

    /* renamed from: a */
    public void mo12840a() {
        mo12873j(this.f11715E);
        m15845x();
        m15847z();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m15837l(motionEvent) || this.f11716F.mo6749v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f11716F.mo6750w(keyEvent) || this.f11716F.mo6734A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4188a aVar = this.f11720t;
        if ((aVar == null || !aVar.mo13087h1()) ? false : this.f11720t.mo13070b2(m15835i())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f11721u;
        return insetDrawable == null ? this.f11720t : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13013A0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13016B0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13019C0();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f11720t;
    }

    public float getChipEndPadding() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13021D0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13023E0();
        }
        return null;
    }

    public float getChipIconSize() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13025F0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13027G0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13029H0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13031I0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13033J0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13035K0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13037L0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13039M0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13041N0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13043O0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13045P0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13049R0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13052T0();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f11716F.mo6734A() == 1 || this.f11716F.mo6751x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C9032h getHideMotionSpec() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13054U0();
        }
        return null;
    }

    public float getIconEndPadding() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13056V0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13058W0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13060X0();
        }
        return null;
    }

    public C8997k getShapeAppearanceModel() {
        return this.f11720t.mo22809B();
    }

    public C9032h getShowMotionSpec() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13062Y0();
        }
        return null;
    }

    public float getTextEndPadding() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13069b1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            return aVar.mo13071c1();
        }
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (getMinWidth() != r6) goto L_0x0070;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12873j(int r6) {
        /*
            r5 = this;
            r5.f11715E = r6
            boolean r0 = r5.mo12977u()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r5.m15842t()
            return r1
        L_0x000d:
            com.google.android.material.chip.a r0 = r5.f11720t
            int r0 = r0.getIntrinsicHeight()
            int r0 = r6 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.a r2 = r5.f11720t
            int r2 = r2.getIntrinsicWidth()
            int r2 = r6 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L_0x002d
            if (r0 > 0) goto L_0x002d
            r5.m15842t()
            return r1
        L_0x002d:
            if (r2 <= 0) goto L_0x0032
            int r2 = r2 / 2
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r0 <= 0) goto L_0x0037
            int r1 = r0 / 2
        L_0x0037:
            android.graphics.drawable.InsetDrawable r0 = r5.f11721u
            r3 = 1
            if (r0 == 0) goto L_0x0057
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r4 = r5.f11721u
            r4.getPadding(r0)
            int r4 = r0.top
            if (r4 != r1) goto L_0x0057
            int r4 = r0.bottom
            if (r4 != r1) goto L_0x0057
            int r4 = r0.left
            if (r4 != r2) goto L_0x0057
            int r0 = r0.right
            if (r0 != r2) goto L_0x0057
            return r3
        L_0x0057:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r0 < r4) goto L_0x006d
            int r0 = r5.getMinHeight()
            if (r0 == r6) goto L_0x0066
            r5.setMinHeight(r6)
        L_0x0066:
            int r0 = r5.getMinWidth()
            if (r0 == r6) goto L_0x0073
            goto L_0x0070
        L_0x006d:
            r5.setMinHeight(r6)
        L_0x0070:
            r5.setMinWidth(r6)
        L_0x0073:
            r5.m15841p(r2, r1, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.mo12873j(int):boolean");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8994h.m29991f(this, this.f11720t);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f11709r);
        }
        if (mo12882q()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f11710s);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f11716F.mo6738I(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((mo12882q() || isClickable()) ? mo12882q() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(mo12882q());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), RNCWebViewManager.COMMAND_CLEAR_HISTORY);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f11714D != i) {
            this.f11714D = i;
            m15847z();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f11726z
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f11726z
            if (r0 == 0) goto L_0x0034
            r5.mo12884s()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean mo12882q() {
        C4188a aVar = this.f11720t;
        return aVar != null && aVar.mo13078g1();
    }

    /* renamed from: r */
    public boolean mo12883r() {
        C4188a aVar = this.f11720t;
        return aVar != null && aVar.mo13089i1();
    }

    /* renamed from: s */
    public boolean mo12884s() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f11723w;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f11716F.mo6747U(1, 1);
        return z;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f11722v) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f11722v) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13105p1(z);
        }
    }

    public void setCheckableResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13107q1(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C4188a aVar = this.f11720t;
        if (aVar == null) {
            this.f11725y = z;
        } else if (aVar.mo13078g1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f11724x) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13109r1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13111s1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13117t1(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13119u1(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13122v1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13124w1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13126x1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13128y1(i);
        }
    }

    public void setChipDrawable(C4188a aVar) {
        C4188a aVar2 = this.f11720t;
        if (aVar2 != aVar) {
            m15843v(aVar2);
            this.f11720t = aVar;
            aVar.mo13108q2(false);
            m15834h(this.f11720t);
            mo12873j(this.f11715E);
            m15845x();
        }
    }

    public void setChipEndPadding(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13130z1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13014A1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13017B1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13020C1(i);
        }
    }

    public void setChipIconSize(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13022D1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13024E1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13026F1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13028G1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13030H1(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13032I1(z);
        }
    }

    public void setChipMinHeight(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13034J1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13036K1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13038L1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13040M1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13042N1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13044O1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13046P1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13048Q1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13051S1(drawable);
        }
        m15844w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13053T1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13055U1(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13057V1(i);
        }
    }

    public void setCloseIconResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13059W1(i);
        }
        m15844w();
    }

    public void setCloseIconSize(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13061X1(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13063Y1(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13065Z1(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13068a2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13072c2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13073d2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13076e2(z);
        }
        m15844w();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo22818S(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f11720t != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C4188a aVar = this.f11720t;
                if (aVar != null) {
                    aVar.mo13079g2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f11713C = z;
        mo12873j(this.f11715E);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C9032h hVar) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13088h2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13090i2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13093j2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13094k2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13096l2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13097m2(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f11720t != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13099n2(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f11724x = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f11723w = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13101o2(colorStateList);
        }
        if (!this.f11720t.mo13075e1()) {
            m15846y();
        }
    }

    public void setRippleColorResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13106p2(i);
            if (!this.f11720t.mo13075e1()) {
                m15846y();
            }
        }
    }

    public void setShapeAppearanceModel(C8997k kVar) {
        this.f11720t.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C9032h hVar) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13110r2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13112s2(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            super.setText(aVar.mo13018B2() ? null : charSequence, bufferType);
            C4188a aVar2 = this.f11720t;
            if (aVar2 != null) {
                aVar2.mo13118t2(charSequence);
            }
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13123v2(i);
        }
        m15826A();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13123v2(i);
        }
        m15826A();
    }

    public void setTextAppearance(C9063d dVar) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13120u2(dVar);
        }
        m15826A();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13125w2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13127x2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13129y2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C4188a aVar = this.f11720t;
        if (aVar != null) {
            aVar.mo13131z2(i);
        }
    }

    /* renamed from: u */
    public boolean mo12977u() {
        return this.f11713C;
    }
}
