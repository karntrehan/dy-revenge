package androidx.lifecycle;

import androidx.lifecycle.C1281a;
import androidx.lifecycle.C1286d;

class ReflectiveGenericLifecycleObserver implements C1289e {

    /* renamed from: f */
    private final Object f3701f;

    /* renamed from: o */
    private final C1281a.C1282a f3702o;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3701f = obj;
        this.f3702o = C1281a.f3707a.mo4325c(obj.getClass());
    }

    /* renamed from: h */
    public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
        this.f3702o.mo4327a(gVar, aVar, this.f3701f);
    }
}
