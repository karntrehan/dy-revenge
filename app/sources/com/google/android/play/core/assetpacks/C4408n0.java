package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.play.core.assetpacks.n0 */
final class C4408n0 extends OutputStream {

    /* renamed from: f */
    private final C4401l1 f12581f = new C4401l1();

    /* renamed from: o */
    private final File f12582o;

    /* renamed from: p */
    private final C4451y1 f12583p;

    /* renamed from: q */
    private long f12584q;

    /* renamed from: r */
    private long f12585r;

    /* renamed from: s */
    private FileOutputStream f12586s;

    /* renamed from: t */
    private C4370d2 f12587t;

    C4408n0(File file, C4451y1 y1Var) {
        this.f12582o = file;
        this.f12583p = y1Var;
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        while (i2 > 0) {
            if (this.f12584q == 0 && this.f12585r == 0) {
                int a = this.f12581f.mo13893a(bArr, i, i2);
                if (a != -1) {
                    i += a;
                    i2 -= a;
                    C4370d2 b = this.f12581f.mo13894b();
                    this.f12587t = b;
                    if (b.mo13845h()) {
                        this.f12584q = 0;
                        this.f12583p.mo13976m(this.f12587t.mo13847i(), this.f12587t.mo13847i().length);
                        this.f12585r = (long) this.f12587t.mo13847i().length;
                    } else if (!this.f12587t.mo13839c() || this.f12587t.mo13838b()) {
                        byte[] i4 = this.f12587t.mo13847i();
                        this.f12583p.mo13976m(i4, i4.length);
                        this.f12584q = this.f12587t.mo13841e();
                    } else {
                        this.f12583p.mo13970g(this.f12587t.mo13847i());
                        File file = new File(this.f12582o, this.f12587t.mo13840d());
                        file.getParentFile().mkdirs();
                        this.f12584q = this.f12587t.mo13841e();
                        this.f12586s = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f12587t.mo13838b()) {
                if (this.f12587t.mo13845h()) {
                    this.f12583p.mo13972i(this.f12585r, bArr, i, i2);
                    this.f12585r += (long) i2;
                    i3 = i2;
                } else if (this.f12587t.mo13839c()) {
                    i3 = (int) Math.min((long) i2, this.f12584q);
                    this.f12586s.write(bArr, i, i3);
                    long j = this.f12584q - ((long) i3);
                    this.f12584q = j;
                    if (j == 0) {
                        this.f12586s.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.f12584q);
                    int length = this.f12587t.mo13847i().length;
                    this.f12583p.mo13972i((((long) length) + this.f12587t.mo13841e()) - this.f12584q, bArr, i, i3);
                    this.f12584q -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
