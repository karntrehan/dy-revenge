package p174e.p199d.p218c.p246z;

import okhttp3.HttpUrl;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.z.h */
public class C5988h extends C5739i<C5989i> {
    public C5988h(C5989i iVar) {
        super(iVar);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? super.mo17110f(i) : mo17896x() : mo17894v() : mo17898z() : mo17897y() : mo17895w();
    }

    /* renamed from: v */
    public String mo17894v() {
        Integer l = ((C5989i) this.f16215a).mo17148l(4);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(" bit");
        sb.append(l.intValue() == 1 ? HttpUrl.FRAGMENT_ENCODE_SET : "s");
        sb.append(" per channel");
        return sb.toString();
    }

    /* renamed from: w */
    public String mo17895w() {
        Integer l = ((C5989i) this.f16215a).mo17148l(1);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(" channel");
        sb.append(l.intValue() == 1 ? HttpUrl.FRAGMENT_ENCODE_SET : "s");
        return sb.toString();
    }

    /* renamed from: x */
    public String mo17896x() {
        return mo17194m(5, "Bitmap", "Grayscale", "Indexed", "RGB", "CMYK", null, null, "Multichannel", "Duotone", "Lab");
    }

    /* renamed from: y */
    public String mo17897y() {
        Integer l = ((C5989i) this.f16215a).mo17148l(2);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(" pixel");
        sb.append(l.intValue() == 1 ? HttpUrl.FRAGMENT_ENCODE_SET : "s");
        return sb.toString();
    }

    /* renamed from: z */
    public String mo17898z() {
        try {
            Integer l = ((C5989i) this.f16215a).mo17148l(3);
            if (l == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(l);
            sb.append(" pixel");
            sb.append(l.intValue() == 1 ? HttpUrl.FRAGMENT_ENCODE_SET : "s");
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
