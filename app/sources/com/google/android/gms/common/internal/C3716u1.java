package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.p132m.C3743a;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p335c.p345f.p351f.C6691e;

/* renamed from: com.google.android.gms.common.internal.u1 */
final class C3716u1 extends C3672h {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashMap<C3704q1, C3707r1> f10391f = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f10392g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile Handler f10393h;

    /* renamed from: i */
    private final C3713t1 f10394i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C3743a f10395j;

    /* renamed from: k */
    private final long f10396k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f10397l;

    C3716u1(Context context, Looper looper) {
        C3713t1 t1Var = new C3713t1(this, (C3710s1) null);
        this.f10394i = t1Var;
        this.f10392g = context.getApplicationContext();
        this.f10393h = new C6691e(looper, t1Var);
        this.f10395j = C3743a.m14478b();
        this.f10396k = 5000;
        this.f10397l = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo11600d(C3704q1 q1Var, ServiceConnection serviceConnection, String str) {
        C3705r.m14347l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f10391f) {
            C3707r1 r1Var = this.f10391f.get(q1Var);
            if (r1Var == null) {
                String obj = q1Var.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            } else if (r1Var.mo11664h(serviceConnection)) {
                r1Var.mo11662f(serviceConnection, str);
                if (r1Var.mo11665i()) {
                    this.f10393h.sendMessageDelayed(this.f10393h.obtainMessage(0, q1Var), this.f10396k);
                }
            } else {
                String obj2 = q1Var.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(obj2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo11602f(C3704q1 q1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        C3705r.m14347l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f10391f) {
            C3707r1 r1Var = this.f10391f.get(q1Var);
            if (r1Var == null) {
                r1Var = new C3707r1(this, q1Var);
                r1Var.mo11660d(serviceConnection, serviceConnection, str);
                r1Var.mo11661e(str, executor);
                this.f10391f.put(q1Var, r1Var);
            } else {
                this.f10393h.removeMessages(0, q1Var);
                if (!r1Var.mo11664h(serviceConnection)) {
                    r1Var.mo11660d(serviceConnection, serviceConnection, str);
                    int a = r1Var.mo11657a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(r1Var.mo11658b(), r1Var.mo11659c());
                    } else if (a == 2) {
                        r1Var.mo11661e(str, executor);
                    }
                } else {
                    String obj = q1Var.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
            j = r1Var.mo11666j();
        }
        return j;
    }
}
