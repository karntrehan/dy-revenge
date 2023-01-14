package p174e.p319f.p320a.p382e.p383a.p385b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: e.f.a.e.a.b.j */
final class C9119j implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C9121k f25002a;

    /* synthetic */ C9119j(C9121k kVar) {
        this.f25002a = kVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25002a.f25005c.mo23083d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f25002a.m30367r(new C9115h(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f25002a.f25005c.mo23083d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f25002a.m30367r(new C9117i(this));
    }
}
