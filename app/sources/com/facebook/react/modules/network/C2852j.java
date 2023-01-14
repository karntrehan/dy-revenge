package com.facebook.react.modules.network;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p493i.C10598d0;
import p493i.C10603f;
import p493i.C10615h;
import p493i.C10620l;
import p493i.C10625q;

/* renamed from: com.facebook.react.modules.network.j */
public class C2852j extends ResponseBody {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ResponseBody f8022f;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C2849h f8023o;

    /* renamed from: p */
    private C10615h f8024p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f8025q = 0;

    /* renamed from: com.facebook.react.modules.network.j$a */
    class C2853a extends C10620l {
        C2853a(C10598d0 d0Var) {
            super(d0Var);
        }

        public long read(C10603f fVar, long j) {
            long read = super.read(fVar, j);
            C2852j jVar = C2852j.this;
            int i = (read > -1 ? 1 : (read == -1 ? 0 : -1));
            long unused = jVar.f8025q = jVar.f8025q + (i != 0 ? read : 0);
            C2852j.this.f8023o.mo9204a(C2852j.this.f8025q, C2852j.this.f8022f.contentLength(), i == 0);
            return read;
        }
    }

    public C2852j(ResponseBody responseBody, C2849h hVar) {
        this.f8022f = responseBody;
        this.f8023o = hVar;
    }

    /* renamed from: r */
    private C10598d0 m11312r(C10598d0 d0Var) {
        return new C2853a(d0Var);
    }

    /* renamed from: A */
    public long mo9227A() {
        return this.f8025q;
    }

    public long contentLength() {
        return this.f8022f.contentLength();
    }

    public MediaType contentType() {
        return this.f8022f.contentType();
    }

    public C10615h source() {
        if (this.f8024p == null) {
            this.f8024p = C10625q.m36156d(m11312r(this.f8022f.source()));
        }
        return this.f8024p;
    }
}
