package com.facebook.react.uimanager.p123m1;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.uimanager.m1.e */
public class C3007e {

    /* renamed from: a */
    private static Handler f8357a;

    /* renamed from: b */
    private final C3002a f8358b = new C3014h();

    /* renamed from: c */
    private final C3002a f8359c = new C3017k();

    /* renamed from: d */
    private final C3002a f8360d = new C3015i();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SparseArray<C3016j> f8361e = new SparseArray<>(0);

    /* renamed from: f */
    private boolean f8362f;

    /* renamed from: g */
    private long f8363g = -1;

    /* renamed from: h */
    private Runnable f8364h;

    /* renamed from: com.facebook.react.uimanager.m1.e$a */
    class C3008a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Callback f8365f;

        C3008a(Callback callback) {
            this.f8365f = callback;
        }

        public void run() {
            this.f8365f.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: com.facebook.react.uimanager.m1.e$b */
    class C3009b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ int f8367a;

        C3009b(int i) {
            this.f8367a = i;
        }

        public void onAnimationEnd(Animation animation) {
            C3007e.this.f8361e.remove(this.f8367a);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            C3007e.this.f8361e.put(this.f8367a, (C3016j) animation);
        }
    }

    /* renamed from: com.facebook.react.uimanager.m1.e$c */
    class C3010c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C3011f f8369a;

        C3010c(C3011f fVar) {
            this.f8369a = fVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f8369a.mo9756a();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: d */
    private void m11907d(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m11907d(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: g */
    private void m11908g(long j) {
        if (f8357a == null) {
            f8357a = new Handler(Looper.getMainLooper());
        }
        Runnable runnable = this.f8364h;
        if (runnable != null) {
            f8357a.removeCallbacks(runnable);
            f8357a.postDelayed(this.f8364h, j);
        }
    }

    /* renamed from: b */
    public void mo9744b(View view, int i, int i2, int i3, int i4) {
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        C3016j jVar = this.f8361e.get(id);
        if (jVar != null) {
            jVar.mo9757c(i, i2, i3, i4);
            return;
        }
        Animation a = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.f8358b : this.f8359c).mo9738a(view, i, i2, i3, i4);
        if (a instanceof C3016j) {
            a.setAnimationListener(new C3009b(id));
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
        if (a != null) {
            long duration = a.getDuration();
            if (duration > this.f8363g) {
                this.f8363g = duration;
                m11908g(duration);
            }
            view.startAnimation(a);
        }
    }

    /* renamed from: c */
    public void mo9745c(View view, C3011f fVar) {
        UiThreadUtil.assertOnUiThread();
        Animation a = this.f8360d.mo9738a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (a != null) {
            m11907d(view);
            a.setAnimationListener(new C3010c(fVar));
            long duration = a.getDuration();
            if (duration > this.f8363g) {
                m11908g(duration);
                this.f8363g = duration;
            }
            view.startAnimation(a);
            return;
        }
        fVar.mo9756a();
    }

    /* renamed from: e */
    public void mo9746e(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            mo9747f();
            return;
        }
        int i = 0;
        this.f8362f = false;
        if (readableMap.hasKey("duration")) {
            i = readableMap.getInt("duration");
        }
        C3012g gVar = C3012g.CREATE;
        if (readableMap.hasKey(C3012g.m11915e(gVar))) {
            this.f8358b.mo9740d(readableMap.getMap(C3012g.m11915e(gVar)), i);
            this.f8362f = true;
        }
        C3012g gVar2 = C3012g.UPDATE;
        if (readableMap.hasKey(C3012g.m11915e(gVar2))) {
            this.f8359c.mo9740d(readableMap.getMap(C3012g.m11915e(gVar2)), i);
            this.f8362f = true;
        }
        C3012g gVar3 = C3012g.DELETE;
        if (readableMap.hasKey(C3012g.m11915e(gVar3))) {
            this.f8360d.mo9740d(readableMap.getMap(C3012g.m11915e(gVar3)), i);
            this.f8362f = true;
        }
        if (this.f8362f && callback != null) {
            this.f8364h = new C3008a(callback);
        }
    }

    /* renamed from: f */
    public void mo9747f() {
        this.f8358b.mo9742f();
        this.f8359c.mo9742f();
        this.f8360d.mo9742f();
        this.f8364h = null;
        this.f8362f = false;
        this.f8363g = -1;
    }

    /* renamed from: h */
    public boolean mo9748h(View view) {
        if (view == null) {
            return false;
        }
        return (this.f8362f && view.getParent() != null) || this.f8361e.get(view.getId()) != null;
    }
}
