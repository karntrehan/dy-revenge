package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.c.a.z.a.e0 */
public class C9452e0 extends C9460f0 {

    /* renamed from: f */
    private final C9537s0 f25339f;

    /* renamed from: e.f.c.a.z.a.e0$b */
    static class C9454b<K> implements Map.Entry<K, Object> {

        /* renamed from: f */
        private Map.Entry<K, C9452e0> f25340f;

        private C9454b(Map.Entry<K, C9452e0> entry) {
            this.f25340f = entry;
        }

        /* renamed from: a */
        public C9452e0 mo23528a() {
            return this.f25340f.getValue();
        }

        public K getKey() {
            return this.f25340f.getKey();
        }

        public Object getValue() {
            C9452e0 value = this.f25340f.getValue();
            if (value == null) {
                return null;
            }
            return value.mo23525f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C9537s0) {
                return this.f25340f.getValue().mo23592d((C9537s0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: e.f.c.a.z.a.e0$c */
    static class C9455c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: f */
        private Iterator<Map.Entry<K, Object>> f25341f;

        public C9455c(Iterator<Map.Entry<K, Object>> it) {
            this.f25341f = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f25341f.next();
            return next.getValue() instanceof C9452e0 ? new C9454b(next) : next;
        }

        public boolean hasNext() {
            return this.f25341f.hasNext();
        }

        public void remove() {
            this.f25341f.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo23525f().equals(obj);
    }

    /* renamed from: f */
    public C9537s0 mo23525f() {
        return mo23591c(this.f25339f);
    }

    public int hashCode() {
        return mo23525f().hashCode();
    }

    public String toString() {
        return mo23525f().toString();
    }
}
