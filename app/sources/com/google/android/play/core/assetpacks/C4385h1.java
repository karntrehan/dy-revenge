package com.google.android.play.core.assetpacks;

import android.content.Intent;

/* renamed from: com.google.android.play.core.assetpacks.h1 */
final /* synthetic */ class C4385h1 implements Runnable {

    /* renamed from: f */
    private final C4389i1 f12483f;

    /* renamed from: o */
    private final Intent f12484o;

    C4385h1(C4389i1 i1Var, Intent intent) {
        this.f12483f = i1Var;
        this.f12484o = intent;
    }

    public final void run() {
        this.f12483f.mo13870i(this.f12484o);
    }
}
