package p174e.p199d.p218c.p242x.p243g;

import java.util.Calendar;
import java.util.Date;
import okhttp3.internal.http2.Settings;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p242x.C5945d;

/* renamed from: e.d.c.x.g.h */
public class C5955h extends C5951d {

    /* renamed from: f */
    protected long f16521f;

    /* renamed from: g */
    protected long f16522g;

    /* renamed from: h */
    protected long f16523h;

    /* renamed from: i */
    protected long f16524i;

    /* renamed from: j */
    protected int f16525j;

    /* renamed from: k */
    protected int f16526k;

    /* renamed from: l */
    protected int[] f16527l;

    /* renamed from: m */
    protected long f16528m;

    public C5955h(C5714o oVar, C5949b bVar) {
        super(oVar, bVar);
        long j;
        if (this.f16508d == 1) {
            this.f16521f = oVar.mo17088g();
            this.f16522g = oVar.mo17088g();
            this.f16523h = oVar.mo17097q();
            j = oVar.mo17088g();
        } else {
            this.f16521f = oVar.mo17097q();
            this.f16522g = oVar.mo17097q();
            this.f16523h = oVar.mo17097q();
            j = oVar.mo17097q();
        }
        this.f16524i = j;
        this.f16525j = oVar.mo17087f();
        this.f16526k = oVar.mo17086e();
        oVar.mo17084t(2);
        oVar.mo17084t(8);
        this.f16527l = new int[]{oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f(), oVar.mo17087f()};
        oVar.mo17084t(24);
        this.f16528m = oVar.mo17097q();
    }

    /* renamed from: a */
    public void mo17865a(C5945d dVar) {
        Calendar instance = Calendar.getInstance();
        instance.set(1904, 0, 1, 0, 0, 0);
        long time = instance.getTime().getTime();
        dVar.mo17119D(256, new Date((this.f16521f * 1000) + time));
        dVar.mo17119D(257, new Date((this.f16522g * 1000) + time));
        long j = this.f16524i / this.f16523h;
        this.f16524i = j;
        dVar.mo17127L(259, j);
        dVar.mo17127L(258, this.f16523h);
        dVar.mo17126K(271, this.f16527l);
        int i = this.f16525j;
        dVar.mo17121F(260, ((double) ((-65536 & i) >> 16)) + (((double) (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) / Math.pow(2.0d, 4.0d)));
        int i2 = this.f16526k;
        dVar.mo17121F(261, ((double) ((65280 & i2) >> 8)) + (((double) (i2 & 255)) / Math.pow(2.0d, 2.0d)));
        dVar.mo17127L(270, this.f16528m);
    }
}
