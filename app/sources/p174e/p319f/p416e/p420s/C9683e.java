package p174e.p319f.p416e.p420s;

import java.util.List;

/* renamed from: e.f.e.s.e */
public final class C9683e {

    /* renamed from: a */
    private final byte[] f25933a;

    /* renamed from: b */
    private int f25934b;

    /* renamed from: c */
    private final String f25935c;

    /* renamed from: d */
    private final List<byte[]> f25936d;

    /* renamed from: e */
    private final String f25937e;

    /* renamed from: f */
    private Integer f25938f;

    /* renamed from: g */
    private Integer f25939g;

    /* renamed from: h */
    private Object f25940h;

    /* renamed from: i */
    private final int f25941i;

    /* renamed from: j */
    private final int f25942j;

    public C9683e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public C9683e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f25933a = bArr;
        this.f25934b = bArr == null ? 0 : bArr.length * 8;
        this.f25935c = str;
        this.f25936d = list;
        this.f25937e = str2;
        this.f25941i = i2;
        this.f25942j = i;
    }

    /* renamed from: a */
    public List<byte[]> mo24282a() {
        return this.f25936d;
    }

    /* renamed from: b */
    public String mo24283b() {
        return this.f25937e;
    }

    /* renamed from: c */
    public int mo24284c() {
        return this.f25934b;
    }

    /* renamed from: d */
    public Object mo24285d() {
        return this.f25940h;
    }

    /* renamed from: e */
    public byte[] mo24286e() {
        return this.f25933a;
    }

    /* renamed from: f */
    public int mo24287f() {
        return this.f25941i;
    }

    /* renamed from: g */
    public int mo24288g() {
        return this.f25942j;
    }

    /* renamed from: h */
    public String mo24289h() {
        return this.f25935c;
    }

    /* renamed from: i */
    public boolean mo24290i() {
        return this.f25941i >= 0 && this.f25942j >= 0;
    }

    /* renamed from: j */
    public void mo24291j(Integer num) {
        this.f25939g = num;
    }

    /* renamed from: k */
    public void mo24292k(Integer num) {
        this.f25938f = num;
    }

    /* renamed from: l */
    public void mo24293l(int i) {
        this.f25934b = i;
    }

    /* renamed from: m */
    public void mo24294m(Object obj) {
        this.f25940h = obj;
    }
}
