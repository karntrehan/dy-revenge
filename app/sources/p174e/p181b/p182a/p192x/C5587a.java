package p174e.p181b.p182a.p192x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p174e.p181b.p182a.p195z.C5643d;

/* renamed from: e.b.a.x.a */
public class C5587a implements C5590d {

    /* renamed from: f */
    private final HttpURLConnection f15871f;

    public C5587a(HttpURLConnection httpURLConnection) {
        this.f15871f = httpURLConnection;
    }

    /* renamed from: a */
    private String m20857a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* renamed from: J */
    public String mo16841J() {
        return this.f15871f.getContentType();
    }

    /* renamed from: O */
    public InputStream mo16842O() {
        return this.f15871f.getInputStream();
    }

    public void close() {
        this.f15871f.disconnect();
    }

    public String error() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f15871f.getURL() + ". Failed with " + this.f15871f.getResponseCode() + "\n" + m20857a(this.f15871f);
        } catch (IOException e) {
            C5643d.m21028d("get error failed ", e);
            return e.getMessage();
        }
    }

    public boolean isSuccessful() {
        try {
            return this.f15871f.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
