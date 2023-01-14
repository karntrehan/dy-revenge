package p174e.p181b.p182a.p192x;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: e.b.a.x.b */
public class C5588b implements C5592f {
    /* renamed from: a */
    public C5590d mo16846a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C5587a(httpURLConnection);
    }
}
