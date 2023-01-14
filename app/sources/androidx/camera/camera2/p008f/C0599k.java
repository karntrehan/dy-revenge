package androidx.camera.camera2.p008f;

import androidx.camera.core.C1010z1;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0828j2;
import androidx.camera.core.impl.C0832k2;
import androidx.camera.core.impl.C0922z1;
import java.util.Set;

/* renamed from: androidx.camera.camera2.f.k */
public class C0599k implements C0832k2 {

    /* renamed from: w */
    private final C0809g1 f1958w;

    /* renamed from: androidx.camera.camera2.f.k$a */
    public static final class C0600a implements C1010z1<C0599k> {

        /* renamed from: a */
        private final C0714a2 f1959a = C0714a2.m2954J();

        /* renamed from: d */
        public static C0600a m2485d(C0809g1 g1Var) {
            C0600a aVar = new C0600a();
            g1Var.mo2502m("camera2.captureRequest.option.", new C0595g(aVar, g1Var));
            return aVar;
        }

        /* renamed from: a */
        public C0599k mo2535a() {
            return new C0599k(C0802e2.m3155H(this.f1959a));
        }

        /* renamed from: b */
        public C0922z1 mo1887b() {
            return this.f1959a;
        }
    }

    public C0599k(C0809g1 g1Var) {
        this.f1958w = g1Var;
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

    /* renamed from: i */
    public C0809g1 mo2499i() {
        return this.f1958w;
    }

    /* renamed from: m */
    public /* synthetic */ void mo2502m(String str, C0809g1.C0811b bVar) {
        C0828j2.m3250b(this, str, bVar);
    }

    /* renamed from: n */
    public /* synthetic */ Object mo2503n(C0809g1.C0810a aVar, C0809g1.C0812c cVar) {
        return C0828j2.m3256h(this, aVar, cVar);
    }

    /* renamed from: v */
    public /* synthetic */ Set mo2507v(C0809g1.C0810a aVar) {
        return C0828j2.m3252d(this, aVar);
    }
}
