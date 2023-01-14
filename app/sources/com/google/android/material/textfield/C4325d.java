package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9017d;
import p174e.p319f.p320a.p363d.C9018e;
import p174e.p319f.p320a.p363d.C9022i;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p366l.C9025a;
import p174e.p319f.p320a.p363d.p372q.C9052a;

/* renamed from: com.google.android.material.textfield.d */
class C4325d extends C4336e {

    /* renamed from: d */
    private static final boolean f12280d = (Build.VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final TextWatcher f12281e = new C4326a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final TextInputLayout.C4310e f12282f = new C4328b(this.f12304a);

    /* renamed from: g */
    private final TextInputLayout.C4311f f12283g = new C4329c();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f12284h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f12285i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f12286j = Long.MAX_VALUE;

    /* renamed from: k */
    private StateListDrawable f12287k;

    /* renamed from: l */
    private C8990g f12288l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public AccessibilityManager f12289m;

    /* renamed from: n */
    private ValueAnimator f12290n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ValueAnimator f12291o;

    /* renamed from: com.google.android.material.textfield.d$a */
    class C4326a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        class C4327a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ AutoCompleteTextView f12293f;

            C4327a(AutoCompleteTextView autoCompleteTextView) {
                this.f12293f = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f12293f.isPopupShowing();
                C4325d.this.m16641z(isPopupShowing);
                boolean unused = C4325d.this.f12284h = isPopupShowing;
            }
        }

        C4326a() {
        }

