package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.a0.r0 */
public class C5801r0 extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16297f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16297f = hashMap;
        hashMap.put(0, "Makernote Version");
        hashMap.put(2, "Firmware Version");
        hashMap.put(12, "Trigger Mode");
        hashMap.put(14, "Sequence");
        hashMap.put(18, "Event Number");
        hashMap.put(22, "Date/Time Original");
        hashMap.put(36, "Moon Phase");
        hashMap.put(38, "Ambient Temperature Fahrenheit");
        hashMap.put(40, "Ambient Temperature");
        hashMap.put(42, "Serial Number");
        hashMap.put(72, "Contrast");
        hashMap.put(74, "Brightness");
        hashMap.put(76, "Sharpness");
        hashMap.put(78, "Saturation");
        hashMap.put(80, "Infrared Illuminator");
        hashMap.put(82, "Motion Sensitivity");
        hashMap.put(84, "Battery Voltage");
        hashMap.put(86, "User Label");
    }

    public C5801r0() {
        mo17120E(new C5799q0(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Reconyx HyperFire Makernote";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16297f;
    }
}
