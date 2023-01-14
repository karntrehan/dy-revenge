package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.j */
class C5038j {

    /* renamed from: A */
    private double[] f14111A;

    /* renamed from: B */
    private int f14112B;

    /* renamed from: C */
    private int f14113C;

    /* renamed from: D */
    private int f14114D;

    /* renamed from: E */
    private int f14115E;

    /* renamed from: F */
    private int f14116F;

    /* renamed from: G */
    private int f14117G;

    /* renamed from: H */
    private int f14118H;

    /* renamed from: I */
    private int f14119I;

    /* renamed from: J */
    private int f14120J;

    /* renamed from: K */
    private int f14121K;

    /* renamed from: L */
    private int f14122L;

    /* renamed from: M */
    private final float f14123M;

    /* renamed from: N */
    private final float f14124N;

    /* renamed from: O */
    private final float f14125O;

    /* renamed from: a */
    final ArrayList<C5032h> f14126a;

    /* renamed from: b */
    private final ArrayList<C5020c0[]> f14127b;

    /* renamed from: c */
    private final ArrayList<C5020c0[]> f14128c;

    /* renamed from: d */
    private final ArrayList<C5020c0[]> f14129d;

    /* renamed from: e */
    private final ArrayList<C5020c0[]> f14130e;

    /* renamed from: f */
    private final ArrayList<double[]> f14131f;

    /* renamed from: g */
    private final ArrayList<Integer> f14132g;

    /* renamed from: h */
    private final ArrayList<Integer> f14133h;

    /* renamed from: i */
    private final ArrayList<Integer> f14134i;

    /* renamed from: j */
    private final ArrayList<Integer> f14135j;

    /* renamed from: k */
    private final ArrayList<Integer> f14136k;

    /* renamed from: l */
    private final ArrayList<Integer> f14137l = new ArrayList<>();

    /* renamed from: m */
    private final ArrayList<Integer> f14138m = new ArrayList<>();

    /* renamed from: n */
    private final ArrayList<Integer> f14139n = new ArrayList<>();

    /* renamed from: o */
    private final ArrayList<Integer> f14140o = new ArrayList<>();

    /* renamed from: p */
    private final ArrayList<Integer> f14141p = new ArrayList<>();

    /* renamed from: q */
    private double f14142q = 12.0d;

    /* renamed from: r */
    private C5032h f14143r = C5032h.f14072a;

    /* renamed from: s */
    private double f14144s;

    /* renamed from: t */
    private double f14145t;

    /* renamed from: u */
    private double f14146u;

    /* renamed from: v */
    private double f14147v;

    /* renamed from: w */
    private C5020c0[] f14148w;

    /* renamed from: x */
    private C5020c0[] f14149x;

    /* renamed from: y */
    private C5020c0[] f14150y;

    /* renamed from: z */
    private C5020c0[] f14151z;

    C5038j(float f, float f2, float f3) {
        ArrayList<C5032h> arrayList = new ArrayList<>();
        this.f14126a = arrayList;
        ArrayList<C5020c0[]> arrayList2 = new ArrayList<>();
        this.f14127b = arrayList2;
        ArrayList<C5020c0[]> arrayList3 = new ArrayList<>();
        this.f14128c = arrayList3;
        ArrayList<C5020c0[]> arrayList4 = new ArrayList<>();
        this.f14129d = arrayList4;
        ArrayList<C5020c0[]> arrayList5 = new ArrayList<>();
        this.f14130e = arrayList5;
        ArrayList<double[]> arrayList6 = new ArrayList<>();
        this.f14131f = arrayList6;
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        this.f14132g = arrayList7;
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        this.f14133h = arrayList8;
        ArrayList<Integer> arrayList9 = new ArrayList<>();
        this.f14134i = arrayList9;
        ArrayList<Integer> arrayList10 = new ArrayList<>();
        this.f14135j = arrayList10;
        ArrayList<Integer> arrayList11 = new ArrayList<>();
        this.f14136k = arrayList11;
        C5020c0[] c0VarArr = new C5020c0[0];
        this.f14148w = c0VarArr;
        this.f14149x = new C5020c0[0];
        this.f14150y = new C5020c0[0];
        this.f14151z = new C5020c0[0];
        this.f14111A = new double[]{0.0d};
        this.f14117G = -1;
        this.f14118H = -1;
        this.f14119I = -1;
        this.f14120J = -1;
        this.f14121K = -1;
        this.f14123M = f;
        this.f14124N = f2;
        this.f14125O = f3;
        arrayList2.add(c0VarArr);
        arrayList3.add(this.f14149x);
        arrayList4.add(this.f14150y);
        arrayList5.add(this.f14151z);
        arrayList6.add(this.f14111A);
        arrayList7.add(Integer.valueOf(this.f14117G));
        arrayList8.add(Integer.valueOf(this.f14118H));
        arrayList9.add(Integer.valueOf(this.f14119I));
        arrayList10.add(Integer.valueOf(this.f14120J));
        arrayList11.add(Integer.valueOf(this.f14121K));
        arrayList.add(this.f14143r);
        m19042q();
    }

