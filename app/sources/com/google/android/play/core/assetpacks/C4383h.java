package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p174e.p319f.p320a.p382e.p383a.p385b.C9103b;
import p174e.p319f.p320a.p382e.p383a.p385b.C9130o0;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.h */
final class C4383h extends C9103b {

    /* renamed from: o */
    final /* synthetic */ int f12450o;

    /* renamed from: p */
    final /* synthetic */ String f12451p;

    /* renamed from: q */
    final /* synthetic */ String f12452q;

    /* renamed from: r */
    final /* synthetic */ int f12453r;

    /* renamed from: s */
    final /* synthetic */ C9165m f12454s;

    /* renamed from: t */
    final /* synthetic */ C4411o f12455t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4383h(C4411o oVar, C9165m mVar, int i, String str, String str2, int i2, C9165m mVar2) {
        super(mVar);
        this.f12455t = oVar;
        this.f12450o = i;
        this.f12451p = str;
        this.f12452q = str2;
        this.f12453r = i2;
        this.f12454s = mVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13849a() {
        try {
            ((C9130o0) this.f12455t.f12597e.mo23101c()).mo23107R(this.f12455t.f12595c, C4411o.m16902q(this.f12450o, this.f12451p, this.f12452q, this.f12453r), C4411o.m16895j(), new C4395k(this.f12455t, this.f12454s));
        } catch (RemoteException e) {
            C4411o.f12593a.mo23081b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f12451p, this.f12452q, Integer.valueOf(this.f12453r), Integer.valueOf(this.f12450o));
            this.f12454s.mo23142d(new RuntimeException(e));
        }
    }
}
