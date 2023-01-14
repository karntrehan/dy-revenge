package p493i;

import java.util.zip.Deflater;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.j */
public final class C10618j implements C10590b0 {

    /* renamed from: f */
    private boolean f28054f;

    /* renamed from: o */
    private final C10608g f28055o;

    /* renamed from: p */
    private final Deflater f28056p;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10618j(C10590b0 b0Var, Deflater deflater) {
        this(C10625q.m36155c(b0Var), deflater);
        C10457l.m35320e(b0Var, "sink");
        C10457l.m35320e(deflater, "deflater");
    }

    public C10618j(C10608g gVar, Deflater deflater) {
        C10457l.m35320e(gVar, "sink");
        C10457l.m35320e(deflater, "deflater");
        this.f28055o = gVar;
        this.f28056p = deflater;
    }

    /* renamed from: a */
    private final void m36142a(boolean z) {
        C10636y O0;
        C10603f d = this.f28055o.mo26350d();
        while (true) {
            O0 = d.mo26327O0(1);
            Deflater deflater = this.f28056p;
            byte[] bArr = O0.f28090b;
            int i = O0.f28092d;
            int i2 = 8192 - i;
            int deflate = z ? deflater.deflate(bArr, i, i2, 2) : deflater.deflate(bArr, i, i2);
            if (deflate > 0) {
                O0.f28092d += deflate;
                d.mo26322L0(d.size() + ((long) deflate));
                this.f28055o.mo26310C();
            } else if (this.f28056p.needsInput()) {
                break;
            }
        }
        if (O0.f28091c == O0.f28092d) {
            d.f28034f = O0.mo26476b();
            C10638z.m36238b(O0);
        }
    }

    /* renamed from: b */
    public final void mo26431b() {
        this.f28056p.finish();
        m36142a(false);
    }

    public void close() {
        if (!this.f28054f) {
            Throwable th = null;
            try {
                mo26431b();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f28056p.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f28055o.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f28054f = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        m36142a(true);
        this.f28055o.flush();
    }

    public C10600e0 timeout() {
        return this.f28055o.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f28055o + ')';
    }

    public void write(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "source");
        C10591c.m35966b(fVar.size(), 0, j);
        while (j > 0) {
            C10636y yVar = fVar.f28034f;
            C10457l.m35317b(yVar);
            int min = (int) Math.min(j, (long) (yVar.f28092d - yVar.f28091c));
            this.f28056p.setInput(yVar.f28090b, yVar.f28091c, min);
            m36142a(false);
            long j2 = (long) min;
            fVar.mo26322L0(fVar.size() - j2);
            int i = yVar.f28091c + min;
            yVar.f28091c = i;
            if (i == yVar.f28092d) {
                fVar.f28034f = yVar.mo26476b();
                C10638z.m36238b(yVar);
            }
            j -= j2;
        }
    }
}
