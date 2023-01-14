package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C1135a;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.util.C1173d;
import androidx.core.util.C1175f;
import androidx.core.util.C1176g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p027c.p063h.C1821a;
import p027c.p063h.C1822b;
import p027c.p063h.C1823c;
import p027c.p064i.p072j.C1915d;
import p027c.p064i.p072j.C1929e0;
import p027c.p064i.p072j.C1980l;
import p027c.p064i.p072j.C1981m;
import p027c.p064i.p072j.C1983o;
import p027c.p064i.p072j.C1984p;
import p027c.p064i.p072j.C1988t;
import p027c.p077k.p078a.C2019a;

public class CoordinatorLayout extends ViewGroup implements C1980l, C1981m {

    /* renamed from: f */
    static final String f3011f;

    /* renamed from: o */
    static final Class<?>[] f3012o = {Context.class, AttributeSet.class};

    /* renamed from: p */
    static final ThreadLocal<Map<String, Constructor<C1087c>>> f3013p = new ThreadLocal<>();

    /* renamed from: q */
    static final Comparator<View> f3014q;

    /* renamed from: r */
    private static final C1175f<Rect> f3015r = new C1176g(12);

    /* renamed from: A */
    private boolean f3016A;

    /* renamed from: B */
    private int[] f3017B;

    /* renamed from: C */
    private View f3018C;

    /* renamed from: D */
    private View f3019D;

    /* renamed from: E */
    private C1091g f3020E;

    /* renamed from: F */
    private boolean f3021F;

    /* renamed from: G */
    private C1929e0 f3022G;

    /* renamed from: H */
    private boolean f3023H;

    /* renamed from: I */
    private Drawable f3024I;

    /* renamed from: J */
    ViewGroup.OnHierarchyChangeListener f3025J;

    /* renamed from: K */
    private C1984p f3026K;

    /* renamed from: L */
    private final C1983o f3027L;

    /* renamed from: s */
    private final List<View> f3028s;

    /* renamed from: t */
    private final C1095a<View> f3029t;

    /* renamed from: u */
    private final List<View> f3030u;

    /* renamed from: v */
    private final List<View> f3031v;

    /* renamed from: w */
    private Paint f3032w;

    /* renamed from: x */
    private final int[] f3033x;

    /* renamed from: y */
    private final int[] f3034y;

