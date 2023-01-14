package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9911d;

/* renamed from: com.swmansion.reanimated.nodes.k */
public class C9963k extends C9965m {

    /* renamed from: a */
    private final int f26668a;

    public C9963k(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26668a = readableMap.getInt("what");
    }

    /* access modifiers changed from: protected */
    public Object evaluate() {
        return this.mNodesManager.mo24809r(this.f26668a, C9965m.class).value();
    }
}
