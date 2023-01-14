package com.RNFetchBlob;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.core.content.FileProvider;
import com.RNFetchBlob.C2288f;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.C2837a;
import com.facebook.react.modules.network.C2839c;
import com.facebook.react.modules.network.C2848g;
import java.io.File;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

/* renamed from: com.RNFetchBlob.RNFetchBlob */
public class C2264RNFetchBlob extends ReactContextBaseJavaModule {
    /* access modifiers changed from: private */
    public static boolean ActionViewVisible = false;
    static ReactApplicationContext RCTContext;
    static LinkedBlockingQueue<Runnable> fsTaskQueue = new LinkedBlockingQueue<>();
    private static ThreadPoolExecutor fsThreadPool;
    /* access modifiers changed from: private */
    public static SparseArray<Promise> promiseTable = new SparseArray<>();
    private static LinkedBlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();
    private static ThreadPoolExecutor threadPool;
    private final OkHttpClient mClient;

    /* renamed from: com.RNFetchBlob.RNFetchBlob$a */
    class C2265a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f6664f;

        /* renamed from: o */
        final /* synthetic */ String f6665o;

        /* renamed from: p */
        final /* synthetic */ Promise f6666p;

        C2265a(String str, String str2, Promise promise) {
            this.f6664f = str;
            this.f6665o = str2;
            this.f6666p = promise;
        }

