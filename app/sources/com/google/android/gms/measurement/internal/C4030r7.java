package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p060f.C1788a;
import p174e.p319f.p320a.p335c.p345f.p352g.C6825he;
import p174e.p319f.p320a.p335c.p345f.p352g.C6840id;

/* renamed from: com.google.android.gms.measurement.internal.r7 */
public final class C4030r7 extends C3876f4 {

    /* renamed from: c */
    protected C4018q7 f11234c;

    /* renamed from: d */
    private C3969m6 f11235d;

    /* renamed from: e */
    private final Set f11236e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f11237f;

    /* renamed from: g */
    private final AtomicReference f11238g = new AtomicReference();

    /* renamed from: h */
    private final Object f11239h = new Object();

    /* renamed from: i */
    private C3923j f11240i = new C3923j((Boolean) null, (Boolean) null);

    /* renamed from: j */
    private int f11241j = 100;

    /* renamed from: k */
    private final AtomicLong f11242k = new AtomicLong(0);

    /* renamed from: l */
    private long f11243l = -1;

    /* renamed from: m */
    private int f11244m = 100;

    /* renamed from: n */
    final C3870eb f11245n;

    /* renamed from: o */
    protected boolean f11246o = true;

    /* renamed from: p */
    private final C4093wa f11247p = new C3866e7(this);

