package p174e.p199d.p218c.p225k;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.k.b */
public class C5744b extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16217f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16217f = hashMap;
        hashMap.put(1, "Frames Per Second");
        hashMap.put(2, "Samples Per Second");
        hashMap.put(3, "Duration");
        hashMap.put(4, "Video Codec");
        hashMap.put(5, "Audio Codec");
        hashMap.put(6, "Width");
        hashMap.put(7, "Height");
        hashMap.put(8, "Stream Count");
    }

    public C5744b() {
        mo17120E(new C5743a(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "AVI";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16217f;
    }
}
