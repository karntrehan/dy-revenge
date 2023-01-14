package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.a0.p0 */
public class C5797p0 extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16295f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16295f = hashMap;
        hashMap.put(1, "Capture Mode");
        hashMap.put(2, "Quality Level");
        hashMap.put(3, "Focus Mode");
        hashMap.put(4, "Flash Mode");
        hashMap.put(7, "White Balance");
        hashMap.put(10, "Digital Zoom");
        hashMap.put(11, "Sharpness");
        hashMap.put(12, "Contrast");
        hashMap.put(13, "Saturation");
        hashMap.put(20, "ISO Speed");
        hashMap.put(23, "Colour");
        hashMap.put(3584, "Print Image Matching (PIM) Info");
        hashMap.put(4096, "Time Zone");
        hashMap.put(4097, "Daylight Savings");
    }

    public C5797p0() {
        mo17120E(new C5795o0(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Pentax Makernote";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16295f;
    }
}
