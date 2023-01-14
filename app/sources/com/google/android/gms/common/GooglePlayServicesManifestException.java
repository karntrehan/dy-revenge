package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: f */
    private final int f9803f;

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.f9803f = i;
    }
}
