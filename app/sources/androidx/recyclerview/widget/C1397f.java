package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
class C1397f {

    /* renamed from: a */
    boolean f4106a = true;

    /* renamed from: b */
    int f4107b;

    /* renamed from: c */
    int f4108c;

    /* renamed from: d */
    int f4109d;

    /* renamed from: e */
    int f4110e;

    /* renamed from: f */
    int f4111f = 0;

    /* renamed from: g */
    int f4112g = 0;

    /* renamed from: h */
    boolean f4113h;

    /* renamed from: i */
    boolean f4114i;

    C1397f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5170a(RecyclerView.C1322a0 a0Var) {
        int i = this.f4108c;
        return i >= 0 && i < a0Var.mo4682b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo5171b(RecyclerView.C1354v vVar) {
        View o = vVar.mo4961o(this.f4108c);
        this.f4108c += this.f4109d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4107b + ", mCurrentPosition=" + this.f4108c + ", mItemDirection=" + this.f4109d + ", mLayoutDirection=" + this.f4110e + ", mStartLine=" + this.f4111f + ", mEndLine=" + this.f4112g + '}';
    }
}
