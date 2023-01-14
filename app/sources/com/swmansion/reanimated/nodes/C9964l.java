package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.C9911d;
import com.swmansion.reanimated.C9921h;

/* renamed from: com.swmansion.reanimated.nodes.l */
public class C9964l extends C9965m {

    /* renamed from: a */
    private final int[] f26669a;

    public C9964l(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26669a = C9921h.m33809a(readableMap.getArray("input"));
    }

    /* access modifiers changed from: protected */
    public Double evaluate() {
        WritableArray createArray = Arguments.createArray();
        int i = 0;
        while (true) {
            int[] iArr = this.f26669a;
            if (i < iArr.length) {
                C9965m r = this.mNodesManager.mo24809r(iArr[i], C9965m.class);
                if (r.value() == null) {
                    createArray.pushNull();
                } else {
                    Object value = r.value();
                    if (value instanceof String) {
                        createArray.pushString((String) value);
                    } else {
                        createArray.pushDouble(r.doubleValue().doubleValue());
                    }
                }
                i++;
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", this.mNodeID);
                createMap.putArray("args", createArray);
                this.mNodesManager.mo24795L("onReanimatedCall", createMap);
                return C9965m.ZERO;
            }
        }
    }
}
