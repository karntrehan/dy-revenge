package p174e.p319f.p320a.p335c.p345f.p358m;

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

/* renamed from: e.f.a.c.f.m.ia */
public final class C8701ia {

    /* renamed from: a */
    private final C3723x f23797a;

    /* renamed from: b */
    private final AtomicLong f23798b = new AtomicLong(-1);

    C8701ia(Context context, String str) {
        this.f23797a = C3720w.m14387b(context, C3726y.m14400a().mo11702b("mlkit:vision").mo11701a());
    }

    /* renamed from: a */
    public static C8701ia m29518a(Context context) {
        return new C8701ia(context, "mlkit:vision");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo22475b(long j, Exception exc) {
        this.f23798b.set(j);
    }

    /* renamed from: c */
    public final synchronized void mo22476c(int i, int i2, long j, long j2) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f23798b.get() != -1) {
                if (elapsedRealtime - this.f23798b.get() <= TimeUnit.MINUTES.toMillis(30)) {
                    return;
                }
            }
            this.f23797a.mo11515a(new C3717v(0, Arrays.asList(new C3694o[]{new C3694o(i, i2, 0, j, j2, (String) null, (String) null, 0)}))).mo22768d(new C8688ha(this, elapsedRealtime));
        }
    }
}
