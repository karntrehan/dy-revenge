package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0444g;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0766e;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.d3 */
class C0343d3 extends C0336c3 {

    /* renamed from: o */
    private final Object f1404o = new Object();

    /* renamed from: p */
    private final Set<String> f1405p;

    /* renamed from: q */
    private final C9172b<Void> f1406q;

    /* renamed from: r */
    C1814b.C1815a<Void> f1407r;

    /* renamed from: s */
    private List<C0820i1> f1408s;

    /* renamed from: t */
    C9172b<Void> f1409t;

    /* renamed from: u */
    C9172b<List<Surface>> f1410u;

    /* renamed from: v */
    private boolean f1411v;

    /* renamed from: w */
    private final CameraCaptureSession.CaptureCallback f1412w = new C0344a();

    /* renamed from: androidx.camera.camera2.e.d3$a */
    class C0344a extends CameraCaptureSession.CaptureCallback {
        C0344a() {
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            C1814b.C1815a<Void> aVar = C0343d3.this.f1407r;
            if (aVar != null) {
                aVar.mo6309d();
                C0343d3.this.f1407r = null;
            }
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            C1814b.C1815a<Void> aVar = C0343d3.this.f1407r;
            if (aVar != null) {
                aVar.mo6308c(null);
                C0343d3.this.f1407r = null;
            }
        }
    }

    C0343d3(Set<String> set, C0530r2 r2Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(r2Var, executor, scheduledExecutorService, handler);
        this.f1405p = set;
        this.f1406q = set.contains("wait_for_request") ? C1814b.m7736a(new C0383j1(this)) : C0768f.m3081g(null);
    }

    /* renamed from: L */
    static void m1691L(Set<C0329b3> set) {
        for (C0329b3 next : set) {
            next.mo1942c().mo1954p(next);
        }
    }

    /* renamed from: M */
    private void m1692M(Set<C0329b3> set) {
        for (C0329b3 next : set) {
            next.mo1942c().mo1955q(next);
        }
    }

    /* renamed from: N */
    private List<C9172b<Void>> m1693N(String str, List<C0329b3> list) {
        ArrayList arrayList = new ArrayList();
        for (C0329b3 m : list) {
            arrayList.add(m.mo1951m(str));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ Object mo1994Q(C1814b.C1815a aVar) {
        this.f1407r = aVar;
        return "StartStreamingFuture[session=" + this + "]";
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ C9172b mo1995S(CameraDevice cameraDevice, C0444g gVar, List list, List list2) {
        return super.mo1972b(cameraDevice, gVar, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void mo1993O() {
        mo1992K("Session call super.close()");
        super.close();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1991J() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1404o
            monitor-enter(r0)
            java.util.List<androidx.camera.core.impl.i1> r1 = r3.f1408s     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "deferrableSurface == null, maybe forceClose, skip close"
            r3.mo1992K(r1)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x000e:
            java.util.Set<java.lang.String> r1 = r3.f1405p     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = "deferrableSurface_close"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0033
            java.util.List<androidx.camera.core.impl.i1> r1 = r3.f1408s     // Catch:{ all -> 0x0035 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0035 }
        L_0x001e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0035 }
            androidx.camera.core.impl.i1 r2 = (androidx.camera.core.impl.C0820i1) r2     // Catch:{ all -> 0x0035 }
            r2.mo3001a()     // Catch:{ all -> 0x0035 }
            goto L_0x001e
        L_0x002e:
            java.lang.String r1 = "deferrableSurface closed"
            r3.mo1992K(r1)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0343d3.mo1991J():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo1992K(String str) {
        C0949o2.m3688a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    /* renamed from: b */
    public C9172b<Void> mo1972b(CameraDevice cameraDevice, C0444g gVar, List<C0820i1> list) {
        C9172b<Void> i;
        synchronized (this.f1404o) {
            C0766e<T> f = C0766e.m3068a(C0768f.m3087m(m1693N("wait_for_request", this.f1379b.mo2277e()))).mo2920f(new C0367h1(this, cameraDevice, gVar, list), C0744a.m3044a());
            this.f1409t = f;
            i = C0768f.m3083i(f);
        }
        return i;
    }

    public void close() {
        mo1992K("Session call close()");
        if (this.f1405p.contains("wait_for_request")) {
            synchronized (this.f1404o) {
                if (!this.f1411v) {
                    this.f1406q.cancel(true);
                }
            }
        }
        this.f1406q.mo2919e(new C0376i1(this), mo1971a());
    }

    /* renamed from: i */
    public int mo1949i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int i;
        if (!this.f1405p.contains("wait_for_request")) {
            return super.mo1949i(captureRequest, captureCallback);
        }
        synchronized (this.f1404o) {
            this.f1411v = true;
            i = super.mo1949i(captureRequest, C0574y1.m2391b(this.f1412w, captureCallback));
        }
        return i;
    }

    /* renamed from: l */
    public C9172b<List<Surface>> mo1974l(List<C0820i1> list, long j) {
        C9172b<List<Surface>> i;
        synchronized (this.f1404o) {
            this.f1408s = list;
            i = C0768f.m3083i(super.mo1974l(list, j));
        }
        return i;
    }

    /* renamed from: m */
    public C9172b<Void> mo1951m(String str) {
        str.hashCode();
        return !str.equals("wait_for_request") ? super.mo1951m(str) : C0768f.m3083i(this.f1406q);
    }

    /* renamed from: p */
    public void mo1954p(C0329b3 b3Var) {
        mo1991J();
        mo1992K("onClosed()");
        super.mo1954p(b3Var);
    }

    /* renamed from: r */
    public void mo1956r(C0329b3 b3Var) {
        C0329b3 next;
        C0329b3 next2;
        mo1992K("Session onConfigured()");
        if (this.f1405p.contains("force_close")) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<C0329b3> it = this.f1379b.mo2278f().iterator();
            while (it.hasNext() && (next2 = it.next()) != b3Var) {
                linkedHashSet.add(next2);
            }
            m1692M(linkedHashSet);
        }
        super.mo1956r(b3Var);
        if (this.f1405p.contains("force_close")) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<C0329b3> it2 = this.f1379b.mo2276d().iterator();
            while (it2.hasNext() && (next = it2.next()) != b3Var) {
                linkedHashSet2.add(next);
            }
            m1691L(linkedHashSet2);
        }
    }

    public boolean stop() {
        boolean stop;
        synchronized (this.f1404o) {
            if (mo1978x()) {
                mo1991J();
            } else {
                C9172b<Void> bVar = this.f1409t;
                if (bVar != null) {
                    bVar.cancel(true);
                }
                C9172b<List<Surface>> bVar2 = this.f1410u;
                if (bVar2 != null) {
                    bVar2.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
