package p174e.p319f.p416e.p432w;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.ArrayList;
import java.util.Map;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9657c;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9666l;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9669o;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9683e;
import p174e.p319f.p416e.p432w.p433d.C9777j;
import p174e.p319f.p416e.p432w.p435e.C9781a;
import p174e.p319f.p416e.p432w.p435e.C9782b;

/* renamed from: e.f.e.w.b */
public final class C9764b implements C9666l {
    /* renamed from: c */
    private static C9668n[] m33285c(C9657c cVar, Map<C9659e, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        C9782b b = C9781a.m33421b(cVar, map, z);
        for (C9670p[] next : b.mo24507b()) {
            C9683e i = C9777j.m33381i(b.mo24506a(), next[4], next[5], next[6], next[7], m33288f(next), m33286d(next));
            C9668n nVar = new C9668n(i.mo24289h(), i.mo24286e(), next, C9655a.PDF_417);
            nVar.mo24228h(C9669o.ERROR_CORRECTION_LEVEL, i.mo24283b());
            C9765c cVar2 = (C9765c) i.mo24285d();
            if (cVar2 != null) {
                nVar.mo24228h(C9669o.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(nVar);
        }
        return (C9668n[]) arrayList.toArray(new C9668n[arrayList.size()]);
    }

    /* renamed from: d */
    private static int m33286d(C9670p[] pVarArr) {
        return Math.max(Math.max(m33287e(pVarArr[0], pVarArr[4]), (m33287e(pVarArr[6], pVarArr[2]) * 17) / 18), Math.max(m33287e(pVarArr[1], pVarArr[5]), (m33287e(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    /* renamed from: e */
    private static int m33287e(C9670p pVar, C9670p pVar2) {
        if (pVar == null || pVar2 == null) {
            return 0;
        }
        return (int) Math.abs(pVar.mo24230c() - pVar2.mo24230c());
    }

    /* renamed from: f */
    private static int m33288f(C9670p[] pVarArr) {
        return Math.min(Math.min(m33289g(pVarArr[0], pVarArr[4]), (m33289g(pVarArr[6], pVarArr[2]) * 17) / 18), Math.min(m33289g(pVarArr[1], pVarArr[5]), (m33289g(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    /* renamed from: g */
    private static int m33289g(C9670p pVar, C9670p pVar2) {
        return (pVar == null || pVar2 == null) ? RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO : (int) Math.abs(pVar.mo24230c() - pVar2.mo24230c());
    }

    /* renamed from: a */
    public void mo24216a() {
    }

    /* renamed from: b */
    public C9668n mo24217b(C9657c cVar, Map<C9659e, ?> map) {
        C9668n[] c = m33285c(cVar, map, false);
        if (c != null && c.length != 0 && c[0] != null) {
            return c[0];
        }
        throw C9664j.m32854a();
    }
}
