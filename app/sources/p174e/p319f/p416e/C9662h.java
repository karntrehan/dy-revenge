package p174e.p319f.p416e;

/* renamed from: e.f.e.h */
public abstract class C9662h {

    /* renamed from: a */
    private final int f25833a;

    /* renamed from: b */
    private final int f25834b;

    protected C9662h(int i, int i2) {
        this.f25833a = i;
        this.f25834b = i2;
    }

    /* renamed from: a */
    public final int mo24212a() {
        return this.f25834b;
    }

    /* renamed from: b */
    public abstract byte[] mo24208b();

    /* renamed from: c */
    public abstract byte[] mo24209c(int i, byte[] bArr);

    /* renamed from: d */
    public final int mo24213d() {
        return this.f25833a;
    }

    /* renamed from: e */
    public C9662h mo24214e() {
        return new C9661g(this);
    }

    /* renamed from: f */
    public boolean mo24210f() {
        return false;
    }

    /* renamed from: g */
    public C9662h mo24211g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f25833a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f25834b * (i + 1));
        for (int i2 = 0; i2 < this.f25834b; i2++) {
            bArr = mo24209c(i2, bArr);
            for (int i3 = 0; i3 < this.f25833a; i3++) {
                byte b = bArr[i3] & 255;
                sb.append(b < 64 ? '#' : b < 128 ? '+' : b < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
