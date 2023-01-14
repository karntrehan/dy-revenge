package androidx.camera.core.impl;

import androidx.camera.core.C0930k1;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0899w0;
import androidx.core.util.C1177h;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.camera.core.impl.y0 */
public final class C0911y0 {

    /* renamed from: a */
    private final StringBuilder f2610a = new StringBuilder();

    /* renamed from: b */
    private final Object f2611b = new Object();

    /* renamed from: c */
    private final int f2612c;

    /* renamed from: d */
    private final Map<C0930k1, C0912a> f2613d = new HashMap();

    /* renamed from: e */
    private int f2614e;

    /* renamed from: androidx.camera.core.impl.y0$a */
    private static class C0912a {

        /* renamed from: a */
        private C0899w0.C0900a f2615a;

        /* renamed from: b */
        private final Executor f2616b;

        /* renamed from: c */
        private final C0913b f2617c;

        C0912a(C0899w0.C0900a aVar, Executor executor, C0913b bVar) {
            this.f2615a = aVar;
            this.f2616b = executor;
            this.f2617c = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0899w0.C0900a mo3166a() {
            return this.f2615a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3167b() {
            try {
                Executor executor = this.f2616b;
                C0913b bVar = this.f2617c;
                Objects.requireNonNull(bVar);
                executor.execute(new C0860q(bVar));
            } catch (RejectedExecutionException e) {
                C0949o2.m3691d("CameraStateRegistry", "Unable to notify camera.", e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0899w0.C0900a mo3168c(C0899w0.C0900a aVar) {
            C0899w0.C0900a aVar2 = this.f2615a;
            this.f2615a = aVar;
            return aVar2;
        }
    }

    /* renamed from: androidx.camera.core.impl.y0$b */
    public interface C0913b {
        /* renamed from: a */
        void mo2411a();
    }

    public C0911y0(int i) {
        this.f2612c = i;
        synchronized ("mLock") {
            this.f2614e = i;
        }
    }

    /* renamed from: b */
    private static boolean m3599b(C0899w0.C0900a aVar) {
        return aVar != null && aVar.mo3138e();
    }

    /* renamed from: d */
    private void m3600d() {
        if (C0949o2.m3693f("CameraStateRegistry")) {
            this.f2610a.setLength(0);
            this.f2610a.append("Recalculating open cameras:\n");
            this.f2610a.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{"Camera", "State"}));
            this.f2610a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry next : this.f2613d.entrySet()) {
            if (C0949o2.m3693f("CameraStateRegistry")) {
                this.f2610a.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{((C0930k1) next.getKey()).toString(), ((C0912a) next.getValue()).mo3166a() != null ? ((C0912a) next.getValue()).mo3166a().toString() : "UNKNOWN"}));
            }
            if (m3599b(((C0912a) next.getValue()).mo3166a())) {
                i++;
            }
        }
        if (C0949o2.m3693f("CameraStateRegistry")) {
            this.f2610a.append("-------------------------------------------------------------------\n");
            this.f2610a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f2612c)}));
            C0949o2.m3688a("CameraStateRegistry", this.f2610a.toString());
        }
        this.f2614e = Math.max(this.f2612c - i, 0);
    }

    /* renamed from: g */
    private C0899w0.C0900a m3601g(C0930k1 k1Var) {
        C0912a remove = this.f2613d.remove(k1Var);
        if (remove == null) {
            return null;
        }
        m3600d();
        return remove.mo3166a();
    }

    /* renamed from: h */
    private C0899w0.C0900a m3602h(C0930k1 k1Var, C0899w0.C0900a aVar) {
        C0899w0.C0900a c = ((C0912a) C1177h.m4584f(this.f2613d.get(k1Var), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).mo3168c(aVar);
        C0899w0.C0900a aVar2 = C0899w0.C0900a.OPENING;
        if (aVar == aVar2) {
            C1177h.m4586h(m3599b(aVar) || c == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (c != aVar) {
            m3600d();
        }
        return c;
    }

    /* renamed from: a */
    public boolean mo3162a() {
        synchronized (this.f2611b) {
            for (Map.Entry<C0930k1, C0912a> value : this.f2613d.entrySet()) {
                if (((C0912a) value.getValue()).mo3166a() == C0899w0.C0900a.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        r6 = r7.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r6.hasNext() == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        ((androidx.camera.core.impl.C0911y0.C0912a) r6.next()).mo3167b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3163c(androidx.camera.core.C0930k1 r6, androidx.camera.core.impl.C0899w0.C0900a r7, boolean r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2611b
            monitor-enter(r0)
            int r1 = r5.f2614e     // Catch:{ all -> 0x0093 }
            androidx.camera.core.impl.w0$a r2 = androidx.camera.core.impl.C0899w0.C0900a.RELEASED     // Catch:{ all -> 0x0093 }
            if (r7 != r2) goto L_0x000e
            androidx.camera.core.impl.w0$a r2 = r5.m3601g(r6)     // Catch:{ all -> 0x0093 }
            goto L_0x0012
        L_0x000e:
            androidx.camera.core.impl.w0$a r2 = r5.m3602h(r6, r7)     // Catch:{ all -> 0x0093 }
        L_0x0012:
            if (r2 != r7) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            return
        L_0x0016:
            r2 = 1
            if (r1 >= r2) goto L_0x0056
            int r1 = r5.f2614e     // Catch:{ all -> 0x0093 }
            if (r1 <= 0) goto L_0x0056
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0093 }
            r7.<init>()     // Catch:{ all -> 0x0093 }
            java.util.Map<androidx.camera.core.k1, androidx.camera.core.impl.y0$a> r1 = r5.f2613d     // Catch:{ all -> 0x0093 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0093 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0093 }
        L_0x002c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0093 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0093 }
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x0093 }
            androidx.camera.core.impl.y0$a r3 = (androidx.camera.core.impl.C0911y0.C0912a) r3     // Catch:{ all -> 0x0093 }
            androidx.camera.core.impl.w0$a r3 = r3.mo3166a()     // Catch:{ all -> 0x0093 }
            androidx.camera.core.impl.w0$a r4 = androidx.camera.core.impl.C0899w0.C0900a.PENDING_OPEN     // Catch:{ all -> 0x0093 }
            if (r3 != r4) goto L_0x002c
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x0093 }
            androidx.camera.core.k1 r3 = (androidx.camera.core.C0930k1) r3     // Catch:{ all -> 0x0093 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0093 }
            androidx.camera.core.impl.y0$a r2 = (androidx.camera.core.impl.C0911y0.C0912a) r2     // Catch:{ all -> 0x0093 }
            r7.put(r3, r2)     // Catch:{ all -> 0x0093 }
            goto L_0x002c
        L_0x0056:
            androidx.camera.core.impl.w0$a r1 = androidx.camera.core.impl.C0899w0.C0900a.PENDING_OPEN     // Catch:{ all -> 0x0093 }
            if (r7 != r1) goto L_0x006f
            int r7 = r5.f2614e     // Catch:{ all -> 0x0093 }
            if (r7 <= 0) goto L_0x006f
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0093 }
            r7.<init>()     // Catch:{ all -> 0x0093 }
            java.util.Map<androidx.camera.core.k1, androidx.camera.core.impl.y0$a> r1 = r5.f2613d     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0093 }
            androidx.camera.core.impl.y0$a r1 = (androidx.camera.core.impl.C0911y0.C0912a) r1     // Catch:{ all -> 0x0093 }
            r7.put(r6, r1)     // Catch:{ all -> 0x0093 }
            goto L_0x0070
        L_0x006f:
            r7 = 0
        L_0x0070:
            if (r7 == 0) goto L_0x0077
            if (r8 != 0) goto L_0x0077
            r7.remove(r6)     // Catch:{ all -> 0x0093 }
        L_0x0077:
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x0092
            java.util.Collection r6 = r7.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0082:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0092
            java.lang.Object r7 = r6.next()
            androidx.camera.core.impl.y0$a r7 = (androidx.camera.core.impl.C0911y0.C0912a) r7
            r7.mo3167b()
            goto L_0x0082
        L_0x0092:
            return
        L_0x0093:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0911y0.mo3163c(androidx.camera.core.k1, androidx.camera.core.impl.w0$a, boolean):void");
    }

    /* renamed from: e */
    public void mo3164e(C0930k1 k1Var, Executor executor, C0913b bVar) {
        synchronized (this.f2611b) {
            boolean z = !this.f2613d.containsKey(k1Var);
            C1177h.m4586h(z, "Camera is already registered: " + k1Var);
            this.f2613d.put(k1Var, new C0912a((C0899w0.C0900a) null, executor, bVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3165f(androidx.camera.core.C0930k1 r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f2611b
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.k1, androidx.camera.core.impl.y0$a> r1 = r9.f2613d     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ all -> 0x009b }
            androidx.camera.core.impl.y0$a r1 = (androidx.camera.core.impl.C0911y0.C0912a) r1     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = androidx.core.util.C1177h.m4584f(r1, r2)     // Catch:{ all -> 0x009b }
            androidx.camera.core.impl.y0$a r1 = (androidx.camera.core.impl.C0911y0.C0912a) r1     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = androidx.camera.core.C0949o2.m3693f(r2)     // Catch:{ all -> 0x009b }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0052
            java.lang.StringBuilder r2 = r9.f2610a     // Catch:{ all -> 0x009b }
            r2.setLength(r4)     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r2 = r9.f2610a     // Catch:{ all -> 0x009b }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x009b }
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x009b }
            r7[r4] = r10     // Catch:{ all -> 0x009b }
            int r10 = r9.f2614e     // Catch:{ all -> 0x009b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x009b }
            r7[r3] = r10     // Catch:{ all -> 0x009b }
            r10 = 2
            androidx.camera.core.impl.w0$a r8 = r1.mo3166a()     // Catch:{ all -> 0x009b }
            boolean r8 = m3599b(r8)     // Catch:{ all -> 0x009b }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x009b }
            r7[r10] = r8     // Catch:{ all -> 0x009b }
            r10 = 3
            androidx.camera.core.impl.w0$a r8 = r1.mo3166a()     // Catch:{ all -> 0x009b }
            r7[r10] = r8     // Catch:{ all -> 0x009b }
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch:{ all -> 0x009b }
            r2.append(r10)     // Catch:{ all -> 0x009b }
        L_0x0052:
            int r10 = r9.f2614e     // Catch:{ all -> 0x009b }
            if (r10 > 0) goto L_0x0063
            androidx.camera.core.impl.w0$a r10 = r1.mo3166a()     // Catch:{ all -> 0x009b }
            boolean r10 = m3599b(r10)     // Catch:{ all -> 0x009b }
            if (r10 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r10 = 0
            goto L_0x0069
        L_0x0063:
            androidx.camera.core.impl.w0$a r10 = androidx.camera.core.impl.C0899w0.C0900a.OPENING     // Catch:{ all -> 0x009b }
            r1.mo3168c(r10)     // Catch:{ all -> 0x009b }
            r10 = 1
        L_0x0069:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.C0949o2.m3693f(r1)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0094
            java.lang.StringBuilder r1 = r9.f2610a     // Catch:{ all -> 0x009b }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x009b }
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x009b }
            if (r10 == 0) goto L_0x007e
            java.lang.String r6 = "SUCCESS"
            goto L_0x0080
        L_0x007e:
            java.lang.String r6 = "FAIL"
        L_0x0080:
            r3[r4] = r6     // Catch:{ all -> 0x009b }
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch:{ all -> 0x009b }
            r1.append(r2)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.f2610a     // Catch:{ all -> 0x009b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x009b }
            androidx.camera.core.C0949o2.m3688a(r1, r2)     // Catch:{ all -> 0x009b }
        L_0x0094:
            if (r10 == 0) goto L_0x0099
            r9.m3600d()     // Catch:{ all -> 0x009b }
        L_0x0099:
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            return r10
        L_0x009b:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0911y0.mo3165f(androidx.camera.core.k1):boolean");
    }
}
