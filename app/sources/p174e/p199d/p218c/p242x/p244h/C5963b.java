package p174e.p199d.p218c.p242x.p244h;

import java.util.HashMap;

/* renamed from: e.d.c.x.h.b */
public class C5963b extends C5965d {

    /* renamed from: g */
    protected static final HashMap<Integer, String> f16553g;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16553g = hashMap;
        C5965d.m22513V(hashMap);
        hashMap.put(101, "Max PDU Size");
        hashMap.put(102, "Average PDU Size");
        hashMap.put(103, "Max Bitrate");
        hashMap.put(104, "Average Bitrate");
    }

    public C5963b() {
        mo17120E(new C5962a(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "MP4 Hint";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16553g;
    }
}
