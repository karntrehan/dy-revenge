package p455g.p460t;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Collections;
import java.util.Map;
import p455g.C10314l;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.t.b0 */
class C10332b0 extends C10326a0 {
    /* renamed from: a */
    public static int m35030a(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m35031b(C10314l<? extends K, ? extends V> lVar) {
        C10457l.m35320e(lVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(lVar.mo25611c(), lVar.mo25612d());
        C10457l.m35319d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m35032c(Map<? extends K, ? extends V> map) {
        C10457l.m35320e(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C10457l.m35319d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
