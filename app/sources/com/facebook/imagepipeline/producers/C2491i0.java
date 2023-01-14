package com.facebook.imagepipeline.producers;

import android.util.Pair;
import b.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6064m;
import p174e.p247e.p253d.p264k.C6109e;
import p174e.p247e.p294k.p301e.C6315d;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: com.facebook.imagepipeline.producers.i0 */
public abstract class C2491i0<K, T extends Closeable> implements C2529o0<T> {

    /* renamed from: a */
    final Map<K, C2491i0<K, T>.b> f7343a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2529o0<T> f7344b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f7345c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f7346d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f7347e;

    /* renamed from: com.facebook.imagepipeline.producers.i0$b */
    class C2493b {

        /* renamed from: a */
        private final K f7348a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final CopyOnWriteArraySet<Pair<C2505l<T>, C2531p0>> f7349b = C6064m.m22844a();

        /* renamed from: c */
        private T f7350c;

        /* renamed from: d */
        private float f7351d;

        /* renamed from: e */
        private int f7352e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2469d f7353f;

        /* renamed from: g */
        private C2491i0<K, T>.b f7354g;

        /* renamed from: com.facebook.imagepipeline.producers.i0$b$a */
        class C2494a extends C2472e {

            /* renamed from: a */
            final /* synthetic */ Pair f7356a;

            C2494a(Pair pair) {
                this.f7356a = pair;
            }

            /* renamed from: a */
            public void mo8208a() {
                boolean remove;
                List list;
                List list2;
                List list3;
                C2469d dVar;
                synchronized (C2493b.this) {
                    remove = C2493b.this.f7349b.remove(this.f7356a);
                    list = null;
                    if (!remove) {
                        dVar = null;
                        list3 = null;
                    } else if (C2493b.this.f7349b.isEmpty()) {
                        dVar = C2493b.this.f7353f;
                        list3 = null;
                    } else {
                        List d = C2493b.this.m10385s();
                        list3 = C2493b.this.m10386t();
                        list2 = C2493b.this.m10384r();
                        List list4 = d;
                        dVar = null;
                        list = list4;
                    }
                    list2 = list3;
                }
                C2469d.m10251u(list);
                C2469d.m10252v(list3);
                C2469d.m10250t(list2);
                if (dVar != null) {
                    if (!C2491i0.this.f7345c || dVar.mo8246l()) {
                        dVar.mo8253w();
                    } else {
                        C2469d.m10252v(dVar.mo8234A(C6315d.LOW));
                    }
                }
                if (remove) {
                    ((C2505l) this.f7356a.first).mo8220a();
                }
            }

            /* renamed from: b */
            public void mo8257b() {
                C2469d.m10250t(C2493b.this.m10384r());
            }

            /* renamed from: c */
            public void mo8258c() {
                C2469d.m10252v(C2493b.this.m10386t());
            }

