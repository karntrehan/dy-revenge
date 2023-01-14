package p027c.p064i.p065d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.p022d.C1146c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p027c.p064i.p070h.C1879f;

/* renamed from: c.i.d.g */
public class C1836g extends C1834e {

    /* renamed from: g */
    protected final Class<?> f5475g;

    /* renamed from: h */
    protected final Constructor<?> f5476h;

    /* renamed from: i */
    protected final Method f5477i;

    /* renamed from: j */
    protected final Method f5478j;

    /* renamed from: k */
    protected final Method f5479k;

    /* renamed from: l */
    protected final Method f5480l;

    /* renamed from: m */
    protected final Method f5481m;

    public C1836g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = mo6338y();
            constructor = mo6339z(y);
            method4 = mo6335v(y);
            method3 = mo6336w(y);
            method2 = mo6331A(y);
            method = mo6334u(y);
            Class<?> cls2 = y;
            method5 = mo6337x(y);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f5475g = cls;
        this.f5476h = constructor;
        this.f5477i = method4;
        this.f5478j = method3;
        this.f5479k = method2;
        this.f5480l = method;
        this.f5481m = method5;
    }

    /* renamed from: o */
    private Object m7803o() {
        try {
            return this.f5476h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m7804p(Object obj) {
        try {
            this.f5480l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m7805q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f5477i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m7806r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f5478j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m7807s(Object obj) {
        try {
            return ((Boolean) this.f5479k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m7808t() {
        if (this.f5477i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f5477i != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Method mo6331A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: b */
    public Typeface mo6329b(Context context, C1146c.C1148b bVar, Resources resources, int i) {
        if (!m7808t()) {
            return super.mo6329b(context, bVar, resources, i);
        }
        Object o = m7803o();
        if (o == null) {
            return null;
        }
        for (C1146c.C1149c cVar : bVar.mo3628a()) {
            if (!m7805q(context, o, cVar.mo3629a(), cVar.mo3631c(), cVar.mo3633e(), cVar.mo3634f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo3632d()))) {
                m7804p(o);
                return null;
            }
        }
        if (!m7807s(o)) {
            return null;
        }
        return mo6333l(o);
    }

    /* renamed from: c */
    public Typeface mo6330c(Context context, CancellationSignal cancellationSignal, C1879f.C1881b[] bVarArr, int i) {
        Typeface l;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m7808t()) {
            C1879f.C1881b h = mo6341h(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo6395d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.mo6396e()).setItalic(h.mo6397f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h2 = C1843k.m7854h(context, bVarArr, cancellationSignal);
            Object o = m7803o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (C1879f.C1881b bVar : bVarArr) {
                ByteBuffer byteBuffer = h2.get(bVar.mo6395d());
                if (byteBuffer != null) {
                    if (!m7806r(o, byteBuffer, bVar.mo6394c(), bVar.mo6396e(), bVar.mo6397f() ? 1 : 0)) {
                        m7804p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m7804p(o);
                return null;
            } else if (m7807s(o) && (l = mo6333l(o)) != null) {
                return Typeface.create(l, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: e */
    public Typeface mo6332e(Context context, Resources resources, int i, String str, int i2) {
        if (!m7808t()) {
            return super.mo6332e(context, resources, i, str, i2);
        }
        Object o = m7803o();
        if (o == null) {
            return null;
        }
        if (!m7805q(context, o, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m7804p(o);
            return null;
        } else if (!m7807s(o)) {
            return null;
        } else {
            return mo6333l(o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo6333l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f5475g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f5481m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Method mo6334u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Method mo6335v(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Method mo6336w(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo6337x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Class<?> mo6338y() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Constructor<?> mo6339z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
