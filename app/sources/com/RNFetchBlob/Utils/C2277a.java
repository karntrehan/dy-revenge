package com.RNFetchBlob.Utils;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.RNFetchBlob.C2298h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: com.RNFetchBlob.Utils.a */
public class C2277a {
    /* renamed from: a */
    private static String m9529a(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        query.moveToFirst();
        int columnIndex = query.getColumnIndex("_display_name");
        if (columnIndex < 0) {
            return null;
        }
        String string = query.getString(columnIndex);
        query.close();
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9530b(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            if (r8 == 0) goto L_0x0026
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0024 }
            if (r9 == 0) goto L_0x0026
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0024 }
            java.lang.String r7 = r8.getString(r9)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            r9 = move-exception
            goto L_0x0030
        L_0x0026:
            if (r8 == 0) goto L_0x002b
            r8.close()
        L_0x002b:
            return r7
        L_0x002c:
            r9 = move-exception
            goto L_0x003b
        L_0x002e:
            r9 = move-exception
            r8 = r7
        L_0x0030:
            r9.printStackTrace()     // Catch:{ all -> 0x0039 }
            if (r8 == 0) goto L_0x0038
            r8.close()
        L_0x0038:
            return r7
        L_0x0039:
            r9 = move-exception
            r7 = r8
        L_0x003b:
            if (r7 == 0) goto L_0x0040
            r7.close()
        L_0x0040:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.Utils.C2277a.m9530b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    @TargetApi(19)
    /* renamed from: c */
    public static String m9531c(Context context, Uri uri) {
        String a;
        Uri uri2 = null;
        if (!(Build.VERSION.SDK_INT >= 19) || !DocumentsContract.isDocumentUri(context, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return m9534f(uri) ? uri.getLastPathSegment() : m9530b(context, uri, (String) null, (String[]) null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        } else if (m9533e(uri)) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            if ("primary".equalsIgnoreCase(split[0])) {
                return Environment.getExternalStorageDirectory() + "/" + split[1];
            }
        } else if (m9532d(uri)) {
            try {
                String documentId = DocumentsContract.getDocumentId(uri);
                return (documentId == null || !documentId.startsWith("raw:/")) ? m9530b(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null) : Uri.parse(documentId).getPath();
            } catch (Exception unused) {
                return null;
            }
        } else if (m9535g(uri)) {
            String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
            String str = split2[0];
            if ("image".equals(str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return m9530b(context, uri2, "_id=?", new String[]{split2[1]});
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            return m9534f(uri) ? uri.getLastPathSegment() : m9530b(context, uri, (String) null, (String[]) null);
        } else {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (!(openInputStream == null || (a = m9529a(context.getContentResolver(), uri)) == null)) {
                    File file = new File(context.getCacheDir(), a);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (openInputStream.read(bArr) > 0) {
                        fileOutputStream.write(bArr);
                    }
                    fileOutputStream.close();
                    openInputStream.close();
                    return file.getAbsolutePath();
                }
            } catch (Exception e) {
                C2298h.m9607a(e.toString());
                return null;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m9532d(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: e */
    public static boolean m9533e(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: f */
    public static boolean m9534f(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    /* renamed from: g */
    public static boolean m9535g(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
