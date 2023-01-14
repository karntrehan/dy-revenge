package p477h.p478a.p479a.p485e.p487b;

import java.io.OutputStream;
import p477h.p478a.p479a.p480b.C10488e;
import p477h.p478a.p479a.p488f.C10550q;

/* renamed from: h.a.a.e.b.b */
abstract class C10522b<T extends C10488e> extends OutputStream {

    /* renamed from: f */
    private C10531j f27795f;

    /* renamed from: o */
    private T f27796o;

    public C10522b(C10531j jVar, C10550q qVar, char[] cArr) {
        this.f27795f = jVar;
        this.f27796o = mo25961o(jVar, qVar, cArr);
    }

    /* renamed from: a */
    public void mo25960a() {
        this.f27795f.mo25996a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public T mo25965b() {
        return this.f27796o;
    }

    public void close() {
        this.f27795f.close();
    }

    /* renamed from: h */
    public long mo25967h() {
        return this.f27795f.mo25997b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract T mo25961o(OutputStream outputStream, C10550q qVar, char[] cArr);

    /* renamed from: r */
    public void mo25968r(byte[] bArr) {
        this.f27795f.write(bArr);
    }

    public void write(int i) {
        this.f27795f.write(i);
    }

    public void write(byte[] bArr) {
        this.f27795f.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f27796o.mo25875a(bArr, i, i2);
        this.f27795f.write(bArr, i, i2);
    }
}
