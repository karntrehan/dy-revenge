package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.util.C1177h;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p379x.C9062c;

/* renamed from: com.google.android.material.datepicker.b */
final class C4212b {

    /* renamed from: a */
    private final Rect f11879a;

    /* renamed from: b */
    private final ColorStateList f11880b;

    /* renamed from: c */
    private final ColorStateList f11881c;

    /* renamed from: d */
    private final ColorStateList f11882d;

    /* renamed from: e */
    private final int f11883e;

    /* renamed from: f */
    private final C8997k f11884f;

    private C4212b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C8997k kVar, Rect rect) {
        C1177h.m4582d(rect.left);
        C1177h.m4582d(rect.top);
        C1177h.m4582d(rect.right);
        C1177h.m4582d(rect.bottom);
        this.f11879a = rect;
        this.f11880b = colorStateList2;
        this.f11881c = colorStateList;
        this.f11882d = colorStateList3;
        this.f11883e = i;
        this.f11884f = kVar;
    }

    /* renamed from: a */
    static C4212b m16091a(Context context, int i) {
        C1177h.m4580b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C9024k.f24635U1);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C9024k.f24640V1, 0), obtainStyledAttributes.getDimensionPixelOffset(C9024k.f24650X1, 0), obtainStyledAttributes.getDimensionPixelOffset(C9024k.f24645W1, 0), obtainStyledAttributes.getDimensionPixelOffset(C9024k.f24655Y1, 0));
        ColorStateList a = C9062c.m30197a(context, obtainStyledAttributes, C9024k.f24660Z1);
        ColorStateList a2 = C9062c.m30197a(context, obtainStyledAttributes, C9024k.f24690e2);
        ColorStateList a3 = C9062c.m30197a(context, obtainStyledAttributes, C9024k.f24678c2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C9024k.f24684d2, 0);
        C8997k m = C8997k.m29995b(context, obtainStyledAttributes.getResourceId(C9024k.f24666a2, 0), obtainStyledAttributes.getResourceId(C9024k.f24672b2, 0)).mo22872m();
        obtainStyledAttributes.recycle();
        return new C4212b(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo13177b() {
        return this.f11879a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo13178c() {
        return this.f11879a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo13179d(TextView textView) {
        C8990g gVar = new C8990g();
        C8990g gVar2 = new C8990g();
        gVar.setShapeAppearanceModel(this.f11884f);
        gVar2.setShapeAppearanceModel(this.f11884f);
        gVar.mo22819T(this.f11881c);
        gVar.mo22825Z((float) this.f11883e, this.f11882d);
        textView.setTextColor(this.f11880b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f11880b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f11879a;
        C1988t.m8400p0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
