package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p174e.p247e.p253d.p257d.C6049a;
import p174e.p247e.p253d.p257d.C6050b;
import p174e.p247e.p253d.p257d.C6052d;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6070p;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p260g.C6085i;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p263j.C6103a;
import p174e.p247e.p253d.p265l.C6113b;
import p174e.p247e.p253d.p265l.C6115c;

@C6052d
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c */
    private static Method f7228c;

    /* renamed from: d */
    private final C6113b f7229d = C6115c.m23022i();

    /* renamed from: i */
    private static MemoryFile m10154i(C6088a<C6082g> aVar, int i, byte[] bArr) {
        Closeable closeable;
        C6103a aVar2;
        C6085i iVar = null;
        MemoryFile memoryFile = new MemoryFile((String) null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            C6085i iVar2 = new C6085i(aVar.mo18082w0());
            try {
                aVar2 = new C6103a(iVar2, i);
                try {
                    OutputStream outputStream = memoryFile.getOutputStream();
                    C6049a.m22814a(aVar2, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    C6088a.m22949v0(aVar);
                    C6050b.m22817b(iVar2);
                    C6050b.m22817b(aVar2);
                    C6050b.m22816a(outputStream, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    closeable = null;
                    iVar = iVar2;
                    C6088a.m22949v0(aVar);
                    C6050b.m22817b(iVar);
                    C6050b.m22817b(aVar2);
                    C6050b.m22816a(closeable, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                aVar2 = null;
                iVar = iVar2;
                C6088a.m22949v0(aVar);
                C6050b.m22817b(iVar);
                C6050b.m22817b(aVar2);
                C6050b.m22816a(closeable, true);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            aVar2 = null;
            C6088a.m22949v0(aVar);
            C6050b.m22817b(iVar);
            C6050b.m22817b(aVar2);
            C6050b.m22816a(closeable, true);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m10155j(p174e.p247e.p253d.p261h.C6088a<p174e.p247e.p253d.p260g.C6082g> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = m10154i(r2, r3, r4)     // Catch:{ IOException -> 0x002f }
            java.io.FileDescriptor r3 = r1.m10157l(r2)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            e.e.d.l.b r4 = r1.f7229d     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            if (r4 == 0) goto L_0x001f
            android.graphics.Bitmap r3 = r4.mo18113c(r3, r0, r5)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            java.lang.String r4 = "BitmapFactory returned null"
            java.lang.Object r3 = p174e.p247e.p253d.p257d.C6062k.m22840h(r3, r4)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            if (r2 == 0) goto L_0x001e
            r2.close()
        L_0x001e:
            return r3
        L_0x001f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
            throw r3     // Catch:{ IOException -> 0x002a, all -> 0x0027 }
        L_0x0027:
            r3 = move-exception
            r0 = r2
            goto L_0x0035
        L_0x002a:
            r3 = move-exception
            r0 = r2
            goto L_0x0030
        L_0x002d:
            r3 = move-exception
            goto L_0x0035
        L_0x002f:
            r3 = move-exception
        L_0x0030:
            java.lang.RuntimeException r2 = p174e.p247e.p253d.p257d.C6070p.m22850a(r3)     // Catch:{ all -> 0x002d }
            throw r2     // Catch:{ all -> 0x002d }
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()
        L_0x003a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.m10155j(e.e.d.h.a, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: k */
    private synchronized Method m10156k() {
        if (f7228c == null) {
            try {
                f7228c = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                throw C6070p.m22850a(e);
            }
        }
        return f7228c;
    }

    /* renamed from: l */
    private FileDescriptor m10157l(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) C6062k.m22839g(m10156k().invoke(memoryFile, new Object[0]));
        } catch (Exception e) {
            throw C6070p.m22850a(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Bitmap mo8184d(C6088a<C6082g> aVar, BitmapFactory.Options options) {
        return m10155j(aVar, aVar.mo18082w0().size(), (byte[]) null, options);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Bitmap mo8185e(C6088a<C6082g> aVar, int i, BitmapFactory.Options options) {
        return m10155j(aVar, i, DalvikPurgeableDecoder.m10130f(aVar, i) ? null : DalvikPurgeableDecoder.f7216a, options);
    }
}
