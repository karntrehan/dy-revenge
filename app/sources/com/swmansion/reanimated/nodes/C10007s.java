package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.C9911d;
import com.swmansion.reanimated.C9921h;
import java.util.Map;

/* renamed from: com.swmansion.reanimated.nodes.s */
public class C10007s extends C9965m {

    /* renamed from: a */
    private final Map<String, Integer> f26714a;

    public C10007s(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26714a = C9921h.m33810b(readableMap.getMap("style"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public WritableMap evaluate() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (Map.Entry next : this.f26714a.entrySet()) {
            C9965m r = this.mNodesManager.mo24809r(((Integer) next.getValue()).intValue(), C9965m.class);
            if (r instanceof C10008t) {
                javaOnlyMap.putArray((String) next.getKey(), (WritableArray) r.value());
            } else {
                Object value = r.value();
                if (value instanceof Double) {
                    javaOnlyMap.putDouble((String) next.getKey(), ((Double) value).doubleValue());
                } else if (value instanceof String) {
                    javaOnlyMap.putString((String) next.getKey(), (String) value);
                } else {
                    throw new IllegalStateException("Wrong style form");
                }
            }
        }
        return javaOnlyMap;
    }
}
