package com.swmansion.reanimated;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.C2804g;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.C2931d0;
import com.facebook.react.uimanager.C2961f;
import com.facebook.react.uimanager.C2962f0;
import com.facebook.react.uimanager.C2981h;
import com.facebook.react.uimanager.C3041s0;
import com.facebook.react.uimanager.C3059y0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.C2952f;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.layoutReanimation.C9941d;
import com.swmansion.reanimated.nodes.C10003p;
import com.swmansion.reanimated.nodes.C10004q;
import com.swmansion.reanimated.nodes.C10006r;
import com.swmansion.reanimated.nodes.C10007s;
import com.swmansion.reanimated.nodes.C10008t;
import com.swmansion.reanimated.nodes.C10013u;
import com.swmansion.reanimated.nodes.C9949a;
import com.swmansion.reanimated.nodes.C9950b;
import com.swmansion.reanimated.nodes.C9952c;
import com.swmansion.reanimated.nodes.C9953d;
import com.swmansion.reanimated.nodes.C9954e;
import com.swmansion.reanimated.nodes.C9955f;
import com.swmansion.reanimated.nodes.C9959g;
import com.swmansion.reanimated.nodes.C9960h;
import com.swmansion.reanimated.nodes.C9961i;
import com.swmansion.reanimated.nodes.C9963k;
import com.swmansion.reanimated.nodes.C9964l;
import com.swmansion.reanimated.nodes.C9965m;
import com.swmansion.reanimated.nodes.C9966n;
import com.swmansion.reanimated.nodes.C9967o;
import com.swmansion.reanimated.nodes.EventNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.swmansion.reanimated.d */
public class C9911d implements C2952f {

    /* renamed from: a */
    private static final Double f26506a = Double.valueOf(0.0d);

    /* renamed from: b */
    private C9941d f26507b = null;

    /* renamed from: c */
    private final SparseArray<C9965m> f26508c = new SparseArray<>();

    /* renamed from: d */
    private final Map<String, EventNode> f26509d = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3041s0 f26510e;

    /* renamed from: f */
    private final DeviceEventManagerModule.RCTDeviceEventEmitter f26511f;

    /* renamed from: g */
    private final C2804g f26512g;

    /* renamed from: h */
    private final C2961f f26513h;

    /* renamed from: i */
    protected final UIManagerModule.C2916d f26514i;

    /* renamed from: j */
    private final AtomicBoolean f26515j = new AtomicBoolean();

    /* renamed from: k */
    private final C9966n f26516k;

    /* renamed from: l */
    private final ReactContext f26517l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final UIManagerModule f26518m;

    /* renamed from: n */
    private RCTEventEmitter f26519n;

    /* renamed from: o */
    private List<C9916e> f26520o = new ArrayList();

    /* renamed from: p */
    private ConcurrentLinkedQueue<CopiedEvent> f26521p = new ConcurrentLinkedQueue<>();

    /* renamed from: q */
    private boolean f26522q;

    /* renamed from: r */
    public double f26523r;

    /* renamed from: s */
    public final C9920g f26524s;

    /* renamed from: t */
    public Set<String> f26525t = Collections.emptySet();

    /* renamed from: u */
    public Set<String> f26526u = Collections.emptySet();

    /* renamed from: v */
    private NativeProxy f26527v;

    /* renamed from: w */
    private Queue<C9915d> f26528w = new LinkedList();

    /* renamed from: x */
    private boolean f26529x = false;

    /* renamed from: com.swmansion.reanimated.d$a */
    class C9912a extends C2961f {
        C9912a(ReactContext reactContext) {
            super(reactContext);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo8416c(long j) {
            C9911d.this.m33761C(j);
        }
    }

    /* renamed from: com.swmansion.reanimated.d$b */
    class C9913b extends GuardedRunnable {

        /* renamed from: f */
        final /* synthetic */ boolean f26531f;

        /* renamed from: o */
        final /* synthetic */ Semaphore f26532o;

        /* renamed from: p */
        final /* synthetic */ Queue f26533p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9913b(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, boolean z, Semaphore semaphore, Queue queue) {
            super(nativeModuleCallExceptionHandler);
            this.f26531f = z;
            this.f26532o = semaphore;
            this.f26533p = queue;
        }

