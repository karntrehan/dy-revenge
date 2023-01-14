package p174e.p199d.p218c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: e.d.c.e */
public final class C5732e {

    /* renamed from: a */
    private final List<C5722b> f16208a = new ArrayList();

    /* renamed from: a */
    public <T extends C5722b> void mo17166a(T t) {
        this.f16208a.add(t);
    }

    /* renamed from: b */
    public Iterable<C5722b> mo17167b() {
        return this.f16208a;
    }

    /* renamed from: c */
    public <T extends C5722b> Collection<T> mo17168c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (C5722b next : this.f16208a) {
            if (cls.isAssignableFrom(next.getClass())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public int mo17169d() {
        return this.f16208a.size();
    }

    /* renamed from: e */
    public <T extends C5722b> T mo17170e(Class<T> cls) {
        Iterator<C5722b> it = this.f16208a.iterator();
        while (it.hasNext()) {
            T t = (C5722b) it.next();
            if (cls.isAssignableFrom(t.getClass())) {
                return t;
            }
        }
        return null;
    }

    public String toString() {
        int d = mo17169d();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(d);
        objArr[1] = d == 1 ? "directory" : "directories";
        return String.format("Metadata (%d %s)", objArr);
    }
}
