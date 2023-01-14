package p493i;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.w */
public final class C10632w implements C10608g {

    /* renamed from: f */
    public final C10603f f28081f = new C10603f();

    /* renamed from: o */
    public boolean f28082o;

    /* renamed from: p */
    public final C10590b0 f28083p;

    /* renamed from: i.w$a */
    public static final class C10633a extends OutputStream {

        /* renamed from: f */
        final /* synthetic */ C10632w f28084f;

        C10633a(C10632w wVar) {
            this.f28084f = wVar;
        }

        public void close() {
            this.f28084f.close();
        }

        public void flush() {
            C10632w wVar = this.f28084f;
            if (!wVar.f28082o) {
                wVar.flush();
            }
        }

        public String toString() {
            return this.f28084f + ".outputStream()";
        }

        public void write(int i) {
            C10632w wVar = this.f28084f;
            if (!wVar.f28082o) {
                wVar.f28081f.writeByte((byte) i);
                this.f28084f.mo26310C();
                return;
            }
            throw new IOException("closed");
        }

        public void write(byte[] bArr, int i, int i2) {
            C10457l.m35320e(bArr, "data");
            C10632w wVar = this.f28084f;
            if (!wVar.f28082o) {
                wVar.f28081f.write(bArr, i, i2);
                this.f28084f.mo26310C();
                return;
            }
            throw new IOException("closed");
        }
    }

    public C10632w(C10590b0 b0Var) {
        C10457l.m35320e(b0Var, "sink");
        this.f28083p = b0Var;
    }

    /* renamed from: C */
    public C10608g mo26310C() {
        if (!this.f28082o) {
            long s0 = this.f28081f.mo26375s0();
            if (s0 > 0) {
                this.f28083p.write(this.f28081f, s0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: K */
    public C10608g mo26320K(String str) {
        C10457l.m35320e(str, "string");
        if (!this.f28082o) {
            this.f28081f.mo26320K(str);
            return mo26310C();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: P */
    public C10608g mo26328P(String str, int i, int i2) {
        C10457l.m35320e(str, "string");
        if (!this.f28082o) {
            this.f28081f.mo26328P(str, i, i2);
            return mo26310C();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: Q */
    public long mo26330Q(C10598d0 d0Var) {
        C10457l.m35320e(d0Var, "source");
        long j = 0;
        while (true) {
            long read = d0Var.read(this.f28081f, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            mo26310C();
        }
    }

    /* renamed from: R */
    public C10608g mo26332R(long j) {
        if (!this.f28082o) {
            this.f28081f.mo26332R(j);
            return mo26310C();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f28082o) {
            Throwable th = null;
            try {
                if (this.f28081f.size() > 0) {
                    C10590b0 b0Var = this.f28083p;
                    C10603f fVar = this.f28081f;
                    b0Var.write(fVar, fVar.size());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f28083p.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f28082o = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public C10603f mo26350d() {
        return this.f28081f;
    }

    /* renamed from: d0 */
    public C10608g mo26351d0(C10616i iVar) {
        C10457l.m35320e(iVar, "byteString");
        if (!this.f28082o) {
            this.f28081f.mo26351d0(iVar);
            return mo26310C();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void flush() {
        if (!this.f28082o) {
            if (this.f28081f.size() > 0) {
                C10590b0 b0Var = this.f28083p;
                C10603f fVar = this.f28081f;
                b0Var.write(fVar, fVar.size());
            }
            this.f28083p.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f28082o;
    }

    /* renamed from: m0 */
    public C10608g mo26360m0(long j) {
        if (!this.f28082o) {
            this.f28081f.mo26360m0(j);
            return mo26310C();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: o0 */
    public OutputStream mo26362o0() {
        return new C10633a(this);
    }

    /* renamed from: s */
    public C10608g mo26374s() {
        if (!this.f28082o) {
            long size = this.f28081f.size();
            if (size > 0) {
                this.f28083p.write(this.f28081f, size);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C10600e0 timeout() {
        return this.f28083p.timeout();
    }

    public String toString() {
        return "buffer(" + this.f28083p + ')';
    }

    public int write(ByteBuffer byteBuffer) {
        C10457l.m35320e(byteBuffer, "source");
        if (!this.f28082o) {
            int write = this.f28081f.write(byteBuffer);
            mo26310C();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C10608g write(byte[] bArr) {
        C10457l.m35320e(bArr, "source");
        if (!this.f28082o) {
            this.f28081f.write(bArr);
            return mo26310C();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C10608g write(byte[] bArr, int i, int i2) {
        C10457l.m35320e(bArr, "source");
        if (!this.f28082o) {
            this.f28081f.write(bArr, i, i2);
            return mo26310C();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void write(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "source");
        if (!this.f28082o) {
            this.f28081f.write(fVar, j);
            mo26310C();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C10608g writeByte(int i) {
        if (!this.f28082o) {
            this.f28081f.writeByte(i);
            return mo26310C();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C10608g writeInt(int i) {
        if (!this.f28082o) {
            this.f28081f.writeInt(i);
            return mo26310C();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C10608g writeShort(int i) {
        if (!this.f28082o) {
            this.f28081f.writeShort(i);
            return mo26310C();
        }
        throw new IllegalStateException("closed".toString());
    }
}
