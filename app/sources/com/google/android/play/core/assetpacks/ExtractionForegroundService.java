package com.google.android.play.core.assetpacks;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;

public class ExtractionForegroundService extends Service {

    /* renamed from: f */
    private final C9101a f12373f = new C9101a("ExtractionForegroundService");

    /* renamed from: o */
    Context f12374o;

    /* renamed from: p */
    C4386h2 f12375p;

    /* renamed from: q */
    NotificationManager f12376q;

    /* renamed from: a */
    private final synchronized void m16751a(Intent intent) {
        String stringExtra = intent.getStringExtra("notification_title");
        String stringExtra2 = intent.getStringExtra("notification_subtext");
        long longExtra = intent.getLongExtra("notification_timeout", 1);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("notification_on_click_intent");
        int i = Build.VERSION.SDK_INT;
        Notification.Builder timeoutAfter = i >= 26 ? new Notification.Builder(this.f12374o, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(longExtra) : new Notification.Builder(this.f12374o).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(stringExtra).setSubText(stringExtra2);
        if (i >= 21) {
            timeoutAfter.setColor(intent.getIntExtra("notification_color", 0)).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f12373f.mo23083d("Starting foreground installation service.", new Object[0]);
        this.f12375p.mo13859a(true);
        if (i >= 26) {
            m16753c(intent.getStringExtra("notification_channel_name"));
        }
        startForeground(-1883842196, build);
    }

    /* renamed from: b */
    private final synchronized void m16752b() {
        this.f12373f.mo23083d("Stopping service.", new Object[0]);
        this.f12375p.mo13859a(false);
        stopForeground(true);
        stopSelf();
    }

    @TargetApi(26)
    /* renamed from: c */
    private final synchronized void m16753c(String str) {
        this.f12376q.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        C4393j1.m16872h(getApplicationContext()).mo13829a(this);
        this.f12376q = (NotificationManager) this.f12374o.getSystemService("notification");
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int intExtra = intent.getIntExtra("action_type", 0);
        if (intExtra == 1) {
            m16751a(intent);
        } else if (intExtra == 2) {
            m16752b();
        } else {
            this.f12373f.mo23081b("Unknown action type received: %d", Integer.valueOf(intExtra));
        }
        return 2;
    }
}
