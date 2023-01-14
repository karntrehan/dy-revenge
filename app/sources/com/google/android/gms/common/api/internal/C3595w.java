package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3480b;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.api.internal.w */
public final class C3595w {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f10143a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C8965m<?>, Boolean> f10144b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m14005h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f10143a) {
            hashMap = new HashMap(this.f10143a);
        }
        synchronized (this.f10144b) {
            hashMap2 = new HashMap(this.f10144b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo11239e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C8965m) entry2.getKey()).mo22785d(new C3480b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11429c(BasePendingResult<? extends C3612k> basePendingResult, boolean z) {
        this.f10143a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo11234a(new C3587u(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final <TResult> void mo11430d(C8965m<TResult> mVar, boolean z) {
        this.f10144b.put(mVar, Boolean.valueOf(z));
        mVar.mo22782a().mo22766b(new C3591v(this, mVar));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11431e(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L_0x0010
            java.lang.String r4 = " due to service disconnection."
        L_0x000c:
            r0.append(r4)
            goto L_0x0016
        L_0x0010:
            r2 = 3
            if (r4 != r2) goto L_0x0016
            java.lang.String r4 = " due to dead object exception."
            goto L_0x000c
        L_0x0016:
            if (r5 == 0) goto L_0x0020
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L_0x0020:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>((int) r5, (java.lang.String) r0)
            r3.m14005h(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3595w.mo11431e(int, java.lang.String):void");
    }

    /* renamed from: f */
    public final void mo11432f() {
        m14005h(false, C3521f.f9927a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo11433g() {
        return !this.f10143a.isEmpty() || !this.f10144b.isEmpty();
    }
}
