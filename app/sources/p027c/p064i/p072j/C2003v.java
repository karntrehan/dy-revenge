package p027c.p064i.p072j;

import android.os.Build;
import android.view.ViewGroup;
import p027c.p064i.C1825b;

/* renamed from: c.i.j.v */
public final class C2003v {
    /* renamed from: a */
    public static boolean m8474a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C1825b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C1988t.m8347H(viewGroup) == null) ? false : true;
    }
}
