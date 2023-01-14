package p174e.p319f.p320a.p382e.p383a.p385b;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: e.f.a.e.a.b.k */
public final class C9121k<T extends IInterface> {

    /* renamed from: a */
    private static final Map<String, Handler> f25003a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f25004b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9101a f25005c;

    /* renamed from: d */
    private final String f25006d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<C9103b> f25007e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f25008f;

    /* renamed from: g */
    private final Intent f25009g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C9113g<T> f25010h;

    /* renamed from: i */
    private final WeakReference<C9111f> f25011i;

    /* renamed from: j */
    private final IBinder.DeathRecipient f25012j = new C9105c(this);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ServiceConnection f25013k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public T f25014l;

    public C9121k(Context context, C9101a aVar, String str, Intent intent, C9113g<T> gVar) {
        this.f25004b = context;
        this.f25005c = aVar;
        this.f25006d = str;
        this.f25009g = intent;
        this.f25010h = gVar;
        this.f25011i = new WeakReference<>((Object) null);
    }

    /* renamed from: d */
    static /* synthetic */ void m30354d(C9121k kVar, C9103b bVar) {
        if (kVar.f25014l == null && !kVar.f25008f) {
            kVar.f25005c.mo23083d("Initiate binding to the service.", new Object[0]);
            kVar.f25007e.add(bVar);
            C9119j jVar = new C9119j(kVar);
            kVar.f25013k = jVar;
            kVar.f25008f = true;
            if (!kVar.f25004b.bindService(kVar.f25009g, jVar, 1)) {
                kVar.f25005c.mo23083d("Failed to bind to the service.", new Object[0]);
                kVar.f25008f = false;
                for (C9103b b : kVar.f25007e) {
                    C9165m<?> b2 = b.mo23085b();
                    if (b2 != null) {
                        b2.mo23142d(new C9123l());
                    }
                }
                kVar.f25007e.clear();
            }
        } else if (kVar.f25008f) {
            kVar.f25005c.mo23083d("Waiting to bind to the service.", new Object[0]);
            kVar.f25007e.add(bVar);
        } else {
            bVar.run();
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m30360j(C9121k kVar) {
        kVar.f25005c.mo23083d("linkToDeath", new Object[0]);
        try {
            kVar.f25014l.asBinder().linkToDeath(kVar.f25012j, 0);
        } catch (RemoteException e) {
            kVar.f25005c.mo23082c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m30363m(C9121k kVar) {
        kVar.f25005c.mo23083d("unlinkToDeath", new Object[0]);
        kVar.f25014l.asBinder().unlinkToDeath(kVar.f25012j, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m30367r(C9103b bVar) {
        Handler handler;
        Map<String, Handler> map = f25003a;
        synchronized (map) {
            if (!map.containsKey(this.f25006d)) {
                HandlerThread handlerThread = new HandlerThread(this.f25006d, 10);
                handlerThread.start();
                map.put(this.f25006d, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f25006d);
        }
        handler.post(bVar);
    }

    /* renamed from: a */
    public final void mo23099a(C9103b bVar) {
        m30367r(new C9107d(this, bVar.mo23085b(), bVar));
    }

    /* renamed from: b */
    public final void mo23100b() {
        m30367r(new C9109e(this));
    }

    /* renamed from: c */
    public final T mo23101c() {
        return this.f25014l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo23102n() {
        this.f25005c.mo23083d("reportBinderDeath", new Object[0]);
        C9111f fVar = (C9111f) this.f25011i.get();
        if (fVar == null) {
            this.f25005c.mo23083d("%s : Binder has died.", this.f25006d);
            for (C9103b b : this.f25007e) {
                C9165m<?> b2 = b.mo23085b();
                if (b2 != null) {
                    b2.mo23142d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f25006d).concat(" : Binder has died.")));
                }
            }
            this.f25007e.clear();
            return;
        }
        this.f25005c.mo23083d("calling onBinderDied", new Object[0]);
        fVar.mo23091a();
    }
}
