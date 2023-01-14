package p174e.p199d.p218c.p245y;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.y.b */
public class C5979b extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16558f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16558f = hashMap;
        hashMap.put(1, "Version");
        hashMap.put(2, "Bits Per Pixel");
        hashMap.put(3, "X Min");
        hashMap.put(4, "Y Min");
        hashMap.put(5, "X Max");
        hashMap.put(6, "Y Max");
        hashMap.put(7, "Horizontal DPI");
        hashMap.put(8, "Vertical DPI");
        hashMap.put(9, "Palette");
        hashMap.put(10, "Color Planes");
        hashMap.put(11, "Bytes Per Line");
        hashMap.put(12, "Palette Type");
        hashMap.put(13, "H Scr Size");
        hashMap.put(14, "V Scr Size");
    }

    public C5979b() {
        mo17120E(new C5978a(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "PCX";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16558f;
    }
}
