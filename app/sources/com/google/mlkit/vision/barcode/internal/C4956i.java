package com.google.mlkit.vision.barcode.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.C3705r;
import com.google.mlkit.vision.common.internal.C4963a;
import com.google.mlkit.vision.common.internal.C4966d;
import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p354i.C7154a1;
import p174e.p319f.p320a.p335c.p345f.p354i.C7179bb;
import p174e.p319f.p320a.p335c.p345f.p354i.C7191c8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7194cb;
import p174e.p319f.p320a.p335c.p345f.p354i.C7309k8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7323l8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7351n8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7387q2;
import p174e.p319f.p320a.p335c.p345f.p354i.C7401r2;
import p174e.p319f.p320a.p335c.p345f.p354i.C7415s2;
import p174e.p319f.p320a.p335c.p345f.p354i.C7434t7;
import p174e.p319f.p320a.p335c.p345f.p354i.C7490x7;
import p174e.p319f.p320a.p335c.p345f.p354i.C7504y7;
import p174e.p319f.p320a.p335c.p345f.p354i.C7519z8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7521za;
import p174e.p319f.p406d.p407a.C9585a;
import p174e.p319f.p406d.p407a.p409c.C9601f;
import p174e.p319f.p406d.p407a.p409c.C9606i;
import p174e.p319f.p406d.p411b.p412a.C9625a;
import p174e.p319f.p406d.p411b.p412a.C9627c;
import p174e.p319f.p406d.p411b.p413b.C9631a;

/* renamed from: com.google.mlkit.vision.barcode.internal.i */
public final class C4956i extends C9601f<List<C9625a>, C9631a> {

    /* renamed from: d */
    private static final C4966d f13822d = C4966d.m18871b();

    /* renamed from: e */
    static boolean f13823e = true;

    /* renamed from: f */
    private final C9627c f13824f;

    /* renamed from: g */
    private final C4957j f13825g;

    /* renamed from: h */
    private final C7521za f13826h;

    /* renamed from: i */
    private final C7179bb f13827i;

    /* renamed from: j */
    private final C4963a f13828j = new C4963a();

    /* renamed from: k */
    private boolean f13829k;

    public C4956i(C9606i iVar, C9627c cVar, C4957j jVar, C7521za zaVar) {
        C3705r.m14347l(iVar, "MlKitContext can not be null");
        C3705r.m14347l(cVar, "BarcodeScannerOptions can not be null");
        this.f13824f = cVar;
        this.f13825g = jVar;
        this.f13826h = zaVar;
        this.f13827i = C7179bb.m27174a(iVar.mo24098b());
    }

    /* renamed from: l */
    private final void m18829l(C7309k8 k8Var, long j, C9631a aVar, List<C9625a> list) {
        C7154a1 a1Var = new C7154a1();
        C7154a1 a1Var2 = new C7154a1();
        if (list != null) {
            for (C9625a next : list) {
                a1Var.mo20562e(C4949b.m18820a(next.mo24117c()));
                a1Var2.mo20562e(C4949b.m18821b(next.mo24119e()));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f13826h.mo21031b(new C4955h(this, elapsedRealtime, k8Var, a1Var, a1Var2, aVar), C7323l8.ON_DEVICE_BARCODE_DETECT);
        C7401r2 r2Var = new C7401r2();
        r2Var.mo20876e(k8Var);
        r2Var.mo20877f(Boolean.valueOf(f13823e));
        r2Var.mo20878g(C4949b.m18822c(this.f13824f));
        r2Var.mo20874c(a1Var.mo20564g());
        r2Var.mo20875d(a1Var2.mo20564g());
        this.f13826h.mo21035f(r2Var.mo20879h(), elapsedRealtime, C7323l8.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, new C4954g(this));
        long currentTimeMillis = System.currentTimeMillis();
        this.f13827i.mo20585c(true != this.f13829k ? 24301 : 24302, k8Var.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    /* renamed from: b */
    public final synchronized void mo14956b() {
        this.f13829k = this.f13825g.mo14962a();
    }

    /* renamed from: d */
    public final synchronized void mo14957d() {
        this.f13825g.zzb();
        f13823e = true;
    }

    /* renamed from: i */
    public final synchronized List<C9625a> mo14958h(C9631a aVar) {
        List<C9625a> c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f13828j.mo14974a(aVar);
        try {
            c = this.f13825g.mo14963c(aVar);
            m18829l(C7309k8.NO_ERROR, elapsedRealtime, aVar, c);
            f13823e = false;
        } catch (C9585a e) {
            C9585a aVar2 = e;
            m18829l(aVar2.mo24081a() == 14 ? C7309k8.MODEL_NOT_DOWNLOADED : C7309k8.UNKNOWN_ERROR, elapsedRealtime, aVar, (List<C9625a>) null);
            throw aVar2;
        }
        return c;
    }

    /* renamed from: j */
    public final /* synthetic */ C7194cb mo14960j(long j, C7309k8 k8Var, C7154a1 a1Var, C7154a1 a1Var2, C9631a aVar) {
        C7519z8 z8Var = new C7519z8();
        C7191c8 c8Var = new C7191c8();
        c8Var.mo20602c(Long.valueOf(j));
        c8Var.mo20603d(k8Var);
        c8Var.mo20604e(Boolean.valueOf(f13823e));
        Boolean bool = Boolean.TRUE;
        c8Var.mo20600a(bool);
        c8Var.mo20601b(bool);
        z8Var.mo21028h(c8Var.mo20605f());
        z8Var.mo21029i(C4949b.m18822c(this.f13824f));
        z8Var.mo21025e(a1Var.mo20564g());
        z8Var.mo21026f(a1Var2.mo20564g());
        int f = aVar.mo24129f();
        int d = f13822d.mo14983d(aVar);
        C7490x7 x7Var = new C7490x7();
        x7Var.mo20989a(f != -1 ? f != 35 ? f != 842094169 ? f != 16 ? f != 17 ? C7504y7.UNKNOWN_FORMAT : C7504y7.NV21 : C7504y7.NV16 : C7504y7.YV12 : C7504y7.YUV_420_888 : C7504y7.BITMAP);
        x7Var.mo20990b(Integer.valueOf(d));
        z8Var.mo21027g(x7Var.mo20991d());
        C7351n8 n8Var = new C7351n8();
        n8Var.mo20819e(Boolean.valueOf(this.f13829k));
        n8Var.mo20820f(z8Var.mo21030j());
        return C7194cb.m27197d(n8Var);
    }

    /* renamed from: k */
    public final /* synthetic */ C7194cb mo14961k(C7415s2 s2Var, int i, C7434t7 t7Var) {
        C7351n8 n8Var = new C7351n8();
        n8Var.mo20819e(Boolean.valueOf(this.f13829k));
        C7387q2 q2Var = new C7387q2();
        q2Var.mo20856a(Integer.valueOf(i));
        q2Var.mo20858c(s2Var);
        q2Var.mo20857b(t7Var);
        n8Var.mo20817c(q2Var.mo20859e());
        return C7194cb.m27197d(n8Var);
    }
}
