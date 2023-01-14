package p477h.p478a.p479a.p485e.p486a;

import java.io.InputStream;
import p477h.p478a.p479a.p480b.C10487d;
import p477h.p478a.p479a.p488f.C10544k;
import p477h.p478a.p479a.p488f.p489r.C10555d;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.e.a.b */
abstract class C10508b<T extends C10487d> extends InputStream {

    /* renamed from: f */
    private C10517j f27757f;

    /* renamed from: o */
    private T f27758o;

    /* renamed from: p */
    private byte[] f27759p;

    /* renamed from: q */
    private byte[] f27760q = new byte[1];

    /* renamed from: r */
    private C10544k f27761r;

    public C10508b(C10517j jVar, C10544k kVar, char[] cArr) {
        this.f27757f = jVar;
        this.f27758o = mo25911A(kVar, cArr);
        this.f27761r = kVar;
        if (C10585h.m35939f(kVar).equals(C10555d.DEFLATE)) {
            this.f27759p = new byte[4096];
        }
    }

    /* renamed from: a */
    private void m35496a(byte[] bArr, int i) {
        byte[] bArr2 = this.f27759p;
        if (bArr2 != null) {
            System.arraycopy(bArr, 0, bArr2, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract T mo25911A(C10544k kVar, char[] cArr);

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public int mo25918E(byte[] bArr) {
        return this.f27757f.mo25948a(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25912b(InputStream inputStream) {
    }

    public void close() {
        this.f27757f.close();
    }

    /* renamed from: h */
    public T mo25920h() {
        return this.f27758o;
    }

    /* renamed from: o */
    public byte[] mo25921o() {
        return this.f27759p;
    }

    /* renamed from: r */
    public C10544k mo25922r() {
        return this.f27761r;
    }

    public int read() {
        if (read(this.f27760q) == -1) {
            return -1;
        }
        return this.f27760q[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = C10585h.m35942i(this.f27757f, bArr, i, i2);
        if (i3 > 0) {
            m35496a(bArr, i3);
            this.f27758o.mo25873a(bArr, i, i3);
        }
        return i3;
    }
}