    /* renamed from: z */
    private boolean f3035z;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C1085a implements C1984p {
        C1085a() {
        }

        /* renamed from: a */
        public C1929e0 mo319a(View view, C1929e0 e0Var) {
            return CoordinatorLayout.this.mo3424W(e0Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C1086b {
        C1087c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C1087c<V extends View> {
        public C1087c() {
        }

        public C1087c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: A */
        public boolean mo3469A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo3498z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void mo3470B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo3471C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo3470B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo3472D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3473a(CoordinatorLayout coordinatorLayout, V v) {
            return mo3476d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo3474b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int mo3475c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float mo3476d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo3477e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C1929e0 mo3478f(CoordinatorLayout coordinatorLayout, V v, C1929e0 e0Var) {
            return e0Var;
        }

        /* renamed from: g */
        public void mo3479g(C1090f fVar) {
        }

        /* renamed from: h */
        public boolean mo3480h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo3481i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo3482j() {
        }

        /* renamed from: k */
        public boolean mo3483k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo3484l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo3485m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean mo3486n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo3487o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void mo3488p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo3489q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo3488p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void mo3490r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void mo3491s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo3490r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo3492t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo3491s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void mo3493u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void mo3494v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo3493u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo3495w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo3496x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo3497y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean mo3498z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C1088d {
        Class<? extends C1087c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class C1089e implements ViewGroup.OnHierarchyChangeListener {
        C1089e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3025J;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo3419H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3025J;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C1090f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C1087c f3038a;

        /* renamed from: b */
        boolean f3039b = false;

        /* renamed from: c */
        public int f3040c = 0;

        /* renamed from: d */
        public int f3041d = 0;

        /* renamed from: e */
        public int f3042e = -1;

        /* renamed from: f */
        int f3043f = -1;

        /* renamed from: g */
        public int f3044g = 0;

        /* renamed from: h */
        public int f3045h = 0;

        /* renamed from: i */
        int f3046i;

        /* renamed from: j */
        int f3047j;

        /* renamed from: k */
        View f3048k;

        /* renamed from: l */
        View f3049l;

        /* renamed from: m */
        private boolean f3050m;

        /* renamed from: n */
        private boolean f3051n;

        /* renamed from: o */
        private boolean f3052o;

        /* renamed from: p */
        private boolean f3053p;

        /* renamed from: q */
        final Rect f3054q = new Rect();

        /* renamed from: r */
        Object f3055r;

        public C1090f(int i, int i2) {
            super(i, i2);
        }

        C1090f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1823c.f5401e);
            this.f3040c = obtainStyledAttributes.getInteger(C1823c.f5402f, 0);
            this.f3043f = obtainStyledAttributes.getResourceId(C1823c.f5403g, -1);
            this.f3041d = obtainStyledAttributes.getInteger(C1823c.f5404h, 0);
            this.f3042e = obtainStyledAttributes.getInteger(C1823c.f5408l, -1);
            this.f3044g = obtainStyledAttributes.getInt(C1823c.f5407k, 0);
            this.f3045h = obtainStyledAttributes.getInt(C1823c.f5406j, 0);
            int i = C1823c.f5405i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f3039b = hasValue;
            if (hasValue) {
                this.f3038a = CoordinatorLayout.m4180K(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            C1087c cVar = this.f3038a;
            if (cVar != null) {
                cVar.mo3479g(this);
            }
        }

        public C1090f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1090f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1090f(C1090f fVar) {
            super(fVar);
        }

        /* renamed from: n */
        private void m4256n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3043f);
            this.f3048k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f3049l = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3043f) + " to anchor view " + view);
            }
            this.f3049l = null;
            this.f3048k = null;
        }

        /* renamed from: s */
        private boolean m4257s(View view, int i) {
            int b = C1915d.m8012b(((C1090f) view.getLayoutParams()).f3044g, i);
            return b != 0 && (C1915d.m8012b(this.f3045h, i) & b) == b;
        }

        /* renamed from: t */
        private boolean m4258t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3048k.getId() != this.f3043f) {
                return false;
            }
            View view2 = this.f3048k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3049l = null;
                    this.f3048k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f3049l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3502a() {
            return this.f3048k == null && this.f3043f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f3038a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3503b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f3049l
                if (r4 == r0) goto L_0x001b
                int r0 = p027c.p064i.p072j.C1988t.m8417y(r2)
                boolean r0 = r1.m4257s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f3038a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo3477e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C1090f.mo3503b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3504c() {
            if (this.f3038a == null) {
                this.f3050m = false;
            }
            return this.f3050m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo3505d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3043f == -1) {
                this.f3049l = null;
                this.f3048k = null;
                return null;
            }
            if (this.f3048k == null || !m4258t(view, coordinatorLayout)) {
                m4256n(view, coordinatorLayout);
            }
            return this.f3048k;
        }

        /* renamed from: e */
        public int mo3506e() {
            return this.f3043f;
        }

        /* renamed from: f */
        public C1087c mo3507f() {
            return this.f3038a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo3508g() {
            return this.f3053p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Rect mo3509h() {
            return this.f3054q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo3510i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f3050m;
            if (z) {
                return true;
            }
            C1087c cVar = this.f3038a;
            boolean a = (cVar != null ? cVar.mo3473a(coordinatorLayout, view) : false) | z;
            this.f3050m = a;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3511j(int i) {
            if (i == 0) {
                return this.f3051n;
            }
            if (i != 1) {
                return false;
            }
            return this.f3052o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo3512k() {
            this.f3053p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3513l(int i) {
            mo3518r(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo3514m() {
            this.f3050m = false;
        }

        /* renamed from: o */
        public void mo3515o(C1087c cVar) {
            C1087c cVar2 = this.f3038a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo3482j();
                }
                this.f3038a = cVar;
                this.f3055r = null;
                this.f3039b = true;
                if (cVar != null) {
                    cVar.mo3479g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo3516p(boolean z) {
            this.f3053p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo3517q(Rect rect) {
            this.f3054q.set(rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo3518r(int i, boolean z) {
            if (i == 0) {
                this.f3051n = z;
            } else if (i == 1) {
                this.f3052o = z;
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class C1091g implements ViewTreeObserver.OnPreDrawListener {
        C1091g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo3419H(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    protected static class C1092h extends C2019a {
        public static final Parcelable.Creator<C1092h> CREATOR = new C1093a();

        /* renamed from: p */
        SparseArray<Parcelable> f3057p;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        static class C1093a implements Parcelable.ClassLoaderCreator<C1092h> {
            C1093a() {
            }

            /* renamed from: a */
            public C1092h createFromParcel(Parcel parcel) {
                return new C1092h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C1092h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1092h(parcel, classLoader);
            }

            /* renamed from: c */
            public C1092h[] newArray(int i) {
                return new C1092h[i];
            }
        }

        public C1092h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3057p = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f3057p.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C1092h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f3057p;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f3057p.keyAt(i2);
                parcelableArr[i2] = this.f3057p.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C1094i implements Comparator<View> {
        C1094i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float K = C1988t.m8353K(view);
            float K2 = C1988t.m8353K(view2);
            if (K > K2) {
                return -1;
            }
            return K < K2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f3011f = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f3014q = r0
            goto L_0x0021
        L_0x001f:
            f3014q = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f3012o = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f3013p = r0
            androidx.core.util.g r0 = new androidx.core.util.g
            r1 = 12
            r0.<init>(r1)
            f3015r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1821a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3028s = new ArrayList();
        this.f3029t = new C1095a<>();
        this.f3030u = new ArrayList();
        this.f3031v = new ArrayList();
        this.f3033x = new int[2];
        this.f3034y = new int[2];
        this.f3027L = new C1983o(this);
        int[] iArr = C1823c.f5398b;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, C1822b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = C1823c.f5398b;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, C1822b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C1823c.f5399c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3017B = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f3017B.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr3 = this.f3017B;
                iArr3[i2] = (int) (((float) iArr3[i2]) * f);
            }
        }
        this.f3024I = obtainStyledAttributes.getDrawable(C1823c.f5400d);
        obtainStyledAttributes.recycle();
        m4190X();
        super.setOnHierarchyChangeListener(new C1089e());
        if (C1988t.m8413w(this) == 0) {
            C1988t.m8414w0(this, 1);
        }
    }

    /* renamed from: A */
    private boolean m4175A(View view) {
        return this.f3029t.mo3535j(view);
    }

    /* renamed from: C */
    private void m4176C(View view, int i) {
        C1090f fVar = (C1090f) view.getLayoutParams();
        Rect b = m4191b();
        b.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f3022G != null && C1988t.m8411v(this) && !C1988t.m8411v(view)) {
            b.left += this.f3022G.mo6490i();
            b.top += this.f3022G.mo6492k();
            b.right -= this.f3022G.mo6491j();
            b.bottom -= this.f3022G.mo6488h();
        }
        Rect b2 = m4191b();
        C1915d.m8011a(m4186S(fVar.f3040c), view.getMeasuredWidth(), view.getMeasuredHeight(), b, b2, i);
        view.layout(b2.left, b2.top, b2.right, b2.bottom);
        m4183O(b);
        m4183O(b2);
    }

    /* renamed from: D */
    private void m4177D(View view, View view2, int i) {
        Rect b = m4191b();
        Rect b2 = m4191b();
        try {
            mo3463t(view2, b);
            mo3464u(view, i, b, b2);
            view.layout(b2.left, b2.top, b2.right, b2.bottom);
        } finally {
            m4183O(b);
            m4183O(b2);
        }
    }

    /* renamed from: E */
    private void m4178E(View view, int i, int i2) {
        C1090f fVar = (C1090f) view.getLayoutParams();
        int b = C1915d.m8012b(m4187T(fVar.f3040c), i2);
        int i3 = b & 7;
        int i4 = b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int w = m4196w(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            w += measuredWidth / 2;
        } else if (i3 == 5) {
            w += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(w, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: F */
    private void m4179F(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C1988t.m8361S(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C1090f fVar = (C1090f) view.getLayoutParams();
            C1087c f = fVar.mo3507f();
            Rect b = m4191b();
            Rect b2 = m4191b();
            b2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo3474b(this, view, b)) {
                b.set(b2);
            } else if (!b2.contains(b)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + b.toShortString() + " | Bounds:" + b2.toShortString());
            }
            m4183O(b2);
            if (b.isEmpty()) {
                m4183O(b);
                return;
            }
            int b3 = C1915d.m8012b(fVar.f3045h, i);
            boolean z3 = true;
            if ((b3 & 48) != 48 || (i6 = (b.top - fVar.topMargin) - fVar.f3047j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m4189V(view, i7 - i6);
                z = true;
            }
            if ((b3 & 80) == 80 && (height = ((getHeight() - b.bottom) - fVar.bottomMargin) + fVar.f3047j) < (i5 = rect.bottom)) {
                m4189V(view, height - i5);
                z = true;
            }
            if (!z) {
                m4189V(view, 0);
            }
            if ((b3 & 3) != 3 || (i3 = (b.left - fVar.leftMargin) - fVar.f3046i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m4188U(view, i4 - i3);
                z2 = true;
            }
            if ((b3 & 5) != 5 || (width = ((getWidth() - b.right) - fVar.rightMargin) + fVar.f3046i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m4188U(view, width - i2);
            }
            if (!z3) {
                m4188U(view, 0);
            }
            m4183O(b);
        }
    }

    /* renamed from: K */
    static C1087c m4180K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f3011f;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<C1087c>>> threadLocal = f3013p;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3012o);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C1087c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: L */
    private boolean m4181L(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3030u;
        m4197z(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C1090f fVar = (C1090f) view.getLayoutParams();
            C1087c f = fVar.mo3507f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.mo3483k(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.mo3472D(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f3018C = view;
                    }
                }
                boolean c = fVar.mo3504c();
                boolean i4 = fVar.mo3510i(this, view);
                z2 = i4 && !c;
                if (i4 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f.mo3483k(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.mo3472D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: M */
    private void m4182M() {
        this.f3028s.clear();
        this.f3029t.mo3530c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1090f y = mo3467y(childAt);
            y.mo3505d(this, childAt);
            this.f3029t.mo3529b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (y.mo3503b(this, childAt, childAt2)) {
                        if (!this.f3029t.mo3531d(childAt2)) {
                            this.f3029t.mo3529b(childAt2);
                        }
                        this.f3029t.mo3528a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3028s.addAll(this.f3029t.mo3534i());
        Collections.reverse(this.f3028s);
    }

    /* renamed from: O */
    private static void m4183O(Rect rect) {
        rect.setEmpty();
        f3015r.mo3701a(rect);
    }

    /* renamed from: Q */
    private void m4184Q(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1087c f = ((C1090f) childAt.getLayoutParams()).mo3507f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo3483k(this, childAt, obtain);
                } else {
                    f.mo3472D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C1090f) getChildAt(i2).getLayoutParams()).mo3514m();
        }
        this.f3018C = null;
        this.f3035z = false;
    }

    /* renamed from: R */
    private static int m4185R(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: S */
    private static int m4186S(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: T */
    private static int m4187T(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: U */
    private void m4188U(View view, int i) {
        C1090f fVar = (C1090f) view.getLayoutParams();
        int i2 = fVar.f3046i;
        if (i2 != i) {
            C1988t.m8366X(view, i - i2);
            fVar.f3046i = i;
        }
    }

    /* renamed from: V */
    private void m4189V(View view, int i) {
        C1090f fVar = (C1090f) view.getLayoutParams();
        int i2 = fVar.f3047j;
        if (i2 != i) {
            C1988t.m8367Y(view, i - i2);
            fVar.f3047j = i;
        }
    }

    /* renamed from: X */
    private void m4190X() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C1988t.m8411v(this)) {
                if (this.f3026K == null) {
                    this.f3026K = new C1085a();
                }
                C1988t.m8334A0(this, this.f3026K);
                setSystemUiVisibility(1280);
                return;
            }
            C1988t.m8334A0(this, (C1984p) null);
        }
    }

    /* renamed from: b */
    private static Rect m4191b() {
        Rect b = f3015r.mo3702b();
        return b == null ? new Rect() : b;
    }

    /* renamed from: d */
    private static int m4192d(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: e */
    private void m4193e(C1090f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: f */
    private C1929e0 m4194f(C1929e0 e0Var) {
        C1087c f;
        if (e0Var.mo6494n()) {
            return e0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C1988t.m8411v(childAt) && (f = ((C1090f) childAt.getLayoutParams()).mo3507f()) != null) {
                e0Var = f.mo3478f(this, childAt, e0Var);
                if (e0Var.mo6494n()) {
                    break;
                }
            }
        }
        return e0Var;
    }

    /* renamed from: v */
    private void m4195v(View view, int i, Rect rect, Rect rect2, C1090f fVar, int i2, int i3) {
        int b = C1915d.m8012b(m4185R(fVar.f3040c), i);
        int b2 = C1915d.m8012b(m4186S(fVar.f3041d), i);
        int i4 = b & 7;
        int i5 = b & 112;
        int i6 = b2 & 7;
        int i7 = b2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: w */
    private int m4196w(int i) {
        StringBuilder sb;
        int[] iArr = this.f3017B;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    /* renamed from: z */
    private void m4197z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f3014q;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: B */
    public boolean mo3417B(View view, int i, int i2) {
        Rect b = m4191b();
        mo3463t(view, b);
        try {
            return b.contains(i, i2);
        } finally {
            m4183O(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo3418G(View view, int i) {
        C1087c f;
        View view2 = view;
        C1090f fVar = (C1090f) view.getLayoutParams();
        if (fVar.f3048k != null) {
            Rect b = m4191b();
            Rect b2 = m4191b();
            Rect b3 = m4191b();
            mo3463t(fVar.f3048k, b);
            boolean z = false;
            mo3452q(view2, false, b2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m4195v(view, i, b, b3, fVar, measuredWidth, measuredHeight);
            if (!(b3.left == b2.left && b3.top == b2.top)) {
                z = true;
            }
            m4193e(fVar, b3, measuredWidth, i2);
            int i3 = b3.left - b2.left;
            int i4 = b3.top - b2.top;
            if (i3 != 0) {
                C1988t.m8366X(view2, i3);
            }
            if (i4 != 0) {
                C1988t.m8367Y(view2, i4);
            }
            if (z && (f = fVar.mo3507f()) != null) {
                f.mo3480h(this, view2, fVar.f3048k);
            }
            m4183O(b);
            m4183O(b2);
            m4183O(b3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo3419H(int i) {
        boolean z;
        int i2 = i;
        int y = C1988t.m8417y(this);
        int size = this.f3028s.size();
        Rect b = m4191b();
        Rect b2 = m4191b();
        Rect b3 = m4191b();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f3028s.get(i3);
            C1090f fVar = (C1090f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f3049l == this.f3028s.get(i4)) {
                        mo3418G(view, y);
                    }
                }
                mo3452q(view, true, b2);
                if (fVar.f3044g != 0 && !b2.isEmpty()) {
                    int b4 = C1915d.m8012b(fVar.f3044g, y);
                    int i5 = b4 & 112;
                    if (i5 == 48) {
                        b.top = Math.max(b.top, b2.bottom);
                    } else if (i5 == 80) {
                        b.bottom = Math.max(b.bottom, getHeight() - b2.top);
                    }
                    int i6 = b4 & 7;
                    if (i6 == 3) {
                        b.left = Math.max(b.left, b2.right);
                    } else if (i6 == 5) {
                        b.right = Math.max(b.right, getWidth() - b2.left);
                    }
                }
                if (fVar.f3045h != 0 && view.getVisibility() == 0) {
                    m4179F(view, b, y);
                }
                if (i2 != 2) {
                    mo3466x(view, b3);
                    if (!b3.equals(b2)) {
                        mo3422N(view, b2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f3028s.get(i7);
                    C1090f fVar2 = (C1090f) view2.getLayoutParams();
                    C1087c f = fVar2.mo3507f();
                    if (f != null && f.mo3477e(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo3508g()) {
                            if (i2 != 2) {
                                z = f.mo3480h(this, view2, view);
                            } else {
                                f.mo3481i(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo3516p(z);
                            }
                        } else {
                            fVar2.mo3512k();
                        }
                    }
                }
            }
        }
        m4183O(b);
        m4183O(b2);
        m4183O(b3);
    }

    /* renamed from: I */
    public void mo3420I(View view, int i) {
        C1090f fVar = (C1090f) view.getLayoutParams();
        if (!fVar.mo3502a()) {
            View view2 = fVar.f3048k;
            if (view2 != null) {
                m4177D(view, view2, i);
                return;
            }
            int i2 = fVar.f3042e;
            if (i2 >= 0) {
                m4178E(view, i2, i);
            } else {
                m4176C(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: J */
    public void mo3421J(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo3422N(View view, Rect rect) {
        ((C1090f) view.getLayoutParams()).mo3517q(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo3423P() {
        if (this.f3016A && this.f3020E != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3020E);
        }
        this.f3021F = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final C1929e0 mo3424W(C1929e0 e0Var) {
        if (C1173d.m4572a(this.f3022G, e0Var)) {
            return e0Var;
        }
        this.f3022G = e0Var;
        boolean z = true;
        boolean z2 = e0Var != null && e0Var.mo6492k() > 0;
        this.f3023H = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C1929e0 f = m4194f(e0Var);
        requestLayout();
        return f;
    }

    /* renamed from: a */
    public void mo900a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C1087c f;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C1090f fVar = (C1090f) childAt.getLayoutParams();
                if (fVar.mo3511j(i5) && (f = fVar.mo3507f()) != null) {
                    int[] iArr2 = this.f3033x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo3492t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f3033x;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f3033x[1]) : Math.min(i7, this.f3033x[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            mo3419H(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3425c() {
        if (this.f3016A) {
            if (this.f3020E == null) {
                this.f3020E = new C1091g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3020E);
        }
        this.f3021F = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1090f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C1090f fVar = (C1090f) view.getLayoutParams();
        C1087c cVar = fVar.f3038a;
        if (cVar != null) {
            float d = cVar.mo3476d(this, view);
            if (d > 0.0f) {
                if (this.f3032w == null) {
                    this.f3032w = new Paint();
                }
                this.f3032w.setColor(fVar.f3038a.mo3475c(this, view));
                this.f3032w.setAlpha(m4192d(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f3032w);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3024I;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: g */
    public void mo3429g(View view) {
        List g = this.f3029t.mo3532g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                C1087c f = ((C1090f) view2.getLayoutParams()).mo3507f();
                if (f != null) {
                    f.mo3480h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m4182M();
        return Collections.unmodifiableList(this.f3028s);
    }

    public final C1929e0 getLastWindowInsets() {
        return this.f3022G;
    }

    public int getNestedScrollAxes() {
        return this.f3027L.mo6657a();
    }

    public Drawable getStatusBarBackground() {
        return this.f3024I;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3439h() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m4175A(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f3021F) {
            return;
        }
        if (z) {
            mo3425c();
        } else {
            mo3423P();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C1090f generateDefaultLayoutParams() {
        return new C1090f(-2, -2);
    }

    /* renamed from: j */
    public C1090f generateLayoutParams(AttributeSet attributeSet) {
        return new C1090f(getContext(), attributeSet);
    }

    /* renamed from: k */
    public void mo919k(View view, int i, int i2, int i3, int i4, int i5) {
        mo900a(view, i, i2, i3, i4, 0, this.f3034y);
    }

    /* renamed from: l */
    public boolean mo920l(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            if (i4 >= childCount) {
                return z;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1090f fVar = (C1090f) childAt.getLayoutParams();
                C1087c f = fVar.mo3507f();
                if (f != null) {
                    boolean A = f.mo3469A(this, childAt, view, view2, i, i2);
                    z |= A;
                    fVar.mo3518r(i3, A);
                } else {
                    fVar.mo3518r(i3, false);
                }
            }
            i4++;
        }
    }

    /* renamed from: m */
    public void mo921m(View view, View view2, int i, int i2) {
        C1087c f;
        this.f3027L.mo6659c(view, view2, i, i2);
        this.f3019D = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C1090f fVar = (C1090f) childAt.getLayoutParams();
            if (fVar.mo3511j(i2) && (f = fVar.mo3507f()) != null) {
                f.mo3494v(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: n */
    public void mo922n(View view, int i) {
        this.f3027L.mo6661e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1090f fVar = (C1090f) childAt.getLayoutParams();
            if (fVar.mo3511j(i)) {
                C1087c f = fVar.mo3507f();
                if (f != null) {
                    f.mo3471C(this, childAt, view, i);
                }
                fVar.mo3513l(i);
                fVar.mo3512k();
            }
        }
        this.f3019D = null;
    }

    /* renamed from: o */
    public void mo923o(View view, int i, int i2, int[] iArr, int i3) {
        C1087c f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C1090f fVar = (C1090f) childAt.getLayoutParams();
                if (fVar.mo3511j(i3) && (f = fVar.mo3507f()) != null) {
                    int[] iArr2 = this.f3033x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo3489q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f3033x;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f3033x;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo3419H(1);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4184Q(false);
        if (this.f3021F) {
            if (this.f3020E == null) {
                this.f3020E = new C1091g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3020E);
        }
        if (this.f3022G == null && C1988t.m8411v(this)) {
            C1988t.m8388j0(this);
        }
        this.f3016A = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4184Q(false);
        if (this.f3021F && this.f3020E != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3020E);
        }
        View view = this.f3019D;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3016A = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3023H && this.f3024I != null) {
            C1929e0 e0Var = this.f3022G;
            int k = e0Var != null ? e0Var.mo6492k() : 0;
            if (k > 0) {
                this.f3024I.setBounds(0, 0, getWidth(), k);
                this.f3024I.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m4184Q(true);
        }
        boolean L = m4181L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m4184Q(true);
        }
        return L;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1087c f;
        int y = C1988t.m8417y(this);
        int size = this.f3028s.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f3028s.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C1090f) view.getLayoutParams()).mo3507f()) == null || !f.mo3484l(this, view, y))) {
                mo3420I(view, y);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo3485m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m4182M()
            r30.mo3439h()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p027c.p064i.p072j.C1988t.m8417y(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            c.i.j.e0 r3 = r7.f3022G
            if (r3 == 0) goto L_0x004b
            boolean r3 = p027c.p064i.p072j.C1988t.m8411v(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f3028s
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f3028s
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C1090f) r1
            int r0 = r1.f3042e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.m4196w(r0)
            int r11 = r1.f3040c
            int r11 = m4187T(r11)
            int r11 = p027c.p064i.p072j.C1915d.m8012b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = p027c.p064i.p072j.C1988t.m8411v(r20)
            if (r0 != 0) goto L_0x00f1
            c.i.j.e0 r0 = r7.f3022G
            int r0 = r0.mo6490i()
            c.i.j.e0 r2 = r7.f3022G
            int r2 = r2.mo6491j()
            int r0 = r0 + r2
            c.i.j.e0 r2 = r7.f3022G
            int r2 = r2.mo6492k()
            c.i.j.e0 r11 = r7.f3022G
            int r11 = r11.mo6488h()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo3507f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo3485m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo3421J(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C1087c f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1090f fVar = (C1090f) childAt.getLayoutParams();
                if (fVar.mo3511j(0) && (f3 = fVar.mo3507f()) != null) {
                    z2 |= f3.mo3486n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo3419H(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C1087c f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1090f fVar = (C1090f) childAt.getLayoutParams();
                if (fVar.mo3511j(0) && (f3 = fVar.mo3507f()) != null) {
                    z |= f3.mo3487o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo923o(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo919k(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo921m(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1092h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1092h hVar = (C1092h) parcelable;
        super.onRestoreInstanceState(hVar.mo6726a());
        SparseArray<Parcelable> sparseArray = hVar.f3057p;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C1087c f = mo3467y(childAt).mo3507f();
            if (!(id == -1 || f == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f.mo3496x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y;
        C1092h hVar = new C1092h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C1087c f = ((C1090f) childAt.getLayoutParams()).mo3507f();
            if (!(id == -1 || f == null || (y = f.mo3497y(this, childAt)) == null)) {
                sparseArray.append(id, y);
            }
        }
        hVar.f3057p = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo920l(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo922n(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3018C
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m4181L(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f3018C
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C1090f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo3507f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f3018C
            boolean r6 = r6.mo3472D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f3018C
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m4184Q(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C1090f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1090f ? new C1090f((C1090f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1090f((ViewGroup.MarginLayoutParams) layoutParams) : new C1090f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3452q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo3463t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: r */
    public List<View> mo3453r(View view) {
        List<View> h = this.f3029t.mo3533h(view);
        this.f3031v.clear();
        if (h != null) {
            this.f3031v.addAll(h);
        }
        return this.f3031v;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C1087c f = ((C1090f) view.getLayoutParams()).mo3507f();
        if (f == null || !f.mo3495w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f3035z) {
            m4184Q(false);
            this.f3035z = true;
        }
    }

    /* renamed from: s */
    public List<View> mo3456s(View view) {
        List g = this.f3029t.mo3532g(view);
        this.f3031v.clear();
        if (g != null) {
            this.f3031v.addAll(g);
        }
        return this.f3031v;
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m4190X();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3025J = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3024I;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f3024I = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f3024I.setState(getDrawableState());
                }
                C1164a.m4549m(this.f3024I, C1988t.m8417y(this));
                this.f3024I.setVisible(getVisibility() == 0, false);
                this.f3024I.setCallback(this);
            }
            C1988t.m8376d0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C1135a.m4419e(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f3024I;
        if (drawable != null && drawable.isVisible() != z) {
            this.f3024I.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3463t(View view, Rect rect) {
        C1096b.m4291a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3464u(View view, int i, Rect rect, Rect rect2) {
        C1090f fVar = (C1090f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m4195v(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m4193e(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3024I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3466x(View view, Rect rect) {
        rect.set(((C1090f) view.getLayoutParams()).mo3509h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C1090f mo3467y(View view) {
        C1090f fVar = (C1090f) view.getLayoutParams();
        if (!fVar.f3039b) {
            if (view instanceof C1086b) {
                C1087c behavior = ((C1086b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.mo3515o(behavior);
            } else {
                C1088d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C1088d) cls.getAnnotation(C1088d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo3515o((C1087c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            fVar.f3039b = true;
        }
        return fVar;
    }
}
