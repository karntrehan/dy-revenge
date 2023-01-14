package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m */
public abstract class C1408m extends RecyclerView.C1336l {

    /* renamed from: g */
    boolean f4133g = true;

    /* renamed from: A */
    public final void mo5214A(RecyclerView.C1328d0 d0Var) {
        mo5222I(d0Var);
        mo4789h(d0Var);
    }

    /* renamed from: B */
    public final void mo5215B(RecyclerView.C1328d0 d0Var) {
        mo5223J(d0Var);
    }

    /* renamed from: C */
    public final void mo5216C(RecyclerView.C1328d0 d0Var, boolean z) {
        mo5224K(d0Var, z);
        mo4789h(d0Var);
    }

    /* renamed from: D */
    public final void mo5217D(RecyclerView.C1328d0 d0Var, boolean z) {
        mo5225L(d0Var, z);
    }

    /* renamed from: E */
    public final void mo5218E(RecyclerView.C1328d0 d0Var) {
        mo5226M(d0Var);
        mo4789h(d0Var);
    }

    /* renamed from: F */
    public final void mo5219F(RecyclerView.C1328d0 d0Var) {
        mo5227N(d0Var);
    }

    /* renamed from: G */
    public final void mo5220G(RecyclerView.C1328d0 d0Var) {
        mo5228O(d0Var);
        mo4789h(d0Var);
    }

    /* renamed from: H */
    public final void mo5221H(RecyclerView.C1328d0 d0Var) {
        mo5229P(d0Var);
    }

    /* renamed from: I */
    public void mo5222I(RecyclerView.C1328d0 d0Var) {
    }

    /* renamed from: J */
    public void mo5223J(RecyclerView.C1328d0 d0Var) {
    }

    /* renamed from: K */
    public void mo5224K(RecyclerView.C1328d0 d0Var, boolean z) {
    }

    /* renamed from: L */
    public void mo5225L(RecyclerView.C1328d0 d0Var, boolean z) {
    }

    /* renamed from: M */
    public void mo5226M(RecyclerView.C1328d0 d0Var) {
    }

    /* renamed from: N */
    public void mo5227N(RecyclerView.C1328d0 d0Var) {
    }

    /* renamed from: O */
    public void mo5228O(RecyclerView.C1328d0 d0Var) {
    }

    /* renamed from: P */
    public void mo5229P(RecyclerView.C1328d0 d0Var) {
    }

    /* renamed from: a */
    public boolean mo4783a(RecyclerView.C1328d0 d0Var, RecyclerView.C1336l.C1339c cVar, RecyclerView.C1336l.C1339c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.f3866a) == (i2 = cVar2.f3866a) && cVar.f3867b == cVar2.f3867b)) {
            return mo5126w(d0Var);
        }
        return mo5128y(d0Var, i, cVar.f3867b, i2, cVar2.f3867b);
    }

    /* renamed from: b */
    public boolean mo4784b(RecyclerView.C1328d0 d0Var, RecyclerView.C1328d0 d0Var2, RecyclerView.C1336l.C1339c cVar, RecyclerView.C1336l.C1339c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3866a;
        int i4 = cVar.f3867b;
        if (d0Var2.mo4709J()) {
            int i5 = cVar.f3866a;
            i = cVar.f3867b;
            i2 = i5;
        } else {
            i2 = cVar2.f3866a;
            i = cVar2.f3867b;
        }
        return mo5127x(d0Var, d0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo4785c(RecyclerView.C1328d0 d0Var, RecyclerView.C1336l.C1339c cVar, RecyclerView.C1336l.C1339c cVar2) {
        int i = cVar.f3866a;
        int i2 = cVar.f3867b;
        View view = d0Var.f3838b;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3866a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3867b;
        if (d0Var.mo4733v() || (i == left && i2 == top)) {
            return mo5129z(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo5128y(d0Var, i, i2, left, top);
    }

    /* renamed from: d */
    public boolean mo4786d(RecyclerView.C1328d0 d0Var, RecyclerView.C1336l.C1339c cVar, RecyclerView.C1336l.C1339c cVar2) {
        int i = cVar.f3866a;
        int i2 = cVar2.f3866a;
        if (i == i2 && cVar.f3867b == cVar2.f3867b) {
            mo5218E(d0Var);
            return false;
        }
        return mo5128y(d0Var, i, cVar.f3867b, i2, cVar2.f3867b);
    }

    /* renamed from: f */
    public boolean mo4787f(RecyclerView.C1328d0 d0Var) {
        return !this.f4133g || d0Var.mo4730t();
    }

    /* renamed from: w */
    public abstract boolean mo5126w(RecyclerView.C1328d0 d0Var);

    /* renamed from: x */
    public abstract boolean mo5127x(RecyclerView.C1328d0 d0Var, RecyclerView.C1328d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo5128y(RecyclerView.C1328d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo5129z(RecyclerView.C1328d0 d0Var);
}
