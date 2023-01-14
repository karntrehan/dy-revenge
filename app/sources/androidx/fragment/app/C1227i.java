package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.util.C1177h;

/* renamed from: androidx.fragment.app.i */
public abstract class C1227i<E> extends C1223e {

    /* renamed from: f */
    private final Activity f3491f;

    /* renamed from: o */
    private final Context f3492o;

    /* renamed from: p */
    private final Handler f3493p;

    /* renamed from: q */
    private final int f3494q;

    /* renamed from: r */
    final C1231l f3495r;

    C1227i(Activity activity, Context context, Handler handler, int i) {
        this.f3495r = new C1242m();
        this.f3491f = activity;
        this.f3492o = (Context) C1177h.m4584f(context, "context == null");
        this.f3493p = (Handler) C1177h.m4584f(handler, "handler == null");
        this.f3494q = i;
    }

    C1227i(C1214c cVar) {
        this(cVar, cVar, new Handler(), 0);
    }

    /* renamed from: c */
    public View mo3955c(int i) {
        return null;
    }

    /* renamed from: d */
    public boolean mo3956d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity mo4077e() {
        return this.f3491f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Context mo4078f() {
        return this.f3492o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Handler mo4079h() {
        return this.f3493p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4017i(Fragment fragment) {
    }

    /* renamed from: k */
    public abstract E mo4018k();

    /* renamed from: l */
    public LayoutInflater mo4019l() {
        return LayoutInflater.from(this.f3492o);
    }

    /* renamed from: m */
    public void mo4020m(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: n */
    public boolean mo4021n(Fragment fragment) {
        return true;
    }

    /* renamed from: o */
    public boolean mo4022o(String str) {
        return false;
    }

    /* renamed from: p */
    public void mo4023p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f3492o.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: q */
    public void mo4024q() {
    }
}
