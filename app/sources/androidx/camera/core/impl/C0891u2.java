package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.u2 */
public class C0891u2 {

    /* renamed from: a */
    private static final C0891u2 f2567a = new C0891u2(new ArrayMap());

    /* renamed from: b */
    protected final Map<String, Object> f2568b;

    protected C0891u2(Map<String, Object> map) {
        this.f2568b = map;
    }

    /* renamed from: a */
    public static C0891u2 m3514a() {
        return f2567a;
    }

    /* renamed from: b */
    public static C0891u2 m3515b(C0891u2 u2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String next : u2Var.mo3115d()) {
            arrayMap.put(next, u2Var.mo3114c(next));
        }
        return new C0891u2(arrayMap);
    }

    /* renamed from: c */
    public Object mo3114c(String str) {
        return this.f2568b.get(str);
    }

    /* renamed from: d */
    public Set<String> mo3115d() {
        return this.f2568b.keySet();
    }
}
