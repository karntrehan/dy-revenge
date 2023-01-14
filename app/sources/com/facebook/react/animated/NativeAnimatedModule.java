package com.facebook.react.animated;

import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.C2804g;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C2961f;
import com.facebook.react.uimanager.C3022n;
import com.facebook.react.uimanager.C3039r0;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.p121k1.C2996a;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p174e.p247e.p315l.p316a.C6409a;

@C2639a(name = "NativeAnimatedModule")
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    public static final String NAME = "NativeAnimatedModule";
    /* access modifiers changed from: private */
    public final C2961f mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS = false;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    private boolean mInitializedForFabric = false;
    private boolean mInitializedForNonFabric = false;
    private final AtomicReference<C2621l> mNodesManager = new AtomicReference<>();
    private int mNumFabricAnimations = 0;
    private int mNumNonFabricAnimations = 0;
    /* access modifiers changed from: private */
    public final ConcurrentLinkedQueue<C2609w> mOperations = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */
    public final ConcurrentLinkedQueue<C2609w> mPreOperations = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */
    public final C2804g mReactChoreographer = C2804g.m11194i();
    private int mUIManagerType = 1;

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$a */
    class C2587a extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7594c;

        /* renamed from: d */
        final /* synthetic */ double f7595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2587a(int i, double d) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7594c = i;
            this.f7595d = d;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8449w(this.f7594c, this.f7595d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$b */
    class C2588b extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7597c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2588b(int i) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7597c = i;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8441n(this.f7597c);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$c */
    class C2589c extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7599c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2589c(int i) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7599c = i;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8440m(this.f7599c);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$d */
    class C2590d extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7601c;

        /* renamed from: d */
        final /* synthetic */ int f7602d;

        /* renamed from: e */
        final /* synthetic */ ReadableMap f7603e;

        /* renamed from: f */
        final /* synthetic */ Callback f7604f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2590d(int i, int i2, ReadableMap readableMap, Callback callback) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7601c = i;
            this.f7602d = i2;
            this.f7603e = readableMap;
            this.f7604f = callback;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8451y(this.f7601c, this.f7602d, this.f7603e, this.f7604f);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$e */
    class C2591e extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7606c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2591e(int i) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7606c = i;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8430A(this.f7606c);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$f */
    class C2592f extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7608c;

        /* renamed from: d */
        final /* synthetic */ int f7609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2592f(int i, int i2) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7608c = i;
            this.f7609d = i2;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8435h(this.f7608c, this.f7609d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$g */
    class C2593g extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7611c;

        /* renamed from: d */
        final /* synthetic */ int f7612d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2593g(int i, int i2) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7611c = i;
            this.f7612d = i2;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8438k(this.f7611c, this.f7612d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$h */
    class C2594h extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7614c;

        /* renamed from: d */
        final /* synthetic */ int f7615d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2594h(int i, int i2) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7614c = i;
            this.f7615d = i2;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8434g(this.f7614c, this.f7615d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$i */
    class C2595i extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7617c;

        /* renamed from: d */
        final /* synthetic */ int f7618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2595i(int i, int i2) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7617c = i;
            this.f7618d = i2;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8437j(this.f7617c, this.f7618d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$j */
    class C2596j extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7620c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2596j(int i) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7620c = i;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8447u(this.f7620c);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$k */
    class C2597k extends C2961f {
        C2597k(ReactContext reactContext) {
            super(reactContext);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo8416c(long j) {
            try {
                C2621l access$000 = NativeAnimatedModule.this.getNodesManager();
                if (access$000 != null && access$000.mo8444r()) {
                    access$000.mo8448v(j);
                }
                if (access$000 != null || NativeAnimatedModule.this.mReactChoreographer != null) {
                    ((C2804g) C6409a.m24521c(NativeAnimatedModule.this.mReactChoreographer)).mo9151m(C2804g.C2807c.NATIVE_ANIMATED_MODULE, NativeAnimatedModule.this.mAnimatedFrameCallback);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$l */
    class C2598l extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7623c;

        /* renamed from: d */
        final /* synthetic */ String f7624d;

        /* renamed from: e */
        final /* synthetic */ ReadableMap f7625e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2598l(int i, String str, ReadableMap readableMap) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7623c = i;
            this.f7624d = str;
            this.f7625e = readableMap;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8433f(this.f7623c, this.f7624d, this.f7625e);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$m */
    class C2599m extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7627c;

        /* renamed from: d */
        final /* synthetic */ String f7628d;

        /* renamed from: e */
        final /* synthetic */ int f7629e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2599m(int i, String str, int i2) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7627c = i;
            this.f7628d = str;
            this.f7629e = i2;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8446t(this.f7627c, this.f7628d, this.f7629e);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$n */
    class C2600n extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7631c;

        /* renamed from: d */
        final /* synthetic */ Callback f7632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2600n(int i, Callback callback) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7631c = i;
            this.f7632d = callback;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8443p(this.f7631c, this.f7632d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$o */
    class C2601o implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ long f7634a;

        C2601o(long j) {
            this.f7634a = j;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            NativeAnimatedModule nativeAnimatedModule = NativeAnimatedModule.this;
            nativeAnimatedModule.executeAllOperations(nativeAnimatedModule.mPreOperations, this.f7634a);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$p */
    class C2602p implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ long f7636a;

        C2602p(long j) {
            this.f7636a = j;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            NativeAnimatedModule nativeAnimatedModule = NativeAnimatedModule.this;
            nativeAnimatedModule.executeAllOperations(nativeAnimatedModule.mOperations, this.f7636a);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$q */
    class C2603q extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7638c;

        /* renamed from: d */
        final /* synthetic */ ReadableMap f7639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2603q(int i, ReadableMap readableMap) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7638c = i;
            this.f7639d = readableMap;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8436i(this.f7638c, this.f7639d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$r */
    class C2604r implements C2612c {

        /* renamed from: a */
        final /* synthetic */ int f7641a;

        C2604r(int i) {
            this.f7641a = i;
        }

        /* renamed from: a */
        public void mo8418a(double d) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("tag", this.f7641a);
            createMap.putDouble("value", d);
            ReactApplicationContext access$700 = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (access$700 != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) access$700.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", createMap);
            }
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$s */
    class C2605s extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7643c;

        /* renamed from: d */
        final /* synthetic */ C2612c f7644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2605s(int i, C2612c cVar) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7643c = i;
            this.f7644d = cVar;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8452z(this.f7643c, this.f7644d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$t */
    class C2606t extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7646c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2606t(int i) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7646c = i;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8431C(this.f7646c);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$u */
    class C2607u extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7648c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2607u(int i) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7648c = i;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8439l(this.f7648c);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$v */
    class C2608v extends C2609w {

        /* renamed from: c */
        final /* synthetic */ int f7650c;

        /* renamed from: d */
        final /* synthetic */ double f7651d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2608v(int i, double d) {
            super(NativeAnimatedModule.this, (C2597k) null);
            this.f7650c = i;
            this.f7651d = d;
        }

        /* renamed from: a */
        public void mo8415a(C2621l lVar) {
            lVar.mo8450x(this.f7650c, this.f7651d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$w */
    private abstract class C2609w {

        /* renamed from: a */
        long f7653a;

        private C2609w() {
            this.f7653a = -1;
        }

        /* synthetic */ C2609w(NativeAnimatedModule nativeAnimatedModule, C2597k kVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo8415a(C2621l lVar);

        /* renamed from: b */
        public long mo8419b() {
            return this.f7653a;
        }

        /* renamed from: c */
        public void mo8420c(long j) {
            this.f7653a = j;
        }
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mAnimatedFrameCallback = new C2597k(reactApplicationContext);
    }

    private void addOperation(C2609w wVar) {
        wVar.mo8420c(this.mCurrentBatchNumber);
        this.mOperations.add(wVar);
    }

    private void addPreOperation(C2609w wVar) {
        wVar.mo8420c(this.mCurrentBatchNumber);
        this.mPreOperations.add(wVar);
    }

    private void addUnbatchedOperation(C2609w wVar) {
        wVar.mo8420c(-1);
        this.mOperations.add(wVar);
    }

    private void clearFrameCallback() {
        ((C2804g) C6409a.m24521c(this.mReactChoreographer)).mo9152o(C2804g.C2807c.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    private void decrementInFlightAnimationsForViewTag(int i) {
        if (C2996a.m11878a(i) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i2 = this.mNumNonFabricAnimations;
        if (i2 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else if (this.mNumFabricAnimations == 0 && i2 > 0 && this.mUIManagerType != 1) {
            this.mUIManagerType = 1;
        }
    }

    private void enqueueFrameCallback() {
        ((C2804g) C6409a.m24521c(this.mReactChoreographer)).mo9151m(C2804g.C2807c.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    /* access modifiers changed from: private */
    public void executeAllOperations(Queue<C2609w> queue, long j) {
        C2609w poll;
        C2621l nodesManager = getNodesManager();
        while (true) {
            C2609w peek = queue.peek();
            if (peek != null && peek.mo8419b() <= j && (poll = queue.poll()) != null) {
                poll.mo8415a(nodesManager);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public C2621l getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            this.mNodesManager.compareAndSet((Object) null, new C2621l(reactApplicationContextIfActiveOrWarn));
        }
        return this.mNodesManager.get();
    }

    private void initializeLifecycleEventListenersForViewTag(int i) {
        ReactApplicationContext reactApplicationContext;
        UIManager f;
        int a = C2996a.m11878a(i);
        this.mUIManagerType = a;
        if (a == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        C2621l nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.mo8445s(this.mUIManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException(NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mInitializedForFabric && this.mUIManagerType == 2) {
            return;
        }
        if ((!this.mInitializedForNonFabric || this.mUIManagerType != 1) && (reactApplicationContext = getReactApplicationContext()) != null && (f = C3051u0.m12089f(reactApplicationContext, this.mUIManagerType)) != null) {
            f.addUIManagerEventListener(this);
            if (this.mUIManagerType == 2) {
                this.mInitializedForFabric = true;
            } else {
                this.mInitializedForNonFabric = true;
            }
        }
    }

    public void addAnimatedEventToView(double d, String str, ReadableMap readableMap) {
        int i = (int) d;
        initializeLifecycleEventListenersForViewTag(i);
        addOperation(new C2598l(i, str, readableMap));
    }

    public void addListener(String str) {
    }

    public void connectAnimatedNodeToView(double d, double d2) {
        int i = (int) d2;
        initializeLifecycleEventListenersForViewTag(i);
        addOperation(new C2594h((int) d, i));
    }

    public void connectAnimatedNodes(double d, double d2) {
        addOperation(new C2592f((int) d, (int) d2));
    }

    public void createAnimatedNode(double d, ReadableMap readableMap) {
        addOperation(new C2603q((int) d, readableMap));
    }

    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType == 2) {
            long j = this.mCurrentBatchNumber - 1;
            if (!this.mBatchingControlledByJS) {
                this.mCurrentFrameNumber++;
                if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                    this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                    j = this.mCurrentBatchNumber;
                }
            }
            executeAllOperations(this.mPreOperations, j);
            executeAllOperations(this.mOperations, j);
        }
    }

    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    public void disconnectAnimatedNodeFromView(double d, double d2) {
        int i = (int) d2;
        decrementInFlightAnimationsForViewTag(i);
        addOperation(new C2595i((int) d, i));
    }

    public void disconnectAnimatedNodes(double d, double d2) {
        addOperation(new C2593g((int) d, (int) d2));
    }

    public void dropAnimatedNode(double d) {
        addOperation(new C2607u((int) d));
    }

    public void extractAnimatedNodeOffset(double d) {
        addOperation(new C2589c((int) d));
    }

    public void finishOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    public void flattenAnimatedNodeOffset(double d) {
        addOperation(new C2588b((int) d));
    }

    public String getName() {
        return NAME;
    }

    public void getValue(double d, Callback callback) {
        addOperation(new C2600n((int) d, callback));
    }

    public void initialize() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.addLifecycleEventListener(this);
        }
    }

    public void invalidate() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.removeLifecycleEventListener(this);
        }
    }

    public void onHostDestroy() {
        clearFrameCallback();
    }

    public void onHostPause() {
        clearFrameCallback();
    }

    public void onHostResume() {
        enqueueFrameCallback();
    }

    public void removeAnimatedEventFromView(double d, String str, double d2) {
        int i = (int) d;
        decrementInFlightAnimationsForViewTag(i);
        addOperation(new C2599m(i, str, (int) d2));
    }

    public void removeListeners(double d) {
    }

    public void restoreDefaultValues(double d) {
        addPreOperation(new C2596j((int) d));
    }

    public void setAnimatedNodeOffset(double d, double d2) {
        addOperation(new C2587a((int) d, d2));
    }

    public void setAnimatedNodeValue(double d, double d2) {
        addOperation(new C2608v((int) d, d2));
    }

    public void setNodesManager(C2621l lVar) {
        this.mNodesManager.set(lVar);
    }

    public void startAnimatingNode(double d, double d2, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new C2590d((int) d, (int) d2, readableMap, callback));
    }

    public void startListeningToAnimatedNodeValue(double d) {
        int i = (int) d;
        addOperation(new C2605s(i, new C2604r(i)));
    }

    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    public void stopAnimation(double d) {
        addOperation(new C2591e((int) d));
    }

    public void stopListeningToAnimatedNodeValue(double d) {
        addOperation(new C2606t((int) d));
    }

    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((!this.mOperations.isEmpty() || !this.mPreOperations.isEmpty()) && this.mUIManagerType != 2) {
            long j = this.mCurrentBatchNumber;
            this.mCurrentBatchNumber = 1 + j;
            C2601o oVar = new C2601o(j);
            C2602p pVar = new C2602p(j);
            UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
            uIManagerModule.prependUIBlock(oVar);
            uIManagerModule.addUIBlock(pVar);
        }
    }
}
