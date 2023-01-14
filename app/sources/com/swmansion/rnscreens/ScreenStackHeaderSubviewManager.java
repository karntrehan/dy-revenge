package com.swmansion.rnscreens;

import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2751s;
import com.facebook.react.p115e0.C2752t;
import com.facebook.react.uimanager.C2928c1;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNSScreenStackHeaderSubview")
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<C10028a0> implements C2752t<C10028a0> {
    public static final C10023a Companion = new C10023a((C10452g) null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";
    private final C2928c1<C10028a0> mDelegate = new C2751s(this);

    /* renamed from: com.swmansion.rnscreens.ScreenStackHeaderSubviewManager$a */
    public static final class C10023a {
        private C10023a() {
        }

        public /* synthetic */ C10023a(C10452g gVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public C10028a0 createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "context");
        return new C10028a0(o0Var);
    }

    /* access modifiers changed from: protected */
    public C2928c1<C10028a0> getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r3.setType(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        return;
     */
    @com.facebook.react.uimanager.p120j1.C2991a(name = "type")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setType(com.swmansion.rnscreens.C10028a0 r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            if (r4 == 0) goto L_0x0049
            int r0 = r4.hashCode()
            switch(r0) {
                case -1364013995: goto L_0x003b;
                case 3015911: goto L_0x0030;
                case 3317767: goto L_0x0025;
                case 108511772: goto L_0x001a;
                case 1778179403: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0049
        L_0x000f:
            java.lang.String r0 = "searchBar"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            com.swmansion.rnscreens.a0$a r4 = com.swmansion.rnscreens.C10028a0.C10029a.SEARCH_BAR
            goto L_0x0045
        L_0x001a:
            java.lang.String r0 = "right"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            com.swmansion.rnscreens.a0$a r4 = com.swmansion.rnscreens.C10028a0.C10029a.RIGHT
            goto L_0x0045
        L_0x0025:
            java.lang.String r0 = "left"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            com.swmansion.rnscreens.a0$a r4 = com.swmansion.rnscreens.C10028a0.C10029a.LEFT
            goto L_0x0045
        L_0x0030:
            java.lang.String r0 = "back"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            com.swmansion.rnscreens.a0$a r4 = com.swmansion.rnscreens.C10028a0.C10029a.BACK
            goto L_0x0045
        L_0x003b:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0049
            com.swmansion.rnscreens.a0$a r4 = com.swmansion.rnscreens.C10028a0.C10029a.CENTER
        L_0x0045:
            r3.setType(r4)
            return
        L_0x0049:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenStackHeaderSubviewManager.setType(com.swmansion.rnscreens.a0, java.lang.String):void");
    }
}
