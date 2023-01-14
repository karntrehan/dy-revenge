package p174e.p199d.p218c.p223e0;

import java.util.HashMap;
import okhttp3.internal.http2.Settings;
import p174e.p175a.p176a.C5377b;
import p174e.p175a.p176a.C5378c;
import p174e.p175a.p176a.C5379d;
import p174e.p175a.p176a.p177i.C5397k;
import p174e.p175a.p176a.p180k.C5415b;
import p174e.p199d.p218c.C5722b;

/* renamed from: e.d.c.e0.b */
public class C5734b extends C5722b {

    /* renamed from: f */
    protected static final HashMap<Integer, String> f16209f;

    /* renamed from: g */
    private C5379d f16210g;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16209f = hashMap;
        hashMap.put(Integer.valueOf(Settings.DEFAULT_INITIAL_WINDOW_SIZE), "XMP Value Count");
    }

    public C5734b() {
        mo17120E(new C5733a(this));
    }

    /* renamed from: V */
    public C5379d mo17172V() {
        if (this.f16210g == null) {
            this.f16210g = new C5397k();
        }
        return this.f16210g;
    }

    /* renamed from: W */
    public void mo17173W(C5379d dVar) {
        this.f16210g = dVar;
        int i = 0;
        try {
            C5378c it = dVar.iterator();
            while (it.hasNext()) {
                if (((C5415b) it.next()).mo16245a() != null) {
                    i++;
                }
            }
            mo17125J(Settings.DEFAULT_INITIAL_WINDOW_SIZE, i);
        } catch (C5377b unused) {
        }
    }

    /* renamed from: n */
    public String mo17104n() {
        return "XMP";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public HashMap<Integer, String> mo17105w() {
        return f16209f;
    }
}
