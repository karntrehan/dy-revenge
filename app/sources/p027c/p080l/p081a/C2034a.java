package p027c.p080l.p081a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;

/* renamed from: c.l.a.a */
public abstract class C2034a {

    /* renamed from: a */
    private final C2034a f5850a;

    C2034a(C2034a aVar) {
        this.f5850a = aVar;
    }

    /* renamed from: f */
    public static C2034a m8642f(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C2037d((C2034a) null, context, uri);
        }
        return null;
    }

    /* renamed from: g */
    public static C2034a m8643g(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        return new C2038e((C2034a) null, context, DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId));
    }

    /* renamed from: a */
    public abstract C2034a mo6795a(String str);

    /* renamed from: b */
    public abstract C2034a mo6796b(String str, String str2);

    /* renamed from: c */
    public abstract boolean mo6797c();

    /* renamed from: d */
    public abstract boolean mo6798d();

    /* renamed from: e */
    public C2034a mo6799e(String str) {
        for (C2034a aVar : mo6807o()) {
            if (str.equals(aVar.mo6800h())) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    public abstract String mo6800h();

    /* renamed from: i */
    public abstract String mo6801i();

    /* renamed from: j */
    public abstract Uri mo6802j();

    /* renamed from: k */
    public abstract boolean mo6803k();

    /* renamed from: l */
    public abstract boolean mo6804l();

    /* renamed from: m */
    public abstract long mo6805m();

    /* renamed from: n */
    public abstract long mo6806n();

    /* renamed from: o */
    public abstract C2034a[] mo6807o();

    /* renamed from: p */
    public abstract boolean mo6808p(String str);
}
