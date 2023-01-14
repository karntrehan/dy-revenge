package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.a0.v0 */
public class C5809v0 extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16303f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16303f = hashMap;
        hashMap.put(1, "Makernote Data Type");
        hashMap.put(2, "Version");
        hashMap.put(3584, "Print Image Matching (PIM) Info");
        hashMap.put(8193, "Ricoh Camera Info Makernote Sub-IFD");
    }

    public C5809v0() {
        mo17120E(new C5807u0(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Ricoh Makernote";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16303f;
    }
}
