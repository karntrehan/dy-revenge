package com.songsterq.reactnative;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Random;
import p455g.p470y.p472d.C10457l;

public final class PdfThumbnailModule extends ReactContextBaseJavaModule {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PdfThumbnailModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C10457l.m35320e(reactApplicationContext, "reactContext");
    }

    private final String getOutputFilePrefix(String str, int i) {
        List o0 = C10300q.m34984o0(str, new String[]{"/"}, false, 0, 6, (Object) null);
        String x = C10299p.m34938x((String) o0.get(C10350l.m35139h(o0)), ".", "-", false, 4, (Object) null);
        int nextInt = new Random().nextInt(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
        return x + "-thumbnail-" + i + '-' + nextInt;
    }

    private final ParcelFileDescriptor getParcelFileDescriptor(String str) {
        Uri parse = Uri.parse(str);
        if (C10457l.m35316a("content", parse.getScheme()) || C10457l.m35316a("file", parse.getScheme())) {
            return getReactApplicationContext().getContentResolver().openFileDescriptor(parse, "r");
        }
        if (C10299p.m34926B(str, "/", false, 2, (Object) null)) {
            return ParcelFileDescriptor.open(new File(str), 268435456);
        }
        return null;
    }

    private final WritableNativeMap renderPage(PdfRenderer pdfRenderer, int i, String str, int i2) {
        PdfRenderer.Page openPage = pdfRenderer.openPage(i);
        int width = openPage.getWidth();
        int height = openPage.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        openPage.render(createBitmap, (Rect) null, (Matrix) null, 1);
        openPage.close();
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), createBitmap.getConfig());
        createBitmap2.eraseColor(-1);
        new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        createBitmap.recycle();
        File createTempFile = File.createTempFile(getOutputFilePrefix(str, i), ".jpg", getReactApplicationContext().getCacheDir());
        if (createTempFile.exists()) {
            createTempFile.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        createBitmap2.compress(Bitmap.CompressFormat.JPEG, i2, fileOutputStream);
        createBitmap2.recycle();
        fileOutputStream.flush();
        fileOutputStream.close();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("uri", Uri.fromFile(createTempFile).toString());
        writableNativeMap.putInt("width", width);
        writableNativeMap.putInt("height", height);
        return writableNativeMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void generate(java.lang.String r4, int r5, int r6, com.facebook.react.bridge.Promise r7) {
        /*
            r3 = this;
            java.lang.String r0 = "filePath"
            p455g.p470y.p472d.C10457l.m35320e(r4, r0)
            java.lang.String r0 = "promise"
            p455g.p470y.p472d.C10457l.m35320e(r7, r0)
            r0 = 0
            android.os.ParcelFileDescriptor r1 = r3.getParcelFileDescriptor(r4)     // Catch:{ IOException -> 0x0082, all -> 0x007f }
            if (r1 != 0) goto L_0x002d
            java.lang.String r5 = "FILE_NOT_FOUND"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x007d }
            r6.<init>()     // Catch:{ IOException -> 0x007d }
            java.lang.String r2 = "File "
            r6.append(r2)     // Catch:{ IOException -> 0x007d }
            r6.append(r4)     // Catch:{ IOException -> 0x007d }
            java.lang.String r4 = " not found"
            r6.append(r4)     // Catch:{ IOException -> 0x007d }
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x007d }
            r7.reject((java.lang.String) r5, (java.lang.String) r4)     // Catch:{ IOException -> 0x007d }
            return
        L_0x002d:
            android.graphics.pdf.PdfRenderer r2 = new android.graphics.pdf.PdfRenderer     // Catch:{ IOException -> 0x007d }
            r2.<init>(r1)     // Catch:{ IOException -> 0x007d }
            if (r5 < 0) goto L_0x0049
            int r0 = r2.getPageCount()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            if (r5 < r0) goto L_0x003b
            goto L_0x0049
        L_0x003b:
            com.facebook.react.bridge.WritableNativeMap r4 = r3.renderPage(r2, r5, r4, r6)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r7.resolve(r4)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r2.close()
        L_0x0045:
            r1.close()
            goto L_0x0091
        L_0x0049:
            java.lang.String r4 = "INVALID_PAGE"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r6.<init>()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            java.lang.String r0 = "Page number "
            r6.append(r0)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r6.append(r5)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            java.lang.String r5 = " is invalid, file has "
            r6.append(r5)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            int r5 = r2.getPageCount()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r6.append(r5)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            java.lang.String r5 = " pages"
            r6.append(r5)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            java.lang.String r5 = r6.toString()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r7.reject((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r2.close()
            r1.close()
            return
        L_0x0077:
            r4 = move-exception
            r0 = r2
            goto L_0x0093
        L_0x007a:
            r4 = move-exception
            r0 = r2
            goto L_0x0084
        L_0x007d:
            r4 = move-exception
            goto L_0x0084
        L_0x007f:
            r4 = move-exception
            r1 = r0
            goto L_0x0093
        L_0x0082:
            r4 = move-exception
            r1 = r0
        L_0x0084:
            java.lang.String r5 = "INTERNAL_ERROR"
            r7.reject((java.lang.String) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x008e
            r0.close()
        L_0x008e:
            if (r1 == 0) goto L_0x0091
            goto L_0x0045
        L_0x0091:
            return
        L_0x0092:
            r4 = move-exception
        L_0x0093:
            if (r0 == 0) goto L_0x0098
            r0.close()
        L_0x0098:
            if (r1 == 0) goto L_0x009d
            r1.close()
        L_0x009d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.songsterq.reactnative.PdfThumbnailModule.generate(java.lang.String, int, int, com.facebook.react.bridge.Promise):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void generateAllPages(java.lang.String r7, int r8, com.facebook.react.bridge.Promise r9) {
        /*
            r6 = this;
            java.lang.String r0 = "filePath"
            p455g.p470y.p472d.C10457l.m35320e(r7, r0)
            java.lang.String r0 = "promise"
            p455g.p470y.p472d.C10457l.m35320e(r9, r0)
            r0 = 0
            android.os.ParcelFileDescriptor r1 = r6.getParcelFileDescriptor(r7)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            if (r1 != 0) goto L_0x002d
            java.lang.String r8 = "FILE_NOT_FOUND"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0058 }
            r2.<init>()     // Catch:{ IOException -> 0x0058 }
            java.lang.String r3 = "File "
            r2.append(r3)     // Catch:{ IOException -> 0x0058 }
            r2.append(r7)     // Catch:{ IOException -> 0x0058 }
            java.lang.String r7 = " not found"
            r2.append(r7)     // Catch:{ IOException -> 0x0058 }
            java.lang.String r7 = r2.toString()     // Catch:{ IOException -> 0x0058 }
            r9.reject((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ IOException -> 0x0058 }
            return
        L_0x002d:
            android.graphics.pdf.PdfRenderer r2 = new android.graphics.pdf.PdfRenderer     // Catch:{ IOException -> 0x0058 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0058 }
            com.facebook.react.bridge.WritableNativeArray r0 = new com.facebook.react.bridge.WritableNativeArray     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            r0.<init>()     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            r3 = 0
            int r4 = r2.getPageCount()     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
        L_0x003c:
            if (r3 >= r4) goto L_0x0048
            com.facebook.react.bridge.WritableNativeMap r5 = r6.renderPage(r2, r3, r7, r8)     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            r0.pushMap(r5)     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            int r3 = r3 + 1
            goto L_0x003c
        L_0x0048:
            r9.resolve(r0)     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            r2.close()
        L_0x004e:
            r1.close()
            goto L_0x006c
        L_0x0052:
            r7 = move-exception
            r0 = r2
            goto L_0x006e
        L_0x0055:
            r7 = move-exception
            r0 = r2
            goto L_0x005f
        L_0x0058:
            r7 = move-exception
            goto L_0x005f
        L_0x005a:
            r7 = move-exception
            r1 = r0
            goto L_0x006e
        L_0x005d:
            r7 = move-exception
            r1 = r0
        L_0x005f:
            java.lang.String r8 = "INTERNAL_ERROR"
            r9.reject((java.lang.String) r8, (java.lang.Throwable) r7)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0069
            r0.close()
        L_0x0069:
            if (r1 == 0) goto L_0x006c
            goto L_0x004e
        L_0x006c:
            return
        L_0x006d:
            r7 = move-exception
        L_0x006e:
            if (r0 == 0) goto L_0x0073
            r0.close()
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            r1.close()
        L_0x0078:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.songsterq.reactnative.PdfThumbnailModule.generateAllPages(java.lang.String, int, com.facebook.react.bridge.Promise):void");
    }

    public String getName() {
        return "PdfThumbnail";
    }
}
