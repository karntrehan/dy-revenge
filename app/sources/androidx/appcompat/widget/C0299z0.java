package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.z0 */
public class C0299z0 {
    /* renamed from: a */
    public static void m1497a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0195a1.m1017f(view, charSequence);
        }
    }
}
