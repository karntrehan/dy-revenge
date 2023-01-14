package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import p027c.p064i.p072j.C1988t;

/* renamed from: com.facebook.react.views.view.f */
public class C3244f {

    /* renamed from: a */
    private C3240e f9166a;

    /* renamed from: b */
    private View f9167b;

    public C3244f(View view) {
        this.f9167b = view;
    }

    /* renamed from: a */
    private C3240e m12701a() {
        Drawable drawable;
        View view;
        if (this.f9166a == null) {
            this.f9166a = new C3240e(this.f9167b.getContext());
            Drawable background = this.f9167b.getBackground();
            C1988t.m8400p0(this.f9167b, (Drawable) null);
            if (background == null) {
                view = this.f9167b;
                drawable = this.f9166a;
            } else {
                drawable = new LayerDrawable(new Drawable[]{this.f9166a, background});
                view = this.f9167b;
            }
            C1988t.m8400p0(view, drawable);
        }
        return this.f9166a;
    }

    /* renamed from: b */
    public void mo10645b(int i) {
        if (i != 0 || this.f9166a != null) {
            m12701a().mo10642x(i);
        }
    }

    /* renamed from: c */
    public void mo10646c(int i, float f, float f2) {
        m12701a().mo10639t(i, f, f2);
    }

    /* renamed from: d */
    public void mo10647d(float f) {
        m12701a().mo10643y(f);
    }

    /* renamed from: e */
    public void mo10648e(float f, int i) {
        m12701a().mo10644z(f, i);
    }

    /* renamed from: f */
    public void mo10649f(String str) {
        m12701a().mo10640v(str);
    }

    /* renamed from: g */
    public void mo10650g(int i, float f) {
        m12701a().mo10641w(i, f);
    }
}
