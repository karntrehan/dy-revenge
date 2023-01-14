package androidx.camera.core.impl;

import androidx.camera.core.C0927j2;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import java.util.Collections;
import java.util.List;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.p2 */
public final class C0859p2 implements C0885t1 {

    /* renamed from: a */
    private final int f2508a;

    /* renamed from: b */
    private final ImageProxy f2509b;

    public C0859p2(ImageProxy imageProxy, String str) {
        C0927j2 U = imageProxy.mo2537U();
        if (U != null) {
            Integer num = (Integer) U.mo2693c().mo3114c(str);
            if (num != null) {
                this.f2508a = num.intValue();
                this.f2509b = imageProxy;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    /* renamed from: a */
    public C9172b<ImageProxy> mo3082a(int i) {
        return i != this.f2508a ? C0768f.m3079e(new IllegalArgumentException("Capture id does not exist in the bundle")) : C0768f.m3081g(this.f2509b);
    }

    /* renamed from: b */
    public List<Integer> mo3083b() {
        return Collections.singletonList(Integer.valueOf(this.f2508a));
    }

    /* renamed from: c */
    public void mo3084c() {
        this.f2509b.close();
    }
}
