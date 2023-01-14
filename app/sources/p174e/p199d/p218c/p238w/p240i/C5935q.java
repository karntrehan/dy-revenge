package p174e.p199d.p218c.p238w.p240i;

import p174e.p199d.p218c.p238w.C5888b;
import p174e.p199d.p218c.p238w.C5890d;

/* renamed from: e.d.c.w.i.q */
public class C5935q extends C5888b {
    public C5935q(C5936r rVar) {
        super(rVar);
    }

    /* renamed from: A */
    private String m22448A() {
        Integer l = ((C5890d) this.f16215a).mo17148l(11);
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

    /* renamed from: B */
    private String m22449B(int i) {
        String r = ((C5890d) this.f16215a).mo17153r(i);
        if (r == null) {
            return null;
        }
        return r + " pixels";
    }

    /* renamed from: y */
    private String m22450y(int i) {
        Integer l = ((C5890d) this.f16215a).mo17148l(i);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == -1) {
            return ((C5890d) this.f16215a).mo17148l(9).intValue() < 16 ? "Default" : "None";
        }
        if (intValue == 0) {
            return "Color table within file";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: z */
    private String m22451z(int i) {
        StringBuilder sb;
        String str;
        Integer l = ((C5890d) this.f16215a).mo17148l(i);
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

    /* renamed from: f */
    public String mo17110f(int i) {
        return (i == 4 || i == 5) ? m22449B(i) : i != 9 ? i != 11 ? i != 13 ? super.mo17110f(i) : m22450y(i) : m22448A() : m22451z(i);
    }
}
