package androidx.lifecycle;

import androidx.lifecycle.C1286d;

class CompositeGeneratedAdaptersObserver implements C1289e {

    /* renamed from: f */
    private final C1285c[] f3678f;

    CompositeGeneratedAdaptersObserver(C1285c[] cVarArr) {
        this.f3678f = cVarArr;
    }

    /* renamed from: h */
    public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
        C1299l lVar = new C1299l();
        for (C1285c a : this.f3678f) {
            a.mo4337a(gVar, aVar, false, lVar);
        }
        for (C1285c a2 : this.f3678f) {
            a2.mo4337a(gVar, aVar, true, lVar);
        }
    }
}
