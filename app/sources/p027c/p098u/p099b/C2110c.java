package p027c.p098u.p099b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.content.C1135a;
import androidx.core.widget.C1192g;
import p027c.p064i.p072j.C1978j;
import p027c.p064i.p072j.C1979k;
import p027c.p064i.p072j.C1980l;
import p027c.p064i.p072j.C1981m;
import p027c.p064i.p072j.C1982n;
import p027c.p064i.p072j.C1983o;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.u.b.c */
public class C2110c extends ViewGroup implements C1981m, C1980l, C1978j, C1982n {

    /* renamed from: f */
    private static final String f6184f = C2110c.class.getSimpleName();

    /* renamed from: o */
    private static final int[] f6185o = {16842766};

    /* renamed from: A */
    private boolean f6186A;

    /* renamed from: B */
    private int f6187B;

    /* renamed from: C */
    int f6188C;

    /* renamed from: D */
    private float f6189D;

    /* renamed from: E */
    private float f6190E;

    /* renamed from: F */
    private boolean f6191F;

    /* renamed from: G */
    private int f6192G;

    /* renamed from: H */
    boolean f6193H;

    /* renamed from: I */
    private boolean f6194I;

    /* renamed from: J */
    private final DecelerateInterpolator f6195J;

    /* renamed from: K */
    C2104a f6196K;

    /* renamed from: L */
    private int f6197L;

    /* renamed from: M */
    protected int f6198M;

    /* renamed from: N */
    float f6199N;

    /* renamed from: O */
    protected int f6200O;

    /* renamed from: P */
    int f6201P;

    /* renamed from: Q */
    int f6202Q;

    /* renamed from: R */
    C2106b f6203R;

    /* renamed from: S */
    private Animation f6204S;

    /* renamed from: T */
    private Animation f6205T;

    /* renamed from: U */
    private Animation f6206U;

    /* renamed from: V */
    private Animation f6207V;

    /* renamed from: W */
    private Animation f6208W;

    /* renamed from: a0 */
    boolean f6209a0;

    /* renamed from: b0 */
    private int f6210b0;

    /* renamed from: c0 */
    boolean f6211c0;

    /* renamed from: d0 */
    private C2119i f6212d0;

    /* renamed from: e0 */
    private boolean f6213e0;

    /* renamed from: f0 */
    private Animation.AnimationListener f6214f0;

    /* renamed from: g0 */
    private final Animation f6215g0;

    /* renamed from: h0 */
    private final Animation f6216h0;

    /* renamed from: p */
    private View f6217p;

    /* renamed from: q */
    C2120j f6218q;

    /* renamed from: r */
    boolean f6219r;

    /* renamed from: s */
    private int f6220s;

    /* renamed from: t */
    private float f6221t;

    /* renamed from: u */
    private float f6222u;

    /* renamed from: v */
    private final C1983o f6223v;

    /* renamed from: w */
    private final C1979k f6224w;

    /* renamed from: x */
    private final int[] f6225x;

    /* renamed from: y */
    private final int[] f6226y;

    /* renamed from: z */
    private final int[] f6227z;

    /* renamed from: c.u.b.c$a */
    class C2111a implements Animation.AnimationListener {
        C2111a() {
        }

        public void onAnimationEnd(Animation animation) {
            C2120j jVar;
            C2110c cVar = C2110c.this;
            if (cVar.f6219r) {
                cVar.f6203R.setAlpha(255);
                C2110c.this.f6203R.start();
                C2110c cVar2 = C2110c.this;
                if (cVar2.f6209a0 && (jVar = cVar2.f6218q) != null) {
                    jVar.mo7165a();
                }
                C2110c cVar3 = C2110c.this;
                cVar3.f6188C = cVar3.f6196K.getTop();
                return;
            }
            cVar.mo7131r();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: c.u.b.c$b */
    class C2112b extends Animation {
        C2112b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            C2110c.this.setAnimationProgress(f);
        }
    }

