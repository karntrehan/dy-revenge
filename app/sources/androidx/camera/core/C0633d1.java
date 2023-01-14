package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.C0889u1;
import androidx.camera.core.impl.p014a3.C0742l;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.d1 */
final class C0633d1 implements C0889u1 {

    /* renamed from: a */
    private final ImageReader f2057a;

    C0633d1(ImageReader imageReader) {
        this.f2057a = imageReader;
    }

    /* renamed from: a */
    private boolean m2633a(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void mo2644l(C0889u1.C0890a aVar) {
        aVar.mo2595a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void mo2645n(Executor executor, C0889u1.C0890a aVar, ImageReader imageReader) {
        executor.execute(new C0623c(this, aVar));
    }

    /* renamed from: b */
    public synchronized Surface mo2634b() {
        return this.f2057a.getSurface();
    }

    /* renamed from: c */
    public synchronized int mo2635c() {
        return this.f2057a.getHeight();
    }

    public synchronized void close() {
        this.f2057a.close();
    }

    /* renamed from: d */
    public synchronized int mo2637d() {
        return this.f2057a.getImageFormat();
    }

    /* renamed from: e */
    public synchronized int mo2638e() {
        return this.f2057a.getWidth();
    }

    /* renamed from: f */
    public synchronized int mo2639f() {
        return this.f2057a.getMaxImages();
    }

    /* renamed from: g */
    public synchronized ImageProxy mo2640g() {
        Image image;
        try {
            image = this.f2057a.acquireLatestImage();
        } catch (RuntimeException e) {
            if (m2633a(e)) {
                image = null;
            } else {
                throw e;
            }
        }
        if (image == null) {
            return null;
        }
        return new C0625c1(image);
    }

    /* renamed from: h */
    public synchronized void mo2641h() {
        this.f2057a.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
    }

    /* renamed from: i */
    public synchronized ImageProxy mo2642i() {
        Image image;
        try {
            image = this.f2057a.acquireNextImage();
        } catch (RuntimeException e) {
            if (m2633a(e)) {
                image = null;
            } else {
                throw e;
            }
        }
        if (image == null) {
            return null;
        }
        return new C0625c1(image);
    }

    /* renamed from: j */
    public synchronized void mo2643j(C0889u1.C0890a aVar, Executor executor) {
        this.f2057a.setOnImageAvailableListener(new C0613b(this, executor, aVar), C0742l.m3041a());
    }
}
