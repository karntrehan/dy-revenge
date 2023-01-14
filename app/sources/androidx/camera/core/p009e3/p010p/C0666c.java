package androidx.camera.core.p009e3.p010p;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.core.util.C1177h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.camera.core.e3.p.c */
final class C0666c {

    /* renamed from: a */
    private static Method f2128a;

    static {
        Class<ImageWriter> cls = ImageWriter.class;
        try {
            Class cls2 = Integer.TYPE;
            f2128a = cls.getMethod("newInstance", new Class[]{Surface.class, cls2, cls2});
        } catch (NoSuchMethodException e) {
            Log.i("ImageWriterCompatApi26", "Unable to initialize via reflection.", e);
        }
    }

    /* renamed from: a */
    static ImageWriter m2794a(Surface surface, int i, int i2) {
        Throwable th = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) C1177h.m4583e(f2128a.invoke((Object) null, new Object[]{surface, Integer.valueOf(i), Integer.valueOf(i2)}));
            } catch (IllegalAccessException | InvocationTargetException e) {
                th = e;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th);
    }
}
