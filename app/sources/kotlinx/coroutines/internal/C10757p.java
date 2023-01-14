package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C10850y1;
import p455g.C10279d;

/* renamed from: kotlinx.coroutines.internal.p */
public final class C10757p {

    /* renamed from: a */
    private static final boolean f28262a = true;

    /* renamed from: a */
    private static final C10758q m36567a(Throwable th, String str) {
        if (f28262a) {
            return new C10758q(th, str);
        }
        if (th == null) {
            m36569c();
            throw new C10279d();
        }
        throw th;
    }

    /* renamed from: b */
    static /* synthetic */ C10758q m36568b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m36567a(th, str);
    }

    /* renamed from: c */
    public static final Void m36569c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: d */
    public static final C10850y1 m36570d(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return m36567a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
