package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.m8 */
public final class C6899m8 {

    /* renamed from: a */
    private static volatile C6899m8 f18629a;

    /* renamed from: b */
    private static volatile C6899m8 f18630b;

    /* renamed from: c */
    static final C6899m8 f18631c = new C6899m8(true);

    /* renamed from: d */
    private final Map f18632d;

    C6899m8() {
        this.f18632d = new HashMap();
    }

    C6899m8(boolean z) {
        this.f18632d = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C6899m8 m26140a() {
        C6899m8 m8Var = f18629a;
        if (m8Var == null) {
            synchronized (C6899m8.class) {
                m8Var = f18629a;
                if (m8Var == null) {
                    m8Var = f18631c;
                    f18629a = m8Var;
                }
            }
        }
        return m8Var;
    }

    /* renamed from: b */
    public static C6899m8 m26141b() {
        Class<C6899m8> cls = C6899m8.class;
        C6899m8 m8Var = f18630b;
        if (m8Var != null) {
            return m8Var;
        }
        synchronized (cls) {
            C6899m8 m8Var2 = f18630b;
            if (m8Var2 != null) {
                return m8Var2;
            }
            C6899m8 b = C7027u8.m26737b(cls);
            f18630b = b;
            return b;
        }
    }

    /* renamed from: c */
    public final C7107z8 mo19951c(C6805ga gaVar, int i) {
        return (C7107z8) this.f18632d.get(new C6883l8(gaVar, i));
    }
}
