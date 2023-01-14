package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.C0064c;
import com.facebook.react.modules.core.C2793b;
import com.facebook.react.modules.core.C2802e;
import com.facebook.react.modules.core.C2803f;

/* renamed from: com.facebook.react.j */
public abstract class C2769j extends C0064c implements C2793b, C2802e {

    /* renamed from: G */
    private final C2771k f7836G = mo9048L();

    protected C2769j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public C2771k mo9048L() {
        return new C2771k(this, mo9049M());
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public String mo9049M() {
        return null;
    }

    /* renamed from: c */
    public void mo9050c() {
        super.onBackPressed();
    }

    /* renamed from: i */
    public void mo8378i(String[] strArr, int i, C2803f fVar) {
        this.f7836G.mo9076x(strArr, i, fVar);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f7836G.mo9063k(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.f7836G.mo9064l()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7836G.mo9065m(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7836G.mo9066n(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f7836G.mo9067o();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f7836G.mo9068p(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.f7836G.mo9069q(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f7836G.mo9070r(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        if (!this.f7836G.mo9071s(intent)) {
            super.onNewIntent(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f7836G.mo9072t();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f7836G.mo9073u(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f7836G.mo9074v();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f7836G.mo9075w(z);
    }
}
