package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.i18nmanager.C2822a;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.react.uimanager.p122l1.C2999a;
import com.facebook.systrace.C3294a;
import com.facebook.systrace.C3296b;
import com.facebook.yoga.C3308h;
import java.util.Arrays;
import java.util.Map;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.uimanager.s0 */
public class C3041s0 {

    /* renamed from: a */
    protected Object f8440a;

    /* renamed from: b */
    protected final C2945d f8441b;

    /* renamed from: c */
    protected final ReactApplicationContext f8442c;

    /* renamed from: d */
    protected final C2998l0 f8443d;

    /* renamed from: e */
    private final C2941e1 f8444e;

    /* renamed from: f */
    private final C3061z0 f8445f;

    /* renamed from: g */
    private final C3029o f8446g;

    /* renamed from: h */
    private final int[] f8447h;

    /* renamed from: i */
    private long f8448i;

    /* renamed from: j */
    protected C3043b f8449j;

    /* renamed from: k */
    private volatile boolean f8450k;

    /* renamed from: com.facebook.react.uimanager.s0$a */
    class C3042a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2931d0 f8451f;

        C3042a(C2931d0 d0Var) {
            this.f8451f = d0Var;
        }

        public void run() {
            C3041s0.this.f8443d.mo9728b(this.f8451f);
        }
    }

    /* renamed from: com.facebook.react.uimanager.s0$b */
    public interface C3043b {
        /* renamed from: a */
        void mo9863a(C2931d0 d0Var);
    }

    C3041s0(ReactApplicationContext reactApplicationContext, C2941e1 e1Var, C2945d dVar, int i) {
        this(reactApplicationContext, e1Var, new C3061z0(reactApplicationContext, new C3022n(e1Var), i), dVar);
    }

    protected C3041s0(ReactApplicationContext reactApplicationContext, C2941e1 e1Var, C3061z0 z0Var, C2945d dVar) {
        this.f8440a = new Object();
        C2998l0 l0Var = new C2998l0();
        this.f8443d = l0Var;
        this.f8447h = new int[4];
        this.f8448i = 0;
        this.f8450k = true;
        this.f8442c = reactApplicationContext;
        this.f8444e = e1Var;
        this.f8445f = z0Var;
        this.f8446g = new C3029o(z0Var, l0Var);
        this.f8441b = dVar;
    }

    /* renamed from: A */
    private void m12011A(int i, int[] iArr) {
        C2931d0 c = this.f8443d.mo9729c(i);
        if (c != null) {
            C2931d0 parent = c.getParent();
            if (parent != null) {
                m12012B(c, parent, iArr);
                return;
            }
            throw new C2981h("View with tag " + i + " doesn't have a parent!");
        }
        throw new C2981h("No native view for tag " + i + " exists!");
    }

    /* renamed from: B */
    private void m12012B(C2931d0 d0Var, C2931d0 d0Var2, int[] iArr) {
        int i;
        int i2;
        if (d0Var == d0Var2 || d0Var.mo9551w()) {
            i2 = 0;
            i = 0;
        } else {
            i2 = Math.round(d0Var.mo9519V());
            i = Math.round(d0Var.mo9515R());
            for (C2931d0 parent = d0Var.getParent(); parent != d0Var2; parent = parent.getParent()) {
                C6409a.m24521c(parent);
                m12015c(parent);
                i2 += Math.round(parent.mo9519V());
                i += Math.round(parent.mo9515R());
            }
            m12015c(d0Var2);
        }
        iArr[0] = i2;
        iArr[1] = i;
        iArr[2] = d0Var.mo9502E();
        iArr[3] = d0Var.mo9531f();
    }

    /* renamed from: C */
    private void m12013C(C2931d0 d0Var) {
        if (d0Var.mo9543o()) {
            for (int i = 0; i < d0Var.mo9526b(); i++) {
                m12013C(d0Var.mo9524a(i));
            }
            d0Var.mo9520W(this.f8446g);
        }
    }

    /* renamed from: N */
    private void m12014N(C2931d0 d0Var) {
        C3029o.m11971j(d0Var);
        this.f8443d.mo9733g(d0Var.mo9548t());
        for (int b = d0Var.mo9526b() - 1; b >= 0; b--) {
            m12014N(d0Var.mo9524a(b));
        }
        d0Var.mo9547s();
    }

    /* renamed from: c */
    private void m12015c(C2931d0 d0Var) {
        ViewManager viewManager = (ViewManager) C6409a.m24521c(this.f8444e.mo9624a(d0Var.mo9512O()));
        if (viewManager instanceof C2964g) {
            C2964g gVar = (C2964g) viewManager;
            if (gVar != null && gVar.needsCustomLayoutForChildren()) {
                throw new C2981h("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + d0Var.mo9512O() + "). Use measure instead.");
            }
            return;
        }
        throw new C2981h("Trying to use view " + d0Var.mo9512O() + " as a parent, but its Manager doesn't extends ViewGroupManager");
    }

    /* renamed from: d */
    private void m12016d(int i, String str) {
        if (this.f8443d.mo9729c(i) == null) {
            throw new C2981h("Unable to execute operation " + str + " on view with tag: " + i + ", since the view does not exists");
        }
    }

    /* renamed from: o */
    private void m12017o() {
        if (this.f8445f.mo9895X()) {
            mo9852n(-1);
        }
    }

    /* renamed from: y */
    private void m12018y(int i, int i2, int[] iArr) {
        C2931d0 c = this.f8443d.mo9729c(i);
        C2931d0 c2 = this.f8443d.mo9729c(i2);
        if (c == null || c2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tag ");
            if (c != null) {
                i = i2;
            }
            sb.append(i);
            sb.append(" does not exist");
            throw new C2981h(sb.toString());
        }
        if (c != c2) {
            C2931d0 parent = c.getParent();
            while (parent != c2) {
                if (parent != null) {
                    parent = parent.getParent();
                } else {
                    throw new C2981h("Tag " + i2 + " is not an ancestor of tag " + i);
                }
            }
        }
        m12012B(c, c2, iArr);
    }

    /* renamed from: D */
    public void mo9812D() {
        this.f8450k = false;
    }

    /* renamed from: E */
    public void mo9813E() {
    }

    /* renamed from: F */
    public void mo9814F() {
        this.f8445f.mo9896Y();
    }

    /* renamed from: G */
    public void mo9815G() {
        this.f8445f.mo9899b0();
    }

    /* renamed from: H */
    public void mo9816H(C3039r0 r0Var) {
        this.f8445f.mo9897Z(r0Var);
    }

    /* renamed from: I */
    public void mo9817I() {
        this.f8445f.mo9898a0();
    }

    /* renamed from: J */
    public <T extends View> void mo9818J(T t, int i, C3031o0 o0Var) {
        synchronized (this.f8440a) {
            C2931d0 h = mo9846h();
            h.mo9514Q(i);
            h.mo9500C(o0Var);
            o0Var.runOnNativeModulesQueueThread(new C3042a(h));
            this.f8445f.mo9901y(i, t);
        }
    }

    /* renamed from: K */
    public void mo9819K(int i) {
        synchronized (this.f8440a) {
            this.f8443d.mo9734h(i);
        }
    }

    /* renamed from: L */
    public void mo9820L(int i) {
        mo9819K(i);
        this.f8445f.mo9884L(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo9821M(C2931d0 d0Var) {
        m12014N(d0Var);
        d0Var.mo9530e();
    }

    /* renamed from: O */
    public void mo9822O(int i) {
        C2931d0 c = this.f8443d.mo9729c(i);
        if (c != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i2 = 0; i2 < c.mo9526b(); i2++) {
                createArray.pushInt(i2);
            }
            mo9689u(i, (ReadableArray) null, (ReadableArray) null, (ReadableArray) null, (ReadableArray) null, createArray);
            return;
        }
        throw new C2981h("Trying to remove subviews of an unknown view tag: " + i);
    }

    /* renamed from: P */
    public void mo9823P(int i, int i2) {
        if (this.f8443d.mo9732f(i) || this.f8443d.mo9732f(i2)) {
            throw new C2981h("Trying to add or replace a root tag!");
        }
        C2931d0 c = this.f8443d.mo9729c(i);
        if (c != null) {
            C2931d0 parent = c.getParent();
            if (parent != null) {
                int N = parent.mo9511N(c);
                if (N >= 0) {
                    WritableArray createArray = Arguments.createArray();
                    createArray.pushInt(i2);
                    WritableArray createArray2 = Arguments.createArray();
                    createArray2.pushInt(N);
                    WritableArray createArray3 = Arguments.createArray();
                    createArray3.pushInt(N);
                    mo9689u(parent.mo9548t(), (ReadableArray) null, (ReadableArray) null, createArray, createArray2, createArray3);
                    return;
                }
                throw new IllegalStateException("Didn't find child tag in parent");
            }
            throw new C2981h("Node is not attached to a parent: " + i);
        }
        throw new C2981h("Trying to replace unknown view tag: " + i);
    }

    /* renamed from: Q */
    public int mo9824Q(int i) {
        if (this.f8443d.mo9732f(i)) {
            return i;
        }
        C2931d0 R = mo9825R(i);
        if (R != null) {
            return R.mo9508K();
        }
        C6071a.m22859G("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i);
        return 0;
    }

    /* renamed from: R */
    public final C2931d0 mo9825R(int i) {
        return this.f8443d.mo9729c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final ViewManager mo9826S(String str) {
        return this.f8444e.mo9625c(str);
    }

    /* renamed from: T */
    public void mo9827T(int i, int i2) {
        this.f8445f.mo9885M(i, i2);
    }

    /* renamed from: U */
    public void mo9828U(int i, ReadableArray readableArray) {
        if (this.f8450k) {
            synchronized (this.f8440a) {
                C2931d0 c = this.f8443d.mo9729c(i);
                int i2 = 0;
                while (i2 < readableArray.size()) {
                    C2931d0 c2 = this.f8443d.mo9729c(readableArray.getInt(i2));
                    if (c2 != null) {
                        c.mo9509L(c2, i2);
                        i2++;
                    } else {
                        throw new C2981h("Trying to add unknown view tag: " + readableArray.getInt(i2));
                    }
                }
                this.f8446g.mo9801k(c, readableArray);
            }
        }
    }

    /* renamed from: V */
    public void mo9829V(int i, boolean z) {
        C2931d0 c = this.f8443d.mo9729c(i);
        if (c != null) {
            while (c.mo9507J() == C3000m.NONE) {
                c = c.getParent();
            }
            this.f8445f.mo9886N(c.mo9548t(), i, z);
        }
    }

    /* renamed from: W */
    public void mo9830W(boolean z) {
        this.f8445f.mo9887O(z);
    }

    /* renamed from: X */
    public void mo9831X(C2999a aVar) {
        this.f8445f.mo9900c0(aVar);
    }

    /* renamed from: Y */
    public void mo9832Y(int i, Object obj) {
        C2931d0 c = this.f8443d.mo9729c(i);
        if (c == null) {
            C6071a.m22859G("ReactNative", "Attempt to set local data for view with unknown tag: " + i);
            return;
        }
        c.mo9505H(obj);
        m12017o();
    }

    /* renamed from: Z */
    public void mo9833Z(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        m12016d(i, "showPopupMenu");
        this.f8445f.mo9888P(i, readableArray, callback, callback2);
    }

    /* renamed from: a */
    public void mo9834a(C3039r0 r0Var) {
        this.f8445f.mo9889Q(r0Var);
    }

    /* renamed from: a0 */
    public void mo9835a0(int i, C2962f0 f0Var) {
        UiThreadUtil.assertOnUiThread();
        this.f8445f.mo9893V().mo9769E(i, f0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9836b(C2931d0 d0Var, float f, float f2) {
        if (d0Var.mo9543o()) {
            Iterable<? extends C2931d0> q = d0Var.mo9545q();
            if (q != null) {
                for (C2931d0 b : q) {
                    mo9836b(b, d0Var.mo9519V() + f, d0Var.mo9515R() + f2);
                }
            }
            int t = d0Var.mo9548t();
            if (!this.f8443d.mo9732f(t) && d0Var.mo9546r(f, f2, this.f8445f, this.f8446g) && d0Var.mo9510M()) {
                this.f8441b.mo9651c(C3035q.m11996w(-1, t, d0Var.mo9517T(), d0Var.mo9504G(), d0Var.mo9502E(), d0Var.mo9531f()));
            }
            d0Var.mo9532g();
            this.f8446g.mo9805p(d0Var);
        }
    }

    /* renamed from: b0 */
    public void mo9837b0(int i, int i2, int i3) {
        C2931d0 c = this.f8443d.mo9729c(i);
        if (c == null) {
            C6071a.m22859G("ReactNative", "Tried to update size of non-existent tag: " + i);
            return;
        }
        c.mo9501D((float) i2);
        c.mo9537i((float) i3);
        m12017o();
    }

    /* renamed from: c0 */
    public void mo9838c0(int i, int i2, int i3) {
        C2931d0 c = this.f8443d.mo9729c(i);
        if (c == null) {
            C6071a.m22859G("ReactNative", "Tried to update non-existent root tag: " + i);
            return;
        }
        mo9839d0(c, i2, i3);
    }

    /* renamed from: d0 */
    public void mo9839d0(C2931d0 d0Var, int i, int i2) {
        d0Var.mo9538j(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo9840e(C2931d0 d0Var) {
        C3296b.m12892a(0, "cssRoot.calculateLayout").mo10750a("rootTag", d0Var.mo9548t()).mo10752c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            int intValue = d0Var.getWidthMeasureSpec().intValue();
            int intValue2 = d0Var.getHeightMeasureSpec().intValue();
            float f = Float.NaN;
            float size = View.MeasureSpec.getMode(intValue) == 0 ? Float.NaN : (float) View.MeasureSpec.getSize(intValue);
            if (View.MeasureSpec.getMode(intValue2) != 0) {
                f = (float) View.MeasureSpec.getSize(intValue2);
            }
            d0Var.mo9516S(size, f);
        } finally {
            C3294a.m12885g(0);
            this.f8448i = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    /* renamed from: e0 */
    public void mo9841e0(int i, String str, ReadableMap readableMap) {
        if (this.f8450k) {
            if (this.f8444e.mo9624a(str) != null) {
                C2931d0 c = this.f8443d.mo9729c(i);
                if (c == null) {
                    throw new C2981h("Trying to update non-existent view with tag " + i);
                } else if (readableMap != null) {
                    C2962f0 f0Var = new C2962f0(readableMap);
                    c.mo9527b0(f0Var);
                    mo9857t(c, str, f0Var);
                }
            } else {
                throw new C2981h("Got unknown view type: " + str);
            }
        }
    }

    /* renamed from: f */
    public void mo9842f() {
        this.f8445f.mo9873A();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        throw r0;
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9843f0() {
        /*
            r7 = this;
            java.lang.String r0 = "rootTag"
            r1 = 0
            java.lang.String r3 = "UIImplementation.updateViewHierarchy"
            com.facebook.systrace.C3294a.m12881c(r1, r3)
            r3 = 0
        L_0x000a:
            com.facebook.react.uimanager.l0 r4 = r7.f8443d     // Catch:{ all -> 0x0077 }
            int r4 = r4.mo9730d()     // Catch:{ all -> 0x0077 }
            if (r3 >= r4) goto L_0x0073
            com.facebook.react.uimanager.l0 r4 = r7.f8443d     // Catch:{ all -> 0x0077 }
            int r4 = r4.mo9731e(r3)     // Catch:{ all -> 0x0077 }
            com.facebook.react.uimanager.l0 r5 = r7.f8443d     // Catch:{ all -> 0x0077 }
            com.facebook.react.uimanager.d0 r4 = r5.mo9729c(r4)     // Catch:{ all -> 0x0077 }
            java.lang.Integer r5 = r4.getWidthMeasureSpec()     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x0070
            java.lang.Integer r5 = r4.getHeightMeasureSpec()     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x0070
            java.lang.String r5 = "UIImplementation.notifyOnBeforeLayoutRecursive"
            com.facebook.systrace.b$b r5 = com.facebook.systrace.C3296b.m12892a(r1, r5)     // Catch:{ all -> 0x0077 }
            int r6 = r4.mo9548t()     // Catch:{ all -> 0x0077 }
            com.facebook.systrace.b$b r5 = r5.mo10750a(r0, r6)     // Catch:{ all -> 0x0077 }
            r5.mo10752c()     // Catch:{ all -> 0x0077 }
            r7.m12013C(r4)     // Catch:{ all -> 0x006b }
            com.facebook.systrace.C3294a.m12885g(r1)     // Catch:{ all -> 0x0077 }
            r7.mo9840e(r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "UIImplementation.applyUpdatesRecursive"
            com.facebook.systrace.b$b r5 = com.facebook.systrace.C3296b.m12892a(r1, r5)     // Catch:{ all -> 0x0077 }
            int r6 = r4.mo9548t()     // Catch:{ all -> 0x0077 }
            com.facebook.systrace.b$b r5 = r5.mo10750a(r0, r6)     // Catch:{ all -> 0x0077 }
            r5.mo10752c()     // Catch:{ all -> 0x0077 }
            r5 = 0
            r7.mo9836b(r4, r5, r5)     // Catch:{ all -> 0x0066 }
            com.facebook.systrace.C3294a.m12885g(r1)     // Catch:{ all -> 0x0077 }
            com.facebook.react.uimanager.s0$b r5 = r7.f8449j     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x0070
            com.facebook.react.uimanager.z0 r6 = r7.f8445f     // Catch:{ all -> 0x0077 }
            r6.mo9880H(r4, r5)     // Catch:{ all -> 0x0077 }
            goto L_0x0070
        L_0x0066:
            r0 = move-exception
            com.facebook.systrace.C3294a.m12885g(r1)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x006b:
            r0 = move-exception
            com.facebook.systrace.C3294a.m12885g(r1)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0070:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0073:
            com.facebook.systrace.C3294a.m12885g(r1)
            return
        L_0x0077:
            r0 = move-exception
            com.facebook.systrace.C3294a.m12885g(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3041s0.mo9843f0():void");
    }

    /* renamed from: g */
    public void mo9844g(ReadableMap readableMap, Callback callback) {
        this.f8445f.mo9874B(readableMap, callback);
    }

    @Deprecated
    /* renamed from: g0 */
    public void mo9845g0(int i, int i2, Callback callback) {
        C2931d0 c = this.f8443d.mo9729c(i);
        C2931d0 c2 = this.f8443d.mo9729c(i2);
        if (c == null || c2 == null) {
            callback.invoke(Boolean.FALSE);
            return;
        }
        callback.invoke(Boolean.valueOf(c.mo9522Y(c2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C2931d0 mo9846h() {
        C2940e0 e0Var = new C2940e0();
        if (C2822a.m11246d().mo9192g(this.f8442c)) {
            e0Var.mo9541m(C3308h.RTL);
        }
        e0Var.mo9540l("Root");
        return e0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C2931d0 mo9847i(String str) {
        return this.f8444e.mo9624a(str).createShadowNodeInstance(this.f8442c);
    }

    /* renamed from: j */
    public void mo9848j(int i, String str, int i2, ReadableMap readableMap) {
        if (this.f8450k) {
            synchronized (this.f8440a) {
                C2931d0 i3 = mo9847i(str);
                C2931d0 c = this.f8443d.mo9729c(i2);
                C6409a.m24522d(c, "Root node with tag " + i2 + " doesn't exist");
                i3.mo9514Q(i);
                i3.mo9540l(str);
                i3.mo9499B(c.mo9548t());
                i3.mo9500C(c.mo9506I());
                this.f8443d.mo9727a(i3);
                C2962f0 f0Var = null;
                if (readableMap != null) {
                    f0Var = new C2962f0(readableMap);
                    i3.mo9527b0(f0Var);
                }
                mo9856s(i3, i2, f0Var);
            }
        }
    }

    /* renamed from: k */
    public void mo9849k() {
        this.f8445f.mo9876D();
    }

    @Deprecated
    /* renamed from: l */
    public void mo9850l(int i, int i2, ReadableArray readableArray) {
        m12016d(i, "dispatchViewManagerCommand: " + i2);
        this.f8445f.mo9877E(i, i2, readableArray);
    }

    /* renamed from: m */
    public void mo9851m(int i, String str, ReadableArray readableArray) {
        m12016d(i, "dispatchViewManagerCommand: " + str);
        this.f8445f.mo9878F(i, str, readableArray);
    }

    /* renamed from: n */
    public void mo9852n(int i) {
        C3296b.m12892a(0, "UIImplementation.dispatchViewUpdates").mo10750a("batchId", i).mo10752c();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            mo9843f0();
            this.f8446g.mo9804o();
            this.f8445f.mo9902z(i, uptimeMillis, this.f8448i);
        } finally {
            C3294a.m12885g(0);
        }
    }

    /* renamed from: p */
    public void mo9853p(int i, float f, float f2, Callback callback) {
        this.f8445f.mo9879G(i, f, f2, callback);
    }

    /* renamed from: q */
    public Map<String, Long> mo9854q() {
        return this.f8445f.mo9894W();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C3061z0 mo9855r() {
        return this.f8445f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo9856s(C2931d0 d0Var, int i, C2962f0 f0Var) {
        if (!d0Var.mo9551w()) {
            this.f8446g.mo9798g(d0Var, d0Var.mo9506I(), f0Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo9857t(C2931d0 d0Var, String str, C2962f0 f0Var) {
        if (!d0Var.mo9551w()) {
            this.f8446g.mo9803m(d0Var, str, f0Var);
        }
    }

    /* renamed from: u */
    public void mo9689u(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int i2 = i;
        ReadableArray readableArray6 = readableArray;
        ReadableArray readableArray7 = readableArray2;
        ReadableArray readableArray8 = readableArray3;
        ReadableArray readableArray9 = readableArray4;
        ReadableArray readableArray10 = readableArray5;
        if (this.f8450k) {
            synchronized (this.f8440a) {
                try {
                    C2931d0 c = this.f8443d.mo9729c(i2);
                    int size = readableArray6 == null ? 0 : readableArray.size();
                    int size2 = readableArray8 == null ? 0 : readableArray3.size();
                    int size3 = readableArray10 == null ? 0 : readableArray5.size();
                    if (size != 0) {
                        if (readableArray7 == null || size != readableArray2.size()) {
                            throw new C2981h("Size of moveFrom != size of moveTo!");
                        }
                    }
                    if (size2 != 0) {
                        if (readableArray9 == null || size2 != readableArray4.size()) {
                            throw new C2981h("Size of addChildTags != size of addAtIndices!");
                        }
                    }
                    int i3 = size + size2;
                    C2920a1[] a1VarArr = new C2920a1[i3];
                    int i4 = size + size3;
                    int[] iArr = new int[i4];
                    int[] iArr2 = new int[i4];
                    int i5 = i3;
                    int[] iArr3 = new int[size3];
                    if (size > 0) {
                        C6409a.m24521c(readableArray);
                        C6409a.m24521c(readableArray2);
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = i4;
                            int i8 = readableArray6.getInt(i6);
                            int t = c.mo9524a(i8).mo9548t();
                            a1VarArr[i6] = new C2920a1(t, readableArray7.getInt(i6));
                            iArr[i6] = i8;
                            iArr2[i6] = t;
                            i6++;
                            readableArray6 = readableArray;
                            i4 = i7;
                            iArr3 = iArr3;
                            c = c;
                        }
                    }
                    C2931d0 d0Var = c;
                    int[] iArr4 = iArr3;
                    int i9 = i4;
                    if (size2 > 0) {
                        C6409a.m24521c(readableArray3);
                        C6409a.m24521c(readableArray4);
                        for (int i10 = 0; i10 < size2; i10++) {
                            a1VarArr[size + i10] = new C2920a1(readableArray8.getInt(i10), readableArray9.getInt(i10));
                        }
                    }
                    if (size3 > 0) {
                        C6409a.m24521c(readableArray5);
                        int i11 = 0;
                        while (i11 < size3) {
                            int i12 = readableArray10.getInt(i11);
                            C2931d0 d0Var2 = d0Var;
                            int t2 = d0Var2.mo9524a(i12).mo9548t();
                            int i13 = size + i11;
                            iArr[i13] = i12;
                            iArr2[i13] = t2;
                            iArr4[i11] = t2;
                            i11++;
                            d0Var = d0Var2;
                        }
                    }
                    C2931d0 d0Var3 = d0Var;
                    Arrays.sort(a1VarArr, C2920a1.f8198a);
                    Arrays.sort(iArr);
                    int i14 = i9 - 1;
                    int i15 = -1;
                    while (i14 >= 0) {
                        if (iArr[i14] != i15) {
                            d0Var3.mo9536h(iArr[i14]);
                            i15 = iArr[i14];
                            i14--;
                        } else {
                            throw new C2981h("Repeated indices in Removal list for view tag: " + i);
                        }
                    }
                    int i16 = 0;
                    while (true) {
                        int i17 = i5;
                        if (i16 < i17) {
                            C2920a1 a1Var = a1VarArr[i16];
                            int[] iArr5 = iArr2;
                            C2931d0 c2 = this.f8443d.mo9729c(a1Var.f8199b);
                            if (c2 != null) {
                                d0Var3.mo9509L(c2, a1Var.f8200c);
                                i16++;
                                iArr2 = iArr5;
                                i5 = i17;
                            } else {
                                throw new C2981h("Trying to add unknown view tag: " + a1Var.f8199b);
                            }
                        } else {
                            int[] iArr6 = iArr2;
                            this.f8446g.mo9800i(d0Var3, iArr, iArr6, a1VarArr, iArr4);
                            for (int i18 = 0; i18 < size3; i18++) {
                                mo9821M(this.f8443d.mo9729c(iArr4[i18]));
                            }
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        }
    }

    /* renamed from: v */
    public void mo9858v(int i, Callback callback) {
        if (this.f8450k) {
            this.f8445f.mo9882J(i, callback);
        }
    }

    /* renamed from: w */
    public void mo9859w(int i, Callback callback) {
        if (this.f8450k) {
            this.f8445f.mo9883K(i, callback);
        }
    }

    /* renamed from: x */
    public void mo9860x(int i, int i2, Callback callback, Callback callback2) {
        if (this.f8450k) {
            try {
                m12018y(i, i2, this.f8447h);
                callback2.invoke(Float.valueOf(C3038r.m12004a((float) this.f8447h[0])), Float.valueOf(C3038r.m12004a((float) this.f8447h[1])), Float.valueOf(C3038r.m12004a((float) this.f8447h[2])), Float.valueOf(C3038r.m12004a((float) this.f8447h[3])));
            } catch (C2981h e) {
                callback.invoke(e.getMessage());
            }
        }
    }

    /* renamed from: z */
    public void mo9861z(int i, Callback callback, Callback callback2) {
        if (this.f8450k) {
            try {
                m12011A(i, this.f8447h);
                callback2.invoke(Float.valueOf(C3038r.m12004a((float) this.f8447h[0])), Float.valueOf(C3038r.m12004a((float) this.f8447h[1])), Float.valueOf(C3038r.m12004a((float) this.f8447h[2])), Float.valueOf(C3038r.m12004a((float) this.f8447h[3])));
            } catch (C2981h e) {
                callback.invoke(e.getMessage());
            }
        }
    }
}
