package p174e.p319f.p320a.p335c.p345f.p358m;

import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4883f;
import com.google.firebase.p156m.p157h.C4886b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.a.c.f.m.w1 */
public final class C8874w1 implements C4886b<C8874w1> {

    /* renamed from: a */
    private static final C4881d<Object> f24178a = C8861v1.f24153a;

    /* renamed from: b */
    public static final /* synthetic */ int f24179b = 0;

    /* renamed from: c */
    private final Map<Class<?>, C4881d<?>> f24180c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C4883f<?>> f24181d = new HashMap();

    /* renamed from: e */
    private final C4881d<Object> f24182e = f24178a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4886b mo14861a(Class cls, C4881d dVar) {
        this.f24180c.put(cls, dVar);
        this.f24181d.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C8886x1 mo22685b() {
        return new C8886x1(new HashMap(this.f24180c), new HashMap(this.f24181d), this.f24182e);
    }
}
