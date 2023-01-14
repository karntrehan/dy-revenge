package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0144p;

/* renamed from: androidx.appcompat.widget.h0 */
public abstract class C0225h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final float f974f;

    /* renamed from: o */
    private final int f975o;

    /* renamed from: p */
    private final int f976p;

    /* renamed from: q */
    final View f977q;

    /* renamed from: r */
    private Runnable f978r;

    /* renamed from: s */
    private Runnable f979s;

    /* renamed from: t */
    private boolean f980t;

    /* renamed from: u */
    private int f981u;

    /* renamed from: v */
    private final int[] f982v = new int[2];

    /* renamed from: androidx.appcompat.widget.h0$a */
    private class C0226a implements Runnable {
        C0226a() {
        }

        public void run() {
            ViewParent parent = C0225h0.this.f977q.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$b */
    private class C0227b implements Runnable {
        C0227b() {
        }

        public void run() {
            C0225h0.this.mo1388e();
        }
    }

    public C0225h0(View view) {
        this.f977q = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f974f = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f975o = tapTimeout;
        this.f976p = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m1138a() {
        Runnable runnable = this.f979s;
        if (runnable != null) {
            this.f977q.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f978r;
        if (runnable2 != null) {
            this.f977q.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m1139f(MotionEvent motionEvent) {
        C0218f0 f0Var;
        View view = this.f977q;
        C0144p b = mo445b();
        if (b == null || !b.mo544b() || (f0Var = (C0218f0) b.mo547j()) == null || !f0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1142i(view, obtainNoHistory);
        m1143j(f0Var, obtainNoHistory);
        boolean e = f0Var.mo1354e(obtainNoHistory, this.f981u);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1140g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f977q
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f981u
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f974f
            boolean r6 = m1141h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m1138a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m1138a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f981u = r6
            java.lang.Runnable r6 = r5.f978r
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.h0$a r6 = new androidx.appcompat.widget.h0$a
            r6.<init>()
            r5.f978r = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f978r
            int r1 = r5.f975o
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f979s
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.h0$b r6 = new androidx.appcompat.widget.h0$b
            r6.<init>()
            r5.f979s = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f979s
            int r1 = r5.f976p
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0225h0.m1140g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m1141h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m1142i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f982v;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m1143j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f982v;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    public abstract C0144p mo445b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo446c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1273d() {
        C0144p b = mo445b();
        if (b == null || !b.mo544b()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1388e() {
        m1138a();
        View view = this.f977q;
        if (view.isEnabled() && !view.isLongClickable() && mo446c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f980t = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f980t;
        if (z2) {
            z = m1139f(motionEvent) || !mo1273d();
        } else {
            z = m1140g(motionEvent) && mo446c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f977q.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f980t = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f980t = false;
        this.f981u = -1;
        Runnable runnable = this.f978r;
        if (runnable != null) {
            this.f977q.removeCallbacks(runnable);
        }
    }
}
