package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.animated.o */
class C2628o extends C2611b {

    /* renamed from: e */
    private final C2621l f7740e;

    /* renamed from: f */
    private final Map<String, Integer> f7741f = new HashMap();

    C2628o(ReadableMap readableMap, C2621l lVar) {
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f7741f.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f7740e = lVar;
    }

    /* renamed from: d */
    public String mo8421d() {
        StringBuilder sb = new StringBuilder();
        sb.append("StyleAnimatedNode[");
        sb.append(this.f7660d);
        sb.append("] mPropMapping: ");
        Map<String, Integer> map = this.f7741f;
        sb.append(map != null ? map.toString() : "null");
        return sb.toString();
    }

    /* renamed from: h */
    public void mo8459h(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry next : this.f7741f.entrySet()) {
            C2611b o = this.f7740e.mo8442o(((Integer) next.getValue()).intValue());
            if (o == null) {
                throw new IllegalArgumentException("Mapped style node does not exists");
            } else if (o instanceof C2631r) {
                ((C2631r) o).mo8460h(javaOnlyMap);
            } else if (o instanceof C2636s) {
                javaOnlyMap.putDouble((String) next.getKey(), ((C2636s) o).mo8464k());
            } else {
                throw new IllegalArgumentException("Unsupported type of node used in property node " + o.getClass());
            }
        }
    }
}
