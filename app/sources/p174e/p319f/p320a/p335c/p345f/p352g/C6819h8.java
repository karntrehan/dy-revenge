package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: e.f.a.c.f.g.h8 */
public abstract class C6819h8 extends C6930o7 {

    /* renamed from: a */
    private static final Logger f18516a = Logger.getLogger(C6819h8.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final boolean f18517b = C7014tb.m26607C();

    /* renamed from: c */
    C6835i8 f18518c;

    private C6819h8() {
    }

    /* synthetic */ C6819h8(C6803g8 g8Var) {
    }

    /* renamed from: A */
    public static int m25802A(C6884l9 l9Var) {
        int a = l9Var.mo19944a();
        return m25806a(a) + a;
    }

    /* renamed from: B */
    static int m25803B(C6805ga gaVar, C6981ra raVar) {
        C6834i7 i7Var = (C6834i7) gaVar;
        int a = i7Var.mo19515a();
        if (a == -1) {
            a = raVar.mo19892a(i7Var);
            i7Var.mo19523j(a);
        }
        return m25806a(a) + a;
    }

    /* renamed from: C */
    public static int m25804C(String str) {
        int i;
        try {
            i = C7110zb.m27091c(str);
        } catch (C7094yb unused) {
            i = str.getBytes(C6820h9.f18520b).length;
        }
        return m25806a(i) + i;
    }

    /* renamed from: D */
    public static int m25805D(int i) {
        return m25806a(i << 3);
    }

    /* renamed from: a */
    public static int m25806a(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: b */
    public static int m25807b(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: c */
    public static C6819h8 m25808c(byte[] bArr) {
        return new C6769e8(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m25810x(C7106z7 z7Var) {
        int h = z7Var.mo20156h();
        return m25806a(h) + h;
    }

    @Deprecated
    /* renamed from: y */
    static int m25811y(int i, C6805ga gaVar, C6981ra raVar) {
        int a = m25806a(i << 3);
        int i2 = a + a;
        C6834i7 i7Var = (C6834i7) gaVar;
        int a2 = i7Var.mo19515a();
        if (a2 == -1) {
            a2 = raVar.mo19892a(i7Var);
            i7Var.mo19523j(a2);
        }
        return i2 + a2;
    }

    /* renamed from: z */
    public static int m25812z(int i) {
        if (i >= 0) {
            return m25806a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo19828d() {
        if (mo19708g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo19829e(String str, C7094yb ybVar) {
        f18516a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ybVar);
        byte[] bytes = str.getBytes(C6820h9.f18520b);
        try {
            int length = bytes.length;
            mo19722u(length);
            mo19718q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C6786f8(e);
        }
    }

    /* renamed from: g */
    public abstract int mo19708g();

    /* renamed from: h */
    public abstract void mo19709h(byte b);

    /* renamed from: i */
    public abstract void mo19710i(int i, boolean z);

    /* renamed from: j */
    public abstract void mo19711j(int i, C7106z7 z7Var);

    /* renamed from: k */
    public abstract void mo19712k(int i, int i2);

    /* renamed from: l */
    public abstract void mo19713l(int i);

    /* renamed from: m */
    public abstract void mo19714m(int i, long j);

    /* renamed from: n */
    public abstract void mo19715n(long j);

    /* renamed from: o */
    public abstract void mo19716o(int i, int i2);

    /* renamed from: p */
    public abstract void mo19717p(int i);

    /* renamed from: q */
    public abstract void mo19718q(byte[] bArr, int i, int i2);

    /* renamed from: r */
    public abstract void mo19719r(int i, String str);

    /* renamed from: s */
    public abstract void mo19720s(int i, int i2);

    /* renamed from: t */
    public abstract void mo19721t(int i, int i2);

    /* renamed from: u */
    public abstract void mo19722u(int i);

    /* renamed from: v */
    public abstract void mo19723v(int i, long j);

    /* renamed from: w */
    public abstract void mo19724w(long j);
}
