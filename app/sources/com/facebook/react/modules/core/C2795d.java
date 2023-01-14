package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.C2700j;
import com.facebook.react.devsupport.p114j.C2730d;
import com.facebook.react.modules.core.C2790a;
import com.facebook.react.modules.core.C2804g;
import com.facebook.react.p108a0.C2581b;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p174e.p247e.p317m.p318a.C6410a;

/* renamed from: com.facebook.react.modules.core.d */
public class C2795d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ReactApplicationContext f7880a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2794c f7881b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2804g f7882c;

    /* renamed from: d */
    private final C2730d f7883d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f7884e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Object f7885f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final PriorityQueue<C2800e> f7886g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseArray<C2800e> f7887h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicBoolean f7888i = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final AtomicBoolean f7889j = new AtomicBoolean(false);

    /* renamed from: k */
    private final C2801f f7890k = new C2801f(this, (C2796a) null);

    /* renamed from: l */
    private final C2799d f7891l = new C2799d(this, (C2796a) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C2798c f7892m;

    /* renamed from: n */
    private boolean f7893n = false;

    /* renamed from: o */
    private boolean f7894o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f7895p = false;

    /* renamed from: com.facebook.react.modules.core.d$a */
    class C2796a implements Comparator<C2800e> {
        C2796a() {
        }

        /* renamed from: a */
        public int compare(C2800e eVar, C2800e eVar2) {
            int i = ((eVar.f7906d - eVar2.f7906d) > 0 ? 1 : ((eVar.f7906d - eVar2.f7906d) == 0 ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            return i < 0 ? -1 : 1;
        }
    }

    /* renamed from: com.facebook.react.modules.core.d$b */
    class C2797b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ boolean f7897f;

        C2797b(boolean z) {
            this.f7897f = z;
        }

        public void run() {
            synchronized (C2795d.this.f7885f) {
                if (this.f7897f) {
                    C2795d.this.m11148C();
                } else {
                    C2795d.this.m11163o();
                }
            }
        }
    }

    /* renamed from: com.facebook.react.modules.core.d$c */
    private class C2798c implements Runnable {

        /* renamed from: f */
        private volatile boolean f7899f = false;

        /* renamed from: o */
        private final long f7900o;

        public C2798c(long j) {
            this.f7900o = j;
        }

        /* renamed from: a */
        public void mo9146a() {
            this.f7899f = true;
        }

        public void run() {
            boolean h;
            if (!this.f7899f) {
                long c = C2700j.m10934c() - (this.f7900o / 1000000);
                long a = C2700j.m10932a() - c;
                if (16.666666f - ((float) c) >= 1.0f) {
                    synchronized (C2795d.this.f7885f) {
                        h = C2795d.this.f7895p;
                    }
                    if (h) {
                        C2795d.this.f7881b.callIdleCallbacks((double) a);
                    }
                    C2798c unused = C2795d.this.f7892m = null;
                }
            }
        }
    }

    /* renamed from: com.facebook.react.modules.core.d$d */
    private class C2799d extends C2790a.C2791a {
        private C2799d() {
        }

        /* synthetic */ C2799d(C2795d dVar, C2796a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo9129a(long j) {
            if (!C2795d.this.f7888i.get() || C2795d.this.f7889j.get()) {
                if (C2795d.this.f7892m != null) {
                    C2795d.this.f7892m.mo9146a();
                }
                C2795d dVar = C2795d.this;
                C2798c unused = dVar.f7892m = new C2798c(j);
                C2795d.this.f7880a.runOnJSQueueThread(C2795d.this.f7892m);
                C2795d.this.f7882c.mo9151m(C2804g.C2807c.IDLE_EVENT, this);
            }
        }
    }

    /* renamed from: com.facebook.react.modules.core.d$e */
    private static class C2800e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f7903a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f7904b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f7905c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f7906d;

        private C2800e(int i, long j, int i2, boolean z) {
            this.f7903a = i;
            this.f7906d = j;
            this.f7905c = i2;
            this.f7904b = z;
        }

        /* synthetic */ C2800e(int i, long j, int i2, boolean z, C2796a aVar) {
            this(i, j, i2, z);
        }
    }

    /* renamed from: com.facebook.react.modules.core.d$f */
    private class C2801f extends C2790a.C2791a {

        /* renamed from: b */
        private WritableArray f7907b;

        private C2801f() {
            this.f7907b = null;
        }

        /* synthetic */ C2801f(C2795d dVar, C2796a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo9129a(long j) {
            if (!C2795d.this.f7888i.get() || C2795d.this.f7889j.get()) {
                long j2 = j / 1000000;
                synchronized (C2795d.this.f7884e) {
                    while (!C2795d.this.f7886g.isEmpty() && ((C2800e) C2795d.this.f7886g.peek()).f7906d < j2) {
                        C2800e eVar = (C2800e) C2795d.this.f7886g.poll();
                        if (this.f7907b == null) {
                            this.f7907b = Arguments.createArray();
                        }
                        this.f7907b.pushInt(eVar.f7903a);
                        if (eVar.f7904b) {
                            long unused = eVar.f7906d = ((long) eVar.f7905c) + j2;
                            C2795d.this.f7886g.add(eVar);
                        } else {
                            C2795d.this.f7887h.remove(eVar.f7903a);
                        }
                    }
                }
                if (this.f7907b != null) {
                    C2795d.this.f7881b.callTimers(this.f7907b);
                    this.f7907b = null;
                }
                C2795d.this.f7882c.mo9151m(C2804g.C2807c.TIMERS_EVENTS, this);
            }
        }
    }

    public C2795d(ReactApplicationContext reactApplicationContext, C2794c cVar, C2804g gVar, C2730d dVar) {
        this.f7880a = reactApplicationContext;
        this.f7881b = cVar;
        this.f7882c = gVar;
        this.f7883d = dVar;
        this.f7886g = new PriorityQueue<>(11, new C2796a());
        this.f7887h = new SparseArray<>();
    }

    /* renamed from: B */
    private void m11147B() {
        if (!this.f7893n) {
            this.f7882c.mo9151m(C2804g.C2807c.TIMERS_EVENTS, this.f7890k);
            this.f7893n = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m11148C() {
        if (!this.f7894o) {
            this.f7882c.mo9151m(C2804g.C2807c.IDLE_EVENT, this.f7891l);
            this.f7894o = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m11163o() {
        if (this.f7894o) {
            this.f7882c.mo9152o(C2804g.C2807c.IDLE_EVENT, this.f7891l);
            this.f7894o = false;
        }
    }

    /* renamed from: p */
    private void m11164p() {
        C2581b e = C2581b.m10755e(this.f7880a);
        if (this.f7893n && this.f7888i.get() && !e.mo8394f()) {
            this.f7882c.mo9152o(C2804g.C2807c.TIMERS_EVENTS, this.f7890k);
            this.f7893n = false;
        }
    }

    /* renamed from: s */
    private static boolean m11165s(C2800e eVar, long j) {
        return !eVar.f7904b && ((long) eVar.f7905c) < j;
    }

    /* renamed from: t */
    private void m11166t() {
        if (this.f7888i.get() && !this.f7889j.get()) {
            m11164p();
        }
    }

    /* renamed from: u */
    private void m11167u() {
        synchronized (this.f7885f) {
            if (this.f7895p) {
                m11148C();
            }
        }
    }

    /* renamed from: A */
    public void mo9132A() {
        m11164p();
        m11163o();
    }

    @C6410a
    public void createTimer(int i, long j, boolean z) {
        C2800e eVar = new C2800e(i, (C2700j.m10933b() / 1000000) + j, (int) j, z, (C2796a) null);
        synchronized (this.f7884e) {
            this.f7886g.add(eVar);
            this.f7887h.put(i, eVar);
        }
    }

    @C6410a
    public void deleteTimer(int i) {
        synchronized (this.f7884e) {
            C2800e eVar = this.f7887h.get(i);
            if (eVar != null) {
                this.f7887h.remove(i);
                this.f7886g.remove(eVar);
            }
        }
    }

    /* renamed from: q */
    public void mo9135q(int i, int i2, double d, boolean z) {
        long a = C2700j.m10932a();
        long j = (long) d;
        if (this.f7883d.mo8881d() && Math.abs(j - a) > 60000) {
            this.f7881b.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0, (j - a) + ((long) i2));
        if (i2 != 0 || z) {
            createTimer(i, max, z);
            return;
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        this.f7881b.callTimers(createArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo9136r(long j) {
        synchronized (this.f7884e) {
            C2800e peek = this.f7886g.peek();
            if (peek == null) {
                return false;
            }
            if (m11165s(peek, j)) {
                return true;
            }
            Iterator<C2800e> it = this.f7886g.iterator();
            while (it.hasNext()) {
                if (m11165s(it.next(), j)) {
                    return true;
                }
            }
            return false;
        }
    }

    @C6410a
    public void setSendIdleEvents(boolean z) {
        synchronized (this.f7885f) {
            this.f7895p = z;
        }
        UiThreadUtil.runOnUiThread(new C2797b(z));
    }

    /* renamed from: v */
    public void mo9138v(int i) {
        if (!C2581b.m10755e(this.f7880a).mo8394f()) {
            this.f7889j.set(false);
            m11164p();
            m11166t();
        }
    }

    /* renamed from: w */
    public void mo9139w(int i) {
        if (!this.f7889j.getAndSet(true)) {
            m11147B();
            m11167u();
        }
    }

    /* renamed from: x */
    public void mo9140x() {
        m11164p();
        m11166t();
    }

    /* renamed from: y */
    public void mo9141y() {
        this.f7888i.set(true);
        m11164p();
        m11166t();
    }

    /* renamed from: z */
    public void mo9142z() {
        this.f7888i.set(false);
        m11147B();
        m11167u();
    }
}
