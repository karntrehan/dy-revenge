package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.C3631f;
import com.google.android.gms.common.api.C3482d;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.c */
public abstract class C3651c<T extends IInterface> {

    /* renamed from: a */
    public static final String[] f10227a = {"service_esmobile", "service_googleme"};

    /* renamed from: b */
    private static final C3627d[] f10228b = new C3627d[0];

    /* renamed from: A */
    private volatile String f10229A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C3623b f10230B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f10231C;

    /* renamed from: D */
    private volatile C3690m1 f10232D;

    /* renamed from: E */
    protected AtomicInteger f10233E;

    /* renamed from: c */
    private int f10234c;

    /* renamed from: d */
    private long f10235d;

    /* renamed from: e */
    private long f10236e;

    /* renamed from: f */
    private int f10237f;

    /* renamed from: g */
    private long f10238g;

    /* renamed from: h */
    private volatile String f10239h;

    /* renamed from: i */
    C3725x1 f10240i;

    /* renamed from: j */
    private final Context f10241j;

    /* renamed from: k */
    private final Looper f10242k;

    /* renamed from: l */
    private final C3672h f10243l;

    /* renamed from: m */
    private final C3631f f10244m;

    /* renamed from: n */
    final Handler f10245n;

    /* renamed from: o */
    private final Object f10246o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Object f10247p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C3688m f10248q;

    /* renamed from: r */
    protected C3654c f10249r;

    /* renamed from: s */
    private T f10250s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final ArrayList<C3674h1<?>> f10251t;

    /* renamed from: u */
    private C3681j1 f10252u;

    /* renamed from: v */
    private int f10253v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C3652a f10254w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C3653b f10255x;

    /* renamed from: y */
    private final int f10256y;

