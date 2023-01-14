package p455g.p462v.p464k.p465a;

import p455g.p462v.C10376d;
import p455g.p462v.C10377e;
import p455g.p462v.C10381g;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.v.k.a.d */
public abstract class C10399d extends C10396a {

    /* renamed from: o */
    private final C10381g f27590o;

    /* renamed from: p */
    private transient C10376d<Object> f27591p;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10399d(C10376d<Object> dVar) {
        this(dVar, dVar != null ? dVar.mo25781a() : null);
    }

    public C10399d(C10376d<Object> dVar, C10381g gVar) {
        super(dVar);
        this.f27590o = gVar;
    }

    /* renamed from: a */
    public C10381g mo25781a() {
        C10381g gVar = this.f27590o;
        C10457l.m35317b(gVar);
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo25793o() {
        C10376d<Object> dVar = this.f27591p;
        if (!(dVar == null || dVar == this)) {
            C10381g.C10384b bVar = mo25781a().get(C10377e.f27571l);
            C10457l.m35317b(bVar);
            ((C10377e) bVar).mo25783h(dVar);
        }
        this.f27591p = C10398c.f27589f;
    }

    /* renamed from: p */
    public final C10376d<Object> mo25796p() {
        C10376d<Object> dVar = this.f27591p;
        if (dVar == null) {
            C10377e eVar = (C10377e) mo25781a().get(C10377e.f27571l);
            if (eVar == null || (dVar = eVar.mo25784r(this)) == null) {
                dVar = this;
            }
            this.f27591p = dVar;
        }
        return dVar;
    }
}
