package com.google.android.gms.measurement.internal;

import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p352g.C7081xe;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
final class C3812a5 implements C7081xe {

    /* renamed from: a */
    final /* synthetic */ C3838c5 f10509a;

    C3812a5(C3838c5 c5Var) {
        this.f10509a = c5Var;
    }

    /* renamed from: a */
    public final void mo11848a(int i, String str, List list, boolean z, boolean z2) {
        C4098x3 x3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            x3Var = this.f10509a.f10651a.mo11935b().mo12543q();
        } else if (i2 == 1) {
            C4122z3 b = this.f10509a.f10651a.mo11935b();
            x3Var = z ? b.mo12546t() : !z2 ? b.mo12545s() : b.mo12544r();
        } else if (i2 == 3) {
            x3Var = this.f10509a.f10651a.mo11935b().mo12548v();
        } else if (i2 != 4) {
            x3Var = this.f10509a.f10651a.mo11935b().mo12547u();
        } else {
            C4122z3 b2 = this.f10509a.f10651a.mo11935b();
            x3Var = z ? b2.mo12551y() : !z2 ? b2.mo12550x() : b2.mo12549w();
        }
        int size = list.size();
        if (size == 1) {
            x3Var.mo12477b(str, list.get(0));
        } else if (size == 2) {
            x3Var.mo12478c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            x3Var.mo12476a(str);
        } else {
            x3Var.mo12479d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
