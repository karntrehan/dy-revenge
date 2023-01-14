package com.facebook.react;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.core.C2803f;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.k */
public class C2771k {

    /* renamed from: a */
    private final Activity f7839a;

    /* renamed from: b */
    private final String f7840b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2803f f7841c;

    /* renamed from: d */
    private Callback f7842d;

    /* renamed from: e */
    private C2885n f7843e;

    /* renamed from: com.facebook.react.k$a */
    class C2772a extends C2885n {
        C2772a(Activity activity, C2904r rVar, String str, Bundle bundle) {
            super(activity, rVar, str, bundle);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C3249w mo9077a() {
            return C2771k.this.mo9055c();
        }
    }

    /* renamed from: com.facebook.react.k$b */
    class C2773b implements Callback {

        /* renamed from: a */
        final /* synthetic */ int f7845a;

        /* renamed from: b */
        final /* synthetic */ String[] f7846b;

        /* renamed from: c */
        final /* synthetic */ int[] f7847c;

        C2773b(int i, String[] strArr, int[] iArr) {
            this.f7845a = i;
            this.f7846b = strArr;
            this.f7847c = iArr;
        }

        public void invoke(Object... objArr) {
            if (C2771k.this.f7841c != null && C2771k.this.f7841c.onRequestPermissionsResult(this.f7845a, this.f7846b, this.f7847c)) {
                C2803f unused = C2771k.this.f7841c = null;
            }
        }
    }

    public C2771k(C2769j jVar, String str) {
        this.f7839a = jVar;
        this.f7840b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C3249w mo9055c() {
        return new C3249w(mo9056d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Context mo9056d() {
        return (Context) C6409a.m24521c(this.f7839a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Bundle mo9057e() {
        return null;
    }

    /* renamed from: f */
    public String mo9058f() {
        return this.f7840b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Activity mo9059g() {
        return (Activity) mo9056d();
    }

    /* renamed from: h */
    public C2886o mo9060h() {
        return this.f7843e.mo9262b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C2904r mo9061i() {
        return ((C2775m) mo9059g().getApplication()).mo9081a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo9062j(String str) {
        this.f7843e.mo9265f(str);
        mo9059g().setContentView(this.f7843e.mo9263d());
    }

    /* renamed from: k */
    public void mo9063k(int i, int i2, Intent intent) {
        this.f7843e.mo9266g(i, i2, intent, true);
    }

    /* renamed from: l */
    public boolean mo9064l() {
        return this.f7843e.mo9267h();
    }

    /* renamed from: m */
    public void mo9065m(Configuration configuration) {
        if (mo9061i().mo9352p()) {
            mo9060h().mo9276K(mo9056d(), configuration);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo9066n(Bundle bundle) {
        String f = mo9058f();
        this.f7843e = new C2772a(mo9059g(), mo9061i(), f, mo9057e());
        if (this.f7840b != null) {
            mo9062j(f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo9067o() {
        this.f7843e.mo9268i();
    }

    /* renamed from: p */
    public boolean mo9068p(int i, KeyEvent keyEvent) {
        if (!mo9061i().mo9352p() || !mo9061i().mo9351o() || i != 90) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    /* renamed from: q */
    public boolean mo9069q(int i, KeyEvent keyEvent) {
        if (!mo9061i().mo9352p() || !mo9061i().mo9351o() || i != 90) {
            return false;
        }
        mo9061i().mo9345i().mo9286c0();
        return true;
    }

    /* renamed from: r */
    public boolean mo9070r(int i, KeyEvent keyEvent) {
        return this.f7843e.mo9271l(i, keyEvent);
    }

    /* renamed from: s */
    public boolean mo9071s(Intent intent) {
        if (!mo9061i().mo9352p()) {
            return false;
        }
        mo9061i().mo9345i().mo9283S(intent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo9072t() {
        this.f7843e.mo9269j();
    }

    /* renamed from: u */
    public void mo9073u(int i, String[] strArr, int[] iArr) {
        this.f7842d = new C2773b(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo9074v() {
        this.f7843e.mo9270k();
        Callback callback = this.f7842d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f7842d = null;
        }
    }

    /* renamed from: w */
    public void mo9075w(boolean z) {
        if (mo9061i().mo9352p()) {
            mo9061i().mo9345i().mo9284T(z);
        }
    }

    @TargetApi(23)
    /* renamed from: x */
    public void mo9076x(String[] strArr, int i, C2803f fVar) {
        this.f7841c = fVar;
        mo9059g().requestPermissions(strArr, i);
    }
}
