package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.m */
abstract class C4227m<S> extends Fragment {

    /* renamed from: k0 */
    protected final LinkedHashSet<C4226l<S>> f11918k0 = new LinkedHashSet<>();

    C4227m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w1 */
    public boolean mo13238w1(C4226l<S> lVar) {
        return this.f11918k0.add(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public void mo13239x1() {
        this.f11918k0.clear();
    }
}
