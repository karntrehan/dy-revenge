package p174e.p199d.p218c.p237v;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.v.i */
public class C5884i extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16365f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16365f = hashMap;
        hashMap.put(-3, "Compression Type");
        hashMap.put(0, "Data Precision");
        hashMap.put(3, "Image Width");
        hashMap.put(1, "Image Height");
        hashMap.put(5, "Number of Components");
        hashMap.put(6, "Component 1");
        hashMap.put(7, "Component 2");
        hashMap.put(8, "Component 3");
        hashMap.put(9, "Component 4");
    }

    public C5884i() {
        mo17120E(new C5882g(this));
    }

    /* renamed from: V */
    public C5881f mo17818V(int i) {
        return (C5881f) mo17150o(i + 6);
    }

    /* renamed from: n */
    public String mo17104n() {
        return "JPEG";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16365f;
    }
}
