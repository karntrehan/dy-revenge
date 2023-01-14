package p027c.p043d.p044a.p046l1.p049n;

import android.util.Range;
import androidx.camera.core.C0949o2;
import androidx.core.util.C1178i;
import p027c.p043d.p044a.C1521d0;
import p027c.p043d.p044a.p046l1.C1572g;

/* renamed from: c.d.a.l1.n.f */
public final class C1608f implements C1178i<C1572g.C1579g> {

    /* renamed from: a */
    private final C1521d0 f4912a;

    public C1608f(C1521d0 d0Var) {
        this.f4912a = d0Var;
    }

    /* renamed from: a */
    public C1572g.C1579g get() {
        String str;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        int i;
        int b = C1604b.m7071b(this.f4912a);
        int c = C1604b.m7072c(this.f4912a);
        int c2 = this.f4912a.mo5635c();
        if (c2 == -1) {
            c2 = 1;
            sb = new StringBuilder();
            str = "Using fallback AUDIO channel count: ";
        } else {
            sb = new StringBuilder();
            str = "Using supplied AUDIO channel count: ";
        }
        sb.append(str);
        sb.append(c2);
        C0949o2.m3688a("DefAudioSrcResolver", sb.toString());
        Range<Integer> d = this.f4912a.mo5636d();
        if (C1521d0.f4768b.equals(d)) {
            i = 44100;
            sb2 = new StringBuilder();
            str2 = "Using fallback AUDIO sample rate: ";
        } else {
            i = C1604b.m7074e(d, c2, c, d.getUpper().intValue());
            sb2 = new StringBuilder();
            str2 = "Using AUDIO sample rate resolved from AudioSpec: ";
        }
        sb2.append(str2);
        sb2.append(i);
        sb2.append("Hz");
        C0949o2.m3688a("DefAudioSrcResolver", sb2.toString());
        return C1572g.C1579g.m7008a().mo5760d(b).mo5759c(c).mo5761e(c2).mo5762f(i).mo5758b();
    }
}
