package com.th3rdwave.safeareacontext;

import com.facebook.react.p109b0.p110a.C2639a;
import com.facebook.react.p115e0.C2743k;
import com.facebook.react.uimanager.C3031o0;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import p455g.C10320p;
import p455g.C10323s;
import p455g.p470y.p471c.C10435q;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10455j;
import p455g.p470y.p472d.C10457l;

@C2639a(name = "RNCSafeAreaProvider")
public final class SafeAreaProviderManager extends ViewGroupManager<C10112i> {
    public static final C10100a Companion = new C10100a((C10452g) null);
    public static final String REACT_CLASS = "RNCSafeAreaProvider";
    private final C2743k<C10112i, SafeAreaProviderManager> mDelegate = new C2743k<>(this);

    /* renamed from: com.th3rdwave.safeareacontext.SafeAreaProviderManager$a */
    public static final class C10100a {
        private C10100a() {
        }

        public /* synthetic */ C10100a(C10452g gVar) {
            this();
        }
    }

    /* renamed from: com.th3rdwave.safeareacontext.SafeAreaProviderManager$b */
    /* synthetic */ class C10101b extends C10455j implements C10435q<C10112i, C10107e, C10110g, C10323s> {

        /* renamed from: p */
        public static final C10101b f26931p = new C10101b();

        C10101b() {
            super(3, C10113j.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);
        }

        /* renamed from: c */
        public final void mo25153c(C10112i iVar, C10107e eVar, C10110g gVar) {
            C10457l.m35320e(iVar, "p0");
            C10457l.m35320e(eVar, "p1");
            C10457l.m35320e(gVar, "p2");
            C10113j.m34209b(iVar, eVar, gVar);
        }

        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo25154f(Object obj, Object obj2, Object obj3) {
            mo25153c((C10112i) obj, (C10107e) obj2, (C10110g) obj3);
            return C10323s.f27547a;
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C3031o0 o0Var, C10112i iVar) {
        C10457l.m35320e(o0Var, "reactContext");
        C10457l.m35320e(iVar, "view");
        super.addEventEmitters(o0Var, iVar);
        iVar.setOnInsetsChangeHandler(C10101b.f26931p);
    }

    public C10112i createViewInstance(C3031o0 o0Var) {
        C10457l.m35320e(o0Var, "context");
        return new C10112i(o0Var);
    }

    /* access modifiers changed from: protected */
    public C2743k<C10112i, SafeAreaProviderManager> getDelegate() {
        return this.mDelegate;
    }

    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return C10334c0.m35036f(C10320p.m35019a("topInsetsChange", C10334c0.m35036f(C10320p.m35019a("registrationName", "onInsetsChange"))));
    }

    public String getName() {
        return REACT_CLASS;
    }
}
