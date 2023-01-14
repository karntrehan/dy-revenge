package p174e.p199d.p218c.p238w.p239h;

import java.util.Calendar;
import java.util.Date;
import okhttp3.internal.http2.Settings;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p238w.C5890d;

/* renamed from: e.d.c.w.h.f */
public class C5899f extends C5896c {

    /* renamed from: e */
    long f16394e;

    /* renamed from: f */
    long f16395f;

    /* renamed from: g */
    long f16396g;

    /* renamed from: h */
    long f16397h;

    /* renamed from: i */
    int f16398i;

    /* renamed from: j */
    int f16399j;

    /* renamed from: k */
    int[] f16400k;

    /* renamed from: l */
    long f16401l;

    /* renamed from: m */
    long f16402m;

    /* renamed from: n */
    long f16403n;

    /* renamed from: o */
    long f16404o;

    /* renamed from: p */
    long f16405p;

    /* renamed from: q */
    long f16406q;

    /* renamed from: r */
    long f16407r;

    public C5899f(C5714o oVar, C5894a aVar) {
        super(oVar, aVar);
        this.f16394e = oVar.mo17097q();
        this.f16395f = oVar.mo17097q();
        this.f16396g = oVar.mo17097q();
        this.f16397h = oVar.mo17097q();
        this.f16398i = oVar.mo17087f();
        this.f16399j = oVar.mo17086e();
        oVar.mo17084t(10);
        this.f16400k = new int[]{oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f()};
        this.f16401l = oVar.mo17097q();
        this.f16402m = oVar.mo17097q();
        this.f16403n = oVar.mo17097q();
        this.f16404o = oVar.mo17097q();
        this.f16405p = oVar.mo17097q();
        this.f16406q = oVar.mo17097q();
        this.f16407r = oVar.mo17097q();
    }

    /* renamed from: a */
    public void mo17829a(C5890d dVar) {
        Calendar instance = Calendar.getInstance();
        instance.set(1904, 0, 1, 0, 0, 0);
        long time = instance.getTime().getTime();
        dVar.mo17119D(256, new Date((this.f16394e * 1000) + time));
        dVar.mo17119D(257, new Date((this.f16395f * 1000) + time));
        long j = this.f16397h / this.f16396g;
        this.f16397h = j;
        dVar.mo17127L(259, j);
        dVar.mo17127L(258, this.f16396g);
        int i = this.f16398i;
        dVar.mo17121F(260, ((double) ((-65536 & i) >> 16)) + (((double) (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) / Math.pow(2.0d, 4.0d)));
        int i2 = this.f16399j;
        dVar.mo17121F(261, ((double) ((65280 & i2) >> 8)) + (((double) (i2 & 255)) / Math.pow(2.0d, 2.0d)));
        dVar.mo17127L(264, this.f16401l);
        dVar.mo17127L(265, this.f16402m);
        dVar.mo17127L(266, this.f16403n);
        dVar.mo17127L(267, this.f16404o);
        dVar.mo17127L(268, this.f16405p);
        dVar.mo17127L(269, this.f16406q);
        dVar.mo17127L(270, this.f16407r);
    }
}
