package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3631f;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3705r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import p027c.p060f.C1788a;
import p174e.p319f.p320a.p335c.p345f.p350e.C6681e;
import p174e.p319f.p320a.p335c.p345f.p350e.C6686j;
import p174e.p319f.p320a.p335c.p360g.C8921a;
import p174e.p319f.p320a.p335c.p360g.C8939g;

/* renamed from: com.google.android.gms.common.api.internal.t */
final class C3583t implements C3572q1 {

    /* renamed from: a */
    private final Context f10085a;

    /* renamed from: b */
    private final C3588u0 f10086b;

    /* renamed from: c */
    private final Looper f10087c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3604y0 f10088d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3604y0 f10089e;

    /* renamed from: f */
    private final Map<C3469a.C3472c<?>, C3604y0> f10090f;

    /* renamed from: g */
    private final Set<C3562o> f10091g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h */
    private final C3469a.C3478f f10092h;

    /* renamed from: i */
    private Bundle f10093i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3623b f10094j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C3623b f10095k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f10096l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Lock f10097m;

    /* renamed from: n */
    private int f10098n = 0;

    private C3583t(Context context, C3588u0 u0Var, Lock lock, Looper looper, C3631f fVar, Map<C3469a.C3472c<?>, C3469a.C3478f> map, Map<C3469a.C3472c<?>, C3469a.C3478f> map2, C3659d dVar, C3469a.C3470a<? extends C8939g, C8921a> aVar, C3469a.C3478f fVar2, ArrayList<C3610z2> arrayList, ArrayList<C3610z2> arrayList2, Map<C3469a<?>, Boolean> map3, Map<C3469a<?>, Boolean> map4) {
        this.f10085a = context;
        this.f10086b = u0Var;
        this.f10097m = lock;
        this.f10087c = looper;
        this.f10092h = fVar2;
        Context context2 = context;
        C3588u0 u0Var2 = u0Var;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C3631f fVar3 = fVar;
        C3604y0 y0Var = r3;
        C3604y0 y0Var2 = new C3604y0(context2, u0Var2, lock2, looper2, fVar3, map2, (C3659d) null, map4, (C3469a.C3470a<? extends C8939g, C8921a>) null, arrayList2, new C3515d3(this, (C3510c3) null));
        this.f10088d = y0Var;
        this.f10089e = new C3604y0(context2, u0Var2, lock2, looper2, fVar3, map, dVar, map3, aVar, arrayList, new C3525f3(this, (C3520e3) null));
        C1788a aVar2 = new C1788a();
        for (C3469a.C3472c<?> put : map2.keySet()) {
            aVar2.put(put, this.f10088d);
        }
        for (C3469a.C3472c<?> put2 : map.keySet()) {
            aVar2.put(put2, this.f10089e);
        }
        this.f10090f = Collections.unmodifiableMap(aVar2);
    }

    /* renamed from: A */
    private final PendingIntent m13928A() {
        if (this.f10092h == null) {
            return null;
        }
        return C6681e.m25340a(this.f10085a, System.identityHashCode(this.f10086b), this.f10092h.mo11138s(), C6681e.f18338a | 134217728);
    }

