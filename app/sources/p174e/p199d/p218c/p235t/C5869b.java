package p174e.p199d.p218c.p235t;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.t.b */
public class C5869b extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16340f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16340f = hashMap;
        hashMap.put(5, "Version");
        hashMap.put(7, "Resolution Units");
        hashMap.put(10, "Y Resolution");
        hashMap.put(8, "X Resolution");
        hashMap.put(12, "Thumbnail Width Pixels");
        hashMap.put(13, "Thumbnail Height Pixels");
    }

    public C5869b() {
        mo17120E(new C5868a(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "JFIF";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16340f;
    }
}
