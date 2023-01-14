package com.swmansion.reanimated.p439i;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C3038r;
import com.swmansion.reanimated.C9917e;
import com.swmansion.reanimated.NativeProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p027c.p064i.p072j.C1912c0;
import p027c.p064i.p072j.C1916d0;
import p027c.p064i.p072j.C1929e0;
import p027c.p064i.p072j.C1984p;
import p027c.p064i.p072j.C1988t;

/* renamed from: com.swmansion.reanimated.i.d */
public class C9925d {

    /* renamed from: a */
    private final WeakReference<ReactApplicationContext> f26548a;

    /* renamed from: b */
    private int f26549b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9926a f26550c;

    /* renamed from: d */
    private final HashMap<Integer, NativeProxy.KeyboardEventDataUpdater> f26551d = new HashMap<>();

    /* renamed from: com.swmansion.reanimated.i.d$a */
    enum C9926a {
        UNKNOWN(0),
        OPENING(1),
        OPEN(2),
        CLOSING(3),
        CLOSED(4);
        

        /* renamed from: t */
        private final int f26558t;

        private C9926a(int i) {
            this.f26558t = i;
        }

        /* renamed from: e */
        public int mo24821e() {
            return this.f26558t;
        }
    }

    /* renamed from: com.swmansion.reanimated.i.d$b */
    private class C9927b extends C1916d0.C1918b {

        /* renamed from: c */
        private int f26559c = 0;

        public C9927b() {
            super(1);
        }

        /* renamed from: b */
        public void mo6465b(C1916d0 d0Var) {
            C9926a unused = C9925d.this.f26550c = this.f26559c == 0 ? C9926a.CLOSED : C9926a.OPEN;
            C9925d.this.m33822m(this.f26559c);
        }

        /* renamed from: d */
        public C1929e0 mo6467d(C1929e0 e0Var, List<C1916d0> list) {
            int a = (int) C3038r.m12004a((float) Math.max(0, e0Var.mo6486f(C1929e0.C1942m.m8149a()).f5458e - e0Var.mo6486f(C1929e0.C1942m.m8153e()).f5458e));
            this.f26559c = a;
            C9925d.this.m33822m(a);
            return e0Var;
        }

        /* renamed from: e */
        public C1916d0.C1917a mo6468e(C1916d0 d0Var, C1916d0.C1917a aVar) {
            C9926a unused = C9925d.this.f26550c = this.f26559c == 0 ? C9926a.OPENING : C9926a.CLOSING;
            C9925d.this.m33822m(this.f26559c);
            return super.mo6468e(d0Var, aVar);
        }
    }

    public C9925d(WeakReference<ReactApplicationContext> weakReference) {
        this.f26548a = weakReference;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m33814c() {
        C1912c0.m8008a(((ReactApplicationContext) this.f26548a.get()).getCurrentActivity().getWindow(), true);
        C1988t.m8334A0(m33815d(), (C1984p) null);
        C1988t.m8346G0(m33815d(), (C1916d0.C1918b) null);
        View findViewById = m33815d().getRootView().findViewById(C9917e.action_bar_root);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    private View m33815d() {
        return ((ReactApplicationContext) this.f26548a.get()).getCurrentActivity().getWindow().getDecorView();
    }

    /* renamed from: g */
    static /* synthetic */ C1929e0 m33818g(View view, View view2, C1929e0 e0Var) {
        int i = e0Var.mo6486f(C1929e0.C1942m.m8151c()).f5458e;
        int i2 = e0Var.mo6486f(C1929e0.C1942m.m8153e()).f5456c;
        View findViewById = view.getRootView().findViewById(C9917e.action_bar_root);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, i2, 0, i);
        findViewById.setLayoutParams(layoutParams);
        return e0Var;
    }

    /* renamed from: h */
    private void m33819h() {
        View d = m33815d();
        new Handler(Looper.getMainLooper()).post(new C9922a(this));
        C1988t.m8346G0(d, (C1916d0.C1918b) null);
    }

    /* renamed from: i */
    private void m33820i() {
        View d = m33815d();
        new Handler(Looper.getMainLooper()).post(new C9923b(this));
        C1988t.m8346G0(d, new C9927b());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m33821j() {
        View d = m33815d();
        C1912c0.m8008a(((ReactApplicationContext) this.f26548a.get()).getCurrentActivity().getWindow(), false);
        C1988t.m8334A0(d, new C9924c(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m33822m(int i) {
        for (NativeProxy.KeyboardEventDataUpdater keyboardEventDataUpdater : this.f26551d.values()) {
            keyboardEventDataUpdater.keyboardEventDataUpdater(this.f26550c.mo24821e(), i);
        }
    }

    /* renamed from: k */
    public int mo24819k(NativeProxy.KeyboardEventDataUpdater keyboardEventDataUpdater) {
        int i = this.f26549b;
        this.f26549b = i + 1;
        if (this.f26551d.isEmpty()) {
            m33820i();
        }
        this.f26551d.put(Integer.valueOf(i), keyboardEventDataUpdater);
        return i;
    }

    /* renamed from: l */
    public void mo24820l(int i) {
        this.f26551d.remove(Integer.valueOf(i));
        if (this.f26551d.isEmpty()) {
            m33819h();
        }
    }
}
