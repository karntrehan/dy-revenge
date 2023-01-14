package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: e.f.c.a.z.a.g0 */
public class C9463g0 extends C9442c<String> implements C9466h0, RandomAccess {

    /* renamed from: o */
    private static final C9463g0 f25364o;

    /* renamed from: p */
    public static final C9466h0 f25365p;

    /* renamed from: q */
    private final List<Object> f25366q;

    static {
        C9463g0 g0Var = new C9463g0();
        f25364o = g0Var;
        g0Var.mo23511l();
        f25365p = g0Var;
    }

    public C9463g0() {
        this(10);
    }

    public C9463g0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private C9463g0(ArrayList<Object> arrayList) {
        this.f25366q = arrayList;
    }

    /* renamed from: h */
    private static String m31597h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C9468i ? ((C9468i) obj).mo23647K() : C9431b0.m31431j((byte[]) obj);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo23514b();
        if (collection instanceof C9466h0) {
            collection = ((C9466h0) collection).mo23621q();
        }
        boolean addAll = this.f25366q.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        mo23514b();
        this.f25366q.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public void add(int i, String str) {
        mo23514b();
        this.f25366q.add(i, str);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: j */
    public String get(int i) {
        Object obj = this.f25366q.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C9468i) {
            C9468i iVar = (C9468i) obj;
            String K = iVar.mo23647K();
            if (iVar.mo23657z()) {
                this.f25366q.set(i, K);
            }
            return K;
        }
        byte[] bArr = (byte[]) obj;
        String j = C9431b0.m31431j(bArr);
        if (C9431b0.m31428g(bArr)) {
            this.f25366q.set(i, j);
        }
        return j;
    }

    /* renamed from: k */
    public C9463g0 mo23497n(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f25366q);
            return new C9463g0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o */
    public String remove(int i) {
        mo23514b();
        Object remove = this.f25366q.remove(i);
        this.modCount++;
        return m31597h(remove);
    }

    /* renamed from: p */
    public String set(int i, String str) {
        mo23514b();
        return m31597h(this.f25366q.set(i, str));
    }

    /* renamed from: q */
    public List<?> mo23621q() {
        return Collections.unmodifiableList(this.f25366q);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* renamed from: s */
    public void mo23623s(C9468i iVar) {
        mo23514b();
        this.f25366q.add(iVar);
        this.modCount++;
    }

    public int size() {
        return this.f25366q.size();
    }

    /* renamed from: u */
    public C9466h0 mo23626u() {
        return mo23512y() ? new C9532r1(this) : this;
    }

    /* renamed from: x */
    public Object mo23627x(int i) {
        return this.f25366q.get(i);
    }

    /* renamed from: y */
    public /* bridge */ /* synthetic */ boolean mo23512y() {
        return super.mo23512y();
    }
}
