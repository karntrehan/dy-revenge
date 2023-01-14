package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C1190e;
import p027c.p028a.C1444j;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.widget.n */
public class C0254n {

    /* renamed from: a */
    private final ImageView f1080a;

    /* renamed from: b */
    private C0277v0 f1081b;

    /* renamed from: c */
    private C0277v0 f1082c;

    /* renamed from: d */
    private C0277v0 f1083d;

    public C0254n(ImageView imageView) {
        this.f1080a = imageView;
    }

    /* renamed from: a */
    private boolean m1279a(Drawable drawable) {
        if (this.f1083d == null) {
            this.f1083d = new C0277v0();
        }
        C0277v0 v0Var = this.f1083d;
        v0Var.mo1716a();
        ColorStateList a = C1190e.m4682a(this.f1080a);
        if (a != null) {
            v0Var.f1211d = true;
            v0Var.f1208a = a;
        }
        PorterDuff.Mode b = C1190e.m4683b(this.f1080a);
        if (b != null) {
            v0Var.f1210c = true;
            v0Var.f1209b = b;
        }
        if (!v0Var.f1211d && !v0Var.f1210c) {
            return false;
        }
        C0231j.m1181i(drawable, v0Var, this.f1080a.getDrawableState());
        return true;
    }

    /* renamed from: j */
    private boolean m1280j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1081b != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1525b() {
        Drawable drawable = this.f1080a.getDrawable();
        if (drawable != null) {
            C0215e0.m1118b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m1280j() || !m1279a(drawable)) {
            C0277v0 v0Var = this.f1082c;
            if (v0Var != null) {
                C0231j.m1181i(drawable, v0Var, this.f1080a.getDrawableState());
                return;
            }
            C0277v0 v0Var2 = this.f1081b;
            if (v0Var2 != null) {
                C0231j.m1181i(drawable, v0Var2, this.f1080a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1526c() {
        C0277v0 v0Var = this.f1082c;
        if (v0Var != null) {
            return v0Var.f1208a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1527d() {
        C0277v0 v0Var = this.f1082c;
        if (v0Var != null) {
            return v0Var.f1209b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo1528e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1080a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void mo1529f(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.f1080a.getContext();
        int[] iArr = C1444j.f4285R;
        C0292x0 v = C0292x0.m1407v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1080a;
        C1988t.m8390k0(imageView, imageView.getContext(), iArr, attributeSet, v.mo1801r(), i, 0);
        try {
            Drawable drawable = this.f1080a.getDrawable();
            if (!(drawable != null || (n = v.mo1797n(C1444j.f4290S, -1)) == -1 || (drawable = C1445a.m6446d(this.f1080a.getContext(), n)) == null)) {
                this.f1080a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0215e0.m1118b(drawable);
            }
            int i2 = C1444j.f4295T;
            if (v.mo1802s(i2)) {
                C1190e.m4684c(this.f1080a, v.mo1786c(i2));
            }
            int i3 = C1444j.f4300U;
            if (v.mo1802s(i3)) {
                C1190e.m4685d(this.f1080a, C0215e0.m1121e(v.mo1794k(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo1803w();
        }
    }

    /* renamed from: g */
    public void mo1530g(int i) {
        if (i != 0) {
            Drawable d = C1445a.m6446d(this.f1080a.getContext(), i);
            if (d != null) {
                C0215e0.m1118b(d);
            }
            this.f1080a.setImageDrawable(d);
        } else {
            this.f1080a.setImageDrawable((Drawable) null);
        }
        mo1525b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1531h(ColorStateList colorStateList) {
        if (this.f1082c == null) {
            this.f1082c = new C0277v0();
        }
        C0277v0 v0Var = this.f1082c;
        v0Var.f1208a = colorStateList;
        v0Var.f1211d = true;
        mo1525b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1532i(PorterDuff.Mode mode) {
        if (this.f1082c == null) {
            this.f1082c = new C0277v0();
        }
        C0277v0 v0Var = this.f1082c;
        v0Var.f1209b = mode;
        v0Var.f1210c = true;
        mo1525b();
    }
}
