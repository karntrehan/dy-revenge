package com.RNFetchBlob;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.TlsVersion;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.RNFetchBlob.g */
public class C2290g extends BroadcastReceiver implements Runnable {

    /* renamed from: f */
    public static HashMap<String, Call> f6761f = new HashMap<>();

    /* renamed from: o */
    public static HashMap<String, Long> f6762o = new HashMap<>();

    /* renamed from: p */
    static HashMap<String, C2288f> f6763p = new HashMap<>();

    /* renamed from: q */
    static HashMap<String, C2288f> f6764q = new HashMap<>();

    /* renamed from: r */
    static ConnectionPool f6765r = new ConnectionPool();

    /* renamed from: A */
    Callback f6766A;

    /* renamed from: B */
    long f6767B;

    /* renamed from: C */
    long f6768C;

    /* renamed from: D */
    C2278a f6769D;

    /* renamed from: E */
    C2295e f6770E;

    /* renamed from: F */
    C2297g f6771F;

    /* renamed from: G */
    C2296f f6772G = C2296f.Auto;

    /* renamed from: H */
    WritableMap f6773H;

    /* renamed from: I */
    boolean f6774I = false;

    /* renamed from: J */
    ArrayList<String> f6775J = new ArrayList<>();

    /* renamed from: K */
    OkHttpClient f6776K;

    /* renamed from: s */
    C2281b f6777s;

    /* renamed from: t */
    String f6778t;

    /* renamed from: u */
    String f6779u;

    /* renamed from: v */
    String f6780v;

    /* renamed from: w */
    String f6781w;

    /* renamed from: x */
    String f6782x;

    /* renamed from: y */
    ReadableArray f6783y;

    /* renamed from: z */
    ReadableMap f6784z;

    /* renamed from: com.RNFetchBlob.g$a */
    class C2291a implements Interceptor {
        C2291a() {
        }

        public Response intercept(Interceptor.Chain chain) {
            C2290g.this.f6775J.add(chain.request().url().toString());
            return chain.proceed(chain.request());
        }
    }

    /* renamed from: com.RNFetchBlob.g$b */
    class C2292b implements Interceptor {

        /* renamed from: a */
        final /* synthetic */ Request f6786a;

        C2292b(Request request) {
            this.f6786a = request;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.RNFetchBlob.i.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.RNFetchBlob.i.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.RNFetchBlob.i.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.RNFetchBlob.i.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.RNFetchBlob.i.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.RNFetchBlob.i.b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) {
            /*
                r13 = this;
                r0 = 1
                okhttp3.Request r1 = r13.f6786a     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                okhttp3.Response r1 = r14.proceed(r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                int[] r2 = com.RNFetchBlob.C2290g.C2294d.f6790b     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.g r3 = com.RNFetchBlob.C2290g.this     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.g$g r3 = r3.f6771F     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                int r3 = r3.ordinal()     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                r2 = r2[r3]     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                if (r2 == r0) goto L_0x004f
                r3 = 2
                if (r2 == r3) goto L_0x0032
                com.RNFetchBlob.i.a r2 = new com.RNFetchBlob.i.a     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.facebook.react.bridge.ReactApplicationContext r3 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.g r4 = com.RNFetchBlob.C2290g.this     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                java.lang.String r4 = r4.f6778t     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                okhttp3.ResponseBody r5 = r1.body()     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.g r6 = com.RNFetchBlob.C2290g.this     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.b r6 = r6.f6777s     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                java.lang.Boolean r6 = r6.f6739l     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                boolean r6 = r6.booleanValue()     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                r2.<init>(r3, r4, r5, r6)     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                goto L_0x0068
            L_0x0032:
                com.RNFetchBlob.i.b r2 = new com.RNFetchBlob.i.b     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.facebook.react.bridge.ReactApplicationContext r8 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.g r3 = com.RNFetchBlob.C2290g.this     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                java.lang.String r9 = r3.f6778t     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                okhttp3.ResponseBody r10 = r1.body()     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.g r3 = com.RNFetchBlob.C2290g.this     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                java.lang.String r11 = r3.f6782x     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.b r3 = r3.f6777s     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                java.lang.Boolean r3 = r3.f6737j     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                boolean r12 = r3.booleanValue()     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                r7 = r2
                r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                goto L_0x0068
            L_0x004f:
                com.RNFetchBlob.i.a r2 = new com.RNFetchBlob.i.a     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.facebook.react.bridge.ReactApplicationContext r3 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.g r4 = com.RNFetchBlob.C2290g.this     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                java.lang.String r4 = r4.f6778t     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                okhttp3.ResponseBody r5 = r1.body()     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.g r6 = com.RNFetchBlob.C2290g.this     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                com.RNFetchBlob.b r6 = r6.f6777s     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                java.lang.Boolean r6 = r6.f6739l     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                boolean r6 = r6.booleanValue()     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                r2.<init>(r3, r4, r5, r6)     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
            L_0x0068:
                okhttp3.Response$Builder r1 = r1.newBuilder()     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                okhttp3.Response$Builder r1 = r1.body(r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                okhttp3.Response r14 = r1.build()     // Catch:{ SocketException | SocketTimeoutException -> 0x0075, Exception -> 0x0079 }
                return r14
            L_0x0075:
                com.RNFetchBlob.g r1 = com.RNFetchBlob.C2290g.this
                r1.f6774I = r0
            L_0x0079:
                okhttp3.Request r0 = r14.request()
                okhttp3.Response r14 = r14.proceed(r0)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2290g.C2292b.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
        }
    }

    /* renamed from: com.RNFetchBlob.g$c */
    class C2293c implements okhttp3.Callback {
        C2293c() {
        }

        public void onFailure(Call call, IOException iOException) {
            C2290g.m9593c(C2290g.this.f6778t);
            C2290g gVar = C2290g.this;
            if (gVar.f6773H == null) {
                gVar.f6773H = Arguments.createMap();
            }
            if (iOException.getClass().equals(SocketTimeoutException.class)) {
                C2290g.this.f6773H.putBoolean("timeout", true);
                C2290g.this.f6766A.invoke("The request timed out.", null, null);
            } else {
                C2290g.this.f6766A.invoke(iOException.getLocalizedMessage(), null, null);
            }
            C2290g.this.m9603m();
        }

        public void onResponse(Call call, Response response) {
            ReadableMap readableMap = C2290g.this.f6777s.f6731d;
            if (readableMap != null) {
                boolean hasKey = readableMap.hasKey("title");
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                String string = hasKey ? C2290g.this.f6777s.f6731d.getString("title") : str;
                if (readableMap.hasKey("description")) {
                    str = readableMap.getString("description");
                }
                String str2 = str;
                String string2 = readableMap.hasKey("mime") ? readableMap.getString("mime") : "text/plain";
                boolean z = readableMap.hasKey("mediaScannable") ? readableMap.getBoolean("mediaScannable") : false;
                boolean z2 = readableMap.hasKey("notification") ? readableMap.getBoolean("notification") : false;
                C2290g gVar = C2290g.this;
                ((DownloadManager) C2264RNFetchBlob.RCTContext.getSystemService("download")).addCompletedDownload(string, str2, z, string2, gVar.f6782x, gVar.f6767B, z2);
            }
            C2290g.this.m9594d(response);
        }
    }

    /* renamed from: com.RNFetchBlob.g$d */
    static /* synthetic */ class C2294d {

        /* renamed from: a */
        static final /* synthetic */ int[] f6789a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6790b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                com.RNFetchBlob.g$g[] r0 = com.RNFetchBlob.C2290g.C2297g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6790b = r0
                r1 = 1
                com.RNFetchBlob.g$g r2 = com.RNFetchBlob.C2290g.C2297g.KeepInMemory     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6790b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.RNFetchBlob.g$g r3 = com.RNFetchBlob.C2290g.C2297g.FileStorage     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.RNFetchBlob.g$e[] r2 = com.RNFetchBlob.C2290g.C2295e.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f6789a = r2
                com.RNFetchBlob.g$e r3 = com.RNFetchBlob.C2290g.C2295e.SingleFile     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f6789a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.RNFetchBlob.g$e r2 = com.RNFetchBlob.C2290g.C2295e.AsIs     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f6789a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.RNFetchBlob.g$e r1 = com.RNFetchBlob.C2290g.C2295e.Form     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f6789a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.RNFetchBlob.g$e r1 = com.RNFetchBlob.C2290g.C2295e.WithoutBody     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2290g.C2294d.<clinit>():void");
        }
    }

