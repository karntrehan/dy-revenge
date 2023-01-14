package p174e.p319f.p406d.p407a.p409c;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.d.a.c.e */
public abstract class C9599e<K, V> {

    /* renamed from: a */
    private final Map<K, V> f25690a = new HashMap();

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: a */
    public abstract V mo14955a(@RecentlyNonNull K k);

    @RecentlyNonNull
    /* renamed from: b */
    public V mo24093b(@RecentlyNonNull K k) {
        synchronized (this.f25690a) {
            if (this.f25690a.containsKey(k)) {
                V v = this.f25690a.get(k);
                return v;
            }
            V a = mo14955a(k);
            this.f25690a.put(k, a);
            return a;
        }
    }
}
