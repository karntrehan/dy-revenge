package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.core.content.C1135a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.modules.core.C2802e;
import com.facebook.react.modules.core.C2803f;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C2943b;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.views.scroll.C3126b;
import com.facebook.react.views.scroll.C3146h;
import com.facebook.react.views.scroll.C3147i;
import com.reactnativecommunity.webview.p171e.C5316a;
import com.reactnativecommunity.webview.p171e.C5318b;
import com.reactnativecommunity.webview.p171e.C5320c;
import com.reactnativecommunity.webview.p171e.C5322d;
import com.reactnativecommunity.webview.p171e.C5324e;
import com.reactnativecommunity.webview.p171e.C5326f;
import com.reactnativecommunity.webview.p171e.C5328g;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import p027c.p104x.C2249a;
import p027c.p104x.C2250b;

@C2639a(name = "RNCWebView")
public class RNCWebViewManager extends SimpleViewManager<WebView> {
    protected static final String BLANK_URL = "about:blank";
    public static final int COMMAND_CLEAR_CACHE = 1001;
    public static final int COMMAND_CLEAR_FORM_DATA = 1000;
    public static final int COMMAND_CLEAR_HISTORY = 1002;
    public static final int COMMAND_FOCUS = 8;
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    protected static final String REACT_CLASS = "RNCWebView";
    protected static final int SHOULD_OVERRIDE_URL_LOADING_TIMEOUT = 250;
    private static final String TAG = "RNCWebViewManager";
    protected boolean mAllowsFullscreenVideo;
    protected String mUserAgent;
    protected String mUserAgentWithApplicationName;
    protected C5301e mWebChromeClient;
    protected C5315d mWebViewConfig;

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$a */
    class C5297a implements C5315d {
        C5297a() {
        }

