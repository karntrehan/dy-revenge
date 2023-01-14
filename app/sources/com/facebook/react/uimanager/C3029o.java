package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.uimanager.o */
public class C3029o {

    /* renamed from: a */
    private final C3061z0 f8414a;

    /* renamed from: b */
    private final C2998l0 f8415b;

    /* renamed from: c */
    private final SparseBooleanArray f8416c = new SparseBooleanArray();

    /* renamed from: com.facebook.react.uimanager.o$a */
    private static class C3030a {

        /* renamed from: a */
        public final C2931d0 f8417a;

        /* renamed from: b */
        public final int f8418b;

        C3030a(C2931d0 d0Var, int i) {
            this.f8417a = d0Var;
            this.f8418b = i;
        }
    }

    public C3029o(C3061z0 z0Var, C2998l0 l0Var) {
        this.f8414a = z0Var;
        this.f8415b = l0Var;
    }

    /* renamed from: a */
    private void m11965a(C2931d0 d0Var, C2931d0 d0Var2, int i) {
        C6409a.m24519a(d0Var2.mo9507J() != C3000m.PARENT);
        for (int i2 = 0; i2 < d0Var2.mo9526b(); i2++) {
            C2931d0 a = d0Var2.mo9524a(i2);
            C6409a.m24519a(a.mo9523Z() == null);
            int y = d0Var.mo9553y();
            if (a.mo9507J() == C3000m.NONE) {
                m11968d(d0Var, a, i);
            } else {
                m11966b(d0Var, a, i);
            }
            i += d0Var.mo9553y() - y;
        }
    }

    /* renamed from: b */
    private void m11966b(C2931d0 d0Var, C2931d0 d0Var2, int i) {
        d0Var.mo9498A(d0Var2, i);
        this.f8414a.mo9881I(d0Var.mo9548t(), (int[]) null, new C2920a1[]{new C2920a1(d0Var2.mo9548t(), i)}, (int[]) null);
        if (d0Var2.mo9507J() != C3000m.PARENT) {
            m11965a(d0Var, d0Var2, i + 1);
        }
    }

    /* renamed from: c */
    private void m11967c(C2931d0 d0Var, C2931d0 d0Var2, int i) {
        int x = d0Var.mo9552x(d0Var.mo9524a(i));
        if (d0Var.mo9507J() != C3000m.PARENT) {
            C3030a s = m11975s(d0Var, x);
            if (s != null) {
                C2931d0 d0Var3 = s.f8417a;
                x = s.f8418b;
                d0Var = d0Var3;
            } else {
                return;
            }
        }
        if (d0Var2.mo9507J() != C3000m.NONE) {
            m11966b(d0Var, d0Var2, x);
        } else {
            m11968d(d0Var, d0Var2, x);
        }
    }

    /* renamed from: d */
    private void m11968d(C2931d0 d0Var, C2931d0 d0Var2, int i) {
        m11965a(d0Var, d0Var2, i);
    }

    /* renamed from: e */
    private void m11969e(C2931d0 d0Var) {
        int t = d0Var.mo9548t();
        if (!this.f8416c.get(t)) {
            this.f8416c.put(t, true);
            C2931d0 parent = d0Var.getParent();
            int T = d0Var.mo9517T();
            int G = d0Var.mo9504G();
            while (parent != null && parent.mo9507J() != C3000m.PARENT) {
                if (!parent.mo9551w()) {
                    T += Math.round(parent.mo9519V());
                    G += Math.round(parent.mo9515R());
                }
                parent = parent.getParent();
            }
            m11970f(d0Var, T, G);
        }
    }

    /* renamed from: f */
    private void m11970f(C2931d0 d0Var, int i, int i2) {
        if (d0Var.mo9507J() == C3000m.NONE || d0Var.mo9523Z() == null) {
            for (int i3 = 0; i3 < d0Var.mo9526b(); i3++) {
                C2931d0 a = d0Var.mo9524a(i3);
                int t = a.mo9548t();
                if (!this.f8416c.get(t)) {
                    this.f8416c.put(t, true);
                    m11970f(a, a.mo9517T() + i, a.mo9504G() + i2);
                }
            }
            return;
        }
        this.f8414a.mo9891S(d0Var.mo9521X().mo9548t(), d0Var.mo9548t(), i, i2, d0Var.mo9502E(), d0Var.mo9531f());
    }

    /* renamed from: j */
    public static void m11971j(C2931d0 d0Var) {
        d0Var.mo9549u();
    }

