package p455g.p456a0;

import java.util.NoSuchElementException;
import p455g.p460t.C10364y;

/* renamed from: g.a0.b */
public final class C10242b extends C10364y {

    /* renamed from: f */
    private final int f27482f;

    /* renamed from: o */
    private final int f27483o;

    /* renamed from: p */
    private boolean f27484p;

    /* renamed from: q */
    private int f27485q;

    public C10242b(int i, int i2, int i3) {
        this.f27482f = i3;
        this.f27483o = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f27484p = z;
        this.f27485q = !z ? i2 : i;
    }

    /* renamed from: b */
    public int mo25557b() {
        int i = this.f27485q;
        if (i != this.f27483o) {
            this.f27485q = this.f27482f + i;
        } else if (this.f27484p) {
            this.f27484p = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f27484p;
    }
}
