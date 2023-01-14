package p174e.p319f.p320a.p322b.p323i;

import android.content.Context;
import java.io.Closeable;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;

/* renamed from: e.f.a.b.i.u */
abstract class C6589u implements Closeable {

    /* renamed from: e.f.a.b.i.u$a */
    interface C6590a {
        /* renamed from: a */
        C6590a mo19367a(Context context);

        /* renamed from: b */
        C6589u mo19368b();
    }

    C6589u() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C6501j0 mo19365a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C6588t mo19366b();

    public void close() {
        mo19365a().close();
    }
}