            /* renamed from: d */
            public void mo8259d() {
                C2469d.m10251u(C2493b.this.m10385s());
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.i0$b$b */
        private class C2495b extends C2459b<T> {
            private C2495b() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: g */
            public void mo8224g() {
                try {
                    if (C6394b.m24481d()) {
                        C6394b.m24478a("MultiplexProducer#onCancellation");
                    }
                    C2493b.this.mo8287m(this);
                } finally {
                    if (C6394b.m24481d()) {
                        C6394b.m24479b();
                    }
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: h */
            public void mo8225h(Throwable th) {
                try {
                    if (C6394b.m24481d()) {
                        C6394b.m24478a("MultiplexProducer#onFailure");
                    }
                    C2493b.this.mo8288n(this, th);
                } finally {
                    if (C6394b.m24481d()) {
                        C6394b.m24479b();
                    }
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: j */
            public void mo8226j(float f) {
                try {
                    if (C6394b.m24481d()) {
                        C6394b.m24478a("MultiplexProducer#onProgressUpdate");
                    }
                    C2493b.this.mo8290p(this, f);
                } finally {
                    if (C6394b.m24481d()) {
                        C6394b.m24479b();
                    }
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: p */
            public void mo8209i(T t, int i) {
                try {
                    if (C6394b.m24481d()) {
                        C6394b.m24478a("MultiplexProducer#onNewResult");
                    }
                    C2493b.this.mo8289o(this, t, i);
                } finally {
                    if (C6394b.m24481d()) {
                        C6394b.m24479b();
                    }
                }
            }
        }

        public C2493b(K k) {
            this.f7348a = k;
        }

        /* renamed from: g */
        private void m10378g(Pair<C2505l<T>, C2531p0> pair, C2531p0 p0Var) {
            p0Var.mo8241g(new C2494a(pair));
        }

        /* renamed from: i */
        private void m10379i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* renamed from: j */
        private synchronized boolean m10380j() {
            boolean z;
            Iterator<Pair<C2505l<T>, C2531p0>> it = this.f7349b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C2531p0) it.next().second).mo8251q()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            return z;
        }

        /* renamed from: k */
        private synchronized boolean m10381k() {
            boolean z;
            Iterator<Pair<C2505l<T>, C2531p0>> it = this.f7349b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C2531p0) it.next().second).mo8246l()) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            return z;
        }

        /* renamed from: l */
        private synchronized C6315d m10382l() {
            C6315d dVar;
            dVar = C6315d.LOW;
            Iterator<Pair<C2505l<T>, C2531p0>> it = this.f7349b.iterator();
            while (it.hasNext()) {
                dVar = C6315d.m23926e(dVar, ((C2531p0) it.next().second).mo8238d());
            }
            return dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public void m10383q(C6109e eVar) {
            synchronized (this) {
                boolean z = true;
                C6062k.m22834b(Boolean.valueOf(this.f7353f == null));
                if (this.f7354g != null) {
                    z = false;
                }
                C6062k.m22834b(Boolean.valueOf(z));
                if (this.f7349b.isEmpty()) {
                    C2491i0.this.mo8285k(this.f7348a, this);
                    return;
                }
                C2531p0 p0Var = (C2531p0) this.f7349b.iterator().next().second;
                C2469d dVar = new C2469d(p0Var.mo8240f(), p0Var.mo8235a(), p0Var.mo8250p(), p0Var.mo8237c(), p0Var.mo8252r(), m10381k(), m10380j(), m10382l(), p0Var.mo8242h());
                this.f7353f = dVar;
                dVar.mo8245k(p0Var.mo8236b());
                if (eVar.mo18110g()) {
                    this.f7353f.mo8239e("started_as_prefetch", Boolean.valueOf(eVar.mo18109e()));
                }
                C2495b bVar = new C2495b();
                this.f7354g = bVar;
                C2469d dVar2 = this.f7353f;
                C2491i0.this.f7344b.mo8198b(bVar, dVar2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public synchronized List<C2535q0> m10384r() {
            C2469d dVar = this.f7353f;
            if (dVar == null) {
                return null;
            }
            return dVar.mo8255y(m10380j());
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public synchronized List<C2535q0> m10385s() {
            C2469d dVar = this.f7353f;
            if (dVar == null) {
                return null;
            }
            return dVar.mo8256z(m10381k());
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public synchronized List<C2535q0> m10386t() {
            C2469d dVar = this.f7353f;
            if (dVar == null) {
                return null;
            }
            return dVar.mo8234A(m10382l());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            com.facebook.imagepipeline.producers.C2469d.m10251u(r1);
            com.facebook.imagepipeline.producers.C2469d.m10252v(r2);
            com.facebook.imagepipeline.producers.C2469d.m10250t(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            if (r4 == r7.f7350c) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r4 == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            r4 = r7.f7355h.mo8274g(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            if (r4 == null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
            if (r5 <= 0.0f) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.mo8222c(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
            r8.mo8223d(r4, r6);
            m10379i(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
            m10378g(r0, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
            return true;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo8286h(com.facebook.imagepipeline.producers.C2505l<T> r8, com.facebook.imagepipeline.producers.C2531p0 r9) {
            /*
                r7 = this;
                android.util.Pair r0 = android.util.Pair.create(r8, r9)
                monitor-enter(r7)
                com.facebook.imagepipeline.producers.i0 r1 = com.facebook.imagepipeline.producers.C2491i0.this     // Catch:{ all -> 0x0060 }
                K r2 = r7.f7348a     // Catch:{ all -> 0x0060 }
                com.facebook.imagepipeline.producers.i0$b r1 = r1.mo8284i(r2)     // Catch:{ all -> 0x0060 }
                if (r1 == r7) goto L_0x0012
                r8 = 0
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                return r8
            L_0x0012:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.l<T>, com.facebook.imagepipeline.producers.p0>> r1 = r7.f7349b     // Catch:{ all -> 0x0060 }
                r1.add(r0)     // Catch:{ all -> 0x0060 }
                java.util.List r1 = r7.m10385s()     // Catch:{ all -> 0x0060 }
                java.util.List r2 = r7.m10386t()     // Catch:{ all -> 0x0060 }
                java.util.List r3 = r7.m10384r()     // Catch:{ all -> 0x0060 }
                T r4 = r7.f7350c     // Catch:{ all -> 0x0060 }
                float r5 = r7.f7351d     // Catch:{ all -> 0x0060 }
                int r6 = r7.f7352e     // Catch:{ all -> 0x0060 }
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                com.facebook.imagepipeline.producers.C2469d.m10251u(r1)
                com.facebook.imagepipeline.producers.C2469d.m10252v(r2)
                com.facebook.imagepipeline.producers.C2469d.m10250t(r3)
                monitor-enter(r0)
                monitor-enter(r7)     // Catch:{ all -> 0x005d }
                T r1 = r7.f7350c     // Catch:{ all -> 0x005a }
                if (r4 == r1) goto L_0x003b
                r4 = 0
                goto L_0x0043
            L_0x003b:
                if (r4 == 0) goto L_0x0043
                com.facebook.imagepipeline.producers.i0 r1 = com.facebook.imagepipeline.producers.C2491i0.this     // Catch:{ all -> 0x005a }
                java.io.Closeable r4 = r1.mo8274g(r4)     // Catch:{ all -> 0x005a }
            L_0x0043:
                monitor-exit(r7)     // Catch:{ all -> 0x005a }
                if (r4 == 0) goto L_0x0054
                r1 = 0
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x004e
                r8.mo8222c(r5)     // Catch:{ all -> 0x005d }
            L_0x004e:
                r8.mo8223d(r4, r6)     // Catch:{ all -> 0x005d }
                r7.m10379i(r4)     // Catch:{ all -> 0x005d }
            L_0x0054:
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                r7.m10378g(r0, r9)
                r8 = 1
                return r8
            L_0x005a:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x005a }
                throw r8     // Catch:{ all -> 0x005d }
            L_0x005d:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                throw r8
            L_0x0060:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2491i0.C2493b.mo8286h(com.facebook.imagepipeline.producers.l, com.facebook.imagepipeline.producers.p0):boolean");
        }

        /* renamed from: m */
        public void mo8287m(C2491i0<K, T>.b bVar) {
            synchronized (this) {
                if (this.f7354g == bVar) {
                    this.f7354g = null;
                    this.f7353f = null;
                    m10379i(this.f7350c);
                    this.f7350c = null;
                    m10383q(C6109e.UNSET);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            r1 = r6.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((com.facebook.imagepipeline.producers.C2531p0) r1.second).mo8250p().mo8329k((com.facebook.imagepipeline.producers.C2531p0) r1.second, com.facebook.imagepipeline.producers.C2491i0.m10365f(r5.f7355h), r7, (java.util.Map<java.lang.String, java.lang.String>) null);
            ((com.facebook.imagepipeline.producers.C2505l) r1.first).mo8221b(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            if (r6.hasNext() == false) goto L_0x0050;
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8288n(com.facebook.imagepipeline.producers.C2491i0<K, T>.b.b r6, java.lang.Throwable r7) {
            /*
                r5 = this;
                monitor-enter(r5)
                com.facebook.imagepipeline.producers.i0<K, T>$b.b r0 = r5.f7354g     // Catch:{ all -> 0x0051 }
                if (r0 == r6) goto L_0x0007
                monitor-exit(r5)     // Catch:{ all -> 0x0051 }
                return
            L_0x0007:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.l<T>, com.facebook.imagepipeline.producers.p0>> r6 = r5.f7349b     // Catch:{ all -> 0x0051 }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0051 }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.l<T>, com.facebook.imagepipeline.producers.p0>> r0 = r5.f7349b     // Catch:{ all -> 0x0051 }
                r0.clear()     // Catch:{ all -> 0x0051 }
                com.facebook.imagepipeline.producers.i0 r0 = com.facebook.imagepipeline.producers.C2491i0.this     // Catch:{ all -> 0x0051 }
                K r1 = r5.f7348a     // Catch:{ all -> 0x0051 }
                r0.mo8285k(r1, r5)     // Catch:{ all -> 0x0051 }
                T r0 = r5.f7350c     // Catch:{ all -> 0x0051 }
                r5.m10379i(r0)     // Catch:{ all -> 0x0051 }
                r0 = 0
                r5.f7350c = r0     // Catch:{ all -> 0x0051 }
                monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            L_0x0022:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L_0x0050
                java.lang.Object r1 = r6.next()
                android.util.Pair r1 = (android.util.Pair) r1
                monitor-enter(r1)
                java.lang.Object r2 = r1.second     // Catch:{ all -> 0x004d }
                com.facebook.imagepipeline.producers.p0 r2 = (com.facebook.imagepipeline.producers.C2531p0) r2     // Catch:{ all -> 0x004d }
                com.facebook.imagepipeline.producers.r0 r2 = r2.mo8250p()     // Catch:{ all -> 0x004d }
                java.lang.Object r3 = r1.second     // Catch:{ all -> 0x004d }
                com.facebook.imagepipeline.producers.p0 r3 = (com.facebook.imagepipeline.producers.C2531p0) r3     // Catch:{ all -> 0x004d }
                com.facebook.imagepipeline.producers.i0 r4 = com.facebook.imagepipeline.producers.C2491i0.this     // Catch:{ all -> 0x004d }
                java.lang.String r4 = r4.f7346d     // Catch:{ all -> 0x004d }
                r2.mo8329k(r3, r4, r7, r0)     // Catch:{ all -> 0x004d }
                java.lang.Object r2 = r1.first     // Catch:{ all -> 0x004d }
                com.facebook.imagepipeline.producers.l r2 = (com.facebook.imagepipeline.producers.C2505l) r2     // Catch:{ all -> 0x004d }
                r2.mo8221b(r7)     // Catch:{ all -> 0x004d }
                monitor-exit(r1)     // Catch:{ all -> 0x004d }
                goto L_0x0022
            L_0x004d:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x004d }
                throw r6
            L_0x0050:
                return
            L_0x0051:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0051 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2491i0.C2493b.mo8288n(com.facebook.imagepipeline.producers.i0$b$b, java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r0.hasNext() == false) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
            r2 = r0.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
            if (com.facebook.imagepipeline.producers.C2459b.m10210e(r9) == false) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
            ((com.facebook.imagepipeline.producers.C2531p0) r2.second).mo8250p().mo8328j((com.facebook.imagepipeline.producers.C2531p0) r2.second, com.facebook.imagepipeline.producers.C2491i0.m10365f(r6.f7355h), (java.util.Map<java.lang.String, java.lang.String>) null);
            r3 = r6.f7353f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
            if (r3 == null) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
            ((com.facebook.imagepipeline.producers.C2531p0) r2.second).mo8245k(r3.mo8236b());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
            ((com.facebook.imagepipeline.producers.C2531p0) r2.second).mo8239e(com.facebook.imagepipeline.producers.C2491i0.m10362c(r6.f7355h), java.lang.Integer.valueOf(r1));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
            ((com.facebook.imagepipeline.producers.C2505l) r2.first).mo8223d(r8, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
            return;
         */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8289o(com.facebook.imagepipeline.producers.C2491i0<K, T>.b.b r7, T r8, int r9) {
            /*
                r6 = this;
                monitor-enter(r6)
                com.facebook.imagepipeline.producers.i0<K, T>$b.b r0 = r6.f7354g     // Catch:{ all -> 0x008e }
                if (r0 == r7) goto L_0x0007
                monitor-exit(r6)     // Catch:{ all -> 0x008e }
                return
            L_0x0007:
                T r7 = r6.f7350c     // Catch:{ all -> 0x008e }
                r6.m10379i(r7)     // Catch:{ all -> 0x008e }
                r7 = 0
                r6.f7350c = r7     // Catch:{ all -> 0x008e }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.l<T>, com.facebook.imagepipeline.producers.p0>> r0 = r6.f7349b     // Catch:{ all -> 0x008e }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x008e }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.l<T>, com.facebook.imagepipeline.producers.p0>> r1 = r6.f7349b     // Catch:{ all -> 0x008e }
                int r1 = r1.size()     // Catch:{ all -> 0x008e }
                boolean r2 = com.facebook.imagepipeline.producers.C2459b.m10211f(r9)     // Catch:{ all -> 0x008e }
                if (r2 == 0) goto L_0x002c
                com.facebook.imagepipeline.producers.i0 r2 = com.facebook.imagepipeline.producers.C2491i0.this     // Catch:{ all -> 0x008e }
                java.io.Closeable r2 = r2.mo8274g(r8)     // Catch:{ all -> 0x008e }
                r6.f7350c = r2     // Catch:{ all -> 0x008e }
                r6.f7352e = r9     // Catch:{ all -> 0x008e }
                goto L_0x0038
            L_0x002c:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.l<T>, com.facebook.imagepipeline.producers.p0>> r2 = r6.f7349b     // Catch:{ all -> 0x008e }
                r2.clear()     // Catch:{ all -> 0x008e }
                com.facebook.imagepipeline.producers.i0 r2 = com.facebook.imagepipeline.producers.C2491i0.this     // Catch:{ all -> 0x008e }
                K r3 = r6.f7348a     // Catch:{ all -> 0x008e }
                r2.mo8285k(r3, r6)     // Catch:{ all -> 0x008e }
            L_0x0038:
                monitor-exit(r6)     // Catch:{ all -> 0x008e }
            L_0x0039:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x008d
                java.lang.Object r2 = r0.next()
                android.util.Pair r2 = (android.util.Pair) r2
                monitor-enter(r2)
                boolean r3 = com.facebook.imagepipeline.producers.C2459b.m10210e(r9)     // Catch:{ all -> 0x008a }
                if (r3 == 0) goto L_0x0081
                java.lang.Object r3 = r2.second     // Catch:{ all -> 0x008a }
                com.facebook.imagepipeline.producers.p0 r3 = (com.facebook.imagepipeline.producers.C2531p0) r3     // Catch:{ all -> 0x008a }
                com.facebook.imagepipeline.producers.r0 r3 = r3.mo8250p()     // Catch:{ all -> 0x008a }
                java.lang.Object r4 = r2.second     // Catch:{ all -> 0x008a }
                com.facebook.imagepipeline.producers.p0 r4 = (com.facebook.imagepipeline.producers.C2531p0) r4     // Catch:{ all -> 0x008a }
                com.facebook.imagepipeline.producers.i0 r5 = com.facebook.imagepipeline.producers.C2491i0.this     // Catch:{ all -> 0x008a }
                java.lang.String r5 = r5.f7346d     // Catch:{ all -> 0x008a }
                r3.mo8328j(r4, r5, r7)     // Catch:{ all -> 0x008a }
                com.facebook.imagepipeline.producers.d r3 = r6.f7353f     // Catch:{ all -> 0x008a }
                if (r3 == 0) goto L_0x0070
                java.lang.Object r4 = r2.second     // Catch:{ all -> 0x008a }
                com.facebook.imagepipeline.producers.p0 r4 = (com.facebook.imagepipeline.producers.C2531p0) r4     // Catch:{ all -> 0x008a }
                java.util.Map r3 = r3.mo8236b()     // Catch:{ all -> 0x008a }
                r4.mo8245k(r3)     // Catch:{ all -> 0x008a }
            L_0x0070:
                java.lang.Object r3 = r2.second     // Catch:{ all -> 0x008a }
                com.facebook.imagepipeline.producers.p0 r3 = (com.facebook.imagepipeline.producers.C2531p0) r3     // Catch:{ all -> 0x008a }
                com.facebook.imagepipeline.producers.i0 r4 = com.facebook.imagepipeline.producers.C2491i0.this     // Catch:{ all -> 0x008a }
                java.lang.String r4 = r4.f7347e     // Catch:{ all -> 0x008a }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x008a }
                r3.mo8239e(r4, r5)     // Catch:{ all -> 0x008a }
            L_0x0081:
                java.lang.Object r3 = r2.first     // Catch:{ all -> 0x008a }
                com.facebook.imagepipeline.producers.l r3 = (com.facebook.imagepipeline.producers.C2505l) r3     // Catch:{ all -> 0x008a }
                r3.mo8223d(r8, r9)     // Catch:{ all -> 0x008a }
                monitor-exit(r2)     // Catch:{ all -> 0x008a }
                goto L_0x0039
            L_0x008a:
                r7 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x008a }
                throw r7
            L_0x008d:
                return
            L_0x008e:
                r7 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x008e }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2491i0.C2493b.mo8289o(com.facebook.imagepipeline.producers.i0$b$b, java.io.Closeable, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
            r0 = r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((com.facebook.imagepipeline.producers.C2505l) r0.first).mo8222c(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            if (r3.hasNext() == false) goto L_0x0029;
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8290p(com.facebook.imagepipeline.producers.C2491i0<K, T>.b.b r3, float r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.producers.i0<K, T>$b.b r0 = r2.f7354g     // Catch:{ all -> 0x002a }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0007:
                r2.f7351d = r4     // Catch:{ all -> 0x002a }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.l<T>, com.facebook.imagepipeline.producers.p0>> r3 = r2.f7349b     // Catch:{ all -> 0x002a }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002a }
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
            L_0x0010:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0029
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0026 }
                com.facebook.imagepipeline.producers.l r1 = (com.facebook.imagepipeline.producers.C2505l) r1     // Catch:{ all -> 0x0026 }
                r1.mo8222c(r4)     // Catch:{ all -> 0x0026 }
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                goto L_0x0010
            L_0x0026:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                throw r3
            L_0x0029:
                return
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2491i0.C2493b.mo8290p(com.facebook.imagepipeline.producers.i0$b$b, float):void");
        }
    }

    protected C2491i0(C2529o0<T> o0Var, String str, String str2) {
        this(o0Var, str, str2, false);
    }

    protected C2491i0(C2529o0<T> o0Var, String str, String str2, boolean z) {
        this.f7344b = o0Var;
        this.f7343a = new HashMap();
        this.f7345c = z;
        this.f7346d = str;
        this.f7347e = str2;
    }

    /* renamed from: h */
    private synchronized C2491i0<K, T>.b m10366h(K k) {
        C2491i0<K, T>.b bVar;
        bVar = new C2493b(k);
        this.f7343a.put(k, bVar);
        return bVar;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<T> lVar, C2531p0 p0Var) {
        boolean z;
        C2491i0<K, T>.b i;
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("MultiplexProducer#produceResults");
            }
            p0Var.mo8250p().mo8326e(p0Var, this.f7346d);
            Object j = mo8275j(p0Var);
            do {
                z = false;
                synchronized (this) {
                    i = mo8284i(j);
                    if (i == null) {
                        i = m10366h(j);
                        z = true;
                    }
                }
            } while (!i.mo8286h(lVar, p0Var));
            if (z) {
                i.m10383q(C6109e.m22994h(p0Var.mo8246l()));
            }
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        } catch (Throwable th) {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract T mo8274g(T t);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public synchronized C2491i0<K, T>.b mo8284i(K k) {
        return this.f7343a.get(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract K mo8275j(C2531p0 p0Var);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public synchronized void mo8285k(K k, C2491i0<K, T>.b bVar) {
        if (this.f7343a.get(k) == bVar) {
            this.f7343a.remove(k);
        }
    }
}
