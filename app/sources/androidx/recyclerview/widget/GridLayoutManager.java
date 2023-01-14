package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p027c.p064i.p072j.p073g0.C1955c;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f3754I = false;

    /* renamed from: J */
    int f3755J = -1;

    /* renamed from: K */
    int[] f3756K;

    /* renamed from: L */
    View[] f3757L;

    /* renamed from: M */
    final SparseIntArray f3758M = new SparseIntArray();

    /* renamed from: N */
    final SparseIntArray f3759N = new SparseIntArray();

    /* renamed from: O */
    C1315c f3760O = new C1313a();

    /* renamed from: P */
    final Rect f3761P = new Rect();

    /* renamed from: Q */
    private boolean f3762Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1313a extends C1315c {
        /* renamed from: e */
        public int mo4427e(int i, int i2) {
            return i % i2;
        }

        /* renamed from: f */
        public int mo4428f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C1314b extends RecyclerView.C1347p {

        /* renamed from: e */
        int f3763e = -1;

        /* renamed from: f */
        int f3764f = 0;

        public C1314b(int i, int i2) {
            super(i, i2);
        }

        public C1314b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1314b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1314b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public int mo4429e() {
            return this.f3763e;
        }

        /* renamed from: f */
        public int mo4430f() {
            return this.f3764f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C1315c {

        /* renamed from: a */
        final SparseIntArray f3765a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f3766b = new SparseIntArray();

        /* renamed from: c */
        private boolean f3767c = false;

        /* renamed from: d */
        private boolean f3768d = false;

        /* renamed from: a */
        static int m5419a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4431b(int i, int i2) {
            if (!this.f3768d) {
                return mo4433d(i, i2);
            }
            int i3 = this.f3766b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo4433d(i, i2);
            this.f3766b.put(i, d);
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo4432c(int i, int i2) {
            if (!this.f3767c) {
                return mo4427e(i, i2);
            }
            int i3 = this.f3765a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo4427e(i, i2);
            this.f3765a.put(i, e);
            return e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4433d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f3768d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f3766b
                int r0 = m5419a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f3766b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo4432c(r0, r8)
                int r0 = r6.mo4428f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.mo4428f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.mo4428f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C1315c.mo4433d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo4427e(int i, int i2);

        /* renamed from: f */
        public abstract int mo4428f(int i);

        /* renamed from: g */
        public void mo4434g() {
            this.f3766b.clear();
        }

        /* renamed from: h */
        public void mo4435h() {
            this.f3765a.clear();
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo4415e3(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo4415e3(RecyclerView.C1342o.m5661i0(context, attributeSet, i, i2).f3892b);
    }

    /* renamed from: N2 */
    private void m5368N2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f3757L[i3];
            C1314b bVar = (C1314b) view.getLayoutParams();
            int a3 = m5379a3(vVar, a0Var, mo4873h0(view));
            bVar.f3764f = a3;
            bVar.f3763e = i4;
            i4 += a3;
            i3 += i2;
        }
    }

    /* renamed from: O2 */
    private void m5369O2() {
        int J = mo4833J();
        for (int i = 0; i < J; i++) {
            C1314b bVar = (C1314b) mo4832I(i).getLayoutParams();
            int a = bVar.mo4913a();
            this.f3758M.put(a, bVar.mo4430f());
            this.f3759N.put(a, bVar.mo4429e());
        }
    }

    /* renamed from: P2 */
    private void m5370P2(int i) {
        this.f3756K = m5371Q2(this.f3756K, this.f3755J, i);
    }

    /* renamed from: Q2 */
    static int[] m5371Q2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: R2 */
    private void m5372R2() {
        this.f3758M.clear();
        this.f3759N.clear();
    }

    /* renamed from: S2 */
    private int m5373S2(RecyclerView.C1322a0 a0Var) {
        if (!(mo4833J() == 0 || a0Var.mo4682b() == 0)) {
            mo4447T1();
            boolean r2 = mo4467r2();
            View Y1 = mo4450Y1(!r2, true);
            View X1 = mo4449X1(!r2, true);
            if (!(Y1 == null || X1 == null)) {
                int b = this.f3760O.mo4431b(mo4873h0(Y1), this.f3755J);
                int b2 = this.f3760O.mo4431b(mo4873h0(X1), this.f3755J);
                int min = Math.min(b, b2);
                int max = this.f3782x ? Math.max(0, ((this.f3760O.mo4431b(a0Var.mo4682b() - 1, this.f3755J) + 1) - Math.max(b, b2)) - 1) : Math.max(0, min);
                if (!r2) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f3779u.mo5188d(X1) - this.f3779u.mo5191g(Y1))) / ((float) ((this.f3760O.mo4431b(mo4873h0(X1), this.f3755J) - this.f3760O.mo4431b(mo4873h0(Y1), this.f3755J)) + 1)))) + ((float) (this.f3779u.mo5197m() - this.f3779u.mo5191g(Y1))));
            }
        }
        return 0;
    }

    /* renamed from: T2 */
    private int m5374T2(RecyclerView.C1322a0 a0Var) {
        if (!(mo4833J() == 0 || a0Var.mo4682b() == 0)) {
            mo4447T1();
            View Y1 = mo4450Y1(!mo4467r2(), true);
            View X1 = mo4449X1(!mo4467r2(), true);
            if (!(Y1 == null || X1 == null)) {
                if (!mo4467r2()) {
                    return this.f3760O.mo4431b(a0Var.mo4682b() - 1, this.f3755J) + 1;
                }
                int d = this.f3779u.mo5188d(X1) - this.f3779u.mo5191g(Y1);
                int b = this.f3760O.mo4431b(mo4873h0(Y1), this.f3755J);
                return (int) ((((float) d) / ((float) ((this.f3760O.mo4431b(mo4873h0(X1), this.f3755J) - b) + 1))) * ((float) (this.f3760O.mo4431b(a0Var.mo4682b() - 1, this.f3755J) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: U2 */
    private void m5375U2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, LinearLayoutManager.C1316a aVar, int i) {
        boolean z = i == 1;
        int Z2 = m5378Z2(vVar, a0Var, aVar.f3786b);
        if (z) {
            while (Z2 > 0) {
                int i2 = aVar.f3786b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f3786b = i3;
                    Z2 = m5378Z2(vVar, a0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b = a0Var.mo4682b() - 1;
        int i4 = aVar.f3786b;
        while (i4 < b) {
            int i5 = i4 + 1;
            int Z22 = m5378Z2(vVar, a0Var, i5);
            if (Z22 <= Z2) {
                break;
            }
            i4 = i5;
            Z2 = Z22;
        }
        aVar.f3786b = i4;
    }

    /* renamed from: V2 */
    private void m5376V2() {
        View[] viewArr = this.f3757L;
        if (viewArr == null || viewArr.length != this.f3755J) {
            this.f3757L = new View[this.f3755J];
        }
    }

    /* renamed from: Y2 */
    private int m5377Y2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, int i) {
        if (!a0Var.mo4685e()) {
            return this.f3760O.mo4431b(i, this.f3755J);
        }
        int f = vVar.mo4952f(i);
        if (f != -1) {
            return this.f3760O.mo4431b(f, this.f3755J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: Z2 */
    private int m5378Z2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, int i) {
        if (!a0Var.mo4685e()) {
            return this.f3760O.mo4432c(i, this.f3755J);
        }
        int i2 = this.f3759N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo4952f(i);
        if (f != -1) {
            return this.f3760O.mo4432c(f, this.f3755J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: a3 */
    private int m5379a3(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, int i) {
        if (!a0Var.mo4685e()) {
            return this.f3760O.mo4428f(i);
        }
        int i2 = this.f3758M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo4952f(i);
        if (f != -1) {
            return this.f3760O.mo4428f(f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: b3 */
    private void m5380b3(float f, int i) {
        m5370P2(Math.max(Math.round(f * ((float) this.f3755J)), i));
    }

    /* renamed from: c3 */
    private void m5381c3(View view, int i, boolean z) {
        int i2;
        int i3;
        C1314b bVar = (C1314b) view.getLayoutParams();
        Rect rect = bVar.f3896b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int W2 = mo4411W2(bVar.f3763e, bVar.f3764f);
        if (this.f3777s == 1) {
            i2 = RecyclerView.C1342o.m5658K(W2, i, i5, bVar.width, false);
            i3 = RecyclerView.C1342o.m5658K(this.f3779u.mo5198n(), mo4852X(), i4, bVar.height, true);
        } else {
            int K = RecyclerView.C1342o.m5658K(W2, i, i4, bVar.height, false);
            int K2 = RecyclerView.C1342o.m5658K(this.f3779u.mo5198n(), mo4889p0(), i5, bVar.width, true);
            i3 = K;
            i2 = K2;
        }
        m5382d3(view, i2, i3, z);
    }

    /* renamed from: d3 */
    private void m5382d3(View view, int i, int i2, boolean z) {
        RecyclerView.C1347p pVar = (RecyclerView.C1347p) view.getLayoutParams();
        if (z ? mo4831H1(view, i, i2, pVar) : mo4826F1(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: f3 */
    private void m5383f3() {
        int i;
        int i2;
        if (mo4464p2() == 1) {
            i2 = mo4887o0() - mo4868f0();
            i = mo4866e0();
        } else {
            i2 = mo4851W() - mo4864d0();
            i = mo4870g0();
        }
        m5370P2(i2 - i);
    }

    /* renamed from: C1 */
    public void mo4396C1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f3756K == null) {
            super.mo4396C1(rect, i, i2);
        }
        int e0 = mo4866e0() + mo4868f0();
        int g0 = mo4870g0() + mo4864d0();
        if (this.f3777s == 1) {
            i4 = RecyclerView.C1342o.m5662n(i2, rect.height() + g0, mo4859b0());
            int[] iArr = this.f3756K;
            i3 = RecyclerView.C1342o.m5662n(i, iArr[iArr.length - 1] + e0, mo4862c0());
        } else {
            i3 = RecyclerView.C1342o.m5662n(i, rect.width() + e0, mo4862c0());
            int[] iArr2 = this.f3756K;
            i4 = RecyclerView.C1342o.m5662n(i2, iArr2[iArr2.length - 1] + g0, mo4859b0());
        }
        mo4819B1(i3, i4);
    }

    /* renamed from: D */
    public RecyclerView.C1347p mo4397D() {
        return this.f3777s == 0 ? new C1314b(-2, -1) : new C1314b(-1, -2);
    }

    /* renamed from: E */
    public RecyclerView.C1347p mo4398E(Context context, AttributeSet attributeSet) {
        return new C1314b(context, attributeSet);
    }

    /* renamed from: E2 */
    public void mo4399E2(boolean z) {
        if (!z) {
            super.mo4399E2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: F */
    public RecyclerView.C1347p mo4400F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1314b((ViewGroup.MarginLayoutParams) layoutParams) : new C1314b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4401J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1354v r26, androidx.recyclerview.widget.RecyclerView.C1322a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo4817B(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C1314b) r5
            int r6 = r5.f3763e
            int r5 = r5.f3764f
            int r5 = r5 + r6
            android.view.View r7 = super.mo4401J0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo4445R1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f3782x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo4833J()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo4833J()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f3777s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo4466q2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m5377Y2(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.m5377Y2(r1, r2, r10)
            android.view.View r1 = r0.mo4832I(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C1314b) r9
            int r2 = r9.f3763e
            r18 = r3
            int r3 = r9.f3764f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo4903y0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f3763e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f3763e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4401J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    /* renamed from: L1 */
    public boolean mo4402L1() {
        return this.f3772D == null && !this.f3754I;
    }

    /* renamed from: N */
    public int mo4403N(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        if (this.f3777s == 1) {
            return this.f3755J;
        }
        if (a0Var.mo4682b() < 1) {
            return 0;
        }
        return m5377Y2(vVar, a0Var, a0Var.mo4682b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public void mo4404N1(RecyclerView.C1322a0 a0Var, LinearLayoutManager.C1318c cVar, RecyclerView.C1342o.C1345c cVar2) {
        int i = this.f3755J;
        for (int i2 = 0; i2 < this.f3755J && cVar.mo4481c(a0Var) && i > 0; i2++) {
            int i3 = cVar.f3797d;
            cVar2.mo4912a(i3, Math.max(0, cVar.f3800g));
            i -= this.f3760O.mo4428f(i3);
            cVar.f3797d += cVar.f3798e;
        }
    }

    /* renamed from: P0 */
    public void mo4405P0(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, View view, C1955c cVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1314b)) {
            super.mo4841O0(view, cVar);
            return;
        }
        C1314b bVar = (C1314b) layoutParams;
        int Y2 = m5377Y2(vVar, a0Var, bVar.mo4913a());
        if (this.f3777s == 0) {
            i4 = bVar.mo4429e();
            i3 = bVar.mo4430f();
            i = 1;
            z2 = false;
            z = false;
            i2 = Y2;
        } else {
            i3 = 1;
            i2 = bVar.mo4429e();
            i = bVar.mo4430f();
            z2 = false;
            z = false;
            i4 = Y2;
        }
        cVar.mo6584d0(C1955c.C1958c.m8277b(i4, i3, i2, i, z2, z));
    }

    /* renamed from: R0 */
    public void mo4406R0(RecyclerView recyclerView, int i, int i2) {
        this.f3760O.mo4435h();
        this.f3760O.mo4434g();
    }

    /* renamed from: S0 */
    public void mo4407S0(RecyclerView recyclerView) {
        this.f3760O.mo4435h();
        this.f3760O.mo4434g();
    }

    /* renamed from: T0 */
    public void mo4408T0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3760O.mo4435h();
        this.f3760O.mo4434g();
    }

    /* renamed from: U0 */
    public void mo4409U0(RecyclerView recyclerView, int i, int i2) {
        this.f3760O.mo4435h();
        this.f3760O.mo4434g();
    }

    /* renamed from: W0 */
    public void mo4410W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3760O.mo4435h();
        this.f3760O.mo4434g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W2 */
    public int mo4411W2(int i, int i2) {
        if (this.f3777s != 1 || !mo4466q2()) {
            int[] iArr = this.f3756K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3756K;
        int i3 = this.f3755J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: X0 */
    public void mo4412X0(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        if (a0Var.mo4685e()) {
            m5369O2();
        }
        super.mo4412X0(vVar, a0Var);
        m5372R2();
    }

    /* renamed from: X2 */
    public int mo4413X2() {
        return this.f3755J;
    }

    /* renamed from: Y0 */
    public void mo4414Y0(RecyclerView.C1322a0 a0Var) {
        super.mo4414Y0(a0Var);
        this.f3754I = false;
    }

    /* renamed from: e3 */
    public void mo4415e3(int i) {
        if (i != this.f3755J) {
            this.f3754I = true;
            if (i >= 1) {
                this.f3755J = i;
                this.f3760O.mo4435h();
                mo4896t1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public View mo4416h2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, int i, int i2, int i3) {
        mo4447T1();
        int m = this.f3779u.mo5197m();
        int i4 = this.f3779u.mo5193i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View I = mo4832I(i);
            int h0 = mo4873h0(I);
            if (h0 >= 0 && h0 < i3 && m5378Z2(vVar, a0Var, h0) == 0) {
                if (((RecyclerView.C1347p) I.getLayoutParams()).mo4915c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.f3779u.mo5191g(I) < i4 && this.f3779u.mo5188d(I) >= m) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    /* renamed from: k0 */
    public int mo4417k0(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        if (this.f3777s == 0) {
            return this.f3755J;
        }
        if (a0Var.mo4682b() < 1) {
            return 0;
        }
        return m5377Y2(vVar, a0Var, a0Var.mo4682b() - 1) + 1;
    }

    /* renamed from: m */
    public boolean mo4418m(RecyclerView.C1347p pVar) {
        return pVar instanceof C1314b;
    }

    /* renamed from: r */
    public int mo4419r(RecyclerView.C1322a0 a0Var) {
        return this.f3762Q ? m5373S2(a0Var) : super.mo4419r(a0Var);
    }

    /* renamed from: s */
    public int mo4420s(RecyclerView.C1322a0 a0Var) {
        return this.f3762Q ? m5374T2(a0Var) : super.mo4420s(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0219  */
    /* renamed from: s2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4421s2(androidx.recyclerview.widget.RecyclerView.C1354v r18, androidx.recyclerview.widget.RecyclerView.C1322a0 r19, androidx.recyclerview.widget.LinearLayoutManager.C1318c r20, androidx.recyclerview.widget.LinearLayoutManager.C1317b r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.j r3 = r6.f3779u
            int r3 = r3.mo5196l()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r17.mo4833J()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.f3756K
            int r11 = r6.f3755J
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r17.m5383f3()
        L_0x002c:
            int r11 = r2.f3798e
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.f3755J
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f3797d
            int r12 = r6.m5378Z2(r0, r1, r12)
            int r13 = r2.f3797d
            int r13 = r6.m5379a3(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.f3755J
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.mo4481c(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.f3797d
            int r15 = r6.m5379a3(r0, r1, r14)
            int r4 = r6.f3755J
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.mo4482d(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.f3757L
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f3755J
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.f3791b = r8
            return
        L_0x00a2:
            r4 = 0
            r6.m5368N2(r0, r1, r13, r11)
            r0 = 0
            r1 = 0
        L_0x00a8:
            if (r0 >= r13) goto L_0x00f4
            android.view.View[] r12 = r6.f3757L
            r12 = r12[r0]
            java.util.List<androidx.recyclerview.widget.RecyclerView$d0> r14 = r2.f3805l
            if (r14 != 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00b8
            r6.mo4863d(r12)
            goto L_0x00c5
        L_0x00b8:
            r6.mo4865e(r12, r5)
            goto L_0x00c5
        L_0x00bc:
            if (r11 == 0) goto L_0x00c2
            r6.mo4858b(r12)
            goto L_0x00c5
        L_0x00c2:
            r6.mo4861c(r12, r5)
        L_0x00c5:
            android.graphics.Rect r14 = r6.f3761P
            r6.mo4877j(r12, r14)
            r6.m5381c3(r12, r3, r5)
            androidx.recyclerview.widget.j r14 = r6.f3779u
            int r14 = r14.mo5189e(r12)
            if (r14 <= r1) goto L_0x00d6
            r1 = r14
        L_0x00d6:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r14 = (androidx.recyclerview.widget.GridLayoutManager.C1314b) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.j r5 = r6.f3779u
            int r5 = r5.mo5190f(r12)
            float r5 = (float) r5
            float r5 = r5 * r15
            int r12 = r14.f3764f
            float r12 = (float) r12
            float r5 = r5 / r12
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00f0
            r4 = r5
        L_0x00f0:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x00a8
        L_0x00f4:
            if (r9 == 0) goto L_0x0112
            r6.m5380b3(r4, r10)
            r0 = 0
            r1 = 0
        L_0x00fb:
            if (r0 >= r13) goto L_0x0112
            android.view.View[] r3 = r6.f3757L
            r3 = r3[r0]
            r4 = 1073741824(0x40000000, float:2.0)
            r6.m5381c3(r3, r4, r8)
            androidx.recyclerview.widget.j r4 = r6.f3779u
            int r3 = r4.mo5189e(r3)
            if (r3 <= r1) goto L_0x010f
            r1 = r3
        L_0x010f:
            int r0 = r0 + 1
            goto L_0x00fb
        L_0x0112:
            r0 = 0
        L_0x0113:
            if (r0 >= r13) goto L_0x0175
            android.view.View[] r3 = r6.f3757L
            r3 = r3[r0]
            androidx.recyclerview.widget.j r4 = r6.f3779u
            int r4 = r4.mo5189e(r3)
            if (r4 == r1) goto L_0x016f
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r4 = (androidx.recyclerview.widget.GridLayoutManager.C1314b) r4
            android.graphics.Rect r5 = r4.f3896b
            int r9 = r5.top
            int r10 = r5.bottom
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            int r10 = r5.left
            int r5 = r5.right
            int r10 = r10 + r5
            int r5 = r4.leftMargin
            int r10 = r10 + r5
            int r5 = r4.rightMargin
            int r10 = r10 + r5
            int r5 = r4.f3763e
            int r11 = r4.f3764f
            int r5 = r6.mo4411W2(r5, r11)
            int r11 = r6.f3777s
            if (r11 != r8) goto L_0x015b
            int r4 = r4.width
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r4 = androidx.recyclerview.widget.RecyclerView.C1342o.m5658K(r5, r11, r10, r4, r12)
            int r5 = r1 - r9
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x016b
        L_0x015b:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r10 = r1 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r4 = r4.height
            int r5 = androidx.recyclerview.widget.RecyclerView.C1342o.m5658K(r5, r11, r9, r4, r12)
            r4 = r10
        L_0x016b:
            r6.m5382d3(r3, r4, r5, r8)
            goto L_0x0172
        L_0x016f:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
        L_0x0172:
            int r0 = r0 + 1
            goto L_0x0113
        L_0x0175:
            r12 = 0
            r7.f3790a = r1
            int r0 = r6.f3777s
            r3 = -1
            if (r0 != r8) goto L_0x018f
            int r0 = r2.f3799f
            if (r0 != r3) goto L_0x0187
            int r0 = r2.f3795b
            int r1 = r0 - r1
            r2 = r1
            goto L_0x018c
        L_0x0187:
            int r0 = r2.f3795b
            int r1 = r1 + r0
            r2 = r0
            r0 = r1
        L_0x018c:
            r1 = 0
            r3 = 0
            goto L_0x01a2
        L_0x018f:
            int r0 = r2.f3799f
            if (r0 != r3) goto L_0x019c
            int r0 = r2.f3795b
            int r1 = r0 - r1
            r3 = r1
            r2 = 0
            r1 = r0
            r0 = 0
            goto L_0x01a2
        L_0x019c:
            int r0 = r2.f3795b
            int r1 = r1 + r0
            r3 = r0
            r0 = 0
            r2 = 0
        L_0x01a2:
            if (r12 >= r13) goto L_0x022d
            android.view.View[] r4 = r6.f3757L
            r9 = r4[r12]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.C1314b) r10
            int r4 = r6.f3777s
            if (r4 != r8) goto L_0x01eb
            boolean r1 = r17.mo4466q2()
            if (r1 == 0) goto L_0x01d3
            int r1 = r17.mo4866e0()
            int[] r3 = r6.f3756K
            int r4 = r6.f3755J
            int r5 = r10.f3763e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.j r3 = r6.f3779u
            int r3 = r3.mo5190f(r9)
            int r3 = r1 - r3
            r11 = r0
            r14 = r1
            r15 = r2
            goto L_0x0200
        L_0x01d3:
            int r1 = r17.mo4866e0()
            int[] r3 = r6.f3756K
            int r4 = r10.f3763e
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.j r3 = r6.f3779u
            int r3 = r3.mo5190f(r9)
            int r3 = r3 + r1
            r11 = r0
            r16 = r1
            r15 = r2
            r14 = r3
            goto L_0x0202
        L_0x01eb:
            int r0 = r17.mo4870g0()
            int[] r2 = r6.f3756K
            int r4 = r10.f3763e
            r2 = r2[r4]
            int r0 = r0 + r2
            androidx.recyclerview.widget.j r2 = r6.f3779u
            int r2 = r2.mo5190f(r9)
            int r2 = r2 + r0
            r15 = r0
            r14 = r1
            r11 = r2
        L_0x0200:
            r16 = r3
        L_0x0202:
            r0 = r17
            r1 = r9
            r2 = r16
            r3 = r15
            r4 = r14
            r5 = r11
            r0.mo4905z0(r1, r2, r3, r4, r5)
            boolean r0 = r10.mo4915c()
            if (r0 != 0) goto L_0x0219
            boolean r0 = r10.mo4914b()
            if (r0 == 0) goto L_0x021b
        L_0x0219:
            r7.f3792c = r8
        L_0x021b:
            boolean r0 = r7.f3793d
            boolean r1 = r9.hasFocusable()
            r0 = r0 | r1
            r7.f3793d = r0
            int r12 = r12 + 1
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x01a2
        L_0x022d:
            android.view.View[] r0 = r6.f3757L
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4421s2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: u */
    public int mo4422u(RecyclerView.C1322a0 a0Var) {
        return this.f3762Q ? m5373S2(a0Var) : super.mo4422u(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u2 */
    public void mo4423u2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, LinearLayoutManager.C1316a aVar, int i) {
        super.mo4423u2(vVar, a0Var, aVar, i);
        m5383f3();
        if (a0Var.mo4682b() > 0 && !a0Var.mo4685e()) {
            m5375U2(vVar, a0Var, aVar, i);
        }
        m5376V2();
    }

    /* renamed from: v */
    public int mo4424v(RecyclerView.C1322a0 a0Var) {
        return this.f3762Q ? m5374T2(a0Var) : super.mo4424v(a0Var);
    }

    /* renamed from: w1 */
    public int mo4425w1(int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        m5383f3();
        m5376V2();
        return super.mo4425w1(i, vVar, a0Var);
    }

    /* renamed from: y1 */
    public int mo4426y1(int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        m5383f3();
        m5376V2();
        return super.mo4426y1(i, vVar, a0Var);
    }
}
