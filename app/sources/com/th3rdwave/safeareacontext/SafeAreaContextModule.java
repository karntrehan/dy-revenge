package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.C2693e;
import com.facebook.react.p109b0.p110a.C2639a;
import java.util.Map;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNCSafeAreaContext")
public final class SafeAreaContextModule extends NativeSafeAreaContextSpec {
    public static final C10099a Companion = new C10099a((C10452g) null);
    public static final String NAME = "RNCSafeAreaContext";

    /* renamed from: com.th3rdwave.safeareacontext.SafeAreaContextModule$a */
    public static final class C10099a {
        private C10099a() {
        }

        public /* synthetic */ C10099a(C10452g gVar) {
            this();
        }
    }

    public SafeAreaContextModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r0 = r0.getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<java.lang.String, java.lang.Object> getInitialWindowMetrics() {
        /*
            r5 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r5.getReactApplicationContext()
            android.app.Activity r0 = r0.getCurrentActivity()
            r1 = 0
            if (r0 != 0) goto L_0x000d
        L_0x000b:
            r0 = r1
            goto L_0x0018
        L_0x000d:
            android.view.Window r0 = r0.getWindow()
            if (r0 != 0) goto L_0x0014
            goto L_0x000b
        L_0x0014:
            android.view.View r0 = r0.getDecorView()
        L_0x0018:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x001e
            r2 = r1
            goto L_0x0025
        L_0x001e:
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r0.findViewById(r2)
        L_0x0025:
            if (r2 != 0) goto L_0x0028
            return r1
        L_0x0028:
            com.th3rdwave.safeareacontext.e r3 = com.th3rdwave.safeareacontext.C10114k.m34215f(r0)
            com.th3rdwave.safeareacontext.g r0 = com.th3rdwave.safeareacontext.C10114k.m34210a(r0, r2)
            if (r3 == 0) goto L_0x0056
            if (r0 != 0) goto L_0x0035
            goto L_0x0056
        L_0x0035:
            r1 = 2
            g.l[] r1 = new p455g.C10314l[r1]
            r2 = 0
            java.util.Map r3 = com.th3rdwave.safeareacontext.C10120q.m34235a(r3)
            java.lang.String r4 = "insets"
            g.l r3 = p455g.C10320p.m35019a(r4, r3)
            r1[r2] = r3
            r2 = 1
            java.util.Map r0 = com.th3rdwave.safeareacontext.C10120q.m34237c(r0)
            java.lang.String r3 = "frame"
            g.l r0 = p455g.C10320p.m35019a(r3, r0)
            r1[r2] = r0
            java.util.Map r1 = p455g.p460t.C10334c0.m35035e(r1)
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.th3rdwave.safeareacontext.SafeAreaContextModule.getInitialWindowMetrics():java.util.Map");
    }

    public String getName() {
        return NAME;
    }

    public Map<String, Object> getTypedExportedConstants() {
        Map<String, Object> d = C2693e.m10914d("initialWindowMetrics", getInitialWindowMetrics());
        C10457l.m35319d(d, "of<String, Any>(\"initial…etInitialWindowMetrics())");
        return d;
    }
}
