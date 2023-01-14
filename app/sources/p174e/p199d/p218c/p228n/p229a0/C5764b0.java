package p174e.p199d.p218c.p228n.p229a0;

import java.util.HashMap;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.n.a0.b0 */
public class C5764b0 extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16274f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16274f = hashMap;
        hashMap.put(0, "Focus Info Version");
        hashMap.put(521, "Auto Focus");
        hashMap.put(528, "Scene Detect");
        hashMap.put(529, "Scene Area");
        hashMap.put(530, "Scene Detect Data");
        hashMap.put(768, "Zoom Step Count");
        hashMap.put(769, "Focus Step Count");
        hashMap.put(771, "Focus Step Infinity");
        hashMap.put(772, "Focus Step Near");
        hashMap.put(773, "Focus Distance");
        hashMap.put(776, "AF Point");
        hashMap.put(808, "AF Info");
        hashMap.put(4609, "External Flash");
        hashMap.put(4611, "External Flash Guide Number");
        hashMap.put(4612, "External Flash Bounce");
        hashMap.put(4613, "External Flash Zoom");
        hashMap.put(4616, "Internal Flash");
        hashMap.put(4617, "Manual Flash");
        hashMap.put(4618, "Macro LED");
        hashMap.put(5376, "Sensor Temperature");
        hashMap.put(5632, "Image Stabilization");
    }

    public C5764b0() {
        mo17120E(new C5761a0(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "Olympus Focus Info";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16274f;
    }
}
