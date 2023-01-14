package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.C0298z;
import androidx.core.widget.C1194i;
import java.util.ArrayList;
import java.util.List;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9017d;
import p174e.p319f.p320a.p363d.C9019f;
import p174e.p319f.p320a.p363d.p366l.C9025a;
import p174e.p319f.p320a.p363d.p366l.C9026b;

/* renamed from: com.google.android.material.textfield.f */
final class C4337f {

    /* renamed from: a */
    private final Context f12307a;

    /* renamed from: b */
    private final TextInputLayout f12308b;

    /* renamed from: c */
    private LinearLayout f12309c;

    /* renamed from: d */
    private int f12310d;

    /* renamed from: e */
    private FrameLayout f12311e;

    /* renamed from: f */
    private int f12312f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Animator f12313g;

    /* renamed from: h */
    private final float f12314h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f12315i;

    /* renamed from: j */
    private int f12316j;

    /* renamed from: k */
    private CharSequence f12317k;

    /* renamed from: l */
    private boolean f12318l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextView f12319m;

    /* renamed from: n */
    private int f12320n;

    /* renamed from: o */
    private ColorStateList f12321o;

    /* renamed from: p */
    private CharSequence f12322p;

    /* renamed from: q */
    private boolean f12323q;

    /* renamed from: r */
    private TextView f12324r;

    /* renamed from: s */
    private int f12325s;

    /* renamed from: t */
    private ColorStateList f12326t;

    /* renamed from: u */
    private Typeface f12327u;

    /* renamed from: com.google.android.material.textfield.f$a */
    class C4338a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f12328a;

        /* renamed from: b */
        final /* synthetic */ TextView f12329b;

        /* renamed from: c */
        final /* synthetic */ int f12330c;

        /* renamed from: d */
        final /* synthetic */ TextView f12331d;

