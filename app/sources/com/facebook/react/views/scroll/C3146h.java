package com.facebook.react.views.scroll;

import androidx.core.util.C1176g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.events.C2944c;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.views.scroll.h */
public class C3146h extends C2944c<C3146h> {

    /* renamed from: h */
    private static String f8803h = "h";

    /* renamed from: i */
    private static final C1176g<C3146h> f8804i = new C1176g<>(3);

    /* renamed from: j */
    private int f8805j;

    /* renamed from: k */
    private int f8806k;

    /* renamed from: l */
    private double f8807l;

    /* renamed from: m */
    private double f8808m;

    /* renamed from: n */
    private int f8809n;

    /* renamed from: o */
    private int f8810o;

    /* renamed from: p */
    private int f8811p;

    /* renamed from: q */
    private int f8812q;

    /* renamed from: r */
    private C3147i f8813r;

    private C3146h() {
    }

    /* renamed from: u */
    private void m12377u(int i, int i2, C3147i iVar, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8) {
        super.mo9645q(i, i2);
        this.f8813r = iVar;
        this.f8805j = i3;
        this.f8806k = i4;
        this.f8807l = (double) f;
        this.f8808m = (double) f2;
        this.f8809n = i5;
        this.f8810o = i6;
        this.f8811p = i7;
        this.f8812q = i8;
    }

    /* renamed from: v */
    public static C3146h m12378v(int i, int i2, C3147i iVar, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8) {
        C3146h b = f8804i.mo3702b();
        if (b == null) {
            b = new C3146h();
        }
        b.m12377u(i, i2, iVar, i3, i4, f, f2, i5, i6, i7, i8);
        return b;
    }

    @Deprecated
    /* renamed from: w */
    public static C3146h m12379w(int i, C3147i iVar, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        return m12378v(-1, i, iVar, i2, i3, f, f2, i4, i5, i6, i7);
    }

    /* renamed from: a */
    public boolean mo9631a() {
        return this.f8813r == C3147i.SCROLL;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", 0.0d);
        createMap.putDouble("bottom", 0.0d);
        createMap.putDouble("left", 0.0d);
        createMap.putDouble("right", 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", (double) C3038r.m12004a((float) this.f8805j));
        createMap2.putDouble("y", (double) C3038r.m12004a((float) this.f8806k));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", (double) C3038r.m12004a((float) this.f8809n));
        createMap3.putDouble("height", (double) C3038r.m12004a((float) this.f8810o));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("width", (double) C3038r.m12004a((float) this.f8811p));
        createMap4.putDouble("height", (double) C3038r.m12004a((float) this.f8812q));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble("x", this.f8807l);
        createMap5.putDouble("y", this.f8808m);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt("target", mo9643o());
        createMap6.putBoolean("responderIgnoreScroll", true);
        return createMap6;
    }

    /* renamed from: j */
    public String mo9630j() {
        return C3147i.m12384e((C3147i) C6409a.m24521c(this.f8813r));
    }

    /* renamed from: t */
    public void mo9648t() {
        try {
            f8804i.mo3701a(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException(f8803h, e);
        }
    }
}
