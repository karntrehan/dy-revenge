package p174e.p199d.p217b;

import java.io.Serializable;

/* renamed from: e.d.b.m */
public class C5712m extends Number implements Comparable<C5712m>, Serializable {

    /* renamed from: f */
    private final long f16170f;

    /* renamed from: o */
    private final long f16171o;

    public C5712m(long j, long j2) {
        this.f16170f = j;
        this.f16171o = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m21253e(long r4, long r6) {
        /*
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0007
            long r4 = -r4
        L_0x0007:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x000c
            long r6 = -r6
        L_0x000c:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x001c
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x001c
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            long r4 = r4 % r6
            goto L_0x000c
        L_0x001a:
            long r6 = r6 % r4
            goto L_0x000c
        L_0x001c:
            if (r2 != 0) goto L_0x001f
            r4 = r6
        L_0x001f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p217b.C5712m.m21253e(long, long):long");
    }

    /* renamed from: A */
    public C5712m mo17060A() {
        return new C5712m(this.f16171o, this.f16170f);
    }

    /* renamed from: B */
    public C5712m mo17061B() {
        long e = m21253e(this.f16170f, this.f16171o);
        return new C5712m(this.f16170f / e, this.f16171o / e);
    }

    /* renamed from: D */
    public boolean mo17062D() {
        long j = this.f16171o;
        return j == 1 || (j != 0 && this.f16170f % j == 0) || (j == 0 && this.f16170f == 0);
    }

    /* renamed from: F */
    public boolean mo17063F() {
        return this.f16170f == 0 || this.f16171o == 0;
    }

    /* renamed from: K */
    public String mo17064K(boolean z) {
        if (this.f16171o == 0 && this.f16170f != 0) {
            return toString();
        }
        if (mo17062D()) {
            return Integer.toString(intValue());
        }
        long j = this.f16170f;
        if (j != 1) {
            long j2 = this.f16171o;
            if (j2 % j == 0) {
                return new C5712m(1, j2 / j).mo17064K(z);
            }
        }
        C5712m B = mo17061B();
        if (z) {
            String d = Double.toString(B.doubleValue());
            if (d.length() < 5) {
                return d;
            }
        }
        return B.toString();
    }

    public final byte byteValue() {
        return (byte) ((int) doubleValue());
    }

    public double doubleValue() {
        long j = this.f16170f;
        if (j == 0) {
            return 0.0d;
        }
        return ((double) j) / ((double) this.f16171o);
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C5712m) && doubleValue() == ((C5712m) obj).doubleValue();
    }

    public float floatValue() {
        long j = this.f16170f;
        if (j == 0) {
            return 0.0f;
        }
        return ((float) j) / ((float) this.f16171o);
    }

    /* renamed from: g */
    public int compareTo(C5712m mVar) {
        return Double.compare(doubleValue(), mVar.doubleValue());
    }

    /* renamed from: h */
    public boolean mo17071h(C5712m mVar) {
        return mVar.doubleValue() == doubleValue();
    }

    public int hashCode() {
        return (((int) this.f16171o) * 23) + ((int) this.f16170f);
    }

    public final int intValue() {
        return (int) doubleValue();
    }

    public final long longValue() {
        return (long) doubleValue();
    }

    public final short shortValue() {
        return (short) ((int) doubleValue());
    }

    public String toString() {
        return this.f16170f + "/" + this.f16171o;
    }

    /* renamed from: v */
    public final long mo17077v() {
        return this.f16171o;
    }

    /* renamed from: z */
    public final long mo17078z() {
        return this.f16170f;
    }
}
