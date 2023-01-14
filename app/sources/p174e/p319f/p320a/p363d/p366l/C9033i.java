package p174e.p319f.p320a.p363d.p366l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: e.f.a.d.l.i */
public class C9033i {

    /* renamed from: a */
    private long f24834a = 0;

    /* renamed from: b */
    private long f24835b = 300;

    /* renamed from: c */
    private TimeInterpolator f24836c = null;

    /* renamed from: d */
    private int f24837d = 0;

    /* renamed from: e */
    private int f24838e = 1;

    public C9033i(long j, long j2) {
        this.f24834a = j;
        this.f24835b = j2;
    }

    public C9033i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f24834a = j;
        this.f24835b = j2;
        this.f24836c = timeInterpolator;
    }

    /* renamed from: b */
    static C9033i m30140b(ValueAnimator valueAnimator) {
        C9033i iVar = new C9033i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m30141f(valueAnimator));
        iVar.f24837d = valueAnimator.getRepeatCount();
        iVar.f24838e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: f */
    private static TimeInterpolator m30141f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C9025a.f24820b : interpolator instanceof AccelerateInterpolator ? C9025a.f24821c : interpolator instanceof DecelerateInterpolator ? C9025a.f24822d : interpolator;
    }

    /* renamed from: a */
    public void mo22930a(Animator animator) {
        animator.setStartDelay(mo22931c());
        animator.setDuration(mo22932d());
        animator.setInterpolator(mo22933e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo22935g());
            valueAnimator.setRepeatMode(mo22936h());
        }
    }

    /* renamed from: c */
    public long mo22931c() {
        return this.f24834a;
    }

    /* renamed from: d */
    public long mo22932d() {
        return this.f24835b;
    }

    /* renamed from: e */
    public TimeInterpolator mo22933e() {
        TimeInterpolator timeInterpolator = this.f24836c;
        return timeInterpolator != null ? timeInterpolator : C9025a.f24820b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9033i)) {
            return false;
        }
        C9033i iVar = (C9033i) obj;
        if (mo22931c() == iVar.mo22931c() && mo22932d() == iVar.mo22932d() && mo22935g() == iVar.mo22935g() && mo22936h() == iVar.mo22936h()) {
            return mo22933e().getClass().equals(iVar.mo22933e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo22935g() {
        return this.f24837d;
    }

    /* renamed from: h */
    public int mo22936h() {
        return this.f24838e;
    }

    public int hashCode() {
        return (((((((((int) (mo22931c() ^ (mo22931c() >>> 32))) * 31) + ((int) (mo22932d() ^ (mo22932d() >>> 32)))) * 31) + mo22933e().getClass().hashCode()) * 31) + mo22935g()) * 31) + mo22936h();
    }

    public String toString() {
        return 10 + C9033i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo22931c() + " duration: " + mo22932d() + " interpolator: " + mo22933e().getClass() + " repeatCount: " + mo22935g() + " repeatMode: " + mo22936h() + "}\n";
    }
}
