package androidx.camera.camera2.p003e;

import androidx.camera.core.impl.C0783b0;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.j */
public final /* synthetic */ class C0381j implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0542u1 f1475f;

    /* renamed from: o */
    public final /* synthetic */ Executor f1476o;

    /* renamed from: p */
    public final /* synthetic */ C0783b0 f1477p;

    public /* synthetic */ C0381j(C0542u1 u1Var, Executor executor, C0783b0 b0Var) {
        this.f1475f = u1Var;
        this.f1476o = executor;
        this.f1477p = b0Var;
    }

    public final void run() {
        this.f1475f.mo2310I(this.f1476o, this.f1477p);
    }
}