        C4338a(int i, TextView textView, int i2, TextView textView2) {
            this.f12328a = i;
            this.f12329b = textView;
            this.f12330c = i2;
            this.f12331d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C4337f.this.f12315i = this.f12328a;
            Animator unused2 = C4337f.this.f12313g = null;
            TextView textView = this.f12329b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f12330c == 1 && C4337f.this.f12319m != null) {
                    C4337f.this.f12319m.setText((CharSequence) null);
                }
                TextView textView2 = this.f12331d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.f12331d.setAlpha(1.0f);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f12331d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C4337f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f12307a = context;
        this.f12308b = textInputLayout;
        this.f12314h = (float) context.getResources().getDimensionPixelSize(C9017d.design_textinput_caption_translate_y);
    }

    /* renamed from: F */
    private void m16651F(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: H */
    private void m16652H(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: I */
    private boolean m16653I(TextView textView, CharSequence charSequence) {
        return C1988t.m8361S(this.f12308b) && this.f12308b.isEnabled() && (this.f12316j != this.f12315i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: L */
    private void m16654L(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f12313g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i3 = i;
            int i4 = i2;
            m16659h(arrayList2, this.f12323q, this.f12324r, 2, i3, i4);
            m16659h(arrayList2, this.f12318l, this.f12319m, 1, i3, i4);
            C9026b.m30121a(animatorSet, arrayList);
            animatorSet.addListener(new C4338a(i2, m16662l(i), i, m16662l(i2)));
            animatorSet.start();
        } else {
            m16664y(i, i2);
        }
        this.f12308b.mo13595Y();
        this.f12308b.mo13598c0(z);
        this.f12308b.mo13605e0();
    }

    /* renamed from: f */
    private boolean m16658f() {
        return (this.f12309c == null || this.f12308b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m16659h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m16660i(textView, i3 == i));
                if (i3 == i) {
                    list.add(m16661j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m16660i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C9025a.f24819a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m16661j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f12314h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C9025a.f24822d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m16662l(int i) {
        if (i == 1) {
            return this.f12319m;
        }
        if (i != 2) {
            return null;
        }
        return this.f12324r;
    }

    /* renamed from: t */
    private boolean m16663t(int i) {
        return i == 1 && this.f12319m != null && !TextUtils.isEmpty(this.f12317k);
    }

    /* renamed from: y */
    private void m16664y(int i, int i2) {
        TextView l;
        TextView l2;
        if (i != i2) {
            if (!(i2 == 0 || (l2 = m16662l(i2)) == null)) {
                l2.setVisibility(0);
                l2.setAlpha(1.0f);
            }
            if (!(i == 0 || (l = m16662l(i)) == null)) {
                l.setVisibility(4);
                if (i == 1) {
                    l.setText((CharSequence) null);
                }
            }
            this.f12315i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo13744A(int i) {
        this.f12320n = i;
        TextView textView = this.f12319m;
        if (textView != null) {
            this.f12308b.mo13593Q(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo13745B(ColorStateList colorStateList) {
        this.f12321o = colorStateList;
        TextView textView = this.f12319m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo13746C(int i) {
        this.f12325s = i;
        TextView textView = this.f12324r;
        if (textView != null) {
            C1194i.m4707n(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo13747D(boolean z) {
        if (this.f12323q != z) {
            mo13754g();
            if (z) {
                C0298z zVar = new C0298z(this.f12307a);
                this.f12324r = zVar;
                zVar.setId(C9019f.textinput_helper_text);
                Typeface typeface = this.f12327u;
                if (typeface != null) {
                    this.f12324r.setTypeface(typeface);
                }
                this.f12324r.setVisibility(4);
                C1988t.m8398o0(this.f12324r, 1);
                mo13746C(this.f12325s);
                mo13748E(this.f12326t);
                mo13752d(this.f12324r, 1);
            } else {
                mo13762s();
                mo13766x(this.f12324r, 1);
                this.f12324r = null;
                this.f12308b.mo13595Y();
                this.f12308b.mo13605e0();
            }
            this.f12323q = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo13748E(ColorStateList colorStateList) {
        this.f12326t = colorStateList;
        TextView textView = this.f12324r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo13749G(Typeface typeface) {
        if (typeface != this.f12327u) {
            this.f12327u = typeface;
            m16651F(this.f12319m, typeface);
            m16651F(this.f12324r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo13750J(CharSequence charSequence) {
        mo13754g();
        this.f12317k = charSequence;
        this.f12319m.setText(charSequence);
        int i = this.f12315i;
        if (i != 1) {
            this.f12316j = 1;
        }
        m16654L(i, this.f12316j, m16653I(this.f12319m, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo13751K(CharSequence charSequence) {
        mo13754g();
        this.f12322p = charSequence;
        this.f12324r.setText(charSequence);
        int i = this.f12315i;
        if (i != 2) {
            this.f12316j = 2;
        }
        m16654L(i, this.f12316j, m16653I(this.f12324r, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo13752d(TextView textView, int i) {
        if (this.f12309c == null && this.f12311e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f12307a);
            this.f12309c = linearLayout;
            linearLayout.setOrientation(0);
            this.f12308b.addView(this.f12309c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f12307a);
            this.f12311e = frameLayout;
            this.f12309c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f12309c.addView(new Space(this.f12307a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f12308b.getEditText() != null) {
                mo13753e();
            }
        }
        if (mo13763u(i)) {
            this.f12311e.setVisibility(0);
            this.f12311e.addView(textView);
            this.f12312f++;
        } else {
            this.f12309c.addView(textView, i);
        }
        this.f12309c.setVisibility(0);
        this.f12310d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo13753e() {
        if (m16658f()) {
            C1988t.m8336B0(this.f12309c, C1988t.m8339D(this.f12308b.getEditText()), 0, C1988t.m8337C(this.f12308b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo13754g() {
        Animator animator = this.f12313g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo13755k() {
        return m16663t(this.f12316j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence mo13756m() {
        return this.f12317k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo13757n() {
        TextView textView = this.f12319m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public ColorStateList mo13758o() {
        TextView textView = this.f12319m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public CharSequence mo13759p() {
        return this.f12322p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo13760q() {
        TextView textView = this.f12324r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo13761r() {
        this.f12317k = null;
        mo13754g();
        if (this.f12315i == 1) {
            this.f12316j = (!this.f12323q || TextUtils.isEmpty(this.f12322p)) ? 0 : 2;
        }
        m16654L(this.f12315i, this.f12316j, m16653I(this.f12319m, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo13762s() {
        mo13754g();
        int i = this.f12315i;
        if (i == 2) {
            this.f12316j = 0;
        }
        m16654L(i, this.f12316j, m16653I(this.f12324r, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo13763u(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo13764v() {
        return this.f12318l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo13765w() {
        return this.f12323q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo13766x(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f12309c != null) {
            if (!mo13763u(i) || (frameLayout = this.f12311e) == null) {
                this.f12309c.removeView(textView);
            } else {
                int i2 = this.f12312f - 1;
                this.f12312f = i2;
                m16652H(frameLayout, i2);
                this.f12311e.removeView(textView);
            }
            int i3 = this.f12310d - 1;
            this.f12310d = i3;
            m16652H(this.f12309c, i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo13767z(boolean z) {
        if (this.f12318l != z) {
            mo13754g();
            if (z) {
                C0298z zVar = new C0298z(this.f12307a);
                this.f12319m = zVar;
                zVar.setId(C9019f.textinput_error);
                Typeface typeface = this.f12327u;
                if (typeface != null) {
                    this.f12319m.setTypeface(typeface);
                }
                mo13744A(this.f12320n);
                mo13745B(this.f12321o);
                this.f12319m.setVisibility(4);
                C1988t.m8398o0(this.f12319m, 1);
                mo13752d(this.f12319m, 0);
            } else {
                mo13761r();
                mo13766x(this.f12319m, 0);
                this.f12319m = null;
                this.f12308b.mo13595Y();
                this.f12308b.mo13605e0();
            }
            this.f12318l = z;
        }
    }
}
