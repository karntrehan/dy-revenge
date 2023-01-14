package androidx.fragment.app;

import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1291g;
import androidx.lifecycle.C1292h;

/* renamed from: androidx.fragment.app.w */
class C1273w implements C1291g {

    /* renamed from: f */
    private C1292h f3677f = null;

    C1273w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4304a(C1286d.C1287a aVar) {
        this.f3677f.mo4342i(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4305c() {
        if (this.f3677f == null) {
            this.f3677f = new C1292h(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4306d() {
        return this.f3677f != null;
    }

    public C1286d getLifecycle() {
        mo4305c();
        return this.f3677f;
    }
}
