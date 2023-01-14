package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0058a;
import androidx.appcompat.app.C0064c;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.C3200u;
import com.swmansion.rnscreens.C10028a0;
import java.util.ArrayList;
import java.util.Objects;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.z */
public final class C10097z extends ViewGroup {

    /* renamed from: A */
    private boolean f26908A;

    /* renamed from: B */
    private boolean f26909B;

    /* renamed from: C */
    private boolean f26910C = true;

    /* renamed from: D */
    private boolean f26911D;

    /* renamed from: E */
    private int f26912E;

    /* renamed from: F */
    private boolean f26913F;

    /* renamed from: G */
    private final int f26914G;

    /* renamed from: H */
    private final int f26915H;

    /* renamed from: I */
    private final View.OnClickListener f26916I = new C10050f(this);

    /* renamed from: f */
    private final ArrayList<C10028a0> f26917f = new ArrayList<>(3);

    /* renamed from: o */
    private final C10078q f26918o;

    /* renamed from: p */
    private Integer f26919p;

    /* renamed from: q */
    private String f26920q;

    /* renamed from: r */
    private int f26921r;

    /* renamed from: s */
    private String f26922s;

    /* renamed from: t */
    private String f26923t;

    /* renamed from: u */
    private float f26924u;

    /* renamed from: v */
    private int f26925v;

    /* renamed from: w */
    private Integer f26926w;

    /* renamed from: x */
    private boolean f26927x;

    /* renamed from: y */
    private boolean f26928y;

    /* renamed from: z */
    private boolean f26929z;

    /* renamed from: com.swmansion.rnscreens.z$a */
    public /* synthetic */ class C10098a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26930a;

