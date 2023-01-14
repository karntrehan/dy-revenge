package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C2700j;
import com.facebook.react.uimanager.C2981h;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.uimanager.events.c */
public abstract class C2944c<T extends C2944c> {

    /* renamed from: a */
    private static int f8241a;

    /* renamed from: b */
    private boolean f8242b;

    /* renamed from: c */
    private int f8243c;

    /* renamed from: d */
    private int f8244d;

    /* renamed from: e */
    private int f8245e;

    /* renamed from: f */
    private long f8246f;

    /* renamed from: g */
    private int f8247g;

    protected C2944c() {
        int i = f8241a;
        f8241a = i + 1;
        this.f8247g = i;
    }

    @Deprecated
    protected C2944c(int i) {
        int i2 = f8241a;
        f8241a = i2 + 1;
        this.f8247g = i2;
        mo9644p(i);
    }

    protected C2944c(int i, int i2) {
        int i3 = f8241a;
        f8241a = i3 + 1;
        this.f8247g = i3;
        mo9645q(i, i2);
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return true;
    }

    /* renamed from: b */
    public T mo9632b(T t) {
        return mo9640l() >= t.mo9640l() ? this : t;
    }

    @Deprecated
    /* renamed from: c */
    public void mo9633c(RCTEventEmitter rCTEventEmitter) {
        WritableMap i = mo9629i();
        if (i != null) {
            rCTEventEmitter.receiveEvent(mo9643o(), mo9630j(), i);
            return;
        }
        throw new C2981h("Event: you must return a valid, non-null value from `getEventData`, or override `dispatch` and `dispatchModern`. Event: " + mo9630j());
    }

    /* renamed from: d */
    public void mo9634d(RCTModernEventEmitter rCTModernEventEmitter) {
        WritableMap i;
        if (mo9639k() == -1 || (i = mo9629i()) == null) {
            mo9633c(rCTModernEventEmitter);
        } else {
            rCTModernEventEmitter.receiveEvent(mo9639k(), mo9643o(), mo9630j(), i);
        }
    }

    @Deprecated
    /* renamed from: e */
    public void mo9635e(RCTModernEventEmitter rCTModernEventEmitter) {
        WritableMap i;
        if (mo9639k() == -1 || (i = mo9629i()) == null) {
            mo9633c(rCTModernEventEmitter);
            return;
        }
        rCTModernEventEmitter.receiveEvent(mo9639k(), mo9643o(), mo9630j(), mo9631a(), mo9637g(), i, mo9638h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo9636f() {
        this.f8242b = false;
        mo9648t();
    }

    /* renamed from: g */
    public short mo9637g() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo9638h() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        return null;
    }

    /* renamed from: j */
    public abstract String mo9630j();

    /* renamed from: k */
    public final int mo9639k() {
        return this.f8244d;
    }

    /* renamed from: l */
    public final long mo9640l() {
        return this.f8246f;
    }

    /* renamed from: m */
    public final int mo9641m() {
        return this.f8243c;
    }

    /* renamed from: n */
    public int mo9642n() {
        return this.f8247g;
    }

    /* renamed from: o */
    public final int mo9643o() {
        return this.f8245e;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: p */
    public void mo9644p(int i) {
        mo9645q(-1, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo9645q(int i, int i2) {
        mo9646r(i, i2, C2700j.m10934c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo9646r(int i, int i2, long j) {
        this.f8244d = i;
        this.f8245e = i2;
        this.f8243c = i == -1 ? 1 : 2;
        this.f8246f = j;
        this.f8242b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo9647s() {
        return this.f8242b;
    }

    /* renamed from: t */
    public void mo9648t() {
    }
}
