package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.p128f.C3333a;
import com.google.android.datatransport.cct.p128f.C3359j;
import com.google.android.datatransport.cct.p128f.C3360k;
import com.google.android.datatransport.cct.p128f.C3363l;
import com.google.android.datatransport.cct.p128f.C3365m;
import com.google.android.datatransport.cct.p128f.C3367n;
import com.google.android.datatransport.cct.p128f.C3368o;
import com.google.android.datatransport.cct.p128f.C3372p;
import com.google.android.datatransport.runtime.backends.C3380f;
import com.google.android.datatransport.runtime.backends.C3382g;
import com.google.android.datatransport.runtime.backends.C3390m;
import com.google.firebase.p156m.C4876a;
import com.google.firebase.p156m.C4877b;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.p323i.C6572i;
import p174e.p319f.p320a.p322b.p323i.C6573j;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;
import p174e.p319f.p320a.p322b.p323i.p333y.C6610a;
import p174e.p319f.p320a.p322b.p323i.p334z.C6612b;

/* renamed from: com.google.android.datatransport.cct.d */
final class C3329d implements C3390m {

    /* renamed from: a */
    private final C4876a f9411a;

    /* renamed from: b */
    private final ConnectivityManager f9412b;

    /* renamed from: c */
    private final Context f9413c;

    /* renamed from: d */
    final URL f9414d;

    /* renamed from: e */
    private final C6552a f9415e;

    /* renamed from: f */
    private final C6552a f9416f;

    /* renamed from: g */
    private final int f9417g;

    /* renamed from: com.google.android.datatransport.cct.d$a */
    static final class C3330a {

        /* renamed from: a */
        final URL f9418a;

        /* renamed from: b */
        final C3359j f9419b;

        /* renamed from: c */
        final String f9420c;

