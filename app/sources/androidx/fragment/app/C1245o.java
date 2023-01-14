package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C1306q;
import androidx.lifecycle.C1307r;
import androidx.lifecycle.C1311s;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.o */
final class C1245o extends C1306q {

    /* renamed from: c */
    private static final C1307r.C1308a f3553c = new C1246a();

    /* renamed from: d */
    private final HashMap<String, Fragment> f3554d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C1245o> f3555e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, C1311s> f3556f = new HashMap<>();

    /* renamed from: g */
    private final boolean f3557g;

    /* renamed from: h */
    private boolean f3558h = false;

    /* renamed from: i */
    private boolean f3559i = false;

    /* renamed from: androidx.fragment.app.o$a */
    static class C1246a implements C1307r.C1308a {
        C1246a() {
        }

        /* renamed from: a */
        public <T extends C1306q> T mo4196a(Class<T> cls) {
            return new C1245o(true);
        }
    }

    C1245o(boolean z) {
        this.f3557g = z;
    }

    /* renamed from: i */
    static C1245o m5103i(C1311s sVar) {
        return (C1245o) new C1307r(sVar, f3553c).mo4375a(C1245o.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4183d() {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3558h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo4184e(Fragment fragment) {
        if (this.f3554d.containsKey(fragment.f3397s)) {
            return false;
        }
        this.f3554d.put(fragment.f3397s, fragment);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1245o.class != obj.getClass()) {
            return false;
        }
        C1245o oVar = (C1245o) obj;
        return this.f3554d.equals(oVar.f3554d) && this.f3555e.equals(oVar.f3555e) && this.f3556f.equals(oVar.f3556f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4186f(Fragment fragment) {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C1245o oVar = this.f3555e.get(fragment.f3397s);
        if (oVar != null) {
            oVar.mo4183d();
            this.f3555e.remove(fragment.f3397s);
        }
        C1311s sVar = this.f3556f.get(fragment.f3397s);
        if (sVar != null) {
            sVar.mo4379a();
            this.f3556f.remove(fragment.f3397s);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo4187g(String str) {
        return this.f3554d.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C1245o mo4188h(Fragment fragment) {
        C1245o oVar = this.f3555e.get(fragment.f3397s);
        if (oVar != null) {
            return oVar;
        }
        C1245o oVar2 = new C1245o(this.f3557g);
        this.f3555e.put(fragment.f3397s, oVar2);
        return oVar2;
    }

    public int hashCode() {
        return (((this.f3554d.hashCode() * 31) + this.f3555e.hashCode()) * 31) + this.f3556f.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Collection<Fragment> mo4190j() {
        return this.f3554d.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C1311s mo4191k(Fragment fragment) {
        C1311s sVar = this.f3556f.get(fragment.f3397s);
        if (sVar != null) {
            return sVar;
        }
        C1311s sVar2 = new C1311s();
        this.f3556f.put(fragment.f3397s, sVar2);
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo4192l() {
        return this.f3558h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo4193m(Fragment fragment) {
        return this.f3554d.remove(fragment.f3397s) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo4194n(Fragment fragment) {
        if (!this.f3554d.containsKey(fragment.f3397s)) {
            return true;
        }
        return this.f3557g ? this.f3558h : !this.f3559i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3554d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3555e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3556f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
