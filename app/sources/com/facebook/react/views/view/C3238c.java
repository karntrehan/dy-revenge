package com.facebook.react.views.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.yoga.C3314n;

/* renamed from: com.facebook.react.views.view.c */
public class C3238c {
    /* renamed from: a */
    public static int m12662a(float f, C3314n nVar) {
        return nVar == C3314n.EXACTLY ? View.MeasureSpec.makeMeasureSpec((int) f, 1073741824) : nVar == C3314n.AT_MOST ? View.MeasureSpec.makeMeasureSpec((int) f, RecyclerView.UNDEFINED_DURATION) : View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
