package com.facebook.react.uimanager;

import com.facebook.react.common.C2693e;
import com.facebook.systrace.C3296b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.w0 */
class C3055w0 {
    /* renamed from: a */
    static Map<String, Object> m12098a(C2963f1 f1Var) {
        Map<String, Object> b = C3053v0.m12095b();
        b.put("ViewManagerNames", f1Var.mo8385a());
        b.put("LazyViewManagersEnabled", Boolean.TRUE);
        return b;
    }

    /* renamed from: b */
    static Map<String, Object> m12099b(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> b = C3053v0.m12095b();
        Map a = C3053v0.m12094a();
        Map c = C3053v0.m12096c();
        if (map != null) {
            map.putAll(a);
        }
        if (map2 != null) {
            map2.putAll(c);
        }
        for (ViewManager next : list) {
            String name = next.getName();
            C3296b.m12892a(0, "UIManagerModuleConstantsHelper.createConstants").mo10751b("ViewManager", name).mo10751b("Lazy", Boolean.FALSE).mo10752c();
            try {
                Map<String, Object> c2 = m12100c(next, (Map) null, (Map) null, map, map2);
                if (!c2.isEmpty()) {
                    b.put(name, c2);
                }
            } finally {
                C3296b.m12893b(0);
            }
        }
        b.put("genericBubblingEventTypes", a);
        b.put("genericDirectEventTypes", c);
        return b;
    }

    /* renamed from: c */
    static Map<String, Object> m12100c(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap b = C2693e.m10912b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            m12102e(map3, exportedCustomBubblingEventTypeConstants);
            m12102e(exportedCustomBubblingEventTypeConstants, map);
            b.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            b.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            m12102e(map4, exportedCustomDirectEventTypeConstants);
            m12102e(exportedCustomDirectEventTypeConstants, map2);
            b.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            b.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            b.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            b.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            b.put("NativeProps", nativeProps);
        }
        return b;
    }

    /* renamed from: d */
    static Map<String, Object> m12101d() {
        return C2693e.m10915e("bubblingEventTypes", C3053v0.m12094a(), "directEventTypes", C3053v0.m12096c());
    }

    /* renamed from: e */
    private static void m12102e(Map map, Map map2) {
        if (map != null && map2 != null && !map2.isEmpty()) {
            for (Object next : map2.keySet()) {
                Object obj = map2.get(next);
                Object obj2 = map.get(next);
                if (obj2 == null || !(obj instanceof Map) || !(obj2 instanceof Map)) {
                    map.put(next, obj);
                } else {
                    m12102e((Map) obj2, (Map) obj);
                }
            }
        }
    }
}
