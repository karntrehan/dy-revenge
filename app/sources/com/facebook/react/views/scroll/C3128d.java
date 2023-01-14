package com.facebook.react.views.scroll;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.i18nmanager.C2822a;
import com.facebook.react.p126z.C3257a;
import com.facebook.react.uimanager.C2929d;
import com.facebook.react.uimanager.C2997l;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3052v;
import com.facebook.react.uimanager.C3054w;
import com.facebook.react.uimanager.C3060z;
import com.facebook.react.uimanager.events.C2954h;
import com.facebook.react.views.view.C3244f;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.views.scroll.d */
public class C3128d extends HorizontalScrollView implements C3052v, C3060z {

    /* renamed from: f */
    private static boolean f8696f = false;

    /* renamed from: o */
    private static String f8697o = C3128d.class.getSimpleName();

    /* renamed from: p */
    private static int f8698p = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: q */
    private static Field f8699q;

    /* renamed from: r */
    private static boolean f8700r = false;

    /* renamed from: A */
    private String f8701A = "hidden";

    /* renamed from: B */
    private boolean f8702B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f8703C = false;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public Runnable f8704D;

    /* renamed from: E */
    private boolean f8705E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f8706F = true;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f8707G;

    /* renamed from: H */
    private C3125a f8708H = null;

    /* renamed from: I */
    private String f8709I;

    /* renamed from: J */
    private Drawable f8710J;

    /* renamed from: K */
    private int f8711K = 0;

    /* renamed from: L */
    private boolean f8712L = false;

    /* renamed from: M */
    private int f8713M = 0;

    /* renamed from: N */
    private float f8714N = 0.985f;

    /* renamed from: O */
    private List<Integer> f8715O;

    /* renamed from: P */
    private boolean f8716P = true;

    /* renamed from: Q */
    private boolean f8717Q = true;

    /* renamed from: R */
    private int f8718R = 0;

    /* renamed from: S */
    private C3244f f8719S = new C3244f(this);

    /* renamed from: T */
    private boolean f8720T = false;

    /* renamed from: U */
    private int f8721U = -1;

    /* renamed from: V */
    private int f8722V = -1;

    /* renamed from: W */
    private final C2929d f8723W = new C2929d();
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public ValueAnimator f8724a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public int f8725b0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public int f8726c0 = 0;

    /* renamed from: d0 */
    private int f8727d0 = -1;

    /* renamed from: e0 */
    private int f8728e0 = -1;

    /* renamed from: f0 */
    private final Rect f8729f0 = new Rect();

    /* renamed from: s */
    private int f8730s;

    /* renamed from: t */
    private int f8731t = f8698p;

    /* renamed from: u */
    private final C3126b f8732u = new C3126b();

    /* renamed from: v */
    private final OverScroller f8733v;

    /* renamed from: w */
    private final C3149j f8734w = new C3149j();

    /* renamed from: x */
    private final Rect f8735x = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f8736y;

    /* renamed from: z */
    private Rect f8737z;

    /* renamed from: com.facebook.react.views.scroll.d$a */
    class C3129a extends C1904a {
        C3129a() {
        }

