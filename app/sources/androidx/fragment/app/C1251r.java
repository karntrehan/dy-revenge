package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.r */
class C1251r {

    /* renamed from: a */
    private final ArrayList<Fragment> f3577a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C1249q> f3578b = new HashMap<>();

    C1251r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4222a(Fragment fragment) {
        if (!this.f3577a.contains(fragment)) {
            synchronized (this.f3577a) {
                this.f3577a.add(fragment);
            }
            fragment.f3403y = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4223b() {
        this.f3578b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4224c(String str) {
        return this.f3578b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4225d(int i) {
        Iterator<Fragment> it = this.f3577a.iterator();
        while (it.hasNext()) {
            C1249q qVar = this.f3578b.get(it.next().f3397s);
            if (qVar != null) {
                qVar.mo4219q(i);
            }
        }
        for (C1249q next : this.f3578b.values()) {
            if (next != null) {
                next.mo4219q(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4226e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3578b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C1249q next : this.f3578b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment i = next.mo4212i();
                    printWriter.println(i);
                    i.mo3895f(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3577a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f3577a.get(i2).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment mo4227f(String str) {
        C1249q qVar = this.f3578b.get(str);
        if (qVar != null) {
            return qVar.mo4212i();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo4228g(int i) {
        for (int size = this.f3577a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3577a.get(size);
            if (fragment != null && fragment.f3366J == i) {
                return fragment;
            }
        }
        for (C1249q next : this.f3578b.values()) {
            if (next != null) {
                Fragment i2 = next.mo4212i();
                if (i2.f3366J == i) {
                    return i2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo4229h(String str) {
        if (str != null) {
            for (int size = this.f3577a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3577a.get(size);
                if (fragment != null && str.equals(fragment.f3368L)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C1249q next : this.f3578b.values()) {
            if (next != null) {
                Fragment i = next.mo4212i();
                if (str.equals(i.f3368L)) {
                    return i;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo4230i(String str) {
        Fragment k;
        for (C1249q next : this.f3578b.values()) {
            if (next != null && (k = next.mo4212i().mo3906k(str)) != null) {
                return k;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Fragment mo4231j(Fragment fragment) {
        ViewGroup viewGroup = fragment.f3376T;
        View view = fragment.f3377U;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f3577a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f3577a.get(indexOf);
                if (fragment2.f3376T == viewGroup && fragment2.f3377U != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<Fragment> mo4232k() {
        ArrayList arrayList = new ArrayList();
        Iterator<C1249q> it = this.f3578b.values().iterator();
        while (it.hasNext()) {
            C1249q next = it.next();
            arrayList.add(next != null ? next.mo4212i() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C1249q mo4233l(String str) {
        return this.f3578b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Fragment> mo4234m() {
        ArrayList arrayList;
        if (this.f3577a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3577a) {
            arrayList = new ArrayList(this.f3577a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4235n(C1249q qVar) {
        this.f3578b.put(qVar.mo4212i().f3397s, qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4236o(C1249q qVar) {
        Fragment i = qVar.mo4212i();
        for (C1249q next : this.f3578b.values()) {
            if (next != null) {
                Fragment i2 = next.mo4212i();
                if (i.f3397s.equals(i2.f3400v)) {
                    i2.f3399u = i;
                    i2.f3400v = null;
                }
            }
        }
        this.f3578b.put(i.f3397s, (Object) null);
        String str = i.f3400v;
        if (str != null) {
            i.f3399u = mo4227f(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4237p(Fragment fragment) {
        synchronized (this.f3577a) {
            this.f3577a.remove(fragment);
        }
        fragment.f3403y = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4238q() {
        this.f3578b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4239r(List<String> list) {
        this.f3577a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo4227f(next);
                if (f != null) {
                    if (C1231l.m5013s0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f);
                    }
                    mo4222a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public ArrayList<C1247p> mo4240s() {
        ArrayList<C1247p> arrayList = new ArrayList<>(this.f3578b.size());
        for (C1249q next : this.f3578b.values()) {
            if (next != null) {
                Fragment i = next.mo4212i();
                C1247p o = next.mo4217o();
                arrayList.add(o);
                if (C1231l.m5013s0(2)) {
                    Log.v("FragmentManager", "Saved state of " + i + ": " + o.f3572z);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public ArrayList<String> mo4241t() {
        synchronized (this.f3577a) {
            if (this.f3577a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3577a.size());
            Iterator<Fragment> it = this.f3577a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f3397s);
                if (C1231l.m5013s0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f3397s + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
