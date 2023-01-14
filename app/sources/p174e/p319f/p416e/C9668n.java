package p174e.p319f.p416e;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: e.f.e.n */
public final class C9668n {

    /* renamed from: a */
    private final String f25845a;

    /* renamed from: b */
    private final byte[] f25846b;

    /* renamed from: c */
    private final int f25847c;

    /* renamed from: d */
    private C9670p[] f25848d;

    /* renamed from: e */
    private final C9655a f25849e;

    /* renamed from: f */
    private Map<C9669o, Object> f25850f;

    /* renamed from: g */
    private final long f25851g;

    public C9668n(String str, byte[] bArr, int i, C9670p[] pVarArr, C9655a aVar, long j) {
        this.f25845a = str;
        this.f25846b = bArr;
        this.f25847c = i;
        this.f25848d = pVarArr;
        this.f25849e = aVar;
        this.f25850f = null;
        this.f25851g = j;
    }

    public C9668n(String str, byte[] bArr, C9670p[] pVarArr, C9655a aVar) {
        this(str, bArr, pVarArr, aVar, System.currentTimeMillis());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9668n(String str, byte[] bArr, C9670p[] pVarArr, C9655a aVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, pVarArr, aVar, j);
    }

    /* renamed from: a */
    public void mo24221a(C9670p[] pVarArr) {
        C9670p[] pVarArr2 = this.f25848d;
        if (pVarArr2 == null) {
            this.f25848d = pVarArr;
        } else if (pVarArr != null && pVarArr.length > 0) {
            C9670p[] pVarArr3 = new C9670p[(pVarArr2.length + pVarArr.length)];
            System.arraycopy(pVarArr2, 0, pVarArr3, 0, pVarArr2.length);
            System.arraycopy(pVarArr, 0, pVarArr3, pVarArr2.length, pVarArr.length);
            this.f25848d = pVarArr3;
        }
    }

    /* renamed from: b */
    public C9655a mo24222b() {
        return this.f25849e;
    }

    /* renamed from: c */
    public byte[] mo24223c() {
        return this.f25846b;
    }

    /* renamed from: d */
    public Map<C9669o, Object> mo24224d() {
        return this.f25850f;
    }

    /* renamed from: e */
    public C9670p[] mo24225e() {
        return this.f25848d;
    }

    /* renamed from: f */
    public String mo24226f() {
        return this.f25845a;
    }

    /* renamed from: g */
    public void mo24227g(Map<C9669o, Object> map) {
        if (map != null) {
            Map<C9669o, Object> map2 = this.f25850f;
            if (map2 == null) {
                this.f25850f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void mo24228h(C9669o oVar, Object obj) {
        if (this.f25850f == null) {
            this.f25850f = new EnumMap(C9669o.class);
        }
        this.f25850f.put(oVar, obj);
    }

    public String toString() {
        return this.f25845a;
    }
}
