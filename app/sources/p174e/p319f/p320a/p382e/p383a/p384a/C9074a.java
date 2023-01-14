package p174e.p319f.p320a.p382e.p383a.p384a;

import android.app.PendingIntent;

/* renamed from: e.f.a.e.a.a.a */
public abstract class C9074a {
    /* renamed from: a */
    public static C9074a m30232a(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new C9095u(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    /* renamed from: l */
    private final boolean m30233l(C9077d dVar) {
        return dVar.mo23058a() && mo23037c() <= mo23039e();
    }

    /* renamed from: b */
    public abstract int mo23036b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract long mo23037c();

    /* renamed from: d */
    public abstract long mo23038d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract long mo23039e();

    /* renamed from: f */
    public abstract Integer mo23040f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract PendingIntent mo23041g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract PendingIntent mo23042h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract PendingIntent mo23043i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract PendingIntent mo23044j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final PendingIntent mo23045k(C9077d dVar) {
        if (dVar.mo23059b() != 0) {
            if (dVar.mo23059b() == 1) {
                if (mo23041g() != null) {
                    return mo23041g();
                }
                if (m30233l(dVar)) {
                    return mo23043i();
                }
            }
            return null;
        } else if (mo23042h() != null) {
            return mo23042h();
        } else {
            if (m30233l(dVar)) {
                return mo23044j();
            }
            return null;
        }
    }

    /* renamed from: m */
    public abstract int mo23046m();

    /* renamed from: n */
    public boolean mo23047n(int i) {
        return mo23045k(C9077d.m30257c(i)) != null;
    }

    /* renamed from: o */
    public boolean mo23048o(C9077d dVar) {
        return mo23045k(dVar) != null;
    }

    /* renamed from: p */
    public abstract String mo23049p();

    /* renamed from: q */
    public abstract long mo23050q();

    /* renamed from: r */
    public abstract int mo23051r();

    /* renamed from: s */
    public abstract int mo23052s();
}