    /* renamed from: z */
    private final String f10257z;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface C3652a {
        /* renamed from: j */
        void mo11565j(int i);

        /* renamed from: m */
        void mo11566m(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface C3653b {
        /* renamed from: k */
        void mo11567k(C3623b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    public interface C3654c {
        /* renamed from: a */
        void mo11308a(C3623b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    protected class C3655d implements C3654c {
        public C3655d() {
        }

        /* renamed from: a */
        public final void mo11308a(C3623b bVar) {
            if (bVar.mo11458E()) {
                C3651c cVar = C3651c.this;
                cVar.mo11548d((C3678j) null, cVar.mo11532H());
            } else if (C3651c.this.f10255x != null) {
                C3651c.this.f10255x.mo11567k(bVar);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface C3656e {
        /* renamed from: a */
        void mo11323a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C3651c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C3651c.C3652a r13, com.google.android.gms.common.internal.C3651c.C3653b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.h r3 = com.google.android.gms.common.internal.C3672h.m14272b(r10)
            com.google.android.gms.common.f r4 = com.google.android.gms.common.C3631f.m14110h()
            com.google.android.gms.common.internal.C3705r.m14346k(r13)
            com.google.android.gms.common.internal.C3705r.m14346k(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3651c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    protected C3651c(Context context, Looper looper, C3672h hVar, C3631f fVar, int i, C3652a aVar, C3653b bVar, String str) {
        this.f10239h = null;
        this.f10246o = new Object();
        this.f10247p = new Object();
        this.f10251t = new ArrayList<>();
        this.f10253v = 1;
        this.f10230B = null;
        this.f10231C = false;
        this.f10232D = null;
        this.f10233E = new AtomicInteger(0);
        C3705r.m14347l(context, "Context must not be null");
        this.f10241j = context;
        C3705r.m14347l(looper, "Looper must not be null");
        this.f10242k = looper;
        C3705r.m14347l(hVar, "Supervisor must not be null");
        this.f10243l = hVar;
        C3705r.m14347l(fVar, "API availability must not be null");
        this.f10244m = fVar;
        this.f10245n = new C3671g1(this, looper);
        this.f10256y = i;
        this.f10254w = aVar;
        this.f10255x = bVar;
        this.f10257z = str;
    }

    /* renamed from: h0 */
    static /* bridge */ /* synthetic */ void m14164h0(C3651c cVar, C3690m1 m1Var) {
        cVar.f10232D = m1Var;
        if (cVar.mo11545X()) {
            C3663e eVar = m1Var.f10341q;
            C3708s.m14363b().mo11670c(eVar == null ? null : eVar.mo11587G());
        }
    }

    /* renamed from: i0 */
    static /* bridge */ /* synthetic */ void m14165i0(C3651c cVar, int i) {
        int i2;
        int i3;
        synchronized (cVar.f10246o) {
            i2 = cVar.f10253v;
        }
        if (i2 == 3) {
            cVar.f10231C = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = cVar.f10245n;
        handler.sendMessage(handler.obtainMessage(i3, cVar.f10233E.get(), 16));
    }

    /* renamed from: l0 */
    static /* bridge */ /* synthetic */ boolean m14167l0(C3651c cVar, int i, int i2, IInterface iInterface) {
        synchronized (cVar.f10246o) {
            if (cVar.f10253v != i) {
                return false;
            }
            cVar.m14169n0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: m0 */
    static /* bridge */ /* synthetic */ boolean m14168m0(C3651c cVar) {
        if (cVar.f10231C || TextUtils.isEmpty(cVar.mo11133J()) || TextUtils.isEmpty(cVar.mo11531G())) {
            return false;
        }
        try {
            Class.forName(cVar.mo11133J());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public final void m14169n0(int i, T t) {
        C3725x1 x1Var;
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        C3705r.m14336a(z);
        synchronized (this.f10246o) {
            this.f10253v = i;
            this.f10250s = t;
            if (i == 1) {
                C3681j1 j1Var = this.f10252u;
                if (j1Var != null) {
                    C3672h hVar = this.f10243l;
                    String c = this.f10240i.mo11696c();
                    C3705r.m14346k(c);
                    hVar.mo11601e(c, this.f10240i.mo11695b(), this.f10240i.mo11694a(), j1Var, mo11547c0(), this.f10240i.mo11697d());
                    this.f10252u = null;
                }
            } else if (i == 2 || i == 3) {
                C3681j1 j1Var2 = this.f10252u;
                if (!(j1Var2 == null || (x1Var = this.f10240i) == null)) {
                    String c2 = x1Var.mo11696c();
                    String b = x1Var.mo11695b();
                    StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(b).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(c2);
                    sb.append(" on ");
                    sb.append(b);
                    Log.e("GmsClient", sb.toString());
                    C3672h hVar2 = this.f10243l;
                    String c3 = this.f10240i.mo11696c();
                    C3705r.m14346k(c3);
                    hVar2.mo11601e(c3, this.f10240i.mo11695b(), this.f10240i.mo11694a(), j1Var2, mo11547c0(), this.f10240i.mo11697d());
                    this.f10233E.incrementAndGet();
                }
                C3681j1 j1Var3 = new C3681j1(this, this.f10233E.get());
                this.f10252u = j1Var3;
                C3725x1 x1Var2 = (this.f10253v != 3 || mo11531G() == null) ? new C3725x1(mo11534L(), mo11134K(), false, C3672h.m14271a(), mo11518N()) : new C3725x1(mo11529D().getPackageName(), mo11531G(), true, C3672h.m14271a(), false);
                this.f10240i = x1Var2;
                if (!x1Var2.mo11697d() || mo11136n() >= 17895000) {
                    C3672h hVar3 = this.f10243l;
                    String c4 = this.f10240i.mo11696c();
                    C3705r.m14346k(c4);
                    if (!hVar3.mo11602f(new C3704q1(c4, this.f10240i.mo11695b(), this.f10240i.mo11694a(), this.f10240i.mo11697d()), j1Var3, mo11547c0(), mo11527B())) {
                        String c5 = this.f10240i.mo11696c();
                        String b2 = this.f10240i.mo11695b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c5).length() + 34 + String.valueOf(b2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c5);
                        sb2.append(" on ");
                        sb2.append(b2);
                        Log.w("GmsClient", sb2.toString());
                        mo11555j0(16, (Bundle) null, this.f10233E.get());
                    }
                } else {
                    String valueOf = String.valueOf(this.f10240i.mo11696c());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
            } else if (i == 4) {
                C3705r.m14346k(t);
                mo11537P(t);
            }
        }
    }

    /* renamed from: A */
    public C3627d[] mo11516A() {
        return f10228b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public Executor mo11527B() {
        return null;
    }

    /* renamed from: C */
    public Bundle mo11528C() {
        return null;
    }

    /* renamed from: D */
    public final Context mo11529D() {
        return this.f10241j;
    }

    /* renamed from: E */
    public int mo11530E() {
        return this.f10256y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public Bundle mo11517F() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public String mo11531G() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public Set<Scope> mo11532H() {
        return Collections.emptySet();
    }

    /* renamed from: I */
    public final T mo11533I() {
        T t;
        synchronized (this.f10246o) {
            if (this.f10253v != 5) {
                mo11562w();
                t = this.f10250s;
                C3705r.m14347l(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract String mo11133J();

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract String mo11134K();

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public String mo11534L() {
        return "com.google.android.gms";
    }

    /* renamed from: M */
    public C3663e mo11535M() {
        C3690m1 m1Var = this.f10232D;
        if (m1Var == null) {
            return null;
        }
        return m1Var.f10341q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public boolean mo11518N() {
        return mo11136n() >= 211700000;
    }

    /* renamed from: O */
    public boolean mo11536O() {
        return this.f10232D != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo11537P(T t) {
        this.f10236e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo11538Q(C3623b bVar) {
        this.f10237f = bVar.mo11462o();
        this.f10238g = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo11539R(int i) {
        this.f10234c = i;
        this.f10235d = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo11540S(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f10245n;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C3684k1(this, i, iBinder, bundle)));
    }

    /* renamed from: T */
    public boolean mo11541T() {
        return false;
    }

    /* renamed from: U */
    public void mo11542U(String str) {
        this.f10229A = str;
    }

    /* renamed from: V */
    public void mo11543V(int i) {
        Handler handler = this.f10245n;
        handler.sendMessage(handler.obtainMessage(6, this.f10233E.get(), i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo11544W(C3654c cVar, int i, PendingIntent pendingIntent) {
        C3705r.m14347l(cVar, "Connection progress callbacks cannot be null.");
        this.f10249r = cVar;
        Handler handler = this.f10245n;
        handler.sendMessage(handler.obtainMessage(3, this.f10233E.get(), i, pendingIntent));
    }

    /* renamed from: X */
    public boolean mo11545X() {
        return false;
    }

    /* renamed from: a */
    public boolean mo11546a() {
        boolean z;
        synchronized (this.f10246o) {
            z = this.f10253v == 4;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo11135b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public final String mo11547c0() {
        String str = this.f10257z;
        return str == null ? this.f10241j.getClass().getName() : str;
    }

    /* renamed from: d */
    public void mo11548d(C3678j jVar, Set<Scope> set) {
        Bundle F = mo11517F();
        C3666f fVar = new C3666f(this.f10256y, this.f10229A);
        fVar.f10289q = this.f10241j.getPackageName();
        fVar.f10292t = F;
        if (set != null) {
            fVar.f10291s = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo11560t()) {
            Account z = mo11564z();
            if (z == null) {
                z = new Account("<<default account>>", "com.google");
            }
            fVar.f10293u = z;
            if (jVar != null) {
                fVar.f10290r = jVar.asBinder();
            }
        } else if (mo11541T()) {
            fVar.f10293u = mo11564z();
        }
        fVar.f10294v = f10228b;
        fVar.f10295w = mo11516A();
        if (mo11545X()) {
            fVar.f10298z = true;
        }
        try {
            synchronized (this.f10247p) {
                C3688m mVar = this.f10248q;
                if (mVar != null) {
                    mVar.mo11624E(new C3677i1(this, this.f10233E.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo11543V(3);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo11540S(8, (IBinder) null, (Bundle) null, this.f10233E.get());
        }
    }

    /* renamed from: e */
    public void mo11549e(String str) {
        this.f10239h = str;
        mo11553i();
    }

    /* renamed from: f */
    public boolean mo11550f() {
        boolean z;
        synchronized (this.f10246o) {
            int i = this.f10253v;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: g */
    public String mo11551g() {
        C3725x1 x1Var;
        if (mo11546a() && (x1Var = this.f10240i) != null) {
            return x1Var.mo11695b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: h */
    public void mo11552h(C3654c cVar) {
        C3705r.m14347l(cVar, "Connection progress callbacks cannot be null.");
        this.f10249r = cVar;
        m14169n0(2, (IInterface) null);
    }

    /* renamed from: i */
    public void mo11553i() {
        this.f10233E.incrementAndGet();
        synchronized (this.f10251t) {
            int size = this.f10251t.size();
            for (int i = 0; i < size; i++) {
                this.f10251t.get(i).mo11606d();
            }
            this.f10251t.clear();
        }
        synchronized (this.f10247p) {
            this.f10248q = null;
        }
        m14169n0(1, (IInterface) null);
    }

    /* renamed from: j */
    public void mo11554j(C3656e eVar) {
        eVar.mo11323a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final void mo11555j0(int i, Bundle bundle, int i2) {
        Handler handler = this.f10245n;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C3687l1(this, i, (Bundle) null)));
    }

    /* renamed from: k */
    public void mo11556k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C3688m mVar;
        synchronized (this.f10246o) {
            i = this.f10253v;
            t = this.f10250s;
        }
        synchronized (this.f10247p) {
            mVar = this.f10248q;
        }
        printWriter.append(str).append("mConnectState=");
        printWriter.print(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo11133J()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (mVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(mVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f10236e > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f10236e;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f10235d > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f10234c;
            printWriter.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? String.valueOf(i2) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED");
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f10235d;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f10238g > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C3482d.m13534a(this.f10237f));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f10238g;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* renamed from: l */
    public boolean mo11557l() {
        return true;
    }

    /* renamed from: n */
    public int mo11136n() {
        return C3631f.f10208a;
    }

    /* renamed from: o */
    public final C3627d[] mo11558o() {
        C3690m1 m1Var = this.f10232D;
        if (m1Var == null) {
            return null;
        }
        return m1Var.f10339o;
    }

    /* renamed from: r */
    public String mo11559r() {
        return this.f10239h;
    }

    /* renamed from: s */
    public Intent mo11138s() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: t */
    public boolean mo11560t() {
        return false;
    }

    /* renamed from: v */
    public void mo11561v() {
        int j = this.f10244m.mo11485j(this.f10241j, mo11136n());
        if (j != 0) {
            m14169n0(1, (IInterface) null);
            mo11544W(new C3655d(), j, (PendingIntent) null);
            return;
        }
        mo11552h(new C3655d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo11562w() {
        if (!mo11546a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract T mo11139x(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo11563y() {
        return false;
    }

    /* renamed from: z */
    public Account mo11564z() {
        return null;
    }
}