        public void runGuarded() {
            boolean a = C3059y0.m12105a(C9911d.this.f26510e);
            boolean z = this.f26531f && a;
            if (!z) {
                this.f26532o.release();
            }
            while (!this.f26533p.isEmpty()) {
                C9915d dVar = (C9915d) this.f26533p.remove();
                C2931d0 R = C9911d.this.f26510e.mo9825R(dVar.f26536a);
                if (R != null) {
                    C9911d.this.f26518m.updateView(dVar.f26536a, R.mo9512O(), dVar.f26537b);
                }
            }
            if (a) {
                C9911d.this.f26510e.mo9852n(-1);
            }
            if (z) {
                this.f26532o.release();
            }
        }
    }

    /* renamed from: com.swmansion.reanimated.d$c */
    static /* synthetic */ class C9914c {

        /* renamed from: a */
        static final /* synthetic */ int[] f26535a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26535a = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26535a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26535a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26535a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26535a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26535a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.reanimated.C9911d.C9914c.<clinit>():void");
        }
    }

    /* renamed from: com.swmansion.reanimated.d$d */
    private final class C9915d {

        /* renamed from: a */
        public int f26536a;

        /* renamed from: b */
        public WritableMap f26537b;

        public C9915d(int i, WritableMap writableMap) {
            this.f26536a = i;
            this.f26537b = writableMap;
        }
    }

    /* renamed from: com.swmansion.reanimated.d$e */
    public interface C9916e {
        void onAnimationFrame(double d);
    }

    public C9911d(ReactContext reactContext) {
        this.f26517l = reactContext;
        UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.f26518m = uIManagerModule;
        this.f26524s = new C9920g();
        C3041s0 uIImplementation = uIManagerModule.getUIImplementation();
        this.f26510e = uIImplementation;
        this.f26514i = uIManagerModule.getDirectEventNamesResolver();
        this.f26511f = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.f26512g = C2804g.m11194i();
        this.f26513h = new C9912a(reactContext);
        this.f26516k = new C9966n(this);
        uIManagerModule.getEventDispatcher().mo9650b(this);
        this.f26507b = new C9941d(reactContext, uIImplementation, uIManagerModule);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m33761C(long j) {
        this.f26523r = ((double) j) / 1000000.0d;
        while (!this.f26521p.isEmpty()) {
            CopiedEvent poll = this.f26521p.poll();
            m33770x(poll.mo24755f(), poll.mo24753d(), poll.mo24754e());
        }
        if (!this.f26520o.isEmpty()) {
            List<C9916e> list = this.f26520o;
            this.f26520o = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).onAnimationFrame(this.f26523r);
            }
        }
        if (this.f26522q) {
            C9965m.runUpdates(this.f26524s);
        }
        m33762G();
        this.f26515j.set(false);
        this.f26522q = false;
        if (!this.f26520o.isEmpty() || !this.f26521p.isEmpty()) {
            mo24797N();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|5|6|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x002f A[LOOP:0: B:4:0x002f->B:5:?, LOOP_START, SYNTHETIC, Splitter:B:4:0x002f] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33762G() {
        /*
            r10 = this;
            java.util.Queue<com.swmansion.reanimated.d$d> r0 = r10.f26528w
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0032
            java.util.Queue<com.swmansion.reanimated.d$d> r6 = r10.f26528w
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r10.f26528w = r0
            boolean r0 = r10.f26529x
            r1 = 0
            r10.f26529x = r1
            java.util.concurrent.Semaphore r7 = new java.util.concurrent.Semaphore
            r7.<init>(r1)
            com.facebook.react.bridge.ReactContext r8 = r10.f26517l
            com.swmansion.reanimated.d$b r9 = new com.swmansion.reanimated.d$b
            com.facebook.react.bridge.NativeModuleCallExceptionHandler r3 = r8.getExceptionHandler()
            r1 = r9
            r2 = r10
            r4 = r0
            r5 = r7
            r1.<init>(r3, r4, r5, r6)
            r8.runOnNativeModulesQueueThread(r9)
            if (r0 == 0) goto L_0x0032
        L_0x002f:
            r7.acquire()     // Catch:{ InterruptedException -> 0x002f }
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.reanimated.C9911d.m33762G():void");
    }

    /* renamed from: O */
    private void m33763O() {
        if (this.f26515j.getAndSet(false)) {
            this.f26512g.mo9152o(C2804g.C2807c.NATIVE_ANIMATED_MODULE, this.f26513h);
        }
    }

    /* renamed from: e */
    private static void m33767e(WritableMap writableMap, String str, Object obj) {
        double doubleValue;
        if (obj == null) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof Double) {
            doubleValue = ((Double) obj).doubleValue();
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        } else if (obj instanceof Number) {
            doubleValue = ((Number) obj).doubleValue();
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        } else if (obj instanceof ReadableArray) {
            boolean z = obj instanceof WritableArray;
            ReadableArray readableArray = (ReadableArray) obj;
            if (!z) {
                readableArray = m33768j(readableArray);
            }
            writableMap.putArray(str, readableArray);
            return;
        } else if (obj instanceof ReadableMap) {
            boolean z2 = obj instanceof WritableMap;
            ReadableMap readableMap = (ReadableMap) obj;
            if (!z2) {
                readableMap = m33769k(readableMap);
            }
            writableMap.putMap(str, readableMap);
            return;
        } else {
            throw new IllegalStateException("Unknown type of animated value");
        }
        writableMap.putDouble(str, doubleValue);
    }

    /* renamed from: j */
    private static WritableArray m33768j(ReadableArray readableArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (C9914c.f26535a[readableArray.getType(i).ordinal()]) {
                case 1:
                    createArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 2:
                    createArray.pushString(readableArray.getString(i));
                    break;
                case 3:
                    createArray.pushNull();
                    break;
                case 4:
                    createArray.pushDouble(readableArray.getDouble(i));
                    break;
                case 5:
                    createArray.pushMap(m33769k(readableArray.getMap(i)));
                    break;
                case 6:
                    createArray.pushArray(m33768j(readableArray.getArray(i)));
                    break;
                default:
                    throw new IllegalStateException("Unknown type of ReadableArray");
            }
        }
        return createArray;
    }

