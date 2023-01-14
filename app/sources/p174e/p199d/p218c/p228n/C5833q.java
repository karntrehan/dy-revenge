package p174e.p199d.p218c.p228n;

import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.q */
public class C5833q extends C5739i<C5834r> {
    public C5833q(C5834r rVar) {
        super(rVar);
    }

    /* renamed from: A */
    public String mo17763A() {
        Integer l = ((C5834r) this.f16215a).mo17148l(11);
        if (l == null) {
            return null;
        }
        return new C5712m((long) l.intValue(), 32678).toString();
    }

    /* renamed from: B */
    public String mo17764B() {
        Integer l = ((C5834r) this.f16215a).mo17148l(5);
        if (l == null) {
            return null;
        }
        return Integer.toString(1 / ((l.intValue() / 32768) + 1));
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 2 ? i != 11 ? i != 4 ? i != 5 ? i != 7 ? i != 8 ? i != 9 ? super.mo17110f(i) : mo17769z() : mo17768y() : mo17765v() : mo17764B() : mo17767x() : mo17763A() : mo17766w();
    }

    /* renamed from: v */
    public String mo17765v() {
        Integer l = ((C5834r) this.f16215a).mo17148l(7);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue() & 15;
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "On";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: w */
    public String mo17766w() {
        Integer l = ((C5834r) this.f16215a).mo17148l(2);
        if (l == null) {
            return null;
        }
        return new C5712m((long) l.intValue(), 32678).toString();
    }

    /* renamed from: x */
    public String mo17767x() {
        Integer l = ((C5834r) this.f16215a).mo17148l(4);
        if (l == null) {
            return null;
        }
        return new C5712m((long) l.intValue(), 32678).toString();
    }

    /* renamed from: y */
    public String mo17768y() {
        Integer l = ((C5834r) this.f16215a).mo17148l(8);
        if (l == null) {
            return null;
        }
        return new C5712m((long) l.intValue(), 32678).toString();
    }

    /* renamed from: z */
    public String mo17769z() {
        Integer l = ((C5834r) this.f16215a).mo17148l(9);
        if (l == null) {
            return null;
        }
        return new C5712m((long) l.intValue(), 32678).toString();
    }
}
