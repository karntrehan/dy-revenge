package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.p113d0.C2708c;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.facebook.react.uimanager.p0 */
public class C3033p0 {

    /* renamed from: a */
    private static final float[] f8422a = new float[2];

    /* renamed from: b */
    private static final PointF f8423b = new PointF();

    /* renamed from: c */
    private static final float[] f8424c = new float[2];

    /* renamed from: d */
    private static final Matrix f8425d = new Matrix();

    /* renamed from: com.facebook.react.uimanager.p0$a */
    private enum C3034a {
        SELF,
        CHILD
    }

    /* renamed from: a */
    private static View m11987a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* renamed from: b */
    public static int m11988b(float f, float f2, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View a;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View e = m11991e(fArr, viewGroup, (List<Integer>) null);
        if (e == null || (a = m11987a(e)) == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = a.getId();
        }
        return m11993g(a, fArr[0], fArr[1]);
    }

    /* renamed from: c */
    public static int m11989c(float f, float f2, ViewGroup viewGroup) {
        return m11988b(f, f2, viewGroup, f8422a, (int[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.view.View m11990d(float[] r11, android.view.View r12, java.util.EnumSet<com.facebook.react.uimanager.C3033p0.C3034a> r13, java.util.List<java.lang.Integer> r14) {
        /*
            com.facebook.react.uimanager.p0$a r0 = com.facebook.react.uimanager.C3033p0.C3034a.CHILD
            boolean r0 = r13.contains(r0)
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x007c
            boolean r0 = r12 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x007c
            r0 = r12
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r4 = r0.getChildCount()
            boolean r5 = r0 instanceof com.facebook.react.uimanager.C2982h0
            if (r5 == 0) goto L_0x001e
            r5 = r0
            com.facebook.react.uimanager.h0 r5 = (com.facebook.react.uimanager.C2982h0) r5
            goto L_0x001f
        L_0x001e:
            r5 = r1
        L_0x001f:
            int r4 = r4 - r3
        L_0x0020:
            if (r4 < 0) goto L_0x007c
            if (r5 == 0) goto L_0x0029
            int r6 = r5.mo9685a(r4)
            goto L_0x002a
        L_0x0029:
            r6 = r4
        L_0x002a:
            android.view.View r6 = r0.getChildAt(r6)
            android.graphics.PointF r7 = f8423b
            r8 = r11[r2]
            r9 = r11[r3]
            m11992f(r8, r9, r0, r6, r7)
            r8 = r11[r2]
            r9 = r11[r3]
            float r10 = r7.x
            r11[r2] = r10
            float r7 = r7.y
            r11[r3] = r7
            android.view.View r6 = m11991e(r11, r6, r14)
            if (r6 == 0) goto L_0x0075
            boolean r7 = r0 instanceof com.facebook.react.uimanager.C3060z
            if (r7 == 0) goto L_0x006c
            r7 = r0
            com.facebook.react.uimanager.z r7 = (com.facebook.react.uimanager.C3060z) r7
            java.lang.String r7 = r7.getOverflow()
            java.lang.String r10 = "hidden"
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L_0x0064
            java.lang.String r10 = "scroll"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x006c
        L_0x0064:
            boolean r7 = m11994h(r8, r9, r12)
            if (r7 != 0) goto L_0x006c
            r7 = 0
            goto L_0x006d
        L_0x006c:
            r7 = 1
        L_0x006d:
            if (r7 == 0) goto L_0x0070
            return r6
        L_0x0070:
            if (r14 == 0) goto L_0x0075
            r14.clear()
        L_0x0075:
            r11[r2] = r8
            r11[r3] = r9
            int r4 = r4 + -1
            goto L_0x0020
        L_0x007c:
            com.facebook.react.uimanager.p0$a r14 = com.facebook.react.uimanager.C3033p0.C3034a.SELF
            boolean r13 = r13.contains(r14)
            if (r13 == 0) goto L_0x008f
            r13 = r11[r2]
            r11 = r11[r3]
            boolean r11 = m11994h(r13, r11, r12)
            if (r11 == 0) goto L_0x008f
            return r12
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3033p0.m11990d(float[], android.view.View, java.util.EnumSet, java.util.List):android.view.View");
    }

    /* renamed from: e */
    private static View m11991e(float[] fArr, View view, List<Integer> list) {
        C3040s pointerEvents = view instanceof C2919a0 ? ((C2919a0) view).getPointerEvents() : C3040s.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == C3040s.AUTO) {
                pointerEvents = C3040s.BOX_NONE;
            } else if (pointerEvents == C3040s.BOX_ONLY) {
                pointerEvents = C3040s.NONE;
            }
        }
        if (pointerEvents == C3040s.NONE) {
            return null;
        }
        if (pointerEvents == C3040s.BOX_ONLY) {
            View d = m11990d(fArr, view, EnumSet.of(C3034a.SELF), list);
            if (!(d == null || list == null)) {
                list.add(Integer.valueOf(view.getId()));
            }
            return d;
        } else if (pointerEvents == C3040s.BOX_NONE) {
            View d2 = m11990d(fArr, view, EnumSet.of(C3034a.CHILD), list);
            if (d2 != null) {
                if (list != null) {
                    list.add(Integer.valueOf(view.getId()));
                }
                return d2;
            } else if (!(view instanceof C3056x) || !m11994h(fArr[0], fArr[1], view) || ((C3056x) view).mo9869c(fArr[0], fArr[1]) == view.getId()) {
                return null;
            } else {
                if (list != null) {
                    list.add(Integer.valueOf(view.getId()));
                }
                return view;
            }
        } else if (pointerEvents != C3040s.AUTO) {
            throw new JSApplicationIllegalArgumentException("Unknown pointer event type: " + pointerEvents.toString());
        } else if (!(view instanceof C3058y) || !m11994h(fArr[0], fArr[1], view) || !((C3058y) view).mo9871f(fArr[0], fArr[1])) {
            View d3 = m11990d(fArr, view, EnumSet.of(C3034a.SELF, C3034a.CHILD), list);
            if (!(d3 == null || list == null)) {
                list.add(Integer.valueOf(view.getId()));
            }
            return d3;
        } else {
            if (list != null) {
                list.add(Integer.valueOf(view.getId()));
            }
            return view;
        }
    }

    /* renamed from: f */
    private static void m11992f(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f2 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f8424c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f8425d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f3 = fArr[0];
            scrollY = fArr[1];
            scrollX = f3;
        }
        pointF.set(scrollX, scrollY);
    }

    /* renamed from: g */
    private static int m11993g(View view, float f, float f2) {
        return view instanceof C3056x ? ((C3056x) view).mo9869c(f, f2) : view.getId();
    }

    /* renamed from: h */
    private static boolean m11994h(float f, float f2, View view) {
        if (view instanceof C2708c) {
            C2708c cVar = (C2708c) view;
            if (cVar.getHitSlopRect() != null) {
                Rect hitSlopRect = cVar.getHitSlopRect();
                return f >= ((float) (-hitSlopRect.left)) && f < ((float) (view.getWidth() + hitSlopRect.right)) && f2 >= ((float) (-hitSlopRect.top)) && f2 < ((float) (view.getHeight() + hitSlopRect.bottom));
            }
        }
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }
}
