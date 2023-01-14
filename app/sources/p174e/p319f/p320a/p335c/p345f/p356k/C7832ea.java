package p174e.p319f.p320a.p335c.p345f.p356k;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e.f.a.c.f.k.ea */
public final class C7832ea implements C7897ja {

    /* renamed from: a */
    final List<C7897ja> f21376a;

    public C7832ea(Context context, C7819da daVar) {
        ArrayList arrayList = new ArrayList();
        this.f21376a = arrayList;
        if (daVar.mo21233c()) {
            arrayList.add(new C8027ta(context, daVar));
        }
    }

    /* renamed from: a */
    public final void mo21320a(C7962oa oaVar) {
        for (C7897ja a : this.f21376a) {
            a.mo21320a(oaVar);
        }
    }
}
