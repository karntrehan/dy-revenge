package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: e.f.a.c.f.m.f */
final class C8651f extends C8873w0 {

    /* renamed from: f */
    final /* synthetic */ C8677h f23704f;

    C8651f(C8677h hVar) {
        this.f23704f = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map mo22398b() {
        return this.f23704f;
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.f23704f.f23750p.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Iterator<Map.Entry> iterator() {
        return new C8664g(this.f23704f);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        C8781p.m29596p(this.f23704f.f23751q, ((Map.Entry) obj).getKey());
        return true;
    }
}
