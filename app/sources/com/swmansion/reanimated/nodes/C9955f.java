package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9909b;
import com.swmansion.reanimated.C9911d;

/* renamed from: com.swmansion.reanimated.nodes.f */
public abstract class C9955f extends C9965m {

    /* renamed from: a */
    private int f26660a;

    /* renamed from: com.swmansion.reanimated.nodes.f$a */
    public static class C9956a extends C9955f {
        public C9956a(int i, ReadableMap readableMap, C9911d dVar) {
            super(i, readableMap, dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Double mo24860b(C9965m mVar) {
            if (mVar instanceof C10003p) {
                ((C10003p) mVar).mo24878f();
            } else {
                ((C9954e) mVar).mo24858b();
            }
            return C9965m.ZERO;
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ Object evaluate() {
            return C9955f.super.evaluate();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.f$b */
    public static class C9957b extends C9955f {
        public C9957b(int i, ReadableMap readableMap, C9911d dVar) {
            super(i, readableMap, dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Double mo24860b(C9965m mVar) {
            if (mVar instanceof C10003p) {
                ((C10003p) mVar).mo24879g();
            } else {
                ((C9954e) mVar).mo24859c();
            }
            return C9965m.ZERO;
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ Object evaluate() {
            return C9955f.super.evaluate();
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.f$c */
    public static class C9958c extends C9955f {
        public C9958c(int i, ReadableMap readableMap, C9911d dVar) {
            super(i, readableMap, dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Double mo24860b(C9965m mVar) {
            double d = 1.0d;
            if (mVar instanceof C10003p) {
                if (!((C10003p) mVar).mo24877e()) {
                    d = 0.0d;
                }
                return Double.valueOf(d);
            }
            if (!((C9954e) mVar).f26659a) {
                d = 0.0d;
            }
            return Double.valueOf(d);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ Object evaluate() {
            return C9955f.super.evaluate();
        }
    }

    public C9955f(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26660a = C9909b.m33754a(readableMap, "clock", "Reanimated: Argument passed to clock node is either of wrong type or is missing.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Double mo24860b(C9965m mVar);

    /* access modifiers changed from: protected */
    public Double evaluate() {
        return mo24860b(this.mNodesManager.mo24809r(this.f26660a, C9965m.class));
    }
}
