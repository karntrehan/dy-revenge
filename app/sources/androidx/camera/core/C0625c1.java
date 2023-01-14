package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C0891u2;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.core.c1 */
final class C0625c1 implements ImageProxy {

    /* renamed from: f */
    private final Image f2040f;

    /* renamed from: o */
    private final C0626a[] f2041o;

    /* renamed from: p */
    private final C0927j2 f2042p;

    /* renamed from: androidx.camera.core.c1$a */
    private static final class C0626a implements ImageProxy.C0602a {

        /* renamed from: a */
        private final Image.Plane f2043a;

        C0626a(Image.Plane plane) {
            this.f2043a = plane;
        }

        /* renamed from: d */
        public synchronized ByteBuffer mo2544d() {
            return this.f2043a.getBuffer();
        }

        /* renamed from: e */
        public synchronized int mo2545e() {
            return this.f2043a.getRowStride();
        }

        /* renamed from: f */
        public synchronized int mo2546f() {
            return this.f2043a.getPixelStride();
        }
    }

    C0625c1(Image image) {
        this.f2040f = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f2041o = new C0626a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f2041o[i] = new C0626a(planes[i]);
            }
        } else {
            this.f2041o = new C0626a[0];
        }
        this.f2042p = C0940m2.m3675a(C0891u2.m3514a(), image.getTimestamp(), 0, new Matrix());
    }

    /* renamed from: S */
    public synchronized void mo2536S(Rect rect) {
        this.f2040f.setCropRect(rect);
    }

    /* renamed from: U */
    public C0927j2 mo2537U() {
        return this.f2042p;
    }

    /* renamed from: b0 */
    public synchronized Image mo2538b0() {
        return this.f2040f;
    }

    /* renamed from: c */
    public synchronized int mo2539c() {
        return this.f2040f.getHeight();
    }

    public synchronized void close() {
        this.f2040f.close();
    }

    /* renamed from: e */
    public synchronized int mo2541e() {
        return this.f2040f.getWidth();
    }

    /* renamed from: m */
    public synchronized ImageProxy.C0602a[] mo2542m() {
        return this.f2041o;
    }

    /* renamed from: q0 */
    public synchronized int mo2543q0() {
        return this.f2040f.getFormat();
    }
}
