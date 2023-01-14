package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9911d;

/* renamed from: com.swmansion.reanimated.nodes.e */
public class C9954e extends C9965m implements C9911d.C9916e {

    /* renamed from: a */
    public boolean f26659a;

    public C9954e(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
    }

    /* renamed from: b */
    public void mo24858b() {
        if (!this.f26659a) {
            this.f26659a = true;
            this.mNodesManager.mo24791H(this);
        }
    }

    /* renamed from: c */
    public void mo24859c() {
        this.f26659a = false;
    }

    /* access modifiers changed from: protected */
    public Double evaluate() {
        return Double.valueOf(this.mNodesManager.f26523r);
    }

    public void onAnimationFrame(double d) {
        if (this.f26659a) {
            markUpdated();
            this.mNodesManager.mo24791H(this);
        }
    }
}
