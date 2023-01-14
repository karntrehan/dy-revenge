package p174e.p199d.p218c.p231p;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.p.j */
public class C5856j extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16336f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16336f = hashMap;
        hashMap.put(1, "Left");
        hashMap.put(2, "Top");
        hashMap.put(3, "Width");
        hashMap.put(4, "Height");
        hashMap.put(5, "Has Local Colour Table");
        hashMap.put(6, "Is Interlaced");
        hashMap.put(7, "Is Local Colour Table Sorted");
        hashMap.put(8, "Local Colour Table Bits Per Pixel");
    }

    public C5856j() {
        mo17120E(new C5855i(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "GIF Image";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16336f;
    }
}
