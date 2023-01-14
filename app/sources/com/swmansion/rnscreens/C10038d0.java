package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.view.C3245g;
import java.util.Objects;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import p455g.C10313k;
import p455g.C10323s;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.swmansion.rnscreens.d0 */
public final class C10038d0 extends C3245g {

    /* renamed from: F */
    private C10040b f26770F = C10040b.f26787f;

    /* renamed from: G */
    private C10039a f26771G = C10039a.NONE;

    /* renamed from: H */
    private Integer f26772H;

    /* renamed from: I */
    private Integer f26773I;

    /* renamed from: J */
    private Integer f26774J;

    /* renamed from: K */
    private Integer f26775K;

    /* renamed from: L */
    private String f26776L = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: M */
    private boolean f26777M = true;

    /* renamed from: N */
    private boolean f26778N;

    /* renamed from: O */
    private boolean f26779O = true;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C10049e0 f26780P;

    /* renamed from: Q */
    private boolean f26781Q;

    /* renamed from: com.swmansion.rnscreens.d0$a */
    public enum C10039a {
        NONE,
        WORDS,
        SENTENCES,
        CHARACTERS
    }

    /* renamed from: com.swmansion.rnscreens.d0$b */
    public enum C10040b {
        ;

        /* renamed from: com.swmansion.rnscreens.d0$b$a */
        static final class C10041a extends C10040b {
            C10041a(String str, int i) {
                super(str, i, (C10452g) null);
            }

            /* renamed from: g */
            public int mo25027g(C10039a aVar) {
                C10457l.m35320e(aVar, "capitalize");
                return 32;
            }
        }

        /* renamed from: com.swmansion.rnscreens.d0$b$b */
        static final class C10042b extends C10040b {
            C10042b(String str, int i) {
                super(str, i, (C10452g) null);
            }

            /* renamed from: g */
            public int mo25027g(C10039a aVar) {
                C10457l.m35320e(aVar, "capitalize");
                return 2;
            }
        }

        /* renamed from: com.swmansion.rnscreens.d0$b$c */
        static final class C10043c extends C10040b {
            C10043c(String str, int i) {
                super(str, i, (C10452g) null);
            }

            /* renamed from: g */
            public int mo25027g(C10039a aVar) {
                C10457l.m35320e(aVar, "capitalize");
                return 3;
            }
        }

        /* renamed from: com.swmansion.rnscreens.d0$b$d */
        static final class C10044d extends C10040b {

            /* renamed from: com.swmansion.rnscreens.d0$b$d$a */
            public /* synthetic */ class C10045a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f26792a = null;

                static {
                    int[] iArr = new int[C10039a.values().length];
                    iArr[C10039a.NONE.ordinal()] = 1;
                    iArr[C10039a.WORDS.ordinal()] = 2;
                    iArr[C10039a.SENTENCES.ordinal()] = 3;
                    iArr[C10039a.CHARACTERS.ordinal()] = 4;
                    f26792a = iArr;
                }
            }

            C10044d(String str, int i) {
                super(str, i, (C10452g) null);
            }

            /* renamed from: g */
            public int mo25027g(C10039a aVar) {
                C10457l.m35320e(aVar, "capitalize");
                int i = C10045a.f26792a[aVar.ordinal()];
                if (i == 1) {
                    return 1;
                }
                if (i == 2) {
                    return 8192;
                }
                if (i == 3) {
                    return Http2.INITIAL_MAX_FRAME_SIZE;
                }
                if (i == 4) {
                    return 4096;
                }
                throw new C10313k();
            }
        }

