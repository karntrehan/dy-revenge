package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3629e;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3686l0;
import com.google.android.gms.common.internal.C3689m0;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.util.C3757d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p360g.C8921a;
import p174e.p319f.p320a.p335c.p360g.C8939g;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
public final class C3588u0 extends C3486f implements C3564o1 {

    /* renamed from: b */
    private final Lock f10108b;

    /* renamed from: c */
    private final C3689m0 f10109c;

    /* renamed from: d */
    private C3572q1 f10110d = null;

    /* renamed from: e */
    private final int f10111e;

    /* renamed from: f */
    private final Context f10112f;

    /* renamed from: g */
    private final Looper f10113g;

    /* renamed from: h */
    final Queue<C3511d<?, ?>> f10114h = new LinkedList();

    /* renamed from: i */
    private volatile boolean f10115i;

    /* renamed from: j */
    private long f10116j;

    /* renamed from: k */
    private long f10117k;

    /* renamed from: l */
    private final C3580s0 f10118l;

    /* renamed from: m */
    private final C3629e f10119m;

    /* renamed from: n */
    C3560n1 f10120n;

    /* renamed from: o */
    final Map<C3469a.C3472c<?>, C3469a.C3478f> f10121o;

    /* renamed from: p */
    Set<Scope> f10122p;

    /* renamed from: q */
    final C3659d f10123q;

    /* renamed from: r */
    final Map<C3469a<?>, Boolean> f10124r;

    /* renamed from: s */
    final C3469a.C3470a<? extends C8939g, C8921a> f10125s;

    /* renamed from: t */
    private final C3542j f10126t;

    /* renamed from: u */
    private final ArrayList<C3610z2> f10127u;

    /* renamed from: v */
    private Integer f10128v;

    /* renamed from: w */
    Set<C3540i2> f10129w;

    /* renamed from: x */
    final C3549k2 f10130x;

    /* renamed from: y */
    private final C3686l0 f10131y;

    public C3588u0(Context context, Lock lock, Looper looper, C3659d dVar, C3629e eVar, C3469a.C3470a<? extends C8939g, C8921a> aVar, Map<C3469a<?>, Boolean> map, List<C3486f.C3488b> list, List<C3486f.C3489c> list2, Map<C3469a.C3472c<?>, C3469a.C3478f> map2, int i, int i2, ArrayList<C3610z2> arrayList) {
        Looper looper2 = looper;
        int i3 = i;
        this.f10116j = true != C3757d.m14504a() ? 120000 : 10000;
        this.f10117k = 5000;
        this.f10122p = new HashSet();
        this.f10126t = new C3542j();
        this.f10128v = null;
        this.f10129w = null;
        C3576r0 r0Var = new C3576r0(this);
        this.f10131y = r0Var;
        this.f10112f = context;
        this.f10108b = lock;
        this.f10109c = new C3689m0(looper, r0Var);
        this.f10113g = looper2;
        this.f10118l = new C3580s0(this, looper);
        this.f10119m = eVar;
        this.f10111e = i3;
        if (i3 >= 0) {
            this.f10128v = Integer.valueOf(i2);
        }
        this.f10124r = map;
        this.f10121o = map2;
        this.f10127u = arrayList;
        this.f10130x = new C3549k2();
        for (C3486f.C3488b f : list) {
            this.f10109c.mo11630f(f);
        }
        for (C3486f.C3489c g : list2) {
            this.f10109c.mo11631g(g);
        }
        this.f10123q = dVar;
        this.f10125s = aVar;
    }

