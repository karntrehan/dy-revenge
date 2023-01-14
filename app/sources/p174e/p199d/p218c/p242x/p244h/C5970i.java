package p174e.p199d.p218c.p242x.p244h;

import java.util.HashMap;

/* renamed from: e.d.c.x.h.i */
public class C5970i extends C5965d {

    /* renamed from: g */
    protected static final HashMap<Integer, String> f16555g;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16555g = hashMap;
        C5965d.m22513V(hashMap);
        hashMap.put(101, "Format");
        hashMap.put(102, "Number of Channels");
        hashMap.put(103, "Sample Size");
        hashMap.put(104, "Sample Rate");
        hashMap.put(105, "Balance");
    }

    public C5970i() {
        mo17120E(new C5969h(this));
    }

    /* renamed from: n */
    public String mo17104n() {
        return "MP4 Sound";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16555g;
    }
}
