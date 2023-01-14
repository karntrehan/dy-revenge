package p174e.p181b.p182a.p193y;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p027c.p060f.C1793d;
import p027c.p060f.C1802h;
import p174e.p181b.p182a.C5433e;
import p174e.p181b.p182a.C5458h;
import p174e.p181b.p182a.p188w.C5526c;
import p174e.p181b.p182a.p188w.C5527d;
import p174e.p181b.p182a.p188w.C5531h;
import p174e.p181b.p182a.p188w.p191l.C5577d;
import p174e.p181b.p182a.p193y.p194k0.C5618c;
import p174e.p181b.p182a.p195z.C5643d;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.y.t */
public class C5633t {

    /* renamed from: a */
    private static final C5618c.C5619a f15953a = C5618c.C5619a.m20942a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static C5618c.C5619a f15954b = C5618c.C5619a.m20942a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final C5618c.C5619a f15955c = C5618c.C5619a.m20942a("list");

    /* renamed from: d */
    private static final C5618c.C5619a f15956d = C5618c.C5619a.m20942a("cm", "tm", "dr");

    /* renamed from: a */
    public static C5433e m20999a(C5618c cVar) {
        ArrayList arrayList;
        HashMap hashMap;
        C5618c cVar2 = cVar;
        float e = C5647h.m21070e();
        C1793d dVar = new C1793d();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C1802h hVar = new C1802h();
        C5433e eVar = new C5433e();
        cVar.mo16867h();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (cVar.mo16860E()) {
            switch (cVar2.mo16872u0(f15953a)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = cVar.mo16863W();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = cVar.mo16863W();
                    continue;
                case 2:
                    HashMap hashMap7 = hashMap4;
                    ArrayList arrayList6 = arrayList3;
                    f = (float) cVar.mo16862L();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) cVar.mo16862L()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) cVar.mo16862L();
                    break;
                case 5:
                    String[] split = cVar.mo16866e0().split("\\.");
                    if (!C5647h.m21075j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        eVar.mo16455a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    m21003e(cVar2, eVar, arrayList2, dVar);
                    break;
                case 7:
                    m21000b(cVar2, eVar, hashMap2, hashMap3);
                    break;
                case 8:
                    m21002d(cVar2, hashMap4);
                    break;
                case 9:
                    m21001c(cVar2, eVar, hVar);
                    break;
                case 10:
                    m21004f(cVar2, eVar, arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.mo16873v0();
                    cVar.mo16874w0();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        ArrayList arrayList7 = arrayList3;
        eVar.mo16473s(new Rect(0, 0, (int) (((float) i) * e), (int) (((float) i2) * e)), f, f2, f3, arrayList2, dVar, hashMap2, hashMap3, hVar, hashMap4, arrayList3);
        return eVar;
    }

    /* renamed from: b */
    private static void m21000b(C5618c cVar, C5433e eVar, Map<String, List<C5577d>> map, Map<String, C5458h> map2) {
        cVar.mo16865b();
        while (cVar.mo16860E()) {
            ArrayList arrayList = new ArrayList();
            C1793d dVar = new C1793d();
            cVar.mo16867h();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (cVar.mo16860E()) {
                int u0 = cVar.mo16872u0(f15954b);
                if (u0 == 0) {
                    str = cVar.mo16866e0();
                } else if (u0 == 1) {
                    cVar.mo16865b();
                    while (cVar.mo16860E()) {
                        C5577d b = C5631s.m20998b(cVar, eVar);
                        dVar.mo6169m(b.mo16818b(), b);
                        arrayList.add(b);
                    }
                    cVar.mo16869o();
                } else if (u0 == 2) {
                    i = cVar.mo16863W();
                } else if (u0 == 3) {
                    i2 = cVar.mo16863W();
                } else if (u0 == 4) {
                    str2 = cVar.mo16866e0();
                } else if (u0 != 5) {
                    cVar.mo16873v0();
                    cVar.mo16874w0();
                } else {
                    str3 = cVar.mo16866e0();
                }
            }
            cVar.mo16870r();
            if (str2 != null) {
                C5458h hVar = new C5458h(i, i2, str, str2, str3);
                map2.put(hVar.mo16563d(), hVar);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.mo16869o();
    }

    /* renamed from: c */
    private static void m21001c(C5618c cVar, C5433e eVar, C1802h<C5527d> hVar) {
        cVar.mo16865b();
        while (cVar.mo16860E()) {
            C5527d a = C5613j.m20919a(cVar, eVar);
            hVar.mo6281m(a.hashCode(), a);
        }
        cVar.mo16869o();
    }

    /* renamed from: d */
    private static void m21002d(C5618c cVar, Map<String, C5526c> map) {
        cVar.mo16867h();
        while (cVar.mo16860E()) {
            if (cVar.mo16872u0(f15955c) != 0) {
                cVar.mo16873v0();
                cVar.mo16874w0();
            } else {
                cVar.mo16865b();
                while (cVar.mo16860E()) {
                    C5526c a = C5615k.m20921a(cVar);
                    map.put(a.mo16672b(), a);
                }
                cVar.mo16869o();
            }
        }
        cVar.mo16870r();
    }

    /* renamed from: e */
    private static void m21003e(C5618c cVar, C5433e eVar, List<C5577d> list, C1793d<C5577d> dVar) {
        cVar.mo16865b();
        int i = 0;
        while (cVar.mo16860E()) {
            C5577d b = C5631s.m20998b(cVar, eVar);
            if (b.mo16820d() == C5577d.C5578a.IMAGE) {
                i++;
            }
            list.add(b);
            dVar.mo6169m(b.mo16818b(), b);
            if (i > 4) {
                C5643d.m21027c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.mo16869o();
    }

    /* renamed from: f */
    private static void m21004f(C5618c cVar, C5433e eVar, List<C5531h> list) {
        cVar.mo16865b();
        while (cVar.mo16860E()) {
            String str = null;
            cVar.mo16867h();
            float f = 0.0f;
            float f2 = 0.0f;
            while (cVar.mo16860E()) {
                int u0 = cVar.mo16872u0(f15956d);
                if (u0 == 0) {
                    str = cVar.mo16866e0();
                } else if (u0 == 1) {
                    f = (float) cVar.mo16862L();
                } else if (u0 != 2) {
                    cVar.mo16873v0();
                    cVar.mo16874w0();
                } else {
                    f2 = (float) cVar.mo16862L();
                }
            }
            cVar.mo16870r();
            list.add(new C5531h(str, f, f2));
        }
        cVar.mo16869o();
    }
}
