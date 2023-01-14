package p493i;

import java.io.IOException;
import java.io.InputStream;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.p */
final class C10624p implements C10598d0 {

    /* renamed from: f */
    private final InputStream f28067f;

    /* renamed from: o */
    private final C10600e0 f28068o;

    public C10624p(InputStream inputStream, C10600e0 e0Var) {
        C10457l.m35320e(inputStream, "input");
        C10457l.m35320e(e0Var, "timeout");
        this.f28067f = inputStream;
        this.f28068o = e0Var;
    }

    public void close() {
        this.f28067f.close();
    }

    public long read(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f28068o.throwIfReached();
                C10636y O0 = fVar.mo26327O0(1);
                int read = this.f28067f.read(O0.f28090b, O0.f28092d, (int) Math.min(j, (long) (8192 - O0.f28092d)));
                if (read != -1) {
                    O0.f28092d += read;
                    long j2 = (long) read;
                    fVar.mo26322L0(fVar.size() + j2);
                    return j2;
                } else if (O0.f28091c != O0.f28092d) {
                    return -1;
                } else {
                    fVar.f28034f = O0.mo26476b();
                    C10638z.m36238b(O0);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C10625q.m36157e(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    public C10600e0 timeout() {
        return this.f28068o;
    }

    public String toString() {
        return "source(" + this.f28067f + ')';
    }
}
