package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p027c.p060f.C1788a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6691e;

/* renamed from: com.google.android.gms.common.api.internal.h3 */
public final class C3535h3 extends Fragment implements C3531h {

    /* renamed from: f */
    private static final WeakHashMap<Activity, WeakReference<C3535h3>> f9975f = new WeakHashMap<>();

    /* renamed from: o */
    private final Map<String, LifecycleCallback> f9976o = Collections.synchronizedMap(new C1788a());
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f9977p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Bundle f9978q;

    /* renamed from: f */
    public static C3535h3 m13749f(Activity activity) {
        C3535h3 h3Var;
        WeakHashMap<Activity, WeakReference<C3535h3>> weakHashMap = f9975f;
        WeakReference weakReference = weakHashMap.get(activity);
        if (weakReference != null && (h3Var = (C3535h3) weakReference.get()) != null) {
            return h3Var;
        }
        try {
            C3535h3 h3Var2 = (C3535h3) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (h3Var2 == null || h3Var2.isRemoving()) {
                h3Var2 = new C3535h3();
                activity.getFragmentManager().beginTransaction().add(h3Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(h3Var2));
            return h3Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: a */
    public final void mo11348a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f9976o.containsKey(str)) {
            this.f9976o.put(str, lifecycleCallback);
            if (this.f9977p > 0) {
                new C6691e(Looper.getMainLooper()).post(new C3530g3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public final <T extends LifecycleCallback> T mo11349c(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f9976o.get(str));
    }

    /* renamed from: d */
    public final Activity mo11350d() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f9976o.values()) {
            a.mo11248a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f9976o.values()) {
            e.mo11250e(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9977p = 1;
        this.f9978q = bundle;
        for (Map.Entry next : this.f9976o.entrySet()) {
            ((LifecycleCallback) next.getValue()).mo11251f(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f9977p = 5;
        for (LifecycleCallback g : this.f9976o.values()) {
            g.mo11252g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f9977p = 3;
        for (LifecycleCallback h : this.f9976o.values()) {
            h.mo11253h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f9976o.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).mo11254i(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f9977p = 2;
        for (LifecycleCallback j : this.f9976o.values()) {
            j.mo11255j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f9977p = 4;
        for (LifecycleCallback k : this.f9976o.values()) {
            k.mo11256k();
        }
    }
}
