package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3629e;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3483e;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3672h;
import com.google.android.gms.common.internal.C3692n0;
import com.google.android.gms.common.internal.C3694o;
import com.google.android.gms.common.internal.C3708s;
import com.google.android.gms.common.internal.C3711t;
import com.google.android.gms.common.internal.C3717v;
import com.google.android.gms.common.internal.C3720w;
import com.google.android.gms.common.internal.C3723x;
import com.google.android.gms.common.util.C3762i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p027c.p060f.C1790b;
import p174e.p319f.p320a.p335c.p345f.p350e.C6686j;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.api.internal.f */
public class C3521f implements Handler.Callback {

    /* renamed from: a */
    public static final Status f9927a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Status f9928b = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f9929c = new Object();

    /* renamed from: d */
    private static C3521f f9930d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f9931e = 5000;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f9932f = 120000;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f9933g = 10000;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f9934h = false;

    /* renamed from: i */
    private C3717v f9935i;

    /* renamed from: j */
    private C3723x f9936j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Context f9937k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C3629e f9938l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C3692n0 f9939m;

    /* renamed from: n */
    private final AtomicInteger f9940n = new AtomicInteger(1);

    /* renamed from: o */
    private final AtomicInteger f9941o = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Map<C3500b<?>, C3528g1<?>> f9942p = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C3599x f9943q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Set<C3500b<?>> f9944r = new C1790b();

    /* renamed from: s */
    private final Set<C3500b<?>> f9945s = new C1790b();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Handler f9946t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public volatile boolean f9947u = true;

