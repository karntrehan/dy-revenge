package kotlinx.coroutines;

import kotlinx.coroutines.internal.C10736e;
import p455g.C10315m;
import p455g.C10318n;
import p455g.p462v.C10376d;

/* renamed from: kotlinx.coroutines.q0 */
public final class C10822q0 {
    /* renamed from: a */
    public static final String m36786a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m36787b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m36788c(C10376d<?> dVar) {
        Object obj;
        if (dVar instanceof C10736e) {
            return dVar.toString();
        }
        try {
            C10315m.C10316a aVar = C10315m.f27541f;
            obj = C10315m.m35012a(dVar + '@' + m36787b(dVar));
        } catch (Throwable th) {
            C10315m.C10316a aVar2 = C10315m.f27541f;
            obj = C10315m.m35012a(C10318n.m35016a(th));
        }
        Throwable b = C10315m.m35013b(obj);
        String str = obj;
        if (b != null) {
            str = dVar.getClass().getName() + '@' + m36787b(dVar);
        }
        return (String) str;
    }
}
