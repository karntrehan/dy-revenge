package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0965s1;
import androidx.camera.core.C0967s2;
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

/* renamed from: androidx.camera.core.impl.g2 */
public final class C0813g2 implements C0908x2<C0967s2>, C0877s1, C0658k {

    /* renamed from: w */
    public static final C0809g1.C0810a<C0854o1> f2412w = C0809g1.C0810a.m3180a("camerax.core.preview.imageInfoProcessor", C0854o1.class);

    /* renamed from: x */
    public static final C0809g1.C0810a<C0795d1> f2413x = C0809g1.C0810a.m3180a("camerax.core.preview.captureProcessor", C0795d1.class);

    /* renamed from: y */
    private final C0802e2 f2414y;

    public C0813g2(C0802e2 e2Var) {
        this.f2414y = e2Var;
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
    public C0795d1 mo2990G(C0795d1 d1Var) {
        return (C0795d1) mo2497d(f2413x, d1Var);
    }

    /* renamed from: H */
    public C0854o1 mo2991H(C0854o1 o1Var) {
        return (C0854o1) mo2497d(f2412w, o1Var);
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
        return this.f2414y;
    }

    /* renamed from: j */
    public int mo2500j() {
        return ((Integer) mo2494a(C0863q1.f2513e)).intValue();
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
