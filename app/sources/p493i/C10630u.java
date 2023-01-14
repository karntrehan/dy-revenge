package p493i;

import java.io.OutputStream;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.u */
final class C10630u implements C10590b0 {

    /* renamed from: f */
    private final OutputStream f28073f;

    /* renamed from: o */
    private final C10600e0 f28074o;

    public C10630u(OutputStream outputStream, C10600e0 e0Var) {
        C10457l.m35320e(outputStream, "out");
        C10457l.m35320e(e0Var, "timeout");
        this.f28073f = outputStream;
        this.f28074o = e0Var;
    }

    public void close() {
        this.f28073f.close();
    }

    public void flush() {
        this.f28073f.flush();
    }

    public C10600e0 timeout() {
        return this.f28074o;
    }

    public String toString() {
        return "sink(" + this.f28073f + ')';
    }

    public void write(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "source");
        C10591c.m35966b(fVar.size(), 0, j);
        while (j > 0) {
            this.f28074o.throwIfReached();
            C10636y yVar = fVar.f28034f;
            C10457l.m35317b(yVar);
            int min = (int) Math.min(j, (long) (yVar.f28092d - yVar.f28091c));
            this.f28073f.write(yVar.f28090b, yVar.f28091c, min);
            yVar.f28091c += min;
            long j2 = (long) min;
            j -= j2;
            fVar.mo26322L0(fVar.size() - j2);
            if (yVar.f28091c == yVar.f28092d) {
                fVar.f28034f = yVar.mo26476b();
                C10638z.m36238b(yVar);
            }
        }
    }
}
