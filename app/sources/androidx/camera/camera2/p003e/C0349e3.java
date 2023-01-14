package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.p003e.C0329b3;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0435b;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0444g;
import androidx.camera.core.impl.C0820i1;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.e3 */
final class C0349e3 {

    /* renamed from: a */
    private final C0351b f1420a;

    /* renamed from: androidx.camera.camera2.e.e3$a */
    static class C0350a {

        /* renamed from: a */
        private final Executor f1421a;

        /* renamed from: b */
        private final ScheduledExecutorService f1422b;

        /* renamed from: c */
        private final Handler f1423c;

        /* renamed from: d */
        private final C0530r2 f1424d;

        /* renamed from: e */
        private final int f1425e;

        /* renamed from: f */
        private final Set<String> f1426f;

        C0350a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C0530r2 r2Var, int i) {
            HashSet hashSet = new HashSet();
            this.f1426f = hashSet;
            this.f1421a = executor;
            this.f1422b = scheduledExecutorService;
            this.f1423c = handler;
            this.f1424d = r2Var;
            this.f1425e = i;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 23) {
                hashSet.add("force_close");
            }
            if (i == 2 || i2 <= 23) {
                hashSet.add("deferrableSurface_close");
            }
            if (i == 2) {
                hashSet.add("wait_for_request");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0349e3 mo2006a() {
            return this.f1426f.isEmpty() ? new C0349e3(new C0336c3(this.f1424d, this.f1421a, this.f1422b, this.f1423c)) : new C0349e3(new C0343d3(this.f1426f, this.f1424d, this.f1421a, this.f1422b, this.f1423c));
        }
    }

    /* renamed from: androidx.camera.camera2.e.e3$b */
    interface C0351b {
        /* renamed from: a */
        Executor mo1971a();

        /* renamed from: b */
        C9172b<Void> mo1972b(CameraDevice cameraDevice, C0444g gVar, List<C0820i1> list);

        /* renamed from: j */
        C0444g mo1973j(int i, List<C0435b> list, C0329b3.C0330a aVar);

        /* renamed from: l */
        C9172b<List<Surface>> mo1974l(List<C0820i1> list, long j);

        boolean stop();
    }

    C0349e3(C0351b bVar) {
        this.f1420a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0444g mo2001a(int i, List<C0435b> list, C0329b3.C0330a aVar) {
        return this.f1420a.mo1973j(i, list, aVar);
    }

    /* renamed from: b */
    public Executor mo2002b() {
        return this.f1420a.mo1971a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9172b<Void> mo2003c(CameraDevice cameraDevice, C0444g gVar, List<C0820i1> list) {
        return this.f1420a.mo1972b(cameraDevice, gVar, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9172b<List<Surface>> mo2004d(List<C0820i1> list, long j) {
        return this.f1420a.mo1974l(list, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo2005e() {
        return this.f1420a.stop();
    }
}
