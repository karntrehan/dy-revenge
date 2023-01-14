package com.airbnb.android.react.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.util.Map;
import java.util.WeakHashMap;
import p027c.p064i.p072j.C1988t;
import p174e.p181b.p182a.C5424d;
import p174e.p181b.p182a.C5472r;

class LottieAnimationViewManager extends SimpleViewManager<C5424d> {
    private static final int COMMAND_PAUSE = 3;
    private static final int COMMAND_PLAY = 1;
    private static final int COMMAND_RESET = 2;
    private static final int COMMAND_RESUME = 4;
    private static final String REACT_CLASS = "LottieAnimationView";
    private static final String TAG = "LottieAnimationViewManager";
    private static final int VERSION = 1;
    private Map<C5424d, C2312a> propManagersMap = new WeakHashMap();

    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$a */
    class C2306a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C5424d f6819a;

        C2306a(C5424d dVar) {
            this.f6819a = dVar;
        }

        public void onAnimationCancel(Animator animator) {
            LottieAnimationViewManager.this.sendOnAnimationFinishEvent(this.f6819a, true);
        }

        public void onAnimationEnd(Animator animator) {
            LottieAnimationViewManager.this.sendOnAnimationFinishEvent(this.f6819a, false);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$b */
    class C2307b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ReadableArray f6821f;

        /* renamed from: o */
        final /* synthetic */ C5424d f6822o;

        /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$b$a */
        class C2308a implements View.OnAttachStateChangeListener {
            C2308a() {
            }

            public void onViewAttachedToWindow(View view) {
                C5424d dVar = (C5424d) view;
                dVar.setProgress(0.0f);
                dVar.mo16404s();
                dVar.removeOnAttachStateChangeListener(this);
            }

            public void onViewDetachedFromWindow(View view) {
                C2307b.this.f6822o.removeOnAttachStateChangeListener(this);
            }
        }

        C2307b(ReadableArray readableArray, C5424d dVar) {
            this.f6821f = readableArray;
            this.f6822o = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
            if (r4.f6822o.getSpeed() > 0.0f) goto L_0x0033;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
            if (r4.f6822o.getSpeed() < 0.0f) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                com.facebook.react.bridge.ReadableArray r0 = r4.f6821f
                r1 = 0
                int r0 = r0.getInt(r1)
                com.facebook.react.bridge.ReadableArray r1 = r4.f6821f
                r2 = 1
                int r1 = r1.getInt(r2)
                r2 = -1
                r3 = 0
                if (r0 == r2) goto L_0x0038
                if (r1 == r2) goto L_0x0038
                e.b.a.d r2 = r4.f6822o
                if (r0 <= r1) goto L_0x0026
                r2.mo16441y(r1, r0)
                e.b.a.d r0 = r4.f6822o
                float r0 = r0.getSpeed()
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 <= 0) goto L_0x0038
                goto L_0x0033
            L_0x0026:
                r2.mo16441y(r0, r1)
                e.b.a.d r0 = r4.f6822o
                float r0 = r0.getSpeed()
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 >= 0) goto L_0x0038
            L_0x0033:
                e.b.a.d r0 = r4.f6822o
                r0.mo16437u()
            L_0x0038:
                e.b.a.d r0 = r4.f6822o
                boolean r0 = p027c.p064i.p072j.C1988t.m8359Q(r0)
                if (r0 == 0) goto L_0x004b
                e.b.a.d r0 = r4.f6822o
                r0.setProgress(r3)
                e.b.a.d r0 = r4.f6822o
                r0.mo16404s()
                goto L_0x0055
            L_0x004b:
                e.b.a.d r0 = r4.f6822o
                com.airbnb.android.react.lottie.LottieAnimationViewManager$b$a r1 = new com.airbnb.android.react.lottie.LottieAnimationViewManager$b$a
                r1.<init>()
                r0.addOnAttachStateChangeListener(r1)
            L_0x0055:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.android.react.lottie.LottieAnimationViewManager.C2307b.run():void");
        }
    }

    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$c */
    class C2309c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5424d f6825f;

        C2309c(C5424d dVar) {
            this.f6825f = dVar;
        }

        public void run() {
            if (C1988t.m8359Q(this.f6825f)) {
                this.f6825f.mo16394i();
                this.f6825f.setProgress(0.0f);
            }
        }
    }

    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$d */
    class C2310d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5424d f6827f;

        C2310d(C5424d dVar) {
            this.f6827f = dVar;
        }

        public void run() {
            if (C1988t.m8359Q(this.f6827f)) {
                this.f6827f.mo16403r();
            }
        }
    }

    /* renamed from: com.airbnb.android.react.lottie.LottieAnimationViewManager$e */
    class C2311e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5424d f6829f;

        C2311e(C5424d dVar) {
            this.f6829f = dVar;
        }

        public void run() {
            if (C1988t.m8359Q(this.f6829f)) {
                this.f6829f.mo16436t();
            }
        }
    }

    LottieAnimationViewManager() {
    }

    private C2312a getOrCreatePropertyManager(C5424d dVar) {
        C2312a aVar = this.propManagersMap.get(dVar);
        if (aVar != null) {
            return aVar;
        }
        C2312a aVar2 = new C2312a(dVar);
        this.propManagersMap.put(dVar, aVar2);
        return aVar2;
    }

    /* access modifiers changed from: private */
    public void sendOnAnimationFinishEvent(C5424d dVar, boolean z) {
        ReactContext reactContext;
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isCancelled", z);
        Context context = dVar.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                reactContext = null;
                break;
            } else if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (reactContext != null) {
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(dVar.getId(), "animationFinish", createMap);
        }
    }

    public C5424d createViewInstance(C3031o0 o0Var) {
        C5424d dVar = new C5424d(o0Var);
        dVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        dVar.mo16380g(new C2306a(dVar));
        return dVar;
    }

    public Map<String, Integer> getCommandsMap() {
        return C2693e.m10917g("play", 1, "reset", 2, "pause", 3, "resume", 4);
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        return C2693e.m10911a().mo8815b("animationFinish", C2693e.m10914d("phasedRegistrationNames", C2693e.m10914d("bubbled", "onAnimationFinish"))).mo8814a();
    }

    public Map<String, Object> getExportedViewConstants() {
        return C2693e.m10911a().mo8815b("VERSION", 1).mo8814a();
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C5424d dVar) {
        super.onAfterUpdateTransaction(dVar);
        getOrCreatePropertyManager(dVar).mo7696a();
    }

    public void receiveCommand(C5424d dVar, int i, ReadableArray readableArray) {
        Runnable runnable;
        Handler handler;
        if (i != 1) {
            if (i == 2) {
                handler = new Handler(Looper.getMainLooper());
                runnable = new C2309c(dVar);
            } else if (i == 3) {
                handler = new Handler(Looper.getMainLooper());
                runnable = new C2310d(dVar);
            } else if (i == 4) {
                handler = new Handler(Looper.getMainLooper());
                runnable = new C2311e(dVar);
            } else {
                return;
            }
            handler.post(runnable);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new C2307b(readableArray, dVar));
    }

    @C2991a(name = "cacheComposition")
    public void setCacheComposition(C5424d dVar, boolean z) {
        dVar.setCacheComposition(z);
    }

    @C2991a(name = "colorFilters")
    public void setColorFilters(C5424d dVar, ReadableArray readableArray) {
        getOrCreatePropertyManager(dVar).mo7699d(readableArray);
    }

    @C2991a(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePaths(C5424d dVar, boolean z) {
        getOrCreatePropertyManager(dVar).mo7700e(z);
    }

    @C2991a(name = "imageAssetsFolder")
    public void setImageAssetsFolder(C5424d dVar, String str) {
        getOrCreatePropertyManager(dVar).mo7701f(str);
    }

    @C2991a(name = "loop")
    public void setLoop(C5424d dVar, boolean z) {
        getOrCreatePropertyManager(dVar).mo7702g(z);
    }

    @C2991a(name = "progress")
    public void setProgress(C5424d dVar, float f) {
        getOrCreatePropertyManager(dVar).mo7703h(Float.valueOf(f));
    }

    @C2991a(name = "renderMode")
    public void setRenderMode(C5424d dVar, String str) {
        getOrCreatePropertyManager(dVar).mo7704i("AUTOMATIC".equals(str) ? C5472r.AUTOMATIC : "HARDWARE".equals(str) ? C5472r.HARDWARE : "SOFTWARE".equals(str) ? C5472r.SOFTWARE : null);
    }

    @C2991a(name = "resizeMode")
    public void setResizeMode(C5424d dVar, String str) {
        getOrCreatePropertyManager(dVar).mo7705j("cover".equals(str) ? ImageView.ScaleType.CENTER_CROP : "contain".equals(str) ? ImageView.ScaleType.CENTER_INSIDE : "center".equals(str) ? ImageView.ScaleType.CENTER : null);
    }

    @C2991a(name = "sourceJson")
    public void setSourceJson(C5424d dVar, String str) {
        getOrCreatePropertyManager(dVar).mo7697b(str);
    }

    @C2991a(name = "sourceName")
    public void setSourceName(C5424d dVar, String str) {
        if (!str.contains(".")) {
            str = str + ".json";
        }
        getOrCreatePropertyManager(dVar).mo7698c(str);
    }

    @C2991a(name = "speed")
    public void setSpeed(C5424d dVar, double d) {
        getOrCreatePropertyManager(dVar).mo7706k((float) d);
    }
}
