package p508me.furtado.smsretriever;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import p174e.p319f.p320a.p335c.p338b.p339a.p340d.C6624a;
import p174e.p319f.p320a.p335c.p362h.C8953g;
import p174e.p319f.p320a.p335c.p362h.C8955h;
import p174e.p319f.p320a.p335c.p362h.C8963l;

/* renamed from: me.furtado.smsretriever.e */
final class C10863e {

    /* renamed from: a */
    private final ReactApplicationContext f28423a;

    /* renamed from: b */
    private BroadcastReceiver f28424b;

    /* renamed from: c */
    private Promise f28425c;

    /* renamed from: d */
    private final C8955h<Void> f28426d = new C10864a();

    /* renamed from: e */
    private final C8953g f28427e = new C10865b();

    /* renamed from: me.furtado.smsretriever.e$a */
    class C10864a implements C8955h<Void> {
        C10864a() {
        }

        /* renamed from: b */
        public void mo16116a(Void voidR) {
            C10863e.this.m36974f(Boolean.valueOf(C10863e.this.m36975h()));
        }
    }

    /* renamed from: me.furtado.smsretriever.e$b */
    class C10865b implements C8953g {
        C10865b() {
        }

        /* renamed from: b */
        public void mo14987b(Exception exc) {
            C10863e.this.m36976i();
            C10863e.this.m36973e("TASK_FAILURE_ERROR_TYPE", "Task failed.");
        }
    }

    C10863e(ReactApplicationContext reactApplicationContext) {
        this.f28423a = reactApplicationContext;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m36973e(String str, String str2) {
        Promise promise = this.f28425c;
        if (promise != null) {
            promise.reject(str, str2);
            this.f28425c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m36974f(Object obj) {
        Promise promise = this.f28425c;
        if (promise != null) {
            promise.resolve(obj);
            this.f28425c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public boolean m36975h() {
        this.f28424b = new C10862d(this.f28423a);
        try {
            this.f28423a.registerReceiver(this.f28424b, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m36976i() {
        BroadcastReceiver broadcastReceiver = this.f28424b;
        if (broadcastReceiver != null) {
            try {
                this.f28423a.unregisterReceiver(broadcastReceiver);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo26893g(Promise promise) {
        this.f28425c = promise;
        if (!C10855a.m36951b(this.f28423a)) {
            m36973e("UNAVAILABLE_ERROR_TYPE", "Google Play Services is not available.");
        } else if (!C10855a.m36950a(this.f28423a)) {
            m36973e("UNSUPORTED_VERSION_ERROR_TYPE", "The device version of Google Play Services is not supported.");
        } else {
            C8963l<Void> p = C6624a.m25268a(this.f28423a).mo19447p();
            p.mo22770f(this.f28426d);
            p.mo22768d(this.f28427e);
        }
    }
}
