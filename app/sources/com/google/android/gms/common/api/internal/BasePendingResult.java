package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.C3490g;
import com.google.android.gms.common.api.C3493i;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.C3613l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3682k;
import com.google.android.gms.common.internal.C3705r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p174e.p319f.p320a.p335c.p345f.p350e.C6686j;

@KeepName
public abstract class BasePendingResult<R extends C3612k> extends C3490g<R> {

    /* renamed from: a */
    static final ThreadLocal<Boolean> f9871a = new C3598w2();

    /* renamed from: b */
    public static final /* synthetic */ int f9872b = 0;

    /* renamed from: c */
    private final Object f9873c;

    /* renamed from: d */
    protected final C3494a<R> f9874d;

    /* renamed from: e */
    protected final WeakReference<C3486f> f9875e;

    /* renamed from: f */
    private final CountDownLatch f9876f;

    /* renamed from: g */
    private final ArrayList<C3490g.C3491a> f9877g;

    /* renamed from: h */
    private C3613l<? super R> f9878h;

    /* renamed from: i */
    private final AtomicReference<C3545j2> f9879i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public R f9880j;

    /* renamed from: k */
    private Status f9881k;

    /* renamed from: l */
    private volatile boolean f9882l;

    /* renamed from: m */
    private boolean f9883m;
    @KeepName
    private C3606y2 mResultGuardian;

    /* renamed from: n */
    private boolean f9884n;

    /* renamed from: o */
    private C3682k f9885o;

    /* renamed from: p */
    private volatile C3540i2<R> f9886p;

    /* renamed from: q */
    private boolean f9887q;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C3494a<R extends C3612k> extends C6686j {
        public C3494a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo11246a(C3613l<? super R> lVar, R r) {
            int i = BasePendingResult.f9872b;
            sendMessage(obtainMessage(1, new Pair((C3613l) C3705r.m14346k(lVar), r)));
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C3613l lVar = (C3613l) pair.first;
                C3612k kVar = (C3612k) pair.second;
                try {
                    lVar.mo11371a(kVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m13580m(kVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo11239e(Status.f9822q);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f9873c = new Object();
        this.f9876f = new CountDownLatch(1);
        this.f9877g = new ArrayList<>();
        this.f9879i = new AtomicReference<>();
        this.f9887q = false;
        this.f9874d = new C3494a<>(Looper.getMainLooper());
        this.f9875e = new WeakReference<>((Object) null);
    }

    protected BasePendingResult(C3486f fVar) {
        this.f9873c = new Object();
        this.f9876f = new CountDownLatch(1);
        this.f9877g = new ArrayList<>();
        this.f9879i = new AtomicReference<>();
        this.f9887q = false;
        this.f9874d = new C3494a<>(fVar != null ? fVar.mo11222k() : Looper.getMainLooper());
        this.f9875e = new WeakReference<>(fVar);
    }

    /* renamed from: i */
    private final R m13577i() {
        R r;
        synchronized (this.f9873c) {
            C3705r.m14350o(!this.f9882l, "Result has already been consumed.");
            C3705r.m14350o(mo11241g(), "Result is not ready.");
            r = this.f9880j;
            this.f9880j = null;
            this.f9878h = null;
            this.f9882l = true;
        }
        C3545j2 andSet = this.f9879i.getAndSet((Object) null);
        if (andSet != null) {
            andSet.f10002a.f10023b.remove(this);
        }
        return (C3612k) C3705r.m14346k(r);
    }

    /* renamed from: j */
    private final void m13578j(R r) {
        this.f9880j = r;
        this.f9881k = r.mo11102k();
        this.f9885o = null;
        this.f9876f.countDown();
        if (this.f9883m) {
            this.f9878h = null;
        } else {
            C3613l<? super R> lVar = this.f9878h;
            if (lVar != null) {
                this.f9874d.removeMessages(2);
                this.f9874d.mo11246a(lVar, m13577i());
            } else if (this.f9880j instanceof C3493i) {
                this.mResultGuardian = new C3606y2(this, (C3602x2) null);
            }
        }
        ArrayList<C3490g.C3491a> arrayList = this.f9877g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo11236a(this.f9881k);
        }
        this.f9877g.clear();
    }

    /* renamed from: m */
    public static void m13580m(C3612k kVar) {
        if (kVar instanceof C3493i) {
            try {
                ((C3493i) kVar).mo11237a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(kVar);
                valueOf.length();
                Log.w("BasePendingResult", "Unable to release ".concat(valueOf), e);
            }
        }
    }

    /* renamed from: a */
    public final void mo11234a(C3490g.C3491a aVar) {
        C3705r.m14337b(aVar != null, "Callback cannot be null.");
        synchronized (this.f9873c) {
            if (mo11241g()) {
                aVar.mo11236a(this.f9881k);
            } else {
                this.f9877g.add(aVar);
            }
        }
    }

    /* renamed from: b */
    public final R mo11235b(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C3705r.m14345j("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C3705r.m14350o(!this.f9882l, "Result has already been consumed.");
        if (this.f9886p != null) {
            z = false;
        }
        C3705r.m14350o(z, "Cannot await if then() has been called.");
        try {
            if (!this.f9876f.await(j, timeUnit)) {
                mo11239e(Status.f9822q);
            }
        } catch (InterruptedException unused) {
            mo11239e(Status.f9820o);
        }
        C3705r.m14350o(mo11241g(), "Result is not ready.");
        return m13577i();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11238c() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f9873c
            monitor-enter(r0)
            boolean r1 = r2.f9883m     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.f9882l     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            com.google.android.gms.common.internal.k r1 = r2.f9885o     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            R r1 = r2.f9880j     // Catch:{ all -> 0x0028 }
            m13580m(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.f9883m = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f9823r     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.k r1 = r2.mo11140d(r1)     // Catch:{ all -> 0x0028 }
            r2.m13578j(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo11238c():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract R mo11140d(Status status);

    @Deprecated
    /* renamed from: e */
    public final void mo11239e(Status status) {
        synchronized (this.f9873c) {
            if (!mo11241g()) {
                mo11242h(mo11140d(status));
                this.f9884n = true;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo11240f() {
        boolean z;
        synchronized (this.f9873c) {
            z = this.f9883m;
        }
        return z;
    }

    /* renamed from: g */
    public final boolean mo11241g() {
        return this.f9876f.getCount() == 0;
    }

    /* renamed from: h */
    public final void mo11242h(R r) {
        synchronized (this.f9873c) {
            if (this.f9884n || this.f9883m) {
                m13580m(r);
                return;
            }
            mo11241g();
            C3705r.m14350o(!mo11241g(), "Results have already been set");
            C3705r.m14350o(!this.f9882l, "Result has already been consumed");
            m13578j(r);
        }
    }

    /* renamed from: l */
    public final void mo11243l() {
        boolean z = true;
        if (!this.f9887q && !f9871a.get().booleanValue()) {
            z = false;
        }
        this.f9887q = z;
    }

    /* renamed from: n */
    public final boolean mo11244n() {
        boolean f;
        synchronized (this.f9873c) {
            if (((C3486f) this.f9875e.get()) == null || !this.f9887q) {
                mo11238c();
            }
            f = mo11240f();
        }
        return f;
    }

    /* renamed from: o */
    public final void mo11245o(C3545j2 j2Var) {
        this.f9879i.set(j2Var);
    }
}