    /* renamed from: i */
    private final void m13929i(C3623b bVar) {
        int i = this.f10098n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f10098n = 0;
            }
            this.f10086b.mo11307c(bVar);
        }
        m13930j();
        this.f10098n = 0;
    }

    /* renamed from: j */
    private final void m13930j() {
        for (C3562o a : this.f10091g) {
            a.mo11132a();
        }
        this.f10091g.clear();
    }

    /* renamed from: k */
    private final boolean m13931k() {
        C3623b bVar = this.f10095k;
        return bVar != null && bVar.mo11462o() == 4;
    }

    /* renamed from: l */
    private final boolean m13932l(C3511d<? extends C3612k, ? extends C3469a.C3471b> dVar) {
        C3604y0 y0Var = this.f10090f.get(dVar.mo11298r());
        C3705r.m14347l(y0Var, "GoogleApiClient is not configured to use the API required for this call.");
        return y0Var.equals(this.f10089e);
    }

    /* renamed from: m */
    private static boolean m13933m(C3623b bVar) {
        return bVar != null && bVar.mo11458E();
    }

    /* renamed from: o */
    public static C3583t m13935o(Context context, C3588u0 u0Var, Lock lock, Looper looper, C3631f fVar, Map<C3469a.C3472c<?>, C3469a.C3478f> map, C3659d dVar, Map<C3469a<?>, Boolean> map2, C3469a.C3470a<? extends C8939g, C8921a> aVar, ArrayList<C3610z2> arrayList) {
        Map<C3469a<?>, Boolean> map3 = map2;
        C1788a aVar2 = new C1788a();
        C1788a aVar3 = new C1788a();
        C3469a.C3478f fVar2 = null;
        for (Map.Entry next : map.entrySet()) {
            C3469a.C3478f fVar3 = (C3469a.C3478f) next.getValue();
            if (true == fVar3.mo11135b()) {
                fVar2 = fVar3;
            }
            boolean t = fVar3.mo11199t();
            C3469a.C3472c cVar = (C3469a.C3472c) next.getKey();
            if (t) {
                aVar2.put(cVar, fVar3);
            } else {
                aVar3.put(cVar, fVar3);
            }
        }
        C3705r.m14350o(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C1788a aVar4 = new C1788a();
        C1788a aVar5 = new C1788a();
        for (C3469a next2 : map2.keySet()) {
            C3469a.C3472c<?> b = next2.mo11177b();
            if (aVar2.containsKey(b)) {
                aVar4.put(next2, map3.get(next2));
            } else if (aVar3.containsKey(b)) {
                aVar5.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3610z2 z2Var = arrayList.get(i);
            if (aVar4.containsKey(z2Var.f10176a)) {
                arrayList2.add(z2Var);
            } else if (aVar5.containsKey(z2Var.f10176a)) {
                arrayList3.add(z2Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C3583t(context, u0Var, lock, looper, fVar, aVar2, aVar3, dVar, aVar, fVar2, arrayList2, arrayList3, aVar4, aVar5);
    }

    /* renamed from: v */
    static /* bridge */ /* synthetic */ void m13942v(C3583t tVar, int i, boolean z) {
        tVar.f10086b.mo11306b(i, z);
        tVar.f10095k = null;
        tVar.f10094j = null;
    }

    /* renamed from: w */
    static /* bridge */ /* synthetic */ void m13943w(C3583t tVar, Bundle bundle) {
        Bundle bundle2 = tVar.f10093i;
        if (bundle2 == null) {
            tVar.f10093i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ void m13944x(C3583t tVar) {
        C3623b bVar;
        if (m13933m(tVar.f10094j)) {
            if (m13933m(tVar.f10095k) || tVar.m13931k()) {
                int i = tVar.f10098n;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        tVar.f10098n = 0;
                        return;
                    }
                    ((C3588u0) C3705r.m14346k(tVar.f10086b)).mo11305a(tVar.f10093i);
                }
                tVar.m13930j();
                tVar.f10098n = 0;
                return;
            }
            C3623b bVar2 = tVar.f10095k;
            if (bVar2 == null) {
                return;
            }
            if (tVar.f10098n == 1) {
                tVar.m13930j();
                return;
            }
            tVar.m13929i(bVar2);
            tVar.f10088d.mo11397f();
        } else if (tVar.f10094j == null || !m13933m(tVar.f10095k)) {
            C3623b bVar3 = tVar.f10094j;
            if (bVar3 != null && (bVar = tVar.f10095k) != null) {
                if (tVar.f10089e.f10168m < tVar.f10088d.f10168m) {
                    bVar3 = bVar;
                }
                tVar.m13929i(bVar3);
            }
        } else {
            tVar.f10089e.mo11397f();
            tVar.m13929i((C3623b) C3705r.m14346k(tVar.f10094j));
        }
    }

    /* renamed from: a */
    public final void mo11392a() {
        this.f10098n = 2;
        this.f10096l = false;
        this.f10095k = null;
        this.f10094j = null;
        this.f10088d.mo11392a();
        this.f10089e.mo11392a();
    }

    /* renamed from: b */
    public final boolean mo11393b() {
        this.f10097m.lock();
        try {
            boolean z = false;
            if (this.f10088d.mo11393b() && (this.f10089e.mo11393b() || m13931k() || this.f10098n == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f10097m.unlock();
        }
    }

    /* renamed from: c */
    public final <A extends C3469a.C3471b, T extends C3511d<? extends C3612k, A>> T mo11394c(T t) {
        if (!m13932l(t)) {
            return this.f10088d.mo11394c(t);
        }
        if (!m13931k()) {
            return this.f10089e.mo11394c(t);
        }
        t.mo11301v(new Status(4, (String) null, m13928A()));
        return t;
    }

    /* renamed from: d */
    public final void mo11395d() {
        this.f10088d.mo11395d();
        this.f10089e.mo11395d();
    }

    /* renamed from: e */
    public final void mo11396e() {
        this.f10097m.lock();
        try {
            boolean z = mo11420z();
            this.f10089e.mo11397f();
            this.f10095k = new C3623b(4);
            if (z) {
                new C6686j(this.f10087c).post(new C3504b3(this));
            } else {
                m13930j();
            }
        } finally {
            this.f10097m.unlock();
        }
    }

    /* renamed from: f */
    public final void mo11397f() {
        this.f10095k = null;
        this.f10094j = null;
        this.f10098n = 0;
        this.f10088d.mo11397f();
        this.f10089e.mo11397f();
        m13930j();
    }

    /* renamed from: g */
    public final boolean mo11398g(C3562o oVar) {
        this.f10097m.lock();
        try {
            if ((mo11420z() || mo11393b()) && !this.f10089e.mo11393b()) {
                this.f10091g.add(oVar);
                if (this.f10098n == 0) {
                    this.f10098n = 1;
                }
                this.f10095k = null;
                this.f10089e.mo11392a();
                return true;
            }
            this.f10097m.unlock();
            return false;
        } finally {
            this.f10097m.unlock();
        }
    }

    /* renamed from: h */
    public final void mo11399h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f10089e.mo11399h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f10088d.mo11399h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: z */
    public final boolean mo11420z() {
        this.f10097m.lock();
        try {
            return this.f10098n == 2;
        } finally {
            this.f10097m.unlock();
        }
    }
}
