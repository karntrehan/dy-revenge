package p027c.p064i.p065d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.p022d.C1146c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p027c.p064i.p070h.C1879f;

/* renamed from: c.i.d.e */
class C1834e extends C1839j {

    /* renamed from: b */
    private static Class<?> f5466b = null;

    /* renamed from: c */
    private static Constructor<?> f5467c = null;

    /* renamed from: d */
    private static Method f5468d = null;

    /* renamed from: e */
    private static Method f5469e = null;

    /* renamed from: f */
    private static boolean f5470f = false;

    C1834e() {
    }

    /* renamed from: k */
    private static boolean m7790k(Object obj, String str, int i, boolean z) {
        m7793n();
        try {
            return ((Boolean) f5468d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    private static Typeface mo6333l(Object obj) {
        m7793n();
        try {
            Object newInstance = Array.newInstance(f5466b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f5469e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private File m7792m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m7793n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f5470f) {
            f5470f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f5467c = constructor;
            f5466b = cls;
            f5468d = method;
            f5469e = method2;
        }
    }

    /* renamed from: o */
    private static Object m7794o() {
        m7793n();
        try {
            return f5467c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Typeface mo6329b(Context context, C1146c.C1148b bVar, Resources resources, int i) {
        Object o = m7794o();
        C1146c.C1149c[] a = bVar.mo3628a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C1146c.C1149c cVar = a[i2];
            File e = C1843k.m7851e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C1843k.m7849c(e, resources, cVar.mo3630b())) {
                    e.delete();
                    return null;
                } else if (!m7790k(o, e.getPath(), cVar.mo3633e(), cVar.mo3634f())) {
                    return null;
                } else {
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo6333l(o);
    }

    /* renamed from: c */
    public Typeface mo6330c(Context context, CancellationSignal cancellationSignal, C1879f.C1881b[] bVarArr, int i) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        C1879f.C1881b h = mo6341h(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo6395d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File m = m7792m(openFileDescriptor);
                if (m != null) {
                    if (m.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(m);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d = super.mo6340d(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return d;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
