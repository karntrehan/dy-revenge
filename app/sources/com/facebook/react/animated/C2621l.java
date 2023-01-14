package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.events.C2952f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.react.animated.l */
class C2621l implements C2952f {

    /* renamed from: a */
    private final SparseArray<C2611b> f7702a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<C2613d> f7703b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<C2611b> f7704c = new SparseArray<>();

    /* renamed from: d */
    private final Map<String, List<EventAnimationDriver>> f7705d = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ReactApplicationContext f7706e;

    /* renamed from: f */
    private int f7707f = 0;

    /* renamed from: g */
    private final List<C2611b> f7708g = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f7709h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f7710i = false;

    /* renamed from: j */
    private boolean f7711j = false;

    /* renamed from: com.facebook.react.animated.l$a */
    class C2622a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f7712f;

        /* renamed from: o */
        final /* synthetic */ C2621l f7713o;

        C2622a(int i, C2621l lVar) {
            this.f7712f = i;
            this.f7713o = lVar;
        }

        public void run() {
            UIManager f = C3051u0.m12089f(C2621l.this.f7706e, this.f7712f);
            if (f != null) {
                ((C2945d) f.getEventDispatcher()).mo9650b(this.f7713o);
                if (this.f7712f == 2) {
                    boolean unused = C2621l.this.f7709h = true;
                } else {
                    boolean unused2 = C2621l.this.f7710i = true;
                }
            }
        }
    }

    /* renamed from: com.facebook.react.animated.l$b */
    class C2623b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2944c f7715f;

        C2623b(C2944c cVar) {
            this.f7715f = cVar;
        }

        public void run() {
            C2621l.this.m10832q(this.f7715f);
        }
    }

    public C2621l(ReactApplicationContext reactApplicationContext) {
        this.f7706e = reactApplicationContext;
    }

    /* renamed from: B */
    private void m10826B(C2611b bVar) {
        int i = 0;
        while (i < this.f7703b.size()) {
            C2613d valueAt = this.f7703b.valueAt(i);
            if (bVar.equals(valueAt.f7662b)) {
                if (valueAt.f7663c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.f7663c.invoke(createMap);
                }
                this.f7703b.removeAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: D */
    private void m10827D(List<C2611b> list) {
        String str;
        ReactNoCrashSoftException reactNoCrashSoftException;
        int i;
        int i2 = this.f7707f + 1;
        this.f7707f = i2;
        if (i2 == 0) {
            this.f7707f = i2 + 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = 0;
        for (C2611b next : list) {
            int i4 = next.f7659c;
            int i5 = this.f7707f;
            if (i4 != i5) {
                next.f7659c = i5;
                i3++;
                arrayDeque.add(next);
            }
        }
        while (!arrayDeque.isEmpty()) {
            C2611b bVar = (C2611b) arrayDeque.poll();
            if (bVar.f7657a != null) {
                for (int i6 = 0; i6 < bVar.f7657a.size(); i6++) {
                    C2611b bVar2 = bVar.f7657a.get(i6);
                    bVar2.f7658b++;
                    int i7 = bVar2.f7659c;
                    int i8 = this.f7707f;
                    if (i7 != i8) {
                        bVar2.f7659c = i8;
                        i3++;
                        arrayDeque.add(bVar2);
                    }
                }
            }
        }
        int i9 = this.f7707f + 1;
        this.f7707f = i9;
        if (i9 == 0) {
            this.f7707f = i9 + 1;
        }
        int i10 = 0;
        for (C2611b next2 : list) {
            if (next2.f7658b == 0 && next2.f7659c != (i = this.f7707f)) {
                next2.f7659c = i;
                i10++;
                arrayDeque.add(next2);
            }
        }
        int i11 = 0;
        while (!arrayDeque.isEmpty()) {
            C2611b bVar3 = (C2611b) arrayDeque.poll();
            try {
                bVar3.mo8422g();
                if (bVar3 instanceof C2624m) {
                    ((C2624m) bVar3).mo8458k();
                }
            } catch (JSApplicationCausedNativeException e) {
                C6071a.m22876j("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e);
            }
            if (bVar3 instanceof C2636s) {
                ((C2636s) bVar3).mo8465l();
            }
            if (bVar3.f7657a != null) {
                for (int i12 = 0; i12 < bVar3.f7657a.size(); i12++) {
                    C2611b bVar4 = bVar3.f7657a.get(i12);
                    int i13 = bVar4.f7658b - 1;
                    bVar4.f7658b = i13;
                    int i14 = bVar4.f7659c;
                    int i15 = this.f7707f;
                    if (i14 != i15 && i13 == 0) {
                        bVar4.f7659c = i15;
                        i10++;
                        arrayDeque.add(bVar4);
                    } else if (i14 == i15) {
                        i11++;
                    }
                }
            }
        }
        if (i3 == i10) {
            this.f7711j = false;
        } else if (!this.f7711j) {
            this.f7711j = true;
            C6071a.m22875i("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
            for (C2611b e2 : list) {
                C6071a.m22875i("NativeAnimatedNodesManager", e2.mo8426e());
            }
            if (i11 > 0) {
                str = "cycles (" + i11 + ")";
            } else {
                str = "disconnected regions";
            }
            IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + str + ", there are " + i3 + " but toposort visited only " + i10);
            boolean z = this.f7709h;
            if (z && i11 == 0) {
                reactNoCrashSoftException = new ReactNoCrashSoftException((Throwable) illegalStateException);
            } else if (z) {
                reactNoCrashSoftException = new ReactNoCrashSoftException((Throwable) illegalStateException);
            } else {
                throw illegalStateException;
            }
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", reactNoCrashSoftException);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m10832q(C2944c cVar) {
        ReactApplicationContext reactApplicationContext;
        UIManager f;
        if (!this.f7705d.isEmpty() && (reactApplicationContext = this.f7706e) != null && (f = C3051u0.m12089f(reactApplicationContext, cVar.mo9641m())) != null) {
            String resolveCustomDirectEventName = f.resolveCustomDirectEventName(cVar.mo9630j());
            if (resolveCustomDirectEventName == null) {
                resolveCustomDirectEventName = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Map<String, List<EventAnimationDriver>> map = this.f7705d;
            List<EventAnimationDriver> list = map.get(cVar.mo9643o() + resolveCustomDirectEventName);
            if (list != null) {
                for (EventAnimationDriver eventAnimationDriver : list) {
                    m10826B(eventAnimationDriver.mValueNode);
                    cVar.mo9633c(eventAnimationDriver);
                    this.f7708g.add(eventAnimationDriver.mValueNode);
                }
                m10827D(this.f7708g);
                this.f7708g.clear();
            }
        }
    }

    /* renamed from: A */
    public void mo8430A(int i) {
        for (int i2 = 0; i2 < this.f7703b.size(); i2++) {
            C2613d valueAt = this.f7703b.valueAt(i2);
            if (valueAt.f7664d == i) {
                if (valueAt.f7663c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.f7663c.invoke(createMap);
                }
                this.f7703b.removeAt(i2);
                return;
            }
        }
    }

    /* renamed from: C */
    public void mo8431C(int i) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar == null || !(bVar instanceof C2636s)) {
            throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i + "] does not exist, or is not a 'value' node");
        }
        ((C2636s) bVar).mo8466m((C2612c) null);
    }

    /* renamed from: a */
    public void mo8432a(C2944c cVar) {
        if (UiThreadUtil.isOnUiThread()) {
            m10832q(cVar);
        } else {
            UiThreadUtil.runOnUiThread(new C2623b(cVar));
        }
    }

    /* renamed from: f */
    public void mo8433f(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        C2611b bVar = this.f7702a.get(i2);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i2 + "] does not exist");
        } else if (bVar instanceof C2636s) {
            ReadableArray array = readableMap.getArray("nativeEventPath");
            ArrayList arrayList = new ArrayList(array.size());
            for (int i3 = 0; i3 < array.size(); i3++) {
                arrayList.add(array.getString(i3));
            }
            EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (C2636s) bVar);
            String str2 = i + str;
            if (this.f7705d.containsKey(str2)) {
                this.f7705d.get(str2).add(eventAnimationDriver);
                return;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(eventAnimationDriver);
            this.f7705d.put(str2, arrayList2);
        } else {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i + "] connected to event (" + str + ") should be of type " + C2636s.class.getName());
        }
    }

    /* renamed from: g */
    public void mo8434g(int i, int i2) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i + "] does not exist");
        } else if (bVar instanceof C2624m) {
            ReactApplicationContext reactApplicationContext = this.f7706e;
            if (reactApplicationContext != null) {
                UIManager h = C3051u0.m12091h(reactApplicationContext, i2);
                if (h == null) {
                    ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i2));
                    return;
                }
                ((C2624m) bVar).mo8455h(i2, h);
                this.f7704c.put(i, bVar);
                return;
            }
            throw new IllegalStateException("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i2);
        } else {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i2 + "] should be of type " + C2624m.class.getName());
        }
    }

    /* renamed from: h */
    public void mo8435h(int i, int i2) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar != null) {
            C2611b bVar2 = this.f7702a.get(i2);
            if (bVar2 != null) {
                bVar.mo8423a(bVar2);
                this.f7704c.put(i2, bVar2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i2 + "] does not exist");
        }
        throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i + "] does not exist");
    }

    /* renamed from: i */
    public void mo8436i(int i, ReadableMap readableMap) {
        C2611b bVar;
        if (this.f7702a.get(i) == null) {
            String string = readableMap.getString("type");
            if ("style".equals(string)) {
                bVar = new C2628o(readableMap, this);
            } else if ("value".equals(string)) {
                bVar = new C2636s(readableMap);
            } else if ("props".equals(string)) {
                bVar = new C2624m(readableMap, this);
            } else if ("interpolation".equals(string)) {
                bVar = new C2618i(readableMap);
            } else if ("addition".equals(string)) {
                bVar = new C2610a(readableMap, this);
            } else if ("subtraction".equals(string)) {
                bVar = new C2629p(readableMap, this);
            } else if ("division".equals(string)) {
                bVar = new C2616g(readableMap, this);
            } else if ("multiplication".equals(string)) {
                bVar = new C2620k(readableMap, this);
            } else if ("modulus".equals(string)) {
                bVar = new C2619j(readableMap, this);
            } else if ("diffclamp".equals(string)) {
                bVar = new C2615f(readableMap, this);
            } else if ("transform".equals(string)) {
                bVar = new C2631r(readableMap, this);
            } else if ("tracking".equals(string)) {
                bVar = new C2630q(readableMap, this);
            } else {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            bVar.f7660d = i;
            this.f7702a.put(i, bVar);
            this.f7704c.put(i, bVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i + "] already exists");
    }

    /* renamed from: j */
    public void mo8437j(int i, int i2) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i + "] does not exist");
        } else if (bVar instanceof C2624m) {
            ((C2624m) bVar).mo8456i(i2);
        } else {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i2 + "] should be of type " + C2624m.class.getName());
        }
    }

    /* renamed from: k */
    public void mo8438k(int i, int i2) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar != null) {
            C2611b bVar2 = this.f7702a.get(i2);
            if (bVar2 != null) {
                bVar.mo8427f(bVar2);
                this.f7704c.put(i2, bVar2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i2 + "] does not exist");
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i + "] does not exist");
    }

    /* renamed from: l */
    public void mo8439l(int i) {
        this.f7702a.remove(i);
        this.f7704c.remove(i);
    }

    /* renamed from: m */
    public void mo8440m(int i) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar == null || !(bVar instanceof C2636s)) {
            throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i + "] does not exist, or is not a 'value' node");
        }
        ((C2636s) bVar).mo8461h();
    }

    /* renamed from: n */
    public void mo8441n(int i) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar == null || !(bVar instanceof C2636s)) {
            throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i + "] does not exist, or is not a 'value' node");
        }
        ((C2636s) bVar).mo8462i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C2611b mo8442o(int i) {
        return this.f7702a.get(i);
    }

    /* renamed from: p */
    public void mo8443p(int i, Callback callback) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar == null || !(bVar instanceof C2636s)) {
            throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i + "] does not exist or is not a 'value' node");
        }
        callback.invoke(Double.valueOf(((C2636s) bVar).mo8464k()));
    }

    /* renamed from: r */
    public boolean mo8444r() {
        return this.f7703b.size() > 0 || this.f7704c.size() > 0;
    }

    /* renamed from: s */
    public void mo8445s(int i) {
        if (i == 2 && this.f7709h) {
            return;
        }
        if (i != 1 || !this.f7710i) {
            this.f7706e.runOnUiQueueThread(new C2622a(i, this));
        }
    }

    /* renamed from: t */
    public void mo8446t(int i, String str, int i2) {
        String str2 = i + str;
        if (this.f7705d.containsKey(str2)) {
            List list = this.f7705d.get(str2);
            if (list.size() == 1) {
                this.f7705d.remove(i + str);
                return;
            }
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (((EventAnimationDriver) listIterator.next()).mValueNode.f7660d == i2) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    public void mo8447u(int i) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar != null) {
            if (bVar instanceof C2624m) {
                ((C2624m) bVar).mo8457j();
                return;
            }
            throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + C2624m.class.getName());
        }
    }

    /* renamed from: v */
    public void mo8448v(long j) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < this.f7704c.size(); i++) {
            this.f7708g.add(this.f7704c.valueAt(i));
        }
        this.f7704c.clear();
        boolean z = false;
        for (int i2 = 0; i2 < this.f7703b.size(); i2++) {
            C2613d valueAt = this.f7703b.valueAt(i2);
            valueAt.mo8429b(j);
            this.f7708g.add(valueAt.f7662b);
            if (valueAt.f7661a) {
                z = true;
            }
        }
        m10827D(this.f7708g);
        this.f7708g.clear();
        if (z) {
            for (int size = this.f7703b.size() - 1; size >= 0; size--) {
                C2613d valueAt2 = this.f7703b.valueAt(size);
                if (valueAt2.f7661a) {
                    if (valueAt2.f7663c != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("finished", true);
                        valueAt2.f7663c.invoke(createMap);
                    }
                    this.f7703b.removeAt(size);
                }
            }
        }
    }

    /* renamed from: w */
    public void mo8449w(int i, double d) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar == null || !(bVar instanceof C2636s)) {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i + "] does not exist, or is not a 'value' node");
        }
        ((C2636s) bVar).f7759g = d;
        this.f7704c.put(i, bVar);
    }

    /* renamed from: x */
    public void mo8450x(int i, double d) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar == null || !(bVar instanceof C2636s)) {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i + "] does not exist, or is not a 'value' node");
        }
        m10826B(bVar);
        ((C2636s) bVar).f7758f = d;
        this.f7704c.put(i, bVar);
    }

    /* renamed from: y */
    public void mo8451y(int i, int i2, ReadableMap readableMap, Callback callback) {
        C2613d dVar;
        C2611b bVar = this.f7702a.get(i2);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i2 + "] does not exist");
        } else if (bVar instanceof C2636s) {
            C2613d dVar2 = this.f7703b.get(i);
            if (dVar2 != null) {
                dVar2.mo8428a(readableMap);
                return;
            }
            String string = readableMap.getString("type");
            if ("frames".equals(string)) {
                dVar = new C2617h(readableMap);
            } else if ("spring".equals(string)) {
                dVar = new C2625n(readableMap);
            } else if ("decay".equals(string)) {
                dVar = new C2614e(readableMap);
            } else {
                throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i2 + "]: " + string);
            }
            dVar.f7664d = i;
            dVar.f7663c = callback;
            dVar.f7662b = (C2636s) bVar;
            this.f7703b.put(i, dVar);
        } else {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i2 + "] should be of type " + C2636s.class.getName());
        }
    }

    /* renamed from: z */
    public void mo8452z(int i, C2612c cVar) {
        C2611b bVar = this.f7702a.get(i);
        if (bVar == null || !(bVar instanceof C2636s)) {
            throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i + "] does not exist, or is not a 'value' node");
        }
        ((C2636s) bVar).mo8466m(cVar);
    }
}
