package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: com.facebook.imagepipeline.producers.c0 */
public class C2466c0 extends C2473e0 {

    /* renamed from: c */
    private static final String[] f7277c = {"_id", "_data"};

    /* renamed from: d */
    private final ContentResolver f7278d;

    public C2466c0(Executor executor, C6084h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f7278d = contentResolver;
    }

    /* renamed from: g */
    private C6369d m10239g(Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = this.f7278d.openFileDescriptor(uri, "r");
            return mo8261e(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        r0 = m10239g(r5);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p174e.p247e.p294k.p307k.C6369d mo8228d(p174e.p247e.p294k.p311o.C6384b r5) {
        /*
            r4 = this;
            android.net.Uri r5 = r5.mo18938r()
            boolean r0 = p174e.p247e.p253d.p264k.C6111f.m23004h(r5)
            r1 = -1
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r5.toString()
            java.lang.String r2 = "/photo"
            boolean r0 = r0.endsWith(r2)
            if (r0 == 0) goto L_0x001e
            android.content.ContentResolver r0 = r4.f7278d
            java.io.InputStream r5 = r0.openInputStream(r5)
            goto L_0x0057
        L_0x001e:
            java.lang.String r0 = r5.toString()
            java.lang.String r2 = "/display_photo"
            boolean r0 = r0.endsWith(r2)
            java.lang.String r2 = "Contact photo does not exist: "
            if (r0 == 0) goto L_0x004e
            android.content.ContentResolver r0 = r4.f7278d     // Catch:{ IOException -> 0x0039 }
            java.lang.String r3 = "r"
            android.content.res.AssetFileDescriptor r0 = r0.openAssetFileDescriptor(r5, r3)     // Catch:{ IOException -> 0x0039 }
            java.io.FileInputStream r5 = r0.createInputStream()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0057
        L_0x0039:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x004e:
            android.content.ContentResolver r0 = r4.f7278d
            java.io.InputStream r0 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r0, r5)
            if (r0 == 0) goto L_0x005c
            r5 = r0
        L_0x0057:
            e.e.k.k.d r5 = r4.mo8261e(r5, r1)
            return r5
        L_0x005c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0071:
            boolean r0 = p174e.p247e.p253d.p264k.C6111f.m23003g(r5)
            if (r0 == 0) goto L_0x007e
            e.e.k.k.d r0 = r4.m10239g(r5)
            if (r0 == 0) goto L_0x007e
            return r0
        L_0x007e:
            android.content.ContentResolver r0 = r4.f7278d
            java.io.InputStream r5 = r0.openInputStream(r5)
            e.e.k.k.d r5 = r4.mo8261e(r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2466c0.mo8228d(e.e.k.o.b):e.e.k.k.d");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo8229f() {
        return "LocalContentUriFetchProducer";
    }
}
