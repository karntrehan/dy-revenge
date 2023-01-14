package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9108d0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9147z;

/* renamed from: com.google.android.play.core.assetpacks.a1 */
final class C4357a1 {

    /* renamed from: a */
    private static final C9101a f12380a = new C9101a("ExtractorSessionStoreView");

    /* renamed from: b */
    private final C4439v f12381b;

    /* renamed from: c */
    private final C9147z<C4430s2> f12382c;

    /* renamed from: d */
    private final C4412o0 f12383d;

    /* renamed from: e */
    private final C9147z<Executor> f12384e;

    /* renamed from: f */
    private final Map<Integer, C4447x0> f12385f = new HashMap();

    /* renamed from: g */
    private final ReentrantLock f12386g = new ReentrantLock();

    C4357a1(C4439v vVar, C9147z<C4430s2> zVar, C4412o0 o0Var, C9147z<Executor> zVar2) {
        this.f12381b = vVar;
        this.f12382c = zVar;
        this.f12383d = o0Var;
        this.f12384e = zVar2;
    }

    /* renamed from: p */
    private final Map<String, C4447x0> m16756p(List<String> list) {
        return (Map) m16757q(new C4432t0(this, list, (byte[]) null));
    }

    /* renamed from: q */
    private final <T> T m16757q(C4453z0<T> z0Var) {
        try {
            mo13806a();
            return z0Var.mo13907a();
        } finally {
            mo13807b();
        }
    }

