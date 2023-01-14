package com.facebook.react.views.scroll;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.C2766g;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C2929d;
import com.facebook.react.uimanager.C2997l;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3052v;
import com.facebook.react.uimanager.C3054w;
import com.facebook.react.uimanager.C3060z;
import com.facebook.react.uimanager.events.C2954h;
import com.facebook.react.uimanager.p121k1.C2996a;
import com.facebook.react.views.view.C3244f;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.lang.reflect.Field;
import java.util.List;
import p027c.p064i.p072j.C1988t;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.views.scroll.e */
public class C3134e extends ScrollView implements C3052v, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, C3060z {

    /* renamed from: f */
    private static Field f8748f = null;

    /* renamed from: o */
    private static boolean f8749o = false;

    /* renamed from: A */
    private boolean f8750A = true;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f8751B;

    /* renamed from: C */
    private C3125a f8752C = null;

    /* renamed from: D */
    private String f8753D;

    /* renamed from: E */
    private Drawable f8754E;

    /* renamed from: F */
    private int f8755F = 0;

    /* renamed from: G */
    private boolean f8756G = false;

    /* renamed from: H */
    private int f8757H = 0;

    /* renamed from: I */
    private float f8758I = 0.985f;

    /* renamed from: J */
    private List<Integer> f8759J;

    /* renamed from: K */
    private boolean f8760K = true;

    /* renamed from: L */
    private boolean f8761L = true;

    /* renamed from: M */
    private int f8762M = 0;

    /* renamed from: N */
    private View f8763N;

    /* renamed from: O */
    private C3244f f8764O;

    /* renamed from: P */
    private int f8765P = -1;

    /* renamed from: Q */
    private int f8766Q = -1;

    /* renamed from: R */
    private final C2929d f8767R = new C2929d();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public ValueAnimator f8768S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f8769T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f8770U;

    /* renamed from: V */
    private int f8771V = 0;

    /* renamed from: W */
    private int f8772W = -1;

    /* renamed from: a0 */
    private int f8773a0 = -1;

    /* renamed from: p */
    private final C3126b f8774p = new C3126b();

    /* renamed from: q */
    private final OverScroller f8775q;

    /* renamed from: r */
    private final C3149j f8776r = new C3149j();

    /* renamed from: s */
    private final Rect f8777s = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f8778t;

    /* renamed from: u */
    private Rect f8779u;

    /* renamed from: v */
    private String f8780v = "hidden";

    /* renamed from: w */
    private boolean f8781w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f8782x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Runnable f8783y;

    /* renamed from: z */
    private boolean f8784z;

    /* renamed from: com.facebook.react.views.scroll.e$a */
    class C3135a implements Runnable {

        /* renamed from: f */
        private boolean f8785f = false;

        /* renamed from: o */
        private boolean f8786o = true;

        /* renamed from: p */
        private int f8787p = 0;

        C3135a() {
        }

        public void run() {
            if (C3134e.this.f8778t) {
                boolean unused = C3134e.this.f8778t = false;
                this.f8787p = 0;
                this.f8786o = true;
            } else {
                boolean unused2 = C3134e.this.m12328E();
                int i = this.f8787p + 1;
                this.f8787p = i;
                this.f8786o = i < 3;
                if (!C3134e.this.f8782x || this.f8785f) {
                    if (C3134e.this.f8751B) {
                        C3143g.m12370h(C3134e.this);
                    }
                    C3134e.this.m12341n();
                } else {
                    this.f8785f = true;
                    C3134e.this.m12343q(0);
                    C1988t.m8380f0(C3134e.this, this, 20);
                }
            }
            if (this.f8786o) {
                C1988t.m8380f0(C3134e.this, this, 20);
            } else {
                Runnable unused3 = C3134e.this.f8783y = null;
            }
        }
    }