    protected C4030r7(C3955l5 l5Var) {
        super(l5Var);
        this.f11245n = new C3870eb(l5Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m15237O(Boolean bool, boolean z) {
        mo11931h();
        mo11949i();
        this.f10651a.mo11935b().mo12543q().mo12477b("Setting app measurement enabled (FE)", bool);
        this.f10651a.mo12154F().mo12259s(bool);
        if (z) {
            C4003p4 F = this.f10651a.mo12154F();
            C3955l5 l5Var = F.f10651a;
            F.mo11931h();
            SharedPreferences.Editor edit = F.mo12255o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f10651a.mo12175p() || (bool != null && !bool.booleanValue())) {
            m15238P();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m15238P() {
        Long valueOf;
        mo11931h();
        String a = this.f10651a.mo12154F().f11118n.mo12238a();
        if (a != null) {
            if ("unset".equals(a)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(true != "true".equals(a) ? 0 : 1);
            }
            mo12361M("app", "_npa", valueOf, this.f10651a.mo11936c().mo11730a());
        }
        if (!this.f10651a.mo12174o() || !this.f11246o) {
            this.f10651a.mo11935b().mo12543q().mo12476a("Updating Scion state (FE)");
            this.f10651a.mo12159L().mo12003w();
            return;
        }
        this.f10651a.mo11935b().mo12543q().mo12476a("Recording app launch after enabling measurement for the first time (FE)");
        mo12374f0();
        C6840id.m25913b();
        if (this.f10651a.mo12181z().mo12010B((String) null, C3966m3.f10997f0)) {
            this.f10651a.mo12160M().f11408d.mo12471a();
        }
        this.f10651a.mo11934a().mo12110z(new C4065u6(this));
    }

    /* renamed from: b0 */
    static /* bridge */ /* synthetic */ void m15239b0(C4030r7 r7Var, C3923j jVar, C3923j jVar2) {
        boolean z;
        C3910i[] iVarArr = {C3910i.ANALYTICS_STORAGE, C3910i.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            C3910i iVar = iVarArr[i];
            if (!jVar2.mo12123i(iVar) && jVar.mo12123i(iVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean l = jVar.mo12125l(jVar2, C3910i.ANALYTICS_STORAGE, C3910i.AD_STORAGE);
        if (z || l) {
            r7Var.f10651a.mo12150B().mo12322v();
        }
    }

    /* renamed from: c0 */
    static /* synthetic */ void m15240c0(C4030r7 r7Var, C3923j jVar, int i, long j, boolean z, boolean z2) {
        r7Var.mo11931h();
        r7Var.mo11949i();
        if (j > r7Var.f11243l || !C3923j.m14937j(r7Var.f11244m, i)) {
            C4003p4 F = r7Var.f10651a.mo12154F();
            C3955l5 l5Var = F.f10651a;
            F.mo11931h();
            if (F.mo12263w(i)) {
                SharedPreferences.Editor edit = F.mo12255o().edit();
                edit.putString("consent_settings", jVar.mo12121h());
                edit.putInt("consent_source", i);
                edit.apply();
                r7Var.f11243l = j;
                r7Var.f11244m = i;
                r7Var.f10651a.mo12159L().mo12000t(z);
                if (z2) {
                    r7Var.f10651a.mo12159L().mo11990S(new AtomicReference());
                    return;
                }
                return;
            }
            r7Var.f10651a.mo11935b().mo12547u().mo12477b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        r7Var.f10651a.mo11935b().mo12547u().mo12477b("Dropped out-of-date consent setting, proposed settings", jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo12349A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f10651a.mo11934a().mo12110z(new C4089w6(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo12350B(String str, String str2, long j, Object obj) {
        this.f10651a.mo11934a().mo12110z(new C4101x6(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo12351C(String str) {
        this.f11238g.set(str);
    }

    /* renamed from: D */
    public final void mo12352D(Bundle bundle) {
        mo12353E(bundle, this.f10651a.mo11936c().mo11730a());
    }

    /* renamed from: E */
    public final void mo12353E(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C3705r.m14346k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f10651a.mo11935b().mo12549w().mo12476a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C3705r.m14346k(bundle2);
        C3917i6.m14931a(bundle2, "app_id", cls2, (Object) null);
        C3917i6.m14931a(bundle2, "origin", cls2, (Object) null);
        C3917i6.m14931a(bundle2, "name", cls2, (Object) null);
        C3917i6.m14931a(bundle2, "value", Object.class, (Object) null);
        C3917i6.m14931a(bundle2, "trigger_event_name", cls2, (Object) null);
        C3917i6.m14931a(bundle2, "trigger_timeout", cls, 0L);
        C3917i6.m14931a(bundle2, "timed_out_event_name", cls2, (Object) null);
        C3917i6.m14931a(bundle2, "timed_out_event_params", Bundle.class, (Object) null);
        C3917i6.m14931a(bundle2, "triggered_event_name", cls2, (Object) null);
        C3917i6.m14931a(bundle2, "triggered_event_params", Bundle.class, (Object) null);
        C3917i6.m14931a(bundle2, "time_to_live", cls, 0L);
        C3917i6.m14931a(bundle2, "expired_event_name", cls2, (Object) null);
        C3917i6.m14931a(bundle2, "expired_event_params", Bundle.class, (Object) null);
        C3705r.m14342g(bundle2.getString("name"));
        C3705r.m14342g(bundle2.getString("origin"));
        C3705r.m14346k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f10651a.mo12161N().mo12512n0(string) != 0) {
            this.f10651a.mo11935b().mo12544r().mo12477b("Invalid conditional user property name", this.f10651a.mo12152D().mo12440f(string));
        } else if (this.f10651a.mo12161N().mo12508j0(string, obj) == 0) {
            Object p = this.f10651a.mo12161N().mo12515p(string, obj);
            if (p == null) {
                this.f10651a.mo11935b().mo12544r().mo12478c("Unable to normalize conditional user property value", this.f10651a.mo12152D().mo12440f(string), obj);
                return;
            }
            C3917i6.m14932b(bundle2, p);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f10651a.mo12181z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f10651a.mo11935b().mo12544r().mo12478c("Invalid conditional user property timeout", this.f10651a.mo12152D().mo12440f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.f10651a.mo12181z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f10651a.mo11935b().mo12544r().mo12478c("Invalid conditional user property time to live", this.f10651a.mo12152D().mo12440f(string), Long.valueOf(j3));
            } else {
                this.f10651a.mo11934a().mo12110z(new C4125z6(this, bundle2));
            }
        } else {
            this.f10651a.mo11935b().mo12544r().mo12478c("Invalid conditional user property value", this.f10651a.mo12152D().mo12440f(string), obj);
        }
    }

    /* renamed from: F */
    public final void mo12354F(Bundle bundle, int i, long j) {
        mo11949i();
        String g = C3923j.m14936g(bundle);
        if (g != null) {
            this.f10651a.mo11935b().mo12550x().mo12477b("Ignoring invalid consent setting", g);
            this.f10651a.mo11935b().mo12550x().mo12476a("Valid consent values are 'granted', 'denied'");
        }
        mo12355G(C3923j.m14934a(bundle), i, j);
    }

    /* renamed from: G */
    public final void mo12355G(C3923j jVar, int i, long j) {
        C3923j jVar2;
        boolean z;
        boolean z2;
        boolean z3;
        C3923j jVar3 = jVar;
        int i2 = i;
        mo11949i();
        if (i2 != -10 && jVar.mo12118e() == null && jVar.mo12120f() == null) {
            this.f10651a.mo11935b().mo12550x().mo12476a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f11239h) {
            jVar2 = this.f11240i;
            z = true;
            z2 = false;
            if (C3923j.m14937j(i2, this.f11241j)) {
                boolean k = jVar3.mo12124k(this.f11240i);
                C3910i iVar = C3910i.ANALYTICS_STORAGE;
                if (jVar3.mo12123i(iVar) && !this.f11240i.mo12123i(iVar)) {
                    z2 = true;
                }
                jVar3 = jVar3.mo12117d(this.f11240i);
                this.f11240i = jVar3;
                this.f11241j = i2;
                z3 = z2;
                z2 = k;
            } else {
                z = false;
                z3 = false;
            }
        }
        if (!z) {
            this.f10651a.mo11935b().mo12547u().mo12477b("Ignoring lower-priority consent settings, proposed settings", jVar3);
            return;
        }
        long andIncrement = this.f11242k.getAndIncrement();
        if (z2) {
            this.f11238g.set((Object) null);
            this.f10651a.mo11934a().mo12104A(new C3957l7(this, jVar3, j, i, andIncrement, z3, jVar2));
            return;
        }
        C3970m7 m7Var = new C3970m7(this, jVar3, i, andIncrement, z3, jVar2);
        if (i2 == 30 || i2 == -10) {
            this.f10651a.mo11934a().mo12104A(m7Var);
        } else {
            this.f10651a.mo11934a().mo12110z(m7Var);
        }
    }

    /* renamed from: H */
    public final void mo12356H(C3969m6 m6Var) {
        C3969m6 m6Var2;
        mo11931h();
        mo11949i();
        if (!(m6Var == null || m6Var == (m6Var2 = this.f11235d))) {
            C3705r.m14350o(m6Var2 == null, "EventInterceptor already set.");
        }
        this.f11235d = m6Var;
    }

    /* renamed from: I */
    public final void mo12357I(Boolean bool) {
        mo11949i();
        this.f10651a.mo11934a().mo12110z(new C3944k7(this, bool));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo12358J(C3923j jVar) {
        mo11931h();
        boolean z = (jVar.mo12123i(C3910i.ANALYTICS_STORAGE) && jVar.mo12123i(C3910i.AD_STORAGE)) || this.f10651a.mo12159L().mo11983A();
        if (z != this.f10651a.mo12175p()) {
            this.f10651a.mo12171l(z);
            C4003p4 F = this.f10651a.mo12154F();
            C3955l5 l5Var = F.f10651a;
            F.mo11931h();
            Boolean valueOf = F.mo12255o().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.mo12255o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                m15237O(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: K */
    public final void mo12359K(String str, String str2, Object obj, boolean z) {
        mo12360L("auto", "_ldl", obj, true, this.f10651a.mo11936c().mo11730a());
    }

    /* renamed from: L */
    public final void mo12360L(String str, String str2, Object obj, boolean z, long j) {
        int i;
        String str3 = str2;
        Object obj2 = obj;
        String str4 = str == null ? "app" : str;
        if (z) {
            i = this.f10651a.mo12161N().mo12512n0(str3);
        } else {
            C4105xa N = this.f10651a.mo12161N();
            if (N.mo12501R("user property", str3)) {
                if (!N.mo12497N("user property", C3956l6.f10928a, (String[]) null, str3)) {
                    i = 15;
                } else {
                    N.f10651a.mo12181z();
                    if (N.mo12496M("user property", 24, str3)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        if (i != 0) {
            C4105xa N2 = this.f10651a.mo12161N();
            this.f10651a.mo12181z();
            this.f10651a.mo12161N().mo12485B(this.f11247p, (String) null, i, "_ev", N2.mo12518r(str3, 24, true), str3 != null ? str2.length() : 0);
        } else if (obj2 != null) {
            int j0 = this.f10651a.mo12161N().mo12508j0(str3, obj2);
            if (j0 != 0) {
                C4105xa N3 = this.f10651a.mo12161N();
                this.f10651a.mo12181z();
                this.f10651a.mo12161N().mo12485B(this.f11247p, (String) null, j0, "_ev", N3.mo12518r(str3, 24, true), ((obj2 instanceof String) || (obj2 instanceof CharSequence)) ? obj.toString().length() : 0);
                return;
            }
            Object p = this.f10651a.mo12161N().mo12515p(str3, obj2);
            if (p != null) {
                mo12350B(str4, str2, j, p);
            }
        } else {
            mo12350B(str4, str2, j, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12361M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C3705r.m14342g(r9)
            com.google.android.gms.common.internal.C3705r.m14342g(r10)
            r8.mo11931h()
            r8.mo11949i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0061
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x004f
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x004f
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.l5 r10 = r8.f10651a
            com.google.android.gms.measurement.internal.p4 r10 = r10.mo12154F()
            com.google.android.gms.measurement.internal.o4 r10 = r10.f11118n
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x005b
            java.lang.String r0 = "true"
            goto L_0x005b
        L_0x004f:
            if (r11 != 0) goto L_0x0061
            com.google.android.gms.measurement.internal.l5 r10 = r8.f10651a
            com.google.android.gms.measurement.internal.p4 r10 = r10.mo12154F()
            com.google.android.gms.measurement.internal.o4 r10 = r10.f11118n
            java.lang.String r0 = "unset"
        L_0x005b:
            r10.mo12239b(r0)
            r6 = r11
            r3 = r1
            goto L_0x0063
        L_0x0061:
            r3 = r10
            r6 = r11
        L_0x0063:
            com.google.android.gms.measurement.internal.l5 r10 = r8.f10651a
            boolean r10 = r10.mo12174o()
            if (r10 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.l5 r9 = r8.f10651a
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo11935b()
            com.google.android.gms.measurement.internal.x3 r9 = r9.mo12548v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo12476a(r10)
            return
        L_0x007b:
            com.google.android.gms.measurement.internal.l5 r10 = r8.f10651a
            boolean r10 = r10.mo12177r()
            if (r10 != 0) goto L_0x0084
            return
        L_0x0084:
            com.google.android.gms.measurement.internal.sa r10 = new com.google.android.gms.measurement.internal.sa
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.l5 r9 = r8.f10651a
            com.google.android.gms.measurement.internal.g9 r9 = r9.mo12159L()
            r9.mo12005y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4030r7.mo12361M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: N */
    public final void mo12362N(C3981n6 n6Var) {
        mo11949i();
        C3705r.m14346k(n6Var);
        if (!this.f11236e.remove(n6Var)) {
            this.f10651a.mo11935b().mo12549w().mo12476a("OnEventListener had not been registered");
        }
    }

    /* renamed from: Q */
    public final int mo12363Q(String str) {
        C3705r.m14342g(str);
        this.f10651a.mo12181z();
        return 25;
    }

    /* renamed from: R */
    public final Boolean mo12364R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f10651a.mo11934a().mo12106r(atomicReference, 15000, "boolean test flag value", new C3840c7(this, atomicReference));
    }

    /* renamed from: S */
    public final Double mo12365S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f10651a.mo11934a().mo12106r(atomicReference, 15000, "double test flag value", new C3931j7(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer mo12366T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f10651a.mo11934a().mo12106r(atomicReference, 15000, "int test flag value", new C3918i7(this, atomicReference));
    }

    /* renamed from: U */
    public final Long mo12367U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f10651a.mo11934a().mo12106r(atomicReference, 15000, "long test flag value", new C3892g7(this, atomicReference));
    }

    /* renamed from: V */
    public final String mo12368V() {
        return (String) this.f11238g.get();
    }

    /* renamed from: W */
    public final String mo12369W() {
        C4114y7 s = this.f10651a.mo12158K().mo11979s();
        if (s != null) {
            return s.f11428b;
        }
        return null;
    }

    /* renamed from: X */
    public final String mo12370X() {
        C4114y7 s = this.f10651a.mo12158K().mo11979s();
        if (s != null) {
            return s.f11427a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String mo12371Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f10651a.mo11934a().mo12106r(atomicReference, 15000, "String test flag value", new C3879f7(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList mo12372Z(String str, String str2) {
        if (this.f10651a.mo11934a().mo12105C()) {
            this.f10651a.mo11935b().mo12544r().mo12476a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f10651a.mo11937d();
        if (C3832c.m14640a()) {
            this.f10651a.mo11935b().mo12544r().mo12476a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f10651a.mo11934a().mo12106r(atomicReference, 5000, "get conditional user properties", new C3827b7(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C4105xa.m15407v(list);
        }
        this.f10651a.mo11935b().mo12544r().mo12477b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    /* renamed from: a0 */
    public final Map mo12373a0(String str, String str2, boolean z) {
        C4098x3 r;
        String str3;
        if (this.f10651a.mo11934a().mo12105C()) {
            r = this.f10651a.mo11935b().mo12544r();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.f10651a.mo11937d();
            if (C3832c.m14640a()) {
                r = this.f10651a.mo11935b().mo12544r();
                str3 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                this.f10651a.mo11934a().mo12106r(atomicReference, 5000, "get user properties", new C3853d7(this, atomicReference, (String) null, str, str2, z));
                List<C4045sa> list = (List) atomicReference.get();
                if (list == null) {
                    this.f10651a.mo11935b().mo12544r().mo12477b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                C1788a aVar = new C1788a(list.size());
                for (C4045sa saVar : list) {
                    Object o = saVar.mo12418o();
                    if (o != null) {
                        aVar.put(saVar.f11276o, o);
                    }
                }
                return aVar;
            }
        }
        r.mo12476a(str3);
        return Collections.emptyMap();
    }

    /* renamed from: f0 */
    public final void mo12374f0() {
        mo11931h();
        mo11949i();
        if (this.f10651a.mo12177r()) {
            if (this.f10651a.mo12181z().mo12010B((String) null, C3966m3.f10985Z)) {
                C3897h z = this.f10651a.mo12181z();
                z.f10651a.mo11937d();
                Boolean t = z.mo12026t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.f10651a.mo11935b().mo12543q().mo12476a("Deferred Deep Link feature enabled.");
                    this.f10651a.mo11934a().mo12110z(new C4053t6(this));
                }
            }
            this.f10651a.mo12159L().mo11986O();
            this.f11246o = false;
            C4003p4 F = this.f10651a.mo12154F();
            F.mo11931h();
            String string = F.mo12255o().getString("previous_os_version", (String) null);
            F.f10651a.mo12149A().mo11959k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.mo12255o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f10651a.mo12149A().mo11959k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo12381u("auto", "_ou", bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo11954n() {
        return false;
    }

    /* renamed from: o */
    public final void mo12375o(String str, String str2, Bundle bundle) {
        long a = this.f10651a.mo11936c().mo11730a();
        C3705r.m14342g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f10651a.mo11934a().mo12110z(new C3814a7(this, bundle2));
    }

    /* renamed from: p */
    public final void mo12376p() {
        if ((this.f10651a.mo11938f().getApplicationContext() instanceof Application) && this.f11234c != null) {
            ((Application) this.f10651a.mo11938f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f11234c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo12377q(Bundle bundle) {
        if (bundle == null) {
            this.f10651a.mo12154F().f11128x.mo12140b(new Bundle());
            return;
        }
        Bundle a = this.f10651a.mo12154F().f11128x.mo12139a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f10651a.mo12161N().mo12504U(obj)) {
                    this.f10651a.mo12161N().mo12485B(this.f11247p, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f10651a.mo11935b().mo12550x().mo12478c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C4105xa.m15394W(str)) {
                this.f10651a.mo11935b().mo12550x().mo12477b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                C4105xa N = this.f10651a.mo12161N();
                this.f10651a.mo12181z();
                if (N.mo12499P("param", str, 100, obj)) {
                    this.f10651a.mo12161N().mo12486C(a, str, obj);
                }
            }
        }
        this.f10651a.mo12161N();
        int m = this.f10651a.mo12181z().mo12019m();
        if (a.size() > m) {
            int i = 0;
            for (String str2 : new TreeSet(a.keySet())) {
                i++;
                if (i > m) {
                    a.remove(str2);
                }
            }
            this.f10651a.mo12161N().mo12485B(this.f11247p, (String) null, 26, (String) null, (String) null, 0);
            this.f10651a.mo11935b().mo12550x().mo12476a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f10651a.mo12154F().f11128x.mo12140b(a);
        this.f10651a.mo12159L().mo12002v(a);
    }

    /* renamed from: r */
    public final void mo12378r(String str, String str2, Bundle bundle) {
        mo12379s(str, str2, bundle, true, true, this.f10651a.mo11936c().mo11730a());
    }

    /* renamed from: s */
    public final void mo12379s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str2;
        String str4 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str3 == "screen_view" || (str3 != null && str2.equals("screen_view"))) {
            this.f10651a.mo12158K().mo11977F(bundle2, j);
        } else {
            mo12349A(str4, str2, j, bundle2, z2, !z2 || this.f11235d == null || C4105xa.m15394W(str2), z, (String) null);
        }
    }

    /* renamed from: t */
    public final void mo12380t(String str, String str2, Bundle bundle, String str3) {
        C3955l5.m14979t();
        mo12349A("auto", str2, this.f10651a.mo11936c().mo11730a(), bundle, false, true, true, str3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo12381u(String str, String str2, Bundle bundle) {
        mo11931h();
        mo12382v(str, str2, this.f10651a.mo11936c().mo11730a(), bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo12382v(String str, String str2, long j, Bundle bundle) {
        mo11931h();
        mo12383w(str, str2, j, bundle, true, this.f11235d == null || C4105xa.m15394W(str2), true, (String) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: android.os.Bundle[]} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a5, code lost:
        if (r27 == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c3, code lost:
        if (r27 == false) goto L_0x01c5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0222  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12383w(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.C3705r.m14342g(r20)
            com.google.android.gms.common.internal.C3705r.m14346k(r24)
            r19.mo11931h()
            r19.mo11949i()
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            boolean r1 = r1.mo12174o()
            if (r1 == 0) goto L_0x0509
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.q3 r1 = r1.mo12150B()
            java.util.List r1 = r1.mo12321u()
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0033
            goto L_0x0043
        L_0x0033:
            com.google.android.gms.measurement.internal.l5 r0 = r7.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12543q()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo12478c(r1, r9, r8)
            return
        L_0x0043:
            boolean r1 = r7.f11237f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L_0x00a1
            r7.f11237f = r15
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r1 = r1.mo12178s()     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r1 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r1 = r1.mo11938f()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.l5 r2 = r7.f10651a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo11938f()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo11935b()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12549w()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo12477b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.l5 r0 = r7.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12547u()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo12476a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            r1.mo11937d()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.l5 r0 = r7.f10651a
            com.google.android.gms.common.util.e r0 = r0.mo11936c()
            long r5 = r0.mo11730a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.mo12361M(r2, r3, r4, r5)
        L_0x00cd:
            com.google.android.gms.measurement.internal.l5 r0 = r7.f10651a
            r0.mo11937d()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.google.android.gms.measurement.internal.C4105xa.m15398a0(r21)
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.l5 r0 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r0 = r0.mo12161N()
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.p4 r1 = r1.mo12154F()
            com.google.android.gms.measurement.internal.k4 r1 = r1.f11128x
            android.os.Bundle r1 = r1.mo12139a()
            r0.mo12529z(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            r1.mo11937d()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r1 = r1.mo12161N()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo12501R(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.C3930j6.f10823a
            java.lang.String[] r5 = com.google.android.gms.measurement.internal.C3930j6.f10824b
            boolean r3 = r1.mo12497N(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.google.android.gms.measurement.internal.l5 r3 = r1.f10651a
            r3.mo12181z()
            boolean r1 = r1.mo12496M(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = 0
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo11935b()
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12545s()
            com.google.android.gms.measurement.internal.l5 r2 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo12152D()
            java.lang.String r2 = r2.mo12438d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo12477b(r3, r2)
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r1 = r1.mo12161N()
            com.google.android.gms.measurement.internal.l5 r2 = r7.f10651a
            r2.mo12181z()
            java.lang.String r0 = r1.mo12518r(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r1 = r1.mo12161N()
            com.google.android.gms.measurement.internal.wa r2 = r7.f11247p
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.mo12485B(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            p174e.p319f.p320a.p335c.p345f.p352g.C6775ee.m25666b()
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.h r1 = r1.mo12181z()
            com.google.android.gms.measurement.internal.l3 r2 = com.google.android.gms.measurement.internal.C3966m3.f11011m0
            boolean r1 = r1.mo12010B(r13, r2)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x01a8
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            r1.mo11937d()
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.g8 r1 = r1.mo12158K()
            com.google.android.gms.measurement.internal.y7 r1 = r1.mo11980t(r14)
            if (r1 == 0) goto L_0x01a3
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01a3
            r1.f11430d = r15
        L_0x01a3:
            if (r25 == 0) goto L_0x01c7
            if (r27 != 0) goto L_0x01c7
            goto L_0x01c5
        L_0x01a8:
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            r1.mo11937d()
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.g8 r1 = r1.mo12158K()
            com.google.android.gms.measurement.internal.y7 r1 = r1.mo11980t(r14)
            if (r1 == 0) goto L_0x01c1
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01c1
            r1.f11430d = r15
        L_0x01c1:
            if (r25 == 0) goto L_0x01c7
            if (r27 != 0) goto L_0x01c7
        L_0x01c5:
            r3 = 1
            goto L_0x01c8
        L_0x01c7:
            r3 = 0
        L_0x01c8:
            com.google.android.gms.measurement.internal.C4105xa.m15408y(r1, r12, r3)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C4105xa.m15394W(r21)
            if (r25 == 0) goto L_0x0218
            com.google.android.gms.measurement.internal.m6 r4 = r7.f11235d
            if (r4 == 0) goto L_0x0218
            if (r3 != 0) goto L_0x0218
            if (r1 == 0) goto L_0x01e2
            r16 = 1
            goto L_0x021a
        L_0x01e2:
            com.google.android.gms.measurement.internal.l5 r0 = r7.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12543q()
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo12152D()
            java.lang.String r1 = r1.mo12438d(r9)
            com.google.android.gms.measurement.internal.l5 r2 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo12152D()
            java.lang.String r2 = r2.mo12436b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo12478c(r3, r1, r2)
            com.google.android.gms.measurement.internal.m6 r0 = r7.f11235d
            com.google.android.gms.common.internal.C3705r.m14346k(r0)
            com.google.android.gms.measurement.internal.m6 r1 = r7.f11235d
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.mo11856a(r2, r3, r4, r5)
            return
        L_0x0218:
            r16 = r1
        L_0x021a:
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            boolean r1 = r1.mo12177r()
            if (r1 == 0) goto L_0x0508
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r1 = r1.mo12161N()
            int r1 = r1.mo12509k0(r9)
            if (r1 == 0) goto L_0x0278
            com.google.android.gms.measurement.internal.l5 r2 = r7.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12545s()
            com.google.android.gms.measurement.internal.l5 r3 = r7.f10651a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo12152D()
            java.lang.String r3 = r3.mo12438d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo12477b(r4, r3)
            com.google.android.gms.measurement.internal.l5 r2 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r2 = r2.mo12161N()
            com.google.android.gms.measurement.internal.l5 r3 = r7.f10651a
            r3.mo12181z()
            java.lang.String r0 = r2.mo12518r(r9, r0, r15)
            if (r9 == 0) goto L_0x025c
            int r14 = r21.length()
        L_0x025c:
            com.google.android.gms.measurement.internal.l5 r2 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r2 = r2.mo12161N()
            com.google.android.gms.measurement.internal.wa r3 = r7.f11247p
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.mo12485B(r21, r22, r23, r24, r25, r26)
            return
        L_0x0278:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r5 = com.google.android.gms.common.util.C3759f.m14509c(r1)
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r1 = r1.mo12161N()
            r2 = r28
            r3 = r21
            r4 = r24
            r6 = r27
            android.os.Bundle r12 = r1.mo12525v0(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.C3705r.m14346k(r12)
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            r1.mo11937d()
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.g8 r1 = r1.mo12158K()
            com.google.android.gms.measurement.internal.y7 r1 = r1.mo11980t(r14)
            r5 = 0
            java.lang.String r4 = "_ae"
            if (r1 == 0) goto L_0x02dd
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x02dd
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.x9 r1 = r1.mo12160M()
            com.google.android.gms.measurement.internal.v9 r1 = r1.f11409e
            com.google.android.gms.measurement.internal.x9 r2 = r1.f11351d
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.common.util.e r2 = r2.mo11936c()
            long r2 = r2.mo11731b()
            long r14 = r1.f11349b
            long r14 = r2 - r14
            r1.f11349b = r2
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x02dd
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r1 = r1.mo12161N()
            r1.mo12526w(r12, r14)
        L_0x02dd:
            p174e.p319f.p320a.p335c.p345f.p352g.C7111zc.m27095b()
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.h r1 = r1.mo12181z()
            com.google.android.gms.measurement.internal.l3 r2 = com.google.android.gms.measurement.internal.C3966m3.f10995e0
            boolean r1 = r1.mo12010B(r13, r2)
            if (r1 == 0) goto L_0x0367
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0346
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0346
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r1 = r1.mo12161N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = com.google.android.gms.common.util.C3767n.m14535a(r2)
            if (r3 == 0) goto L_0x0312
            r2 = r13
            goto L_0x0318
        L_0x0312:
            if (r2 == 0) goto L_0x0318
            java.lang.String r2 = r2.trim()
        L_0x0318:
            com.google.android.gms.measurement.internal.l5 r3 = r1.f10651a
            com.google.android.gms.measurement.internal.p4 r3 = r3.mo12154F()
            com.google.android.gms.measurement.internal.o4 r3 = r3.f11125u
            java.lang.String r3 = r3.mo12238a()
            boolean r3 = com.google.android.gms.measurement.internal.C4081va.m15375a(r2, r3)
            if (r3 != 0) goto L_0x0336
            com.google.android.gms.measurement.internal.l5 r1 = r1.f10651a
            com.google.android.gms.measurement.internal.p4 r1 = r1.mo12154F()
            com.google.android.gms.measurement.internal.o4 r1 = r1.f11125u
            r1.mo12239b(r2)
            goto L_0x0367
        L_0x0336:
            com.google.android.gms.measurement.internal.l5 r0 = r1.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12543q()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo12476a(r1)
            return
        L_0x0346:
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x0367
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r1 = r1.mo12161N()
            com.google.android.gms.measurement.internal.l5 r1 = r1.f10651a
            com.google.android.gms.measurement.internal.p4 r1 = r1.mo12154F()
            com.google.android.gms.measurement.internal.o4 r1 = r1.f11125u
            java.lang.String r1 = r1.mo12238a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0367
            r12.putString(r2, r1)
        L_0x0367:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.p4 r1 = r1.mo12154F()
            com.google.android.gms.measurement.internal.l4 r1 = r1.f11120p
            long r1 = r1.mo12147a()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x03e9
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.p4 r1 = r1.mo12154F()
            boolean r1 = r1.mo12262v(r10)
            if (r1 == 0) goto L_0x03e9
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.p4 r1 = r1.mo12154F()
            com.google.android.gms.measurement.internal.j4 r1 = r1.f11122r
            boolean r1 = r1.mo12128b()
            if (r1 == 0) goto L_0x03e9
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo11935b()
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12548v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo12476a(r2)
            r15 = 0
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.common.util.e r1 = r1.mo11936c()
            long r17 = r1.mo11730a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r1 = r19
            r13 = r4
            r4 = r15
            r8 = r5
            r5 = r17
            r1.mo12361M(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.common.util.e r1 = r1.mo11936c()
            long r5 = r1.mo11730a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r19
            r1.mo12361M(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.common.util.e r1 = r1.mo11936c()
            long r5 = r1.mo11730a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.mo12361M(r2, r3, r4, r5)
            goto L_0x03eb
        L_0x03e9:
            r13 = r4
            r8 = r5
        L_0x03eb:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r8)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0412
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo11935b()
            com.google.android.gms.measurement.internal.x3 r1 = r1.mo12548v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo12476a(r2)
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.x9 r1 = r1.mo12160M()
            com.google.android.gms.measurement.internal.w9 r1 = r1.f11408d
            r2 = 1
            r1.mo12472b(r10, r2)
        L_0x0412:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0423:
            if (r3 >= r2) goto L_0x046e
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x046b
            com.google.android.gms.measurement.internal.l5 r5 = r7.f10651a
            r5.mo12161N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0443
            r6 = 1
            android.os.Bundle[] r8 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r8[r6] = r5
            goto L_0x0466
        L_0x0443:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0454
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r8 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r8)
        L_0x0450:
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0466
        L_0x0454:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x0465
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            goto L_0x0450
        L_0x0465:
            r8 = 0
        L_0x0466:
            if (r8 == 0) goto L_0x046b
            r12.putParcelableArray(r4, r8)
        L_0x046b:
            int r3 = r3 + 1
            goto L_0x0423
        L_0x046e:
            r8 = 0
        L_0x046f:
            int r1 = r14.size()
            if (r8 >= r1) goto L_0x04d8
            java.lang.Object r1 = r14.get(r8)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r8 == 0) goto L_0x0482
            java.lang.String r2 = "_ep"
            r9 = r20
            goto L_0x0486
        L_0x0482:
            r9 = r20
            r2 = r21
        L_0x0486:
            r1.putString(r0, r9)
            if (r26 == 0) goto L_0x0495
            com.google.android.gms.measurement.internal.l5 r3 = r7.f10651a
            com.google.android.gms.measurement.internal.xa r3 = r3.mo12161N()
            android.os.Bundle r1 = r3.mo12524u0(r1)
        L_0x0495:
            r12 = r1
            com.google.android.gms.measurement.internal.x r15 = new com.google.android.gms.measurement.internal.x
            com.google.android.gms.measurement.internal.v r3 = new com.google.android.gms.measurement.internal.v
            r3.<init>(r12)
            r1 = r15
            r4 = r20
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.measurement.internal.g9 r1 = r1.mo12159L()
            r5 = r28
            r1.mo11995o(r15, r5)
            if (r16 != 0) goto L_0x04d5
            java.util.Set r1 = r7.f11236e
            java.util.Iterator r15 = r1.iterator()
        L_0x04b8:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x04d5
            java.lang.Object r1 = r15.next()
            com.google.android.gms.measurement.internal.n6 r1 = (com.google.android.gms.measurement.internal.C3981n6) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r12)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.mo11865a(r2, r3, r4, r5)
            r5 = r28
            goto L_0x04b8
        L_0x04d5:
            int r8 = r8 + 1
            goto L_0x046f
        L_0x04d8:
            com.google.android.gms.measurement.internal.l5 r0 = r7.f10651a
            r0.mo11937d()
            com.google.android.gms.measurement.internal.l5 r0 = r7.f10651a
            com.google.android.gms.measurement.internal.g8 r0 = r0.mo12158K()
            r1 = 0
            com.google.android.gms.measurement.internal.y7 r0 = r0.mo11980t(r1)
            if (r0 == 0) goto L_0x0508
            r1 = r21
            boolean r0 = r13.equals(r1)
            if (r0 == 0) goto L_0x0508
            com.google.android.gms.measurement.internal.l5 r0 = r7.f10651a
            com.google.android.gms.measurement.internal.x9 r0 = r0.mo12160M()
            com.google.android.gms.measurement.internal.l5 r1 = r7.f10651a
            com.google.android.gms.common.util.e r1 = r1.mo11936c()
            long r1 = r1.mo11731b()
            com.google.android.gms.measurement.internal.v9 r0 = r0.f11409e
            r3 = 1
            r0.mo12463d(r3, r3, r1)
        L_0x0508:
            return
        L_0x0509:
            com.google.android.gms.measurement.internal.l5 r0 = r7.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12543q()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo12476a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4030r7.mo12383w(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: x */
    public final void mo12384x(C3981n6 n6Var) {
        mo11949i();
        C3705r.m14346k(n6Var);
        if (!this.f11236e.add(n6Var)) {
            this.f10651a.mo11935b().mo12549w().mo12476a("OnEventListener already registered");
        }
    }

    /* renamed from: y */
    public final void mo12385y(long j) {
        this.f11238g.set((Object) null);
        this.f10651a.mo11934a().mo12110z(new C4113y6(this, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo12386z(long j, boolean z) {
        mo11931h();
        mo11949i();
        this.f10651a.mo11935b().mo12543q().mo12476a("Resetting analytics data (FE)");
        C4104x9 M = this.f10651a.mo12160M();
        M.mo11931h();
        M.f11409e.mo12460a();
        C6825he.m25843b();
        if (this.f10651a.mo12181z().mo12010B((String) null, C3966m3.f10953B0)) {
            this.f10651a.mo12150B().mo12322v();
        }
        boolean o = this.f10651a.mo12174o();
        C4003p4 F = this.f10651a.mo12154F();
        F.f11110f.mo12148b(j);
        if (!TextUtils.isEmpty(F.f10651a.mo12154F().f11125u.mo12238a())) {
            F.f11125u.mo12239b((String) null);
        }
        C6840id.m25913b();
        C3897h z2 = F.f10651a.mo12181z();
        C3953l3 l3Var = C3966m3.f10997f0;
        if (z2.mo12010B((String) null, l3Var)) {
            F.f11120p.mo12148b(0);
        }
        if (!F.f10651a.mo12181z().mo12013E()) {
            F.mo12260t(!o);
        }
        F.f11126v.mo12239b((String) null);
        F.f11127w.mo12148b(0);
        F.f11128x.mo12140b((Bundle) null);
        if (z) {
            this.f10651a.mo12159L().mo11997q();
        }
        C6840id.m25913b();
        if (this.f10651a.mo12181z().mo12010B((String) null, l3Var)) {
            this.f10651a.mo12160M().f11408d.mo12471a();
        }
        this.f11246o = !o;
    }
}
