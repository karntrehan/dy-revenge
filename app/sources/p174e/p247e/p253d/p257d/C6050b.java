package p174e.p247e.p253d.p257d;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: e.e.d.d.b */
public final class C6050b {

    /* renamed from: a */
    static final Logger f16694a = Logger.getLogger(C6050b.class.getName());

    private C6050b() {
    }

    /* renamed from: a */
    public static void m22816a(Closeable closeable, boolean z) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (z) {
                    f16694a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                    return;
                }
                throw e;
            }
        }
    }

    /* renamed from: b */
    public static void m22817b(InputStream inputStream) {
        try {
            m22816a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