        /* renamed from: g */
        public abstract int mo25027g(C10039a aVar);
    }

    /* renamed from: com.swmansion.rnscreens.d0$c */
    static final class C10046c extends C10458m implements C10430l<C10076p, C10323s> {

        /* renamed from: f */
        final /* synthetic */ C10038d0 f26793f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10046c(C10038d0 d0Var) {
            super(1);
            this.f26793f = d0Var;
        }

        /* renamed from: a */
        public final void mo25028a(C10076p pVar) {
            ScreenStackFragment C;
            C10076p X1;
            C10457l.m35320e(pVar, "newSearchView");
            if (this.f26793f.f26780P == null) {
                this.f26793f.f26780P = new C10049e0(pVar);
            }
            this.f26793f.m34057U();
            if (this.f26793f.getAutoFocus() && (C = this.f26793f.getScreenStackFragment()) != null && (X1 = C.mo24906X1()) != null) {
                X1.mo25044o0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo25028a((C10076p) obj);
            return C10323s.f27547a;
        }
    }

    /* renamed from: com.swmansion.rnscreens.d0$d */
    public static final class C10047d implements SearchView.C0174l {

        /* renamed from: a */
        final /* synthetic */ C10038d0 f26794a;

        C10047d(C10038d0 d0Var) {
            this.f26794a = d0Var;
        }

        /* renamed from: a */
        public boolean mo1089a(String str) {
            this.f26794a.m34048K(str);
            return true;
        }

        /* renamed from: b */
        public boolean mo1090b(String str) {
            this.f26794a.m34049L(str);
            return true;
        }
    }

    public C10038d0(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: H */
    private final void m34045H() {
        m34053Q("onClose", (WritableMap) null);
    }

    /* renamed from: I */
    private final void m34046I(boolean z) {
        m34053Q(z ? "onFocus" : "onBlur", (WritableMap) null);
    }

    /* renamed from: J */
    private final void m34047J() {
        m34053Q("onOpen", (WritableMap) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m34048K(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", str);
        m34053Q("onChangeText", createMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m34049L(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", str);
        m34053Q("onSearchButtonPress", createMap);
    }

    /* renamed from: Q */
    private final void m34053Q(String str, WritableMap writableMap) {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class);
        if (rCTEventEmitter != null) {
            rCTEventEmitter.receiveEvent(getId(), str, writableMap);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static final void m34054R(C10038d0 d0Var, View view, boolean z) {
        C10457l.m35320e(d0Var, "this$0");
        d0Var.m34046I(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static final boolean m34055S(C10038d0 d0Var) {
        C10457l.m35320e(d0Var, "this$0");
        d0Var.m34045H();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static final void m34056T(C10038d0 d0Var, View view) {
        C10457l.m35320e(d0Var, "this$0");
        d0Var.m34047J();
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public final void m34057U() {
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        C10076p X1 = screenStackFragment != null ? screenStackFragment.mo24906X1() : null;
        if (X1 != null) {
            if (!this.f26781Q) {
                setSearchViewListeners(X1);
                this.f26781Q = true;
            }
            X1.setInputType(this.f26770F.mo25027g(this.f26771G));
            C10049e0 e0Var = this.f26780P;
            if (e0Var != null) {
                e0Var.mo25034h(this.f26772H);
            }
            C10049e0 e0Var2 = this.f26780P;
            if (e0Var2 != null) {
                e0Var2.mo25035i(this.f26773I);
            }
            C10049e0 e0Var3 = this.f26780P;
            if (e0Var3 != null) {
                e0Var3.mo25031e(this.f26774J);
            }
            C10049e0 e0Var4 = this.f26780P;
            if (e0Var4 != null) {
                e0Var4.mo25032f(this.f26775K);
            }
            C10049e0 e0Var5 = this.f26780P;
            if (e0Var5 != null) {
                e0Var5.mo25033g(this.f26776L, this.f26779O);
            }
            X1.setOverrideBackAction(this.f26777M);
        }
    }

    /* access modifiers changed from: private */
    public final ScreenStackFragment getScreenStackFragment() {
        C10097z config;
        ViewParent parent = getParent();
        if (!(parent instanceof C10028a0) || (config = ((C10028a0) parent).getConfig()) == null) {
            return null;
        }
        return config.getScreenFragment();
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new C10047d(this));
        searchView.setOnQueryTextFocusChangeListener(new C10074n(this));
        searchView.setOnCloseListener(new C10075o(this));
        searchView.setOnSearchClickListener(new C10073m(this));
    }

    /* renamed from: P */
    public final void mo25006P() {
        m34057U();
    }

    public final C10039a getAutoCapitalize() {
        return this.f26771G;
    }

    public final boolean getAutoFocus() {
        return this.f26778N;
    }

    public final Integer getHeaderIconColor() {
        return this.f26774J;
    }

    public final Integer getHintTextColor() {
        return this.f26775K;
    }

    public final C10040b getInputType() {
        return this.f26770F;
    }

    public final String getPlaceholder() {
        return this.f26776L;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f26777M;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f26779O;
    }

    public final Integer getTextColor() {
        return this.f26772H;
    }

    public final Integer getTintColor() {
        return this.f26773I;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.mo24908a2(new C10046c(this));
        }
    }

    public final void setAutoCapitalize(C10039a aVar) {
        C10457l.m35320e(aVar, "<set-?>");
        this.f26771G = aVar;
    }

    public final void setAutoFocus(boolean z) {
        this.f26778N = z;
    }

    public final void setHeaderIconColor(Integer num) {
        this.f26774J = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f26775K = num;
    }

    public final void setInputType(C10040b bVar) {
        C10457l.m35320e(bVar, "<set-?>");
        this.f26770F = bVar;
    }

    public final void setPlaceholder(String str) {
        C10457l.m35320e(str, "<set-?>");
        this.f26776L = str;
    }

    public final void setShouldOverrideBackButton(boolean z) {
        this.f26777M = z;
    }

    public final void setShouldShowHintSearchIcon(boolean z) {
        this.f26779O = z;
    }

    public final void setTextColor(Integer num) {
        this.f26772H = num;
    }

    public final void setTintColor(Integer num) {
        this.f26773I = num;
    }
}
