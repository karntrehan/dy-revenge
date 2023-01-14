package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1398g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.n */
class C4228n extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.n$a */
    class C4229a extends C1398g {
        C4229a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo5178v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    C4228n(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: I1 */
    public void mo4442I1(RecyclerView recyclerView, RecyclerView.C1322a0 a0Var, int i) {
        C4229a aVar = new C4229a(recyclerView.getContext());
        aVar.mo4994p(i);
        mo4834J1(aVar);
    }
}
