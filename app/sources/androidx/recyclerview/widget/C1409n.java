package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;

/* renamed from: androidx.recyclerview.widget.n */
public abstract class C1409n extends RecyclerView.C1349r {

    /* renamed from: a */
    RecyclerView f4134a;

    /* renamed from: b */
    private Scroller f4135b;

    /* renamed from: c */
    private final RecyclerView.C1351t f4136c = new C1410a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    class C1410a extends RecyclerView.C1351t {

        /* renamed from: a */
        boolean f4137a = false;

        C1410a() {
        }

        /* renamed from: a */
        public void mo4923a(RecyclerView recyclerView, int i) {
            super.mo4923a(recyclerView, i);
            if (i == 0 && this.f4137a) {
                this.f4137a = false;
                C1409n.this.mo5234l();
            }
        }

        /* renamed from: b */
        public void mo4924b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f4137a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    class C1411b extends C1398g {
        C1411b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo4993o(View view, RecyclerView.C1322a0 a0Var, RecyclerView.C1359z.C1360a aVar) {
            C1409n nVar = C1409n.this;
            RecyclerView recyclerView = nVar.f4134a;
            if (recyclerView != null) {
                int[] c = nVar.mo5182c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int w = mo5179w(Math.max(Math.abs(i), Math.abs(i2)));
                if (w > 0) {
                    aVar.mo5000d(i, i2, w, this.f4116j);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo5178v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: g */
    private void m6307g() {
        this.f4134a.removeOnScrollListener(this.f4136c);
        this.f4134a.setOnFlingListener((RecyclerView.C1349r) null);
    }

    /* renamed from: j */
    private void m6308j() {
        if (this.f4134a.getOnFlingListener() == null) {
            this.f4134a.addOnScrollListener(this.f4136c);
            this.f4134a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    private boolean m6309k(RecyclerView.C1342o oVar, int i, int i2) {
        RecyclerView.C1359z e;
        int i3;
        if (!(oVar instanceof RecyclerView.C1359z.C1361b) || (e = mo5232e(oVar)) == null || (i3 = mo5184i(oVar, i, i2)) == -1) {
            return false;
        }
        e.mo4994p(i3);
        oVar.mo4834J1(e);
        return true;
    }

    /* renamed from: a */
    public boolean mo4919a(int i, int i2) {
        RecyclerView.C1342o layoutManager = this.f4134a.getLayoutManager();
        if (layoutManager == null || this.f4134a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4134a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m6309k(layoutManager, i, i2);
    }

    /* renamed from: b */
    public void mo5230b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4134a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m6307g();
            }
            this.f4134a = recyclerView;
            if (recyclerView != null) {
                m6308j();
                this.f4135b = new Scroller(this.f4134a.getContext(), new DecelerateInterpolator());
                mo5234l();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo5182c(RecyclerView.C1342o oVar, View view);

    /* renamed from: d */
    public int[] mo5231d(int i, int i2) {
        this.f4135b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, RecyclerView.UNDEFINED_DURATION, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
        return new int[]{this.f4135b.getFinalX(), this.f4135b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RecyclerView.C1359z mo5232e(RecyclerView.C1342o oVar) {
        return mo5233f(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: f */
    public C1398g mo5233f(RecyclerView.C1342o oVar) {
        if (!(oVar instanceof RecyclerView.C1359z.C1361b)) {
            return null;
        }
        return new C1411b(this.f4134a.getContext());
    }

    /* renamed from: h */
    public abstract View mo5183h(RecyclerView.C1342o oVar);

    /* renamed from: i */
    public abstract int mo5184i(RecyclerView.C1342o oVar, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5234l() {
        RecyclerView.C1342o layoutManager;
        View h;
        RecyclerView recyclerView = this.f4134a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = mo5183h(layoutManager)) != null) {
            int[] c = mo5182c(layoutManager, h);
            if (c[0] != 0 || c[1] != 0) {
                this.f4134a.smoothScrollBy(c[0], c[1]);
            }
        }
    }
}
