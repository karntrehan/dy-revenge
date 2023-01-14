package okhttp3.internal.cache;

import java.io.IOException;
import p455g.C10323s;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;
import p493i.C10590b0;
import p493i.C10603f;
import p493i.C10619k;

public class FaultHidingSink extends C10619k {
    private boolean hasErrors;
    private final C10430l<IOException, C10323s> onException;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(C10590b0 b0Var, C10430l<? super IOException, C10323s> lVar) {
        super(b0Var);
        C10457l.m35320e(b0Var, "delegate");
        C10457l.m35320e(lVar, "onException");
        this.onException = lVar;
    }

    public void close() {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                this.onException.invoke(e);
            }
        }
    }

    public void flush() {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                this.onException.invoke(e);
            }
        }
    }

    public final C10430l<IOException, C10323s> getOnException() {
        return this.onException;
    }

    public void write(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "source");
        if (this.hasErrors) {
            fVar.mo26358l(j);
            return;
        }
        try {
            super.write(fVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
