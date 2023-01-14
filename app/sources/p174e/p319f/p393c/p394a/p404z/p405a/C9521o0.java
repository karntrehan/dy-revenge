package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.Map;
import p174e.p319f.p393c.p394a.p404z.p405a.C9508l0;

/* renamed from: e.f.c.a.z.a.o0 */
class C9521o0 implements C9518n0 {
    C9521o0() {
    }

    /* renamed from: i */
    private static <K, V> int m32165i(int i, Object obj, Object obj2) {
        C9513m0 m0Var = (C9513m0) obj;
        C9508l0 l0Var = (C9508l0) obj2;
        int i2 = 0;
        if (m0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : m0Var.entrySet()) {
            i2 += l0Var.mo23816a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    private static <K, V> C9513m0<K, V> m32166j(Object obj, Object obj2) {
        C9513m0<K, V> m0Var = (C9513m0) obj;
        C9513m0 m0Var2 = (C9513m0) obj2;
        if (!m0Var2.isEmpty()) {
            if (!m0Var.mo23865k()) {
                m0Var = m0Var.mo23868n();
            }
            m0Var.mo23867m(m0Var2);
        }
        return m0Var;
    }

    /* renamed from: a */
    public Object mo23889a(Object obj, Object obj2) {
        return m32166j(obj, obj2);
    }

    /* renamed from: b */
    public Object mo23890b(Object obj) {
        ((C9513m0) obj).mo23866l();
        return obj;
    }

    /* renamed from: c */
    public C9508l0.C9509a<?, ?> mo23891c(Object obj) {
        return ((C9508l0) obj).mo23817c();
    }

    /* renamed from: d */
    public Map<?, ?> mo23892d(Object obj) {
        return (C9513m0) obj;
    }

    /* renamed from: e */
    public Object mo23893e(Object obj) {
        return C9513m0.m32130f().mo23868n();
    }

    /* renamed from: f */
    public int mo23894f(int i, Object obj, Object obj2) {
        return m32165i(i, obj, obj2);
    }

    /* renamed from: g */
    public boolean mo23895g(Object obj) {
        return !((C9513m0) obj).mo23865k();
    }

    /* renamed from: h */
    public Map<?, ?> mo23896h(Object obj) {
        return (C9513m0) obj;
    }
}
