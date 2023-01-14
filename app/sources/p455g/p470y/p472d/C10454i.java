package p455g.p470y.p472d;

import p455g.p457b0.C10250b;
import p455g.p457b0.C10253e;

/* renamed from: g.y.d.i */
public class C10454i extends C10446c implements C10453h, C10253e {

    /* renamed from: f */
    private final int f27618f;

    /* renamed from: o */
    private final int f27619o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10454i(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f27618f = i;
        this.f27619o = i2 >> 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C10253e getReflected() {
        return (C10253e) super.getReflected();
    }

    /* access modifiers changed from: protected */
    public C10250b computeReflected() {
        return C10468w.m35334a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10454i) {
            C10454i iVar = (C10454i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.f27619o == iVar.f27619o && this.f27618f == iVar.f27618f && C10457l.m35316a(getBoundReceiver(), iVar.getBoundReceiver()) && C10457l.m35316a(getOwner(), iVar.getOwner());
        } else if (obj instanceof C10253e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.f27618f;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C10250b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
