package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0210c1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C1098a;
import androidx.core.app.C1115g;
import androidx.core.app.C1131p;
import androidx.fragment.app.C1214c;
import p027c.p028a.p035o.C1466b;

/* renamed from: androidx.appcompat.app.c */
public class C0064c extends C1214c implements C0065d, C1131p.C1132a {

    /* renamed from: E */
    private C0066e f219E;

    /* renamed from: F */
    private Resources f220F;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m235H(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0064c.m235H(android.view.KeyEvent):boolean");
    }

    /* renamed from: A */
    public C0066e mo220A() {
        if (this.f219E == null) {
            this.f219E = C0066e.m256g(this, this);
        }
        return this.f219E;
    }

    /* renamed from: B */
    public C0058a mo221B() {
        return mo220A().mo272m();
    }

    /* renamed from: C */
    public void mo222C(C1131p pVar) {
        pVar.mo3605g(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo223D(int i) {
    }

    /* renamed from: E */
    public void mo224E(C1131p pVar) {
    }

    @Deprecated
    /* renamed from: F */
    public void mo225F() {
    }

    /* renamed from: G */
    public boolean mo226G() {
        Intent f = mo236f();
        if (f == null) {
            return false;
        }
        if (mo229K(f)) {
            C1131p j = C1131p.m4396j(this);
            mo222C(j);
            mo224E(j);
            j.mo3608k();
            try {
                C1098a.m4296j(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo228J(f);
            return true;
        }
    }

    /* renamed from: I */
    public void mo227I(Toolbar toolbar) {
        mo220A().mo263E(toolbar);
    }

    /* renamed from: J */
    public void mo228J(Intent intent) {
        C1115g.m4327e(this, intent);
    }

    /* renamed from: K */
    public boolean mo229K(Intent intent) {
        return C1115g.m4328f(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo220A().mo266d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo220A().mo268f(context));
    }

    public void closeOptionsMenu() {
        C0058a B = mo221B();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (B == null || !B.mo182g()) {
            super.closeOptionsMenu();
        }
    }

    /* renamed from: d */
    public void mo233d(C1466b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0058a B = mo221B();
        if (keyCode != 82 || B == null || !B.mo191p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: e */
    public void mo235e(C1466b bVar) {
    }

    /* renamed from: f */
    public Intent mo236f() {
        return C1115g.m4323a(this);
    }

    public <T extends View> T findViewById(int i) {
        return mo220A().mo269i(i);
    }

    public MenuInflater getMenuInflater() {
        return mo220A().mo271l();
    }

    public Resources getResources() {
        if (this.f220F == null && C0210c1.m1077c()) {
            this.f220F = new C0210c1(this, super.getResources());
        }
        Resources resources = this.f220F;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: h */
    public C1466b mo240h(C1466b.C1467a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        mo220A().mo274o();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f220F != null) {
            this.f220F.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        mo220A().mo275p(configuration);
    }

    public void onContentChanged() {
        mo225F();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0066e A = mo220A();
        A.mo273n();
        A.mo276q(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo220A().mo277r();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m235H(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0058a B = mo221B();
        if (menuItem.getItemId() != 16908332 || B == null || (B.mo185j() & 4) == 0) {
            return false;
        }
        return mo226G();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo220A().mo278s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo220A().mo279t();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo220A().mo280u(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo220A().mo281v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo220A().mo282w();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo220A().mo265G(charSequence);
    }

    public void openOptionsMenu() {
        C0058a B = mo221B();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (B == null || !B.mo192q()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo220A().mo260B(i);
    }

    public void setContentView(View view) {
        mo220A().mo261C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo220A().mo262D(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo220A().mo264F(i);
    }

    /* renamed from: z */
    public void mo259z() {
        mo220A().mo274o();
    }
}
