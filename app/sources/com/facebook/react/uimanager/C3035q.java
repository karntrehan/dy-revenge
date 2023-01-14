package com.facebook.react.uimanager;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.uimanager.q */
public class C3035q extends C2944c<C3035q> {

    /* renamed from: h */
    private static final C1176g<C3035q> f8429h = new C1176g<>(20);

    /* renamed from: i */
    private int f8430i;

    /* renamed from: j */
    private int f8431j;

    /* renamed from: k */
    private int f8432k;

    /* renamed from: l */
    private int f8433l;

    private C3035q() {
    }

    @Deprecated
    /* renamed from: v */
    public static C3035q m11995v(int i, int i2, int i3, int i4, int i5) {
        return m11996w(-1, i, i2, i3, i4, i5);
    }

    /* renamed from: w */
    public static C3035q m11996w(int i, int i2, int i3, int i4, int i5, int i6) {
        C3035q b = f8429h.mo3702b();
        if (b == null) {
            b = new C3035q();
        }
        b.mo9809u(i, i2, i3, i4, i5, i6);
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", (double) C3038r.m12004a((float) this.f8430i));
        createMap.putDouble("y", (double) C3038r.m12004a((float) this.f8431j));
        createMap.putDouble("width", (double) C3038r.m12004a((float) this.f8432k));
        createMap.putDouble("height", (double) C3038r.m12004a((float) this.f8433l));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", mo9643o());
        return createMap2;
    }

    /* renamed from: j */
    public String mo9630j() {
        return "topLayout";
    }

    /* renamed from: t */
    public void mo9648t() {
        f8429h.mo3701a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo9809u(int i, int i2, int i3, int i4, int i5, int i6) {
        super.mo9645q(i, i2);
        this.f8430i = i3;
        this.f8431j = i4;
        this.f8432k = i5;
        this.f8433l = i6;
    }
}
