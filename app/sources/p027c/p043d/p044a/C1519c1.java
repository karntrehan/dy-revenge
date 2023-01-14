package p027c.p043d.p044a;

import androidx.core.util.C1177h;

/* renamed from: c.d.a.c1 */
public abstract class C1519c1 {
    C1519c1() {
    }

    /* renamed from: d */
    static C1519c1 m6801d(long j, long j2, C1526e0 e0Var) {
        boolean z = true;
        C1177h.m4580b(j >= 0, "duration must be positive value.");
        if (j2 < 0) {
            z = false;
        }
        C1177h.m4580b(z, "bytes must be positive value.");
        return new C1695n0(j, j2, e0Var);
    }

    /* renamed from: a */
    public abstract C1526e0 mo5630a();

    /* renamed from: b */
    public abstract long mo5631b();

    /* renamed from: c */
    public abstract long mo5632c();
}
