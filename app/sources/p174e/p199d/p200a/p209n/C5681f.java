package p174e.p199d.p200a.p209n;

import java.io.IOException;
import p174e.p199d.p217b.C5713n;

/* renamed from: e.d.a.n.f */
public class C5681f {

    /* renamed from: a */
    private int f16119a;

    /* renamed from: b */
    private int f16120b;

    /* renamed from: c */
    private byte f16121c;

    /* renamed from: d */
    private C5680e f16122d;

    /* renamed from: e */
    private byte f16123e;

    /* renamed from: f */
    private byte f16124f;

    /* renamed from: g */
    private byte f16125g;

    public C5681f(byte[] bArr) {
        if (bArr.length == 13) {
            C5713n nVar = new C5713n(bArr);
            try {
                this.f16119a = nVar.mo17087f();
                this.f16120b = nVar.mo17087f();
                this.f16121c = nVar.mo17089h();
                byte h = nVar.mo17089h();
                C5680e e = C5680e.m21135e(h);
                if (e != null) {
                    this.f16122d = e;
                    this.f16123e = nVar.mo17089h();
                    this.f16124f = nVar.mo17089h();
                    this.f16125g = nVar.mo17089h();
                    return;
                }
                throw new C5683h("Unexpected PNG color type: " + h);
            } catch (IOException e2) {
                throw new C5683h((Throwable) e2);
            }
        } else {
            throw new C5683h("PNG header chunk must have 13 data bytes");
        }
    }

    /* renamed from: a */
    public byte mo16967a() {
        return this.f16121c;
    }

    /* renamed from: b */
    public C5680e mo16968b() {
        return this.f16122d;
    }

    /* renamed from: c */
    public byte mo16969c() {
        return this.f16123e;
    }

    /* renamed from: d */
    public byte mo16970d() {
        return this.f16124f;
    }

    /* renamed from: e */
    public int mo16971e() {
        return this.f16120b;
    }

    /* renamed from: f */
    public int mo16972f() {
        return this.f16119a;
    }

    /* renamed from: g */
    public byte mo16973g() {
        return this.f16125g;
    }
}
