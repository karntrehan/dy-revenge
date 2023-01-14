package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.c2 */
public class C0791c2 extends C0891u2 {
    private C0791c2(Map<String, Object> map) {
        super(map);
    }

    /* renamed from: f */
    public static C0791c2 m3136f() {
        return new C0791c2(new ArrayMap());
    }

    /* renamed from: g */
    public static C0791c2 m3137g(C0891u2 u2Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String next : u2Var.mo3115d()) {
            arrayMap.put(next, u2Var.mo3114c(next));
        }
        return new C0791c2(arrayMap);
    }

    /* renamed from: e */
    public void mo2971e(C0891u2 u2Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f2568b;
        if (map2 != null && (map = u2Var.f2568b) != null) {
            map2.putAll(map);
        }
    }

    /* renamed from: h */
    public void mo2972h(String str, Object obj) {
        this.f2568b.put(str, obj);
    }
}
