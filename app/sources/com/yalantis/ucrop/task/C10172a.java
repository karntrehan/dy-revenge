package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.yalantis.ucrop.p443k.C10150b;
import com.yalantis.ucrop.p444l.C10156c;
import com.yalantis.ucrop.p445m.C10158a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: com.yalantis.ucrop.task.a */
public class C10172a extends AsyncTask<Void, Void, C10173a> {

    /* renamed from: a */
    private final Context f27163a;

    /* renamed from: b */
    private Uri f27164b;

    /* renamed from: c */
    private Uri f27165c;

    /* renamed from: d */
    private final int f27166d;

    /* renamed from: e */
    private final int f27167e;

    /* renamed from: f */
    private final C10150b f27168f;

    /* renamed from: com.yalantis.ucrop.task.a$a */
    public static class C10173a {

        /* renamed from: a */
        Bitmap f27169a;

        /* renamed from: b */
        C10156c f27170b;

        /* renamed from: c */
        Exception f27171c;

        public C10173a(Bitmap bitmap, C10156c cVar) {
            this.f27169a = bitmap;
            this.f27170b = cVar;
        }

        public C10173a(Exception exc) {
            this.f27171c = exc;
        }
    }

    public C10172a(Context context, Uri uri, Uri uri2, int i, int i2, C10150b bVar) {
        this.f27163a = context;
        this.f27164b = uri;
        this.f27165c = uri2;
        this.f27166d = i;
        this.f27167e = i2;
        this.f27168f = bVar;
    }

