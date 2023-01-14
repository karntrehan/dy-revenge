package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.j2 */
final /* synthetic */ class C4394j2 implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f12534a = new C4394j2();

    /* renamed from: b */
    static final ThreadFactory f12535b = new C4394j2((byte[]) null);

    /* renamed from: c */
    private final /* synthetic */ int f12536c = 0;

    private C4394j2() {
    }

    private C4394j2(byte[] bArr) {
    }

    public final Thread newThread(Runnable runnable) {
        return this.f12536c != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }
}
