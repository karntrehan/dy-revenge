package p174e.p319f.p393c.p394a.p396t;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9242r;
import p174e.p319f.p393c.p394a.p403y.C9312a0;

/* renamed from: e.f.c.a.t.j */
public final class C9273j implements C9175a {

    /* renamed from: a */
    private static final byte[] f25185a = new byte[0];

    /* renamed from: b */
    private final C9312a0 f25186b;

    /* renamed from: c */
    private final C9175a f25187c;

    public C9273j(C9312a0 a0Var, C9175a aVar) {
        this.f25186b = a0Var;
        this.f25187c = aVar;
    }

    /* renamed from: c */
    private byte[] m30860c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    /* renamed from: a */
    public byte[] mo23153a(byte[] bArr, byte[] bArr2) {
        byte[] i = C9242r.m30709o(this.f25186b).mo23479i();
        return m30860c(this.f25187c.mo23153a(i, f25185a), ((C9175a) C9242r.m30703i(this.f25186b.mo23355S(), i, C9175a.class)).mo23153a(bArr, bArr2));
    }

    /* renamed from: b */
    public byte[] mo23154b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((C9175a) C9242r.m30703i(this.f25186b.mo23355S(), this.f25187c.mo23154b(bArr3, f25185a), C9175a.class)).mo23154b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
