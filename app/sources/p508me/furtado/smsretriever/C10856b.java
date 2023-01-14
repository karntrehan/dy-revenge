package p508me.furtado.smsretriever;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.C1214c;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3486f;
import p174e.p319f.p320a.p335c.p338b.p339a.C6619a;

/* renamed from: me.furtado.smsretriever.b */
final class C10856b {

    /* renamed from: a */
    private C3486f f28413a;

    /* renamed from: b */
    private Promise f28414b;

    /* renamed from: c */
    private C10860d f28415c;

    /* renamed from: d */
    private final C3486f.C3488b f28416d = new C10857a();

    /* renamed from: e */
    private final C3486f.C3489c f28417e = new C10858b();

    /* renamed from: f */
    private final ActivityEventListener f28418f = new C10859c();

    /* renamed from: me.furtado.smsretriever.b$a */
    class C10857a implements C3486f.C3488b {
        C10857a() {
        }

        /* renamed from: j */
        public void mo11294j(int i) {
            C10856b.this.m36957g("CONNECTION_SUSPENDED_ERROR_TYPE", "Client is temporarily in a disconnected state.");
            C10856b.this.m36955d();
        }

        /* renamed from: m */
        public void mo11296m(Bundle bundle) {
        }
    }

    /* renamed from: me.furtado.smsretriever.b$b */
    class C10858b implements C3486f.C3489c {
        C10858b() {
        }

        /* renamed from: k */
        public void mo11295k(C3623b bVar) {
            C10856b.this.m36957g("CONNECTION_FAILED_ERROR_TYPE", "There was an error connecting the client to the service.");
            C10856b.this.m36955d();
        }
    }

    /* renamed from: me.furtado.smsretriever.b$c */
    class C10859c extends BaseActivityEventListener {
        C10859c() {
        }

        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            super.onActivityResult(activity, i, i2, intent);
            if (i == 1 && i2 == -1) {
                C10856b.this.m36958h(((Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential")).mo11026C());
            } else {
                C10856b.this.m36957g("ACTIVITY_RESULT_NOOK_ERROR_TYPE", "There was an error trying to get the phone number.");
            }
            C10856b.this.m36955d();
        }
    }

    /* renamed from: me.furtado.smsretriever.b$d */
    public interface C10860d {
        /* renamed from: a */
        void mo26888a();
    }

    C10856b() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m36955d() {
        C10860d dVar = this.f28415c;
        if (dVar != null) {
            dVar.mo26888a();
            this.f28415c = null;
        }
    }

    /* renamed from: f */
    private C3486f m36956f(Context context, Activity activity) {
        if (this.f28413a == null) {
            C3486f.C3487a a = new C3486f.C3487a(context).mo11229b(this.f28416d).mo11228a(C6619a.f18279b);
            if (activity instanceof C1214c) {
                a = a.mo11232e((C1214c) activity, this.f28417e);
            }
            this.f28413a = a.mo11230c();
        }
        return this.f28413a;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m36957g(String str, String str2) {
        Promise promise = this.f28414b;
        if (promise != null) {
            promise.reject(str, str2);
            this.f28414b = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m36958h(Object obj) {
        Promise promise = this.f28414b;
        if (promise != null) {
            promise.resolve(obj);
            this.f28414b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ActivityEventListener mo26889e() {
        return this.f28418f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo26890i(Context context, Activity activity, Promise promise) {
        String str;
        String str2;
        if (promise == null) {
            m36955d();
            return;
        }
        this.f28414b = promise;
        if (!C10855a.m36951b(context)) {
            str = "UNAVAILABLE_ERROR_TYPE";
            str2 = "Google Play Services is not available.";
        } else if (!C10855a.m36950a(context)) {
            str = "UNSUPORTED_VERSION_ERROR_TYPE";
            str2 = "The device version of Google Play Services is not supported.";
        } else if (activity == null) {
            str = "ACTIVITY_NULL_ERROR_TYPE";
            str2 = "Activity is null.";
        } else {
            HintRequest a = new HintRequest.C3423a().mo11050b(true).mo11049a();
            try {
                activity.startIntentSenderForResult(C6619a.f18282e.mo11055a(m36956f(context, activity), a).getIntentSender(), 1, (Intent) null, 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException unused) {
                m36957g("SEND_INTENT_ERROR_TYPE", "There was an error trying to send intent.");
                m36955d();
                return;
            }
        }
        m36957g(str, str2);
        m36955d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo26891j(C10860d dVar) {
        this.f28415c = dVar;
    }
}