    /* renamed from: k */
    private static WritableMap m33769k(ReadableMap readableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        return createMap;
    }

    /* renamed from: x */
    private void m33770x(int i, String str, WritableMap writableMap) {
        EventNode eventNode;
        RCTEventEmitter rCTEventEmitter = this.f26519n;
        if (rCTEventEmitter != null) {
            rCTEventEmitter.receiveEvent(i, str, writableMap);
        }
        String str2 = i + str;
        if (!this.f26509d.isEmpty() && (eventNode = this.f26509d.get(str2)) != null) {
            eventNode.receiveEvent(i, str, writableMap);
        }
    }

    /* renamed from: y */
    private void m33771y(C2944c cVar) {
        EventNode eventNode;
        String a = this.f26514i.mo9441a(cVar.mo9630j());
        String str = cVar.mo9643o() + a;
        RCTEventEmitter rCTEventEmitter = this.f26519n;
        if (rCTEventEmitter != null) {
            cVar.mo9633c(rCTEventEmitter);
        }
        if (!this.f26509d.isEmpty() && (eventNode = this.f26509d.get(str)) != null) {
            cVar.mo9633c(eventNode);
        }
    }

    /* renamed from: A */
    public float[] mo24786A(int i) {
        try {
            return C9910c.m33759d(this.f26518m.resolveView(i));
        } catch (C2981h e) {
            e.printStackTrace();
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }
    }

    /* renamed from: B */
    public String mo24787B(int i, String str) {
        float elevation;
        View resolveView = this.f26518m.resolveView(i);
        String str2 = "error: unknown propName " + str + ", currently supported: opacity, zIndex";
        if (str.equals("opacity")) {
            elevation = resolveView.getAlpha();
        } else if (!str.equals("zIndex")) {
            return str2;
        } else {
            elevation = resolveView.getElevation();
        }
        return Float.toString(Float.valueOf(elevation).floatValue());
    }

    /* renamed from: D */
    public void mo24788D() {
        C9941d dVar = this.f26507b;
        if (dVar != null) {
            dVar.mo24838f();
        }
        NativeProxy nativeProxy = this.f26527v;
        if (nativeProxy != null) {
            nativeProxy.mo24757d();
            this.f26527v = null;
        }
    }

    /* renamed from: E */
    public void mo24789E() {
        if (this.f26515j.get()) {
            m33763O();
            this.f26515j.set(true);
        }
    }

    /* renamed from: F */
    public void mo24790F() {
        if (this.f26515j.getAndSet(false)) {
            mo24797N();
        }
    }

    /* renamed from: H */
    public void mo24791H(C9916e eVar) {
        this.f26520o.add(eVar);
        mo24797N();
    }

    /* renamed from: I */
    public void mo24792I() {
        this.f26522q = true;
        mo24797N();
    }

    /* renamed from: J */
    public void mo24793J(RCTEventEmitter rCTEventEmitter) {
        this.f26519n = rCTEventEmitter;
    }

    /* renamed from: K */
    public void mo24794K(int i, double d, double d2, boolean z) {
        try {
            C9910c.m33760e(this.f26518m.resolveView(i), d, d2, z);
        } catch (C2981h e) {
            e.printStackTrace();
        }
    }

