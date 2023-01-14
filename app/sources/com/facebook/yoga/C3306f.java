package com.facebook.yoga;

/* renamed from: com.facebook.yoga.f */
public class C3306f extends C3305e {
    /* renamed from: c */
    public void mo10820c() {
        long j = this.f9334a;
        if (j != 0) {
            this.f9334a = 0;
            YogaNative.jni_YGConfigFreeJNI(j);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            mo10820c();
        } finally {
            super.finalize();
        }
    }
}
