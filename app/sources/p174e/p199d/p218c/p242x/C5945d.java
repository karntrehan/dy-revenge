package p174e.p199d.p218c.p242x;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.x.d */
public class C5945d extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16492f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16492f = hashMap;
        hashMap.put(1, "Major Brand");
        hashMap.put(2, "Minor Version");
        hashMap.put(3, "Compatible Brands");
        hashMap.put(256, "Creation Time");
        hashMap.put(257, "Modification Time");
        hashMap.put(258, "Media Time Scale");
        hashMap.put(259, "Duration");
        hashMap.put(260, "Preferred Rate");
        hashMap.put(261, "Preferred Volume");
        hashMap.put(264, "Preview Time");
        hashMap.put(265, "Preview Duration");
        hashMap.put(266, "Poster Time");
        hashMap.put(267, "Selection Time");
        hashMap.put(268, "Selection Duration");
        hashMap.put(269, "Current Time");
        hashMap.put(270, "Next Track ID");
        hashMap.put(271, "Transformation Matrix");
        hashMap.put(774, "Media Time Scale");
    }

    public C5945d() {
        mo17120E(new C5943b(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "MP4";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16492f;
    }
}
