package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: e.f.a.c.f.i.v */
final class C7454v extends C7274i1 {

    /* renamed from: f */
    final /* synthetic */ C7482x f20036f;

    C7454v(C7482x xVar) {
        this.f20036f = xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map mo20763b() {
        return this.f20036f;
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.f20036f.f20104p.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Iterator<Map.Entry> iterator() {
        return new C7468w(this.f20036f);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        C7243g0.m27279p(this.f20036f.f20105q, ((Map.Entry) obj).getKey());
        return true;
    }
}
