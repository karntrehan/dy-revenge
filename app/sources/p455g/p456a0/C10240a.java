package p455g.p456a0;

import p455g.p460t.C10364y;
import p455g.p466w.C10411c;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.a0.a */
public class C10240a implements Iterable<Integer>, C10445a {

    /* renamed from: f */
    public static final C10241a f27478f = new C10241a((C10452g) null);

    /* renamed from: o */
    private final int f27479o;

    /* renamed from: p */
    private final int f27480p;

    /* renamed from: q */
    private final int f27481q;

    /* renamed from: g.a0.a$a */
    public static final class C10241a {
        private C10241a() {
        }

        public /* synthetic */ C10241a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final C10240a mo25556a(int i, int i2, int i3) {
            return new C10240a(i, i2, i3);
        }
    }

    public C10240a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f27479o = i;
            this.f27480p = C10411c.m35282b(i, i2, i3);
            this.f27481q = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: b */
    public final int mo25547b() {
        return this.f27479o;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10240a) {
            if (!isEmpty() || !((C10240a) obj).isEmpty()) {
                C10240a aVar = (C10240a) obj;
                if (!(this.f27479o == aVar.f27479o && this.f27480p == aVar.f27480p && this.f27481q == aVar.f27481q)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int mo25549g() {
        return this.f27480p;
    }

    /* renamed from: h */
    public final int mo25550h() {
        return this.f27481q;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f27479o * 31) + this.f27480p) * 31) + this.f27481q;
    }

    public boolean isEmpty() {
        if (this.f27481q > 0) {
            if (this.f27479o > this.f27480p) {
                return true;
            }
        } else if (this.f27479o < this.f27480p) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public C10364y iterator() {
        return new C10242b(this.f27479o, this.f27480p, this.f27481q);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f27481q > 0) {
            sb = new StringBuilder();
            sb.append(this.f27479o);
            sb.append("..");
            sb.append(this.f27480p);
            sb.append(" step ");
            i = this.f27481q;
        } else {
            sb = new StringBuilder();
            sb.append(this.f27479o);
            sb.append(" downTo ");
            sb.append(this.f27480p);
            sb.append(" step ");
            i = -this.f27481q;
        }
        sb.append(i);
        return sb.toString();
    }
}
