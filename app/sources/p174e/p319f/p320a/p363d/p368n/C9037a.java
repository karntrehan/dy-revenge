package p174e.p319f.p320a.p363d.p368n;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p058e.p059a.C1777a;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p364a0.C9012n;

/* renamed from: e.f.a.d.n.a */
public class C9037a extends C1777a implements Checkable, C9012n {

    /* renamed from: v */
    private static final int[] f24842v = {16842911};

    /* renamed from: w */
    private static final int[] f24843w = {16842912};

    /* renamed from: x */
    private static final int[] f24844x = {C9013b.state_dragged};

    /* renamed from: y */
    private static final int f24845y = C9023j.Widget_MaterialComponents_CardView;

    /* renamed from: A */
    private boolean f24846A;

    /* renamed from: B */
    private boolean f24847B;

    /* renamed from: C */
    private boolean f24848C;

    /* renamed from: D */
    private C9038a f24849D;

    /* renamed from: z */
    private final C9039b f24850z;

    /* renamed from: e.f.a.d.n.a$a */
    public interface C9038a {
        /* renamed from: a */
        void mo22975a(C9037a aVar, boolean z);
    }

    /* renamed from: d */
    private void m30152d() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    /* renamed from: e */
    public boolean mo22941e() {
        if (this.f24850z == null) {
            return false;
        }
        throw null;
    }

    /* renamed from: f */
    public boolean mo22942f() {
        return this.f24848C;
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public C8997k getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean isChecked() {
        return this.f24847B;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo22941e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f24842v);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f24843w);
        }
        if (mo22942f()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f24844x);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C1777a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C1777a.class.getName());
        accessibilityNodeInfo.setCheckable(mo22941e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f24846A) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    public void setChecked(boolean z) {
        if (this.f24847B != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconResource(int i) {
        C1445a.m6446d(getContext(), i);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.f24848C != z) {
            this.f24848C = z;
            refreshDrawableState();
            m30152d();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        throw null;
    }

    public void setOnCheckedChangeListener(C9038a aVar) {
        this.f24849D = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f) {
        throw null;
    }

    public void setRadius(float f) {
        super.setRadius(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i) {
        C1445a.m6445c(getContext(), i);
        throw null;
    }

    public void setShapeAppearanceModel(C8997k kVar) {
        throw null;
    }

    public void setStrokeColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i) {
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    public void toggle() {
        if (mo22941e() && isEnabled()) {
            this.f24847B = !this.f24847B;
            refreshDrawableState();
            m30152d();
            C9038a aVar = this.f24849D;
            if (aVar != null) {
                aVar.mo22975a(this, this.f24847B);
            }
        }
    }
}
