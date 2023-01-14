package p174e.p199d.p218c.p219a0;

import java.io.IOException;
import java.util.List;
import p174e.p199d.p200a.p209n.C5680e;
import p174e.p199d.p217b.C5709j;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.a0.b */
public class C5720b extends C5739i<C5721c> {
    public C5720b(C5721c cVar) {
        super(cVar);
    }

    /* renamed from: A */
    public String mo17106A() {
        return mo17194m(10, "Perceptual", "Relative Colorimetric", "Saturation", "Absolute Colorimetric");
    }

    /* renamed from: B */
    public String mo17107B() {
        return mo17194m(9, null, "Yes");
    }

    /* renamed from: C */
    public String mo17108C() {
        Object o = ((C5721c) this.f16215a).mo17150o(13);
        if (o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (C5709j jVar : (List) o) {
            if (sb.length() != 0) {
                sb.append(10);
            }
            sb.append(String.format("%s: %s", new Object[]{jVar.mo17037a(), jVar.mo17038b()}));
        }
        return sb.toString();
    }

    /* renamed from: D */
    public String mo17109D() {
        return mo17194m(18, "Unspecified", "Metres");
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 4 ? i != 5 ? i != 6 ? i != 7 ? i != 9 ? i != 10 ? i != 13 ? i != 15 ? i != 18 ? super.mo17110f(i) : mo17109D() : mo17111v() : mo17108C() : mo17106A() : mo17107B() : mo17115z() : mo17114y() : mo17113x() : mo17112w();
    }

    /* renamed from: v */
    public String mo17111v() {
        byte[] e = ((C5721c) this.f16215a).mo17141e(15);
        Integer l = ((C5721c) this.f16215a).mo17148l(4);
        if (!(e == null || l == null)) {
            C5713n nVar = new C5713n(e);
            try {
                int intValue = l.intValue();
                if (intValue != 0) {
                    if (intValue == 6 || intValue == 2) {
                        return String.format("R %d, G %d, B %d", new Object[]{Integer.valueOf(nVar.mo17096p()), Integer.valueOf(nVar.mo17096p()), Integer.valueOf(nVar.mo17096p())});
                    } else if (intValue == 3) {
                        return String.format("Palette Index %d", new Object[]{Short.valueOf(nVar.mo17098r())});
                    } else if (intValue != 4) {
                        return null;
                    }
                }
                return String.format("Greyscale Level %d", new Object[]{Integer.valueOf(nVar.mo17096p())});
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: w */
    public String mo17112w() {
        C5680e e;
        Integer l = ((C5721c) this.f16215a).mo17148l(4);
        if (l == null || (e = C5680e.m21135e(l.intValue())) == null) {
            return null;
        }
        return e.mo16965g();
    }

    /* renamed from: x */
    public String mo17113x() {
        return mo17194m(5, "Deflate");
    }

    /* renamed from: y */
    public String mo17114y() {
        return mo17194m(6, "Adaptive");
    }

    /* renamed from: z */
    public String mo17115z() {
        return mo17194m(7, "No Interlace", "Adam7 Interlace");
    }
}
