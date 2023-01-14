package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.t1 */
final class C3713t1 implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C3716u1 f10388a;

    /* synthetic */ C3713t1(C3716u1 u1Var, C3710s1 s1Var) {
        this.f10388a = u1Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f10388a.f10391f) {
                C3704q1 q1Var = (C3704q1) message.obj;
                C3707r1 r1Var = (C3707r1) this.f10388a.f10391f.get(q1Var);
                if (r1Var != null && r1Var.mo11665i()) {
                    if (r1Var.mo11666j()) {
                        r1Var.mo11663g("GmsClientSupervisor");
                    }
                    this.f10388a.f10391f.remove(q1Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f10388a.f10391f) {
                C3704q1 q1Var2 = (C3704q1) message.obj;
                C3707r1 r1Var2 = (C3707r1) this.f10388a.f10391f.get(q1Var2);
                if (r1Var2 != null && r1Var2.mo11657a() == 3) {
                    String valueOf = String.valueOf(q1Var2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = r1Var2.mo11658b();
                    if (b == null) {
                        b = q1Var2.mo11651b();
                    }
                    if (b == null) {
                        String d = q1Var2.mo11653d();
                        C3705r.m14346k(d);
                        b = new ComponentName(d, "unknown");
                    }
                    r1Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
