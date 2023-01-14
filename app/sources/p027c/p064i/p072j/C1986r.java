package p027c.p064i.p072j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: c.i.j.r */
public final class C1986r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final View f5748f;

    /* renamed from: o */
    private ViewTreeObserver f5749o;

    /* renamed from: p */
    private final Runnable f5750p;

    private C1986r(View view, Runnable runnable) {
        this.f5748f = view;
        this.f5749o = view.getViewTreeObserver();
        this.f5750p = runnable;
    }

    /* renamed from: a */
    public static C1986r m8331a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        C1986r rVar = new C1986r(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(rVar);
        view.addOnAttachStateChangeListener(rVar);
        return rVar;
    }

    /* renamed from: b */
    public void mo6662b() {
        (this.f5749o.isAlive() ? this.f5749o : this.f5748f.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f5748f.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo6662b();
        this.f5750p.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f5749o = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo6662b();
    }
}
