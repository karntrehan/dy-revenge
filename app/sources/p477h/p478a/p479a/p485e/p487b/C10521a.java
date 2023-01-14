package p477h.p478a.p479a.p485e.p487b;

import java.io.OutputStream;
import p477h.p478a.p479a.p480b.C10485b;
import p477h.p478a.p479a.p488f.C10550q;

/* renamed from: h.a.a.e.b.a */
class C10521a extends C10522b<C10485b> {

    /* renamed from: p */
    private byte[] f27793p = new byte[16];

    /* renamed from: q */
    private int f27794q = 0;

    public C10521a(C10531j jVar, C10550q qVar, char[] cArr) {
        super(jVar, qVar, cArr);
    }

    /* renamed from: E */
    private void m35540E(C10485b bVar) {
        mo25968r(bVar.mo25878e());
        mo25968r(bVar.mo25876c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C10485b mo25961o(OutputStream outputStream, C10550q qVar, char[] cArr) {
        C10485b bVar = new C10485b(cArr, qVar.mo26165a());
        m35540E(bVar);
        return bVar;
    }

    /* renamed from: a */
    public void mo25960a() {
        int i = this.f27794q;
        if (i != 0) {
            super.write(this.f27793p, 0, i);
            this.f27794q = 0;
        }
        mo25968r(((C10485b) mo25965b()).mo25877d());
        super.mo25960a();
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f27794q;
        if (i2 >= 16 - i4) {
            System.arraycopy(bArr, i, this.f27793p, i4, 16 - i4);
            byte[] bArr2 = this.f27793p;
            super.write(bArr2, 0, bArr2.length);
            int i5 = 16 - this.f27794q;
            int i6 = i2 - i5;
            this.f27794q = 0;
            if (!(i6 == 0 || (i3 = i6 % 16) == 0)) {
                System.arraycopy(bArr, (i6 + i5) - i3, this.f27793p, 0, i3);
                this.f27794q = i3;
                i6 -= i3;
            }
            super.write(bArr, i5, i6);
            return;
        }
        System.arraycopy(bArr, i, this.f27793p, i4, i2);
        this.f27794q += i2;
    }
}
