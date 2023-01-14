package p174e.p247e.p253d.p264k;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: e.e.d.k.f */
public class C6111f {

    /* renamed from: a */
    private static final Uri f16764a = Uri.withAppendedPath((Uri) C6409a.m24524f(ContactsContract.AUTHORITY_URI), "display_photo");

    /* renamed from: a */
    public static AssetFileDescriptor m22997a(ContentResolver contentResolver, Uri uri) {
        if (m23005i(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22998b(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            boolean r0 = m23005i(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0031 }
            if (r8 == 0) goto L_0x002b
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0028 }
            if (r9 == 0) goto L_0x002b
            java.lang.String r9 = "_data"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0028 }
            r0 = -1
            if (r9 == r0) goto L_0x002b
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0028 }
            r1 = r9
            goto L_0x002b
        L_0x0028:
            r9 = move-exception
            r1 = r8
            goto L_0x0032
        L_0x002b:
            if (r8 == 0) goto L_0x0042
            r8.close()
            goto L_0x0042
        L_0x0031:
            r9 = move-exception
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            r1.close()
        L_0x0037:
            throw r9
        L_0x0038:
            boolean r8 = m23006j(r9)
            if (r8 == 0) goto L_0x0042
            java.lang.String r1 = r9.getPath()
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p253d.p264k.C6111f.m22998b(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public static String m22999c(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* renamed from: d */
    public static Uri m23000d(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    /* renamed from: e */
    public static boolean m23001e(Uri uri) {
        return "data".equals(m22999c(uri));
    }

    /* renamed from: f */
    public static boolean m23002f(Uri uri) {
        return "asset".equals(m22999c(uri));
    }

    /* renamed from: g */
    public static boolean m23003g(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    /* renamed from: h */
    public static boolean m23004h(Uri uri) {
        return uri.getPath() != null && m23005i(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) C6409a.m24524f(f16764a.getPath()));
    }

    /* renamed from: i */
    public static boolean m23005i(Uri uri) {
        return "content".equals(m22999c(uri));
    }

    /* renamed from: j */
    public static boolean m23006j(Uri uri) {
        return "file".equals(m22999c(uri));
    }

    /* renamed from: k */
    public static boolean m23007k(Uri uri) {
        return "res".equals(m22999c(uri));
    }

    /* renamed from: l */
    public static boolean m23008l(Uri uri) {
        String c = m22999c(uri);
        return "https".equals(c) || "http".equals(c);
    }

    /* renamed from: m */
    public static boolean m23009m(Uri uri) {
        return "android.resource".equals(m22999c(uri));
    }

    /* renamed from: n */
    public static URL m23010n(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
