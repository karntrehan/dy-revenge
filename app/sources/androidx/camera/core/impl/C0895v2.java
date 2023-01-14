package androidx.camera.core.impl;

import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0840m2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.v2 */
public final class C0895v2 {

    /* renamed from: a */
    private final String f2573a;

    /* renamed from: b */
    private final Map<String, C0897b> f2574b = new LinkedHashMap();

    /* renamed from: androidx.camera.core.impl.v2$a */
    private interface C0896a {
        /* renamed from: a */
        boolean mo3080a(C0897b bVar);
    }

    /* renamed from: androidx.camera.core.impl.v2$b */
    private static final class C0897b {

        /* renamed from: a */
        private final C0840m2 f2575a;

        /* renamed from: b */
        private boolean f2576b = false;

        /* renamed from: c */
        private boolean f2577c = false;

        C0897b(C0840m2 m2Var) {
            this.f2575a = m2Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3130a() {
            return this.f2577c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3131b() {
            return this.f2576b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0840m2 mo3132c() {
            return this.f2575a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3133d(boolean z) {
            this.f2577c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3134e(boolean z) {
            this.f2576b = z;
        }
    }

    public C0895v2(String str) {
        this.f2573a = str;
    }

    /* renamed from: e */
    private C0897b m3524e(String str, C0840m2 m2Var) {
        C0897b bVar = this.f2574b.get(str);
        if (bVar != null) {
            return bVar;
        }
        C0897b bVar2 = new C0897b(m2Var);
        this.f2574b.put(str, bVar2);
        return bVar2;
    }

    /* renamed from: f */
    private Collection<C0840m2> m3525f(C0896a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f2574b.entrySet()) {
            if (aVar == null || aVar.mo3080a((C0897b) next.getValue())) {
                arrayList.add(((C0897b) next.getValue()).mo3132c());
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    static /* synthetic */ boolean m3526h(C0897b bVar) {
        return bVar.mo3130a() && bVar.mo3131b();
    }

    /* renamed from: a */
    public C0840m2.C0846f mo3119a() {
        C0840m2.C0846f fVar = new C0840m2.C0846f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f2574b.entrySet()) {
            C0897b bVar = (C0897b) next.getValue();
            if (bVar.mo3130a() && bVar.mo3131b()) {
                fVar.mo3053a(bVar.mo3132c());
                arrayList.add((String) next.getKey());
            }
        }
        C0949o2.m3688a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f2573a);
        return fVar;
    }

    /* renamed from: b */
    public Collection<C0840m2> mo3120b() {
        return Collections.unmodifiableCollection(m3525f(C0856p.f2506a));
    }

    /* renamed from: c */
    public C0840m2.C0846f mo3121c() {
        C0840m2.C0846f fVar = new C0840m2.C0846f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f2574b.entrySet()) {
            C0897b bVar = (C0897b) next.getValue();
            if (bVar.mo3131b()) {
                fVar.mo3053a(bVar.mo3132c());
                arrayList.add((String) next.getKey());
            }
        }
        C0949o2.m3688a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f2573a);
        return fVar;
    }

    /* renamed from: d */
    public Collection<C0840m2> mo3122d() {
        return Collections.unmodifiableCollection(m3525f(C0852o.f2503a));
    }

    /* renamed from: g */
    public boolean mo3123g(String str) {
        if (!this.f2574b.containsKey(str)) {
            return false;
        }
        return this.f2574b.get(str).mo3131b();
    }

    /* renamed from: j */
    public void mo3124j(String str) {
        this.f2574b.remove(str);
    }

    /* renamed from: k */
    public void mo3125k(String str, C0840m2 m2Var) {
        m3524e(str, m2Var).mo3133d(true);
    }

    /* renamed from: l */
    public void mo3126l(String str, C0840m2 m2Var) {
        m3524e(str, m2Var).mo3134e(true);
    }

    /* renamed from: m */
    public void mo3127m(String str) {
        if (this.f2574b.containsKey(str)) {
            C0897b bVar = this.f2574b.get(str);
            bVar.mo3134e(false);
            if (!bVar.mo3130a()) {
                this.f2574b.remove(str);
            }
        }
    }

    /* renamed from: n */
    public void mo3128n(String str) {
        if (this.f2574b.containsKey(str)) {
            C0897b bVar = this.f2574b.get(str);
            bVar.mo3133d(false);
            if (!bVar.mo3131b()) {
                this.f2574b.remove(str);
            }
        }
    }

    /* renamed from: o */
    public void mo3129o(String str, C0840m2 m2Var) {
        if (this.f2574b.containsKey(str)) {
            C0897b bVar = new C0897b(m2Var);
            C0897b bVar2 = this.f2574b.get(str);
            bVar.mo3134e(bVar2.mo3131b());
            bVar.mo3133d(bVar2.mo3130a());
            this.f2574b.put(str, bVar);
        }
    }
}
