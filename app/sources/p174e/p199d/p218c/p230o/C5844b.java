package p174e.p199d.p218c.p230o;

import java.util.HashMap;
import p174e.p199d.p200a.C5655a;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.o.b */
public class C5844b extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16323f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16323f = hashMap;
        hashMap.put(1, "Detected File Type Name");
        hashMap.put(2, "Detected File Type Long Name");
        hashMap.put(3, "Detected MIME Type");
        hashMap.put(4, "Expected File Name Extension");
    }

    public C5844b(C5655a aVar) {
        mo17120E(new C5843a(this));
        mo17133R(1, aVar.mo16937v());
        mo17133R(2, aVar.mo16935g());
        if (aVar.mo16936h() != null) {
            mo17133R(3, aVar.mo16936h());
        }
        if (aVar.mo16934e() != null) {
            mo17133R(4, aVar.mo16934e());
        }
    }

    /* renamed from: n */
    public String mo17104n() {
        return "File Type";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16323f;
    }
}
