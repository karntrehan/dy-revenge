package p027c.p100v;

import android.os.IBinder;

/* renamed from: c.v.x0 */
class C2221x0 implements C2227z0 {

    /* renamed from: a */
    private final IBinder f6487a;

    C2221x0(IBinder iBinder) {
        this.f6487a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2221x0) && ((C2221x0) obj).f6487a.equals(this.f6487a);
    }

    public int hashCode() {
        return this.f6487a.hashCode();
    }
}
