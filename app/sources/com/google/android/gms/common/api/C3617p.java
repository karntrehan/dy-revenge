package com.google.android.gms.common.api;

import com.google.android.gms.common.C3627d;

/* renamed from: com.google.android.gms.common.api.p */
public final class C3617p extends UnsupportedOperationException {

    /* renamed from: f */
    private final C3627d f10183f;

    public C3617p(C3627d dVar) {
        this.f10183f = dVar;
    }

    public String getMessage() {
        String valueOf = String.valueOf(this.f10183f);
        valueOf.length();
        return "Missing ".concat(valueOf);
    }
}
