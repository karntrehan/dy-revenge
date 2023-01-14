package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.n */
final class C4407n extends C4391j<Void> {

    /* renamed from: c */
    final int f12577c;

    /* renamed from: d */
    final String f12578d;

    /* renamed from: e */
    final int f12579e;

    /* renamed from: f */
    final /* synthetic */ C4411o f12580f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4407n(C4411o oVar, C9165m<Void> mVar, int i, String str, int i2) {
        super(oVar, mVar);
        this.f12580f = oVar;
        this.f12577c = i;
        this.f12578d = str;
        this.f12579e = i2;
    }

    /* renamed from: D0 */
    public final void mo13872D0(Bundle bundle) {
        this.f12580f.f12597e.mo23100b();
        int i = bundle.getInt("error_code");
        C4411o.f12593a.mo23081b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f12579e;
        if (i2 > 0) {
            this.f12580f.m16909x(this.f12577c, this.f12578d, i2 - 1);
        }
    }
}
