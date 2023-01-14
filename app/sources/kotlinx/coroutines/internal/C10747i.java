package kotlinx.coroutines.internal;

import p455g.C10315m;
import p455g.C10318n;

/* renamed from: kotlinx.coroutines.internal.i */
public final class C10747i {

    /* renamed from: a */
    private static final boolean f28241a;

    static {
        Object obj;
        try {
            C10315m.C10316a aVar = C10315m.f27541f;
            obj = C10315m.m35012a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C10315m.C10316a aVar2 = C10315m.f27541f;
            obj = C10315m.m35012a(C10318n.m35016a(th));
        }
        f28241a = C10315m.m35015d(obj);
    }

    /* renamed from: a */
    public static final boolean m36528a() {
        return f28241a;
    }
}
