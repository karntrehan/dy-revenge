package com.reactnativecommunity.toolbarandroid;

import android.graphics.drawable.Drawable;
import p174e.p247e.p274h.p284e.C6193g;
import p174e.p247e.p294k.p307k.C6372g;

/* renamed from: com.reactnativecommunity.toolbarandroid.a */
public class C5286a extends C6193g implements Drawable.Callback {

    /* renamed from: r */
    private final C6372g f14846r;

    public C5286a(Drawable drawable, C6372g gVar) {
        super(drawable);
        this.f14846r = gVar;
    }

    public int getIntrinsicHeight() {
        return this.f14846r.mo15981c();
    }

    public int getIntrinsicWidth() {
        return this.f14846r.mo15982e();
    }
}
