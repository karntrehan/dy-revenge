package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.devsupport.C2720d;
import com.facebook.react.modules.core.C2793b;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.n */
public class C2885n {

    /* renamed from: a */
    private final Activity f8096a;

    /* renamed from: b */
    private C3249w f8097b;

    /* renamed from: c */
    private final String f8098c;

    /* renamed from: d */
    private Bundle f8099d;

    /* renamed from: e */
    private C2720d f8100e = new C2720d();

    /* renamed from: f */
    private C2904r f8101f;

    public C2885n(Activity activity, C2904r rVar, String str, Bundle bundle) {
        this.f8096a = activity;
        this.f8098c = str;
        this.f8099d = bundle;
        this.f8101f = rVar;
    }

    /* renamed from: c */
    private C2904r m11360c() {
        return this.f8101f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3249w mo9077a() {
        return new C3249w(this.f8096a);
    }

    /* renamed from: b */
    public C2886o mo9262b() {
        return m11360c().mo9345i();
    }

    /* renamed from: d */
    public C3249w mo9263d() {
        return this.f8097b;
    }

    /* renamed from: e */
    public void mo9264e() {
        mo9265f(this.f8098c);
    }

    /* renamed from: f */
    public void mo9265f(String str) {
        if (this.f8097b == null) {
            C3249w a = mo9077a();
            this.f8097b = a;
            a.mo10693o(m11360c().mo9345i(), str, this.f8099d);
            return;
        }
        throw new IllegalStateException("Cannot loadApp while app is already running.");
    }

    /* renamed from: g */
    public void mo9266g(int i, int i2, Intent intent, boolean z) {
        if (m11360c().mo9352p() && z) {
            m11360c().mo9345i().mo9274I(this.f8096a, i, i2, intent);
        }
    }

    /* renamed from: h */
    public boolean mo9267h() {
        if (!m11360c().mo9352p()) {
            return false;
        }
        m11360c().mo9345i().mo9275J();
        return true;
    }

    /* renamed from: i */
    public void mo9268i() {
        C3249w wVar = this.f8097b;
        if (wVar != null) {
            wVar.mo10703q();
            this.f8097b = null;
        }
        if (m11360c().mo9352p()) {
            m11360c().mo9345i().mo9278M(this.f8096a);
        }
    }

    /* renamed from: j */
    public void mo9269j() {
        if (m11360c().mo9352p()) {
            m11360c().mo9345i().mo9280O(this.f8096a);
        }
    }

    /* renamed from: k */
    public void mo9270k() {
        if (!m11360c().mo9352p()) {
            return;
        }
        if (this.f8096a instanceof C2793b) {
            C2886o i = m11360c().mo9345i();
            Activity activity = this.f8096a;
            i.mo9282Q(activity, (C2793b) activity);
            return;
        }
        throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
    }

    /* renamed from: l */
    public boolean mo9271l(int i, KeyEvent keyEvent) {
        if (!m11360c().mo9352p() || !m11360c().mo9351o()) {
            return false;
        }
        if (i == 82) {
            m11360c().mo9345i().mo9286c0();
            return true;
        } else if (!((C2720d) C6409a.m24521c(this.f8100e)).mo8902b(i, this.f8096a.getCurrentFocus())) {
            return false;
        } else {
            m11360c().mo9345i().mo9292y().mo8886i();
            return true;
        }
    }
}
