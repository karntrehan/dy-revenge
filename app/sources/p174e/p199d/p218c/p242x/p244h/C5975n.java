package p174e.p199d.p218c.p242x.p244h;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.x.h.n */
public class C5975n extends C5739i<C5976o> {
    public C5975n(C5976o oVar) {
        super(oVar);
    }

    /* renamed from: v */
    private String m22538v() {
        Integer l = ((C5976o) this.f16215a).mo17148l(113);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == -1) {
            Integer l2 = ((C5976o) this.f16215a).mo17148l(109);
            return (l2 != null && l2.intValue() < 16) ? "Default" : "None";
        } else if (intValue == 0) {
            return "Color table within file";
        } else {
            return "Unknown (" + l + ")";
        }
    }

    /* renamed from: w */
    private String m22539w() {
        StringBuilder sb;
        String str;
        Integer l = ((C5976o) this.f16215a).mo17148l(109);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 34 || intValue == 36 || intValue == 40) {
            sb = new StringBuilder();
            sb.append(l.intValue() - 32);
            str = "-bit grayscale";
        } else {
            sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(l);
            str = ")";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: x */
    private String m22540x() {
        Integer l = ((C5976o) this.f16215a).mo17148l(111);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Copy";
        }
        if (intValue == 32) {
            return "Blend";
        }
        if (intValue == 36) {
            return "Transparent";
        }
        if (intValue == 64) {
            return "Dither copy";
        }
        switch (intValue) {
            case 256:
                return "Straight alpha";
            case 257:
                return "Premul white alpha";
            case 258:
                return "Premul black alpha";
            case 259:
                return "Composition (dither copy)";
            case 260:
                return "Straight alpha blend";
            default:
                return "Unknown (" + l + ")";
        }
    }

    /* renamed from: y */
    private String m22541y(int i) {
        String r = ((C5976o) this.f16215a).mo17153r(i);
        if (r == null) {
            return null;
        }
        return r + " pixels";
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return (i == 104 || i == 105) ? m22541y(i) : i != 109 ? i != 111 ? i != 113 ? super.mo17110f(i) : m22538v() : m22540x() : m22539w();
    }
}
