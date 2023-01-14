package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C1194i;
import p027c.p028a.p029k.p030a.C1445a;

/* renamed from: androidx.appcompat.widget.h */
public class C0224h extends CheckedTextView {

    /* renamed from: f */
    private static final int[] f972f = {16843016};

    /* renamed from: o */
    private final C0293y f973o;

    public C0224h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0224h(Context context, AttributeSet attributeSet, int i) {
        super(C0275u0.m1356b(context), attributeSet, i);
        C0271s0.m1349a(this, getContext());
        C0293y yVar = new C0293y(this);
        this.f973o = yVar;
        yVar.mo1814m(attributeSet, i);
        yVar.mo1804b();
        C0292x0 v = C0292x0.m1407v(getContext(), attributeSet, f972f, i, 0);
        setCheckMarkDrawable(v.mo1790g(0));
        v.mo1803w();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0293y yVar = this.f973o;
        if (yVar != null) {
            yVar.mo1804b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0243l.m1233a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C1445a.m6446d(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1194i.m4709p(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0293y yVar = this.f973o;
        if (yVar != null) {
            yVar.mo1818q(context, i);
        }
    }
}