    /* renamed from: c.u.b.c$c */
    class C2113c extends Animation {
        C2113c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            C2110c.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: c.u.b.c$d */
    class C2114d extends Animation {

        /* renamed from: f */
        final /* synthetic */ int f6231f;

        /* renamed from: o */
        final /* synthetic */ int f6232o;

        C2114d(int i, int i2) {
            this.f6231f = i;
            this.f6232o = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C2106b bVar = C2110c.this.f6203R;
            int i = this.f6231f;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f6232o - i)) * f)));
        }
    }

    /* renamed from: c.u.b.c$e */
    class C2115e implements Animation.AnimationListener {
        C2115e() {
        }

        public void onAnimationEnd(Animation animation) {
            C2110c cVar = C2110c.this;
            if (!cVar.f6193H) {
                cVar.mo7151y((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: c.u.b.c$f */
    class C2116f extends Animation {
        C2116f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            C2110c cVar = C2110c.this;
            int abs = !cVar.f6211c0 ? cVar.f6201P - Math.abs(cVar.f6200O) : cVar.f6201P;
            C2110c cVar2 = C2110c.this;
            int i = cVar2.f6198M;
            C2110c.this.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f))) - cVar2.f6196K.getTop());
            C2110c.this.f6203R.mo7065e(1.0f - f);
        }
    }

    /* renamed from: c.u.b.c$g */
    class C2117g extends Animation {
        C2117g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            C2110c.this.mo7130p(f);
        }
    }

    /* renamed from: c.u.b.c$h */
    class C2118h extends Animation {
        C2118h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            C2110c cVar = C2110c.this;
            float f2 = cVar.f6199N;
            cVar.setAnimationProgress(f2 + ((-f2) * f));
            C2110c.this.mo7130p(f);
        }
    }

    /* renamed from: c.u.b.c$i */
    public interface C2119i {
        /* renamed from: a */
        boolean mo7164a(C2110c cVar, View view);
    }

    /* renamed from: c.u.b.c$j */
    public interface C2120j {
        /* renamed from: a */
        void mo7165a();
    }

    /* renamed from: c.u.b.c$k */
    static class C2121k extends View.BaseSavedState {
        public static final Parcelable.Creator<C2121k> CREATOR = new C2122a();

        /* renamed from: f */
        final boolean f6238f;

        /* renamed from: c.u.b.c$k$a */
        class C2122a implements Parcelable.Creator<C2121k> {
            C2122a() {
            }

            /* renamed from: a */
            public C2121k createFromParcel(Parcel parcel) {
                return new C2121k(parcel);
            }

            /* renamed from: b */
            public C2121k[] newArray(int i) {
                return new C2121k[i];
            }
        }

        C2121k(Parcel parcel) {
            super(parcel);
            this.f6238f = parcel.readByte() != 0;
        }

        C2121k(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f6238f = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f6238f ? (byte) 1 : 0);
        }
    }

    public C2110c(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2110c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6219r = false;
        this.f6221t = -1.0f;
        this.f6225x = new int[2];
        this.f6226y = new int[2];
        this.f6227z = new int[2];
        this.f6192G = -1;
        this.f6197L = -1;
        this.f6214f0 = new C2111a();
        this.f6215g0 = new C2116f();
        this.f6216h0 = new C2117g();
        this.f6220s = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f6187B = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f6195J = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f6210b0 = (int) (displayMetrics.density * 40.0f);
        m9035e();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f6201P = i;
        this.f6221t = (float) i;
        this.f6223v = new C1983o(this);
        this.f6224w = new C1979k(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f6210b0;
        this.f6188C = i2;
        this.f6200O = i2;
        mo7130p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6185o);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    private void m9032A(Animation.AnimationListener animationListener) {
        this.f6196K.setVisibility(0);
        this.f6203R.setAlpha(255);
        C2112b bVar = new C2112b();
        this.f6204S = bVar;
        bVar.setDuration((long) this.f6187B);
        if (animationListener != null) {
            this.f6196K.mo7055b(animationListener);
        }
        this.f6196K.clearAnimation();
        this.f6196K.startAnimation(this.f6204S);
    }

    /* renamed from: b */
    private void m9033b(int i, Animation.AnimationListener animationListener) {
        this.f6198M = i;
        this.f6215g0.reset();
        this.f6215g0.setDuration(200);
        this.f6215g0.setInterpolator(this.f6195J);
        if (animationListener != null) {
            this.f6196K.mo7055b(animationListener);
        }
        this.f6196K.clearAnimation();
        this.f6196K.startAnimation(this.f6215g0);
    }

    /* renamed from: c */
    private void m9034c(int i, Animation.AnimationListener animationListener) {
        if (this.f6193H) {
            m9046z(i, animationListener);
            return;
        }
        this.f6198M = i;
        this.f6216h0.reset();
        this.f6216h0.setDuration(200);
        this.f6216h0.setInterpolator(this.f6195J);
        if (animationListener != null) {
            this.f6196K.mo7055b(animationListener);
        }
        this.f6196K.clearAnimation();
        this.f6196K.startAnimation(this.f6216h0);
    }

    /* renamed from: e */
    private void m9035e() {
        this.f6196K = new C2104a(getContext());
        C2106b bVar = new C2106b(getContext());
        this.f6203R = bVar;
        bVar.mo7073l(1);
        this.f6196K.setImageDrawable(this.f6203R);
        this.f6196K.setVisibility(8);
        addView(this.f6196K);
    }

    /* renamed from: g */
    private void m9036g() {
        if (this.f6217p == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f6196K)) {
                    this.f6217p = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private void m9037h(float f) {
        if (f > this.f6221t) {
            m9041t(true, true);
            return;
        }
        this.f6219r = false;
        this.f6203R.mo7071j(0.0f, 0.0f);
        C2115e eVar = null;
        if (!this.f6193H) {
            eVar = new C2115e();
        }
        m9034c(this.f6188C, eVar);
        this.f6203R.mo7063d(false);
    }

    /* renamed from: i */
    private boolean m9038i(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: j */
    private void m9039j(float f) {
        this.f6203R.mo7063d(true);
        float min = Math.min(1.0f, Math.abs(f / this.f6221t));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f6221t;
        int i = this.f6202Q;
        if (i <= 0) {
            i = this.f6211c0 ? this.f6201P - this.f6200O : this.f6201P;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f6200O + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f6196K.getVisibility() != 0) {
            this.f6196K.setVisibility(0);
        }
        if (!this.f6193H) {
            this.f6196K.setScaleX(1.0f);
            this.f6196K.setScaleY(1.0f);
        }
        if (this.f6193H) {
            setAnimationProgress(Math.min(1.0f, f / this.f6221t));
        }
        if (f < this.f6221t) {
            if (this.f6203R.getAlpha() > 76 && !m9038i(this.f6206U)) {
                m9045x();
            }
        } else if (this.f6203R.getAlpha() < 255 && !m9038i(this.f6207V)) {
            m9044w();
        }
        this.f6203R.mo7071j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f6203R.mo7065e(Math.min(1.0f, max));
        this.f6203R.mo7067g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f6188C);
    }

    /* renamed from: q */
    private void m9040q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6192G) {
            this.f6192G = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i) {
        this.f6196K.getBackground().setAlpha(i);
        this.f6203R.setAlpha(i);
    }

    /* renamed from: t */
    private void m9041t(boolean z, boolean z2) {
        if (this.f6219r != z) {
            this.f6209a0 = z2;
            m9036g();
            this.f6219r = z;
            if (z) {
                m9033b(this.f6188C, this.f6214f0);
            } else {
                mo7151y(this.f6214f0);
            }
        }
    }

    /* renamed from: u */
    private Animation m9042u(int i, int i2) {
        C2114d dVar = new C2114d(i, i2);
        dVar.setDuration(300);
        this.f6196K.mo7055b((Animation.AnimationListener) null);
        this.f6196K.clearAnimation();
        this.f6196K.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: v */
    private void m9043v(float f) {
        float f2 = this.f6190E;
        int i = this.f6220s;
        if (f - f2 > ((float) i) && !this.f6191F) {
            this.f6189D = f2 + ((float) i);
            this.f6191F = true;
            this.f6203R.setAlpha(76);
        }
    }

    /* renamed from: w */
    private void m9044w() {
        this.f6207V = m9042u(this.f6203R.getAlpha(), 255);
    }

    /* renamed from: x */
    private void m9045x() {
        this.f6206U = m9042u(this.f6203R.getAlpha(), 76);
    }

    /* renamed from: z */
    private void m9046z(int i, Animation.AnimationListener animationListener) {
        this.f6198M = i;
        this.f6199N = this.f6196K.getScaleX();
        C2118h hVar = new C2118h();
        this.f6208W = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f6196K.mo7055b(animationListener);
        }
        this.f6196K.clearAnimation();
        this.f6196K.startAnimation(this.f6208W);
    }

    /* renamed from: a */
    public void mo900a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            int i6 = iArr[1];
            mo7116f(i, i2, i3, i4, this.f6226y, i5, iArr);
            int i7 = i4 - (iArr[1] - i6);
            int i8 = i7 == 0 ? i4 + this.f6226y[1] : i7;
            if (i8 < 0 && !mo7111d()) {
                float abs = this.f6222u + ((float) Math.abs(i8));
                this.f6222u = abs;
                m9039j(abs);
                iArr[1] = iArr[1] + i7;
            }
        }
    }

    /* renamed from: d */
    public boolean mo7111d() {
        C2119i iVar = this.f6212d0;
        if (iVar != null) {
            return iVar.mo7164a(this, this.f6217p);
        }
        View view = this.f6217p;
        return view instanceof ListView ? C1192g.m4689a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f6224w.mo6642a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f6224w.mo6643b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f6224w.mo6644c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f6224w.mo6647f(i, i2, i3, i4, iArr);
    }

    /* renamed from: f */
    public void mo7116f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (i5 == 0) {
            this.f6224w.mo6646e(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f6197L;
        return i3 < 0 ? i2 : i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        return this.f6223v.mo6657a();
    }

    public int getProgressCircleDiameter() {
        return this.f6210b0;
    }

    public int getProgressViewEndOffset() {
        return this.f6201P;
    }

    public int getProgressViewStartOffset() {
        return this.f6200O;
    }

    public boolean hasNestedScrollingParent() {
        return this.f6224w.mo6649k();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f6224w.mo6651m();
    }

    /* renamed from: k */
    public void mo919k(View view, int i, int i2, int i3, int i4, int i5) {
        mo900a(view, i, i2, i3, i4, i5, this.f6227z);
    }

    /* renamed from: l */
    public boolean mo920l(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    /* renamed from: m */
    public void mo921m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: n */
    public void mo922n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: o */
    public void mo923o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo7131r();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m9036g();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6194I && actionMasked == 0) {
            this.f6194I = false;
        }
        if (!isEnabled() || this.f6194I || mo7111d() || this.f6219r || this.f6186A) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f6192G;
                    if (i == -1) {
                        Log.e(f6184f, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m9043v(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m9040q(motionEvent);
                    }
                }
            }
            this.f6191F = false;
            this.f6192G = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f6200O - this.f6196K.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f6192G = pointerId;
            this.f6191F = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f6190E = motionEvent.getY(findPointerIndex2);
        }
        return this.f6191F;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f6217p == null) {
                m9036g();
            }
            View view = this.f6217p;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f6196K.getMeasuredWidth();
                int measuredHeight2 = this.f6196K.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f6188C;
                this.f6196K.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6217p == null) {
            m9036g();
        }
        View view = this.f6217p;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f6196K.measure(View.MeasureSpec.makeMeasureSpec(this.f6210b0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f6210b0, 1073741824));
            this.f6197L = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f6196K) {
                    this.f6197L = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f6222u;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f6222u = 0.0f;
                } else {
                    this.f6222u = f - f2;
                    iArr[1] = i2;
                }
                m9039j(this.f6222u);
            }
        }
        if (this.f6211c0 && i2 > 0 && this.f6222u == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f6196K.setVisibility(8);
        }
        int[] iArr2 = this.f6225x;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo900a(view, i, i2, i3, i4, 0, this.f6227z);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f6223v.mo6658b(view, view2, i);
        startNestedScroll(i & 2);
        this.f6222u = 0.0f;
        this.f6186A = true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C2121k kVar = (C2121k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f6238f);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new C2121k(super.onSaveInstanceState(), this.f6219r);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f6194I && !this.f6219r && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f6223v.mo6660d(view);
        this.f6186A = false;
        float f = this.f6222u;
        if (f > 0.0f) {
            m9037h(f);
            this.f6222u = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6194I && actionMasked == 0) {
            this.f6194I = false;
        }
        if (!isEnabled() || this.f6194I || mo7111d() || this.f6219r || this.f6186A) {
            return false;
        }
        if (actionMasked == 0) {
            this.f6192G = motionEvent.getPointerId(0);
            this.f6191F = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f6192G);
            if (findPointerIndex < 0) {
                Log.e(f6184f, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f6191F) {
                this.f6191F = false;
                m9037h((motionEvent.getY(findPointerIndex) - this.f6189D) * 0.5f);
            }
            this.f6192G = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f6192G);
            if (findPointerIndex2 < 0) {
                Log.e(f6184f, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            m9043v(y);
            if (this.f6191F) {
                float f = (y - this.f6189D) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m9039j(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f6184f, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f6192G = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m9040q(motionEvent);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo7130p(float f) {
        int i = this.f6198M;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f6200O - i)) * f))) - this.f6196K.getTop());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo7131r() {
        this.f6196K.clearAnimation();
        this.f6203R.stop();
        this.f6196K.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f6193H) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f6200O - this.f6188C);
        }
        this.f6188C = this.f6196K.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view;
        if ((Build.VERSION.SDK_INT >= 21 || !(this.f6217p instanceof AbsListView)) && ((view = this.f6217p) == null || C1988t.m8362T(view))) {
            super.requestDisallowInterceptTouchEvent(z);
        } else if (!this.f6213e0 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: s */
    public void mo7133s(boolean z, int i, int i2) {
        this.f6193H = z;
        this.f6200O = i;
        this.f6201P = i2;
        this.f6211c0 = true;
        mo7131r();
        this.f6219r = false;
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        this.f6196K.setScaleX(f);
        this.f6196K.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m9036g();
        this.f6203R.mo7066f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C1135a.m4417c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f6221t = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo7131r();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f6213e0 = z;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f6224w.mo6652n(z);
    }

    public void setOnChildScrollUpCallback(C2119i iVar) {
        this.f6212d0 = iVar;
    }

    public void setOnRefreshListener(C2120j jVar) {
        this.f6218q = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f6196K.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C1135a.m4417c(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f6219r == z) {
            m9041t(z, false);
            return;
        }
        this.f6219r = z;
        setTargetOffsetTopAndBottom((!this.f6211c0 ? this.f6201P + this.f6200O : this.f6201P) - this.f6188C);
        this.f6209a0 = false;
        m9032A(this.f6214f0);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f6210b0 = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f6196K.setImageDrawable((Drawable) null);
            this.f6203R.mo7073l(i);
            this.f6196K.setImageDrawable(this.f6203R);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f6202Q = i;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f6196K.bringToFront();
        C1988t.m8367Y(this.f6196K, i);
        this.f6188C = this.f6196K.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f6224w.mo6653p(i);
    }

    public void stopNestedScroll() {
        this.f6224w.mo6655r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo7151y(Animation.AnimationListener animationListener) {
        C2113c cVar = new C2113c();
        this.f6205T = cVar;
        cVar.setDuration(150);
        this.f6196K.mo7055b(animationListener);
        this.f6196K.clearAnimation();
        this.f6196K.startAnimation(this.f6205T);
    }
}
