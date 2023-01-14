package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.swmansion.reanimated.C9911d;

/* renamed from: com.swmansion.reanimated.nodes.u */
public class C10013u extends C9965m {

    /* renamed from: a */
    private Object f26719a;

    public C10013u(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        Object obj = null;
        if (readableMap == null || !readableMap.hasKey("value")) {
            this.f26719a = null;
            return;
        }
        ReadableType type = readableMap.getType("value");
        if (type == ReadableType.String) {
            obj = readableMap.getString("value");
        } else if (type == ReadableType.Number) {
            obj = Double.valueOf(readableMap.getDouble("value"));
        } else if (type != ReadableType.Null) {
            throw new IllegalStateException("Not supported value type. Must be boolean, number or string");
        }
        this.f26719a = obj;
    }

    /* renamed from: b */
    public void mo24870b(Object obj) {
        this.f26719a = obj;
        forceUpdateMemoizedValue(obj);
    }

    /* access modifiers changed from: protected */
    public Object evaluate() {
        return this.f26719a;
    }
}