        /* renamed from: f */
        public void mo3775f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3775f(view, accessibilityEvent);
            accessibilityEvent.setScrollable(C3128d.this.f8706F);
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            super.mo3776g(view, cVar);
            cVar.mo6615v0(C3128d.this.f8706F);
        }
    }

    /* renamed from: com.facebook.react.views.scroll.d$b */
    class C3130b implements Runnable {

        /* renamed from: f */
        private boolean f8739f = false;

        /* renamed from: o */
        private boolean f8740o = true;

        /* renamed from: p */
        private int f8741p = 0;

        C3130b() {
        }

        public void run() {
            if (C3128d.this.f8736y) {
                boolean unused = C3128d.this.f8736y = false;
                this.f8741p = 0;
                this.f8740o = true;
            } else {
                C3128d.this.m12290I();
                int i = this.f8741p + 1;
                this.f8741p = i;
                this.f8740o = i < 3;
                if (!C3128d.this.f8703C || this.f8739f) {
                    if (C3128d.this.f8707G) {
                        C3143g.m12370h(C3128d.this);
                    }
                    C3128d.this.m12304o();
                } else {
                    this.f8739f = true;
                    C3128d.this.m12306r(0);
                    C1988t.m8380f0(C3128d.this, this, 20);
                }
            }
            if (this.f8740o) {
                C1988t.m8380f0(C3128d.this, this, 20);
            } else {
                Runnable unused2 = C3128d.this.f8704D = null;
            }
        }
    }

    /* renamed from: com.facebook.react.views.scroll.d$c */
    class C3131c implements ValueAnimator.AnimatorUpdateListener {
        C3131c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3128d.this.scrollTo(((Integer) valueAnimator.getAnimatedValue("scrollX")).intValue(), ((Integer) valueAnimator.getAnimatedValue("scrollY")).intValue());
        }
    }

    /* renamed from: com.facebook.react.views.scroll.d$d */
    class C3132d implements Animator.AnimatorListener {
        C3132d() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C3128d.this.f8725b0 = -1;
            int unused2 = C3128d.this.f8726c0 = -1;
            ValueAnimator unused3 = C3128d.this.f8724a0 = null;
            C3128d.this.m12290I();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.facebook.react.views.scroll.d$e */
    class C3133e implements C2929d.C2930a {

        /* renamed from: a */
        final /* synthetic */ int f8745a;

        /* renamed from: b */
        final /* synthetic */ int f8746b;

        C3133e(int i, int i2) {
            this.f8745a = i;
            this.f8746b = i2;
        }

        /* renamed from: a */
        public WritableMap mo9497a() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", (double) C3038r.m12004a((float) this.f8745a));
            writableNativeMap.putDouble("contentOffsetTop", (double) C3038r.m12004a((float) this.f8746b));
            writableNativeMap.putDouble("scrollAwayPaddingTop", 0.0d);
            return writableNativeMap;
        }
    }

    public C3128d(Context context, C3125a aVar) {
        super(context);
        this.f8708H = aVar;
        C1988t.m8394m0(this, new C3129a());
        this.f8733v = getOverScrollerFromParent();
        this.f8730s = C2822a.m11246d().mo9192g(context) ? 1 : 0;
    }

    /* renamed from: B */
    private void m12286B(View view) {
        int t = m12308t(view);
        if (t != 0) {
            scrollBy(t, 0);
        }
    }

    /* renamed from: F */
    private void m12287F(int i, int i2) {
        if (f8696f) {
            C6071a.m22883q(f8697o, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i), Integer.valueOf(i2));
        }
        View contentView = getContentView();
        if (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) {
            this.f8721U = i;
            this.f8722V = i2;
            return;
        }
        this.f8721U = -1;
        this.f8722V = -1;
    }

    /* renamed from: G */
    private void m12288G(int i) {
        if (f8696f) {
            C6071a.m22882p(f8697o, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i));
        }
        double snapInterval = (double) getSnapInterval();
        double postAnimationScrollX = (double) getPostAnimationScrollX();
        double d = postAnimationScrollX / snapInterval;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        int round = (int) Math.round(d);
        int round2 = (int) Math.round(((double) m12314z(i)) / snapInterval);
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
        if (d2 != postAnimationScrollX) {
            this.f8736y = true;
            mo10128A((int) d2, getScrollY());
        }
    }

    /* renamed from: H */
    private void m12289H(int i) {
        if (f8696f) {
            C6071a.m22882p(f8697o, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i2 = scrollX / width;
        if (scrollX % width != 0) {
            i2++;
        }
        int i3 = i == 17 ? i2 - 1 : i2 + 1;
        if (i3 < 0) {
            i3 = 0;
        }
        mo10128A(i3 * width, getScrollY());
        m12309u(0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m12290I() {
        m12291J(getScrollX(), getScrollY());
    }

    /* renamed from: J */
    private void m12291J(int i, int i2) {
        int i3;
        if (f8696f) {
            C6071a.m22883q(f8697o, "updateStateOnScroll[%d] scrollX %d scrollY %d", Integer.valueOf(getId()), Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (i != this.f8727d0 || i2 != this.f8728e0) {
            this.f8727d0 = i;
            this.f8728e0 = i2;
            if (this.f8730s == 1) {
                View contentView = getContentView();
                i3 = -(((contentView != null ? contentView.getWidth() : 0) - i) - getWidth());
            } else {
                i3 = i;
            }
            if (f8696f) {
                C6071a.m22884r(f8697o, "updateStateOnScroll[%d] scrollX %d scrollY %d fabricScrollX", Integer.valueOf(getId()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
            this.f8723W.mo9495c(new C3133e(i3, i2));
        }
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f8700r) {
            f8700r = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                f8699q = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                C6071a.m22859G(f8697o, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f8699q;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            C6071a.m22859G(f8697o, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e);
        }
    }

    private int getPostAnimationScrollX() {
        ValueAnimator valueAnimator = this.f8724a0;
        return (valueAnimator == null || !valueAnimator.isRunning()) ? getScrollX() : this.f8725b0;
    }

    private int getPostAnimationScrollY() {
        ValueAnimator valueAnimator = this.f8724a0;
        return (valueAnimator == null || !valueAnimator.isRunning()) ? getScrollY() : this.f8726c0;
    }

    private int getSnapInterval() {
        int i = this.f8713M;
        return i != 0 ? i : getWidth();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m12304o() {
        if (m12312x()) {
            C6409a.m24521c(this.f8708H);
            C6409a.m24521c(this.f8709I);
            this.f8708H.mo10122b(this.f8709I);
        }
    }

    /* renamed from: p */
    private void m12305p() {
        if (m12312x()) {
            C6409a.m24521c(this.f8708H);
            C6409a.m24521c(this.f8709I);
            this.f8708H.mo10121a(this.f8709I);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m12306r(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (f8696f) {
            C6071a.m22882p(f8697o, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i));
        }
        if (getChildCount() > 0) {
            if (this.f8713M == 0 && this.f8715O == null && (!C3257a.f9231l || this.f8718R == 0)) {
                m12288G(i);
                return;
            }
            int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
            int z = m12314z(i);
            if (this.f8712L) {
                z = getScrollX();
            }
            int width = (getWidth() - C1988t.m8339D(this)) - C1988t.m8337C(this);
            if (this.f8730s == 1) {
                z = max - z;
                i2 = -i;
            } else {
                i2 = i;
            }
            List<Integer> list = this.f8715O;
            if (list == null || list.isEmpty()) {
                if (!C3257a.f9231l || (i7 = this.f8718R) == 0) {
                    double snapInterval = (double) getSnapInterval();
                    double d = ((double) z) / snapInterval;
                    i5 = max;
                    i4 = (int) (Math.floor(d) * snapInterval);
                    i3 = Math.min((int) (Math.ceil(d) * snapInterval), max);
                } else {
                    int i8 = this.f8713M;
                    if (i8 > 0) {
                        double d2 = ((double) z) / ((double) i8);
                        double floor = Math.floor(d2);
                        int i9 = this.f8713M;
                        int max2 = Math.max(m12307s(i7, (int) (floor * ((double) i9)), i9, width), 0);
                        int i10 = this.f8718R;
                        double ceil = Math.ceil(d2);
                        int i11 = this.f8713M;
                        i3 = Math.min(m12307s(i10, (int) (ceil * ((double) i11)), i11, width), max);
                        i5 = max;
                        i4 = max2;
                    } else {
                        ViewGroup viewGroup = (ViewGroup) getContentView();
                        i3 = max;
                        i4 = 0;
                        for (int i12 = 1; i12 < viewGroup.getChildCount(); i12++) {
                            View childAt = viewGroup.getChildAt(i12);
                            int s = m12307s(this.f8718R, childAt.getLeft(), childAt.getWidth(), width);
                            if (s <= z && z - s < z - i4) {
                                i4 = s;
                            }
                            if (s >= z && s - z < i3 - z) {
                                i3 = s;
                            }
                        }
                        i5 = max;
                    }
                }
                i6 = 0;
            } else {
                i6 = this.f8715O.get(0).intValue();
                List<Integer> list2 = this.f8715O;
                i5 = list2.get(list2.size() - 1).intValue();
                i3 = max;
                i4 = 0;
                for (int i13 = 0; i13 < this.f8715O.size(); i13++) {
                    int intValue = this.f8715O.get(i13).intValue();
                    if (intValue <= z && z - intValue < z - i4) {
                        i4 = intValue;
                    }
                    if (intValue >= z && intValue - z < i3 - z) {
                        i3 = intValue;
                    }
                }
            }
            int i14 = z - i4;
            int i15 = i3 - z;
            int i16 = i14 < i15 ? i4 : i3;
            int scrollX = getScrollX();
            if (this.f8730s == 1) {
                scrollX = max - scrollX;
            }
            if (this.f8717Q || z < i5) {
                if (this.f8716P || z > i6) {
                    if (i2 > 0) {
                        i2 += (int) (((double) i15) * 10.0d);
                        z = i3;
                    } else if (i2 < 0) {
                        i2 -= (int) (((double) i14) * 10.0d);
                        z = i4;
                    } else {
                        z = i16;
                    }
                } else if (scrollX > i6) {
                    z = i6;
                }
            } else if (scrollX < i5) {
                z = i5;
            }
            int min = Math.min(Math.max(0, z), max);
            if (this.f8730s == 1) {
                min = max - min;
                i2 = -i2;
            }
            int i17 = min;
            OverScroller overScroller = this.f8733v;
            if (overScroller != null) {
                this.f8736y = true;
                overScroller.fling(getScrollX(), getScrollY(), i2 != 0 ? i2 : i17 - getScrollX(), 0, i17, i17, 0, 0, (i17 == 0 || i17 == max) ? width / 2 : 0, 0);
                postInvalidateOnAnimation();
                return;
            }
            mo10128A(i17, getScrollY());
        }
    }

    /* renamed from: s */
    private int m12307s(int i, int i2, int i3, int i4) {
        int i5;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            i5 = (i4 - i3) / 2;
        } else if (i == 3) {
            i5 = i4 - i3;
        } else {
            throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f8718R);
        }
        return i2 - i5;
    }

    /* renamed from: t */
    private int m12308t(View view) {
        view.getDrawingRect(this.f8729f0);
        offsetDescendantRectToMyCoords(view, this.f8729f0);
        return computeScrollDeltaToGetChildRectOnScreen(this.f8729f0);
    }

    /* renamed from: u */
    private void m12309u(int i, int i2) {
        if (f8696f) {
            C6071a.m22883q(f8697o, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (this.f8704D == null) {
            if (this.f8707G) {
                C3143g.m12369g(this, i, i2);
            }
            this.f8736y = false;
            C3130b bVar = new C3130b();
            this.f8704D = bVar;
            C1988t.m8380f0(this, bVar, 20);
        }
    }

    /* renamed from: v */
    private boolean m12310v(View view) {
        int t = m12308t(view);
        view.getDrawingRect(this.f8729f0);
        return t != 0 && Math.abs(t) < this.f8729f0.width() / 2;
    }

    /* renamed from: w */
    private boolean m12311w(View view) {
        int t = m12308t(view);
        view.getDrawingRect(this.f8729f0);
        return t != 0 && Math.abs(t) < this.f8729f0.width();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f8709I;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m12312x() {
        /*
            r1 = this;
            com.facebook.react.views.scroll.a r0 = r1.f8708H
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r1.f8709I
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.C3128d.m12312x():boolean");
    }

    /* renamed from: y */
    private boolean m12313y(View view) {
        return m12308t(view) == 0;
    }

    /* renamed from: z */
    private int m12314z(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.f8714N);
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int width = ((getWidth() - C1988t.m8339D(this)) - C1988t.m8337C(this)) / 2;
        overScroller.fling(getPostAnimationScrollX(), getPostAnimationScrollY(), i, 0, 0, max, 0, 0, width, 0);
        return overScroller.getFinalX();
    }

    /* renamed from: A */
    public void mo10128A(int i, int i2) {
        if (f8696f) {
            C6071a.m22883q(f8697o, "reactSmoothScrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i), Integer.valueOf(i2));
        }
        ValueAnimator valueAnimator = this.f8724a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f8725b0 = i;
        this.f8726c0 = i2;
        ValueAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{getScrollX(), i}), PropertyValuesHolder.ofInt("scrollY", new int[]{getScrollY(), i2})});
        this.f8724a0 = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration((long) C3143g.m12371i(getContext()));
        this.f8724a0.addUpdateListener(new C3131c());
        this.f8724a0.addListener(new C3132d());
        this.f8724a0.start();
        m12291J(i, i2);
        m12287F(i, i2);
    }

    /* renamed from: C */
    public void mo10129C(int i, float f, float f2) {
        this.f8719S.mo10646c(i, f, f2);
    }

    /* renamed from: D */
    public void mo10130D(float f, int i) {
        this.f8719S.mo10648e(f, i);
    }

    /* renamed from: E */
    public void mo10131E(int i, float f) {
        this.f8719S.mo10650g(i, f);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (!this.f8703C || this.f8720T) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i, i2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (m12313y(view) || m12311w(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    public boolean arrowScroll(int i) {
        if (!this.f8703C) {
            return super.arrowScroll(i);
        }
        boolean z = true;
        this.f8720T = true;
        if (getChildCount() > 0) {
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
            View contentView = getContentView();
            if (contentView == null || findNextFocus == null || findNextFocus.getParent() != contentView) {
                m12289H(i);
            } else {
                if (!m12313y(findNextFocus) && !m12310v(findNextFocus)) {
                    m12289H(i);
                }
                findNextFocus.requestFocus();
            }
        } else {
            z = false;
        }
        this.f8720T = false;
        return z;
    }

    /* renamed from: b */
    public void mo9866b() {
        if (this.f8705E) {
            C6409a.m24521c(this.f8737z);
            C3054w.m12097a(this, this.f8737z);
            View contentView = getContentView();
            if (contentView instanceof C3052v) {
                ((C3052v) contentView).mo9866b();
            }
        }
    }

    public void draw(Canvas canvas) {
        if (this.f8711K != 0) {
            View contentView = getContentView();
            if (!(this.f8710J == null || contentView == null || contentView.getRight() >= getWidth())) {
                this.f8710J.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.f8710J.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f8706F || (keyCode != 21 && keyCode != 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public void fling(int i) {
        if (f8696f) {
            C6071a.m22882p(f8697o, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i));
        }
        int abs = (int) (((float) Math.abs(i)) * Math.signum(this.f8732u.mo10123a()));
        if (this.f8703C) {
            m12306r(abs);
        } else if (this.f8733v != null) {
            int width = (getWidth() - C1988t.m8339D(this)) - C1988t.m8337C(this);
            this.f8733v.fling(getScrollX(), getScrollY(), abs, 0, 0, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, 0, 0, width / 2, 0);
            C1988t.m8376d0(this);
        } else {
            super.fling(abs);
        }
        m12309u(abs, 0);
    }

    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    public C2929d getFabricViewStateManager() {
        return this.f8723W;
    }

    public String getOverflow() {
        return this.f8701A;
    }

    public boolean getRemoveClippedSubviews() {
        return this.f8705E;
    }

    /* renamed from: h */
    public void mo9868h(Rect rect) {
        rect.set((Rect) C6409a.m24521c(this.f8737z));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8705E) {
            mo9866b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (f8696f) {
            C6071a.m22881o(f8697o, "onDraw[%d]", Integer.valueOf(getId()));
        }
        getDrawingRect(this.f8735x);
        String str = this.f8701A;
        str.hashCode();
        if (!str.equals("visible")) {
            canvas.clipRect(this.f8735x);
        }
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f8706F) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                C2954h.m11771a(this, motionEvent);
                C3143g.m12364b(this);
                this.f8702B = true;
                m12305p();
                return true;
            }
        } catch (IllegalArgumentException e) {
            C6071a.m22860H("ReactNative", "Error intercepting touch event.", e);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OverScroller overScroller;
        if (f8696f) {
            C6071a.m22885s(f8697o, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int i5 = this.f8731t;
        if (!(i5 == f8698p || (overScroller = this.f8733v) == null || i5 == overScroller.getFinalX() || this.f8733v.isFinished())) {
            if (f8696f) {
                C6071a.m22882p(f8697o, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.f8731t));
            }
            OverScroller overScroller2 = this.f8733v;
            overScroller2.startScroll(this.f8731t, overScroller2.getFinalY(), 0, 0);
            this.f8733v.forceFinished(true);
            this.f8731t = f8698p;
        }
        int i6 = this.f8721U;
        if (i6 == -1) {
            i6 = getScrollX();
        }
        int i7 = this.f8722V;
        if (i7 == -1) {
            i7 = getScrollY();
        }
        scrollTo(i6, i7);
        C3143g.m12363a(this);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        OverScroller overScroller;
        C2997l.m11880a(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (f8696f) {
            C6071a.m22883q(f8697o, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        boolean z = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (z && (overScroller = this.f8733v) != null) {
            this.f8731t = overScroller.getCurrX();
        }
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int computeHorizontalScrollRange;
        if (f8696f) {
            C6071a.m22885s(f8697o, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        OverScroller overScroller = this.f8733v;
        if (overScroller != null && !overScroller.isFinished() && this.f8733v.getCurrX() != this.f8733v.getFinalX() && i >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.f8733v.abortAnimation();
            i = computeHorizontalScrollRange;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (f8696f) {
            C6071a.m22885s(f8697o, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.f8736y = true;
        if (this.f8732u.mo10125c(i, i2)) {
            if (this.f8705E) {
                mo9866b();
            }
            m12290I();
            C3143g.m12366d(this, this.f8732u.mo10123a(), this.f8732u.mo10124b());
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f8705E) {
            mo9866b();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f8706F) {
            return false;
        }
        this.f8734w.mo10227a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.f8702B) {
            m12290I();
            float b = this.f8734w.mo10228b();
            float c = this.f8734w.mo10229c();
            C3143g.m12365c(this, b, c);
            this.f8702B = false;
            m12309u(Math.round(b), Math.round(c));
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean pageScroll(int i) {
        boolean pageScroll = super.pageScroll(i);
        if (this.f8703C && pageScroll) {
            m12309u(0, 0);
        }
        return pageScroll;
    }

    /* renamed from: q */
    public void mo10149q() {
        awakenScrollBars();
    }

    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.f8703C) {
            m12286B(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void scrollTo(int i, int i2) {
        if (f8696f) {
            C6071a.m22883q(f8697o, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i), Integer.valueOf(i2));
        }
        super.scrollTo(i, i2);
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        m12291J(scrollX, scrollY);
        m12287F(scrollX, scrollY);
    }

    public void setBackgroundColor(int i) {
        this.f8719S.mo10645b(i);
    }

    public void setBorderRadius(float f) {
        this.f8719S.mo10647d(f);
    }

    public void setBorderStyle(String str) {
        this.f8719S.mo10649f(str);
    }

    public void setDecelerationRate(float f) {
        this.f8714N = f;
        OverScroller overScroller = this.f8733v;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.f8712L = z;
    }

    public void setEndFillColor(int i) {
        if (i != this.f8711K) {
            this.f8711K = i;
            this.f8710J = new ColorDrawable(this.f8711K);
        }
    }

    public void setOverflow(String str) {
        this.f8701A = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z) {
        this.f8703C = z;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f8737z == null) {
            this.f8737z = new Rect();
        }
        this.f8705E = z;
        mo9866b();
    }

    public void setScrollEnabled(boolean z) {
        this.f8706F = z;
    }

    public void setScrollPerfTag(String str) {
        this.f8709I = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.f8707G = z;
    }

    public void setSnapInterval(int i) {
        this.f8713M = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f8715O = list;
    }

    public void setSnapToAlignment(int i) {
        this.f8718R = i;
    }

    public void setSnapToEnd(boolean z) {
        this.f8717Q = z;
    }

    public void setSnapToStart(boolean z) {
        this.f8716P = z;
    }
}
