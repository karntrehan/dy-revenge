package p174e.p319f.p320a.p335c.p345f.p355j;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C3691n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p027c.p064i.p069g.C1851c;
import p027c.p064i.p069g.C1856f;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p406d.p407a.p409c.C9595c;
import p174e.p319f.p406d.p407a.p409c.C9603g;
import p174e.p319f.p406d.p407a.p409c.C9611n;

/* renamed from: e.f.a.c.f.j.f7 */
public final class C7582f7 {

    /* renamed from: a */
    private static C7768z7<String> f20428a;

    /* renamed from: b */
    private final String f20429b;

    /* renamed from: c */
    private final String f20430c;

    /* renamed from: d */
    private final C7572e7 f20431d;

    /* renamed from: e */
    private final C9611n f20432e;

    /* renamed from: f */
    private final C8963l<String> f20433f;

    /* renamed from: g */
    private final C8963l<String> f20434g;

    /* renamed from: h */
    private final String f20435h;

    /* renamed from: i */
    private final Map<C7756y4, Long> f20436i = new HashMap();

    /* renamed from: j */
    private final Map<C7756y4, Object> f20437j = new HashMap();

    public C7582f7(Context context, C9611n nVar, C7572e7 e7Var, String str) {
        this.f20429b = context.getPackageName();
        this.f20430c = C9595c.m32696a(context);
        this.f20432e = nVar;
        this.f20431d = e7Var;
        this.f20435h = str;
        this.f20433f = C9603g.m32703a().mo24094b(new C7562d7(str));
        C9603g a = C9603g.m32703a();
        nVar.getClass();
        this.f20434g = a.mo24094b(new C7552c7(nVar));
    }

    /* renamed from: c */
    private static synchronized C7768z7<String> m27637c() {
        synchronized (C7582f7.class) {
            C7768z7<String> z7Var = f20428a;
            if (z7Var != null) {
                return z7Var;
            }
            C1856f a = C1851c.m7865a(Resources.getSystem().getConfiguration());
            C7741w7 w7Var = new C7741w7();
            for (int i = 0; i < a.mo6354d(); i++) {
                w7Var.mo21185c(C9595c.m32697b(a.mo6353c(i)));
            }
            C7768z7<String> d = w7Var.mo21186d();
            f20428a = d;
            return d;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21082a(C7592g7 g7Var, C7756y4 y4Var, String str) {
        g7Var.mo21092d(y4Var);
        String a = g7Var.mo21090a();
        C7659n6 n6Var = new C7659n6();
        n6Var.mo21119b(this.f20429b);
        n6Var.mo21120c(this.f20430c);
        n6Var.mo21125h(m27637c());
        n6Var.mo21124g(Boolean.TRUE);
        n6Var.mo21128k(a);
        n6Var.mo21127j(str);
        n6Var.mo21126i(this.f20434g.mo22779o() ? this.f20434g.mo22776l() : this.f20432e.mo24105a());
        n6Var.mo21121d(10);
        g7Var.mo21093e(n6Var);
        this.f20431d.mo21043a(g7Var);
    }

    /* renamed from: b */
    public final void mo21083b(C7687q7 q7Var, C7756y4 y4Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f20436i.get(y4Var) == null || elapsedRealtime - this.f20436i.get(y4Var).longValue() > TimeUnit.SECONDS.toMillis(30)) {
            this.f20436i.put(y4Var, Long.valueOf(elapsedRealtime));
            int i = q7Var.f20709a;
            int i2 = q7Var.f20710b;
            int i3 = q7Var.f20711c;
            int i4 = q7Var.f20712d;
            int i5 = q7Var.f20713e;
            long j = q7Var.f20714f;
            int i6 = q7Var.f20715g;
            C7693r4 r4Var = new C7693r4();
            r4Var.mo21148d(i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? C7648m4.UNKNOWN_FORMAT : C7648m4.NV21 : C7648m4.NV16 : C7648m4.YV12 : C7648m4.YUV_420_888 : C7648m4.BITMAP);
            r4Var.mo21150f(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? C7702s4.ANDROID_MEDIA_IMAGE : C7702s4.FILEPATH : C7702s4.BYTEBUFFER : C7702s4.BYTEARRAY : C7702s4.BITMAP);
            r4Var.mo21147c(Integer.valueOf(i3));
            r4Var.mo21149e(Integer.valueOf(i4));
            r4Var.mo21151g(Integer.valueOf(i5));
            r4Var.mo21146b(Long.valueOf(j));
            r4Var.mo21152h(Integer.valueOf(i6));
            C7711t4 j2 = r4Var.mo21153j();
            C7530a5 a5Var = new C7530a5();
            a5Var.mo21040d(j2);
            C9603g.m32704d().execute(new C7542b7(this, C7592g7.m27647c(a5Var), y4Var, this.f20433f.mo22779o() ? this.f20433f.mo22776l() : C3691n.m14317a().mo11635b(this.f20435h), (byte[]) null));
        }
    }
}
