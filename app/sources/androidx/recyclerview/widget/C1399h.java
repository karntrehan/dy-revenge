package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;

/* renamed from: androidx.recyclerview.widget.h */
public class C1399h extends C1409n {

    /* renamed from: d */
    private C1402j f4123d;

    /* renamed from: e */
    private C1402j f4124e;

    /* renamed from: m */
    private float m6199m(RecyclerView.C1342o oVar, C1402j jVar) {
        int max;
        int J = oVar.mo4833J();
        if (J == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = 0; i3 < J; i3++) {
            View I = oVar.mo4832I(i3);
            int h0 = oVar.mo4873h0(I);
            if (h0 != -1) {
                if (h0 < i) {
                    view = I;
                    i = h0;
                }
                if (h0 > i2) {
                    view2 = I;
                    i2 = h0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(jVar.mo5188d(view), jVar.mo5188d(view2)) - Math.min(jVar.mo5191g(view), jVar.mo5191g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: n */
    private int m6200n(RecyclerView.C1342o oVar, View view, C1402j jVar) {
        return (jVar.mo5191g(view) + (jVar.mo5189e(view) / 2)) - (jVar.mo5197m() + (jVar.mo5198n() / 2));
    }

    /* renamed from: o */
    private int m6201o(RecyclerView.C1342o oVar, C1402j jVar, int i, int i2) {
        int[] d = mo5231d(i, i2);
        float m = m6199m(oVar, jVar);
        if (m <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d[0]) > Math.abs(d[1]) ? d[0] : d[1])) / m);
    }

    /* renamed from: p */
    private View m6202p(RecyclerView.C1342o oVar, C1402j jVar) {
        int J = oVar.mo4833J();
        View view = null;
        if (J == 0) {
            return null;
        }
        int m = jVar.mo5197m() + (jVar.mo5198n() / 2);
        int i = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        for (int i2 = 0; i2 < J; i2++) {
            View I = oVar.mo4832I(i2);
            int abs = Math.abs((jVar.mo5191g(I) + (jVar.mo5189e(I) / 2)) - m);
            if (abs < i) {
                view = I;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: q */
    private C1402j m6203q(RecyclerView.C1342o oVar) {
        C1402j jVar = this.f4124e;
        if (jVar == null || jVar.f4126a != oVar) {
            this.f4124e = C1402j.m6216a(oVar);
        }
        return this.f4124e;
    }

    /* renamed from: r */
    private C1402j m6204r(RecyclerView.C1342o oVar) {
        C1402j jVar = this.f4123d;
        if (jVar == null || jVar.f4126a != oVar) {
            this.f4123d = C1402j.m6218c(oVar);
        }
        return this.f4123d;
    }

    /* renamed from: c */
    public int[] mo5182c(RecyclerView.C1342o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo4459k()) {
            iArr[0] = m6200n(oVar, view, m6203q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo4460l()) {
            iArr[1] = m6200n(oVar, view, m6204r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: h */
    public View mo5183h(RecyclerView.C1342o oVar) {
        C1402j q;
        if (oVar.mo4460l()) {
            q = m6204r(oVar);
        } else if (!oVar.mo4459k()) {
            return null;
        } else {
            q = m6203q(oVar);
        }
        return m6202p(oVar, q);
    }

    /* renamed from: i */
    public int mo5184i(RecyclerView.C1342o oVar, int i, int i2) {
        int Y;
        View h;
        int h0;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.C1359z.C1361b) || (Y = oVar.mo4853Y()) == 0 || (h = mo5183h(oVar)) == null || (h0 = oVar.mo4873h0(h)) == -1 || (a = ((RecyclerView.C1359z.C1361b) oVar).mo4452a(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (oVar.mo4459k()) {
            i4 = m6201o(oVar, m6203q(oVar), i, 0);
            if (a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.mo4460l()) {
            i5 = m6201o(oVar, m6204r(oVar), 0, i2);
            if (a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.mo4460l()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = h0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= Y ? Y - 1 : i6;
    }
}
