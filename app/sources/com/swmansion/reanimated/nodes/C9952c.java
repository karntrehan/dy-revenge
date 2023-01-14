package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9911d;
import com.swmansion.reanimated.C9921h;

/* renamed from: com.swmansion.reanimated.nodes.c */
public class C9952c extends C9965m {

    /* renamed from: a */
    private final int[] f26654a;

    public C9952c(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26654a = C9921h.m33809a(readableMap.getArray("block"));
    }

    /* access modifiers changed from: protected */
    public Object evaluate() {
        Object obj = null;
        int i = 0;
        while (true) {
            int[] iArr = this.f26654a;
            if (i >= iArr.length) {
                return obj;
            }
            obj = this.mNodesManager.mo24809r(iArr[i], C9965m.class).value();
            i++;
        }
    }
}
