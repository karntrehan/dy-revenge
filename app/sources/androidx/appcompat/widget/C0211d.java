package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.C1194i;
import p027c.p028a.C1435a;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p072j.C1987s;

/* renamed from: androidx.appcompat.widget.d */
public class C0211d extends AutoCompleteTextView implements C1987s {

    /* renamed from: f */
    private static final int[] f937f = {16843126};

    /* renamed from: o */
    private final C0214e f938o;

    /* renamed from: p */
    private final C0293y f939p;

    public C0211d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.autoCompleteTextViewStyle);
    }

    public C0211d(Context context, AttributeSet attributeSet, int i) {
        super(C0275u0.m1356b(context), attributeSet, i);
        C0271s0.m1349a(this, getContext());
        C0292x0 v = C0292x0.m1407v(getContext(), attributeSet, f937f, i, 0);
        if (v.mo1802s(0)) {
            setDropDownBackgroundDrawable(v.mo1790g(0));
        }
        v.mo1803w();
        C0214e eVar = new C0214e(this);
        this.f938o = eVar;
        eVar.mo1321e(attributeSet, i);
        C0293y yVar = new C0293y(this);
        this.f939p = yVar;
        yVar.mo1814m(attributeSet, i);
        yVar.mo1804b();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0214e eVar = this.f938o;
        if (eVar != null) {
            eVar.mo1318b();
        }
        C0293y yVar = this.f939p;
        if (yVar != null) {
            yVar.mo1804b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0214e eVar = this.f938o;
        if (eVar != null) {
            return eVar.mo1319c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0214e eVar = this.f938o;
        if (eVar != null) {
            return eVar.mo1320d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0243l.m1233a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0214e eVar = this.f938o;
        if (eVar != null) {
            eVar.mo1322f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0214e eVar = this.f938o;
        if (eVar != null) {
            eVar.mo1323g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1194i.m4709p(this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C1445a.m6446d(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0214e eVar = this.f938o;
        if (eVar != null) {
            eVar.mo1325i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0214e eVar = this.f938o;
        if (eVar != null) {
            eVar.mo1326j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0293y yVar = this.f939p;
        if (yVar != null) {
            yVar.mo1818q(context, i);
        }
    }
}
