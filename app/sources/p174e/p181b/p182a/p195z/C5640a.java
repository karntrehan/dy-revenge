package p174e.p181b.p182a.p195z;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: e.b.a.z.a */
public abstract class C5640a extends ValueAnimator {

    /* renamed from: f */
    private final Set<ValueAnimator.AnimatorUpdateListener> f15961f = new CopyOnWriteArraySet();

    /* renamed from: o */
    private final Set<Animator.AnimatorListener> f15962o = new CopyOnWriteArraySet();

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f15962o.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f15961f.add(animatorUpdateListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16884c() {
        for (Animator.AnimatorListener onAnimationCancel : this.f15962o) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo16885d(boolean z) {
        for (Animator.AnimatorListener next : this.f15962o) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationEnd(this, z);
            } else {
                next.onAnimationEnd(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo16886e() {
        for (Animator.AnimatorListener onAnimationRepeat : this.f15962o) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16887f(boolean z) {
        for (Animator.AnimatorListener next : this.f15962o) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationStart(this, z);
            } else {
                next.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo16888g() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f15961f) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f15962o.clear();
    }

    public void removeAllUpdateListeners() {
        this.f15961f.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f15962o.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f15961f.remove(animatorUpdateListener);
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
