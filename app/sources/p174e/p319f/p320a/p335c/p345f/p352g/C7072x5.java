package p174e.p319f.p320a.p335c.p345f.p352g;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: e.f.a.c.f.g.x5 */
final class C7072x5 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C7088y5 f19043a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7072x5(C7088y5 y5Var, Handler handler) {
        super((Handler) null);
        this.f19043a = y5Var;
    }

    public final void onChange(boolean z) {
        this.f19043a.mo20453f();
    }
}
