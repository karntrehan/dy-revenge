package p174e.p319f.p320a.p335c.p345f.p354i;

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

/* renamed from: e.f.a.c.f.i.bb */
public final class C7179bb {

    /* renamed from: a */
    private final C3723x f19191a;

    /* renamed from: b */
    private final AtomicLong f19192b = new AtomicLong(-1);

    C7179bb(Context context, String str) {
        this.f19191a = C3720w.m14387b(context, C3726y.m14400a().mo11702b("mlkit:vision").mo11701a());
    }

    /* renamed from: a */
    public static C7179bb m27174a(Context context) {
        return new C7179bb(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo20584b(long j, Exception exc) {
        this.f19192b.set(j);
    }

    /* renamed from: c */
    public final synchronized void mo20585c(int i, int i2, long j, long j2) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f19192b.get() != -1) {
                if (elapsedRealtime - this.f19192b.get() <= TimeUnit.MINUTES.toMillis(30)) {
                    return;
                }
            }
            this.f19191a.mo11515a(new C3717v(0, Arrays.asList(new C3694o[]{new C3694o(i, i2, 0, j, j2, (String) null, (String) null, 0)}))).mo22768d(new C7164ab(this, elapsedRealtime));
        }
    }
}
