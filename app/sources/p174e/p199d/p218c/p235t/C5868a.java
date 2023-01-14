package p174e.p199d.p218c.p235t;

import okhttp3.HttpUrl;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.t.a */
public class C5868a extends C5739i<C5869b> {
    public C5868a(C5869b bVar) {
        super(bVar);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 5 ? i != 10 ? i != 7 ? i != 8 ? super.mo17110f(i) : mo17800w() : mo17799v() : mo17801x() : mo17802y();
    }

    /* renamed from: v */
    public String mo17799v() {
        Integer l = ((C5869b) this.f16215a).mo17148l(7);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? "unit" : "centimetre" : "inch" : "none";
    }

    /* renamed from: w */
    public String mo17800w() {
        Integer l = ((C5869b) this.f16215a).mo17148l(8);
        if (l == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = l;
        objArr[1] = l.intValue() == 1 ? HttpUrl.FRAGMENT_ENCODE_SET : "s";
        return String.format("%d dot%s", objArr);
    }

    /* renamed from: x */
    public String mo17801x() {
        Integer l = ((C5869b) this.f16215a).mo17148l(10);
        if (l == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = l;
        objArr[1] = l.intValue() == 1 ? HttpUrl.FRAGMENT_ENCODE_SET : "s";
        return String.format("%d dot%s", objArr);
    }

    /* renamed from: y */
    public String mo17802y() {
        Integer l = ((C5869b) this.f16215a).mo17148l(5);
        if (l == null) {
            return null;
        }
        return String.format("%d.%d", new Object[]{Integer.valueOf((l.intValue() & 65280) >> 8), Integer.valueOf(l.intValue() & 255)});
    }
}
