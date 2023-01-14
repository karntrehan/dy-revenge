package androidx.camera.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.C0994w1;
import androidx.camera.core.impl.C0712a1;
import androidx.camera.core.impl.C0875s0;
import androidx.camera.core.impl.C0883t0;
import androidx.camera.core.impl.C0904x0;
import androidx.camera.core.impl.C0915y2;
import androidx.camera.core.impl.C0921z0;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.p014a3.C0722e;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import p027c.p061g.p062a.C1814b;
import p027c.p064i.p069g.C1854e;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.v1 */
public final class C0989v1 {

    /* renamed from: a */
    private static final Object f2777a = new Object();

    /* renamed from: b */
    private static final SparseArray<Integer> f2778b = new SparseArray<>();

    /* renamed from: c */
    final C0904x0 f2779c = new C0904x0();

    /* renamed from: d */
    private final Object f2780d = new Object();

    /* renamed from: e */
    private final C0994w1 f2781e;

    /* renamed from: f */
    private final Executor f2782f;

    /* renamed from: g */
    private final Handler f2783g;

    /* renamed from: h */
    private final HandlerThread f2784h;

    /* renamed from: i */
    private C0883t0 f2785i;

    /* renamed from: j */
    private C0875s0 f2786j;

    /* renamed from: k */
    private C0915y2 f2787k;

    /* renamed from: l */
    private Context f2788l;

    /* renamed from: m */
    private final C9172b<Void> f2789m;

    /* renamed from: n */
    private C0990a f2790n = C0990a.UNINITIALIZED;

    /* renamed from: o */
    private C9172b<Void> f2791o = C0768f.m3081g(null);

    /* renamed from: p */
    private final Integer f2792p;

    /* renamed from: androidx.camera.core.v1$a */
    private enum C0990a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C0989v1(Context context, C0994w1.C0996b bVar) {
        if (bVar == null && (bVar = m3832c(context)) == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        this.f2781e = bVar.getCameraXConfig();
        Executor H = this.f2781e.mo3272H((Executor) null);
        Handler K = this.f2781e.mo3275K((Handler) null);
        this.f2782f = H == null ? new C0943n1() : H;
        if (K == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f2784h = handlerThread;
            handlerThread.start();
            this.f2783g = C1854e.m7867a(handlerThread.getLooper());
        } else {
            this.f2784h = null;
            this.f2783g = K;
        }
        Integer num = (Integer) this.f2781e.mo2497d(C0994w1.f2812B, null);
        this.f2792p = num;
        m3833f(num);
        this.f2789m = m3835h(context);
    }

    /* renamed from: c */
    private static C0994w1.C0996b m3832c(Context context) {
        Application b = C0722e.m2979b(context);
        if (b instanceof C0994w1.C0996b) {
            return (C0994w1.C0996b) b;
        }
        try {
            Context a = C0722e.m2978a(context);
            Bundle bundle = a.getPackageManager().getServiceInfo(new ComponentName(a, MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C0994w1.C0996b) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            C0949o2.m3690c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            C0949o2.m3691d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    /* renamed from: f */
    private static void m3833f(Integer num) {
        synchronized (f2777a) {
            if (num != null) {
                C1177h.m4581c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = f2778b;
                int i = 1;
                if (sparseArray.get(num.intValue()) != null) {
                    i = 1 + sparseArray.get(num.intValue()).intValue();
                }
                sparseArray.put(num.intValue(), Integer.valueOf(i));
                m3840p();
            }
        }
    }

    /* renamed from: g */
    private void m3834g(Executor executor, long j, Context context, C1814b.C1815a<Void> aVar) {
        executor.execute(new C0679f(this, context, executor, aVar, j));
    }

    /* renamed from: h */
    private C9172b<Void> m3835h(Context context) {
        C9172b<Void> a;
        synchronized (this.f2780d) {
            C1177h.m4586h(this.f2790n == C0990a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f2790n = C0990a.INITIALIZING;
            a = C1814b.m7736a(new C0641e(this, context));
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void mo3265j(Executor executor, long j, C1814b.C1815a aVar) {
        m3834g(executor, j, this.f2788l, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void mo3266l(Context context, Executor executor, C1814b.C1815a aVar, long j) {
        try {
            Application b = C0722e.m2979b(context);
            this.f2788l = b;
            if (b == null) {
                this.f2788l = C0722e.m2978a(context);
            }
            C0883t0.C0884a I = this.f2781e.mo3273I((C0883t0.C0884a) null);
            if (I != null) {
                C0921z0 a = C0921z0.m3619a(this.f2782f, this.f2783g);
                C0965s1 G = this.f2781e.mo3271G((C0965s1) null);
                this.f2785i = I.mo1877a(this.f2788l, a, G);
                C0875s0.C0876a J = this.f2781e.mo3274J((C0875s0.C0876a) null);
                if (J != null) {
                    this.f2786j = J.mo1876a(this.f2788l, this.f2785i.mo2363c(), this.f2785i.mo2361a());
                    C0915y2.C0918c L = this.f2781e.mo3276L((C0915y2.C0918c) null);
                    if (L != null) {
                        this.f2787k = L.mo1875a(this.f2788l);
                        if (executor instanceof C0943n1) {
                            ((C0943n1) executor).mo3190b(this.f2785i);
                        }
                        this.f2779c.mo3146b(this.f2785i);
                        C0712a1.m2953a(this.f2788l, this.f2779c, G);
                        m3839o();
                        aVar.mo6308c(null);
                        return;
                    }
                    throw new C0945n2(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                throw new C0945n2(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            throw new C0945n2(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        } catch (C0712a1.C0713a | C0945n2 | RuntimeException e) {
            if (SystemClock.elapsedRealtime() - j < 2500) {
                C0949o2.m3699l("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                C1854e.m7868b(this.f2783g, new C0684g(this, executor, j, aVar), "retry_token", 500);
                return;
            }
            synchronized (this.f2780d) {
                this.f2790n = C0990a.INITIALIZING_ERROR;
                if (e instanceof C0712a1.C0713a) {
                    C0949o2.m3690c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    aVar.mo6308c(null);
                } else if (e instanceof C0945n2) {
                    aVar.mo6310f(e);
                } else {
                    aVar.mo6310f(new C0945n2(e));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object mo3267n(Context context, C1814b.C1815a aVar) {
        m3834g(this.f2782f, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    /* renamed from: o */
    private void m3839o() {
        synchronized (this.f2780d) {
            this.f2790n = C0990a.INITIALIZED;
        }
    }

    /* renamed from: p */
    private static void m3840p() {
        SparseArray<Integer> sparseArray = f2778b;
        if (sparseArray.size() == 0) {
            C0949o2.m3695h();
            return;
        }
        int i = 3;
        if (sparseArray.get(3) == null) {
            i = 4;
            if (sparseArray.get(4) == null) {
                i = 5;
                if (sparseArray.get(5) == null) {
                    i = 6;
                    if (sparseArray.get(6) == null) {
                        return;
                    }
                }
            }
        }
        C0949o2.m3696i(i);
    }

    /* renamed from: a */
    public C0875s0 mo3261a() {
        C0875s0 s0Var = this.f2786j;
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: b */
    public C0904x0 mo3262b() {
        return this.f2779c;
    }

    /* renamed from: d */
    public C0915y2 mo3263d() {
        C0915y2 y2Var = this.f2787k;
        if (y2Var != null) {
            return y2Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: e */
    public C9172b<Void> mo3264e() {
        return this.f2789m;
    }
}
