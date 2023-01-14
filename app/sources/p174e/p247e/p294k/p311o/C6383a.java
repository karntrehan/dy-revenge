package p174e.p247e.p294k.p311o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p299c.C6270f;
import p174e.p247e.p294k.p302f.C6342m;

/* renamed from: e.e.k.o.a */
public abstract class C6383a implements C6390d {

    /* renamed from: a */
    public static final Bitmap.Config f17783a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private static Method f17784b;

    /* renamed from: d */
    private static void m24406d(Bitmap bitmap, Bitmap bitmap2) {
        if (!C6342m.m24169a() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (f17784b == null) {
                f17784b = Class.forName("com.facebook.imagepipeline.nativecode.Bitmaps").getDeclaredMethod("copyBitmap", new Class[]{Bitmap.class, Bitmap.class});
            }
            f17784b.invoke((Object) null, new Object[]{bitmap, bitmap2});
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
        }
    }

    /* renamed from: b */
    public C6088a<Bitmap> mo9952b(Bitmap bitmap, C6270f fVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f17783a;
        }
        C6088a<Bitmap> d = fVar.mo18581d(width, height, config);
        try {
            mo9991f(d.mo18082w0(), bitmap);
            return d.clone();
        } finally {
            C6088a.m22949v0(d);
        }
    }

    /* renamed from: c */
    public C5999d mo9953c() {
        return null;
    }

    /* renamed from: e */
    public void mo18919e(Bitmap bitmap) {
    }

    /* renamed from: f */
    public void mo9991f(Bitmap bitmap, Bitmap bitmap2) {
        m24406d(bitmap, bitmap2);
        mo18919e(bitmap);
    }

    public String getName() {
        return "Unknown postprocessor";
    }
}
