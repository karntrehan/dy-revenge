package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: e.f.a.c.f.k.g */
final class C7847g extends C8004s0 {

    /* renamed from: f */
    final /* synthetic */ C7873i f21412f;

    C7847g(C7873i iVar) {
        this.f21412f = iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map mo21348b() {
        return this.f21412f;
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.f21412f.f21478p.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Iterator<Map.Entry> iterator() {
        return new C7860h(this.f21412f);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        C7977q.m28147p(this.f21412f.f21479q, ((Map.Entry) obj).getKey());
        return true;
    }
}
