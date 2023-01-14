package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.C1196j;
import p027c.p028a.C1435a;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p072j.C1987s;

/* renamed from: androidx.appcompat.widget.g */
public class C0221g extends CheckBox implements C1196j, C1987s {

    /* renamed from: f */
    private final C0228i f969f;

    /* renamed from: o */
    private final C0214e f970o;

    /* renamed from: p */
    private final C0293y f971p;

    public C0221g(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0221g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.f4188r);
    }

    public C0221g(Context context, AttributeSet attributeSet, int i) {
        super(C0275u0.m1356b(context), attributeSet, i);
        C0271s0.m1349a(this, getContext());
        C0228i iVar = new C0228i(this);
        this.f969f = iVar;
        iVar.mo1398e(attributeSet, i);
        C0214e eVar = new C0214e(this);
        this.f970o = eVar;
        eVar.mo1321e(attributeSet, i);
        C0293y yVar = new C0293y(this);
        this.f971p = yVar;
        yVar.mo1814m(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0214e eVar = this.f970o;
        if (eVar != null) {
            eVar.mo1318b();
        }
        C0293y yVar = this.f971p;
        if (yVar != null) {
            yVar.mo1804b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0228i iVar = this.f969f;
        return iVar != null ? iVar.mo1395b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0214e eVar = this.f970o;
        if (eVar != null) {
            return eVar.mo1319c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0214e eVar = this.f970o;
        if (eVar != null) {
            return eVar.mo1320d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0228i iVar = this.f969f;
        if (iVar != null) {
            return iVar.mo1396c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0228i iVar = this.f969f;
        if (iVar != null) {
            return iVar.mo1397d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0214e eVar = this.f970o;
        if (eVar != null) {
            eVar.mo1322f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0214e eVar = this.f970o;
        if (eVar != null) {
            eVar.mo1323g(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C1445a.m6446d(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0228i iVar = this.f969f;
        if (iVar != null) {
            iVar.mo1399f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0214e eVar = this.f970o;
        if (eVar != null) {
            eVar.mo1325i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0214e eVar = this.f970o;
        if (eVar != null) {
            eVar.mo1326j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0228i iVar = this.f969f;
        if (iVar != null) {
            iVar.mo1400g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0228i iVar = this.f969f;
        if (iVar != null) {
            iVar.mo1401h(mode);
        }
    }
}
