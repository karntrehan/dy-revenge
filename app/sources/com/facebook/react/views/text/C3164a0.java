package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

/* renamed from: com.facebook.react.views.text.a0 */
public abstract class C3164a0 extends ReplacementSpan implements C3189m {
    /* renamed from: g */
    public static void m12422g(Spannable spannable, TextView textView) {
        for (C3164a0 a0Var : (C3164a0[]) spannable.getSpans(0, spannable.length(), C3164a0.class)) {
            a0Var.mo10313c();
            a0Var.mo10317h(textView);
        }
    }

    /* renamed from: a */
    public abstract Drawable mo10311a();

    /* renamed from: b */
    public abstract int mo10312b();

    /* renamed from: c */
    public abstract void mo10313c();

    /* renamed from: d */
    public abstract void mo10314d();

    /* renamed from: e */
    public abstract void mo10315e();

    /* renamed from: f */
    public abstract void mo10316f();

    /* renamed from: h */
    public abstract void mo10317h(TextView textView);
}
