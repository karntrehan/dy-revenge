package p027c.p043d.p044a.p046l1.p049n;

import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0711a0;
import androidx.core.util.C1178i;
import p027c.p043d.p044a.C1521d0;
import p027c.p043d.p044a.p046l1.C1572g;
import p027c.p043d.p044a.p046l1.p050o.C1644l0;

/* renamed from: c.d.a.l1.n.c */
public final class C1605c implements C1178i<C1644l0> {

    /* renamed from: a */
    private final String f4901a;

    /* renamed from: b */
    private final int f4902b;

    /* renamed from: c */
    private final C1521d0 f4903c;

    /* renamed from: d */
    private final C1572g.C1579g f4904d;

    /* renamed from: e */
    private final C0711a0 f4905e;

    public C1605c(String str, int i, C1521d0 d0Var, C1572g.C1579g gVar, C0711a0 a0Var) {
        this.f4901a = str;
        this.f4902b = i;
        this.f4903c = d0Var;
        this.f4904d = gVar;
        this.f4905e = a0Var;
    }

    /* renamed from: a */
    public C1644l0 get() {
        C0949o2.m3688a("AudioEncCmcrdrPrflRslvr", "Using resolved AUDIO bitrate from CamcorderProfile");
        return C1644l0.m7116b().mo5833e(this.f4901a).mo5834f(this.f4902b).mo5832d(this.f4904d.mo5755d()).mo5835g(this.f4904d.mo5756e()).mo5831c(C1604b.m7073d(this.f4905e.mo2797b(), this.f4904d.mo5755d(), this.f4905e.mo2798c(), this.f4904d.mo5756e(), this.f4905e.mo2801f(), this.f4903c.mo5634b())).mo5830b();
    }
}
