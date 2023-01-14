package p174e.p319f.p320a.p335c.p345f.p354i;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e.f.a.c.f.i.ta */
public final class C7437ta implements C7507ya {

    /* renamed from: a */
    final List<C7507ya> f20003a;

    public C7437ta(Context context, C7423sa saVar) {
        ArrayList arrayList = new ArrayList();
        this.f20003a = arrayList;
        if (saVar.mo20866c()) {
            arrayList.add(new C7269hb(context, saVar));
        }
    }

    /* renamed from: a */
    public final void mo20753a(C7194cb cbVar) {
        for (C7507ya a : this.f20003a) {
            a.mo20753a(cbVar);
        }
    }
}
