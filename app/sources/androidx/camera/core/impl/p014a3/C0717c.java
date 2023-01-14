package androidx.camera.core.impl.p014a3;

import android.os.Build;
import android.util.CloseGuard;
import androidx.core.util.C1177h;

/* renamed from: androidx.camera.core.impl.a3.c */
public final class C0717c {

    /* renamed from: a */
    private final C0719b f2226a;

    /* renamed from: androidx.camera.core.impl.a3.c$a */
    static final class C0718a implements C0719b {

        /* renamed from: a */
        private final CloseGuard f2227a = new CloseGuard();

        C0718a() {
        }

        /* renamed from: a */
        public void mo2826a() {
            this.f2227a.warnIfOpen();
        }

        /* renamed from: b */
        public void mo2827b(String str) {
            this.f2227a.open(str);
        }

        public void close() {
            this.f2227a.close();
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.c$b */
    private interface C0719b {
        /* renamed from: a */
        void mo2826a();

        /* renamed from: b */
        void mo2827b(String str);

        void close();
    }

    /* renamed from: androidx.camera.core.impl.a3.c$c */
    static final class C0720c implements C0719b {
        C0720c() {
        }

        /* renamed from: a */
        public void mo2826a() {
        }

        /* renamed from: b */
        public void mo2827b(String str) {
            C1177h.m4584f(str, "CloseMethodName must not be null.");
        }

        public void close() {
        }
    }

    private C0717c(C0719b bVar) {
        this.f2226a = bVar;
    }

    /* renamed from: b */
    public static C0717c m2967b() {
        return Build.VERSION.SDK_INT >= 30 ? new C0717c(new C0718a()) : new C0717c(new C0720c());
    }

    /* renamed from: a */
    public void mo2823a() {
        this.f2226a.close();
    }

    /* renamed from: c */
    public void mo2824c(String str) {
        this.f2226a.mo2827b(str);
    }

    /* renamed from: d */
    public void mo2825d() {
        this.f2226a.mo2826a();
    }
}
