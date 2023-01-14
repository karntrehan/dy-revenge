package androidx.camera.camera2.p003e;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p003e.C0313a2;
import androidx.camera.core.impl.p014a3.p016o.C0762b;
import java.util.List;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.f0 */
public final /* synthetic */ class C0353f0 implements C0762b {

    /* renamed from: a */
    public final /* synthetic */ C0313a2.C0316c f1428a;

    /* renamed from: b */
    public final /* synthetic */ List f1429b;

    /* renamed from: c */
    public final /* synthetic */ int f1430c;

    public /* synthetic */ C0353f0(C0313a2.C0316c cVar, List list, int i) {
        this.f1428a = cVar;
        this.f1429b = list;
        this.f1430c = i;
    }

    public final C9172b apply(Object obj) {
        return this.f1428a.mo1915l(this.f1429b, this.f1430c, (TotalCaptureResult) obj);
    }
}
