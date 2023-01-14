package p174e.p199d.p218c.p237v;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.v.a */
public class C5874a extends C5739i<C5875b> {
    public C5874a(C5875b bVar) {
        super(bVar);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 1 ? super.mo17110f(i) : mo17806v();
    }

    /* renamed from: v */
    public String mo17806v() {
        Integer l = ((C5875b) this.f16215a).mo17148l(1);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append(l.intValue() == 1 ? " Huffman table" : " Huffman tables");
        return sb.toString();
    }
}
