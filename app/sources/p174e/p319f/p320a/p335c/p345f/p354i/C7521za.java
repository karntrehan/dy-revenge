package p174e.p319f.p320a.p335c.p345f.p354i;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C3691n;
import com.google.mlkit.vision.barcode.internal.C4954g;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p027c.p064i.p069g.C1851c;
import p027c.p064i.p069g.C1856f;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p406d.p407a.p409c.C9595c;
import p174e.p319f.p406d.p407a.p409c.C9603g;
import p174e.p319f.p406d.p407a.p409c.C9611n;

/* renamed from: e.f.a.c.f.i.za */
public final class C7521za {

    /* renamed from: a */
    private static C7214e1<String> f20241a;

    /* renamed from: b */
    private final String f20242b;

    /* renamed from: c */
    private final String f20243c;

    /* renamed from: d */
    private final C7507ya f20244d;

    /* renamed from: e */
    private final C9611n f20245e;

    /* renamed from: f */
    private final C8963l<String> f20246f;

    /* renamed from: g */
    private final C8963l<String> f20247g;

    /* renamed from: h */
    private final String f20248h;

    /* renamed from: i */
    private final Map<C7323l8, Long> f20249i = new HashMap();

    /* renamed from: j */
    private final Map<C7323l8, C7244g1<Object, Long>> f20250j = new HashMap();

    public C7521za(Context context, C9611n nVar, C7507ya yaVar, String str) {
        this.f20242b = context.getPackageName();
        this.f20243c = C9595c.m32696a(context);
        this.f20245e = nVar;
        this.f20244d = yaVar;
        this.f20248h = str;
        this.f20246f = C9603g.m32703a().mo24094b(new C7479wa(str));
        C9603g a = C9603g.m32703a();
        nVar.getClass();
        this.f20247g = a.mo24094b(new C7465va(nVar));
    }

    /* renamed from: a */
    static long m27577a(List<Long> list, double d) {
        return list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0)).longValue();
    }

    /* renamed from: g */
    private static synchronized C7214e1<String> m27578g() {
        synchronized (C7521za.class) {
            C7214e1<String> e1Var = f20241a;
            if (e1Var != null) {
                return e1Var;
            }
            C1856f a = C1851c.m7865a(Resources.getSystem().getConfiguration());
            C7154a1 a1Var = new C7154a1();
            for (int i = 0; i < a.mo6354d(); i++) {
                a1Var.mo20562e(C9595c.m32697b(a.mo6353c(i)));
            }
            C7214e1<String> g = a1Var.mo20564g();
            f20241a = g;
            return g;
        }
    }

    /* renamed from: h */
    private final String m27579h() {
        return this.f20246f.mo22779o() ? this.f20246f.mo22776l() : C3691n.m14317a().mo11635b(this.f20248h);
    }

    /* renamed from: i */
    private final boolean m27580i(C7323l8 l8Var, long j, long j2) {
        return this.f20249i.get(l8Var) == null || j - this.f20249i.get(l8Var).longValue() > TimeUnit.SECONDS.toMillis(30);
    }

    /* renamed from: b */
    public final void mo21031b(C7493xa xaVar, C7323l8 l8Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m27580i(l8Var, elapsedRealtime, 30)) {
            this.f20249i.put(l8Var, Long.valueOf(elapsedRealtime));
            mo21034e(xaVar.zza(), l8Var, m27579h());
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21032c(C7194cb cbVar, C7323l8 l8Var, String str) {
        cbVar.mo20611f(l8Var);
        String b = cbVar.mo20609b();
        C7238fa faVar = new C7238fa();
        faVar.mo20702b(this.f20242b);
        faVar.mo20703c(this.f20243c);
        faVar.mo20708h(m27578g());
        faVar.mo20707g(Boolean.TRUE);
        faVar.mo20711k(b);
        faVar.mo20710j(str);
        faVar.mo20709i(this.f20247g.mo22779o() ? this.f20247g.mo22776l() : this.f20245e.mo24105a());
        faVar.mo20704d(10);
        cbVar.mo20612g(faVar);
        this.f20244d.mo20753a(cbVar);
    }

    /* renamed from: d */
    public final void mo21033d(C7194cb cbVar, C7323l8 l8Var) {
        mo21034e(cbVar, l8Var, m27579h());
    }

    /* renamed from: e */
    public final void mo21034e(C7194cb cbVar, C7323l8 l8Var, String str) {
        C9603g.m32704d().execute(new C7451ua(this, cbVar, l8Var, str, (byte[]) null));
    }

    /* renamed from: f */
    public final <K> void mo21035f(K k, long j, C7323l8 l8Var, C4954g gVar) {
        if (!this.f20250j.containsKey(l8Var)) {
            this.f20250j.put(l8Var, C7287j0.m27322r());
        }
        C7244g1 g1Var = this.f20250j.get(l8Var);
        g1Var.mo20720b(k, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m27580i(l8Var, elapsedRealtime, 30)) {
            this.f20249i.put(l8Var, Long.valueOf(elapsedRealtime));
            for (Object next : g1Var.mo20758e()) {
                List<Long> a = g1Var.mo20728a(next);
                Collections.sort(a);
                C7420s7 s7Var = new C7420s7();
                long j2 = 0;
                for (Long longValue : a) {
                    j2 += longValue.longValue();
                }
                s7Var.mo20898a(Long.valueOf(j2 / ((long) a.size())));
                s7Var.mo20900c(Long.valueOf(m27577a(a, 100.0d)));
                s7Var.mo20903f(Long.valueOf(m27577a(a, 75.0d)));
                s7Var.mo20901d(Long.valueOf(m27577a(a, 50.0d)));
                s7Var.mo20899b(Long.valueOf(m27577a(a, 25.0d)));
                s7Var.mo20902e(Long.valueOf(m27577a(a, 0.0d)));
                C7434t7 g = s7Var.mo20904g();
                mo21034e(gVar.f13815a.mo14961k((C7415s2) next, g1Var.mo20728a(next).size(), g), l8Var, m27579h());
            }
            this.f20250j.remove(l8Var);
        }
    }
}
