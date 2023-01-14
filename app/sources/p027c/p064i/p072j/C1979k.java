package p027c.p064i.p072j;

import android.view.View;
import android.view.ViewParent;

/* renamed from: c.i.j.k */
public class C1979k {

    /* renamed from: a */
    private ViewParent f5741a;

    /* renamed from: b */
    private ViewParent f5742b;

    /* renamed from: c */
    private final View f5743c;

    /* renamed from: d */
    private boolean f5744d;

    /* renamed from: e */
    private int[] f5745e;

    public C1979k(View view) {
        this.f5743c = view;
    }

    /* renamed from: h */
    private boolean m8300h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent i6;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo6651m() || (i6 = m8301i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f5743c.getLocationInWindow(iArr4);
            i8 = iArr4[0];
            i7 = iArr4[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] j = m8302j();
            j[0] = 0;
            j[1] = 0;
            iArr3 = j;
        } else {
            iArr3 = iArr2;
        }
        C2007x.m8481d(i6, this.f5743c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f5743c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i8;
            iArr4[1] = iArr4[1] - i7;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m8301i(int i) {
        if (i == 0) {
            return this.f5741a;
        }
        if (i != 1) {
            return null;
        }
        return this.f5742b;
    }

    /* renamed from: j */
    private int[] m8302j() {
        if (this.f5745e == null) {
            this.f5745e = new int[2];
        }
        return this.f5745e;
    }

    /* renamed from: o */
    private void m8303o(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f5741a = viewParent;
        } else if (i == 1) {
            this.f5742b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo6642a(float f, float f2, boolean z) {
        ViewParent i;
        if (!mo6651m() || (i = m8301i(0)) == null) {
            return false;
        }
        return C2007x.m8478a(i, this.f5743c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo6643b(float f, float f2) {
        ViewParent i;
        if (!mo6651m() || (i = m8301i(0)) == null) {
            return false;
        }
        return C2007x.m8479b(i, this.f5743c, f, f2);
    }

    /* renamed from: c */
    public boolean mo6644c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo6645d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo6645d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        if (!mo6651m() || (i4 = m8301i(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f5743c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                iArr = m8302j();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C2007x.m8480c(i4, this.f5743c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f5743c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo6646e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m8300h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo6647f(int i, int i2, int i3, int i4, int[] iArr) {
        return m8300h(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: g */
    public boolean mo6648g(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m8300h(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    /* renamed from: k */
    public boolean mo6649k() {
        return mo6650l(0);
    }

    /* renamed from: l */
    public boolean mo6650l(int i) {
        return m8301i(i) != null;
    }

    /* renamed from: m */
    public boolean mo6651m() {
        return this.f5744d;
    }

    /* renamed from: n */
    public void mo6652n(boolean z) {
        if (this.f5744d) {
            C1988t.m8350I0(this.f5743c);
        }
        this.f5744d = z;
    }

    /* renamed from: p */
    public boolean mo6653p(int i) {
        return mo6654q(i, 0);
    }

    /* renamed from: q */
    public boolean mo6654q(int i, int i2) {
        if (mo6650l(i2)) {
            return true;
        }
        if (!mo6651m()) {
            return false;
        }
        View view = this.f5743c;
        for (ViewParent parent = this.f5743c.getParent(); parent != null; parent = parent.getParent()) {
            if (C2007x.m8483f(parent, view, this.f5743c, i, i2)) {
                m8303o(i2, parent);
                C2007x.m8482e(parent, view, this.f5743c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void mo6655r() {
        mo6656s(0);
    }

    /* renamed from: s */
    public void mo6656s(int i) {
        ViewParent i2 = m8301i(i);
        if (i2 != null) {
            C2007x.m8484g(i2, this.f5743c, i);
            m8303o(i, (ViewParent) null);
        }
    }
}
