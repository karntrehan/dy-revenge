package p027c.p080l.p081a;

import android.content.Context;
import android.database.Cursor;
import android.provider.DocumentsContract;
import android.util.Log;
import com.reactnativesafx.SafXModule;

/* renamed from: c.l.a.b */
public class C2035b {
    /* renamed from: a */
    public static C2034a m8658a(Context context, C2034a aVar, String str) {
        Cursor query;
        if (!(aVar instanceof C2038e)) {
            return aVar.mo6799e(str);
        }
        try {
            query = context.getContentResolver().query(DocumentsContract.buildChildDocumentsUriUsingTree(aVar.mo6802j(), DocumentsContract.getDocumentId(aVar.mo6802j())), new String[]{"document_id", "_display_name"}, (String) null, (String[]) null, (String) null);
            if (query != null) {
                do {
                    if (query.moveToNext()) {
                    }
                } while (!str.equals(query.getString(1)));
                C2038e eVar = new C2038e(aVar, context, DocumentsContract.buildDocumentUriUsingTree(aVar.mo6802j(), query.getString(0)));
                query.close();
                return eVar;
            }
            if (query == null) {
                return null;
            }
            query.close();
            return null;
        } catch (Exception e) {
            Log.w(SafXModule.NAME, "query failed: " + e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
