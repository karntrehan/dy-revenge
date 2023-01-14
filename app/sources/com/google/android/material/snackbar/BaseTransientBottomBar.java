package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C4273g;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C4302b;
import java.util.List;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1929e0;
import p027c.p064i.p072j.C1984p;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9017d;
import p174e.p319f.p320a.p363d.C9021h;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p366l.C9025a;
import p174e.p319f.p320a.p363d.p372q.C9052a;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    static final Handler f12122a = new Handler(Looper.getMainLooper(), new C4284i());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final boolean f12123b;

    /* renamed from: c */
    private static final int[] f12124c = {C9013b.snackbarStyle};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f12125d = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: e */
    private final ViewGroup f12126e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f12127f;

    /* renamed from: g */
    protected final C4298v f12128g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4301a f12129h;

    /* renamed from: i */
    private int f12130i;

    /* renamed from: j */
    private boolean f12131j;

    /* renamed from: k */
    private View f12132k;

    /* renamed from: l */
    private final Runnable f12133l = new C4285j();

    /* renamed from: m */
    private Rect f12134m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f12135n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f12136o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f12137p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f12138q;

    /* renamed from: r */
    private int f12139r;

    /* renamed from: s */
    private List<C4294r<B>> f12140s;

    /* renamed from: t */
    private Behavior f12141t;

    /* renamed from: u */
    private final AccessibilityManager f12142u;

    /* renamed from: v */
    C4302b.C4304b f12143v = new C4288m();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C4295s f12144k = new C4295s(this);

        /* access modifiers changed from: private */
        /* renamed from: O */
        public void m16483O(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f12144k.mo13553c(baseTransientBottomBar);
        }

        /* renamed from: E */
        public boolean mo12673E(View view) {
            return this.f12144k.mo13551a(view);
        }

        /* renamed from: k */
        public boolean mo3483k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f12144k.mo13552b(coordinatorLayout, view, motionEvent);
            return super.mo3483k(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C4276a extends AnimatorListenerAdapter {
        C4276a() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo13520I();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    class C4277b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f12146a;

        C4277b(int i) {
            this.f12146a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo13519H(this.f12146a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    class C4278c implements ValueAnimator.AnimatorUpdateListener {
        C4278c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f12128g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    class C4279d implements ValueAnimator.AnimatorUpdateListener {
        C4279d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f12128g.setScaleX(floatValue);
            BaseTransientBottomBar.this.f12128g.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    class C4280e extends AnimatorListenerAdapter {
        C4280e() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo13520I();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f12129h.mo13570a(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    class C4281f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f12151a;

        /* renamed from: b */
        final /* synthetic */ int f12152b;

        C4281f(int i) {
            this.f12152b = i;
            this.f12151a = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f12123b) {
                C1988t.m8367Y(BaseTransientBottomBar.this.f12128g, intValue - this.f12151a);
            } else {
                BaseTransientBottomBar.this.f12128g.setTranslationY((float) intValue);
            }
            this.f12151a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    class C4282g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f12154a;

        C4282g(int i) {
            this.f12154a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo13519H(this.f12154a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f12129h.mo13571b(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    class C4283h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f12156a = 0;

        C4283h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f12123b) {
                C1988t.m8367Y(BaseTransientBottomBar.this.f12128g, intValue - this.f12156a);
            } else {
                BaseTransientBottomBar.this.f12128g.setTranslationY((float) intValue);
            }
            this.f12156a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    static class C4284i implements Handler.Callback {
        C4284i() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo13524O();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo13517E(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    class C4285j implements Runnable {
        C4285j() {
        }

        public void run() {
            int b;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f12128g != null && baseTransientBottomBar.f12127f != null && (b = (BaseTransientBottomBar.this.m16466z() - BaseTransientBottomBar.this.m16436C()) + ((int) BaseTransientBottomBar.this.f12128g.getTranslationY())) < BaseTransientBottomBar.this.f12138q) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f12128g.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f12125d, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f12138q - b;
                BaseTransientBottomBar.this.f12128g.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C4286k implements C1984p {
        C4286k() {
        }

        /* renamed from: a */
        public C1929e0 mo319a(View view, C1929e0 e0Var) {
            int unused = BaseTransientBottomBar.this.f12135n = e0Var.mo6488h();
            int unused2 = BaseTransientBottomBar.this.f12136o = e0Var.mo6490i();
            int unused3 = BaseTransientBottomBar.this.f12137p = e0Var.mo6491j();
            BaseTransientBottomBar.this.m16445U();
            return e0Var;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    class C4287l extends C1904a {
        C4287l() {
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            super.mo3776g(view, cVar);
            cVar.mo6577a(1048576);
            cVar.mo6589g0(true);
        }

        /* renamed from: j */
        public boolean mo3777j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo3777j(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo13526t();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    class C4288m implements C4302b.C4304b {
        C4288m() {
        }

        /* renamed from: a */
        public void mo13542a() {
            Handler handler = BaseTransientBottomBar.f12122a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        /* renamed from: b */
        public void mo13543b(int i) {
            Handler handler = BaseTransientBottomBar.f12122a;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    class C4289n implements C4296t {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n$a */
        class C4290a implements Runnable {
            C4290a() {
            }

            public void run() {
                BaseTransientBottomBar.this.mo13519H(3);
            }
        }

        C4289n() {
        }

        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f12128g.getRootWindowInsets()) != null) {
                int unused = BaseTransientBottomBar.this.f12138q = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.m16445U();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.mo13518F()) {
                BaseTransientBottomBar.f12122a.post(new C4290a());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    class C4291o implements C4297u {
        C4291o() {
        }

        /* renamed from: a */
        public void mo13547a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f12128g.setOnLayoutChangeListener((C4297u) null);
            BaseTransientBottomBar.this.m16440P();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    class C4292p implements SwipeDismissBehavior.C4151b {
        C4292p() {
        }

        /* renamed from: a */
        public void mo12678a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.mo13527u(0);
        }

        /* renamed from: b */
        public void mo12679b(int i) {
            if (i == 0) {
                C4302b.m16517c().mo13583k(BaseTransientBottomBar.this.f12143v);
            } else if (i == 1 || i == 2) {
                C4302b.m16517c().mo13582j(BaseTransientBottomBar.this.f12143v);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    class C4293q implements Runnable {
        C4293q() {
        }

        public void run() {
            C4298v vVar = BaseTransientBottomBar.this.f12128g;
            if (vVar != null) {
                vVar.setVisibility(0);
                if (BaseTransientBottomBar.this.f12128g.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.m16441Q();
                } else {
                    BaseTransientBottomBar.this.m16443S();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public static abstract class C4294r<B> {
        /* renamed from: a */
        public void mo13549a(B b, int i) {
        }

        /* renamed from: b */
        public void mo13550b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static class C4295s {

        /* renamed from: a */
        private C4302b.C4304b f12167a;

        public C4295s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo12676L(0.1f);
            swipeDismissBehavior.mo12674J(0.6f);
            swipeDismissBehavior.mo12677M(0);
        }

        /* renamed from: a */
        public boolean mo13551a(View view) {
            return view instanceof C4298v;
        }

        /* renamed from: b */
        public void mo13552b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C4302b.m16517c().mo13583k(this.f12167a);
                }
            } else if (coordinatorLayout.mo3417B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C4302b.m16517c().mo13582j(this.f12167a);
            }
        }

        /* renamed from: c */
        public void mo13553c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f12167a = baseTransientBottomBar.f12143v;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    protected interface C4296t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    protected interface C4297u {
        /* renamed from: a */
        void mo13547a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    protected static class C4298v extends FrameLayout {

        /* renamed from: f */
        private static final View.OnTouchListener f12168f = new C4299a();

        /* renamed from: o */
        private C4297u f12169o;

        /* renamed from: p */
        private C4296t f12170p;

        /* renamed from: q */
        private int f12171q;

        /* renamed from: r */
        private final float f12172r;

        /* renamed from: s */
        private final float f12173s;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v$a */
        static class C4299a implements View.OnTouchListener {
            C4299a() {
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C4298v(Context context, AttributeSet attributeSet) {
            super(C4273g.m16424f(context, attributeSet, 0, 0), attributeSet);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9024k.f24631T2);
            int i = C9024k.f24656Y2;
            if (obtainStyledAttributes.hasValue(i)) {
                C1988t.m8408t0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f12171q = obtainStyledAttributes.getInt(C9024k.f24646W2, 0);
            this.f12172r = obtainStyledAttributes.getFloat(C9024k.f24651X2, 1.0f);
            this.f12173s = obtainStyledAttributes.getFloat(C9024k.f24641V2, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f12168f);
            setFocusable(true);
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f12173s;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f12171q;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f12172r;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C4296t tVar = this.f12170p;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            C1988t.m8388j0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C4296t tVar = this.f12170p;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C4297u uVar = this.f12169o;
            if (uVar != null) {
                uVar.mo13547a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f12171q = i;
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(C4296t tVar) {
            this.f12170p = tVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f12168f);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(C4297u uVar) {
            this.f12169o = uVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f12123b = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, C4301a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f12126e = viewGroup;
            this.f12129h = aVar;
            Context context = viewGroup.getContext();
            this.f12127f = context;
            C4273g.m16419a(context);
            C4298v vVar = (C4298v) LayoutInflater.from(context).inflate(mo13515A(), viewGroup, false);
            this.f12128g = vVar;
            if (vVar.getBackground() == null) {
                C1988t.m8400p0(vVar, m16463s());
            }
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).mo13572c(vVar.getActionTextColorAlpha());
            }
            vVar.addView(view);
            ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f12134m = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C1988t.m8398o0(vVar, 1);
            C1988t.m8414w0(vVar, 1);
            C1988t.m8410u0(vVar, true);
            C1988t.m8334A0(vVar, new C4286k());
            C1988t.m8394m0(vVar, new C4287l());
            this.f12142u = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: B */
    private int m16435B() {
        int height = this.f12128g.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f12128g.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public int m16436C() {
        int[] iArr = new int[2];
        this.f12128g.getLocationOnScreen(iArr);
        return iArr[1] + this.f12128g.getHeight();
    }

    /* renamed from: G */
    private boolean m16437G() {
        ViewGroup.LayoutParams layoutParams = this.f12128g.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C1090f) && (((CoordinatorLayout.C1090f) layoutParams).mo3507f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: K */
    private void m16438K(CoordinatorLayout.C1090f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f12141t;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo13529x();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m16483O(this);
        }
        swipeDismissBehavior.mo12675K(new C4292p());
        fVar.mo3515o(swipeDismissBehavior);
        if (this.f12132k == null) {
            fVar.f3044g = 80;
        }
    }

    /* renamed from: M */
    private boolean m16439M() {
        return this.f12138q > 0 && !this.f12131j && m16437G();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m16440P() {
        if (mo13522L()) {
            mo13525p();
            return;
        }
        this.f12128g.setVisibility(0);
        mo13520I();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m16441Q() {
        ValueAnimator v = m16464v(0.0f, 1.0f);
        ValueAnimator y = m16465y(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{v, y});
        animatorSet.setDuration(150);
        animatorSet.addListener(new C4276a());
        animatorSet.start();
    }

    /* renamed from: R */
    private void m16442R(int i) {
        ValueAnimator v = m16464v(1.0f, 0.0f);
        v.setDuration(75);
        v.addListener(new C4277b(i));
        v.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m16443S() {
        int B = m16435B();
        if (f12123b) {
            C1988t.m8367Y(this.f12128g, B);
        } else {
            this.f12128g.setTranslationY((float) B);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{B, 0});
        valueAnimator.setInterpolator(C9025a.f24820b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C4280e());
        valueAnimator.addUpdateListener(new C4281f(B));
        valueAnimator.start();
    }

    /* renamed from: T */
    private void m16444T(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m16435B()});
        valueAnimator.setInterpolator(C9025a.f24820b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C4282g(i));
        valueAnimator.addUpdateListener(new C4283h());
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m16445U() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f12128g.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f12134m) == null) {
            Log.w(f12125d, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f12132k != null ? this.f12139r : this.f12135n);
        marginLayoutParams.leftMargin = rect.left + this.f12136o;
        marginLayoutParams.rightMargin = rect.right + this.f12137p;
        this.f12128g.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && m16439M()) {
            this.f12128g.removeCallbacks(this.f12133l);
            this.f12128g.post(this.f12133l);
        }
    }

    /* renamed from: q */
    private void m16461q(int i) {
        if (this.f12128g.getAnimationMode() == 1) {
            m16442R(i);
        } else {
            m16444T(i);
        }
    }

    /* renamed from: r */
    private int m16462r() {
        View view = this.f12132k;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f12126e.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f12126e.getHeight()) - i;
    }

    /* renamed from: s */
    private Drawable m16463s() {
        C4298v vVar = this.f12128g;
        int g = C9052a.m30176g(vVar, C9013b.colorSurface, C9013b.colorOnSurface, vVar.getBackgroundOverlayColorAlpha());
        float dimension = this.f12128g.getResources().getDimension(C9017d.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(g);
        gradientDrawable.setCornerRadius(dimension);
        return gradientDrawable;
    }

    /* renamed from: v */
    private ValueAnimator m16464v(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C9025a.f24819a);
        ofFloat.addUpdateListener(new C4278c());
        return ofFloat;
    }

    /* renamed from: y */
    private ValueAnimator m16465y(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C9025a.f24822d);
        ofFloat.addUpdateListener(new C4279d());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public int m16466z() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f12127f.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo13515A() {
        return mo13516D() ? C9021h.mtrl_layout_snackbar : C9021h.design_layout_snackbar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo13516D() {
        TypedArray obtainStyledAttributes = this.f12127f.obtainStyledAttributes(f12124c);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo13517E(int i) {
        if (!mo13522L() || this.f12128g.getVisibility() != 0) {
            mo13519H(i);
        } else {
            m16461q(i);
        }
    }

    /* renamed from: F */
    public boolean mo13518F() {
        return C4302b.m16517c().mo13579e(this.f12143v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo13519H(int i) {
        C4302b.m16517c().mo13580h(this.f12143v);
        List<C4294r<B>> list = this.f12140s;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f12140s.get(size).mo13549a(this, i);
            }
        }
        ViewParent parent = this.f12128g.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f12128g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo13520I() {
        C4302b.m16517c().mo13581i(this.f12143v);
        List<C4294r<B>> list = this.f12140s;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f12140s.get(size).mo13550b(this);
            }
        }
    }

    /* renamed from: J */
    public B mo13521J(int i) {
        this.f12130i = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo13522L() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f12142u.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: N */
    public void mo13523N() {
        C4302b.m16517c().mo13584m(mo13528w(), this.f12143v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo13524O() {
        this.f12128g.setOnAttachStateChangeListener(new C4289n());
        if (this.f12128g.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f12128g.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C1090f) {
                m16438K((CoordinatorLayout.C1090f) layoutParams);
            }
            this.f12139r = m16462r();
            m16445U();
            this.f12128g.setVisibility(4);
            this.f12126e.addView(this.f12128g);
        }
        if (C1988t.m8361S(this.f12128g)) {
            m16440P();
        } else {
            this.f12128g.setOnLayoutChangeListener(new C4291o());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo13525p() {
        this.f12128g.post(new C4293q());
    }

    /* renamed from: t */
    public void mo13526t() {
        mo13527u(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo13527u(int i) {
        C4302b.m16517c().mo13577b(this.f12143v, i);
    }

    /* renamed from: w */
    public int mo13528w() {
        return this.f12130i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public SwipeDismissBehavior<? extends View> mo13529x() {
        return new Behavior();
    }
}
