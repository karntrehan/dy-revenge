package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: e.f.a.c.f.l.se */
final class C8457se {

    /* renamed from: a */
    private static final C8457se f23066a = new C8457se();

    /* renamed from: b */
    private final C8529we f23067b = new C8122ae();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, C8511ve<?>> f23068c = new ConcurrentHashMap();

    private C8457se() {
    }

    /* renamed from: a */
    public static C8457se m29041a() {
        return f23066a;
    }

    /* renamed from: b */
    public final <T> C8511ve<T> mo22144b(Class<T> cls) {
        C8311kd.m28702f(cls, "messageType");
        C8511ve<T> veVar = (C8511ve) this.f23068c.get(cls);
        if (veVar == null) {
            veVar = this.f23067b.mo21661a(cls);
            C8311kd.m28702f(cls, "messageType");
            C8311kd.m28702f(veVar, "schema");
            C8511ve<T> putIfAbsent = this.f23068c.putIfAbsent(cls, veVar);
            return putIfAbsent == null ? veVar : putIfAbsent;
        }
    }
}
