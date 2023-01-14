package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.C1214c;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p027c.p060f.C1788a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6691e;

public final class zzd extends Fragment implements C3531h {

    /* renamed from: k0 */
    private static final WeakHashMap<C1214c, WeakReference<zzd>> f10179k0 = new WeakHashMap<>();

    /* renamed from: l0 */
    private final Map<String, LifecycleCallback> f10180l0 = Collections.synchronizedMap(new C1788a());
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public int f10181m0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public Bundle f10182n0;

    /* renamed from: y1 */
    public static zzd m14055y1(C1214c cVar) {
        zzd zzd;
        WeakHashMap<C1214c, WeakReference<zzd>> weakHashMap = f10179k0;
        WeakReference weakReference = weakHashMap.get(cVar);
        if (weakReference != null && (zzd = (zzd) weakReference.get()) != null) {
            return zzd;
        }
        try {
            zzd zzd2 = (zzd) cVar.mo4006q().mo4131Z("SupportLifecycleFragmentImpl");
            if (zzd2 == null || zzd2.mo3877W()) {
                zzd2 = new zzd();
                cVar.mo4006q().mo4142i().mo4245e(zzd2, "SupportLifecycleFragmentImpl").mo3972h();
            }
            weakHashMap.put(cVar, new WeakReference(zzd2));
            return zzd2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: C0 */
    public final void mo3843C0() {
        super.mo3843C0();
        this.f10181m0 = 3;
        for (LifecycleCallback h : this.f10180l0.values()) {
            h.mo11253h();
        }
    }

    /* renamed from: D0 */
    public final void mo3818D0(Bundle bundle) {
        super.mo3818D0(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f10180l0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).mo11254i(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    /* renamed from: E0 */
    public final void mo3820E0() {
        super.mo3820E0();
        this.f10181m0 = 2;
        for (LifecycleCallback j : this.f10180l0.values()) {
            j.mo11255j();
        }
    }

    /* renamed from: F0 */
    public final void mo3821F0() {
        super.mo3821F0();
        this.f10181m0 = 4;
        for (LifecycleCallback k : this.f10180l0.values()) {
            k.mo11256k();
        }
    }

    /* renamed from: a */
    public final void mo11348a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f10180l0.containsKey(str)) {
            this.f10180l0.put(str, lifecycleCallback);
            if (this.f10181m0 > 0) {
                new C6691e(Looper.getMainLooper()).post(new C3541i3(this, lifecycleCallback, str));
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
        return (LifecycleCallback) cls.cast(this.f10180l0.get(str));
    }

    /* renamed from: c0 */
    public final void mo3888c0(int i, int i2, Intent intent) {
        super.mo3888c0(i, i2, intent);
        for (LifecycleCallback e : this.f10180l0.values()) {
            e.mo11250e(i, i2, intent);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ Activity mo11350d() {
        return mo3909l();
    }

    /* renamed from: f */
    public final void mo3895f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo3895f(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f10180l0.values()) {
            a.mo11248a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: h0 */
    public final void mo3825h0(Bundle bundle) {
        super.mo3825h0(bundle);
        this.f10181m0 = 1;
        this.f10182n0 = bundle;
        for (Map.Entry next : this.f10180l0.entrySet()) {
            ((LifecycleCallback) next.getValue()).mo11251f(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    /* renamed from: m0 */
    public final void mo3913m0() {
        super.mo3913m0();
        this.f10181m0 = 5;
        for (LifecycleCallback g : this.f10180l0.values()) {
            g.mo11252g();
        }
    }
}
