package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0634d2;
import androidx.camera.core.C0931k2;
import androidx.camera.core.C0965s1;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.p009e3.C0655h;
import androidx.camera.core.p009e3.C0657j;
import androidx.camera.core.p009e3.C0658k;
import androidx.camera.core.p009e3.C0659l;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.m1 */
public final class C0839m1 implements C0908x2<C0634d2>, C0877s1, C0658k {

    /* renamed from: A */
    public static final C0809g1.C0810a<Boolean> f2461A;

    /* renamed from: B */
    public static final C0809g1.C0810a<Boolean> f2462B;

    /* renamed from: w */
    public static final C0809g1.C0810a<Integer> f2463w = C0809g1.C0810a.m3180a("camerax.core.imageAnalysis.backpressureStrategy", C0634d2.C0636b.class);

    /* renamed from: x */
    public static final C0809g1.C0810a<Integer> f2464x = C0809g1.C0810a.m3180a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* renamed from: y */
    public static final C0809g1.C0810a<C0931k2> f2465y = C0809g1.C0810a.m3180a("camerax.core.imageAnalysis.imageReaderProxyProvider", C0931k2.class);

    /* renamed from: z */
    public static final C0809g1.C0810a<Integer> f2466z = C0809g1.C0810a.m3180a("camerax.core.imageAnalysis.outputImageFormat", C0634d2.C0639e.class);

    /* renamed from: C */
    private final C0802e2 f2467C;

    static {
        Class<Boolean> cls = Boolean.class;
        f2461A = C0809g1.C0810a.m3180a("camerax.core.imageAnalysis.onePixelShiftEnabled", cls);
        f2462B = C0809g1.C0810a.m3180a("camerax.core.imageAnalysis.outputImageRotationEnabled", cls);
    }

    public C0839m1(C0802e2 e2Var) {
        this.f2467C = e2Var;
    }

    /* renamed from: A */
    public /* synthetic */ Executor mo2707A(Executor executor) {
        return C0657j.m2767a(this, executor);
    }

    /* renamed from: B */
    public /* synthetic */ C0965s1 mo2491B(C0965s1 s1Var) {
        return C0902w2.m3558a(this, s1Var);
    }

    /* renamed from: C */
    public /* synthetic */ C0608a3.C0610b mo2492C(C0608a3.C0610b bVar) {
        return C0659l.m2769a(this, bVar);
    }

    /* renamed from: D */
    public /* synthetic */ C0840m2.C0844d mo2493D(C0840m2.C0844d dVar) {
        return C0902w2.m3562e(this, dVar);
    }

    /* renamed from: E */
    public /* synthetic */ int mo2989E(int i) {
        return C0872r1.m3459f(this, i);
    }

    /* renamed from: G */
    public int mo3021G(int i) {
        return ((Integer) mo2497d(f2463w, Integer.valueOf(i))).intValue();
    }

    /* renamed from: H */
    public int mo3022H(int i) {
        return ((Integer) mo2497d(f2464x, Integer.valueOf(i))).intValue();
    }

    /* renamed from: I */
    public C0931k2 mo3023I() {
        return (C0931k2) mo2497d(f2465y, null);
    }

    /* renamed from: J */
    public Boolean mo3024J(Boolean bool) {
        return (Boolean) mo2497d(f2461A, bool);
    }

    /* renamed from: K */
    public int mo3025K(int i) {
        return ((Integer) mo2497d(f2466z, Integer.valueOf(i))).intValue();
    }

    /* renamed from: L */
    public Boolean mo3026L(Boolean bool) {
        return (Boolean) mo2497d(f2462B, bool);
    }

    /* renamed from: a */
    public /* synthetic */ Object mo2494a(C0809g1.C0810a aVar) {
        return C0828j2.m3254f(this, aVar);
    }

    /* renamed from: b */
    public /* synthetic */ boolean mo2495b(C0809g1.C0810a aVar) {
        return C0828j2.m3249a(this, aVar);
    }

    /* renamed from: c */
    public /* synthetic */ Set mo2496c() {
        return C0828j2.m3253e(this);
    }

    /* renamed from: d */
    public /* synthetic */ Object mo2497d(C0809g1.C0810a aVar, Object obj) {
        return C0828j2.m3255g(this, aVar, obj);
    }

    /* renamed from: e */
    public /* synthetic */ C0809g1.C0812c mo2498e(C0809g1.C0810a aVar) {
        return C0828j2.m3251c(this, aVar);
    }

    /* renamed from: f */
    public /* synthetic */ Size mo2992f(Size size) {
        return C0872r1.m3455b(this, size);
    }

    /* renamed from: h */
    public /* synthetic */ List mo2993h(List list) {
        return C0872r1.m3456c(this, list);
    }

    /* renamed from: i */
    public C0809g1 mo2499i() {
        return this.f2467C;
    }

    /* renamed from: j */
    public int mo2500j() {
        return 35;
    }

    /* renamed from: k */
    public /* synthetic */ C0840m2 mo2501k(C0840m2 m2Var) {
        return C0902w2.m3561d(this, m2Var);
    }

    /* renamed from: m */
    public /* synthetic */ void mo2502m(String str, C0809g1.C0811b bVar) {
        C0828j2.m3250b(this, str, bVar);
    }

    /* renamed from: n */
    public /* synthetic */ Object mo2503n(C0809g1.C0810a aVar, C0809g1.C0812c cVar) {
        return C0828j2.m3256h(this, aVar, cVar);
    }

    /* renamed from: o */
    public /* synthetic */ C0788c1.C0790b mo2504o(C0788c1.C0790b bVar) {
        return C0902w2.m3559b(this, bVar);
    }

    /* renamed from: p */
    public /* synthetic */ Size mo2994p(Size size) {
        return C0872r1.m3454a(this, size);
    }

    /* renamed from: r */
    public /* synthetic */ C0788c1 mo2505r(C0788c1 c1Var) {
        return C0902w2.m3560c(this, c1Var);
    }

    /* renamed from: s */
    public /* synthetic */ Size mo2995s(Size size) {
        return C0872r1.m3458e(this, size);
    }

    /* renamed from: t */
    public /* synthetic */ String mo2506t(String str) {
        return C0655h.m2765a(this, str);
    }

    /* renamed from: v */
    public /* synthetic */ Set mo2507v(C0809g1.C0810a aVar) {
        return C0828j2.m3252d(this, aVar);
    }

    /* renamed from: w */
    public /* synthetic */ boolean mo2996w() {
        return C0872r1.m3460g(this);
    }

    /* renamed from: x */
    public /* synthetic */ int mo2508x(int i) {
        return C0902w2.m3563f(this, i);
    }

    /* renamed from: y */
    public /* synthetic */ int mo2997y() {
        return C0872r1.m3457d(this);
    }
}
