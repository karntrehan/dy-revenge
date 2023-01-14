package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: e.f.c.a.z.a.r1 */
public class C9532r1 extends AbstractList<String> implements C9466h0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C9466h0 f25469f;

    /* renamed from: e.f.c.a.z.a.r1$a */
    class C9533a implements ListIterator<String> {

        /* renamed from: f */
        ListIterator<String> f25470f;

        /* renamed from: o */
        final /* synthetic */ int f25471o;

        C9533a(int i) {
            this.f25471o = i;
            this.f25470f = C9532r1.this.f25469f.listIterator(i);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f25470f.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f25470f.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f25470f.hasNext();
        }

        public boolean hasPrevious() {
            return this.f25470f.hasPrevious();
        }

        public int nextIndex() {
            return this.f25470f.nextIndex();
        }

        public int previousIndex() {
            return this.f25470f.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e.f.c.a.z.a.r1$b */
    class C9534b implements Iterator<String> {

        /* renamed from: f */
        Iterator<String> f25473f;

        C9534b() {
            this.f25473f = C9532r1.this.f25469f.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f25473f.next();
        }

        public boolean hasNext() {
            return this.f25473f.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C9532r1(C9466h0 h0Var) {
        this.f25469f = h0Var;
    }

    /* renamed from: g */
    public String get(int i) {
        return (String) this.f25469f.get(i);
    }

    public Iterator<String> iterator() {
        return new C9534b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C9533a(i);
    }

    /* renamed from: q */
    public List<?> mo23621q() {
        return this.f25469f.mo23621q();
    }

    /* renamed from: s */
    public void mo23623s(C9468i iVar) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f25469f.size();
    }

    /* renamed from: u */
    public C9466h0 mo23626u() {
        return this;
    }

    /* renamed from: x */
    public Object mo23627x(int i) {
        return this.f25469f.mo23627x(i);
    }
}
