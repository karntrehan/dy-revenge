package com.reactnative.ivpusic.imagepicker;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: com.reactnative.ivpusic.imagepicker.e */
class C5230e {
    /* JADX WARNING: type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m19540a(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String r1 = "_display_name"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1}
            r8 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ all -> 0x004f }
            r7 = 0
            r3 = r10
            r5 = r11
            r6 = r12
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004f }
            if (r11 == 0) goto L_0x0049
            boolean r12 = r11.moveToFirst()     // Catch:{ all -> 0x0046 }
            if (r12 == 0) goto L_0x0049
            int r12 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0046 }
            r0 = -1
            if (r12 <= r0) goto L_0x0028
            java.lang.String r8 = r11.getString(r12)     // Catch:{ all -> 0x0046 }
        L_0x0028:
            if (r8 == 0) goto L_0x0032
            java.lang.String r9 = r11.getString(r12)     // Catch:{ all -> 0x0046 }
            r11.close()
            return r9
        L_0x0032:
            int r12 = r11.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0046 }
            java.lang.String r12 = r11.getString(r12)     // Catch:{ all -> 0x0046 }
            java.io.File r9 = m19547h(r9, r12, r10)     // Catch:{ all -> 0x0046 }
            java.lang.String r9 = r9.getAbsolutePath()     // Catch:{ all -> 0x0046 }
            r11.close()
            return r9
        L_0x0046:
            r9 = move-exception
            r8 = r11
            goto L_0x0050
        L_0x0049:
            if (r11 == 0) goto L_0x004e
            r11.close()
        L_0x004e:
            return r8
        L_0x004f:
            r9 = move-exception
        L_0x0050:
            if (r8 == 0) goto L_0x0055
            r8.close()
        L_0x0055:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnative.ivpusic.imagepicker.C5230e.m19540a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    @TargetApi(19)
    /* renamed from: b */
    private static String m19541b(Context context, String str) {
        String absolutePath;
        int indexOf;
        File[] externalCacheDirs = context.getExternalCacheDirs();
        if (externalCacheDirs == null) {
            return null;
        }
        int length = externalCacheDirs.length;
        int i = 0;
        while (i < length) {
            File file = externalCacheDirs[i];
            if (file == null || (absolutePath = file.getAbsolutePath()) == null || (indexOf = absolutePath.indexOf(str)) == -1) {
                i++;
            } else {
                return absolutePath.substring(0, indexOf) + str;
            }
        }
        return null;
    }

    @TargetApi(19)
    /* renamed from: c */
    static String m19542c(Context context, Uri uri) {
        Uri uri2 = null;
        if (!(Build.VERSION.SDK_INT == 19) || !DocumentsContract.isDocumentUri(context, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return m19545f(uri) ? uri.getLastPathSegment() : m19540a(context, uri, (String) null, (String[]) null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        } else if (m19544e(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            String[] split = documentId.split(":");
            if ("primary".equalsIgnoreCase(split[0])) {
                return Environment.getExternalStorageDirectory() + "/" + split[1];
            }
            int indexOf = documentId.indexOf(58, 1);
            String substring = documentId.substring(0, indexOf);
            String substring2 = documentId.substring(indexOf + 1);
            String b = m19541b(context, substring);
            if (b != null) {
                String str = b + "/" + substring2;
                File file = new File(str);
                if (!file.exists() || !file.canRead()) {
                    return null;
                }
                return str;
            }
        } else if (m19543d(uri)) {
            return m19540a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), (String) null, (String[]) null);
        } else if (m19546g(uri)) {
            String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
            String str2 = split2[0];
            if ("image".equals(str2)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str2)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str2)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return m19540a(context, uri2, "_id=?", new String[]{split2[1]});
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m19543d(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: e */
    private static boolean m19544e(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: f */
    private static boolean m19545f(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    /* renamed from: g */
    private static boolean m19546g(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* renamed from: h */
    private static File m19547h(Context context, String str, Uri uri) {
        String str2 = context.getCacheDir() + "/react-native-image-crop-picker";
        new File(str2).mkdir();
        File file = new File(new File(str2), str.substring(str.lastIndexOf(47) + 1));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            while (true) {
                int read = openInputStream.read(bArr, 0, 8192);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                fileOutputStream.flush();
            }
            fileOutputStream.close();
            openInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }
}
