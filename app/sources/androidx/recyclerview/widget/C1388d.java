package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.recyclerview.widget.d */
class C1388d extends RecyclerView.C1341n implements RecyclerView.C1350s {

    /* renamed from: a */
    private static final int[] f4055a = {16842919};

    /* renamed from: b */
    private static final int[] f4056b = new int[0];

    /* renamed from: A */
    private final int[] f4057A = new int[2];

    /* renamed from: B */
    final ValueAnimator f4058B;

    /* renamed from: C */
    int f4059C;

    /* renamed from: D */
    private final Runnable f4060D;

    /* renamed from: E */
    private final RecyclerView.C1351t f4061E;

    /* renamed from: c */
    private final int f4062c;

    /* renamed from: d */
    private final int f4063d;

    /* renamed from: e */
    final StateListDrawable f4064e;

    /* renamed from: f */
    final Drawable f4065f;

    /* renamed from: g */
    private final int f4066g;

    /* renamed from: h */
    private final int f4067h;

    /* renamed from: i */
    private final StateListDrawable f4068i;

    /* renamed from: j */
    private final Drawable f4069j;

    /* renamed from: k */
    private final int f4070k;

    /* renamed from: l */
    private final int f4071l;

    /* renamed from: m */
    int f4072m;

    /* renamed from: n */
    int f4073n;

    /* renamed from: o */
    float f4074o;

    /* renamed from: p */
    int f4075p;

    /* renamed from: q */
    int f4076q;

    /* renamed from: r */
    float f4077r;

    /* renamed from: s */
    private int f4078s = 0;

    /* renamed from: t */
    private int f4079t = 0;

    /* renamed from: u */
    private RecyclerView f4080u;

    /* renamed from: v */
    private boolean f4081v = false;

    /* renamed from: w */
    private boolean f4082w = false;

    /* renamed from: x */
    private int f4083x = 0;

    /* renamed from: y */
    private int f4084y = 0;

    /* renamed from: z */
    private final int[] f4085z = new int[2];

    /* renamed from: androidx.recyclerview.widget.d$a */
    class C1389a implements Runnable {
        C1389a() {
        }