        public void run() {
            C2283d.m9571o(this.f6664f, this.f6665o, this.f6666p);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$b */
    class C2266b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ReactApplicationContext f6668f;

        /* renamed from: o */
        final /* synthetic */ String f6669o;

        /* renamed from: p */
        final /* synthetic */ String f6670p;

        /* renamed from: q */
        final /* synthetic */ int f6671q;

        /* renamed from: r */
        final /* synthetic */ int f6672r;

        /* renamed from: s */
        final /* synthetic */ String f6673s;

        C2266b(ReactApplicationContext reactApplicationContext, String str, String str2, int i, int i2, String str3) {
            this.f6668f = reactApplicationContext;
            this.f6669o = str;
            this.f6670p = str2;
            this.f6671q = i;
            this.f6672r = i2;
            this.f6673s = str3;
        }

        public void run() {
            new C2283d(this.f6668f).mo7645y(this.f6669o, this.f6670p, this.f6671q, this.f6672r, this.f6673s);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$c */
    class C2267c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Callback f6675f;

        C2267c(Callback callback) {
            this.f6675f = callback;
        }

        public void run() {
            C2283d.m9562f(this.f6675f);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$d */
    class C2268d implements ActivityEventListener {
        C2268d() {
        }

        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            Integer num = C2282c.f6742a;
            if (i == num.intValue() && i2 == -1) {
                ((Promise) C2264RNFetchBlob.promiseTable.get(num.intValue())).resolve(intent.getData().toString());
                C2264RNFetchBlob.promiseTable.remove(num.intValue());
            }
        }

        public void onNewIntent(Intent intent) {
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$e */
    class C2269e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f6678f;

        /* renamed from: o */
        final /* synthetic */ String f6679o;

        /* renamed from: p */
        final /* synthetic */ String f6680p;

        /* renamed from: q */
        final /* synthetic */ Promise f6681q;

        C2269e(String str, String str2, String str3, Promise promise) {
            this.f6678f = str;
            this.f6679o = str2;
            this.f6680p = str3;
            this.f6681q = promise;
        }

        public void run() {
            C2283d.m9559c(this.f6678f, this.f6679o, this.f6680p, this.f6681q);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$f */
    class C2270f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f6683f;

        /* renamed from: o */
        final /* synthetic */ ReadableArray f6684o;

        /* renamed from: p */
        final /* synthetic */ Promise f6685p;

        C2270f(String str, ReadableArray readableArray, Promise promise) {
            this.f6683f = str;
            this.f6684o = readableArray;
            this.f6685p = promise;
        }

        public void run() {
            C2283d.m9560d(this.f6683f, this.f6684o, this.f6685p);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$g */
    class C2271g implements LifecycleEventListener {

        /* renamed from: f */
        final /* synthetic */ Promise f6687f;

        C2271g(Promise promise) {
            this.f6687f = promise;
        }

        public void onHostDestroy() {
        }

        public void onHostPause() {
        }

        public void onHostResume() {
            if (C2264RNFetchBlob.ActionViewVisible) {
                this.f6687f.resolve((Object) null);
            }
            C2264RNFetchBlob.RCTContext.removeLifecycleEventListener(this);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$h */
    class C2272h implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f6689f;

        /* renamed from: o */
        final /* synthetic */ String f6690o;

        /* renamed from: p */
        final /* synthetic */ Callback f6691p;

        C2272h(String str, String str2, Callback callback) {
            this.f6689f = str;
            this.f6690o = str2;
            this.f6691p = callback;
        }

        public void run() {
            C2283d.m9558b(this.f6689f, this.f6690o, this.f6691p);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$i */
    class C2273i implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f6693f;

        /* renamed from: o */
        final /* synthetic */ String f6694o;

        /* renamed from: p */
        final /* synthetic */ Promise f6695p;

        C2273i(String str, String str2, Promise promise) {
            this.f6693f = str;
            this.f6694o = str2;
            this.f6695p = promise;
        }

        public void run() {
            C2283d.m9580x(this.f6693f, this.f6694o, this.f6695p);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$j */
    class C2274j implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f6697f;

        /* renamed from: o */
        final /* synthetic */ ReadableArray f6698o;

        /* renamed from: p */
        final /* synthetic */ boolean f6699p;

        /* renamed from: q */
        final /* synthetic */ Promise f6700q;

        C2274j(String str, ReadableArray readableArray, boolean z, Promise promise) {
            this.f6697f = str;
            this.f6698o = readableArray;
            this.f6699p = z;
            this.f6700q = promise;
        }

        public void run() {
            C2283d.m9555I(this.f6697f, this.f6698o, this.f6699p, this.f6700q);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$k */
    class C2275k implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f6702f;

        /* renamed from: o */
        final /* synthetic */ String f6703o;

        /* renamed from: p */
        final /* synthetic */ String f6704p;

        /* renamed from: q */
        final /* synthetic */ boolean f6705q;

        /* renamed from: r */
        final /* synthetic */ Promise f6706r;

        C2275k(String str, String str2, String str3, boolean z, Promise promise) {
            this.f6702f = str;
            this.f6703o = str2;
            this.f6704p = str3;
            this.f6705q = z;
            this.f6706r = promise;
        }

        public void run() {
            C2283d.m9556J(this.f6702f, this.f6703o, this.f6704p, this.f6705q, this.f6706r);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$l */
    class C2276l implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ReadableArray f6708f;

        /* renamed from: o */
        final /* synthetic */ ReactApplicationContext f6709o;

        /* renamed from: p */
        final /* synthetic */ Callback f6710p;

        C2276l(ReadableArray readableArray, ReactApplicationContext reactApplicationContext, Callback callback) {
            this.f6708f = readableArray;
            this.f6709o = reactApplicationContext;
            this.f6710p = callback;
        }

        public void run() {
            int size = this.f6708f.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i = 0; i < size; i++) {
                ReadableMap map = this.f6708f.getMap(i);
                if (map.hasKey("path")) {
                    strArr[i] = map.getString("path");
                    if (map.hasKey("mime")) {
                        strArr2[i] = map.getString("mime");
                    } else {
                        strArr2[i] = null;
                    }
                }
            }
            new C2283d(this.f6709o).mo7643A(strArr, strArr2, this.f6710p);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        threadPool = new ThreadPoolExecutor(5, 10, 5000, timeUnit, taskQueue);
        fsThreadPool = new ThreadPoolExecutor(2, 10, 5000, timeUnit, taskQueue);
    }

    public C2264RNFetchBlob(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        OkHttpClient f = C2848g.m11303f();
        this.mClient = f;
        ((C2837a) f.cookieJar()).mo9208b(new JavaNetCookieJar(new C2839c(reactApplicationContext)));
        RCTContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new C2268d());
    }

    @ReactMethod
    public void actionViewIntent(String str, String str2, Promise promise) {
        Intent flags;
        ReactApplicationContext reactApplicationContext;
        try {
            Activity currentActivity = getCurrentActivity();
            Uri e = FileProvider.m4407e(currentActivity, getReactApplicationContext().getPackageName() + ".provider", new File(str));
            if (Build.VERSION.SDK_INT >= 24) {
                flags = new Intent("android.intent.action.VIEW").setDataAndType(e, str2);
                flags.setFlags(1);
                flags.addFlags(268435456);
                if (flags.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
                    reactApplicationContext = getReactApplicationContext();
                }
                ActionViewVisible = true;
                RCTContext.addLifecycleEventListener(new C2271g(promise));
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            flags = intent.setDataAndType(Uri.parse("file://" + str), str2).setFlags(268435456);
            reactApplicationContext = getReactApplicationContext();
            reactApplicationContext.startActivity(flags);
            ActionViewVisible = true;
            RCTContext.addLifecycleEventListener(new C2271g(promise));
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void addCompleteDownload(ReadableMap readableMap, Promise promise) {
        String str;
        ReadableMap readableMap2 = readableMap;
        Promise promise2 = promise;
        DownloadManager downloadManager = (DownloadManager) RCTContext.getSystemService("download");
        if (readableMap2 == null || !readableMap2.hasKey("path")) {
            str = "RNFetchblob.addCompleteDownload config or path missing.";
        } else {
            String w = C2283d.m9579w(readableMap2.getString("path"));
            if (w == null) {
                str = "RNFetchblob.addCompleteDownload can not resolve URI:" + readableMap2.getString("path");
            } else {
                try {
                    WritableMap D = C2283d.m9550D(w);
                    boolean hasKey = readableMap2.hasKey("title");
                    String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    String string = hasKey ? readableMap2.getString("title") : str2;
                    if (readableMap2.hasKey("description")) {
                        str2 = readableMap2.getString("description");
                    }
                    downloadManager.addCompletedDownload(string, str2, true, readableMap2.hasKey("mime") ? readableMap2.getString("mime") : null, w, Long.valueOf(D.getString("size")).longValue(), readableMap2.hasKey("showNotification") && readableMap2.getBoolean("showNotification"));
                    promise2.resolve((Object) null);
                    return;
                } catch (Exception e) {
                    promise2.reject("EUNSPECIFIED", e.getLocalizedMessage());
                    return;
                }
            }
        }
        promise2.reject("EINVAL", str);
    }

    @ReactMethod
    public void cancelRequest(String str, Callback callback) {
        try {
            C2290g.m9593c(str);
            callback.invoke(null, str);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage(), null);
        }
    }

    @ReactMethod
    public void closeStream(String str, Callback callback) {
        C2283d.m9557a(str, callback);
    }

    @ReactMethod
    /* renamed from: cp */
    public void mo7589cp(String str, String str2, Callback callback) {
        threadPool.execute(new C2272h(str, str2, callback));
    }

    @ReactMethod
    public void createFile(String str, String str2, String str3, Promise promise) {
        threadPool.execute(new C2269e(str, str2, str3, promise));
    }

    @ReactMethod
    public void createFileASCII(String str, ReadableArray readableArray, Promise promise) {
        threadPool.execute(new C2270f(str, readableArray, promise));
    }

    @ReactMethod
    /* renamed from: df */
    public void mo7592df(Callback callback) {
        fsThreadPool.execute(new C2267c(callback));
    }

    @ReactMethod
    public void enableProgressReport(String str, int i, int i2) {
        C2290g.f6763p.put(str, new C2288f(true, i, i2, C2288f.C2289a.Download));
    }

    @ReactMethod
    public void enableUploadProgressReport(String str, int i, int i2) {
        C2290g.f6764q.put(str, new C2288f(true, i, i2, C2288f.C2289a.Upload));
    }

    @ReactMethod
    public void exists(String str, Callback callback) {
        C2283d.m9566j(str, callback);
    }

    @ReactMethod
    public void fetchBlob(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        new C2290g(readableMap, str, str2, str3, readableMap2, str4, (ReadableArray) null, this.mClient, callback).run();
    }

    @ReactMethod
    public void fetchBlobForm(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        new C2290g(readableMap, str, str2, str3, readableMap2, (String) null, readableArray, this.mClient, callback).run();
    }

    public Map<String, Object> getConstants() {
        return C2283d.m9569m(getReactApplicationContext());
    }

    @ReactMethod
    public void getContentIntent(String str, Promise promise) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (str == null) {
            str = "*/*";
        }
        intent.setType(str);
        SparseArray<Promise> sparseArray = promiseTable;
        Integer num = C2282c.f6742a;
        sparseArray.put(num.intValue(), promise);
        getReactApplicationContext().startActivityForResult(intent, num.intValue(), (Bundle) null);
    }

    public String getName() {
        return "RNFetchBlob";
    }

    @ReactMethod
    public void getSDCardApplicationDir(Promise promise) {
        C2283d.m9567k(getReactApplicationContext(), promise);
    }

    @ReactMethod
    public void getSDCardDir(Promise promise) {
        C2283d.m9568l(promise);
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        threadPool.execute(new C2265a(str, str2, promise));
    }

    @ReactMethod
    /* renamed from: ls */
    public void mo7603ls(String str, Promise promise) {
        C2283d.m9575s(str, promise);
    }

    @ReactMethod
    public void lstat(String str, Callback callback) {
        C2283d.m9576t(str, callback);
    }

    @ReactMethod
    public void mkdir(String str, Promise promise) {
        C2283d.m9577u(str, promise);
    }

    @ReactMethod
    /* renamed from: mv */
    public void mo7606mv(String str, String str2, Callback callback) {
        C2283d.m9578v(str, str2, callback);
    }

    @ReactMethod
    public void readFile(String str, String str2, Promise promise) {
        threadPool.execute(new C2273i(str, str2, promise));
    }

    @ReactMethod
    public void readStream(String str, String str2, int i, int i2, String str3) {
        fsThreadPool.execute(new C2266b(getReactApplicationContext(), str, str2, i, i2, str3));
    }

    @ReactMethod
    public void removeSession(ReadableArray readableArray, Callback callback) {
        C2283d.m9581z(readableArray, callback);
    }

    @ReactMethod
    public void scanFile(ReadableArray readableArray, Callback callback) {
        threadPool.execute(new C2276l(readableArray, getReactApplicationContext(), callback));
    }

    @ReactMethod
    public void slice(String str, String str2, int i, int i2, Promise promise) {
        C2283d.m9548B(str, str2, i, i2, HttpUrl.FRAGMENT_ENCODE_SET, promise);
    }

    @ReactMethod
    public void stat(String str, Callback callback) {
        C2283d.m9549C(str, callback);
    }

    @ReactMethod
    public void unlink(String str, Callback callback) {
        C2283d.m9552F(str, callback);
    }

    @ReactMethod
    public void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) {
        C2283d.m9553G(str, readableArray, callback);
    }

    @ReactMethod
    public void writeChunk(String str, String str2, Callback callback) {
        C2283d.m9554H(str, str2, callback);
    }

    @ReactMethod
    public void writeFile(String str, String str2, String str3, boolean z, Promise promise) {
        threadPool.execute(new C2275k(str, str2, str3, z, promise));
    }

    @ReactMethod
    public void writeFileArray(String str, ReadableArray readableArray, boolean z, Promise promise) {
        threadPool.execute(new C2274j(str, readableArray, z, promise));
    }

    @ReactMethod
    public void writeStream(String str, String str2, boolean z, Callback callback) {
        new C2283d(getReactApplicationContext()).mo7644K(str, str2, z, callback);
    }
}
