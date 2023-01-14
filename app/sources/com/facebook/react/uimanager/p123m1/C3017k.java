package com.facebook.react.uimanager.p123m1;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: com.facebook.react.uimanager.m1.k */
class C3017k extends C3002a {
    C3017k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Animation mo9739b(View view, int i, int i2, int i3, int i4) {
        boolean z = false;
        boolean z2 = (view.getX() == ((float) i) && view.getY() == ((float) i2)) ? false : true;
        if (!(view.getWidth() == i3 && view.getHeight() == i4)) {
            z = true;
        }
        if (z2 || z) {
            return new C3020m(view, i, i2, i3, i4);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9741e() {
        return this.f8344e > 0;
    }
}
