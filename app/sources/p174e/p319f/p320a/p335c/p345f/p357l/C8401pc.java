package p174e.p319f.p320a.p335c.p345f.p357l;

import okhttp3.internal.http2.Settings;

/* renamed from: e.f.a.c.f.l.pc */
final class C8401pc {

    /* renamed from: a */
    private final Object f22908a;

    /* renamed from: b */
    private final int f22909b;

    C8401pc(Object obj, int i) {
        this.f22908a = obj;
        this.f22909b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8401pc)) {
            return false;
        }
        C8401pc pcVar = (C8401pc) obj;
        return this.f22908a == pcVar.f22908a && this.f22909b == pcVar.f22909b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f22908a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f22909b;
    }
}
