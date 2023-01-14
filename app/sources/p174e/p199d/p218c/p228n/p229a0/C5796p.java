package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.a0.p */
public class C5796p extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16294f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16294f = hashMap;
        hashMap.put(768, "Quality");
        hashMap.put(770, "User Profile");
        hashMap.put(771, "Serial Number");
        hashMap.put(772, "White Balance");
        hashMap.put(784, "Lens Type");
        hashMap.put(785, "External Sensor Brightness Value");
        hashMap.put(786, "Measured LV");
        hashMap.put(787, "Approximate F Number");
        hashMap.put(800, "Camera Temperature");
        hashMap.put(801, "Color Temperature");
        hashMap.put(802, "WB Red Level");
        hashMap.put(803, "WB Green Level");
        hashMap.put(804, "WB Blue Level");
        hashMap.put(816, "CCD Version");
        hashMap.put(817, "CCD Board Version");
        hashMap.put(818, "Controller Board Version");
        hashMap.put(819, "M16 C Version");
        hashMap.put(832, "Image ID Number");
    }

    public C5796p() {
        mo17120E(new C5794o(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Leica Makernote";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16294f;
    }
}
