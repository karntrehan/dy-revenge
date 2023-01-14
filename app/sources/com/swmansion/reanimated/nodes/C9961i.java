package com.swmansion.reanimated.nodes;

import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9909b;
import com.swmansion.reanimated.C9911d;

/* renamed from: com.swmansion.reanimated.nodes.i */
public class C9961i extends C9965m {

    /* renamed from: a */
    private final String f26666a;

    /* renamed from: b */
    private final int f26667b;

    public C9961i(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26666a = C9909b.m33755b(readableMap, "message", "Reanimated: First argument passed to debug node is either of wrong type or is missing.");
        this.f26667b = C9909b.m33754a(readableMap, "value", "Reanimated: Second argument passed to debug node is either of wrong type or is missing.");
    }

    /* access modifiers changed from: protected */
    public Object evaluate() {
        Object value = this.mNodesManager.mo24809r(this.f26667b, C9965m.class).value();
        Log.d("REANIMATED", String.format("%s %s", new Object[]{this.f26666a, value}));
        return value;
    }
}
