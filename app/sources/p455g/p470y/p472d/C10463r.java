package p455g.p470y.p472d;

import p455g.p457b0.C10250b;
import p455g.p457b0.C10257h;

/* renamed from: g.y.d.r */
public abstract class C10463r extends C10446c implements C10257h {
    public C10463r() {
    }

    public C10463r(Object obj) {
        super(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10463r(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10463r) {
            C10463r rVar = (C10463r) obj;
            return getOwner().equals(rVar.getOwner()) && getName().equals(rVar.getName()) && getSignature().equals(rVar.getSignature()) && C10457l.m35316a(getBoundReceiver(), rVar.getBoundReceiver());
        } else if (obj instanceof C10257h) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public C10257h getReflected() {
        return (C10257h) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        C10250b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
