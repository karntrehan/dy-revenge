package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.u1 */
public interface C0889u1 {

    /* renamed from: androidx.camera.core.impl.u1$a */
    public interface C0890a {
        /* renamed from: a */
        void mo2595a(C0889u1 u1Var);
    }

    /* renamed from: b */
    Surface mo2634b();

    /* renamed from: c */
    int mo2635c();

    void close();

    /* renamed from: d */
    int mo2637d();

    /* renamed from: e */
    int mo2638e();

    /* renamed from: f */
    int mo2639f();

    /* renamed from: g */
    ImageProxy mo2640g();

    /* renamed from: h */
    void mo2641h();

    /* renamed from: i */
    ImageProxy mo2642i();

    /* renamed from: j */
    void mo2643j(C0890a aVar, Executor executor);
}
