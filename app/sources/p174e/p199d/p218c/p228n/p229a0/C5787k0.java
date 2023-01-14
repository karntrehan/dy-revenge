package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5739i;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.d.c.n.a0.k0 */
public class C5787k0 extends C5739i<C5789l0> {
    public C5787k0(C5789l0 l0Var) {
        super(l0Var);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 0 ? i != 512 ? i != 1537 ? i != 4096 ? super.mo17110f(i) : mo17554w() : mo17555x() : mo17553v() : mo17202u(0, 4);
    }

    /* renamed from: v */
    public String mo17553v() {
        int[] k = ((C5789l0) this.f16215a).mo17147k(512);
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; i++) {
            sb.append((short) k[i]);
            if (i < k.length - 1) {
                sb.append(" ");
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: w */
    public String mo17554w() {
        Integer l = ((C5789l0) this.f16215a).mo17148l(4096);
        if (l == null) {
            return null;
        }
        short shortValue = l.shortValue();
        if (shortValue == 0) {
            return "Unknown";
        }
        if (shortValue == 20) {
            return "Tungsten (Incandescent)";
        }
        if (shortValue == 22) {
            return "Evening Sunlight";
        }
        if (shortValue == 256) {
            return "One Touch White Balance";
        }
        if (shortValue == 512) {
            return "Custom 1-4";
        }
        switch (shortValue) {
            case 16:
                return "Shade";
            case 17:
                return "Cloudy";
            case 18:
                return "Fine Weather";
            default:
                switch (shortValue) {
                    case 33:
                        return "Daylight Fluorescent";
                    case 34:
                        return "Day White Fluorescent";
                    case 35:
                        return "Cool White Fluorescent";
                    case C9024k.f24704g4 /*36*/:
                        return "White Fluorescent";
                    default:
                        return "Unknown (" + l + ")";
                }
        }
    }

    /* renamed from: x */
    public String mo17555x() {
        int[] k = ((C5789l0) this.f16215a).mo17147k(1537);
        if (k == null) {
            return null;
        }
        int length = k.length / 2;
        C5712m[] mVarArr = new C5712m[length];
        for (int i = 0; i < k.length / 2; i++) {
            int i2 = i * 2;
            mVarArr[i] = new C5712m((long) ((short) k[i2]), (long) ((short) k[i2 + 1]));
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            sb.append(mVarArr[i3].doubleValue());
            if (i3 < length - 1) {
                sb.append(" ");
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
