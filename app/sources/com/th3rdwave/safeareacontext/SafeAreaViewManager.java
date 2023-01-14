package com.th3rdwave.safeareacontext;

import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C2962f0;
import com.facebook.react.uimanager.C3025n0;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.views.view.C3245g;
import com.facebook.react.views.view.ReactViewManager;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNCSafeAreaView")
public final class SafeAreaViewManager extends ReactViewManager {
    public static final C10102a Companion = new C10102a((C10452g) null);
    public static final String REACT_CLASS = "RNCSafeAreaView";

    /* renamed from: com.th3rdwave.safeareacontext.SafeAreaViewManager$a */
    public static final class C10102a {
        private C10102a() {
        }

        public /* synthetic */ C10102a(C10452g gVar) {
            this();
        }
    }

    public C10119p createShadowNodeInstance() {
        return new C10119p();
    }

    public C10115l createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "context");
        return new C10115l(o0Var);
    }

    /* access modifiers changed from: protected */
    public C2928c1<C3245g> getDelegate() {
        return null;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C10119p> getShadowNodeClass() {
        return C10119p.class;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r0.add(r1);
     */
    @com.facebook.react.uimanager.p120j1.C2991a(name = "edges")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setEdges(com.th3rdwave.safeareacontext.C10115l r6, com.facebook.react.bridge.ReadableArray r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            p455g.p470y.p472d.C10457l.m35320e(r6, r0)
            java.lang.Class<com.th3rdwave.safeareacontext.m> r0 = com.th3rdwave.safeareacontext.C10116m.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            if (r7 == 0) goto L_0x0059
            r1 = 0
            int r2 = r7.size()
        L_0x0012:
            if (r1 >= r2) goto L_0x0056
            int r3 = r1 + 1
            java.lang.String r1 = r7.getString(r1)
            int r4 = r1.hashCode()
            switch(r4) {
                case -1383228885: goto L_0x0046;
                case 115029: goto L_0x003a;
                case 3317767: goto L_0x002e;
                case 108511772: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0054
        L_0x0022:
            java.lang.String r4 = "right"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x002b
            goto L_0x0054
        L_0x002b:
            com.th3rdwave.safeareacontext.m r1 = com.th3rdwave.safeareacontext.C10116m.RIGHT
            goto L_0x0051
        L_0x002e:
            java.lang.String r4 = "left"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0037
            goto L_0x0054
        L_0x0037:
            com.th3rdwave.safeareacontext.m r1 = com.th3rdwave.safeareacontext.C10116m.LEFT
            goto L_0x0051
        L_0x003a:
            java.lang.String r4 = "top"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0043
            goto L_0x0054
        L_0x0043:
            com.th3rdwave.safeareacontext.m r1 = com.th3rdwave.safeareacontext.C10116m.TOP
            goto L_0x0051
        L_0x0046:
            java.lang.String r4 = "bottom"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x004f
            goto L_0x0054
        L_0x004f:
            com.th3rdwave.safeareacontext.m r1 = com.th3rdwave.safeareacontext.C10116m.BOTTOM
        L_0x0051:
            r0.add(r1)
        L_0x0054:
            r1 = r3
            goto L_0x0012
        L_0x0056:
            r6.setEdges(r0)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.th3rdwave.safeareacontext.SafeAreaViewManager.setEdges(com.th3rdwave.safeareacontext.l, com.facebook.react.bridge.ReadableArray):void");
    }

    @C2991a(name = "mode")
    public void setMode(C10115l lVar, String str) {
        C10118o oVar;
        C10457l.m35320e(lVar, "view");
        if (C10457l.m35316a(str, "padding")) {
            oVar = C10118o.PADDING;
        } else if (C10457l.m35316a(str, "margin")) {
            oVar = C10118o.MARGIN;
        } else {
            return;
        }
        lVar.setMode(oVar);
    }

    public Object updateState(C3245g gVar, C2962f0 f0Var, C3025n0 n0Var) {
        C10457l.m35320e(gVar, "view");
        ((C10115l) gVar).getFabricViewStateManager().mo9496e(n0Var);
        return null;
    }
}
