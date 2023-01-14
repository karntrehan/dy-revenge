package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import p174e.p319f.p320a.p363d.p380y.C9071b;
import p174e.p319f.p320a.p363d.p381z.C9073b;

/* renamed from: com.google.android.material.floatingactionbutton.c */
class C4256c extends C4243b {
    C4256c(FloatingActionButton floatingActionButton, C9073b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: e0 */
    private Animator m16313e0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f11978F, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f11978F, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C4243b.f11966a);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo13355A() {
        mo13381b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo13357C(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f11978F.isEnabled()) {
                this.f11978F.setElevation(this.f11992o);
                if (this.f11978F.isPressed()) {
                    floatingActionButton = this.f11978F;
                    f = this.f11994q;
                } else if (this.f11978F.isFocused() || this.f11978F.isHovered()) {
                    floatingActionButton = this.f11978F;
                    f = this.f11993p;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f11978F.setElevation(0.0f);
            floatingActionButton = this.f11978F;
            floatingActionButton.setTranslationZ(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo13358D(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f11978F.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C4243b.f11967b, m16313e0(f, f3));
            stateListAnimator.addState(C4243b.f11968c, m16313e0(f, f2));
            stateListAnimator.addState(C4243b.f11969d, m16313e0(f, f2));
            stateListAnimator.addState(C4243b.f11970e, m16313e0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f11978F, "elevation", new float[]{f}).setDuration(0));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f11978F;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f11978F, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C4243b.f11966a);
            stateListAnimator.addState(C4243b.f11971f, animatorSet);
            stateListAnimator.addState(C4243b.f11972g, m16313e0(0.0f, 0.0f));
            this.f11978F.setStateListAnimator(stateListAnimator);
        }
        if (mo13376V()) {
            mo13381b0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo13363I() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo13372R(ColorStateList colorStateList) {
        Drawable drawable = this.f11987j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C9071b.m30223a(colorStateList));
        } else {
            super.mo13372R(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo13376V() {
        return this.f11979G.mo13349b() || !mo13377X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo13379Z() {
    }

    /* renamed from: m */
    public float mo13387m() {
        return this.f11978F.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo13391r(Rect rect) {
        if (this.f11979G.mo13349b()) {
            super.mo13391r(rect);
            return;
        }
        int sizeDimension = !mo13377X() ? (this.f11995r - this.f11978F.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo13398y() {
    }
}
