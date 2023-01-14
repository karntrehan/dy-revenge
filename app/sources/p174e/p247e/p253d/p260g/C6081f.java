package p174e.p247e.p253d.p260g;

import java.io.IOException;
import java.io.InputStream;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p261h.C6098h;

/* renamed from: e.e.d.g.f */
public class C6081f extends InputStream {

    /* renamed from: f */
    private final InputStream f16715f;

    /* renamed from: o */
    private final byte[] f16716o;

    /* renamed from: p */
    private final C6098h<byte[]> f16717p;

    /* renamed from: q */
    private int f16718q = 0;

    /* renamed from: r */
    private int f16719r = 0;

    /* renamed from: s */
    private boolean f16720s = false;

    /* JADX WARNING: type inference failed for: r3v0, types: [e.e.d.h.h<byte[]>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6081f(java.io.InputStream r1, byte[] r2, p174e.p247e.p253d.p261h.C6098h<byte[]> r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r1)
            java.io.InputStream r1 = (java.io.InputStream) r1
            r0.f16715f = r1
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r2)
            byte[] r1 = (byte[]) r1
            r0.f16716o = r1
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r3)
            e.e.d.h.h r1 = (p174e.p247e.p253d.p261h.C6098h) r1
            r0.f16717p = r1
            r1 = 0
            r0.f16718q = r1
            r0.f16719r = r1
            r0.f16720s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p253d.p260g.C6081f.<init>(java.io.InputStream, byte[], e.e.d.h.h):void");
    }

    /* renamed from: a */
    private boolean m22929a() {
        if (this.f16719r < this.f16718q) {
            return true;
        }
        int read = this.f16715f.read(this.f16716o);
        if (read <= 0) {
            return false;
        }
        this.f16718q = read;
        this.f16719r = 0;
        return true;
    }

    /* renamed from: b */
    private void m22930b() {
        if (this.f16720s) {
            throw new IOException("stream already closed");
        }
    }

    public int available() {
        C6062k.m22841i(this.f16719r <= this.f16718q);
        m22930b();
        return (this.f16718q - this.f16719r) + this.f16715f.available();
    }

    public void close() {
        if (!this.f16720s) {
            this.f16720s = true;
            this.f16717p.mo8068a(this.f16716o);
            super.close();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!this.f16720s) {
            C6071a.m22875i("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    public int read() {
        C6062k.m22841i(this.f16719r <= this.f16718q);
        m22930b();
        if (!m22929a()) {
            return -1;
        }
        byte[] bArr = this.f16716o;
        int i = this.f16719r;
        this.f16719r = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr, int i, int i2) {
        C6062k.m22841i(this.f16719r <= this.f16718q);
        m22930b();
        if (!m22929a()) {
            return -1;
        }
        int min = Math.min(this.f16718q - this.f16719r, i2);
        System.arraycopy(this.f16716o, this.f16719r, bArr, i, min);
        this.f16719r += min;
        return min;
    }

    public long skip(long j) {
        C6062k.m22841i(this.f16719r <= this.f16718q);
        m22930b();
        int i = this.f16718q;
        int i2 = this.f16719r;
        long j2 = (long) (i - i2);
        if (j2 >= j) {
            this.f16719r = (int) (((long) i2) + j);
            return j;
        }
        this.f16719r = i;
        return j2 + this.f16715f.skip(j - j2);
    }
}
