package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.l.rd */
public final class C8438rd extends C8382ob<String> implements RandomAccess, C8456sd {

    /* renamed from: o */
    private static final C8438rd f22992o;

    /* renamed from: p */
    public static final C8456sd f22993p;

    /* renamed from: q */
    private final List<Object> f22994q;

    static {
        C8438rd rdVar = new C8438rd(10);
        f22992o = rdVar;
        rdVar.zzb();
        f22993p = rdVar;
    }

    public C8438rd() {
        this(10);
    }

    public C8438rd(int i) {
        this.f22994q = new ArrayList(i);
    }

    private C8438rd(ArrayList<Object> arrayList) {
        this.f22994q = arrayList;
    }

    /* renamed from: h */
    private static String m29004h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C8177dc ? ((C8177dc) obj).mo21748C(C8311kd.f22725a) : C8311kd.m28704h((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo22053b();
        this.f22994q.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo22053b();
        if (collection instanceof C8456sd) {
            collection = ((C8456sd) collection).mo22072d();
        }
        boolean addAll = this.f22994q.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public final C8456sd mo22071c() {
        return mo21893a() ? new C8404pf(this) : this;
    }

    public final void clear() {
        mo22053b();
        this.f22994q.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final List<?> mo22072d() {
        return Collections.unmodifiableList(this.f22994q);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C8292jd mo21793f(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f22994q);
            return new C8438rd((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final String get(int i) {
        Object obj = this.f22994q.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C8177dc) {
            C8177dc dcVar = (C8177dc) obj;
            String C = dcVar.mo21748C(C8311kd.f22725a);
            if (dcVar.mo21697r()) {
                this.f22994q.set(i, C);
            }
            return C;
        }
        byte[] bArr = (byte[]) obj;
        String h = C8311kd.m28704h(bArr);
        if (C8311kd.m28706j(bArr)) {
            this.f22994q.set(i, h);
        }
        return h;
    }

    /* renamed from: i */
    public final Object mo22074i(int i) {
        return this.f22994q.get(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo22053b();
        Object remove = this.f22994q.remove(i);
        this.modCount++;
        return m29004h(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo22053b();
        return m29004h(this.f22994q.set(i, (String) obj));
    }

    public final int size() {
        return this.f22994q.size();
    }
}
