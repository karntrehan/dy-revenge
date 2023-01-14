package p174e.p199d.p218c.p236u;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.u.a */
public class C5871a extends C5739i<C5872b> {
    public C5871a(C5872b bVar) {
        super(bVar);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 5 ? super.mo17110f(i) : mo17804v();
    }

    /* renamed from: v */
    public String mo17804v() {
        Integer l = ((C5872b) this.f16215a).mo17148l(5);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 16) {
            return "Thumbnail coded using JPEG";
        }
        if (intValue == 17) {
            return "Thumbnail stored using 1 byte/pixel";
        }
        if (intValue == 19) {
            return "Thumbnail stored using 3 bytes/pixel";
        }
        return "Unknown extension code " + l;
    }
}
