package p174e.p199d.p218c.p238w;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.w.d */
public class C5890d extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16372f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16372f = hashMap;
        hashMap.put(4096, "Major Brand");
        hashMap.put(4097, "Minor Version");
        hashMap.put(4098, "Compatible Brands");
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
        hashMap.put(774, "Media Time Scale");
    }

    public C5890d() {
        mo17120E(new C5888b(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "QuickTime";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16372f;
    }
}
