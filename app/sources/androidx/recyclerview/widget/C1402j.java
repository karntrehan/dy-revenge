package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
public abstract class C1402j {

    /* renamed from: a */
    protected final RecyclerView.C1342o f4126a;

    /* renamed from: b */
    private int f4127b;

    /* renamed from: c */
    final Rect f4128c;

    /* renamed from: androidx.recyclerview.widget.j$a */
    static class C1403a extends C1402j {
        C1403a(RecyclerView.C1342o oVar) {
            super(oVar, (C1403a) null);
        }

        /* renamed from: d */
        public int mo5188d(View view) {
            return this.f4126a.mo4847T(view) + ((RecyclerView.C1347p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo5189e(View view) {
            RecyclerView.C1347p pVar = (RecyclerView.C1347p) view.getLayoutParams();
            return this.f4126a.mo4846S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: f */
        public int mo5190f(View view) {
            RecyclerView.C1347p pVar = (RecyclerView.C1347p) view.getLayoutParams();
            return this.f4126a.mo4845R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: g */
        public int mo5191g(View view) {
            return this.f4126a.mo4843Q(view) - ((RecyclerView.C1347p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo5192h() {
            return this.f4126a.mo4887o0();
        }

        /* renamed from: i */
        public int mo5193i() {
            return this.f4126a.mo4887o0() - this.f4126a.mo4868f0();
        }

        /* renamed from: j */
        public int mo5194j() {
            return this.f4126a.mo4868f0();
        }

        /* renamed from: k */
        public int mo5195k() {
            return this.f4126a.mo4889p0();
        }

        /* renamed from: l */
        public int mo5196l() {
            return this.f4126a.mo4852X();
        }

        /* renamed from: m */
        public int mo5197m() {
            return this.f4126a.mo4866e0();
        }

        /* renamed from: n */
        public int mo5198n() {
            return (this.f4126a.mo4887o0() - this.f4126a.mo4866e0()) - this.f4126a.mo4868f0();
        }

        /* renamed from: p */
        public int mo5200p(View view) {
            this.f4126a.mo4885n0(view, true, this.f4128c);
            return this.f4128c.right;
        }

        /* renamed from: q */
        public int mo5201q(View view) {
            this.f4126a.mo4885n0(view, true, this.f4128c);
            return this.f4128c.left;
        }

        /* renamed from: r */
        public void mo5202r(int i) {
            this.f4126a.mo4820C0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    static class C1404b extends C1402j {
        C1404b(RecyclerView.C1342o oVar) {
            super(oVar, (C1403a) null);
        }

        /* renamed from: d */
        public int mo5188d(View view) {
            return this.f4126a.mo4840O(view) + ((RecyclerView.C1347p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo5189e(View view) {
            RecyclerView.C1347p pVar = (RecyclerView.C1347p) view.getLayoutParams();
            return this.f4126a.mo4845R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: f */
        public int mo5190f(View view) {
            RecyclerView.C1347p pVar = (RecyclerView.C1347p) view.getLayoutParams();
            return this.f4126a.mo4846S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: g */
        public int mo5191g(View view) {
            return this.f4126a.mo4848U(view) - ((RecyclerView.C1347p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo5192h() {
            return this.f4126a.mo4851W();
        }

        /* renamed from: i */
        public int mo5193i() {
            return this.f4126a.mo4851W() - this.f4126a.mo4864d0();
        }

        /* renamed from: j */
        public int mo5194j() {
            return this.f4126a.mo4864d0();
        }

        /* renamed from: k */
        public int mo5195k() {
            return this.f4126a.mo4852X();
        }

        /* renamed from: l */
        public int mo5196l() {
            return this.f4126a.mo4889p0();
        }

        /* renamed from: m */
        public int mo5197m() {
            return this.f4126a.mo4870g0();
        }

        /* renamed from: n */
        public int mo5198n() {
            return (this.f4126a.mo4851W() - this.f4126a.mo4870g0()) - this.f4126a.mo4864d0();
        }

        /* renamed from: p */
        public int mo5200p(View view) {
            this.f4126a.mo4885n0(view, true, this.f4128c);
            return this.f4128c.bottom;
        }

        /* renamed from: q */
        public int mo5201q(View view) {
            this.f4126a.mo4885n0(view, true, this.f4128c);
            return this.f4128c.top;
        }

        /* renamed from: r */
        public void mo5202r(int i) {
            this.f4126a.mo4821D0(i);
        }
    }

    private C1402j(RecyclerView.C1342o oVar) {
        this.f4127b = RecyclerView.UNDEFINED_DURATION;
        this.f4128c = new Rect();
        this.f4126a = oVar;
    }

    /* synthetic */ C1402j(RecyclerView.C1342o oVar, C1403a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static C1402j m6216a(RecyclerView.C1342o oVar) {
        return new C1403a(oVar);
    }

    /* renamed from: b */
    public static C1402j m6217b(RecyclerView.C1342o oVar, int i) {
        if (i == 0) {
            return m6216a(oVar);
        }
        if (i == 1) {
            return m6218c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C1402j m6218c(RecyclerView.C1342o oVar) {
        return new C1404b(oVar);
    }

    /* renamed from: d */
    public abstract int mo5188d(View view);

    /* renamed from: e */
    public abstract int mo5189e(View view);

    /* renamed from: f */
    public abstract int mo5190f(View view);

    /* renamed from: g */
    public abstract int mo5191g(View view);

    /* renamed from: h */
    public abstract int mo5192h();

    /* renamed from: i */
    public abstract int mo5193i();

    /* renamed from: j */
    public abstract int mo5194j();

    /* renamed from: k */
    public abstract int mo5195k();

    /* renamed from: l */
    public abstract int mo5196l();

    /* renamed from: m */
    public abstract int mo5197m();

    /* renamed from: n */
    public abstract int mo5198n();

    /* renamed from: o */
    public int mo5199o() {
        if (Integer.MIN_VALUE == this.f4127b) {
            return 0;
        }
        return mo5198n() - this.f4127b;
    }

    /* renamed from: p */
    public abstract int mo5200p(View view);

    /* renamed from: q */
    public abstract int mo5201q(View view);

    /* renamed from: r */
    public abstract void mo5202r(int i);

    /* renamed from: s */
    public void mo5203s() {
        this.f4127b = mo5198n();
    }
}
