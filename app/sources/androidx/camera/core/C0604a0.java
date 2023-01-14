package androidx.camera.core;

import androidx.camera.core.C0693h2;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.a0 */
public final /* synthetic */ class C0604a0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0693h2 f1966f;

    /* renamed from: o */
    public final /* synthetic */ Executor f1967o;

    /* renamed from: p */
    public final /* synthetic */ C0693h2.C0705i f1968p;

    public /* synthetic */ C0604a0(C0693h2 h2Var, Executor executor, C0693h2.C0705i iVar) {
        this.f1966f = h2Var;
        this.f1967o = executor;
        this.f1968p = iVar;
    }

    public final void run() {
        this.f1966f.mo2751g0(this.f1967o, this.f1968p);
    }
}
