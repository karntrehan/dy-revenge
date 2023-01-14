package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.v1 */
public final class C0894v1 extends C0820i1 {

    /* renamed from: m */
    private final Surface f2572m;

    public C0894v1(Surface surface) {
        this.f2572m = surface;
    }

    public C0894v1(Surface surface, Size size, int i) {
        super(size, i);
        this.f2572m = surface;
    }

    /* renamed from: n */
    public C9172b<Surface> mo3011n() {
        return C0768f.m3081g(this.f2572m);
    }
}
