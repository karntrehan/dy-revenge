package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.util.C1177h;
import androidx.recyclerview.widget.C1371a;
import androidx.recyclerview.widget.C1374b;
import androidx.recyclerview.widget.C1393e;
import androidx.recyclerview.widget.C1405k;
import androidx.recyclerview.widget.C1412o;
import androidx.recyclerview.widget.C1415p;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p027c.p064i.p069g.C1864m;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1977i;
import p027c.p064i.p072j.C1978j;
import p027c.p064i.p072j.C1979k;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.C2002u;
import p027c.p064i.p072j.p073g0.C1954b;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p077k.p078a.C2019a;
import p027c.p095s.C2089a;
import p027c.p095s.C2090b;
import p027c.p095s.C2091c;

public class RecyclerView extends ViewGroup implements C1978j {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new C1325c();
    C1405k mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    C1331g mAdapter;
    C1371a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private C1334j mChildDrawingOrderCallback;
    C1374b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C1335k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    C1393e mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private C1350s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    C1336l mItemAnimator;
    private C1336l.C1338b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<C1341n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    C1342o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C1356x mObserver;
    private List<C1348q> mOnChildAttachStateListeners;
    private C1349r mOnFlingListener;
    private final ArrayList<C1350s> mOnItemTouchListeners;
    final List<C1328d0> mPendingAccessibilityImportanceChange;
    private C1357y mPendingSavedState;
    boolean mPostedAnimatorRunner;
    C1393e.C1395b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C1354v mRecycler;
    C1355w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private C1351t mScrollListener;
    private List<C1351t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C1979k mScrollingChildHelper;
    final C1322a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final C1326c0 mViewFlinger;
    private final C1415p.C1417b mViewInfoProcessCallback;
    final C1415p mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C1321a implements Runnable {
        C1321a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C1322a0 {

        /* renamed from: a */
        int f3811a = -1;

        /* renamed from: b */
        private SparseArray<Object> f3812b;

        /* renamed from: c */
        int f3813c = 0;

        /* renamed from: d */
        int f3814d = 0;

        /* renamed from: e */
        int f3815e = 1;

        /* renamed from: f */
        int f3816f = 0;

        /* renamed from: g */
        boolean f3817g = false;

        /* renamed from: h */
        boolean f3818h = false;

        /* renamed from: i */
        boolean f3819i = false;

        /* renamed from: j */
        boolean f3820j = false;

        /* renamed from: k */
        boolean f3821k = false;

        /* renamed from: l */
        boolean f3822l = false;

        /* renamed from: m */
        int f3823m;

        /* renamed from: n */
        long f3824n;

        /* renamed from: o */
        int f3825o;

        /* renamed from: p */
        int f3826p;

        /* renamed from: q */
        int f3827q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4681a(int i) {
            if ((this.f3815e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3815e));
            }
        }

        /* renamed from: b */
        public int mo4682b() {
            return this.f3818h ? this.f3813c - this.f3814d : this.f3816f;
        }

        /* renamed from: c */
        public int mo4683c() {
            return this.f3811a;
        }

        /* renamed from: d */
        public boolean mo4684d() {
            return this.f3811a != -1;
        }

        /* renamed from: e */
        public boolean mo4685e() {
            return this.f3818h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4686f(C1331g gVar) {
            this.f3815e = 1;
            this.f3816f = gVar.mo4760c();
            this.f3818h = false;
            this.f3819i = false;
            this.f3820j = false;
        }

        /* renamed from: g */
        public boolean mo4687g() {
            return this.f3822l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3811a + ", mData=" + this.f3812b + ", mItemCount=" + this.f3816f + ", mIsMeasuring=" + this.f3820j + ", mPreviousLayoutItemCount=" + this.f3813c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3814d + ", mStructureChanged=" + this.f3817g + ", mInPreLayout=" + this.f3818h + ", mRunSimpleAnimations=" + this.f3821k + ", mRunPredictiveAnimations=" + this.f3822l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C1323b implements Runnable {
        C1323b() {
        }

        public void run() {
            C1336l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.mo4802u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C1324b0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class C1325c implements Interpolator {
        C1325c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    class C1326c0 implements Runnable {

        /* renamed from: f */
        private int f3829f;

        /* renamed from: o */
        private int f3830o;

        /* renamed from: p */
        OverScroller f3831p;

        /* renamed from: q */
        Interpolator f3832q;

        /* renamed from: r */
        private boolean f3833r = false;

        /* renamed from: s */
        private boolean f3834s = false;

        C1326c0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f3832q = interpolator;
            this.f3831p = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m5531a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float b = f2 + (m5532b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, RecyclerView.MAX_SCROLL_DURATION);
        }

        /* renamed from: b */
        private float m5532b(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: d */
        private void m5533d() {
            RecyclerView.this.removeCallbacks(this);
            C1988t.m8378e0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void mo4691c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f3830o = 0;
            this.f3829f = 0;
            Interpolator interpolator = this.f3832q;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f3832q = interpolator2;
                this.f3831p = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3831p.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, RecyclerView.UNDEFINED_DURATION, RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
            mo4692e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4692e() {
            if (this.f3833r) {
                this.f3834s = true;
            } else {
                m5533d();
            }
        }

        /* renamed from: f */
        public void mo4693f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m5531a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f3832q != interpolator) {
                this.f3832q = interpolator;
                this.f3831p = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3830o = 0;
            this.f3829f = 0;
            RecyclerView.this.setScrollState(2);
            this.f3831p.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3831p.computeScrollOffset();
            }
            mo4692e();
        }

        /* renamed from: g */
        public void mo4694g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3831p.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                mo4694g();
                return;
            }
            this.f3834s = false;
            this.f3833r = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f3831p;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f3829f;
                int i4 = currY - this.f3830o;
                this.f3829f = currX;
                this.f3830o = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C1359z zVar = recyclerView4.mLayout.f3877g;
                    if (zVar != null && !zVar.mo4985g() && zVar.mo4986h()) {
                        int b = RecyclerView.this.mState.mo4682b();
                        if (b == 0) {
                            zVar.mo4996r();
                        } else {
                            if (zVar.mo4984f() >= b) {
                                zVar.mo4994p(b - 1);
                            }
                            zVar.mo4988j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C1359z zVar2 = RecyclerView.this.mLayout.f3877g;
                if ((zVar2 != null && zVar2.mo4985g()) || !z) {
                    mo4692e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C1393e eVar = recyclerView7.mGapWorker;
                    if (eVar != null) {
                        eVar.mo5159f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.mo5165b();
                    }
                }
            }
            C1359z zVar3 = RecyclerView.this.mLayout.f3877g;
            if (zVar3 != null && zVar3.mo4985g()) {
                zVar3.mo4988j(0, 0);
            }
            this.f3833r = false;
            if (this.f3834s) {
                m5533d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C1327d implements C1415p.C1417b {
        C1327d() {
        }

        /* renamed from: a */
        public void mo4696a(C1328d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.mo4884m1(d0Var.f3838b, recyclerView.mRecycler);
        }

        /* renamed from: b */
        public void mo4697b(C1328d0 d0Var, C1336l.C1339c cVar, C1336l.C1339c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo4698c(C1328d0 d0Var, C1336l.C1339c cVar, C1336l.C1339c cVar2) {
            RecyclerView.this.mRecycler.mo4944J(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        /* renamed from: d */
        public void mo4699d(C1328d0 d0Var, C1336l.C1339c cVar, C1336l.C1339c cVar2) {
            d0Var.mo4706G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.mDataSetHasChangedAfterLayout;
            C1336l lVar = recyclerView.mItemAnimator;
            if (z) {
                if (!lVar.mo4784b(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.mo4786d(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.postAnimationRunner();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C1328d0 {

        /* renamed from: a */
        private static final List<Object> f3837a = Collections.emptyList();

        /* renamed from: b */
        public final View f3838b;

        /* renamed from: c */
        WeakReference<RecyclerView> f3839c;

        /* renamed from: d */
        int f3840d = -1;

        /* renamed from: e */
        int f3841e = -1;

        /* renamed from: f */
        long f3842f = -1;

        /* renamed from: g */
        int f3843g = -1;

        /* renamed from: h */
        int f3844h = -1;

        /* renamed from: i */
        C1328d0 f3845i = null;

        /* renamed from: j */
        C1328d0 f3846j = null;

        /* renamed from: k */
        int f3847k;

        /* renamed from: l */
        List<Object> f3848l = null;

        /* renamed from: m */
        List<Object> f3849m = null;

        /* renamed from: n */
        private int f3850n = 0;

        /* renamed from: o */
        C1354v f3851o = null;

        /* renamed from: p */
        boolean f3852p = false;

        /* renamed from: q */
        private int f3853q = 0;

        /* renamed from: r */
        int f3854r = -1;

        /* renamed from: s */
        RecyclerView f3855s;

        public C1328d0(View view) {
            if (view != null) {
                this.f3838b = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: g */
        private void m5542g() {
            if (this.f3848l == null) {
                ArrayList arrayList = new ArrayList();
                this.f3848l = arrayList;
                this.f3849m = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4700A(int i, boolean z) {
            if (this.f3841e == -1) {
                this.f3841e = this.f3840d;
            }
            if (this.f3844h == -1) {
                this.f3844h = this.f3840d;
            }
            if (z) {
                this.f3844h += i;
            }
            this.f3840d += i;
            if (this.f3838b.getLayoutParams() != null) {
                ((C1347p) this.f3838b.getLayoutParams()).f3897c = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo4701B(RecyclerView recyclerView) {
            int i = this.f3854r;
            if (i == -1) {
                i = C1988t.m8413w(this.f3838b);
            }
            this.f3853q = i;
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4702C(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.f3853q);
            this.f3853q = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4703D() {
            this.f3847k = 0;
            this.f3840d = -1;
            this.f3841e = -1;
            this.f3842f = -1;
            this.f3844h = -1;
            this.f3850n = 0;
            this.f3845i = null;
            this.f3846j = null;
            mo4715d();
            this.f3853q = 0;
            this.f3854r = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo4704E() {
            if (this.f3841e == -1) {
                this.f3841e = this.f3840d;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo4705F(int i, int i2) {
            this.f3847k = (i & i2) | (this.f3847k & (~i2));
        }

        /* renamed from: G */
        public final void mo4706G(boolean z) {
            int i;
            int i2 = this.f3850n;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f3850n = i3;
            if (i3 < 0) {
                this.f3850n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f3847k | 16;
            } else if (z && i3 == 0) {
                i = this.f3847k & -17;
            } else {
                return;
            }
            this.f3847k = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo4707H(C1354v vVar, boolean z) {
            this.f3851o = vVar;
            this.f3852p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo4708I() {
            return (this.f3847k & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo4709J() {
            return (this.f3847k & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo4710K() {
            this.f3851o.mo4944J(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo4711L() {
            return (this.f3847k & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4712a(Object obj) {
            if (obj == null) {
                mo4713b(1024);
            } else if ((1024 & this.f3847k) == 0) {
                m5542g();
                this.f3848l.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4713b(int i) {
            this.f3847k = i | this.f3847k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4714c() {
            this.f3841e = -1;
            this.f3844h = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4715d() {
            List<Object> list = this.f3848l;
            if (list != null) {
                list.clear();
            }
            this.f3847k &= -1025;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4716e() {
            this.f3847k &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4717f() {
            this.f3847k &= -257;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo4718h() {
            return (this.f3847k & 16) == 0 && C1988t.m8357O(this.f3838b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4719i(int i, int i2, boolean z) {
            mo4713b(8);
            mo4700A(i2, z);
            this.f3840d = i;
        }

        /* renamed from: j */
        public final int mo4720j() {
            RecyclerView recyclerView = this.f3855s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        /* renamed from: k */
        public final long mo4721k() {
            return this.f3842f;
        }

        /* renamed from: l */
        public final int mo4722l() {
            return this.f3843g;
        }

        /* renamed from: m */
        public final int mo4723m() {
            int i = this.f3844h;
            return i == -1 ? this.f3840d : i;
        }

        /* renamed from: n */
        public final int mo4724n() {
            return this.f3841e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public List<Object> mo4725o() {
            if ((this.f3847k & 1024) != 0) {
                return f3837a;
            }
            List<Object> list = this.f3848l;
            return (list == null || list.size() == 0) ? f3837a : this.f3849m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo4726p(int i) {
            return (i & this.f3847k) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo4727q() {
            return (this.f3847k & 512) != 0 || mo4730t();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo4728r() {
            return (this.f3838b.getParent() == null || this.f3838b.getParent() == this.f3855s) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo4729s() {
            return (this.f3847k & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public boolean mo4730t() {
            return (this.f3847k & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3840d + " id=" + this.f3842f + ", oldPos=" + this.f3841e + ", pLpos:" + this.f3844h);
            if (mo4734w()) {
                sb.append(" scrap ");
                sb.append(this.f3852p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo4730t()) {
                sb.append(" invalid");
            }
            if (!mo4729s()) {
                sb.append(" unbound");
            }
            if (mo4737z()) {
                sb.append(" update");
            }
            if (mo4733v()) {
                sb.append(" removed");
            }
            if (mo4709J()) {
                sb.append(" ignored");
            }
            if (mo4735x()) {
                sb.append(" tmpDetached");
            }
            if (!mo4732u()) {
                sb.append(" not recyclable(" + this.f3850n + ")");
            }
            if (mo4727q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3838b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public final boolean mo4732u() {
            return (this.f3847k & 16) == 0 && !C1988t.m8357O(this.f3838b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public boolean mo4733v() {
            return (this.f3847k & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public boolean mo4734w() {
            return this.f3851o != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo4735x() {
            return (this.f3847k & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public boolean mo4736y() {
            return (this.f3847k & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public boolean mo4737z() {
            return (this.f3847k & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C1329e implements C1374b.C1376b {
        C1329e() {
        }

        /* renamed from: a */
        public View mo4738a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: b */
        public int mo4739b() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: c */
        public void mo4740c(View view) {
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.mo4701B(RecyclerView.this);
            }
        }

        /* renamed from: d */
        public void mo4741d() {
            int b = mo4739b();
            for (int i = 0; i < b; i++) {
                View a = mo4738a(i);
                RecyclerView.this.dispatchChildDetached(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: e */
        public int mo4742e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: f */
        public C1328d0 mo4743f(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        /* renamed from: g */
        public void mo4744g(int i) {
            C1328d0 childViewHolderInt;
            View a = mo4738a(i);
            if (!(a == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(a)) == null)) {
                if (!childViewHolderInt.mo4735x() || childViewHolderInt.mo4709J()) {
                    childViewHolderInt.mo4713b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: h */
        public void mo4745h(View view) {
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.mo4702C(RecyclerView.this);
            }
        }

        /* renamed from: i */
        public void mo4746i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        /* renamed from: j */
        public void mo4747j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: k */
        public void mo4748k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.mo4735x() || childViewHolderInt.mo4709J()) {
                    childViewHolderInt.mo4717f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C1330f implements C1371a.C1372a {
        C1330f() {
        }

        /* renamed from: a */
        public void mo4749a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: b */
        public void mo4750b(C1371a.C1373b bVar) {
            mo4757i(bVar);
        }

        /* renamed from: c */
        public void mo4751c(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: d */
        public void mo4752d(C1371a.C1373b bVar) {
            mo4757i(bVar);
        }

        /* renamed from: e */
        public C1328d0 mo4753e(int i) {
            C1328d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.mo5106n(findViewHolderForPosition.f3838b)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        /* renamed from: f */
        public void mo4754f(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: g */
        public void mo4755g(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: h */
        public void mo4756h(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f3814d += i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4757i(C1371a.C1373b bVar) {
            int i = bVar.f3995a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.mo4406R0(recyclerView, bVar.f3996b, bVar.f3998d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo4409U0(recyclerView2, bVar.f3996b, bVar.f3998d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo4410W0(recyclerView3, bVar.f3996b, bVar.f3998d, bVar.f3997c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.mo4408T0(recyclerView4, bVar.f3996b, bVar.f3998d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C1331g<VH extends C1328d0> {

        /* renamed from: a */
        private final C1332h f3858a = new C1332h();

        /* renamed from: b */
        private boolean f3859b = false;

        /* renamed from: a */
        public final void mo4758a(VH vh, int i) {
            vh.f3840d = i;
            if (mo4764g()) {
                vh.f3842f = mo4761d(i);
            }
            vh.mo4705F(1, 519);
            C1864m.m7881a(RecyclerView.TRACE_BIND_VIEW_TAG);
            mo4768k(vh, i, vh.mo4725o());
            vh.mo4715d();
            ViewGroup.LayoutParams layoutParams = vh.f3838b.getLayoutParams();
            if (layoutParams instanceof C1347p) {
                ((C1347p) layoutParams).f3897c = true;
            }
            C1864m.m7882b();
        }

        /* renamed from: b */
        public final VH mo4759b(ViewGroup viewGroup, int i) {
            try {
                C1864m.m7881a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH l = mo4769l(viewGroup, i);
                if (l.f3838b.getParent() == null) {
                    l.f3843g = i;
                    return l;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C1864m.m7882b();
            }
        }

        /* renamed from: c */
        public abstract int mo4760c();

        /* renamed from: d */
        public long mo4761d(int i) {
            return -1;
        }

        /* renamed from: e */
        public int mo4762e(int i) {
            return 0;
        }

        /* renamed from: f */
        public final boolean mo4763f() {
            return this.f3858a.mo4778a();
        }

        /* renamed from: g */
        public final boolean mo4764g() {
            return this.f3859b;
        }

        /* renamed from: h */
        public final void mo4765h() {
            this.f3858a.mo4779b();
        }

        /* renamed from: i */
        public void mo4766i(RecyclerView recyclerView) {
        }

        /* renamed from: j */
        public abstract void mo4767j(VH vh, int i);

        /* renamed from: k */
        public void mo4768k(VH vh, int i, List<Object> list) {
            mo4767j(vh, i);
        }

        /* renamed from: l */
        public abstract VH mo4769l(ViewGroup viewGroup, int i);

        /* renamed from: m */
        public void mo4770m(RecyclerView recyclerView) {
        }

        /* renamed from: n */
        public boolean mo4771n(VH vh) {
            return false;
        }

        /* renamed from: o */
        public void mo4772o(VH vh) {
        }

        /* renamed from: p */
        public void mo4773p(VH vh) {
        }

        /* renamed from: q */
        public void mo4774q(VH vh) {
        }

        /* renamed from: r */
        public void mo4775r(C1333i iVar) {
            this.f3858a.registerObserver(iVar);
        }

        /* renamed from: s */
        public void mo4776s(boolean z) {
            if (!mo4763f()) {
                this.f3859b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: t */
        public void mo4777t(C1333i iVar) {
            this.f3858a.unregisterObserver(iVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C1332h extends Observable<C1333i> {
        C1332h() {
        }

        /* renamed from: a */
        public boolean mo4778a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo4779b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1333i) this.mObservers.get(size)).mo4780a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C1333i {
        /* renamed from: a */
        public void mo4780a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C1334j {
        /* renamed from: a */
        int mo4781a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C1335k {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4782a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C1336l {

        /* renamed from: a */
        private C1338b f3860a = null;

        /* renamed from: b */
        private ArrayList<C1337a> f3861b = new ArrayList<>();

        /* renamed from: c */
        private long f3862c = 120;

        /* renamed from: d */
        private long f3863d = 120;

        /* renamed from: e */
        private long f3864e = 250;

        /* renamed from: f */
        private long f3865f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C1337a {
            /* renamed from: a */
            void mo4804a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        interface C1338b {
            /* renamed from: a */
            void mo4805a(C1328d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C1339c {

            /* renamed from: a */
            public int f3866a;

            /* renamed from: b */
            public int f3867b;

            /* renamed from: c */
            public int f3868c;

            /* renamed from: d */
            public int f3869d;

            /* renamed from: a */
            public C1339c mo4806a(C1328d0 d0Var) {
                return mo4807b(d0Var, 0);
            }

            /* renamed from: b */
            public C1339c mo4807b(C1328d0 d0Var, int i) {
                View view = d0Var.f3838b;
                this.f3866a = view.getLeft();
                this.f3867b = view.getTop();
                this.f3868c = view.getRight();
                this.f3869d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m5625e(C1328d0 d0Var) {
            int i = d0Var.f3847k & 14;
            if (d0Var.mo4730t()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int n = d0Var.mo4724n();
            int j = d0Var.mo4720j();
            return (n == -1 || j == -1 || n == j) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo4783a(C1328d0 d0Var, C1339c cVar, C1339c cVar2);

        /* renamed from: b */
        public abstract boolean mo4784b(C1328d0 d0Var, C1328d0 d0Var2, C1339c cVar, C1339c cVar2);

        /* renamed from: c */
        public abstract boolean mo4785c(C1328d0 d0Var, C1339c cVar, C1339c cVar2);

        /* renamed from: d */
        public abstract boolean mo4786d(C1328d0 d0Var, C1339c cVar, C1339c cVar2);

        /* renamed from: f */
        public abstract boolean mo4787f(C1328d0 d0Var);

        /* renamed from: g */
        public boolean mo4788g(C1328d0 d0Var, List<Object> list) {
            return mo4787f(d0Var);
        }

        /* renamed from: h */
        public final void mo4789h(C1328d0 d0Var) {
            mo4799r(d0Var);
            C1338b bVar = this.f3860a;
            if (bVar != null) {
                bVar.mo4805a(d0Var);
            }
        }

        /* renamed from: i */
        public final void mo4790i() {
            int size = this.f3861b.size();
            for (int i = 0; i < size; i++) {
                this.f3861b.get(i).mo4804a();
            }
            this.f3861b.clear();
        }

        /* renamed from: j */
        public abstract void mo4791j(C1328d0 d0Var);

        /* renamed from: k */
        public abstract void mo4792k();

        /* renamed from: l */
        public long mo4793l() {
            return this.f3862c;
        }

        /* renamed from: m */
        public long mo4794m() {
            return this.f3865f;
        }

        /* renamed from: n */
        public long mo4795n() {
            return this.f3864e;
        }

        /* renamed from: o */
        public long mo4796o() {
            return this.f3863d;
        }

        /* renamed from: p */
        public abstract boolean mo4797p();

        /* renamed from: q */
        public C1339c mo4798q() {
            return new C1339c();
        }

        /* renamed from: r */
        public void mo4799r(C1328d0 d0Var) {
        }

        /* renamed from: s */
        public C1339c mo4800s(C1322a0 a0Var, C1328d0 d0Var) {
            return mo4798q().mo4806a(d0Var);
        }

        /* renamed from: t */
        public C1339c mo4801t(C1322a0 a0Var, C1328d0 d0Var, int i, List<Object> list) {
            return mo4798q().mo4806a(d0Var);
        }

        /* renamed from: u */
        public abstract void mo4802u();

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4803v(C1338b bVar) {
            this.f3860a = bVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C1340m implements C1336l.C1338b {
        C1340m() {
        }

        /* renamed from: a */
        public void mo4805a(C1328d0 d0Var) {
            d0Var.mo4706G(true);
            if (d0Var.f3845i != null && d0Var.f3846j == null) {
                d0Var.f3845i = null;
            }
            d0Var.f3846j = null;
            if (!d0Var.mo4708I() && !RecyclerView.this.removeAnimatingView(d0Var.f3838b) && d0Var.mo4735x()) {
                RecyclerView.this.removeDetachedView(d0Var.f3838b, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C1341n {
        @Deprecated
        /* renamed from: d */
        public void mo4808d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo4809e(Rect rect, View view, RecyclerView recyclerView, C1322a0 a0Var) {
            mo4808d(rect, ((C1347p) view.getLayoutParams()).mo4913a(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void mo4810f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo4811g(Canvas canvas, RecyclerView recyclerView, C1322a0 a0Var) {
            mo4810f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void mo4812h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo4813i(Canvas canvas, RecyclerView recyclerView, C1322a0 a0Var) {
            mo4812h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C1342o {

        /* renamed from: a */
        C1374b f3871a;

        /* renamed from: b */
        RecyclerView f3872b;

        /* renamed from: c */
        private final C1412o.C1414b f3873c;

        /* renamed from: d */
        private final C1412o.C1414b f3874d;

        /* renamed from: e */
        C1412o f3875e;

        /* renamed from: f */
        C1412o f3876f;

        /* renamed from: g */
        C1359z f3877g;

        /* renamed from: h */
        boolean f3878h = false;

        /* renamed from: i */
        boolean f3879i = false;

        /* renamed from: j */
        boolean f3880j = false;

        /* renamed from: k */
        private boolean f3881k = true;

        /* renamed from: l */
        private boolean f3882l = true;

        /* renamed from: m */
        int f3883m;

        /* renamed from: n */
        boolean f3884n;

        /* renamed from: o */
        private int f3885o;

        /* renamed from: p */
        private int f3886p;

        /* renamed from: q */
        private int f3887q;

        /* renamed from: r */
        private int f3888r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class C1343a implements C1412o.C1414b {
            C1343a() {
            }

            /* renamed from: a */
            public View mo4907a(int i) {
                return C1342o.this.mo4832I(i);
            }

            /* renamed from: b */
            public int mo4908b(View view) {
                return C1342o.this.mo4843Q(view) - ((C1347p) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo4909c() {
                return C1342o.this.mo4866e0();
            }

            /* renamed from: d */
            public int mo4910d() {
                return C1342o.this.mo4887o0() - C1342o.this.mo4868f0();
            }

            /* renamed from: e */
            public int mo4911e(View view) {
                return C1342o.this.mo4847T(view) + ((C1347p) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class C1344b implements C1412o.C1414b {
            C1344b() {
            }

            /* renamed from: a */
            public View mo4907a(int i) {
                return C1342o.this.mo4832I(i);
            }

            /* renamed from: b */
            public int mo4908b(View view) {
                return C1342o.this.mo4848U(view) - ((C1347p) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo4909c() {
                return C1342o.this.mo4870g0();
            }

            /* renamed from: d */
            public int mo4910d() {
                return C1342o.this.mo4851W() - C1342o.this.mo4864d0();
            }

            /* renamed from: e */
            public int mo4911e(View view) {
                return C1342o.this.mo4840O(view) + ((C1347p) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C1345c {
            /* renamed from: a */
            void mo4912a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C1346d {

            /* renamed from: a */
            public int f3891a;

            /* renamed from: b */
            public int f3892b;

            /* renamed from: c */
            public boolean f3893c;

            /* renamed from: d */
            public boolean f3894d;
        }

        public C1342o() {
            C1343a aVar = new C1343a();
            this.f3873c = aVar;
            C1344b bVar = new C1344b();
            this.f3874d = bVar;
            this.f3875e = new C1412o(aVar);
            this.f3876f = new C1412o(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m5658K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1342o.m5658K(int, int, int, int, boolean):int");
        }

        /* renamed from: L */
        private int[] m5659L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e0 = mo4866e0();
            int g0 = mo4870g0();
            int o0 = mo4887o0() - mo4868f0();
            int W = mo4851W() - mo4864d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - e0;
            int min = Math.min(0, i);
            int i2 = top - g0;
            int min2 = Math.min(0, i2);
            int i3 = width - o0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - W);
            if (mo4854Z() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: f */
        private void m5660f(View view, int i, boolean z) {
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.mo4733v()) {
                this.f3872b.mViewInfoStore.mo5243b(childViewHolderInt);
            } else {
                this.f3872b.mViewInfoStore.mo5256p(childViewHolderInt);
            }
            C1347p pVar = (C1347p) view.getLayoutParams();
            if (childViewHolderInt.mo4711L() || childViewHolderInt.mo4734w()) {
                if (childViewHolderInt.mo4734w()) {
                    childViewHolderInt.mo4710K();
                } else {
                    childViewHolderInt.mo4716e();
                }
                this.f3871a.mo5097c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3872b) {
                int m = this.f3871a.mo5105m(view);
                if (i == -1) {
                    i = this.f3871a.mo5101g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3872b.indexOfChild(view) + this.f3872b.exceptionLabel());
                } else if (m != i) {
                    this.f3872b.mLayout.mo4818B0(m, i);
                }
            } else {
                this.f3871a.mo5095a(view, i, false);
                pVar.f3897c = true;
                C1359z zVar = this.f3877g;
                if (zVar != null && zVar.mo4986h()) {
                    this.f3877g.mo4989k(view);
                }
            }
            if (pVar.f3898d) {
                childViewHolderInt.f3838b.invalidate();
                pVar.f3898d = false;
            }
        }

        /* renamed from: i0 */
        public static C1346d m5661i0(Context context, AttributeSet attributeSet, int i, int i2) {
            C1346d dVar = new C1346d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2091c.f6086f, i, i2);
            dVar.f3891a = obtainStyledAttributes.getInt(C2091c.f6087g, 1);
            dVar.f3892b = obtainStyledAttributes.getInt(C2091c.f6097q, 1);
            dVar.f3893c = obtainStyledAttributes.getBoolean(C2091c.f6096p, false);
            dVar.f3894d = obtainStyledAttributes.getBoolean(C2091c.f6098r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: n */
        public static int m5662n(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: t0 */
        private boolean m5663t0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e0 = mo4866e0();
            int g0 = mo4870g0();
            int o0 = mo4887o0() - mo4868f0();
            int W = mo4851W() - mo4864d0();
            Rect rect = this.f3872b.mTempRect;
            mo4842P(focusedChild, rect);
            return rect.left - i < o0 && rect.right - i > e0 && rect.top - i2 < W && rect.bottom - i2 > g0;
        }

        /* renamed from: v1 */
        private void m5664v1(C1354v vVar, int i, View view) {
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo4709J()) {
                if (!childViewHolderInt.mo4730t() || childViewHolderInt.mo4733v() || this.f3872b.mAdapter.mo4764g()) {
                    mo4901x(i);
                    vVar.mo4939D(view);
                    this.f3872b.mViewInfoStore.mo5252k(childViewHolderInt);
                    return;
                }
                mo4892q1(i);
                vVar.mo4938C(childViewHolderInt);
            }
        }

        /* renamed from: w0 */
        private static boolean m5665w0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: y */
        private void m5666y(int i, View view) {
            this.f3871a.mo5098d(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4814A(RecyclerView recyclerView, C1354v vVar) {
            this.f3879i = false;
            mo4441I0(recyclerView, vVar);
        }

        /* renamed from: A0 */
        public void mo4815A0(View view, int i, int i2) {
            C1347p pVar = (C1347p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f3872b.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int K = m5658K(mo4887o0(), mo4889p0(), mo4866e0() + mo4868f0() + pVar.leftMargin + pVar.rightMargin + i3, pVar.width, mo4459k());
            int K2 = m5658K(mo4851W(), mo4852X(), mo4870g0() + mo4864d0() + pVar.topMargin + pVar.bottomMargin + i4, pVar.height, mo4460l());
            if (mo4826F1(view, K, K2, pVar)) {
                view.measure(K, K2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A1 */
        public void mo4816A1(int i, int i2) {
            this.f3887q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f3885o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f3887q = 0;
            }
            this.f3888r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3886p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f3888r = 0;
            }
        }

        /* renamed from: B */
        public View mo4817B(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f3871a.mo5106n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        /* renamed from: B0 */
        public void mo4818B0(int i, int i2) {
            View I = mo4832I(i);
            if (I != null) {
                mo4901x(i);
                mo4872h(I, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3872b.toString());
        }

        /* renamed from: B1 */
        public void mo4819B1(int i, int i2) {
            this.f3872b.setMeasuredDimension(i, i2);
        }

        /* renamed from: C */
        public View mo4437C(int i) {
            int J = mo4833J();
            for (int i2 = 0; i2 < J; i2++) {
                View I = mo4832I(i2);
                C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(I);
                if (childViewHolderInt != null && childViewHolderInt.mo4723m() == i && !childViewHolderInt.mo4709J() && (this.f3872b.mState.mo4685e() || !childViewHolderInt.mo4733v())) {
                    return I;
                }
            }
            return null;
        }

        /* renamed from: C0 */
        public void mo4820C0(int i) {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: C1 */
        public void mo4396C1(Rect rect, int i, int i2) {
            mo4819B1(m5662n(i, rect.width() + mo4866e0() + mo4868f0(), mo4862c0()), m5662n(i2, rect.height() + mo4870g0() + mo4864d0(), mo4859b0()));
        }

        /* renamed from: D */
        public abstract C1347p mo4397D();

        /* renamed from: D0 */
        public void mo4821D0(int i) {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D1 */
        public void mo4822D1(int i, int i2) {
            int J = mo4833J();
            if (J == 0) {
                this.f3872b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = RecyclerView.UNDEFINED_DURATION;
            int i4 = RecyclerView.UNDEFINED_DURATION;
            int i5 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            int i6 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            for (int i7 = 0; i7 < J; i7++) {
                View I = mo4832I(i7);
                Rect rect = this.f3872b.mTempRect;
                mo4842P(I, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f3872b.mTempRect.set(i5, i6, i3, i4);
            mo4396C1(this.f3872b.mTempRect, i, i2);
        }

        /* renamed from: E */
        public C1347p mo4398E(Context context, AttributeSet attributeSet) {
            return new C1347p(context, attributeSet);
        }

        /* renamed from: E0 */
        public void mo4823E0(C1331g gVar, C1331g gVar2) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E1 */
        public void mo4824E1(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f3872b = null;
                this.f3871a = null;
                i = 0;
                this.f3887q = 0;
            } else {
                this.f3872b = recyclerView;
                this.f3871a = recyclerView.mChildHelper;
                this.f3887q = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f3888r = i;
            this.f3885o = 1073741824;
            this.f3886p = 1073741824;
        }

        /* renamed from: F */
        public C1347p mo4400F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C1347p ? new C1347p((C1347p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1347p((ViewGroup.MarginLayoutParams) layoutParams) : new C1347p(layoutParams);
        }

        /* renamed from: F0 */
        public boolean mo4825F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F1 */
        public boolean mo4826F1(View view, int i, int i2, C1347p pVar) {
            return view.isLayoutRequested() || !this.f3881k || !m5665w0(view.getWidth(), i, pVar.width) || !m5665w0(view.getHeight(), i2, pVar.height);
        }

        /* renamed from: G */
        public int mo4827G() {
            return -1;
        }

        /* renamed from: G0 */
        public void mo4828G0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public boolean mo4440G1() {
            return false;
        }

        /* renamed from: H */
        public int mo4829H(View view) {
            return ((C1347p) view.getLayoutParams()).f3896b.bottom;
        }

        @Deprecated
        /* renamed from: H0 */
        public void mo4830H0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H1 */
        public boolean mo4831H1(View view, int i, int i2, C1347p pVar) {
            return !this.f3881k || !m5665w0(view.getMeasuredWidth(), i, pVar.width) || !m5665w0(view.getMeasuredHeight(), i2, pVar.height);
        }

        /* renamed from: I */
        public View mo4832I(int i) {
            C1374b bVar = this.f3871a;
            if (bVar != null) {
                return bVar.mo5100f(i);
            }
            return null;
        }

        /* renamed from: I0 */
        public void mo4441I0(RecyclerView recyclerView, C1354v vVar) {
            mo4830H0(recyclerView);
        }

        /* renamed from: I1 */
        public void mo4442I1(RecyclerView recyclerView, C1322a0 a0Var, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: J */
        public int mo4833J() {
            C1374b bVar = this.f3871a;
            if (bVar != null) {
                return bVar.mo5101g();
            }
            return 0;
        }

        /* renamed from: J0 */
        public View mo4401J0(View view, int i, C1354v vVar, C1322a0 a0Var) {
            return null;
        }

        /* renamed from: J1 */
        public void mo4834J1(C1359z zVar) {
            C1359z zVar2 = this.f3877g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.mo4986h())) {
                this.f3877g.mo4996r();
            }
            this.f3877g = zVar;
            zVar.mo4995q(this.f3872b, this);
        }

        /* renamed from: K0 */
        public void mo4443K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3872b;
            mo4836L0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K1 */
        public void mo4835K1() {
            C1359z zVar = this.f3877g;
            if (zVar != null) {
                zVar.mo4996r();
            }
        }

        /* renamed from: L0 */
        public void mo4836L0(C1354v vVar, C1322a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3872b.canScrollVertically(-1) && !this.f3872b.canScrollHorizontally(-1) && !this.f3872b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C1331g gVar = this.f3872b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo4760c());
                }
            }
        }

        /* renamed from: L1 */
        public boolean mo4402L1() {
            return false;
        }

        /* renamed from: M */
        public boolean mo4837M() {
            RecyclerView recyclerView = this.f3872b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M0 */
        public void mo4838M0(C1955c cVar) {
            RecyclerView recyclerView = this.f3872b;
            mo4839N0(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        /* renamed from: N */
        public int mo4403N(C1354v vVar, C1322a0 a0Var) {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo4459k()) {
                return 1;
            }
            return this.f3872b.mAdapter.mo4760c();
        }

        /* renamed from: N0 */
        public void mo4839N0(C1354v vVar, C1322a0 a0Var, C1955c cVar) {
            if (this.f3872b.canScrollVertically(-1) || this.f3872b.canScrollHorizontally(-1)) {
                cVar.mo6577a(8192);
                cVar.mo6615v0(true);
            }
            if (this.f3872b.canScrollVertically(1) || this.f3872b.canScrollHorizontally(1)) {
                cVar.mo6577a(4096);
                cVar.mo6615v0(true);
            }
            cVar.mo6582c0(C1955c.C1957b.m8275a(mo4417k0(vVar, a0Var), mo4403N(vVar, a0Var), mo4899v0(vVar, a0Var), mo4881l0(vVar, a0Var)));
        }

        /* renamed from: O */
        public int mo4840O(View view) {
            return view.getBottom() + mo4829H(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O0 */
        public void mo4841O0(View view, C1955c cVar) {
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.mo4733v() && !this.f3871a.mo5106n(childViewHolderInt.f3838b)) {
                RecyclerView recyclerView = this.f3872b;
                mo4405P0(recyclerView.mRecycler, recyclerView.mState, view, cVar);
            }
        }

        /* renamed from: P */
        public void mo4842P(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* renamed from: P0 */
        public void mo4405P0(C1354v vVar, C1322a0 a0Var, View view, C1955c cVar) {
            cVar.mo6584d0(C1955c.C1958c.m8277b(mo4460l() ? mo4873h0(view) : 0, 1, mo4459k() ? mo4873h0(view) : 0, 1, false, false));
        }

        /* renamed from: Q */
        public int mo4843Q(View view) {
            return view.getLeft() - mo4856a0(view);
        }

        /* renamed from: Q0 */
        public View mo4844Q0(View view, int i) {
            return null;
        }

        /* renamed from: R */
        public int mo4845R(View view) {
            Rect rect = ((C1347p) view.getLayoutParams()).f3896b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: R0 */
        public void mo4406R0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: S */
        public int mo4846S(View view) {
            Rect rect = ((C1347p) view.getLayoutParams()).f3896b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: S0 */
        public void mo4407S0(RecyclerView recyclerView) {
        }

        /* renamed from: T */
        public int mo4847T(View view) {
            return view.getRight() + mo4878j0(view);
        }

        /* renamed from: T0 */
        public void mo4408T0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: U */
        public int mo4848U(View view) {
            return view.getTop() - mo4883m0(view);
        }

        /* renamed from: U0 */
        public void mo4409U0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: V */
        public View mo4849V() {
            View focusedChild;
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3871a.mo5106n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: V0 */
        public void mo4850V0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: W */
        public int mo4851W() {
            return this.f3888r;
        }

        /* renamed from: W0 */
        public void mo4410W0(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo4850V0(recyclerView, i, i2);
        }

        /* renamed from: X */
        public int mo4852X() {
            return this.f3886p;
        }

        /* renamed from: X0 */
        public void mo4412X0(C1354v vVar, C1322a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: Y */
        public int mo4853Y() {
            RecyclerView recyclerView = this.f3872b;
            C1331g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo4760c();
            }
            return 0;
        }

        /* renamed from: Y0 */
        public void mo4414Y0(C1322a0 a0Var) {
        }

        /* renamed from: Z */
        public int mo4854Z() {
            return C1988t.m8417y(this.f3872b);
        }

        /* renamed from: Z0 */
        public void mo4855Z0(C1354v vVar, C1322a0 a0Var, int i, int i2) {
            this.f3872b.defaultOnMeasure(i, i2);
        }

        /* renamed from: a0 */
        public int mo4856a0(View view) {
            return ((C1347p) view.getLayoutParams()).f3896b.left;
        }

        @Deprecated
        /* renamed from: a1 */
        public boolean mo4857a1(RecyclerView recyclerView, View view, View view2) {
            return mo4902x0() || recyclerView.isComputingLayout();
        }

        /* renamed from: b */
        public void mo4858b(View view) {
            mo4861c(view, -1);
        }

        /* renamed from: b0 */
        public int mo4859b0() {
            return C1988t.m8419z(this.f3872b);
        }

        /* renamed from: b1 */
        public boolean mo4860b1(RecyclerView recyclerView, C1322a0 a0Var, View view, View view2) {
            return mo4857a1(recyclerView, view, view2);
        }

        /* renamed from: c */
        public void mo4861c(View view, int i) {
            m5660f(view, i, true);
        }

        /* renamed from: c0 */
        public int mo4862c0() {
            return C1988t.m8333A(this.f3872b);
        }

        /* renamed from: c1 */
        public void mo4453c1(Parcelable parcelable) {
        }

        /* renamed from: d */
        public void mo4863d(View view) {
            mo4865e(view, -1);
        }

        /* renamed from: d0 */
        public int mo4864d0() {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: d1 */
        public Parcelable mo4455d1() {
            return null;
        }

        /* renamed from: e */
        public void mo4865e(View view, int i) {
            m5660f(view, i, false);
        }

        /* renamed from: e0 */
        public int mo4866e0() {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: e1 */
        public void mo4867e1(int i) {
        }

        /* renamed from: f0 */
        public int mo4868f0() {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f1 */
        public void mo4869f1(C1359z zVar) {
            if (this.f3877g == zVar) {
                this.f3877g = null;
            }
        }

        /* renamed from: g */
        public void mo4458g(String str) {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: g0 */
        public int mo4870g0() {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g1 */
        public boolean mo4871g1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3872b;
            return mo4874h1(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        /* renamed from: h */
        public void mo4872h(View view, int i) {
            mo4875i(view, i, (C1347p) view.getLayoutParams());
        }

        /* renamed from: h0 */
        public int mo4873h0(View view) {
            return ((C1347p) view.getLayoutParams()).mo4913a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: h1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4874h1(androidx.recyclerview.widget.RecyclerView.C1354v r8, androidx.recyclerview.widget.RecyclerView.C1322a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f3872b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo4851W()
                int r11 = r7.mo4870g0()
                int r8 = r8 - r11
                int r11 = r7.mo4864d0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f3872b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo4887o0()
                int r11 = r7.mo4866e0()
                int r10 = r10 - r11
                int r11 = r7.mo4868f0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo4851W()
                int r10 = r7.mo4870g0()
                int r8 = r8 - r10
                int r10 = r7.mo4864d0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f3872b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo4887o0()
                int r11 = r7.mo4866e0()
                int r10 = r10 - r11
                int r11 = r7.mo4868f0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f3872b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1342o.mo4874h1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        /* renamed from: i */
        public void mo4875i(View view, int i, C1347p pVar) {
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo4733v()) {
                this.f3872b.mViewInfoStore.mo5243b(childViewHolderInt);
            } else {
                this.f3872b.mViewInfoStore.mo5256p(childViewHolderInt);
            }
            this.f3871a.mo5097c(view, i, pVar, childViewHolderInt.mo4733v());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i1 */
        public boolean mo4876i1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3872b;
            return mo4879j1(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        /* renamed from: j */
        public void mo4877j(View view, Rect rect) {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: j0 */
        public int mo4878j0(View view) {
            return ((C1347p) view.getLayoutParams()).f3896b.right;
        }

        /* renamed from: j1 */
        public boolean mo4879j1(C1354v vVar, C1322a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: k */
        public boolean mo4459k() {
            return false;
        }

        /* renamed from: k0 */
        public int mo4417k0(C1354v vVar, C1322a0 a0Var) {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo4460l()) {
                return 1;
            }
            return this.f3872b.mAdapter.mo4760c();
        }

        /* renamed from: k1 */
        public void mo4880k1(C1354v vVar) {
            for (int J = mo4833J() - 1; J >= 0; J--) {
                if (!RecyclerView.getChildViewHolderInt(mo4832I(J)).mo4709J()) {
                    mo4886n1(J, vVar);
                }
            }
        }

        /* renamed from: l */
        public boolean mo4460l() {
            return false;
        }

        /* renamed from: l0 */
        public int mo4881l0(C1354v vVar, C1322a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l1 */
        public void mo4882l1(C1354v vVar) {
            int j = vVar.mo4956j();
            for (int i = j - 1; i >= 0; i--) {
                View n = vVar.mo4960n(i);
                C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(n);
                if (!childViewHolderInt.mo4709J()) {
                    childViewHolderInt.mo4706G(false);
                    if (childViewHolderInt.mo4735x()) {
                        this.f3872b.removeDetachedView(n, false);
                    }
                    C1336l lVar = this.f3872b.mItemAnimator;
                    if (lVar != null) {
                        lVar.mo4791j(childViewHolderInt);
                    }
                    childViewHolderInt.mo4706G(true);
                    vVar.mo4969y(n);
                }
            }
            vVar.mo4951e();
            if (j > 0) {
                this.f3872b.invalidate();
            }
        }

        /* renamed from: m */
        public boolean mo4418m(C1347p pVar) {
            return pVar != null;
        }

        /* renamed from: m0 */
        public int mo4883m0(View view) {
            return ((C1347p) view.getLayoutParams()).f3896b.top;
        }

        /* renamed from: m1 */
        public void mo4884m1(View view, C1354v vVar) {
            mo4890p1(view);
            vVar.mo4937B(view);
        }

        /* renamed from: n0 */
        public void mo4885n0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C1347p) view.getLayoutParams()).f3896b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3872b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3872b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: n1 */
        public void mo4886n1(int i, C1354v vVar) {
            View I = mo4832I(i);
            mo4892q1(i);
            vVar.mo4937B(I);
        }

        /* renamed from: o */
        public void mo4461o(int i, int i2, C1322a0 a0Var, C1345c cVar) {
        }

        /* renamed from: o0 */
        public int mo4887o0() {
            return this.f3887q;
        }

        /* renamed from: o1 */
        public boolean mo4888o1(Runnable runnable) {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: p */
        public void mo4463p(int i, C1345c cVar) {
        }

        /* renamed from: p0 */
        public int mo4889p0() {
            return this.f3885o;
        }

        /* renamed from: p1 */
        public void mo4890p1(View view) {
            this.f3871a.mo5108p(view);
        }

        /* renamed from: q */
        public int mo4465q(C1322a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q0 */
        public boolean mo4891q0() {
            int J = mo4833J();
            for (int i = 0; i < J; i++) {
                ViewGroup.LayoutParams layoutParams = mo4832I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q1 */
        public void mo4892q1(int i) {
            if (mo4832I(i) != null) {
                this.f3871a.mo5109q(i);
            }
        }

        /* renamed from: r */
        public int mo4419r(C1322a0 a0Var) {
            return 0;
        }

        /* renamed from: r0 */
        public boolean mo4893r0() {
            return this.f3879i;
        }

        /* renamed from: r1 */
        public boolean mo4894r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo4895s1(recyclerView, view, rect, z, false);
        }

        /* renamed from: s */
        public int mo4420s(C1322a0 a0Var) {
            return 0;
        }

        /* renamed from: s0 */
        public boolean mo4468s0() {
            return this.f3880j;
        }

        /* renamed from: s1 */
        public boolean mo4895s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] L = m5659L(view, rect);
            int i = L[0];
            int i2 = L[1];
            if ((z2 && !m5663t0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* renamed from: t */
        public int mo4469t(C1322a0 a0Var) {
            return 0;
        }

        /* renamed from: t1 */
        public void mo4896t1() {
            RecyclerView recyclerView = this.f3872b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: u */
        public int mo4422u(C1322a0 a0Var) {
            return 0;
        }

        /* renamed from: u0 */
        public final boolean mo4897u0() {
            return this.f3882l;
        }

        /* renamed from: u1 */
        public void mo4898u1() {
            this.f3878h = true;
        }

        /* renamed from: v */
        public int mo4424v(C1322a0 a0Var) {
            return 0;
        }

        /* renamed from: v0 */
        public boolean mo4899v0(C1354v vVar, C1322a0 a0Var) {
            return false;
        }

        /* renamed from: w */
        public void mo4900w(C1354v vVar) {
            for (int J = mo4833J() - 1; J >= 0; J--) {
                m5664v1(vVar, J, mo4832I(J));
            }
        }

        /* renamed from: w1 */
        public int mo4425w1(int i, C1354v vVar, C1322a0 a0Var) {
            return 0;
        }

        /* renamed from: x */
        public void mo4901x(int i) {
            m5666y(i, mo4832I(i));
        }

        /* renamed from: x0 */
        public boolean mo4902x0() {
            C1359z zVar = this.f3877g;
            return zVar != null && zVar.mo4986h();
        }

        /* renamed from: x1 */
        public void mo4470x1(int i) {
        }

        /* renamed from: y0 */
        public boolean mo4903y0(View view, boolean z, boolean z2) {
            boolean z3 = this.f3875e.mo5236b(view, 24579) && this.f3876f.mo5236b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: y1 */
        public int mo4426y1(int i, C1354v vVar, C1322a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo4904z(RecyclerView recyclerView) {
            this.f3879i = true;
            mo4828G0(recyclerView);
        }

        /* renamed from: z0 */
        public void mo4905z0(View view, int i, int i2, int i3, int i4) {
            C1347p pVar = (C1347p) view.getLayoutParams();
            Rect rect = pVar.f3896b;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z1 */
        public void mo4906z1(RecyclerView recyclerView) {
            mo4816A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C1347p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C1328d0 f3895a;

        /* renamed from: b */
        final Rect f3896b = new Rect();

        /* renamed from: c */
        boolean f3897c = true;

        /* renamed from: d */
        boolean f3898d = false;

        public C1347p(int i, int i2) {
            super(i, i2);
        }

        public C1347p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1347p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1347p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1347p(C1347p pVar) {
            super(pVar);
        }

        /* renamed from: a */
        public int mo4913a() {
            return this.f3895a.mo4723m();
        }

        /* renamed from: b */
        public boolean mo4914b() {
            return this.f3895a.mo4736y();
        }

        /* renamed from: c */
        public boolean mo4915c() {
            return this.f3895a.mo4733v();
        }

        /* renamed from: d */
        public boolean mo4916d() {
            return this.f3895a.mo4730t();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C1348q {
        /* renamed from: a */
        void mo4917a(View view);

        /* renamed from: b */
        void mo4918b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C1349r {
        /* renamed from: a */
        public abstract boolean mo4919a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C1350s {
        /* renamed from: a */
        void mo4920a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo4921b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo4922c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C1351t {
        /* renamed from: a */
        public void mo4923a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo4924b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C1352u {

        /* renamed from: a */
        SparseArray<C1353a> f3899a = new SparseArray<>();

        /* renamed from: b */
        private int f3900b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class C1353a {

            /* renamed from: a */
            final ArrayList<C1328d0> f3901a = new ArrayList<>();

            /* renamed from: b */
            int f3902b = 5;

            /* renamed from: c */
            long f3903c = 0;

            /* renamed from: d */
            long f3904d = 0;

            C1353a() {
            }
        }

        /* renamed from: g */
        private C1353a m5822g(int i) {
            C1353a aVar = this.f3899a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1353a aVar2 = new C1353a();
            this.f3899a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4925a() {
            this.f3900b++;
        }

        /* renamed from: b */
        public void mo4926b() {
            for (int i = 0; i < this.f3899a.size(); i++) {
                this.f3899a.valueAt(i).f3901a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4927c() {
            this.f3900b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4928d(int i, long j) {
            C1353a g = m5822g(i);
            g.f3904d = mo4933j(g.f3904d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4929e(int i, long j) {
            C1353a g = m5822g(i);
            g.f3903c = mo4933j(g.f3903c, j);
        }

        /* renamed from: f */
        public C1328d0 mo4930f(int i) {
            C1353a aVar = this.f3899a.get(i);
            if (aVar == null || aVar.f3901a.isEmpty()) {
                return null;
            }
            ArrayList<C1328d0> arrayList = aVar.f3901a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).mo4728r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4931h(C1331g gVar, C1331g gVar2, boolean z) {
            if (gVar != null) {
                mo4927c();
            }
            if (!z && this.f3900b == 0) {
                mo4926b();
            }
            if (gVar2 != null) {
                mo4925a();
            }
        }

        /* renamed from: i */
        public void mo4932i(C1328d0 d0Var) {
            int l = d0Var.mo4722l();
            ArrayList<C1328d0> arrayList = m5822g(l).f3901a;
            if (this.f3899a.get(l).f3902b > arrayList.size()) {
                d0Var.mo4703D();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public long mo4933j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4934k(int i, long j, long j2) {
            long j3 = m5822g(i).f3904d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo4935l(int i, long j, long j2) {
            long j3 = m5822g(i).f3903c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C1354v {

        /* renamed from: a */
        final ArrayList<C1328d0> f3905a;

        /* renamed from: b */
        ArrayList<C1328d0> f3906b = null;

        /* renamed from: c */
        final ArrayList<C1328d0> f3907c = new ArrayList<>();

        /* renamed from: d */
        private final List<C1328d0> f3908d;

        /* renamed from: e */
        private int f3909e;

        /* renamed from: f */
        int f3910f;

        /* renamed from: g */
        C1352u f3911g;

        /* renamed from: h */
        private C1324b0 f3912h;

        public C1354v() {
            ArrayList<C1328d0> arrayList = new ArrayList<>();
            this.f3905a = arrayList;
            this.f3908d = Collections.unmodifiableList(arrayList);
            this.f3909e = 2;
            this.f3910f = 2;
        }

        /* renamed from: H */
        private boolean m5834H(C1328d0 d0Var, int i, int i2, long j) {
            d0Var.f3855s = RecyclerView.this;
            int l = d0Var.mo4722l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != RecyclerView.FOREVER_NS && !this.f3911g.mo4934k(l, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.mo4758a(d0Var, i);
            this.f3911g.mo4928d(d0Var.mo4722l(), RecyclerView.this.getNanoTime() - nanoTime);
            m5835b(d0Var);
            if (!RecyclerView.this.mState.mo4685e()) {
                return true;
            }
            d0Var.f3844h = i2;
            return true;
        }

        /* renamed from: b */
        private void m5835b(C1328d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.f3838b;
                if (C1988t.m8413w(view) == 0) {
                    C1988t.m8414w0(view, 1);
                }
                C1405k kVar = RecyclerView.this.mAccessibilityDelegate;
                if (kVar != null) {
                    C1904a n = kVar.mo5204n();
                    if (n instanceof C1405k.C1406a) {
                        ((C1405k.C1406a) n).mo5213o(view);
                    }
                    C1988t.m8394m0(view, n);
                }
            }
        }

        /* renamed from: q */
        private void m5836q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m5836q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m5837r(C1328d0 d0Var) {
            View view = d0Var.f3838b;
            if (view instanceof ViewGroup) {
                m5836q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4936A(int i) {
            mo4948a(this.f3907c.get(i), true);
            this.f3907c.remove(i);
        }

        /* renamed from: B */
        public void mo4937B(View view) {
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo4735x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.mo4734w()) {
                childViewHolderInt.mo4710K();
            } else if (childViewHolderInt.mo4711L()) {
                childViewHolderInt.mo4716e();
            }
            mo4938C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.mo4732u()) {
                RecyclerView.this.mItemAnimator.mo4791j(childViewHolderInt);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4938C(C1328d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.mo4734w() || d0Var.f3838b.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.mo4734w());
                sb.append(" isAttached:");
                if (d0Var.f3838b.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.mo4735x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!d0Var.mo4709J()) {
                boolean h = d0Var.mo4718h();
                C1331g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && h && gVar.mo4771n(d0Var)) || d0Var.mo4732u()) {
                    if (this.f3910f <= 0 || d0Var.mo4726p(526)) {
                        z = false;
                    } else {
                        int size = this.f3907c.size();
                        if (size >= this.f3910f && size > 0) {
                            mo4936A(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.mo5167d(d0Var.f3840d)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.mo5167d(this.f3907c.get(i).f3840d)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3907c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        mo4948a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.mViewInfoStore.mo5257q(d0Var);
                        if (!z2 && !z3 && h) {
                            d0Var.f3855s = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.mViewInfoStore.mo5257q(d0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4939D(View view) {
            ArrayList<C1328d0> arrayList;
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo4726p(12) && childViewHolderInt.mo4736y() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f3906b == null) {
                    this.f3906b = new ArrayList<>();
                }
                childViewHolderInt.mo4707H(this, true);
                arrayList = this.f3906b;
            } else if (!childViewHolderInt.mo4730t() || childViewHolderInt.mo4733v() || RecyclerView.this.mAdapter.mo4764g()) {
                childViewHolderInt.mo4707H(this, false);
                arrayList = this.f3905a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
            arrayList.add(childViewHolderInt);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo4940E(C1352u uVar) {
            C1352u uVar2 = this.f3911g;
            if (uVar2 != null) {
                uVar2.mo4927c();
            }
            this.f3911g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3911g.mo4925a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo4941F(C1324b0 b0Var) {
        }

        /* renamed from: G */
        public void mo4942G(int i) {
            this.f3909e = i;
            mo4945K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x017e  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01bf  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1328d0 mo4943I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01db
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                int r1 = r1.mo4682b()
                if (r3 >= r1) goto L_0x01db
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                boolean r1 = r1.mo4685e()
                r7 = 1
                r2 = 0
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo4954h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo4959m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo4946L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo4713b(r5)
                boolean r5 = r1.mo4734w()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f3838b
                r5.removeDetachedView(r9, r8)
                r1.mo4710K()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo4711L()
                if (r5 == 0) goto L_0x0057
                r1.mo4716e()
            L_0x0057:
                r6.mo4938C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0134
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.mAdapterHelper
                int r5 = r5.mo5083m(r3)
                if (r5 < 0) goto L_0x00fc
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo4760c()
                if (r5 >= r9) goto L_0x00fc
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo4762e(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.mAdapter
                boolean r10 = r10.mo4764g()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.mAdapter
                long r10 = r1.mo4761d(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.mo4958l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f3840d = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x009e
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r6.f3912h
                if (r0 != 0) goto L_0x009d
                goto L_0x009e
            L_0x009d:
                throw r2
            L_0x009e:
                if (r1 != 0) goto L_0x00b5
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.mo4955i()
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r0.mo4930f(r9)
                if (r0 == 0) goto L_0x00b4
                r0.mo4703D()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r1 == 0) goto L_0x00b4
                r6.m5837r(r0)
            L_0x00b4:
                r1 = r0
            L_0x00b5:
                if (r1 != 0) goto L_0x0134
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00d3
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f3911g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo4935l(r11, r12, r14)
                if (r5 != 0) goto L_0x00d3
                return r2
            L_0x00d3:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.mAdapter
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.mo4759b(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r5 == 0) goto L_0x00ee
                android.view.View r5 = r2.f3838b
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r5)
                if (r5 == 0) goto L_0x00ee
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f3839c = r10
            L_0x00ee:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f3911g
                long r10 = r10 - r0
                r5.mo4929e(r9, r10)
                r9 = r2
                goto L_0x0135
            L_0x00fc:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.mo4682b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0134:
                r9 = r1
            L_0x0135:
                r10 = r4
                if (r10 == 0) goto L_0x016e
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.mo4685e()
                if (r0 != 0) goto L_0x016e
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.mo4726p(r0)
                if (r1 == 0) goto L_0x016e
                r9.mo4705F(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.f3821k
                if (r0 == 0) goto L_0x016e
                int r0 = androidx.recyclerview.widget.RecyclerView.C1336l.m5625e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                java.util.List r4 = r9.mo4725o()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.mo4801t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r9, r0)
            L_0x016e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.mo4685e()
                if (r0 == 0) goto L_0x0181
                boolean r0 = r9.mo4729s()
                if (r0 == 0) goto L_0x0181
                r9.f3844h = r3
                goto L_0x0194
            L_0x0181:
                boolean r0 = r9.mo4729s()
                if (r0 == 0) goto L_0x0196
                boolean r0 = r9.mo4737z()
                if (r0 != 0) goto L_0x0196
                boolean r0 = r9.mo4730t()
                if (r0 == 0) goto L_0x0194
                goto L_0x0196
            L_0x0194:
                r0 = 0
                goto L_0x01a9
            L_0x0196:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                int r2 = r0.mo5083m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m5834H(r1, r2, r3, r4)
            L_0x01a9:
                android.view.View r1 = r9.f3838b
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01bf
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x01b7:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C1347p) r1
                android.view.View r2 = r9.f3838b
                r2.setLayoutParams(r1)
                goto L_0x01d0
            L_0x01bf:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01ce
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x01b7
            L_0x01ce:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C1347p) r1
            L_0x01d0:
                r1.f3895a = r9
                if (r10 == 0) goto L_0x01d7
                if (r0 == 0) goto L_0x01d7
                goto L_0x01d8
            L_0x01d7:
                r7 = 0
            L_0x01d8:
                r1.f3898d = r7
                return r9
            L_0x01db:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.mo4682b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1354v.mo4943I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo4944J(C1328d0 d0Var) {
            (d0Var.f3852p ? this.f3906b : this.f3905a).remove(d0Var);
            d0Var.f3851o = null;
            d0Var.f3852p = false;
            d0Var.mo4716e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo4945K() {
            C1342o oVar = RecyclerView.this.mLayout;
            this.f3910f = this.f3909e + (oVar != null ? oVar.f3883m : 0);
            for (int size = this.f3907c.size() - 1; size >= 0 && this.f3907c.size() > this.f3910f; size--) {
                mo4936A(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo4946L(C1328d0 d0Var) {
            if (d0Var.mo4733v()) {
                return RecyclerView.this.mState.mo4685e();
            }
            int i = d0Var.f3840d;
            if (i < 0 || i >= RecyclerView.this.mAdapter.mo4760c()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.exceptionLabel());
            } else if (RecyclerView.this.mState.mo4685e() || RecyclerView.this.mAdapter.mo4762e(d0Var.f3840d) == d0Var.mo4722l()) {
                return !RecyclerView.this.mAdapter.mo4764g() || d0Var.mo4721k() == RecyclerView.this.mAdapter.mo4761d(d0Var.f3840d);
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public void mo4947M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f3907c.size() - 1; size >= 0; size--) {
                C1328d0 d0Var = this.f3907c.get(size);
                if (d0Var != null && (i3 = d0Var.f3840d) >= i && i3 < i4) {
                    d0Var.mo4713b(2);
                    mo4936A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4948a(C1328d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.f3838b;
            C1405k kVar = RecyclerView.this.mAccessibilityDelegate;
            if (kVar != null) {
                C1904a n = kVar.mo5204n();
                C1988t.m8394m0(view, n instanceof C1405k.C1406a ? ((C1405k.C1406a) n).mo5212n(view) : null);
            }
            if (z) {
                mo4953g(d0Var);
            }
            d0Var.f3855s = null;
            mo4955i().mo4932i(d0Var);
        }

        /* renamed from: c */
        public void mo4949c() {
            this.f3905a.clear();
            mo4970z();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4950d() {
            int size = this.f3907c.size();
            for (int i = 0; i < size; i++) {
                this.f3907c.get(i).mo4714c();
            }
            int size2 = this.f3905a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3905a.get(i2).mo4714c();
            }
            ArrayList<C1328d0> arrayList = this.f3906b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3906b.get(i3).mo4714c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4951e() {
            this.f3905a.clear();
            ArrayList<C1328d0> arrayList = this.f3906b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int mo4952f(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.mo4682b()) {
                return !RecyclerView.this.mState.mo4685e() ? i : RecyclerView.this.mAdapterHelper.mo5083m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.mo4682b() + RecyclerView.this.exceptionLabel());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4953g(C1328d0 d0Var) {
            C1355w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.mo4971a(d0Var);
            }
            C1331g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.mo4774q(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.mo5257q(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1328d0 mo4954h(int i) {
            int size;
            int m;
            ArrayList<C1328d0> arrayList = this.f3906b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C1328d0 d0Var = this.f3906b.get(i3);
                    if (d0Var.mo4711L() || d0Var.mo4723m() != i) {
                        i3++;
                    } else {
                        d0Var.mo4713b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.mo4764g() && (m = RecyclerView.this.mAdapterHelper.mo5083m(i)) > 0 && m < RecyclerView.this.mAdapter.mo4760c()) {
                    long d = RecyclerView.this.mAdapter.mo4761d(m);
                    while (i2 < size) {
                        C1328d0 d0Var2 = this.f3906b.get(i2);
                        if (d0Var2.mo4711L() || d0Var2.mo4721k() != d) {
                            i2++;
                        } else {
                            d0Var2.mo4713b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1352u mo4955i() {
            if (this.f3911g == null) {
                this.f3911g = new C1352u();
            }
            return this.f3911g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo4956j() {
            return this.f3905a.size();
        }

        /* renamed from: k */
        public List<C1328d0> mo4957k() {
            return this.f3908d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C1328d0 mo4958l(long j, int i, boolean z) {
            for (int size = this.f3905a.size() - 1; size >= 0; size--) {
                C1328d0 d0Var = this.f3905a.get(size);
                if (d0Var.mo4721k() == j && !d0Var.mo4711L()) {
                    if (i == d0Var.mo4722l()) {
                        d0Var.mo4713b(32);
                        if (d0Var.mo4733v() && !RecyclerView.this.mState.mo4685e()) {
                            d0Var.mo4705F(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f3905a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f3838b, false);
                        mo4969y(d0Var.f3838b);
                    }
                }
            }
            int size2 = this.f3907c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1328d0 d0Var2 = this.f3907c.get(size2);
                if (d0Var2.mo4721k() == j && !d0Var2.mo4728r()) {
                    if (i == d0Var2.mo4722l()) {
                        if (!z) {
                            this.f3907c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        mo4936A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C1328d0 mo4959m(int i, boolean z) {
            View e;
            int size = this.f3905a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1328d0 d0Var = this.f3905a.get(i3);
                if (d0Var.mo4711L() || d0Var.mo4723m() != i || d0Var.mo4730t() || (!RecyclerView.this.mState.f3818h && d0Var.mo4733v())) {
                    i3++;
                } else {
                    d0Var.mo4713b(32);
                    return d0Var;
                }
            }
            if (z || (e = RecyclerView.this.mChildHelper.mo5099e(i)) == null) {
                int size2 = this.f3907c.size();
                while (i2 < size2) {
                    C1328d0 d0Var2 = this.f3907c.get(i2);
                    if (d0Var2.mo4730t() || d0Var2.mo4723m() != i || d0Var2.mo4728r()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f3907c.remove(i2);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e);
            RecyclerView.this.mChildHelper.mo5111s(e);
            int m = RecyclerView.this.mChildHelper.mo5105m(e);
            if (m != -1) {
                RecyclerView.this.mChildHelper.mo5098d(m);
                mo4939D(e);
                childViewHolderInt.mo4713b(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public View mo4960n(int i) {
            return this.f3905a.get(i).f3838b;
        }

        /* renamed from: o */
        public View mo4961o(int i) {
            return mo4962p(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public View mo4962p(int i, boolean z) {
            return mo4943I(i, z, RecyclerView.FOREVER_NS).f3838b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo4963s() {
            int size = this.f3907c.size();
            for (int i = 0; i < size; i++) {
                C1347p pVar = (C1347p) this.f3907c.get(i).f3838b.getLayoutParams();
                if (pVar != null) {
                    pVar.f3897c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4964t() {
            int size = this.f3907c.size();
            for (int i = 0; i < size; i++) {
                C1328d0 d0Var = this.f3907c.get(i);
                if (d0Var != null) {
                    d0Var.mo4713b(6);
                    d0Var.mo4712a((Object) null);
                }
            }
            C1331g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.mo4764g()) {
                mo4970z();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4965u(int i, int i2) {
            int size = this.f3907c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1328d0 d0Var = this.f3907c.get(i3);
                if (d0Var != null && d0Var.f3840d >= i) {
                    d0Var.mo4700A(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4966v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f3907c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1328d0 d0Var = this.f3907c.get(i7);
                if (d0Var != null && (i6 = d0Var.f3840d) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        d0Var.mo4700A(i2 - i, false);
                    } else {
                        d0Var.mo4700A(i5, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo4967w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3907c.size() - 1; size >= 0; size--) {
                C1328d0 d0Var = this.f3907c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f3840d;
                    if (i4 >= i3) {
                        d0Var.mo4700A(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.mo4713b(8);
                        mo4936A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo4968x(C1331g gVar, C1331g gVar2, boolean z) {
            mo4949c();
            mo4955i().mo4931h(gVar, gVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo4969y(View view) {
            C1328d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.f3851o = null;
            childViewHolderInt.f3852p = false;
            childViewHolderInt.mo4716e();
            mo4938C(childViewHolderInt);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo4970z() {
            for (int size = this.f3907c.size() - 1; size >= 0; size--) {
                mo4936A(size);
            }
            this.f3907c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.mo5165b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C1355w {
        /* renamed from: a */
        void mo4971a(C1328d0 d0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C1356x extends C1333i {
        C1356x() {
        }

        /* renamed from: a */
        public void mo4780a() {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f3817g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.mo5086p()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C1357y extends C2019a {
        public static final Parcelable.Creator<C1357y> CREATOR = new C1358a();

        /* renamed from: p */
        Parcelable f3915p;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        static class C1358a implements Parcelable.ClassLoaderCreator<C1357y> {
            C1358a() {
            }

            /* renamed from: a */
            public C1357y createFromParcel(Parcel parcel) {
                return new C1357y(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C1357y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1357y(parcel, classLoader);
            }

            /* renamed from: c */
            public C1357y[] newArray(int i) {
                return new C1357y[i];
            }
        }

        C1357y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3915p = parcel.readParcelable(classLoader == null ? C1342o.class.getClassLoader() : classLoader);
        }

        C1357y(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4972b(C1357y yVar) {
            this.f3915p = yVar.f3915p;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3915p, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C1359z {

        /* renamed from: a */
        private int f3916a = -1;

        /* renamed from: b */
        private RecyclerView f3917b;

        /* renamed from: c */
        private C1342o f3918c;

        /* renamed from: d */
        private boolean f3919d;

        /* renamed from: e */
        private boolean f3920e;

        /* renamed from: f */
        private View f3921f;

        /* renamed from: g */
        private final C1360a f3922g = new C1360a(0, 0);

        /* renamed from: h */
        private boolean f3923h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C1360a {

            /* renamed from: a */
            private int f3924a;

            /* renamed from: b */
            private int f3925b;

            /* renamed from: c */
            private int f3926c;

            /* renamed from: d */
            private int f3927d;

            /* renamed from: e */
            private Interpolator f3928e;

            /* renamed from: f */
            private boolean f3929f;

            /* renamed from: g */
            private int f3930g;

            public C1360a(int i, int i2) {
                this(i, i2, RecyclerView.UNDEFINED_DURATION, (Interpolator) null);
            }

            public C1360a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3927d = -1;
                this.f3929f = false;
                this.f3930g = 0;
                this.f3924a = i;
                this.f3925b = i2;
                this.f3926c = i3;
                this.f3928e = interpolator;
            }

            /* renamed from: e */
            private void m5897e() {
                if (this.f3928e != null && this.f3926c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3926c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo4997a() {
                return this.f3927d >= 0;
            }

            /* renamed from: b */
            public void mo4998b(int i) {
                this.f3927d = i;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo4999c(RecyclerView recyclerView) {
                int i = this.f3927d;
                if (i >= 0) {
                    this.f3927d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f3929f = false;
                } else if (this.f3929f) {
                    m5897e();
                    recyclerView.mViewFlinger.mo4693f(this.f3924a, this.f3925b, this.f3926c, this.f3928e);
                    int i2 = this.f3930g + 1;
                    this.f3930g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3929f = false;
                } else {
                    this.f3930g = 0;
                }
            }

            /* renamed from: d */
            public void mo5000d(int i, int i2, int i3, Interpolator interpolator) {
                this.f3924a = i;
                this.f3925b = i2;
                this.f3926c = i3;
                this.f3928e = interpolator;
                this.f3929f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface C1361b {
            /* renamed from: a */
            PointF mo4452a(int i);
        }

        /* renamed from: a */
        public PointF mo4979a(int i) {
            C1342o e = mo4983e();
            if (e instanceof C1361b) {
                return ((C1361b) e).mo4452a(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C1361b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View mo4980b(int i) {
            return this.f3917b.mLayout.mo4437C(i);
        }

        /* renamed from: c */
        public int mo4981c() {
            return this.f3917b.mLayout.mo4833J();
        }

        /* renamed from: d */
        public int mo4982d(View view) {
            return this.f3917b.getChildLayoutPosition(view);
        }

        /* renamed from: e */
        public C1342o mo4983e() {
            return this.f3918c;
        }

        /* renamed from: f */
        public int mo4984f() {
            return this.f3916a;
        }

        /* renamed from: g */
        public boolean mo4985g() {
            return this.f3919d;
        }

        /* renamed from: h */
        public boolean mo4986h() {
            return this.f3920e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo4987i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4988j(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f3917b;
            if (this.f3916a == -1 || recyclerView == null) {
                mo4996r();
            }
            if (this.f3919d && this.f3921f == null && this.f3918c != null && (a = mo4979a(this.f3916a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            this.f3919d = false;
            View view = this.f3921f;
            if (view != null) {
                if (mo4982d(view) == this.f3916a) {
                    mo4993o(this.f3921f, recyclerView.mState, this.f3922g);
                    this.f3922g.mo4999c(recyclerView);
                    mo4996r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f3921f = null;
                }
            }
            if (this.f3920e) {
                mo4990l(i, i2, recyclerView.mState, this.f3922g);
                boolean a2 = this.f3922g.mo4997a();
                this.f3922g.mo4999c(recyclerView);
                if (a2 && this.f3920e) {
                    this.f3919d = true;
                    recyclerView.mViewFlinger.mo4692e();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo4989k(View view) {
            if (mo4982d(view) == mo4984f()) {
                this.f3921f = view;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract void mo4990l(int i, int i2, C1322a0 a0Var, C1360a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo4991m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo4992n();

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public abstract void mo4993o(View view, C1322a0 a0Var, C1360a aVar);

        /* renamed from: p */
        public void mo4994p(int i) {
            this.f3916a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo4995q(RecyclerView recyclerView, C1342o oVar) {
            recyclerView.mViewFlinger.mo4694g();
            if (this.f3923h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3917b = recyclerView;
            this.f3918c = oVar;
            int i = this.f3916a;
            if (i != -1) {
                recyclerView.mState.f3811a = i;
                this.f3920e = true;
                this.f3919d = true;
                this.f3921f = mo4980b(mo4984f());
                mo4991m();
                this.f3917b.mViewFlinger.mo4692e();
                this.f3923h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo4996r() {
            if (this.f3920e) {
                this.f3920e = false;
                mo4992n();
                this.f3917b.mState.f3811a = -1;
                this.f3921f = null;
                this.f3916a = -1;
                this.f3919d = false;
                this.f3918c.mo4869f1(this);
                this.f3918c = null;
                this.f3917b = null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            NESTED_SCROLLING_ATTRS = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x001c
            r2 = 19
            if (r1 == r2) goto L_0x001c
            r2 = 20
            if (r1 != r2) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = 0
            goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            FORCE_INVALIDATE_DISPLAY_LIST = r2
            r2 = 23
            if (r1 < r2) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r2
            r2 = 16
            if (r1 < r2) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            POST_UPDATES_ON_ANIMATION = r2
            r2 = 21
            if (r1 < r2) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            ALLOW_THREAD_GAP_WORK = r2
            r2 = 15
            if (r1 > r2) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            FORCE_ABS_FOCUS_SEARCH_DIRECTION = r4
            if (r1 > r2) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            IGNORE_DETACHED_FOCUSED_CHILD = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            sQuinticInterpolator = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2089a.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.mObserver = new C1356x();
        this.mRecycler = new C1354v();
        this.mViewInfoStore = new C1415p();
        this.mUpdateChildViewsRunnable = new C1321a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C1335k();
        this.mItemAnimator = new C1377c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C1326c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C1393e.C1395b() : null;
        this.mState = new C1322a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C1340m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new C1323b();
        this.mViewInfoProcessCallback = new C1327d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C2002u.m8470b(viewConfiguration, context2);
        this.mScaledVerticalScrollFactor = C2002u.m8472d(viewConfiguration, context2);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.mo4803v(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C1988t.m8413w(this) == 0) {
            C1988t.m8414w0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1405k(this));
        int[] iArr = C2091c.f6086f;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C2091c.f6095o);
        if (obtainStyledAttributes.getInt(C2091c.f6089i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(C2091c.f6088h, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C2091c.f6090j, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(C2091c.f6093m), obtainStyledAttributes.getDrawable(C2091c.f6094n), (StateListDrawable) obtainStyledAttributes.getDrawable(C2091c.f6091k), obtainStyledAttributes.getDrawable(C2091c.f6092l));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        if (i3 >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    private void addAnimatingView(C1328d0 d0Var) {
        View view = d0Var.f3838b;
        boolean z = view.getParent() == this;
        this.mRecycler.mo4944J(getChildViewHolder(view));
        if (d0Var.mo4735x()) {
            this.mChildHelper.mo5097c(view, -1, view.getLayoutParams(), true);
            return;
        }
        C1374b bVar = this.mChildHelper;
        if (!z) {
            bVar.mo5096b(view, true);
        } else {
            bVar.mo5104k(view);
        }
    }

    private void animateChange(C1328d0 d0Var, C1328d0 d0Var2, C1336l.C1339c cVar, C1336l.C1339c cVar2, boolean z, boolean z2) {
        d0Var.mo4706G(false);
        if (z) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                addAnimatingView(d0Var2);
            }
            d0Var.f3845i = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.mo4944J(d0Var);
            d0Var2.mo4706G(false);
            d0Var2.f3846j = d0Var;
        }
        if (this.mItemAnimator.mo4784b(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(C1328d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f3839c;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        d0Var.f3839c = null;
                        return;
                    } else if (view != d0Var.f3838b) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C1342o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C1342o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C1954b.m8186b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.mo4681a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f3820j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.mo5247f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C1322a0 a0Var = this.mState;
        if (!a0Var.f3821k || !this.mItemsChanged) {
            z = false;
        }
        a0Var.f3819i = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0Var.f3818h = a0Var.f3822l;
        a0Var.f3816f = this.mAdapter.mo4760c();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f3821k) {
            int g = this.mChildHelper.mo5101g();
            for (int i = 0; i < g; i++) {
                C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5100f(i));
                if (!childViewHolderInt.mo4709J() && (!childViewHolderInt.mo4730t() || this.mAdapter.mo4764g())) {
                    this.mViewInfoStore.mo5246e(childViewHolderInt, this.mItemAnimator.mo4801t(this.mState, childViewHolderInt, C1336l.m5625e(childViewHolderInt), childViewHolderInt.mo4725o()));
                    if (this.mState.f3819i && childViewHolderInt.mo4736y() && !childViewHolderInt.mo4733v() && !childViewHolderInt.mo4709J() && !childViewHolderInt.mo4730t()) {
                        this.mViewInfoStore.mo5244c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f3822l) {
            saveOldPositions();
            C1322a0 a0Var2 = this.mState;
            boolean z2 = a0Var2.f3817g;
            a0Var2.f3817g = false;
            this.mLayout.mo4412X0(this.mRecycler, a0Var2);
            this.mState.f3817g = z2;
            for (int i2 = 0; i2 < this.mChildHelper.mo5101g(); i2++) {
                C1328d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo5100f(i2));
                if (!childViewHolderInt2.mo4709J() && !this.mViewInfoStore.mo5250i(childViewHolderInt2)) {
                    int e = C1336l.m5625e(childViewHolderInt2);
                    boolean p = childViewHolderInt2.mo4726p(8192);
                    if (!p) {
                        e |= 4096;
                    }
                    C1336l.C1339c t = this.mItemAnimator.mo4801t(this.mState, childViewHolderInt2, e, childViewHolderInt2.mo4725o());
                    if (p) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, t);
                    } else {
                        this.mViewInfoStore.mo5242a(childViewHolderInt2, t);
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f3815e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo4681a(6);
        this.mAdapterHelper.mo5081j();
        this.mState.f3816f = this.mAdapter.mo4760c();
        C1322a0 a0Var = this.mState;
        a0Var.f3814d = 0;
        a0Var.f3818h = false;
        this.mLayout.mo4412X0(this.mRecycler, a0Var);
        C1322a0 a0Var2 = this.mState;
        a0Var2.f3817g = false;
        this.mPendingSavedState = null;
        a0Var2.f3821k = a0Var2.f3821k && this.mItemAnimator != null;
        a0Var2.f3815e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.mo4681a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C1322a0 a0Var = this.mState;
        a0Var.f3815e = 1;
        if (a0Var.f3821k) {
            for (int g = this.mChildHelper.mo5101g() - 1; g >= 0; g--) {
                C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5100f(g));
                if (!childViewHolderInt.mo4709J()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    C1336l.C1339c s = this.mItemAnimator.mo4800s(this.mState, childViewHolderInt);
                    C1328d0 g2 = this.mViewInfoStore.mo5248g(changedHolderKey);
                    if (g2 != null && !g2.mo4709J()) {
                        boolean h = this.mViewInfoStore.mo5249h(g2);
                        boolean h2 = this.mViewInfoStore.mo5249h(childViewHolderInt);
                        if (!h || g2 != childViewHolderInt) {
                            C1336l.C1339c n = this.mViewInfoStore.mo5254n(g2);
                            this.mViewInfoStore.mo5245d(childViewHolderInt, s);
                            C1336l.C1339c m = this.mViewInfoStore.mo5253m(childViewHolderInt);
                            if (n == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g2);
                            } else {
                                animateChange(g2, childViewHolderInt, n, m, h, h2);
                            }
                        }
                    }
                    this.mViewInfoStore.mo5245d(childViewHolderInt, s);
                }
            }
            this.mViewInfoStore.mo5255o(this.mViewInfoProcessCallback);
        }
        this.mLayout.mo4882l1(this.mRecycler);
        C1322a0 a0Var2 = this.mState;
        a0Var2.f3813c = a0Var2.f3816f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.f3821k = false;
        a0Var2.f3822l = false;
        this.mLayout.f3878h = false;
        ArrayList<C1328d0> arrayList = this.mRecycler.f3906b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C1342o oVar = this.mLayout;
        if (oVar.f3884n) {
            oVar.f3883m = 0;
            oVar.f3884n = false;
            this.mRecycler.mo4945K();
        }
        this.mLayout.mo4414Y0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.mo5247f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        C1350s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.mo4920a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            C1350s sVar = this.mOnItemTouchListeners.get(i);
            if (!sVar.mo4921b(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g = this.mChildHelper.mo5101g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        int i2 = UNDEFINED_DURATION;
        for (int i3 = 0; i3 < g; i3++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5100f(i3));
            if (!childViewHolderInt.mo4709J()) {
                int m = childViewHolderInt.mo4723m();
                if (m < i) {
                    i = m;
                }
                if (m > i2) {
                    i2 = m;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        C1328d0 findViewHolderForAdapterPosition;
        C1322a0 a0Var = this.mState;
        int i = a0Var.f3823m;
        if (i == -1) {
            i = 0;
        }
        int b = a0Var.mo4682b();
        int i2 = i;
        while (i2 < b) {
            C1328d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.f3838b.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f3838b;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.f3838b.hasFocusable()) {
                return findViewHolderForAdapterPosition.f3838b;
            }
        }
    }

    static C1328d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C1347p) view.getLayoutParams()).f3895a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C1347p pVar = (C1347p) view.getLayoutParams();
        Rect rect2 = pVar.f3896b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private C1979k getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C1979k(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, C1328d0 d0Var, C1328d0 d0Var2) {
        int g = this.mChildHelper.mo5101g();
        for (int i = 0; i < g; i++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5100f(i));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j) {
                C1331g gVar = this.mAdapter;
                if (gVar == null || !gVar.mo4764g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g = this.mChildHelper.mo5101g();
        for (int i = 0; i < g; i++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5100f(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo4709J() && childViewHolderInt.mo4736y()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C1988t.m8415x(this) == 0) {
            C1988t.m8416x0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1374b(new C1329e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i3 = this.mLayout.mo4854Z() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo4402L1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.mo5090u();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo4407S0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo5088s();
        } else {
            this.mAdapterHelper.mo5081j();
        }
        boolean z2 = false;
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f3821k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.f3878h) && (!z || this.mAdapter.mo4764g());
        C1322a0 a0Var = this.mState;
        if (a0Var.f3821k && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        a0Var.f3822l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            androidx.core.widget.C1189d.m4681a(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C1189d.m4681a(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C1189d.m4681a(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            p027c.p064i.p072j.C1988t.m8376d0(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.mo5106n(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.mo5101g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C1328d0 findViewHolderForItemId = (this.mState.f3824n == -1 || !this.mAdapter.mo4764g()) ? null : findViewHolderForItemId(this.mState.f3824n);
                if (findViewHolderForItemId != null && !this.mChildHelper.mo5106n(findViewHolderForItemId.f3838b) && findViewHolderForItemId.f3838b.hasFocusable()) {
                    view = findViewHolderForItemId.f3838b;
                } else if (this.mChildHelper.mo5101g() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i = this.mState.f3825o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C1988t.m8376d0(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1347p) {
            C1347p pVar = (C1347p) layoutParams;
            if (!pVar.f3897c) {
                Rect rect = pVar.f3896b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.mo4895s1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C1322a0 a0Var = this.mState;
        a0Var.f3824n = -1;
        a0Var.f3823m = -1;
        a0Var.f3825o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        C1328d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f3824n = this.mAdapter.mo4764g() ? d0Var.mo4721k() : -1;
        this.mState.f3823m = this.mDataSetHasChangedAfterLayout ? -1 : d0Var.mo4733v() ? d0Var.f3841e : d0Var.mo4720j();
        this.mState.f3825o = getDeepestFocusedViewWithId(d0Var.f3838b);
    }

    private void setAdapterInternal(C1331g gVar, boolean z, boolean z2) {
        C1331g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.mo4777t(this.mObserver);
            this.mAdapter.mo4770m(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.mo5090u();
        C1331g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.mo4775r(this.mObserver);
            gVar.mo4766i(this);
        }
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4823E0(gVar3, this.mAdapter);
        }
        this.mRecycler.mo4968x(gVar3, this.mAdapter, z);
        this.mState.f3817g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.mo4694g();
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4835K1();
        }
    }

    /* access modifiers changed from: package-private */
    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C1988t.m8376d0(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1342o oVar = this.mLayout;
        if (oVar == null || !oVar.mo4825F0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(C1341n nVar) {
        addItemDecoration(nVar, -1);
    }

    public void addItemDecoration(C1341n nVar, int i) {
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4458g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(C1348q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(C1350s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(C1351t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    /* access modifiers changed from: package-private */
    public void animateAppearance(C1328d0 d0Var, C1336l.C1339c cVar, C1336l.C1339c cVar2) {
        d0Var.mo4706G(false);
        if (this.mItemAnimator.mo4783a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void animateDisappearance(C1328d0 d0Var, C1336l.C1339c cVar, C1336l.C1339c cVar2) {
        addAnimatingView(d0Var);
        d0Var.mo4706G(false);
        if (this.mItemAnimator.mo4785c(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    /* access modifiers changed from: package-private */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(HttpUrl.FRAGMENT_ENCODE_SET + exceptionLabel()));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canReuseUpdatedViewHolder(C1328d0 d0Var) {
        C1336l lVar = this.mItemAnimator;
        return lVar == null || lVar.mo4788g(d0Var, d0Var.mo4725o());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1347p) && this.mLayout.mo4418m((C1347p) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void clearOldPositions() {
        int j = this.mChildHelper.mo5103j();
        for (int i = 0; i < j; i++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5102i(i));
            if (!childViewHolderInt.mo4709J()) {
                childViewHolderInt.mo4714c();
            }
        }
        this.mRecycler.mo4950d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<C1348q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<C1351t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        C1342o oVar = this.mLayout;
        if (oVar != null && oVar.mo4459k()) {
            return this.mLayout.mo4465q(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C1342o oVar = this.mLayout;
        if (oVar != null && oVar.mo4459k()) {
            return this.mLayout.mo4419r(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C1342o oVar = this.mLayout;
        if (oVar != null && oVar.mo4459k()) {
            return this.mLayout.mo4420s(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C1342o oVar = this.mLayout;
        if (oVar != null && oVar.mo4460l()) {
            return this.mLayout.mo4469t(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C1342o oVar = this.mLayout;
        if (oVar != null && oVar.mo4460l()) {
            return this.mLayout.mo4422u(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C1342o oVar = this.mLayout;
        if (oVar != null && oVar.mo4460l()) {
            return this.mLayout.mo4424v(this.mState);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C1988t.m8376d0(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C1864m.m7881a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C1864m.m7882b();
        } else if (this.mAdapterHelper.mo5086p()) {
            if (this.mAdapterHelper.mo5085o(4) && !this.mAdapterHelper.mo5085o(11)) {
                C1864m.m7881a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.mo5088s();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.mo5080i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
            } else if (this.mAdapterHelper.mo5086p()) {
                C1864m.m7881a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
            } else {
                return;
            }
            C1864m.m7882b();
        }
    }

    /* access modifiers changed from: package-private */
    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(C1342o.m5662n(i, getPaddingLeft() + getPaddingRight(), C1988t.m8333A(this)), C1342o.m5662n(i2, getPaddingTop() + getPaddingBottom(), C1988t.m8419z(this)));
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildAttached(View view) {
        C1328d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        C1331g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo4772o(childViewHolderInt);
        }
        List<C1348q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo4918b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildDetached(View view) {
        C1328d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        C1331g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo4773p(childViewHolderInt);
        }
        List<C1348q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo4917a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchLayout() {
        String str;
        if (this.mAdapter == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.mLayout == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            C1322a0 a0Var = this.mState;
            a0Var.f3820j = false;
            if (a0Var.f3815e == 1) {
                dispatchLayoutStep1();
            } else if (!this.mAdapterHelper.mo5087q() && this.mLayout.mo4887o0() == getWidth() && this.mLayout.mo4851W() == getHeight()) {
                this.mLayout.mo4906z1(this);
                dispatchLayoutStep3();
                return;
            }
            this.mLayout.mo4906z1(this);
            dispatchLayoutStep2();
            dispatchLayoutStep3();
            return;
        }
        Log.e(TAG, str);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo6642a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo6643b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo6644c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo6645d(i, i2, iArr, iArr2, i3);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo6646e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo6647f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo6648g(i, i2, i3, i4, iArr, i5);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrollStateChanged(int i) {
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4867e1(i);
        }
        onScrollStateChanged(i);
        C1351t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo4923a(this, i);
        }
        List<C1351t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo4923a(this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        C1351t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo4924b(this, i, i2);
        }
        List<C1351t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo4924b(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: package-private */
    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C1328d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.f3838b.getParent() == this && !d0Var.mo4709J() && (i = d0Var.f3854r) != -1) {
                C1988t.m8414w0(d0Var.f3838b, i);
                d0Var.f3854r = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        float f;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).mo4813i(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo4797p()) {
            z3 = z;
        }
        if (z3) {
            C1988t.m8376d0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    public void ensureBottomGlow() {
        int i;
        int i2;
        if (this.mBottomGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo4782a(this, 3);
            this.mBottomGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureLeftGlow() {
        int i;
        int i2;
        if (this.mLeftGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo4782a(this, 0);
            this.mLeftGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureRightGlow() {
        int i;
        int i2;
        if (this.mRightGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo4782a(this, 2);
            this.mRightGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureTopGlow() {
        int i;
        int i2;
        if (this.mTopGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo4782a(this, 1);
            this.mTopGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: package-private */
    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(C1322a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f3831p;
            a0Var.f3826p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f3827q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f3826p = 0;
        a0Var.f3827q = 0;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int g = this.mChildHelper.mo5101g() - 1; g >= 0; g--) {
            View f3 = this.mChildHelper.mo5100f(g);
            float translationX = f3.getTranslationX();
            float translationY = f3.getTranslationY();
            if (f >= ((float) f3.getLeft()) + translationX && f <= ((float) f3.getRight()) + translationX && f2 >= ((float) f3.getTop()) + translationY && f2 <= ((float) f3.getBottom()) + translationY) {
                return f3;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public C1328d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public C1328d0 findViewHolderForAdapterPosition(int i) {
        C1328d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j = this.mChildHelper.mo5103j();
        for (int i2 = 0; i2 < j; i2++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5102i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo4733v() && getAdapterPositionFor(childViewHolderInt) == i) {
                if (!this.mChildHelper.mo5106n(childViewHolderInt.f3838b)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public C1328d0 findViewHolderForItemId(long j) {
        C1331g gVar = this.mAdapter;
        C1328d0 d0Var = null;
        if (gVar != null && gVar.mo4764g()) {
            int j2 = this.mChildHelper.mo5103j();
            for (int i = 0; i < j2; i++) {
                C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5102i(i));
                if (childViewHolderInt != null && !childViewHolderInt.mo4733v() && childViewHolderInt.mo4721k() == j) {
                    if (!this.mChildHelper.mo5106n(childViewHolderInt.f3838b)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public C1328d0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public C1328d0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* access modifiers changed from: package-private */
    public C1328d0 findViewHolderForPosition(int i, boolean z) {
        int j = this.mChildHelper.mo5103j();
        C1328d0 d0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5102i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo4733v()) {
                if (z) {
                    if (childViewHolderInt.f3840d != i) {
                        continue;
                    }
                } else if (childViewHolderInt.mo4723m() != i) {
                    continue;
                }
                if (!this.mChildHelper.mo5106n(childViewHolderInt.f3838b)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public boolean fling(int i, int i2) {
        C1342o oVar = this.mLayout;
        int i3 = 0;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean k = oVar.mo4459k();
            boolean l = this.mLayout.mo4460l();
            if (!k || Math.abs(i) < this.mMinFlingVelocity) {
                i = 0;
            }
            if (!l || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = k || l;
                dispatchNestedFling(f, f2, z);
                C1349r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.mo4919a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (k) {
                        i3 = 1;
                    }
                    if (l) {
                        i3 |= 2;
                    }
                    startNestedScroll(i3, 1);
                    int i4 = this.mMaxFlingVelocity;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.mMaxFlingVelocity;
                    this.mViewFlinger.mo4691c(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View Q0 = this.mLayout.mo4844Q0(view, i);
        if (Q0 != null) {
            return Q0;
        }
        boolean z2 = true;
        boolean z3 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo4401J0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.mo4460l()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.mo4459k()) {
                int i3 = (this.mLayout.mo4854Z() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo4401J0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(view2, (View) null);
        return view;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo4397D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo4398E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo4400F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C1331g getAdapter() {
        return this.mAdapter;
    }

    /* access modifiers changed from: package-private */
    public int getAdapterPositionFor(C1328d0 d0Var) {
        if (d0Var.mo4726p(524) || !d0Var.mo4729s()) {
            return -1;
        }
        return this.mAdapterHelper.mo5079e(d0Var.f3840d);
    }

    public int getBaseline() {
        C1342o oVar = this.mLayout;
        return oVar != null ? oVar.mo4827G() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public long getChangedHolderKey(C1328d0 d0Var) {
        return this.mAdapter.mo4764g() ? d0Var.mo4721k() : (long) d0Var.f3840d;
    }

    public int getChildAdapterPosition(View view) {
        C1328d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo4720j();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C1334j jVar = this.mChildDrawingOrderCallback;
        return jVar == null ? super.getChildDrawingOrder(i, i2) : jVar.mo4781a(i, i2);
    }

    public long getChildItemId(View view) {
        C1328d0 childViewHolderInt;
        C1331g gVar = this.mAdapter;
        if (gVar == null || !gVar.mo4764g() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.mo4721k();
    }

    public int getChildLayoutPosition(View view) {
        C1328d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo4723m();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public C1328d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C1405k getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C1335k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public C1336l getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: package-private */
    public Rect getItemDecorInsetsForChild(View view) {
        C1347p pVar = (C1347p) view.getLayoutParams();
        if (!pVar.f3897c) {
            return pVar.f3896b;
        }
        if (this.mState.mo4685e() && (pVar.mo4914b() || pVar.mo4916d())) {
            return pVar.f3896b;
        }
        Rect rect = pVar.f3896b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).mo4809e(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f3897c = false;
        return rect;
    }

    public C1341n getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public C1342o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public C1349r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C1352u getRecycledViewPool() {
        return this.mRecycler.mo4955i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo6649k();
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().mo6650l(i);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo5086p();
    }

    /* access modifiers changed from: package-private */
    public void initAdapterManager() {
        this.mAdapterHelper = new C1371a(new C1330f());
    }

    /* access modifiers changed from: package-private */
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C1388d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C2090b.fastscroll_default_thickness), resources.getDimensionPixelSize(C2090b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C2090b.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            C1342o oVar = this.mLayout;
            if (oVar != null) {
                oVar.mo4458g("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        C1336l lVar = this.mItemAnimator;
        return lVar != null && lVar.mo4797p();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo6651m();
    }

    /* access modifiers changed from: package-private */
    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.mo4470x1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void markItemDecorInsetsDirty() {
        int j = this.mChildHelper.mo5103j();
        for (int i = 0; i < j; i++) {
            ((C1347p) this.mChildHelper.mo5102i(i).getLayoutParams()).f3897c = true;
        }
        this.mRecycler.mo4963s();
    }

    /* access modifiers changed from: package-private */
    public void markKnownViewsInvalid() {
        int j = this.mChildHelper.mo5103j();
        for (int i = 0; i < j; i++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5102i(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo4709J()) {
                childViewHolderInt.mo4713b(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.mo4964t();
    }

    public void offsetChildrenHorizontal(int i) {
        int g = this.mChildHelper.mo5101g();
        for (int i2 = 0; i2 < g; i2++) {
            this.mChildHelper.mo5100f(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int g = this.mChildHelper.mo5101g();
        for (int i2 = 0; i2 < g; i2++) {
            this.mChildHelper.mo5100f(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForInsert(int i, int i2) {
        int j = this.mChildHelper.mo5103j();
        for (int i3 = 0; i3 < j; i3++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5102i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.mo4709J() && childViewHolderInt.f3840d >= i) {
                childViewHolderInt.mo4700A(i2, false);
                this.mState.f3817g = true;
            }
        }
        this.mRecycler.mo4965u(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.mChildHelper.mo5103j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5102i(i7));
            if (childViewHolderInt != null && (i6 = childViewHolderInt.f3840d) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    childViewHolderInt.mo4700A(i2 - i, false);
                } else {
                    childViewHolderInt.mo4700A(i5, false);
                }
                this.mState.f3817g = true;
            }
        }
        this.mRecycler.mo4966v(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.mChildHelper.mo5103j();
        for (int i4 = 0; i4 < j; i4++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5102i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.mo4709J()) {
                int i5 = childViewHolderInt.f3840d;
                if (i5 >= i3) {
                    childViewHolderInt.mo4700A(-i2, z);
                } else if (i5 >= i) {
                    childViewHolderInt.mo4719i(i - 1, -i2, z);
                }
                this.mState.f3817g = true;
            }
        }
        this.mRecycler.mo4967w(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4904z(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<C1393e> threadLocal = C1393e.f4091f;
            C1393e eVar = threadLocal.get();
            this.mGapWorker = eVar;
            if (eVar == null) {
                this.mGapWorker = new C1393e();
                Display s = C1988t.m8405s(this);
                float f = 60.0f;
                if (!isInEditMode() && s != null) {
                    float refreshRate = s.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C1393e eVar2 = this.mGapWorker;
                eVar2.f4095r = (long) (1.0E9f / f);
                threadLocal.set(eVar2);
            }
            this.mGapWorker.mo5158a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1393e eVar;
        super.onDetachedFromWindow();
        C1336l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo4792k();
        }
        stopScroll();
        this.mIsAttached = false;
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4814A(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.mo5251j();
        if (ALLOW_THREAD_GAP_WORK && (eVar = this.mGapWorker) != null) {
            eVar.mo5161j(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).mo4811g(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.mo4460l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.mo4459k()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.mo4460l()) {
                        f2 = -axisValue;
                    } else if (this.mLayout.mo4459k()) {
                        f = axisValue;
                        f2 = 0.0f;
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        C1342o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean k = oVar.mo4459k();
        boolean l = this.mLayout.mo4460l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            if (l) {
                k |= true;
            }
            startNestedScroll(k ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i = x2 - this.mInitialTouchX;
                int i2 = y2 - this.mInitialTouchY;
                if (!k || Math.abs(i) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (l && Math.abs(i2) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1864m.m7881a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C1864m.m7882b();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1342o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo4468s0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.mo4855Z0(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.mAdapter != null) {
                if (this.mState.f3815e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.mo4816A1(i, i2);
                this.mState.f3820j = true;
                dispatchLayoutStep2();
                this.mLayout.mo4822D1(i, i2);
                if (this.mLayout.mo4440G1()) {
                    this.mLayout.mo4816A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f3820j = true;
                    dispatchLayoutStep2();
                    this.mLayout.mo4822D1(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.mo4855Z0(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                C1322a0 a0Var = this.mState;
                if (a0Var.f3822l) {
                    a0Var.f3818h = true;
                } else {
                    this.mAdapterHelper.mo5081j();
                    this.mState.f3818h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f3822l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C1331g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f3816f = gVar.mo4760c();
            } else {
                this.mState.f3816f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.mo4855Z0(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f3818h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1357y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1357y yVar = (C1357y) parcelable;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.mo6726a());
        C1342o oVar = this.mLayout;
        if (oVar != null && (parcelable2 = this.mPendingSavedState.f3915p) != null) {
            oVar.mo4453c1(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1357y yVar = new C1357y(super.onSaveInstanceState());
        C1357y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.mo4972b(yVar2);
        } else {
            C1342o oVar = this.mLayout;
            yVar.f3915p = oVar != null ? oVar.mo4455d1() : null;
        }
        return yVar;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01db
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01db
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo4459k()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            boolean r11 = r0.mo4460l()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01af
            if (r0 == r9) goto L_0x016d
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d0
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01d0
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01d0
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01d0
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00f7
            if (r10 == 0) goto L_0x00dd
            int r2 = r6.mTouchSlop
            if (r0 <= 0) goto L_0x00d4
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d9
        L_0x00d4:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d9:
            if (r0 == 0) goto L_0x00dd
            r2 = 1
            goto L_0x00de
        L_0x00dd:
            r2 = 0
        L_0x00de:
            if (r11 == 0) goto L_0x00f2
            int r3 = r6.mTouchSlop
            if (r1 <= 0) goto L_0x00ea
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ef
        L_0x00ea:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            r2 = 1
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r6.setScrollState(r9)
        L_0x00f7:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01d0
            int[] r3 = r6.mReusableIntPair
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0108
            r1 = r15
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            r2 = r16
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013c
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013c:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x014e
            r1 = r15
            goto L_0x014f
        L_0x014e:
            r1 = 0
        L_0x014f:
            if (r11 == 0) goto L_0x0153
            r2 = r0
            goto L_0x0154
        L_0x0153:
            r2 = 0
        L_0x0154:
            boolean r1 = r6.scrollByInternal(r1, r2, r7)
            if (r1 == 0) goto L_0x0161
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0161:
            androidx.recyclerview.widget.e r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01d0
            if (r15 != 0) goto L_0x0169
            if (r0 == 0) goto L_0x01d0
        L_0x0169:
            r1.mo5159f(r6, r15, r0)
            goto L_0x01d0
        L_0x016d:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0189
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            if (r11 == 0) goto L_0x0196
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0197
        L_0x0196:
            r2 = 0
        L_0x0197:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x019f
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a7
        L_0x019f:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01aa
        L_0x01a7:
            r6.setScrollState(r8)
        L_0x01aa:
            r17.resetScroll()
            r8 = 1
            goto L_0x01d0
        L_0x01af:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r11 == 0) goto L_0x01cd
            r10 = r10 | 2
        L_0x01cd:
            r6.startNestedScroll(r10, r8)
        L_0x01d0:
            if (r8 != 0) goto L_0x01d7
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01d7:
            r12.recycle()
            return r9
        L_0x01db:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C1988t.m8378e0(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: package-private */
    public void recordAnimationInfoIfBouncedHiddenView(C1328d0 d0Var, C1336l.C1339c cVar) {
        d0Var.mo4705F(0, 8192);
        if (this.mState.f3819i && d0Var.mo4736y() && !d0Var.mo4733v() && !d0Var.mo4709J()) {
            this.mViewInfoStore.mo5244c(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.mo5246e(d0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        C1336l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo4792k();
        }
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4880k1(this.mRecycler);
            this.mLayout.mo4882l1(this.mRecycler);
        }
        this.mRecycler.mo4949c();
    }

    /* access modifiers changed from: package-private */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r = this.mChildHelper.mo5110r(view);
        if (r) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.mo4944J(childViewHolderInt);
            this.mRecycler.mo4938C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r);
        return r;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1328d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.mo4735x()) {
                childViewHolderInt.mo4717f();
            } else if (!childViewHolderInt.mo4709J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(C1341n nVar) {
        C1342o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4458g("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(C1348q qVar) {
        List<C1348q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(C1350s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(C1351t tVar) {
        List<C1351t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void repositionShadowingViews() {
        C1328d0 d0Var;
        int g = this.mChildHelper.mo5101g();
        for (int i = 0; i < g; i++) {
            View f = this.mChildHelper.mo5100f(i);
            C1328d0 childViewHolder = getChildViewHolder(f);
            if (!(childViewHolder == null || (d0Var = childViewHolder.f3846j) == null)) {
                View view = d0Var.f3838b;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.mo4860b1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo4894r1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).mo4922c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void saveOldPositions() {
        int j = this.mChildHelper.mo5103j();
        for (int i = 0; i < j; i++) {
            C1328d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5102i(i));
            if (!childViewHolderInt.mo4709J()) {
                childViewHolderInt.mo4704E();
            }
        }
    }

    public void scrollBy(int i, int i2) {
        C1342o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean k = oVar.mo4459k();
            boolean l = this.mLayout.mo4460l();
            if (k || l) {
                if (!k) {
                    i = 0;
                }
                if (!l) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i8, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i6 = i10;
            i5 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i6, i4, i3, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = i4 - iArr4[0];
        int i12 = i3 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i13 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C1977i.m8299a(motionEvent2, 8194)) {
                pullGlows(motionEvent.getX(), (float) i11, motionEvent.getY(), (float) i12);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i5 == 0 && i6 == 0)) {
            dispatchOnScrolled(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i6 == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C1864m.m7881a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int w1 = i != 0 ? this.mLayout.mo4425w1(i, this.mRecycler, this.mState) : 0;
        int y1 = i2 != 0 ? this.mLayout.mo4426y1(i2, this.mRecycler, this.mState) : 0;
        C1864m.m7882b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = w1;
            iArr[1] = y1;
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            C1342o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo4470x1(i);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1405k kVar) {
        this.mAccessibilityDelegate = kVar;
        C1988t.m8394m0(this, kVar);
    }

    public void setAdapter(C1331g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C1334j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean setChildImportantForAccessibilityInternal(C1328d0 d0Var, int i) {
        if (isComputingLayout()) {
            d0Var.f3854r = i;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        C1988t.m8414w0(d0Var.f3838b, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1335k kVar) {
        C1177h.m4583e(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(C1336l lVar) {
        C1336l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.mo4792k();
            this.mItemAnimator.mo4803v((C1336l.C1338b) null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.mo4803v(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.mo4942G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C1342o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                C1336l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.mo4792k();
                }
                this.mLayout.mo4880k1(this.mRecycler);
                this.mLayout.mo4882l1(this.mRecycler);
                this.mRecycler.mo4949c();
                if (this.mIsAttached) {
                    this.mLayout.mo4814A(this, this.mRecycler);
                }
                this.mLayout.mo4824E1((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo4949c();
            }
            this.mChildHelper.mo5107o();
            this.mLayout = oVar;
            if (oVar != null) {
                if (oVar.f3872b == null) {
                    oVar.mo4824E1(this);
                    if (this.mIsAttached) {
                        this.mLayout.mo4904z(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f3872b.exceptionLabel());
                }
            }
            this.mRecycler.mo4945K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo6652n(z);
    }

    public void setOnFlingListener(C1349r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C1351t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C1352u uVar) {
        this.mRecycler.mo4940E(uVar);
    }

    public void setRecyclerListener(C1355w wVar) {
        this.mRecyclerListener = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.mTouchSlop = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.mTouchSlop = i2;
    }

    public void setViewCacheExtension(C1324b0 b0Var) {
        this.mRecycler.mo4941F(b0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int a = accessibilityEvent != null ? C1954b.m8185a(accessibilityEvent) : 0;
        if (a != 0) {
            i = a;
        }
        this.mEatenAccessibilityChangeFlags |= i;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, (Interpolator) null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C1342o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i4 = 0;
            if (!oVar.mo4459k()) {
                i = 0;
            }
            if (!this.mLayout.mo4460l()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.mo4693f(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            C1342o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo4442I1(this, this.mState, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo6653p(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mo6654q(i, i2);
    }

    /* access modifiers changed from: package-private */
    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo6655r();
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().mo6656s(i);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(C1331g gVar, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int j = this.mChildHelper.mo5103j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.mChildHelper.mo5102i(i5);
            C1328d0 childViewHolderInt = getChildViewHolderInt(i6);
            if (childViewHolderInt != null && !childViewHolderInt.mo4709J() && (i3 = childViewHolderInt.f3840d) >= i && i3 < i4) {
                childViewHolderInt.mo4713b(2);
                childViewHolderInt.mo4712a(obj);
                ((C1347p) i6.getLayoutParams()).f3897c = true;
            }
        }
        this.mRecycler.mo4947M(i, i2);
    }
}
