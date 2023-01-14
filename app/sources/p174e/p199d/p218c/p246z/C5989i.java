package p174e.p199d.p218c.p246z;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.z.i */
public class C5989i extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16563f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16563f = hashMap;
        hashMap.put(1, "Channel Count");
        hashMap.put(2, "Image Height");
        hashMap.put(3, "Image Width");
        hashMap.put(4, "Bits Per Channel");
        hashMap.put(5, "Color Mode");
    }

    public C5989i() {
        mo17120E(new C5988h(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "PSD Header";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16563f;
    }
}