        C3330a(URL url, C3359j jVar, String str) {
            this.f9418a = url;
            this.f9419b = jVar;
            this.f9420c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3330a mo10848a(URL url) {
            return new C3330a(url, this.f9419b, this.f9420c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.d$b */
    static final class C3331b {

        /* renamed from: a */
        final int f9421a;

        /* renamed from: b */
        final URL f9422b;

        /* renamed from: c */
        final long f9423c;

        C3331b(int i, URL url, long j) {
            this.f9421a = i;
            this.f9422b = url;
            this.f9423c = j;
        }
    }

    C3329d(Context context, C6552a aVar, C6552a aVar2) {
        this(context, aVar, aVar2, 130000);
    }

    C3329d(Context context, C6552a aVar, C6552a aVar2, int i) {
        this.f9411a = C3359j.m13179b();
        this.f9413c = context;
        this.f9412b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f9414d = m13067m(C3328c.f9403a);
        this.f9415e = aVar2;
        this.f9416f = aVar;
        this.f9417g = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C3331b m13057c(C3330a aVar) {
        GZIPOutputStream gZIPOutputStream;
        InputStream l;
        C6610a.m25246f("CctTransportBackend", "Making request to: %s", aVar.f9418a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f9418a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f9417g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.7"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f9420c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f9411a.mo14845a(aVar.f9419b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C6610a.m25246f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                C6610a.m25242b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                C6610a.m25242b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C3331b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new C3331b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    l = m13066l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C3331b bVar = new C3331b(responseCode, (URL) null, C3367n.m13224b(new BufferedReader(new InputStreamReader(l))).mo10933c());
                    if (l != null) {
                        l.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e) {
            C6610a.m25244d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C3331b(500, (URL) null, 0);
        } catch (C4877b | IOException e2) {
            C6610a.m25244d("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C3331b(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* renamed from: d */
    private static int m13058d(NetworkInfo networkInfo) {
        C3368o.C3370b bVar;
        if (networkInfo == null) {
            bVar = C3368o.C3370b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype == -1) {
                bVar = C3368o.C3370b.COMBINED;
            } else if (C3368o.C3370b.m13232e(subtype) != null) {
                return subtype;
            } else {
                return 0;
            }
        }
        return bVar.mo10947g();
    }

    /* renamed from: e */
    private static int m13059e(NetworkInfo networkInfo) {
        return networkInfo == null ? C3368o.C3371c.NONE.mo10948g() : networkInfo.getType();
    }

    /* renamed from: f */
    private static int m13060f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C6610a.m25244d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: g */
    private C3359j m13061g(C3380f fVar) {
        C3363l.C3364a aVar;
        HashMap hashMap = new HashMap();
        for (C6573j next : fVar.mo10950b()) {
            String j = next.mo19328j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C6573j jVar = (C6573j) ((List) entry.getValue()).get(0);
            C3365m.C3366a b = C3365m.m13205a().mo10930f(C3372p.DEFAULT).mo10931g(this.f9416f.mo19339a()).mo10932h(this.f9415e.mo19339a()).mo10926b(C3360k.m13181a().mo10896c(C3360k.C3362b.ANDROID_FIREBASE).mo10895b(C3333a.m13072a().mo10873m(Integer.valueOf(jVar.mo19376g("sdk-version"))).mo10870j(jVar.mo19375b("model")).mo10866f(jVar.mo19375b("hardware")).mo10864d(jVar.mo19375b("device")).mo10872l(jVar.mo19375b("product")).mo10871k(jVar.mo19375b("os-uild")).mo10868h(jVar.mo19375b("manufacturer")).mo10865e(jVar.mo19375b("fingerprint")).mo10863c(jVar.mo19375b("country")).mo10867g(jVar.mo19375b("locale")).mo10869i(jVar.mo19375b("mcc_mnc")).mo10862b(jVar.mo19375b("application_build")).mo10861a()).mo10894a());
            try {
                b.mo10945i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.mo10946j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C6573j jVar2 : (List) entry.getValue()) {
                C6572i e = jVar2.mo19324e();
                C6463b b2 = e.mo19371b();
                if (b2.equals(C6463b.m24863b("proto"))) {
                    aVar = C3363l.m13189j(e.mo19370a());
                } else if (b2.equals(C6463b.m24863b("json"))) {
                    aVar = C3363l.m13188i(new String(e.mo19370a(), Charset.forName("UTF-8")));
                } else {
                    C6610a.m25247g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.mo10909c(jVar2.mo19326f()).mo10910d(jVar2.mo19329k()).mo10914h(jVar2.mo19377h("tz-offset")).mo10911e(C3368o.m13226a().mo10944c(C3368o.C3371c.m13234e(jVar2.mo19376g("net-type"))).mo10943b(C3368o.C3370b.m13232e(jVar2.mo19376g("mobile-subtype"))).mo10942a());
                if (jVar2.mo19323d() != null) {
                    aVar.mo10908b(jVar2.mo19323d());
                }
                arrayList3.add(aVar.mo10907a());
            }
            b.mo10927c(arrayList3);
            arrayList2.add(b.mo10925a());
        }
        return C3359j.m13178a(arrayList2);
    }

    /* renamed from: h */
    private static TelephonyManager m13062h(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: i */
    static long m13063i() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
    }

    /* renamed from: k */
    static /* synthetic */ C3330a m13065k(C3330a aVar, C3331b bVar) {
        URL url = bVar.f9422b;
        if (url == null) {
            return null;
        }
        C6610a.m25242b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo10848a(bVar.f9422b);
    }

    /* renamed from: l */
    private static InputStream m13066l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: m */
    private static URL m13067m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public C3382g mo10846a(C3380f fVar) {
        C3359j g = m13061g(fVar);
        URL url = this.f9414d;
        String str = null;
        if (fVar.mo10951c() != null) {
            try {
                C3328c d = C3328c.m13051d(fVar.mo10951c());
                if (d.mo10843e() != null) {
                    str = d.mo10843e();
                }
                if (d.mo10844f() != null) {
                    url = m13067m(d.mo10844f());
                }
            } catch (IllegalArgumentException unused) {
                return C3382g.m13253a();
            }
        }
        try {
            C3331b bVar = (C3331b) C6612b.m25248a(5, new C3330a(url, g, str), new C3327b(this), C3326a.f9401a);
            int i = bVar.f9421a;
            if (i == 200) {
                return C3382g.m13255e(bVar.f9423c);
            }
            if (i < 500) {
                if (i != 404) {
                    return i == 400 ? C3382g.m13254d() : C3382g.m13253a();
                }
            }
            return C3382g.m13256f();
        } catch (IOException e) {
            C6610a.m25244d("CctTransportBackend", "Could not make request to the backend", e);
            return C3382g.m13256f();
        }
    }

    /* renamed from: b */
    public C6573j mo10847b(C6573j jVar) {
        NetworkInfo activeNetworkInfo = this.f9412b.getActiveNetworkInfo();
        return jVar.mo19379l().mo19380a("sdk-version", Build.VERSION.SDK_INT).mo19382c("model", Build.MODEL).mo19382c("hardware", Build.HARDWARE).mo19382c("device", Build.DEVICE).mo19382c("product", Build.PRODUCT).mo19382c("os-uild", Build.ID).mo19382c("manufacturer", Build.MANUFACTURER).mo19382c("fingerprint", Build.FINGERPRINT).mo19381b("tz-offset", m13063i()).mo19380a("net-type", m13059e(activeNetworkInfo)).mo19380a("mobile-subtype", m13058d(activeNetworkInfo)).mo19382c("country", Locale.getDefault().getCountry()).mo19382c("locale", Locale.getDefault().getLanguage()).mo19382c("mcc_mnc", m13062h(this.f9413c).getSimOperator()).mo19382c("application_build", Integer.toString(m13060f(this.f9413c))).mo19331d();
    }
}
