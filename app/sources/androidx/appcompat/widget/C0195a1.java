package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.C2002u;

/* renamed from: androidx.appcompat.widget.a1 */
class C0195a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private static C0195a1 f884f;

    /* renamed from: o */
    private static C0195a1 f885o;

    /* renamed from: p */
    private final View f886p;

    /* renamed from: q */
    private final CharSequence f887q;

    /* renamed from: r */
    private final int f888r;

    /* renamed from: s */
    private final Runnable f889s = new C0196a();

    /* renamed from: t */
    private final Runnable f890t = new C0197b();

    /* renamed from: u */
    private int f891u;

    /* renamed from: v */
    private int f892v;

    /* renamed from: w */
    private C0200b1 f893w;

    /* renamed from: x */
    private boolean f894x;

    /* renamed from: androidx.appcompat.widget.a1$a */
    class C0196a implements Runnable {
        C0196a() {
        }

        public void run() {
            C0195a1.this.mo1243g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.a1$b */
    class C0197b implements Runnable {
        C0197b() {
        }

        public void run() {
            C0195a1.this.mo1242c();
        }
    }

    private C0195a1(View view, CharSequence charSequence) {
        this.f886p = view;
        this.f887q = charSequence;
        this.f888r = C2002u.m8471c(ViewConfiguration.get(view.getContext()));
        m1014b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m1013a() {
        this.f886p.removeCallbacks(this.f889s);
    }

    /* renamed from: b */
    private void m1014b() {
        this.f891u = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        this.f892v = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
    }

    /* renamed from: d */
    private void m1015d() {
        this.f886p.postDelayed(this.f889s, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m1016e(C0195a1 a1Var) {
        C0195a1 a1Var2 = f884f;
        if (a1Var2 != null) {
            a1Var2.m1013a();
        }
        f884f = a1Var;
        if (a1Var != null) {
            a1Var.m1015d();
        }
    }

    /* renamed from: f */
    public static void m1017f(View view, CharSequence charSequence) {
        C0195a1 a1Var = f884f;
        if (a1Var != null && a1Var.f886p == view) {
            m1016e((C0195a1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0195a1 a1Var2 = f885o;
            if (a1Var2 != null && a1Var2.f886p == view) {
                a1Var2.mo1242c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0195a1(view, charSequence);
    }

    /* renamed from: h */
    private boolean m1018h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f891u) <= this.f888r && Math.abs(y - this.f892v) <= this.f888r) {
            return false;
        }
        this.f891u = x;
        this.f892v = y;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1242c() {
        if (f885o == this) {
            f885o = null;
            C0200b1 b1Var = this.f893w;
            if (b1Var != null) {
                b1Var.mo1255c();
                this.f893w = null;
                m1014b();
                this.f886p.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f884f == this) {
            m1016e((C0195a1) null);
        }
        this.f886p.removeCallbacks(this.f890t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1243g(boolean z) {
        long j;
        if (C1988t.m8359Q(this.f886p)) {
            m1016e((C0195a1) null);
            C0195a1 a1Var = f885o;
            if (a1Var != null) {
                a1Var.mo1242c();
            }
            f885o = this;
            this.f894x = z;
            C0200b1 b1Var = new C0200b1(this.f886p.getContext());
            this.f893w = b1Var;
            b1Var.mo1257e(this.f886p, this.f891u, this.f892v, this.f894x, this.f887q);
            this.f886p.addOnAttachStateChangeListener(this);
            if (this.f894x) {
                j = 2500;
            } else {
                j = ((C1988t.m8351J(this.f886p) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f886p.removeCallbacks(this.f890t);
            this.f886p.postDelayed(this.f890t, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f893w != null && this.f894x) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f886p.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1014b();
                mo1242c();
            }
        } else if (this.f886p.isEnabled() && this.f893w == null && m1018h(motionEvent)) {
            m1016e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f891u = view.getWidth() / 2;
        this.f892v = view.getHeight() / 2;
        mo1243g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo1242c();
    }
}
