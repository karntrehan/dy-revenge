package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p027c.p028a.C1444j;
import p027c.p028a.p035o.C1466b;

/* renamed from: androidx.appcompat.app.a */
public abstract class C0058a {

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0059a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f215a;

        public C0059a(int i, int i2) {
            super(i, i2);
            this.f215a = 0;
            this.f215a = 8388627;
        }

        public C0059a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f215a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1444j.f4424t);
            this.f215a = obtainStyledAttributes.getInt(C1444j.f4429u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0059a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f215a = 0;
        }

        public C0059a(C0059a aVar) {
            super(aVar);
            this.f215a = 0;
            this.f215a = aVar.f215a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    public interface C0060b {
        /* renamed from: a */
        void mo201a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    public static abstract class C0061c {
        /* renamed from: a */
        public abstract CharSequence mo202a();

        /* renamed from: b */
        public abstract View mo203b();

        /* renamed from: c */
        public abstract Drawable mo204c();

        /* renamed from: d */
        public abstract CharSequence mo205d();

        /* renamed from: e */
        public abstract void mo206e();
    }

    /* renamed from: g */
    public boolean mo182g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo183h();

    /* renamed from: i */
    public abstract void mo184i(boolean z);

    /* renamed from: j */
    public abstract int mo185j();

    /* renamed from: k */
    public abstract Context mo186k();

    /* renamed from: l */
    public boolean mo187l() {
        return false;
    }

    /* renamed from: m */
    public void mo188m(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo189n() {
    }

    /* renamed from: o */
    public abstract boolean mo190o(int i, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean mo191p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo192q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo193r(boolean z);

    /* renamed from: s */
    public abstract void mo194s(boolean z);

    /* renamed from: t */
    public abstract void mo195t(boolean z);

    /* renamed from: u */
    public abstract void mo196u(Drawable drawable);

    /* renamed from: v */
    public abstract void mo197v(boolean z);

    /* renamed from: w */
    public abstract void mo198w(CharSequence charSequence);

    /* renamed from: x */
    public abstract void mo199x(CharSequence charSequence);

    /* renamed from: y */
    public C1466b mo200y(C1466b.C1467a aVar) {
        return null;
    }
}
