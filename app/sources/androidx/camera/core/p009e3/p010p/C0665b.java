package androidx.camera.core.p009e3.p010p;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* renamed from: androidx.camera.core.e3.p.b */
final class C0665b {
    /* renamed from: a */
    static void m2790a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* renamed from: b */
    static Image m2791b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* renamed from: c */
    static ImageWriter m2792c(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    /* renamed from: d */
    static void m2793d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
