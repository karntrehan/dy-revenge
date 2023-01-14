package p493i;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.o */
public final class C10623o implements C10598d0 {

    /* renamed from: f */
    private int f28063f;

    /* renamed from: o */
    private boolean f28064o;

    /* renamed from: p */
    private final C10615h f28065p;

    /* renamed from: q */
    private final Inflater f28066q;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10623o(C10598d0 d0Var, Inflater inflater) {
        this(C10625q.m36156d(d0Var), inflater);
        C10457l.m35320e(d0Var, "source");
        C10457l.m35320e(inflater, "inflater");
    }

    public C10623o(C10615h hVar, Inflater inflater) {
        C10457l.m35320e(hVar, "source");
        C10457l.m35320e(inflater, "inflater");
        this.f28065p = hVar;
        this.f28066q = inflater;
    }

    /* renamed from: h */
    private final void m36150h() {
        int i = this.f28063f;
        if (i != 0) {
            int remaining = i - this.f28066q.getRemaining();
            this.f28063f -= remaining;
            this.f28065p.mo26358l((long) remaining);
        }
    }

    /* renamed from: a */
    public final long mo26441a(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f28064o)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                C10636y O0 = fVar.mo26327O0(1);
                int min = (int) Math.min(j, (long) (8192 - O0.f28092d));
                mo26442b();
                int inflate = this.f28066q.inflate(O0.f28090b, O0.f28092d, min);
                m36150h();
                if (inflate > 0) {
                    O0.f28092d += inflate;
                    long j2 = (long) inflate;
                    fVar.mo26322L0(fVar.size() + j2);
                    return j2;
                }
                if (O0.f28091c == O0.f28092d) {
                    fVar.f28034f = O0.mo26476b();
                    C10638z.m36238b(O0);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo26442b() {
        if (!this.f28066q.needsInput()) {
            return false;
        }
        if (this.f28065p.mo26390x()) {
            return true;
        }
        C10636y yVar = this.f28065p.mo26350d().f28034f;
        C10457l.m35317b(yVar);
        int i = yVar.f28092d;
        int i2 = yVar.f28091c;
        int i3 = i - i2;
        this.f28063f = i3;
        this.f28066q.setInput(yVar.f28090b, i2, i3);
        return false;
    }

    public void close() {
        if (!this.f28064o) {
            this.f28066q.end();
            this.f28064o = true;
            this.f28065p.close();
        }
    }

    public long read(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "sink");
        do {
            long a = mo26441a(fVar, j);
            if (a > 0) {
                return a;
            }
            if (this.f28066q.finished() || this.f28066q.needsDictionary()) {
                return -1;
            }
        } while (!this.f28065p.mo26390x());
        throw new EOFException("source exhausted prematurely");
    }

    public C10600e0 timeout() {
        return this.f28065p.timeout();
    }
}