    /* renamed from: L */
    public void mo24795L(String str, WritableMap writableMap) {
        this.f26511f.emit(str, writableMap);
    }

    /* renamed from: M */
    public void mo24796M(int i, Double d) {
        C9965m mVar = this.f26508c.get(i);
        if (mVar != null) {
            ((C10013u) mVar).mo24870b(d);
        }
    }

    /* renamed from: N */
    public void mo24797N() {
        if (!this.f26515j.getAndSet(true)) {
            this.f26512g.mo9151m(C2804g.C2807c.NATIVE_ANIMATED_MODULE, this.f26513h);
        }
    }

    /* renamed from: P */
    public void mo24798P(int i, Map<String, Object> map) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (this.f26525t.contains(str)) {
                m33767e(javaOnlyMap, str, value);
                z = true;
            } else if (this.f26526u.contains(str)) {
                m33767e(createMap2, str, value);
                z2 = true;
            } else {
                m33767e(createMap, str, value);
                z3 = true;
            }
        }
        if (i != -1) {
            if (z) {
                this.f26510e.mo9835a0(i, new C2962f0(javaOnlyMap));
            }
            if (z2) {
                mo24808q(i, createMap2, true);
            }
            if (z3) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putInt("viewTag", i);
                createMap3.putMap("props", createMap);
                mo24795L("onReanimatedPropsChange", createMap3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        r1 = r3.f26527v;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8432a(com.facebook.react.uimanager.events.C2944c r4) {
        /*
            r3 = this;
            boolean r0 = com.facebook.react.bridge.UiThreadUtil.isOnUiThread()
            if (r0 == 0) goto L_0x000d
            r3.m33771y(r4)
            r3.m33762G()
            goto L_0x004c
        L_0x000d:
            com.facebook.react.uimanager.UIManagerModule$d r0 = r3.f26514i
            java.lang.String r1 = r4.mo9630j()
            java.lang.String r0 = r0.mo9441a(r1)
            int r1 = r4.mo9643o()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.facebook.react.uimanager.events.RCTEventEmitter r1 = r3.f26519n
            r2 = 0
            if (r1 == 0) goto L_0x003b
            com.swmansion.reanimated.NativeProxy r1 = r3.f26527v
            if (r1 == 0) goto L_0x003b
            boolean r0 = r1.isAnyHandlerWaitingForEvent(r0)
            if (r0 == 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r0 = r0 | r2
            if (r0 == 0) goto L_0x0049
            java.util.concurrent.ConcurrentLinkedQueue<com.swmansion.reanimated.CopiedEvent> r0 = r3.f26521p
            com.swmansion.reanimated.CopiedEvent r1 = new com.swmansion.reanimated.CopiedEvent
            r1.<init>(r4)
            r0.offer(r1)
        L_0x0049:
            r3.mo24797N()
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.reanimated.C9911d.mo8432a(com.facebook.react.uimanager.events.c):void");
    }

    /* renamed from: f */
    public void mo24799f(int i, String str, int i2) {
        String str2 = i + str;
        EventNode eventNode = (EventNode) this.f26508c.get(i2);
        if (eventNode == null) {
            throw new JSApplicationIllegalArgumentException("Event node " + i2 + " does not exists");
        } else if (!this.f26509d.containsKey(str2)) {
            this.f26509d.put(str2, eventNode);
        } else {
            throw new JSApplicationIllegalArgumentException("Event handler already set for the given view and event type");
        }
    }

    /* renamed from: g */
    public void mo24800g(Set<String> set, Set<String> set2) {
        this.f26525t = set;
        this.f26526u = set2;
    }

    /* renamed from: h */
    public void mo24801h(int i, int i2) {
        C9965m mVar = this.f26508c.get(i);
        if (mVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with ID " + i + " does not exists");
        } else if (mVar instanceof C10004q) {
            ((C10004q) mVar).mo24880c(i2);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + C10004q.class.getName());
        }
    }

    /* renamed from: i */
    public void mo24802i(int i, int i2) {
        C9965m mVar = this.f26508c.get(i);
        C9965m mVar2 = this.f26508c.get(i2);
        if (mVar2 != null) {
            mVar.addChild(mVar2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i2 + " does not exists");
    }

    /* renamed from: l */
    public void mo24803l(int i, ReadableMap readableMap) {
        Object obj;
        if (this.f26508c.get(i) == null) {
            String string = readableMap.getString("type");
            if ("props".equals(string)) {
                obj = new C10004q(i, readableMap, this, this.f26510e);
            } else if ("style".equals(string)) {
                obj = new C10007s(i, readableMap, this);
            } else if ("transform".equals(string)) {
                obj = new C10008t(i, readableMap, this);
            } else if ("value".equals(string)) {
                obj = new C10013u(i, readableMap, this);
            } else if ("block".equals(string)) {
                obj = new C9952c(i, readableMap, this);
            } else if ("cond".equals(string)) {
                obj = new C9960h(i, readableMap, this);
            } else if ("op".equals(string)) {
                obj = new C9967o(i, readableMap, this);
            } else if ("set".equals(string)) {
                obj = new C10006r(i, readableMap, this);
            } else if ("debug".equals(string)) {
                obj = new C9961i(i, readableMap, this);
            } else if ("clock".equals(string)) {
                obj = new C9954e(i, readableMap, this);
            } else if ("clockStart".equals(string)) {
                obj = new C9955f.C9956a(i, readableMap, this);
            } else if ("clockStop".equals(string)) {
                obj = new C9955f.C9957b(i, readableMap, this);
            } else if ("clockTest".equals(string)) {
                obj = new C9955f.C9958c(i, readableMap, this);
            } else if ("call".equals(string)) {
                obj = new C9964l(i, readableMap, this);
            } else if ("bezier".equals(string)) {
                obj = new C9950b(i, readableMap, this);
            } else if ("event".equals(string)) {
                obj = new EventNode(i, readableMap, this);
            } else if ("always".equals(string)) {
                obj = new C9949a(i, readableMap, this);
            } else if ("concat".equals(string)) {
                obj = new C9959g(i, readableMap, this);
            } else if ("param".equals(string)) {
                obj = new C10003p(i, readableMap, this);
            } else if ("func".equals(string)) {
                obj = new C9963k(i, readableMap, this);
            } else if ("callfunc".equals(string)) {
                obj = new C9953d(i, readableMap, this);
            } else {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            this.f26508c.put(i, obj);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i + " already exists");
    }

    /* renamed from: m */
    public void mo24804m(int i, String str, int i2) {
        this.f26509d.remove(i + str);
    }

    /* renamed from: n */
    public void mo24805n(int i, int i2) {
        C9965m mVar = this.f26508c.get(i);
        if (mVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with ID " + i + " does not exists");
        } else if (mVar instanceof C10004q) {
            ((C10004q) mVar).mo24881d(i2);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + C10004q.class.getName());
        }
    }

    /* renamed from: o */
    public void mo24806o(int i, int i2) {
        C9965m mVar = this.f26508c.get(i);
        C9965m mVar2 = this.f26508c.get(i2);
        if (mVar2 != null) {
            mVar.removeChild(mVar2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i2 + " does not exists");
    }

    /* renamed from: p */
    public void mo24807p(int i) {
        C9965m mVar = this.f26508c.get(i);
        if (mVar != null) {
            mVar.onDrop();
        }
        this.f26508c.remove(i);
    }

    /* renamed from: q */
    public void mo24808q(int i, WritableMap writableMap, boolean z) {
        if (z) {
            this.f26529x = true;
        }
        this.f26528w.add(new C9915d(i, writableMap));
    }

    /* renamed from: r */
    public <T extends C9965m> T mo24809r(int i, Class<T> cls) {
        T t = (C9965m) this.f26508c.get(i);
        if (t == null) {
            if (cls == C9965m.class || cls == C10013u.class) {
                return this.f26516k;
            }
            throw new IllegalArgumentException("Requested node with id " + i + " of type " + cls + " cannot be found");
        } else if (cls.isInstance(t)) {
            return t;
        } else {
            throw new IllegalArgumentException("Node with id " + i + " is of incompatible type " + t.getClass() + ", requested type was " + cls);
        }
    }

    /* renamed from: s */
    public C9941d mo24810s() {
        return this.f26507b;
    }

    /* renamed from: t */
    public UIManagerModule.C2916d mo24811t() {
        return this.f26514i;
    }

    /* renamed from: u */
    public NativeProxy mo24812u() {
        return this.f26527v;
    }

    /* renamed from: v */
    public Object mo24813v(int i) {
        C9965m mVar = this.f26508c.get(i);
        return mVar != null ? mVar.value() : f26506a;
    }

    /* renamed from: w */
    public void mo24814w(int i, Callback callback) {
        callback.invoke(this.f26508c.get(i).value());
    }

    /* renamed from: z */
    public void mo24815z(ReactApplicationContext reactApplicationContext) {
        this.f26527v = new NativeProxy(reactApplicationContext);
        this.f26507b.mo24845o(mo24812u().mo24756c());
    }
}
