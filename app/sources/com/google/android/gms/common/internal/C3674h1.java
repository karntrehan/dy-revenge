package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.h1 */
public abstract class C3674h1<TListener> {

    /* renamed from: a */
    private TListener f10315a;

    /* renamed from: b */
    private boolean f10316b = false;

    /* renamed from: c */
    final /* synthetic */ C3651c f10317c;

    public C3674h1(C3651c cVar, TListener tlistener) {
        this.f10317c = cVar;
        this.f10315a = tlistener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11603a(TListener tlistener);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo11604b();

    /* renamed from: c */
    public final void mo11605c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f10315a;
            if (this.f10316b) {
                String obj = toString();
                StringBuilder sb = new StringBuilder(obj.length() + 47);
                sb.append("Callback proxy ");
                sb.append(obj);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                mo11603a(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f10316b = true;
        }
        mo11607e();
    }

    /* renamed from: d */
    public final void mo11606d() {
        synchronized (this) {
            this.f10315a = null;
        }
    }

    /* renamed from: e */
    public final void mo11607e() {
        mo11606d();
        synchronized (this.f10317c.f10251t) {
            this.f10317c.f10251t.remove(this);
        }
    }
}
