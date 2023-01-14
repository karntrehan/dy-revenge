package p174e.p319f.p320a.p335c.p345f.p357l;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C3691n;
import com.google.android.gms.vision.face.mlkit.C4132c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p027c.p064i.p069g.C1851c;
import p027c.p064i.p069g.C1856f;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p406d.p407a.p409c.C9595c;
import p174e.p319f.p406d.p407a.p409c.C9603g;
import p174e.p319f.p406d.p407a.p409c.C9611n;

/* renamed from: e.f.a.c.f.l.ka */
public final class C8308ka {

    /* renamed from: a */
    private static C8408q1<String> f22712a;

    /* renamed from: b */
    private final String f22713b;

    /* renamed from: c */
    private final String f22714c;

    /* renamed from: d */
    private final C8289ja f22715d;

    /* renamed from: e */
    private final C9611n f22716e;

    /* renamed from: f */
    private final C8963l<String> f22717f;

    /* renamed from: g */
    private final C8963l<String> f22718g;

    /* renamed from: h */
    private final String f22719h;

    /* renamed from: i */
    private final Map<C8211f8, Long> f22720i = new HashMap();

    /* renamed from: j */
    private final Map<C8211f8, Object> f22721j = new HashMap();

    public C8308ka(Context context, C9611n nVar, C8289ja jaVar, String str) {
        this.f22713b = context.getPackageName();
        this.f22714c = C9595c.m32696a(context);
        this.f22716e = nVar;
        this.f22715d = jaVar;
        this.f22719h = str;
        this.f22717f = C9603g.m32703a().mo24094b(new C8270ia(str));
        this.f22718g = C9603g.m32703a().mo24094b(new C8251ha(nVar));
    }

    /* renamed from: c */
    private static synchronized C8408q1<String> m28659c() {
        synchronized (C8308ka.class) {
            C8408q1<String> q1Var = f22712a;
            if (q1Var != null) {
                return q1Var;
            }
            C1856f a = C1851c.m7865a(Resources.getSystem().getConfiguration());
            C8354n1 n1Var = new C8354n1();
            for (int i = 0; i < a.mo6354d(); i++) {
                n1Var.mo22013c(C9595c.m32697b(a.mo6353c(i)));
            }
            C8408q1<String> d = n1Var.mo22014d();
            f22712a = d;
            return d;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21923a(C8381oa oaVar, C8211f8 f8Var, String str) {
        oaVar.mo22050d(f8Var);
        String a = oaVar.mo22048a();
        C8506v9 v9Var = new C8506v9();
        v9Var.mo22187b(this.f22713b);
        v9Var.mo22188c(this.f22714c);
        v9Var.mo22193h(m28659c());
        v9Var.mo22192g(Boolean.TRUE);
        v9Var.mo22196k(a);
        v9Var.mo22195j(str);
        v9Var.mo22194i(this.f22718g.mo22779o() ? this.f22718g.mo22776l() : this.f22716e.mo24105a());
        v9Var.mo22189d(10);
        oaVar.mo22051e(v9Var);
        this.f22715d.mo21786a(oaVar);
    }

    /* renamed from: b */
    public final void mo21924b(C4132c cVar, C8211f8 f8Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f22720i.get(f8Var) == null || elapsedRealtime - this.f22720i.get(f8Var).longValue() > TimeUnit.SECONDS.toMillis(30)) {
            this.f22720i.put(f8Var, Long.valueOf(elapsedRealtime));
            C8579za zaVar = cVar.f11485a;
            C8230g8 g8Var = cVar.f11486b;
            C8192e8 e8Var = cVar.f11487c;
            C8268i8 i8Var = new C8268i8();
            i8Var.mo21854e(Boolean.TRUE);
            C8360n7 n7Var = new C8360n7();
            C8414q7 q7Var = new C8414q7();
            q7Var.mo22094a(zaVar.mo22288p() == 2 ? C8432r7.ALL_CLASSIFICATIONS : C8432r7.NO_CLASSIFICATIONS);
            q7Var.mo22097d(zaVar.mo22284C() == 2 ? C8468t7.ALL_LANDMARKS : C8468t7.NO_LANDMARKS);
            q7Var.mo22095b(zaVar.mo22289r() == 2 ? C8450s7.ALL_CONTOURS : C8450s7.NO_CONTOURS);
            q7Var.mo22099f(zaVar.mo22285E() == 2 ? C8486u7.ACCURATE : C8486u7.FAST);
            q7Var.mo22098e(Float.valueOf(zaVar.mo22287o()));
            q7Var.mo22096c(Boolean.valueOf(zaVar.mo22286G()));
            n7Var.mo22017c(q7Var.mo22100k());
            n7Var.mo22016b(g8Var);
            n7Var.mo22015a(e8Var);
            i8Var.mo21853d(n7Var.mo22018d());
            C9603g.m32704d().execute(new C8232ga(this, C8381oa.m28903c(i8Var), f8Var, this.f22717f.mo22779o() ? this.f22717f.mo22776l() : C3691n.m14317a().mo11635b(this.f22719h), (byte[]) null));
        }
    }
}
