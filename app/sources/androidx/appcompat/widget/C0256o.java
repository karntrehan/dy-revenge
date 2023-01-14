package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C1198l;
import p027c.p064i.p072j.C1987s;

/* renamed from: androidx.appcompat.widget.o */
public class C0256o extends ImageView implements C1987s, C1198l {

    /* renamed from: f */
    private final C0214e f1085f;

    /* renamed from: o */
    private final C0254n f1086o;

    public C0256o(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0256o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0256o(Context context, AttributeSet attributeSet, int i) {
        super(C0275u0.m1356b(context), attributeSet, i);
        C0271s0.m1349a(this, getContext());
        C0214e eVar = new C0214e(this);
        this.f1085f = eVar;
        eVar.mo1321e(attributeSet, i);
        C0254n nVar = new C0254n(this);
        this.f1086o = nVar;
        nVar.mo1529f(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0214e eVar = this.f1085f;
        if (eVar != null) {
            eVar.mo1318b();
        }
        C0254n nVar = this.f1086o;
        if (nVar != null) {
            nVar.mo1525b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0214e eVar = this.f1085f;
        if (eVar != null) {
            return eVar.mo1319c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0214e eVar = this.f1085f;
        if (eVar != null) {
            return eVar.mo1320d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0254n nVar = this.f1086o;
        if (nVar != null) {
            return nVar.mo1526c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0254n nVar = this.f1086o;
        if (nVar != null) {
            return nVar.mo1527d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1086o.mo1528e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0214e eVar = this.f1085f;
        if (eVar != null) {
            eVar.mo1322f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0214e eVar = this.f1085f;
        if (eVar != null) {
            eVar.mo1323g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0254n nVar = this.f1086o;
        if (nVar != null) {
            nVar.mo1525b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0254n nVar = this.f1086o;
        if (nVar != null) {
            nVar.mo1525b();
        }
    }

    public void setImageResource(int i) {
        C0254n nVar = this.f1086o;
        if (nVar != null) {
            nVar.mo1530g(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0254n nVar = this.f1086o;
        if (nVar != null) {
            nVar.mo1525b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0214e eVar = this.f1085f;
        if (eVar != null) {
            eVar.mo1325i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0214e eVar = this.f1085f;
        if (eVar != null) {
            eVar.mo1326j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0254n nVar = this.f1086o;
        if (nVar != null) {
            nVar.mo1531h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0254n nVar = this.f1086o;
        if (nVar != null) {
            nVar.mo1532i(mode);
        }
    }
}
