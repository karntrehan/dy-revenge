package p174e.p319f.p320a.p335c.p345f.p356k;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C3691n;
import com.google.mlkit.vision.face.internal.C4978f;
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

/* renamed from: e.f.a.c.f.k.la */
public final class C7923la {

    /* renamed from: a */
    private static C7952o0<String> f21572a;

    /* renamed from: b */
    private final String f21573b;

    /* renamed from: c */
    private final String f21574c;

    /* renamed from: d */
    private final C7897ja f21575d;

    /* renamed from: e */
    private final C9611n f21576e;

    /* renamed from: f */
    private final C8963l<String> f21577f;

    /* renamed from: g */
    private final C8963l<String> f21578g;

    /* renamed from: h */
    private final String f21579h;

    /* renamed from: i */
    private final Map<C7791b8, Long> f21580i = new HashMap();

    /* renamed from: j */
    private final Map<C7791b8, C7978q0<Object, Long>> f21581j = new HashMap();

    public C7923la(Context context, C9611n nVar, C7897ja jaVar, String str) {
        this.f21573b = context.getPackageName();
        this.f21574c = C9595c.m32696a(context);
        this.f21576e = nVar;
        this.f21575d = jaVar;
        this.f21579h = str;
        this.f21577f = C9603g.m32703a().mo24094b(new C7871ha(str));
        C9603g a = C9603g.m32703a();
        nVar.getClass();
        this.f21578g = a.mo24094b(new C7858ga(nVar));
    }

    /* renamed from: a */
    static long m28063a(List<Long> list, double d) {
        return list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0)).longValue();
    }

    /* renamed from: g */
    private static synchronized C7952o0<String> m28064g() {
        synchronized (C7923la.class) {
            C7952o0<String> o0Var = f21572a;
            if (o0Var != null) {
                return o0Var;
            }
            C1856f a = C1851c.m7865a(Resources.getSystem().getConfiguration());
            C7913l0 l0Var = new C7913l0();
            for (int i = 0; i < a.mo6354d(); i++) {
                l0Var.mo21435c(C9595c.m32697b(a.mo6353c(i)));
            }
            C7952o0<String> d = l0Var.mo21436d();
            f21572a = d;
            return d;
        }
    }

    /* renamed from: h */
    private final String m28065h() {
        return this.f21577f.mo22779o() ? this.f21577f.mo22776l() : C3691n.m14317a().mo11635b(this.f21579h);
    }

    /* renamed from: i */
    private final boolean m28066i(C7791b8 b8Var, long j, long j2) {
        return this.f21580i.get(b8Var) == null || j - this.f21580i.get(b8Var).longValue() > TimeUnit.SECONDS.toMillis(30);
    }

    /* renamed from: b */
    public final void mo21441b(C7884ia iaVar, C7791b8 b8Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m28066i(b8Var, elapsedRealtime, 30)) {
            this.f21580i.put(b8Var, Long.valueOf(elapsedRealtime));
            mo21444e(iaVar.zza(), b8Var, m28065h());
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21442c(C7962oa oaVar, C7791b8 b8Var, String str) {
        oaVar.mo21513f(b8Var);
        String b = oaVar.mo21511b();
        C8039u9 u9Var = new C8039u9();
        u9Var.mo21599b(this.f21573b);
        u9Var.mo21600c(this.f21574c);
        u9Var.mo21605h(m28064g());
        u9Var.mo21604g(Boolean.TRUE);
        u9Var.mo21608k(b);
        u9Var.mo21607j(str);
        u9Var.mo21606i(this.f21578g.mo22779o() ? this.f21578g.mo22776l() : this.f21576e.mo24105a());
        u9Var.mo21601d(10);
        oaVar.mo21514g(u9Var);
        this.f21575d.mo21320a(oaVar);
    }

    /* renamed from: d */
    public final void mo21443d(C7962oa oaVar, C7791b8 b8Var) {
        mo21444e(oaVar, b8Var, m28065h());
    }

    /* renamed from: e */
    public final void mo21444e(C7962oa oaVar, C7791b8 b8Var, String str) {
        C9603g.m32704d().execute(new C7845fa(this, oaVar, b8Var, str, (byte[]) null));
    }

    /* renamed from: f */
    public final <K> void mo21445f(K k, long j, C7791b8 b8Var, C4978f fVar) {
        if (!this.f21581j.containsKey(b8Var)) {
            this.f21581j.put(b8Var, C8016t.m28194r());
        }
        C7978q0 q0Var = this.f21581j.get(b8Var);
        q0Var.mo21536b(k, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m28066i(b8Var, elapsedRealtime, 30)) {
            this.f21580i.put(b8Var, Long.valueOf(elapsedRealtime));
            for (Object next : q0Var.mo21564e()) {
                List<Long> a = q0Var.mo21332a(next);
                Collections.sort(a);
                C7803c7 c7Var = new C7803c7();
                long j2 = 0;
                for (Long longValue : a) {
                    j2 += longValue.longValue();
                }
                c7Var.mo21243a(Long.valueOf(j2 / ((long) a.size())));
                c7Var.mo21245c(Long.valueOf(m28063a(a, 100.0d)));
                c7Var.mo21248f(Long.valueOf(m28063a(a, 75.0d)));
                c7Var.mo21246d(Long.valueOf(m28063a(a, 50.0d)));
                c7Var.mo21244b(Long.valueOf(m28063a(a, 25.0d)));
                c7Var.mo21247e(Long.valueOf(m28063a(a, 0.0d)));
                C7816d7 g = c7Var.mo21249g();
                mo21444e(fVar.f13877a.mo14999l((C7837f2) next, q0Var.mo21332a(next).size(), g), b8Var, m28065h());
            }
            this.f21581j.remove(b8Var);
        }
    }
}
