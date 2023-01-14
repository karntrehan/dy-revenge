package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p379x.C9061b;
import p174e.p319f.p320a.p363d.p379x.C9062c;

/* renamed from: com.google.android.material.datepicker.c */
final class C4213c {

    /* renamed from: a */
    final C4212b f11885a;

    /* renamed from: b */
    final C4212b f11886b;

    /* renamed from: c */
    final C4212b f11887c;

    /* renamed from: d */
    final C4212b f11888d;

    /* renamed from: e */
    final C4212b f11889e;

    /* renamed from: f */
    final C4212b f11890f;

    /* renamed from: g */
    final C4212b f11891g;

    /* renamed from: h */
    final Paint f11892h;

    C4213c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C9061b.m30195c(context, C9013b.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C9024k.f24590L1);
        this.f11885a = C4212b.m16091a(context, obtainStyledAttributes.getResourceId(C9024k.f24605O1, 0));
        this.f11891g = C4212b.m16091a(context, obtainStyledAttributes.getResourceId(C9024k.f24595M1, 0));
        this.f11886b = C4212b.m16091a(context, obtainStyledAttributes.getResourceId(C9024k.f24600N1, 0));
        this.f11887c = C4212b.m16091a(context, obtainStyledAttributes.getResourceId(C9024k.f24610P1, 0));
        ColorStateList a = C9062c.m30197a(context, obtainStyledAttributes, C9024k.f24615Q1);
        this.f11888d = C4212b.m16091a(context, obtainStyledAttributes.getResourceId(C9024k.f24625S1, 0));
        this.f11889e = C4212b.m16091a(context, obtainStyledAttributes.getResourceId(C9024k.f24620R1, 0));
        this.f11890f = C4212b.m16091a(context, obtainStyledAttributes.getResourceId(C9024k.f24630T1, 0));
        Paint paint = new Paint();
        this.f11892h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
