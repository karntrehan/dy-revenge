package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3469a.C3473d;
import com.google.android.gms.common.api.C3483e;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.C3617p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3536i;
import com.google.android.gms.common.internal.C3697p;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.p129a0.C3644e;
import com.google.android.gms.common.util.C3755b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p027c.p060f.C1788a;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.api.internal.g1 */
public final class C3528g1<O extends C3469a.C3473d> implements C3486f.C3488b, C3486f.C3489c, C3499a3 {

    /* renamed from: a */
    private final Queue<C3565o2> f9956a = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3469a.C3478f f9957b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3500b<O> f9958c;

    /* renamed from: d */
    private final C3595w f9959d;

    /* renamed from: e */
    private final Set<C3578r2> f9960e = new HashSet();

    /* renamed from: f */
    private final Map<C3536i.C3537a<?>, C3601x1> f9961f = new HashMap();

    /* renamed from: g */
    private final int f9962g;

    /* renamed from: h */
    private final C3509c2 f9963h;

    /* renamed from: i */
    private boolean f9964i;

    /* renamed from: j */
    private final List<C3539i1> f9965j = new ArrayList();

    /* renamed from: k */
    private C3623b f9966k = null;

    /* renamed from: l */
    private int f9967l = 0;

    /* renamed from: m */
    final /* synthetic */ C3521f f9968m;

    public C3528g1(C3521f fVar, C3483e<O> eVar) {
        this.f9968m = fVar;
        C3469a.C3478f l = eVar.mo11212l(fVar.f9946t.getLooper(), this);
        this.f9957b = l;
        this.f9958c = eVar.mo11207g();
        this.f9959d = new C3595w();
        this.f9962g = eVar.mo11211k();
        if (l.mo11199t()) {
            this.f9963h = eVar.mo11213m(fVar.f9937k, fVar.f9946t);
        } else {
            this.f9963h = null;
        }
    }

    /* renamed from: B */
    static /* bridge */ /* synthetic */ void m13697B(C3528g1 g1Var, C3539i1 i1Var) {
        if (!g1Var.f9965j.contains(i1Var) || g1Var.f9964i) {
            return;
        }
        if (!g1Var.f9957b.mo11186a()) {
            g1Var.mo11330E();
        } else {
            g1Var.m13704f();
        }
    }

