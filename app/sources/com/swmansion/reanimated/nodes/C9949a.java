package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9909b;
import com.swmansion.reanimated.C9911d;

/* renamed from: com.swmansion.reanimated.nodes.a */
public class C9949a extends C9965m implements C9962j {

    /* renamed from: a */
    private int f26646a;

    public C9949a(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26646a = C9909b.m33754a(readableMap, "what", "Reanimated: Argument passed to always node is either of wrong type or is missing.");
    }

    /* renamed from: a */
    public void mo24854a() {
        value();
    }

    /* access modifiers changed from: protected */
    public Double evaluate() {
        this.mNodesManager.mo24809r(this.f26646a, C9965m.class).value();
        return C9965m.ZERO;
    }
}
