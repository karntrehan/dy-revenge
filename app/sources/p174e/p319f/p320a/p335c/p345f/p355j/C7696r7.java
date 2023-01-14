package p174e.p319f.p320a.p335c.p345f.p355j;

import android.os.SystemClock;

/* renamed from: e.f.a.c.f.j.r7 */
public final class C7696r7 {
    /* renamed from: a */
    public static void m27769a(C7582f7 f7Var, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        f7Var.mo21083b(m27770b(i, i2, j, i3, i4, i5, i6), C7756y4.INPUT_IMAGE_CONSTRUCTION);
    }

    /* renamed from: b */
    private static C7687q7 m27770b(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        return new C7687q7(i, i2, i5, i3, i4, SystemClock.elapsedRealtime() - j, i6);
    }
}
