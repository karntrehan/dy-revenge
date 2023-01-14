package com.google.firebase.installations.p153n;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.util.C3754a;
import com.google.android.gms.common.util.C3763j;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.google.firebase.installations.C4840g;
import com.google.firebase.installations.p153n.C4862d;
import com.google.firebase.installations.p153n.C4866f;
import com.google.firebase.p161o.C4921j;
import com.google.firebase.p162p.C4927b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import p174e.p319f.p320a.p335c.p362h.C8969o;

/* renamed from: com.google.firebase.installations.n.c */
public class C4861c {

    /* renamed from: a */
    private static final Pattern f13676a = Pattern.compile("[0-9]+s");

    /* renamed from: b */
    private static final Charset f13677b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final Context f13678c;

    /* renamed from: d */
    private final C4927b<C4921j> f13679d;

    /* renamed from: e */
    private final C4865e f13680e = new C4865e();

    public C4861c(Context context, C4927b<C4921j> bVar) {
        this.f13678c = context;
        this.f13679d = bVar;
    }

    /* renamed from: a */
    private static String m18588a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m18589b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m18590c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m18591f() {
        try {
            Context context = this.f13678c;
            byte[] a = C3754a.m14498a(context, context.getPackageName());
            if (a != null) {
                return C3763j.m14521b(a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f13678c.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f13678c.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private URL m18592g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new C4840g(e.getMessage(), C4840g.C4841a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m18593h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* renamed from: i */
    private static boolean m18594i(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    private static void m18595j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m18596k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o = m18600o(httpURLConnection);
        if (!TextUtils.isEmpty(o)) {
            Log.w("Firebase-Installations", o);
            Log.w("Firebase-Installations", m18588a(str, str2, str3));
        }
    }

    /* renamed from: l */
    private HttpURLConnection m18597l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(ModuleDescriptor.MODULE_VERSION);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(ModuleDescriptor.MODULE_VERSION);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f13678c.getPackageName());
            C4921j jVar = this.f13679d.get();
            if (jVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) C8969o.m29862a(jVar.mo14920a()));
                } catch (ExecutionException e) {
                    e = e;
                } catch (InterruptedException e2) {
                    e = e2;
                    Thread.currentThread().interrupt();
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m18591f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
            Log.w("ContentValues", "Failed to get heartbeats header", e);
            httpURLConnection.addRequestProperty("X-Android-Cert", m18591f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C4840g("Firebase Installations Service is unavailable. Please try again later.", C4840g.C4841a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m18598m(String str) {
        C3705r.m14337b(f13676a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private C4862d m18599n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f13677b));
        C4866f.C4867a a = C4866f.m18625a();
        C4862d.C4863a a2 = C4862d.m18607a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.mo14811f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo14808c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo14809d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo14820c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo14821d(m18598m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo14807b(a.mo14818a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo14810e(C4862d.C4864b.OK).mo14806a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m18600o(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f13677b
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 0
            int r6 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p153n.C4861c.m18600o(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: p */
    private C4866f m18601p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f13677b));
        C4866f.C4867a a = C4866f.m18625a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo14820c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo14821d(m18598m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo14819b(C4866f.C4868b.OK).mo14818a();
    }

    /* renamed from: q */
    private void m18602q(HttpURLConnection httpURLConnection, String str, String str2) {
        m18604s(httpURLConnection, m18593h(m18589b(str, str2)));
    }

    /* renamed from: r */
    private void m18603r(HttpURLConnection httpURLConnection) {
        m18604s(httpURLConnection, m18593h(m18590c()));
    }

    /* renamed from: s */
    private static void m18604s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: d */
    public C4862d mo14822d(String str, String str2, String str3, String str4, String str5) {
        C4862d n;
        if (this.f13680e.mo14824b()) {
            int i = 0;
            URL g = m18592g(String.format("projects/%s/installations", new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = m18597l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.setDoOutput(true);
                    if (str5 != null) {
                        l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m18602q(l, str2, str4);
                    int responseCode = l.getResponseCode();
                    this.f13680e.mo14825f(responseCode);
                    if (m18594i(responseCode)) {
                        n = m18599n(l);
                    } else {
                        m18596k(l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new C4840g("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C4840g.C4841a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m18595j();
                            n = C4862d.m18607a().mo14810e(C4862d.C4864b.BAD_CONFIG).mo14806a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new C4840g("Firebase Installations Service is unavailable. Please try again later.", C4840g.C4841a.UNAVAILABLE);
        }
        throw new C4840g("Firebase Installations Service is unavailable. Please try again later.", C4840g.C4841a.UNAVAILABLE);
    }

    /* renamed from: e */
    public C4866f mo14823e(String str, String str2, String str3, String str4) {
        C4866f p;
        C4866f.C4867a b;
        if (this.f13680e.mo14824b()) {
            int i = 0;
            URL g = m18592g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = m18597l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l.setDoOutput(true);
                    m18603r(l);
                    int responseCode = l.getResponseCode();
                    this.f13680e.mo14825f(responseCode);
                    if (m18594i(responseCode)) {
                        p = m18601p(l);
                    } else {
                        m18596k(l, (String) null, str, str3);
                        if (responseCode == 401) {
                            b = C4866f.m18625a().mo14819b(C4866f.C4868b.AUTH_ERROR);
                        } else if (responseCode == 404) {
                            b = C4866f.m18625a().mo14819b(C4866f.C4868b.AUTH_ERROR);
                        } else if (responseCode == 429) {
                            throw new C4840g("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C4840g.C4841a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m18595j();
                            b = C4866f.m18625a().mo14819b(C4866f.C4868b.BAD_CONFIG);
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                        p = b.mo14818a();
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return p;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new C4840g("Firebase Installations Service is unavailable. Please try again later.", C4840g.C4841a.UNAVAILABLE);
        }
        throw new C4840g("Firebase Installations Service is unavailable. Please try again later.", C4840g.C4841a.UNAVAILABLE);
    }
}
