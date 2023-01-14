package p174e.p199d.p218c.p233r;

import okhttp3.HttpUrl;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.r.a */
public class C5861a extends C5739i<C5862b> {
    public C5861a(C5862b bVar) {
        super(bVar);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? super.mo17110f(i) : mo17777v() : mo17778w() : mo17780y() : mo17779x();
    }

    /* renamed from: v */
    public String mo17777v() {
        Integer l = ((C5862b) this.f16215a).mo17148l(4);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return "No palette";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(" colour");
        sb.append(l.intValue() == 1 ? HttpUrl.FRAGMENT_ENCODE_SET : "s");
        return sb.toString();
    }

    /* renamed from: w */
    public String mo17778w() {
        Integer l = ((C5862b) this.f16215a).mo17148l(3);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l.intValue() == 0 ? 256 : l.intValue());
        sb.append(" pixels");
        return sb.toString();
    }

    /* renamed from: x */
    public String mo17779x() {
        return mo17193l(1, 1, "Icon", "Cursor");
    }

    /* renamed from: y */
    public String mo17780y() {
        Integer l = ((C5862b) this.f16215a).mo17148l(2);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l.intValue() == 0 ? 256 : l.intValue());
        sb.append(" pixels");
        return sb.toString();
    }
}
