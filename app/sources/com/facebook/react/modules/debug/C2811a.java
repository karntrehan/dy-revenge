package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.C2692d;
import com.facebook.react.uimanager.p122l1.C2999a;

/* renamed from: com.facebook.react.modules.debug.a */
public class C2811a implements NotThreadSafeBridgeIdleDebugListener, C2999a {

    /* renamed from: a */
    private final C2692d f7930a = C2692d.m10904b(20);

    /* renamed from: b */
    private final C2692d f7931b = C2692d.m10904b(20);

    /* renamed from: c */
    private final C2692d f7932c = C2692d.m10904b(20);

    /* renamed from: d */
    private final C2692d f7933d = C2692d.m10904b(20);

    /* renamed from: e */
    private volatile boolean f7934e = true;

    /* renamed from: c */
    private static void m11203c(C2692d dVar, long j) {
        int g = dVar.mo8813g();
        int i = 0;
        for (int i2 = 0; i2 < g; i2++) {
            if (dVar.mo8811d(i2) < j) {
                i++;
            }
        }
        if (i > 0) {
            for (int i3 = 0; i3 < g - i; i3++) {
                dVar.mo8812f(i3, dVar.mo8811d(i3 + i));
            }
            dVar.mo8810c(i);
        }
    }

    /* renamed from: d */
    private boolean m11204d(long j, long j2) {
        long f = m11205f(this.f7930a, j, j2);
        long f2 = m11205f(this.f7931b, j, j2);
        return (f == -1 && f2 == -1) ? this.f7934e : f > f2;
    }

    /* renamed from: f */
    private static long m11205f(C2692d dVar, long j, long j2) {
        long j3 = -1;
        for (int i = 0; i < dVar.mo8813g(); i++) {
            long d = dVar.mo8811d(i);
            if (d >= j && d < j2) {
                j3 = d;
            } else if (d >= j2) {
                break;
            }
        }
        return j3;
    }

    /* renamed from: g */
    private static boolean m11206g(C2692d dVar, long j, long j2) {
        for (int i = 0; i < dVar.mo8813g(); i++) {
            long d = dVar.mo8811d(i);
            if (d >= j && d < j2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized void mo9157a() {
        this.f7932c.mo8809a(System.nanoTime());
    }

    /* renamed from: b */
    public synchronized void mo9158b() {
        this.f7933d.mo8809a(System.nanoTime());
    }

    /* renamed from: e */
    public synchronized boolean mo9159e(long j, long j2) {
        boolean z;
        boolean g = m11206g(this.f7933d, j, j2);
        boolean d = m11204d(j, j2);
        z = true;
        if (!g) {
            if (!d || m11206g(this.f7932c, j, j2)) {
                z = false;
            }
        }
        m11203c(this.f7930a, j2);
        m11203c(this.f7931b, j2);
        m11203c(this.f7932c, j2);
        m11203c(this.f7933d, j2);
        this.f7934e = d;
        return z;
    }

    public synchronized void onBridgeDestroyed() {
    }

    public synchronized void onTransitionToBridgeBusy() {
        this.f7931b.mo8809a(System.nanoTime());
    }

    public synchronized void onTransitionToBridgeIdle() {
        this.f7930a.mo8809a(System.nanoTime());
    }
}
