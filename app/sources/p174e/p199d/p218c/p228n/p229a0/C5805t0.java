package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.a0.t0 */
public class C5805t0 extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16299f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16299f = hashMap;
        hashMap.put(0, "Makernote Label");
        hashMap.put(10, "Makernote ID");
        hashMap.put(14, "Makernote Size");
        hashMap.put(18, "Makernote Public ID");
        hashMap.put(22, "Makernote Public Size");
        hashMap.put(24, "Camera Version");
        hashMap.put(31, "Uib Version");
        hashMap.put(38, "Btl Version");
        hashMap.put(45, "Pex Version");
        hashMap.put(52, "Event Type");
        hashMap.put(53, "Sequence");
        hashMap.put(55, "Event Number");
        hashMap.put(59, "Date/Time Original");
        hashMap.put(66, "Day of Week");
        hashMap.put(67, "Moon Phase");
        hashMap.put(68, "Ambient Temperature Fahrenheit");
        hashMap.put(70, "Ambient Temperature");
        hashMap.put(72, "Flash");
        hashMap.put(73, "Battery Voltage");
        hashMap.put(75, "Serial Number");
        hashMap.put(80, "User Label");
    }

    public C5805t0() {
        mo17120E(new C5803s0(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Reconyx UltraFire Makernote";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16299f;
    }
}
