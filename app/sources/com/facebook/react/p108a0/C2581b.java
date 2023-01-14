package com.facebook.react.p108a0;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.a0.b */
public class C2581b {

    /* renamed from: a */
    private static final WeakHashMap<ReactContext, C2581b> f7579a = new WeakHashMap<>();

    /* renamed from: b */
    private final WeakReference<ReactContext> f7580b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Set<C2585c> f7581c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private final AtomicInteger f7582d = new AtomicInteger(0);

    /* renamed from: e */
    private final Handler f7583e = new Handler();

    /* renamed from: f */
    private final Set<Integer> f7584f = new CopyOnWriteArraySet();

    /* renamed from: g */
    private final Map<Integer, C2580a> f7585g = new ConcurrentHashMap();

    /* renamed from: h */
    private final SparseArray<Runnable> f7586h = new SparseArray<>();

    /* renamed from: com.facebook.react.a0.b$a */
    class C2582a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2580a f7587f;

        /* renamed from: o */
        final /* synthetic */ int f7588o;

        C2582a(C2580a aVar, int i) {
            this.f7587f = aVar;
            this.f7588o = i;
        }

        public void run() {
            C2581b.this.m10758l(this.f7587f, this.f7588o);
        }
    }

    /* renamed from: com.facebook.react.a0.b$b */
    class C2583b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f7590f;

        C2583b(int i) {
            this.f7590f = i;
        }

        public void run() {
            for (C2585c onHeadlessJsTaskFinish : C2581b.this.f7581c) {
                onHeadlessJsTaskFinish.onHeadlessJsTaskFinish(this.f7590f);
            }
        }
    }

    /* renamed from: com.facebook.react.a0.b$c */
    class C2584c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f7592f;

        C2584c(int i) {
            this.f7592f = i;
        }

        public void run() {
            C2581b.this.mo8393d(this.f7592f);
        }
    }

    private C2581b(ReactContext reactContext) {
        this.f7580b = new WeakReference<>(reactContext);
    }

    /* renamed from: e */
    public static C2581b m10755e(ReactContext reactContext) {
        WeakHashMap<ReactContext, C2581b> weakHashMap = f7579a;
        C2581b bVar = weakHashMap.get(reactContext);
        if (bVar != null) {
            return bVar;
        }
        C2581b bVar2 = new C2581b(reactContext);
        weakHashMap.put(reactContext, bVar2);
        return bVar2;
    }

    /* renamed from: i */
    private void m10756i(int i) {
        Runnable runnable = this.f7586h.get(i);
        if (runnable != null) {
            this.f7583e.removeCallbacks(runnable);
            this.f7586h.remove(i);
        }
    }

    /* renamed from: k */
    private void m10757k(int i, long j) {
        C2584c cVar = new C2584c(i);
        this.f7586h.append(i, cVar);
        this.f7583e.postDelayed(cVar, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public synchronized void m10758l(C2580a aVar, int i) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = (ReactContext) C6409a.m24522d(this.f7580b.get(), "Tried to start a task on a react context that has already been destroyed");
        if (reactContext.getLifecycleState() == LifecycleState.RESUMED) {
            if (!aVar.mo8391e()) {
                throw new IllegalStateException("Tried to start task " + aVar.mo8389c() + " while in foreground, but this is not allowed.");
            }
        }
        this.f7584f.add(Integer.valueOf(i));
        this.f7585g.put(Integer.valueOf(i), new C2580a(aVar));
        if (reactContext.hasActiveReactInstance()) {
            ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i, aVar.mo8389c(), aVar.mo8387a());
        } else {
            ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
        }
        if (aVar.mo8390d() > 0) {
            m10757k(i, aVar.mo8390d());
        }
        for (C2585c onHeadlessJsTaskStart : this.f7581c) {
            onHeadlessJsTaskStart.onHeadlessJsTaskStart(i);
        }
    }

    /* renamed from: c */
    public void mo8392c(C2585c cVar) {
        this.f7581c.add(cVar);
    }

    /* renamed from: d */
    public synchronized void mo8393d(int i) {
        boolean remove = this.f7584f.remove(Integer.valueOf(i));
        C6409a.m24520b(remove, "Tried to finish non-existent task with id " + i + ".");
        boolean z = this.f7585g.remove(Integer.valueOf(i)) != null;
        C6409a.m24520b(z, "Tried to remove non-existent task config with id " + i + ".");
        m10756i(i);
        UiThreadUtil.runOnUiThread(new C2583b(i));
    }

    /* renamed from: f */
    public boolean mo8394f() {
        return this.f7584f.size() > 0;
    }

    /* renamed from: g */
    public synchronized boolean mo8395g(int i) {
        return this.f7584f.contains(Integer.valueOf(i));
    }

    /* renamed from: h */
    public void mo8396h(C2585c cVar) {
        this.f7581c.remove(cVar);
    }

    /* renamed from: j */
    public synchronized boolean mo8397j(int i) {
        C2580a aVar = this.f7585g.get(Integer.valueOf(i));
        boolean z = aVar != null;
        C6409a.m24520b(z, "Tried to retrieve non-existent task config with id " + i + ".");
        C2586d b = aVar.mo8388b();
        if (!b.mo8404b()) {
            return false;
        }
        m10756i(i);
        UiThreadUtil.runOnUiThread(new C2582a(new C2580a(aVar.mo8389c(), aVar.mo8387a(), aVar.mo8390d(), aVar.mo8391e(), b.mo8403a()), i), (long) b.mo8405c());
        return true;
    }
}
