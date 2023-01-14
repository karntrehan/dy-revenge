package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.C2790a;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.p122l1.C2999a;
import java.util.Map;
import java.util.TreeMap;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.modules.debug.b */
public class C2812b extends C2790a.C2791a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2790a f7935b;

    /* renamed from: c */
    private final ReactContext f7936c;

    /* renamed from: d */
    private final UIManagerModule f7937d;

    /* renamed from: e */
    private final C2811a f7938e;

    /* renamed from: f */
    private boolean f7939f = false;

    /* renamed from: g */
    private long f7940g = -1;

    /* renamed from: h */
    private long f7941h = -1;

    /* renamed from: i */
    private int f7942i = 0;

    /* renamed from: j */
    private int f7943j = 0;

    /* renamed from: k */
    private int f7944k = 0;

    /* renamed from: l */
    private int f7945l = 0;

    /* renamed from: m */
    private boolean f7946m = false;

    /* renamed from: n */
    private TreeMap<Long, C2814b> f7947n;

    /* renamed from: com.facebook.react.modules.debug.b$a */
    class C2813a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2812b f7948f;

        C2813a(C2812b bVar) {
            this.f7948f = bVar;
        }

        public void run() {
            C2790a unused = C2812b.this.f7935b = C2790a.m11141d();
            C2812b.this.f7935b.mo9127e(this.f7948f);
        }
    }

    /* renamed from: com.facebook.react.modules.debug.b$b */
    public static class C2814b {

        /* renamed from: a */
        public final int f7950a;

        /* renamed from: b */
        public final int f7951b;

        /* renamed from: c */
        public final int f7952c;

        /* renamed from: d */
        public final int f7953d;

        /* renamed from: e */
        public final double f7954e;

        /* renamed from: f */
        public final double f7955f;

        /* renamed from: g */
        public final int f7956g;

        public C2814b(int i, int i2, int i3, int i4, double d, double d2, int i5) {
            this.f7950a = i;
            this.f7951b = i2;
            this.f7952c = i3;
            this.f7953d = i4;
            this.f7954e = d;
            this.f7955f = d2;
            this.f7956g = i5;
        }
    }

    public C2812b(ReactContext reactContext) {
        this.f7936c = reactContext;
        this.f7937d = (UIManagerModule) C6409a.m24521c(reactContext.getNativeModule(UIManagerModule.class));
        this.f7938e = new C2811a();
    }

    /* renamed from: a */
    public void mo9129a(long j) {
        if (!this.f7939f) {
            if (this.f7940g == -1) {
                this.f7940g = j;
            }
            long j2 = this.f7941h;
            this.f7941h = j;
            if (this.f7938e.mo9159e(j2, j)) {
                this.f7945l++;
            }
            this.f7942i++;
            int e = mo9160e();
            if ((e - this.f7943j) - 1 >= 4) {
                this.f7944k++;
            }
            if (this.f7946m) {
                C6409a.m24521c(this.f7947n);
                this.f7947n.put(Long.valueOf(System.currentTimeMillis()), new C2814b(mo9164i(), mo9165j(), e, this.f7944k, mo9161f(), mo9163h(), mo9166k()));
            }
            this.f7943j = e;
            C2790a aVar = this.f7935b;
            if (aVar != null) {
                aVar.mo9127e(this);
            }
        }
    }

    /* renamed from: e */
    public int mo9160e() {
        return (int) ((((double) mo9166k()) / 16.9d) + 1.0d);
    }

    /* renamed from: f */
    public double mo9161f() {
        if (this.f7941h == this.f7940g) {
            return 0.0d;
        }
        return (((double) mo9164i()) * 1.0E9d) / ((double) (this.f7941h - this.f7940g));
    }

    /* renamed from: g */
    public C2814b mo9162g(long j) {
        C6409a.m24522d(this.f7947n, "FPS was not recorded at each frame!");
        Map.Entry<Long, C2814b> floorEntry = this.f7947n.floorEntry(Long.valueOf(j));
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getValue();
    }

    /* renamed from: h */
    public double mo9163h() {
        if (this.f7941h == this.f7940g) {
            return 0.0d;
        }
        return (((double) mo9165j()) * 1.0E9d) / ((double) (this.f7941h - this.f7940g));
    }

    /* renamed from: i */
    public int mo9164i() {
        return this.f7942i - 1;
    }

    /* renamed from: j */
    public int mo9165j() {
        return this.f7945l - 1;
    }

    /* renamed from: k */
    public int mo9166k() {
        return ((int) (((double) this.f7941h) - ((double) this.f7940g))) / 1000000;
    }

    /* renamed from: l */
    public void mo9167l() {
        this.f7939f = false;
        this.f7936c.getCatalystInstance().addBridgeIdleDebugListener(this.f7938e);
        this.f7937d.setViewHierarchyUpdateDebugListener(this.f7938e);
        UiThreadUtil.runOnUiThread(new C2813a(this));
    }

    /* renamed from: m */
    public void mo9168m() {
        this.f7947n = new TreeMap<>();
        this.f7946m = true;
        mo9167l();
    }

    /* renamed from: n */
    public void mo9169n() {
        this.f7939f = true;
        this.f7936c.getCatalystInstance().removeBridgeIdleDebugListener(this.f7938e);
        this.f7937d.setViewHierarchyUpdateDebugListener((C2999a) null);
    }
}
