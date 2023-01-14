package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.C3379e;
import com.google.android.datatransport.runtime.backends.C3380f;
import com.google.android.datatransport.runtime.backends.C3382g;
import com.google.android.datatransport.runtime.backends.C3390m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.p323i.C6572i;
import p174e.p319f.p320a.p322b.p323i.C6573j;
import p174e.p319f.p320a.p322b.p323i.C6583p;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6499i0;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6519q0;
import p174e.p319f.p320a.p322b.p323i.p326b0.C6547b;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;
import p174e.p319f.p320a.p322b.p323i.p331x.p332a.C6597a;
import p174e.p319f.p320a.p322b.p323i.p331x.p332a.C6601c;
import p174e.p319f.p320a.p322b.p323i.p333y.C6610a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.u */
public class C3417u {

    /* renamed from: a */
    private final Context f9663a;

    /* renamed from: b */
    private final C3379e f9664b;

    /* renamed from: c */
    private final C6501j0 f9665c;

    /* renamed from: d */
    private final C3421y f9666d;

    /* renamed from: e */
    private final Executor f9667e;

    /* renamed from: f */
    private final C6547b f9668f;

    /* renamed from: g */
    private final C6552a f9669g;

    /* renamed from: h */
    private final C6552a f9670h;

    /* renamed from: i */
    private final C6499i0 f9671i;

