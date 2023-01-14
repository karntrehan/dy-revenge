package p174e.p319f.p320a.p335c.p345f.p355j;

import android.os.Build;
import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: e.f.a.c.f.j.u6 */
public class C7722u6 implements Closeable {

    /* renamed from: f */
    private static final Map<String, C7722u6> f20805f = new HashMap();

    /* renamed from: o */
    private final String f20806o;

    /* renamed from: p */
    private int f20807p;

    /* renamed from: q */
    private double f20808q;

    /* renamed from: r */
    private long f20809r;

    /* renamed from: s */
    private long f20810s;

    /* renamed from: t */
    private long f20811t;

    /* renamed from: u */
    private long f20812u;

    private C7722u6(String str) {
        this.f20811t = 2147483647L;
        this.f20812u = -2147483648L;
        this.f20806o = str;
    }

    /* renamed from: A */
    public static C7722u6 m27794A(String str) {
        C7714t7.m27789a();
        if (!C7714t7.m27790b()) {
            return C7713t6.f20786v;
        }
        Map<String, C7722u6> map = f20805f;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C7722u6("detectorTaskWithResource#run"));
        }
        return map.get("detectorTaskWithResource#run");
    }

    /* renamed from: a */
    private final void m27795a() {
        this.f20807p = 0;
        this.f20808q = 0.0d;
        this.f20809r = 0;
        this.f20811t = 2147483647L;
        this.f20812u = -2147483648L;
    }

    /* renamed from: r */
    public static long m27796r() {
        return Build.VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() / 1000 : SystemClock.elapsedRealtime() * 1000;
    }

    /* renamed from: b */
    public C7722u6 mo21165b() {
        this.f20809r = m27796r();
        return this;
    }

    public void close() {
        long j = this.f20809r;
        if (j != 0) {
            mo21168o(j);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    /* renamed from: h */
    public void mo21167h(long j) {
        long r = m27796r();
        long j2 = this.f20810s;
        if (j2 != 0 && r - j2 >= 1000000) {
            m27795a();
        }
        this.f20810s = r;
        this.f20807p++;
        this.f20808q += (double) j;
        this.f20811t = Math.min(this.f20811t, j);
        this.f20812u = Math.max(this.f20812u, j);
        if (this.f20807p % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", new Object[]{this.f20806o, Long.valueOf(j), Integer.valueOf(this.f20807p), Long.valueOf(this.f20811t), Long.valueOf(this.f20812u), Integer.valueOf((int) (this.f20808q / ((double) this.f20807p)))});
            C7714t7.m27789a();
        }
        if (this.f20807p % 500 == 0) {
            m27795a();
        }
    }

    /* renamed from: o */
    public void mo21168o(long j) {
        mo21167h(m27796r() - j);
    }
}
