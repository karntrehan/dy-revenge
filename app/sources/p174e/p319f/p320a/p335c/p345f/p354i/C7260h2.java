package p174e.p319f.p320a.p335c.p345f.p354i;

import com.google.firebase.p156m.C4881d;
import com.google.firebase.p156m.C4883f;
import com.google.firebase.p156m.p157h.C4886b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.a.c.f.i.h2 */
public final class C7260h2 implements C4886b<C7260h2> {

    /* renamed from: a */
    private static final C4881d<Object> f19344a = C7245g2.f19309a;

    /* renamed from: b */
    public static final /* synthetic */ int f19345b = 0;

    /* renamed from: c */
    private final Map<Class<?>, C4881d<?>> f19346c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C4883f<?>> f19347d = new HashMap();

    /* renamed from: e */
    private final C4881d<Object> f19348e = f19344a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C4886b mo14861a(Class cls, C4881d dVar) {
        this.f19346c.put(cls, dVar);
        this.f19347d.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C7275i2 mo20751b() {
        return new C7275i2(new HashMap(this.f19346c), new HashMap(this.f19347d), this.f19348e);
    }
}
