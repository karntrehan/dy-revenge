package com.google.android.gms.common.api;

import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.common.api.s */
final class C3620s<R extends C3612k> extends BasePendingResult<R> {

    /* renamed from: r */
    private final R f10184r;

    public C3620s(C3486f fVar, R r) {
        super(fVar);
        this.f10184r = r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final R mo11140d(Status status) {
        return this.f10184r;
    }
}
