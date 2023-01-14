package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.memory.C2398c;
import com.facebook.imagepipeline.memory.C2401d;
import com.facebook.imagepipeline.platform.C2444d;
import com.facebook.imageutils.C2567a;
import com.facebook.soloader.C3264d;
import java.util.Locale;
import p174e.p247e.p253d.p257d.C6052d;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6070p;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p301e.C6318g;
import p174e.p247e.p294k.p307k.C6369d;

@C6052d
public abstract class DalvikPurgeableDecoder implements C2444d {

    /* renamed from: a */
    protected static final byte[] f7216a = {-1, -39};

    /* renamed from: b */
    private final C2398c f7217b = C2401d.m9968a();

    @C3264d
    private static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        /* renamed from: a */
        static void m10138a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        C2435a.m10146a();
    }

    protected DalvikPurgeableDecoder() {
    }

    /* renamed from: f */
    public static boolean m10130f(C6088a<C6082g> aVar, int i) {
        C6082g w0 = aVar.mo18082w0();
        return i >= 2 && w0.mo8160j(i + -2) == -1 && w0.mo8160j(i - 1) == -39;
    }

    /* renamed from: g */
    public static BitmapFactory.Options m10131g(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (Build.VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    @C6052d
    private static native void nativePinBitmap(Bitmap bitmap);

    /* renamed from: a */
    public C6088a<Bitmap> mo8181a(C6369d dVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options g = m10131g(dVar.mo18899n0(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m10138a(g, colorSpace);
        }
        C6088a<C6082g> r = dVar.mo18901r();
        C6062k.m22839g(r);
        try {
            return mo8186h(mo8184d(r, g));
        } finally {
            C6088a.m22949v0(r);
        }
    }

    /* renamed from: b */
    public C6088a<Bitmap> mo8182b(C6369d dVar, Bitmap.Config config, Rect rect, int i) {
        return mo8183c(dVar, config, rect, i, (ColorSpace) null);
    }

    /* renamed from: c */
    public C6088a<Bitmap> mo8183c(C6369d dVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        BitmapFactory.Options g = m10131g(dVar.mo18899n0(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m10138a(g, colorSpace);
        }
        C6088a<C6082g> r = dVar.mo18901r();
        C6062k.m22839g(r);
        try {
            return mo8186h(mo8185e(r, i, g));
        } finally {
            C6088a.m22949v0(r);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Bitmap mo8184d(C6088a<C6082g> aVar, BitmapFactory.Options options);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Bitmap mo8185e(C6088a<C6082g> aVar, int i, BitmapFactory.Options options);

    /* renamed from: h */
    public C6088a<Bitmap> mo8186h(Bitmap bitmap) {
        C6062k.m22839g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f7217b.mo8093g(bitmap)) {
                return C6088a.m22942C0(bitmap, this.f7217b.mo8091e());
            }
            int e = C2567a.m10705e(bitmap);
            bitmap.recycle();
            throw new C6318g(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(e), Integer.valueOf(this.f7217b.mo8088b()), Long.valueOf(this.f7217b.mo8092f()), Integer.valueOf(this.f7217b.mo8089c()), Integer.valueOf(this.f7217b.mo8090d())}));
        } catch (Exception e2) {
            bitmap.recycle();
            throw C6070p.m22850a(e2);
        }
    }
}
