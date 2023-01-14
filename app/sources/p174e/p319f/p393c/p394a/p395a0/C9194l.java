package p174e.p319f.p393c.p394a.p395a0;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9236o;

/* renamed from: e.f.c.a.a0.l */
public final class C9194l implements C9175a {

    /* renamed from: a */
    private final C9205p f25098a;

    /* renamed from: b */
    private final C9236o f25099b;

    /* renamed from: c */
    private final int f25100c;

    public C9194l(C9205p pVar, C9236o oVar, int i) {
        this.f25098a = pVar;
        this.f25099b = oVar;
        this.f25100c = i;
    }

    /* renamed from: a */
    public byte[] mo23153a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.f25098a.mo23155a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return C9189g.m30530a(a, this.f25099b.mo23188b(C9189g.m30530a(bArr2, a, copyOf)));
    }

    /* renamed from: b */
    public byte[] mo23154b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f25100c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f25100c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f25099b.mo23187a(copyOfRange2, C9189g.m30530a(bArr2, copyOfRange, copyOf));
            return this.f25098a.mo23156b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
