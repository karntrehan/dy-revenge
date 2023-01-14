package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.modules.core.a */
public class C2790a {

    /* renamed from: a */
    private static C2790a f7876a;

    /* renamed from: b */
    private Choreographer f7877b = m11140c();

    /* renamed from: com.facebook.react.modules.core.a$a */
    public static abstract class C2791a {

        /* renamed from: a */
        private Choreographer.FrameCallback f7878a;

        /* renamed from: com.facebook.react.modules.core.a$a$a */
        class C2792a implements Choreographer.FrameCallback {
            C2792a() {
            }

            public void doFrame(long j) {
                C2791a.this.mo9129a(j);
            }
        }

        /* renamed from: a */
        public abstract void mo9129a(long j);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Choreographer.FrameCallback mo9130b() {
            if (this.f7878a == null) {
                this.f7878a = new C2792a();
            }
            return this.f7878a;
        }
    }

    private C2790a() {
    }

    /* renamed from: a */
    private void m11138a(Choreographer.FrameCallback frameCallback) {
        this.f7877b.postFrameCallback(frameCallback);
    }

    /* renamed from: b */
    private void m11139b(Choreographer.FrameCallback frameCallback) {
        this.f7877b.removeFrameCallback(frameCallback);
    }

    /* renamed from: c */
    private Choreographer m11140c() {
        return Choreographer.getInstance();
    }

    /* renamed from: d */
    public static C2790a m11141d() {
        UiThreadUtil.assertOnUiThread();
        if (f7876a == null) {
            f7876a = new C2790a();
        }
        return f7876a;
    }

    /* renamed from: e */
    public void mo9127e(C2791a aVar) {
        m11138a(aVar.mo9130b());
    }

    /* renamed from: f */
    public void mo9128f(C2791a aVar) {
        m11139b(aVar.mo9130b());
    }
}
