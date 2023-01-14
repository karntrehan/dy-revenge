package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p027c.p064i.p068f.C1847a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p064i.p072j.p073g0.C1965f;
import p027c.p077k.p078a.C2019a;
import p027c.p077k.p079b.C2030c;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9017d;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p379x.C9062c;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C1087c<V> {

    /* renamed from: a */
    private static final int f11610a = C9023j.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    int f11611A;

    /* renamed from: B */
    int f11612B;

    /* renamed from: C */
    WeakReference<V> f11613C;

    /* renamed from: D */
    WeakReference<View> f11614D;

    /* renamed from: E */
    private final ArrayList<C4168e> f11615E = new ArrayList<>();

    /* renamed from: F */
    private VelocityTracker f11616F;

    /* renamed from: G */
    int f11617G;

    /* renamed from: H */
    private int f11618H;

    /* renamed from: I */
    boolean f11619I;

    /* renamed from: J */
    private Map<View, Integer> f11620J;

    /* renamed from: K */
    private final C2030c.C2033c f11621K = new C4166c();

    /* renamed from: b */
    private int f11622b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f11623c = true;

    /* renamed from: d */
    private float f11624d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f11625e;

    /* renamed from: f */
    private boolean f11626f;

    /* renamed from: g */
    private int f11627g;

    /* renamed from: h */
    private boolean f11628h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8990g f11629i;

    /* renamed from: j */
    private C8997k f11630j;

    /* renamed from: k */
    private boolean f11631k;

    /* renamed from: l */
    private BottomSheetBehavior<V>.g f11632l = null;

    /* renamed from: m */
    private ValueAnimator f11633m;

    /* renamed from: n */
    int f11634n;

    /* renamed from: o */
    int f11635o;

    /* renamed from: p */
    int f11636p;

    /* renamed from: q */
    float f11637q = 0.5f;

    /* renamed from: r */
    int f11638r;

    /* renamed from: s */
    float f11639s = -1.0f;

    /* renamed from: t */
    boolean f11640t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f11641u;

    /* renamed from: v */
    int f11642v = 4;

    /* renamed from: w */
    C2030c f11643w;

    /* renamed from: x */
    private boolean f11644x;

    /* renamed from: y */
    private int f11645y;

    /* renamed from: z */
    private boolean f11646z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C4164a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f11647f;

        /* renamed from: o */
        final /* synthetic */ int f11648o;

        C4164a(View view, int i) {
            this.f11647f = view;
            this.f11648o = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo12744i0(this.f11647f, this.f11648o);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C4165b implements ValueAnimator.AnimatorUpdateListener {
        C4165b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f11629i != null) {
                BottomSheetBehavior.this.f11629i.mo22820U(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C4166c extends C2030c.C2033c {
        C4166c() {
        }

        /* renamed from: a */
        public int mo6782a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo6783b(View view, int i, int i2) {
            int G = BottomSheetBehavior.this.m15726T();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C1847a.m7858b(i, G, bottomSheetBehavior.f11640t ? bottomSheetBehavior.f11612B : bottomSheetBehavior.f11638r);
        }

        /* renamed from: e */
        public int mo6786e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f11640t ? bottomSheetBehavior.f11612B : bottomSheetBehavior.f11638r;
        }

        /* renamed from: j */
        public void mo6791j(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo12743h0(1);
            }
        }

        /* renamed from: k */
        public void mo6792k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo12731Q(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            if (java.lang.Math.abs(r8 - r6.f11651a.f11636p) < java.lang.Math.abs(r8 - r6.f11651a.f11638r)) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
            if (java.lang.Math.abs(r8 - r6.f11651a.f11635o) < java.lang.Math.abs(r8 - r6.f11651a.f11638r)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f11651a.f11638r)) goto L_0x0086;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo6793l(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r0 = 0
                r1 = 4
                r2 = 6
                r3 = 3
                int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r4 >= 0) goto L_0x0026
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f11623c
                if (r8 == 0) goto L_0x0017
            L_0x0010:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f11635o
            L_0x0014:
                r1 = 3
                goto L_0x00d7
            L_0x0017:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f11636p
                if (r8 <= r0) goto L_0x0023
                r8 = r0
                goto L_0x008a
            L_0x0023:
                int r8 = r9.f11634n
                goto L_0x0014
            L_0x0026:
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r4.f11640t
                if (r5 == 0) goto L_0x004f
                boolean r4 = r4.mo12745k0(r7, r9)
                if (r4 == 0) goto L_0x004f
                int r4 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r5 = r5.f11638r
                if (r4 > r5) goto L_0x0048
                float r4 = java.lang.Math.abs(r8)
                float r5 = java.lang.Math.abs(r9)
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 >= 0) goto L_0x004f
            L_0x0048:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f11612B
                r1 = 5
                goto L_0x00d7
            L_0x004f:
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x008c
                float r8 = java.lang.Math.abs(r8)
                float r9 = java.lang.Math.abs(r9)
                int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r8 <= 0) goto L_0x0060
                goto L_0x008c
            L_0x0060:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.f11623c
                if (r8 == 0) goto L_0x006d
            L_0x0068:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f11638r
                goto L_0x00d7
            L_0x006d:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f11636p
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f11638r
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0068
            L_0x0086:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f11636p
            L_0x008a:
                r1 = 6
                goto L_0x00d7
            L_0x008c:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f11623c
                if (r9 == 0) goto L_0x00af
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f11635o
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f11638r
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0068
                goto L_0x0010
            L_0x00af:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f11636p
                if (r8 >= r0) goto L_0x00c5
                int r9 = r9.f11638r
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x0086
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f11634n
                goto L_0x0014
            L_0x00c5:
                int r9 = r8 - r0
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f11638r
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0068
                goto L_0x0086
            L_0x00d7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r0 = 1
                r9.mo12746l0(r7, r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C4166c.mo6793l(android.view.View, float, float):void");
        }

        /* renamed from: m */
        public boolean mo6794m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f11642v;
            if (i2 == 1 || bottomSheetBehavior.f11619I) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f11617G == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f11614D;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f11613C;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C4167d implements C1965f {

        /* renamed from: a */
        final /* synthetic */ int f11652a;

        C4167d(int i) {
            this.f11652a = i;
        }

        /* renamed from: a */
        public boolean mo6639a(View view, C1965f.C1966a aVar) {
            BottomSheetBehavior.this.mo12742g0(this.f11652a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static abstract class C4168e {
        /* renamed from: a */
        public abstract void mo12749a(View view, float f);

        /* renamed from: b */
        public abstract void mo12750b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    protected static class C4169f extends C2019a {
        public static final Parcelable.Creator<C4169f> CREATOR = new C4170a();

        /* renamed from: p */
        final int f11654p;

        /* renamed from: q */
        int f11655q;

        /* renamed from: r */
        boolean f11656r;

        /* renamed from: s */
        boolean f11657s;

        /* renamed from: t */
        boolean f11658t;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f$a */
        static class C4170a implements Parcelable.ClassLoaderCreator<C4169f> {
            C4170a() {
            }

            /* renamed from: a */
            public C4169f createFromParcel(Parcel parcel) {
                return new C4169f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C4169f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4169f(parcel, classLoader);
            }

            /* renamed from: c */
            public C4169f[] newArray(int i) {
                return new C4169f[i];
            }
        }

        public C4169f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11654p = parcel.readInt();
            this.f11655q = parcel.readInt();
            boolean z = false;
            this.f11656r = parcel.readInt() == 1;
            this.f11657s = parcel.readInt() == 1;
            this.f11658t = parcel.readInt() == 1 ? true : z;
        }

        public C4169f(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f11654p = bottomSheetBehavior.f11642v;
            this.f11655q = bottomSheetBehavior.f11625e;
            this.f11656r = bottomSheetBehavior.f11623c;
            this.f11657s = bottomSheetBehavior.f11640t;
            this.f11658t = bottomSheetBehavior.f11641u;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11654p);
            parcel.writeInt(this.f11655q);
            parcel.writeInt(this.f11656r ? 1 : 0);
            parcel.writeInt(this.f11657s ? 1 : 0);
            parcel.writeInt(this.f11658t ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    private class C4171g implements Runnable {

        /* renamed from: f */
        private final View f11659f;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public boolean f11660o;

        /* renamed from: p */
        int f11661p;

        C4171g(View view, int i) {
            this.f11659f = view;
            this.f11661p = i;
        }

        public void run() {
            C2030c cVar = BottomSheetBehavior.this.f11643w;
            if (cVar == null || !cVar.mo6774m(true)) {
                BottomSheetBehavior.this.mo12743h0(this.f11661p);
            } else {
                C1988t.m8378e0(this.f11659f, this);
            }
            this.f11660o = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9024k.f24558F);
        this.f11628h = obtainStyledAttributes.hasValue(C9024k.f24608P);
        int i2 = C9024k.f24568H;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            m15723O(context, attributeSet, hasValue, C9062c.m30197a(context, obtainStyledAttributes, i2));
        } else {
            m15722N(context, attributeSet, hasValue);
        }
        m15724P();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f11639s = obtainStyledAttributes.getDimension(C9024k.f24563G, -1.0f);
        }
        int i3 = C9024k.f24593M;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i3);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo12738c0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        } else {
            mo12738c0(i);
        }
        mo12737b0(obtainStyledAttributes.getBoolean(C9024k.f24588L, false));
        mo12735Z(obtainStyledAttributes.getBoolean(C9024k.f24578J, true));
        mo12741f0(obtainStyledAttributes.getBoolean(C9024k.f24603O, false));
        mo12740e0(obtainStyledAttributes.getInt(C9024k.f24598N, 0));
        mo12736a0(obtainStyledAttributes.getFloat(C9024k.f24583K, 0.5f));
        mo12734Y(obtainStyledAttributes.getInt(C9024k.f24573I, 0));
        obtainStyledAttributes.recycle();
        this.f11624d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: J */
    private void m15719J(V v, C1955c.C1956a aVar, int i) {
        C1988t.m8386i0(v, aVar, (CharSequence) null, new C4167d(i));
    }

    /* renamed from: L */
    private void m15720L() {
        int max = this.f11626f ? Math.max(this.f11627g, this.f11612B - ((this.f11611A * 9) / 16)) : this.f11625e;
        if (this.f11623c) {
            this.f11638r = Math.max(this.f11612B - max, this.f11635o);
        } else {
            this.f11638r = this.f11612B - max;
        }
    }

    /* renamed from: M */
    private void m15721M() {
        this.f11636p = (int) (((float) this.f11612B) * (1.0f - this.f11637q));
    }

    /* renamed from: N */
    private void m15722N(Context context, AttributeSet attributeSet, boolean z) {
        m15723O(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: O */
    private void m15723O(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f11628h) {
            this.f11630j = C8997k.m29998e(context, attributeSet, C9013b.bottomSheetStyle, f11610a).mo22872m();
            C8990g gVar = new C8990g(this.f11630j);
            this.f11629i = gVar;
            gVar.mo22815L(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f11629i.setTint(typedValue.data);
                return;
            }
            this.f11629i.mo22819T(colorStateList);
        }
    }

    /* renamed from: P */
    private void m15724P() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f11633m = ofFloat;
        ofFloat.setDuration(500);
        this.f11633m.addUpdateListener(new C4165b());
    }

    /* renamed from: S */
    public static <V extends View> BottomSheetBehavior<V> m15725S(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C1090f) {
            CoordinatorLayout.C1087c f = ((CoordinatorLayout.C1090f) layoutParams).mo3507f();
            if (f instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public int m15726T() {
        return this.f11623c ? this.f11635o : this.f11634n;
    }

    /* renamed from: V */
    private float m15727V() {
        VelocityTracker velocityTracker = this.f11616F;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f11624d);
        return this.f11616F.getYVelocity(this.f11617G);
    }

    /* renamed from: W */
    private void m15728W() {
        this.f11617G = -1;
        VelocityTracker velocityTracker = this.f11616F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11616F = null;
        }
    }

    /* renamed from: X */
    private void m15729X(C4169f fVar) {
        int i = this.f11622b;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f11625e = fVar.f11655q;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f11623c = fVar.f11656r;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f11640t = fVar.f11657s;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f11641u = fVar.f11658t;
            }
        }
    }

    /* renamed from: j0 */
    private void m15730j0(int i) {
        View view = (View) this.f11613C.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C1988t.m8359Q(view)) {
                mo12744i0(view, i);
            } else {
                view.post(new C4164a(view, i));
            }
        }
    }

    /* renamed from: m0 */
    private void m15731m0() {
        View view;
        C1955c.C1956a aVar;
        WeakReference<V> weakReference = this.f11613C;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C1988t.m8382g0(view, 524288);
            C1988t.m8382g0(view, 262144);
            C1988t.m8382g0(view, 1048576);
            if (this.f11640t && this.f11642v != 5) {
                m15719J(view, C1955c.C1956a.f5723u, 5);
            }
            int i = this.f11642v;
            int i2 = 6;
            if (i == 3) {
                if (this.f11623c) {
                    i2 = 4;
                }
                aVar = C1955c.C1956a.f5722t;
            } else if (i == 4) {
                if (this.f11623c) {
                    i2 = 3;
                }
                aVar = C1955c.C1956a.f5721s;
            } else if (i == 6) {
                m15719J(view, C1955c.C1956a.f5722t, 4);
                m15719J(view, C1955c.C1956a.f5721s, 3);
                return;
            } else {
                return;
            }
            m15719J(view, aVar, i2);
        }
    }

    /* renamed from: n0 */
    private void m15732n0(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f11631k != z) {
                this.f11631k = z;
                if (this.f11629i != null && (valueAnimator = this.f11633m) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f11633m.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f11633m.setFloatValues(new float[]{1.0f - f, f});
                    this.f11633m.start();
                }
            }
        }
    }

    /* renamed from: o0 */
    private void m15733o0(boolean z) {
        int i;
        WeakReference<V> weakReference = this.f11613C;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f11620J == null) {
                        this.f11620J = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f11613C.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.f11620J;
                            if (map != null && map.containsKey(childAt)) {
                                i = this.f11620J.get(childAt).intValue();
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f11620J.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            i = 4;
                        }
                        C1988t.m8414w0(childAt, i);
                    }
                }
                if (!z) {
                    this.f11620J = null;
                }
            }
        }
    }

    /* renamed from: A */
    public boolean mo3469A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f11645y = 0;
        this.f11646z = false;
        return (i & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f11638r)) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (java.lang.Math.abs(r3 - r2.f11636p) < java.lang.Math.abs(r3 - r2.f11638r)) goto L_0x009b;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3471C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m15726T()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.mo12743h0(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f11614D
            if (r3 == 0) goto L_0x00a4
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00a4
            boolean r3 = r2.f11646z
            if (r3 != 0) goto L_0x001f
            goto L_0x00a4
        L_0x001f:
            int r3 = r2.f11645y
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L_0x002b
            int r3 = r2.m15726T()
            goto L_0x009e
        L_0x002b:
            boolean r3 = r2.f11640t
            if (r3 == 0) goto L_0x003d
            float r3 = r2.m15727V()
            boolean r3 = r2.mo12745k0(r4, r3)
            if (r3 == 0) goto L_0x003d
            int r3 = r2.f11612B
            r0 = 5
            goto L_0x009e
        L_0x003d:
            int r3 = r2.f11645y
            if (r3 != 0) goto L_0x007e
            int r3 = r4.getTop()
            boolean r1 = r2.f11623c
            if (r1 == 0) goto L_0x005d
            int r5 = r2.f11635o
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f11638r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0082
            int r3 = r2.f11635o
            goto L_0x009e
        L_0x005d:
            int r1 = r2.f11636p
            if (r3 >= r1) goto L_0x006e
            int r6 = r2.f11638r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L_0x009b
            int r3 = r2.f11634n
            goto L_0x009e
        L_0x006e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f11638r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0082
            goto L_0x009b
        L_0x007e:
            boolean r3 = r2.f11623c
            if (r3 == 0) goto L_0x0086
        L_0x0082:
            int r3 = r2.f11638r
            r0 = 4
            goto L_0x009e
        L_0x0086:
            int r3 = r4.getTop()
            int r0 = r2.f11636p
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f11638r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0082
        L_0x009b:
            int r3 = r2.f11636p
            r0 = 6
        L_0x009e:
            r5 = 0
            r2.mo12746l0(r4, r0, r3, r5)
            r2.f11646z = r5
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3471C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: D */
    public boolean mo3472D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11642v == 1 && actionMasked == 0) {
            return true;
        }
        C2030c cVar = this.f11643w;
        if (cVar != null) {
            cVar.mo6762E(motionEvent);
        }
        if (actionMasked == 0) {
            m15728W();
        }
        if (this.f11616F == null) {
            this.f11616F = VelocityTracker.obtain();
        }
        this.f11616F.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f11644x && Math.abs(((float) this.f11618H) - motionEvent.getY()) > ((float) this.f11643w.mo6778y())) {
            this.f11643w.mo6771b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f11644x;
    }

    /* renamed from: K */
    public void mo12730K(C4168e eVar) {
        if (!this.f11615E.contains(eVar)) {
            this.f11615E.add(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo12731Q(int i) {
        float f;
        float f2;
        View view = (View) this.f11613C.get();
        if (view != null && !this.f11615E.isEmpty()) {
            int i2 = this.f11638r;
            if (i > i2) {
                f = (float) (i2 - i);
                f2 = (float) (this.f11612B - i2);
            } else {
                f = (float) (i2 - i);
                f2 = (float) (i2 - m15726T());
            }
            float f3 = f / f2;
            for (int i3 = 0; i3 < this.f11615E.size(); i3++) {
                this.f11615E.get(i3).mo12749a(view, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public View mo12732R(View view) {
        if (C1988t.m8362T(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View R = mo12732R(viewGroup.getChildAt(i));
            if (R != null) {
                return R;
            }
        }
        return null;
    }

    /* renamed from: U */
    public int mo12733U() {
        return this.f11642v;
    }

    /* renamed from: Y */
    public void mo12734Y(int i) {
        if (i >= 0) {
            this.f11634n = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: Z */
    public void mo12735Z(boolean z) {
        if (this.f11623c != z) {
            this.f11623c = z;
            if (this.f11613C != null) {
                m15720L();
            }
            mo12743h0((!this.f11623c || this.f11642v != 6) ? this.f11642v : 3);
            m15731m0();
        }
    }

    /* renamed from: a0 */
    public void mo12736a0(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f11637q = f;
    }

    /* renamed from: b0 */
    public void mo12737b0(boolean z) {
        if (this.f11640t != z) {
            this.f11640t = z;
            if (!z && this.f11642v == 5) {
                mo12742g0(4);
            }
            m15731m0();
        }
    }

    /* renamed from: c0 */
    public void mo12738c0(int i) {
        mo12739d0(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12739d0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f11626f
            if (r4 != 0) goto L_0x0015
            r3.f11626f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f11626f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f11625e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f11626f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f11625e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f11613C
            if (r4 == 0) goto L_0x0042
            r3.m15720L()
            int r4 = r3.f11642v
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f11613C
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.f11642v
            r3.m15730j0(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo12739d0(int, boolean):void");
    }

    /* renamed from: e0 */
    public void mo12740e0(int i) {
        this.f11622b = i;
    }

    /* renamed from: f0 */
    public void mo12741f0(boolean z) {
        this.f11641u = z;
    }

    /* renamed from: g */
    public void mo3479g(CoordinatorLayout.C1090f fVar) {
        super.mo3479g(fVar);
        this.f11613C = null;
        this.f11643w = null;
    }

    /* renamed from: g0 */
    public void mo12742g0(int i) {
        if (i != this.f11642v) {
            if (this.f11613C != null) {
                m15730j0(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f11640t && i == 5)) {
                this.f11642v = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo12743h0(int i) {
        View view;
        if (this.f11642v != i) {
            this.f11642v = i;
            WeakReference<V> weakReference = this.f11613C;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 6 || i == 3) {
                    m15733o0(true);
                } else if (i == 5 || i == 4) {
                    m15733o0(false);
                }
                m15732n0(i);
                for (int i2 = 0; i2 < this.f11615E.size(); i2++) {
                    this.f11615E.get(i2).mo12750b(view, i);
                }
                m15731m0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo12744i0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f11638r;
        } else if (i == 6) {
            int i4 = this.f11636p;
            if (!this.f11623c || i4 > (i3 = this.f11635o)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = m15726T();
        } else if (!this.f11640t || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f11612B;
        }
        mo12746l0(view, i, i2, false);
    }

    /* renamed from: j */
    public void mo3482j() {
        super.mo3482j();
        this.f11613C = null;
        this.f11643w = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3483k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r9.f11644x = r2
            return r1
        L_0x000b:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r9.m15728W()
        L_0x0014:
            android.view.VelocityTracker r3 = r9.f11616F
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f11616F = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r9.f11616F
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x002e
            r11 = 3
            if (r0 == r11) goto L_0x002e
            goto L_0x007c
        L_0x002e:
            r9.f11619I = r1
            r9.f11617G = r4
            boolean r11 = r9.f11644x
            if (r11 == 0) goto L_0x007c
            r9.f11644x = r1
            return r1
        L_0x0039:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f11618H = r7
            int r7 = r9.f11642v
            if (r7 == r5) goto L_0x006b
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f11614D
            if (r7 == 0) goto L_0x0054
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 == 0) goto L_0x006b
            int r8 = r9.f11618H
            boolean r7 = r10.mo3417B(r7, r6, r8)
            if (r7 == 0) goto L_0x006b
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f11617G = r7
            r9.f11619I = r2
        L_0x006b:
            int r7 = r9.f11617G
            if (r7 != r4) goto L_0x0079
            int r4 = r9.f11618H
            boolean r11 = r10.mo3417B(r11, r6, r4)
            if (r11 != 0) goto L_0x0079
            r11 = 1
            goto L_0x007a
        L_0x0079:
            r11 = 0
        L_0x007a:
            r9.f11644x = r11
        L_0x007c:
            boolean r11 = r9.f11644x
            if (r11 != 0) goto L_0x008b
            c.k.b.c r11 = r9.f11643w
            if (r11 == 0) goto L_0x008b
            boolean r11 = r11.mo6767N(r12)
            if (r11 == 0) goto L_0x008b
            return r2
        L_0x008b:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f11614D
            if (r11 == 0) goto L_0x0096
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0096:
            if (r0 != r5) goto L_0x00ce
            if (r3 == 0) goto L_0x00ce
            boolean r11 = r9.f11644x
            if (r11 != 0) goto L_0x00ce
            int r11 = r9.f11642v
            if (r11 == r2) goto L_0x00ce
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo3417B(r3, r11, r0)
            if (r10 != 0) goto L_0x00ce
            c.k.b.c r10 = r9.f11643w
            if (r10 == 0) goto L_0x00ce
            int r10 = r9.f11618H
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            c.k.b.c r11 = r9.f11643w
            int r11 = r11.mo6778y()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3483k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public boolean mo12745k0(View view, float f) {
        if (this.f11641u) {
            return true;
        }
        return view.getTop() >= this.f11638r && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f11638r)) / ((float) this.f11625e) > 0.5f;
    }

    /* renamed from: l */
    public boolean mo3484l(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        C8990g gVar;
        if (C1988t.m8411v(coordinatorLayout) && !C1988t.m8411v(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f11613C == null) {
            this.f11627g = coordinatorLayout.getResources().getDimensionPixelSize(C9017d.design_bottom_sheet_peek_height_min);
            this.f11613C = new WeakReference<>(v);
            if (this.f11628h && (gVar = this.f11629i) != null) {
                C1988t.m8400p0(v, gVar);
            }
            C8990g gVar2 = this.f11629i;
            if (gVar2 != null) {
                float f = this.f11639s;
                if (f == -1.0f) {
                    f = C1988t.m8407t(v);
                }
                gVar2.mo22818S(f);
                boolean z = this.f11642v == 3;
                this.f11631k = z;
                this.f11629i.mo22820U(z ? 0.0f : 1.0f);
            }
            m15731m0();
            if (C1988t.m8413w(v) == 0) {
                C1988t.m8414w0(v, 1);
            }
        }
        if (this.f11643w == null) {
            this.f11643w = C2030c.m8601o(coordinatorLayout, this.f11621K);
        }
        int top = v.getTop();
        coordinatorLayout.mo3420I(v, i);
        this.f11611A = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f11612B = height;
        this.f11635o = Math.max(0, height - v.getHeight());
        m15721M();
        m15720L();
        int i3 = this.f11642v;
        if (i3 == 3) {
            i2 = m15726T();
        } else if (i3 == 6) {
            i2 = this.f11636p;
        } else if (this.f11640t && i3 == 5) {
            i2 = this.f11612B;
        } else if (i3 == 4) {
            i2 = this.f11638r;
        } else {
            if (i3 == 1 || i3 == 2) {
                C1988t.m8367Y(v, top - v.getTop());
            }
            this.f11614D = new WeakReference<>(mo12732R(v));
            return true;
        }
        C1988t.m8367Y(v, i2);
        this.f11614D = new WeakReference<>(mo12732R(v));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo12746l0(View view, int i, int i2, boolean z) {
        if (z ? this.f11643w.mo6766M(view.getLeft(), i2) : this.f11643w.mo6768O(view, view.getLeft(), i2)) {
            mo12743h0(2);
            m15732n0(i);
            if (this.f11632l == null) {
                this.f11632l = new C4171g(view, i);
            }
            if (!this.f11632l.f11660o) {
                BottomSheetBehavior<V>.g gVar = this.f11632l;
                gVar.f11661p = i;
                C1988t.m8378e0(view, gVar);
                boolean unused = this.f11632l.f11660o = true;
                return;
            }
            this.f11632l.f11661p = i;
            return;
        }
        mo12743h0(i);
    }

    /* renamed from: o */
    public boolean mo3487o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f11614D;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f11642v != 3 || super.mo3487o(coordinatorLayout, v, view, f, f2);
    }

    /* renamed from: q */
    public void mo3489q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f11614D;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i5 = top - i2;
                if (i2 <= 0) {
                    if (i2 < 0 && !view.canScrollVertically(-1)) {
                        int i6 = this.f11638r;
                        if (i5 <= i6 || this.f11640t) {
                            iArr[1] = i2;
                            C1988t.m8367Y(v, -i2);
                            mo12743h0(1);
                        } else {
                            iArr[1] = top - i6;
                            C1988t.m8367Y(v, -iArr[1]);
                            i4 = 4;
                        }
                    }
                    mo12731Q(v.getTop());
                    this.f11645y = i2;
                    this.f11646z = true;
                } else if (i5 < m15726T()) {
                    iArr[1] = top - m15726T();
                    C1988t.m8367Y(v, -iArr[1]);
                    i4 = 3;
                } else {
                    iArr[1] = i2;
                    C1988t.m8367Y(v, -i2);
                    mo12743h0(1);
                    mo12731Q(v.getTop());
                    this.f11645y = i2;
                    this.f11646z = true;
                }
                mo12743h0(i4);
                mo12731Q(v.getTop());
                this.f11645y = i2;
                this.f11646z = true;
            }
        }
    }

    /* renamed from: t */
    public void mo3492t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: x */
    public void mo3496x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C4169f fVar = (C4169f) parcelable;
        super.mo3496x(coordinatorLayout, v, fVar.mo6726a());
        m15729X(fVar);
        int i = fVar.f11654p;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.f11642v = i;
    }

    /* renamed from: y */
    public Parcelable mo3497y(CoordinatorLayout coordinatorLayout, V v) {
        return new C4169f(super.mo3497y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }
}
