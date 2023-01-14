package com.google.android.play.core.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.common.d */
public final class C4458d {

    /* renamed from: a */
    private final Map<String, Object> f12736a = new HashMap();

    /* renamed from: b */
    private final AtomicBoolean f12737b = new AtomicBoolean(false);

    /* renamed from: b */
    private final synchronized void m17034b() {
        this.f12736a.put("assetOnlyUpdates", Boolean.FALSE);
    }

    /* renamed from: a */
    public final synchronized boolean mo13985a() {
        if (!this.f12737b.get()) {
            m17034b();
        }
        Object obj = this.f12736a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
