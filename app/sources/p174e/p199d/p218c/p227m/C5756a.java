package p174e.p199d.p218c.p227m;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.m.a */
public class C5756a extends C5739i<C5757b> {
    public C5756a(C5757b bVar) {
        super(bVar);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        switch (i) {
            case 28:
            case 29:
                return mo17229x(i);
            case 30:
                return mo17228w();
            case 32:
            case 33:
                return mo17227v(i);
            default:
                return ((C5757b) this.f16215a).mo17153r(i);
        }
    }

    /* renamed from: v */
    public String mo17227v(int i) {
        return ((C5757b) this.f16215a).mo17153r(i) + " bytes";
    }

    /* renamed from: w */
    public String mo17228w() {
        return mo17193l(30, 1, "Grayscale", "Lab", "RGB", "CMYK");
    }

    /* renamed from: x */
    public String mo17229x(int i) {
        return ((C5757b) this.f16215a).mo17153r(i) + " pixels";
    }
}