    public C3417u(Context context, C3379e eVar, C6501j0 j0Var, C3421y yVar, Executor executor, C6547b bVar, C6552a aVar, C6552a aVar2, C6499i0 i0Var) {
        this.f9663a = context;
        this.f9664b = eVar;
        this.f9665c = j0Var;
        this.f9666d = yVar;
        this.f9667e = executor;
        this.f9668f = bVar;
        this.f9669g = aVar;
        this.f9670h = aVar2;
        this.f9671i = i0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean mo11010d(C6583p pVar) {
        return Boolean.valueOf(this.f9665c.mo19281h0(pVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Iterable mo11011f(C6583p pVar) {
        return this.f9665c.mo19285t(pVar);
    }

    /* renamed from: g */
    private /* synthetic */ Object m13319g(Iterable iterable, C6583p pVar, long j) {
        this.f9665c.mo19283k0(iterable);
        this.f9665c.mo19286v(pVar, this.f9669g.mo19339a() + j);
        return null;
    }

    /* renamed from: i */
    private /* synthetic */ Object m13320i(Iterable iterable) {
        this.f9665c.mo19284n(iterable);
        return null;
    }

    /* renamed from: k */
    private /* synthetic */ Object m13321k() {
        this.f9671i.mo19276a();
        return null;
    }

    /* renamed from: m */
    private /* synthetic */ Object m13322m(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f9671i.mo19278o((long) ((Integer) entry.getValue()).intValue(), C6601c.C6603b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* renamed from: o */
    private /* synthetic */ Object m13323o(C6583p pVar, long j) {
        this.f9665c.mo19286v(pVar, this.f9669g.mo19339a() + j);
        return null;
    }

    /* renamed from: q */
    private /* synthetic */ Object m13324q(C6583p pVar, int i) {
        this.f9666d.mo10984a(pVar, i + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f9666d.mo10984a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo11018t(p174e.p319f.p320a.p322b.p323i.C6583p r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            e.f.a.b.i.b0.b r0 = r3.f9668f     // Catch:{ a -> 0x0026 }
            e.f.a.b.i.a0.j.j0 r1 = r3.f9665c     // Catch:{ a -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ a -> 0x0026 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.b r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.b     // Catch:{ a -> 0x0026 }
            r2.<init>(r1)     // Catch:{ a -> 0x0026 }
            r0.mo19302b(r2)     // Catch:{ a -> 0x0026 }
            boolean r0 = r3.mo11009b()     // Catch:{ a -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            e.f.a.b.i.b0.b r0 = r3.f9668f     // Catch:{ a -> 0x0026 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.k r1 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.k     // Catch:{ a -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ a -> 0x0026 }
            r0.mo19302b(r1)     // Catch:{ a -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.mo11019u(r4, r5)     // Catch:{ a -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.y r0 = r3.f9666d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.mo10984a(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.C3417u.mo11018t(e.f.a.b.i.p, int, java.lang.Runnable):void");
    }

    /* renamed from: a */
    public C6573j mo11008a(C3390m mVar) {
        C6547b bVar = this.f9668f;
        C6499i0 i0Var = this.f9671i;
        Objects.requireNonNull(i0Var);
        return mVar.mo10847b(C6573j.m25122a().mo19336i(this.f9669g.mo19339a()).mo19338k(this.f9670h.mo19339a()).mo19337j("GDT_CLIENT_METRICS").mo19335h(new C6572i(C6463b.m24863b("proto"), ((C6597a) bVar.mo19302b(new C3405o(i0Var))).mo19401f())).mo19331d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo11009b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f9663a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: h */
    public /* synthetic */ Object mo11012h(Iterable iterable, C6583p pVar, long j) {
        m13319g(iterable, pVar, j);
        return null;
    }

    /* renamed from: j */
    public /* synthetic */ Object mo11013j(Iterable iterable) {
        m13320i(iterable);
        return null;
    }

    /* renamed from: l */
    public /* synthetic */ Object mo11014l() {
        m13321k();
        return null;
    }

    /* renamed from: n */
    public /* synthetic */ Object mo11015n(Map map) {
        m13322m(map);
        return null;
    }

    /* renamed from: p */
    public /* synthetic */ Object mo11016p(C6583p pVar, long j) {
        m13323o(pVar, j);
        return null;
    }

    /* renamed from: r */
    public /* synthetic */ Object mo11017r(C6583p pVar, int i) {
        m13324q(pVar, i);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C3382g mo11019u(C6583p pVar, int i) {
        C3382g a;
        C3390m mVar = this.f9664b.get(pVar.mo19356b());
        long j = 0;
        C3382g e = C3382g.m13255e(0);
        while (true) {
            long j2 = j;
            while (((Boolean) this.f9668f.mo19302b(new C3395e(this, pVar))).booleanValue()) {
                Iterable<C6519q0> iterable = (Iterable) this.f9668f.mo19302b(new C3397g(this, pVar));
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (mVar == null) {
                    C6610a.m25242b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    a = C3382g.m13253a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C6519q0 b : iterable) {
                        arrayList.add(b.mo19270b());
                    }
                    if (pVar.mo19388e()) {
                        arrayList.add(mo11008a(mVar));
                    }
                    a = mVar.mo10846a(C3380f.m13247a().mo10956b(arrayList).mo10957c(pVar.mo19357c()).mo10955a());
                }
                e = a;
                if (e.mo10959c() == C3382g.C3383a.TRANSIENT_ERROR) {
                    this.f9668f.mo19302b(new C3398h(this, iterable, pVar, j2));
                    this.f9666d.mo10985b(pVar, i + 1, true);
                    return e;
                }
                this.f9668f.mo19302b(new C3400j(this, iterable));
                if (e.mo10959c() == C3382g.C3383a.OK) {
                    j = Math.max(j2, e.mo10958b());
                    if (pVar.mo19388e()) {
                        this.f9668f.mo19302b(new C3402l(this));
                    }
                } else if (e.mo10959c() == C3382g.C3383a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (C6519q0 b2 : iterable) {
                        String j3 = b2.mo19270b().mo19328j();
                        hashMap.put(j3, !hashMap.containsKey(j3) ? 1 : Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                    }
                    this.f9668f.mo19302b(new C3396f(this, hashMap));
                }
            }
            this.f9668f.mo19302b(new C3399i(this, pVar, j2));
            return e;
        }
    }

    /* renamed from: v */
    public void mo11020v(C6583p pVar, int i, Runnable runnable) {
        this.f9667e.execute(new C3394d(this, pVar, i, runnable));
    }
}
