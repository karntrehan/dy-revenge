package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C1187b;
import androidx.core.widget.C1194i;
import androidx.core.widget.C1197k;
import p027c.p028a.C1435a;
import p027c.p064i.p072j.C1987s;

/* renamed from: androidx.appcompat.widget.f */
public class C0217f extends Button implements C1987s, C1187b, C1197k {

    /* renamed from: f */
    private final C0214e f951f;

    /* renamed from: o */
    private final C0293y f952o;

    public C0217f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.buttonStyle);
    }

    public C0217f(Context context, AttributeSet attributeSet, int i) {
        super(C0275u0.m1356b(context), attributeSet, i);
        C0271s0.m1349a(this, getContext());
        C0214e eVar = new C0214e(this);
        this.f951f = eVar;
        eVar.mo1321e(attributeSet, i);
        C0293y yVar = new C0293y(this);
        this.f952o = yVar;
        yVar.mo1814m(attributeSet, i);
        yVar.mo1804b();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0214e eVar = this.f951f;
        if (eVar != null) {
            eVar.mo1318b();
        }
        C0293y yVar = this.f952o;
        if (yVar != null) {
            yVar.mo1804b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C1187b.f3326a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0293y yVar = this.f952o;
        if (yVar != null) {
            return yVar.mo1806e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C1187b.f3326a) {
            return super.getAutoSizeMinTextSize();
        }
        C0293y yVar = this.f952o;
        if (yVar != null) {
            return yVar.mo1807f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C1187b.f3326a) {
            return super.getAutoSizeStepGranularity();
        }
        C0293y yVar = this.f952o;
        if (yVar != null) {
            return yVar.mo1808g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C1187b.f3326a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0293y yVar = this.f952o;
        return yVar != null ? yVar.mo1809h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C1187b.f3326a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0293y yVar = this.f952o;
        if (yVar != null) {
            return yVar.mo1810i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0214e eVar = this.f951f;
        if (eVar != null) {
            return eVar.mo1319c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0214e eVar = this.f951f;
        if (eVar != null) {
            return eVar.mo1320d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f952o.mo1811j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f952o.mo1812k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0293y yVar = this.f952o;
        if (yVar != null) {
            yVar.mo1816o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0293y yVar = this.f952o;
        if (yVar != null && !C1187b.f3326a && yVar.mo1813l()) {
            this.f952o.mo1805c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C1187b.f3326a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0293y yVar = this.f952o;
        if (yVar != null) {
            yVar.mo1820s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C1187b.f3326a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0293y yVar = this.f952o;
        if (yVar != null) {
            yVar.mo1821t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C1187b.f3326a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0293y yVar = this.f952o;
        if (yVar != null) {
            yVar.mo1822u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0214e eVar = this.f951f;
        if (eVar != null) {
            eVar.mo1322f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0214e eVar = this.f951f;
        if (eVar != null) {
            eVar.mo1323g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1194i.m4709p(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0293y yVar = this.f952o;
        if (yVar != null) {
            yVar.mo1819r(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0214e eVar = this.f951f;
        if (eVar != null) {
            eVar.mo1325i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0214e eVar = this.f951f;
        if (eVar != null) {
            eVar.mo1326j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f952o.mo1823v(colorStateList);
        this.f952o.mo1804b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f952o.mo1824w(mode);
        this.f952o.mo1804b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0293y yVar = this.f952o;
        if (yVar != null) {
            yVar.mo1818q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C1187b.f3326a) {
            super.setTextSize(i, f);
            return;
        }
        C0293y yVar = this.f952o;
        if (yVar != null) {
            yVar.mo1825z(i, f);
        }
    }
}
