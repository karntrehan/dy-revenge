package p174e.p319f.p393c.p394a.p395a0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p174e.p319f.p393c.p394a.C9236o;
import p174e.p319f.p393c.p394a.p402x.C9308a;

/* renamed from: e.f.c.a.a0.t */
public class C9210t implements C9236o {

    /* renamed from: a */
    private final C9308a f25121a;

    /* renamed from: b */
    private final int f25122b;

    public C9210t(C9308a aVar, int i) {
        this.f25121a = aVar;
        this.f25122b = i;
        if (i >= 10) {
            aVar.mo23184a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public void mo23187a(byte[] bArr, byte[] bArr2) {
        if (!C9189g.m30531b(mo23188b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    /* renamed from: b */
    public byte[] mo23188b(byte[] bArr) {
        return this.f25121a.mo23184a(bArr, this.f25122b);
    }
}
