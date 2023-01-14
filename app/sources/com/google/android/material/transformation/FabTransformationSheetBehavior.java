package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C8983a;
import p174e.p319f.p320a.p363d.p366l.C9032h;
import p174e.p319f.p320a.p363d.p366l.C9034j;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f12371i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: g0 */
    private void m16739g0(View view, boolean z) {
        int i;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f12371i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C1090f) && (((CoordinatorLayout.C1090f) childAt.getLayoutParams()).mo3507f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f12371i;
                        if (map != null && map.containsKey(childAt)) {
                            i = this.f12371i.get(childAt).intValue();
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f12371i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        i = 4;
                    }
                    C1988t.m8414w0(childAt, i);
                }
            }
            if (!z) {
                this.f12371i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo13776H(View view, View view2, boolean z, boolean z2) {
        m16739g0(view2, z);
        return super.mo13776H(view, view2, z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public FabTransformationBehavior.C4351e mo13780e0(Context context, boolean z) {
        int i = z ? C8983a.mtrl_fab_transformation_sheet_expand_spec : C8983a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C4351e eVar = new FabTransformationBehavior.C4351e();
        eVar.f12364a = C9032h.m30133c(context, i);
        eVar.f12365b = new C9034j(17, 0.0f, 0.0f);
        return eVar;
    }
}
