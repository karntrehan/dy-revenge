package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.yoga.C3313m;
import com.facebook.yoga.C3314n;
import com.facebook.yoga.C3315o;
import com.facebook.yoga.C3316p;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.react.views.progressbar.b */
public class C3124b extends C2987j implements C3313m {

    /* renamed from: A */
    private String f8685A = "Normal";

    /* renamed from: B */
    private final SparseIntArray f8686B = new SparseIntArray();

    /* renamed from: C */
    private final SparseIntArray f8687C = new SparseIntArray();

    /* renamed from: D */
    private final Set<Integer> f8688D = new HashSet();

    public C3124b() {
        m12278r1();
    }

    /* renamed from: r1 */
    private void m12278r1() {
        mo9577T0(this);
    }

    /* renamed from: c */
    public long mo10055c(C3316p pVar, float f, C3314n nVar, float f2, C3314n nVar2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(mo10056q1());
        if (!this.f8688D.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(mo9506I(), styleFromString);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.f8686B.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.f8687C.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.f8688D.add(Integer.valueOf(styleFromString));
        }
        return C3315o.m12982b(this.f8687C.get(styleFromString), this.f8686B.get(styleFromString));
    }

    /* renamed from: q1 */
    public String mo10056q1() {
        return this.f8685A;
    }

    @C2991a(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.f8685A = str;
    }
}
