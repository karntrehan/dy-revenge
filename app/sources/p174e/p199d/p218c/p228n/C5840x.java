package p174e.p199d.p218c.p228n;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.x */
public class C5840x extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16321f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16321f = hashMap;
        hashMap.put(0, "Num WB Entries");
        hashMap.put(1, "WB Type 1");
        hashMap.put(2, "WB RGB Levels 1");
        hashMap.put(4, "WB Type 2");
        hashMap.put(5, "WB RGB Levels 2");
        hashMap.put(7, "WB Type 3");
        hashMap.put(8, "WB RGB Levels 3");
        hashMap.put(10, "WB Type 4");
        hashMap.put(11, "WB RGB Levels 4");
        hashMap.put(13, "WB Type 5");
        hashMap.put(14, "WB RGB Levels 5");
        hashMap.put(16, "WB Type 6");
        hashMap.put(17, "WB RGB Levels 6");
        hashMap.put(19, "WB Type 7");
        hashMap.put(20, "WB RGB Levels 7");
    }

    public C5840x() {
        mo17120E(new C5839w(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "PanasonicRaw WbInfo";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16321f;
    }
}
