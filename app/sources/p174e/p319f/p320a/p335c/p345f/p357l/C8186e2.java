package p174e.p319f.p320a.p335c.p345f.p357l;

import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4883f;
import com.google.firebase.p156m.p157h.C4886b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.a.c.f.l.e2 */
public final class C8186e2 implements C4886b<C8186e2> {

    /* renamed from: a */
    private static final C4881d<Object> f22213a = C8148c2.f22142a;

    /* renamed from: b */
    public static final /* synthetic */ int f22214b = 0;

    /* renamed from: c */
    private final Map<Class<?>, C4881d<?>> f22215c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C4883f<?>> f22216d = new HashMap();

    /* renamed from: e */
    private final C4881d<Object> f22217e = f22213a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4886b mo14861a(Class cls, C4881d dVar) {
        this.f22215c.put(cls, dVar);
        this.f22216d.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C8205f2 mo21758b() {
        return new C8205f2(new HashMap(this.f22215c), new HashMap(this.f22216d), this.f22217e);
    }
}
