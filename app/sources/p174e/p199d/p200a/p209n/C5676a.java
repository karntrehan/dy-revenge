package p174e.p199d.p200a.p209n;

import java.io.IOException;
import p174e.p199d.p217b.C5713n;

/* renamed from: e.d.a.n.a */
public class C5676a {

    /* renamed from: a */
    private final int f16078a;

    /* renamed from: b */
    private final int f16079b;

    /* renamed from: c */
    private final int f16080c;

    /* renamed from: d */
    private final int f16081d;

    /* renamed from: e */
    private final int f16082e;

    /* renamed from: f */
    private final int f16083f;

    /* renamed from: g */
    private final int f16084g;

    /* renamed from: h */
    private final int f16085h;

    public C5676a(byte[] bArr) {
        if (bArr.length == 32) {
            C5713n nVar = new C5713n(bArr);
            try {
                this.f16078a = nVar.mo17087f();
                this.f16079b = nVar.mo17087f();
                this.f16080c = nVar.mo17087f();
                this.f16081d = nVar.mo17087f();
                this.f16082e = nVar.mo17087f();
                this.f16083f = nVar.mo17087f();
                this.f16084g = nVar.mo17087f();
                this.f16085h = nVar.mo17087f();
            } catch (IOException e) {
                throw new C5683h((Throwable) e);
            }
        } else {
            throw new C5683h("Invalid number of bytes");
        }
    }

    /* renamed from: a */
    public int mo16949a() {
        return this.f16084g;
    }

    /* renamed from: b */
    public int mo16950b() {
        return this.f16085h;
    }

    /* renamed from: c */
    public int mo16951c() {
        return this.f16082e;
    }

    /* renamed from: d */
    public int mo16952d() {
        return this.f16083f;
    }

    /* renamed from: e */
    public int mo16953e() {
        return this.f16080c;
    }

    /* renamed from: f */
    public int mo16954f() {
        return this.f16081d;
    }

    /* renamed from: g */
    public int mo16955g() {
        return this.f16078a;
    }

    /* renamed from: h */
    public int mo16956h() {
        return this.f16079b;
    }
}
