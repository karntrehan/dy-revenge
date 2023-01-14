package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.a0.t */
public class C5804t extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16298f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16298f = hashMap;
        hashMap.put(6, "CCD Sensitivity");
        hashMap.put(4, "Color Mode");
        hashMap.put(10, "Digital Zoom");
        hashMap.put(11, "Fisheye Converter");
        hashMap.put(8, "Focus");
        hashMap.put(5, "Image Adjustment");
        hashMap.put(3, "Quality");
        hashMap.put(2, "Makernote Unknown 1");
        hashMap.put(9, "Makernote Unknown 2");
        hashMap.put(3840, "Makernote Unknown 3");
        hashMap.put(7, "White Balance");
    }

    public C5804t() {
        mo17120E(new C5802s(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Nikon Makernote";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16298f;
    }
}
