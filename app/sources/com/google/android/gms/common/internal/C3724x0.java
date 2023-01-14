package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.C3623b;

/* renamed from: com.google.android.gms.common.internal.x0 */
abstract class C3724x0 extends C3674h1<Boolean> {

    /* renamed from: d */
    public final int f10407d;

    /* renamed from: e */
    public final Bundle f10408e;

    /* renamed from: f */
    final /* synthetic */ C3651c f10409f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C3724x0(C3651c cVar, int i, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f10409f = cVar;
        this.f10407d = i;
        this.f10408e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo11603a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f10407d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo11623g()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.c r3 = r2.f10409f
            r3.m14169n0(r0, null)
            com.google.android.gms.common.b r3 = new com.google.android.gms.common.b
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.mo11622f(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.c r3 = r2.f10409f
            r3.m14169n0(r0, null)
            android.os.Bundle r3 = r2.f10408e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.b r3 = new com.google.android.gms.common.b
            int r0 = r2.f10407d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3724x0.mo11603a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11604b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo11622f(C3623b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo11623g();
}
