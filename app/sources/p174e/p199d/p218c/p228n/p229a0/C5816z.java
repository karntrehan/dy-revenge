package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.a0.z */
public class C5816z extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16310f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16310f = hashMap;
        hashMap.put(0, "Equipment Version");
        hashMap.put(256, "Camera Type 2");
        hashMap.put(257, "Serial Number");
        hashMap.put(258, "Internal Serial Number");
        hashMap.put(259, "Focal Plane Diagonal");
        hashMap.put(260, "Body Firmware Version");
        hashMap.put(513, "Lens Type");
        hashMap.put(514, "Lens Serial Number");
        hashMap.put(515, "Lens Model");
        hashMap.put(516, "Lens Firmware Version");
        hashMap.put(517, "Max Aperture At Min Focal");
        hashMap.put(518, "Max Aperture At Max Focal");
        hashMap.put(519, "Min Focal Length");
        hashMap.put(520, "Max Focal Length");
        hashMap.put(522, "Max Aperture");
        hashMap.put(523, "Lens Properties");
        hashMap.put(769, "Extender");
        hashMap.put(770, "Extender Serial Number");
        hashMap.put(771, "Extender Model");
        hashMap.put(772, "Extender Firmware Version");
        hashMap.put(1027, "Conversion Lens");
        hashMap.put(4096, "Flash Type");
        hashMap.put(4097, "Flash Model");
        hashMap.put(4098, "Flash Firmware Version");
        hashMap.put(4099, "Flash Serial Number");
    }

    public C5816z() {
        mo17120E(new C5814y(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Olympus Equipment";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16310f;
    }
}
