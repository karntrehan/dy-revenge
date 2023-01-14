package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.i */
public class C4275i extends ImageButton {

    /* renamed from: f */
    private int f12121f;

    /* renamed from: b */
    public final void mo13513b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f12121f = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f12121f;
    }

    public void setVisibility(int i) {
        mo13513b(i, true);
    }
}
