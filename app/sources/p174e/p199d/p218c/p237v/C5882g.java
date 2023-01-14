package p174e.p199d.p218c.p237v;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.v.g */
public class C5882g extends C5739i<C5884i> {
    public C5882g(C5884i iVar) {
        super(iVar);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        int i2;
        if (i == -3) {
            return mo17814x();
        }
        if (i == 3) {
            return mo17816z();
        }
        if (i == 0) {
            return mo17813w();
        }
        if (i == 1) {
            return mo17815y();
        }
        switch (i) {
            case 6:
                i2 = 0;
                break;
            case 7:
                return mo17812v(1);
            case 8:
                i2 = 2;
                break;
            case 9:
                return mo17812v(3);
            default:
                return super.mo17110f(i);
        }
        return mo17812v(i2);
    }

    /* renamed from: v */
    public String mo17812v(int i) {
        C5881f V = ((C5884i) this.f16215a).mo17818V(i);
        if (V == null) {
            return null;
        }
        return V.mo17808a() + " component: " + V;
    }

    /* renamed from: w */
    public String mo17813w() {
        String r = ((C5884i) this.f16215a).mo17153r(0);
        if (r == null) {
            return null;
        }
        return r + " bits";
    }

    /* renamed from: x */
    public String mo17814x() {
        return mo17194m(-3, "Baseline", "Extended sequential, Huffman", "Progressive, Huffman", "Lossless, Huffman", null, "Differential sequential, Huffman", "Differential progressive, Huffman", "Differential lossless, Huffman", "Reserved for JPEG extensions", "Extended sequential, arithmetic", "Progressive, arithmetic", "Lossless, arithmetic", null, "Differential sequential, arithmetic", "Differential progressive, arithmetic", "Differential lossless, arithmetic");
    }

    /* renamed from: y */
    public String mo17815y() {
        String r = ((C5884i) this.f16215a).mo17153r(1);
        if (r == null) {
            return null;
        }
        return r + " pixels";
    }

    /* renamed from: z */
    public String mo17816z() {
        String r = ((C5884i) this.f16215a).mo17153r(3);
        if (r == null) {
            return null;
        }
        return r + " pixels";
    }
}
