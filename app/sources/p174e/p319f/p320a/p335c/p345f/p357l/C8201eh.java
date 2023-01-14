package p174e.p319f.p320a.p335c.p345f.p357l;

import android.net.Uri;
import p027c.p060f.C1788a;

/* renamed from: e.f.a.c.f.l.eh */
public final class C8201eh {

    /* renamed from: a */
    private static final C1788a<String, Uri> f22286a = new C1788a<>();

    /* renamed from: a */
    public static synchronized Uri m28486a(String str) {
        Uri uri;
        synchronized (C8201eh.class) {
            C1788a<String, Uri> aVar = f22286a;
            uri = aVar.get("com.google.android.gms.vision.sdk");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.vision.sdk"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                aVar.put("com.google.android.gms.vision.sdk", uri);
            }
        }
        return uri;
    }
}
