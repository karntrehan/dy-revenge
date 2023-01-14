package com.facebook.yoga;

/* renamed from: com.facebook.yoga.e */
public abstract class C3305e extends C3303c {

    /* renamed from: a */
    long f9334a;

    C3305e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }

    private C3305e(long j) {
        if (j != 0) {
            this.f9334a = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    /* renamed from: a */
    public void mo10818a(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f9334a, f);
    }

    /* renamed from: b */
    public void mo10819b(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.f9334a, z);
    }
}
