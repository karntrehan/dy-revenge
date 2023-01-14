package androidx.camera.core;

import androidx.camera.core.impl.C0889u1;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.g2 */
final class C0687g2 extends C0644e2 {

    /* renamed from: u */
    final Executor f2150u;

    /* renamed from: v */
    private final Object f2151v = new Object();

    /* renamed from: w */
    ImageProxy f2152w;

    /* renamed from: x */
    private C0689b f2153x;

    /* renamed from: androidx.camera.core.g2$a */
    class C0688a implements C0765d<Void> {

        /* renamed from: a */
        final /* synthetic */ C0689b f2154a;

        C0688a(C0689b bVar) {
            this.f2154a = bVar;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            this.f2154a.close();
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
        }
    }

    /* renamed from: androidx.camera.core.g2$b */
    static class C0689b extends C0627c2 {

        /* renamed from: p */
        final WeakReference<C0687g2> f2156p;

        C0689b(ImageProxy imageProxy, C0687g2 g2Var) {
            super(imageProxy);
            this.f2156p = new WeakReference<>(g2Var);
            mo2623a(new C0946o(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void mo2737r(ImageProxy imageProxy) {
            C0687g2 g2Var = (C0687g2) this.f2156p.get();
            if (g2Var != null) {
                g2Var.f2150u.execute(new C0950p(g2Var));
            }
        }
    }

    C0687g2(Executor executor) {
        this.f2150u = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo2735A() {
        synchronized (this.f2151v) {
            this.f2153x = null;
            ImageProxy imageProxy = this.f2152w;
            if (imageProxy != null) {
                this.f2152w = null;
                mo2677p(imageProxy);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ImageProxy mo2670b(C0889u1 u1Var) {
        return u1Var.mo2640g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2673e() {
        synchronized (this.f2151v) {
            ImageProxy imageProxy = this.f2152w;
            if (imageProxy != null) {
                imageProxy.close();
                this.f2152w = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2677p(androidx.camera.core.ImageProxy r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2151v
            monitor-enter(r0)
            boolean r1 = r6.f2090t     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x000c
            r7.close()     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x000c:
            androidx.camera.core.g2$b r1 = r6.f2153x     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0035
            androidx.camera.core.j2 r1 = r7.mo2537U()     // Catch:{ all -> 0x004e }
            long r1 = r1.mo2692b()     // Catch:{ all -> 0x004e }
            androidx.camera.core.g2$b r3 = r6.f2153x     // Catch:{ all -> 0x004e }
            androidx.camera.core.j2 r3 = r3.mo2537U()     // Catch:{ all -> 0x004e }
            long r3 = r3.mo2692b()     // Catch:{ all -> 0x004e }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x002a
            r7.close()     // Catch:{ all -> 0x004e }
            goto L_0x0033
        L_0x002a:
            androidx.camera.core.ImageProxy r1 = r6.f2152w     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ all -> 0x004e }
        L_0x0031:
            r6.f2152w = r7     // Catch:{ all -> 0x004e }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x0035:
            androidx.camera.core.g2$b r1 = new androidx.camera.core.g2$b     // Catch:{ all -> 0x004e }
            r1.<init>(r7, r6)     // Catch:{ all -> 0x004e }
            r6.f2153x = r1     // Catch:{ all -> 0x004e }
            e.f.b.a.a.b r7 = r6.mo2671c(r1)     // Catch:{ all -> 0x004e }
            androidx.camera.core.g2$a r2 = new androidx.camera.core.g2$a     // Catch:{ all -> 0x004e }
            r2.<init>(r1)     // Catch:{ all -> 0x004e }
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.p014a3.p015n.C0744a.m3044a()     // Catch:{ all -> 0x004e }
            androidx.camera.core.impl.p014a3.p016o.C0768f.m3075a(r7, r2, r1)     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x004e:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0687g2.mo2677p(androidx.camera.core.ImageProxy):void");
    }
}
