package androidx.camera.camera2.p003e;

import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p002d.C0308d;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0908x2;

/* renamed from: androidx.camera.camera2.e.e2 */
final class C0348e2 implements C0840m2.C0844d {

    /* renamed from: a */
    static final C0348e2 f1419a = new C0348e2();

    C0348e2() {
    }

    /* renamed from: a */
    public void mo2000a(C0908x2<?> x2Var, C0840m2.C0842b bVar) {
        C0840m2 k = x2Var.mo2501k((C0840m2) null);
        C0809g1 G = C0802e2.m3154G();
        int j = C0840m2.m3308a().mo3035j();
        if (k != null) {
            j = k.mo3035j();
            bVar.mo3036a(k.mo3027b());
            bVar.mo3038c(k.mo3032g());
            bVar.mo3037b(k.mo3030e());
            G = k.mo3029d();
        }
        bVar.mo3051q(G);
        C0304b bVar2 = new C0304b(x2Var);
        bVar.mo3052r(bVar2.mo1881K(j));
        bVar.mo3040e(bVar2.mo1882L(C0377i2.m1779b()));
        bVar.mo3045j(bVar2.mo1885O(C0368h2.m1754b()));
        bVar.mo3039d(C0509n2.m2046d(bVar2.mo1884N(C0574y1.m2392c())));
        C0714a2 J = C0714a2.m2954J();
        J.mo2814q(C0304b.f1296B, bVar2.mo1878H(C0308d.m1523e()));
        J.mo2814q(C0304b.f1298D, bVar2.mo1883M((String) null));
        bVar.mo3042g(J);
        bVar.mo3042g(bVar2.mo1879I());
    }
}
