package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.C0634d2;
import java.util.concurrent.Executor;
import p027c.p061g.p062a.C1814b;

/* renamed from: androidx.camera.core.m */
public final /* synthetic */ class C0936m implements C1814b.C1817c {

    /* renamed from: a */
    public final /* synthetic */ C0644e2 f2649a;

    /* renamed from: b */
    public final /* synthetic */ Executor f2650b;

    /* renamed from: c */
    public final /* synthetic */ ImageProxy f2651c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f2652d;

    /* renamed from: e */
    public final /* synthetic */ ImageProxy f2653e;

    /* renamed from: f */
    public final /* synthetic */ Rect f2654f;

    /* renamed from: g */
    public final /* synthetic */ C0634d2.C0635a f2655g;

    public /* synthetic */ C0936m(C0644e2 e2Var, Executor executor, ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, C0634d2.C0635a aVar) {
        this.f2649a = e2Var;
        this.f2650b = executor;
        this.f2651c = imageProxy;
        this.f2652d = matrix;
        this.f2653e = imageProxy2;
        this.f2654f = rect;
        this.f2655g = aVar;
    }

    /* renamed from: a */
    public final Object mo1960a(C1814b.C1815a aVar) {
        return this.f2649a.mo2676o(this.f2650b, this.f2651c, this.f2652d, this.f2653e, this.f2654f, this.f2655g, aVar);
    }
}
