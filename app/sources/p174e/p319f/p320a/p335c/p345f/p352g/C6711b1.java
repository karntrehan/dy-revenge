package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e.f.a.c.f.g.b1 */
public final class C6711b1 extends C6812h1 {

    /* renamed from: a */
    private final AtomicReference f18377a = new AtomicReference();

    /* renamed from: b */
    private boolean f18378b;

    /* renamed from: Y */
    public static final Object m25446Y(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* renamed from: f */
    public final void mo19555f(Bundle bundle) {
        synchronized (this.f18377a) {
            try {
                this.f18377a.set(bundle);
                this.f18378b = true;
                this.f18377a.notify();
            } catch (Throwable th) {
                this.f18377a.notify();
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo19556k(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f18377a
            monitor-enter(r0)
            boolean r1 = r2.f18378b     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f18377a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f18377a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6711b1.mo19556k(long):android.os.Bundle");
    }

    /* renamed from: m */
    public final String mo19557m(long j) {
        return (String) m25446Y(mo19556k(j), String.class);
    }
}
