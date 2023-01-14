package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
class C1407l {
    /* renamed from: a */
    static int m6279a(RecyclerView.C1322a0 a0Var, C1402j jVar, View view, View view2, RecyclerView.C1342o oVar, boolean z) {
        if (oVar.mo4833J() == 0 || a0Var.mo4682b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo4873h0(view) - oVar.mo4873h0(view2)) + 1;
        }
        return Math.min(jVar.mo5198n(), jVar.mo5188d(view2) - jVar.mo5191g(view));
    }

    /* renamed from: b */
    static int m6280b(RecyclerView.C1322a0 a0Var, C1402j jVar, View view, View view2, RecyclerView.C1342o oVar, boolean z, boolean z2) {
        if (oVar.mo4833J() == 0 || a0Var.mo4682b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.mo4682b() - Math.max(oVar.mo4873h0(view), oVar.mo4873h0(view2))) - 1) : Math.max(0, Math.min(oVar.mo4873h0(view), oVar.mo4873h0(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(jVar.mo5188d(view2) - jVar.mo5191g(view))) / ((float) (Math.abs(oVar.mo4873h0(view) - oVar.mo4873h0(view2)) + 1)))) + ((float) (jVar.mo5197m() - jVar.mo5191g(view))));
    }

    /* renamed from: c */
    static int m6281c(RecyclerView.C1322a0 a0Var, C1402j jVar, View view, View view2, RecyclerView.C1342o oVar, boolean z) {
        if (oVar.mo4833J() == 0 || a0Var.mo4682b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.mo4682b();
        }
        return (int) ((((float) (jVar.mo5188d(view2) - jVar.mo5191g(view))) / ((float) (Math.abs(oVar.mo4873h0(view) - oVar.mo4873h0(view2)) + 1))) * ((float) a0Var.mo4682b()));
    }
}
