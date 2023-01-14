package p027c.p043d.p044a.p046l1.p049n;

import android.util.Range;
import androidx.camera.core.C0949o2;
import androidx.core.util.C1178i;
import p027c.p043d.p044a.C1521d0;
import p027c.p043d.p044a.p046l1.C1572g;
import p027c.p043d.p044a.p046l1.p050o.C1644l0;

/* renamed from: c.d.a.l1.n.d */
public final class C1606d implements C1178i<C1644l0> {

    /* renamed from: a */
    private final String f4906a;

    /* renamed from: b */
    private final int f4907b;

    /* renamed from: c */
    private final C1521d0 f4908c;

    /* renamed from: d */
    private final C1572g.C1579g f4909d;

    public C1606d(String str, int i, C1521d0 d0Var, C1572g.C1579g gVar) {
        this.f4906a = str;
        this.f4907b = i;
        this.f4908c = d0Var;
        this.f4909d = gVar;
    }

    /* renamed from: a */
    public C1644l0 get() {
        Range<Integer> b = this.f4908c.mo5634b();
        C0949o2.m3688a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        return C1644l0.m7116b().mo5833e(this.f4906a).mo5834f(this.f4907b).mo5832d(this.f4909d.mo5755d()).mo5835g(this.f4909d.mo5756e()).mo5831c(C1604b.m7073d(156000, this.f4909d.mo5755d(), 2, this.f4909d.mo5756e(), 48000, b)).mo5830b();
    }
}
