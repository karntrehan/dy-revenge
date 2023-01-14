package com.facebook.react.views.slider;

import android.animation.StateListAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0274u;

/* renamed from: com.facebook.react.views.slider.a */
public class C3153a extends C0274u {

    /* renamed from: o */
    private static int f8828o = 128;

    /* renamed from: p */
    private double f8829p = 0.0d;

    /* renamed from: q */
    private double f8830q = 0.0d;

    /* renamed from: r */
    private double f8831r = 0.0d;

    /* renamed from: s */
    private double f8832s = 0.0d;

    /* renamed from: t */
    private double f8833t = 0.0d;

    public C3153a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo10248a();
    }

    /* renamed from: c */
    private void m12392c() {
        if (this.f8832s == 0.0d) {
            this.f8833t = (this.f8830q - this.f8829p) / ((double) f8828o);
        }
        setMax(getTotalSteps());
        m12393d();
    }

    /* renamed from: d */
    private void m12393d() {
        double d = this.f8831r;
        double d2 = this.f8829p;
        setProgress((int) Math.round(((d - d2) / (this.f8830q - d2)) * ((double) getTotalSteps())));
    }

    private double getStepValue() {
        double d = this.f8832s;
        return d > 0.0d ? d : this.f8833t;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f8830q - this.f8829p) / getStepValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10248a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i < 26) {
            super.setStateListAnimator((StateListAnimator) null);
        }
    }

    /* renamed from: b */
    public double mo10249b(int i) {
        return i == getMax() ? this.f8830q : (((double) i) * getStepValue()) + this.f8829p;
    }

    /* access modifiers changed from: package-private */
    public void setMaxValue(double d) {
        this.f8830q = d;
        m12392c();
    }

    /* access modifiers changed from: package-private */
    public void setMinValue(double d) {
        this.f8829p = d;
        m12392c();
    }

    /* access modifiers changed from: package-private */
    public void setStep(double d) {
        this.f8832s = d;
        m12392c();
    }

    /* access modifiers changed from: package-private */
    public void setValue(double d) {
        this.f8831r = d;
        m12393d();
    }
}