    /* renamed from: r */
    private final C4447x0 m16758r(int i) {
        Map<Integer, C4447x0> map = this.f12385f;
        Integer valueOf = Integer.valueOf(i);
        C4447x0 x0Var = map.get(valueOf);
        if (x0Var != null) {
            return x0Var;
        }
        throw new C4396k0(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    /* renamed from: s */
    private static String m16759s(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new C4396k0("Session without pack received.");
    }

    /* renamed from: t */
    private static <T> List<T> m16760t(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13806a() {
        this.f12386g.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13807b() {
        this.f12386g.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<Integer, C4447x0> mo13808c() {
        return this.f12385f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo13809d(Bundle bundle) {
        return ((Boolean) m16757q(new C4420q0(this, bundle, (byte[]) null))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo13810e(Bundle bundle) {
        return ((Boolean) m16757q(new C4420q0(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo13811f(String str, int i, long j) {
        m16757q(new C4424r0(this, str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo13812g(int i) {
        m16757q(new C4428s0(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ Map mo13813h(List list) {
        int i;
        Map<String, C4447x0> p = m16756p(list);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C4447x0 x0Var = p.get(str);
            if (x0Var == null) {
                i = 8;
            } else {
                if (C4393j1.m16868d(x0Var.f12700c.f12689c)) {
                    try {
                        x0Var.f12700c.f12689c = 6;
                        this.f12384e.mo13826a().execute(new C4436u0(this, x0Var));
                        this.f12383d.mo13901a(str);
                    } catch (C4396k0 unused) {
                        f12380a.mo23083d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(x0Var.f12698a), str);
                    }
                }
                i = x0Var.f12700c.f12689c;
            }
            hashMap.put(str, Integer.valueOf(i));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ Map mo13814i(List list) {
        HashMap hashMap = new HashMap();
        for (C4447x0 next : this.f12385f.values()) {
            String str = next.f12700c.f12687a;
            if (list.contains(str)) {
                C4447x0 x0Var = (C4447x0) hashMap.get(str);
                if ((x0Var == null ? -1 : x0Var.f12698a) < next.f12698a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ Boolean mo13815j(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, C4447x0> map = this.f12385f;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        C4447x0 x0Var = this.f12385f.get(valueOf);
        if (x0Var.f12700c.f12689c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!C4393j1.m16871g(x0Var.f12700c.f12689c, bundle.getInt(C9108d0.m30336a("status", m16759s(bundle)))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ Boolean mo13816k(Bundle bundle) {
        C4450y0 y0Var;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, C4447x0> map = this.f12385f;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        if (map.containsKey(valueOf)) {
            C4447x0 r = m16758r(i);
            int i2 = bundle2.getInt(C9108d0.m30336a("status", r.f12700c.f12687a));
            if (C4393j1.m16871g(r.f12700c.f12689c, i2)) {
                f12380a.mo23080a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(r.f12700c.f12689c));
                C4444w0 w0Var = r.f12700c;
                String str = w0Var.f12687a;
                int i3 = w0Var.f12689c;
                if (i3 == 4) {
                    this.f12382c.mo13826a().mo13866d(i, str);
                } else if (i3 == 5) {
                    this.f12382c.mo13826a().mo13864b(i);
                } else if (i3 == 6) {
                    this.f12382c.mo13826a().mo13869g(Arrays.asList(new String[]{str}));
                }
            } else {
                r.f12700c.f12689c = i2;
                if (C4393j1.m16869e(i2)) {
                    mo13812g(i);
                    this.f12383d.mo13901a(r.f12700c.f12687a);
                } else {
                    for (C4450y0 next : r.f12700c.f12691e) {
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(C9108d0.m30337b("chunk_intents", r.f12700c.f12687a, next.f12709a));
                        if (parcelableArrayList != null) {
                            for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                                if (!(parcelableArrayList.get(i4) == null || ((Intent) parcelableArrayList.get(i4)).getData() == null)) {
                                    next.f12712d.get(i4).f12673a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String s = m16759s(bundle);
            long j = bundle2.getLong(C9108d0.m30336a("pack_version", s));
            int i5 = bundle2.getInt(C9108d0.m30336a("status", s));
            long j2 = bundle2.getLong(C9108d0.m30336a("total_bytes_to_download", s));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(C9108d0.m30336a("slice_ids", s));
            ArrayList arrayList = new ArrayList();
            for (T t : m16760t(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(C9108d0.m30337b("chunk_intents", s, t));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m16760t(parcelableArrayList2)) {
                    if (intent == null) {
                        z = false;
                    }
                    arrayList2.add(new C4440v0(z));
                    z = true;
                }
                String string = bundle2.getString(C9108d0.m30337b("uncompressed_hash_sha256", s, t));
                long j3 = bundle2.getLong(C9108d0.m30337b("uncompressed_size", s, t));
                int i6 = bundle2.getInt(C9108d0.m30337b("patch_format", s, t), 0);
                if (i6 != 0) {
                    y0Var = new C4450y0(t, string, j3, arrayList2, 0, i6);
                } else {
                    y0Var = new C4450y0(t, string, j3, arrayList2, bundle2.getInt(C9108d0.m30337b("compression_format", s, t), 0), 0);
                }
                arrayList.add(y0Var);
                z = true;
            }
            this.f12385f.put(Integer.valueOf(i), new C4447x0(i, bundle2.getInt("app_version_code"), new C4444w0(s, j, i5, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo13817l(String str, int i, long j) {
        C4447x0 x0Var = m16756p(Arrays.asList(new String[]{str})).get(str);
        if (x0Var == null || C4393j1.m16869e(x0Var.f12700c.f12689c)) {
            f12380a.mo23081b(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.f12381b.mo13933b(str, i, j);
        x0Var.f12700c.f12689c = 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo13818m(int i) {
        m16758r(i).f12700c.f12689c = 5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo13819n(int i) {
        C4447x0 r = m16758r(i);
        if (C4393j1.m16869e(r.f12700c.f12689c)) {
            C4439v vVar = this.f12381b;
            C4444w0 w0Var = r.f12700c;
            vVar.mo13933b(w0Var.f12687a, r.f12699b, w0Var.f12688b);
            C4444w0 w0Var2 = r.f12700c;
            int i2 = w0Var2.f12689c;
            if (i2 == 5 || i2 == 6) {
                this.f12381b.mo13934c(w0Var2.f12687a, r.f12699b, w0Var2.f12688b);
                return;
            }
            return;
        }
        throw new C4396k0(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo13820o(int i) {
        m16757q(new C4428s0(this, i, (byte[]) null));
    }
}
