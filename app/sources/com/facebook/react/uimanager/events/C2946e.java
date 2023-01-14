package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C2693e;
import com.facebook.react.modules.core.C2790a;
import com.facebook.react.modules.core.C2804g;
import com.facebook.react.p126z.C3257a;
import com.facebook.systrace.C3294a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.uimanager.events.e */
public class C2946e implements C2945d, LifecycleEventListener {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Comparator<C2944c> f8248f = new C2947a();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f8249A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public volatile ReactEventEmitter f8250B;

    /* renamed from: C */
    private short f8251C = 0;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public volatile boolean f8252D = false;

    /* renamed from: o */
    private final Object f8253o = new Object();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Object f8254p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final ReactApplicationContext f8255q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final LongSparseArray<Integer> f8256r = new LongSparseArray<>();

    /* renamed from: s */
    private final Map<String, Short> f8257s = C2693e.m10912b();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C2949c f8258t = new C2949c(this, (C2947a) null);

    /* renamed from: u */
    private final ArrayList<C2944c> f8259u = new ArrayList<>();

    /* renamed from: v */
    private final CopyOnWriteArrayList<C2952f> f8260v = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final CopyOnWriteArrayList<C2942a> f8261w = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C2950d f8262x = new C2950d(this, (C2947a) null);
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final AtomicInteger f8263y = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C2944c[] f8264z = new C2944c[16];

    /* renamed from: com.facebook.react.uimanager.events.e$a */
    static class C2947a implements Comparator<C2944c> {
        C2947a() {
        }

