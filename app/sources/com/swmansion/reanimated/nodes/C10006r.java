package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9909b;
import com.swmansion.reanimated.C9911d;

/* renamed from: com.swmansion.reanimated.nodes.r */
public class C10006r extends C9965m {

    /* renamed from: a */
    private int f26712a;

    /* renamed from: b */
    private int f26713b;

    public C10006r(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26712a = C9909b.m33754a(readableMap, "what", "Reanimated: First argument passed to set node is either of wrong type or is missing.");
        this.f26713b = C9909b.m33754a(readableMap, "value", "Reanimated: Second argument passed to set node is either of wrong type or is missing.");
    }

    /* access modifiers changed from: protected */
    public Object evaluate() {
        Object v = this.mNodesManager.mo24813v(this.f26713b);
        ((C10013u) this.mNodesManager.mo24809r(this.f26712a, C10013u.class)).mo24870b(v);
        return v;
    }
}
