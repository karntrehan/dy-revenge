package p477h.p478a.p479a.p480b.p481f;

import java.util.Objects;
import okhttp3.internal.http2.Http2Connection;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.b.f.b */
public class C10490b {

    /* renamed from: a */
    private C10491c f27684a;

    /* renamed from: b */
    private C10492d f27685b;

    public C10490b(C10491c cVar) {
        this(cVar, (C10492d) null);
    }

    public C10490b(C10491c cVar, C10492d dVar) {
        this.f27684a = cVar;
        this.f27685b = dVar;
    }

    /* renamed from: b */
    private byte[] m35392b(C10492d dVar, byte[] bArr, int i, int i2) {
        int i3 = i2;
        byte[] bArr2 = bArr == null ? new byte[0] : bArr;
        int b = dVar.mo25880b();
        int e = m35395e(i3, b);
        int i4 = i3 - ((e - 1) * b);
        byte[] bArr3 = new byte[(e * b)];
        int i5 = 0;
        for (int i6 = 1; i6 <= e; i6++) {
            m35393c(bArr3, i5, dVar, bArr2, i, i6);
            i5 += b;
        }
        if (i4 >= b) {
            return bArr3;
        }
        byte[] bArr4 = new byte[i3];
        System.arraycopy(bArr3, 0, bArr4, 0, i3);
        return bArr4;
    }

    /* renamed from: c */
    private void m35393c(byte[] bArr, int i, C10492d dVar, byte[] bArr2, int i2, int i3) {
        int b = dVar.mo25880b();
        byte[] bArr3 = new byte[b];
        byte[] bArr4 = new byte[(bArr2.length + 4)];
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        mo25884a(bArr4, bArr2.length, i3);
        for (int i4 = 0; i4 < i2; i4++) {
            bArr4 = dVar.mo25879a(bArr4);
            m35396g(bArr3, bArr4);
        }
        System.arraycopy(bArr3, 0, bArr, i, b);
    }

    /* renamed from: d */
    private void m35394d(byte[] bArr) {
        if (this.f27685b == null) {
            this.f27685b = new C10489a(this.f27684a.mo25886a());
        }
        this.f27685b.mo25881c(bArr);
    }

    /* renamed from: e */
    private int m35395e(int i, int i2) {
        return (i / i2) + (i % i2 > 0 ? 1 : 0);
    }

    /* renamed from: g */
    private void m35396g(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25884a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 / Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        bArr[i + 1] = (byte) (i2 / 65536);
        bArr[i + 2] = (byte) (i2 / 256);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: f */
    public byte[] mo25885f(char[] cArr, int i) {
        Objects.requireNonNull(cArr);
        m35394d(C10585h.m35934a(cArr));
        if (i == 0) {
            i = this.f27685b.mo25880b();
        }
        return m35392b(this.f27685b, this.f27684a.mo25888c(), this.f27684a.mo25887b(), i);
    }
}
