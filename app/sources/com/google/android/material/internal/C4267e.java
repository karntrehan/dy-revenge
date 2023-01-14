package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.e */
public final class C4267e {

    /* renamed from: a */
    private final ArrayList<C4269b> f12103a = new ArrayList<>();

    /* renamed from: b */
    private C4269b f12104b = null;

    /* renamed from: c */
    ValueAnimator f12105c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f12106d = new C4268a();

    /* renamed from: com.google.android.material.internal.e$a */
    class C4268a extends AnimatorListenerAdapter {
        C4268a() {
        }

        public void onAnimationEnd(Animator animator) {
            C4267e eVar = C4267e.this;
            if (eVar.f12105c == animator) {
                eVar.f12105c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.e$b */
    static class C4269b {

        /* renamed from: a */
        final int[] f12108a;

        /* renamed from: b */
        final ValueAnimator f12109b;

        C4269b(int[] iArr, ValueAnimator valueAnimator) {
            this.f12108a = iArr;
            this.f12109b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m16401b() {
        ValueAnimator valueAnimator = this.f12105c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12105c = null;
        }
    }

    /* renamed from: e */
    private void m16402e(C4269b bVar) {
        ValueAnimator valueAnimator = bVar.f12109b;
        this.f12105c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo13501a(int[] iArr, ValueAnimator valueAnimator) {
        C4269b bVar = new C4269b(iArr, valueAnimator);
        valueAnimator.addListener(this.f12106d);
        this.f12103a.add(bVar);
    }

    /* renamed from: c */
    public void mo13502c() {
        ValueAnimator valueAnimator = this.f12105c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f12105c = null;
        }
    }

    /* renamed from: d */
    public void mo13503d(int[] iArr) {
        C4269b bVar;
        int size = this.f12103a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f12103a.get(i);
            if (StateSet.stateSetMatches(bVar.f12108a, iArr)) {
                break;
            }
            i++;
        }
        C4269b bVar2 = this.f12104b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m16401b();
            }
            this.f12104b = bVar;
            if (bVar != null) {
                m16402e(bVar);
            }
        }
    }
}
