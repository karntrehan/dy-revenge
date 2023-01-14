package p174e.p319f.p320a.p335c.p345f.p357l;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C3694o;
import com.google.android.gms.common.internal.C3717v;
import com.google.android.gms.common.internal.C3720w;
import com.google.android.gms.common.internal.C3723x;
import com.google.android.gms.common.internal.C3726y;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: e.f.a.c.f.l.na */
public final class C8363na {

    /* renamed from: a */
    private final C3723x f22832a;

    /* renamed from: b */
    private final AtomicLong f22833b = new AtomicLong(-1);

    C8363na(Context context, String str) {
        this.f22832a = C3720w.m14387b(context, C3726y.m14400a().mo11702b("mlkit:vision").mo11701a());
    }

    /* renamed from: a */
    public static C8363na m28872a(Context context) {
        return new C8363na(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo22021b(long j, Exception exc) {
        this.f22833b.set(j);
    }

    /* renamed from: c */
    public final synchronized void mo22022c(int i, int i2, long j, long j2) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f22833b.get() != -1) {
                if (elapsedRealtime - this.f22833b.get() <= TimeUnit.MINUTES.toMillis(30)) {
                    return;
                }
            }
            this.f22832a.mo11515a(new C3717v(0, Arrays.asList(new C3694o[]{new C3694o(25503, i2, 0, j, j2, (String) null, (String) null, 0)}))).mo22768d(new C8345ma(this, elapsedRealtime));
        }
    }
}
