package p174e.p319f.p320a.p335c.p336a.p337a;

import android.net.Uri;
import java.util.Map;

/* renamed from: e.f.a.c.a.a.b */
final class C6616b extends Thread {

    /* renamed from: f */
    final /* synthetic */ Map f18273f;

    C6616b(C6614a aVar, Map map) {
        this.f18273f = map;
    }

    public final void run() {
        Map map = this.f18273f;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C6618d.m25260a(buildUpon.build().toString());
    }
}
