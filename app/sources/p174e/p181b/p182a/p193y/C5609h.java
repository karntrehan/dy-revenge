package p174e.p181b.p182a.p193y;

import p174e.p181b.p182a.p188w.C5524b;
import p174e.p181b.p182a.p193y.p194k0.C5618c;

/* renamed from: e.b.a.y.h */
public class C5609h implements C5614j0<C5524b> {

    /* renamed from: a */
    public static final C5609h f15895a = new C5609h();

    /* renamed from: b */
    private static final C5618c.C5619a f15896b = C5618c.C5619a.m20942a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C5609h() {
    }

    /* renamed from: b */
    public C5524b mo16853a(C5618c cVar, float f) {
        C5524b.C5525a aVar = C5524b.C5525a.CENTER;
        cVar.mo16867h();
        C5524b.C5525a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (cVar.mo16860E()) {
            switch (cVar.mo16872u0(f15896b)) {
                case 0:
                    str = cVar.mo16866e0();
                    break;
                case 1:
                    str2 = cVar.mo16866e0();
                    break;
                case 2:
                    f2 = (float) cVar.mo16862L();
                    break;
                case 3:
                    int W = cVar.mo16863W();
                    aVar2 = C5524b.C5525a.CENTER;
                    if (W <= aVar2.ordinal() && W >= 0) {
                        aVar2 = C5524b.C5525a.values()[W];
                        break;
                    }
                case 4:
                    i = cVar.mo16863W();
                    break;
                case 5:
                    f3 = (float) cVar.mo16862L();
                    break;
                case 6:
                    f4 = (float) cVar.mo16862L();
                    break;
                case 7:
                    i2 = C5627p.m20983d(cVar);
                    break;
                case 8:
                    i3 = C5627p.m20983d(cVar);
                    break;
                case 9:
                    f5 = (float) cVar.mo16862L();
                    break;
                case 10:
                    z = cVar.mo16861I();
                    break;
                default:
                    cVar.mo16873v0();
                    cVar.mo16874w0();
                    break;
            }
        }
        C5618c cVar2 = cVar;
        cVar.mo16870r();
        return new C5524b(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z);
    }
}
