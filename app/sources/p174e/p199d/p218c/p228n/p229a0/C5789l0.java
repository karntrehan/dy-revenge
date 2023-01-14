package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import okhttp3.internal.http.StatusLine;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.a0.l0 */
public class C5789l0 extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16290f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16290f = hashMap;
        hashMap.put(0, "Raw Info Version");
        hashMap.put(256, "WB RB Levels Used");
        hashMap.put(272, "WB RB Levels Auto");
        hashMap.put(288, "WB RB Levels Shade");
        hashMap.put(289, "WB RB Levels Cloudy");
        hashMap.put(290, "WB RB Levels Fine Weather");
        hashMap.put(291, "WB RB Levels Tungsten");
        hashMap.put(292, "WB RB Levels Evening Sunlight");
        hashMap.put(304, "WB RB Levels Daylight Fluor");
        hashMap.put(305, "WB RB Levels Day White Fluor");
        hashMap.put(306, "WB RB Levels Cool White Fluor");
        hashMap.put(Integer.valueOf(StatusLine.HTTP_TEMP_REDIRECT), "WB RB Levels White Fluorescent");
        hashMap.put(512, "Color Matrix 2");
        hashMap.put(784, "Coring Filter");
        hashMap.put(785, "Coring Values");
        hashMap.put(1536, "Black Level 2");
        hashMap.put(1537, "YCbCrCoefficients");
        hashMap.put(1553, "Valid Pixel Depth");
        hashMap.put(1554, "Crop Left");
        hashMap.put(1555, "Crop Top");
        hashMap.put(1556, "Crop Width");
        hashMap.put(1557, "Crop Height");
        hashMap.put(4096, "Light Source");
        hashMap.put(4097, "White Balance Comp");
        hashMap.put(4112, "Saturation Setting");
        hashMap.put(4113, "Hue Setting");
        hashMap.put(4114, "Contrast Setting");
        hashMap.put(4115, "Sharpness Setting");
        hashMap.put(8192, "CM Exposure Compensation");
        hashMap.put(8193, "CM White Balance");
        hashMap.put(8194, "CM White Balance Comp");
        hashMap.put(8208, "CM White Balance Gray Point");
        hashMap.put(8224, "CM Saturation");
        hashMap.put(8225, "CM Hue");
        hashMap.put(8226, "CM Contrast");
        hashMap.put(8227, "CM Sharpness");
    }

    public C5789l0() {
        mo17120E(new C5787k0(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Olympus Raw Info";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16290f;
    }
}
