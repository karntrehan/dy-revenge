package com.facebook.react.modules.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.modules.network.c */
public class C2839c extends CookieHandler {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2842c f8004a = new C2842c();

    /* renamed from: b */
    private final ReactContext f8005b;

    /* renamed from: c */
    private CookieManager f8006c;

    /* renamed from: com.facebook.react.modules.network.c$a */
    class C2840a implements ValueCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Callback f8007a;

        C2840a(Callback callback) {
            this.f8007a = callback;
        }

        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            C2839c.this.f8004a.mo9221c();
            this.f8007a.invoke(bool);
        }
    }

    /* renamed from: com.facebook.react.modules.network.c$b */
    class C2841b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f8009a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2841b(ReactContext reactContext, Runnable runnable) {
            super(reactContext);
            this.f8009a = runnable;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            this.f8009a.run();
        }
    }

    /* renamed from: com.facebook.react.modules.network.c$c */
    private class C2842c {

        /* renamed from: a */
        private final Handler f8011a;

        /* renamed from: com.facebook.react.modules.network.c$c$a */
        class C2843a implements Handler.Callback {

            /* renamed from: a */
            final /* synthetic */ C2839c f8013a;

            C2843a(C2839c cVar) {
                this.f8013a = cVar;
            }

            public boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                C2842c.this.mo9222d();
                return true;
            }
        }

        /* renamed from: com.facebook.react.modules.network.c$c$b */
        class C2844b implements Runnable {
            C2844b() {
            }

            public void run() {
                C2842c.this.m11292b();
            }
        }

        public C2842c() {
            this.f8011a = new Handler(Looper.getMainLooper(), new C2843a(C2839c.this));
        }

        /* access modifiers changed from: private */
        @TargetApi(21)
        /* renamed from: b */
        public void m11292b() {
            CookieManager c = C2839c.this.m11282i();
            if (c != null) {
                c.flush();
            }
        }

        /* renamed from: c */
        public void mo9221c() {
        }

        /* renamed from: d */
        public void mo9222d() {
            this.f8011a.removeMessages(1);
            C2839c.this.m11285l(new C2844b());
        }
    }

    public C2839c(ReactContext reactContext) {
        this.f8005b = reactContext;
    }

    @TargetApi(21)
    /* renamed from: d */
    private void m11280d(String str, String str2) {
        CookieManager i = m11282i();
        if (i != null) {
            i.setCookie(str, str2, (ValueCallback) null);
        }
    }

    @TargetApi(21)
    /* renamed from: g */
    private void m11281g(Callback callback) {
        CookieManager i = m11282i();
        if (i != null) {
            i.removeAllCookies(new C2840a(callback));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public CookieManager m11282i() {
        if (this.f8006c == null) {
            m11284k(this.f8005b);
            try {
                this.f8006c = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e) {
                if (e.getMessage() != null && e.getClass().getCanonicalName().contains("MissingWebViewPackageException")) {
                    return null;
                }
                throw e;
            }
        }
        return this.f8006c;
    }

    /* renamed from: j */
    private static boolean m11283j(String str) {
        return str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2");
    }

    /* renamed from: k */
    private static void m11284k(Context context) {
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m11285l(Runnable runnable) {
        new C2841b(this.f8005b, runnable).execute(new Void[0]);
    }

    /* renamed from: e */
    public void mo9213e(String str, List<String> list) {
        CookieManager i = m11282i();
        if (i != null) {
            for (String d : list) {
                m11280d(str, d);
            }
            i.flush();
            this.f8004a.mo9221c();
        }
    }

    /* renamed from: f */
    public void mo9214f(Callback callback) {
        m11281g(callback);
    }

    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        CookieManager i = m11282i();
        if (i == null) {
            return Collections.emptyMap();
        }
        String cookie = i.getCookie(uri.toString());
        return TextUtils.isEmpty(cookie) ? Collections.emptyMap() : Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    /* renamed from: h */
    public void mo9216h() {
    }

    public void put(URI uri, Map<String, List<String>> map) {
        String uri2 = uri.toString();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (str != null && m11283j(str)) {
                mo9213e(uri2, (List) next.getValue());
            }
        }
    }
}
