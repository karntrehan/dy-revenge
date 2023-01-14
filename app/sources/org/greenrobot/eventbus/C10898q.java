package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.q */
final class C10898q {

    /* renamed from: a */
    final Object f28518a;

    /* renamed from: b */
    final C10895o f28519b;

    /* renamed from: c */
    volatile boolean f28520c = true;

    C10898q(Object obj, C10895o oVar) {
        this.f28518a = obj;
        this.f28519b = oVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10898q)) {
            return false;
        }
        C10898q qVar = (C10898q) obj;
        return this.f28518a == qVar.f28518a && this.f28519b.equals(qVar.f28519b);
    }

    public int hashCode() {
        return this.f28518a.hashCode() + this.f28519b.f28504f.hashCode();
    }
}
