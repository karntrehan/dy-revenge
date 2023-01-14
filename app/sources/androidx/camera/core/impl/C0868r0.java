package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.C0606a2;
import androidx.camera.core.C0616b2;
import androidx.camera.core.C0938m1;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import java.util.Collections;
import java.util.List;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.r0 */
public interface C0868r0 extends C0938m1 {

    /* renamed from: a */
    public static final C0868r0 f2540a = new C0869a();

    /* renamed from: androidx.camera.core.impl.r0$a */
    class C0869a implements C0868r0 {
        C0869a() {
        }

        /* renamed from: a */
        public C9172b<List<Void>> mo2320a(List<C0788c1> list, int i, int i2) {
            return C0768f.m3081g(Collections.emptyList());
        }

        /* renamed from: b */
        public void mo2322b(C0809g1 g1Var) {
        }

        /* renamed from: c */
        public C9172b<Void> mo2324c(float f) {
            return C0768f.m3081g(null);
        }

        /* renamed from: d */
        public Rect mo2326d() {
            return new Rect();
        }

        /* renamed from: e */
        public void mo2328e(int i) {
        }

        /* renamed from: f */
        public C9172b<Void> mo2330f(boolean z) {
            return C0768f.m3081g(null);
        }

        /* renamed from: g */
        public C0809g1 mo2332g() {
            return null;
        }

        /* renamed from: h */
        public void mo2334h() {
        }

        /* renamed from: i */
        public C9172b<C0616b2> mo2335i(C0606a2 a2Var) {
            return C0768f.m3081g(C0616b2.m2561b());
        }
    }

    /* renamed from: androidx.camera.core.impl.r0$b */
    public static final class C0870b extends Exception {

        /* renamed from: f */
        private C0793d0 f2541f;

        public C0870b(C0793d0 d0Var) {
            this.f2541f = d0Var;
        }
    }

    /* renamed from: androidx.camera.core.impl.r0$c */
    public interface C0871c {
        /* renamed from: a */
        void mo2415a();

        /* renamed from: b */
        void mo2416b(List<C0788c1> list);
    }

    /* renamed from: a */
    C9172b<List<Void>> mo2320a(List<C0788c1> list, int i, int i2);

    /* renamed from: b */
    void mo2322b(C0809g1 g1Var);

    /* renamed from: d */
    Rect mo2326d();

    /* renamed from: e */
    void mo2328e(int i);

    /* renamed from: g */
    C0809g1 mo2332g();

    /* renamed from: h */
    void mo2334h();
}
