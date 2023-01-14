package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.common.C2696f;

/* renamed from: com.facebook.react.uimanager.l0 */
public class C2998l0 {

    /* renamed from: a */
    private final SparseArray<C2931d0> f8328a = new SparseArray<>();

    /* renamed from: b */
    private final SparseBooleanArray f8329b = new SparseBooleanArray();

    /* renamed from: c */
    private final C2696f f8330c = new C2696f();

    /* renamed from: a */
    public void mo9727a(C2931d0 d0Var) {
        this.f8330c.mo8816a();
        this.f8328a.put(d0Var.mo9548t(), d0Var);
    }

    /* renamed from: b */
    public void mo9728b(C2931d0 d0Var) {
        this.f8330c.mo8816a();
        int t = d0Var.mo9548t();
        this.f8328a.put(t, d0Var);
        this.f8329b.put(t, true);
    }

    /* renamed from: c */
    public C2931d0 mo9729c(int i) {
        this.f8330c.mo8816a();
        return this.f8328a.get(i);
    }

    /* renamed from: d */
    public int mo9730d() {
        this.f8330c.mo8816a();
        return this.f8329b.size();
    }

    /* renamed from: e */
    public int mo9731e(int i) {
        this.f8330c.mo8816a();
        return this.f8329b.keyAt(i);
    }

    /* renamed from: f */
    public boolean mo9732f(int i) {
        this.f8330c.mo8816a();
        return this.f8329b.get(i);
    }

    /* renamed from: g */
    public void mo9733g(int i) {
        this.f8330c.mo8816a();
        if (!this.f8329b.get(i)) {
            this.f8328a.remove(i);
            return;
        }
        throw new C2981h("Trying to remove root node " + i + " without using removeRootNode!");
    }

    /* renamed from: h */
    public void mo9734h(int i) {
        this.f8330c.mo8816a();
        if (i != -1) {
            if (this.f8329b.get(i)) {
                this.f8328a.remove(i);
                this.f8329b.delete(i);
                return;
            }
            throw new C2981h("View with tag " + i + " is not registered as a root view");
        }
    }
}
