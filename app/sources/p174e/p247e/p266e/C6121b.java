package p174e.p247e.p266e;

/* renamed from: e.e.e.b */
public abstract class C6121b<T> implements C6125e<T> {
    /* renamed from: a */
    public void mo18136a(C6122c<T> cVar) {
    }

    /* renamed from: b */
    public void mo18137b(C6122c<T> cVar) {
        try {
            mo9194e(cVar);
        } finally {
            cVar.close();
        }
    }

    /* renamed from: c */
    public void mo18138c(C6122c<T> cVar) {
        boolean d = cVar.mo18118d();
        try {
            mo9195f(cVar);
        } finally {
            if (d) {
                cVar.close();
            }
        }
    }

    /* renamed from: d */
    public void mo18139d(C6122c<T> cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo9194e(C6122c<T> cVar);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo9195f(C6122c<T> cVar);
}