    /* renamed from: a */
    private boolean m34426a(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    /* renamed from: b */
    private void m34427b(Uri uri, Uri uri2) {
        InputStream inputStream;
        Log.d("BitmapWorkerTask", "copyFile");
        Objects.requireNonNull(uri2, "Output Uri is null - cannot copy image");
        FileOutputStream fileOutputStream = null;
        try {
            inputStream = this.f27163a.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                if (inputStream != null) {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read > 0) {
                                fileOutputStream2.write(bArr, 0, read);
                            } else {
                                C10158a.m34378c(fileOutputStream2);
                                C10158a.m34378c(inputStream);
                                this.f27164b = this.f27165c;
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        C10158a.m34378c(fileOutputStream);
                        C10158a.m34378c(inputStream);
                        this.f27164b = this.f27165c;
                        throw th;
                    }
                } else {
                    throw new NullPointerException("InputStream for given input Uri is null");
                }
            } catch (Throwable th2) {
                th = th2;
                C10158a.m34378c(fileOutputStream);
                C10158a.m34378c(inputStream);
                this.f27164b = this.f27165c;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            C10158a.m34378c(fileOutputStream);
            C10158a.m34378c(inputStream);
            this.f27164b = this.f27165c;
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34428d(android.net.Uri r6, android.net.Uri r7) {
        /*
            r5 = this;
            java.lang.String r0 = "BitmapWorkerTask"
            java.lang.String r1 = "downloadFile"
            android.util.Log.d(r0, r1)
            java.lang.String r0 = "Output Uri is null - cannot download image"
            java.util.Objects.requireNonNull(r7, r0)
            okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
            r0.<init>()
            r1 = 0
            okhttp3.Request$Builder r2 = new okhttp3.Request$Builder     // Catch:{ all -> 0x0071 }
            r2.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0071 }
            okhttp3.Request$Builder r6 = r2.url((java.lang.String) r6)     // Catch:{ all -> 0x0071 }
            okhttp3.Request r6 = r6.build()     // Catch:{ all -> 0x0071 }
            okhttp3.Call r6 = r0.newCall(r6)     // Catch:{ all -> 0x0071 }
            okhttp3.Response r6 = r6.execute()     // Catch:{ all -> 0x0071 }
            okhttp3.ResponseBody r2 = r6.body()     // Catch:{ all -> 0x006d }
            i.h r2 = r2.source()     // Catch:{ all -> 0x006d }
            android.content.Context r3 = r5.f27163a     // Catch:{ all -> 0x0067 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0067 }
            java.io.OutputStream r7 = r3.openOutputStream(r7)     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x005f
            i.b0 r1 = p493i.C10625q.m36159g(r7)     // Catch:{ all -> 0x0067 }
            r2.mo26354g0(r1)     // Catch:{ all -> 0x0067 }
            com.yalantis.ucrop.p445m.C10158a.m34378c(r2)
            com.yalantis.ucrop.p445m.C10158a.m34378c(r1)
            okhttp3.ResponseBody r6 = r6.body()
            com.yalantis.ucrop.p445m.C10158a.m34378c(r6)
            okhttp3.Dispatcher r6 = r0.dispatcher()
            r6.cancelAll()
            android.net.Uri r6 = r5.f27165c
            r5.f27164b = r6
            return
        L_0x005f:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = "OutputStream for given output Uri is null"
            r7.<init>(r3)     // Catch:{ all -> 0x0067 }
            throw r7     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r1
            r1 = r4
            goto L_0x0074
        L_0x006d:
            r7 = move-exception
            r2 = r6
            r6 = r1
            goto L_0x0074
        L_0x0071:
            r7 = move-exception
            r6 = r1
            r2 = r6
        L_0x0074:
            com.yalantis.ucrop.p445m.C10158a.m34378c(r1)
            com.yalantis.ucrop.p445m.C10158a.m34378c(r6)
            if (r2 == 0) goto L_0x0083
            okhttp3.ResponseBody r6 = r2.body()
            com.yalantis.ucrop.p445m.C10158a.m34378c(r6)
        L_0x0083:
            okhttp3.Dispatcher r6 = r0.dispatcher()
            r6.cancelAll()
            android.net.Uri r6 = r5.f27165c
            r5.f27164b = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.task.C10172a.m34428d(android.net.Uri, android.net.Uri):void");
    }

    /* renamed from: f */
    private void m34429f() {
        String scheme = this.f27164b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                m34428d(this.f27164b, this.f27165c);
            } catch (IOException | NullPointerException e) {
                Log.e("BitmapWorkerTask", "Downloading failed", e);
                throw e;
            }
        } else if ("content".equals(scheme)) {
            try {
                m34427b(this.f27164b, this.f27165c);
            } catch (IOException | NullPointerException e2) {
                Log.e("BitmapWorkerTask", "Copying failed", e2);
                throw e2;
            }
        } else if (!"file".equals(scheme)) {
            Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
            throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C10173a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        if (this.f27164b == null) {
            return new C10173a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            m34429f();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = C10158a.m34376a(options, this.f27166d, this.f27167e);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z) {
                try {
                    openInputStream = this.f27163a.getContentResolver().openInputStream(this.f27164b);
                    bitmap = BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
                    if (options.outWidth == -1 || options.outHeight == -1) {
                        C10173a aVar = new C10173a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f27164b + "]"));
                        C10158a.m34378c(openInputStream);
                        return aVar;
                    }
                    C10158a.m34378c(openInputStream);
                    if (!m34426a(bitmap, options)) {
                        z = true;
                    }
                } catch (OutOfMemoryError e) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e);
                    options.inSampleSize *= 2;
                } catch (IOException e2) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e2);
                    return new C10173a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f27164b + "]", e2));
                } catch (Throwable th) {
                    C10158a.m34378c(openInputStream);
                    throw th;
                }
            }
            if (bitmap == null) {
                return new C10173a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f27164b + "]"));
            }
            int g = C10158a.m34382g(this.f27163a, this.f27164b);
            int e3 = C10158a.m34380e(g);
            int f = C10158a.m34381f(g);
            C10156c cVar = new C10156c(g, e3, f);
            Matrix matrix = new Matrix();
            if (e3 != 0) {
                matrix.preRotate((float) e3);
            }
            if (f != 1) {
                matrix.postScale((float) f, 1.0f);
            }
            return !matrix.isIdentity() ? new C10173a(C10158a.m34383h(bitmap, matrix), cVar) : new C10173a(bitmap, cVar);
        } catch (IOException | NullPointerException e4) {
            return new C10173a(e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void onPostExecute(C10173a aVar) {
        Exception exc = aVar.f27171c;
        if (exc == null) {
            C10150b bVar = this.f27168f;
            Bitmap bitmap = aVar.f27169a;
            C10156c cVar = aVar.f27170b;
            String path = this.f27164b.getPath();
            Uri uri = this.f27165c;
            bVar.mo25236a(bitmap, cVar, path, uri == null ? null : uri.getPath());
            return;
        }
        this.f27168f.mo25237b(exc);
    }
}
