package p455g.p458c0;

import java.util.Iterator;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.c0.k */
public final class C10277k<T, R> implements C10268d<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10268d<T> f27500a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10430l<T, R> f27501b;

    /* renamed from: g.c0.k$a */
    public static final class C10278a implements Iterator<R>, C10445a {

        /* renamed from: f */
        private final Iterator<T> f27502f;

        /* renamed from: o */
        final /* synthetic */ C10277k<T, R> f27503o;

        C10278a(C10277k<T, R> kVar) {
            this.f27503o = kVar;
            this.f27502f = kVar.f27500a.iterator();
        }

        public boolean hasNext() {
            return this.f27502f.hasNext();
        }

        public R next() {
            return this.f27503o.f27501b.invoke(this.f27502f.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10277k(C10268d<? extends T> dVar, C10430l<? super T, ? extends R> lVar) {
        C10457l.m35320e(dVar, "sequence");
        C10457l.m35320e(lVar, "transformer");
        this.f27500a = dVar;
        this.f27501b = lVar;
    }

    public Iterator<R> iterator() {
        return new C10278a(this);
    }
}
