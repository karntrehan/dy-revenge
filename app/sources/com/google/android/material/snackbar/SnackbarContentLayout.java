package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9019f;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p372q.C9052a;

public class SnackbarContentLayout extends LinearLayout implements C4301a {

    /* renamed from: f */
    private TextView f12179f;

    /* renamed from: o */
    private Button f12180o;

    /* renamed from: p */
    private int f12181p;

    /* renamed from: q */
    private int f12182q;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9024k.f24631T2);
        this.f12181p = obtainStyledAttributes.getDimensionPixelSize(C9024k.f24636U2, -1);
        this.f12182q = obtainStyledAttributes.getDimensionPixelSize(C9024k.f24661Z2, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private static void m16509d(View view, int i, int i2) {
        if (C1988t.m8363U(view)) {
            C1988t.m8336B0(view, C1988t.m8339D(view), i, C1988t.m8337C(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: e */
    private boolean m16510e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f12179f.getPaddingTop() == i2 && this.f12179f.getPaddingBottom() == i3) {
            return z;
        }
        m16509d(this.f12179f, i2, i3);
        return true;
    }

    /* renamed from: a */
    public void mo13570a(int i, int i2) {
        this.f12179f.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f12179f.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f12180o.getVisibility() == 0) {
            this.f12180o.setAlpha(0.0f);
            this.f12180o.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: b */
    public void mo13571b(int i, int i2) {
        this.f12179f.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f12179f.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f12180o.getVisibility() == 0) {
            this.f12180o.setAlpha(1.0f);
            this.f12180o.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo13572c(float f) {
        if (f != 1.0f) {
            this.f12180o.setTextColor(C9052a.m30175f(C9052a.m30172c(this, C9013b.colorSurface), this.f12180o.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.f12180o;
    }

    public TextView getMessageView() {
        return this.f12179f;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12179f = (TextView) findViewById(C9019f.snackbar_text);
        this.f12180o = (Button) findViewById(C9019f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m16510e(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m16510e(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f12181p
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f12181p
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p174e.p319f.p320a.p363d.C9017d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p174e.p319f.p320a.p363d.C9017d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f12179f
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f12182q
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f12180o
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f12182q
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m16510e(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m16510e(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
