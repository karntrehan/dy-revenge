package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.C1114f;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1289e;
import androidx.lifecycle.C1291g;
import androidx.lifecycle.C1292h;
import androidx.lifecycle.C1303p;
import androidx.lifecycle.C1311s;
import androidx.lifecycle.C1312t;
import androidx.savedstate.C1422a;
import androidx.savedstate.C1423b;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends C1114f implements C1291g, C1312t, C1423b, C0044c {

    /* renamed from: p */
    private final C1292h f75p = new C1292h(this);

    /* renamed from: q */
    private final C1422a f76q = C1422a.m6371a(this);

    /* renamed from: r */
    private C1311s f77r;

    /* renamed from: s */
    private final OnBackPressedDispatcher f78s = new OnBackPressedDispatcher(new C0039a());

    /* renamed from: t */
    private int f79t;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0039a implements Runnable {
        C0039a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    static final class C0040b {

        /* renamed from: a */
        Object f83a;

        /* renamed from: b */
        C1311s f84b;

        C0040b() {
        }
    }

    public ComponentActivity() {
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                getLifecycle().mo4338a(new C1289e() {
                    /* renamed from: h */
                    public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
                        if (aVar == C1286d.C1287a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().mo4338a(new C1289e() {
                /* renamed from: h */
                public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
                    if (aVar == C1286d.C1287a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo129g().mo4379a();
                    }
                }
            });
            if (19 <= i && i <= 23) {
                getLifecycle().mo4338a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: b */
    public final OnBackPressedDispatcher mo128b() {
        return this.f78s;
    }

    /* renamed from: g */
    public C1311s mo129g() {
        if (getApplication() != null) {
            if (this.f77r == null) {
                C0040b bVar = (C0040b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f77r = bVar.f84b;
                }
                if (this.f77r == null) {
                    this.f77r = new C1311s();
                }
            }
            return this.f77r;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public C1286d getLifecycle() {
        return this.f75p;
    }

    /* renamed from: j */
    public final SavedStateRegistry mo131j() {
        return this.f76q.mo5265b();
    }

    @Deprecated
    /* renamed from: m */
    public Object mo132m() {
        return null;
    }

    public void onBackPressed() {
        this.f78s.mo141c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f76q.mo5266c(bundle);
        C1303p.m5343f(this);
        int i = this.f79t;
        if (i != 0) {
            setContentView(i);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0040b bVar;
        Object m = mo132m();
        C1311s sVar = this.f77r;
        if (sVar == null && (bVar = (C0040b) getLastNonConfigurationInstance()) != null) {
            sVar = bVar.f84b;
        }
        if (sVar == null && m == null) {
            return null;
        }
        C0040b bVar2 = new C0040b();
        bVar2.f83a = m;
        bVar2.f84b = sVar;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C1286d lifecycle = getLifecycle();
        if (lifecycle instanceof C1292h) {
            ((C1292h) lifecycle).mo4344p(C1286d.C1288b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f76q.mo5267d(bundle);
    }
}
