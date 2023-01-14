package p174e.p199d.p218c.p238w.p239h;

import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.p238w.p240i.C5927i;

/* renamed from: e.d.c.w.h.l */
public class C5907l extends C5903i<C5908a> {

    /* renamed from: e.d.c.w.h.l$a */
    class C5908a extends C5902h {

        /* renamed from: d */
        int f16425d;

        /* renamed from: e */
        long f16426e;

        /* renamed from: f */
        int f16427f;

        /* renamed from: g */
        int f16428g;

        /* renamed from: h */
        int f16429h;

        /* renamed from: i */
        int[] f16430i;
    }

    public C5907l(C5714o oVar, C5894a aVar) {
        super(oVar, aVar);
    }

    /* renamed from: b */
    public void mo17836b(C5927i iVar) {
        String str;
        boolean z = false;
        C5908a aVar = (C5908a) this.f16414f.get(0);
        iVar.mo17117B(1, (aVar.f16425d & 536870912) == 536870912);
        iVar.mo17117B(2, (aVar.f16425d & 1073741824) == 1073741824);
        if ((aVar.f16425d & -1073741824) == -1073741824) {
            z = true;
        }
        iVar.mo17117B(3, z);
        iVar.mo17127L(4, aVar.f16426e);
        iVar.mo17125J(5, aVar.f16427f);
        int i = aVar.f16428g;
        if (i == 1) {
            str = "Bold";
        } else if (i != 2) {
            if (i == 4) {
                str = "Underline";
            }
            iVar.mo17125J(7, aVar.f16429h);
            iVar.mo17126K(8, aVar.f16430i);
        } else {
            str = "Italic";
        }
        iVar.mo17133R(6, str);
        iVar.mo17125J(7, aVar.f16429h);
        iVar.mo17126K(8, aVar.f16430i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5908a mo17830a(C5714o oVar) {
        return null;
    }
}
