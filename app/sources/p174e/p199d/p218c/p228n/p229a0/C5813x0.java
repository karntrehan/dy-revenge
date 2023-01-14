package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.a0.x0 */
public class C5813x0 extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16307f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16307f = hashMap;
        hashMap.put(1, "Maker Note Version");
        hashMap.put(2, "Device Type");
        hashMap.put(3, "Model Id");
        hashMap.put(67, "Camera Temperature");
        hashMap.put(256, "Face Detect");
        hashMap.put(288, "Face Recognition");
        hashMap.put(291, "Face Name");
        hashMap.put(40961, "Firmware Name");
    }

    public C5813x0() {
        mo17120E(new C5811w0(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Samsung Makernote";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16307f;
    }
}
