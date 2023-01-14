package p027c.p080l.p081a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: c.l.a.e */
class C2038e extends C2034a {

    /* renamed from: b */
    private Context f5853b;

    /* renamed from: c */
    private Uri f5854c;

    C2038e(C2034a aVar, Context context, Uri uri) {
        super(aVar);
        this.f5853b = context;
        this.f5854c = uri;
    }

    /* renamed from: q */
    private static void m8683q(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: r */
    private static Uri m8684r(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C2034a mo6795a(String str) {
        Uri r = m8684r(this.f5853b, this.f5854c, "vnd.android.document/directory", str);
        if (r != null) {
            return new C2038e(this, this.f5853b, r);
        }
        return null;
    }

    /* renamed from: b */
    public C2034a mo6796b(String str, String str2) {
        Uri r = m8684r(this.f5853b, this.f5854c, str, str2);
        if (r != null) {
            return new C2038e(this, this.f5853b, r);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo6797c() {
        try {
            return DocumentsContract.deleteDocument(this.f5853b.getContentResolver(), this.f5854c);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo6798d() {
        return C2036c.m8660b(this.f5853b, this.f5854c);
    }

    /* renamed from: h */
    public String mo6800h() {
        return C2036c.m8661c(this.f5853b, this.f5854c);
    }

    /* renamed from: i */
    public String mo6801i() {
        return C2036c.m8663e(this.f5853b, this.f5854c);
    }

    /* renamed from: j */
    public Uri mo6802j() {
        return this.f5854c;
    }

    /* renamed from: k */
    public boolean mo6803k() {
        return C2036c.m8664f(this.f5853b, this.f5854c);
    }

    /* renamed from: l */
    public boolean mo6804l() {
        return C2036c.m8665g(this.f5853b, this.f5854c);
    }

    /* renamed from: m */
    public long mo6805m() {
        return C2036c.m8666h(this.f5853b, this.f5854c);
    }

    /* renamed from: n */
    public long mo6806n() {
        return C2036c.m8667i(this.f5853b, this.f5854c);
    }

    /* renamed from: o */
    public C2034a[] mo6807o() {
        ContentResolver contentResolver = this.f5853b.getContentResolver();
        Uri uri = this.f5854c;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            while (cursor.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f5854c, cursor.getString(0)));
            }
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
        } catch (Throwable th) {
            m8683q((AutoCloseable) null);
            throw th;
        }
        m8683q(cursor);
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        C2034a[] aVarArr = new C2034a[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            aVarArr[i] = new C2038e(this, this.f5853b, uriArr[i]);
        }
        return aVarArr;
    }

    /* renamed from: p */
    public boolean mo6808p(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f5853b.getContentResolver(), this.f5854c, str);
            if (renameDocument != null) {
                this.f5854c = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
