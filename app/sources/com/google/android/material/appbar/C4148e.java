package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C4273g;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9020g;

/* renamed from: com.google.android.material.appbar.e */
class C4148e {

    /* renamed from: a */
    private static final int[] f11550a = {16843848};

    /* renamed from: a */
    static void m15628a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    static void m15629b(View view, float f) {
        int integer = view.getResources().getInteger(C9020g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C9013b.state_liftable, -C9013b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    static void m15630c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray k = C4273g.m16429k(context, attributeSet, f11550a, i, i2, new int[0]);
        try {
            if (k.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, k.getResourceId(0, 0)));
            }
        } finally {
            k.recycle();
        }
    }
}
