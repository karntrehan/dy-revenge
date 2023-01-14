package p174e.p319f.p320a.p335c.p345f.p355j;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e.f.a.c.f.j.a7 */
public final class C7532a7 implements C7572e7 {

    /* renamed from: a */
    final List<C7572e7> f20270a;

    public C7532a7(Context context, C7767z6 z6Var) {
        ArrayList arrayList = new ArrayList();
        this.f20270a = arrayList;
        if (z6Var.mo21191c()) {
            arrayList.add(new C7651m7(context, z6Var));
        }
    }

    /* renamed from: a */
    public final void mo21043a(C7592g7 g7Var) {
        for (C7572e7 a : this.f20270a) {
            a.mo21043a(g7Var);
        }
    }
}
