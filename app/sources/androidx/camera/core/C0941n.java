package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.C0634d2;
import p027c.p061g.p062a.C1814b;

/* renamed from: androidx.camera.core.n */
public final /* synthetic */ class C0941n implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C0644e2 f2657f;

    /* renamed from: o */
    public final /* synthetic */ ImageProxy f2658o;

    /* renamed from: p */
    public final /* synthetic */ Matrix f2659p;

    /* renamed from: q */
    public final /* synthetic */ ImageProxy f2660q;

    /* renamed from: r */
    public final /* synthetic */ Rect f2661r;

    /* renamed from: s */
    public final /* synthetic */ C0634d2.C0635a f2662s;

    /* renamed from: t */
    public final /* synthetic */ C1814b.C1815a f2663t;

    public /* synthetic */ C0941n(C0644e2 e2Var, ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, C0634d2.C0635a aVar, C1814b.C1815a aVar2) {
        this.f2657f = e2Var;
        this.f2658o = imageProxy;
        this.f2659p = matrix;
        this.f2660q = imageProxy2;
        this.f2661r = rect;
        this.f2662s = aVar;
        this.f2663t = aVar2;
    }

    public final void run() {
        this.f2657f.mo2675m(this.f2658o, this.f2659p, this.f2660q, this.f2661r, this.f2662s, this.f2663t);
    }
}
