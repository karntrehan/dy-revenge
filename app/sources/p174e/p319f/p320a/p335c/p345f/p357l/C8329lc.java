package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.List;

/* renamed from: e.f.a.c.f.l.lc */
final class C8329lc {

    /* renamed from: a */
    private final C8310kc f22752a;

    private C8329lc(C8310kc kcVar) {
        C8311kd.m28702f(kcVar, "output");
        this.f22752a = kcVar;
        kcVar.f22724c = this;
    }

    /* renamed from: m */
    public static C8329lc m28736m(C8310kc kcVar) {
        C8329lc lcVar = kcVar.f22724c;
        return lcVar != null ? lcVar : new C8329lc(kcVar);
    }

    /* renamed from: A */
    public final void mo21937A(int i, float f) {
        this.f22752a.mo21865n(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: B */
    public final void mo21938B(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21866o(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21865n(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo21939C(int i, Object obj, C8511ve veVar) {
        C8310kc kcVar = this.f22752a;
        kcVar.mo21873v(i, 3);
        veVar.mo21980f((C8274ie) obj, kcVar.f22724c);
        kcVar.mo21873v(i, 4);
    }

    /* renamed from: D */
    public final void mo21940D(int i, int i2) {
        this.f22752a.mo21869r(i, i2);
    }

    /* renamed from: E */
    public final void mo21941E(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8310kc.m28668E(list.get(i4).intValue());
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21870s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21869r(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo21942F(int i, long j) {
        this.f22752a.mo21876y(i, j);
    }

    /* renamed from: G */
    public final void mo21943G(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8310kc.m28675e(list.get(i4).longValue());
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21877z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21876y(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo21944H(int i, Object obj, C8511ve veVar) {
        C8274ie ieVar = (C8274ie) obj;
        C8272ic icVar = (C8272ic) this.f22752a;
        icVar.mo21875x((i << 3) | 2);
        C8346mb mbVar = (C8346mb) ieVar;
        int d = mbVar.mo21761d();
        if (d == -1) {
            d = veVar.mo21975a(mbVar);
            mbVar.mo21763f(d);
        }
        icVar.mo21875x(d);
        veVar.mo21980f(ieVar, icVar.f22724c);
    }

    /* renamed from: I */
    public final void mo21945I(int i, Object obj) {
        if (obj instanceof C8177dc) {
            C8272ic icVar = (C8272ic) this.f22752a;
            icVar.mo21875x(11);
            icVar.mo21874w(2, i);
            icVar.mo21864m(3, (C8177dc) obj);
            icVar.mo21875x(12);
            return;
        }
        C8310kc kcVar = this.f22752a;
        C8274ie ieVar = (C8274ie) obj;
        C8272ic icVar2 = (C8272ic) kcVar;
        icVar2.mo21875x(11);
        icVar2.mo21874w(2, i);
        icVar2.mo21875x(26);
        icVar2.mo21875x(ieVar.mo21771u());
        ieVar.mo21760c(kcVar);
        icVar2.mo21875x(12);
    }

    /* renamed from: J */
    public final void mo21946J(int i, int i2) {
        this.f22752a.mo21865n(i, i2);
    }

    /* renamed from: K */
    public final void mo21947K(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21866o(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21865n(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: L */
    public final void mo21948L(int i, long j) {
        this.f22752a.mo21867p(i, j);
    }

    /* renamed from: a */
    public final void mo21949a(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21868q(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21867p(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo21950b(int i, int i2) {
        this.f22752a.mo21874w(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: c */
    public final void mo21951c(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += C8310kc.m28674d((intValue >> 31) ^ (intValue + intValue));
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                C8310kc kcVar = this.f22752a;
                int intValue2 = list.get(i2).intValue();
                kcVar.mo21875x((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C8310kc kcVar2 = this.f22752a;
            int intValue3 = list.get(i2).intValue();
            kcVar2.mo21874w(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo21952d(int i, long j) {
        this.f22752a.mo21876y(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: e */
    public final void mo21953e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += C8310kc.m28675e((longValue >> 63) ^ (longValue + longValue));
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                C8310kc kcVar = this.f22752a;
                long longValue2 = list.get(i2).longValue();
                kcVar.mo21877z((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C8310kc kcVar2 = this.f22752a;
            long longValue3 = list.get(i2).longValue();
            kcVar2.mo21876y(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo21954f(int i) {
        this.f22752a.mo21873v(i, 3);
    }

    /* renamed from: g */
    public final void mo21955g(int i, String str) {
        this.f22752a.mo21872u(i, str);
    }

    /* renamed from: h */
    public final void mo21956h(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C8456sd) {
            C8456sd sdVar = (C8456sd) list;
            while (i2 < list.size()) {
                Object i3 = sdVar.mo22074i(i2);
                if (i3 instanceof String) {
                    this.f22752a.mo21872u(i, (String) i3);
                } else {
                    this.f22752a.mo21864m(i, (C8177dc) i3);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21872u(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo21957i(int i, int i2) {
        this.f22752a.mo21874w(i, i2);
    }

    /* renamed from: j */
    public final void mo21958j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8310kc.m28674d(list.get(i4).intValue());
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21875x(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21874w(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo21959k(int i, long j) {
        this.f22752a.mo21876y(i, j);
    }

    /* renamed from: l */
    public final void mo21960l(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8310kc.m28675e(list.get(i4).longValue());
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21877z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21876y(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo21961n(int i, boolean z) {
        this.f22752a.mo21863l(i, z);
    }

    /* renamed from: o */
    public final void mo21962o(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21862k(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21863l(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo21963p(int i, C8177dc dcVar) {
        this.f22752a.mo21864m(i, dcVar);
    }

    /* renamed from: q */
    public final void mo21964q(int i, List<C8177dc> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f22752a.mo21864m(i, list.get(i2));
        }
    }

    /* renamed from: r */
    public final void mo21965r(int i, double d) {
        this.f22752a.mo21867p(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: s */
    public final void mo21966s(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21868q(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21867p(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo21967t(int i) {
        this.f22752a.mo21873v(i, 4);
    }

    /* renamed from: u */
    public final void mo21968u(int i, int i2) {
        this.f22752a.mo21869r(i, i2);
    }

    /* renamed from: v */
    public final void mo21969v(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C8310kc.m28668E(list.get(i4).intValue());
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21870s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21869r(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: w */
    public final void mo21970w(int i, int i2) {
        this.f22752a.mo21865n(i, i2);
    }

    /* renamed from: x */
    public final void mo21971x(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21866o(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21865n(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo21972y(int i, long j) {
        this.f22752a.mo21867p(i, j);
    }

    /* renamed from: z */
    public final void mo21973z(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f22752a.mo21873v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f22752a.mo21875x(i3);
            while (i2 < list.size()) {
                this.f22752a.mo21868q(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f22752a.mo21867p(i, list.get(i2).longValue());
            i2++;
        }
    }
}