        /* renamed from: a */
        public int compare(C2944c cVar, C2944c cVar2) {
            if (cVar == null && cVar2 == null) {
                return 0;
            }
            if (cVar == null) {
                return -1;
            }
            if (cVar2 == null) {
                return 1;
            }
            int i = ((cVar.mo9640l() - cVar2.mo9640l()) > 0 ? 1 : ((cVar.mo9640l() - cVar2.mo9640l()) == 0 ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            return i < 0 ? -1 : 1;
        }
    }

    /* renamed from: com.facebook.react.uimanager.events.e$b */
    class C2948b implements Runnable {
        C2948b() {
        }

        public void run() {
            C2946e.this.m11737A();
        }
    }

    /* renamed from: com.facebook.react.uimanager.events.e$c */
    private class C2949c implements Runnable {
        private C2949c() {
        }

        /* synthetic */ C2949c(C2946e eVar, C2947a aVar) {
            this();
        }

        public void run() {
            C3294a.m12881c(0, "DispatchEventsRunnable");
            try {
                C3294a.m12882d(0, "ScheduleDispatchFrameCallback", C2946e.this.f8263y.getAndIncrement());
                boolean unused = C2946e.this.f8252D = false;
                C6409a.m24521c(C2946e.this.f8250B);
                synchronized (C2946e.this.f8254p) {
                    if (C2946e.this.f8249A > 0) {
                        if (C2946e.this.f8249A > 1) {
                            Arrays.sort(C2946e.this.f8264z, 0, C2946e.this.f8249A, C2946e.f8248f);
                        }
                        for (int i = 0; i < C2946e.this.f8249A; i++) {
                            C2944c cVar = C2946e.this.f8264z[i];
                            if (cVar != null) {
                                C3294a.m12882d(0, cVar.mo9630j(), cVar.mo9642n());
                                if (C3257a.f9232m) {
                                    cVar.mo9635e(C2946e.this.f8250B);
                                } else {
                                    cVar.mo9634d(C2946e.this.f8250B);
                                }
                                cVar.mo9636f();
                            }
                        }
                        C2946e.this.m11755v();
                        C2946e.this.f8256r.clear();
                    }
                }
                Iterator it = C2946e.this.f8261w.iterator();
                while (it.hasNext()) {
                    ((C2942a) it.next()).mo9044a();
                }
                C3294a.m12885g(0);
            } catch (Throwable th) {
                C3294a.m12885g(0);
                throw th;
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.events.e$d */
    private class C2950d extends C2790a.C2791a {

        /* renamed from: b */
        private volatile boolean f8267b;

        /* renamed from: c */
        private boolean f8268c;

        /* renamed from: com.facebook.react.uimanager.events.e$d$a */
        class C2951a implements Runnable {
            C2951a() {
            }

            public void run() {
                C2950d.this.mo9657c();
            }
        }

        private C2950d() {
            this.f8267b = false;
            this.f8268c = false;
        }

        /* synthetic */ C2950d(C2946e eVar, C2947a aVar) {
            this();
        }

        /* renamed from: e */
        private void m11765e() {
            C2804g.m11194i().mo9151m(C2804g.C2807c.TIMERS_EVENTS, C2946e.this.f8262x);
        }

        /* renamed from: a */
        public void mo9129a(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.f8268c) {
                this.f8267b = false;
            } else {
                m11765e();
            }
            C3294a.m12881c(0, "ScheduleDispatchFrameCallback");
            try {
                C2946e.this.m11759z();
                if (!C2946e.this.f8252D) {
                    boolean unused = C2946e.this.f8252D = true;
                    C3294a.m12888j(0, "ScheduleDispatchFrameCallback", C2946e.this.f8263y.get());
                    C2946e.this.f8255q.runOnJSQueueThread(C2946e.this.f8258t);
                }
            } finally {
                C3294a.m12885g(0);
            }
        }

        /* renamed from: c */
        public void mo9657c() {
            if (!this.f8267b) {
                this.f8267b = true;
                m11765e();
            }
        }

        /* renamed from: d */
        public void mo9658d() {
            if (!this.f8267b) {
                if (C2946e.this.f8255q.isOnUiQueueThread()) {
                    mo9657c();
                } else {
                    C2946e.this.f8255q.runOnUiQueueThread(new C2951a());
                }
            }
        }

        /* renamed from: f */
        public void mo9659f() {
            this.f8268c = true;
        }
    }

    public C2946e(ReactApplicationContext reactApplicationContext) {
        this.f8255q = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f8250B = new ReactEventEmitter(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m11737A() {
        UiThreadUtil.assertOnUiThread();
        this.f8262x.mo9659f();
    }

    /* renamed from: u */
    private void m11754u(C2944c cVar) {
        int i = this.f8249A;
        C2944c[] cVarArr = this.f8264z;
        if (i == cVarArr.length) {
            this.f8264z = (C2944c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        C2944c[] cVarArr2 = this.f8264z;
        int i2 = this.f8249A;
        this.f8249A = i2 + 1;
        cVarArr2[i2] = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m11755v() {
        Arrays.fill(this.f8264z, 0, this.f8249A, (Object) null);
        this.f8249A = 0;
    }

    /* renamed from: w */
    private long m11756w(int i, String str, short s) {
        short s2;
        Short sh = this.f8257s.get(str);
        if (sh != null) {
            s2 = sh.shortValue();
        } else {
            short s3 = this.f8251C;
            this.f8251C = (short) (s3 + 1);
            this.f8257s.put(str, Short.valueOf(s3));
            s2 = s3;
        }
        return m11757x(i, s2, s);
    }

    /* renamed from: x */
    private static long m11757x(int i, short s, short s2) {
        return ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((long) i) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48);
    }

    /* renamed from: y */
    private void m11758y() {
        if (this.f8250B != null) {
            this.f8262x.mo9658d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m11759z() {
        synchronized (this.f8253o) {
            synchronized (this.f8254p) {
                for (int i = 0; i < this.f8259u.size(); i++) {
                    C2944c cVar = this.f8259u.get(i);
                    if (!cVar.mo9631a()) {
                        m11754u(cVar);
                    } else {
                        long w = m11756w(cVar.mo9643o(), cVar.mo9630j(), cVar.mo9637g());
                        Integer num = this.f8256r.get(w);
                        C2944c cVar2 = null;
                        if (num == null) {
                            this.f8256r.put(w, Integer.valueOf(this.f8249A));
                        } else {
                            C2944c cVar3 = this.f8264z[num.intValue()];
                            C2944c b = cVar.mo9632b(cVar3);
                            if (b != cVar3) {
                                this.f8256r.put(w, Integer.valueOf(this.f8249A));
                                this.f8264z[num.intValue()] = null;
                                cVar2 = cVar3;
                                cVar = b;
                            } else {
                                cVar2 = cVar;
                                cVar = null;
                            }
                        }
                        if (cVar != null) {
                            m11754u(cVar);
                        }
                        if (cVar2 != null) {
                            cVar2.mo9636f();
                        }
                    }
                }
            }
            this.f8259u.clear();
        }
    }

    /* renamed from: a */
    public void mo9649a(int i, RCTEventEmitter rCTEventEmitter) {
        this.f8250B.register(i, rCTEventEmitter);
    }

    /* renamed from: b */
    public void mo9650b(C2952f fVar) {
        this.f8260v.add(fVar);
    }

    /* renamed from: c */
    public void mo9651c(C2944c cVar) {
        C6409a.m24520b(cVar.mo9647s(), "Dispatched event hasn't been initialized");
        Iterator<C2952f> it = this.f8260v.iterator();
        while (it.hasNext()) {
            it.next().mo8432a(cVar);
        }
        synchronized (this.f8253o) {
            this.f8259u.add(cVar);
            C3294a.m12888j(0, cVar.mo9630j(), cVar.mo9642n());
        }
        m11758y();
    }

    /* renamed from: d */
    public void mo9652d() {
        UiThreadUtil.runOnUiThread(new C2948b());
    }

    public void onHostDestroy() {
        m11737A();
    }

    public void onHostPause() {
        m11737A();
    }

    public void onHostResume() {
        m11758y();
    }
}
