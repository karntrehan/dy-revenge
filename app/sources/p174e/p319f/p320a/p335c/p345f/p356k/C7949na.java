package p174e.p319f.p320a.p335c.p345f.p356k;

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

/* renamed from: e.f.a.c.f.k.na */
public final class C7949na {

    /* renamed from: a */
    private final C3723x f21640a;

    /* renamed from: b */
    private final AtomicLong f21641b = new AtomicLong(-1);

    C7949na(Context context, String str) {
        this.f21640a = C3720w.m14387b(context, C3726y.m14400a().mo11702b("mlkit:vision").mo11701a());
    }

    /* renamed from: a */
    public static C7949na m28095a(Context context) {
        return new C7949na(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21485b(long j, Exception exc) {
        this.f21641b.set(j);
    }

    /* renamed from: c */
    public final synchronized void mo21486c(int i, int i2, long j, long j2) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f21641b.get() != -1) {
                if (elapsedRealtime - this.f21641b.get() <= TimeUnit.MINUTES.toMillis(30)) {
                    return;
                }
            }
            this.f21640a.mo11515a(new C3717v(0, Arrays.asList(new C3694o[]{new C3694o(i, i2, 0, j, j2, (String) null, (String) null, 0)}))).mo22768d(new C7936ma(this, elapsedRealtime));
        }
    }
}
