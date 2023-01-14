package kotlinx.coroutines.p507m2;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C10764w;

/* renamed from: kotlinx.coroutines.m2.l */
public final class C10806l {

    /* renamed from: a */
    public static final long f28336a = C10766y.m36609e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f28337b = C10766y.m36608d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);

    /* renamed from: c */
    public static final int f28338c;

    /* renamed from: d */
    public static final int f28339d;

    /* renamed from: e */
    public static final long f28340e = TimeUnit.SECONDS.toNanos(C10766y.m36609e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: f */
    public static C10802h f28341f = C10800f.f28330a;

    static {
        int f = C10766y.m36608d("kotlinx.coroutines.scheduler.core.pool.size", C10247f.m34826b(C10764w.m36596a(), 2), 1, 0, 8, (Object) null);
        f28338c = f;
        f28339d = C10766y.m36608d("kotlinx.coroutines.scheduler.max.pool.size", C10247f.m34830f(C10764w.m36596a() * 128, f, 2097150), 0, 2097150, 4, (Object) null);
    }
}
