package p174e.p319f.p320a.p335c.p345f.p358m;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C3691n;
import com.google.mlkit.vision.text.internal.C4998m;
import com.google.mlkit.vision.text.internal.C4999n;
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

/* renamed from: e.f.a.c.f.m.ga */
public final class C8675ga {

    /* renamed from: a */
    private static C8756n0<String> f23738a;

    /* renamed from: b */
    private final String f23739b;

    /* renamed from: c */
    private final String f23740c;

    /* renamed from: d */
    private final C8662fa f23741d;

    /* renamed from: e */
    private final C9611n f23742e;

    /* renamed from: f */
    private final C8963l<String> f23743f;

    /* renamed from: g */
    private final C8963l<String> f23744g;

    /* renamed from: h */
    private final String f23745h;

    /* renamed from: i */
    private final Map<C8595a8, Long> f23746i = new HashMap();

    /* renamed from: j */
    private final Map<C8595a8, C8782p0<Object, Long>> f23747j = new HashMap();

    public C8675ga(Context context, C9611n nVar, C8662fa faVar, String str) {
        this.f23739b = context.getPackageName();
        this.f23740c = C9595c.m32696a(context);
        this.f23742e = nVar;
        this.f23741d = faVar;
        this.f23745h = str;
        this.f23743f = C9603g.m32703a().mo24094b(new C8649ea(str));
        C9603g a = C9603g.m32703a();
        nVar.getClass();
        this.f23744g = a.mo24094b(new C8636da(nVar));
    }

    /* renamed from: a */
    static long m29477a(List<Long> list, double d) {
        return list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0)).longValue();
    }

    /* renamed from: g */
    private static synchronized C8756n0<String> m29478g() {
        synchronized (C8675ga.class) {
            C8756n0<String> n0Var = f23738a;
            if (n0Var != null) {
                return n0Var;
            }
            C1856f a = C1851c.m7865a(Resources.getSystem().getConfiguration());
            C8717k0 k0Var = new C8717k0();
            for (int i = 0; i < a.mo6354d(); i++) {
                k0Var.mo22501c(C9595c.m32697b(a.mo6353c(i)));
            }
            C8756n0<String> d = k0Var.mo22502d();
            f23738a = d;
            return d;
        }
    }

    /* renamed from: h */
    private final String m29479h() {
        return this.f23743f.mo22779o() ? this.f23743f.mo22776l() : C3691n.m14317a().mo11635b(this.f23745h);
    }

    /* renamed from: i */
    private final boolean m29480i(C8595a8 a8Var, long j, long j2) {
        return this.f23746i.get(a8Var) == null || j - this.f23746i.get(a8Var).longValue() > TimeUnit.SECONDS.toMillis(30);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo22422b(C8714ja jaVar, C8595a8 a8Var, String str) {
        jaVar.mo22498f(a8Var);
        String b = jaVar.mo22496b();
        C8817r9 r9Var = new C8817r9();
        r9Var.mo22618b(this.f23739b);
        r9Var.mo22619c(this.f23740c);
        r9Var.mo22624h(m29478g());
        r9Var.mo22623g(Boolean.TRUE);
        r9Var.mo22627k(b);
        r9Var.mo22626j(str);
        r9Var.mo22625i(this.f23744g.mo22779o() ? this.f23744g.mo22776l() : this.f23742e.mo24105a());
        r9Var.mo22620d(10);
        jaVar.mo22499g(r9Var);
        this.f23741d.mo22318a(jaVar);
    }

    /* renamed from: c */
    public final void mo22423c(C8714ja jaVar, C8595a8 a8Var) {
        mo22424d(jaVar, a8Var, m29479h());
    }

    /* renamed from: d */
    public final void mo22424d(C8714ja jaVar, C8595a8 a8Var, String str) {
        C9603g.m32704d().execute(new C8623ca(this, jaVar, a8Var, str, (byte[]) null));
    }

    /* renamed from: e */
    public final void mo22425e(C4999n nVar, C8595a8 a8Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m29480i(a8Var, elapsedRealtime, 30)) {
            this.f23746i.put(a8Var, Long.valueOf(elapsedRealtime));
            mo22424d(nVar.mo15007a(), a8Var, m29479h());
        }
    }

    /* renamed from: f */
    public final <K> void mo22426f(K k, long j, C8595a8 a8Var, C4998m mVar) {
        if (!this.f23747j.containsKey(a8Var)) {
            this.f23747j.put(a8Var, C8820s.m29651r());
        }
        C8782p0 p0Var = this.f23747j.get(a8Var);
        p0Var.mo22324b(k, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m29480i(a8Var, elapsedRealtime, 30)) {
            this.f23746i.put(a8Var, Long.valueOf(elapsedRealtime));
            for (Object next : p0Var.mo22325e()) {
                List<Long> a = p0Var.mo22382a(next);
                Collections.sort(a);
                C8698i7 i7Var = new C8698i7();
                long j2 = 0;
                for (Long longValue : a) {
                    j2 += longValue.longValue();
                }
                i7Var.mo22468a(Long.valueOf(j2 / ((long) a.size())));
                i7Var.mo22470c(Long.valueOf(m29477a(a, 100.0d)));
                i7Var.mo22473f(Long.valueOf(m29477a(a, 75.0d)));
                i7Var.mo22471d(Long.valueOf(m29477a(a, 50.0d)));
                i7Var.mo22469b(Long.valueOf(m29477a(a, 25.0d)));
                i7Var.mo22472e(Long.valueOf(m29477a(a, 0.0d)));
                C8711j7 g = i7Var.mo22474g();
                int size = p0Var.mo22382a(next).size();
                C8621c8 c8Var = new C8621c8();
                c8Var.mo22332e(Boolean.FALSE);
                C8823s2 s2Var = new C8823s2();
                s2Var.mo22630a(Integer.valueOf(size));
                s2Var.mo22632c((C8849u2) next);
                s2Var.mo22631b(g);
                c8Var.mo22330c(s2Var.mo22633e());
                mo22424d(C8714ja.m29532d(c8Var), a8Var, m29479h());
            }
            this.f23747j.remove(a8Var);
        }
    }
}
