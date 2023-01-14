package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.c0 */
public class C5767c0 extends C5739i<C5770d0> {
    public C5767c0(C5770d0 d0Var) {
        super(d0Var);
    }

    /* renamed from: A */
    public String mo17353A() {
        return mo17194m(6401, "Vertical", "Horizontal");
    }

    /* renamed from: B */
    public String mo17354B() {
        String str;
        int[] k = ((C5770d0) this.f16215a).mo17147k(4124);
        if (k == null) {
            Integer l = ((C5770d0) this.f16215a).mo17148l(4124);
            if (l == null) {
                return null;
            }
            k = new int[]{l.intValue()};
        }
        if (k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        short s = (short) k[0];
        if (s == 0) {
            str = "Off";
        } else if (s == 2) {
            str = "On (2 frames)";
        } else if (s != 3) {
            sb.append("Unknown (");
            sb.append((short) k[0]);
            str = ")";
        } else {
            str = "On (3 frames)";
        }
        sb.append(str);
        if (k.length > 1) {
            sb.append("; ");
            sb.append((short) k[1]);
        }
        return sb.toString();
    }

    /* renamed from: C */
    public String mo17355C() {
        Integer l = ((C5770d0) this.f16215a).mo17148l(4112);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb = new StringBuilder();
        short shortValue = l.shortValue();
        if ((shortValue & 1) != 0) {
            sb.append("Noise Reduction, ");
        }
        if (((shortValue >> 1) & 1) != 0) {
            sb.append("Noise Filter, ");
        }
        if (((shortValue >> 2) & 1) != 0) {
            sb.append("Noise Filter (ISO Boost), ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: D */
    public String mo17356D() {
        return mo17194m(4114, "Off", "On");
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 0) {
            return mo17360y();
        }
        if (i == 512) {
            return mo17358w();
        }
        if (i == 4124) {
            return mo17354B();
        }
        if (i == 4370) {
            return mo17357v();
        }
        if (i == 6400) {
            return mo17361z();
        }
        if (i == 6401) {
            return mo17353A();
        }
        switch (i) {
            case 4112:
                return mo17355C();
            case 4113:
                return mo17359x();
            case 4114:
                return mo17356D();
            default:
                return super.mo17110f(i);
        }
    }

    /* renamed from: v */
    public String mo17357v() {
        byte[] e = ((C5770d0) this.f16215a).mo17141e(4370);
        if (e == null || e.length < 2) {
            return null;
        }
        String format = String.format("%d %d", new Object[]{Byte.valueOf(e[0]), Byte.valueOf(e[1])});
        if (format.equals("1 1")) {
            return "4:3";
        }
        if (format.equals("1 4")) {
            return "1:1";
        }
        if (format.equals("2 1")) {
            return "3:2 (RAW)";
        }
        if (format.equals("2 2")) {
            return "3:2";
        }
        if (format.equals("3 1")) {
            return "16:9 (RAW)";
        }
        if (format.equals("3 3")) {
            return "16:9";
        }
        if (format.equals("4 1")) {
            return "1:1 (RAW)";
        }
        if (format.equals("4 4")) {
            return "6:6";
        }
        if (format.equals("5 5")) {
            return "5:4";
        }
        if (format.equals("6 6")) {
            return "7:6";
        }
        if (format.equals("7 7")) {
            return "6:5";
        }
        if (format.equals("8 8")) {
            return "7:5";
        }
        if (format.equals("9 1")) {
            return "3:4 (RAW)";
        }
        if (format.equals("9 9")) {
            return "3:4";
        }
        return "Unknown (" + format + ")";
    }

    /* renamed from: w */
    public String mo17358w() {
        int[] k = ((C5770d0) this.f16215a).mo17147k(512);
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append((short) k[i]);
        }
        return sb.toString();
    }

    /* renamed from: x */
    public String mo17359x() {
        return mo17194m(4113, "Off", "On");
    }

    /* renamed from: y */
    public String mo17360y() {
        return mo17202u(0, 4);
    }

    /* renamed from: z */
    public String mo17361z() {
        byte[] e = ((C5770d0) this.f16215a).mo17141e(6400);
        if (e == null || e.length < 2) {
            return null;
        }
        String format = String.format("%d %d", new Object[]{Byte.valueOf(e[0]), Byte.valueOf(e[1])});
        if (format.equals("0 0")) {
            return "Off";
        }
        if (format.equals("0 1")) {
            return "On";
        }
        return "Unknown (" + format + ")";
    }
}
