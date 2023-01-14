package p174e.p319f.p320a.p382e.p383a.p384a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p386c.C9150c;

/* renamed from: e.f.a.e.a.a.e */
public final class C9079e extends C9150c<InstallState> {
    public C9079e(Context context) {
        super(new C9101a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13911a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (!context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.f25025a.mo23080a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent2.getStringExtra("package.name"));
            return;
        }
        this.f25025a.mo23080a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f25025a.mo23080a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        C9101a aVar = this.f25025a;
        aVar.mo23080a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        aVar.mo23080a("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        aVar.mo23080a("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        InstallState a = InstallState.m17040a(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
        this.f25025a.mo23080a("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
        mo23124f(a);
    }
}