    /* renamed from: a */
    private double[] m19038a(ArrayList<C5020c0> arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).f14015a;
        }
        return dArr;
    }

    /* renamed from: e */
    private C5020c0[] m19039e(ArrayList<C5020c0> arrayList) {
        int size = arrayList.size();
        C5020c0[] c0VarArr = new C5020c0[size];
        for (int i = 0; i < size; i++) {
            c0VarArr[i] = arrayList.get(i);
        }
        return c0VarArr;
    }

    /* renamed from: f */
    private C5032h m19040f(C5042l lVar) {
        C5032h b;
        if (this.f14122L > 0) {
            return this.f14143r;
        }
        do {
            lVar = lVar.getParentTextRoot();
            if (lVar == null) {
                return C5032h.f14072a;
            }
            b = lVar.mo15297e0().mo15282b();
        } while (b == C5032h.f14072a);
        return b;
    }

    /* renamed from: h */
    private static void m19041h(ArrayList<Integer> arrayList, int i) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(arrayList.get(i).intValue() + 1));
            i--;
        }
    }

    /* renamed from: q */
    private void m19042q() {
        this.f14137l.add(Integer.valueOf(this.f14112B));
        this.f14138m.add(Integer.valueOf(this.f14113C));
        this.f14139n.add(Integer.valueOf(this.f14114D));
        this.f14140o.add(Integer.valueOf(this.f14115E));
        this.f14141p.add(Integer.valueOf(this.f14116F));
    }

    /* renamed from: r */
    private void m19043r(C5042l lVar, ReadableMap readableMap) {
        C5032h f = m19040f(lVar);
        this.f14122L++;
        if (readableMap == null) {
            this.f14126a.add(f);
            return;
        }
        C5032h hVar = new C5032h(readableMap, f, (double) this.f14123M);
        this.f14142q = hVar.f14073b;
        this.f14126a.add(hVar);
        this.f14143r = hVar;
    }

    /* renamed from: s */
    private void m19044s() {
        this.f14116F = 0;
        this.f14115E = 0;
        this.f14114D = 0;
        this.f14113C = 0;
        this.f14112B = 0;
        this.f14121K = -1;
        this.f14120J = -1;
        this.f14119I = -1;
        this.f14118H = -1;
        this.f14117G = -1;
        this.f14147v = 0.0d;
        this.f14146u = 0.0d;
        this.f14145t = 0.0d;
        this.f14144s = 0.0d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5032h mo15282b() {
        return this.f14143r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public double mo15283c() {
        return this.f14142q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo15284d() {
        return this.f14125O;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo15285g() {
        return this.f14124N;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public double mo15286i() {
        m19041h(this.f14134i, this.f14114D);
        int i = this.f14119I + 1;
        C5020c0[] c0VarArr = this.f14150y;
        if (i < c0VarArr.length) {
            this.f14119I = i;
            this.f14146u += C5065w.m19147a(c0VarArr[i], (double) this.f14124N, 0.0d, (double) this.f14123M, this.f14142q);
        }
        return this.f14146u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public double mo15287j() {
        m19041h(this.f14135j, this.f14115E);
        int i = this.f14120J + 1;
        C5020c0[] c0VarArr = this.f14151z;
        if (i < c0VarArr.length) {
            this.f14120J = i;
            this.f14147v += C5065w.m19147a(c0VarArr[i], (double) this.f14125O, 0.0d, (double) this.f14123M, this.f14142q);
        }
        return this.f14147v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public double mo15288k() {
        m19041h(this.f14136k, this.f14116F);
        int min = Math.min(this.f14121K + 1, this.f14111A.length - 1);
        this.f14121K = min;
        return this.f14111A[min];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public double mo15289l(double d) {
        m19041h(this.f14132g, this.f14112B);
        int i = this.f14117G + 1;
        C5020c0[] c0VarArr = this.f14148w;
        if (i < c0VarArr.length) {
            this.f14146u = 0.0d;
            this.f14117G = i;
            this.f14144s = C5065w.m19147a(c0VarArr[i], (double) this.f14124N, 0.0d, (double) this.f14123M, this.f14142q);
        }
        double d2 = this.f14144s + d;
        this.f14144s = d2;
        return d2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public double mo15290m() {
        m19041h(this.f14133h, this.f14113C);
        int i = this.f14118H + 1;
        C5020c0[] c0VarArr = this.f14149x;
        if (i < c0VarArr.length) {
            this.f14147v = 0.0d;
            this.f14118H = i;
            this.f14145t = C5065w.m19147a(c0VarArr[i], (double) this.f14125O, 0.0d, (double) this.f14123M, this.f14142q);
        }
        return this.f14145t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo15291n() {
        this.f14126a.remove(this.f14122L);
        this.f14137l.remove(this.f14122L);
        this.f14138m.remove(this.f14122L);
        this.f14139n.remove(this.f14122L);
        this.f14140o.remove(this.f14122L);
        this.f14141p.remove(this.f14122L);
        int i = this.f14122L - 1;
        this.f14122L = i;
        int i2 = this.f14112B;
        int i3 = this.f14113C;
        int i4 = this.f14114D;
        int i5 = this.f14115E;
        int i6 = this.f14116F;
        this.f14143r = this.f14126a.get(i);
        this.f14112B = this.f14137l.get(this.f14122L).intValue();
        this.f14113C = this.f14138m.get(this.f14122L).intValue();
        this.f14114D = this.f14139n.get(this.f14122L).intValue();
        this.f14115E = this.f14140o.get(this.f14122L).intValue();
        this.f14116F = this.f14141p.get(this.f14122L).intValue();
        if (i2 != this.f14112B) {
            this.f14127b.remove(i2);
            this.f14148w = this.f14127b.get(this.f14112B);
            this.f14117G = this.f14132g.get(this.f14112B).intValue();
        }
        if (i3 != this.f14113C) {
            this.f14128c.remove(i3);
            this.f14149x = this.f14128c.get(this.f14113C);
            this.f14118H = this.f14133h.get(this.f14113C).intValue();
        }
        if (i4 != this.f14114D) {
            this.f14129d.remove(i4);
            this.f14150y = this.f14129d.get(this.f14114D);
            this.f14119I = this.f14134i.get(this.f14114D).intValue();
        }
        if (i5 != this.f14115E) {
            this.f14130e.remove(i5);
            this.f14151z = this.f14130e.get(this.f14115E);
            this.f14120J = this.f14135j.get(this.f14115E).intValue();
        }
        if (i6 != this.f14116F) {
            this.f14131f.remove(i6);
            this.f14111A = this.f14131f.get(this.f14116F);
            this.f14121K = this.f14136k.get(this.f14116F).intValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo15292o(C5042l lVar, ReadableMap readableMap) {
        m19043r(lVar, readableMap);
        m19042q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo15293p(boolean z, C5062u0 u0Var, ReadableMap readableMap, ArrayList<C5020c0> arrayList, ArrayList<C5020c0> arrayList2, ArrayList<C5020c0> arrayList3, ArrayList<C5020c0> arrayList4, ArrayList<C5020c0> arrayList5) {
        if (z) {
            m19044s();
        }
        m19043r(u0Var, readableMap);
        if (!(arrayList == null || arrayList.size() == 0)) {
            this.f14112B++;
            this.f14117G = -1;
            this.f14132g.add(-1);
            C5020c0[] e = m19039e(arrayList);
            this.f14148w = e;
            this.f14127b.add(e);
        }
        if (!(arrayList2 == null || arrayList2.size() == 0)) {
            this.f14113C++;
            this.f14118H = -1;
            this.f14133h.add(-1);
            C5020c0[] e2 = m19039e(arrayList2);
            this.f14149x = e2;
            this.f14128c.add(e2);
        }
        if (!(arrayList3 == null || arrayList3.size() == 0)) {
            this.f14114D++;
            this.f14119I = -1;
            this.f14134i.add(-1);
            C5020c0[] e3 = m19039e(arrayList3);
            this.f14150y = e3;
            this.f14129d.add(e3);
        }
        if (!(arrayList4 == null || arrayList4.size() == 0)) {
            this.f14115E++;
            this.f14120J = -1;
            this.f14135j.add(-1);
            C5020c0[] e4 = m19039e(arrayList4);
            this.f14151z = e4;
            this.f14130e.add(e4);
        }
        if (!(arrayList5 == null || arrayList5.size() == 0)) {
            this.f14116F++;
            this.f14121K = -1;
            this.f14136k.add(-1);
            double[] a = m19038a(arrayList5);
            this.f14111A = a;
            this.f14131f.add(a);
        }
        m19042q();
    }
}
