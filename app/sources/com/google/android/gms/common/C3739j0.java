package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.j0 */
final class C3739j0 extends C3741k0 {

    /* renamed from: e */
    private final Callable<String> f10421e;

    /* synthetic */ C3739j0(Callable callable, C3638i0 i0Var) {
        super(false, (String) null, (Throwable) null);
        this.f10421e = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo11707a() {
        try {
            return this.f10421e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
