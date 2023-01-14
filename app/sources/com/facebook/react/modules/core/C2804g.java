package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.C2790a;
import java.util.ArrayDeque;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.modules.core.g */
public class C2804g {

    /* renamed from: a */
    private static C2804g f7909a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile C2790a f7910b;

    /* renamed from: c */
    private final C2808d f7911c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f7912d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ArrayDeque<C2790a.C2791a>[] f7913e;

    /* renamed from: f */
    private int f7914f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f7915g;

    /* renamed from: com.facebook.react.modules.core.g$a */
    class C2805a implements Runnable {
        C2805a() {
        }

        public void run() {
            C2804g.this.m11197n();
        }
    }

    /* renamed from: com.facebook.react.modules.core.g$b */
    class C2806b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f7917f;

        C2806b(Runnable runnable) {
            this.f7917f = runnable;
        }

        public void run() {
            synchronized (C2804g.class) {
                if (C2804g.this.f7910b == null) {
                    C2790a unused = C2804g.this.f7910b = C2790a.m11141d();
                }
            }
            Runnable runnable = this.f7917f;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.facebook.react.modules.core.g$c */
    public enum C2807c {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        

        /* renamed from: t */
        private final int f7925t;

        private C2807c(int i) {
            this.f7925t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo9155e() {
            return this.f7925t;
        }
    }

    /* renamed from: com.facebook.react.modules.core.g$d */
    private class C2808d extends C2790a.C2791a {
        private C2808d() {
        }

        /* synthetic */ C2808d(C2804g gVar, C2805a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo9129a(long j) {
            synchronized (C2804g.this.f7912d) {
                boolean unused = C2804g.this.f7915g = false;
                for (ArrayDeque arrayDeque : C2804g.this.f7913e) {
                    int size = arrayDeque.size();
                    for (int i = 0; i < size; i++) {
                        C2790a.C2791a aVar = (C2790a.C2791a) arrayDeque.pollFirst();
                        if (aVar != null) {
                            aVar.mo9129a(j);
                            C2804g.m11192g(C2804g.this);
                        } else {
                            C6071a.m22875i("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                C2804g.this.m11196l();
            }
        }
    }

    private C2804g() {
        int i = 0;
        this.f7914f = 0;
        this.f7915g = false;
        this.f7911c = new C2808d(this, (C2805a) null);
        this.f7913e = new ArrayDeque[C2807c.values().length];
        while (true) {
            ArrayDeque<C2790a.C2791a>[] arrayDequeArr = this.f7913e;
            if (i < arrayDequeArr.length) {
                arrayDequeArr[i] = new ArrayDeque<>();
                i++;
            } else {
                mo9150k((Runnable) null);
                return;
            }
        }
    }

    /* renamed from: g */
    static /* synthetic */ int m11192g(C2804g gVar) {
        int i = gVar.f7914f;
        gVar.f7914f = i - 1;
        return i;
    }

    /* renamed from: i */
    public static C2804g m11194i() {
        C6409a.m24522d(f7909a, "ReactChoreographer needs to be initialized.");
        return f7909a;
    }

    /* renamed from: j */
    public static void m11195j() {
        if (f7909a == null) {
            f7909a = new C2804g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m11196l() {
        C6409a.m24519a(this.f7914f >= 0);
        if (this.f7914f == 0 && this.f7915g) {
            if (this.f7910b != null) {
                this.f7910b.mo9128f(this.f7911c);
            }
            this.f7915g = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m11197n() {
        this.f7910b.mo9127e(this.f7911c);
        this.f7915g = true;
    }

    /* renamed from: k */
    public void mo9150k(Runnable runnable) {
        UiThreadUtil.runOnUiThread(new C2806b(runnable));
    }

    /* renamed from: m */
    public void mo9151m(C2807c cVar, C2790a.C2791a aVar) {
        synchronized (this.f7912d) {
            this.f7913e[cVar.mo9155e()].addLast(aVar);
            boolean z = true;
            int i = this.f7914f + 1;
            this.f7914f = i;
            if (i <= 0) {
                z = false;
            }
            C6409a.m24519a(z);
            if (!this.f7915g) {
                if (this.f7910b == null) {
                    mo9150k(new C2805a());
                } else {
                    m11197n();
                }
            }
        }
    }

    /* renamed from: o */
    public void mo9152o(C2807c cVar, C2790a.C2791a aVar) {
        synchronized (this.f7912d) {
            if (this.f7913e[cVar.mo9155e()].removeFirstOccurrence(aVar)) {
                this.f7914f--;
                m11196l();
            } else {
                C6071a.m22875i("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }
}