        static {
            int[] iArr = new int[C10028a0.C10029a.values().length];
            iArr[C10028a0.C10029a.LEFT.ordinal()] = 1;
            iArr[C10028a0.C10029a.RIGHT.ordinal()] = 2;
            iArr[C10028a0.C10029a.CENTER.ordinal()] = 3;
            f26930a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10097z(Context context) {
        super(context);
        C10457l.m35320e(context, "context");
        setVisibility(8);
        C10078q qVar = new C10078q(context, this);
        this.f26918o = qVar;
        this.f26914G = qVar.getContentInsetStart();
        this.f26915H = qVar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C10082u.f26834a, typedValue, true)) {
            qVar.setBackgroundColor(typedValue.data);
        }
        qVar.setClipChildren(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m34179e(C10097z zVar, View view) {
        C10457l.m35320e(zVar, "this$0");
        ScreenStackFragment screenFragment = zVar.getScreenFragment();
        if (screenFragment != null) {
            C10093y screenStack = zVar.getScreenStack();
            if (screenStack != null && C10457l.m35316a(screenStack.getRootScreen(), screenFragment.mo24892I1())) {
                Fragment C = screenFragment.mo3842C();
                if (C instanceof ScreenStackFragment) {
                    ScreenStackFragment screenStackFragment = (ScreenStackFragment) C;
                    if (screenStackFragment.mo24892I1().getNativeBackButtonDismissalEnabled()) {
                        screenStackFragment.mo24905W1();
                    } else {
                        screenStackFragment.mo24901z1();
                    }
                }
            } else if (screenFragment.mo24892I1().getNativeBackButtonDismissalEnabled()) {
                screenFragment.mo24905W1();
            } else {
                screenFragment.mo24901z1();
            }
        }
    }

    /* renamed from: f */
    private final void m34180f() {
        if (getParent() != null && !this.f26908A) {
            mo25128g();
        }
    }

    private final C10084w getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof C10084w) {
            return (C10084w) parent;
        }
        return null;
    }

    private final C10093y getScreenStack() {
        C10084w screen = getScreen();
        C10091x container = screen != null ? screen.getContainer() : null;
        if (container instanceof C10093y) {
            return (C10093y) container;
        }
        return null;
    }

    private final TextView getTitleTextView() {
        int childCount = this.f26918o.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f26918o.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (C10457l.m35316a(textView.getText(), this.f26918o.getTitle())) {
                    return textView;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    private final void m34181j(String str, WritableMap writableMap) {
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class);
        if (rCTEventEmitter != null) {
            rCTEventEmitter.receiveEvent(getId(), str, writableMap);
        }
    }

    /* renamed from: a */
    public final void mo25125a(C10028a0 a0Var, int i) {
        C10457l.m35320e(a0Var, "child");
        this.f26917f.add(i, a0Var);
        m34180f();
    }

    /* renamed from: b */
    public final void mo25126b() {
        this.f26908A = true;
    }

    /* renamed from: c */
    public final C10028a0 mo25127c(int i) {
        C10028a0 a0Var = this.f26917f.get(i);
        C10457l.m35319d(a0Var, "mConfigSubviews[index]");
        return a0Var;
    }

    /* renamed from: g */
    public final void mo25128g() {
        int i;
        Drawable navigationIcon;
        ScreenStackFragment screenFragment;
        ScreenStackFragment screenFragment2;
        ReactContext reactContext;
        C10093y screenStack = getScreenStack();
        boolean z = screenStack == null || C10457l.m35316a(screenStack.getTopScreen(), getParent());
        if (this.f26913F && z && !this.f26908A) {
            ScreenStackFragment screenFragment3 = getScreenFragment();
            C0064c cVar = (C0064c) (screenFragment3 != null ? screenFragment3.mo3909l() : null);
            if (cVar != null) {
                String str = this.f26923t;
                if (str != null) {
                    if (C10457l.m35316a(str, "rtl")) {
                        this.f26918o.setLayoutDirection(1);
                    } else if (C10457l.m35316a(this.f26923t, "ltr")) {
                        this.f26918o.setLayoutDirection(0);
                    }
                }
                C10084w screen = getScreen();
                if (screen != null) {
                    if (getContext() instanceof ReactContext) {
                        Context context = getContext();
                        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        reactContext = (ReactContext) context;
                    } else {
                        ScreenFragment fragment = screen.getFragment();
                        reactContext = fragment != null ? fragment.mo24899S1() : null;
                    }
                    C10031b0.f26755a.mo25003v(screen, cVar, reactContext);
                }
                if (!this.f26927x) {
                    if (this.f26918o.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                        screenFragment.mo24909b2(this.f26918o);
                    }
                    if (this.f26910C) {
                        Integer num = this.f26919p;
                        this.f26918o.setPadding(0, num != null ? num.intValue() : 0, 0, 0);
                    } else if (this.f26918o.getPaddingTop() > 0) {
                        this.f26918o.setPadding(0, 0, 0, 0);
                    }
                    cVar.mo227I(this.f26918o);
                    C0058a B = cVar.mo221B();
                    if (B != null) {
                        C10457l.m35319d(B, "requireNotNull(activity.supportActionBar)");
                        this.f26918o.setContentInsetStartWithNavigation(this.f26915H);
                        C10078q qVar = this.f26918o;
                        int i2 = this.f26914G;
                        qVar.mo1108H(i2, i2);
                        ScreenStackFragment screenFragment4 = getScreenFragment();
                        B.mo194s((screenFragment4 != null && screenFragment4.mo24904V1()) && !this.f26928y);
                        this.f26918o.setNavigationOnClickListener(this.f26916I);
                        ScreenStackFragment screenFragment5 = getScreenFragment();
                        if (screenFragment5 != null) {
                            screenFragment5.mo24910c2(this.f26929z);
                        }
                        ScreenStackFragment screenFragment6 = getScreenFragment();
                        if (screenFragment6 != null) {
                            screenFragment6.mo24911d2(this.f26911D);
                        }
                        B.mo198w(this.f26920q);
                        if (TextUtils.isEmpty(this.f26920q)) {
                            this.f26918o.setContentInsetStartWithNavigation(0);
                        }
                        TextView titleTextView = getTitleTextView();
                        int i3 = this.f26921r;
                        if (i3 != 0) {
                            this.f26918o.setTitleTextColor(i3);
                        }
                        if (titleTextView != null) {
                            String str2 = this.f26922s;
                            if (str2 != null || this.f26925v > 0) {
                                Typeface a = C3200u.m12520a((Typeface) null, 0, this.f26925v, str2, getContext().getAssets());
                                C10457l.m35319d(a, "applyStyles(\n           ….assets\n                )");
                                titleTextView.setTypeface(a);
                            }
                            float f = this.f26924u;
                            if (f > 0.0f) {
                                titleTextView.setTextSize(f);
                            }
                        }
                        Integer num2 = this.f26926w;
                        if (num2 != null) {
                            this.f26918o.setBackgroundColor(num2.intValue());
                        }
                        if (!(this.f26912E == 0 || (navigationIcon = this.f26918o.getNavigationIcon()) == null)) {
                            navigationIcon.setColorFilter(this.f26912E, PorterDuff.Mode.SRC_ATOP);
                        }
                        for (int childCount = this.f26918o.getChildCount() - 1; -1 < childCount; childCount--) {
                            if (this.f26918o.getChildAt(childCount) instanceof C10028a0) {
                                this.f26918o.removeViewAt(childCount);
                            }
                        }
                        int size = this.f26917f.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C10028a0 a0Var = this.f26917f.get(i4);
                            C10457l.m35319d(a0Var, "mConfigSubviews[i]");
                            C10028a0 a0Var2 = a0Var;
                            C10028a0.C10029a type = a0Var2.getType();
                            if (type == C10028a0.C10029a.BACK) {
                                View childAt = a0Var2.getChildAt(0);
                                ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                                if (imageView != null) {
                                    B.mo196u(imageView.getDrawable());
                                } else {
                                    throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                                }
                            } else {
                                Toolbar.C0184e eVar = new Toolbar.C0184e(-2, -1);
                                int i5 = C10098a.f26930a[type.ordinal()];
                                if (i5 == 1) {
                                    if (!this.f26909B) {
                                        this.f26918o.setNavigationIcon((Drawable) null);
                                    }
                                    this.f26918o.setTitle((CharSequence) null);
                                    i = 8388611;
                                } else if (i5 != 2) {
                                    if (i5 == 3) {
                                        eVar.width = -1;
                                        eVar.f215a = 1;
                                        this.f26918o.setTitle((CharSequence) null);
                                    }
                                    a0Var2.setLayoutParams(eVar);
                                    this.f26918o.addView(a0Var2);
                                } else {
                                    i = 8388613;
                                }
                                eVar.f215a = i;
                                a0Var2.setLayoutParams(eVar);
                                this.f26918o.addView(a0Var2);
                            }
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (this.f26918o.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                    screenFragment2.mo24907Z1();
                }
            }
        }
    }

    public final int getConfigSubviewsCount() {
        return this.f26917f.size();
    }

    public final ScreenStackFragment getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof C10084w)) {
            return null;
        }
        ScreenFragment fragment = ((C10084w) parent).getFragment();
        if (fragment instanceof ScreenStackFragment) {
            return (ScreenStackFragment) fragment;
        }
        return null;
    }

    public final C10078q getToolbar() {
        return this.f26918o;
    }

    /* renamed from: h */
    public final void mo25132h() {
        this.f26917f.clear();
        m34180f();
    }

    /* renamed from: i */
    public final void mo25133i(int i) {
        this.f26917f.remove(i);
        m34180f();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26913F = true;
        m34181j("onAttached", (WritableMap) null);
        if (this.f26919p == null) {
            this.f26919p = Integer.valueOf(Build.VERSION.SDK_INT >= 23 ? getRootWindowInsets().getSystemWindowInsetTop() : (int) (((float) 25) * getResources().getDisplayMetrics().density));
        }
        mo25128g();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26913F = false;
        m34181j("onDetached", (WritableMap) null);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setBackButtonInCustomView(boolean z) {
        this.f26909B = z;
    }

    public final void setBackgroundColor(Integer num) {
        this.f26926w = num;
    }

    public final void setDirection(String str) {
        this.f26923t = str;
    }

    public final void setHidden(boolean z) {
        this.f26927x = z;
    }

    public final void setHideBackButton(boolean z) {
        this.f26928y = z;
    }

    public final void setHideShadow(boolean z) {
        this.f26929z = z;
    }

    public final void setTintColor(int i) {
        this.f26912E = i;
    }

    public final void setTitle(String str) {
        this.f26920q = str;
    }

    public final void setTitleColor(int i) {
        this.f26921r = i;
    }

    public final void setTitleFontFamily(String str) {
        this.f26922s = str;
    }

    public final void setTitleFontSize(float f) {
        this.f26924u = f;
    }

    public final void setTitleFontWeight(String str) {
        this.f26925v = C3200u.m12523d(str);
    }

    public final void setTopInsetEnabled(boolean z) {
        this.f26910C = z;
    }

    public final void setTranslucent(boolean z) {
        this.f26911D = z;
    }
}