    /* renamed from: n */
    private static boolean m11972n(C2962f0 f0Var) {
        if (f0Var == null) {
            return true;
        }
        if (f0Var.mo9678g("collapsable") && !f0Var.mo9673b("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator keySetIterator = f0Var.f8288a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            if (!C2983h1.m11837a(f0Var.f8288a, keySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private void m11973q(C2931d0 d0Var, boolean z) {
        if (d0Var.mo9507J() != C3000m.PARENT) {
            for (int b = d0Var.mo9526b() - 1; b >= 0; b--) {
                m11973q(d0Var.mo9524a(b), z);
            }
        }
        C2931d0 Z = d0Var.mo9523Z();
        if (Z != null) {
            int z2 = Z.mo9554z(d0Var);
            Z.mo9518U(z2);
            this.f8414a.mo9881I(Z.mo9548t(), new int[]{z2}, (C2920a1[]) null, z ? new int[]{d0Var.mo9548t()} : null);
        }
    }

    /* renamed from: r */
    private void m11974r(C2931d0 d0Var, C2962f0 f0Var) {
        C2931d0 parent = d0Var.getParent();
        if (parent == null) {
            d0Var.mo9525a0(false);
            return;
        }
        int N = parent.mo9511N(d0Var);
        parent.mo9536h(N);
        m11973q(d0Var, false);
        d0Var.mo9525a0(false);
        this.f8414a.mo9875C(d0Var.mo9506I(), d0Var.mo9548t(), d0Var.mo9512O(), f0Var);
        parent.mo9509L(d0Var, N);
        m11967c(parent, d0Var, N);
        for (int i = 0; i < d0Var.mo9526b(); i++) {
            m11967c(d0Var, d0Var.mo9524a(i), i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Transitioning LayoutOnlyView - tag: ");
        sb.append(d0Var.mo9548t());
        sb.append(" - rootTag: ");
        sb.append(d0Var.mo9508K());
        sb.append(" - hasProps: ");
        boolean z = true;
        sb.append(f0Var != null);
        sb.append(" - tagsWithLayout.size: ");
        sb.append(this.f8416c.size());
        C6071a.m22880n("NativeViewHierarchyOptimizer", sb.toString());
        if (this.f8416c.size() != 0) {
            z = false;
        }
        C6409a.m24519a(z);
        m11969e(d0Var);
        for (int i2 = 0; i2 < d0Var.mo9526b(); i2++) {
            m11969e(d0Var.mo9524a(i2));
        }
        this.f8416c.clear();
    }

    /* renamed from: s */
    private C3030a m11975s(C2931d0 d0Var, int i) {
        while (d0Var.mo9507J() != C3000m.PARENT) {
            C2931d0 parent = d0Var.getParent();
            if (parent == null) {
                return null;
            }
            i = i + (d0Var.mo9507J() == C3000m.LEAF ? 1 : 0) + parent.mo9552x(d0Var);
            d0Var = parent;
        }
        return new C3030a(d0Var, i);
    }

    /* renamed from: g */
    public void mo9798g(C2931d0 d0Var, C3031o0 o0Var, C2962f0 f0Var) {
        d0Var.mo9525a0(d0Var.mo9512O().equals(ReactViewManager.REACT_CLASS) && m11972n(f0Var));
        if (d0Var.mo9507J() != C3000m.NONE) {
            this.f8414a.mo9875C(o0Var, d0Var.mo9548t(), d0Var.mo9512O(), f0Var);
        }
    }

    /* renamed from: h */
    public void mo9799h(C2931d0 d0Var) {
        if (d0Var.mo9528c0()) {
            m11974r(d0Var, (C2962f0) null);
        }
    }

    /* renamed from: i */
    public void mo9800i(C2931d0 d0Var, int[] iArr, int[] iArr2, C2920a1[] a1VarArr, int[] iArr3) {
        boolean z;
        for (int i : iArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr3.length) {
                    z = false;
                    break;
                } else if (iArr3[i2] == i) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            m11973q(this.f8415b.mo9729c(i), z);
        }
        for (C2920a1 a1Var : a1VarArr) {
            m11967c(d0Var, this.f8415b.mo9729c(a1Var.f8199b), a1Var.f8200c);
        }
    }

    /* renamed from: k */
    public void mo9801k(C2931d0 d0Var, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            m11967c(d0Var, this.f8415b.mo9729c(readableArray.getInt(i)), i);
        }
    }

    /* renamed from: l */
    public void mo9802l(C2931d0 d0Var) {
        m11969e(d0Var);
    }

    /* renamed from: m */
    public void mo9803m(C2931d0 d0Var, String str, C2962f0 f0Var) {
        if (d0Var.mo9528c0() && !m11972n(f0Var)) {
            m11974r(d0Var, f0Var);
        } else if (!d0Var.mo9528c0()) {
            this.f8414a.mo9892T(d0Var.mo9548t(), str, f0Var);
        }
    }

    /* renamed from: o */
    public void mo9804o() {
        this.f8416c.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo9805p(C2931d0 d0Var) {
        this.f8416c.clear();
    }
}
