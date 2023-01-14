package p174e.p319f.p320a.p322b.p323i.p324a0;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3406p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3411s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3412t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3421y;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;

/* renamed from: e.f.a.b.i.a0.h */
public abstract class C6478h {
    /* renamed from: a */
    static C3421y m24889a(Context context, C6501j0 j0Var, C3412t tVar, C6552a aVar) {
        return Build.VERSION.SDK_INT >= 21 ? new C3411s(context, j0Var, tVar) : new C3406p(context, j0Var, aVar, tVar);
    }
}
