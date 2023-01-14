package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
abstract class C4336e {

    /* renamed from: a */
    TextInputLayout f12304a;

    /* renamed from: b */
    Context f12305b;

    /* renamed from: c */
    CheckableImageButton f12306c;

    C4336e(TextInputLayout textInputLayout) {
        this.f12304a = textInputLayout;
        this.f12305b = textInputLayout.getContext();
        this.f12306c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo13719a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo13732b(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo13733c() {
        return false;
    }
}
