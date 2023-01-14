package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.m */
final class C4403m extends C4391j<Void> {

    /* renamed from: c */
    final /* synthetic */ C4411o f12562c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4403m(C4411o oVar, C9165m<Void> mVar) {
        super(oVar, mVar);
        this.f12562c = oVar;
    }

    /* renamed from: w0 */
    public final void mo13884w0(Bundle bundle, Bundle bundle2) {
        super.mo13884w0(bundle, bundle2);
        if (!this.f12562c.f12599g.compareAndSet(true, false)) {
            C4411o.f12593a.mo23084e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f12562c.mo13863a();
        }
    }
}
