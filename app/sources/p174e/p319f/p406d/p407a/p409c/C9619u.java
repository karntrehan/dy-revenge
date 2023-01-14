package p174e.p319f.p406d.p407a.p409c;

import java.util.concurrent.Callable;
import p174e.p319f.p320a.p335c.p362h.C8965m;
import p174e.p319f.p406d.p407a.C9585a;

/* renamed from: e.f.d.a.c.u */
public final /* synthetic */ class C9619u implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ Callable f25732f;

    /* renamed from: o */
    public final /* synthetic */ C8965m f25733o;

    public /* synthetic */ C9619u(Callable callable, C8965m mVar) {
        this.f25732f = callable;
        this.f25733o = mVar;
    }

    public final void run() {
        Callable callable = this.f25732f;
        C8965m mVar = this.f25733o;
        try {
            mVar.mo22784c(callable.call());
        } catch (C9585a e) {
            mVar.mo22783b(e);
        } catch (Exception e2) {
            mVar.mo22783b(new C9585a("Internal error has occurred when executing ML Kit tasks", 13, e2));
        }
    }
}
