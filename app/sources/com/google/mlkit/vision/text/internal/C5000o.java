package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.C3631f;
import com.google.mlkit.vision.common.internal.C4966d;
import p174e.p319f.p320a.p335c.p345f.p358m.C8595a8;
import p174e.p319f.p320a.p335c.p345f.p358m.C8621c8;
import p174e.p319f.p320a.p335c.p345f.p358m.C8675ga;
import p174e.p319f.p320a.p335c.p345f.p358m.C8701ia;
import p174e.p319f.p320a.p335c.p345f.p358m.C8714ja;
import p174e.p319f.p320a.p335c.p345f.p358m.C8726k9;
import p174e.p319f.p320a.p335c.p345f.p358m.C8739l9;
import p174e.p319f.p320a.p335c.p345f.p358m.C8763n7;
import p174e.p319f.p320a.p335c.p345f.p358m.C8776o7;
import p174e.p319f.p320a.p335c.p345f.p358m.C8828s7;
import p174e.p319f.p320a.p335c.p345f.p358m.C8831sa;
import p174e.p319f.p320a.p335c.p345f.p358m.C8836t2;
import p174e.p319f.p320a.p335c.p345f.p358m.C8916z7;
import p174e.p319f.p406d.p407a.C9585a;
import p174e.p319f.p406d.p407a.p409c.C9601f;
import p174e.p319f.p406d.p407a.p409c.C9606i;
import p174e.p319f.p406d.p411b.p413b.C9631a;
import p174e.p319f.p406d.p411b.p415d.C9641a;
import p174e.p319f.p406d.p411b.p415d.C9650e;

/* renamed from: com.google.mlkit.vision.text.internal.o */
public final class C5000o extends C9601f<C9641a, C9631a> {

    /* renamed from: d */
    static boolean f13927d = true;

    /* renamed from: e */
    private static final C4966d f13928e = C4966d.m18871b();

    /* renamed from: f */
    private final C4995j f13929f;

    /* renamed from: g */
    private final C8675ga f13930g;

    /* renamed from: h */
    private final C8701ia f13931h;

    /* renamed from: i */
    private final int f13932i;

    public C5000o(C9606i iVar, C9650e eVar) {
        C8675ga b = C8831sa.m29686b(eVar.mo24187b());
        Context b2 = iVar.mo24098b();
        C4995j bVar = (C3631f.m14110h().mo11504b(b2) >= 204700000 || eVar.mo24189d()) ? new C4987b(b2, eVar) : new C4988c(b2);
        int e = eVar.mo24190e();
        this.f13930g = b;
        this.f13929f = bVar;
        this.f13931h = C8701ia.m29518a(C9606i.m32708c().mo24098b());
        this.f13932i = e;
    }

    /* renamed from: j */
    static /* synthetic */ C8714ja m18929j(long j, C8916z7 z7Var, C9631a aVar) {
        C8726k9 k9Var = new C8726k9();
        C8828s7 s7Var = new C8828s7();
        s7Var.mo22636c(Long.valueOf(j));
        s7Var.mo22637d(z7Var);
        s7Var.mo22638e(Boolean.valueOf(f13927d));
        Boolean bool = Boolean.TRUE;
        s7Var.mo22634a(bool);
        s7Var.mo22635b(bool);
        k9Var.mo22506d(s7Var.mo22639f());
        C4966d dVar = f13928e;
        int c = dVar.mo14982c(aVar);
        int d = dVar.mo14983d(aVar);
        C8763n7 n7Var = new C8763n7();
        n7Var.mo22571a(c != -1 ? c != 35 ? c != 842094169 ? c != 16 ? c != 17 ? C8776o7.UNKNOWN_FORMAT : C8776o7.NV21 : C8776o7.NV16 : C8776o7.YV12 : C8776o7.YUV_420_888 : C8776o7.BITMAP);
        n7Var.mo22572b(Integer.valueOf(d));
        k9Var.mo22505c(n7Var.mo22573d());
        C8739l9 e = k9Var.mo22507e();
        C8621c8 c8Var = new C8621c8();
        c8Var.mo22332e(Boolean.FALSE);
        c8Var.mo22333f(e);
        return C8714ja.m29532d(c8Var);
    }

    /* renamed from: k */
    private final void m18930k(C8916z7 z7Var, long j, C9631a aVar) {
        C8916z7 z7Var2 = z7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f13930g.mo22425e(new C4999n(elapsedRealtime, z7Var2, aVar), C8595a8.ON_DEVICE_TEXT_DETECT);
        C8836t2 t2Var = new C8836t2();
        t2Var.mo22653a(z7Var2);
        t2Var.mo22654b(Boolean.valueOf(f13927d));
        long j2 = elapsedRealtime;
        this.f13930g.mo22426f(t2Var.mo22655c(), j2, C8595a8.AGGREGATED_ON_DEVICE_TEXT_DETECTION, C4998m.f13923a);
        long currentTimeMillis = System.currentTimeMillis();
        this.f13931h.mo22476c(this.f13932i, z7Var.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    /* renamed from: b */
    public final synchronized void mo14956b() {
        this.f13929f.zzb();
    }

    /* renamed from: d */
    public final synchronized void mo14957d() {
        f13927d = true;
        this.f13929f.mo15001a();
    }

    /* renamed from: i */
    public final synchronized C9641a mo14958h(C9631a aVar) {
        C9641a c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            c = this.f13929f.mo15002c(aVar);
            m18930k(C8916z7.NO_ERROR, elapsedRealtime, aVar);
            f13927d = false;
        } catch (C9585a e) {
            m18930k(e.mo24081a() == 14 ? C8916z7.MODEL_NOT_DOWNLOADED : C8916z7.UNKNOWN_ERROR, elapsedRealtime, aVar);
            throw e;
        }
        return c;
    }
}
