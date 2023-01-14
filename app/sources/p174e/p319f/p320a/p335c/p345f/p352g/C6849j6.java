package p174e.p319f.p320a.p335c.p345f.p352g;

import android.net.Uri;
import p027c.p060f.C1788a;

/* renamed from: e.f.a.c.f.g.j6 */
public final class C6849j6 {

    /* renamed from: a */
    private static final C1788a f18548a = new C1788a();

    /* renamed from: a */
    public static synchronized Uri m25968a(String str) {
        synchronized (C6849j6.class) {
            C1788a aVar = f18548a;
            Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            aVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
