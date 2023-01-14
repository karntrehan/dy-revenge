package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1291g;
import androidx.lifecycle.C1292h;
import androidx.lifecycle.C1303p;
import p027c.p060f.C1801g;
import p027c.p064i.p072j.C1927e;

/* renamed from: androidx.core.app.f */
public class C1114f extends Activity implements C1291g, C1927e.C1928a {

    /* renamed from: f */
    private C1801g<Class<?>, ?> f3099f = new C1801g<>();

    /* renamed from: o */
    private C1292h f3100o = new C1292h(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1927e.m8052d(decorView, keyEvent)) {
            return C1927e.m8053e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1927e.m8052d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo369k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1303p.m5343f(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f3100o.mo4343k(C1286d.C1288b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