    /* renamed from: C */
    static /* bridge */ /* synthetic */ void m13698C(C3528g1 g1Var, C3539i1 i1Var) {
        C3627d[] g;
        if (g1Var.f9965j.remove(i1Var)) {
            g1Var.f9968m.f9946t.removeMessages(15, i1Var);
            g1Var.f9968m.f9946t.removeMessages(16, i1Var);
            C3627d a = i1Var.f9986b;
            ArrayList arrayList = new ArrayList(g1Var.f9956a.size());
            for (C3565o2 o2Var : g1Var.f9956a) {
                if ((o2Var instanceof C3568p1) && (g = ((C3568p1) o2Var).mo11386g(g1Var)) != null && C3755b.m14502c(g, a)) {
                    arrayList.add(o2Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3565o2 o2Var2 = (C3565o2) arrayList.get(i);
                g1Var.f9956a.remove(o2Var2);
                o2Var2.mo11354b(new C3617p(a));
            }
        }
    }

    /* renamed from: b */
    private final C3627d m13700b(C3627d[] dVarArr) {
        if (!(dVarArr == null || dVarArr.length == 0)) {
            C3627d[] o = this.f9957b.mo11197o();
            if (o == null) {
                o = new C3627d[0];
            }
            C1788a aVar = new C1788a(r3);
            for (C3627d dVar : o) {
                aVar.put(dVar.mo11475o(), Long.valueOf(dVar.mo11476p()));
            }
            for (C3627d dVar2 : dVarArr) {
                Long l = (Long) aVar.get(dVar2.mo11475o());
                if (l == null || l.longValue() < dVar2.mo11476p()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m13701c(C3623b bVar) {
        for (C3578r2 b : this.f9960e) {
            b.mo11415b(this.f9958c, bVar, C3697p.m14323b(bVar, C3623b.f10185f) ? this.f9957b.mo11191g() : null);
        }
        this.f9960e.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m13702d(Status status) {
        C3705r.m14339d(this.f9968m.f9946t);
        m13703e(status, (Exception) null, false);
    }

    /* renamed from: e */
    private final void m13703e(Status status, Exception exc, boolean z) {
        C3705r.m14339d(this.f9968m.f9946t);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.f9956a.iterator();
            while (it.hasNext()) {
                C3565o2 o2Var = (C3565o2) it.next();
                if (!z || o2Var.f10035a == 2) {
                    if (status != null) {
                        o2Var.mo11353a(status);
                    } else {
                        o2Var.mo11354b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: f */
    private final void m13704f() {
        ArrayList arrayList = new ArrayList(this.f9956a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C3565o2 o2Var = (C3565o2) arrayList.get(i);
            if (this.f9957b.mo11186a()) {
                if (m13710o(o2Var)) {
                    this.f9956a.remove(o2Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m13705g() {
        mo11329D();
        m13701c(C3623b.f10185f);
        m13709n();
        Iterator<C3601x1> it = this.f9961f.values().iterator();
        if (!it.hasNext()) {
            m13704f();
            m13707i();
            return;
        }
        C3554m<C3469a.C3471b, ?> mVar = it.next().f10152a;
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m13706h(int i) {
        mo11329D();
        this.f9964i = true;
        this.f9959d.mo11431e(i, this.f9957b.mo11198r());
        C3521f fVar = this.f9968m;
        fVar.f9946t.sendMessageDelayed(Message.obtain(fVar.f9946t, 9, this.f9958c), this.f9968m.f9931e);
        C3521f fVar2 = this.f9968m;
        fVar2.f9946t.sendMessageDelayed(Message.obtain(fVar2.f9946t, 11, this.f9958c), this.f9968m.f9932f);
        this.f9968m.f9939m.mo11638c();
        for (C3601x1 x1Var : this.f9961f.values()) {
            x1Var.f10153b.run();
        }
    }

    /* renamed from: i */
    private final void m13707i() {
        this.f9968m.f9946t.removeMessages(12, this.f9958c);
        C3521f fVar = this.f9968m;
        fVar.f9946t.sendMessageDelayed(fVar.f9946t.obtainMessage(12, this.f9958c), this.f9968m.f9933g);
    }

    /* renamed from: l */
    private final void m13708l(C3565o2 o2Var) {
        o2Var.mo11383d(this.f9959d, mo11340P());
        try {
            o2Var.mo11355c(this);
        } catch (DeadObjectException unused) {
            mo11294j(1);
            this.f9957b.mo11189e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: n */
    private final void m13709n() {
        if (this.f9964i) {
            this.f9968m.f9946t.removeMessages(11, this.f9958c);
            this.f9968m.f9946t.removeMessages(9, this.f9958c);
            this.f9964i = false;
        }
    }

    /* renamed from: o */
    private final boolean m13710o(C3565o2 o2Var) {
        if (!(o2Var instanceof C3568p1)) {
            m13708l(o2Var);
            return true;
        }
        C3568p1 p1Var = (C3568p1) o2Var;
        C3627d b = m13700b(p1Var.mo11386g(this));
        if (b == null) {
            m13708l(o2Var);
            return true;
        }
        String name = this.f9957b.getClass().getName();
        String o = b.mo11475o();
        long p = b.mo11476p();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(o).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(o);
        sb.append(", ");
        sb.append(p);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f9968m.f9947u || !p1Var.mo11385f(this)) {
            p1Var.mo11354b(new C3617p(b));
            return true;
        }
        C3539i1 i1Var = new C3539i1(this.f9958c, b, (C3533h1) null);
        int indexOf = this.f9965j.indexOf(i1Var);
        if (indexOf >= 0) {
            C3539i1 i1Var2 = this.f9965j.get(indexOf);
            this.f9968m.f9946t.removeMessages(15, i1Var2);
            C3521f fVar = this.f9968m;
            fVar.f9946t.sendMessageDelayed(Message.obtain(fVar.f9946t, 15, i1Var2), this.f9968m.f9931e);
            return false;
        }
        this.f9965j.add(i1Var);
        C3521f fVar2 = this.f9968m;
        fVar2.f9946t.sendMessageDelayed(Message.obtain(fVar2.f9946t, 15, i1Var), this.f9968m.f9931e);
        C3521f fVar3 = this.f9968m;
        fVar3.f9946t.sendMessageDelayed(Message.obtain(fVar3.f9946t, 16, i1Var), this.f9968m.f9932f);
        C3623b bVar = new C3623b(2, (PendingIntent) null);
        if (m13711p(bVar)) {
            return false;
        }
        this.f9968m.mo11319h(bVar, this.f9962g);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m13711p(com.google.android.gms.common.C3623b r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C3521f.f9929c
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.f r1 = r3.f9968m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.x r2 = r1.f9943q     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f9944r     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.b<O> r2 = r3.f9958c     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.f r1 = r3.f9968m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.x r1 = r1.f9943q     // Catch:{ all -> 0x002a }
            int r2 = r3.f9962g     // Catch:{ all -> 0x002a }
            r1.mo11428s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3528g1.m13711p(com.google.android.gms.common.b):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final boolean m13712q(boolean z) {
        C3705r.m14339d(this.f9968m.f9946t);
        if (!this.f9957b.mo11186a() || this.f9961f.size() != 0) {
            return false;
        }
        if (this.f9959d.mo11433g()) {
            if (z) {
                m13707i();
            }
            return false;
        }
        this.f9957b.mo11189e("Timing out service connection.");
        return true;
    }

    /* renamed from: D */
    public final void mo11329D() {
        C3705r.m14339d(this.f9968m.f9946t);
        this.f9966k = null;
    }

    /* renamed from: E */
    public final void mo11330E() {
        C3623b bVar;
        C3705r.m14339d(this.f9968m.f9946t);
        if (!this.f9957b.mo11186a() && !this.f9957b.mo11190f()) {
            try {
                C3521f fVar = this.f9968m;
                int b = fVar.f9939m.mo11637b(fVar.f9937k, this.f9957b);
                if (b != 0) {
                    C3623b bVar2 = new C3623b(b, (PendingIntent) null);
                    String name = this.f9957b.getClass().getName();
                    String obj = bVar2.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    mo11333H(bVar2, (Exception) null);
                    return;
                }
                C3521f fVar2 = this.f9968m;
                C3469a.C3478f fVar3 = this.f9957b;
                C3548k1 k1Var = new C3548k1(fVar2, fVar3, this.f9958c);
                if (fVar3.mo11199t()) {
                    ((C3509c2) C3705r.m14346k(this.f9963h)).mo11292S0(k1Var);
                }
                try {
                    this.f9957b.mo11192h(k1Var);
                } catch (SecurityException e) {
                    e = e;
                    bVar = new C3623b(10);
                    mo11333H(bVar, e);
                }
            } catch (IllegalStateException e2) {
                e = e2;
                bVar = new C3623b(10);
                mo11333H(bVar, e);
            }
        }
    }

    /* renamed from: F */
    public final void mo11331F(C3565o2 o2Var) {
        C3705r.m14339d(this.f9968m.f9946t);
        if (!this.f9957b.mo11186a()) {
            this.f9956a.add(o2Var);
            C3623b bVar = this.f9966k;
            if (bVar == null || !bVar.mo11457C()) {
                mo11330E();
            } else {
                mo11333H(this.f9966k, (Exception) null);
            }
        } else if (m13710o(o2Var)) {
            m13707i();
        } else {
            this.f9956a.add(o2Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo11332G() {
        this.f9967l++;
    }

    /* renamed from: H */
    public final void mo11333H(C3623b bVar, Exception exc) {
        C3705r.m14339d(this.f9968m.f9946t);
        C3509c2 c2Var = this.f9963h;
        if (c2Var != null) {
            c2Var.mo11293T0();
        }
        mo11329D();
        this.f9968m.f9939m.mo11638c();
        m13701c(bVar);
        if ((this.f9957b instanceof C3644e) && bVar.mo11462o() != 24) {
            this.f9968m.f9934h = true;
            C3521f fVar = this.f9968m;
            fVar.f9946t.sendMessageDelayed(fVar.f9946t.obtainMessage(19), 300000);
        }
        if (bVar.mo11462o() == 4) {
            m13702d(C3521f.f9928b);
        } else if (this.f9956a.isEmpty()) {
            this.f9966k = bVar;
        } else if (exc != null) {
            C3705r.m14339d(this.f9968m.f9946t);
            m13703e((Status) null, exc, false);
        } else if (this.f9968m.f9947u) {
            m13703e(C3521f.m13658i(this.f9958c, bVar), (Exception) null, true);
            if (!this.f9956a.isEmpty() && !m13711p(bVar) && !this.f9968m.mo11319h(bVar, this.f9962g)) {
                if (bVar.mo11462o() == 18) {
                    this.f9964i = true;
                }
                if (this.f9964i) {
                    C3521f fVar2 = this.f9968m;
                    fVar2.f9946t.sendMessageDelayed(Message.obtain(fVar2.f9946t, 9, this.f9958c), this.f9968m.f9931e);
                    return;
                }
                m13702d(C3521f.m13658i(this.f9958c, bVar));
            }
        } else {
            m13702d(C3521f.m13658i(this.f9958c, bVar));
        }
    }

    /* renamed from: I */
    public final void mo11334I(C3623b bVar) {
        C3705r.m14339d(this.f9968m.f9946t);
        C3469a.C3478f fVar = this.f9957b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.mo11189e(sb.toString());
        mo11333H(bVar, (Exception) null);
    }

    /* renamed from: J */
    public final void mo11335J(C3578r2 r2Var) {
        C3705r.m14339d(this.f9968m.f9946t);
        this.f9960e.add(r2Var);
    }

    /* renamed from: K */
    public final void mo11336K() {
        C3705r.m14339d(this.f9968m.f9946t);
        if (this.f9964i) {
            mo11330E();
        }
    }

    /* renamed from: L */
    public final void mo11337L() {
        C3705r.m14339d(this.f9968m.f9946t);
        m13702d(C3521f.f9927a);
        this.f9959d.mo11432f();
        for (C3536i.C3537a n2Var : (C3536i.C3537a[]) this.f9961f.keySet().toArray(new C3536i.C3537a[0])) {
            mo11331F(new C3561n2(n2Var, new C8965m()));
        }
        m13701c(new C3623b(4));
        if (this.f9957b.mo11186a()) {
            this.f9957b.mo11194j(new C3523f1(this));
        }
    }

    /* renamed from: M */
    public final void mo11338M() {
        C3705r.m14339d(this.f9968m.f9946t);
        if (this.f9964i) {
            m13709n();
            C3521f fVar = this.f9968m;
            m13702d(fVar.f9938l.mo11484i(fVar.f9937k) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f9957b.mo11189e("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final boolean mo11339O() {
        return this.f9957b.mo11186a();
    }

    /* renamed from: P */
    public final boolean mo11340P() {
        return this.f9957b.mo11199t();
    }

    /* renamed from: Y */
    public final void mo11261Y(C3623b bVar, C3469a<?> aVar, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo11341a() {
        return m13712q(true);
    }

    /* renamed from: j */
    public final void mo11294j(int i) {
        if (Looper.myLooper() == this.f9968m.f9946t.getLooper()) {
            m13706h(i);
        } else {
            this.f9968m.f9946t.post(new C3513d1(this, i));
        }
    }

    /* renamed from: k */
    public final void mo11295k(C3623b bVar) {
        mo11333H(bVar, (Exception) null);
    }

    /* renamed from: m */
    public final void mo11296m(Bundle bundle) {
        if (Looper.myLooper() == this.f9968m.f9946t.getLooper()) {
            m13705g();
        } else {
            this.f9968m.f9946t.post(new C3508c1(this));
        }
    }

    /* renamed from: r */
    public final int mo11342r() {
        return this.f9962g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final int mo11343s() {
        return this.f9967l;
    }

    /* renamed from: t */
    public final C3623b mo11344t() {
        C3705r.m14339d(this.f9968m.f9946t);
        return this.f9966k;
    }

    /* renamed from: v */
    public final C3469a.C3478f mo11345v() {
        return this.f9957b;
    }

    /* renamed from: x */
    public final Map<C3536i.C3537a<?>, C3601x1> mo11346x() {
        return this.f9961f;
    }
}
