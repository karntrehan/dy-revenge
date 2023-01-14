package androidx.camera.lifecycle;

import android.os.Build;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0930k1;
import androidx.camera.core.C0938m1;
import androidx.camera.core.C0957q1;
import androidx.camera.core.impl.C0848n0;
import androidx.camera.core.p009e3.C0649e;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1290f;
import androidx.lifecycle.C1291g;
import androidx.lifecycle.C1302o;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class LifecycleCamera implements C1290f, C0930k1 {

    /* renamed from: f */
    private final Object f2982f = new Object();

    /* renamed from: o */
    private final C1291g f2983o;

    /* renamed from: p */
    private final C0649e f2984p;

    /* renamed from: q */
    private volatile boolean f2985q = false;

    /* renamed from: r */
    private boolean f2986r = false;

    /* renamed from: s */
    private boolean f2987s = false;

    LifecycleCamera(C1291g gVar, C0649e eVar) {
        this.f2983o = gVar;
        this.f2984p = eVar;
        if (gVar.getLifecycle().mo4339b().mo4341e(C1286d.C1288b.STARTED)) {
            eVar.mo2699d();
        } else {
            eVar.mo2702s();
        }
        gVar.getLifecycle().mo4338a(this);
    }

    /* renamed from: a */
    public C0957q1 mo2380a() {
        return this.f2984p.mo2380a();
    }

    /* renamed from: c */
    public C0938m1 mo2384c() {
        return this.f2984p.mo2384c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3381d(Collection<C0608a3> collection) {
        synchronized (this.f2982f) {
            this.f2984p.mo2698b(collection);
        }
    }

    /* renamed from: e */
    public void mo3382e(C0848n0 n0Var) {
        this.f2984p.mo2700e(n0Var);
    }

    /* renamed from: n */
    public C0649e mo3383n() {
        return this.f2984p;
    }

    /* renamed from: o */
    public C1291g mo3384o() {
        C1291g gVar;
        synchronized (this.f2982f) {
            gVar = this.f2983o;
        }
        return gVar;
    }

    @C1302o(C1286d.C1287a.ON_DESTROY)
    public void onDestroy(C1291g gVar) {
        synchronized (this.f2982f) {
            C0649e eVar = this.f2984p;
            eVar.mo2696E(eVar.mo2704w());
        }
    }

    @C1302o(C1286d.C1287a.ON_PAUSE)
    public void onPause(C1291g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2984p.mo2701j(false);
        }
    }

    @C1302o(C1286d.C1287a.ON_RESUME)
    public void onResume(C1291g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2984p.mo2701j(true);
        }
    }

    @C1302o(C1286d.C1287a.ON_START)
    public void onStart(C1291g gVar) {
        synchronized (this.f2982f) {
            if (!this.f2986r && !this.f2987s) {
                this.f2984p.mo2699d();
                this.f2985q = true;
            }
        }
    }

    @C1302o(C1286d.C1287a.ON_STOP)
    public void onStop(C1291g gVar) {
        synchronized (this.f2982f) {
            if (!this.f2986r && !this.f2987s) {
                this.f2984p.mo2702s();
                this.f2985q = false;
            }
        }
    }

    /* renamed from: p */
    public List<C0608a3> mo3390p() {
        List<C0608a3> unmodifiableList;
        synchronized (this.f2982f) {
            unmodifiableList = Collections.unmodifiableList(this.f2984p.mo2704w());
        }
        return unmodifiableList;
    }

    /* renamed from: q */
    public boolean mo3391q(C0608a3 a3Var) {
        boolean contains;
        synchronized (this.f2982f) {
            contains = this.f2984p.mo2704w().contains(a3Var);
        }
        return contains;
    }

    /* renamed from: r */
    public void mo3392r() {
        synchronized (this.f2982f) {
            if (!this.f2986r) {
                onStop(this.f2983o);
                this.f2986r = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3393s() {
        synchronized (this.f2982f) {
            C0649e eVar = this.f2984p;
            eVar.mo2696E(eVar.mo2704w());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3394t() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2982f
            monitor-enter(r0)
            boolean r1 = r3.f2986r     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0009:
            r1 = 0
            r3.f2986r = r1     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.g r1 = r3.f2983o     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.d r1 = r1.getLifecycle()     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.d$b r1 = r1.mo4339b()     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.d$b r2 = androidx.lifecycle.C1286d.C1288b.STARTED     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.mo4341e(r2)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            androidx.lifecycle.g r1 = r3.f2983o     // Catch:{ all -> 0x0025 }
            r3.onStart(r1)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCamera.mo3394t():void");
    }
}
