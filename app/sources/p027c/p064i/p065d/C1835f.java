package p027c.p064i.p065d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p022d.C1146c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p027c.p060f.C1801g;
import p027c.p064i.p070h.C1879f;

/* renamed from: c.i.d.f */
class C1835f extends C1839j {

    /* renamed from: b */
    private static final Class<?> f5471b;

    /* renamed from: c */
    private static final Constructor<?> f5472c;

    /* renamed from: d */
    private static final Method f5473d;

    /* renamed from: e */
    private static final Method f5474e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f5472c = constructor;
        f5471b = cls;
        f5473d = method;
        f5474e = method2;
    }

    C1835f() {
    }

    /* renamed from: k */
    private static boolean m7797k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f5473d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m7798l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f5471b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f5474e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m7799m() {
        Method method = f5473d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: n */
    private static Object m7800n() {
        try {
            return f5472c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public Typeface mo6329b(Context context, C1146c.C1148b bVar, Resources resources, int i) {
        Object n = m7800n();
        if (n == null) {
            return null;
        }
        for (C1146c.C1149c cVar : bVar.mo3628a()) {
            ByteBuffer b = C1843k.m7848b(context, resources, cVar.mo3630b());
            if (b == null || !m7797k(n, b, cVar.mo3631c(), cVar.mo3633e(), cVar.mo3634f())) {
                return null;
            }
        }
        return m7798l(n);
    }

    /* renamed from: c */
    public Typeface mo6330c(Context context, CancellationSignal cancellationSignal, C1879f.C1881b[] bVarArr, int i) {
        Object n = m7800n();
        if (n == null) {
            return null;
        }
        C1801g gVar = new C1801g();
        for (C1879f.C1881b bVar : bVarArr) {
            Uri d = bVar.mo6395d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d);
            if (byteBuffer == null) {
                byteBuffer = C1843k.m7852f(context, cancellationSignal, d);
                gVar.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m7797k(n, byteBuffer, bVar.mo6394c(), bVar.mo6396e(), bVar.mo6397f())) {
                return null;
            }
        }
        Typeface l = m7798l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
