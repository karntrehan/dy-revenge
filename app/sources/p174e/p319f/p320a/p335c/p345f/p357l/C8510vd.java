package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.vd */
final class C8510vd extends C8528wd {
    /* synthetic */ C8510vd(C8474td tdVar) {
        super((C8474td) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22170a(Object obj, long j) {
        ((C8292jd) C8494uf.m29105k(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <E> void mo22171b(Object obj, Object obj2, long j) {
        C8292jd jdVar = (C8292jd) C8494uf.m29105k(obj, j);
        C8292jd jdVar2 = (C8292jd) C8494uf.m29105k(obj2, j);
        int size = jdVar.size();
        int size2 = jdVar2.size();
        if (size > 0 && size2 > 0) {
            if (!jdVar.mo21893a()) {
                jdVar = jdVar.mo21793f(size2 + size);
            }
            jdVar.addAll(jdVar2);
        }
        if (size > 0) {
            jdVar2 = jdVar;
        }
        C8494uf.m29118x(obj, j, jdVar2);
    }
}
