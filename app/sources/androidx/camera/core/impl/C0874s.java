package androidx.camera.core.impl;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.s */
final class C0874s extends C0921z0 {

    /* renamed from: a */
    private final Executor f2543a;

    /* renamed from: b */
    private final Handler f2544b;

    C0874s(Executor executor, Handler handler) {
        Objects.requireNonNull(executor, "Null cameraExecutor");
        this.f2543a = executor;
        Objects.requireNonNull(handler, "Null schedulerHandler");
        this.f2544b = handler;
    }

    /* renamed from: b */
    public Executor mo3096b() {
        return this.f2543a;
    }

    /* renamed from: c */
    public Handler mo3097c() {
        return this.f2544b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0921z0)) {
            return false;
        }
        C0921z0 z0Var = (C0921z0) obj;
        return this.f2543a.equals(z0Var.mo3096b()) && this.f2544b.equals(z0Var.mo3097c());
    }

    public int hashCode() {
        return ((this.f2543a.hashCode() ^ 1000003) * 1000003) ^ this.f2544b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f2543a + ", schedulerHandler=" + this.f2544b + "}";
    }
}
