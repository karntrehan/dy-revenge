package p174e.p247e.p253d.p262i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p174e.p247e.p253d.p257d.C6070p;

/* renamed from: e.e.d.i.a */
public class C6101a {

    /* renamed from: a */
    private static C6101a f16741a;

    /* renamed from: b */
    private static final long f16742b = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: c */
    private volatile StatFs f16743c = null;

    /* renamed from: d */
    private volatile File f16744d;

    /* renamed from: e */
    private volatile StatFs f16745e = null;

    /* renamed from: f */
    private volatile File f16746f;

    /* renamed from: g */
    private long f16747g;

    /* renamed from: h */
    private final Lock f16748h = new ReentrantLock();

    /* renamed from: i */
    private volatile boolean f16749i = false;

    /* renamed from: e.e.d.i.a$a */
    public enum C6102a {
        INTERNAL,
        EXTERNAL
    }

    protected C6101a() {
    }

    /* renamed from: a */
    protected static StatFs m22979a(String str) {
        return new StatFs(str);
    }

    /* renamed from: b */
    private void m22980b() {
        if (!this.f16749i) {
            this.f16748h.lock();
            try {
                if (!this.f16749i) {
                    this.f16744d = Environment.getDataDirectory();
                    this.f16746f = Environment.getExternalStorageDirectory();
                    m22983g();
                    this.f16749i = true;
                }
            } finally {
                this.f16748h.unlock();
            }
        }
    }

    /* renamed from: d */
    public static synchronized C6101a m22981d() {
        C6101a aVar;
        synchronized (C6101a.class) {
            if (f16741a == null) {
                f16741a = new C6101a();
            }
            aVar = f16741a;
        }
        return aVar;
    }

    /* renamed from: e */
    private void m22982e() {
        if (this.f16748h.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f16747g > f16742b) {
                    m22983g();
                }
            } finally {
                this.f16748h.unlock();
            }
        }
    }

    /* renamed from: g */
    private void m22983g() {
        this.f16743c = m22984h(this.f16743c, this.f16744d);
        this.f16745e = m22984h(this.f16745e, this.f16746f);
        this.f16747g = SystemClock.uptimeMillis();
    }

    /* renamed from: h */
    private StatFs m22984h(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = m22979a(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th) {
                throw C6070p.m22850a(th);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }

    @SuppressLint({"DeprecatedMethod"})
    /* renamed from: c */
    public long mo18095c(C6102a aVar) {
        long j;
        long j2;
        m22980b();
        m22982e();
        StatFs statFs = aVar == C6102a.INTERNAL ? this.f16743c : this.f16745e;
        if (statFs == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getAvailableBlocksLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getAvailableBlocks();
        }
        return j2 * j;
    }

    /* renamed from: f */
    public boolean mo18096f(C6102a aVar, long j) {
        m22980b();
        long c = mo18095c(aVar);
        return c <= 0 || c < j;
    }
}
