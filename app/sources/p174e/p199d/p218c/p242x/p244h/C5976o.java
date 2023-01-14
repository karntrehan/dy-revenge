package p174e.p199d.p218c.p242x.p244h;

import java.util.HashMap;
import p027c.p028a.C1444j;

/* renamed from: e.d.c.x.h.o */
public class C5976o extends C5965d {

    /* renamed from: g */
    protected static final HashMap<Integer, String> f16557g;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16557g = hashMap;
        C5965d.m22513V(hashMap);
        hashMap.put(101, "Vendor");
        hashMap.put(102, "Temporal Quality");
        hashMap.put(103, "Spatial Quality");
        hashMap.put(104, "Width");
        hashMap.put(105, "Height");
        hashMap.put(106, "Horizontal Resolution");
        hashMap.put(107, "Vertical Resolution");
        hashMap.put(108, "Compressor Name");
        hashMap.put(109, "Depth");
        hashMap.put(110, "Compression Type");
        hashMap.put(111, "Graphics Mode");
        hashMap.put(112, "Opcolor");
        hashMap.put(113, "Color Table");
        hashMap.put(Integer.valueOf(C1444j.f4216D0), "Frame Rate");
    }

    public C5976o() {
        mo17120E(new C5975n(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "MP4 Video";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16557g;
    }
}
