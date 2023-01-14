package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9909b;
import com.swmansion.reanimated.C9911d;

/* renamed from: com.swmansion.reanimated.nodes.h */
public class C9960h extends C9965m {

    /* renamed from: a */
    private final int f26663a;

    /* renamed from: b */
    private final int f26664b;

    /* renamed from: c */
    private final int f26665c;

    public C9960h(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26663a = C9909b.m33754a(readableMap, "cond", "Reanimated: First argument passed to cond node is either of wrong type or is missing.");
        this.f26664b = C9909b.m33754a(readableMap, "ifBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.");
        this.f26665c = readableMap.hasKey("elseBlock") ? C9909b.m33754a(readableMap, "elseBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.") : -1;
    }

    /* access modifiers changed from: protected */
    public Object evaluate() {
        Object v = this.mNodesManager.mo24813v(this.f26663a);
        if (!(v instanceof Number) || ((Number) v).doubleValue() == 0.0d) {
            int i = this.f26665c;
            return i != -1 ? this.mNodesManager.mo24813v(i) : C9965m.ZERO;
        }
        int i2 = this.f26664b;
        return i2 != -1 ? this.mNodesManager.mo24813v(i2) : C9965m.ZERO;
    }
}
