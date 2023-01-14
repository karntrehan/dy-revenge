package p174e.p319f.p320a.p335c.p345f.p358m;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e.f.a.c.f.m.ba */
public final class C8610ba implements C8662fa {

    /* renamed from: a */
    final List<C8662fa> f23597a;

    public C8610ba(Context context, C8597aa aaVar) {
        ArrayList arrayList = new ArrayList();
        this.f23597a = arrayList;
        if (aaVar.mo22311c()) {
            arrayList.add(new C8792pa(context, aaVar));
        }
    }

    /* renamed from: a */
    public final void mo22318a(C8714ja jaVar) {
        for (C8662fa a : this.f23597a) {
            a.mo22318a(jaVar);
        }
    }
}
