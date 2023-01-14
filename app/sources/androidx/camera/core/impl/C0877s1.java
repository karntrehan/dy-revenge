package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.C0643e1;
import androidx.camera.core.impl.C0809g1;
import java.util.List;

/* renamed from: androidx.camera.core.impl.s1 */
public interface C0877s1 extends C0832k2 {

    /* renamed from: f */
    public static final C0809g1.C0810a<Integer> f2545f = C0809g1.C0810a.m3180a("camerax.core.imageOutput.targetAspectRatio", C0643e1.class);

    /* renamed from: g */
    public static final C0809g1.C0810a<Integer> f2546g = C0809g1.C0810a.m3180a("camerax.core.imageOutput.targetRotation", Integer.TYPE);

    /* renamed from: h */
    public static final C0809g1.C0810a<Size> f2547h = C0809g1.C0810a.m3180a("camerax.core.imageOutput.targetResolution", Size.class);

    /* renamed from: i */
    public static final C0809g1.C0810a<Size> f2548i = C0809g1.C0810a.m3180a("camerax.core.imageOutput.defaultResolution", Size.class);

    /* renamed from: j */
    public static final C0809g1.C0810a<Size> f2549j = C0809g1.C0810a.m3180a("camerax.core.imageOutput.maxResolution", Size.class);

    /* renamed from: k */
    public static final C0809g1.C0810a<List<Pair<Integer, Size[]>>> f2550k = C0809g1.C0810a.m3180a("camerax.core.imageOutput.supportedResolutions", List.class);

    /* renamed from: androidx.camera.core.impl.s1$a */
    public interface C0878a<B> {
        /* renamed from: a */
        B mo2602a(Size size);

        /* renamed from: d */
        B mo2604d(int i);
    }

    /* renamed from: E */
    int mo2989E(int i);

    /* renamed from: f */
    Size mo2992f(Size size);

    /* renamed from: h */
    List<Pair<Integer, Size[]>> mo2993h(List<Pair<Integer, Size[]>> list);

    /* renamed from: p */
    Size mo2994p(Size size);

    /* renamed from: s */
    Size mo2995s(Size size);

    /* renamed from: w */
    boolean mo2996w();

    /* renamed from: y */
    int mo2997y();
}
