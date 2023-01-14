package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9911d;
import com.swmansion.reanimated.C9920g;
import com.swmansion.reanimated.C9921h;

/* renamed from: com.swmansion.reanimated.nodes.d */
public class C9953d extends C9965m {

    /* renamed from: a */
    private String f26655a;

    /* renamed from: b */
    private final int f26656b;

    /* renamed from: c */
    private final int[] f26657c;

    /* renamed from: d */
    private final int[] f26658d;

    public C9953d(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26656b = readableMap.getInt("what");
        this.f26658d = C9921h.m33809a(readableMap.getArray("params"));
        this.f26657c = C9921h.m33809a(readableMap.getArray("args"));
    }

    /* renamed from: b */
    private void m33893b() {
        C9920g gVar = this.mNodesManager.f26524s;
        this.f26655a = gVar.f26542b;
        gVar.f26542b = this.mNodesManager.f26524s.f26542b + '/' + String.valueOf(this.mNodeID);
        int i = 0;
        while (true) {
            int[] iArr = this.f26658d;
            if (i < iArr.length) {
                ((C10003p) this.mNodesManager.mo24809r(iArr[i], C10003p.class)).mo24875c(Integer.valueOf(this.f26657c[i]), this.f26655a);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private void m33894c() {
        int i = 0;
        while (true) {
            int[] iArr = this.f26658d;
            if (i < iArr.length) {
                ((C10003p) this.mNodesManager.mo24809r(iArr[i], C10003p.class)).mo24876d();
                i++;
            } else {
                this.mNodesManager.f26524s.f26542b = this.f26655a;
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public Object evaluate() {
        m33893b();
        Object value = this.mNodesManager.mo24809r(this.f26656b, C9965m.class).value();
        m33894c();
        return value;
    }
}
