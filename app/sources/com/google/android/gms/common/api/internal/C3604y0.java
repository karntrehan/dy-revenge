package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3631f;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3705r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p174e.p319f.p320a.p335c.p360g.C8921a;
import p174e.p319f.p320a.p335c.p360g.C8939g;

/* renamed from: com.google.android.gms.common.api.internal.y0 */
public final class C3604y0 implements C3572q1, C3499a3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Lock f10156a;

    /* renamed from: b */
    private final Condition f10157b;

    /* renamed from: c */
    private final Context f10158c;

    /* renamed from: d */
    private final C3631f f10159d;

    /* renamed from: e */
    private final C3600x0 f10160e;

    /* renamed from: f */
    final Map<C3469a.C3472c<?>, C3469a.C3478f> f10161f;

    /* renamed from: g */
    final Map<C3469a.C3472c<?>, C3623b> f10162g = new HashMap();

    /* renamed from: h */
    final C3659d f10163h;

    /* renamed from: i */
    final Map<C3469a<?>, Boolean> f10164i;

    /* renamed from: j */
    final C3469a.C3470a<? extends C8939g, C8921a> f10165j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile C3592v0 f10166k;

    /* renamed from: l */
    private C3623b f10167l = null;

    /* renamed from: m */
    int f10168m;

    /* renamed from: n */
    final C3588u0 f10169n;

    /* renamed from: o */
    final C3564o1 f10170o;

    public C3604y0(Context context, C3588u0 u0Var, Lock lock, Looper looper, C3631f fVar, Map<C3469a.C3472c<?>, C3469a.C3478f> map, C3659d dVar, Map<C3469a<?>, Boolean> map2, C3469a.C3470a<? extends C8939g, C8921a> aVar, ArrayList<C3610z2> arrayList, C3564o1 o1Var) {
        this.f10158c = context;
        this.f10156a = lock;
        this.f10159d = fVar;
        this.f10161f = map;
        this.f10163h = dVar;
        this.f10164i = map2;
        this.f10165j = aVar;
        this.f10169n = u0Var;
        this.f10170o = o1Var;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo11447a(this);
        }
        this.f10160e = new C3600x0(this, looper);
        this.f10157b = lock.newCondition();
        this.f10166k = new C3571q0(this);
    }

    /* renamed from: Y */
    public final void mo11261Y(C3623b bVar, C3469a<?> aVar, boolean z) {
        this.f10156a.lock();
        try {
            this.f10166k.mo11284c(bVar, aVar, z);
        } finally {
            this.f10156a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo11392a() {
        this.f10166k.mo11283b();
    }

    /* renamed from: b */
    public final boolean mo11393b() {
        return this.f10166k instanceof C3507c0;
    }

    /* renamed from: c */
    public final <A extends C3469a.C3471b, T extends C3511d<? extends C3612k, A>> T mo11394c(T t) {
        t.mo11243l();
        return this.f10166k.mo11288g(t);
    }

    /* renamed from: d */
    public final void mo11395d() {
        if (this.f10166k instanceof C3507c0) {
            ((C3507c0) this.f10166k).mo11289i();
        }
    }

    /* renamed from: e */
    public final void mo11396e() {
    }

    /* renamed from: f */
    public final void mo11397f() {
        if (this.f10166k.mo11287f()) {
            this.f10162g.clear();
        }
    }

    /* renamed from: g */
    public final boolean mo11398g(C3562o oVar) {
        return false;
    }

    /* renamed from: h */
    public final void mo11399h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f10166k);
        for (C3469a next : this.f10164i.keySet()) {
            printWriter.append(str).append(next.mo11179d()).println(":");
            ((C3469a.C3478f) C3705r.m14346k(this.f10161f.get(next.mo11177b()))).mo11195k(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: j */
    public final void mo11294j(int i) {
        this.f10156a.lock();
        try {
            this.f10166k.mo11285d(i);
        } finally {
            this.f10156a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo11440l() {
        this.f10156a.lock();
        try {
            this.f10169n.mo11423x();
            this.f10166k = new C3507c0(this);
            this.f10166k.mo11286e();
            this.f10157b.signalAll();
        } finally {
            this.f10156a.unlock();
        }
    }

    /* renamed from: m */
    public final void mo11296m(Bundle bundle) {
        this.f10156a.lock();
        try {
            this.f10166k.mo11282a(bundle);
        } finally {
            this.f10156a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo11441n() {
        this.f10156a.lock();
        try {
            this.f10166k = new C3567p0(this, this.f10163h, this.f10164i, this.f10159d, this.f10165j, this.f10156a, this.f10158c);
            this.f10166k.mo11286e();
            this.f10157b.signalAll();
        } finally {
            this.f10156a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo11442o(C3623b bVar) {
        this.f10156a.lock();
        try {
            this.f10167l = bVar;
            this.f10166k = new C3571q0(this);
            this.f10166k.mo11286e();
            this.f10157b.signalAll();
        } finally {
            this.f10156a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo11443p(C3596w0 w0Var) {
        this.f10160e.sendMessage(this.f10160e.obtainMessage(1, w0Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo11444q(RuntimeException runtimeException) {
        this.f10160e.sendMessage(this.f10160e.obtainMessage(2, runtimeException));
    }
}
