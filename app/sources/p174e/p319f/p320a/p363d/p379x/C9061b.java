package p174e.p319f.p320a.p363d.p379x;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: e.f.a.d.x.b */
public class C9061b {
    /* renamed from: a */
    public static TypedValue m30193a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m30194b(Context context, int i, boolean z) {
        TypedValue a = m30193a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    /* renamed from: c */
    public static int m30195c(Context context, int i, String str) {
        TypedValue a = m30193a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: d */
    public static int m30196d(View view, int i) {
        return m30195c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
