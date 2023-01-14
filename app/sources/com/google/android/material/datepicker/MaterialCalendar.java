package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.util.C1174e;
import androidx.recyclerview.widget.C1399h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p174e.p319f.p320a.p363d.C9017d;
import p174e.p319f.p320a.p363d.C9019f;
import p174e.p319f.p320a.p363d.C9020g;
import p174e.p319f.p320a.p363d.C9021h;
import p174e.p319f.p320a.p363d.C9022i;

public final class MaterialCalendar<S> extends C4227m<S> {

    /* renamed from: l0 */
    static final Object f11804l0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: m0 */
    static final Object f11805m0 = "NAVIGATION_PREV_TAG";

    /* renamed from: n0 */
    static final Object f11806n0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: o0 */
    static final Object f11807o0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: p0 */
    private int f11808p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public C4214d<S> f11809q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C4208a f11810r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public C4220i f11811s0;

    /* renamed from: t0 */
    private C4200k f11812t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public C4213c f11813u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public RecyclerView f11814v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public RecyclerView f11815w0;

    /* renamed from: x0 */
    private View f11816x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public View f11817y0;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$a */
    class C4190a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f11818f;

        C4190a(int i) {
            this.f11818f = i;
        }

        public void run() {
            MaterialCalendar.this.f11815w0.smoothScrollToPosition(this.f11818f);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$b */
    class C4191b extends C1904a {
        C4191b() {
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            super.mo3776g(view, cVar);
            cVar.mo6582c0((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$c */
    class C4192c extends C4228n {

        /* renamed from: I */
        final /* synthetic */ int f11821I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4192c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f11821I = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M1 */
        public void mo4444M1(RecyclerView.C1322a0 a0Var, int[] iArr) {
            if (this.f11821I == 0) {
                iArr[0] = MaterialCalendar.this.f11815w0.getWidth();
                iArr[1] = MaterialCalendar.this.f11815w0.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f11815w0.getHeight();
            iArr[1] = MaterialCalendar.this.f11815w0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$d */
    class C4193d implements C4201l {
        C4193d() {
        }

        /* renamed from: a */
        public void mo13141a(long j) {
            if (MaterialCalendar.this.f11810r0.mo13161e().mo13176A(j)) {
                MaterialCalendar.this.f11809q0.mo13183K(j);
                Iterator it = MaterialCalendar.this.f11918k0.iterator();
                while (it.hasNext()) {
                    ((C4226l) it.next()).mo13158a(MaterialCalendar.this.f11809q0.mo13182F());
                }
                MaterialCalendar.this.f11815w0.getAdapter().mo4765h();
                if (MaterialCalendar.this.f11814v0 != null) {
                    MaterialCalendar.this.f11814v0.getAdapter().mo4765h();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$e */
    class C4194e extends RecyclerView.C1341n {

        /* renamed from: a */
        private final Calendar f11824a = C4230o.m16161k();

        /* renamed from: b */
        private final Calendar f11825b = C4230o.m16161k();

        C4194e() {
        }

        /* renamed from: g */
        public void mo4811g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1322a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof C4231p) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C4231p pVar = (C4231p) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C1174e next : MaterialCalendar.this.f11809q0.mo13185h()) {
                    F f = next.f3262a;
                    if (!(f == null || next.f3263b == null)) {
                        this.f11824a.setTimeInMillis(((Long) f).longValue());
                        this.f11825b.setTimeInMillis(((Long) next.f3263b).longValue());
                        int w = pVar.mo13240w(this.f11824a.get(1));
                        int w2 = pVar.mo13240w(this.f11825b.get(1));
                        View C = gridLayoutManager.mo4437C(w);
                        View C2 = gridLayoutManager.mo4437C(w2);
                        int X2 = w / gridLayoutManager.mo4413X2();
                        int X22 = w2 / gridLayoutManager.mo4413X2();
                        int i = X2;
                        while (i <= X22) {
                            View C3 = gridLayoutManager.mo4437C(gridLayoutManager.mo4413X2() * i);
                            if (C3 != null) {
                                canvas.drawRect((float) (i == X2 ? C.getLeft() + (C.getWidth() / 2) : 0), (float) (C3.getTop() + MaterialCalendar.this.f11813u0.f11888d.mo13178c()), (float) (i == X22 ? C2.getLeft() + (C2.getWidth() / 2) : recyclerView.getWidth()), (float) (C3.getBottom() - MaterialCalendar.this.f11813u0.f11888d.mo13177b()), MaterialCalendar.this.f11813u0.f11892h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$f */
    class C4195f extends C1904a {
        C4195f() {
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            MaterialCalendar materialCalendar;
            int i;
            super.mo3776g(view, cVar);
            if (MaterialCalendar.this.f11817y0.getVisibility() == 0) {
                materialCalendar = MaterialCalendar.this;
                i = C9022i.mtrl_picker_toggle_to_year_selection;
            } else {
                materialCalendar = MaterialCalendar.this;
                i = C9022i.mtrl_picker_toggle_to_day_selection;
            }
            cVar.mo6599m0(materialCalendar.mo3857L(i));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$g */
    class C4196g extends RecyclerView.C1351t {

        /* renamed from: a */
        final /* synthetic */ C4223k f11828a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f11829b;

        C4196g(C4223k kVar, MaterialButton materialButton) {
            this.f11828a = kVar;
            this.f11829b = materialButton;
        }

        /* renamed from: a */
        public void mo4923a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f11829b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        /* renamed from: b */
        public void mo4924b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager M1 = MaterialCalendar.this.mo13136M1();
            int Z1 = i < 0 ? M1.mo4451Z1() : M1.mo4454c2();
            C4220i unused = MaterialCalendar.this.f11811s0 = this.f11828a.mo13232v(Z1);
            this.f11829b.setText(this.f11828a.mo13233w(Z1));
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$h */
    class C4197h implements View.OnClickListener {
        C4197h() {
        }

        public void onClick(View view) {
            MaterialCalendar.this.mo13139R1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$i */
    class C4198i implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C4223k f11832f;

        C4198i(C4223k kVar) {
            this.f11832f = kVar;
        }

        public void onClick(View view) {
            int Z1 = MaterialCalendar.this.mo13136M1().mo4451Z1() + 1;
            if (Z1 < MaterialCalendar.this.f11815w0.getAdapter().mo4760c()) {
                MaterialCalendar.this.mo13137P1(this.f11832f.mo13232v(Z1));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$j */
    class C4199j implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C4223k f11834f;

        C4199j(C4223k kVar) {
            this.f11834f = kVar;
        }

        public void onClick(View view) {
            int c2 = MaterialCalendar.this.mo13136M1().mo4454c2() - 1;
            if (c2 >= 0) {
                MaterialCalendar.this.mo13137P1(this.f11834f.mo13232v(c2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$k */
    enum C4200k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$l */
    interface C4201l {
        /* renamed from: a */
        void mo13141a(long j);
    }

    /* renamed from: F1 */
    private void m16013F1(View view, C4223k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C9019f.month_navigation_fragment_toggle);
        materialButton.setTag(f11807o0);
        C1988t.m8394m0(materialButton, new C4195f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C9019f.month_navigation_previous);
        materialButton2.setTag(f11805m0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C9019f.month_navigation_next);
        materialButton3.setTag(f11806n0);
        this.f11816x0 = view.findViewById(C9019f.mtrl_calendar_year_selector_frame);
        this.f11817y0 = view.findViewById(C9019f.mtrl_calendar_day_selector_frame);
        mo13138Q1(C4200k.DAY);
        materialButton.setText(this.f11811s0.mo13204R());
        this.f11815w0.addOnScrollListener(new C4196g(kVar, materialButton));
        materialButton.setOnClickListener(new C4197h());
        materialButton3.setOnClickListener(new C4198i(kVar));
        materialButton2.setOnClickListener(new C4199j(kVar));
    }

    /* renamed from: G1 */
    private RecyclerView.C1341n m16014G1() {
        return new C4194e();
    }

    /* renamed from: L1 */
    static int m16015L1(Context context) {
        return context.getResources().getDimensionPixelSize(C9017d.mtrl_calendar_day_height);
    }

    /* renamed from: N1 */
    static <T> MaterialCalendar<T> m16016N1(C4214d<T> dVar, int i, C4208a aVar) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.mo13166j());
        materialCalendar.mo3917n1(bundle);
        return materialCalendar;
    }

    /* renamed from: O1 */
    private void m16017O1(int i) {
        this.f11815w0.post(new C4190a(i));
    }

    /* renamed from: D0 */
    public void mo3818D0(Bundle bundle) {
        super.mo3818D0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f11808p0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f11809q0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11810r0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f11811s0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public C4208a mo13132H1() {
        return this.f11810r0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public C4213c mo13133I1() {
        return this.f11813u0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public C4220i mo13134J1() {
        return this.f11811s0;
    }

    /* renamed from: K1 */
    public C4214d<S> mo13135K1() {
        return this.f11809q0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M1 */
    public LinearLayoutManager mo13136M1() {
        return (LinearLayoutManager) this.f11815w0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public void mo13137P1(C4220i iVar) {
        RecyclerView recyclerView;
        int i;
        C4223k kVar = (C4223k) this.f11815w0.getAdapter();
        int x = kVar.mo13234x(iVar);
        int x2 = x - kVar.mo13234x(this.f11811s0);
        boolean z = true;
        boolean z2 = Math.abs(x2) > 3;
        if (x2 <= 0) {
            z = false;
        }
        this.f11811s0 = iVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.f11815w0;
                i = x + 3;
            }
            m16017O1(x);
        }
        recyclerView = this.f11815w0;
        i = x - 3;
        recyclerView.scrollToPosition(i);
        m16017O1(x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public void mo13138Q1(C4200k kVar) {
        this.f11812t0 = kVar;
        if (kVar == C4200k.YEAR) {
            this.f11814v0.getLayoutManager().mo4470x1(((C4231p) this.f11814v0.getAdapter()).mo13240w(this.f11811s0.f11901q));
            this.f11816x0.setVisibility(0);
            this.f11817y0.setVisibility(8);
        } else if (kVar == C4200k.DAY) {
            this.f11816x0.setVisibility(8);
            this.f11817y0.setVisibility(0);
            mo13137P1(this.f11811s0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R1 */
    public void mo13139R1() {
        C4200k kVar = this.f11812t0;
        C4200k kVar2 = C4200k.YEAR;
        if (kVar == kVar2) {
            mo13138Q1(C4200k.DAY);
        } else if (kVar == C4200k.DAY) {
            mo13138Q1(kVar2);
        }
    }

    /* renamed from: h0 */
    public void mo3825h0(Bundle bundle) {
        super.mo3825h0(bundle);
        if (bundle == null) {
            bundle = mo3925q();
        }
        this.f11808p0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f11809q0 = (C4214d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f11810r0 = (C4208a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f11811s0 = (C4220i) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: l0 */
    public View mo3910l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo3930s(), this.f11808p0);
        this.f11813u0 = new C4213c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C4220i k = this.f11810r0.mo13167k();
        if (MaterialDatePicker.m16057V1(contextThemeWrapper)) {
            i2 = C9021h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C9021h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C9019f.mtrl_calendar_days_of_week);
        C1988t.m8394m0(gridView, new C4191b());
        gridView.setAdapter(new C4218g());
        gridView.setNumColumns(k.f11902r);
        gridView.setEnabled(false);
        this.f11815w0 = (RecyclerView) inflate.findViewById(C9019f.mtrl_calendar_months);
        this.f11815w0.setLayoutManager(new C4192c(mo3930s(), i, false, i));
        this.f11815w0.setTag(f11804l0);
        C4223k kVar = new C4223k(contextThemeWrapper, this.f11809q0, this.f11810r0, new C4193d());
        this.f11815w0.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(C9020g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C9019f.mtrl_calendar_year_selector_frame);
        this.f11814v0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f11814v0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f11814v0.setAdapter(new C4231p(this));
            this.f11814v0.addItemDecoration(m16014G1());
        }
        if (inflate.findViewById(C9019f.month_navigation_fragment_toggle) != null) {
            m16013F1(inflate, kVar);
        }
        if (!MaterialDatePicker.m16057V1(contextThemeWrapper)) {
            new C1399h().mo5230b(this.f11815w0);
        }
        this.f11815w0.scrollToPosition(kVar.mo13234x(this.f11811s0));
        return inflate;
    }
}
