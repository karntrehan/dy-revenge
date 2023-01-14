package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* renamed from: com.google.android.play.core.assetpacks.q */
final /* synthetic */ class C4419q implements Runnable {

    /* renamed from: f */
    private final C4427s f12610f;

    /* renamed from: o */
    private final Bundle f12611o;

    /* renamed from: p */
    private final AssetPackState f12612p;

    C4419q(C4427s sVar, Bundle bundle, AssetPackState assetPackState) {
        this.f12610f = sVar;
        this.f12611o = bundle;
        this.f12612p = assetPackState;
    }

    public final void run() {
        this.f12610f.mo13914j(this.f12611o, this.f12612p);
    }
}
