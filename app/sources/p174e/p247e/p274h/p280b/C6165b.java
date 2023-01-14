package p174e.p247e.p274h.p280b;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p174e.p247e.p274h.p280b.C6163a;

/* renamed from: e.e.h.b.b */
class C6165b extends C6163a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f16949b = new Object();

    /* renamed from: c */
    private final Handler f16950c = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C6163a.C6164a> f16951d = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList<C6163a.C6164a> f16952e = new ArrayList<>();

    /* renamed from: f */
    private final Runnable f16953f = new C6166a();

    /* renamed from: e.e.h.b.b$a */
    class C6166a implements Runnable {
        C6166a() {
        }

        public void run() {
            synchronized (C6165b.this.f16949b) {
                ArrayList f = C6165b.this.f16952e;
                C6165b bVar = C6165b.this;
                ArrayList unused = bVar.f16952e = bVar.f16951d;
                ArrayList unused2 = C6165b.this.f16951d = f;
            }
            int size = C6165b.this.f16952e.size();
            for (int i = 0; i < size; i++) {
                ((C6163a.C6164a) C6165b.this.f16952e.get(i)).mo18253a();
            }
            C6165b.this.f16952e.clear();
        }
    }

    /* renamed from: a */
    public void mo18251a(C6163a.C6164a aVar) {
        synchronized (this.f16949b) {
            this.f16951d.remove(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r2.f16950c.post(r2.f16953f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18252d(p174e.p247e.p274h.p280b.C6163a.C6164a r3) {
        /*
            r2 = this;
            boolean r0 = p174e.p247e.p274h.p280b.C6163a.m23252c()
            if (r0 != 0) goto L_0x000a
            r3.mo18253a()
            return
        L_0x000a:
            java.lang.Object r0 = r2.f16949b
            monitor-enter(r0)
            java.util.ArrayList<e.e.h.b.a$a> r1 = r2.f16951d     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0017:
            java.util.ArrayList<e.e.h.b.a$a> r1 = r2.f16951d     // Catch:{ all -> 0x0032 }
            r1.add(r3)     // Catch:{ all -> 0x0032 }
            java.util.ArrayList<e.e.h.b.a$a> r3 = r2.f16951d     // Catch:{ all -> 0x0032 }
            int r3 = r3.size()     // Catch:{ all -> 0x0032 }
            r1 = 1
            if (r3 != r1) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0031
            android.os.Handler r3 = r2.f16950c
            java.lang.Runnable r0 = r2.f16953f
            r3.post(r0)
        L_0x0031:
            return
        L_0x0032:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p280b.C6165b.mo18252d(e.e.h.b.a$a):void");
    }
}