    /* renamed from: s */
    public static int m13958s(Iterable<C3469a.C3478f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C3469a.C3478f next : iterable) {
            z2 |= next.mo11199t();
            z3 |= next.mo11135b();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: u */
    static String m13959u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: v */
    static /* bridge */ /* synthetic */ void m13960v(C3588u0 u0Var) {
        u0Var.f10108b.lock();
        try {
            if (u0Var.f10115i) {
                u0Var.m13963z();
            }
        } finally {
            u0Var.f10108b.unlock();
        }
    }

    /* renamed from: w */
    static /* bridge */ /* synthetic */ void m13961w(C3588u0 u0Var) {
        u0Var.f10108b.lock();
        try {
            if (u0Var.mo11423x()) {
                u0Var.m13963z();
            }
        } finally {
            u0Var.f10108b.unlock();
        }
    }

    /* JADX WARNING: type inference failed for: r13v11, types: [com.google.android.gms.common.api.internal.t] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13962y(int r13) {
        /*
            r12 = this;
            java.lang.Integer r0 = r12.f10128v
            if (r0 != 0) goto L_0x000b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.f10128v = r13
            goto L_0x0011
        L_0x000b:
            int r0 = r0.intValue()
            if (r0 != r13) goto L_0x0091
        L_0x0011:
            com.google.android.gms.common.api.internal.q1 r13 = r12.f10110d
            if (r13 == 0) goto L_0x0016
            return
        L_0x0016:
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r13 = r12.f10121o
            java.util.Collection r13 = r13.values()
            java.util.Iterator r13 = r13.iterator()
            r0 = 0
            r1 = 0
        L_0x0022:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r13.next()
            com.google.android.gms.common.api.a$f r2 = (com.google.android.gms.common.api.C3469a.C3478f) r2
            boolean r3 = r2.mo11199t()
            r0 = r0 | r3
            boolean r2 = r2.mo11135b()
            r1 = r1 | r2
            goto L_0x0022
        L_0x0039:
            java.lang.Integer r13 = r12.f10128v
            int r13 = r13.intValue()
            r2 = 1
            if (r13 == r2) goto L_0x0062
            r1 = 2
            if (r13 == r1) goto L_0x0046
            goto L_0x0066
        L_0x0046:
            if (r0 == 0) goto L_0x0066
            android.content.Context r2 = r12.f10112f
            java.util.concurrent.locks.Lock r4 = r12.f10108b
            android.os.Looper r5 = r12.f10113g
            com.google.android.gms.common.e r6 = r12.f10119m
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r7 = r12.f10121o
            com.google.android.gms.common.internal.d r8 = r12.f10123q
            java.util.Map<com.google.android.gms.common.api.a<?>, java.lang.Boolean> r9 = r12.f10124r
            com.google.android.gms.common.api.a$a<? extends e.f.a.c.g.g, e.f.a.c.g.a> r10 = r12.f10125s
            java.util.ArrayList<com.google.android.gms.common.api.internal.z2> r11 = r12.f10127u
            r3 = r12
            com.google.android.gms.common.api.internal.t r13 = com.google.android.gms.common.api.internal.C3583t.m13935o(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x005f:
            r12.f10110d = r13
            return
        L_0x0062:
            if (r0 == 0) goto L_0x0089
            if (r1 != 0) goto L_0x0081
        L_0x0066:
            com.google.android.gms.common.api.internal.y0 r13 = new com.google.android.gms.common.api.internal.y0
            android.content.Context r1 = r12.f10112f
            java.util.concurrent.locks.Lock r3 = r12.f10108b
            android.os.Looper r4 = r12.f10113g
            com.google.android.gms.common.e r5 = r12.f10119m
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r6 = r12.f10121o
            com.google.android.gms.common.internal.d r7 = r12.f10123q
            java.util.Map<com.google.android.gms.common.api.a<?>, java.lang.Boolean> r8 = r12.f10124r
            com.google.android.gms.common.api.a$a<? extends e.f.a.c.g.g, e.f.a.c.g.a> r9 = r12.f10125s
            java.util.ArrayList<com.google.android.gms.common.api.internal.z2> r10 = r12.f10127u
            r0 = r13
            r2 = r12
            r11 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x005f
        L_0x0081:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            r13.<init>(r0)
            throw r13
        L_0x0089:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r13.<init>(r0)
            throw r13
        L_0x0091:
            java.lang.String r13 = m13959u(r13)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Integer r1 = r12.f10128v
            int r1 = r1.intValue()
            java.lang.String r1 = m13959u(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r13.length()
            int r3 = r3 + 51
            int r4 = r1.length()
            int r3 = r3 + r4
            r2.<init>(r3)
            java.lang.String r3 = "Cannot use sign-in mode: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = ". Mode was already set to "
            r2.append(r13)
            r2.append(r1)
            java.lang.String r13 = r2.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3588u0.m13962y(int):void");
    }

    /* renamed from: z */
    private final void m13963z() {
        this.f10109c.mo11626b();
        ((C3572q1) C3705r.m14346k(this.f10110d)).mo11392a();
    }

    /* renamed from: a */
    public final void mo11305a(Bundle bundle) {
        while (!this.f10114h.isEmpty()) {
            mo11219g(this.f10114h.remove());
        }
        this.f10109c.mo11628d(bundle);
    }

    /* renamed from: b */
    public final void mo11306b(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f10115i) {
                this.f10115i = true;
                if (this.f10120n == null && !C3757d.m14504a()) {
                    try {
                        this.f10120n = this.f10119m.mo11495w(this.f10112f.getApplicationContext(), new C3584t0(this));
                    } catch (SecurityException unused) {
                    }
                }
                C3580s0 s0Var = this.f10118l;
                s0Var.sendMessageDelayed(s0Var.obtainMessage(1), this.f10116j);
                C3580s0 s0Var2 = this.f10118l;
                s0Var2.sendMessageDelayed(s0Var2.obtainMessage(2), this.f10117k);
            }
            i = 1;
        }
        for (BasePendingResult e : (BasePendingResult[]) this.f10130x.f10023b.toArray(new BasePendingResult[0])) {
            e.mo11239e(C3549k2.f10022a);
        }
        this.f10109c.mo11629e(i);
        this.f10109c.mo11625a();
        if (i == 2) {
            m13963z();
        }
    }

    /* renamed from: c */
    public final void mo11307c(C3623b bVar) {
        if (!this.f10119m.mo11507k(this.f10112f, bVar.mo11462o())) {
            mo11423x();
        }
        if (!this.f10115i) {
            this.f10109c.mo11627c(bVar);
            this.f10109c.mo11625a();
        }
    }

    /* renamed from: d */
    public final void mo11216d() {
        this.f10108b.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f10111e >= 0) {
                C3705r.m14350o(this.f10128v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f10128v;
                if (num == null) {
                    this.f10128v = Integer.valueOf(m13958s(this.f10121o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) C3705r.m14346k(this.f10128v)).intValue();
            this.f10108b.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Illegal sign-in mode: ");
                sb.append(i);
                C3705r.m14337b(z, sb.toString());
                m13962y(i);
                m13963z();
            }
            z = true;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i);
            C3705r.m14337b(z, sb2.toString());
            m13962y(i);
            m13963z();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f10108b.unlock();
        }
    }

    /* renamed from: e */
    public final void mo11217e() {
        this.f10108b.lock();
        try {
            this.f10130x.mo11382b();
            C3572q1 q1Var = this.f10110d;
            if (q1Var != null) {
                q1Var.mo11397f();
            }
            this.f10126t.mo11374a();
            for (C3511d dVar : this.f10114h) {
                dVar.mo11245o((C3545j2) null);
                dVar.mo11238c();
            }
            this.f10114h.clear();
            if (this.f10110d != null) {
                mo11423x();
                this.f10109c.mo11625a();
            }
        } finally {
            this.f10108b.unlock();
        }
    }

    /* renamed from: f */
    public final void mo11218f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f10112f);
        printWriter.append(str).append("mResuming=").print(this.f10115i);
        printWriter.append(" mWorkQueue.size()=").print(this.f10114h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f10130x.f10023b.size());
        C3572q1 q1Var = this.f10110d;
        if (q1Var != null) {
            q1Var.mo11399h(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: g */
    public final <A extends C3469a.C3471b, T extends C3511d<? extends C3612k, A>> T mo11219g(T t) {
        C3469a<?> q = t.mo11297q();
        boolean containsKey = this.f10121o.containsKey(t.mo11298r());
        String d = q != null ? q.mo11179d() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        C3705r.m14337b(containsKey, sb.toString());
        this.f10108b.lock();
        try {
            C3572q1 q1Var = this.f10110d;
            if (q1Var != null) {
                if (this.f10115i) {
                    this.f10114h.add(t);
                    while (!this.f10114h.isEmpty()) {
                        C3511d remove = this.f10114h.remove();
                        this.f10130x.mo11381a(remove);
                        remove.mo11301v(Status.f9821p);
                    }
                } else {
                    t = q1Var.mo11394c(t);
                }
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f10108b.unlock();
        }
    }

    /* renamed from: i */
    public final <C extends C3469a.C3478f> C mo11220i(C3469a.C3472c<C> cVar) {
        C c = (C3469a.C3478f) this.f10121o.get(cVar);
        C3705r.m14347l(c, "Appropriate Api was not requested.");
        return c;
    }

    /* renamed from: j */
    public final Context mo11221j() {
        return this.f10112f;
    }

    /* renamed from: k */
    public final Looper mo11222k() {
        return this.f10113g;
    }

    /* renamed from: l */
    public final boolean mo11223l(C3562o oVar) {
        C3572q1 q1Var = this.f10110d;
        return q1Var != null && q1Var.mo11398g(oVar);
    }

    /* renamed from: m */
    public final void mo11224m() {
        C3572q1 q1Var = this.f10110d;
        if (q1Var != null) {
            q1Var.mo11396e();
        }
    }

    /* renamed from: n */
    public final void mo11225n(C3486f.C3489c cVar) {
        this.f10109c.mo11631g(cVar);
    }

    /* renamed from: o */
    public final void mo11226o(C3486f.C3489c cVar) {
        this.f10109c.mo11632h(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r3 == false) goto L_0x0040;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11227p(com.google.android.gms.common.api.internal.C3540i2 r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f10108b
            r0.lock()
            java.util.Set<com.google.android.gms.common.api.internal.i2> r0 = r2.f10129w     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L_0x0016
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
        L_0x0012:
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0054 }
            goto L_0x0047
        L_0x0016:
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0024
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            goto L_0x0012
        L_0x0024:
            java.util.concurrent.locks.Lock r3 = r2.f10108b     // Catch:{ all -> 0x0054 }
            r3.lock()     // Catch:{ all -> 0x0054 }
            java.util.Set<com.google.android.gms.common.api.internal.i2> r3 = r2.f10129w     // Catch:{ all -> 0x004d }
            if (r3 != 0) goto L_0x0033
            java.util.concurrent.locks.Lock r3 = r2.f10108b     // Catch:{ all -> 0x0054 }
            r3.unlock()     // Catch:{ all -> 0x0054 }
            goto L_0x0040
        L_0x0033:
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x004d }
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f10108b     // Catch:{ all -> 0x0054 }
            r0.unlock()     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0047
        L_0x0040:
            com.google.android.gms.common.api.internal.q1 r3 = r2.f10110d     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0047
            r3.mo11395d()     // Catch:{ all -> 0x0054 }
        L_0x0047:
            java.util.concurrent.locks.Lock r3 = r2.f10108b
            r3.unlock()
            return
        L_0x004d:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f10108b     // Catch:{ all -> 0x0054 }
            r0.unlock()     // Catch:{ all -> 0x0054 }
            throw r3     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f10108b
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3588u0.mo11227p(com.google.android.gms.common.api.internal.i2):void");
    }

    /* renamed from: r */
    public final boolean mo11421r() {
        C3572q1 q1Var = this.f10110d;
        return q1Var != null && q1Var.mo11393b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final String mo11422t() {
        StringWriter stringWriter = new StringWriter();
        mo11218f(HttpUrl.FRAGMENT_ENCODE_SET, (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo11423x() {
        if (!this.f10115i) {
            return false;
        }
        this.f10115i = false;
        this.f10118l.removeMessages(2);
        this.f10118l.removeMessages(1);
        C3560n1 n1Var = this.f10120n;
        if (n1Var != null) {
            n1Var.mo11389b();
            this.f10120n = null;
        }
        return true;
    }
}
