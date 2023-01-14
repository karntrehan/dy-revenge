package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C1342o implements RecyclerView.C1359z.C1361b {

    /* renamed from: A */
    int f3769A = -1;

    /* renamed from: B */
    int f3770B = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: C */
    private boolean f3771C;

    /* renamed from: D */
    C1319d f3772D = null;

    /* renamed from: E */
    final C1316a f3773E = new C1316a();

    /* renamed from: F */
    private final C1317b f3774F = new C1317b();

    /* renamed from: G */
    private int f3775G = 2;

    /* renamed from: H */
    private int[] f3776H = new int[2];

    /* renamed from: s */
    int f3777s = 1;

    /* renamed from: t */
    private C1318c f3778t;

    /* renamed from: u */
    C1402j f3779u;

    /* renamed from: v */
    private boolean f3780v;

    /* renamed from: w */
    private boolean f3781w = false;

    /* renamed from: x */
    boolean f3782x = false;

    /* renamed from: y */
    private boolean f3783y = false;

    /* renamed from: z */
    private boolean f3784z = true;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C1316a {

        /* renamed from: a */
        C1402j f3785a;

        /* renamed from: b */
        int f3786b;

        /* renamed from: c */
        int f3787c;

        /* renamed from: d */
        boolean f3788d;

        /* renamed from: e */
        boolean f3789e;

        C1316a() {
            mo4476e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4472a() {
            this.f3787c = this.f3788d ? this.f3785a.mo5193i() : this.f3785a.mo5197m();
        }

        /* renamed from: b */
        public void mo4473b(View view, int i) {
            this.f3787c = this.f3788d ? this.f3785a.mo5188d(view) + this.f3785a.mo5199o() : this.f3785a.mo5191g(view);
            this.f3786b = i;
        }

        /* renamed from: c */
        public void mo4474c(View view, int i) {
            int o = this.f3785a.mo5199o();
            if (o >= 0) {
                mo4473b(view, i);
                return;
            }
            this.f3786b = i;
            if (this.f3788d) {
                int i2 = (this.f3785a.mo5193i() - o) - this.f3785a.mo5188d(view);
                this.f3787c = this.f3785a.mo5193i() - i2;
                if (i2 > 0) {
                    int e = this.f3787c - this.f3785a.mo5189e(view);
                    int m = this.f3785a.mo5197m();
                    int min = e - (m + Math.min(this.f3785a.mo5191g(view) - m, 0));
                    if (min < 0) {
                        this.f3787c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f3785a.mo5191g(view);
            int m2 = g - this.f3785a.mo5197m();
            this.f3787c = g;
            if (m2 > 0) {
                int i3 = (this.f3785a.mo5193i() - Math.min(0, (this.f3785a.mo5193i() - o) - this.f3785a.mo5188d(view))) - (g + this.f3785a.mo5189e(view));
                if (i3 < 0) {
                    this.f3787c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4475d(View view, RecyclerView.C1322a0 a0Var) {
            RecyclerView.C1347p pVar = (RecyclerView.C1347p) view.getLayoutParams();
            return !pVar.mo4915c() && pVar.mo4913a() >= 0 && pVar.mo4913a() < a0Var.mo4682b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4476e() {
            this.f3786b = -1;
            this.f3787c = RecyclerView.UNDEFINED_DURATION;
            this.f3788d = false;
            this.f3789e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3786b + ", mCoordinate=" + this.f3787c + ", mLayoutFromEnd=" + this.f3788d + ", mValid=" + this.f3789e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C1317b {

        /* renamed from: a */
        public int f3790a;

        /* renamed from: b */
        public boolean f3791b;

        /* renamed from: c */
        public boolean f3792c;

        /* renamed from: d */
        public boolean f3793d;

        protected C1317b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4478a() {
            this.f3790a = 0;
            this.f3791b = false;
            this.f3792c = false;
            this.f3793d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C1318c {

        /* renamed from: a */
        boolean f3794a = true;

        /* renamed from: b */
        int f3795b;

        /* renamed from: c */
        int f3796c;

        /* renamed from: d */
        int f3797d;

        /* renamed from: e */
        int f3798e;

        /* renamed from: f */
        int f3799f;

        /* renamed from: g */
        int f3800g;

        /* renamed from: h */
        int f3801h = 0;

        /* renamed from: i */
        int f3802i = 0;

        /* renamed from: j */
        boolean f3803j = false;

        /* renamed from: k */
        int f3804k;

        /* renamed from: l */
        List<RecyclerView.C1328d0> f3805l = null;

        /* renamed from: m */
        boolean f3806m;

        C1318c() {
        }

        /* renamed from: e */
        private View m5514e() {
            int size = this.f3805l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3805l.get(i).f3838b;
                RecyclerView.C1347p pVar = (RecyclerView.C1347p) view.getLayoutParams();
                if (!pVar.mo4915c() && this.f3797d == pVar.mo4913a()) {
                    mo4480b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo4479a() {
            mo4480b((View) null);
        }

        /* renamed from: b */
        public void mo4480b(View view) {
            View f = mo4483f(view);
            this.f3797d = f == null ? -1 : ((RecyclerView.C1347p) f.getLayoutParams()).mo4913a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4481c(RecyclerView.C1322a0 a0Var) {
            int i = this.f3797d;
            return i >= 0 && i < a0Var.mo4682b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo4482d(RecyclerView.C1354v vVar) {
            if (this.f3805l != null) {
                return m5514e();
            }
            View o = vVar.mo4961o(this.f3797d);
            this.f3797d += this.f3798e;
            return o;
        }

        /* renamed from: f */
        public View mo4483f(View view) {
            int a;
            int size = this.f3805l.size();
            View view2 = null;
            int i = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f3805l.get(i2).f3838b;
                RecyclerView.C1347p pVar = (RecyclerView.C1347p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo4915c() && (a = (pVar.mo4913a() - this.f3797d) * this.f3798e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C1319d implements Parcelable {
        public static final Parcelable.Creator<C1319d> CREATOR = new C1320a();

        /* renamed from: f */
        int f3807f;

        /* renamed from: o */
        int f3808o;

        /* renamed from: p */
        boolean f3809p;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        static class C1320a implements Parcelable.Creator<C1319d> {
            C1320a() {
            }

            /* renamed from: a */
            public C1319d createFromParcel(Parcel parcel) {
                return new C1319d(parcel);
            }

            /* renamed from: b */
            public C1319d[] newArray(int i) {
                return new C1319d[i];
            }
        }

        public C1319d() {
        }

        C1319d(Parcel parcel) {
            this.f3807f = parcel.readInt();
            this.f3808o = parcel.readInt();
            this.f3809p = parcel.readInt() != 1 ? false : true;
        }

        public C1319d(C1319d dVar) {
            this.f3807f = dVar.f3807f;
            this.f3808o = dVar.f3808o;
            this.f3809p = dVar.f3809p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4484a() {
            return this.f3807f >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4485b() {
            this.f3807f = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3807f);
            parcel.writeInt(this.f3808o);
            parcel.writeInt(this.f3809p ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        mo4438C2(i);
        mo4439D2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C1342o.C1346d i0 = RecyclerView.C1342o.m5661i0(context, attributeSet, i, i2);
        mo4438C2(i0.f3891a);
        mo4439D2(i0.f3893c);
        mo4399E2(i0.f3894d);
    }

    /* renamed from: A2 */
    private void m5427A2() {
        this.f3782x = (this.f3777s == 1 || !mo4466q2()) ? this.f3781w : !this.f3781w;
    }

    /* renamed from: F2 */
    private boolean m5428F2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, C1316a aVar) {
        boolean z = false;
        if (mo4833J() == 0) {
            return false;
        }
        View V = mo4849V();
        if (V != null && aVar.mo4475d(V, a0Var)) {
            aVar.mo4474c(V, mo4873h0(V));
            return true;
        } else if (this.f3780v != this.f3783y) {
            return false;
        } else {
            View i2 = aVar.f3788d ? m5445i2(vVar, a0Var) : m5446j2(vVar, a0Var);
            if (i2 == null) {
                return false;
            }
            aVar.mo4473b(i2, mo4873h0(i2));
            if (!a0Var.mo4685e() && mo4402L1()) {
                if (this.f3779u.mo5191g(i2) >= this.f3779u.mo5193i() || this.f3779u.mo5188d(i2) < this.f3779u.mo5197m()) {
                    z = true;
                }
                if (z) {
                    aVar.f3787c = aVar.f3788d ? this.f3779u.mo5193i() : this.f3779u.mo5197m();
                }
            }
            return true;
        }
    }

    /* renamed from: G2 */
    private boolean m5429G2(RecyclerView.C1322a0 a0Var, C1316a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.mo4685e() && (i = this.f3769A) != -1) {
            if (i < 0 || i >= a0Var.mo4682b()) {
                this.f3769A = -1;
                this.f3770B = RecyclerView.UNDEFINED_DURATION;
            } else {
                aVar.f3786b = this.f3769A;
                C1319d dVar = this.f3772D;
                if (dVar != null && dVar.mo4484a()) {
                    boolean z2 = this.f3772D.f3809p;
                    aVar.f3788d = z2;
                    aVar.f3787c = z2 ? this.f3779u.mo5193i() - this.f3772D.f3808o : this.f3779u.mo5197m() + this.f3772D.f3808o;
                    return true;
                } else if (this.f3770B == Integer.MIN_VALUE) {
                    View C = mo4437C(this.f3769A);
                    if (C == null) {
                        if (mo4833J() > 0) {
                            if ((this.f3769A < mo4873h0(mo4832I(0))) == this.f3782x) {
                                z = true;
                            }
                            aVar.f3788d = z;
                        }
                        aVar.mo4472a();
                    } else if (this.f3779u.mo5189e(C) > this.f3779u.mo5198n()) {
                        aVar.mo4472a();
                        return true;
                    } else if (this.f3779u.mo5191g(C) - this.f3779u.mo5197m() < 0) {
                        aVar.f3787c = this.f3779u.mo5197m();
                        aVar.f3788d = false;
                        return true;
                    } else if (this.f3779u.mo5193i() - this.f3779u.mo5188d(C) < 0) {
                        aVar.f3787c = this.f3779u.mo5193i();
                        aVar.f3788d = true;
                        return true;
                    } else {
                        aVar.f3787c = aVar.f3788d ? this.f3779u.mo5188d(C) + this.f3779u.mo5199o() : this.f3779u.mo5191g(C);
                    }
                    return true;
                } else {
                    boolean z3 = this.f3782x;
                    aVar.f3788d = z3;
                    aVar.f3787c = z3 ? this.f3779u.mo5193i() - this.f3770B : this.f3779u.mo5197m() + this.f3770B;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: H2 */
    private void m5430H2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, C1316a aVar) {
        if (!m5429G2(a0Var, aVar) && !m5428F2(vVar, a0Var, aVar)) {
            aVar.mo4472a();
            aVar.f3786b = this.f3783y ? a0Var.mo4682b() - 1 : 0;
        }
    }

    /* renamed from: I2 */
    private void m5431I2(int i, int i2, boolean z, RecyclerView.C1322a0 a0Var) {
        int i3;
        this.f3778t.f3806m = mo4471z2();
        this.f3778t.f3799f = i;
        int[] iArr = this.f3776H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo4444M1(a0Var, iArr);
        int max = Math.max(0, this.f3776H[0]);
        int max2 = Math.max(0, this.f3776H[1]);
        if (i == 1) {
            z2 = true;
        }
        C1318c cVar = this.f3778t;
        int i5 = z2 ? max2 : max;
        cVar.f3801h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f3802i = max;
        if (z2) {
            cVar.f3801h = i5 + this.f3779u.mo5194j();
            View m2 = m5449m2();
            C1318c cVar2 = this.f3778t;
            if (this.f3782x) {
                i4 = -1;
            }
            cVar2.f3798e = i4;
            int h0 = mo4873h0(m2);
            C1318c cVar3 = this.f3778t;
            cVar2.f3797d = h0 + cVar3.f3798e;
            cVar3.f3795b = this.f3779u.mo5188d(m2);
            i3 = this.f3779u.mo5188d(m2) - this.f3779u.mo5193i();
        } else {
            View n2 = m5450n2();
            this.f3778t.f3801h += this.f3779u.mo5197m();
            C1318c cVar4 = this.f3778t;
            if (!this.f3782x) {
                i4 = -1;
            }
            cVar4.f3798e = i4;
            int h02 = mo4873h0(n2);
            C1318c cVar5 = this.f3778t;
            cVar4.f3797d = h02 + cVar5.f3798e;
            cVar5.f3795b = this.f3779u.mo5191g(n2);
            i3 = (-this.f3779u.mo5191g(n2)) + this.f3779u.mo5197m();
        }
        C1318c cVar6 = this.f3778t;
        cVar6.f3796c = i2;
        if (z) {
            cVar6.f3796c = i2 - i3;
        }
        cVar6.f3800g = i3;
    }

    /* renamed from: J2 */
    private void m5432J2(int i, int i2) {
        this.f3778t.f3796c = this.f3779u.mo5193i() - i2;
        C1318c cVar = this.f3778t;
        cVar.f3798e = this.f3782x ? -1 : 1;
        cVar.f3797d = i;
        cVar.f3799f = 1;
        cVar.f3795b = i2;
        cVar.f3800g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: K2 */
    private void m5433K2(C1316a aVar) {
        m5432J2(aVar.f3786b, aVar.f3787c);
    }

    /* renamed from: L2 */
    private void m5434L2(int i, int i2) {
        this.f3778t.f3796c = i2 - this.f3779u.mo5197m();
        C1318c cVar = this.f3778t;
        cVar.f3797d = i;
        cVar.f3798e = this.f3782x ? 1 : -1;
        cVar.f3799f = -1;
        cVar.f3795b = i2;
        cVar.f3800g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: M2 */
    private void m5435M2(C1316a aVar) {
        m5434L2(aVar.f3786b, aVar.f3787c);
    }

    /* renamed from: O1 */
    private int m5436O1(RecyclerView.C1322a0 a0Var) {
        if (mo4833J() == 0) {
            return 0;
        }
        mo4447T1();
        C1402j jVar = this.f3779u;
        View Y1 = mo4450Y1(!this.f3784z, true);
        return C1407l.m6279a(a0Var, jVar, Y1, mo4449X1(!this.f3784z, true), this, this.f3784z);
    }

    /* renamed from: P1 */
    private int m5437P1(RecyclerView.C1322a0 a0Var) {
        if (mo4833J() == 0) {
            return 0;
        }
        mo4447T1();
        C1402j jVar = this.f3779u;
        View Y1 = mo4450Y1(!this.f3784z, true);
        return C1407l.m6280b(a0Var, jVar, Y1, mo4449X1(!this.f3784z, true), this, this.f3784z, this.f3782x);
    }

    /* renamed from: Q1 */
    private int m5438Q1(RecyclerView.C1322a0 a0Var) {
        if (mo4833J() == 0) {
            return 0;
        }
        mo4447T1();
        C1402j jVar = this.f3779u;
        View Y1 = mo4450Y1(!this.f3784z, true);
        return C1407l.m6281c(a0Var, jVar, Y1, mo4449X1(!this.f3784z, true), this, this.f3784z);
    }

    /* renamed from: V1 */
    private View m5439V1() {
        return mo4456d2(0, mo4833J());
    }

    /* renamed from: W1 */
    private View m5440W1(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        return mo4416h2(vVar, a0Var, 0, mo4833J(), a0Var.mo4682b());
    }

    /* renamed from: a2 */
    private View m5441a2() {
        return mo4456d2(mo4833J() - 1, -1);
    }

    /* renamed from: b2 */
    private View m5442b2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        return mo4416h2(vVar, a0Var, mo4833J() - 1, -1, a0Var.mo4682b());
    }

    /* renamed from: f2 */
    private View m5443f2() {
        return this.f3782x ? m5439V1() : m5441a2();
    }

    /* renamed from: g2 */
    private View m5444g2() {
        return this.f3782x ? m5441a2() : m5439V1();
    }

    /* renamed from: i2 */
    private View m5445i2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        return this.f3782x ? m5440W1(vVar, a0Var) : m5442b2(vVar, a0Var);
    }

    /* renamed from: j2 */
    private View m5446j2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        return this.f3782x ? m5442b2(vVar, a0Var) : m5440W1(vVar, a0Var);
    }

    /* renamed from: k2 */
    private int m5447k2(int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, boolean z) {
        int i2;
        int i3 = this.f3779u.mo5193i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo4436B2(-i3, vVar, a0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.f3779u.mo5193i() - i5) <= 0) {
            return i4;
        }
        this.f3779u.mo5202r(i2);
        return i2 + i4;
    }

    /* renamed from: l2 */
    private int m5448l2(int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, boolean z) {
        int m;
        int m2 = i - this.f3779u.mo5197m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -mo4436B2(m2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (m = i3 - this.f3779u.mo5197m()) <= 0) {
            return i2;
        }
        this.f3779u.mo5202r(-m);
        return i2 - m;
    }

    /* renamed from: m2 */
    private View m5449m2() {
        return mo4832I(this.f3782x ? 0 : mo4833J() - 1);
    }

    /* renamed from: n2 */
    private View m5450n2() {
        return mo4832I(this.f3782x ? mo4833J() - 1 : 0);
    }

    /* renamed from: t2 */
    private void m5451t2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, int i, int i2) {
        RecyclerView.C1354v vVar2 = vVar;
        RecyclerView.C1322a0 a0Var2 = a0Var;
        if (a0Var.mo4687g() && mo4833J() != 0 && !a0Var.mo4685e() && mo4402L1()) {
            List<RecyclerView.C1328d0> k = vVar.mo4957k();
            int size = k.size();
            int h0 = mo4873h0(mo4832I(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C1328d0 d0Var = k.get(i5);
                if (!d0Var.mo4733v()) {
                    char c = 1;
                    if ((d0Var.mo4723m() < h0) != this.f3782x) {
                        c = 65535;
                    }
                    int e = this.f3779u.mo5189e(d0Var.f3838b);
                    if (c == 65535) {
                        i3 += e;
                    } else {
                        i4 += e;
                    }
                }
            }
            this.f3778t.f3805l = k;
            if (i3 > 0) {
                m5434L2(mo4873h0(m5450n2()), i);
                C1318c cVar = this.f3778t;
                cVar.f3801h = i3;
                cVar.f3796c = 0;
                cVar.mo4479a();
                mo4448U1(vVar2, this.f3778t, a0Var2, false);
            }
            if (i4 > 0) {
                m5432J2(mo4873h0(m5449m2()), i2);
                C1318c cVar2 = this.f3778t;
                cVar2.f3801h = i4;
                cVar2.f3796c = 0;
                cVar2.mo4479a();
                mo4448U1(vVar2, this.f3778t, a0Var2, false);
            }
            this.f3778t.f3805l = null;
        }
    }

    /* renamed from: v2 */
    private void m5452v2(RecyclerView.C1354v vVar, C1318c cVar) {
        if (cVar.f3794a && !cVar.f3806m) {
            int i = cVar.f3800g;
            int i2 = cVar.f3802i;
            if (cVar.f3799f == -1) {
                m5454x2(vVar, i, i2);
            } else {
                m5455y2(vVar, i, i2);
            }
        }
    }

    /* renamed from: w2 */
    private void m5453w2(RecyclerView.C1354v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo4886n1(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                mo4886n1(i, vVar);
                i--;
            }
        }
    }

    /* renamed from: x2 */
    private void m5454x2(RecyclerView.C1354v vVar, int i, int i2) {
        int J = mo4833J();
        if (i >= 0) {
            int h = (this.f3779u.mo5192h() - i) + i2;
            if (this.f3782x) {
                for (int i3 = 0; i3 < J; i3++) {
                    View I = mo4832I(i3);
                    if (this.f3779u.mo5191g(I) < h || this.f3779u.mo5201q(I) < h) {
                        m5453w2(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = J - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View I2 = mo4832I(i5);
                if (this.f3779u.mo5191g(I2) < h || this.f3779u.mo5201q(I2) < h) {
                    m5453w2(vVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: y2 */
    private void m5455y2(RecyclerView.C1354v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int J = mo4833J();
            if (this.f3782x) {
                int i4 = J - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View I = mo4832I(i5);
                    if (this.f3779u.mo5188d(I) > i3 || this.f3779u.mo5200p(I) > i3) {
                        m5453w2(vVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < J; i6++) {
                View I2 = mo4832I(i6);
                if (this.f3779u.mo5188d(I2) > i3 || this.f3779u.mo5200p(I2) > i3) {
                    m5453w2(vVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public int mo4436B2(int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        if (mo4833J() == 0 || i == 0) {
            return 0;
        }
        mo4447T1();
        this.f3778t.f3794a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m5431I2(i2, abs, true, a0Var);
        C1318c cVar = this.f3778t;
        int U1 = cVar.f3800g + mo4448U1(vVar, cVar, a0Var, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i = i2 * U1;
        }
        this.f3779u.mo5202r(-i);
        this.f3778t.f3804k = i;
        return i;
    }

    /* renamed from: C */
    public View mo4437C(int i) {
        int J = mo4833J();
        if (J == 0) {
            return null;
        }
        int h0 = i - mo4873h0(mo4832I(0));
        if (h0 >= 0 && h0 < J) {
            View I = mo4832I(h0);
            if (mo4873h0(I) == i) {
                return I;
            }
        }
        return super.mo4437C(i);
    }

    /* renamed from: C2 */
    public void mo4438C2(int i) {
        if (i == 0 || i == 1) {
            mo4458g((String) null);
            if (i != this.f3777s || this.f3779u == null) {
                C1402j b = C1402j.m6217b(this, i);
                this.f3779u = b;
                this.f3773E.f3785a = b;
                this.f3777s = i;
                mo4896t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: D */
    public RecyclerView.C1347p mo4397D() {
        return new RecyclerView.C1347p(-2, -2);
    }

    /* renamed from: D2 */
    public void mo4439D2(boolean z) {
        mo4458g((String) null);
        if (z != this.f3781w) {
            this.f3781w = z;
            mo4896t1();
        }
    }

    /* renamed from: E2 */
    public void mo4399E2(boolean z) {
        mo4458g((String) null);
        if (this.f3783y != z) {
            this.f3783y = z;
            mo4896t1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public boolean mo4440G1() {
        return (mo4852X() == 1073741824 || mo4889p0() == 1073741824 || !mo4891q0()) ? false : true;
    }

    /* renamed from: I0 */
    public void mo4441I0(RecyclerView recyclerView, RecyclerView.C1354v vVar) {
        super.mo4441I0(recyclerView, vVar);
        if (this.f3771C) {
            mo4880k1(vVar);
            vVar.mo4949c();
        }
    }

    /* renamed from: I1 */
    public void mo4442I1(RecyclerView recyclerView, RecyclerView.C1322a0 a0Var, int i) {
        C1398g gVar = new C1398g(recyclerView.getContext());
        gVar.mo4994p(i);
        mo4834J1(gVar);
    }

    /* renamed from: J0 */
    public View mo4401J0(View view, int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        int R1;
        m5427A2();
        if (mo4833J() == 0 || (R1 = mo4445R1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo4447T1();
        m5431I2(R1, (int) (((float) this.f3779u.mo5198n()) * 0.33333334f), false, a0Var);
        C1318c cVar = this.f3778t;
        cVar.f3800g = RecyclerView.UNDEFINED_DURATION;
        cVar.f3794a = false;
        mo4448U1(vVar, cVar, a0Var, true);
        View g2 = R1 == -1 ? m5444g2() : m5443f2();
        View n2 = R1 == -1 ? m5450n2() : m5449m2();
        if (!n2.hasFocusable()) {
            return g2;
        }
        if (g2 == null) {
            return null;
        }
        return n2;
    }

    /* renamed from: K0 */
    public void mo4443K0(AccessibilityEvent accessibilityEvent) {
        super.mo4443K0(accessibilityEvent);
        if (mo4833J() > 0) {
            accessibilityEvent.setFromIndex(mo4451Z1());
            accessibilityEvent.setToIndex(mo4454c2());
        }
    }

    /* renamed from: L1 */
    public boolean mo4402L1() {
        return this.f3772D == null && this.f3780v == this.f3783y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public void mo4444M1(RecyclerView.C1322a0 a0Var, int[] iArr) {
        int i;
        int o2 = mo4462o2(a0Var);
        if (this.f3778t.f3799f == -1) {
            i = 0;
        } else {
            i = o2;
            o2 = 0;
        }
        iArr[0] = o2;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public void mo4404N1(RecyclerView.C1322a0 a0Var, C1318c cVar, RecyclerView.C1342o.C1345c cVar2) {
        int i = cVar.f3797d;
        if (i >= 0 && i < a0Var.mo4682b()) {
            cVar2.mo4912a(i, Math.max(0, cVar.f3800g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R1 */
    public int mo4445R1(int i) {
        if (i == 1) {
            return (this.f3777s != 1 && mo4466q2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3777s != 1 && mo4466q2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && this.f3777s == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.f3777s == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f3777s == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.f3777s == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public C1318c mo4446S1() {
        return new C1318c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public void mo4447T1() {
        if (this.f3778t == null) {
            this.f3778t = mo4446S1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U1 */
    public int mo4448U1(RecyclerView.C1354v vVar, C1318c cVar, RecyclerView.C1322a0 a0Var, boolean z) {
        int i = cVar.f3796c;
        int i2 = cVar.f3800g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f3800g = i2 + i;
            }
            m5452v2(vVar, cVar);
        }
        int i3 = cVar.f3796c + cVar.f3801h;
        C1317b bVar = this.f3774F;
        while (true) {
            if ((!cVar.f3806m && i3 <= 0) || !cVar.mo4481c(a0Var)) {
                break;
            }
            bVar.mo4478a();
            mo4421s2(vVar, a0Var, cVar, bVar);
            if (!bVar.f3791b) {
                cVar.f3795b += bVar.f3790a * cVar.f3799f;
                if (!bVar.f3792c || cVar.f3805l != null || !a0Var.mo4685e()) {
                    int i4 = cVar.f3796c;
                    int i5 = bVar.f3790a;
                    cVar.f3796c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f3800g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f3790a;
                    cVar.f3800g = i7;
                    int i8 = cVar.f3796c;
                    if (i8 < 0) {
                        cVar.f3800g = i7 + i8;
                    }
                    m5452v2(vVar, cVar);
                }
                if (z && bVar.f3793d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f3796c;
    }

    /* renamed from: X0 */
    public void mo4412X0(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View C;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f3772D == null && this.f3769A == -1) && a0Var.mo4682b() == 0) {
            mo4880k1(vVar);
            return;
        }
        C1319d dVar = this.f3772D;
        if (dVar != null && dVar.mo4484a()) {
            this.f3769A = this.f3772D.f3807f;
        }
        mo4447T1();
        this.f3778t.f3794a = false;
        m5427A2();
        View V = mo4849V();
        C1316a aVar = this.f3773E;
        if (!aVar.f3789e || this.f3769A != -1 || this.f3772D != null) {
            aVar.mo4476e();
            C1316a aVar2 = this.f3773E;
            aVar2.f3788d = this.f3782x ^ this.f3783y;
            m5430H2(vVar, a0Var, aVar2);
            this.f3773E.f3789e = true;
        } else if (V != null && (this.f3779u.mo5191g(V) >= this.f3779u.mo5193i() || this.f3779u.mo5188d(V) <= this.f3779u.mo5197m())) {
            this.f3773E.mo4474c(V, mo4873h0(V));
        }
        C1318c cVar = this.f3778t;
        cVar.f3799f = cVar.f3804k >= 0 ? 1 : -1;
        int[] iArr = this.f3776H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4444M1(a0Var, iArr);
        int max = Math.max(0, this.f3776H[0]) + this.f3779u.mo5197m();
        int max2 = Math.max(0, this.f3776H[1]) + this.f3779u.mo5194j();
        if (!(!a0Var.mo4685e() || (i6 = this.f3769A) == -1 || this.f3770B == Integer.MIN_VALUE || (C = mo4437C(i6)) == null)) {
            if (this.f3782x) {
                i7 = this.f3779u.mo5193i() - this.f3779u.mo5188d(C);
                i8 = this.f3770B;
            } else {
                i8 = this.f3779u.mo5191g(C) - this.f3779u.mo5197m();
                i7 = this.f3770B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        C1316a aVar3 = this.f3773E;
        if (!aVar3.f3788d ? !this.f3782x : this.f3782x) {
            i9 = 1;
        }
        mo4423u2(vVar, a0Var, aVar3, i9);
        mo4900w(vVar);
        this.f3778t.f3806m = mo4471z2();
        this.f3778t.f3803j = a0Var.mo4685e();
        this.f3778t.f3802i = 0;
        C1316a aVar4 = this.f3773E;
        if (aVar4.f3788d) {
            m5435M2(aVar4);
            C1318c cVar2 = this.f3778t;
            cVar2.f3801h = max;
            mo4448U1(vVar, cVar2, a0Var, false);
            C1318c cVar3 = this.f3778t;
            i2 = cVar3.f3795b;
            int i11 = cVar3.f3797d;
            int i12 = cVar3.f3796c;
            if (i12 > 0) {
                max2 += i12;
            }
            m5433K2(this.f3773E);
            C1318c cVar4 = this.f3778t;
            cVar4.f3801h = max2;
            cVar4.f3797d += cVar4.f3798e;
            mo4448U1(vVar, cVar4, a0Var, false);
            C1318c cVar5 = this.f3778t;
            i = cVar5.f3795b;
            int i13 = cVar5.f3796c;
            if (i13 > 0) {
                m5434L2(i11, i2);
                C1318c cVar6 = this.f3778t;
                cVar6.f3801h = i13;
                mo4448U1(vVar, cVar6, a0Var, false);
                i2 = this.f3778t.f3795b;
            }
        } else {
            m5433K2(aVar4);
            C1318c cVar7 = this.f3778t;
            cVar7.f3801h = max2;
            mo4448U1(vVar, cVar7, a0Var, false);
            C1318c cVar8 = this.f3778t;
            i = cVar8.f3795b;
            int i14 = cVar8.f3797d;
            int i15 = cVar8.f3796c;
            if (i15 > 0) {
                max += i15;
            }
            m5435M2(this.f3773E);
            C1318c cVar9 = this.f3778t;
            cVar9.f3801h = max;
            cVar9.f3797d += cVar9.f3798e;
            mo4448U1(vVar, cVar9, a0Var, false);
            C1318c cVar10 = this.f3778t;
            i2 = cVar10.f3795b;
            int i16 = cVar10.f3796c;
            if (i16 > 0) {
                m5432J2(i14, i);
                C1318c cVar11 = this.f3778t;
                cVar11.f3801h = i16;
                mo4448U1(vVar, cVar11, a0Var, false);
                i = this.f3778t.f3795b;
            }
        }
        if (mo4833J() > 0) {
            if (this.f3782x ^ this.f3783y) {
                int k2 = m5447k2(i, vVar, a0Var, true);
                i4 = i2 + k2;
                i3 = i + k2;
                i5 = m5448l2(i4, vVar, a0Var, false);
            } else {
                int l2 = m5448l2(i2, vVar, a0Var, true);
                i4 = i2 + l2;
                i3 = i + l2;
                i5 = m5447k2(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m5451t2(vVar, a0Var, i2, i);
        if (!a0Var.mo4685e()) {
            this.f3779u.mo5203s();
        } else {
            this.f3773E.mo4476e();
        }
        this.f3780v = this.f3783y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public View mo4449X1(boolean z, boolean z2) {
        int J;
        int i;
        if (this.f3782x) {
            J = 0;
            i = mo4833J();
        } else {
            J = mo4833J() - 1;
            i = -1;
        }
        return mo4457e2(J, i, z, z2);
    }

    /* renamed from: Y0 */
    public void mo4414Y0(RecyclerView.C1322a0 a0Var) {
        super.mo4414Y0(a0Var);
        this.f3772D = null;
        this.f3769A = -1;
        this.f3770B = RecyclerView.UNDEFINED_DURATION;
        this.f3773E.mo4476e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public View mo4450Y1(boolean z, boolean z2) {
        int i;
        int J;
        if (this.f3782x) {
            i = mo4833J() - 1;
            J = -1;
        } else {
            i = 0;
            J = mo4833J();
        }
        return mo4457e2(i, J, z, z2);
    }

    /* renamed from: Z1 */
    public int mo4451Z1() {
        View e2 = mo4457e2(0, mo4833J(), false, true);
        if (e2 == null) {
            return -1;
        }
        return mo4873h0(e2);
    }

    /* renamed from: a */
    public PointF mo4452a(int i) {
        if (mo4833J() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo4873h0(mo4832I(0))) {
            z = true;
        }
        if (z != this.f3782x) {
            i2 = -1;
        }
        return this.f3777s == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: c1 */
    public void mo4453c1(Parcelable parcelable) {
        if (parcelable instanceof C1319d) {
            this.f3772D = (C1319d) parcelable;
            mo4896t1();
        }
    }

    /* renamed from: c2 */
    public int mo4454c2() {
        View e2 = mo4457e2(mo4833J() - 1, -1, false, true);
        if (e2 == null) {
            return -1;
        }
        return mo4873h0(e2);
    }

    /* renamed from: d1 */
    public Parcelable mo4455d1() {
        if (this.f3772D != null) {
            return new C1319d(this.f3772D);
        }
        C1319d dVar = new C1319d();
        if (mo4833J() > 0) {
            mo4447T1();
            boolean z = this.f3780v ^ this.f3782x;
            dVar.f3809p = z;
            if (z) {
                View m2 = m5449m2();
                dVar.f3808o = this.f3779u.mo5193i() - this.f3779u.mo5188d(m2);
                dVar.f3807f = mo4873h0(m2);
            } else {
                View n2 = m5450n2();
                dVar.f3807f = mo4873h0(n2);
                dVar.f3808o = this.f3779u.mo5191g(n2) - this.f3779u.mo5197m();
            }
        } else {
            dVar.mo4485b();
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public View mo4456d2(int i, int i2) {
        int i3;
        int i4;
        mo4447T1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo4832I(i);
        }
        if (this.f3779u.mo5191g(mo4832I(i)) < this.f3779u.mo5197m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f3777s == 0 ? this.f3875e : this.f3876f).mo5235a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public View mo4457e2(int i, int i2, boolean z, boolean z2) {
        mo4447T1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f3777s == 0 ? this.f3875e : this.f3876f).mo5235a(i, i2, i4, i3);
    }

    /* renamed from: g */
    public void mo4458g(String str) {
        if (this.f3772D == null) {
            super.mo4458g(str);
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
            if (h0 >= 0 && h0 < i3) {
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

    /* renamed from: k */
    public boolean mo4459k() {
        return this.f3777s == 0;
    }

    /* renamed from: l */
    public boolean mo4460l() {
        return this.f3777s == 1;
    }

    /* renamed from: o */
    public void mo4461o(int i, int i2, RecyclerView.C1322a0 a0Var, RecyclerView.C1342o.C1345c cVar) {
        if (this.f3777s != 0) {
            i = i2;
        }
        if (mo4833J() != 0 && i != 0) {
            mo4447T1();
            m5431I2(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo4404N1(a0Var, this.f3778t, cVar);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: o2 */
    public int mo4462o2(RecyclerView.C1322a0 a0Var) {
        if (a0Var.mo4684d()) {
            return this.f3779u.mo5198n();
        }
        return 0;
    }

    /* renamed from: p */
    public void mo4463p(int i, RecyclerView.C1342o.C1345c cVar) {
        boolean z;
        int i2;
        C1319d dVar = this.f3772D;
        int i3 = -1;
        if (dVar == null || !dVar.mo4484a()) {
            m5427A2();
            z = this.f3782x;
            i2 = this.f3769A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C1319d dVar2 = this.f3772D;
            z = dVar2.f3809p;
            i2 = dVar2.f3807f;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f3775G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo4912a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: p2 */
    public int mo4464p2() {
        return this.f3777s;
    }

    /* renamed from: q */
    public int mo4465q(RecyclerView.C1322a0 a0Var) {
        return m5436O1(a0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public boolean mo4466q2() {
        return mo4854Z() == 1;
    }

    /* renamed from: r */
    public int mo4419r(RecyclerView.C1322a0 a0Var) {
        return m5437P1(a0Var);
    }

    /* renamed from: r2 */
    public boolean mo4467r2() {
        return this.f3784z;
    }

    /* renamed from: s */
    public int mo4420s(RecyclerView.C1322a0 a0Var) {
        return m5438Q1(a0Var);
    }

    /* renamed from: s0 */
    public boolean mo4468s0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s2 */
    public void mo4421s2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, C1318c cVar, C1317b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d = cVar.mo4482d(vVar);
        if (d == null) {
            bVar.f3791b = true;
            return;
        }
        RecyclerView.C1347p pVar = (RecyclerView.C1347p) d.getLayoutParams();
        if (cVar.f3805l == null) {
            if (this.f3782x == (cVar.f3799f == -1)) {
                mo4863d(d);
            } else {
                mo4865e(d, 0);
            }
        } else {
            if (this.f3782x == (cVar.f3799f == -1)) {
                mo4858b(d);
            } else {
                mo4861c(d, 0);
            }
        }
        mo4815A0(d, 0, 0);
        bVar.f3790a = this.f3779u.mo5189e(d);
        if (this.f3777s == 1) {
            if (mo4466q2()) {
                i5 = mo4887o0() - mo4868f0();
                i4 = i5 - this.f3779u.mo5190f(d);
            } else {
                i4 = mo4866e0();
                i5 = this.f3779u.mo5190f(d) + i4;
            }
            int i6 = cVar.f3799f;
            int i7 = cVar.f3795b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f3790a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f3790a + i7;
            }
        } else {
            int g0 = mo4870g0();
            int f = this.f3779u.mo5190f(d) + g0;
            int i8 = cVar.f3799f;
            int i9 = cVar.f3795b;
            if (i8 == -1) {
                i2 = i9;
                i3 = g0;
                i = f;
                i4 = i9 - bVar.f3790a;
            } else {
                i3 = g0;
                i2 = bVar.f3790a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo4905z0(d, i4, i3, i2, i);
        if (pVar.mo4915c() || pVar.mo4914b()) {
            bVar.f3792c = true;
        }
        bVar.f3793d = d.hasFocusable();
    }

    /* renamed from: t */
    public int mo4469t(RecyclerView.C1322a0 a0Var) {
        return m5436O1(a0Var);
    }

    /* renamed from: u */
    public int mo4422u(RecyclerView.C1322a0 a0Var) {
        return m5437P1(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u2 */
    public void mo4423u2(RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var, C1316a aVar, int i) {
    }

    /* renamed from: v */
    public int mo4424v(RecyclerView.C1322a0 a0Var) {
        return m5438Q1(a0Var);
    }

    /* renamed from: w1 */
    public int mo4425w1(int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        if (this.f3777s == 1) {
            return 0;
        }
        return mo4436B2(i, vVar, a0Var);
    }

    /* renamed from: x1 */
    public void mo4470x1(int i) {
        this.f3769A = i;
        this.f3770B = RecyclerView.UNDEFINED_DURATION;
        C1319d dVar = this.f3772D;
        if (dVar != null) {
            dVar.mo4485b();
        }
        mo4896t1();
    }

    /* renamed from: y1 */
    public int mo4426y1(int i, RecyclerView.C1354v vVar, RecyclerView.C1322a0 a0Var) {
        if (this.f3777s == 0) {
            return 0;
        }
        return mo4436B2(i, vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z2 */
    public boolean mo4471z2() {
        return this.f3779u.mo5195k() == 0 && this.f3779u.mo5192h() == 0;
    }
}