    /* renamed from: com.RNFetchBlob.g$e */
    enum C2295e {
        Form,
        SingleFile,
        AsIs,
        WithoutBody,
        Others
    }

    /* renamed from: com.RNFetchBlob.g$f */
    enum C2296f {
        Auto,
        UTF8,
        BASE64
    }

    /* renamed from: com.RNFetchBlob.g$g */
    enum C2297g {
        KeepInMemory,
        FileStorage
    }

    public C2290g(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, ReadableArray readableArray, OkHttpClient okHttpClient, Callback callback) {
        this.f6779u = str2.toUpperCase();
        C2281b bVar = new C2281b(readableMap);
        this.f6777s = bVar;
        this.f6778t = str;
        this.f6780v = str3;
        this.f6784z = readableMap2;
        this.f6766A = callback;
        this.f6781w = str4;
        this.f6783y = readableArray;
        this.f6776K = okHttpClient;
        this.f6771F = (bVar.f6728a.booleanValue() || this.f6777s.f6729b != null) ? C2297g.FileStorage : C2297g.KeepInMemory;
        this.f6770E = str4 != null ? C2295e.SingleFile : readableArray != null ? C2295e.Form : C2295e.WithoutBody;
    }

    /* renamed from: c */
    public static void m9593c(String str) {
        if (f6761f.containsKey(str)) {
            f6761f.get(str).cancel();
            f6761f.remove(str);
        }
        if (f6762o.containsKey(str)) {
            ((DownloadManager) C2264RNFetchBlob.RCTContext.getApplicationContext().getSystemService("download")).remove(new long[]{f6762o.get(str).longValue()});
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:32|33|34|35|(1:37)(1:38)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x011f */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125 A[Catch:{ IOException -> 0x014a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0138 A[Catch:{ IOException -> 0x014a }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m9594d(okhttp3.Response r13) {
        /*
            r12 = this;
            boolean r0 = r12.m9602l(r13)
            com.facebook.react.bridge.WritableMap r1 = r12.m9601k(r13, r0)
            r12.m9595e(r1)
            int[] r1 = com.RNFetchBlob.C2290g.C2294d.f6790b
            com.RNFetchBlob.g$g r2 = r12.f6771F
            int r2 = r2.ordinal()
            r1 = r1[r2]
            java.lang.String r2 = "path"
            java.lang.String r3 = "UTF-8"
            java.lang.String r4 = "utf8"
            r5 = 3
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 2
            if (r1 == r8) goto L_0x008c
            if (r1 == r9) goto L_0x004f
            com.facebook.react.bridge.Callback r0 = r12.f6766A     // Catch:{ IOException -> 0x0040 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0040 }
            r1[r7] = r6     // Catch:{ IOException -> 0x0040 }
            r1[r8] = r4     // Catch:{ IOException -> 0x0040 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0040 }
            okhttp3.ResponseBody r4 = r13.body()     // Catch:{ IOException -> 0x0040 }
            byte[] r4 = r4.bytes()     // Catch:{ IOException -> 0x0040 }
            r2.<init>(r4, r3)     // Catch:{ IOException -> 0x0040 }
            r1[r9] = r2     // Catch:{ IOException -> 0x0040 }
            r0.invoke(r1)     // Catch:{ IOException -> 0x0040 }
            goto L_0x0157
        L_0x0040:
            com.facebook.react.bridge.Callback r0 = r12.f6766A
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r2 = "RNFetchBlob failed to encode response data to UTF8 string."
            r1[r7] = r2
            r1[r8] = r6
            r0.invoke(r1)
            goto L_0x0157
        L_0x004f:
            okhttp3.ResponseBody r0 = r13.body()
            r0.bytes()     // Catch:{ Exception -> 0x0057 }
            goto L_0x0058
        L_0x0057:
        L_0x0058:
            com.RNFetchBlob.i.b r0 = (com.RNFetchBlob.p107i.C2303b) r0
            if (r0 == 0) goto L_0x0071
            boolean r0 = r0.mo7667a()
            if (r0 != 0) goto L_0x0071
            com.facebook.react.bridge.Callback r0 = r12.f6766A
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r2 = "Download interrupted."
            r1[r7] = r2
            r1[r8] = r6
            r0.invoke(r1)
            goto L_0x0157
        L_0x0071:
            java.lang.String r0 = r12.f6782x
            java.lang.String r1 = "?append=true"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r1, r3)
            r12.f6782x = r0
            com.facebook.react.bridge.Callback r1 = r12.f6766A
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r7] = r6
            r3[r8] = r2
            r3[r9] = r0
            r1.invoke(r3)
            goto L_0x0157
        L_0x008c:
            if (r0 == 0) goto L_0x00d7
            com.RNFetchBlob.b r0 = r12.f6777s     // Catch:{ IOException -> 0x014a }
            java.lang.Boolean r0 = r0.f6736i     // Catch:{ IOException -> 0x014a }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x014a }
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r12.f6778t     // Catch:{ IOException -> 0x014a }
            java.lang.String r0 = com.RNFetchBlob.C2283d.m9570n(r0)     // Catch:{ IOException -> 0x014a }
            okhttp3.ResponseBody r1 = r13.body()     // Catch:{ IOException -> 0x014a }
            java.io.InputStream r1 = r1.byteStream()     // Catch:{ IOException -> 0x014a }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x014a }
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x014a }
            r4.<init>(r0)     // Catch:{ IOException -> 0x014a }
            r3.<init>(r4)     // Catch:{ IOException -> 0x014a }
            r4 = 10240(0x2800, float:1.4349E-41)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x014a }
        L_0x00b4:
            int r10 = r1.read(r4)     // Catch:{ IOException -> 0x014a }
            r11 = -1
            if (r10 == r11) goto L_0x00bf
            r3.write(r4, r7, r10)     // Catch:{ IOException -> 0x014a }
            goto L_0x00b4
        L_0x00bf:
            r1.close()     // Catch:{ IOException -> 0x014a }
            r3.flush()     // Catch:{ IOException -> 0x014a }
            r3.close()     // Catch:{ IOException -> 0x014a }
            com.facebook.react.bridge.Callback r1 = r12.f6766A     // Catch:{ IOException -> 0x014a }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x014a }
            r3[r7] = r6     // Catch:{ IOException -> 0x014a }
            r3[r8] = r2     // Catch:{ IOException -> 0x014a }
            r3[r9] = r0     // Catch:{ IOException -> 0x014a }
            r1.invoke(r3)     // Catch:{ IOException -> 0x014a }
            goto L_0x0157
        L_0x00d7:
            okhttp3.ResponseBody r0 = r13.body()     // Catch:{ IOException -> 0x014a }
            byte[] r0 = r0.bytes()     // Catch:{ IOException -> 0x014a }
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r3)     // Catch:{ IOException -> 0x014a }
            java.nio.charset.CharsetEncoder r1 = r1.newEncoder()     // Catch:{ IOException -> 0x014a }
            com.RNFetchBlob.g$f r2 = r12.f6772G     // Catch:{ IOException -> 0x014a }
            com.RNFetchBlob.g$f r3 = com.RNFetchBlob.C2290g.C2296f.BASE64     // Catch:{ IOException -> 0x014a }
            java.lang.String r10 = "base64"
            if (r2 != r3) goto L_0x0101
            com.facebook.react.bridge.Callback r1 = r12.f6766A     // Catch:{ IOException -> 0x014a }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x014a }
            r2[r7] = r6     // Catch:{ IOException -> 0x014a }
            r2[r8] = r10     // Catch:{ IOException -> 0x014a }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ IOException -> 0x014a }
            r2[r9] = r0     // Catch:{ IOException -> 0x014a }
            r1.invoke(r2)     // Catch:{ IOException -> 0x014a }
            return
        L_0x0101:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ CharacterCodingException -> 0x011f }
            java.nio.CharBuffer r2 = r2.asCharBuffer()     // Catch:{ CharacterCodingException -> 0x011f }
            r1.encode(r2)     // Catch:{ CharacterCodingException -> 0x011f }
            java.lang.String r1 = new java.lang.String     // Catch:{ CharacterCodingException -> 0x011f }
            r1.<init>(r0)     // Catch:{ CharacterCodingException -> 0x011f }
            com.facebook.react.bridge.Callback r2 = r12.f6766A     // Catch:{ CharacterCodingException -> 0x011f }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ CharacterCodingException -> 0x011f }
            r3[r7] = r6     // Catch:{ CharacterCodingException -> 0x011f }
            r3[r8] = r4     // Catch:{ CharacterCodingException -> 0x011f }
            r3[r9] = r1     // Catch:{ CharacterCodingException -> 0x011f }
            r2.invoke(r3)     // Catch:{ CharacterCodingException -> 0x011f }
            goto L_0x0157
        L_0x011f:
            com.RNFetchBlob.g$f r1 = r12.f6772G     // Catch:{ IOException -> 0x014a }
            com.RNFetchBlob.g$f r2 = com.RNFetchBlob.C2290g.C2296f.UTF8     // Catch:{ IOException -> 0x014a }
            if (r1 != r2) goto L_0x0138
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x014a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x014a }
            com.facebook.react.bridge.Callback r0 = r12.f6766A     // Catch:{ IOException -> 0x014a }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x014a }
            r2[r7] = r6     // Catch:{ IOException -> 0x014a }
            r2[r8] = r4     // Catch:{ IOException -> 0x014a }
            r2[r9] = r1     // Catch:{ IOException -> 0x014a }
            r0.invoke(r2)     // Catch:{ IOException -> 0x014a }
            goto L_0x0157
        L_0x0138:
            com.facebook.react.bridge.Callback r1 = r12.f6766A     // Catch:{ IOException -> 0x014a }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x014a }
            r2[r7] = r6     // Catch:{ IOException -> 0x014a }
            r2[r8] = r10     // Catch:{ IOException -> 0x014a }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ IOException -> 0x014a }
            r2[r9] = r0     // Catch:{ IOException -> 0x014a }
            r1.invoke(r2)     // Catch:{ IOException -> 0x014a }
            goto L_0x0157
        L_0x014a:
            com.facebook.react.bridge.Callback r0 = r12.f6766A
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r2 = "RNFetchBlob failed to encode response data to BASE64 string."
            r1[r7] = r2
            r1[r8] = r6
            r0.invoke(r1)
        L_0x0157:
            okhttp3.ResponseBody r13 = r13.body()
            r13.close()
            r12.m9603m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2290g.m9594d(okhttp3.Response):void");
    }

    /* renamed from: e */
    private void m9595e(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) C2264RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobState", writableMap);
    }

    /* renamed from: f */
    public static OkHttpClient.Builder m9596f(OkHttpClient.Builder builder) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && i <= 19) {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                SSLContext instance2 = SSLContext.getInstance("SSL");
                instance2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                builder.sslSocketFactory(instance2.getSocketFactory(), x509TrustManager);
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e) {
                C6071a.m22876j("OkHttpClientProvider", "Error while enabling TLS 1.2", e);
            }
        }
        return builder;
    }

    /* renamed from: g */
    private String m9597g(HashMap<String, String> hashMap, String str) {
        String str2 = hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = hashMap.get(str.toLowerCase());
        return str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
    }

    /* renamed from: h */
    private String m9598h(Headers headers, String str) {
        String str2 = headers.get(str);
        return str2 != null ? str2 : headers.get(str.toLowerCase()) == null ? HttpUrl.FRAGMENT_ENCODE_SET : headers.get(str.toLowerCase());
    }

    /* renamed from: i */
    public static C2288f m9599i(String str) {
        if (!f6763p.containsKey(str)) {
            return null;
        }
        return f6763p.get(str);
    }

    /* renamed from: j */
    public static C2288f m9600j(String str) {
        if (!f6764q.containsKey(str)) {
            return null;
        }
        return f6764q.get(str);
    }

    /* renamed from: k */
    private WritableMap m9601k(Response response, boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("status", response.code());
        createMap.putString("state", "2");
        createMap.putString("taskId", this.f6778t);
        createMap.putBoolean("timeout", this.f6774I);
        WritableMap createMap2 = Arguments.createMap();
        for (int i = 0; i < response.headers().size(); i++) {
            createMap2.putString(response.headers().name(i), response.headers().value(i));
        }
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it = this.f6775J.iterator();
        while (it.hasNext()) {
            createArray.pushString(it.next());
        }
        createMap.putArray("redirects", createArray);
        createMap.putMap("headers", createMap2);
        Headers headers = response.headers();
        createMap.putString("respType", z ? "blob" : m9598h(headers, "content-type").equalsIgnoreCase("text/") ? "text" : m9598h(headers, "content-type").contains("application/json") ? "json" : HttpUrl.FRAGMENT_ENCODE_SET);
        return createMap;
    }

    /* renamed from: l */
    private boolean m9602l(Response response) {
        boolean z;
        String h = m9598h(response.headers(), "Content-Type");
        boolean z2 = !h.equalsIgnoreCase("text/");
        boolean z3 = !h.equalsIgnoreCase("application/json");
        if (this.f6777s.f6741n != null) {
            int i = 0;
            while (true) {
                if (i >= this.f6777s.f6741n.size()) {
                    break;
                } else if (h.toLowerCase().contains(this.f6777s.f6741n.getString(i).toLowerCase())) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            return (z3 && !z2) || z;
        }
        z = false;
        if (z3) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m9603m() {
        if (f6761f.containsKey(this.f6778t)) {
            f6761f.remove(this.f6778t);
        }
        if (f6762o.containsKey(this.f6778t)) {
            f6762o.remove(this.f6778t);
        }
        if (f6764q.containsKey(this.f6778t)) {
            f6764q.remove(this.f6778t);
        }
        if (f6763p.containsKey(this.f6778t)) {
            f6763p.remove(this.f6778t);
        }
        C2278a aVar = this.f6769D;
        if (aVar != null) {
            aVar.mo7635b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0107 A[SYNTHETIC, Splitter:B:30:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            java.lang.String r14 = "mime"
            java.lang.String r0 = r15.getAction()
            java.lang.String r1 = "android.intent.action.DOWNLOAD_COMPLETE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0167
            com.facebook.react.bridge.ReactApplicationContext r0 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext
            android.content.Context r0 = r0.getApplicationContext()
            android.os.Bundle r15 = r15.getExtras()
            java.lang.String r1 = "extra_download_id"
            long r1 = r15.getLong(r1)
            long r3 = r13.f6768C
            int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r15 != 0) goto L_0x0167
            r13.m9603m()
            android.app.DownloadManager$Query r15 = new android.app.DownloadManager$Query
            r15.<init>()
            r1 = 1
            long[] r2 = new long[r1]
            long r3 = r13.f6768C
            r5 = 0
            r2[r5] = r3
            r15.setFilterById(r2)
            java.lang.String r2 = "download"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.app.DownloadManager r2 = (android.app.DownloadManager) r2
            r2.query(r15)
            android.database.Cursor r15 = r2.query(r15)
            java.lang.String r2 = "Download manager failed to download from  "
            r3 = 3
            r4 = 2
            r6 = 0
            if (r15 != 0) goto L_0x0071
            com.facebook.react.bridge.Callback r14 = r13.f6766A
            java.lang.Object[] r15 = new java.lang.Object[r3]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r13.f6780v
            r0.append(r2)
            java.lang.String r2 = ". Query was unsuccessful "
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r15[r5] = r0
            r15[r1] = r6
            r15[r4] = r6
            r14.invoke(r15)
            return
        L_0x0071:
            boolean r7 = r15.moveToFirst()     // Catch:{ all -> 0x0162 }
            if (r7 == 0) goto L_0x00f7
            java.lang.String r7 = "status"
            int r7 = r15.getColumnIndex(r7)     // Catch:{ all -> 0x0162 }
            int r7 = r15.getInt(r7)     // Catch:{ all -> 0x0162 }
            r8 = 16
            if (r7 != r8) goto L_0x00af
            com.facebook.react.bridge.Callback r14 = r13.f6766A     // Catch:{ all -> 0x0162 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r3.<init>()     // Catch:{ all -> 0x0162 }
            r3.append(r2)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = r13.f6780v     // Catch:{ all -> 0x0162 }
            r3.append(r2)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = ". Status Code = "
            r3.append(r2)     // Catch:{ all -> 0x0162 }
            r3.append(r7)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0162 }
            r0[r5] = r2     // Catch:{ all -> 0x0162 }
            r0[r1] = r6     // Catch:{ all -> 0x0162 }
            r0[r4] = r6     // Catch:{ all -> 0x0162 }
            r14.invoke(r0)     // Catch:{ all -> 0x0162 }
            r15.close()
            return
        L_0x00af:
            java.lang.String r2 = "local_uri"
            int r2 = r15.getColumnIndex(r2)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = r15.getString(r2)     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x00f7
            com.RNFetchBlob.b r7 = r13.f6777s     // Catch:{ all -> 0x0162 }
            com.facebook.react.bridge.ReadableMap r7 = r7.f6731d     // Catch:{ all -> 0x0162 }
            boolean r7 = r7.hasKey(r14)     // Catch:{ all -> 0x0162 }
            if (r7 == 0) goto L_0x00f7
            com.RNFetchBlob.b r7 = r13.f6777s     // Catch:{ all -> 0x0162 }
            com.facebook.react.bridge.ReadableMap r7 = r7.f6731d     // Catch:{ all -> 0x0162 }
            java.lang.String r14 = r7.getString(r14)     // Catch:{ all -> 0x0162 }
            java.lang.String r7 = "image"
            boolean r14 = r14.contains(r7)     // Catch:{ all -> 0x0162 }
            if (r14 == 0) goto L_0x00f7
            android.net.Uri r8 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x0162 }
            android.content.ContentResolver r7 = r0.getContentResolver()     // Catch:{ all -> 0x0162 }
            java.lang.String r14 = "_data"
            java.lang.String[] r9 = new java.lang.String[]{r14}     // Catch:{ all -> 0x0162 }
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r14 = r7.query(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0162 }
            if (r14 == 0) goto L_0x00f7
            r14.moveToFirst()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r14.getString(r5)     // Catch:{ all -> 0x0162 }
            r14.close()     // Catch:{ all -> 0x0162 }
            goto L_0x00f8
        L_0x00f7:
            r0 = r6
        L_0x00f8:
            r15.close()
            com.RNFetchBlob.b r14 = r13.f6777s
            com.facebook.react.bridge.ReadableMap r14 = r14.f6731d
            java.lang.String r15 = "path"
            boolean r14 = r14.hasKey(r15)
            if (r14 == 0) goto L_0x0144
            com.RNFetchBlob.b r14 = r13.f6777s     // Catch:{ Exception -> 0x0130 }
            com.facebook.react.bridge.ReadableMap r14 = r14.f6731d     // Catch:{ Exception -> 0x0130 }
            java.lang.String r14 = r14.getString(r15)     // Catch:{ Exception -> 0x0130 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0130 }
            r0.<init>(r14)     // Catch:{ Exception -> 0x0130 }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x0130 }
            if (r0 == 0) goto L_0x0128
            com.facebook.react.bridge.Callback r0 = r13.f6766A     // Catch:{ Exception -> 0x0130 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0130 }
            r2[r5] = r6     // Catch:{ Exception -> 0x0130 }
            r2[r1] = r15     // Catch:{ Exception -> 0x0130 }
            r2[r4] = r14     // Catch:{ Exception -> 0x0130 }
            r0.invoke(r2)     // Catch:{ Exception -> 0x0130 }
            goto L_0x0167
        L_0x0128:
            java.lang.Exception r14 = new java.lang.Exception     // Catch:{ Exception -> 0x0130 }
            java.lang.String r15 = "Download manager download failed, the file does not downloaded to destination."
            r14.<init>(r15)     // Catch:{ Exception -> 0x0130 }
            throw r14     // Catch:{ Exception -> 0x0130 }
        L_0x0130:
            r14 = move-exception
            r14.printStackTrace()
            com.facebook.react.bridge.Callback r15 = r13.f6766A
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r14 = r14.getLocalizedMessage()
            r0[r5] = r14
            r0[r1] = r6
            r15.invoke(r0)
            goto L_0x0167
        L_0x0144:
            com.facebook.react.bridge.Callback r14 = r13.f6766A
            if (r0 != 0) goto L_0x0156
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "Download manager could not resolve downloaded file path."
            r0[r5] = r2
            r0[r1] = r15
            r0[r4] = r6
            r14.invoke(r0)
            goto L_0x0167
        L_0x0156:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r5] = r6
            r2[r1] = r15
            r2[r4] = r0
            r14.invoke(r2)
            goto L_0x0167
        L_0x0162:
            r14 = move-exception
            r15.close()
            throw r14
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2290g.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x02d6 A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x033d A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03e6 A[Catch:{ Exception -> 0x0476 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x042c A[Catch:{ Exception -> 0x0476 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = ";base64"
            java.lang.String r3 = "post"
            java.lang.String r4 = "Content-Type"
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            java.lang.String r5 = "path"
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0118
            java.lang.String r8 = "useDownloadManager"
            boolean r0 = r0.hasKey(r8)
            if (r0 == 0) goto L_0x0118
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            boolean r0 = r0.getBoolean(r8)
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = r1.f6780v
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.app.DownloadManager$Request r2 = new android.app.DownloadManager$Request
            r2.<init>(r0)
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            java.lang.String r3 = "notification"
            boolean r0 = r0.hasKey(r3)
            if (r0 == 0) goto L_0x0049
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            boolean r0 = r0.getBoolean(r3)
            if (r0 == 0) goto L_0x0049
            r2.setNotificationVisibility(r7)
            goto L_0x004c
        L_0x0049:
            r2.setNotificationVisibility(r6)
        L_0x004c:
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            java.lang.String r3 = "title"
            boolean r0 = r0.hasKey(r3)
            if (r0 == 0) goto L_0x0063
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            java.lang.String r0 = r0.getString(r3)
            r2.setTitle(r0)
        L_0x0063:
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            java.lang.String r3 = "description"
            boolean r0 = r0.hasKey(r3)
            if (r0 == 0) goto L_0x007a
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            java.lang.String r0 = r0.getString(r3)
            r2.setDescription(r0)
        L_0x007a:
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            boolean r0 = r0.hasKey(r5)
            if (r0 == 0) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "file://"
            r0.append(r3)
            com.RNFetchBlob.b r3 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r3 = r3.f6731d
            java.lang.String r3 = r3.getString(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.setDestinationUri(r0)
        L_0x00a4:
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            java.lang.String r3 = "mime"
            boolean r0 = r0.hasKey(r3)
            if (r0 == 0) goto L_0x00bb
            com.RNFetchBlob.b r0 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r0 = r0.f6731d
            java.lang.String r0 = r0.getString(r3)
            r2.setMimeType(r0)
        L_0x00bb:
            com.facebook.react.bridge.ReadableMap r0 = r1.f6784z
            com.facebook.react.bridge.ReadableMapKeySetIterator r0 = r0.keySetIterator()
            com.RNFetchBlob.b r3 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r3 = r3.f6731d
            java.lang.String r4 = "mediaScannable"
            boolean r3 = r3.hasKey(r4)
            if (r3 == 0) goto L_0x00da
            com.RNFetchBlob.b r3 = r1.f6777s
            com.facebook.react.bridge.ReadableMap r3 = r3.f6731d
            boolean r3 = r3.hasKey(r4)
            if (r3 == 0) goto L_0x00da
            r2.allowScanningByMediaScanner()
        L_0x00da:
            boolean r3 = r0.hasNextKey()
            if (r3 == 0) goto L_0x00ee
            java.lang.String r3 = r0.nextKey()
            com.facebook.react.bridge.ReadableMap r4 = r1.f6784z
            java.lang.String r4 = r4.getString(r3)
            r2.addRequestHeader(r3, r4)
            goto L_0x00da
        L_0x00ee:
            com.facebook.react.bridge.ReactApplicationContext r0 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r3 = "download"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.app.DownloadManager r3 = (android.app.DownloadManager) r3
            long r2 = r3.enqueue(r2)
            r1.f6768C = r2
            java.util.HashMap<java.lang.String, java.lang.Long> r4 = f6762o
            java.lang.String r5 = r1.f6778t
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r5, r2)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.DOWNLOAD_COMPLETE"
            r2.<init>(r3)
            r0.registerReceiver(r1, r2)
            return
        L_0x0118:
            java.lang.String r0 = r1.f6778t
            com.RNFetchBlob.b r8 = r1.f6777s
            java.lang.String r8 = r8.f6730c
            boolean r8 = r8.isEmpty()
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x0128
            r8 = r9
            goto L_0x013d
        L_0x0128:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "."
            r8.append(r10)
            com.RNFetchBlob.b r10 = r1.f6777s
            java.lang.String r10 = r10.f6730c
            r8.append(r10)
            java.lang.String r8 = r8.toString()
        L_0x013d:
            com.RNFetchBlob.b r10 = r1.f6777s
            java.lang.String r10 = r10.f6734g
            r11 = 3
            r12 = 0
            r13 = 0
            if (r10 == 0) goto L_0x017e
            java.lang.String r0 = com.RNFetchBlob.C2298h.m9608b(r10)
            if (r0 != 0) goto L_0x014e
            java.lang.String r0 = r1.f6778t
        L_0x014e:
            java.io.File r10 = new java.io.File
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = com.RNFetchBlob.C2283d.m9570n(r0)
            r14.append(r15)
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            r10.<init>(r14)
            boolean r14 = r10.exists()
            if (r14 == 0) goto L_0x017e
            com.facebook.react.bridge.Callback r0 = r1.f6766A
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r13] = r12
            r2[r7] = r5
            java.lang.String r3 = r10.getAbsolutePath()
            r2[r6] = r3
            r0.invoke(r2)
            return
        L_0x017e:
            com.RNFetchBlob.b r5 = r1.f6777s
            java.lang.String r10 = r5.f6729b
            if (r10 == 0) goto L_0x0187
            r1.f6782x = r10
            goto L_0x01a4
        L_0x0187:
            java.lang.Boolean r5 = r5.f6728a
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x01a4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = com.RNFetchBlob.C2283d.m9570n(r0)
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = r5.toString()
            r1.f6782x = r0
        L_0x01a4:
            com.RNFetchBlob.b r0 = r1.f6777s     // Catch:{ Exception -> 0x0476 }
            java.lang.Boolean r0 = r0.f6732e     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x01b5
            okhttp3.OkHttpClient r0 = r1.f6776K     // Catch:{ Exception -> 0x0476 }
            okhttp3.OkHttpClient$Builder r0 = com.RNFetchBlob.C2298h.m9609c(r0)     // Catch:{ Exception -> 0x0476 }
            goto L_0x01bb
        L_0x01b5:
            okhttp3.OkHttpClient r0 = r1.f6776K     // Catch:{ Exception -> 0x0476 }
            okhttp3.OkHttpClient$Builder r0 = r0.newBuilder()     // Catch:{ Exception -> 0x0476 }
        L_0x01bb:
            r5 = r0
            com.RNFetchBlob.b r0 = r1.f6777s     // Catch:{ Exception -> 0x0476 }
            java.lang.Boolean r0 = r0.f6733f     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x0228
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0476 }
            r8 = 21
            if (r0 < r8) goto L_0x0223
            com.facebook.react.bridge.ReactApplicationContext r0 = com.RNFetchBlob.C2264RNFetchBlob.RCTContext     // Catch:{ Exception -> 0x0476 }
            java.lang.String r8 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r8)     // Catch:{ Exception -> 0x0476 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x0476 }
            android.net.Network[] r8 = r0.getAllNetworks()     // Catch:{ Exception -> 0x0476 }
            int r10 = r8.length     // Catch:{ Exception -> 0x0476 }
            r14 = 0
        L_0x01dc:
            if (r14 >= r10) goto L_0x020c
            r15 = r8[r14]     // Catch:{ Exception -> 0x0476 }
            android.net.NetworkInfo r16 = r0.getNetworkInfo(r15)     // Catch:{ Exception -> 0x0476 }
            android.net.NetworkCapabilities r6 = r0.getNetworkCapabilities(r15)     // Catch:{ Exception -> 0x0476 }
            if (r6 == 0) goto L_0x0208
            if (r16 != 0) goto L_0x01ed
            goto L_0x0208
        L_0x01ed:
            boolean r16 = r16.isConnected()     // Catch:{ Exception -> 0x0476 }
            if (r16 != 0) goto L_0x01f4
            goto L_0x0208
        L_0x01f4:
            boolean r6 = r6.hasTransport(r7)     // Catch:{ Exception -> 0x0476 }
            if (r6 == 0) goto L_0x0208
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY     // Catch:{ Exception -> 0x0476 }
            r5.proxy(r0)     // Catch:{ Exception -> 0x0476 }
            javax.net.SocketFactory r0 = r15.getSocketFactory()     // Catch:{ Exception -> 0x0476 }
            r5.socketFactory(r0)     // Catch:{ Exception -> 0x0476 }
            r0 = 1
            goto L_0x020d
        L_0x0208:
            int r14 = r14 + 1
            r6 = 2
            goto L_0x01dc
        L_0x020c:
            r0 = 0
        L_0x020d:
            if (r0 != 0) goto L_0x0228
            com.facebook.react.bridge.Callback r0 = r1.f6766A     // Catch:{ Exception -> 0x0476 }
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0476 }
            java.lang.String r3 = "No available WiFi connections."
            r2[r13] = r3     // Catch:{ Exception -> 0x0476 }
            r2[r7] = r12     // Catch:{ Exception -> 0x0476 }
            r3 = 2
            r2[r3] = r12     // Catch:{ Exception -> 0x0476 }
            r0.invoke(r2)     // Catch:{ Exception -> 0x0476 }
            r17.m9603m()     // Catch:{ Exception -> 0x0476 }
            return
        L_0x0223:
            java.lang.String r0 = "RNFetchBlob: wifiOnly was set, but SDK < 21. wifiOnly was ignored."
            com.RNFetchBlob.C2298h.m9607a(r0)     // Catch:{ Exception -> 0x0476 }
        L_0x0228:
            okhttp3.Request$Builder r6 = new okhttp3.Request$Builder     // Catch:{ Exception -> 0x0476 }
            r6.<init>()     // Catch:{ Exception -> 0x0476 }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0238 }
            java.lang.String r8 = r1.f6780v     // Catch:{ MalformedURLException -> 0x0238 }
            r0.<init>(r8)     // Catch:{ MalformedURLException -> 0x0238 }
            r6.url((java.net.URL) r0)     // Catch:{ MalformedURLException -> 0x0238 }
            goto L_0x023c
        L_0x0238:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x0476 }
        L_0x023c:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0476 }
            r0.<init>()     // Catch:{ Exception -> 0x0476 }
            com.facebook.react.bridge.ReadableMap r8 = r1.f6784z     // Catch:{ Exception -> 0x0476 }
            if (r8 == 0) goto L_0x0288
            com.facebook.react.bridge.ReadableMapKeySetIterator r8 = r8.keySetIterator()     // Catch:{ Exception -> 0x0476 }
        L_0x0249:
            boolean r10 = r8.hasNextKey()     // Catch:{ Exception -> 0x0476 }
            if (r10 == 0) goto L_0x0288
            java.lang.String r10 = r8.nextKey()     // Catch:{ Exception -> 0x0476 }
            com.facebook.react.bridge.ReadableMap r14 = r1.f6784z     // Catch:{ Exception -> 0x0476 }
            java.lang.String r14 = r14.getString(r10)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r15 = "RNFB-Response"
            boolean r15 = r10.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x0476 }
            if (r15 == 0) goto L_0x0279
            java.lang.String r10 = "base64"
            boolean r10 = r14.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x0476 }
            if (r10 == 0) goto L_0x026e
            com.RNFetchBlob.g$f r10 = com.RNFetchBlob.C2290g.C2296f.BASE64     // Catch:{ Exception -> 0x0476 }
        L_0x026b:
            r1.f6772G = r10     // Catch:{ Exception -> 0x0476 }
            goto L_0x0249
        L_0x026e:
            java.lang.String r10 = "utf8"
            boolean r10 = r14.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x0476 }
            if (r10 == 0) goto L_0x0249
            com.RNFetchBlob.g$f r10 = com.RNFetchBlob.C2290g.C2296f.UTF8     // Catch:{ Exception -> 0x0476 }
            goto L_0x026b
        L_0x0279:
            java.lang.String r15 = r10.toLowerCase()     // Catch:{ Exception -> 0x0476 }
            r6.header(r15, r14)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r10 = r10.toLowerCase()     // Catch:{ Exception -> 0x0476 }
            r0.put(r10, r14)     // Catch:{ Exception -> 0x0476 }
            goto L_0x0249
        L_0x0288:
            java.lang.String r8 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
            boolean r8 = r8.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r10 = "patch"
            java.lang.String r14 = "put"
            java.lang.String r15 = "content-type"
            if (r8 != 0) goto L_0x02ad
            java.lang.String r8 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
            boolean r8 = r8.equalsIgnoreCase(r14)     // Catch:{ Exception -> 0x0476 }
            if (r8 != 0) goto L_0x02ad
            java.lang.String r8 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
            boolean r8 = r8.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x0476 }
            if (r8 == 0) goto L_0x02a7
            goto L_0x02ad
        L_0x02a7:
            com.RNFetchBlob.g$e r2 = com.RNFetchBlob.C2290g.C2295e.WithoutBody     // Catch:{ Exception -> 0x0476 }
        L_0x02a9:
            r1.f6770E = r2     // Catch:{ Exception -> 0x0476 }
            goto L_0x0325
        L_0x02ad:
            java.lang.String r8 = r1.m9597g(r0, r4)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r8 = r8.toLowerCase()     // Catch:{ Exception -> 0x0476 }
            com.facebook.react.bridge.ReadableArray r13 = r1.f6783y     // Catch:{ Exception -> 0x0476 }
            if (r13 == 0) goto L_0x02be
            com.RNFetchBlob.g$e r13 = com.RNFetchBlob.C2290g.C2295e.Form     // Catch:{ Exception -> 0x0476 }
        L_0x02bb:
            r1.f6770E = r13     // Catch:{ Exception -> 0x0476 }
            goto L_0x02d2
        L_0x02be:
            boolean r13 = r8.isEmpty()     // Catch:{ Exception -> 0x0476 }
            if (r13 == 0) goto L_0x02d2
            boolean r13 = r8.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0476 }
            if (r13 != 0) goto L_0x02cf
            java.lang.String r13 = "application/octet-stream"
            r6.header(r4, r13)     // Catch:{ Exception -> 0x0476 }
        L_0x02cf:
            com.RNFetchBlob.g$e r13 = com.RNFetchBlob.C2290g.C2295e.SingleFile     // Catch:{ Exception -> 0x0476 }
            goto L_0x02bb
        L_0x02d2:
            java.lang.String r13 = r1.f6781w     // Catch:{ Exception -> 0x0476 }
            if (r13 == 0) goto L_0x0325
            java.lang.String r12 = "RNFetchBlob-file://"
            boolean r12 = r13.startsWith(r12)     // Catch:{ Exception -> 0x0476 }
            if (r12 != 0) goto L_0x0322
            java.lang.String r12 = r1.f6781w     // Catch:{ Exception -> 0x0476 }
            java.lang.String r13 = "RNFetchBlob-content://"
            boolean r12 = r12.startsWith(r13)     // Catch:{ Exception -> 0x0476 }
            if (r12 == 0) goto L_0x02e9
            goto L_0x0322
        L_0x02e9:
            java.lang.String r12 = r8.toLowerCase()     // Catch:{ Exception -> 0x0476 }
            boolean r12 = r12.contains(r2)     // Catch:{ Exception -> 0x0476 }
            if (r12 != 0) goto L_0x0303
            java.lang.String r12 = r8.toLowerCase()     // Catch:{ Exception -> 0x0476 }
            java.lang.String r13 = "application/octet"
            boolean r12 = r12.startsWith(r13)     // Catch:{ Exception -> 0x0476 }
            if (r12 == 0) goto L_0x0300
            goto L_0x0303
        L_0x0300:
            com.RNFetchBlob.g$e r2 = com.RNFetchBlob.C2290g.C2295e.AsIs     // Catch:{ Exception -> 0x0476 }
            goto L_0x02a9
        L_0x0303:
            java.lang.String r2 = r8.replace(r2, r9)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r8 = ";BASE64"
            java.lang.String r2 = r2.replace(r8, r9)     // Catch:{ Exception -> 0x0476 }
            boolean r8 = r0.containsKey(r15)     // Catch:{ Exception -> 0x0476 }
            if (r8 == 0) goto L_0x0316
            r0.put(r15, r2)     // Catch:{ Exception -> 0x0476 }
        L_0x0316:
            boolean r8 = r0.containsKey(r4)     // Catch:{ Exception -> 0x0476 }
            if (r8 == 0) goto L_0x031f
            r0.put(r4, r2)     // Catch:{ Exception -> 0x0476 }
        L_0x031f:
            com.RNFetchBlob.g$e r2 = com.RNFetchBlob.C2290g.C2295e.SingleFile     // Catch:{ Exception -> 0x0476 }
            goto L_0x02a9
        L_0x0322:
            com.RNFetchBlob.g$e r2 = com.RNFetchBlob.C2290g.C2295e.SingleFile     // Catch:{ Exception -> 0x0476 }
            goto L_0x02a9
        L_0x0325:
            java.lang.String r2 = "Transfer-Encoding"
            java.lang.String r2 = r1.m9597g(r0, r2)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r4 = "chunked"
            boolean r2 = r2.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0476 }
            int[] r4 = com.RNFetchBlob.C2290g.C2294d.f6789a     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.g$e r8 = r1.f6770E     // Catch:{ Exception -> 0x0476 }
            int r8 = r8.ordinal()     // Catch:{ Exception -> 0x0476 }
            r4 = r4[r8]     // Catch:{ Exception -> 0x0476 }
            if (r4 == r7) goto L_0x03e6
            r8 = 2
            if (r4 == r8) goto L_0x03be
            if (r4 == r11) goto L_0x0373
            r0 = 4
            if (r4 == r0) goto L_0x0347
            goto L_0x040e
        L_0x0347:
            java.lang.String r0 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x0476 }
            if (r0 != 0) goto L_0x0368
            java.lang.String r0 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0.equalsIgnoreCase(r14)     // Catch:{ Exception -> 0x0476 }
            if (r0 != 0) goto L_0x0368
            java.lang.String r0 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
            boolean r0 = r0.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x0476 }
            if (r0 == 0) goto L_0x0360
            goto L_0x0368
        L_0x0360:
            java.lang.String r0 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
            r2 = 0
        L_0x0363:
            r6.method(r0, r2)     // Catch:{ Exception -> 0x0476 }
            goto L_0x040e
        L_0x0368:
            java.lang.String r0 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
            r2 = 0
            byte[] r3 = new byte[r2]     // Catch:{ Exception -> 0x0476 }
            r2 = 0
            okhttp3.RequestBody r2 = okhttp3.RequestBody.create((okhttp3.MediaType) r2, (byte[]) r3)     // Catch:{ Exception -> 0x0476 }
            goto L_0x0363
        L_0x0373:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r0.<init>()     // Catch:{ Exception -> 0x0476 }
            java.lang.String r3 = "RNFetchBlob-"
            r0.append(r3)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r3 = r1.f6778t     // Catch:{ Exception -> 0x0476 }
            r0.append(r3)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r3 = new com.RNFetchBlob.a     // Catch:{ Exception -> 0x0476 }
            java.lang.String r4 = r1.f6778t     // Catch:{ Exception -> 0x0476 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r2 = r3.mo7634a(r2)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.g$e r3 = r1.f6770E     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r2 = r2.mo7641l(r3)     // Catch:{ Exception -> 0x0476 }
            com.facebook.react.bridge.ReadableArray r3 = r1.f6783y     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r2 = r2.mo7638i(r3)     // Catch:{ Exception -> 0x0476 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0476 }
            r3.<init>()     // Catch:{ Exception -> 0x0476 }
            java.lang.String r4 = "multipart/form-data; boundary="
            r3.append(r4)     // Catch:{ Exception -> 0x0476 }
            r3.append(r0)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0476 }
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r0 = r2.mo7640k(r0)     // Catch:{ Exception -> 0x0476 }
            r1.f6769D = r0     // Catch:{ Exception -> 0x0476 }
            java.lang.String r2 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
        L_0x03ba:
            r6.method(r2, r0)     // Catch:{ Exception -> 0x0476 }
            goto L_0x040e
        L_0x03be:
            com.RNFetchBlob.a r3 = new com.RNFetchBlob.a     // Catch:{ Exception -> 0x0476 }
            java.lang.String r4 = r1.f6778t     // Catch:{ Exception -> 0x0476 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r2 = r3.mo7634a(r2)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.g$e r3 = r1.f6770E     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r2 = r2.mo7641l(r3)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r3 = r1.f6781w     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r2 = r2.mo7639j(r3)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = r1.m9597g(r0, r15)     // Catch:{ Exception -> 0x0476 }
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r0 = r2.mo7640k(r0)     // Catch:{ Exception -> 0x0476 }
            r1.f6769D = r0     // Catch:{ Exception -> 0x0476 }
            java.lang.String r2 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
            goto L_0x03ba
        L_0x03e6:
            com.RNFetchBlob.a r3 = new com.RNFetchBlob.a     // Catch:{ Exception -> 0x0476 }
            java.lang.String r4 = r1.f6778t     // Catch:{ Exception -> 0x0476 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r2 = r3.mo7634a(r2)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.g$e r3 = r1.f6770E     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r2 = r2.mo7641l(r3)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r3 = r1.f6781w     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r2 = r2.mo7639j(r3)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r0 = r1.m9597g(r0, r15)     // Catch:{ Exception -> 0x0476 }
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.a r0 = r2.mo7640k(r0)     // Catch:{ Exception -> 0x0476 }
            r1.f6769D = r0     // Catch:{ Exception -> 0x0476 }
            java.lang.String r2 = r1.f6779u     // Catch:{ Exception -> 0x0476 }
            goto L_0x03ba
        L_0x040e:
            okhttp3.Request r0 = r6.build()     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.g$a r2 = new com.RNFetchBlob.g$a     // Catch:{ Exception -> 0x0476 }
            r2.<init>()     // Catch:{ Exception -> 0x0476 }
            r5.addNetworkInterceptor(r2)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.g$b r2 = new com.RNFetchBlob.g$b     // Catch:{ Exception -> 0x0476 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0476 }
            r5.addInterceptor(r2)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.b r2 = r1.f6777s     // Catch:{ Exception -> 0x0476 }
            long r2 = r2.f6738k     // Catch:{ Exception -> 0x0476 }
            r8 = 0
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0438
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0476 }
            r5.connectTimeout(r2, r4)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.b r2 = r1.f6777s     // Catch:{ Exception -> 0x0476 }
            long r2 = r2.f6738k     // Catch:{ Exception -> 0x0476 }
            r5.readTimeout(r2, r4)     // Catch:{ Exception -> 0x0476 }
        L_0x0438:
            okhttp3.ConnectionPool r2 = f6765r     // Catch:{ Exception -> 0x0476 }
            r5.connectionPool(r2)     // Catch:{ Exception -> 0x0476 }
            r2 = 0
            r5.retryOnConnectionFailure(r2)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.b r2 = r1.f6777s     // Catch:{ Exception -> 0x0476 }
            java.lang.Boolean r2 = r2.f6740m     // Catch:{ Exception -> 0x0476 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0476 }
            r5.followRedirects(r2)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.b r2 = r1.f6777s     // Catch:{ Exception -> 0x0476 }
            java.lang.Boolean r2 = r2.f6740m     // Catch:{ Exception -> 0x0476 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0476 }
            r5.followSslRedirects(r2)     // Catch:{ Exception -> 0x0476 }
            r5.retryOnConnectionFailure(r7)     // Catch:{ Exception -> 0x0476 }
            okhttp3.OkHttpClient$Builder r2 = m9596f(r5)     // Catch:{ Exception -> 0x0476 }
            okhttp3.OkHttpClient r2 = r2.build()     // Catch:{ Exception -> 0x0476 }
            okhttp3.Call r0 = r2.newCall(r0)     // Catch:{ Exception -> 0x0476 }
            java.util.HashMap<java.lang.String, okhttp3.Call> r2 = f6761f     // Catch:{ Exception -> 0x0476 }
            java.lang.String r3 = r1.f6778t     // Catch:{ Exception -> 0x0476 }
            r2.put(r3, r0)     // Catch:{ Exception -> 0x0476 }
            com.RNFetchBlob.g$c r2 = new com.RNFetchBlob.g$c     // Catch:{ Exception -> 0x0476 }
            r2.<init>()     // Catch:{ Exception -> 0x0476 }
            r0.enqueue(r2)     // Catch:{ Exception -> 0x0476 }
            goto L_0x04a3
        L_0x0476:
            r0 = move-exception
            r0.printStackTrace()
            r17.m9603m()
            com.facebook.react.bridge.Callback r2 = r1.f6766A
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "RNFetchBlob request error: "
            r4.append(r5)
            java.lang.String r5 = r0.getMessage()
            r4.append(r5)
            java.lang.Throwable r0 = r0.getCause()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r4 = 0
            r3[r4] = r0
            r2.invoke(r3)
        L_0x04a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.C2290g.run():void");
    }
}
