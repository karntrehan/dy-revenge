package p174e.p199d.p218c.p228n;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.r */
public class C5834r extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16318f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16318f = hashMap;
        hashMap.put(2, "Distortion Param 2");
        hashMap.put(4, "Distortion Param 4");
        hashMap.put(5, "Distortion Scale");
        hashMap.put(7, "Distortion Correction");
        hashMap.put(8, "Distortion Param 8");
        hashMap.put(9, "Distortion Param 9");
        hashMap.put(11, "Distortion Param 11");
        hashMap.put(12, "Distortion N");
    }

    public C5834r() {
        mo17120E(new C5833q(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "PanasonicRaw DistortionInfo";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16318f;
    }
}
