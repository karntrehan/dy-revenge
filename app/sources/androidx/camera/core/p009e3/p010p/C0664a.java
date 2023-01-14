package androidx.camera.core.p009e3.p010p;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

/* renamed from: androidx.camera.core.e3.p.a */
public final class C0664a {
    /* renamed from: a */
    public static void m2785a(ImageWriter imageWriter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C0665b.m2790a(imageWriter);
            return;
        }
        throw new RuntimeException("Unable to call close() on API " + i + ". Version 23 or higher required.");
    }

    /* renamed from: b */
    public static Image m2786b(ImageWriter imageWriter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C0665b.m2791b(imageWriter);
        }
        throw new RuntimeException("Unable to call dequeueInputImage() on API " + i + ". Version 23 or higher required.");
    }

    /* renamed from: c */
    public static ImageWriter m2787c(Surface surface, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return C0665b.m2792c(surface, i);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int) on API " + i2 + ". Version 23 or higher required.");
    }

    /* renamed from: d */
    public static ImageWriter m2788d(Surface surface, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            return C0667d.m2795a(surface, i, i2);
        }
        if (i3 >= 26) {
            return C0666c.m2794a(surface, i, i2);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i3 + ". Version 26 or higher required.");
    }

    /* renamed from: e */
    public static void m2789e(ImageWriter imageWriter, Image image) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C0665b.m2793d(imageWriter, image);
            return;
        }
        throw new RuntimeException("Unable to call queueInputImage() on API " + i + ". Version 23 or higher required.");
    }
}
