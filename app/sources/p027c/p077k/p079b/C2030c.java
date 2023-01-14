package p027c.p077k.p079b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.k.b.c */
public class C2030c {

    /* renamed from: a */
    private static final Interpolator f5826a = new C2031a();

    /* renamed from: b */
    private int f5827b;

    /* renamed from: c */
    private int f5828c;

    /* renamed from: d */
    private int f5829d = -1;

    /* renamed from: e */
    private float[] f5830e;

    /* renamed from: f */
    private float[] f5831f;

    /* renamed from: g */
    private float[] f5832g;

    /* renamed from: h */
    private float[] f5833h;

    /* renamed from: i */
    private int[] f5834i;

    /* renamed from: j */
    private int[] f5835j;

    /* renamed from: k */
    private int[] f5836k;

    /* renamed from: l */
    private int f5837l;

    /* renamed from: m */
    private VelocityTracker f5838m;

    /* renamed from: n */
    private float f5839n;

    /* renamed from: o */
    private float f5840o;

    /* renamed from: p */
    private int f5841p;

    /* renamed from: q */
    private int f5842q;

    /* renamed from: r */
    private OverScroller f5843r;

    /* renamed from: s */
    private final C2033c f5844s;

    /* renamed from: t */
    private View f5845t;

    /* renamed from: u */
    private boolean f5846u;

    /* renamed from: v */
    private final ViewGroup f5847v;

    /* renamed from: w */
    private final Runnable f5848w = new C2032b();

    /* renamed from: c.k.b.c$a */
    static class C2031a implements Interpolator {
        C2031a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: c.k.b.c$b */
    class C2032b implements Runnable {
        C2032b() {
        }

        public void run() {
            C2030c.this.mo6763J(0);
        }
    }

    /* renamed from: c.k.b.c$c */
    public static abstract class C2033c {
        /* renamed from: a */
        public abstract int mo6782a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo6783b(View view, int i, int i2);

        /* renamed from: c */
        public int mo6784c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo6785d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo6786e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo6787f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo6788g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo6789h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo6790i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo6791j(int i);

        /* renamed from: k */
        public abstract void mo6792k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo6793l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo6794m(View view, int i);
    }

