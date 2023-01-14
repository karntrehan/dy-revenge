package p174e.p247e.p294k.p302f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: e.e.k.f.b */
public class C6321b implements C6325f {

    /* renamed from: a */
    private final Executor f17482a = Executors.newFixedThreadPool(2, new C6343n(10, "FrescoIoBoundExecutor", true));

    /* renamed from: b */
    private final Executor f17483b;

    /* renamed from: c */
    private final Executor f17484c;

    /* renamed from: d */
    private final Executor f17485d;

    /* renamed from: e */
    private final ScheduledExecutorService f17486e;

    public C6321b(int i) {
        this.f17483b = Executors.newFixedThreadPool(i, new C6343n(10, "FrescoDecodeExecutor", true));
        this.f17484c = Executors.newFixedThreadPool(i, new C6343n(10, "FrescoBackgroundExecutor", true));
        this.f17486e = Executors.newScheduledThreadPool(i, new C6343n(10, "FrescoBackgroundExecutor", true));
        this.f17485d = Executors.newFixedThreadPool(1, new C6343n(10, "FrescoLightWeightBackgroundExecutor", true));
    }

    /* renamed from: a */
    public Executor mo18699a() {
        return this.f17483b;
    }

    /* renamed from: b */
    public Executor mo18700b() {
        return this.f17485d;
    }

    /* renamed from: c */
    public Executor mo18701c() {
        return this.f17484c;
    }

    /* renamed from: d */
    public Executor mo18702d() {
        return this.f17482a;
    }

    /* renamed from: e */
    public Executor mo18703e() {
        return this.f17482a;
    }

    /* renamed from: f */
    public Executor mo18704f() {
        return this.f17482a;
    }

    /* renamed from: g */
    public ScheduledExecutorService mo18705g() {
        return this.f17486e;
    }
}
