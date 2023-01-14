package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.g */
class C4218g extends BaseAdapter {

    /* renamed from: f */
    private static final int f11894f = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: o */
    private final Calendar f11895o;

    /* renamed from: p */
    private final int f11896p;

    /* renamed from: q */
    private final int f11897q;

    public C4218g() {
        Calendar k = C4230o.m16161k();
        this.f11895o = k;
        this.f11896p = k.getMaximum(7);
        this.f11897q = k.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m16111b(int i) {
        int i2 = i + this.f11897q;
        int i3 = this.f11896p;
        return i2 > i3 ? i2 - i3 : i2;
    }

    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f11896p) {
            return null;
        }
        return Integer.valueOf(m16111b(i));
    }

    public int getCount() {
        return this.f11896p;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p174e.p319f.p320a.p363d.C9021h.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f11895o
            int r6 = r5.m16111b(r6)
            r2 = 7
            r7.set(r2, r6)
            java.util.Calendar r6 = r5.f11895o
            int r7 = f11894f
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = p174e.p319f.p320a.p363d.C9022i.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f11895o
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C4218g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
