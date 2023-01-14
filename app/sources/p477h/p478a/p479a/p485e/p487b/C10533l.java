package p477h.p478a.p479a.p485e.p487b;

import java.io.OutputStream;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p477h.p478a.p479a.p480b.C10494h;
import p477h.p478a.p479a.p488f.C10550q;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.e.b.l */
class C10533l extends C10522b<C10494h> {
    public C10533l(C10531j jVar, C10550q qVar, char[] cArr) {
        super(jVar, qVar, cArr);
    }

    /* renamed from: A */
    private long m35590A(C10550q qVar) {
        return qVar.mo26186u() ? (C10585h.m35938e(qVar.mo26177l()) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16 : qVar.mo26172g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C10494h mo25961o(OutputStream outputStream, C10550q qVar, char[] cArr) {
        C10494h hVar = new C10494h(cArr, m35590A(qVar));
        mo25968r(hVar.mo25892e());
        return hVar;
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
    }
}
