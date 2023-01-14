package p027c.p080l.p081a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: c.l.a.c */
class C2036c {
    /* renamed from: a */
    private static void m8659a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m8660b(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            if (cursor.getCount() > 0) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return false;
        } finally {
            m8659a(cursor);
        }
    }

    /* renamed from: c */
    public static String m8661c(Context context, Uri uri) {
        return m8669k(context, uri, "_display_name", (String) null);
    }

    /* renamed from: d */
    private static String m8662d(Context context, Uri uri) {
        return m8669k(context, uri, "mime_type", (String) null);
    }

    /* renamed from: e */
    public static String m8663e(Context context, Uri uri) {
        String d = m8662d(context, uri);
        if ("vnd.android.document/directory".equals(d)) {
            return null;
        }
        return d;
    }

    /* renamed from: f */
    public static boolean m8664f(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m8662d(context, uri));
    }

    /* renamed from: g */
    public static boolean m8665g(Context context, Uri uri) {
        String d = m8662d(context, uri);
        return !"vnd.android.document/directory".equals(d) && !TextUtils.isEmpty(d);
    }

    /* renamed from: h */
    public static long m8666h(Context context, Uri uri) {
        return m8668j(context, uri, "last_modified", 0);
    }

    /* renamed from: i */
    public static long m8667i(Context context, Uri uri) {
        return m8668j(context, uri, "_size", 0);
    }

    /* renamed from: j */
    private static long m8668j(Context context, Uri uri, String str, long j) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getLong(0);
            }
            m8659a(cursor);
            return j;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return j;
        } finally {
            m8659a(cursor);
        }
    }

    /* renamed from: k */
    private static String m8669k(Context context, Uri uri, String str, String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getString(0);
            }
            m8659a(cursor);
            return str2;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return str2;
        } finally {
            m8659a(cursor);
        }
    }
}
