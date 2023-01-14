package androidx.recyclerview.widget;

import androidx.core.util.C1175f;
import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import p027c.p060f.C1793d;
import p027c.p060f.C1801g;

/* renamed from: androidx.recyclerview.widget.p */
class C1415p {

    /* renamed from: a */
    final C1801g<RecyclerView.C1328d0, C1416a> f4147a = new C1801g<>();

    /* renamed from: b */
    final C1793d<RecyclerView.C1328d0> f4148b = new C1793d<>();

    /* renamed from: androidx.recyclerview.widget.p$a */
    static class C1416a {

        /* renamed from: a */
        static C1175f<C1416a> f4149a = new Pools$SimplePool(20);

        /* renamed from: b */
        int f4150b;

        /* renamed from: c */
        RecyclerView.C1336l.C1339c f4151c;

        /* renamed from: d */
        RecyclerView.C1336l.C1339c f4152d;

        private C1416a() {
        }

        /* renamed from: a */
        static void m6352a() {
            do {
            } while (f4149a.mo3702b() != null);
        }

        /* renamed from: b */
        static C1416a m6353b() {
            C1416a b = f4149a.mo3702b();
            return b == null ? new C1416a() : b;
        }

        /* renamed from: c */
        static void m6354c(C1416a aVar) {
            aVar.f4150b = 0;
            aVar.f4151c = null;
            aVar.f4152d = null;
            f4149a.mo3701a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    interface C1417b {
        /* renamed from: a */
        void mo4696a(RecyclerView.C1328d0 d0Var);

        /* renamed from: b */
        void mo4697b(RecyclerView.C1328d0 d0Var, RecyclerView.C1336l.C1339c cVar, RecyclerView.C1336l.C1339c cVar2);

        /* renamed from: c */
        void mo4698c(RecyclerView.C1328d0 d0Var, RecyclerView.C1336l.C1339c cVar, RecyclerView.C1336l.C1339c cVar2);

        /* renamed from: d */
        void mo4699d(RecyclerView.C1328d0 d0Var, RecyclerView.C1336l.C1339c cVar, RecyclerView.C1336l.C1339c cVar2);
    }

    C1415p() {
    }

    /* renamed from: l */
    private RecyclerView.C1336l.C1339c m6335l(RecyclerView.C1328d0 d0Var, int i) {
        C1416a m;
        RecyclerView.C1336l.C1339c cVar;
        int f = this.f4147a.mo6252f(d0Var);
        if (f >= 0 && (m = this.f4147a.mo6263m(f)) != null) {
            int i2 = m.f4150b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                m.f4150b = i3;
                if (i == 4) {
                    cVar = m.f4151c;
                } else if (i == 8) {
                    cVar = m.f4152d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f4147a.mo6261k(f);
                    C1416a.m6354c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5242a(RecyclerView.C1328d0 d0Var, RecyclerView.C1336l.C1339c cVar) {
        C1416a aVar = this.f4147a.get(d0Var);
        if (aVar == null) {
            aVar = C1416a.m6353b();
            this.f4147a.put(d0Var, aVar);
        }
        aVar.f4150b |= 2;
        aVar.f4151c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5243b(RecyclerView.C1328d0 d0Var) {
        C1416a aVar = this.f4147a.get(d0Var);
        if (aVar == null) {
            aVar = C1416a.m6353b();
            this.f4147a.put(d0Var, aVar);
        }
        aVar.f4150b |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5244c(long j, RecyclerView.C1328d0 d0Var) {
        this.f4148b.mo6169m(j, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5245d(RecyclerView.C1328d0 d0Var, RecyclerView.C1336l.C1339c cVar) {
        C1416a aVar = this.f4147a.get(d0Var);
        if (aVar == null) {
            aVar = C1416a.m6353b();
            this.f4147a.put(d0Var, aVar);
        }
        aVar.f4152d = cVar;
        aVar.f4150b |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5246e(RecyclerView.C1328d0 d0Var, RecyclerView.C1336l.C1339c cVar) {
        C1416a aVar = this.f4147a.get(d0Var);
        if (aVar == null) {
            aVar = C1416a.m6353b();
            this.f4147a.put(d0Var, aVar);
        }
        aVar.f4151c = cVar;
        aVar.f4150b |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5247f() {
        this.f4147a.clear();
        this.f4148b.mo6162d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.C1328d0 mo5248g(long j) {
        return this.f4148b.mo6165i(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo5249h(RecyclerView.C1328d0 d0Var) {
        C1416a aVar = this.f4147a.get(d0Var);
        return (aVar == null || (aVar.f4150b & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo5250i(RecyclerView.C1328d0 d0Var) {
        C1416a aVar = this.f4147a.get(d0Var);
        return (aVar == null || (aVar.f4150b & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5251j() {
        C1416a.m6352a();
    }

    /* renamed from: k */
    public void mo5252k(RecyclerView.C1328d0 d0Var) {
        mo5256p(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.C1336l.C1339c mo5253m(RecyclerView.C1328d0 d0Var) {
        return m6335l(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.C1336l.C1339c mo5254n(RecyclerView.C1328d0 d0Var) {
        return m6335l(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5255o(C1417b bVar) {
        RecyclerView.C1336l.C1339c cVar;
        RecyclerView.C1336l.C1339c cVar2;
        for (int size = this.f4147a.size() - 1; size >= 0; size--) {
            RecyclerView.C1328d0 i = this.f4147a.mo6258i(size);
            C1416a k = this.f4147a.mo6261k(size);
            int i2 = k.f4150b;
            if ((i2 & 3) != 3) {
                if ((i2 & 1) != 0) {
                    cVar = k.f4151c;
                    if (cVar != null) {
                        cVar2 = k.f4152d;
                    }
                } else {
                    if ((i2 & 14) != 14) {
                        if ((i2 & 12) == 12) {
                            bVar.mo4699d(i, k.f4151c, k.f4152d);
                        } else if ((i2 & 4) != 0) {
                            cVar = k.f4151c;
                            cVar2 = null;
                        } else if ((i2 & 8) == 0) {
                        }
                        C1416a.m6354c(k);
                    }
                    bVar.mo4697b(i, k.f4151c, k.f4152d);
                    C1416a.m6354c(k);
                }
                bVar.mo4698c(i, cVar, cVar2);
                C1416a.m6354c(k);
            }
            bVar.mo4696a(i);
            C1416a.m6354c(k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5256p(RecyclerView.C1328d0 d0Var) {
        C1416a aVar = this.f4147a.get(d0Var);
        if (aVar != null) {
            aVar.f4150b &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5257q(RecyclerView.C1328d0 d0Var) {
        int q = this.f4148b.mo6172q() - 1;
        while (true) {
            if (q < 0) {
                break;
            } else if (d0Var == this.f4148b.mo6173r(q)) {
                this.f4148b.mo6171p(q);
                break;
            } else {
                q--;
            }
        }
        C1416a remove = this.f4147a.remove(d0Var);
        if (remove != null) {
            C1416a.m6354c(remove);
        }
    }
}
