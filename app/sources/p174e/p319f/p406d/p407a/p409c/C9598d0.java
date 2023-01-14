package p174e.p319f.p406d.p407a.p409c;

/* renamed from: e.f.d.a.c.d0 */
public final /* synthetic */ class C9598d0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C9612o f25688f;

    /* renamed from: o */
    public final /* synthetic */ Runnable f25689o;

    public /* synthetic */ C9598d0(C9612o oVar, Runnable runnable) {
        this.f25688f = oVar;
        this.f25689o = runnable;
    }

    public final void run() {
        C9612o oVar = this.f25688f;
        Runnable runnable = this.f25689o;
        C9604g0 g0Var = new C9604g0(oVar, (C9600e0) null);
        try {
            runnable.run();
            g0Var.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
