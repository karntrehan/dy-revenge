package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.i8 */
final class C6835i8 implements C6739cc {

    /* renamed from: a */
    private final C6819h8 f18535a;

    private C6835i8(C6819h8 h8Var) {
        C6820h9.m25837f(h8Var, "output");
        this.f18535a = h8Var;
        h8Var.f18518c = this;
    }

    /* renamed from: K */
    public static C6835i8 m25872K(C6819h8 h8Var) {
        C6835i8 i8Var = h8Var.f18518c;
        return i8Var != null ? i8Var : new C6835i8(h8Var);
    }

    /* renamed from: A */
    public final void mo19616A(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19713l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19712k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo19617B(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19715n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19714m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo19618C(int i, long j) {
        this.f18535a.mo19723v(i, j);
    }

    @Deprecated
    /* renamed from: D */
    public final void mo19619D(int i) {
        this.f18535a.mo19720s(i, 3);
    }

    /* renamed from: E */
    public final void mo19620E(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19713l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19712k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo19621F(int i, Object obj, C6981ra raVar) {
        C6805ga gaVar = (C6805ga) obj;
        C6769e8 e8Var = (C6769e8) this.f18535a;
        e8Var.mo19722u((i << 3) | 2);
        C6834i7 i7Var = (C6834i7) gaVar;
        int a = i7Var.mo19515a();
        if (a == -1) {
            a = raVar.mo19892a(i7Var);
            i7Var.mo19523j(a);
        }
        e8Var.mo19722u(a);
        raVar.mo19898g(gaVar, e8Var.f18518c);
    }

    /* renamed from: G */
    public final void mo19622G(int i, long j) {
        this.f18535a.mo19714m(i, j);
    }

    /* renamed from: H */
    public final void mo19623H(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += C6819h8.m25807b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                C6819h8 h8Var = this.f18535a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                h8Var.mo19724w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C6819h8 h8Var2 = this.f18535a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            h8Var2.mo19723v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo19624I(int i, long j) {
        this.f18535a.mo19723v(i, (j >> 63) ^ (j + j));
    }

    @Deprecated
    /* renamed from: J */
    public final void mo19625J(int i) {
        this.f18535a.mo19720s(i, 4);
    }

    /* renamed from: a */
    public final void mo19626a(int i, int i2) {
        this.f18535a.mo19721t(i, i2);
    }

    /* renamed from: b */
    public final void mo19627b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19715n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19714m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo19628c(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f18535a.mo19711j(i, (C7106z7) list.get(i2));
        }
    }

    /* renamed from: d */
    public final void mo19629d(int i, int i2) {
        this.f18535a.mo19712k(i, i2);
    }

    /* renamed from: e */
    public final void mo19630e(int i, boolean z) {
        this.f18535a.mo19710i(i, z);
    }

    /* renamed from: f */
    public final void mo19631f(int i, int i2) {
        this.f18535a.mo19721t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: g */
    public final void mo19632g(int i, String str) {
        this.f18535a.mo19719r(i, str);
    }

    /* renamed from: h */
    public final void mo19633h(int i, long j) {
        this.f18535a.mo19723v(i, j);
    }

    /* renamed from: i */
    public final void mo19634i(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19709h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19710i(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo19635j(int i, long j) {
        this.f18535a.mo19714m(i, j);
    }

    /* renamed from: k */
    public final void mo19636k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C6819h8.m25806a(((Integer) list.get(i4)).intValue());
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19722u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19721t(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo19637l(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19713l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19712k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo19638m(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C6819h8.m25812z(((Integer) list.get(i4)).intValue());
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19717p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19716o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo19639n(int i, int i2) {
        this.f18535a.mo19716o(i, i2);
    }

    /* renamed from: o */
    public final void mo19640o(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C6819h8.m25812z(((Integer) list.get(i4)).intValue());
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19717p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19716o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo19641p(int i, int i2) {
        this.f18535a.mo19716o(i, i2);
    }

    /* renamed from: q */
    public final void mo19642q(int i, C7106z7 z7Var) {
        this.f18535a.mo19711j(i, z7Var);
    }

    /* renamed from: r */
    public final void mo19643r(int i, List list) {
        int i2 = 0;
        if (list instanceof C6916n9) {
            C6916n9 n9Var = (C6916n9) list;
            while (i2 < list.size()) {
                Object i3 = n9Var.mo19957i(i2);
                if (i3 instanceof String) {
                    this.f18535a.mo19719r(i, (String) i3);
                } else {
                    this.f18535a.mo19711j(i, (C7106z7) i3);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19719r(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: s */
    public final void mo19644s(int i, double d) {
        this.f18535a.mo19714m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: t */
    public final void mo19645t(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19715n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19714m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: u */
    public final void mo19646u(int i, int i2) {
        this.f18535a.mo19712k(i, i2);
    }

    /* renamed from: v */
    public final void mo19647v(int i, float f) {
        this.f18535a.mo19712k(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: w */
    public final void mo19648w(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += C6819h8.m25806a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                C6819h8 h8Var = this.f18535a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                h8Var.mo19722u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C6819h8 h8Var2 = this.f18535a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            h8Var2.mo19721t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo19649x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C6819h8.m25807b(((Long) list.get(i4)).longValue());
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19724w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19723v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo19650y(int i, Object obj, C6981ra raVar) {
        C6819h8 h8Var = this.f18535a;
        h8Var.mo19720s(i, 3);
        raVar.mo19898g((C6805ga) obj, h8Var.f18518c);
        h8Var.mo19720s(i, 4);
    }

    /* renamed from: z */
    public final void mo19651z(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f18535a.mo19720s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C6819h8.m25807b(((Long) list.get(i4)).longValue());
            }
            this.f18535a.mo19722u(i3);
            while (i2 < list.size()) {
                this.f18535a.mo19724w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f18535a.mo19723v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