    /* renamed from: com.facebook.react.views.scroll.e$b */
    class C3136b implements ValueAnimator.AnimatorUpdateListener {
        C3136b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3134e.this.scrollTo(((Integer) valueAnimator.getAnimatedValue("scrollX")).intValue(), ((Integer) valueAnimator.getAnimatedValue("scrollY")).intValue());
        }
    }

    /* renamed from: com.facebook.react.views.scroll.e$c */
    class C3137c implements Animator.AnimatorListener {
        C3137c() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C3134e.this.f8769T = -1;
            int unused2 = C3134e.this.f8770U = -1;
            ValueAnimator unused3 = C3134e.this.f8768S = null;
            boolean unused4 = C3134e.this.m12328E();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.facebook.react.views.scroll.e$d */
    class C3138d implements C2929d.C2930a {

        /* renamed from: a */
        final /* synthetic */ int f8791a;

        /* renamed from: b */
        final /* synthetic */ int f8792b;

        /* renamed from: c */
        final /* synthetic */ int f8793c;

        C3138d(int i, int i2, int i3) {
            this.f8791a = i;
            this.f8792b = i2;
            this.f8793c = i3;
        }

        /* renamed from: a */
        public WritableMap mo9497a() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", (double) C3038r.m12004a((float) this.f8791a));
            writableNativeMap.putDouble("contentOffsetTop", (double) C3038r.m12004a((float) this.f8792b));
            writableNativeMap.putDouble("scrollAwayPaddingTop", (double) C3038r.m12004a((float) this.f8793c));
            return writableNativeMap;
        }
    }

    public C3134e(ReactContext reactContext, C3125a aVar) {
        super(reactContext);
        this.f8752C = aVar;
        this.f8764O = new C3244f(this);
        this.f8775q = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    /* renamed from: B */
    private void m12325B(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getWidth() == 0 || childAt.getHeight() == 0) {
            this.f8765P = i;
            this.f8766Q = i2;
            return;
        }
        this.f8765P = -1;
        this.f8766Q = -1;
    }

    /* renamed from: C */
    private void m12326C(int i) {
        double snapInterval = (double) getSnapInterval();
        double postAnimationScrollY = (double) getPostAnimationScrollY();
        double d = postAnimationScrollY / snapInterval;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        int round = (int) Math.round(d);
        int round2 = (int) Math.round(((double) m12348v(i)) / snapInterval);
        if (i > 0 && ceil == floor) {
            ceil++;
        } else if (i < 0 && floor == ceil) {
            floor--;
        }
        if (i > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d2 = ((double) round) * snapInterval;
        if (d2 != postAnimationScrollY) {
            this.f8778t = true;
            mo10214w(getScrollX(), (int) d2);
        }
    }

    /* renamed from: D */
    private void m12327D(int i) {
        if (this.f8771V != i) {
            this.f8771V = i;
            m12344r();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public boolean m12328E() {
        return m12329F(getScrollX(), getScrollY());
    }

    /* renamed from: F */
    private boolean m12329F(int i, int i2) {
        if (C2996a.m11878a(getId()) == 1) {
            return false;
        }
        if (i == this.f8772W && i2 == this.f8773a0) {
            return false;
        }
        this.f8772W = i;
        this.f8773a0 = i2;
        m12344r();
        return true;
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        return Math.max(0, this.f8763N.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f8749o) {
            f8749o = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                f8748f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                C6071a.m22859G("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f8748f;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            C6071a.m22859G("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
        }
    }

    private int getPostAnimationScrollX() {
        ValueAnimator valueAnimator = this.f8768S;
        return (valueAnimator == null || !valueAnimator.isRunning()) ? getScrollX() : this.f8769T;
    }

    private int getPostAnimationScrollY() {
        ValueAnimator valueAnimator = this.f8768S;
        return (valueAnimator == null || !valueAnimator.isRunning()) ? getScrollY() : this.f8770U;
    }

    private int getSnapInterval() {
        int i = this.f8757H;
        return i != 0 ? i : getHeight();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m12341n() {
        if (m12347u()) {
            C6409a.m24521c(this.f8752C);
            C6409a.m24521c(this.f8753D);
            this.f8752C.mo10122b(this.f8753D);
        }
    }

    /* renamed from: o */
    private void m12342o() {
        if (m12347u()) {
            C6409a.m24521c(this.f8752C);
            C6409a.m24521c(this.f8753D);
            this.f8752C.mo10121a(this.f8753D);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0164, code lost:
        if (getScrollY() <= r4) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01be  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m12343q(int r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r19.getChildCount()
            if (r1 > 0) goto L_0x0009
            return
        L_0x0009:
            int r1 = r0.f8757H
            if (r1 != 0) goto L_0x001d
            java.util.List<java.lang.Integer> r1 = r0.f8759J
            if (r1 != 0) goto L_0x001d
            boolean r1 = com.facebook.react.p126z.C3257a.f9231l
            if (r1 == 0) goto L_0x0019
            int r1 = r0.f8762M
            if (r1 != 0) goto L_0x001d
        L_0x0019:
            r19.m12326C(r20)
            return
        L_0x001d:
            int r1 = r19.getMaxScrollY()
            int r2 = r19.m12348v(r20)
            boolean r3 = r0.f8756G
            if (r3 == 0) goto L_0x002d
            int r2 = r19.getScrollY()
        L_0x002d:
            int r3 = r19.getHeight()
            int r4 = r19.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r19.getPaddingTop()
            int r3 = r3 - r4
            java.util.List<java.lang.Integer> r4 = r0.f8759J
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.List<java.lang.Integer> r8 = r0.f8759J
            int r9 = r8.size()
            int r9 = r9 - r6
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r11 = r1
            r9 = 0
            r10 = 0
        L_0x0060:
            java.util.List<java.lang.Integer> r12 = r0.f8759J
            int r12 = r12.size()
            if (r9 >= r12) goto L_0x0140
            java.util.List<java.lang.Integer> r12 = r0.f8759J
            java.lang.Object r12 = r12.get(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 > r2) goto L_0x007d
            int r13 = r2 - r12
            int r14 = r2 - r10
            if (r13 >= r14) goto L_0x007d
            r10 = r12
        L_0x007d:
            if (r12 < r2) goto L_0x0086
            int r13 = r12 - r2
            int r14 = r11 - r2
            if (r13 >= r14) goto L_0x0086
            r11 = r12
        L_0x0086:
            int r9 = r9 + 1
            goto L_0x0060
        L_0x0089:
            boolean r4 = com.facebook.react.p126z.C3257a.f9231l
            if (r4 == 0) goto L_0x0124
            int r4 = r0.f8762M
            if (r4 == 0) goto L_0x0124
            int r8 = r0.f8757H
            if (r8 <= 0) goto L_0x00bc
            double r9 = (double) r2
            double r11 = (double) r8
            double r9 = r9 / r11
            double r11 = java.lang.Math.floor(r9)
            int r8 = r0.f8757H
            double r13 = (double) r8
            double r11 = r11 * r13
            int r11 = (int) r11
            int r4 = r0.m12345s(r4, r11, r8, r3)
            int r4 = java.lang.Math.max(r4, r7)
            int r8 = r0.f8762M
            double r9 = java.lang.Math.ceil(r9)
            int r11 = r0.f8757H
            double r12 = (double) r11
            double r9 = r9 * r12
            int r9 = (int) r9
            int r8 = r0.m12345s(r8, r9, r11, r3)
            goto L_0x0139
        L_0x00bc:
            android.view.View r4 = r19.getContentView()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r11 = r1
            r8 = 1
            r10 = 0
        L_0x00c5:
            int r9 = r4.getChildCount()
            if (r8 >= r9) goto L_0x0122
            android.view.View r9 = r4.getChildAt(r8)
            int r12 = r0.f8762M
            if (r12 == r6) goto L_0x0109
            if (r12 == r5) goto L_0x00fc
            r13 = 3
            if (r12 != r13) goto L_0x00e3
            int r12 = r9.getTop()
            int r9 = r9.getHeight()
            int r9 = r3 - r9
            goto L_0x0107
        L_0x00e3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid SnapToAlignment value: "
            r2.append(r3)
            int r3 = r0.f8762M
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00fc:
            int r12 = r9.getTop()
            int r9 = r9.getHeight()
            int r9 = r3 - r9
            int r9 = r9 / r5
        L_0x0107:
            int r12 = r12 - r9
            goto L_0x010d
        L_0x0109:
            int r12 = r9.getTop()
        L_0x010d:
            if (r12 > r2) goto L_0x0116
            int r9 = r2 - r12
            int r13 = r2 - r10
            if (r9 >= r13) goto L_0x0116
            r10 = r12
        L_0x0116:
            if (r12 < r2) goto L_0x011f
            int r9 = r12 - r2
            int r13 = r11 - r2
            if (r9 >= r13) goto L_0x011f
            r11 = r12
        L_0x011f:
            int r8 = r8 + 1
            goto L_0x00c5
        L_0x0122:
            r8 = r1
            goto L_0x013f
        L_0x0124:
            int r4 = r19.getSnapInterval()
            double r8 = (double) r4
            double r10 = (double) r2
            double r10 = r10 / r8
            double r12 = java.lang.Math.floor(r10)
            double r12 = r12 * r8
            int r4 = (int) r12
            double r10 = java.lang.Math.ceil(r10)
            double r10 = r10 * r8
            int r8 = (int) r10
        L_0x0139:
            int r11 = java.lang.Math.min(r8, r1)
            r8 = r1
            r10 = r4
        L_0x013f:
            r4 = 0
        L_0x0140:
            int r9 = r2 - r10
            int r12 = r11 - r2
            if (r9 >= r12) goto L_0x0148
            r13 = r10
            goto L_0x0149
        L_0x0148:
            r13 = r11
        L_0x0149:
            boolean r14 = r0.f8761L
            if (r14 != 0) goto L_0x015a
            if (r2 < r8) goto L_0x015a
            int r4 = r19.getScrollY()
            if (r4 < r8) goto L_0x0156
            goto L_0x0166
        L_0x0156:
            r2 = r20
            r4 = r8
            goto L_0x0183
        L_0x015a:
            boolean r8 = r0.f8760K
            if (r8 != 0) goto L_0x016a
            if (r2 > r4) goto L_0x016a
            int r8 = r19.getScrollY()
            if (r8 > r4) goto L_0x0167
        L_0x0166:
            r4 = r2
        L_0x0167:
            r2 = r20
            goto L_0x0183
        L_0x016a:
            r14 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r20 <= 0) goto L_0x0176
            double r8 = (double) r12
            double r8 = r8 * r14
            int r2 = (int) r8
            int r2 = r20 + r2
            r4 = r11
            goto L_0x0183
        L_0x0176:
            if (r20 >= 0) goto L_0x0180
            double r8 = (double) r9
            double r8 = r8 * r14
            int r2 = (int) r8
            int r2 = r20 - r2
            r4 = r10
            goto L_0x0183
        L_0x0180:
            r2 = r20
            r4 = r13
        L_0x0183:
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.min(r4, r1)
            android.widget.OverScroller r8 = r0.f8775q
            if (r8 == 0) goto L_0x01be
            r0.f8778t = r6
            int r9 = r19.getScrollX()
            int r10 = r19.getScrollY()
            r11 = 0
            if (r2 == 0) goto L_0x019d
            goto L_0x01a3
        L_0x019d:
            int r2 = r19.getScrollY()
            int r2 = r4 - r2
        L_0x01a3:
            r12 = r2
            r13 = 0
            r14 = 0
            r17 = 0
            if (r4 == 0) goto L_0x01b0
            if (r4 != r1) goto L_0x01ad
            goto L_0x01b0
        L_0x01ad:
            r18 = 0
            goto L_0x01b4
        L_0x01b0:
            int r7 = r3 / 2
            r18 = r7
        L_0x01b4:
            r15 = r4
            r16 = r4
            r8.fling(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r19.postInvalidateOnAnimation()
            goto L_0x01c5
        L_0x01be:
            int r1 = r19.getScrollX()
            r0.mo10214w(r1, r4)
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.C3134e.m12343q(int):void");
    }

    /* renamed from: r */
    private void m12344r() {
        this.f8767R.mo9495c(new C3138d(this.f8772W, this.f8773a0, this.f8771V));
    }

    /* renamed from: s */
    private int m12345s(int i, int i2, int i3, int i4) {
        int i5;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            i5 = (i4 - i3) / 2;
        } else if (i == 3) {
            i5 = i4 - i3;
        } else {
            throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f8762M);
        }
        return i2 - i5;
    }

    /* renamed from: t */
    private void m12346t(int i, int i2) {
        if (this.f8783y == null) {
            if (this.f8751B) {
                m12342o();
                C3143g.m12369g(this, i, i2);
            }
            this.f8778t = false;
            C3135a aVar = new C3135a();
            this.f8783y = aVar;
            C1988t.m8380f0(this, aVar, 20);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f8753D;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m12347u() {
        /*
            r1 = this;
            com.facebook.react.views.scroll.a r0 = r1.f8752C
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r1.f8753D
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.C3134e.m12347u():boolean");
    }

    /* renamed from: v */
    private int m12348v(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.f8758I);
        int maxScrollY = getMaxScrollY();
        int height = ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2;
        overScroller.fling(getPostAnimationScrollX(), getPostAnimationScrollY(), 0, i, 0, 0, 0, maxScrollY, 0, height);
        return overScroller.getFinalY();
    }

    /* renamed from: x */
    private void m12349x(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }

    /* renamed from: A */
    public void mo10175A(int i, float f) {
        this.f8764O.mo10650g(i, f);
    }

    /* renamed from: b */
    public void mo9866b() {
        if (this.f8784z) {
            C6409a.m24521c(this.f8779u);
            C3054w.m12097a(this, this.f8779u);
            View childAt = getChildAt(0);
            if (childAt instanceof C3052v) {
                ((C3052v) childAt).mo9866b();
            }
        }
    }

    public void draw(Canvas canvas) {
        if (this.f8755F != 0) {
            View childAt = getChildAt(0);
            if (!(this.f8754E == null || childAt == null || childAt.getBottom() >= getHeight())) {
                this.f8754E.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.f8754E.draw(canvas);
            }
        }
        getDrawingRect(this.f8777s);
        String str = this.f8780v;
        str.hashCode();
        if (!str.equals("visible")) {
            canvas.clipRect(this.f8777s);
        }
        super.draw(canvas);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f8750A || (keyCode != 19 && keyCode != 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public void fling(int i) {
        float signum = Math.signum(this.f8774p.mo10124b());
        if (signum == 0.0f) {
            signum = Math.signum((float) i);
        }
        int abs = (int) (((float) Math.abs(i)) * signum);
        if (this.f8782x) {
            m12343q(abs);
        } else if (this.f8775q != null) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            this.f8775q.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, 0, height / 2);
            C1988t.m8376d0(this);
        } else {
            super.fling(abs);
        }
        m12346t(0, abs);
    }

    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    public C2929d getFabricViewStateManager() {
        return this.f8767R;
    }

    public String getOverflow() {
        return this.f8780v;
    }

    public boolean getRemoveClippedSubviews() {
        return this.f8784z;
    }

    /* renamed from: h */
    public void mo9868h(Rect rect) {
        rect.set((Rect) C6409a.m24521c(this.f8779u));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8784z) {
            mo9866b();
        }
    }

    public void onChildViewAdded(View view, View view2) {
        this.f8763N = view2;
        view2.addOnLayoutChangeListener(this);
    }

    public void onChildViewRemoved(View view, View view2) {
        this.f8763N.removeOnLayoutChangeListener(this);
        this.f8763N = null;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(C2766g.react_test_id);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f8750A) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                C2954h.m11771a(this, motionEvent);
                C3143g.m12364b(this);
                this.f8781w = true;
                m12342o();
                return true;
            }
        } catch (IllegalArgumentException e) {
            C6071a.m22860H("ReactNative", "Error intercepting touch event.", e);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.f8765P;
        if (i5 == -1) {
            i5 = getScrollX();
        }
        int i6 = this.f8766Q;
        if (i6 == -1) {
            i6 = getScrollY();
        }
        scrollTo(i5, i6);
        C3143g.m12363a(this);
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int maxScrollY;
        if (this.f8763N != null && getScrollY() > (maxScrollY = getMaxScrollY())) {
            scrollTo(getScrollX(), maxScrollY);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C2997l.m11880a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        OverScroller overScroller = this.f8775q;
        if (!(overScroller == null || this.f8763N == null || overScroller.isFinished() || this.f8775q.getCurrY() == this.f8775q.getFinalY() || i2 < (maxScrollY = getMaxScrollY()))) {
            this.f8775q.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f8778t = true;
        if (this.f8774p.mo10125c(i, i2)) {
            if (this.f8784z) {
                mo9866b();
            }
            m12328E();
            C3143g.m12366d(this, this.f8774p.mo10123a(), this.f8774p.mo10124b());
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f8784z) {
            mo9866b();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f8750A) {
            return false;
        }
        this.f8776r.mo10227a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.f8781w) {
            m12328E();
            float b = this.f8776r.mo10228b();
            float c = this.f8776r.mo10229c();
            C3143g.m12365c(this, b, c);
            this.f8781w = false;
            m12346t(Math.round(b), Math.round(c));
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void mo10193p() {
        awakenScrollBars();
    }

    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            m12349x(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        m12329F(scrollX, scrollY);
        m12325B(scrollX, scrollY);
    }

    public void setBackgroundColor(int i) {
        this.f8764O.mo10645b(i);
    }

    public void setBorderRadius(float f) {
        this.f8764O.mo10647d(f);
    }

    public void setBorderStyle(String str) {
        this.f8764O.mo10649f(str);
    }

    public void setDecelerationRate(float f) {
        this.f8758I = f;
        OverScroller overScroller = this.f8775q;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.f8756G = z;
    }

    public void setEndFillColor(int i) {
        if (i != this.f8755F) {
            this.f8755F = i;
            this.f8754E = new ColorDrawable(this.f8755F);
        }
    }

    public void setOverflow(String str) {
        this.f8780v = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z) {
        this.f8782x = z;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f8779u == null) {
            this.f8779u = new Rect();
        }
        this.f8784z = z;
        mo9866b();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i) {
        int childCount = getChildCount();
        boolean z = true;
        if (childCount != 1) {
            z = false;
        }
        C6409a.m24520b(z, "React Native ScrollView always has exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setTranslationY((float) i);
            }
            setPadding(0, 0, 0, i);
        }
        m12327D(i);
        setRemoveClippedSubviews(this.f8784z);
    }

    public void setScrollEnabled(boolean z) {
        this.f8750A = z;
    }

    public void setScrollPerfTag(String str) {
        this.f8753D = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.f8751B = z;
    }

    public void setSnapInterval(int i) {
        this.f8757H = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f8759J = list;
    }

    public void setSnapToAlignment(int i) {
        this.f8762M = i;
    }

    public void setSnapToEnd(boolean z) {
        this.f8761L = z;
    }

    public void setSnapToStart(boolean z) {
        this.f8760K = z;
    }

    /* renamed from: w */
    public void mo10214w(int i, int i2) {
        ValueAnimator valueAnimator = this.f8768S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f8769T = i;
        this.f8770U = i2;
        ValueAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{getScrollX(), i}), PropertyValuesHolder.ofInt("scrollY", new int[]{getScrollY(), i2})});
        this.f8768S = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration((long) C3143g.m12371i(getContext()));
        this.f8768S.addUpdateListener(new C3136b());
        this.f8768S.addListener(new C3137c());
        this.f8768S.start();
        m12329F(i, i2);
        m12325B(i, i2);
    }

    /* renamed from: y */
    public void mo10215y(int i, float f, float f2) {
        this.f8764O.mo10646c(i, f, f2);
    }

    /* renamed from: z */
    public void mo10216z(float f, int i) {
        this.f8764O.mo10648e(f, i);
    }
}
