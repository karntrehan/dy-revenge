package p174e.p199d.p218c.p219a0;

import java.util.HashMap;
import p174e.p199d.p200a.p209n.C5679d;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.a0.c */
public class C5721c extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16184f;

    /* renamed from: g */
    private final C5679d f16185g;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16184f = hashMap;
        hashMap.put(2, "Image Height");
        hashMap.put(1, "Image Width");
        hashMap.put(3, "Bits Per Sample");
        hashMap.put(4, "Color Type");
        hashMap.put(5, "Compression Type");
        hashMap.put(6, "Filter Method");
        hashMap.put(7, "Interlace Method");
        hashMap.put(8, "Palette Size");
        hashMap.put(9, "Palette Has Transparency");
        hashMap.put(10, "sRGB Rendering Intent");
        hashMap.put(11, "Image Gamma");
        hashMap.put(12, "ICC Profile Name");
        hashMap.put(13, "Textual Data");
        hashMap.put(14, "Last Modification Time");
        hashMap.put(15, "Background Color");
        hashMap.put(16, "Pixels Per Unit X");
        hashMap.put(17, "Pixels Per Unit Y");
        hashMap.put(18, "Unit Specifier");
        hashMap.put(19, "Significant Bits");
    }

    public C5721c(C5679d dVar) {
        this.f16185g = dVar;
        mo17120E(new C5720b(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "PNG-" + this.f16185g.mo16961b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16184f;
    }
}
