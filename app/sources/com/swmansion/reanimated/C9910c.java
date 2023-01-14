package com.swmansion.reanimated;

import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.uimanager.C2995k0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.views.scroll.C3128d;
import com.facebook.react.views.scroll.C3134e;
import com.facebook.react.views.swiperefresh.C3157a;

/* renamed from: com.swmansion.reanimated.c */
public class C9910c {
    /* renamed from: a */
    private static void m33756a(View view, int[] iArr) {
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        m33758c(view, rectF);
        iArr[0] = Math.round(rectF.left);
        iArr[1] = Math.round(rectF.top);
        iArr[2] = Math.round(rectF.right - rectF.left);
        iArr[3] = Math.round(rectF.bottom - rectF.top);
    }

    /* renamed from: b */
    private static C3134e m33757b(C3157a aVar) {
        for (int i = 0; i < aVar.getChildCount(); i++) {
            if (aVar.getChildAt(i) instanceof C3134e) {
                return (C3134e) aVar.getChildAt(i);
            }
        }
        return null;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003e A[SYNTHETIC] */
    /* renamed from: c */
    private static void m33758c(android.view.View r2, android.graphics.RectF r3) {
        /*
            android.graphics.Matrix r0 = r2.getMatrix()
            boolean r1 = r0.isIdentity()
            if (r1 != 0) goto L_0x000d
        L_0x000a:
            r0.mapRect(r3)
        L_0x000d:
            int r0 = r2.getLeft()
            float r0 = (float) r0
            int r1 = r2.getTop()
            float r1 = (float) r1
            r3.offset(r0, r1)
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = (android.view.View) r2
            int r0 = r2.getScrollX()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r2.getScrollY()
            int r1 = -r1
            float r1 = (float) r1
            r3.offset(r0, r1)
            android.graphics.Matrix r0 = r2.getMatrix()
            boolean r1 = r0.isIdentity()
            if (r1 != 0) goto L_0x000d
            goto L_0x000a
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.reanimated.C9910c.m33758c(android.view.View, android.graphics.RectF):void");
    }

    /* renamed from: d */
    public static float[] m33759d(View view) {
        View view2 = (View) C2995k0.m11876a(view);
        if (view2 == null || view == null) {
            float[] fArr = new float[6];
            fArr[0] = -1234567.0f;
            return fArr;
        }
        int[] iArr = new int[4];
        m33756a(view2, iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        m33756a(view, iArr);
        iArr[0] = iArr[0] - i;
        iArr[1] = iArr[1] - i2;
        float[] fArr2 = new float[6];
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        for (int i3 = 2; i3 < 6; i3++) {
            fArr2[i3] = C3038r.m12004a((float) iArr[i3 - 2]);
        }
        return fArr2;
    }

    /* renamed from: e */
    public static void m33760e(View view, double d, double d2, boolean z) {
        boolean z2;
        int round = Math.round(C3038r.m12005b(d));
        int round2 = Math.round(C3038r.m12005b(d2));
        if (view instanceof C3128d) {
            z2 = true;
        } else {
            if (view instanceof C3157a) {
                view = m33757b((C3157a) view);
            }
            if (!(view instanceof C3134e)) {
                Log.w("REANIMATED", "NativeMethodsHelper: Unhandled scroll view type - allowed only {ReactScrollView, ReactHorizontalScrollView}");
                return;
            }
            z2 = false;
        }
        if (z) {
            if (z2) {
                ((C3128d) view).smoothScrollTo(round, round2);
            } else {
                ((C3134e) view).smoothScrollTo(round, round2);
            }
        } else if (z2) {
            ((C3128d) view).scrollTo(round, round2);
        } else {
            ((C3134e) view).scrollTo(round, round2);
        }
    }
}
