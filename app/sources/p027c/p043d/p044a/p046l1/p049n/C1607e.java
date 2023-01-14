package p027c.p043d.p044a.p046l1.p049n;

import android.util.Range;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0711a0;
import androidx.core.util.C1178i;
import p027c.p043d.p044a.C1521d0;
import p027c.p043d.p044a.p046l1.C1572g;

/* renamed from: c.d.a.l1.n.e */
public final class C1607e implements C1178i<C1572g.C1579g> {

    /* renamed from: a */
    private final C1521d0 f4910a;

    /* renamed from: b */
    private final C0711a0 f4911b;

    public C1607e(C1521d0 d0Var, C0711a0 a0Var) {
        this.f4910a = d0Var;
        this.f4911b = a0Var;
    }

    /* renamed from: a */
    public C1572g.C1579g get() {
        int b = C1604b.m7071b(this.f4910a);
        int c = C1604b.m7072c(this.f4910a);
        int c2 = this.f4910a.mo5635c();
        Range<Integer> d = this.f4910a.mo5636d();
        int c3 = this.f4911b.mo2798c();
        if (c2 == -1) {
            C0949o2.m3688a("AudioSrcCmcrdrPrflRslvr", "Resolved AUDIO channel count from CamcorderProfile: " + c3);
            c2 = c3;
        } else {
            C0949o2.m3688a("AudioSrcCmcrdrPrflRslvr", "Media spec AUDIO channel count overrides CamcorderProfile [CamcorderProfile channel count: " + c3 + ", Resolved Channel Count: " + c2 + "]");
        }
        int f = this.f4911b.mo2801f();
        int e = C1604b.m7074e(d, c2, c, f);
        C0949o2.m3688a("AudioSrcCmcrdrPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from CamcorderProfile: " + e + "Hz. [CamcorderProfile sample rate: " + f + "Hz]");
        return C1572g.C1579g.m7008a().mo5760d(b).mo5759c(c).mo5761e(c2).mo5762f(e).mo5758b();
    }
}
