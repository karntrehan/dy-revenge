package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.g0 */
public class C5779g0 extends C5739i<C5781h0> {

    /* renamed from: b */
    private static final HashMap<Integer, String> f16284b;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16284b = hashMap;
        hashMap.put(0, "Off");
        hashMap.put(1, "Soft Focus");
        hashMap.put(2, "Pop Art");
        hashMap.put(3, "Pale & Light Color");
        hashMap.put(4, "Light Tone");
        hashMap.put(5, "Pin Hole");
        hashMap.put(6, "Grainy Film");
        hashMap.put(9, "Diorama");
        hashMap.put(10, "Cross Process");
        hashMap.put(12, "Fish Eye");
        hashMap.put(13, "Drawing");
        hashMap.put(14, "Gentle Sepia");
        hashMap.put(15, "Pale & Light Color II");
        hashMap.put(16, "Pop Art II");
        hashMap.put(17, "Pin Hole II");
        hashMap.put(18, "Pin Hole III");
        hashMap.put(19, "Grainy Film II");
        hashMap.put(20, "Dramatic Tone");
        hashMap.put(21, "Punk");
        hashMap.put(22, "Soft Focus 2");
        hashMap.put(23, "Sparkle");
        hashMap.put(24, "Watercolor");
        hashMap.put(25, "Key Line");
        hashMap.put(26, "Key Line II");
        hashMap.put(27, "Miniature");
        hashMap.put(28, "Reflection");
        hashMap.put(29, "Fragmented");
        hashMap.put(31, "Cross Process II");
        hashMap.put(32, "Dramatic Tone II");
        hashMap.put(33, "Watercolor I");
        hashMap.put(34, "Watercolor II");
        hashMap.put(35, "Diorama II");
        hashMap.put(36, "Vintage");
        hashMap.put(37, "Vintage II");
        hashMap.put(38, "Vintage III");
        hashMap.put(39, "Partial Color");
        hashMap.put(40, "Partial Color II");
        hashMap.put(41, "Partial Color III");
    }

    public C5779g0(C5781h0 h0Var) {
        super(h0Var);
    }

    /* renamed from: A */
    public String mo17505A() {
        Integer l = ((C5781h0) this.f16215a).mo17148l(266);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb = new StringBuilder();
        int intValue = l.intValue();
        if ((intValue & 1) != 0) {
            sb.append("Noise Reduction, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append("Noise Filter, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append("Noise Filter (ISO Boost), ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: B */
    public String mo17506B() {
        Integer l = ((C5781h0) this.f16215a).mo17148l(268);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return "Vivid";
        }
        if (intValue == 2) {
            return "Natural";
        }
        if (intValue == 3) {
            return "Muted";
        }
        if (intValue == 256) {
            return "Monotone";
        }
        if (intValue == 512) {
            return "Sepia";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: C */
    public String mo17507C() {
        return mo17194m(272, "Neutral", "Yellow", "Orange", "Red", "Green");
    }

    /* renamed from: D */
    public String mo17508D() {
        return mo17194m(273, "Neutral", "Sepia", "Blue", "Purple", "Green");
    }

    /* renamed from: E */
    public String mo17509E() {
        return mo17202u(0, 4);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 0) {
            return mo17509E();
        }
        if (i == 256) {
            return mo17514z();
        }
        if (i == 289) {
            return mo17511w();
        }
        if (i == 272) {
            return mo17507C();
        }
        if (i == 273) {
            return mo17508D();
        }
        switch (i) {
            case 265:
                return mo17512x();
            case 266:
                return mo17505A();
            case 267:
                return mo17513y();
            case 268:
                return mo17506B();
            default:
                return super.mo17110f(i);
        }
    }

    /* renamed from: v */
    public String mo17510v(int i) {
        int[] k = ((C5781h0) this.f16215a).mo17147k(i);
        if (k == null || k.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < k.length; i2++) {
            if (i2 == 0) {
                HashMap<Integer, String> hashMap = f16284b;
                sb.append(hashMap.containsKey(Integer.valueOf(k[i2])) ? hashMap.get(Integer.valueOf(k[i2])) : "[unknown]");
            } else {
                sb.append(k[i2]);
                sb.append("; ");
            }
            sb.append("; ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: w */
    public String mo17511w() {
        return mo17510v(289);
    }

    /* renamed from: x */
    public String mo17512x() {
        return mo17194m(265, "sRGB", "Adobe RGB", "Pro Photo RGB");
    }

    /* renamed from: y */
    public String mo17513y() {
        return mo17194m(267, "High Speed", "High Function", "Advanced High Speed", "Advanced High Function");
    }

    /* renamed from: z */
    public String mo17514z() {
        return mo17193l(256, 1, "Color Temperature", "Gray Point");
    }
}
