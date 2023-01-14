package p174e.p319f.p320a.p335c.p345f.p355j;

import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4883f;
import com.google.firebase.p156m.p157h.C4886b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.a.c.f.j.c */
public final class C7544c implements C4886b<C7544c> {

    /* renamed from: a */
    private static final C4881d<Object> f20295a = C7534b.f20274a;

    /* renamed from: b */
    public static final /* synthetic */ int f20296b = 0;

    /* renamed from: c */
    private final Map<Class<?>, C4881d<?>> f20297c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C4883f<?>> f20298d = new HashMap();

    /* renamed from: e */
    private final C4881d<Object> f20299e = f20295a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4886b mo14861a(Class cls, C4881d dVar) {
        this.f20297c.put(cls, dVar);
        this.f20298d.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C7554d mo21057b() {
        return new C7554d(new HashMap(this.f20297c), new HashMap(this.f20298d), this.f20299e);
    }
}
