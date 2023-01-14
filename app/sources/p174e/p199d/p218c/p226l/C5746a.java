package p174e.p199d.p218c.p226l;

import java.text.DecimalFormat;
import p174e.p199d.p218c.C5739i;
import p174e.p199d.p218c.p226l.C5747b;

/* renamed from: e.d.c.l.a */
public class C5746a extends C5739i<C5747b> {
    public C5746a(C5747b bVar) {
        super(bVar);
    }

    /* renamed from: v */
    public static String m21468v(long j) {
        return new DecimalFormat("0.###").format(Double.valueOf(((double) j) / 65536.0d));
    }

    /* renamed from: w */
    public static String m21469w(Long l) {
        if (l == null) {
            return null;
        }
        return m21468v(l.longValue());
    }

    /* renamed from: x */
    public static String m21470x(long j, int i) {
        return String.format("0x%0" + i + "X", new Object[]{Long.valueOf(j)});
    }

    /* renamed from: y */
    public static String m21471y(Long l, int i) {
        if (l == null) {
            return null;
        }
        return m21470x(l.longValue(), i);
    }

    /* renamed from: A */
    public String mo17205A() {
        C5747b.C5750c W = ((C5747b) this.f16215a).mo17212W();
        if (W == null) {
            return null;
        }
        return W.toString();
    }

    /* renamed from: B */
    public String mo17206B() {
        C5747b.C5751d X = ((C5747b) this.f16215a).mo17213X();
        if (X == null) {
            return null;
        }
        return X.toString();
    }

    /* renamed from: C */
    public String mo17207C() {
        C5747b.C5752e Y = ((C5747b) this.f16215a).mo17214Y();
        if (Y != null) {
            return Y.toString();
        }
        Integer l = ((C5747b) this.f16215a).mo17148l(5);
        if (l == null) {
            return null;
        }
        return "Illegal value 0x" + Integer.toHexString(l.intValue());
    }

    /* renamed from: D */
    public String mo17208D() {
        C5747b.C5753f Z = ((C5747b) this.f16215a).mo17215Z();
        if (Z == null) {
            return null;
        }
        return Z.toString();
    }

    /* renamed from: E */
    public String mo17209E() {
        C5747b.C5754g a0 = ((C5747b) this.f16215a).mo17216a0();
        if (a0 == null) {
            return null;
        }
        return a0.toString();
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == -2) {
            return mo17210z();
        }
        if (i == 5) {
            return mo17207C();
        }
        switch (i) {
            case 10:
                return mo17208D();
            case 11:
                return mo17205A();
            case 12:
            case 13:
            case 14:
            case 15:
                return m21471y(((C5747b) this.f16215a).mo17149m(i), 8);
            case 16:
                return mo17206B();
            case 17:
            case 18:
            case 19:
                return m21469w(((C5747b) this.f16215a).mo17149m(i));
            case 20:
                return mo17209E();
            default:
                return super.mo17110f(i);
        }
    }

    /* renamed from: z */
    public String mo17210z() {
        C5747b.C5749b V = ((C5747b) this.f16215a).mo17211V();
        if (V == null) {
            return null;
        }
        return V.toString();
    }
}
