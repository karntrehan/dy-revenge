package com.facebook.yoga;

/* renamed from: com.facebook.yoga.r */
public class C3319r extends YogaNodeJNIBase {
    public C3319r() {
    }

    public C3319r(C3303c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            mo10829x0();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: x0 */
    public void mo10829x0() {
        long j = this.f9320r;
        if (j != 0) {
            this.f9320r = 0;
            YogaNative.jni_YGNodeFreeJNI(j);
        }
    }
}
