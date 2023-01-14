package p027c.p100v;

import android.view.ViewGroup;

/* renamed from: c.v.u */
public class C2196u {

    /* renamed from: a */
    private ViewGroup f6405a;

    /* renamed from: b */
    private Runnable f6406b;

    /* renamed from: b */
    public static C2196u m9289b(ViewGroup viewGroup) {
        return (C2196u) viewGroup.getTag(C2192s.transition_current_scene);
    }

    /* renamed from: c */
    static void m9290c(ViewGroup viewGroup, C2196u uVar) {
        viewGroup.setTag(C2192s.transition_current_scene, uVar);
    }

    /* renamed from: a */
    public void mo7357a() {
        Runnable runnable;
        if (m9289b(this.f6405a) == this && (runnable = this.f6406b) != null) {
            runnable.run();
        }
    }
}
