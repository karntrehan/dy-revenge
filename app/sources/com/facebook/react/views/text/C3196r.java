package com.facebook.react.views.text;

import android.text.Spannable;

/* renamed from: com.facebook.react.views.text.r */
public class C3196r {

    /* renamed from: a */
    private final Spannable f8952a;

    /* renamed from: b */
    private final int f8953b;

    /* renamed from: c */
    private final boolean f8954c;

    /* renamed from: d */
    private final float f8955d;

    /* renamed from: e */
    private final float f8956e;

    /* renamed from: f */
    private final float f8957f;

    /* renamed from: g */
    private final float f8958g;

    /* renamed from: h */
    private final int f8959h;

    /* renamed from: i */
    private final int f8960i;

    /* renamed from: j */
    private final int f8961j;

    /* renamed from: k */
    private final int f8962k;

    /* renamed from: l */
    private final int f8963l;

    /* renamed from: m */
    public boolean f8964m;

    public C3196r(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3, int i4) {
        this(spannable, i, z, f, f2, f3, f4, i2, i3, i4, -1, -1);
    }

    public C3196r(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5, int i6) {
        this.f8952a = spannable;
        this.f8953b = i;
        this.f8954c = z;
        this.f8955d = f;
        this.f8956e = f2;
        this.f8957f = f3;
        this.f8958g = f4;
        this.f8959h = i2;
        this.f8960i = i3;
        this.f8961j = i5;
        this.f8962k = i6;
        this.f8963l = i4;
    }

    public C3196r(Spannable spannable, int i, boolean z, int i2, int i3, int i4) {
        this(spannable, i, z, -1.0f, -1.0f, -1.0f, -1.0f, i2, i3, i4, -1, -1);
    }

    /* renamed from: a */
    public static C3196r m12500a(Spannable spannable, int i, int i2, int i3, int i4, boolean z) {
        C3196r rVar = new C3196r(spannable, i, false, i2, i3, i4);
        rVar.f8964m = z;
        return rVar;
    }

    /* renamed from: b */
    public boolean mo10376b() {
        return this.f8954c;
    }

    /* renamed from: c */
    public int mo10377c() {
        return this.f8953b;
    }

    /* renamed from: d */
    public int mo10378d() {
        return this.f8963l;
    }

    /* renamed from: e */
    public float mo10379e() {
        return this.f8958g;
    }

    /* renamed from: f */
    public float mo10380f() {
        return this.f8955d;
    }

    /* renamed from: g */
    public float mo10381g() {
        return this.f8957f;
    }

    /* renamed from: h */
    public float mo10382h() {
        return this.f8956e;
    }

    /* renamed from: i */
    public int mo10383i() {
        return this.f8962k;
    }

    /* renamed from: j */
    public int mo10384j() {
        return this.f8961j;
    }

    /* renamed from: k */
    public Spannable mo10385k() {
        return this.f8952a;
    }

    /* renamed from: l */
    public int mo10386l() {
        return this.f8959h;
    }

    /* renamed from: m */
    public int mo10387m() {
        return this.f8960i;
    }
}
