package androidx.camera.core;

import android.os.Handler;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0828j2;
import androidx.camera.core.impl.C0875s0;
import androidx.camera.core.impl.C0883t0;
import androidx.camera.core.impl.C0915y2;
import androidx.camera.core.impl.C0922z1;
import androidx.camera.core.p009e3.C0655h;
import androidx.camera.core.p009e3.C0656i;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.w1 */
public final class C0994w1 implements C0656i<C0989v1> {

    /* renamed from: A */
    static final C0809g1.C0810a<Handler> f2811A = C0809g1.C0810a.m3180a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: B */
    static final C0809g1.C0810a<Integer> f2812B = C0809g1.C0810a.m3180a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: C */
    static final C0809g1.C0810a<C0965s1> f2813C = C0809g1.C0810a.m3180a("camerax.core.appConfig.availableCamerasLimiter", C0965s1.class);

    /* renamed from: w */
    static final C0809g1.C0810a<C0883t0.C0884a> f2814w = C0809g1.C0810a.m3180a("camerax.core.appConfig.cameraFactoryProvider", C0883t0.C0884a.class);

    /* renamed from: x */
    static final C0809g1.C0810a<C0875s0.C0876a> f2815x = C0809g1.C0810a.m3180a("camerax.core.appConfig.deviceSurfaceManagerProvider", C0875s0.C0876a.class);

    /* renamed from: y */
    static final C0809g1.C0810a<C0915y2.C0918c> f2816y = C0809g1.C0810a.m3180a("camerax.core.appConfig.useCaseConfigFactoryProvider", C0915y2.C0918c.class);

    /* renamed from: z */
    static final C0809g1.C0810a<Executor> f2817z = C0809g1.C0810a.m3180a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: D */
    private final C0802e2 f2818D;

    /* renamed from: androidx.camera.core.w1$a */
    public static final class C0995a {

        /* renamed from: a */
        private final C0714a2 f2819a;

        public C0995a() {
            this(C0714a2.m2954J());
        }

        private C0995a(C0714a2 a2Var) {
            Class<C0989v1> cls = C0989v1.class;
            this.f2819a = a2Var;
            Class cls2 = (Class) a2Var.mo2497d(C0656i.f2116t, null);
            if (cls2 == null || cls2.equals(cls)) {
                mo3280e(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        /* renamed from: b */
        private C0922z1 m3881b() {
            return this.f2819a;
        }

        /* renamed from: a */
        public C0994w1 mo3277a() {
            return new C0994w1(C0802e2.m3155H(this.f2819a));
        }

        /* renamed from: c */
        public C0995a mo3278c(C0883t0.C0884a aVar) {
            m3881b().mo2814q(C0994w1.f2814w, aVar);
            return this;
        }

        /* renamed from: d */
        public C0995a mo3279d(C0875s0.C0876a aVar) {
            m3881b().mo2814q(C0994w1.f2815x, aVar);
            return this;
        }

        /* renamed from: e */
        public C0995a mo3280e(Class<C0989v1> cls) {
            m3881b().mo2814q(C0656i.f2116t, cls);
            if (m3881b().mo2497d(C0656i.f2115s, null) == null) {
                mo3281f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: f */
        public C0995a mo3281f(String str) {
            m3881b().mo2814q(C0656i.f2115s, str);
            return this;
        }

        /* renamed from: g */
        public C0995a mo3282g(C0915y2.C0918c cVar) {
            m3881b().mo2814q(C0994w1.f2816y, cVar);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.w1$b */
    public interface C0996b {
        C0994w1 getCameraXConfig();
    }

    C0994w1(C0802e2 e2Var) {
        this.f2818D = e2Var;
    }

    /* renamed from: G */
    public C0965s1 mo3271G(C0965s1 s1Var) {
        return (C0965s1) this.f2818D.mo2497d(f2813C, s1Var);
    }

    /* renamed from: H */
    public Executor mo3272H(Executor executor) {
        return (Executor) this.f2818D.mo2497d(f2817z, executor);
    }

    /* renamed from: I */
    public C0883t0.C0884a mo3273I(C0883t0.C0884a aVar) {
        return (C0883t0.C0884a) this.f2818D.mo2497d(f2814w, aVar);
    }

    /* renamed from: J */
    public C0875s0.C0876a mo3274J(C0875s0.C0876a aVar) {
        return (C0875s0.C0876a) this.f2818D.mo2497d(f2815x, aVar);
    }

    /* renamed from: K */
    public Handler mo3275K(Handler handler) {
        return (Handler) this.f2818D.mo2497d(f2811A, handler);
    }

    /* renamed from: L */
    public C0915y2.C0918c mo3276L(C0915y2.C0918c cVar) {
        return (C0915y2.C0918c) this.f2818D.mo2497d(f2816y, cVar);
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
        return this.f2818D;
    }

    /* renamed from: m */
    public /* synthetic */ void mo2502m(String str, C0809g1.C0811b bVar) {
        C0828j2.m3250b(this, str, bVar);
    }

    /* renamed from: n */
    public /* synthetic */ Object mo2503n(C0809g1.C0810a aVar, C0809g1.C0812c cVar) {
        return C0828j2.m3256h(this, aVar, cVar);
    }

    /* renamed from: t */
    public /* synthetic */ String mo2506t(String str) {
        return C0655h.m2765a(this, str);
    }

    /* renamed from: v */
    public /* synthetic */ Set mo2507v(C0809g1.C0810a aVar) {
        return C0828j2.m3252d(this, aVar);
    }
}