        /* renamed from: a */
        public void mo16031a(WebView webView) {
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$b */
    class C5298b implements DownloadListener {

        /* renamed from: a */
        final /* synthetic */ C5302f f14868a;

        /* renamed from: b */
        final /* synthetic */ C3031o0 f14869b;

        C5298b(C5302f fVar, C3031o0 o0Var) {
            this.f14868a = fVar;
            this.f14869b = o0Var;
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            this.f14868a.setIgnoreErrFailedForThisURL(str);
            RNCWebViewModule module = RNCWebViewManager.getModule(this.f14869b);
            try {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                String guessFileName = URLUtil.guessFileName(str, str3, str4);
                String str5 = "Downloading " + guessFileName;
                try {
                    URL url = new URL(str);
                    request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
                } catch (MalformedURLException e) {
                    Log.w(RNCWebViewManager.TAG, "Error getting cookie for DownloadManager", e);
                }
                request.addRequestHeader("User-Agent", str2);
                request.setTitle(guessFileName);
                request.setDescription(str5);
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                module.setDownloadRequest(request);
                if (module.grantFileDownloaderPermissions()) {
                    module.downloadFile();
                }
            } catch (IllegalArgumentException e2) {
                Log.w(RNCWebViewManager.TAG, "Unsupported URI, aborting download", e2);
            }
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$c */
    class C5299c extends C5301e {

        /* renamed from: A */
        final /* synthetic */ Activity f14871A;

        /* renamed from: B */
        final /* synthetic */ int f14872B;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5299c(ReactContext reactContext, WebView webView, Activity activity, int i) {
            super(reactContext, webView);
            this.f14871A = activity;
            this.f14872B = i;
        }

        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        public void onHideCustomView() {
            if (this.f14878q != null) {
                ViewGroup b = mo16037b();
                (b.getRootView() != this.f14877p.getRootView() ? this.f14877p.getRootView() : this.f14877p).setVisibility(0);
                if (Build.VERSION.SDK_INT >= 19) {
                    this.f14871A.getWindow().clearFlags(512);
                }
                b.removeView(this.f14878q);
                this.f14879r.onCustomViewHidden();
                this.f14878q = null;
                this.f14879r = null;
                this.f14871A.setRequestedOrientation(this.f14872B);
                this.f14876o.removeLifecycleEventListener(this);
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.f14878q != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.f14878q = view;
            this.f14879r = customViewCallback;
            this.f14871A.setRequestedOrientation(-1);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f14878q.setSystemUiVisibility(7942);
                this.f14871A.getWindow().setFlags(512, 512);
            }
            this.f14878q.setBackgroundColor(-16777216);
            ViewGroup b = mo16037b();
            b.addView(this.f14878q, C5301e.f14875f);
            (b.getRootView() != this.f14877p.getRootView() ? this.f14877p.getRootView() : this.f14877p).setVisibility(8);
            this.f14876o.addLifecycleEventListener(this);
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$d */
    class C5300d extends C5301e {
        C5300d(ReactContext reactContext, WebView webView) {
            super(reactContext, webView);
        }

        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$e */
    protected static class C5301e extends WebChromeClient implements LifecycleEventListener {

        /* renamed from: f */
        protected static final FrameLayout.LayoutParams f14875f = new FrameLayout.LayoutParams(-1, -1, 17);

        /* renamed from: o */
        protected ReactContext f14876o;

        /* renamed from: p */
        protected View f14877p;

        /* renamed from: q */
        protected View f14878q;

        /* renamed from: r */
        protected WebChromeClient.CustomViewCallback f14879r;

        /* renamed from: s */
        protected PermissionRequest f14880s;

        /* renamed from: t */
        protected List<String> f14881t;

        /* renamed from: u */
        protected GeolocationPermissions.Callback f14882u;

        /* renamed from: v */
        protected String f14883v;

        /* renamed from: w */
        protected boolean f14884w = false;

        /* renamed from: x */
        protected List<String> f14885x = new ArrayList();

        /* renamed from: y */
        protected C5302f.C5304b f14886y = null;
        @TargetApi(21)

        /* renamed from: z */
        private C2803f f14887z = new C5312a(this);

        public C5301e(ReactContext reactContext, WebView webView) {
            this.f14876o = reactContext;
            this.f14877p = webView;
        }

        /* renamed from: a */
        private C2802e m19698a() {
            Activity currentActivity = this.f14876o.getCurrentActivity();
            if (currentActivity == null) {
                throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
            } else if (currentActivity instanceof C2802e) {
                return (C2802e) currentActivity;
            } else {
                throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ boolean mo16038d(int i, String[] strArr, int[] iArr) {
            PermissionRequest permissionRequest;
            List<String> list;
            List<String> list2;
            List<String> list3;
            List<String> list4;
            GeolocationPermissions.Callback callback;
            String str;
            this.f14884w = false;
            boolean z = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str2 = strArr[i2];
                boolean z2 = iArr[i2] == 0;
                if (!(!str2.equals("android.permission.ACCESS_FINE_LOCATION") || (callback = this.f14882u) == null || (str = this.f14883v) == null)) {
                    if (z2) {
                        callback.invoke(str, true, false);
                    } else {
                        callback.invoke(str, false, false);
                    }
                    this.f14882u = null;
                    this.f14883v = null;
                }
                if (str2.equals("android.permission.RECORD_AUDIO")) {
                    if (z2 && (list4 = this.f14881t) != null) {
                        list4.add("android.webkit.resource.AUDIO_CAPTURE");
                    }
                    z = true;
                }
                if (str2.equals("android.permission.CAMERA")) {
                    if (z2 && (list3 = this.f14881t) != null) {
                        list3.add("android.webkit.resource.VIDEO_CAPTURE");
                    }
                    z = true;
                }
                if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                    if (z2 && (list2 = this.f14881t) != null) {
                        list2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                    }
                    z = true;
                }
            }
            if (!(!z || (permissionRequest = this.f14880s) == null || (list = this.f14881t) == null)) {
                permissionRequest.grant((String[]) list.toArray(new String[0]));
                this.f14880s = null;
                this.f14881t = null;
            }
            if (this.f14885x.isEmpty()) {
                return true;
            }
            m19700e(this.f14885x);
            return false;
        }

        /* renamed from: e */
        private synchronized void m19700e(List<String> list) {
            if (this.f14884w) {
                this.f14885x.addAll(list);
                return;
            }
            C2802e a = m19698a();
            this.f14884w = true;
            a.mo8378i((String[]) list.toArray(new String[0]), 3, this.f14887z);
            this.f14885x.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public ViewGroup mo16037b() {
            return (ViewGroup) this.f14876o.getCurrentActivity().findViewById(16908290);
        }

        /* renamed from: f */
        public void mo16039f(C5302f.C5304b bVar) {
            this.f14886y = bVar;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            ((WebView.WebViewTransport) message.obj).setWebView(new WebView(webView.getContext()));
            message.sendToTarget();
            return true;
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (C1135a.m4415a(this.f14876o, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                this.f14882u = callback;
                this.f14883v = str;
                m19700e(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
                return;
            }
            callback.invoke(str, true, false);
        }

        public void onHostDestroy() {
        }

        public void onHostPause() {
        }

        public void onHostResume() {
            View view;
            if (Build.VERSION.SDK_INT >= 19 && (view = this.f14878q) != null && view.getSystemUiVisibility() != 7942) {
                this.f14878q.setSystemUiVisibility(7942);
            }
        }

        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.f14881t = new ArrayList();
            ArrayList arrayList = new ArrayList();
            String[] resources = permissionRequest.getResources();
            int length = resources.length;
            int i = 0;
            while (true) {
                String str = null;
                if (i >= length) {
                    break;
                }
                String str2 = resources[i];
                if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    str = "android.permission.RECORD_AUDIO";
                } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    str = "android.permission.CAMERA";
                } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
                if (str != null) {
                    if (C1135a.m4415a(this.f14876o, str) == 0) {
                        this.f14881t.add(str2);
                    } else {
                        arrayList.add(str);
                    }
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                permissionRequest.grant((String[]) this.f14881t.toArray(new String[0]));
                this.f14881t = null;
                return;
            }
            this.f14880s = permissionRequest;
            m19700e(arrayList);
        }

        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            String url = webView.getUrl();
            if (!this.f14886y.mo16074a()) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble("target", (double) webView.getId());
                createMap.putString("title", webView.getTitle());
                createMap.putString("url", url);
                createMap.putBoolean("canGoBack", webView.canGoBack());
                createMap.putBoolean("canGoForward", webView.canGoForward());
                createMap.putDouble("progress", (double) (((float) i) / 100.0f));
                ((C5302f) webView).mo16052f(webView, new C5322d(webView.getId(), createMap));
            }
        }

        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            boolean z = true;
            if (fileChooserParams.getMode() != 1) {
                z = false;
            }
            return RNCWebViewManager.getModule(this.f14876o).startPhotoPickerIntent(valueCallback, acceptTypes, z);
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$f */
    protected static class C5302f extends WebView implements LifecycleEventListener {

        /* renamed from: A */
        WebChromeClient f14888A;

        /* renamed from: f */
        protected String f14889f;

        /* renamed from: o */
        protected String f14890o;

        /* renamed from: p */
        protected boolean f14891p = true;

        /* renamed from: q */
        protected boolean f14892q = true;

        /* renamed from: r */
        protected boolean f14893r = false;

        /* renamed from: s */
        protected String f14894s;

        /* renamed from: t */
        protected C5306g f14895t;

        /* renamed from: u */
        protected CatalystInstance f14896u;

        /* renamed from: v */
        protected boolean f14897v = false;

        /* renamed from: w */
        private C3126b f14898w;

        /* renamed from: x */
        protected boolean f14899x = false;

        /* renamed from: y */
        protected boolean f14900y = false;

        /* renamed from: z */
        protected C5304b f14901z;

        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$f$a */
        class C5303a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ WebView f14902f;

            /* renamed from: o */
            final /* synthetic */ String f14903o;

            /* renamed from: p */
            final /* synthetic */ C5302f f14904p;

            C5303a(WebView webView, String str, C5302f fVar) {
                this.f14902f = webView;
                this.f14903o = str;
                this.f14904p = fVar;
            }

            public void run() {
                C5306g gVar = C5302f.this.f14895t;
                if (gVar != null) {
                    WebView webView = this.f14902f;
                    WritableMap a = gVar.mo16077a(webView, webView.getUrl());
                    a.putString("data", this.f14903o);
                    C5302f fVar = C5302f.this;
                    if (fVar.f14896u != null) {
                        this.f14904p.mo16056i("onMessage", a);
                    } else {
                        fVar.mo16052f(this.f14902f, new C5326f(this.f14902f.getId(), a));
                    }
                }
            }
        }

        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$f$b */
        protected static class C5304b {

            /* renamed from: a */
            private boolean f14906a = false;

            protected C5304b() {
            }

            /* renamed from: a */
            public boolean mo16074a() {
                return this.f14906a;
            }

            /* renamed from: b */
            public void mo16075b(boolean z) {
                this.f14906a = z;
            }
        }

        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$f$c */
        protected class C5305c {

            /* renamed from: a */
            C5302f f14907a;

            C5305c(C5302f fVar) {
                this.f14907a = fVar;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f14907a.mo16055h(str);
            }
        }

        public C5302f(C3031o0 o0Var) {
            super(o0Var);
            mo16049d();
            this.f14901z = new C5304b();
        }

        /* renamed from: a */
        public void mo16046a() {
            String str;
            if (getSettings().getJavaScriptEnabled() && (str = this.f14889f) != null && !TextUtils.isEmpty(str)) {
                mo16053g("(function() {\n" + this.f14889f + ";\n})();");
            }
        }

        /* renamed from: b */
        public void mo16047b() {
            String str;
            if (getSettings().getJavaScriptEnabled() && (str = this.f14890o) != null && !TextUtils.isEmpty(str)) {
                mo16053g("(function() {\n" + this.f14890o + ";\n})();");
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo16048c() {
            setWebViewClient((WebViewClient) null);
            destroy();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo16049d() {
            ReactContext reactContext = (ReactContext) getContext();
            if (reactContext != null) {
                this.f14896u = reactContext.getCatalystInstance();
            }
        }

        public void destroy() {
            WebChromeClient webChromeClient = this.f14888A;
            if (webChromeClient != null) {
                webChromeClient.onHideCustomView();
            }
            super.destroy();
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C5305c mo16051e(C5302f fVar) {
            return new C5305c(fVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo16052f(WebView webView, C2944c cVar) {
            ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(cVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo16053g(String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, (ValueCallback) null);
                return;
            }
            try {
                loadUrl("javascript:" + URLEncoder.encode(str, RNCWebViewManager.HTML_ENCODING));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }

        public C5306g getRNCWebViewClient() {
            return this.f14895t;
        }

        /* renamed from: h */
        public void mo16055h(String str) {
            ReactContext reactContext = (ReactContext) getContext();
            if (this.f14895t != null) {
                post(new C5303a(this, str, this));
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("data", str);
            if (this.f14896u != null) {
                mo16056i("onMessage", createMap);
            } else {
                mo16052f(this, new C5326f(getId(), createMap));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo16056i(String str, WritableMap writableMap) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("nativeEvent", writableMap);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            writableNativeArray.pushMap(writableNativeMap);
            this.f14896u.callFunction(this.f14894s, str, writableNativeArray);
        }

        public void onHostDestroy() {
            mo16048c();
        }

        public void onHostPause() {
        }

        public void onHostResume() {
        }

        /* access modifiers changed from: protected */
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (this.f14899x) {
                if (this.f14898w == null) {
                    this.f14898w = new C3126b();
                }
                if (this.f14898w.mo10125c(i, i2)) {
                    mo16052f(this, C3146h.m12379w(getId(), C3147i.SCROLL, i, i2, this.f14898w.mo10123a(), this.f14898w.mo10124b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.f14897v) {
                mo16052f(this, new C2943b(getId(), i, i2));
            }
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.f14900y) {
                requestDisallowInterceptTouchEvent(true);
            }
            return super.onTouchEvent(motionEvent);
        }

        public void setBasicAuthCredential(C5313b bVar) {
            this.f14895t.mo16079c(bVar);
        }

        public void setHasScrollEvent(boolean z) {
            this.f14899x = z;
        }

        public void setIgnoreErrFailedForThisURL(String str) {
            this.f14895t.mo16080d(str);
        }

        public void setInjectedJavaScript(String str) {
            this.f14889f = str;
        }

        public void setInjectedJavaScriptBeforeContentLoaded(String str) {
            this.f14890o = str;
        }

        public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(boolean z) {
            this.f14892q = z;
        }

        public void setInjectedJavaScriptForMainFrameOnly(boolean z) {
            this.f14891p = z;
        }

        @SuppressLint({"AddJavascriptInterface"})
        public void setMessagingEnabled(boolean z) {
            if (this.f14893r != z) {
                this.f14893r = z;
                if (z) {
                    addJavascriptInterface(mo16051e(this), RNCWebViewManager.JAVASCRIPT_INTERFACE);
                } else {
                    removeJavascriptInterface(RNCWebViewManager.JAVASCRIPT_INTERFACE);
                }
            }
        }

        public void setMessagingModuleName(String str) {
            this.f14894s = str;
        }

        public void setNestedScrollEnabled(boolean z) {
            this.f14900y = z;
        }

        public void setSendContentSizeChangeEvents(boolean z) {
            this.f14897v = z;
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            this.f14888A = webChromeClient;
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof C5301e) {
                ((C5301e) webChromeClient).mo16039f(this.f14901z);
            }
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            if (webViewClient instanceof C5306g) {
                C5306g gVar = (C5306g) webViewClient;
                this.f14895t = gVar;
                gVar.mo16081e(this.f14901z);
            }
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$g */
    protected static class C5306g extends WebViewClient {

        /* renamed from: a */
        protected boolean f14909a = false;

        /* renamed from: b */
        protected ReadableArray f14910b;

        /* renamed from: c */
        protected C5302f.C5304b f14911c = null;

        /* renamed from: d */
        protected String f14912d = null;

        /* renamed from: e */
        protected C5313b f14913e = null;

        protected C5306g() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public WritableMap mo16077a(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", (double) webView.getId());
            createMap.putString("url", str);
            createMap.putBoolean("loading", !this.f14909a && webView.getProgress() != 100);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo16078b(WebView webView, String str) {
            ((C5302f) webView).mo16052f(webView, new C5320c(webView.getId(), mo16077a(webView, str)));
        }

        /* renamed from: c */
        public void mo16079c(C5313b bVar) {
            this.f14913e = bVar;
        }

        /* renamed from: d */
        public void mo16080d(String str) {
            this.f14912d = str;
        }

        /* renamed from: e */
        public void mo16081e(C5302f.C5304b bVar) {
            this.f14911c = bVar;
        }

        /* renamed from: f */
        public void mo16082f(ReadableArray readableArray) {
            this.f14910b = readableArray;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f14909a) {
                ((C5302f) webView).mo16046a();
                mo16078b(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f14909a = false;
            C5302f fVar = (C5302f) webView;
            fVar.mo16047b();
            fVar.mo16052f(webView, new C5324e(webView.getId(), mo16077a(webView, str)));
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            String str3 = this.f14912d;
            if (str3 == null || !str2.equals(str3) || i != -1 || !str.equals("net::ERR_FAILED")) {
                super.onReceivedError(webView, i, str, str2);
                this.f14909a = true;
                mo16078b(webView, str2);
                WritableMap a = mo16077a(webView, str2);
                a.putDouble("code", (double) i);
                a.putString("description", str);
                ((C5302f) webView).mo16052f(webView, new C5318b(webView.getId(), a));
                return;
            }
            mo16080d((String) null);
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            C5313b bVar = this.f14913e;
            if (bVar != null) {
                httpAuthHandler.proceed(bVar.f14928a, bVar.f14929b);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                WritableMap a = mo16077a(webView, webResourceRequest.getUrl().toString());
                a.putInt("statusCode", webResourceResponse.getStatusCode());
                a.putString("description", webResourceResponse.getReasonPhrase());
                ((C5302f) webView).mo16052f(webView, new C5316a(webView.getId(), a));
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String url = webView.getUrl();
            String url2 = sslError.getUrl();
            sslErrorHandler.cancel();
            if (!url.equalsIgnoreCase(url2)) {
                Log.w(RNCWebViewManager.TAG, "Resource blocked from loading due to SSL error. Blocked URL: " + url2);
                return;
            }
            int primaryError = sslError.getPrimaryError();
            String str = primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid";
            onReceivedError(webView, primaryError, "SSL error: " + str, url2);
        }

        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            super.onRenderProcessGone(webView, renderProcessGoneDetail);
            if (renderProcessGoneDetail.didCrash()) {
                Log.e(RNCWebViewManager.TAG, "The WebView rendering process crashed.");
            } else {
                Log.w(RNCWebViewManager.TAG, "The WebView rendering process was killed by the system.");
            }
            if (webView == null) {
                return true;
            }
            WritableMap a = mo16077a(webView, webView.getUrl());
            a.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
            ((C5302f) webView).mo16052f(webView, new C5328g(webView.getId(), a));
            return true;
        }

        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
            if (r1.get() != com.reactnativecommunity.webview.RNCWebViewModule.C5310d.C5311a.f14924o) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
            com.reactnativecommunity.webview.RNCWebViewModule.shouldOverrideUrlLoadingLock.mo16102c(java.lang.Integer.valueOf(r2));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
            return r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r10, java.lang.String r11) {
            /*
                r9 = this;
                r0 = r10
                com.reactnativecommunity.webview.RNCWebViewManager$f r0 = (com.reactnativecommunity.webview.RNCWebViewManager.C5302f) r0
                android.content.Context r1 = r10.getContext()
                com.facebook.react.bridge.ReactContext r1 = (com.facebook.react.bridge.ReactContext) r1
                com.facebook.react.bridge.JavaScriptContextHolder r1 = r1.getJavaScriptContextHolder()
                long r1 = r1.get()
                r3 = 1
                r4 = 0
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 != 0) goto L_0x001b
                r1 = 1
                goto L_0x001c
            L_0x001b:
                r1 = 0
            L_0x001c:
                if (r1 != 0) goto L_0x009a
                com.facebook.react.bridge.CatalystInstance r1 = r0.f14896u
                if (r1 == 0) goto L_0x009a
                com.reactnativecommunity.webview.RNCWebViewModule$d r1 = com.reactnativecommunity.webview.RNCWebViewModule.shouldOverrideUrlLoadingLock
                androidx.core.util.e r1 = r1.mo16101b()
                F r2 = r1.f3262a
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                S r1 = r1.f3263b
                java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
                com.facebook.react.bridge.WritableMap r10 = r9.mo16077a(r10, r11)
                java.lang.String r11 = "lockIdentifier"
                r10.putInt(r11, r2)
                java.lang.String r11 = "onShouldStartLoadWithRequest"
                r0.mo16056i(r11, r10)
                monitor-enter(r1)     // Catch:{ InterruptedException -> 0x0088 }
                long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0085 }
            L_0x0047:
                java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0085 }
                com.reactnativecommunity.webview.RNCWebViewModule$d$a r5 = com.reactnativecommunity.webview.RNCWebViewModule.C5310d.C5311a.UNDECIDED     // Catch:{ all -> 0x0085 }
                if (r0 != r5) goto L_0x0070
                long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0085 }
                long r5 = r5 - r10
                r7 = 250(0xfa, double:1.235E-321)
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 <= 0) goto L_0x006c
                java.lang.String r10 = "RNCWebViewManager"
                java.lang.String r11 = "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading."
                p174e.p247e.p253d.p258e.C6071a.m22859G(r10, r11)     // Catch:{ all -> 0x0085 }
                com.reactnativecommunity.webview.RNCWebViewModule$d r10 = com.reactnativecommunity.webview.RNCWebViewModule.shouldOverrideUrlLoadingLock     // Catch:{ all -> 0x0085 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0085 }
                r10.mo16102c(r11)     // Catch:{ all -> 0x0085 }
                monitor-exit(r1)     // Catch:{ all -> 0x0085 }
                return r4
            L_0x006c:
                r1.wait(r7)     // Catch:{ all -> 0x0085 }
                goto L_0x0047
            L_0x0070:
                monitor-exit(r1)     // Catch:{ all -> 0x0085 }
                java.lang.Object r10 = r1.get()
                com.reactnativecommunity.webview.RNCWebViewModule$d$a r11 = com.reactnativecommunity.webview.RNCWebViewModule.C5310d.C5311a.SHOULD_OVERRIDE
                if (r10 != r11) goto L_0x007a
                goto L_0x007b
            L_0x007a:
                r3 = 0
            L_0x007b:
                com.reactnativecommunity.webview.RNCWebViewModule$d r10 = com.reactnativecommunity.webview.RNCWebViewModule.shouldOverrideUrlLoadingLock
                java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
                r10.mo16102c(r11)
                return r3
            L_0x0085:
                r10 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0085 }
                throw r10     // Catch:{ InterruptedException -> 0x0088 }
            L_0x0088:
                r10 = move-exception
                java.lang.String r11 = "RNCWebViewManager"
                java.lang.String r0 = "shouldOverrideUrlLoading was interrupted while waiting for result."
                p174e.p247e.p253d.p258e.C6071a.m22876j(r11, r0, r10)
                com.reactnativecommunity.webview.RNCWebViewModule$d r10 = com.reactnativecommunity.webview.RNCWebViewModule.shouldOverrideUrlLoadingLock
                java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
                r10.mo16102c(r11)
                return r4
            L_0x009a:
                java.lang.String r0 = "RNCWebViewManager"
                java.lang.String r1 = "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load."
                p174e.p247e.p253d.p258e.C6071a.m22859G(r0, r1)
                com.reactnativecommunity.webview.RNCWebViewManager$f$b r0 = r9.f14911c
                r0.mo16075b(r3)
                r0 = r10
                com.reactnativecommunity.webview.RNCWebViewManager$f r0 = (com.reactnativecommunity.webview.RNCWebViewManager.C5302f) r0
                com.reactnativecommunity.webview.e.h r1 = new com.reactnativecommunity.webview.e.h
                int r2 = r10.getId()
                com.facebook.react.bridge.WritableMap r11 = r9.mo16077a(r10, r11)
                r1.<init>(r2, r11)
                r0.mo16052f(r10, r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewManager.C5306g.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = new C5297a();
    }

    public RNCWebViewManager(C5315d dVar) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = dVar;
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, WebView webView) {
        webView.setWebViewClient(new C5306g());
    }

    /* access modifiers changed from: protected */
    public C5302f createRNCWebViewInstance(C3031o0 o0Var) {
        return new C5302f(o0Var);
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public WebView createViewInstance(C3031o0 o0Var) {
        C5302f createRNCWebViewInstance = createRNCWebViewInstance(o0Var);
        setupWebChromeClient(o0Var, createRNCWebViewInstance);
        o0Var.addLifecycleEventListener(createRNCWebViewInstance);
        this.mWebViewConfig.mo16031a(createRNCWebViewInstance);
        WebSettings settings = createRNCWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            setAllowUniversalAccessFromFileURLs(createRNCWebViewInstance, false);
        }
        setMixedContentMode(createRNCWebViewInstance, "never");
        createRNCWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        createRNCWebViewInstance.setDownloadListener(new C5298b(createRNCWebViewInstance, o0Var));
        return createRNCWebViewInstance;
    }

    public Map<String, Integer> getCommandsMap() {
        return C2693e.m10911a().mo8815b("goBack", 1).mo8815b("goForward", 2).mo8815b("reload", 3).mo8815b("stopLoading", 4).mo8815b("postMessage", 5).mo8815b("injectJavaScript", 6).mo8815b("loadUrl", 7).mo8815b("requestFocus", 8).mo8815b("clearFormData", Integer.valueOf(COMMAND_CLEAR_FORM_DATA)).mo8815b("clearCache", 1001).mo8815b("clearHistory", Integer.valueOf(COMMAND_CLEAR_HISTORY)).mo8814a();
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = C2693e.m10912b();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", C2693e.m10914d("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", C2693e.m10914d("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(C3147i.m12384e(C3147i.SCROLL), C2693e.m10914d("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", C2693e.m10914d("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", C2693e.m10914d("registrationName", "onRenderProcessGone"));
        return exportedCustomDirectEventTypeConstants;
    }

    public String getName() {
        return "RNCWebView";
    }

    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance(webView);
        C5302f fVar = (C5302f) webView;
        ((C3031o0) webView.getContext()).removeLifecycleEventListener(fVar);
        fVar.mo16048c();
        this.mWebChromeClient = null;
    }

    public void receiveCommand(WebView webView, int i, ReadableArray readableArray) {
        boolean z = false;
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    ((C5302f) webView).mo16053g("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            case 6:
                ((C5302f) webView).mo16053g(readableArray.getString(0));
                return;
            case 7:
                if (readableArray != null) {
                    ((C5302f) webView).f14901z.mo16075b(false);
                    webView.loadUrl(readableArray.getString(0));
                    return;
                }
                throw new RuntimeException("Arguments for loading an url are null!");
            case 8:
                webView.requestFocus();
                return;
            default:
                switch (i) {
                    case COMMAND_CLEAR_FORM_DATA /*1000*/:
                        webView.clearFormData();
                        return;
                    case 1001:
                        if (readableArray != null && readableArray.getBoolean(0)) {
                            z = true;
                        }
                        webView.clearCache(z);
                        return;
                    case COMMAND_CLEAR_HISTORY /*1002*/:
                        webView.clearHistory();
                        return;
                    default:
                        return;
                }
        }
    }

    @C2991a(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, Boolean bool) {
        webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    @C2991a(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowFileAccessFromFileURLs(z);
    }

    @C2991a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @C2991a(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(WebView webView, Boolean bool) {
        this.mAllowsFullscreenVideo = bool != null && bool.booleanValue();
        setupWebChromeClient((ReactContext) webView.getContext(), webView);
    }

    @C2991a(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(WebView webView, String str) {
        String str2;
        if (str != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                str2 = WebSettings.getDefaultUserAgent(webView.getContext()) + " " + str;
            }
            setUserAgentString(webView);
        }
        str2 = null;
        this.mUserAgentWithApplicationName = str2;
        setUserAgentString(webView);
    }

    @C2991a(name = "basicAuthCredential")
    public void setBasicAuthCredential(WebView webView, ReadableMap readableMap) {
        ((C5302f) webView).setBasicAuthCredential((readableMap == null || !readableMap.hasKey("username") || !readableMap.hasKey("password")) ? null : new C5313b(readableMap.getString("username"), readableMap.getString("password")));
    }

    @C2991a(name = "setBuiltInZoomControls")
    public void setBuiltInZoomControls(WebView webView, boolean z) {
        webView.getSettings().setBuiltInZoomControls(z);
    }

    @C2991a(name = "cacheEnabled")
    public void setCacheEnabled(WebView webView, boolean z) {
        boolean z2;
        WebSettings webSettings;
        if (z) {
            Context context = webView.getContext();
            if (context != null) {
                webView.getSettings().setAppCachePath(context.getCacheDir().getAbsolutePath());
                webView.getSettings().setCacheMode(-1);
                webSettings = webView.getSettings();
                z2 = true;
            } else {
                return;
            }
        } else {
            webView.getSettings().setCacheMode(2);
            webSettings = webView.getSettings();
            z2 = false;
        }
        webSettings.setAppCacheEnabled(z2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @com.facebook.react.uimanager.p120j1.C2991a(name = "cacheMode")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCacheMode(android.webkit.WebView r6, java.lang.String r7) {
        /*
            r5 = this;
            int r0 = r7.hashCode()
            r1 = 3
            r2 = -1
            r3 = 2
            r4 = 1
            switch(r0) {
                case -2059164003: goto L_0x002a;
                case -1215135800: goto L_0x0020;
                case -873877826: goto L_0x0016;
                case 1548620642: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "LOAD_CACHE_ONLY"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = 0
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "LOAD_CACHE_ELSE_NETWORK"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "LOAD_DEFAULT"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = 3
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "LOAD_NO_CACHE"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = 2
            goto L_0x0035
        L_0x0034:
            r7 = -1
        L_0x0035:
            if (r7 == 0) goto L_0x004a
            if (r7 == r4) goto L_0x0045
            if (r7 == r3) goto L_0x0040
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            goto L_0x004e
        L_0x0040:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            goto L_0x004e
        L_0x0045:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            goto L_0x004e
        L_0x004a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        L_0x004e:
            android.webkit.WebSettings r6 = r6.getSettings()
            int r7 = r7.intValue()
            r6.setCacheMode(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewManager.setCacheMode(android.webkit.WebView, java.lang.String):void");
    }

    @C2991a(name = "setDisplayZoomControls")
    public void setDisplayZoomControls(WebView webView, boolean z) {
        webView.getSettings().setDisplayZoomControls(z);
    }

    @C2991a(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @C2991a(name = "forceDarkOn")
    public void setForceDarkOn(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            if (C2250b.m9500a("FORCE_DARK")) {
                C2249a.m9498b(webView.getSettings(), z ? 2 : 0);
            }
            if (z && C2250b.m9500a("FORCE_DARK_STRATEGY")) {
                C2249a.m9499c(webView.getSettings(), 2);
            }
        }
    }

    @C2991a(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @C2991a(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(WebView webView, boolean z) {
        if (z) {
            webView.setLayerType(1, (Paint) null);
        }
    }

    @C2991a(name = "incognito")
    public void setIncognito(WebView webView, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().removeAllCookies((ValueCallback) null);
            } else {
                CookieManager.getInstance().removeAllCookie();
            }
            webView.getSettings().setCacheMode(2);
            webView.getSettings().setAppCacheEnabled(false);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    @C2991a(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((C5302f) webView).setInjectedJavaScript(str);
    }

    @C2991a(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(WebView webView, String str) {
        ((C5302f) webView).setInjectedJavaScriptBeforeContentLoaded(str);
    }

    @C2991a(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(WebView webView, boolean z) {
        ((C5302f) webView).setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(z);
    }

    @C2991a(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(WebView webView, boolean z) {
        ((C5302f) webView).setInjectedJavaScriptForMainFrameOnly(z);
    }

    @C2991a(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
    }

    @C2991a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @C2991a(name = "androidLayerType")
    public void setLayerType(WebView webView, String str) {
        str.hashCode();
        webView.setLayerType(!str.equals("hardware") ? !str.equals("software") ? 0 : 1 : 2, (Paint) null);
    }

    @C2991a(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @C2991a(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((C5302f) webView).setMessagingEnabled(z);
    }

    @C2991a(name = "messagingModuleName")
    public void setMessagingModuleName(WebView webView, String str) {
        ((C5302f) webView).setMessagingModuleName(str);
    }

    @C2991a(name = "minimumFontSize")
    public void setMinimumFontSize(WebView webView, int i) {
        webView.getSettings().setMinimumFontSize(i);
    }

    @C2991a(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        int i;
        WebSettings webSettings;
        if (Build.VERSION.SDK_INT >= 21) {
            if (str == null || "never".equals(str)) {
                webSettings = webView.getSettings();
                i = 1;
            } else if ("always".equals(str)) {
                webSettings = webView.getSettings();
                i = 0;
            } else if ("compatibility".equals(str)) {
                webSettings = webView.getSettings();
                i = 2;
            } else {
                return;
            }
            webSettings.setMixedContentMode(i);
        }
    }

    @C2991a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(WebView webView, boolean z) {
        ((C5302f) webView).setNestedScrollEnabled(z);
    }

    @C2991a(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        ((C5302f) webView).setSendContentSizeChangeEvents(z);
    }

    @C2991a(name = "onScroll")
    public void setOnScroll(WebView webView, boolean z) {
        ((C5302f) webView).setHasScrollEvent(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    @com.facebook.react.uimanager.p120j1.C2991a(name = "overScrollMode")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOverScrollMode(android.webkit.WebView r6, java.lang.String r7) {
        /*
            r5 = this;
            int r0 = r7.hashCode()
            r1 = -1414557169(0xffffffffabaf920f, float:-1.2475037E-12)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 104712844(0x63dca8c, float:3.5695757E-35)
            if (r0 == r1) goto L_0x0021
            r1 = 951530617(0x38b73479, float:8.735894E-5)
            if (r0 == r1) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r0 = "content"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 1
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "never"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "always"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 2
            goto L_0x0036
        L_0x0035:
            r7 = -1
        L_0x0036:
            if (r7 == 0) goto L_0x0044
            if (r7 == r4) goto L_0x003f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            goto L_0x0048
        L_0x003f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            goto L_0x0048
        L_0x0044:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
        L_0x0048:
            int r7 = r7.intValue()
            r6.setOverScrollMode(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewManager.setOverScrollMode(android.webkit.WebView, java.lang.String):void");
    }

    @C2991a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @C2991a(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(z);
    }

    @C2991a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(WebView webView, boolean z) {
        webView.setHorizontalScrollBarEnabled(z);
    }

    @C2991a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(WebView webView, boolean z) {
        webView.setVerticalScrollBarEnabled(z);
    }

    @C2991a(name = "source")
    public void setSource(WebView webView, ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                webView.loadDataWithBaseURL(readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : HttpUrl.FRAGMENT_ENCODE_SET, readableMap.getString("html"), HTML_MIME_TYPE, HTML_ENCODING, (String) null);
                return;
            } else if (readableMap.hasKey("uri")) {
                String string = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url != null && url.equals(string)) {
                    return;
                }
                if (!readableMap.hasKey("method") || !readableMap.getString("method").equalsIgnoreCase(HTTP_METHOD_POST)) {
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        ReadableMap map = readableMap.getMap("headers");
                        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                        while (keySetIterator.hasNextKey()) {
                            String nextKey = keySetIterator.nextKey();
                            if (!"user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                                hashMap.put(nextKey, map.getString(nextKey));
                            } else if (webView.getSettings() != null) {
                                webView.getSettings().setUserAgentString(map.getString(nextKey));
                            }
                        }
                    }
                    webView.loadUrl(string, hashMap);
                    return;
                }
                byte[] bArr = null;
                if (readableMap.hasKey("body")) {
                    String string2 = readableMap.getString("body");
                    try {
                        bArr = string2.getBytes(HTML_ENCODING);
                    } catch (UnsupportedEncodingException unused) {
                        bArr = string2.getBytes();
                    }
                }
                if (bArr == null) {
                    bArr = new byte[0];
                }
                webView.postUrl(string, bArr);
                return;
            }
        }
        webView.loadUrl(BLANK_URL);
    }

    @C2991a(name = "setSupportMultipleWindows")
    public void setSupportMultipleWindows(WebView webView, boolean z) {
        webView.getSettings().setSupportMultipleWindows(z);
    }

    @C2991a(name = "textZoom")
    public void setTextZoom(WebView webView, int i) {
        webView.getSettings().setTextZoom(i);
    }

    @C2991a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @C2991a(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        C5306g rNCWebViewClient = ((C5302f) webView).getRNCWebViewClient();
        if (rNCWebViewClient != null && readableArray != null) {
            rNCWebViewClient.mo16082f(readableArray);
        }
    }

    @C2991a(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str == null) {
            str = null;
        }
        this.mUserAgent = str;
        setUserAgentString(webView);
    }

    /* access modifiers changed from: protected */
    public void setUserAgentString(WebView webView) {
        WebSettings settings;
        String str;
        if (this.mUserAgent != null) {
            settings = webView.getSettings();
            str = this.mUserAgent;
        } else if (this.mUserAgentWithApplicationName != null) {
            settings = webView.getSettings();
            str = this.mUserAgentWithApplicationName;
        } else if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
            return;
        } else {
            return;
        }
        settings.setUserAgentString(str);
    }

    /* access modifiers changed from: protected */
    public void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        Activity currentActivity = reactContext.getCurrentActivity();
        if (!this.mAllowsFullscreenVideo || currentActivity == null) {
            C5301e eVar = this.mWebChromeClient;
            if (eVar != null) {
                eVar.onHideCustomView();
            }
            C5300d dVar = new C5300d(reactContext, webView);
            this.mWebChromeClient = dVar;
            webView.setWebChromeClient(dVar);
            return;
        }
        C5299c cVar = new C5299c(reactContext, webView, currentActivity, currentActivity.getRequestedOrientation());
        this.mWebChromeClient = cVar;
        webView.setWebChromeClient(cVar);
    }
}
