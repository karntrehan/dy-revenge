package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.view.menu.C0128i;
import androidx.appcompat.view.menu.C0139m;
import androidx.appcompat.view.menu.C0141n;
import androidx.appcompat.widget.C0229i0;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;

public class ActionMenuView extends C0229i0 implements C0124g.C0126b, C0141n {

    /* renamed from: C */
    private C0124g f695C;

    /* renamed from: D */
    private Context f696D;

    /* renamed from: E */
    private int f697E;

    /* renamed from: F */
    private boolean f698F;

    /* renamed from: G */
    private C0201c f699G;

    /* renamed from: H */
    private C0139m.C0140a f700H;

    /* renamed from: I */
    C0124g.C0125a f701I;

    /* renamed from: J */
    private boolean f702J;

    /* renamed from: K */
    private int f703K;

    /* renamed from: L */
    private int f704L;

    /* renamed from: M */
    private int f705M;

    /* renamed from: N */
    C0160e f706N;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0156a {
        /* renamed from: a */
        boolean mo426a();

        /* renamed from: b */
        boolean mo427b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0157b implements C0139m.C0140a {
        C0157b() {
        }

        /* renamed from: c */
        public void mo326c(C0124g gVar, boolean z) {
        }

        /* renamed from: d */
        public boolean mo327d(C0124g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0158c extends C0229i0.C0230a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f707c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f708d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f709e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f710f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f711g;

        /* renamed from: h */
        boolean f712h;

        public C0158c(int i, int i2) {
            super(i, i2);
            this.f707c = false;
        }

        public C0158c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0158c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0158c(C0158c cVar) {
            super(cVar);
            this.f707c = cVar.f707c;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0159d implements C0124g.C0125a {
        C0159d() {
        }

        /* renamed from: a */
        public boolean mo299a(C0124g gVar, MenuItem menuItem) {
            C0160e eVar = ActionMenuView.this.f706N;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        /* renamed from: b */
        public void mo301b(C0124g gVar) {
            C0124g.C0125a aVar = ActionMenuView.this.f701I;
            if (aVar != null) {
                aVar.mo301b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0160e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f704L = (int) (56.0f * f);
        this.f705M = (int) (f * 4.0f);
        this.f696D = context;
        this.f697E = 0;
    }

    /* renamed from: L */
    static int m823L(View view, int i, int i2, int i3, int i4) {
        C0158c cVar = (C0158c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo431h();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f707c || !z2) {
            z = false;
        }
        cVar.f710f = z;
        cVar.f708d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: M */
    private void m824M(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f704L;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z6) {
                    int i19 = this.f705M;
                    i6 = i18;
                    z4 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z4 = false;
                }
                C0158c cVar = (C0158c) childAt.getLayoutParams();
                cVar.f712h = z4;
                cVar.f709e = z4 ? 1 : 0;
                cVar.f708d = z4;
                cVar.f710f = z4;
                cVar.leftMargin = z4;
                cVar.rightMargin = z4;
                cVar.f711g = z6 && ((ActionMenuItemView) childAt).mo431h();
                int L = m823L(childAt, i11, cVar.f707c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, L);
                if (cVar.f710f) {
                    i16++;
                }
                if (cVar.f707c) {
                    z5 = true;
                }
                i9 -= L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z = z8;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z9 = z8;
                    C0158c cVar2 = (C0158c) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (cVar2.f710f) {
                        int i26 = cVar2.f708d;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z8 = z9;
                }
                z = z8;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    C0158c cVar3 = (C0158c) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f708d == i27) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !cVar3.f711g || i9 != 1) {
                            z3 = z7;
                        } else {
                            int i31 = this.f705M;
                            z3 = z7;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        cVar3.f708d++;
                        cVar3.f712h = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z7 = z3;
                }
                i12 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z10 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C0158c) getChildAt(0).getLayoutParams()).f711g) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((C0158c) getChildAt(i32).getLayoutParams()).f711g) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z2 = z;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    C0158c cVar4 = (C0158c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f709e = i33;
                        cVar4.f712h = true;
                        if (i34 == 0 && !cVar4.f711g) {
                            cVar4.leftMargin = (-i33) / 2;
                        }
                    } else if (cVar4.f707c) {
                        cVar4.f709e = i33;
                        cVar4.f712h = true;
                        cVar4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            cVar4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            cVar4.rightMargin = i33 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                C0158c cVar5 = (C0158c) childAt4.getLayoutParams();
                if (cVar5.f712h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f708d * i11) + cVar5.f709e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    /* renamed from: B */
    public void mo960B() {
        C0201c cVar = this.f699G;
        if (cVar != null) {
            cVar.mo1269y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C0158c mo982m() {
        C0158c cVar = new C0158c(-2, -2);
        cVar.f1007b = 16;
        return cVar;
    }

    /* renamed from: D */
    public C0158c mo983n(AttributeSet attributeSet) {
        return new C0158c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C0158c mo984o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo982m();
        }
        C0158c cVar = layoutParams instanceof C0158c ? new C0158c((C0158c) layoutParams) : new C0158c(layoutParams);
        if (cVar.f1007b <= 0) {
            cVar.f1007b = 16;
        }
        return cVar;
    }

    /* renamed from: F */
    public C0158c mo964F() {
        C0158c C = mo982m();
        C.f707c = true;
        return C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo965G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0156a)) {
            z = false | ((C0156a) childAt).mo426a();
        }
        return (i <= 0 || !(childAt2 instanceof C0156a)) ? z : z | ((C0156a) childAt2).mo427b();
    }

    /* renamed from: H */
    public boolean mo966H() {
        C0201c cVar = this.f699G;
        return cVar != null && cVar.mo1259B();
    }

    /* renamed from: I */
    public boolean mo967I() {
        C0201c cVar = this.f699G;
        return cVar != null && cVar.mo1261D();
    }

    /* renamed from: J */
    public boolean mo968J() {
        C0201c cVar = this.f699G;
        return cVar != null && cVar.mo1262E();
    }

    /* renamed from: K */
    public boolean mo969K() {
        return this.f698F;
    }

    /* renamed from: N */
    public C0124g mo970N() {
        return this.f695C;
    }

    /* renamed from: O */
    public void mo971O(C0139m.C0140a aVar, C0124g.C0125a aVar2) {
        this.f700H = aVar;
        this.f701I = aVar2;
    }

    /* renamed from: P */
    public boolean mo972P() {
        C0201c cVar = this.f699G;
        return cVar != null && cVar.mo1268K();
    }

    /* renamed from: a */
    public boolean mo448a(C0128i iVar) {
        return this.f695C.mo595L(iVar, 0);
    }

    /* renamed from: b */
    public void mo449b(C0124g gVar) {
        this.f695C = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0158c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f695C == null) {
            Context context = getContext();
            C0124g gVar = new C0124g(context);
            this.f695C = gVar;
            gVar.mo600R(new C0159d());
            C0201c cVar = new C0201c(context);
            this.f699G = cVar;
            cVar.mo1267J(true);
            C0201c cVar2 = this.f699G;
            C0139m.C0140a aVar = this.f700H;
            if (aVar == null) {
                aVar = new C0157b();
            }
            cVar2.mo528h(aVar);
            this.f695C.mo620c(this.f699G, this.f696D);
            this.f699G.mo1265H(this);
        }
        return this.f695C;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f699G.mo1258A();
    }

    public int getPopupTheme() {
        return this.f697E;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0201c cVar = this.f699G;
        if (cVar != null) {
            cVar.mo525d(false);
            if (this.f699G.mo1262E()) {
                this.f699G.mo1259B();
                this.f699G.mo1268K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo960B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f702J) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0213d1.m1104b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0158c cVar = (C0158c) childAt.getLayoutParams();
                if (cVar.f707c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo965G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo965G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0158c cVar2 = (C0158c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f707c) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0158c cVar3 = (C0158c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f707c) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0124g gVar;
        boolean z = this.f702J;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f702J = z2;
        if (z != z2) {
            this.f703K = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f702J || (gVar = this.f695C) == null || size == this.f703K)) {
            this.f703K = size;
            gVar.mo594K(true);
        }
        int childCount = getChildCount();
        if (!this.f702J || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0158c cVar = (C0158c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m824M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f699G.mo1264G(z);
    }

    public void setOnMenuItemClickListener(C0160e eVar) {
        this.f706N = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f699G.mo1266I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f698F = z;
    }

    public void setPopupTheme(int i) {
        if (this.f697E != i) {
            this.f697E = i;
            if (i == 0) {
                this.f696D = getContext();
            } else {
                this.f696D = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0201c cVar) {
        this.f699G = cVar;
        cVar.mo1265H(this);
    }
}
