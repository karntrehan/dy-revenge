package p174e.p199d.p218c.p231p;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.p.h */
public class C5854h extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16335f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16335f = hashMap;
        hashMap.put(1, "GIF Format Version");
        hashMap.put(3, "Image Height");
        hashMap.put(2, "Image Width");
        hashMap.put(4, "Color Table Size");
        hashMap.put(5, "Is Color Table Sorted");
        hashMap.put(6, "Bits per Pixel");
        hashMap.put(7, "Has Global Color Table");
        hashMap.put(8, "Background Color Index");
        hashMap.put(9, "Pixel Aspect Ratio");
    }

    public C5854h() {
        mo17120E(new C5853g(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "GIF Header";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16335f;
    }
}
