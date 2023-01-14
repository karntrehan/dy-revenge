package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.camera.core.c2 */
abstract class C0627c2 implements ImageProxy {

    /* renamed from: f */
    protected final ImageProxy f2044f;

    /* renamed from: o */
    private final Set<C0628a> f2045o = new HashSet();

    /* renamed from: androidx.camera.core.c2$a */
    interface C0628a {
        /* renamed from: a */
        void mo2625a(ImageProxy imageProxy);
    }

    protected C0627c2(ImageProxy imageProxy) {
        this.f2044f = imageProxy;
    }

    /* renamed from: S */
    public synchronized void mo2536S(Rect rect) {
        this.f2044f.mo2536S(rect);
    }

    /* renamed from: U */
    public synchronized C0927j2 mo2537U() {
        return this.f2044f.mo2537U();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo2623a(C0628a aVar) {
        this.f2045o.add(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2624b() {
        HashSet<C0628a> hashSet;
        synchronized (this) {
            hashSet = new HashSet<>(this.f2045o);
        }
        for (C0628a a : hashSet) {
            a.mo2625a(this);
        }
    }

    /* renamed from: b0 */
    public synchronized Image mo2538b0() {
        return this.f2044f.mo2538b0();
    }

    /* renamed from: c */
    public synchronized int mo2539c() {
        return this.f2044f.mo2539c();
    }

    public void close() {
        synchronized (this) {
            this.f2044f.close();
        }
        mo2624b();
    }

    /* renamed from: e */
    public synchronized int mo2541e() {
        return this.f2044f.mo2541e();
    }

    /* renamed from: m */
    public synchronized ImageProxy.C0602a[] mo2542m() {
        return this.f2044f.mo2542m();
    }

    /* renamed from: q0 */
    public synchronized int mo2543q0() {
        return this.f2044f.mo2543q0();
    }
}
