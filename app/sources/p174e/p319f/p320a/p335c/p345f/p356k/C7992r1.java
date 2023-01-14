package p174e.p319f.p320a.p335c.p345f.p356k;

import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4883f;
import com.google.firebase.p156m.p157h.C4886b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.a.c.f.k.r1 */
public final class C7992r1 implements C4886b<C7992r1> {

    /* renamed from: a */
    private static final C4881d<Object> f21735a = C7979q1.f21706a;

    /* renamed from: b */
    public static final /* synthetic */ int f21736b = 0;

    /* renamed from: c */
    private final Map<Class<?>, C4881d<?>> f21737c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C4883f<?>> f21738d = new HashMap();

    /* renamed from: e */
    private final C4881d<Object> f21739e = f21735a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4886b mo14861a(Class cls, C4881d dVar) {
        this.f21737c.put(cls, dVar);
        this.f21738d.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C8005s1 mo21558b() {
        return new C8005s1(new HashMap(this.f21737c), new HashMap(this.f21738d), this.f21739e);
    }
}
