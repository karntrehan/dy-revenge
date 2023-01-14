package com.google.firebase.crashlytics.p139h.p143k;

import com.google.firebase.crashlytics.p139h.p142j.C4577n;
import com.google.firebase.crashlytics.p139h.p142j.C4579o;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.crashlytics.h.k.i */
public class C4631i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4621f f13098a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4579o f13099b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f13100c;

    /* renamed from: d */
    private final C4632a f13101d = new C4632a(false);

    /* renamed from: e */
    private final C4632a f13102e = new C4632a(true);

    /* renamed from: f */
    private final AtomicMarkableReference<String> f13103f = new AtomicMarkableReference<>((Object) null, false);

    /* renamed from: com.google.firebase.crashlytics.h.k.i$a */
    private class C4632a {

        /* renamed from: a */
        final AtomicMarkableReference<C4617d> f13104a;

        /* renamed from: b */
        private final AtomicReference<Callable<Void>> f13105b = new AtomicReference<>((Object) null);

        /* renamed from: c */
        private final boolean f13106c;

        public C4632a(boolean z) {
            this.f13106c = z;
            this.f13104a = new AtomicMarkableReference<>(new C4617d(64, z ? 8192 : 1024), false);
        }

        /* renamed from: b */
        private /* synthetic */ Void m17643b() {
            this.f13105b.set((Object) null);
            m17645e();
            return null;
        }

        /* renamed from: d */
        private void m17644d() {
            C4615b bVar = new C4615b(this);
            if (this.f13105b.compareAndSet((Object) null, bVar)) {
                C4631i.this.f13099b.mo14159h(bVar);
            }
        }

        /* renamed from: e */
        private void m17645e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f13104a.isMarked()) {
                    map = this.f13104a.getReference().mo14243a();
                    AtomicMarkableReference<C4617d> atomicMarkableReference = this.f13104a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                C4631i.this.f13098a.mo14257l(C4631i.this.f13100c, map, this.f13106c);
            }
        }

        /* renamed from: a */
        public Map<String, String> mo14278a() {
            return this.f13104a.getReference().mo14243a();
        }

        /* renamed from: c */
        public /* synthetic */ Void mo14279c() {
            m17643b();
            return null;
        }

        /* renamed from: f */
        public boolean mo14280f(String str, String str2) {
            synchronized (this) {
                if (!this.f13104a.getReference().mo14244d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<C4617d> atomicMarkableReference = this.f13104a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                m17644d();
                return true;
            }
        }
    }

    public C4631i(String str, C4782f fVar, C4579o oVar) {
        this.f13100c = str;
        this.f13098a = new C4621f(fVar);
        this.f13099b = oVar;
    }

    /* renamed from: g */
    private /* synthetic */ Object m17633g() {
        m17636k();
        return null;
    }

    /* renamed from: i */
    public static C4631i m17634i(String str, C4782f fVar, C4579o oVar) {
        C4621f fVar2 = new C4621f(fVar);
        C4631i iVar = new C4631i(str, fVar, oVar);
        iVar.f13101d.f13104a.getReference().mo14245e(fVar2.mo14255g(str, false));
        iVar.f13102e.f13104a.getReference().mo14245e(fVar2.mo14255g(str, true));
        iVar.f13103f.set(fVar2.mo14256h(str), false);
        return iVar;
    }

    /* renamed from: j */
    public static String m17635j(String str, C4782f fVar) {
        return new C4621f(fVar).mo14256h(str);
    }

    /* renamed from: k */
    private void m17636k() {
        boolean z;
        String str;
        synchronized (this.f13103f) {
            z = false;
            if (this.f13103f.isMarked()) {
                str = mo14274f();
                this.f13103f.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            this.f13098a.mo14258m(this.f13100c, str);
        }
    }

    /* renamed from: d */
    public Map<String, String> mo14272d() {
        return this.f13101d.mo14278a();
    }

    /* renamed from: e */
    public Map<String, String> mo14273e() {
        return this.f13102e.mo14278a();
    }

    /* renamed from: f */
    public String mo14274f() {
        return this.f13103f.getReference();
    }

    /* renamed from: h */
    public /* synthetic */ Object mo14275h() {
        m17633g();
        return null;
    }

    /* renamed from: l */
    public boolean mo14276l(String str, String str2) {
        return this.f13101d.mo14280f(str, str2);
    }

    /* renamed from: m */
    public void mo14277m(String str) {
        String c = C4617d.m17564c(str, 1024);
        synchronized (this.f13103f) {
            if (!C4577n.m17369A(c, this.f13103f.getReference())) {
                this.f13103f.set(c, true);
                this.f13099b.mo14159h(new C4614a(this));
            }
        }
    }
}
