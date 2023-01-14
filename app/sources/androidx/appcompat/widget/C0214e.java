package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p027c.p028a.C1444j;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.widget.e */
class C0214e {

    /* renamed from: a */
    private final View f941a;

    /* renamed from: b */
    private final C0231j f942b;

    /* renamed from: c */
    private int f943c = -1;

    /* renamed from: d */
    private C0277v0 f944d;

    /* renamed from: e */
    private C0277v0 f945e;

    /* renamed from: f */
    private C0277v0 f946f;

    C0214e(View view) {
        this.f941a = view;
        this.f942b = C0231j.m1178b();
    }

    /* renamed from: a */
    private boolean m1106a(Drawable drawable) {
        if (this.f946f == null) {
            this.f946f = new C0277v0();
        }
        C0277v0 v0Var = this.f946f;
        v0Var.mo1716a();
        ColorStateList p = C1988t.m8399p(this.f941a);
        if (p != null) {
            v0Var.f1211d = true;
            v0Var.f1208a = p;
        }
        PorterDuff.Mode q = C1988t.m8401q(this.f941a);
        if (q != null) {
            v0Var.f1210c = true;
            v0Var.f1209b = q;
        }
        if (!v0Var.f1211d && !v0Var.f1210c) {
            return false;
        }
        C0231j.m1181i(drawable, v0Var, this.f941a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1107k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f944d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1318b() {
        Drawable background = this.f941a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1107k() || !m1106a(background)) {
            C0277v0 v0Var = this.f945e;
            if (v0Var != null) {
                C0231j.m1181i(background, v0Var, this.f941a.getDrawableState());
                return;
            }
            C0277v0 v0Var2 = this.f944d;
            if (v0Var2 != null) {
                C0231j.m1181i(background, v0Var2, this.f941a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1319c() {
        C0277v0 v0Var = this.f945e;
        if (v0Var != null) {
            return v0Var.f1208a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1320d() {
        C0277v0 v0Var = this.f945e;
        if (v0Var != null) {
            return v0Var.f1209b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1321e(AttributeSet attributeSet, int i) {
        Context context = this.f941a.getContext();
        int[] iArr = C1444j.f4289R3;
        C0292x0 v = C0292x0.m1407v(context, attributeSet, iArr, i, 0);
        View view = this.f941a;
        C1988t.m8390k0(view, view.getContext(), iArr, attributeSet, v.mo1801r(), i, 0);
        try {
            int i2 = C1444j.f4294S3;
            if (v.mo1802s(i2)) {
                this.f943c = v.mo1797n(i2, -1);
                ColorStateList f = this.f942b.mo1444f(this.f941a.getContext(), this.f943c);
                if (f != null) {
                    mo1324h(f);
                }
            }
            int i3 = C1444j.f4299T3;
            if (v.mo1802s(i3)) {
                C1988t.m8402q0(this.f941a, v.mo1786c(i3));
            }
            int i4 = C1444j.f4304U3;
            if (v.mo1802s(i4)) {
                C1988t.m8404r0(this.f941a, C0215e0.m1121e(v.mo1794k(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo1803w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1322f(Drawable drawable) {
        this.f943c = -1;
        mo1324h((ColorStateList) null);
        mo1318b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1323g(int i) {
        this.f943c = i;
        C0231j jVar = this.f942b;
        mo1324h(jVar != null ? jVar.mo1444f(this.f941a.getContext(), i) : null);
        mo1318b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1324h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f944d == null) {
                this.f944d = new C0277v0();
            }
            C0277v0 v0Var = this.f944d;
            v0Var.f1208a = colorStateList;
            v0Var.f1211d = true;
        } else {
            this.f944d = null;
        }
        mo1318b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1325i(ColorStateList colorStateList) {
        if (this.f945e == null) {
            this.f945e = new C0277v0();
        }
        C0277v0 v0Var = this.f945e;
        v0Var.f1208a = colorStateList;
        v0Var.f1211d = true;
        mo1318b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1326j(PorterDuff.Mode mode) {
        if (this.f945e == null) {
            this.f945e = new C0277v0();
        }
        C0277v0 v0Var = this.f945e;
        v0Var.f1209b = mode;
        v0Var.f1210c = true;
        mo1318b();
    }
}
