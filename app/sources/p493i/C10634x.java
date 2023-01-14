package p493i;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p455g.p470y.p472d.C10457l;
import p493i.p494g0.C10609a;

/* renamed from: i.x */
public final class C10634x implements C10615h {

    /* renamed from: f */
    public final C10603f f28085f = new C10603f();

    /* renamed from: o */
    public boolean f28086o;

    /* renamed from: p */
    public final C10598d0 f28087p;

    /* renamed from: i.x$a */
    public static final class C10635a extends InputStream {

        /* renamed from: f */
        final /* synthetic */ C10634x f28088f;

        C10635a(C10634x xVar) {
            this.f28088f = xVar;
        }

        public int available() {
            C10634x xVar = this.f28088f;
            if (!xVar.f28086o) {
                return (int) Math.min(xVar.f28085f.size(), (long) RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f28088f.close();
        }

        public int read() {
            C10634x xVar = this.f28088f;
            if (!xVar.f28086o) {
                if (xVar.f28085f.size() == 0) {
                    C10634x xVar2 = this.f28088f;
                    if (xVar2.f28087p.read(xVar2.f28085f, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f28088f.f28085f.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public int read(byte[] bArr, int i, int i2) {
            C10457l.m35320e(bArr, "data");
            if (!this.f28088f.f28086o) {
                C10591c.m35966b((long) bArr.length, (long) i, (long) i2);
                if (this.f28088f.f28085f.size() == 0) {
                    C10634x xVar = this.f28088f;
                    if (xVar.f28087p.read(xVar.f28085f, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f28088f.f28085f.mo26313D0(bArr, i, i2);
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f28088f + ".inputStream()";
        }
    }

    public C10634x(C10598d0 d0Var) {
        C10457l.m35320e(d0Var, "source");
        this.f28087p = d0Var;
    }

    /* renamed from: A */
    public int mo26460A() {
        mo26359l0(4);
        return this.f28085f.mo26316G0();
    }

    /* renamed from: B */
    public long mo26308B(C10616i iVar) {
        C10457l.m35320e(iVar, "targetBytes");
        return mo26466o(iVar, 0);
    }

    /* renamed from: D */
    public long mo26312D() {
        int i;
        mo26359l0(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo26338V(j2)) {
                break;
            }
            byte y0 = this.f28085f.mo26392y0(j);
            if ((y0 >= ((byte) 48) && y0 <= ((byte) 57)) || (j == 0 && y0 == ((byte) 45))) {
                j = j2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                String num = Integer.toString(y0, C10281b.m34863a(C10281b.m34863a(16)));
                C10457l.m35319d(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f28085f.mo26312D();
    }

    /* renamed from: E */
    public short mo26461E() {
        mo26359l0(2);
        return this.f28085f.mo26317H0();
    }

    /* renamed from: G */
    public String mo26315G(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long b2 = mo26463b(b, 0, j2);
            if (b2 != -1) {
                return C10609a.m36067c(this.f28085f, b2);
            }
            if (j2 < Long.MAX_VALUE && mo26338V(j2) && this.f28085f.mo26392y0(j2 - 1) == ((byte) 13) && mo26338V(1 + j2) && this.f28085f.mo26392y0(j2) == b) {
                return C10609a.m36067c(this.f28085f, j2);
            }
            C10603f fVar = new C10603f();
            C10603f fVar2 = this.f28085f;
            fVar2.mo26381v0(fVar, 0, Math.min((long) 32, fVar2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f28085f.size(), j) + " content=" + fVar.mo26335T().mo26262N() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: M */
    public boolean mo26323M(long j, C10616i iVar) {
        C10457l.m35320e(iVar, "bytes");
        return mo26467r(j, iVar, 0, iVar.mo26420Y());
    }

    /* renamed from: N */
    public String mo26325N(Charset charset) {
        C10457l.m35320e(charset, "charset");
        this.f28085f.mo26330Q(this.f28087p);
        return this.f28085f.mo26325N(charset);
    }

    /* renamed from: T */
    public C10616i mo26335T() {
        this.f28085f.mo26330Q(this.f28087p);
        return this.f28085f.mo26335T();
    }

    /* renamed from: V */
    public boolean mo26338V(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.f28086o) {
            while (this.f28085f.size() < j) {
                if (this.f28087p.read(this.f28085f, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: Y */
    public String mo26342Y() {
        return mo26315G(Long.MAX_VALUE);
    }

    /* renamed from: Z */
    public byte[] mo26344Z(long j) {
        mo26359l0(j);
        return this.f28085f.mo26344Z(j);
    }

    /* renamed from: a */
    public long mo26462a(byte b) {
        return mo26463b(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: b */
    public long mo26463b(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f28086o) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long z0 = this.f28085f.mo26394z0(b, j, j2);
                    if (z0 != -1) {
                        return z0;
                    }
                    long size = this.f28085f.size();
                    if (size >= j2 || this.f28087p.read(this.f28085f, (long) 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, size);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f28086o) {
            this.f28086o = true;
            this.f28087p.close();
            this.f28085f.mo26366r();
        }
    }

    /* renamed from: d */
    public C10603f mo26350d() {
        return this.f28085f;
    }

    /* renamed from: g0 */
    public long mo26354g0(C10590b0 b0Var) {
        C10603f fVar;
        C10457l.m35320e(b0Var, "sink");
        long j = 0;
        while (true) {
            int i = (this.f28087p.read(this.f28085f, (long) 8192) > -1 ? 1 : (this.f28087p.read(this.f28085f, (long) 8192) == -1 ? 0 : -1));
            fVar = this.f28085f;
            if (i == 0) {
                break;
            }
            long s0 = fVar.mo26375s0();
            if (s0 > 0) {
                j += s0;
                b0Var.write(this.f28085f, s0);
            }
        }
        if (fVar.size() <= 0) {
            return j;
        }
        long size = j + this.f28085f.size();
        C10603f fVar2 = this.f28085f;
        b0Var.write(fVar2, fVar2.size());
        return size;
    }

    /* renamed from: h */
    public long mo26464h(C10616i iVar, long j) {
        C10457l.m35320e(iVar, "bytes");
        if (!this.f28086o) {
            while (true) {
                long A0 = this.f28085f.mo26307A0(iVar, j);
                if (A0 != -1) {
                    return A0;
                }
                long size = this.f28085f.size();
                if (this.f28087p.read(this.f28085f, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (size - ((long) iVar.mo26420Y())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public boolean isOpen() {
        return !this.f28086o;
    }

    /* renamed from: j0 */
    public C10615h mo26357j0() {
        return C10625q.m36156d(new C10631v(this));
    }

    /* renamed from: l */
    public void mo26358l(long j) {
        if (!this.f28086o) {
            while (j > 0) {
                if (this.f28085f.size() == 0 && this.f28087p.read(this.f28085f, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f28085f.size());
                this.f28085f.mo26358l(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: l0 */
    public void mo26359l0(long j) {
        if (!mo26338V(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: o */
    public long mo26466o(C10616i iVar, long j) {
        C10457l.m35320e(iVar, "targetBytes");
        if (!this.f28086o) {
            while (true) {
                long B0 = this.f28085f.mo26309B0(iVar, j);
                if (B0 != -1) {
                    return B0;
                }
                long size = this.f28085f.size();
                if (this.f28087p.read(this.f28085f, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, size);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: p */
    public C10603f mo26363p() {
        return this.f28085f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo26364p0() {
        /*
            r5 = this;
            r0 = 1
            r5.mo26359l0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo26338V(r2)
            if (r2 == 0) goto L_0x0064
            i.f r2 = r5.f28085f
            long r3 = (long) r0
            byte r2 = r2.mo26392y0(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0064
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = p455g.p459d0.C10281b.m34863a(r3)
            int r3 = p455g.p459d0.C10281b.m34863a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            p455g.p470y.p472d.C10457l.m35319d(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0064:
            i.f r0 = r5.f28085f
            long r0 = r0.mo26364p0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p493i.C10634x.mo26364p0():long");
    }

    /* renamed from: q */
    public C10616i mo26365q(long j) {
        mo26359l0(j);
        return this.f28085f.mo26365q(j);
    }

    /* renamed from: r */
    public boolean mo26467r(long j, C10616i iVar, int i, int i2) {
        C10457l.m35320e(iVar, "bytes");
        if (!this.f28086o) {
            if (j >= 0 && i >= 0 && i2 >= 0 && iVar.mo26420Y() - i >= i2) {
                int i3 = 0;
                while (i3 < i2) {
                    long j2 = ((long) i3) + j;
                    if (mo26338V(1 + j2) && this.f28085f.mo26392y0(j2) == iVar.mo26411A(i + i3)) {
                        i3++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: r0 */
    public InputStream mo26367r0() {
        return new C10635a(this);
    }

    public int read(ByteBuffer byteBuffer) {
        C10457l.m35320e(byteBuffer, "sink");
        if (this.f28085f.size() == 0 && this.f28087p.read(this.f28085f, (long) 8192) == -1) {
            return -1;
        }
        return this.f28085f.read(byteBuffer);
    }

    public long read(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(true ^ this.f28086o)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f28085f.size() == 0 && this.f28087p.read(this.f28085f, (long) 8192) == -1) {
            return -1;
        } else {
            return this.f28085f.read(fVar, Math.min(j, this.f28085f.size()));
        }
    }

    public byte readByte() {
        mo26359l0(1);
        return this.f28085f.readByte();
    }

    public void readFully(byte[] bArr) {
        C10457l.m35320e(bArr, "sink");
        try {
            mo26359l0((long) bArr.length);
            this.f28085f.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f28085f.size() > 0) {
                C10603f fVar = this.f28085f;
                int D0 = fVar.mo26313D0(bArr, i, (int) fVar.size());
                if (D0 != -1) {
                    i += D0;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public int readInt() {
        mo26359l0(4);
        return this.f28085f.readInt();
    }

    public long readLong() {
        mo26359l0(8);
        return this.f28085f.readLong();
    }

    public short readShort() {
        mo26359l0(2);
        return this.f28085f.readShort();
    }

    /* renamed from: t0 */
    public int mo26377t0(C10628t tVar) {
        C10457l.m35320e(tVar, "options");
        if (!this.f28086o) {
            while (true) {
                int d = C10609a.m36068d(this.f28085f, tVar, true);
                if (d == -2) {
                    if (this.f28087p.read(this.f28085f, (long) 8192) == -1) {
                        break;
                    }
                } else if (d != -1) {
                    this.f28085f.mo26358l((long) tVar.mo26446j()[d].mo26420Y());
                    return d;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C10600e0 timeout() {
        return this.f28087p.timeout();
    }

    public String toString() {
        return "buffer(" + this.f28087p + ')';
    }

    /* renamed from: u */
    public byte[] mo26379u() {
        this.f28085f.mo26330Q(this.f28087p);
        return this.f28085f.mo26379u();
    }

    /* renamed from: w */
    public long mo26382w(C10616i iVar) {
        C10457l.m35320e(iVar, "bytes");
        return mo26464h(iVar, 0);
    }

    /* renamed from: x */
    public boolean mo26390x() {
        if (!this.f28086o) {
            return this.f28085f.mo26390x() && this.f28087p.read(this.f28085f, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: z */
    public void mo26393z(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "sink");
        try {
            mo26359l0(j);
            this.f28085f.mo26393z(fVar, j);
        } catch (EOFException e) {
            fVar.mo26330Q(this.f28085f);
            throw e;
        }
    }
}
