package androidx.camera.camera2.p008f;

import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.C0542u1;
import androidx.camera.core.C0938m1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import java.util.concurrent.Executor;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.f.h */
public final class C0596h {

    /* renamed from: a */
    private boolean f1948a = false;

    /* renamed from: b */
    private boolean f1949b = false;

    /* renamed from: c */
    private final C0542u1 f1950c;

    /* renamed from: d */
    final Executor f1951d;

    /* renamed from: e */
    final Object f1952e = new Object();

    /* renamed from: f */
    private C0304b.C0305a f1953f = new C0304b.C0305a();

    /* renamed from: g */
    C1814b.C1815a<Void> f1954g;

    /* renamed from: h */
    private final C0542u1.C0545c f1955h = new C0591c(this);

    public C0596h(C0542u1 u1Var, Executor executor) {
        this.f1950c = u1Var;
        this.f1951d = executor;
    }

    /* renamed from: b */
    private void m2448b(C0599k kVar) {
        synchronized (this.f1952e) {
            for (C0809g1.C0810a next : kVar.mo2496c()) {
                this.f1953f.mo1887b().mo2814q(next, kVar.mo2494a(next));
            }
        }
    }

    /* renamed from: d */
    private void m2449d() {
        synchronized (this.f1952e) {
            this.f1953f = new C0304b.C0305a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object mo2525j(C1814b.C1815a aVar) {
        this.f1951d.execute(new C0590b(this, aVar));
        return "addCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object mo2527n(C1814b.C1815a aVar) {
        this.f1951d.execute(new C0589a(this, aVar));
        return "clearCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ boolean mo2528p(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            c.g.a.b$a<java.lang.Void> r0 = r2.f1954g
            r1 = 0
            if (r0 == 0) goto L_0x0032
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof androidx.camera.core.impl.C0891u2
            if (r0 == 0) goto L_0x0032
            androidx.camera.core.impl.u2 r3 = (androidx.camera.core.impl.C0891u2) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.mo3114c(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0032
            c.g.a.b$a<java.lang.Void> r0 = r2.f1954g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0032
            c.g.a.b$a<java.lang.Void> r3 = r2.f1954g
            r2.f1954g = r1
            goto L_0x0033
        L_0x0032:
            r3 = r1
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            r3.mo6308c(r1)
        L_0x0038:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p008f.C0596h.mo2528p(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m2455q(boolean z) {
        if (this.f1948a != z) {
            this.f1948a = z;
            if (!z) {
                C1814b.C1815a<Void> aVar = this.f1954g;
                if (aVar != null) {
                    aVar.mo6310f(new C0938m1.C0939a("The camera control has became inactive."));
                    this.f1954g = null;
                }
            } else if (this.f1949b) {
                m2458v();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m2452k(C1814b.C1815a<Void> aVar) {
        this.f1949b = true;
        C1814b.C1815a<Void> aVar2 = this.f1954g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f1954g = aVar;
        if (this.f1948a) {
            m2458v();
        }
        if (aVar2 != null) {
            aVar2.mo6310f(new C0938m1.C0939a("Camera2CameraControl was updated with new options."));
        }
    }

    /* renamed from: v */
    private void m2458v() {
        this.f1950c.mo2329e0();
        this.f1949b = false;
    }

    /* renamed from: a */
    public C9172b<Void> mo2520a(C0599k kVar) {
        m2448b(kVar);
        return C0768f.m3083i(C1814b.m7736a(new C0594f(this)));
    }

    /* renamed from: c */
    public C9172b<Void> mo2521c() {
        m2449d();
        return C0768f.m3083i(C1814b.m7736a(new C0592d(this)));
    }

    /* renamed from: e */
    public C0304b mo2522e() {
        C0304b a;
        synchronized (this.f1952e) {
            if (this.f1954g != null) {
                this.f1953f.mo1887b().mo2814q(C0304b.f1297C, Integer.valueOf(this.f1954g.hashCode()));
            }
            a = this.f1953f.mo1886a();
        }
        return a;
    }

    /* renamed from: f */
    public C0542u1.C0545c mo2523f() {
        return this.f1955h;
    }

    /* renamed from: s */
    public void mo2530s(boolean z) {
        this.f1951d.execute(new C0593e(this, z));
    }
}
