package androidx.camera.core.impl;

import androidx.camera.core.C0608a3;
import androidx.camera.core.C0965s1;
import androidx.camera.core.C1010z1;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.p009e3.C0656i;
import androidx.camera.core.p009e3.C0660m;

/* renamed from: androidx.camera.core.impl.x2 */
public interface C0908x2<T extends C0608a3> extends C0656i<T>, C0660m, C0863q1 {

    /* renamed from: l */
    public static final C0809g1.C0810a<C0840m2> f2601l = C0809g1.C0810a.m3180a("camerax.core.useCase.defaultSessionConfig", C0840m2.class);

    /* renamed from: m */
    public static final C0809g1.C0810a<C0788c1> f2602m = C0809g1.C0810a.m3180a("camerax.core.useCase.defaultCaptureConfig", C0788c1.class);

    /* renamed from: n */
    public static final C0809g1.C0810a<C0840m2.C0844d> f2603n = C0809g1.C0810a.m3180a("camerax.core.useCase.sessionConfigUnpacker", C0840m2.C0844d.class);

    /* renamed from: o */
    public static final C0809g1.C0810a<C0788c1.C0790b> f2604o = C0809g1.C0810a.m3180a("camerax.core.useCase.captureConfigUnpacker", C0788c1.C0790b.class);

    /* renamed from: p */
    public static final C0809g1.C0810a<Integer> f2605p = C0809g1.C0810a.m3180a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: q */
    public static final C0809g1.C0810a<C0965s1> f2606q = C0809g1.C0810a.m3180a("camerax.core.useCase.cameraSelector", C0965s1.class);

    /* renamed from: androidx.camera.core.impl.x2$a */
    public interface C0909a<T extends C0608a3, C extends C0908x2<T>, B> extends C1010z1<T> {
        /* renamed from: c */
        C mo2603c();
    }

    /* renamed from: B */
    C0965s1 mo2491B(C0965s1 s1Var);

    /* renamed from: D */
    C0840m2.C0844d mo2493D(C0840m2.C0844d dVar);

    /* renamed from: k */
    C0840m2 mo2501k(C0840m2 m2Var);

    /* renamed from: o */
    C0788c1.C0790b mo2504o(C0788c1.C0790b bVar);

    /* renamed from: r */
    C0788c1 mo2505r(C0788c1 c1Var);

    /* renamed from: x */
    int mo2508x(int i);
}
