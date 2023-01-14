package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.C1176g;
import com.facebook.imagepipeline.memory.C2405e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okhttp3.internal.http2.Http2;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p263j.C6103a;
import p174e.p247e.p253d.p263j.C6104b;
import p174e.p247e.p294k.p307k.C6369d;

@TargetApi(11)
/* renamed from: com.facebook.imagepipeline.platform.b */
public abstract class C2442b implements C2444d {

    /* renamed from: a */
    private static final Class<?> f7231a = C2442b.class;

    /* renamed from: b */
    private static final byte[] f7232b = {-1, -39};

    /* renamed from: c */
    private final C2405e f7233c;

    /* renamed from: d */
    private final PreverificationHelper f7234d;

    /* renamed from: e */
    final C1176g<ByteBuffer> f7235e;

    public C2442b(C2405e eVar, int i, C1176g gVar) {
        this.f7234d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f7233c = eVar;
        this.f7235e = gVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7235e.mo3701a(ByteBuffer.allocate(Http2.INITIAL_MAX_FRAME_SIZE));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        p174e.p247e.p253d.p258e.C6071a.m22873g(f7231a, "Could not decode region %s, decoding full bitmap instead.", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009b, code lost:
        if (r0 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a1, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a2, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a5, code lost:
        r7.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r6 = r9.f7234d;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0090 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x00fa */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a5 A[Catch:{ IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1, all -> 0x00cf, IOException -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac A[Catch:{ IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1, all -> 0x00cf, IOException -> 0x00fa }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p174e.p247e.p253d.p261h.C6088a<android.graphics.Bitmap> m10164d(java.io.InputStream r10, android.graphics.BitmapFactory.Options r11, android.graphics.Rect r12, android.graphics.ColorSpace r13) {
        /*
            r9 = this;
            p174e.p247e.p253d.p257d.C6062k.m22839g(r10)
            int r0 = r11.outWidth
            int r1 = r11.outHeight
            if (r12 == 0) goto L_0x0017
            int r0 = r12.width()
            int r1 = r11.inSampleSize
            int r0 = r0 / r1
            int r1 = r12.height()
            int r2 = r11.inSampleSize
            int r1 = r1 / r2
        L_0x0017:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 1
            r5 = 0
            if (r2 < r3) goto L_0x002d
            com.facebook.imagepipeline.platform.PreverificationHelper r6 = r9.f7234d
            if (r6 == 0) goto L_0x002d
            android.graphics.Bitmap$Config r7 = r11.inPreferredConfig
            boolean r6 = r6.shouldUseHardwareBitmapConfig(r7)
            if (r6 == 0) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            r7 = 0
            if (r12 != 0) goto L_0x0037
            if (r6 == 0) goto L_0x0037
            r11.inMutable = r5
            r6 = r7
            goto L_0x0050
        L_0x0037:
            if (r12 == 0) goto L_0x003f
            if (r6 == 0) goto L_0x003f
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            r11.inPreferredConfig = r6
        L_0x003f:
            int r6 = r9.mo8196e(r0, r1, r11)
            com.facebook.imagepipeline.memory.e r8 = r9.f7233c
            java.lang.Object r6 = r8.get(r6)
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            java.lang.String r8 = "BitmapPool.get returned null"
            java.util.Objects.requireNonNull(r6, r8)
        L_0x0050:
            r11.inBitmap = r6
            if (r2 < r3) goto L_0x005e
            if (r13 != 0) goto L_0x005c
            android.graphics.ColorSpace$Named r13 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r13 = android.graphics.ColorSpace.get(r13)
        L_0x005c:
            r11.inPreferredColorSpace = r13
        L_0x005e:
            androidx.core.util.g<java.nio.ByteBuffer> r13 = r9.f7235e
            java.lang.Object r13 = r13.mo3702b()
            java.nio.ByteBuffer r13 = (java.nio.ByteBuffer) r13
            if (r13 != 0) goto L_0x006e
            r13 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocate(r13)
        L_0x006e:
            byte[] r3 = r13.array()     // Catch:{ IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1 }
            r11.inTempStorage = r3     // Catch:{ IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1 }
            r3 = 19
            if (r2 < r3) goto L_0x00a9
            if (r12 == 0) goto L_0x00a9
            if (r6 == 0) goto L_0x00a9
            android.graphics.Bitmap$Config r2 = r11.inPreferredConfig     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            r6.reconfigure(r0, r1, r2)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r10, r4)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            android.graphics.Bitmap r12 = r0.decodeRegion(r12, r11)     // Catch:{ IOException -> 0x0090 }
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1 }
            goto L_0x00aa
        L_0x008d:
            r11 = move-exception
            goto L_0x00a3
        L_0x008f:
            r0 = r7
        L_0x0090:
            java.lang.Class<?> r1 = f7231a     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "Could not decode region %s, decoding full bitmap instead."
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x00a1 }
            r3[r5] = r12     // Catch:{ all -> 0x00a1 }
            p174e.p247e.p253d.p258e.C6071a.m22873g(r1, r2, r3)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x00a9
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1 }
            goto L_0x00a9
        L_0x00a1:
            r11 = move-exception
            r7 = r0
        L_0x00a3:
            if (r7 == 0) goto L_0x00a8
            r7.recycle()     // Catch:{ IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1 }
        L_0x00a8:
            throw r11     // Catch:{ IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1 }
        L_0x00a9:
            r12 = r7
        L_0x00aa:
            if (r12 != 0) goto L_0x00b0
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeStream(r10, r7, r11)     // Catch:{ IllegalArgumentException -> 0x00da, RuntimeException -> 0x00d1 }
        L_0x00b0:
            androidx.core.util.g<java.nio.ByteBuffer> r10 = r9.f7235e
            r10.mo3701a(r13)
            if (r6 == 0) goto L_0x00c8
            if (r6 != r12) goto L_0x00ba
            goto L_0x00c8
        L_0x00ba:
            com.facebook.imagepipeline.memory.e r10 = r9.f7233c
            r10.mo8068a(r6)
            r12.recycle()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x00c8:
            com.facebook.imagepipeline.memory.e r10 = r9.f7233c
            e.e.d.h.a r10 = p174e.p247e.p253d.p261h.C6088a.m22942C0(r12, r10)
            return r10
        L_0x00cf:
            r10 = move-exception
            goto L_0x00fb
        L_0x00d1:
            r10 = move-exception
            if (r6 == 0) goto L_0x00d9
            com.facebook.imagepipeline.memory.e r11 = r9.f7233c     // Catch:{ all -> 0x00cf }
            r11.mo8068a(r6)     // Catch:{ all -> 0x00cf }
        L_0x00d9:
            throw r10     // Catch:{ all -> 0x00cf }
        L_0x00da:
            r11 = move-exception
            if (r6 == 0) goto L_0x00e2
            com.facebook.imagepipeline.memory.e r12 = r9.f7233c     // Catch:{ all -> 0x00cf }
            r12.mo8068a(r6)     // Catch:{ all -> 0x00cf }
        L_0x00e2:
            r10.reset()     // Catch:{ IOException -> 0x00fa }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch:{ IOException -> 0x00fa }
            if (r10 == 0) goto L_0x00f9
            e.e.k.c.h r12 = p174e.p247e.p294k.p299c.C6272h.m23750b()     // Catch:{ IOException -> 0x00fa }
            e.e.d.h.a r10 = p174e.p247e.p253d.p261h.C6088a.m22942C0(r10, r12)     // Catch:{ IOException -> 0x00fa }
            androidx.core.util.g<java.nio.ByteBuffer> r11 = r9.f7235e
            r11.mo3701a(r13)
            return r10
        L_0x00f9:
            throw r11     // Catch:{ IOException -> 0x00fa }
        L_0x00fa:
            throw r11     // Catch:{ all -> 0x00cf }
        L_0x00fb:
            androidx.core.util.g<java.nio.ByteBuffer> r11 = r9.f7235e
            r11.mo3701a(r13)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.C2442b.m10164d(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):e.e.d.h.a");
    }

    /* renamed from: f */
    private static BitmapFactory.Options m10165f(C6369d dVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = dVar.mo18899n0();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(dVar.mo18892X(), (Rect) null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    /* renamed from: a */
    public C6088a<Bitmap> mo8181a(C6369d dVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options f = m10165f(dVar, config);
        boolean z = f.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return m10164d((InputStream) C6062k.m22839g(dVar.mo18892X()), f, rect, colorSpace);
        } catch (RuntimeException e) {
            if (z) {
                return mo8181a(dVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e;
        }
    }

    /* renamed from: b */
    public C6088a<Bitmap> mo8182b(C6369d dVar, Bitmap.Config config, Rect rect, int i) {
        return mo8183c(dVar, config, rect, i, (ColorSpace) null);
    }

    /* renamed from: c */
    public C6088a<Bitmap> mo8183c(C6369d dVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean w0 = dVar.mo18904w0(i);
        BitmapFactory.Options f = m10165f(dVar, config);
        C6104b X = dVar.mo18892X();
        C6062k.m22839g(X);
        if (dVar.mo18902s0() > i) {
            X = new C6103a(X, i);
        }
        if (!w0) {
            X = new C6104b(X, f7232b);
        }
        boolean z = f.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            C6088a<Bitmap> d = m10164d(X, f, rect, colorSpace);
            try {
                X.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return d;
        } catch (RuntimeException e2) {
            if (z) {
                C6088a<Bitmap> c = mo8183c(dVar, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
                try {
                    X.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return c;
            }
            throw e2;
        } catch (Throwable th) {
            try {
                X.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public abstract int mo8196e(int i, int i2, BitmapFactory.Options options);
}
