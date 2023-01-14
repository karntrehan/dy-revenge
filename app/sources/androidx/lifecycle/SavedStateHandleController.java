package androidx.lifecycle;

import androidx.lifecycle.C1286d;
import androidx.savedstate.C1423b;
import androidx.savedstate.SavedStateRegistry;

final class SavedStateHandleController implements C1289e {

    /* renamed from: f */
    private boolean f3703f;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    static final class C1280a implements SavedStateRegistry.C1420a {
        C1280a() {
        }

        /* renamed from: a */
        public void mo4324a(C1423b bVar) {
            if (bVar instanceof C1312t) {
                C1311s g = ((C1312t) bVar).mo129g();
                SavedStateRegistry j = bVar.mo131j();
                for (String b : g.mo4381c()) {
                    SavedStateHandleController.m5279a(g.mo4380b(b), j, bVar.getLifecycle());
                }
                if (!g.mo4381c().isEmpty()) {
                    j.mo5264e(C1280a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: a */
    static void m5279a(C1306q qVar, SavedStateRegistry savedStateRegistry, C1286d dVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) qVar.mo4374c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo4323d()) {
            savedStateHandleController.mo4322c(savedStateRegistry, dVar);
            m5280e(savedStateRegistry, dVar);
        }
    }

    /* renamed from: e */
    private static void m5280e(final SavedStateRegistry savedStateRegistry, final C1286d dVar) {
        C1286d.C1288b b = dVar.mo4339b();
        if (b == C1286d.C1288b.INITIALIZED || b.mo4341e(C1286d.C1288b.STARTED)) {
            savedStateRegistry.mo5264e(C1280a.class);
        } else {
            dVar.mo4338a(new C1289e() {
                /* renamed from: h */
                public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
                    if (aVar == C1286d.C1287a.ON_START) {
                        dVar.mo4340c(this);
                        savedStateRegistry.mo5264e(C1280a.class);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4322c(SavedStateRegistry savedStateRegistry, C1286d dVar) {
        if (this.f3703f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3703f = true;
        dVar.mo4338a(this);
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4323d() {
        return this.f3703f;
    }

    /* renamed from: h */
    public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
        if (aVar == C1286d.C1287a.ON_DESTROY) {
            this.f3703f = false;
            gVar.getLifecycle().mo4340c(this);
        }
    }
}
