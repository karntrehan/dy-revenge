package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.h */
public interface C3531h {
    /* renamed from: a */
    void mo11348a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: c */
    <T extends LifecycleCallback> T mo11349c(String str, Class<T> cls);

    /* renamed from: d */
    Activity mo11350d();

    void startActivityForResult(Intent intent, int i);
}
