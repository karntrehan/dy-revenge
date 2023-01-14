package com.facebook.react.uimanager;

import com.facebook.react.common.C2693e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.e1 */
public final class C2941e1 {

    /* renamed from: a */
    private final Map<String, ViewManager> f8237a;

    /* renamed from: b */
    private final C2963f1 f8238b;

    public C2941e1(C2963f1 f1Var) {
        this.f8237a = C2693e.m10912b();
        this.f8238b = f1Var;
    }

    public C2941e1(List<ViewManager> list) {
        HashMap b = C2693e.m10912b();
        for (ViewManager next : list) {
            b.put(next.getName(), next);
        }
        this.f8237a = b;
        this.f8238b = null;
    }

    /* renamed from: b */
    private ViewManager m11707b(String str) {
        ViewManager b = this.f8238b.mo8386b(str);
        if (b != null) {
            this.f8237a.put(str, b);
        }
        return b;
    }

    /* renamed from: a */
    public ViewManager mo9624a(String str) {
        ViewManager viewManager = this.f8237a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f8238b != null) {
            ViewManager b = m11707b(str);
            if (b != null) {
                return b;
            }
            throw new C2981h("ViewManagerResolver returned null for " + str + ", existing names are: " + this.f8238b.mo8385a());
        }
        throw new C2981h("No ViewManager found for class " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ViewManager mo9625c(String str) {
        ViewManager viewManager = this.f8237a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f8238b != null) {
            return m11707b(str);
        }
        return null;
    }
}
