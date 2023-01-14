package p174e.p199d.p218c.p219a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.a0.a */
public class C5719a extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16183f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16183f = hashMap;
        hashMap.put(1, "White Point X");
        hashMap.put(2, "White Point Y");
        hashMap.put(3, "Red X");
        hashMap.put(4, "Red Y");
        hashMap.put(5, "Green X");
        hashMap.put(6, "Green Y");
        hashMap.put(7, "Blue X");
        hashMap.put(8, "Blue Y");
    }

    public C5719a() {
        mo17120E(new C5739i(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "PNG Chromaticities";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16183f;
    }
}
