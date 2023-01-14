package p027c.p064i.p065d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p022d.C1146c;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p027c.p064i.p070h.C1879f;

/* renamed from: c.i.d.j */
class C1839j {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    private ConcurrentHashMap<Long, C1146c.C1148b> f5482a = new ConcurrentHashMap<>();

    /* renamed from: c.i.d.j$a */
    class C1840a implements C1842c<C1879f.C1881b> {
        C1840a() {
        }

        /* renamed from: c */
        public int mo6343a(C1879f.C1881b bVar) {
            return bVar.mo6396e();
        }

        /* renamed from: d */
        public boolean mo6344b(C1879f.C1881b bVar) {
            return bVar.mo6397f();
        }
    }

    /* renamed from: c.i.d.j$b */
    class C1841b implements C1842c<C1146c.C1149c> {
        C1841b() {
        }

        /* renamed from: c */
        public int mo6343a(C1146c.C1149c cVar) {
            return cVar.mo3633e();
        }

        /* renamed from: d */
        public boolean mo6344b(C1146c.C1149c cVar) {
            return cVar.mo3634f();
        }
    }

    /* renamed from: c.i.d.j$c */
    private interface C1842c<T> {
        /* renamed from: a */
        int mo6343a(T t);

        /* renamed from: b */
        boolean mo6344b(T t);
    }

    C1839j() {
    }

    /* renamed from: a */
    private void m7827a(Typeface typeface, C1146c.C1148b bVar) {
        long j = m7830j(typeface);
        if (j != 0) {
            this.f5482a.put(Long.valueOf(j), bVar);
        }
    }

    /* renamed from: f */
    private C1146c.C1149c m7828f(C1146c.C1148b bVar, int i) {
        return (C1146c.C1149c) m7829g(bVar.mo3628a(), i, new C1841b());
    }

    /* renamed from: g */
    private static <T> T m7829g(T[] tArr, int i, C1842c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo6343a(t2) - i2) * 2) + (cVar.mo6344b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m7830j(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: b */
    public Typeface mo6329b(Context context, C1146c.C1148b bVar, Resources resources, int i) {
        C1146c.C1149c f = m7828f(bVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = C1832d.m7783d(context, resources, f.mo3630b(), f.mo3629a(), i);
        m7827a(d, bVar);
        return d;
    }

    /* renamed from: c */
    public Typeface mo6330c(Context context, CancellationSignal cancellationSignal, C1879f.C1881b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo6341h(bVarArr, i).mo6395d());
            try {
                Typeface d = mo6340d(context, inputStream);
                C1843k.m7847a(inputStream);
                return d;
            } catch (IOException unused) {
                C1843k.m7847a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C1843k.m7847a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C1843k.m7847a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C1843k.m7847a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo6340d(Context context, InputStream inputStream) {
        File e = C1843k.m7851e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C1843k.m7850d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo6332e(Context context, Resources resources, int i, String str, int i2) {
        File e = C1843k.m7851e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C1843k.m7849c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C1879f.C1881b mo6341h(C1879f.C1881b[] bVarArr, int i) {
        return (C1879f.C1881b) m7829g(bVarArr, i, new C1840a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1146c.C1148b mo6342i(Typeface typeface) {
        long j = m7830j(typeface);
        if (j == 0) {
            return null;
        }
        return this.f5482a.get(Long.valueOf(j));
    }
}
