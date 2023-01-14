package p174e.p199d.p218c.p228n;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.t */
public class C5836t extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16319f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16319f = hashMap;
        hashMap.put(1, "Panasonic Raw Version");
        hashMap.put(2, "Sensor Width");
        hashMap.put(3, "Sensor Height");
        hashMap.put(4, "Sensor Top Border");
        hashMap.put(5, "Sensor Left Border");
        hashMap.put(6, "Sensor Bottom Border");
        hashMap.put(7, "Sensor Right Border");
        hashMap.put(8, "Black Level 1");
        hashMap.put(9, "Black Level 2");
        hashMap.put(10, "Black Level 3");
        hashMap.put(14, "Linearity Limit Red");
        hashMap.put(15, "Linearity Limit Green");
        hashMap.put(16, "Linearity Limit Blue");
        hashMap.put(17, "Red Balance");
        hashMap.put(18, "Blue Balance");
        hashMap.put(23, "ISO");
        hashMap.put(24, "High ISO Multiplier Red");
        hashMap.put(25, "High ISO Multiplier Green");
        hashMap.put(26, "High ISO Multiplier Blue");
        hashMap.put(28, "Black Level Red");
        hashMap.put(29, "Black Level Green");
        hashMap.put(30, "Black Level Blue");
        hashMap.put(36, "WB Red Level");
        hashMap.put(37, "WB Green Level");
        hashMap.put(38, "WB Blue Level");
        hashMap.put(46, "Jpg From Raw");
        hashMap.put(47, "Crop Top");
        hashMap.put(48, "Crop Left");
        hashMap.put(49, "Crop Bottom");
        hashMap.put(50, "Crop Right");
        hashMap.put(271, "Make");
        hashMap.put(272, "Model");
        hashMap.put(273, "Strip Offsets");
        hashMap.put(274, "Orientation");
        hashMap.put(278, "Rows Per Strip");
        hashMap.put(279, "Strip Byte Counts");
        hashMap.put(280, "Raw Data Offset");
    }

    public C5836t() {
        mo17120E(new C5835s(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "PanasonicRaw Exif IFD0";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16319f;
    }
}
