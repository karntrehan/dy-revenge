package p174e.p319f.p320a.p335c.p345f.p357l;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e.f.a.c.f.l.fa */
public final class C8213fa implements C8289ja {

    /* renamed from: a */
    final List<C8289ja> f22496a;

    public C8213fa(Context context, C8194ea eaVar) {
        ArrayList arrayList = new ArrayList();
        this.f22496a = arrayList;
        if (eaVar.mo21706c()) {
            arrayList.add(new C8471ta(context, eaVar));
        }
    }

    /* renamed from: a */
    public final void mo21786a(C8381oa oaVar) {
        for (C8289ja a : this.f22496a) {
            a.mo21786a(oaVar);
        }
    }
}
