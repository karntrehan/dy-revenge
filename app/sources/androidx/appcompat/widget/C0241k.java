package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.C1194i;
import p027c.p028a.C1435a;
import p027c.p064i.p072j.C1987s;

/* renamed from: androidx.appcompat.widget.k */
public class C0241k extends EditText implements C1987s {

    /* renamed from: f */
    private final C0214e f1059f;

    /* renamed from: o */
    private final C0293y f1060o;

    /* renamed from: p */
    private final C0291x f1061p;

    public C0241k(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0241k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.f4185A);
    }

    public C0241k(Context context, AttributeSet attributeSet, int i) {
        super(C0275u0.m1356b(context), attributeSet, i);
        C0271s0.m1349a(this, getContext());
        C0214e eVar = new C0214e(this);
        this.f1059f = eVar;
        eVar.mo1321e(attributeSet, i);
        C0293y yVar = new C0293y(this);
        this.f1060o = yVar;
        yVar.mo1814m(attributeSet, i);
        yVar.mo1804b();
        this.f1061p = new C0291x(this);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0214e eVar = this.f1059f;
        if (eVar != null) {
            eVar.mo1318b();
        }
        C0293y yVar = this.f1060o;
        if (yVar != null) {
            yVar.mo1804b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0214e eVar = this.f1059f;
        if (eVar != null) {
            return eVar.mo1319c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0214e eVar = this.f1059f;
        if (eVar != null) {
            return eVar.mo1320d();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1061p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.x r0 = r2.f1061p
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo1782a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0241k.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0243l.m1233a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0214e eVar = this.f1059f;
        if (eVar != null) {
            eVar.mo1322f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0214e eVar = this.f1059f;
        if (eVar != null) {
            eVar.mo1323g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1194i.m4709p(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0214e eVar = this.f1059f;
        if (eVar != null) {
            eVar.mo1325i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0214e eVar = this.f1059f;
        if (eVar != null) {
            eVar.mo1326j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0293y yVar = this.f1060o;
        if (yVar != null) {
            yVar.mo1818q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0291x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1061p) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.mo1783b(textClassifier);
        }
    }
}
