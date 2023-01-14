package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.k2 */
public final class C3549k2 {

    /* renamed from: a */
    public static final Status f10022a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: b */
    final Set<BasePendingResult<?>> f10023b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: c */
    private final C3545j2 f10024c = new C3545j2(this);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11381a(BasePendingResult<? extends C3612k> basePendingResult) {
        this.f10023b.add(basePendingResult);
        basePendingResult.mo11245o(this.f10024c);
    }

    /* renamed from: b */
    public final void mo11382b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f10023b.toArray(new BasePendingResult[0])) {
            basePendingResult.mo11245o((C3545j2) null);
            if (basePendingResult.mo11244n()) {
                this.f10023b.remove(basePendingResult);
            }
        }
    }
}
