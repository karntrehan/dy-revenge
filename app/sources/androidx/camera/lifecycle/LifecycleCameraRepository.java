package androidx.camera.lifecycle;

import androidx.camera.core.C0608a3;
import androidx.camera.core.C0629c3;
import androidx.camera.core.p009e3.C0649e;
import androidx.core.util.C1177h;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1290f;
import androidx.lifecycle.C1291g;
import androidx.lifecycle.C1302o;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class LifecycleCameraRepository {

    /* renamed from: a */
    private final Object f2988a = new Object();

    /* renamed from: b */
    private final Map<C1078a, LifecycleCamera> f2989b = new HashMap();

    /* renamed from: c */
    private final Map<LifecycleCameraRepositoryObserver, Set<C1078a>> f2990c = new HashMap();

    /* renamed from: d */
    private final ArrayDeque<C1291g> f2991d = new ArrayDeque<>();

    private static class LifecycleCameraRepositoryObserver implements C1290f {

        /* renamed from: f */
        private final LifecycleCameraRepository f2992f;

        /* renamed from: o */
        private final C1291g f2993o;

        LifecycleCameraRepositoryObserver(C1291g gVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f2993o = gVar;
            this.f2992f = lifecycleCameraRepository;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1291g mo3403a() {
            return this.f2993o;
        }

        @C1302o(C1286d.C1287a.ON_DESTROY)
        public void onDestroy(C1291g gVar) {
            this.f2992f.mo3402l(gVar);
        }

        @C1302o(C1286d.C1287a.ON_START)
        public void onStart(C1291g gVar) {
            this.f2992f.mo3399h(gVar);
        }

        @C1302o(C1286d.C1287a.ON_STOP)
        public void onStop(C1291g gVar) {
            this.f2992f.mo3400i(gVar);
        }
    }

    /* renamed from: androidx.camera.lifecycle.LifecycleCameraRepository$a */
    static abstract class C1078a {
        C1078a() {
        }

        /* renamed from: a */
        static C1078a m4154a(C1291g gVar, C0649e.C0651b bVar) {
            return new C1082d(gVar, bVar);
        }

        /* renamed from: b */
        public abstract C0649e.C0651b mo3407b();

        /* renamed from: c */
        public abstract C1291g mo3408c();
    }

    LifecycleCameraRepository() {
    }

    /* renamed from: d */
    private LifecycleCameraRepositoryObserver m4140d(C1291g gVar) {
        synchronized (this.f2988a) {
            for (LifecycleCameraRepositoryObserver next : this.f2990c.keySet()) {
                if (gVar.equals(next.mo3403a())) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: f */
    private boolean m4141f(C1291g gVar) {
        synchronized (this.f2988a) {
            LifecycleCameraRepositoryObserver d = m4140d(gVar);
            if (d == null) {
                return false;
            }
            for (C1078a aVar : this.f2990c.get(d)) {
                if (!((LifecycleCamera) C1177h.m4583e(this.f2989b.get(aVar))).mo3390p().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: g */
    private void m4142g(LifecycleCamera lifecycleCamera) {
        synchronized (this.f2988a) {
            C1291g o = lifecycleCamera.mo3384o();
            C1078a a = C1078a.m4154a(o, lifecycleCamera.mo3383n().mo2703u());
            LifecycleCameraRepositoryObserver d = m4140d(o);
            Set hashSet = d != null ? this.f2990c.get(d) : new HashSet();
            hashSet.add(a);
            this.f2989b.put(a, lifecycleCamera);
            if (d == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(o, this);
                this.f2990c.put(lifecycleCameraRepositoryObserver, hashSet);
                o.getLifecycle().mo4338a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    /* renamed from: j */
    private void m4143j(C1291g gVar) {
        synchronized (this.f2988a) {
            for (C1078a aVar : this.f2990c.get(m4140d(gVar))) {
                ((LifecycleCamera) C1177h.m4583e(this.f2989b.get(aVar))).mo3392r();
            }
        }
    }

    /* renamed from: m */
    private void m4144m(C1291g gVar) {
        synchronized (this.f2988a) {
            for (C1078a aVar : this.f2990c.get(m4140d(gVar))) {
                LifecycleCamera lifecycleCamera = this.f2989b.get(aVar);
                if (!((LifecycleCamera) C1177h.m4583e(lifecycleCamera)).mo3390p().isEmpty()) {
                    lifecycleCamera.mo3394t();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3395a(LifecycleCamera lifecycleCamera, C0629c3 c3Var, Collection<C0608a3> collection) {
        synchronized (this.f2988a) {
            C1177h.m4579a(!collection.isEmpty());
            C1291g o = lifecycleCamera.mo3384o();
            for (C1078a aVar : this.f2990c.get(m4140d(o))) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) C1177h.m4583e(this.f2989b.get(aVar));
                if (!lifecycleCamera2.equals(lifecycleCamera)) {
                    if (!lifecycleCamera2.mo3390p().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                lifecycleCamera.mo3383n().mo2697G(c3Var);
                lifecycleCamera.mo3381d(collection);
                if (o.getLifecycle().mo4339b().mo4341e(C1286d.C1288b.STARTED)) {
                    mo3399h(o);
                }
            } catch (C0649e.C0650a e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public LifecycleCamera mo3396b(C1291g gVar, C0649e eVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2988a) {
            C1177h.m4580b(this.f2989b.get(C1078a.m4154a(gVar, eVar.mo2703u())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (gVar.getLifecycle().mo4339b() != C1286d.C1288b.DESTROYED) {
                lifecycleCamera = new LifecycleCamera(gVar, eVar);
                if (eVar.mo2704w().isEmpty()) {
                    lifecycleCamera.mo3392r();
                }
                m4142g(lifecycleCamera);
            } else {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
        }
        return lifecycleCamera;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public LifecycleCamera mo3397c(C1291g gVar, C0649e.C0651b bVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2988a) {
            lifecycleCamera = this.f2989b.get(C1078a.m4154a(gVar, bVar));
        }
        return lifecycleCamera;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Collection<LifecycleCamera> mo3398e() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.f2988a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f2989b.values());
        }
        return unmodifiableCollection;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3399h(C1291g gVar) {
        ArrayDeque<C1291g> arrayDeque;
        synchronized (this.f2988a) {
            if (m4141f(gVar)) {
                if (this.f2991d.isEmpty()) {
                    arrayDeque = this.f2991d;
                } else {
                    C1291g peek = this.f2991d.peek();
                    if (!gVar.equals(peek)) {
                        m4143j(peek);
                        this.f2991d.remove(gVar);
                        arrayDeque = this.f2991d;
                    }
                    m4144m(gVar);
                }
                arrayDeque.push(gVar);
                m4144m(gVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3400i(C1291g gVar) {
        synchronized (this.f2988a) {
            this.f2991d.remove(gVar);
            m4143j(gVar);
            if (!this.f2991d.isEmpty()) {
                m4144m(this.f2991d.peek());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3401k() {
        synchronized (this.f2988a) {
            for (C1078a aVar : this.f2989b.keySet()) {
                LifecycleCamera lifecycleCamera = this.f2989b.get(aVar);
                lifecycleCamera.mo3393s();
                mo3400i(lifecycleCamera.mo3384o());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3402l(C1291g gVar) {
        synchronized (this.f2988a) {
            LifecycleCameraRepositoryObserver d = m4140d(gVar);
            if (d != null) {
                mo3400i(gVar);
                for (C1078a remove : this.f2990c.get(d)) {
                    this.f2989b.remove(remove);
                }
                this.f2990c.remove(d);
                d.mo3403a().getLifecycle().mo4340c(d);
            }
        }
    }
}
