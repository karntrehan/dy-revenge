package androidx.camera.core.impl;

import androidx.camera.core.C0608a3;
import androidx.camera.core.C0930k1;
import androidx.camera.core.C0957q1;
import java.util.Collection;

/* renamed from: androidx.camera.core.impl.w0 */
public interface C0899w0 extends C0930k1, C0608a3.C0612d {

    /* renamed from: androidx.camera.core.impl.w0$a */
    public enum C0900a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        

        /* renamed from: v */
        private final boolean f2587v;

        private C0900a(boolean z) {
            this.f2587v = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo3138e() {
            return this.f2587v;
        }
    }

    /* renamed from: a */
    C0957q1 mo2380a();

    /* renamed from: e */
    void mo2387e(C0848n0 n0Var);

    /* renamed from: g */
    C0796d2<C0900a> mo2391g();

    /* renamed from: i */
    C0868r0 mo2395i();

    /* renamed from: j */
    void mo2397j(boolean z);

    /* renamed from: k */
    void mo2398k(Collection<C0608a3> collection);

    /* renamed from: l */
    void mo2399l(Collection<C0608a3> collection);

    /* renamed from: m */
    C0888u0 mo2400m();
}
