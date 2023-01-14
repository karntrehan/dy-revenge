package p174e.p319f.p320a.p322b.p323i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C3386j;
import com.google.android.datatransport.runtime.backends.C3389l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3412t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3417u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3418v;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3419w;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3420x;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3421y;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p174e.p319f.p320a.p322b.p323i.C6589u;
import p174e.p319f.p320a.p322b.p323i.p324a0.C6473c;
import p174e.p319f.p320a.p322b.p323i.p324a0.C6474d;
import p174e.p319f.p320a.p322b.p323i.p324a0.C6477g;
import p174e.p319f.p320a.p322b.p323i.p324a0.C6479i;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6508m0;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6511n0;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6513o0;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6516p0;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6521r0;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6527s0;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6532u0;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6554c;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6556d;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6593a;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6594b;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6595c;
import p174e.p319f.p320a.p322b.p323i.p329w.p330b.C6596d;

/* renamed from: e.f.a.b.i.f */
final class C6567f extends C6589u {

    /* renamed from: f */
    private Provider<Executor> f18180f;

    /* renamed from: o */
    private Provider<Context> f18181o;

    /* renamed from: p */
    private Provider f18182p;

    /* renamed from: q */
    private Provider f18183q;

    /* renamed from: r */
    private Provider f18184r;

    /* renamed from: s */
    private Provider<String> f18185s;

    /* renamed from: t */
    private Provider<C6521r0> f18186t;

    /* renamed from: u */
    private Provider<C3412t> f18187u;

    /* renamed from: v */
    private Provider<C3421y> f18188v;

    /* renamed from: w */
    private Provider<C6473c> f18189w;

    /* renamed from: x */
    private Provider<C3417u> f18190x;

    /* renamed from: y */
    private Provider<C3419w> f18191y;

    /* renamed from: z */
    private Provider<C6588t> f18192z;

    /* renamed from: e.f.a.b.i.f$b */
    private static final class C6569b implements C6589u.C6590a {

        /* renamed from: a */
        private Context f18193a;

        private C6569b() {
        }

        /* renamed from: b */
        public C6589u mo19368b() {
            C6596d.m25198a(this.f18193a, Context.class);
            return new C6567f(this.f18193a);
        }

        /* renamed from: c */
        public C6569b mo19367a(Context context) {
            this.f18193a = (Context) C6596d.m25199b(context);
            return this;
        }
    }

    private C6567f(Context context) {
        m25112o(context);
    }

    /* renamed from: h */
    public static C6589u.C6590a m25111h() {
        return new C6569b();
    }

    /* renamed from: o */
    private void m25112o(Context context) {
        this.f18180f = C6593a.m25195b(C6576l.m25146a());
        C6594b a = C6595c.m25197a(context);
        this.f18181o = a;
        C3386j a2 = C3386j.m13265a(a, C6554c.m25081a(), C6556d.m25085a());
        this.f18182p = a2;
        this.f18183q = C6593a.m25195b(C3389l.m13272a(this.f18181o, a2));
        this.f18184r = C6532u0.m25044a(this.f18181o, C6508m0.m24941a(), C6513o0.m24948a());
        this.f18185s = C6511n0.m24945a(this.f18181o);
        this.f18186t = C6593a.m25195b(C6527s0.m25032a(C6554c.m25081a(), C6556d.m25085a(), C6516p0.m24952a(), this.f18184r, this.f18185s));
        C6477g b = C6477g.m24887b(C6554c.m25081a());
        this.f18187u = b;
        C6479i a3 = C6479i.m24890a(this.f18181o, this.f18186t, b, C6556d.m25085a());
        this.f18188v = a3;
        Provider<Executor> provider = this.f18180f;
        Provider provider2 = this.f18183q;
        Provider<C6521r0> provider3 = this.f18186t;
        this.f18189w = C6474d.m24881a(provider, provider2, a3, provider3, provider3);
        Provider<Context> provider4 = this.f18181o;
        Provider provider5 = this.f18183q;
        Provider<C6521r0> provider6 = this.f18186t;
        this.f18190x = C3418v.m13339a(provider4, provider5, provider6, this.f18188v, this.f18180f, provider6, C6554c.m25081a(), C6556d.m25085a(), this.f18186t);
        Provider<Executor> provider7 = this.f18180f;
        Provider<C6521r0> provider8 = this.f18186t;
        this.f18191y = C3420x.m13347a(provider7, provider8, this.f18188v, provider8);
        this.f18192z = C6593a.m25195b(C6591v.m25191a(C6554c.m25081a(), C6556d.m25085a(), this.f18189w, this.f18190x, this.f18191y));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6501j0 mo19365a() {
        return this.f18186t.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6588t mo19366b() {
        return this.f18192z.get();
    }
}
