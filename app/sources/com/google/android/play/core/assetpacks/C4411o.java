package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9121k;
import p174e.p319f.p320a.p382e.p383a.p385b.C9129o;
import p174e.p319f.p320a.p382e.p383a.p385b.C9130o0;
import p174e.p319f.p320a.p382e.p383a.p387d.C9151a;
import p174e.p319f.p320a.p382e.p383a.p389f.C9156d;
import p174e.p319f.p320a.p382e.p383a.p389f.C9158f;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.o */
final class C4411o implements C4430s2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C9101a f12593a = new C9101a("AssetPackServiceImpl");

    /* renamed from: b */
    private static final Intent f12594b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f12595c;

    /* renamed from: d */
    private final C4412o0 f12596d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9121k<C9130o0> f12597e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C9121k<C9130o0> f12598f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicBoolean f12599g = new AtomicBoolean();

    C4411o(Context context, C4412o0 o0Var) {
        this.f12595c = context.getPackageName();
        this.f12596d = o0Var;
        if (C9129o.m30393a(context)) {
            Context b = C9151a.m30446b(context);
            C9101a aVar = f12593a;
            Intent intent = f12594b;
            this.f12597e = new C9121k(b, aVar, "AssetPackService", intent, C4434t2.f12655b);
            this.f12598f = new C9121k(C9151a.m30446b(context), aVar, "AssetPackService-keepAlive", intent, C4434t2.f12654a);
        }
        f12593a.mo23080a("AssetPackService initiated.", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Bundle m16893h(int i, String str) {
        Bundle i2 = m16894i(i);
        i2.putString("module_name", str);
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static Bundle m16894i(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static Bundle m16895j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10901);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    /* renamed from: k */
    static /* synthetic */ ArrayList m16896k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: m */
    static /* synthetic */ Bundle m16898m(Map map) {
        Bundle j = m16895j();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        j.putParcelableArrayList("installed_asset_module", arrayList);
        return j;
    }

    /* renamed from: q */
    static /* synthetic */ Bundle m16902q(int i, String str, String str2, int i2) {
        Bundle h = m16893h(i, str);
        h.putString("slice_id", str2);
        h.putInt("chunk_number", i2);
        return h;
    }

    /* renamed from: u */
    static /* synthetic */ List m16906u(C4411o oVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = C4363c.m16787b((Bundle) it.next(), oVar.f12596d).mo13801e().values().iterator().next();
            if (next == null) {
                f12593a.mo23081b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C4393j1.m16868d(next.mo13795g())) {
                arrayList.add(next.mo13794f());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final void m16909x(int i, String str, int i2) {
        if (this.f12597e != null) {
            f12593a.mo23083d("notifyModuleCompleted", new Object[0]);
            C9165m mVar = new C9165m();
            this.f12597e.mo23099a(new C4375f(this, mVar, i, str, mVar, i2));
            return;
        }
        throw new C4396k0("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: y */
    private static <T> C9156d<T> m16910y() {
        f12593a.mo23081b("onError(%d)", -11);
        return C9158f.m30459c(new C4355a(-11));
    }

    /* renamed from: a */
    public final synchronized void mo13863a() {
        if (this.f12598f == null) {
            f12593a.mo23084e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C9101a aVar = f12593a;
        aVar.mo23083d("keepAlive", new Object[0]);
        if (!this.f12599g.compareAndSet(false, true)) {
            aVar.mo23083d("Service is already kept alive.", new Object[0]);
            return;
        }
        C9165m mVar = new C9165m();
        this.f12598f.mo23099a(new C4387i(this, mVar, mVar));
    }

    /* renamed from: b */
    public final void mo13864b(int i) {
        if (this.f12597e != null) {
            f12593a.mo23083d("notifySessionFailed", new Object[0]);
            C9165m mVar = new C9165m();
            this.f12597e.mo23099a(new C4379g(this, mVar, i, mVar));
            return;
        }
        throw new C4396k0("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: c */
    public final void mo13865c(int i, String str, String str2, int i2) {
        if (this.f12597e != null) {
            f12593a.mo23083d("notifyChunkTransferred", new Object[0]);
            C9165m mVar = new C9165m();
            this.f12597e.mo23099a(new C4371e(this, mVar, i, str, str2, i2, mVar));
            return;
        }
        throw new C4396k0("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: d */
    public final void mo13866d(int i, String str) {
        m16909x(i, str, 10);
    }

    /* renamed from: e */
    public final C9156d<ParcelFileDescriptor> mo13867e(int i, String str, String str2, int i2) {
        if (this.f12597e == null) {
            return m16910y();
        }
        f12593a.mo23083d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C9165m mVar = new C9165m();
        this.f12597e.mo23099a(new C4383h(this, mVar, i, str, str2, i2, mVar));
        return mVar.mo23141c();
    }

    /* renamed from: f */
    public final C9156d<List<String>> mo13868f(Map<String, Long> map) {
        if (this.f12597e == null) {
            return m16910y();
        }
        f12593a.mo23083d("syncPacks", new Object[0]);
        C9165m mVar = new C9165m();
        this.f12597e.mo23099a(new C4442v2(this, mVar, map, mVar));
        return mVar.mo23141c();
    }

    /* renamed from: g */
    public final void mo13869g(List<String> list) {
        if (this.f12597e != null) {
            f12593a.mo23083d("cancelDownloads(%s)", list);
            C9165m mVar = new C9165m();
            this.f12597e.mo23099a(new C4438u2(this, mVar, list, mVar));
        }
    }
}
