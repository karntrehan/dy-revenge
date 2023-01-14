package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: e.f.a.c.f.g.oa */
final class C6933oa {

    /* renamed from: a */
    private static final C6933oa f18741a = new C6933oa();

    /* renamed from: b */
    private final C6997sa f18742b = new C7092y9();

    /* renamed from: c */
    private final ConcurrentMap f18743c = new ConcurrentHashMap();

    private C6933oa() {
    }

    /* renamed from: a */
    public static C6933oa m26315a() {
        return f18741a;
    }

    /* renamed from: b */
    public final C6981ra mo20068b(Class cls) {
        C6820h9.m25837f(cls, "messageType");
        C6981ra raVar = (C6981ra) this.f18743c.get(cls);
        if (raVar == null) {
            raVar = this.f18742b.mo20158a(cls);
            C6820h9.m25837f(cls, "messageType");
            C6820h9.m25837f(raVar, "schema");
            C6981ra raVar2 = (C6981ra) this.f18743c.putIfAbsent(cls, raVar);
            return raVar2 == null ? raVar : raVar2;
        }
    }
}
