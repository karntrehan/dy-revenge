package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AssetPackExtractionService extends Service {

    /* renamed from: f */
    C4360b0 f12372f;

    public final IBinder onBind(Intent intent) {
        return this.f12372f;
    }

    public final void onCreate() {
        super.onCreate();
        C4393j1.m16872h(getApplicationContext()).mo13830b(this);
    }
}
