package p027c.p036b.p037a.p038a;

import java.util.concurrent.Executor;

/* renamed from: c.b.a.a.a */
public class C1479a extends C1484c {

    /* renamed from: a */
    private static volatile C1479a f4627a;

    /* renamed from: b */
    private static final Executor f4628b = new C1480a();

    /* renamed from: c */
    private static final Executor f4629c = new C1481b();

    /* renamed from: d */
    private C1484c f4630d;

    /* renamed from: e */
    private C1484c f4631e;

    /* renamed from: c.b.a.a.a$a */
    static class C1480a implements Executor {
        C1480a() {
        }

        public void execute(Runnable runnable) {
            C1479a.m6613d().mo5516c(runnable);
        }
    }

    /* renamed from: c.b.a.a.a$b */
    static class C1481b implements Executor {
        C1481b() {
        }

        public void execute(Runnable runnable) {
            C1479a.m6613d().mo5514a(runnable);
        }
    }

    private C1479a() {
        C1482b bVar = new C1482b();
        this.f4631e = bVar;
        this.f4630d = bVar;
    }

    /* renamed from: d */
    public static C1479a m6613d() {
        if (f4627a != null) {
            return f4627a;
        }
        synchronized (C1479a.class) {
            if (f4627a == null) {
                f4627a = new C1479a();
            }
        }
        return f4627a;
    }

    /* renamed from: a */
    public void mo5514a(Runnable runnable) {
        this.f4630d.mo5514a(runnable);
    }

    /* renamed from: b */
    public boolean mo5515b() {
        return this.f4630d.mo5515b();
    }

    /* renamed from: c */
    public void mo5516c(Runnable runnable) {
        this.f4630d.mo5516c(runnable);
    }
}
