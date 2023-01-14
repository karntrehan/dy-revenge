package p173d;

import p173d.C5368f;

/* renamed from: d.h */
class C5374h {

    /* renamed from: a */
    private C5368f<?> f15028a;

    public C5374h(C5368f<?> fVar) {
        this.f15028a = fVar;
    }

    /* renamed from: a */
    public void mo16184a() {
        this.f15028a = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        C5368f.C5372d k;
        try {
            C5368f<?> fVar = this.f15028a;
            if (!(fVar == null || (k = C5368f.m19845k()) == null)) {
                k.mo16176a(fVar, new C5375i(fVar.mo16165i()));
            }
        } finally {
            super.finalize();
        }
    }
}
