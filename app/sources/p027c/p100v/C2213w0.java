package p027c.p100v;

import android.view.View;

/* renamed from: c.v.w0 */
public abstract class C2213w0 extends C2125a0 {

    /* renamed from: a */
    private static final String[] f6442a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    private static int m9344d(C2144d0 d0Var, int i) {
        int[] iArr;
        if (d0Var == null || (iArr = (int[]) d0Var.f6290a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    /* renamed from: a */
    public void mo7173a(C2144d0 d0Var) {
        View view = d0Var.f6291b;
        Integer num = (Integer) d0Var.f6290a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        d0Var.f6290a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        d0Var.f6290a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: b */
    public String[] mo7174b() {
        return f6442a;
    }

    /* renamed from: e */
    public int mo7370e(C2144d0 d0Var) {
        Integer num;
        if (d0Var == null || (num = (Integer) d0Var.f6290a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int mo7371f(C2144d0 d0Var) {
        return m9344d(d0Var, 0);
    }

    /* renamed from: g */
    public int mo7372g(C2144d0 d0Var) {
        return m9344d(d0Var, 1);
    }
}
