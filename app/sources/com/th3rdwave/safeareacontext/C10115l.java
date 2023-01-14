package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C2929d;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.C3245g;
import java.util.EnumSet;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p455g.C10323s;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10464s;

/* renamed from: com.th3rdwave.safeareacontext.l */
public final class C10115l extends C3245g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: F */
    private C10118o f26952F = C10118o.PADDING;

    /* renamed from: G */
    private C10107e f26953G;

    /* renamed from: H */
    private EnumSet<C10116m> f26954H;

    /* renamed from: I */
    private View f26955I;

    /* renamed from: J */
    private final C2929d f26956J = new C2929d();

    public C10115l(Context context) {
        super(context);
    }

    /* renamed from: B */
    private final View m34216B() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof C10112i) {
                return (View) parent;
            }
        }
        return this;
    }

    /* renamed from: F */
    private final boolean m34220F() {
        C10107e f;
        View view = this.f26955I;
        if (view == null || (f = C10114k.m34215f(view)) == null || C10457l.m35316a(this.f26953G, f)) {
            return false;
        }
        this.f26953G = f;
        m34221G();
        return true;
    }

    /* renamed from: G */
    private final void m34221G() {
        C10107e eVar = this.f26953G;
        if (eVar != null) {
            EnumSet<C10116m> enumSet = this.f26954H;
            if (enumSet == null) {
                enumSet = EnumSet.allOf(C10116m.class);
            }
            if (this.f26956J.mo9494b()) {
                this.f26956J.mo9495c(new C10104b(eVar));
                return;
            }
            C10118o oVar = this.f26952F;
            C10457l.m35319d(enumSet, "edges");
            C10117n nVar = new C10117n(eVar, oVar, enumSet);
            ReactContext a = C10121r.m34239a(this);
            UIManagerModule uIManagerModule = (UIManagerModule) a.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), nVar);
                a.runOnNativeModulesQueueThread(new C10106d(uIManagerModule));
                m34224J();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static final WritableMap m34222H(C10107e eVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("insets", C10120q.m34236b(eVar));
        return createMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final void m34223I(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().mo9852n(-1);
    }

    /* renamed from: J */
    private final void m34224J() {
        C10464s sVar = new C10464s();
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        long nanoTime = System.nanoTime();
        C10121r.m34239a(this).runOnNativeModulesQueueThread(new C10105c(reentrantLock, sVar, newCondition));
        reentrantLock.lock();
        long j = 0;
        while (!sVar.f27622f && j < 500000000) {
            try {
                newCondition.awaitNanos(500000000);
            } catch (InterruptedException unused) {
                sVar.f27622f = true;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
            j += System.nanoTime() - nanoTime;
        }
        C10323s sVar2 = C10323s.f27547a;
        reentrantLock.unlock();
        if (j >= 500000000) {
            Log.w("SafeAreaView", "Timed out waiting for layout.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final void m34225K(ReentrantLock reentrantLock, C10464s sVar, Condition condition) {
        C10457l.m35320e(reentrantLock, "$lock");
        C10457l.m35320e(sVar, "$done");
        reentrantLock.lock();
        try {
            if (!sVar.f27622f) {
                sVar.f27622f = true;
                condition.signal();
            }
            C10323s sVar2 = C10323s.f27547a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public C2929d getFabricViewStateManager() {
        return this.f26956J;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View B = m34216B();
        this.f26955I = B;
        if (!(B == null || (viewTreeObserver = B.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        m34220F();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f26955I;
        if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f26955I = null;
    }

    public boolean onPreDraw() {
        boolean F = m34220F();
        if (F) {
            requestLayout();
        }
        return !F;
    }

    public final void setEdges(EnumSet<C10116m> enumSet) {
        this.f26954H = enumSet;
        m34221G();
    }

    public final void setMode(C10118o oVar) {
        C10457l.m35320e(oVar, "mode");
        this.f26952F = oVar;
        m34221G();
    }
}
