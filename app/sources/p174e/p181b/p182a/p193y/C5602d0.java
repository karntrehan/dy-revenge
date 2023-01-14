package p174e.p181b.p182a.p193y;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p174e.p181b.p182a.p188w.C5523a;
import p174e.p181b.p182a.p188w.p190k.C5561l;
import p174e.p181b.p182a.p193y.p194k0.C5618c;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.y.d0 */
public class C5602d0 implements C5614j0<C5561l> {

    /* renamed from: a */
    public static final C5602d0 f15887a = new C5602d0();

    /* renamed from: b */
    private static final C5618c.C5619a f15888b = C5618c.C5619a.m20942a("c", "v", "i", "o");

    private C5602d0() {
    }

    /* renamed from: b */
    public C5561l mo16853a(C5618c cVar, float f) {
        if (cVar.mo16868n0() == C5618c.C5620b.BEGIN_ARRAY) {
            cVar.mo16865b();
        }
        cVar.mo16867h();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (cVar.mo16860E()) {
            int u0 = cVar.mo16872u0(f15888b);
            if (u0 == 0) {
                z = cVar.mo16861I();
            } else if (u0 == 1) {
                list = C5627p.m20985f(cVar, f);
            } else if (u0 == 2) {
                list2 = C5627p.m20985f(cVar, f);
            } else if (u0 != 3) {
                cVar.mo16873v0();
                cVar.mo16874w0();
            } else {
                list3 = C5627p.m20985f(cVar, f);
            }
        }
        cVar.mo16870r();
        if (cVar.mo16868n0() == C5618c.C5620b.END_ARRAY) {
            cVar.mo16869o();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C5561l(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C5523a(C5646g.m21053a(list.get(i2), list3.get(i2)), C5646g.m21053a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C5523a(C5646g.m21053a(list.get(i3), list3.get(i3)), C5646g.m21053a(pointF3, list2.get(0)), pointF3));
            }
            return new C5561l(pointF, z, arrayList);
        }
    }
}
