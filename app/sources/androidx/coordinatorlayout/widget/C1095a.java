package androidx.coordinatorlayout.widget;

import androidx.core.util.C1175f;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p027c.p060f.C1801g;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C1095a<T> {

    /* renamed from: a */
    private final C1175f<ArrayList<T>> f3058a = new Pools$SimplePool(10);

    /* renamed from: b */
    private final C1801g<T, ArrayList<T>> f3059b = new C1801g<>();

    /* renamed from: c */
    private final ArrayList<T> f3060c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f3061d = new HashSet<>();

    /* renamed from: e */
    private void m4280e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f3059b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m4280e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    private ArrayList<T> m4281f() {
        ArrayList<T> b = this.f3058a.mo3702b();
        return b == null ? new ArrayList<>() : b;
    }

    /* renamed from: k */
    private void m4282k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3058a.mo3701a(arrayList);
    }

    /* renamed from: a */
    public void mo3528a(T t, T t2) {
        if (!this.f3059b.containsKey(t) || !this.f3059b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f3059b.get(t);
        if (arrayList == null) {
            arrayList = m4281f();
            this.f3059b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo3529b(T t) {
        if (!this.f3059b.containsKey(t)) {
            this.f3059b.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo3530c() {
        int size = this.f3059b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f3059b.mo6263m(i);
            if (m != null) {
                m4282k(m);
            }
        }
        this.f3059b.clear();
    }

    /* renamed from: d */
    public boolean mo3531d(T t) {
        return this.f3059b.containsKey(t);
    }

    /* renamed from: g */
    public List mo3532g(T t) {
        return this.f3059b.get(t);
    }

    /* renamed from: h */
    public List<T> mo3533h(T t) {
        int size = this.f3059b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f3059b.mo6263m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3059b.mo6258i(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> mo3534i() {
        this.f3060c.clear();
        this.f3061d.clear();
        int size = this.f3059b.size();
        for (int i = 0; i < size; i++) {
            m4280e(this.f3059b.mo6258i(i), this.f3060c, this.f3061d);
        }
        return this.f3060c;
    }

    /* renamed from: j */
    public boolean mo3535j(T t) {
        int size = this.f3059b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f3059b.mo6263m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
