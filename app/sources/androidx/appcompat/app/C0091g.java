package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p027c.p028a.C1435a;
import p027c.p028a.p035o.C1466b;
import p027c.p064i.p072j.C1927e;

/* renamed from: androidx.appcompat.app.g */
public class C0091g extends Dialog implements C0065d {

    /* renamed from: f */
    private C0066e f320f;

    /* renamed from: o */
    private final C1927e.C1928a f321o = new C0092a();

    /* renamed from: androidx.appcompat.app.g$a */
    class C0092a implements C1927e.C1928a {
        C0092a() {
        }

        /* renamed from: k */
        public boolean mo369k(KeyEvent keyEvent) {
            return C0091g.this.mo358c(keyEvent);
        }
    }

    public C0091g(Context context, int i) {
        super(context, m408b(context, i));
        C0066e a = mo356a();
        a.mo264F(m408b(context, i));
        a.mo276q((Bundle) null);
    }

    /* renamed from: b */
    private static int m408b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1435a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0066e mo356a() {
        if (this.f320f == null) {
            this.f320f = C0066e.m257h(this, this);
        }
        return this.f320f;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo356a().mo266d(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo358c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public void mo233d(C1466b bVar) {
    }

    public void dismiss() {
        super.dismiss();
        mo356a().mo277r();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1927e.m8053e(this.f321o, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public void mo235e(C1466b bVar) {
    }

    /* renamed from: f */
    public boolean mo361f(int i) {
        return mo356a().mo283z(i);
    }

    public <T extends View> T findViewById(int i) {
        return mo356a().mo269i(i);
    }

    /* renamed from: h */
    public C1466b mo240h(C1466b.C1467a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        mo356a().mo274o();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo356a().mo273n();
        super.onCreate(bundle);
        mo356a().mo276q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo356a().mo282w();
    }

    public void setContentView(int i) {
        mo356a().mo260B(i);
    }

    public void setContentView(View view) {
        mo356a().mo261C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo356a().mo262D(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo356a().mo265G(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo356a().mo265G(charSequence);
    }
}
