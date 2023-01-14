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
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3664e0;
import com.google.android.gms.common.internal.C3678j;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.C3718v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p174e.p319f.p320a.p335c.p360g.C8921a;
import p174e.p319f.p320a.p335c.p360g.C8939g;
import p174e.p319f.p320a.p335c.p360g.p361b.C8933l;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
public final class C3567p0 implements C3592v0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3604y0 f10036a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f10037b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f10038c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3631f f10039d;

    /* renamed from: e */
    private C3623b f10040e;

    /* renamed from: f */
    private int f10041f;

    /* renamed from: g */
    private int f10042g = 0;

    /* renamed from: h */
    private int f10043h;

    /* renamed from: i */
    private final Bundle f10044i = new Bundle();

    /* renamed from: j */
    private final Set<C3469a.C3472c> f10045j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C8939g f10046k;

    /* renamed from: l */
    private boolean f10047l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f10048m;

    /* renamed from: n */
    private boolean f10049n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3678j f10050o;

    /* renamed from: p */
    private boolean f10051p;

    /* renamed from: q */
    private boolean f10052q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C3659d f10053r;

    /* renamed from: s */
    private final Map<C3469a<?>, Boolean> f10054s;

    /* renamed from: t */
    private final C3469a.C3470a<? extends C8939g, C8921a> f10055t;

    /* renamed from: u */
    private final ArrayList<Future<?>> f10056u = new ArrayList<>();

    public C3567p0(C3604y0 y0Var, C3659d dVar, Map<C3469a<?>, Boolean> map, C3631f fVar, C3469a.C3470a<? extends C8939g, C8921a> aVar, Lock lock, Context context) {
        this.f10036a = y0Var;
        this.f10053r = dVar;
        this.f10054s = map;
        this.f10039d = fVar;
        this.f10055t = aVar;
        this.f10037b = lock;
        this.f10038c = context;
    }

    /* renamed from: A */
    static /* bridge */ /* synthetic */ void m13839A(C3567p0 p0Var, C8933l lVar) {
        if (p0Var.m13854n(0)) {
            C3623b o = lVar.mo22745o();
            if (o.mo11458E()) {
                C3718v0 v0Var = (C3718v0) C3705r.m14346k(lVar.mo22746p());
                C3623b o2 = v0Var.mo11688o();
                if (!o2.mo11458E()) {
                    String valueOf = String.valueOf(o2);
                    valueOf.length();
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    p0Var.m13851k(o2);
                    return;
                }
                p0Var.f10049n = true;
                p0Var.f10050o = (C3678j) C3705r.m14346k(v0Var.mo11689p());
                p0Var.f10051p = v0Var.mo11690r();
                p0Var.f10052q = v0Var.mo11686C();
                p0Var.m13853m();
            } else if (p0Var.m13856p(o)) {
                p0Var.m13848h();
                p0Var.m13853m();
            } else {
                p0Var.m13851k(o);
            }
        }
    }

    /* renamed from: I */
    private final void m13847I() {
        ArrayList<Future<?>> arrayList = this.f10056u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        this.f10056u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m13848h() {
        this.f10048m = false;
        this.f10036a.f10169n.f10122p = Collections.emptySet();
        for (C3469a.C3472c next : this.f10045j) {
            if (!this.f10036a.f10162g.containsKey(next)) {
                this.f10036a.f10162g.put(next, new C3623b(17, (PendingIntent) null));
            }
        }
    }

    /* renamed from: i */
    private final void m13849i(boolean z) {
        C8939g gVar = this.f10046k;
        if (gVar != null) {
            if (gVar.mo11186a() && z) {
                gVar.mo22731q();
            }
            gVar.mo11193i();
            C3659d dVar = (C3659d) C3705r.m14346k(this.f10053r);
            this.f10050o = null;
        }
    }

    /* renamed from: j */
    private final void m13850j() {
        this.f10036a.mo11440l();
        C3608z0.m14047a().execute(new C3512d0(this));
        C8939g gVar = this.f10046k;
        if (gVar != null) {
            if (this.f10051p) {
                gVar.mo22730p((C3678j) C3705r.m14346k(this.f10050o), this.f10052q);
            }
            m13849i(false);
        }
        for (C3469a.C3472c<?> cVar : this.f10036a.f10162g.keySet()) {
            ((C3469a.C3478f) C3705r.m14346k(this.f10036a.f10161f.get(cVar))).mo11193i();
        }
        this.f10036a.f10170o.mo11305a(this.f10044i.isEmpty() ? null : this.f10044i);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m13851k(C3623b bVar) {
        m13847I();
        m13849i(!bVar.mo11457C());
        this.f10036a.mo11442o(bVar);
        this.f10036a.f10170o.mo11307c(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m13852l(C3623b bVar, C3469a<?> aVar, boolean z) {
        int b = aVar.mo11178c().mo11185b();
        if ((!z || bVar.mo11457C() || this.f10039d.mo11505c(bVar.mo11462o()) != null) && (this.f10040e == null || b < this.f10041f)) {
            this.f10040e = bVar;
            this.f10041f = b;
        }
        this.f10036a.f10162g.put(aVar.mo11177b(), bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m13853m() {
        if (this.f10043h == 0) {
            if (!this.f10048m || this.f10049n) {
                ArrayList arrayList = new ArrayList();
                this.f10042g = 1;
                this.f10043h = this.f10036a.f10161f.size();
                for (C3469a.C3472c next : this.f10036a.f10161f.keySet()) {
                    if (!this.f10036a.f10162g.containsKey(next)) {
                        arrayList.add(this.f10036a.f10161f.get(next));
                    } else if (m13855o()) {
                        m13850j();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f10056u.add(C3608z0.m14047a().submit(new C3538i0(this, arrayList)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m13854n(int i) {
        if (this.f10042g == i) {
            return true;
        }
        Log.w("GACConnecting", this.f10036a.f10169n.mo11422t());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.f10043h;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i2);
        Log.w("GACConnecting", sb.toString());
        String q = m13857q(this.f10042g);
        String q2 = m13857q(i);
        StringBuilder sb2 = new StringBuilder(q.length() + 70 + q2.length());
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(q);
        sb2.append(" but received callback for step ");
        sb2.append(q2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        m13851k(new C3623b(8, (PendingIntent) null));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final boolean m13855o() {
        C3623b bVar;
        int i = this.f10043h - 1;
        this.f10043h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f10036a.f10169n.mo11422t());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            bVar = new C3623b(8, (PendingIntent) null);
        } else {
            bVar = this.f10040e;
            if (bVar == null) {
                return true;
            }
            this.f10036a.f10168m = this.f10041f;
        }
        m13851k(bVar);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m13856p(C3623b bVar) {
        return this.f10047l && !bVar.mo11457C();
    }

    /* renamed from: q */
    private static final String m13857q(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ Set m13864x(C3567p0 p0Var) {
        C3659d dVar = p0Var.f10053r;
        if (dVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(dVar.mo11574g());
        Map<C3469a<?>, C3664e0> k = p0Var.f10053r.mo11578k();
        for (C3469a next : k.keySet()) {
            if (!p0Var.f10036a.f10162g.containsKey(next.mo11177b())) {
                hashSet.addAll(k.get(next).f10284a);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo11282a(Bundle bundle) {
        if (m13854n(1)) {
            if (bundle != null) {
                this.f10044i.putAll(bundle);
            }
            if (m13855o()) {
                m13850j();
            }
        }
    }

    /* renamed from: b */
    public final void mo11283b() {
    }

    /* renamed from: c */
    public final void mo11284c(C3623b bVar, C3469a<?> aVar, boolean z) {
        if (m13854n(1)) {
            m13852l(bVar, aVar, z);
            if (m13855o()) {
                m13850j();
            }
        }
    }

    /* renamed from: d */
    public final void mo11285d(int i) {
        m13851k(new C3623b(8, (PendingIntent) null));
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.common.api.a$f, e.f.a.c.g.g] */
    /* renamed from: e */
    public final void mo11286e() {
        this.f10036a.f10162g.clear();
        this.f10048m = false;
        this.f10040e = null;
        this.f10042g = 0;
        this.f10047l = true;
        this.f10049n = false;
        this.f10051p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C3469a next : this.f10054s.keySet()) {
            C3469a.C3478f fVar = (C3469a.C3478f) C3705r.m14346k(this.f10036a.f10161f.get(next.mo11177b()));
            z |= next.mo11178c().mo11185b() == 1;
            boolean booleanValue = this.f10054s.get(next).booleanValue();
            if (fVar.mo11199t()) {
                this.f10048m = true;
                if (booleanValue) {
                    this.f10045j.add(next.mo11177b());
                } else {
                    this.f10047l = false;
                }
            }
            hashMap.put(fVar, new C3517e0(this, next, booleanValue));
        }
        if (z) {
            this.f10048m = false;
        }
        if (this.f10048m) {
            C3705r.m14346k(this.f10053r);
            C3705r.m14346k(this.f10055t);
            this.f10053r.mo11579l(Integer.valueOf(System.identityHashCode(this.f10036a.f10169n)));
            C3555m0 m0Var = new C3555m0(this, (C3551l0) null);
            C3469a.C3470a aVar = this.f10055t;
            Context context = this.f10038c;
            Looper k = this.f10036a.f10169n.mo11222k();
            C3659d dVar = this.f10053r;
            this.f10046k = aVar.mo11180c(context, k, dVar, dVar.mo11575h(), m0Var, m0Var);
        }
        this.f10043h = this.f10036a.f10161f.size();
        this.f10056u.add(C3608z0.m14047a().submit(new C3532h0(this, hashMap)));
    }

    /* renamed from: f */
    public final boolean mo11287f() {
        m13847I();
        m13849i(true);
        this.f10036a.mo11442o((C3623b) null);
        return true;
    }

    /* renamed from: g */
    public final <A extends C3469a.C3471b, T extends C3511d<? extends C3612k, A>> T mo11288g(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
