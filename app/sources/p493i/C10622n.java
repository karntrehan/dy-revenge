package p493i;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.n */
public final class C10622n implements C10598d0 {

    /* renamed from: f */
    private byte f28058f;

    /* renamed from: o */
    private final C10634x f28059o;

    /* renamed from: p */
    private final Inflater f28060p;

    /* renamed from: q */
    private final C10623o f28061q;

    /* renamed from: r */
    private final CRC32 f28062r = new CRC32();

    public C10622n(C10598d0 d0Var) {
        C10457l.m35320e(d0Var, "source");
        C10634x xVar = new C10634x(d0Var);
        this.f28059o = xVar;
        Inflater inflater = new Inflater(true);
        this.f28060p = inflater;
        this.f28061q = new C10623o((C10615h) xVar, inflater);
    }

    /* renamed from: a */
    private final void m36146a(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C10457l.m35319d(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: b */
    private final void m36147b() {
        this.f28059o.mo26359l0(10);
        byte y0 = this.f28059o.f28085f.mo26392y0(3);
        boolean z = true;
        boolean z2 = ((y0 >> 1) & 1) == 1;
        if (z2) {
            m36149o(this.f28059o.f28085f, 0, 10);
        }
        m36146a("ID1ID2", 8075, this.f28059o.readShort());
        this.f28059o.mo26358l(8);
        if (((y0 >> 2) & 1) == 1) {
            this.f28059o.mo26359l0(2);
            if (z2) {
                m36149o(this.f28059o.f28085f, 0, 2);
            }
            long H0 = (long) this.f28059o.f28085f.mo26317H0();
            this.f28059o.mo26359l0(H0);
            if (z2) {
                m36149o(this.f28059o.f28085f, 0, H0);
            }
            this.f28059o.mo26358l(H0);
        }
        if (((y0 >> 3) & 1) == 1) {
            long a = this.f28059o.mo26462a((byte) 0);
            if (a != -1) {
                if (z2) {
                    m36149o(this.f28059o.f28085f, 0, a + 1);
                }
                this.f28059o.mo26358l(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((y0 >> 4) & 1) != 1) {
            z = false;
        }
        if (z) {
            long a2 = this.f28059o.mo26462a((byte) 0);
            if (a2 != -1) {
                if (z2) {
                    m36149o(this.f28059o.f28085f, 0, a2 + 1);
                }
                this.f28059o.mo26358l(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z2) {
            m36146a("FHCRC", this.f28059o.mo26461E(), (short) ((int) this.f28062r.getValue()));
            this.f28062r.reset();
        }
    }

    /* renamed from: h */
    private final void m36148h() {
        m36146a("CRC", this.f28059o.mo26460A(), (int) this.f28062r.getValue());
        m36146a("ISIZE", this.f28059o.mo26460A(), (int) this.f28060p.getBytesWritten());
    }

    /* renamed from: o */
    private final void m36149o(C10603f fVar, long j, long j2) {
        C10636y yVar = fVar.f28034f;
        while (true) {
            C10457l.m35317b(yVar);
            int i = yVar.f28092d;
            int i2 = yVar.f28091c;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            yVar = yVar.f28095g;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) yVar.f28091c) + j);
            int min = (int) Math.min((long) (yVar.f28092d - i3), j2);
            this.f28062r.update(yVar.f28090b, i3, min);
            j2 -= (long) min;
            yVar = yVar.f28095g;
            C10457l.m35317b(yVar);
            j = 0;
        }
    }

    public void close() {
        this.f28061q.close();
    }

    public long read(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f28058f == 0) {
                m36147b();
                this.f28058f = 1;
            }
            if (this.f28058f == 1) {
                long size = fVar.size();
                long read = this.f28061q.read(fVar, j);
                if (read != -1) {
                    m36149o(fVar, size, read);
                    return read;
                }
                this.f28058f = 2;
            }
            if (this.f28058f == 2) {
                m36148h();
                this.f28058f = 3;
                if (!this.f28059o.mo26390x()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public C10600e0 timeout() {
        return this.f28059o.timeout();
    }
}