    private C3521f(Context context, Looper looper, C3629e eVar) {
        this.f9937k = context;
        C6686j jVar = new C6686j(looper, this);
        this.f9946t = jVar;
        this.f9938l = eVar;
        this.f9939m = new C3692n0(eVar);
        if (C3762i.m14514a(context)) {
            this.f9947u = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m13656a() {
        synchronized (f9929c) {
            C3521f fVar = f9930d;
            if (fVar != null) {
                fVar.f9941o.incrementAndGet();
                Handler handler = fVar.f9946t;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static Status m13658i(C3500b<?> bVar, C3623b bVar2) {
        String b = bVar.mo11262b();
        String valueOf = String.valueOf(bVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(bVar2, sb.toString());
    }

    /* renamed from: j */
    private final C3528g1<?> m13659j(C3483e<?> eVar) {
        C3500b<?> g = eVar.mo11207g();
        C3528g1<?> g1Var = this.f9942p.get(g);
        if (g1Var == null) {
            g1Var = new C3528g1<>(this, eVar);
            this.f9942p.put(g, g1Var);
        }
        if (g1Var.mo11340P()) {
            this.f9945s.add(g);
        }
        g1Var.mo11330E();
        return g1Var;
    }

    /* renamed from: k */
    private final C3723x m13660k() {
        if (this.f9936j == null) {
            this.f9936j = C3720w.m14386a(this.f9937k);
        }
        return this.f9936j;
    }

    /* renamed from: l */
    private final void m13661l() {
        C3717v vVar = this.f9935i;
        if (vVar != null) {
            if (vVar.mo11682o() > 0 || mo11318g()) {
                m13660k().mo11515a(vVar);
            }
            this.f9935i = null;
        }
    }

    /* renamed from: m */
    private final <T> void m13662m(C8965m<T> mVar, int i, C3483e eVar) {
        C3581s1 b;
        if (i != 0 && (b = C3581s1.m13923b(this, i, eVar.mo11207g())) != null) {
            C8963l<T> a = mVar.mo22782a();
            Handler handler = this.f9946t;
            handler.getClass();
            a.mo22767c(new C3497a1(handler), b);
        }
    }

    /* renamed from: y */
    public static C3521f m13672y(Context context) {
        C3521f fVar;
        synchronized (f9929c) {
            if (f9930d == null) {
                f9930d = new C3521f(context.getApplicationContext(), C3672h.m14273c().getLooper(), C3629e.m14086q());
            }
            fVar = f9930d;
        }
        return fVar;
    }

    /* renamed from: E */
    public final <O extends C3469a.C3473d> void mo11310E(C3483e<O> eVar, int i, C3511d<? extends C3612k, C3469a.C3471b> dVar) {
        C3553l2 l2Var = new C3553l2(i, dVar);
        Handler handler = this.f9946t;
        handler.sendMessage(handler.obtainMessage(4, new C3597w1(l2Var, this.f9941o.get(), eVar)));
    }

    /* renamed from: F */
    public final <O extends C3469a.C3473d, ResultT> void mo11311F(C3483e<O> eVar, int i, C3574r<C3469a.C3471b, ResultT> rVar, C8965m<ResultT> mVar, C3566p pVar) {
        m13662m(mVar, rVar.mo11405d(), eVar);
        C3557m2 m2Var = new C3557m2(i, rVar, mVar, pVar);
        Handler handler = this.f9946t;
        handler.sendMessage(handler.obtainMessage(4, new C3597w1(m2Var, this.f9941o.get(), eVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo11312G(C3694o oVar, int i, long j, int i2) {
        Handler handler = this.f9946t;
        handler.sendMessage(handler.obtainMessage(18, new C3585t1(oVar, i, j, i2)));
    }

    /* renamed from: H */
    public final void mo11313H(C3623b bVar, int i) {
        if (!mo11319h(bVar, i)) {
            Handler handler = this.f9946t;
            handler.sendMessage(handler.obtainMessage(5, i, 0, bVar));
        }
    }

    /* renamed from: b */
    public final void mo11314b() {
        Handler handler = this.f9946t;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void mo11315c(C3483e<?> eVar) {
        Handler handler = this.f9946t;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    /* renamed from: d */
    public final void mo11316d(C3599x xVar) {
        synchronized (f9929c) {
            if (this.f9943q != xVar) {
                this.f9943q = xVar;
                this.f9944r.clear();
            }
            this.f9944r.addAll(xVar.mo11436t());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo11317e(C3599x xVar) {
        synchronized (f9929c) {
            if (this.f9943q == xVar) {
                this.f9943q = null;
                this.f9944r.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo11318g() {
        if (this.f9934h) {
            return false;
        }
        C3711t a = C3708s.m14363b().mo11669a();
        if (a != null && !a.mo11675r()) {
            return false;
        }
        int a2 = this.f9939m.mo11636a(this.f9937k, 203400000);
        return a2 == -1 || a2 == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo11319h(C3623b bVar, int i) {
        return this.f9938l.mo11480B(this.f9937k, bVar, i);
    }

    public final boolean handleMessage(Message message) {
        C8965m<Boolean> mVar;
        Boolean bool;
        int i = message.what;
        long j = 300000;
        C3528g1 g1Var = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f9933g = j;
                this.f9946t.removeMessages(12);
                for (C3500b<?> obtainMessage : this.f9942p.keySet()) {
                    Handler handler = this.f9946t;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f9933g);
                }
                break;
            case 2:
                C3578r2 r2Var = (C3578r2) message.obj;
                Iterator<C3500b<?>> it = r2Var.mo11414a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C3500b next = it.next();
                        C3528g1 g1Var2 = this.f9942p.get(next);
                        if (g1Var2 == null) {
                            r2Var.mo11415b(next, new C3623b(13), (String) null);
                            break;
                        } else if (g1Var2.mo11339O()) {
                            r2Var.mo11415b(next, C3623b.f10185f, g1Var2.mo11345v().mo11191g());
                        } else {
                            C3623b t = g1Var2.mo11344t();
                            if (t != null) {
                                r2Var.mo11415b(next, t, (String) null);
                            } else {
                                g1Var2.mo11335J(r2Var);
                                g1Var2.mo11330E();
                            }
                        }
                    }
                }
            case 3:
                for (C3528g1 next2 : this.f9942p.values()) {
                    next2.mo11329D();
                    next2.mo11330E();
                }
                break;
            case 4:
            case 8:
            case 13:
                C3597w1 w1Var = (C3597w1) message.obj;
                C3528g1<?> g1Var3 = this.f9942p.get(w1Var.f10148c.mo11207g());
                if (g1Var3 == null) {
                    g1Var3 = m13659j(w1Var.f10148c);
                }
                if (g1Var3.mo11340P() && this.f9941o.get() != w1Var.f10147b) {
                    w1Var.f10146a.mo11353a(f9927a);
                    g1Var3.mo11337L();
                    break;
                } else {
                    g1Var3.mo11331F(w1Var.f10146a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                C3623b bVar = (C3623b) message.obj;
                Iterator<C3528g1<?>> it2 = this.f9942p.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C3528g1 next3 = it2.next();
                        if (next3.mo11342r() == i2) {
                            g1Var = next3;
                        }
                    }
                }
                if (g1Var != null) {
                    if (bVar.mo11462o() != 13) {
                        g1Var.m13702d(m13658i(g1Var.f9958c, bVar));
                        break;
                    } else {
                        String g = this.f9938l.mo11483g(bVar.mo11462o());
                        String p = bVar.mo11463p();
                        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 69 + String.valueOf(p).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(g);
                        sb.append(": ");
                        sb.append(p);
                        g1Var.m13702d(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f9937k.getApplicationContext() instanceof Application) {
                    C3505c.m13614c((Application) this.f9937k.getApplicationContext());
                    C3505c.m13613b().mo11269a(new C3502b1(this));
                    if (!C3505c.m13613b().mo11271e(true)) {
                        this.f9933g = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m13659j((C3483e) message.obj);
                break;
            case 9:
                if (this.f9942p.containsKey(message.obj)) {
                    this.f9942p.get(message.obj).mo11336K();
                    break;
                }
                break;
            case 10:
                for (C3500b<?> remove : this.f9945s) {
                    C3528g1 remove2 = this.f9942p.remove(remove);
                    if (remove2 != null) {
                        remove2.mo11337L();
                    }
                }
                this.f9945s.clear();
                break;
            case 11:
                if (this.f9942p.containsKey(message.obj)) {
                    this.f9942p.get(message.obj).mo11338M();
                    break;
                }
                break;
            case 12:
                if (this.f9942p.containsKey(message.obj)) {
                    this.f9942p.get(message.obj).mo11341a();
                    break;
                }
                break;
            case 14:
                C3603y yVar = (C3603y) message.obj;
                C3500b<?> a = yVar.mo11438a();
                if (!this.f9942p.containsKey(a)) {
                    mVar = yVar.mo11439b();
                    bool = Boolean.FALSE;
                } else {
                    boolean N = this.f9942p.get(a).m13712q(false);
                    mVar = yVar.mo11439b();
                    bool = Boolean.valueOf(N);
                }
                mVar.mo22784c(bool);
                break;
            case 15:
                C3539i1 i1Var = (C3539i1) message.obj;
                if (this.f9942p.containsKey(i1Var.f9985a)) {
                    C3528g1.m13697B(this.f9942p.get(i1Var.f9985a), i1Var);
                    break;
                }
                break;
            case 16:
                C3539i1 i1Var2 = (C3539i1) message.obj;
                if (this.f9942p.containsKey(i1Var2.f9985a)) {
                    C3528g1.m13698C(this.f9942p.get(i1Var2.f9985a), i1Var2);
                    break;
                }
                break;
            case 17:
                m13661l();
                break;
            case 18:
                C3585t1 t1Var = (C3585t1) message.obj;
                if (t1Var.f10102c != 0) {
                    C3717v vVar = this.f9935i;
                    if (vVar != null) {
                        List<C3694o> p2 = vVar.mo11683p();
                        if (vVar.mo11682o() != t1Var.f10101b || (p2 != null && p2.size() >= t1Var.f10103d)) {
                            this.f9946t.removeMessages(17);
                            m13661l();
                        } else {
                            this.f9935i.mo11684r(t1Var.f10100a);
                        }
                    }
                    if (this.f9935i == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(t1Var.f10100a);
                        this.f9935i = new C3717v(t1Var.f10101b, arrayList);
                        Handler handler2 = this.f9946t;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), t1Var.f10102c);
                        break;
                    }
                } else {
                    m13660k().mo11515a(new C3717v(t1Var.f10101b, Arrays.asList(new C3694o[]{t1Var.f10100a})));
                    break;
                }
                break;
            case 19:
                this.f9934h = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: n */
    public final int mo11321n() {
        return this.f9940n.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final C3528g1 mo11322x(C3500b<?> bVar) {
        return this.f9942p.get(bVar);
    }
}
