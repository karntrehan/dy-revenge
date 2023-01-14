package p174e.p199d.p218c.p233r;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.r.b */
public class C5862b extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16338f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16338f = hashMap;
        hashMap.put(1, "Image Type");
        hashMap.put(2, "Image Width");
        hashMap.put(3, "Image Height");
        hashMap.put(4, "Colour Palette Size");
        hashMap.put(5, "Colour Planes");
        hashMap.put(6, "Hotspot X");
        hashMap.put(7, "Bits Per Pixel");
        hashMap.put(8, "Hotspot Y");
        hashMap.put(9, "Image Size Bytes");
        hashMap.put(10, "Image Offset Bytes");
    }

    public C5862b() {
        mo17120E(new C5861a(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "ICO";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16338f;
    }
}
