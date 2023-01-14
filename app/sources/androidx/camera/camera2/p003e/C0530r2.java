package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.e.r2 */
class C0530r2 {

    /* renamed from: a */
    final Executor f1704a;

    /* renamed from: b */
    final Object f1705b = new Object();

    /* renamed from: c */
    final Set<C0329b3> f1706c = new LinkedHashSet();

    /* renamed from: d */
    final Set<C0329b3> f1707d = new LinkedHashSet();

    /* renamed from: e */
    final Set<C0329b3> f1708e = new LinkedHashSet();

    /* renamed from: f */
    private final CameraDevice.StateCallback f1709f = new C0531a();

    /* renamed from: androidx.camera.camera2.e.r2$a */
    class C0531a extends CameraDevice.StateCallback {
        C0531a() {
        }

        /* renamed from: a */
        private void m2111a() {
            List<C0329b3> g;
            synchronized (C0530r2.this.f1705b) {
                g = C0530r2.this.mo2279g();
                C0530r2.this.f1708e.clear();
                C0530r2.this.f1706c.clear();
                C0530r2.this.f1707d.clear();
            }
            for (C0329b3 d : g) {
                d.mo1944d();
            }
        }

        /* renamed from: b */
        private void m2112b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C0530r2.this.f1705b) {
                linkedHashSet.addAll(C0530r2.this.f1708e);
                linkedHashSet.addAll(C0530r2.this.f1706c);
            }
            C0530r2.this.f1704a.execute(new C0511o0(linkedHashSet));
        }

        public void onClosed(CameraDevice cameraDevice) {
            m2111a();
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            m2112b();
            m2111a();
        }

        public void onError(CameraDevice cameraDevice, int i) {
            m2112b();
            m2111a();
        }

        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    C0530r2(Executor executor) {
        this.f1704a = executor;
    }

    /* renamed from: a */
    private void m2099a(C0329b3 b3Var) {
        C0329b3 next;
        Iterator<C0329b3> it = mo2279g().iterator();
        while (it.hasNext() && (next = it.next()) != b3Var) {
            next.mo1944d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m2100b(Set<C0329b3> set) {
        for (C0329b3 next : set) {
            next.mo1942c().mo1954p(next);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public CameraDevice.StateCallback mo2275c() {
        return this.f1709f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<C0329b3> mo2276d() {
        ArrayList arrayList;
        synchronized (this.f1705b) {
            arrayList = new ArrayList(this.f1706c);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<C0329b3> mo2277e() {
        ArrayList arrayList;
        synchronized (this.f1705b) {
            arrayList = new ArrayList(this.f1707d);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public List<C0329b3> mo2278f() {
        ArrayList arrayList;
        synchronized (this.f1705b) {
            arrayList = new ArrayList(this.f1708e);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<C0329b3> mo2279g() {
        ArrayList arrayList;
        synchronized (this.f1705b) {
            arrayList = new ArrayList();
            arrayList.addAll(mo2276d());
            arrayList.addAll(mo2278f());
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2280h(C0329b3 b3Var) {
        synchronized (this.f1705b) {
            this.f1706c.remove(b3Var);
            this.f1707d.remove(b3Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2281i(C0329b3 b3Var) {
        synchronized (this.f1705b) {
            this.f1707d.add(b3Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2282j(C0329b3 b3Var) {
        m2099a(b3Var);
        synchronized (this.f1705b) {
            this.f1708e.remove(b3Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2283k(C0329b3 b3Var) {
        synchronized (this.f1705b) {
            this.f1706c.add(b3Var);
            this.f1708e.remove(b3Var);
        }
        m2099a(b3Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2284l(C0329b3 b3Var) {
        synchronized (this.f1705b) {
            this.f1708e.add(b3Var);
        }
    }
}
