package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C1193h;
import p027c.p028a.C1444j;

/* renamed from: androidx.appcompat.widget.q */
class C0264q extends PopupWindow {

    /* renamed from: a */
    private static final boolean f1118a = (Build.VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f1119b;

    public C0264q(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1305a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1305a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0292x0 v = C0292x0.m1407v(context, attributeSet, C1444j.f4337b2, i, i2);
        int i3 = C1444j.f4347d2;
        if (v.mo1802s(i3)) {
            m1306b(v.mo1784a(i3, false));
        }
        setBackgroundDrawable(v.mo1790g(C1444j.f4342c2));
        v.mo1803w();
    }

    /* renamed from: b */
    private void m1306b(boolean z) {
        if (f1118a) {
            this.f1119b = z;
        } else {
            C1193h.m4691a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1118a && this.f1119b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1118a && this.f1119b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1118a && this.f1119b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
