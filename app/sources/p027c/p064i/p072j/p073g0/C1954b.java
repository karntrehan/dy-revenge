package p027c.p064i.p072j.p073g0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: c.i.j.g0.b */
public final class C1954b {
    /* renamed from: a */
    public static int m8185a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m8186b(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
