package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C1187b;
import androidx.core.widget.C1194i;
import androidx.core.widget.C1197k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p065d.C1832d;
import p027c.p064i.p071i.C1892c;
import p027c.p064i.p072j.C1987s;

/* renamed from: androidx.appcompat.widget.z */
public class C0298z extends TextView implements C1987s, C1197k, C1187b {

    /* renamed from: f */
    private final C0214e f1286f;

    /* renamed from: o */
    private final C0293y f1287o;

    /* renamed from: p */
    private final C0291x f1288p;

    /* renamed from: q */
    private Future<C1892c> f1289q;

    public C0298z(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0298z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0298z(Context context, AttributeSet attributeSet, int i) {
        super(C0275u0.m1356b(context), attributeSet, i);
        C0271s0.m1349a(this, getContext());
        C0214e eVar = new C0214e(this);
        this.f1286f = eVar;
        eVar.mo1321e(attributeSet, i);
        C0293y yVar = new C0293y(this);
        this.f1287o = yVar;
        yVar.mo1814m(attributeSet, i);
        yVar.mo1804b();
        this.f1288p = new C0291x(this);
    }

    /* renamed from: g */
    private void m1496g() {
        Future<C1892c> future = this.f1289q;
        if (future != null) {
            try {
                this.f1289q = null;
                C1194i.m4706m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0214e eVar = this.f1286f;
        if (eVar != null) {
            eVar.mo1318b();
        }
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1804b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C1187b.f3326a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            return yVar.mo1806e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C1187b.f3326a) {
            return super.getAutoSizeMinTextSize();
        }
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            return yVar.mo1807f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C1187b.f3326a) {
            return super.getAutoSizeStepGranularity();
        }
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            return yVar.mo1808g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C1187b.f3326a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0293y yVar = this.f1287o;
        return yVar != null ? yVar.mo1809h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C1187b.f3326a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            return yVar.mo1810i();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return C1194i.m4695b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C1194i.m4696c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0214e eVar = this.f1286f;
        if (eVar != null) {
            return eVar.mo1319c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0214e eVar = this.f1286f;
        if (eVar != null) {
            return eVar.mo1320d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1287o.mo1811j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1287o.mo1812k();
    }

    public CharSequence getText() {
        m1496g();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1288p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.x r0 = r2.f1288p
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo1782a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0298z.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public C1892c.C1893a getTextMetricsParamsCompat() {
        return C1194i.m4699f(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0243l.m1233a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1816o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m1496g();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0293y yVar = this.f1287o;
        if (yVar != null && !C1187b.f3326a && yVar.mo1813l()) {
            this.f1287o.mo1805c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C1187b.f3326a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1820s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C1187b.f3326a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1821t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C1187b.f3326a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1822u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0214e eVar = this.f1286f;
        if (eVar != null) {
            eVar.mo1322f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0214e eVar = this.f1286f;
        if (eVar != null) {
            eVar.mo1323g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1817p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1817p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? C1445a.m6446d(context, i) : null;
        Drawable d2 = i2 != 0 ? C1445a.m6446d(context, i2) : null;
        Drawable d3 = i3 != 0 ? C1445a.m6446d(context, i3) : null;
        if (i4 != 0) {
            drawable = C1445a.m6446d(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d, d2, d3, drawable);
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1817p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1817p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? C1445a.m6446d(context, i) : null;
        Drawable d2 = i2 != 0 ? C1445a.m6446d(context, i2) : null;
        Drawable d3 = i3 != 0 ? C1445a.m6446d(context, i3) : null;
        if (i4 != 0) {
            drawable = C1445a.m6446d(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(d, d2, d3, drawable);
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1817p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1817p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1194i.m4709p(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C1194i.m4703j(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C1194i.m4704k(this, i);
        }
    }

    public void setLineHeight(int i) {
        C1194i.m4705l(this, i);
    }

    public void setPrecomputedText(C1892c cVar) {
        C1194i.m4706m(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0214e eVar = this.f1286f;
        if (eVar != null) {
            eVar.mo1325i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0214e eVar = this.f1286f;
        if (eVar != null) {
            eVar.mo1326j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1287o.mo1823v(colorStateList);
        this.f1287o.mo1804b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1287o.mo1824w(mode);
        this.f1287o.mo1804b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1818q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0291x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1288p) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.mo1783b(textClassifier);
        }
    }

    public void setTextFuture(Future<C1892c> future) {
        this.f1289q = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1892c.C1893a aVar) {
        C1194i.m4708o(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C1187b.f3326a) {
            super.setTextSize(i, f);
            return;
        }
        C0293y yVar = this.f1287o;
        if (yVar != null) {
            yVar.mo1825z(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C1832d.m7780a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }
}
