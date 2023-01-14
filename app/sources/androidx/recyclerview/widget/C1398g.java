package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;

/* renamed from: androidx.recyclerview.widget.g */
public class C1398g extends RecyclerView.C1359z {

    /* renamed from: i */
    protected final LinearInterpolator f4115i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f4116j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f4117k;

    /* renamed from: l */
    private final DisplayMetrics f4118l;

    /* renamed from: m */
    private boolean f4119m = false;

    /* renamed from: n */
    private float f4120n;

    /* renamed from: o */
    protected int f4121o = 0;

    /* renamed from: p */
    protected int f4122p = 0;

    public C1398g(Context context) {
        this.f4118l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m6184A() {
        if (!this.f4119m) {
            this.f4120n = mo5178v(this.f4118l);
            this.f4119m = true;
        }
        return this.f4120n;
    }

    /* renamed from: y */
    private int m6185y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo5173B() {
        PointF pointF = this.f4117k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo5174C(RecyclerView.C1359z.C1360a aVar) {
        PointF a = mo4979a(mo4984f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo4998b(mo4984f());
            mo4996r();
            return;
        }
        mo4987i(a);
        this.f4117k = a;
        this.f4121o = (int) (a.x * 10000.0f);
        this.f4122p = (int) (a.y * 10000.0f);
        aVar.mo5000d((int) (((float) this.f4121o) * 1.2f), (int) (((float) this.f4122p) * 1.2f), (int) (((float) mo5180x(ModuleDescriptor.MODULE_VERSION)) * 1.2f), this.f4115i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo4990l(int i, int i2, RecyclerView.C1322a0 a0Var, RecyclerView.C1359z.C1360a aVar) {
        if (mo4981c() == 0) {
            mo4996r();
            return;
        }
        this.f4121o = m6185y(this.f4121o, i);
        int y = m6185y(this.f4122p, i2);
        this.f4122p = y;
        if (this.f4121o == 0 && y == 0) {
            mo5174C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4991m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo4992n() {
        this.f4122p = 0;
        this.f4121o = 0;
        this.f4117k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo4993o(View view, RecyclerView.C1322a0 a0Var, RecyclerView.C1359z.C1360a aVar) {
        int t = mo5176t(view, mo5181z());
        int u = mo5177u(view, mo5173B());
        int w = mo5179w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.mo5000d(-t, -u, w, this.f4116j);
        }
    }

    /* renamed from: s */
    public int mo5175s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: t */
    public int mo5176t(View view, int i) {
        RecyclerView.C1342o e = mo4983e();
        if (e == null || !e.mo4459k()) {
            return 0;
        }
        RecyclerView.C1347p pVar = (RecyclerView.C1347p) view.getLayoutParams();
        return mo5175s(e.mo4843Q(view) - pVar.leftMargin, e.mo4847T(view) + pVar.rightMargin, e.mo4866e0(), e.mo4887o0() - e.mo4868f0(), i);
    }

    /* renamed from: u */
    public int mo5177u(View view, int i) {
        RecyclerView.C1342o e = mo4983e();
        if (e == null || !e.mo4460l()) {
            return 0;
        }
        RecyclerView.C1347p pVar = (RecyclerView.C1347p) view.getLayoutParams();
        return mo5175s(e.mo4848U(view) - pVar.topMargin, e.mo4840O(view) + pVar.bottomMargin, e.mo4870g0(), e.mo4851W() - e.mo4864d0(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public float mo5178v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo5179w(int i) {
        return (int) Math.ceil(((double) mo5180x(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo5180x(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m6184A()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo5181z() {
        PointF pointF = this.f4117k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
