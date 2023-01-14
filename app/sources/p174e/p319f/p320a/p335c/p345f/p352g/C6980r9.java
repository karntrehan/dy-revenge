package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.r9 */
final class C6980r9 extends C7012t9 {
    /* synthetic */ C6980r9(C6964q9 q9Var) {
        super((C6996s9) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20082a(Object obj, long j) {
        ((C6804g9) C7014tb.m26620k(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20083b(Object obj, Object obj2, long j) {
        C6804g9 g9Var = (C6804g9) C7014tb.m26620k(obj, j);
        C6804g9 g9Var2 = (C6804g9) C7014tb.m26620k(obj2, j);
        int size = g9Var.size();
        int size2 = g9Var2.size();
        if (size > 0 && size2 > 0) {
            if (!g9Var.mo19801a()) {
                g9Var = g9Var.mo19570f(size2 + size);
            }
            g9Var.addAll(g9Var2);
        }
        if (size > 0) {
            g9Var2 = g9Var;
        }
        C7014tb.m26633x(obj, j, g9Var2);
    }
}
