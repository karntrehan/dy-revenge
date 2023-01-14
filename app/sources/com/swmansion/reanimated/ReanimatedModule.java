package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C3022n;
import com.facebook.react.uimanager.C3039r0;
import com.facebook.react.uimanager.C3057x0;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.reanimated.p441k.C9935c;
import java.util.ArrayList;
import java.util.Iterator;

@C2639a(name = "ReanimatedModule")
public class ReanimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, C3057x0 {
    public static final String NAME = "ReanimatedModule";
    private C9911d mNodesManager;
    private ArrayList<C9905l> mOperations = new ArrayList<>();
    private C9935c mTransitionManager;
    private UIManagerModule mUIManager;

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$a */
    class C9894a implements C9905l {

        /* renamed from: a */
        final /* synthetic */ int f26467a;

        /* renamed from: b */
        final /* synthetic */ Callback f26468b;

        C9894a(int i, Callback callback) {
            this.f26467a = i;
            this.f26468b = callback;
        }

        /* renamed from: a */
        public void mo24782a(C9911d dVar) {
            dVar.mo24814w(this.f26467a, this.f26468b);
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$b */
    class C9895b implements C9905l {

        /* renamed from: a */
        final /* synthetic */ int f26470a;

        /* renamed from: b */
        final /* synthetic */ Double f26471b;

        C9895b(int i, Double d) {
            this.f26470a = i;
            this.f26471b = d;
        }

        /* renamed from: a */
        public void mo24782a(C9911d dVar) {
            dVar.mo24796M(this.f26470a, this.f26471b);
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$c */
    class C9896c implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ ArrayList f26473a;

        C9896c(ArrayList arrayList) {
            this.f26473a = arrayList;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            C9911d nodesManager = ReanimatedModule.this.getNodesManager();
            Iterator it = this.f26473a.iterator();
            while (it.hasNext()) {
                ((C9905l) it.next()).mo24782a(nodesManager);
            }
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$d */
    class C9897d implements C9905l {

        /* renamed from: a */
        final /* synthetic */ int f26475a;

        /* renamed from: b */
        final /* synthetic */ ReadableMap f26476b;

        C9897d(int i, ReadableMap readableMap) {
            this.f26475a = i;
            this.f26476b = readableMap;
        }

        /* renamed from: a */
        public void mo24782a(C9911d dVar) {
            dVar.mo24803l(this.f26475a, this.f26476b);
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$e */
    class C9898e implements C9905l {

        /* renamed from: a */
        final /* synthetic */ int f26478a;

        C9898e(int i) {
            this.f26478a = i;
        }

        /* renamed from: a */
        public void mo24782a(C9911d dVar) {
            dVar.mo24807p(this.f26478a);
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$f */
    class C9899f implements C9905l {

        /* renamed from: a */
        final /* synthetic */ int f26480a;

        /* renamed from: b */
        final /* synthetic */ int f26481b;

        C9899f(int i, int i2) {
            this.f26480a = i;
            this.f26481b = i2;
        }

        /* renamed from: a */
        public void mo24782a(C9911d dVar) {
            dVar.mo24802i(this.f26480a, this.f26481b);
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$g */
    class C9900g implements C9905l {

        /* renamed from: a */
        final /* synthetic */ int f26483a;

        /* renamed from: b */
        final /* synthetic */ int f26484b;

        C9900g(int i, int i2) {
            this.f26483a = i;
            this.f26484b = i2;
        }

        /* renamed from: a */
        public void mo24782a(C9911d dVar) {
            dVar.mo24806o(this.f26483a, this.f26484b);
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$h */
    class C9901h implements C9905l {

        /* renamed from: a */
        final /* synthetic */ int f26486a;

        /* renamed from: b */
        final /* synthetic */ int f26487b;

        C9901h(int i, int i2) {
            this.f26486a = i;
            this.f26487b = i2;
        }

        /* renamed from: a */
        public void mo24782a(C9911d dVar) {
            dVar.mo24801h(this.f26486a, this.f26487b);
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$i */
    class C9902i implements C9905l {

        /* renamed from: a */
        final /* synthetic */ int f26489a;

        /* renamed from: b */
        final /* synthetic */ int f26490b;

        C9902i(int i, int i2) {
            this.f26489a = i;
            this.f26490b = i2;
        }

        /* renamed from: a */
        public void mo24782a(C9911d dVar) {
            dVar.mo24805n(this.f26489a, this.f26490b);
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$j */
    class C9903j implements C9905l {

        /* renamed from: a */
        final /* synthetic */ int f26492a;

        /* renamed from: b */
        final /* synthetic */ String f26493b;

        /* renamed from: c */
        final /* synthetic */ int f26494c;

        C9903j(int i, String str, int i2) {
            this.f26492a = i;
            this.f26493b = str;
            this.f26494c = i2;
        }

        /* renamed from: a */
        public void mo24782a(C9911d dVar) {
            dVar.mo24799f(this.f26492a, this.f26493b, this.f26494c);
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$k */
    class C9904k implements C9905l {

        /* renamed from: a */
        final /* synthetic */ int f26496a;

        /* renamed from: b */
        final /* synthetic */ String f26497b;

        /* renamed from: c */
        final /* synthetic */ int f26498c;

        C9904k(int i, String str, int i2) {
            this.f26496a = i;
            this.f26497b = str;
            this.f26498c = i2;
        }

        /* renamed from: a */
        public void mo24782a(C9911d dVar) {
            dVar.mo24804m(this.f26496a, this.f26497b, this.f26498c);
        }
    }

    /* renamed from: com.swmansion.reanimated.ReanimatedModule$l */
    private interface C9905l {
        /* renamed from: a */
        void mo24782a(C9911d dVar);
    }

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void animateNextTransition(int i, ReadableMap readableMap) {
        this.mTransitionManager.mo24829a(i, readableMap);
    }

    @ReactMethod
    public void attachEvent(int i, String str, int i2) {
        this.mOperations.add(new C9903j(i, str, i2));
    }

    @ReactMethod
    public void connectNodeToView(int i, int i2) {
        this.mOperations.add(new C9901h(i, i2));
    }

    @ReactMethod
    public void connectNodes(int i, int i2) {
        this.mOperations.add(new C9899f(i, i2));
    }

    @ReactMethod
    public void createNode(int i, ReadableMap readableMap) {
        this.mOperations.add(new C9897d(i, readableMap));
    }

    @ReactMethod
    public void detachEvent(int i, String str, int i2) {
        this.mOperations.add(new C9904k(i, str, i2));
    }

    @ReactMethod
    public void disconnectNodeFromView(int i, int i2) {
        this.mOperations.add(new C9902i(i, i2));
    }

    @ReactMethod
    public void disconnectNodes(int i, int i2) {
        this.mOperations.add(new C9900g(i, i2));
    }

    @ReactMethod
    public void dropNode(int i) {
        this.mOperations.add(new C9898e(i));
    }

    public String getName() {
        return NAME;
    }

    public C9911d getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new C9911d(getReactApplicationContext());
        }
        return this.mNodesManager;
    }

    @ReactMethod
    public void getValue(int i, Callback callback) {
        this.mOperations.add(new C9894a(i, callback));
    }

    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
        reactApplicationContext.addLifecycleEventListener(this);
        uIManagerModule.addUIManagerListener(this);
        this.mTransitionManager = new C9935c(uIManagerModule);
        this.mUIManager = uIManagerModule;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void installTurboModule() {
        boolean z = getReactApplicationContext().getJavaScriptContextHolder().get() == 0;
        C9921h.f26544a = z;
        if (!z) {
            getNodesManager().mo24815z(getReactApplicationContext());
        } else {
            Log.w("[REANIMATED]", "Unable to create Reanimated Native Module. You can ignore this message if you are using Chrome Debugger now.");
        }
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        C9911d dVar = this.mNodesManager;
        if (dVar != null) {
            dVar.mo24788D();
        }
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        C9911d dVar = this.mNodesManager;
        if (dVar != null) {
            dVar.mo24789E();
        }
    }

    public void onHostResume() {
        C9911d dVar = this.mNodesManager;
        if (dVar != null) {
            dVar.mo24790F();
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setValue(int i, Double d) {
        this.mOperations.add(new C9895b(i, d));
    }

    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (!this.mOperations.isEmpty()) {
            ArrayList<C9905l> arrayList = this.mOperations;
            this.mOperations = new ArrayList<>();
            uIManagerModule.addUIBlock(new C9896c(arrayList));
        }
    }
}
