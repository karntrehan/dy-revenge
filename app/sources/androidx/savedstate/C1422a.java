package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C1286d;

/* renamed from: androidx.savedstate.a */
public final class C1422a {

    /* renamed from: a */
    private final C1423b f4161a;

    /* renamed from: b */
    private final SavedStateRegistry f4162b = new SavedStateRegistry();

    private C1422a(C1423b bVar) {
        this.f4161a = bVar;
    }

    /* renamed from: a */
    public static C1422a m6371a(C1423b bVar) {
        return new C1422a(bVar);
    }

    /* renamed from: b */
    public SavedStateRegistry mo5265b() {
        return this.f4162b;
    }

    /* renamed from: c */
    public void mo5266c(Bundle bundle) {
        C1286d lifecycle = this.f4161a.getLifecycle();
        if (lifecycle.mo4339b() == C1286d.C1288b.INITIALIZED) {
            lifecycle.mo4338a(new Recreator(this.f4161a));
            this.f4162b.mo5261b(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void mo5267d(Bundle bundle) {
        this.f4162b.mo5262c(bundle);
    }
}