    private C2030c(Context context, ViewGroup viewGroup, C2033c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f5847v = viewGroup;
            this.f5844s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f5841p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f5828c = viewConfiguration.getScaledTouchSlop();
            this.f5839n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f5840o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f5843r = new OverScroller(context, f5826a);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: C */
    private boolean m8587C(int i) {
        if (mo6760B(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: F */
    private void m8588F() {
        this.f5838m.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f5839n);
        m8602p(m8594g(this.f5838m.getXVelocity(this.f5829d), this.f5840o, this.f5839n), m8594g(this.f5838m.getYVelocity(this.f5829d), this.f5840o, this.f5839n));
    }

    /* renamed from: G */
    private void m8589G(float f, float f2, int i) {
        int i2 = 1;
        if (!m8592c(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m8592c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m8592c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m8592c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f5835j;
            iArr[i] = iArr[i] | i2;
            this.f5844s.mo6787f(i2, i);
        }
    }

    /* renamed from: H */
    private void m8590H(float f, float f2, int i) {
        m8605s(i);
        float[] fArr = this.f5830e;
        this.f5832g[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f5831f;
        this.f5833h[i] = f2;
        fArr2[i] = f2;
        this.f5834i[i] = m8607x((int) f, (int) f2);
        this.f5837l |= 1 << i;
    }

    /* renamed from: I */
    private void m8591I(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m8587C(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f5832g[pointerId] = x;
                this.f5833h[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m8592c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f5834i[i] & i2) != i2 || (this.f5842q & i2) == 0 || (this.f5836k[i] & i2) == i2 || (this.f5835j[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f5828c;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f5844s.mo6788g(i2)) {
            return (this.f5835j[i] & i2) == 0 && abs > ((float) this.f5828c);
        }
        int[] iArr = this.f5836k;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: f */
    private boolean m8593f(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f5844s.mo6785d(view) > 0;
        boolean z2 = this.f5844s.mo6786e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f5828c) : z2 && Math.abs(f2) > ((float) this.f5828c);
        }
        int i = this.f5828c;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: g */
    private float m8594g(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: h */
    private int m8595h(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: i */
    private void m8596i() {
        float[] fArr = this.f5830e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f5831f, 0.0f);
            Arrays.fill(this.f5832g, 0.0f);
            Arrays.fill(this.f5833h, 0.0f);
            Arrays.fill(this.f5834i, 0);
            Arrays.fill(this.f5835j, 0);
            Arrays.fill(this.f5836k, 0);
            this.f5837l = 0;
        }
    }

    /* renamed from: j */
    private void m8597j(int i) {
        if (this.f5830e != null && mo6760B(i)) {
            this.f5830e[i] = 0.0f;
            this.f5831f[i] = 0.0f;
            this.f5832g[i] = 0.0f;
            this.f5833h[i] = 0.0f;
            this.f5834i[i] = 0;
            this.f5835j[i] = 0;
            this.f5836k[i] = 0;
            this.f5837l = (~(1 << i)) & this.f5837l;
        }
    }

    /* renamed from: k */
    private int m8598k(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f5847v.getWidth();
        float f = (float) (width / 2);
        float q = f + (m8603q(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(q / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: l */
    private int m8599l(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int h = m8595h(i3, (int) this.f5840o, (int) this.f5839n);
        int h2 = m8595h(i4, (int) this.f5840o, (int) this.f5839n);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(h);
        int abs4 = Math.abs(h2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (h != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (h2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m8598k(i, h, this.f5844s.mo6785d(view))) * f5) + (((float) m8598k(i2, h2, this.f5844s.mo6786e(view))) * f6));
    }

    /* renamed from: n */
    public static C2030c m8600n(ViewGroup viewGroup, float f, C2033c cVar) {
        C2030c o = m8601o(viewGroup, cVar);
        o.f5828c = (int) (((float) o.f5828c) * (1.0f / f));
        return o;
    }

    /* renamed from: o */
    public static C2030c m8601o(ViewGroup viewGroup, C2033c cVar) {
        return new C2030c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: p */
    private void m8602p(float f, float f2) {
        this.f5846u = true;
        this.f5844s.mo6793l(this.f5845t, f, f2);
        this.f5846u = false;
        if (this.f5827b == 1) {
            mo6763J(0);
        }
    }

    /* renamed from: q */
    private float m8603q(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: r */
    private void m8604r(int i, int i2, int i3, int i4) {
        int left = this.f5845t.getLeft();
        int top = this.f5845t.getTop();
        if (i3 != 0) {
            i = this.f5844s.mo6782a(this.f5845t, i, i3);
            C1988t.m8366X(this.f5845t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f5844s.mo6783b(this.f5845t, i2, i4);
            C1988t.m8367Y(this.f5845t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f5844s.mo6792k(this.f5845t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: s */
    private void m8605s(int i) {
        float[] fArr = this.f5830e;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5831f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5832g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5833h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5834i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5835j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5836k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5830e = fArr2;
            this.f5831f = fArr3;
            this.f5832g = fArr4;
            this.f5833h = fArr5;
            this.f5834i = iArr;
            this.f5835j = iArr2;
            this.f5836k = iArr3;
        }
    }

    /* renamed from: u */
    private boolean m8606u(int i, int i2, int i3, int i4) {
        int left = this.f5845t.getLeft();
        int top = this.f5845t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f5843r.abortAnimation();
            mo6763J(0);
            return false;
        }
        this.f5843r.startScroll(left, top, i5, i6, m8599l(this.f5845t, i5, i6, i3, i4));
        mo6763J(2);
        return true;
    }

    /* renamed from: x */
    private int m8607x(int i, int i2) {
        int i3 = i < this.f5847v.getLeft() + this.f5841p ? 1 : 0;
        if (i2 < this.f5847v.getTop() + this.f5841p) {
            i3 |= 4;
        }
        if (i > this.f5847v.getRight() - this.f5841p) {
            i3 |= 2;
        }
        return i2 > this.f5847v.getBottom() - this.f5841p ? i3 | 8 : i3;
    }

    /* renamed from: A */
    public boolean mo6759A(int i, int i2) {
        return mo6761D(this.f5845t, i, i2);
    }

    /* renamed from: B */
    public boolean mo6760B(int i) {
        return ((1 << i) & this.f5837l) != 0;
    }

    /* renamed from: D */
    public boolean mo6761D(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: E */
    public void mo6762E(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo6770a();
        }
        if (this.f5838m == null) {
            this.f5838m = VelocityTracker.obtain();
        }
        this.f5838m.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f5827b != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m8587C(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f5830e[pointerId];
                                float f2 = y - this.f5831f[pointerId];
                                m8589G(f, f2, pointerId);
                                if (this.f5827b != 1) {
                                    View t = mo6775t((int) x, (int) y);
                                    if (m8593f(t, f, f2) && mo6769P(t, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (m8587C(this.f5829d)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f5829d);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f5832g;
                        int i3 = this.f5829d;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f5833h[i3]);
                        m8604r(this.f5845t.getLeft() + i4, this.f5845t.getTop() + i5, i4, i5);
                    } else {
                        return;
                    }
                    m8591I(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        m8590H(x3, y3, pointerId2);
                        if (this.f5827b == 0) {
                            mo6769P(mo6775t((int) x3, (int) y3), pointerId2);
                            int i6 = this.f5834i[pointerId2];
                            int i7 = this.f5842q;
                            if ((i6 & i7) != 0) {
                                this.f5844s.mo6789h(i6 & i7, pointerId2);
                                return;
                            }
                            return;
                        } else if (mo6759A((int) x3, (int) y3)) {
                            mo6769P(this.f5845t, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f5827b == 1 && pointerId3 == this.f5829d) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f5829d) {
                                    View t2 = mo6775t((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f5845t;
                                    if (t2 == view && mo6769P(view, pointerId4)) {
                                        i = this.f5829d;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                m8588F();
                            }
                        }
                        m8597j(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f5827b == 1) {
                    m8602p(0.0f, 0.0f);
                }
            } else if (this.f5827b == 1) {
                m8588F();
            }
            mo6770a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View t3 = mo6775t((int) x4, (int) y4);
        m8590H(x4, y4, pointerId5);
        mo6769P(t3, pointerId5);
        int i8 = this.f5834i[pointerId5];
        int i9 = this.f5842q;
        if ((i8 & i9) != 0) {
            this.f5844s.mo6789h(i8 & i9, pointerId5);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo6763J(int i) {
        this.f5847v.removeCallbacks(this.f5848w);
        if (this.f5827b != i) {
            this.f5827b = i;
            this.f5844s.mo6791j(i);
            if (this.f5827b == 0) {
                this.f5845t = null;
            }
        }
    }

    /* renamed from: K */
    public void mo6764K(int i) {
        this.f5842q = i;
    }

    /* renamed from: L */
    public void mo6765L(float f) {
        this.f5840o = f;
    }

    /* renamed from: M */
    public boolean mo6766M(int i, int i2) {
        if (this.f5846u) {
            return m8606u(i, i2, (int) this.f5838m.getXVelocity(this.f5829d), (int) this.f5838m.getYVelocity(this.f5829d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6767N(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo6770a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f5838m
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f5838m = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f5838m
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m8597j(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m8590H(r7, r1, r2)
            int r3 = r0.f5827b
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f5834i
            r1 = r1[r2]
            int r3 = r0.f5842q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            c.k.b.c$c r4 = r0.f5844s
            r1 = r1 & r3
            r4.mo6789h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo6775t(r3, r1)
            android.view.View r3 = r0.f5845t
            if (r1 != r3) goto L_0x0031
            r0.mo6769P(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f5830e
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f5831f
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m8587C(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f5830e
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f5831f
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo6775t(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m8593f(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            c.k.b.c$c r14 = r0.f5844s
            int r12 = r14.mo6782a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            c.k.b.c$c r5 = r0.f5844s
            int r5 = r5.mo6783b(r7, r15, r14)
            c.k.b.c$c r14 = r0.f5844s
            int r14 = r14.mo6785d(r7)
            c.k.b.c$c r15 = r0.f5844s
            int r15 = r15.mo6786e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m8589G(r9, r10, r4)
            int r5 = r0.f5827b
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo6769P(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m8591I(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo6770a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m8590H(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo6775t(r2, r3)
            android.view.View r3 = r0.f5845t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f5827b
            if (r3 != r4) goto L_0x0125
            r0.mo6769P(r2, r1)
        L_0x0125:
            int[] r2 = r0.f5834i
            r2 = r2[r1]
            int r3 = r0.f5842q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            c.k.b.c$c r4 = r0.f5844s
            r2 = r2 & r3
            r4.mo6789h(r2, r1)
        L_0x0135:
            int r1 = r0.f5827b
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p077k.p079b.C2030c.mo6767N(android.view.MotionEvent):boolean");
    }

    /* renamed from: O */
    public boolean mo6768O(View view, int i, int i2) {
        this.f5845t = view;
        this.f5829d = -1;
        boolean u = m8606u(i, i2, 0, 0);
        if (!u && this.f5827b == 0 && this.f5845t != null) {
            this.f5845t = null;
        }
        return u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo6769P(View view, int i) {
        if (view == this.f5845t && this.f5829d == i) {
            return true;
        }
        if (view == null || !this.f5844s.mo6794m(view, i)) {
            return false;
        }
        this.f5829d = i;
        mo6771b(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo6770a() {
        this.f5829d = -1;
        m8596i();
        VelocityTracker velocityTracker = this.f5838m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5838m = null;
        }
    }

    /* renamed from: b */
    public void mo6771b(View view, int i) {
        if (view.getParent() == this.f5847v) {
            this.f5845t = view;
            this.f5829d = i;
            this.f5844s.mo6790i(view, i);
            mo6763J(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f5847v + ")");
    }

    /* renamed from: d */
    public boolean mo6772d(int i) {
        int length = this.f5830e.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo6773e(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo6773e(int i, int i2) {
        if (!mo6760B(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f5832g[i2] - this.f5830e[i2];
        float f2 = this.f5833h[i2] - this.f5831f[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f5828c) : z2 && Math.abs(f2) > ((float) this.f5828c);
        }
        int i3 = this.f5828c;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    /* renamed from: m */
    public boolean mo6774m(boolean z) {
        if (this.f5827b == 2) {
            boolean computeScrollOffset = this.f5843r.computeScrollOffset();
            int currX = this.f5843r.getCurrX();
            int currY = this.f5843r.getCurrY();
            int left = currX - this.f5845t.getLeft();
            int top = currY - this.f5845t.getTop();
            if (left != 0) {
                C1988t.m8366X(this.f5845t, left);
            }
            if (top != 0) {
                C1988t.m8367Y(this.f5845t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f5844s.mo6792k(this.f5845t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f5843r.getFinalX() && currY == this.f5843r.getFinalY()) {
                this.f5843r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f5847v.post(this.f5848w);
                } else {
                    mo6763J(0);
                }
            }
        }
        return this.f5827b == 2;
    }

    /* renamed from: t */
    public View mo6775t(int i, int i2) {
        for (int childCount = this.f5847v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f5847v.getChildAt(this.f5844s.mo6784c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public View mo6776v() {
        return this.f5845t;
    }

    /* renamed from: w */
    public int mo6777w() {
        return this.f5841p;
    }

    /* renamed from: y */
    public int mo6778y() {
        return this.f5828c;
    }

    /* renamed from: z */
    public int mo6779z() {
        return this.f5827b;
    }
}
