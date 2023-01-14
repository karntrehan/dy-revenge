package androidx.camera.core.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.k1 */
public final class C0831k1 {

    /* renamed from: a */
    private static final Object f2456a = new Object();

    /* renamed from: b */
    private static final Map<Object, C0857p0> f2457b = new HashMap();

    /* renamed from: a */
    public static void m3261a(Object obj, C0857p0 p0Var) {
        synchronized (f2456a) {
            f2457b.put(obj, p0Var);
        }
    }

    /* renamed from: b */
    public static C0857p0 m3262b(Object obj) {
        C0857p0 p0Var;
        synchronized (f2456a) {
            p0Var = f2457b.get(obj);
        }
        return p0Var == null ? C0857p0.f2507a : p0Var;
    }
}