        public void afterTextChanged(Editable editable) {
            C4325d dVar = C4325d.this;
            AutoCompleteTextView d = dVar.m16636u(dVar.f12304a.getEditText());
            d.post(new C4327a(d));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    class C4328b extends TextInputLayout.C4310e {
        C4328b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            super.mo3776g(view, cVar);
            cVar.mo6578a0(Spinner.class.getName());
            if (cVar.mo6567L()) {
                cVar.mo6599m0((CharSequence) null);
            }
        }

        /* renamed from: h */
        public void mo5208h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo5208h(view, accessibilityEvent);
            C4325d dVar = C4325d.this;
            AutoCompleteTextView d = dVar.m16636u(dVar.f12304a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C4325d.this.f12289m.isTouchExplorationEnabled()) {
                C4325d.this.m16618C(d);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    class C4329c implements TextInputLayout.C4311f {
        C4329c() {
        }

        /* renamed from: a */
        public void mo13710a(TextInputLayout textInputLayout) {
            AutoCompleteTextView d = C4325d.this.m16636u(textInputLayout.getEditText());
            C4325d.this.m16616A(d);
            C4325d.this.m16633r(d);
            C4325d.this.m16617B(d);
            d.setThreshold(0);
            d.removeTextChangedListener(C4325d.this.f12281e);
            d.addTextChangedListener(C4325d.this.f12281e);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C4325d.this.f12282f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    class C4330d implements View.OnClickListener {
        C4330d() {
        }

        public void onClick(View view) {
            C4325d.this.m16618C((AutoCompleteTextView) C4325d.this.f12304a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    class C4331e implements View.OnTouchListener {

        /* renamed from: f */
        final /* synthetic */ AutoCompleteTextView f12298f;

        C4331e(AutoCompleteTextView autoCompleteTextView) {
            this.f12298f = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C4325d.this.m16640y()) {
                    boolean unused = C4325d.this.f12284h = false;
                }
                C4325d.this.m16618C(this.f12298f);
                view.performClick();
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    class C4332f implements View.OnFocusChangeListener {
        C4332f() {
        }

        public void onFocusChange(View view, boolean z) {
            C4325d.this.f12304a.setEndIconActivated(z);
            if (!z) {
                C4325d.this.m16641z(false);
                boolean unused = C4325d.this.f12284h = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    class C4333g implements AutoCompleteTextView.OnDismissListener {
        C4333g() {
        }

        public void onDismiss() {
            boolean unused = C4325d.this.f12284h = true;
            long unused2 = C4325d.this.f12286j = System.currentTimeMillis();
            C4325d.this.m16641z(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    class C4334h extends AnimatorListenerAdapter {
        C4334h() {
        }

        public void onAnimationEnd(Animator animator) {
            C4325d dVar = C4325d.this;
            dVar.f12306c.setChecked(dVar.f12285i);
            C4325d.this.f12291o.start();
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    class C4335i implements ValueAnimator.AnimatorUpdateListener {
        C4335i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4325d.this.f12306c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    C4325d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m16616A(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f12280d) {
            int boxBackgroundMode = this.f12304a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f12288l;
            } else if (boxBackgroundMode == 1) {
                drawable = this.f12287k;
            } else {
                return;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m16617B(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C4331e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new C4332f());
        if (f12280d) {
            autoCompleteTextView.setOnDismissListener(new C4333g());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m16618C(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m16640y()) {
                this.f12284h = false;
            }
            if (!this.f12284h) {
                if (f12280d) {
                    m16641z(!this.f12285i);
                } else {
                    this.f12285i = !this.f12285i;
                    this.f12306c.toggle();
                }
                if (this.f12285i) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f12284h = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m16633r(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f12304a.getBoxBackgroundMode();
            C8990g boxBackground = this.f12304a.getBoxBackground();
            int c = C9052a.m30172c(autoCompleteTextView, C9013b.f24527h);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m16635t(autoCompleteTextView, c, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m16634s(autoCompleteTextView, c, iArr, boxBackground);
            }
        }
    }

    /* renamed from: s */
    private void m16634s(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C8990g gVar) {
        int boxBackgroundColor = this.f12304a.getBoxBackgroundColor();
        int[] iArr2 = {C9052a.m30175f(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f12280d) {
            C1988t.m8400p0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        C8990g gVar2 = new C8990g(gVar.mo22809B());
        gVar2.mo22819T(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int D = C1988t.m8339D(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int C = C1988t.m8337C(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C1988t.m8400p0(autoCompleteTextView, layerDrawable);
        C1988t.m8336B0(autoCompleteTextView, D, paddingTop, C, paddingBottom);
    }

    /* renamed from: t */
    private void m16635t(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C8990g gVar) {
        LayerDrawable layerDrawable;
        int c = C9052a.m30172c(autoCompleteTextView, C9013b.colorSurface);
        C8990g gVar2 = new C8990g(gVar.mo22809B());
        int f = C9052a.m30175f(i, c, 0.1f);
        gVar2.mo22819T(new ColorStateList(iArr, new int[]{f, 0}));
        if (f12280d) {
            gVar2.setTint(c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f, c});
            C8990g gVar3 = new C8990g(gVar.mo22809B());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        C1988t.m8400p0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public AutoCompleteTextView m16636u(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: v */
    private ValueAnimator m16637v(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C9025a.f24819a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C4335i());
        return ofFloat;
    }

    /* renamed from: w */
    private C8990g m16638w(float f, float f2, float f3, int i) {
        C8997k m = C8997k.m29994a().mo22884z(f).mo22870D(f).mo22876r(f2).mo22880v(f2).mo22872m();
        C8990g l = C8990g.m29947l(this.f12305b, f3);
        l.setShapeAppearanceModel(m);
        l.mo22821V(0, i, 0, i);
        return l;
    }

    /* renamed from: x */
    private void m16639x() {
        this.f12291o = m16637v(67, 0.0f, 1.0f);
        ValueAnimator v = m16637v(50, 1.0f, 0.0f);
        this.f12290n = v;
        v.addListener(new C4334h());
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public boolean m16640y() {
        long currentTimeMillis = System.currentTimeMillis() - this.f12286j;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m16641z(boolean z) {
        if (this.f12285i != z) {
            this.f12285i = z;
            this.f12291o.cancel();
            this.f12290n.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13719a() {
        float dimensionPixelOffset = (float) this.f12305b.getResources().getDimensionPixelOffset(C9017d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f12305b.getResources().getDimensionPixelOffset(C9017d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f12305b.getResources().getDimensionPixelOffset(C9017d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C8990g w = m16638w(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C8990g w2 = m16638w(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f12288l = w;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f12287k = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, w);
        this.f12287k.addState(new int[0], w2);
        this.f12304a.setEndIconDrawable(C1445a.m6446d(this.f12305b, f12280d ? C9018e.mtrl_dropdown_arrow : C9018e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f12304a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C9022i.exposed_dropdown_menu_content_description));
        this.f12304a.setEndIconOnClickListener(new C4330d());
        this.f12304a.mo13597c(this.f12283g);
        m16639x();
        C1988t.m8414w0(this.f12306c, 2);
        this.f12289m = (AccessibilityManager) this.f12305b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo13732b(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo13733c() {
        return true;
    }
}
