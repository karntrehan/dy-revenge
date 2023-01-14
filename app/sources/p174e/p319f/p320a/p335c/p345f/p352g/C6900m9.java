package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: e.f.a.c.f.g.m9 */
public final class C6900m9 extends C6850j7 implements RandomAccess, C6916n9 {

    /* renamed from: o */
    private static final C6900m9 f18633o;

    /* renamed from: p */
    public static final C6916n9 f18634p;

    /* renamed from: q */
    private final List f18635q;

    static {
        C6900m9 m9Var = new C6900m9(10);
        f18633o = m9Var;
        m9Var.zzb();
        f18634p = m9Var;
    }

    public C6900m9() {
        this(10);
    }

    public C6900m9(int i) {
        this.f18635q = new ArrayList(i);
    }

    private C6900m9(ArrayList arrayList) {
        this.f18635q = arrayList;
    }

    /* renamed from: h */
    private static String m26143h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C7106z7 ? ((C7106z7) obj).mo20473C(C6820h9.f18520b) : C6820h9.m25839h((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo19878b();
        this.f18635q.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo19878b();
        if (collection instanceof C6916n9) {
            collection = ((C6916n9) collection).mo19954d();
        }
        boolean addAll = this.f18635q.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c */
    public final C6916n9 mo19953c() {
        return mo19801a() ? new C6934ob(this) : this;
    }

    public final void clear() {
        mo19878b();
        this.f18635q.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final List mo19954d() {
        return Collections.unmodifiableList(this.f18635q);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C6804g9 mo19570f(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f18635q);
            return new C6900m9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final String get(int i) {
        Object obj = this.f18635q.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C7106z7) {
            C7106z7 z7Var = (C7106z7) obj;
            String C = z7Var.mo20473C(C6820h9.f18520b);
            if (z7Var.mo20417r()) {
                this.f18635q.set(i, C);
            }
            return C;
        }
        byte[] bArr = (byte[]) obj;
        String h = C6820h9.m25839h(bArr);
        if (C6820h9.m25840i(bArr)) {
            this.f18635q.set(i, h);
        }
        return h;
    }

    /* renamed from: i */
    public final Object mo19957i(int i) {
        return this.f18635q.get(i);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19878b();
        Object remove = this.f18635q.remove(i);
        this.modCount++;
        return m26143h(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo19878b();
        return m26143h(this.f18635q.set(i, (String) obj));
    }

    public final int size() {
        return this.f18635q.size();
    }

    /* renamed from: t */
    public final void mo19960t(C7106z7 z7Var) {
        mo19878b();
        this.f18635q.add(z7Var);
        this.modCount++;
    }
}
