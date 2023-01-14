package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: e.f.a.c.f.l.kc */
public abstract class C8310kc extends C8472tb {

    /* renamed from: a */
    private static final Logger f22722a = Logger.getLogger(C8310kc.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final boolean f22723b = C8494uf.m29092C();

    /* renamed from: c */
    C8329lc f22724c;

    private C8310kc() {
    }

    /* synthetic */ C8310kc(C8253hc hcVar) {
    }

    /* renamed from: A */
    public static int m28664A(byte[] bArr) {
        int length = bArr.length;
        return m28674d(length) + length;
    }

    /* renamed from: B */
    public static int m28665B(C8177dc dcVar) {
        int h = dcVar.mo21692h();
        return m28674d(h) + h;
    }

    @Deprecated
    /* renamed from: C */
    static int m28666C(int i, C8274ie ieVar, C8511ve veVar) {
        int d = m28674d(i << 3);
        int i2 = d + d;
        C8346mb mbVar = (C8346mb) ieVar;
        int d2 = mbVar.mo21761d();
        if (d2 == -1) {
            d2 = veVar.mo21975a(mbVar);
            mbVar.mo21763f(d2);
        }
        return i2 + d2;
    }

    @Deprecated
    /* renamed from: D */
    public static int m28667D(C8274ie ieVar) {
        return ieVar.mo21771u();
    }

    /* renamed from: E */
    public static int m28668E(int i) {
        if (i >= 0) {
            return m28674d(i);
        }
        return 10;
    }

    /* renamed from: F */
    public static int m28669F(C8420qd qdVar) {
        int a = qdVar.mo22103a();
        return m28674d(a) + a;
    }

    /* renamed from: G */
    public static int m28670G(C8274ie ieVar) {
        int u = ieVar.mo21771u();
        return m28674d(u) + u;
    }

    /* renamed from: a */
    static int m28671a(C8274ie ieVar, C8511ve veVar) {
        C8346mb mbVar = (C8346mb) ieVar;
        int d = mbVar.mo21761d();
        if (d == -1) {
            d = veVar.mo21975a(mbVar);
            mbVar.mo21763f(d);
        }
        return m28674d(d) + d;
    }

    /* renamed from: b */
    public static int m28672b(String str) {
        int i;
        try {
            i = C8584zf.m29351c(str);
        } catch (C8566yf unused) {
            i = str.getBytes(C8311kd.f22725a).length;
        }
        return m28674d(i) + i;
    }

    /* renamed from: c */
    public static int m28673c(int i) {
        return m28674d(i << 3);
    }

    /* renamed from: d */
    public static int m28674d(int i) {
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

    /* renamed from: e */
    public static int m28675e(long j) {
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

    /* renamed from: f */
    public static C8310kc m28676f(byte[] bArr) {
        return new C8272ic(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public final void mo21926g() {
        if (mo21861j() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo21927h(String str, C8566yf yfVar) {
        f22722a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", yfVar);
        byte[] bytes = str.getBytes(C8311kd.f22725a);
        try {
            int length = bytes.length;
            mo21875x(length);
            mo21871t(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C8291jc(e);
        } catch (C8291jc e2) {
            throw e2;
        }
    }

    /* renamed from: j */
    public abstract int mo21861j();

    /* renamed from: k */
    public abstract void mo21862k(byte b);

    /* renamed from: l */
    public abstract void mo21863l(int i, boolean z);

    /* renamed from: m */
    public abstract void mo21864m(int i, C8177dc dcVar);

    /* renamed from: n */
    public abstract void mo21865n(int i, int i2);

    /* renamed from: o */
    public abstract void mo21866o(int i);

    /* renamed from: p */
    public abstract void mo21867p(int i, long j);

    /* renamed from: q */
    public abstract void mo21868q(long j);

    /* renamed from: r */
    public abstract void mo21869r(int i, int i2);

    /* renamed from: s */
    public abstract void mo21870s(int i);

    /* renamed from: t */
    public abstract void mo21871t(byte[] bArr, int i, int i2);

    /* renamed from: u */
    public abstract void mo21872u(int i, String str);

    /* renamed from: v */
    public abstract void mo21873v(int i, int i2);

    /* renamed from: w */
    public abstract void mo21874w(int i, int i2);

    /* renamed from: x */
    public abstract void mo21875x(int i);

    /* renamed from: y */
    public abstract void mo21876y(int i, long j);

    /* renamed from: z */
    public abstract void mo21877z(long j);
}
