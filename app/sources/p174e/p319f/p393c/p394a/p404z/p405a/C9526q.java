package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z;

/* renamed from: e.f.c.a.z.a.q */
public class C9526q {

    /* renamed from: a */
    private static boolean f25463a = true;

    /* renamed from: b */
    private static volatile C9526q f25464b;

    /* renamed from: c */
    static final C9526q f25465c = new C9526q(true);

    /* renamed from: d */
    private final Map<C9527a, C9577z.C9582e<?, ?>> f25466d;

    /* renamed from: e.f.c.a.z.a.q$a */
    private static final class C9527a {

        /* renamed from: a */
        private final Object f25467a;

        /* renamed from: b */
        private final int f25468b;

        C9527a(Object obj, int i) {
            this.f25467a = obj;
            this.f25468b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9527a)) {
                return false;
            }
            C9527a aVar = (C9527a) obj;
            return this.f25467a == aVar.f25467a && this.f25468b == aVar.f25468b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f25467a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f25468b;
        }
    }

    C9526q() {
        this.f25466d = new HashMap();
    }

    C9526q(boolean z) {
        this.f25466d = Collections.emptyMap();
    }

    /* renamed from: b */
    public static C9526q m32218b() {
        C9526q qVar = f25464b;
        if (qVar == null) {
            synchronized (C9526q.class) {
                qVar = f25464b;
                if (qVar == null) {
                    qVar = f25463a ? C9523p.m32195a() : f25465c;
                    f25464b = qVar;
                }
            }
        }
        return qVar;
    }

    /* renamed from: a */
    public <ContainingType extends C9537s0> C9577z.C9582e<ContainingType, ?> mo23928a(ContainingType containingtype, int i) {
        return this.f25466d.get(new C9527a(containingtype, i));
    }
}