        public void run() {
            C1388d.this.mo5149q(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    class C1390b extends RecyclerView.C1351t {
        C1390b() {
        }

        /* renamed from: b */
        public void mo4924b(RecyclerView recyclerView, int i, int i2) {
            C1388d.this.mo5147B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    private class C1391c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4088a = false;

        C1391c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f4088a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f4088a) {
                this.f4088a = false;
            } else if (((Float) C1388d.this.f4058B.getAnimatedValue()).floatValue() == 0.0f) {
                C1388d dVar = C1388d.this;
                dVar.f4059C = 0;
                dVar.mo5153y(0);
            } else {
                C1388d dVar2 = C1388d.this;
                dVar2.f4059C = 2;
                dVar2.mo5152v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    private class C1392d implements ValueAnimator.AnimatorUpdateListener {
        C1392d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1388d.this.f4064e.setAlpha(floatValue);
            C1388d.this.f4065f.setAlpha(floatValue);
            C1388d.this.mo5152v();
        }
    }

    C1388d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f4058B = ofFloat;
        this.f4059C = 0;
        this.f4060D = new C1389a();
        this.f4061E = new C1390b();
        this.f4064e = stateListDrawable;
        this.f4065f = drawable;
        this.f4068i = stateListDrawable2;
        this.f4069j = drawable2;
        this.f4066g = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4067h = Math.max(i, drawable.getIntrinsicWidth());
        this.f4070k = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4071l = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4062c = i2;
        this.f4063d = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1391c());
        ofFloat.addUpdateListener(new C1392d());
        mo5148j(recyclerView);
    }

    /* renamed from: C */
    private void m6140C(float f) {
        int[] p = m6146p();
        float max = Math.max((float) p[0], Math.min((float) p[1], f));
        if (Math.abs(((float) this.f4073n) - max) >= 2.0f) {
            int x = m6150x(this.f4074o, max, p, this.f4080u.computeVerticalScrollRange(), this.f4080u.computeVerticalScrollOffset(), this.f4079t);
            if (x != 0) {
                this.f4080u.scrollBy(0, x);
            }
            this.f4074o = max;
        }
    }

    /* renamed from: k */
    private void m6141k() {
        this.f4080u.removeCallbacks(this.f4060D);
    }

    /* renamed from: l */
    private void m6142l() {
        this.f4080u.removeItemDecoration(this);
        this.f4080u.removeOnItemTouchListener(this);
        this.f4080u.removeOnScrollListener(this.f4061E);
        m6141k();
    }

    /* renamed from: m */
    private void m6143m(Canvas canvas) {
        int i = this.f4079t;
        int i2 = this.f4070k;
        int i3 = i - i2;
        int i4 = this.f4076q;
        int i5 = this.f4075p;
        int i6 = i4 - (i5 / 2);
        this.f4068i.setBounds(0, 0, i5, i2);
        this.f4069j.setBounds(0, 0, this.f4078s, this.f4071l);
        canvas.translate(0.0f, (float) i3);
        this.f4069j.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f4068i.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: n */
    private void m6144n(Canvas canvas) {
        int i = this.f4078s;
        int i2 = this.f4066g;
        int i3 = i - i2;
        int i4 = this.f4073n;
        int i5 = this.f4072m;
        int i6 = i4 - (i5 / 2);
        this.f4064e.setBounds(0, 0, i2, i5);
        this.f4065f.setBounds(0, 0, this.f4067h, this.f4079t);
        if (m6148s()) {
            this.f4065f.draw(canvas);
            canvas.translate((float) this.f4066g, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f4064e.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f4066g;
        } else {
            canvas.translate((float) i3, 0.0f);
            this.f4065f.draw(canvas);
            canvas.translate(0.0f, (float) i6);
            this.f4064e.draw(canvas);
        }
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: o */
    private int[] m6145o() {
        int[] iArr = this.f4057A;
        int i = this.f4063d;
        iArr[0] = i;
        iArr[1] = this.f4078s - i;
        return iArr;
    }

    /* renamed from: p */
    private int[] m6146p() {
        int[] iArr = this.f4085z;
        int i = this.f4063d;
        iArr[0] = i;
        iArr[1] = this.f4079t - i;
        return iArr;
    }

    /* renamed from: r */
    private void m6147r(float f) {
        int[] o = m6145o();
        float max = Math.max((float) o[0], Math.min((float) o[1], f));
        if (Math.abs(((float) this.f4076q) - max) >= 2.0f) {
            int x = m6150x(this.f4077r, max, o, this.f4080u.computeHorizontalScrollRange(), this.f4080u.computeHorizontalScrollOffset(), this.f4078s);
            if (x != 0) {
                this.f4080u.scrollBy(x, 0);
            }
            this.f4077r = max;
        }
    }

    /* renamed from: s */
    private boolean m6148s() {
        return C1988t.m8417y(this.f4080u) == 1;
    }

    /* renamed from: w */
    private void m6149w(int i) {
        m6141k();
        this.f4080u.postDelayed(this.f4060D, (long) i);
    }

    /* renamed from: x */
    private int m6150x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: z */
    private void m6151z() {
        this.f4080u.addItemDecoration(this);
        this.f4080u.addOnItemTouchListener(this);
        this.f4080u.addOnScrollListener(this.f4061E);
    }

    /* renamed from: A */
    public void mo5146A() {
        int i = this.f4059C;
        if (i != 0) {
            if (i == 3) {
                this.f4058B.cancel();
            } else {
                return;
            }
        }
        this.f4059C = 1;
        ValueAnimator valueAnimator = this.f4058B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f4058B.setDuration(500);
        this.f4058B.setStartDelay(0);
        this.f4058B.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo5147B(int i, int i2) {
        int computeVerticalScrollRange = this.f4080u.computeVerticalScrollRange();
        int i3 = this.f4079t;
        this.f4081v = computeVerticalScrollRange - i3 > 0 && i3 >= this.f4062c;
        int computeHorizontalScrollRange = this.f4080u.computeHorizontalScrollRange();
        int i4 = this.f4078s;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f4062c;
        this.f4082w = z;
        boolean z2 = this.f4081v;
        if (z2 || z) {
            if (z2) {
                float f = (float) i3;
                this.f4073n = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f4072m = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f4082w) {
                float f2 = (float) i4;
                this.f4076q = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f4075p = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f4083x;
            if (i5 == 0 || i5 == 1) {
                mo5153y(1);
            }
        } else if (this.f4083x != 0) {
            mo5153y(0);
        }
    }

    /* renamed from: a */
    public void mo4920a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4083x != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u = mo5151u(motionEvent.getX(), motionEvent.getY());
                boolean t = mo5150t(motionEvent.getX(), motionEvent.getY());
                if (u || t) {
                    if (t) {
                        this.f4084y = 1;
                        this.f4077r = (float) ((int) motionEvent.getX());
                    } else if (u) {
                        this.f4084y = 2;
                        this.f4074o = (float) ((int) motionEvent.getY());
                    }
                    mo5153y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f4083x == 2) {
                this.f4074o = 0.0f;
                this.f4077r = 0.0f;
                mo5153y(1);
                this.f4084y = 0;
            } else if (motionEvent.getAction() == 2 && this.f4083x == 2) {
                mo5146A();
                if (this.f4084y == 1) {
                    m6147r(motionEvent.getX());
                }
                if (this.f4084y == 2) {
                    m6140C(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo4921b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4083x;
        if (i != 1) {
            return i == 2;
        }
        boolean u = mo5151u(motionEvent.getX(), motionEvent.getY());
        boolean t = mo5150t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!u && !t) {
            return false;
        }
        if (t) {
            this.f4084y = 1;
            this.f4077r = (float) ((int) motionEvent.getX());
        } else if (u) {
            this.f4084y = 2;
            this.f4074o = (float) ((int) motionEvent.getY());
        }
        mo5153y(2);
    }

    /* renamed from: c */
    public void mo4922c(boolean z) {
    }

    /* renamed from: i */
    public void mo4813i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1322a0 a0Var) {
        if (this.f4078s != this.f4080u.getWidth() || this.f4079t != this.f4080u.getHeight()) {
            this.f4078s = this.f4080u.getWidth();
            this.f4079t = this.f4080u.getHeight();
            mo5153y(0);
        } else if (this.f4059C != 0) {
            if (this.f4081v) {
                m6144n(canvas);
            }
            if (this.f4082w) {
                m6143m(canvas);
            }
        }
    }

    /* renamed from: j */
    public void mo5148j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4080u;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m6142l();
            }
            this.f4080u = recyclerView;
            if (recyclerView != null) {
                m6151z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5149q(int i) {
        int i2 = this.f4059C;
        if (i2 == 1) {
            this.f4058B.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f4059C = 3;
        ValueAnimator valueAnimator = this.f4058B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f4058B.setDuration((long) i);
        this.f4058B.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5150t(float f, float f2) {
        if (f2 >= ((float) (this.f4079t - this.f4070k))) {
            int i = this.f4076q;
            int i2 = this.f4075p;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo5151u(float f, float f2) {
        if (!m6148s() ? f >= ((float) (this.f4078s - this.f4066g)) : f <= ((float) (this.f4066g / 2))) {
            int i = this.f4073n;
            int i2 = this.f4072m;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo5152v() {
        this.f4080u.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo5153y(int i) {
        int i2;
        if (i == 2 && this.f4083x != 2) {
            this.f4064e.setState(f4055a);
            m6141k();
        }
        if (i == 0) {
            mo5152v();
        } else {
            mo5146A();
        }
        if (this.f4083x != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f4083x = i;
        }
        this.f4064e.setState(f4056b);
        i2 = 1200;
        m6149w(i2);
        this.f4083x = i;
    }
}
