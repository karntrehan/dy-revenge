package p027c.p043d.p044a.p046l1.p049n;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.C0949o2;
import androidx.core.util.C1178i;
import p027c.p043d.p044a.C1559j1;
import p027c.p043d.p044a.p046l1.p050o.C1625c1;

/* renamed from: c.d.a.l1.n.k */
public class C1616k implements C1178i<C1625c1> {

    /* renamed from: a */
    private static final Size f4923a = new Size(1280, 720);

    /* renamed from: b */
    private final String f4924b;

    /* renamed from: c */
    private final C1559j1 f4925c;

    /* renamed from: d */
    private final Size f4926d;

    public C1616k(String str, C1559j1 j1Var, Size size) {
        this.f4924b = str;
        this.f4925c = j1Var;
        this.f4926d = size;
    }

    /* renamed from: a */
    public C1625c1 get() {
        int a = C1614i.m7093a(this.f4925c);
        Range<Integer> c = this.f4925c.mo5710c();
        C0949o2.m3688a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int width = this.f4926d.getWidth();
        Size size = f4923a;
        return C1625c1.m7099b().mo5806f(this.f4924b).mo5807g(this.f4926d).mo5802b(C1614i.m7094b(14000000, a, 30, width, size.getWidth(), this.f4926d.getHeight(), size.getHeight(), c)).mo5804d(a).mo5801a();
    }
}
