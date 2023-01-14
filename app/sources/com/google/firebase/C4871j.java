package com.google.firebase;

import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.firebase.j */
public class C4871j extends Exception {
    @Deprecated
    protected C4871j() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4871j(String str) {
        super(str);
        C3705r.m14343h(str, "Detail message must not be empty");
    }
}
