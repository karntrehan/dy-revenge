package p174e.p319f.p320a.p335c.p360g;

import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.Scope;
import p174e.p319f.p320a.p335c.p360g.p361b.C8922a;

/* renamed from: e.f.a.c.g.f */
public final class C8938f {

    /* renamed from: a */
    public static final C3469a.C3479g<C8922a> f24338a;

    /* renamed from: b */
    public static final C3469a.C3479g<C8922a> f24339b;

    /* renamed from: c */
    public static final C3469a.C3470a<C8922a, C8921a> f24340c;

    /* renamed from: d */
    static final C3469a.C3470a<C8922a, C8937e> f24341d;

    /* renamed from: e */
    public static final Scope f24342e = new Scope("profile");

    /* renamed from: f */
    public static final Scope f24343f = new Scope("email");

    /* renamed from: g */
    public static final C3469a<C8921a> f24344g;

    /* renamed from: h */
    public static final C3469a<C8937e> f24345h;

    static {
        C3469a.C3479g<C8922a> gVar = new C3469a.C3479g<>();
        f24338a = gVar;
        C3469a.C3479g<C8922a> gVar2 = new C3469a.C3479g<>();
        f24339b = gVar2;
        C8935c cVar = new C8935c();
        f24340c = cVar;
        C8936d dVar = new C8936d();
        f24341d = dVar;
        f24344g = new C3469a<>("SignIn.API", cVar, gVar);
        f24345h = new C3469a<>("SignIn.INTERNAL_API", dVar, gVar2);
    }
}
