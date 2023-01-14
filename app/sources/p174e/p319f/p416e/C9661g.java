package p174e.p319f.p416e;

/* renamed from: e.f.e.g */
public final class C9661g extends C9662h {

    /* renamed from: c */
    private final C9662h f25832c;

    public C9661g(C9662h hVar) {
        super(hVar.mo24213d(), hVar.mo24212a());
        this.f25832c = hVar;
    }

    /* renamed from: b */
    public byte[] mo24208b() {
        byte[] b = this.f25832c.mo24208b();
        int d = mo24213d() * mo24212a();
        byte[] bArr = new byte[d];
        for (int i = 0; i < d; i++) {
            bArr[i] = (byte) (255 - (b[i] & 255));
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] mo24209c(int i, byte[] bArr) {
        byte[] c = this.f25832c.mo24209c(i, bArr);
        int d = mo24213d();
        for (int i2 = 0; i2 < d; i2++) {
            c[i2] = (byte) (255 - (c[i2] & 255));
        }
        return c;
    }

    /* renamed from: f */
    public boolean mo24210f() {
        return this.f25832c.mo24210f();
    }

    /* renamed from: g */
    public C9662h mo24211g() {
        return new C9661g(this.f25832c.mo24211g());
    }
}
