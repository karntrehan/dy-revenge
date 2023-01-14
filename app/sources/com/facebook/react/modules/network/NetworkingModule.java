package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C2697g;
import com.facebook.react.common.p112k.C2701a;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.p109b0.p110a.C2639a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p174e.p247e.p253d.p258e.C6071a;
import p493i.C10616i;
import p493i.C10622n;
import p493i.C10625q;

@C2639a(name = "Networking")
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "NetworkingModule";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static C2833e customClientBuilder;
    /* access modifiers changed from: private */
    public final OkHttpClient mClient;
    private final C2839c mCookieHandler;
    private final C2837a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<C2834f> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    /* access modifiers changed from: private */
    public final List<C2835g> mResponseHandlers;
    /* access modifiers changed from: private */
    public boolean mShuttingDown;
    private final List<C2836h> mUriHandlers;

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$a */
    class C2828a implements Interceptor {

        /* renamed from: a */
        final /* synthetic */ String f7986a;

        /* renamed from: b */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f7987b;

        /* renamed from: c */
        final /* synthetic */ int f7988c;

        /* renamed from: com.facebook.react.modules.network.NetworkingModule$a$a */
        class C2829a implements C2849h {

            /* renamed from: a */
            long f7990a = System.nanoTime();

            C2829a() {
            }

            /* renamed from: a */
            public void mo9204a(long j, long j2, boolean z) {
                long nanoTime = System.nanoTime();
                if ((z || NetworkingModule.shouldDispatch(nanoTime, this.f7990a)) && !C2828a.this.f7986a.equals("text")) {
                    C2828a aVar = C2828a.this;
                    C2858n.m11326c(aVar.f7987b, aVar.f7988c, j, j2);
                    this.f7990a = nanoTime;
                }
            }
        }

        C2828a(String str, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
            this.f7986a = str;
            this.f7987b = rCTDeviceEventEmitter;
            this.f7988c = i;
        }

        public Response intercept(Interceptor.Chain chain) {
            Response proceed = chain.proceed(chain.request());
            return proceed.newBuilder().body(new C2852j(proceed.body(), new C2829a())).build();
        }
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$b */
    class C2830b implements Callback {

        /* renamed from: a */
        final /* synthetic */ int f7992a;

        /* renamed from: b */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f7993b;

        /* renamed from: c */
        final /* synthetic */ String f7994c;

        /* renamed from: d */
        final /* synthetic */ boolean f7995d;

        C2830b(int i, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, String str, boolean z) {
            this.f7992a = i;
            this.f7993b = rCTDeviceEventEmitter;
            this.f7994c = str;
            this.f7995d = z;
        }

        public void onFailure(Call call, IOException iOException) {
            String str;
            if (!NetworkingModule.this.mShuttingDown) {
                NetworkingModule.this.removeRequest(this.f7992a);
                if (iOException.getMessage() != null) {
                    str = iOException.getMessage();
                } else {
                    str = "Error while executing request: " + iOException.getClass().getSimpleName();
                }
                C2858n.m11329f(this.f7993b, this.f7992a, str, iOException);
            }
        }

        public void onResponse(Call call, Response response) {
            if (!NetworkingModule.this.mShuttingDown) {
                NetworkingModule.this.removeRequest(this.f7992a);
                C2858n.m11331h(this.f7993b, this.f7992a, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
                try {
                    ResponseBody body = response.body();
                    if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && body != null) {
                        C10622n nVar = new C10622n(body.source());
                        String header = response.header("Content-Type");
                        body = ResponseBody.create(header != null ? MediaType.parse(header) : null, -1, C10625q.m36156d(nVar));
                    }
                    for (C2835g gVar : NetworkingModule.this.mResponseHandlers) {
                        if (gVar.mo9112b(this.f7994c)) {
                            C2858n.m11324a(this.f7993b, this.f7992a, gVar.mo9111a(body));
                            C2858n.m11330g(this.f7993b, this.f7992a);
                            return;
                        }
                    }
                    if (this.f7995d) {
                        if (this.f7994c.equals("text")) {
                            NetworkingModule.this.readWithProgress(this.f7993b, this.f7992a, body);
                            C2858n.m11330g(this.f7993b, this.f7992a);
                            return;
                        }
                    }
                    String str = HttpUrl.FRAGMENT_ENCODE_SET;
                    if (this.f7994c.equals("text")) {
                        try {
                            str = body.string();
                        } catch (IOException e) {
                            if (!response.request().method().equalsIgnoreCase("HEAD")) {
                                C2858n.m11329f(this.f7993b, this.f7992a, e.getMessage(), e);
                            }
                        }
                    } else if (this.f7994c.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                        str = Base64.encodeToString(body.bytes(), 2);
                    }
                    C2858n.m11325b(this.f7993b, this.f7992a, str);
                    C2858n.m11330g(this.f7993b, this.f7992a);
                } catch (IOException e2) {
                    C2858n.m11329f(this.f7993b, this.f7992a, e2.getMessage(), e2);
                }
            }
        }
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$c */
    class C2831c implements C2849h {

        /* renamed from: a */
        long f7997a = System.nanoTime();

        /* renamed from: b */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f7998b;

        /* renamed from: c */
        final /* synthetic */ int f7999c;

        C2831c(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
            this.f7998b = rCTDeviceEventEmitter;
            this.f7999c = i;
        }

        /* renamed from: a */
        public void mo9204a(long j, long j2, boolean z) {
            long nanoTime = System.nanoTime();
            if (z || NetworkingModule.shouldDispatch(nanoTime, this.f7997a)) {
                C2858n.m11327d(this.f7998b, this.f7999c, j, j2);
                this.f7997a = nanoTime;
            }
        }
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$d */
    class C2832d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ int f8001a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2832d(ReactContext reactContext, int i) {
            super(reactContext);
            this.f8001a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            C2701a.m10935a(NetworkingModule.this.mClient, Integer.valueOf(this.f8001a));
        }
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$e */
    public interface C2833e {
        /* renamed from: a */
        void mo9206a(OkHttpClient.Builder builder);
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$f */
    public interface C2834f {
        /* renamed from: a */
        boolean mo9109a(ReadableMap readableMap);

        /* renamed from: b */
        RequestBody mo9110b(ReadableMap readableMap, String str);
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$g */
    public interface C2835g {
        /* renamed from: a */
        WritableMap mo9111a(ResponseBody responseBody);

        /* renamed from: b */
        boolean mo9112b(String str);
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$h */
    public interface C2836h {
        /* renamed from: a */
        WritableMap mo9107a(Uri uri);

        /* renamed from: b */
        boolean mo9108b(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, (String) null, C2848g.m11299b(reactApplicationContext), (List<C2846e>) null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, C2848g.m11299b(reactApplicationContext), (List<C2846e>) null);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, (List<C2846e>) null);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<C2846e> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            for (C2846e create : list) {
                newBuilder.addNetworkInterceptor(create.create());
            }
            okHttpClient = newBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new C2839c(reactApplicationContext);
        this.mCookieJarContainer = (C2837a) okHttpClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<C2846e> list) {
        this(reactApplicationContext, (String) null, C2848g.m11299b(reactApplicationContext), list);
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
        C2833e eVar = customClientBuilder;
        if (eVar != null) {
            eVar.mo9206a(builder);
        }
    }

    private synchronized void cancelAllRequests() {
        for (Integer intValue : this.mRequestIds) {
            cancelRequest(intValue.intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(int i) {
        new C2832d(getReactApplicationContext(), i).execute(new Void[0]);
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i) {
        String str2;
        MediaType mediaType;
        RequestBody a;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("constructMultipartBody");
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        int i2 = 0;
        while (i2 < size) {
            ReadableMap map = readableArray.getMap(i2);
            Headers extractHeaders = extractHeaders(map.getArray("headers"), (ReadableMap) null);
            if (extractHeaders == null) {
                str2 = "Missing or invalid header format for FormData part.";
            } else {
                String str3 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                if (str3 != null) {
                    mediaType = MediaType.parse(str3);
                    extractHeaders = extractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
                } else {
                    mediaType = null;
                }
                if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                    a = RequestBody.create(mediaType, map.getString(REQUEST_BODY_KEY_STRING));
                } else if (!map.hasKey(REQUEST_BODY_KEY_URI)) {
                    C2858n.m11329f(eventEmitter, i, "Unrecognized FormData part.", (Throwable) null);
                    i2++;
                } else if (mediaType == null) {
                    str2 = "Binary FormData part needs a content-type header.";
                } else {
                    String string = map.getString(REQUEST_BODY_KEY_URI);
                    InputStream f = C2856m.m11322f(getReactApplicationContext(), string);
                    if (f == null) {
                        str2 = "Could not retrieve file for uri " + string;
                    } else {
                        a = C2856m.m11317a(mediaType, f);
                    }
                }
                builder.addPart(extractHeaders, a);
                i2++;
            }
            C2858n.m11329f(eventEmitter, i, str2, (Throwable) null);
            return null;
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            ReadableArray array = readableArray.getArray(i);
            if (array != null && array.size() == 2) {
                String a = C2845d.m11295a(array.getString(0));
                String b = C2845d.m11296b(array.getString(1));
                if (!(a == null || b == null)) {
                    builder.add(a, b);
                    i++;
                }
            }
            return null;
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            builder.add(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap != null && readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            z = true;
        }
        if (!z) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(String str) {
        if (getReactApplicationContextIfActiveOrWarn() != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, ResponseBody responseBody) {
        long j;
        long j2 = -1;
        try {
            C2852j jVar = (C2852j) responseBody;
            j = jVar.mo9227A();
            try {
                j2 = jVar.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        C2854k kVar = new C2854k(responseBody.contentType() == null ? C2697g.f7788a : responseBody.contentType().charset(C2697g.f7788a));
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    C2858n.m11328e(rCTDeviceEventEmitter, i, kVar.mo9228a(bArr, read), j, j2);
                } else {
                    return;
                }
            }
        } finally {
            byteStream.close();
        }
    }

    /* access modifiers changed from: private */
    public synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    public static void setCustomClientBuilder(C2833e eVar) {
        customClientBuilder = eVar;
    }

    /* access modifiers changed from: private */
    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    /* access modifiers changed from: private */
    public static WritableMap translateHeaders(Headers headers) {
        String str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < headers.size(); i++) {
            String name = headers.name(i);
            if (bundle.containsKey(name)) {
                str = bundle.getString(name) + ", " + headers.value(i);
            } else {
                str = headers.value(i);
            }
            bundle.putString(name, str);
        }
        return Arguments.fromBundle(bundle);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        if (requestBody == null) {
            return null;
        }
        return C2856m.m11319c(requestBody, new C2831c(rCTDeviceEventEmitter, i));
    }

    public void abortRequest(double d) {
        int i = (int) d;
        cancelRequest(i);
        removeRequest(i);
    }

    public void addListener(String str) {
    }

    public void addRequestBodyHandler(C2834f fVar) {
        this.mRequestBodyHandlers.add(fVar);
    }

    public void addResponseHandler(C2835g gVar) {
        this.mResponseHandlers.add(gVar);
    }

    public void addUriHandler(C2836h hVar) {
        this.mUriHandlers.add(hVar);
    }

    @ReactMethod
    public void clearCookies(com.facebook.react.bridge.Callback callback) {
        this.mCookieHandler.mo9214f(callback);
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        this.mCookieJarContainer.mo9208b(new JavaNetCookieJar(this.mCookieHandler));
    }

    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.mo9216h();
        this.mCookieJarContainer.mo9207a();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    public void removeListeners(double d) {
    }

    public void removeRequestBodyHandler(C2834f fVar) {
        this.mRequestBodyHandlers.remove(fVar);
    }

    public void removeResponseHandler(C2835g gVar) {
        this.mResponseHandlers.remove(gVar);
    }

    public void removeUriHandler(C2836h hVar) {
        this.mUriHandlers.remove(hVar);
    }

    public void sendRequest(String str, String str2, double d, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d2, boolean z2) {
        int i = (int) d;
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, (int) d2, z2);
        } catch (Throwable th) {
            Throwable th2 = th;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to send url request: ");
            String str4 = str2;
            sb.append(str2);
            C6071a.m22876j(TAG, sb.toString(), th2);
            DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequest error");
            if (eventEmitter != null) {
                C2858n.m11329f(eventEmitter, i, th2.getMessage(), th2);
            }
        }
    }

    public void sendRequestInternal(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i2, boolean z2) {
        C2834f fVar;
        RequestBody requestBody;
        int i3 = i;
        ReadableMap readableMap2 = readableMap;
        String str4 = str3;
        int i4 = i2;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequestInternal");
        try {
            Uri parse = Uri.parse(str2);
            for (C2836h next : this.mUriHandlers) {
                if (next.mo9108b(parse, str4)) {
                    C2858n.m11324a(eventEmitter, i3, next.mo9107a(parse));
                    C2858n.m11330g(eventEmitter, i3);
                    return;
                }
            }
            try {
                String str5 = str2;
                Request.Builder url = new Request.Builder().url(str2);
                if (i3 != 0) {
                    url.tag(Integer.valueOf(i));
                }
                OkHttpClient.Builder newBuilder = this.mClient.newBuilder();
                applyCustomBuilder(newBuilder);
                if (!z2) {
                    newBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z) {
                    newBuilder.addNetworkInterceptor(new C2828a(str4, eventEmitter, i3));
                }
                if (i4 != this.mClient.connectTimeoutMillis()) {
                    newBuilder.connectTimeout((long) i4, TimeUnit.MILLISECONDS);
                }
                OkHttpClient build = newBuilder.build();
                Headers extractHeaders = extractHeaders(readableArray, readableMap2);
                if (extractHeaders == null) {
                    C2858n.m11329f(eventEmitter, i3, "Unrecognized headers format", (Throwable) null);
                    return;
                }
                String str6 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                String str7 = extractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                url.headers(extractHeaders);
                if (readableMap2 != null) {
                    Iterator<C2834f> it = this.mRequestBodyHandlers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        fVar = it.next();
                        if (fVar.mo9109a(readableMap2)) {
                            break;
                        }
                    }
                }
                fVar = null;
                if (readableMap2 != null && !str.toLowerCase().equals("get") && !str.toLowerCase().equals("head")) {
                    if (fVar != null) {
                        requestBody = fVar.mo9110b(readableMap2, str6);
                    } else if (readableMap2.hasKey(REQUEST_BODY_KEY_STRING)) {
                        if (str6 == null) {
                            C2858n.m11329f(eventEmitter, i3, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        String string = readableMap2.getString(REQUEST_BODY_KEY_STRING);
                        MediaType parse2 = MediaType.parse(str6);
                        if (C2856m.m11323g(str7)) {
                            requestBody = C2856m.m11318b(parse2, string);
                            if (requestBody == null) {
                                C2858n.m11329f(eventEmitter, i3, "Failed to gzip request body", (Throwable) null);
                                return;
                            }
                        } else {
                            Charset charset = C2697g.f7788a;
                            if (parse2 != null) {
                                charset = parse2.charset(charset);
                            }
                            requestBody = RequestBody.create(parse2, string.getBytes(charset));
                        }
                    } else if (readableMap2.hasKey(REQUEST_BODY_KEY_BASE64)) {
                        if (str6 == null) {
                            C2858n.m11329f(eventEmitter, i3, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        } else {
                            requestBody = RequestBody.create(MediaType.parse(str6), C10616i.m36109h(readableMap2.getString(REQUEST_BODY_KEY_BASE64)));
                        }
                    } else if (readableMap2.hasKey(REQUEST_BODY_KEY_URI)) {
                        if (str6 == null) {
                            C2858n.m11329f(eventEmitter, i3, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        String string2 = readableMap2.getString(REQUEST_BODY_KEY_URI);
                        InputStream f = C2856m.m11322f(getReactApplicationContext(), string2);
                        if (f == null) {
                            C2858n.m11329f(eventEmitter, i3, "Could not retrieve file for uri " + string2, (Throwable) null);
                            return;
                        }
                        requestBody = C2856m.m11317a(MediaType.parse(str6), f);
                    } else if (readableMap2.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                        if (str6 == null) {
                            str6 = "multipart/form-data";
                        }
                        MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap2.getArray(REQUEST_BODY_KEY_FORMDATA), str6, i3);
                        if (constructMultipartBody != null) {
                            requestBody = constructMultipartBody.build();
                        } else {
                            return;
                        }
                    }
                    String str8 = str;
                    url.method(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i3));
                    addRequest(i3);
                    build.newCall(url.build()).enqueue(new C2830b(i, eventEmitter, str3, z));
                }
                requestBody = C2856m.m11321e(str);
                String str82 = str;
                url.method(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i3));
                addRequest(i3);
                build.newCall(url.build()).enqueue(new C2830b(i, eventEmitter, str3, z));
            } catch (Exception e) {
                C2858n.m11329f(eventEmitter, i3, e.getMessage(), (Throwable) null);
            }
        } catch (IOException e2) {
            C2858n.m11329f(eventEmitter, i3, e2.getMessage(), e2);
        }
    }
}
