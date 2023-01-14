package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p027c.p028a.p029k.p030a.C1445a;
import p174e.p319f.p320a.p363d.C9018e;
import p174e.p319f.p320a.p363d.C9022i;
import p174e.p319f.p320a.p363d.p366l.C9025a;

/* renamed from: com.google.android.material.textfield.a */
class C4315a extends C4336e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f12266d = new C4316a();

    /* renamed from: e */
    private final TextInputLayout.C4311f f12267e = new C4317b();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AnimatorSet f12268f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ValueAnimator f12269g;

    /* renamed from: com.google.android.material.textfield.a$a */
    class C4316a implements TextWatcher {
        C4316a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!C4315a.m16602j(editable)) {
                C4315a.this.f12268f.cancel();
                C4315a.this.f12269g.start();
            } else if (!C4315a.this.f12304a.mo13589E()) {
                C4315a.this.f12269g.cancel();
                C4315a.this.f12268f.start();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    class C4317b implements TextInputLayout.C4311f {
        C4317b() {
        }

        /* renamed from: a */
        public void mo13710a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C4315a.m16602j(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(C4315a.this.f12266d);
            editText.addTextChangedListener(C4315a.this.f12266d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    class C4318c implements View.OnClickListener {
        C4318c() {
        }

        public void onClick(View view) {
            C4315a.this.f12304a.getEditText().setText((CharSequence) null);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    class C4319d extends AnimatorListenerAdapter {
        C4319d() {
        }

        public void onAnimationStart(Animator animator) {
            C4315a.this.f12304a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    class C4320e extends AnimatorListenerAdapter {
        C4320e() {
        }

        public void onAnimationEnd(Animator animator) {
            C4315a.this.f12304a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    class C4321f implements ValueAnimator.AnimatorUpdateListener {
        C4321f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4315a.this.f12306c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    class C4322g implements ValueAnimator.AnimatorUpdateListener {
        C4322g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C4315a.this.f12306c.setScaleX(floatValue);
            C4315a.this.f12306c.setScaleY(floatValue);
        }
    }

    C4315a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: h */
    private ValueAnimator m16600h(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C9025a.f24819a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C4321f());
        return ofFloat;
    }

    /* renamed from: i */
    private ValueAnimator m16601i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C9025a.f24822d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C4322g());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m16602j(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: k */
    private void m16603k() {
        ValueAnimator i = m16601i();
        ValueAnimator h = m16600h(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12268f = animatorSet;
        animatorSet.playTogether(new Animator[]{i, h});
        this.f12268f.addListener(new C4319d());
        ValueAnimator h2 = m16600h(1.0f, 0.0f);
        this.f12269g = h2;
        h2.addListener(new C4320e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13719a() {
        this.f12304a.setEndIconDrawable(C1445a.m6446d(this.f12305b, C9018e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f12304a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C9022i.clear_text_end_icon_content_description));
        this.f12304a.setEndIconOnClickListener(new C4318c());
        this.f12304a.mo13597c(this.f12267e);
        m16603k();
    }
}
