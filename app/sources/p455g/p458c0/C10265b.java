package p455g.p458c0;

import java.util.Iterator;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.c0.b */
public final class C10265b<T> implements C10268d<T>, C10267c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10268d<T> f27494a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f27495b;

    /* renamed from: g.c0.b$a */
    public static final class C10266a implements Iterator<T>, C10445a {

        /* renamed from: f */
        private final Iterator<T> f27496f;

        /* renamed from: o */
        private int f27497o;

        C10266a(C10265b<T> bVar) {
            this.f27496f = bVar.f27494a.iterator();
            this.f27497o = bVar.f27495b;
        }

        /* renamed from: b */
        private final void m34841b() {
            while (this.f27497o > 0 && this.f27496f.hasNext()) {
                this.f27496f.next();
                this.f27497o--;
            }
        }

        public boolean hasNext() {
            m34841b();
            return this.f27496f.hasNext();
        }

        public T next() {
            m34841b();
            return this.f27496f.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10265b(C10268d<? extends T> dVar, int i) {
        C10457l.m35320e(dVar, "sequence");
        this.f27494a = dVar;
        this.f27495b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    /* renamed from: a */
    public C10268d<T> mo25581a(int i) {
        int i2 = this.f27495b + i;
        return i2 < 0 ? new C10265b(this, i) : new C10265b(this.f27494a, i2);
    }

    public Iterator<T> iterator() {
        return new C10266a(this);
    }
}
