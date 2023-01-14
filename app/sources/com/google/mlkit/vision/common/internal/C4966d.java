package com.google.mlkit.vision.common.internal;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3675i;
import com.google.android.gms.common.internal.C3705r;
import java.nio.ByteBuffer;
import okhttp3.HttpUrl;
import p174e.p319f.p406d.p411b.p413b.C9631a;

/* renamed from: com.google.mlkit.vision.common.internal.d */
public class C4966d {

    /* renamed from: a */
    private static final C3675i f13854a = new C3675i("MLKitImageUtils", HttpUrl.FRAGMENT_ENCODE_SET);

    /* renamed from: b */
    private static C4966d f13855b = new C4966d();

    private C4966d() {
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C4966d m18871b() {
        return f13855b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0 == 842094169) goto L_0x0042;
     */
    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p174e.p319f.p320a.p335c.p343d.C6634a mo14981a(@androidx.annotation.RecentlyNonNull p174e.p319f.p406d.p411b.p413b.C9631a r4) {
        /*
            r3 = this;
            int r0 = r4.mo24129f()
            r1 = -1
            if (r0 == r1) goto L_0x004d
            r1 = 17
            if (r0 == r1) goto L_0x0042
            r1 = 35
            if (r0 == r1) goto L_0x0015
            r1 = 842094169(0x32315659, float:1.0322389E-8)
            if (r0 != r1) goto L_0x0024
            goto L_0x0042
        L_0x0015:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x0024
            android.media.Image r4 = r4.mo24131h()
        L_0x001f:
            e.f.a.c.d.a r4 = p174e.p319f.p320a.p335c.p343d.C6636b.m25276Y(r4)
            return r4
        L_0x0024:
            e.f.d.a.a r0 = new e.f.d.a.a
            int r4 = r4.mo24129f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 37
            r1.<init>(r2)
            java.lang.String r2 = "Unsupported image format: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 3
            r0.<init>(r4, r1)
            throw r0
        L_0x0042:
            java.nio.ByteBuffer r4 = r4.mo24128e()
            java.lang.Object r4 = com.google.android.gms.common.internal.C3705r.m14346k(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            goto L_0x001f
        L_0x004d:
            android.graphics.Bitmap r4 = r4.mo24127d()
            java.lang.Object r4 = com.google.android.gms.common.internal.C3705r.m14346k(r4)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.common.internal.C4966d.mo14981a(e.f.d.b.b.a):e.f.a.c.d.a");
    }

    /* renamed from: c */
    public int mo14982c(@RecentlyNonNull C9631a aVar) {
        return aVar.mo24129f();
    }

    @TargetApi(19)
    /* renamed from: d */
    public int mo14983d(@RecentlyNonNull C9631a aVar) {
        if (aVar.mo24129f() == -1) {
            int i = Build.VERSION.SDK_INT;
            Bitmap bitmap = (Bitmap) C3705r.m14346k(aVar.mo24127d());
            return i >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        } else if (aVar.mo24129f() == 17 || aVar.mo24129f() == 842094169) {
            return ((ByteBuffer) C3705r.m14346k(aVar.mo24128e())).limit();
        } else {
            if (aVar.mo24129f() != 35) {
                return 0;
            }
            return (((Image.Plane[]) C3705r.m14346k(aVar.mo24132i()))[0].getBuffer().limit() * 3) / 2;
        }
    }
}
