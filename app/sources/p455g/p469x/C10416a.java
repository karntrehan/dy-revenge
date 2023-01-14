package p455g.p469x;

import java.io.Closeable;

/* renamed from: g.x.a */
public final class C10416a {
    /* renamed from: a */
    public static final void m35288a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C10248b.m34834a(th, th2);
        }
    }
}
