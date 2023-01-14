package p027c.p043d.p044a.p046l1.p049n;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0711a0;
import androidx.core.util.C1178i;
import p027c.p043d.p044a.C1559j1;
import p027c.p043d.p044a.p046l1.p050o.C1625c1;

/* renamed from: c.d.a.l1.n.j */
public class C1615j implements C1178i<C1625c1> {

    /* renamed from: a */
    private final String f4919a;

    /* renamed from: b */
    private final C1559j1 f4920b;

    /* renamed from: c */
    private final Size f4921c;

    /* renamed from: d */
    private final C0711a0 f4922d;

    public C1615j(String str, C1559j1 j1Var, Size size, C0711a0 a0Var) {
        this.f4919a = str;
        this.f4920b = j1Var;
        this.f4921c = size;
        this.f4922d = a0Var;
    }

    /* renamed from: a */
    public C1625c1 get() {
        int a = C1614i.m7093a(this.f4920b);
        Range<Integer> c = this.f4920b.mo5710c();
        C0949o2.m3688a("VidEncCmcrdrPrflRslvr", "Using resolved VIDEO bitrate from CamcorderProfile");
        return C1625c1.m7099b().mo5806f(this.f4919a).mo5807g(this.f4921c).mo5802b(C1614i.m7094b(this.f4922d.mo2806k(), a, this.f4922d.mo2810o(), this.f4921c.getWidth(), this.f4922d.mo2811p(), this.f4921c.getHeight(), this.f4922d.mo2809n(), c)).mo5804d(a).mo5801a();
    }
}
