package p174e.p319f.p320a.p322b.p323i;

import java.util.concurrent.Executor;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6596d;

/* renamed from: e.f.a.b.i.l */
public final class C6576l implements C6594b<Executor> {

    /* renamed from: e.f.a.b.i.l$a */
    private static final class C6577a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6576l f18196a = new C6576l();
    }

    /* renamed from: a */
    public static C6576l m25146a() {
        return C6577a.f18196a;
    }

    /* renamed from: b */
    public static Executor m25147b() {
        return (Executor) C6596d.m25200c(C6575k.m25145a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m25147b();
    }
}
