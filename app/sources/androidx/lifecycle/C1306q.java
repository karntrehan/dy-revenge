package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.q */
public abstract class C1306q {

    /* renamed from: a */
    private final Map<String, Object> f3740a = new HashMap();

    /* renamed from: b */
    private volatile boolean f3741b = false;

    /* renamed from: b */
    private static void m5347b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4373a() {
        this.f3741b = true;
        Map<String, Object> map = this.f3740a;
        if (map != null) {
            synchronized (map) {
                for (Object b : this.f3740a.values()) {
                    m5347b(b);
                }
            }
        }
        mo4183d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo4374c(String str) {
        T t;
        Map<String, Object> map = this.f3740a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f3740a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4183d() {
    }
}
