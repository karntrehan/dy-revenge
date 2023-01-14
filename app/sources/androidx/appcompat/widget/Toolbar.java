package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0058a;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.view.menu.C0128i;
import androidx.appcompat.view.menu.C0139m;
import androidx.appcompat.view.menu.C0148r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p027c.p028a.C1435a;
import p027c.p028a.C1444j;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p028a.p035o.C1468c;
import p027c.p028a.p035o.C1473g;
import p027c.p064i.p072j.C1915d;
import p027c.p064i.p072j.C1952g;
import p027c.p064i.p072j.C1988t;
import p027c.p077k.p078a.C2019a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    int f804A;

    /* renamed from: B */
    private int f805B;

    /* renamed from: C */
    private int f806C;

    /* renamed from: D */
    private int f807D;

    /* renamed from: E */
    private int f808E;

    /* renamed from: F */
    private int f809F;

    /* renamed from: G */
    private C0257o0 f810G;

    /* renamed from: H */
    private int f811H;

    /* renamed from: I */
    private int f812I;

    /* renamed from: J */
    private int f813J;

    /* renamed from: K */
    private CharSequence f814K;

    /* renamed from: L */
    private CharSequence f815L;

    /* renamed from: M */
    private ColorStateList f816M;

    /* renamed from: N */
    private ColorStateList f817N;

    /* renamed from: O */
    private boolean f818O;

    /* renamed from: P */
    private boolean f819P;

    /* renamed from: Q */
    private final ArrayList<View> f820Q;

    /* renamed from: R */
    private final ArrayList<View> f821R;

    /* renamed from: S */
    private final int[] f822S;

    /* renamed from: T */
    C0185f f823T;

    /* renamed from: U */
    private final ActionMenuView.C0160e f824U;

    /* renamed from: V */
    private C0295y0 f825V;

    /* renamed from: W */
    private C0201c f826W;

    /* renamed from: a0 */
    private C0183d f827a0;

    /* renamed from: b0 */
    private C0139m.C0140a f828b0;

    /* renamed from: c0 */
    private C0124g.C0125a f829c0;

    /* renamed from: d0 */
    private boolean f830d0;

    /* renamed from: e0 */
    private final Runnable f831e0;

    /* renamed from: f */
    private ActionMenuView f832f;

    /* renamed from: o */
    private TextView f833o;

    /* renamed from: p */
    private TextView f834p;

    /* renamed from: q */
    private ImageButton f835q;

    /* renamed from: r */
    private ImageView f836r;

    /* renamed from: s */
    private Drawable f837s;

    /* renamed from: t */
    private CharSequence f838t;

    /* renamed from: u */
    ImageButton f839u;

    /* renamed from: v */
    View f840v;

    /* renamed from: w */
    private Context f841w;

    /* renamed from: x */
    private int f842x;

    /* renamed from: y */
    private int f843y;

    /* renamed from: z */
    private int f844z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0180a implements ActionMenuView.C0160e {
        C0180a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0185f fVar = Toolbar.this.f823T;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0181b implements Runnable {
        C0181b() {
        }

        public void run() {
            Toolbar.this.mo1113O();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0182c implements View.OnClickListener {
        C0182c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1117e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0183d implements C0139m {

        /* renamed from: f */
        C0124g f848f;

        /* renamed from: o */
        C0128i f849o;

        C0183d() {
        }

        /* renamed from: c */
        public void mo524c(C0124g gVar, boolean z) {
        }

        /* renamed from: d */
        public void mo525d(boolean z) {
            if (this.f849o != null) {
                C0124g gVar = this.f848f;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f848f.getItem(i) == this.f849o) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo526f(this.f848f, this.f849o);
                }
            }
        }

        /* renamed from: e */
        public boolean mo546e() {
            return false;
        }

        /* renamed from: f */
        public boolean mo526f(C0124g gVar, C0128i iVar) {
            View view = Toolbar.this.f840v;
            if (view instanceof C1468c) {
                ((C1468c) view).mo789f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f840v);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f839u);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f840v = null;
            toolbar3.mo1114a();
            this.f849o = null;
            Toolbar.this.requestLayout();
            iVar.mo696r(false);
            return true;
        }

        /* renamed from: g */
        public boolean mo527g(C0124g gVar, C0128i iVar) {
            Toolbar.this.mo1119g();
            ViewParent parent = Toolbar.this.f839u.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f839u);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f839u);
            }
            Toolbar.this.f840v = iVar.getActionView();
            this.f849o = iVar;
            ViewParent parent2 = Toolbar.this.f840v.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f840v);
                }
                C0184e m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f215a = 8388611 | (toolbar4.f804A & 112);
                m.f851b = 2;
                toolbar4.f840v.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f840v);
            }
            Toolbar.this.mo1107G();
            Toolbar.this.requestLayout();
            iVar.mo696r(true);
            View view = Toolbar.this.f840v;
            if (view instanceof C1468c) {
                ((C1468c) view).mo788c();
            }
            return true;
        }

        /* renamed from: i */
        public void mo529i(Context context, C0124g gVar) {
            C0128i iVar;
            C0124g gVar2 = this.f848f;
            if (!(gVar2 == null || (iVar = this.f849o) == null)) {
                gVar2.mo628f(iVar);
            }
            this.f848f = gVar;
        }

        /* renamed from: k */
        public boolean mo531k(C0148r rVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0184e extends C0058a.C0059a {

        /* renamed from: b */
        int f851b = 0;

        public C0184e(int i, int i2) {
            super(i, i2);
            this.f215a = 8388627;
        }

        public C0184e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0184e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0184e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo1201a(marginLayoutParams);
        }

        public C0184e(C0058a.C0059a aVar) {
            super(aVar);
        }

        public C0184e(C0184e eVar) {
            super((C0058a.C0059a) eVar);
            this.f851b = eVar.f851b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1201a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0185f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0186g extends C2019a {
        public static final Parcelable.Creator<C0186g> CREATOR = new C0187a();

        /* renamed from: p */
        int f852p;

        /* renamed from: q */
        boolean f853q;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        class C0187a implements Parcelable.ClassLoaderCreator<C0186g> {
            C0187a() {
            }

            /* renamed from: a */
            public C0186g createFromParcel(Parcel parcel) {
                return new C0186g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0186g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0186g(parcel, classLoader);
            }

            /* renamed from: c */
            public C0186g[] newArray(int i) {
                return new C0186g[i];
            }
        }

        public C0186g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f852p = parcel.readInt();
            this.f853q = parcel.readInt() != 0;
        }

        public C0186g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f852p);
            parcel.writeInt(this.f853q ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1435a.f4187M);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f813J = 8388627;
        this.f820Q = new ArrayList<>();
        this.f821R = new ArrayList<>();
        this.f822S = new int[2];
        this.f824U = new C0180a();
        this.f831e0 = new C0181b();
        Context context2 = getContext();
        int[] iArr = C1444j.f4383k3;
        C0292x0 v = C0292x0.m1407v(context2, attributeSet, iArr, i, 0);
        C1988t.m8390k0(this, context, iArr, attributeSet, v.mo1801r(), i, 0);
        this.f843y = v.mo1797n(C1444j.f4264M3, 0);
        this.f844z = v.mo1797n(C1444j.f4219D3, 0);
        this.f813J = v.mo1795l(C1444j.f4388l3, this.f813J);
        this.f804A = v.mo1795l(C1444j.f4393m3, 48);
        int e = v.mo1788e(C1444j.f4234G3, 0);
        int i2 = C1444j.f4259L3;
        e = v.mo1802s(i2) ? v.mo1788e(i2, e) : e;
        this.f809F = e;
        this.f808E = e;
        this.f807D = e;
        this.f806C = e;
        int e2 = v.mo1788e(C1444j.f4249J3, -1);
        if (e2 >= 0) {
            this.f806C = e2;
        }
        int e3 = v.mo1788e(C1444j.f4244I3, -1);
        if (e3 >= 0) {
            this.f807D = e3;
        }
        int e4 = v.mo1788e(C1444j.f4254K3, -1);
        if (e4 >= 0) {
            this.f808E = e4;
        }
        int e5 = v.mo1788e(C1444j.f4239H3, -1);
        if (e5 >= 0) {
            this.f809F = e5;
        }
        this.f805B = v.mo1789f(C1444j.f4448x3, -1);
        int e6 = v.mo1788e(C1444j.f4428t3, RecyclerView.UNDEFINED_DURATION);
        int e7 = v.mo1788e(C1444j.f4408p3, RecyclerView.UNDEFINED_DURATION);
        int f = v.mo1789f(C1444j.f4418r3, 0);
        int f2 = v.mo1789f(C1444j.f4423s3, 0);
        m922h();
        this.f810G.mo1589e(f, f2);
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            this.f810G.mo1591g(e6, e7);
        }
        this.f811H = v.mo1788e(C1444j.f4433u3, RecyclerView.UNDEFINED_DURATION);
        this.f812I = v.mo1788e(C1444j.f4413q3, RecyclerView.UNDEFINED_DURATION);
        this.f837s = v.mo1790g(C1444j.f4403o3);
        this.f838t = v.mo1799p(C1444j.f4398n3);
        CharSequence p = v.mo1799p(C1444j.f4229F3);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.mo1799p(C1444j.f4214C3);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.f841w = getContext();
        setPopupTheme(v.mo1797n(C1444j.f4209B3, 0));
        Drawable g = v.mo1790g(C1444j.f4204A3);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.mo1799p(C1444j.f4458z3);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.mo1790g(C1444j.f4438v3);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.mo1799p(C1444j.f4443w3);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = C1444j.f4269N3;
        if (v.mo1802s(i3)) {
            setTitleTextColor(v.mo1786c(i3));
        }
        int i4 = C1444j.f4224E3;
        if (v.mo1802s(i4)) {
            setSubtitleTextColor(v.mo1786c(i4));
        }
        int i5 = C1444j.f4453y3;
        if (v.mo1802s(i5)) {
            mo1197x(v.mo1797n(i5, 0));
        }
        v.mo1803w();
    }

    /* renamed from: B */
    private int m913B(View view, int i, int[] iArr, int i2) {
        C0184e eVar = (C0184e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = m928q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + eVar.rightMargin;
    }

    /* renamed from: C */
    private int m914C(View view, int i, int[] iArr, int i2) {
        C0184e eVar = (C0184e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = m928q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: D */
    private int m915D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: E */
    private void m916E(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: F */
    private void m917F() {
        removeCallbacks(this.f831e0);
        post(this.f831e0);
    }

    /* renamed from: M */
    private boolean m918M() {
        if (!this.f830d0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m919N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    private boolean m919N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m920b(List<View> list, int i) {
        boolean z = C1988t.m8417y(this) == 1;
        int childCount = getChildCount();
        int b = C1915d.m8012b(i, C1988t.m8417y(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0184e eVar = (C0184e) childAt.getLayoutParams();
                if (eVar.f851b == 0 && m919N(childAt) && m927p(eVar.f215a) == b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0184e eVar2 = (C0184e) childAt2.getLayoutParams();
            if (eVar2.f851b == 0 && m919N(childAt2) && m927p(eVar2.f215a) == b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m921c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0184e m = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0184e) layoutParams;
        m.f851b = 1;
        if (!z || this.f840v == null) {
            addView(view, m);
            return;
        }
        view.setLayoutParams(m);
        this.f821R.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new C1473g(getContext());
    }

    /* renamed from: h */
    private void m922h() {
        if (this.f810G == null) {
            this.f810G = new C0257o0();
        }
    }

    /* renamed from: i */
    private void m923i() {
        if (this.f836r == null) {
            this.f836r = new C0256o(getContext());
        }
    }

    /* renamed from: j */
    private void m924j() {
        m925k();
        if (this.f832f.mo970N() == null) {
            C0124g gVar = (C0124g) this.f832f.getMenu();
            if (this.f827a0 == null) {
                this.f827a0 = new C0183d();
            }
            this.f832f.setExpandedActionViewsExclusive(true);
            gVar.mo620c(this.f827a0, this.f841w);
        }
    }

    /* renamed from: k */
    private void m925k() {
        if (this.f832f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f832f = actionMenuView;
            actionMenuView.setPopupTheme(this.f842x);
            this.f832f.setOnMenuItemClickListener(this.f824U);
            this.f832f.mo971O(this.f828b0, this.f829c0);
            C0184e m = generateDefaultLayoutParams();
            m.f215a = 8388613 | (this.f804A & 112);
            this.f832f.setLayoutParams(m);
            m921c(this.f832f, false);
        }
    }

    /* renamed from: l */
    private void m926l() {
        if (this.f835q == null) {
            this.f835q = new C0246m(getContext(), (AttributeSet) null, C1435a.toolbarNavigationButtonStyle);
            C0184e m = generateDefaultLayoutParams();
            m.f215a = 8388611 | (this.f804A & 112);
            this.f835q.setLayoutParams(m);
        }
    }

    /* renamed from: p */
    private int m927p(int i) {
        int y = C1988t.m8417y(this);
        int b = C1915d.m8012b(i, y) & 7;
        return (b == 1 || b == 3 || b == 5) ? b : y == 1 ? 5 : 3;
    }

    /* renamed from: q */
    private int m928q(View view, int i) {
        C0184e eVar = (C0184e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = m929r(eVar.f215a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = eVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = eVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    private int m929r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f813J & 112;
    }

    /* renamed from: s */
    private int m930s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C1952g.m8184b(marginLayoutParams) + C1952g.m8183a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m931t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m932u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0184e eVar = (C0184e) view.getLayoutParams();
            int i5 = eVar.leftMargin - i;
            int i6 = eVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: y */
    private boolean m933y(View view) {
        return view.getParent() == this || this.f821R.contains(view);
    }

    /* renamed from: A */
    public boolean mo1106A() {
        ActionMenuView actionMenuView = this.f832f;
        return actionMenuView != null && actionMenuView.mo968J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo1107G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0184e) childAt.getLayoutParams()).f851b == 2 || childAt == this.f832f)) {
                removeViewAt(childCount);
                this.f821R.add(childAt);
            }
        }
    }

    /* renamed from: H */
    public void mo1108H(int i, int i2) {
        m922h();
        this.f810G.mo1591g(i, i2);
    }

    /* renamed from: I */
    public void mo1109I(C0124g gVar, C0201c cVar) {
        if (gVar != null || this.f832f != null) {
            m925k();
            C0124g N = this.f832f.mo970N();
            if (N != gVar) {
                if (N != null) {
                    N.mo597O(this.f826W);
                    N.mo597O(this.f827a0);
                }
                if (this.f827a0 == null) {
                    this.f827a0 = new C0183d();
                }
                cVar.mo1264G(true);
                if (gVar != null) {
                    gVar.mo620c(cVar, this.f841w);
                    gVar.mo620c(this.f827a0, this.f841w);
                } else {
                    cVar.mo529i(this.f841w, (C0124g) null);
                    this.f827a0.mo529i(this.f841w, (C0124g) null);
                    cVar.mo525d(true);
                    this.f827a0.mo525d(true);
                }
                this.f832f.setPopupTheme(this.f842x);
                this.f832f.setPresenter(cVar);
                this.f826W = cVar;
            }
        }
    }

    /* renamed from: J */
    public void mo1110J(C0139m.C0140a aVar, C0124g.C0125a aVar2) {
        this.f828b0 = aVar;
        this.f829c0 = aVar2;
        ActionMenuView actionMenuView = this.f832f;
        if (actionMenuView != null) {
            actionMenuView.mo971O(aVar, aVar2);
        }
    }

    /* renamed from: K */
    public void mo1111K(Context context, int i) {
        this.f844z = i;
        TextView textView = this.f834p;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: L */
    public void mo1112L(Context context, int i) {
        this.f843y = i;
        TextView textView = this.f833o;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: O */
    public boolean mo1113O() {
        ActionMenuView actionMenuView = this.f832f;
        return actionMenuView != null && actionMenuView.mo972P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1114a() {
        for (int size = this.f821R.size() - 1; size >= 0; size--) {
            addView(this.f821R.get(size));
        }
        this.f821R.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0184e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f832f;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1116d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f832f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo969K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo1116d():boolean");
    }

    /* renamed from: e */
    public void mo1117e() {
        C0183d dVar = this.f827a0;
        C0128i iVar = dVar == null ? null : dVar.f849o;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo1118f() {
        ActionMenuView actionMenuView = this.f832f;
        if (actionMenuView != null) {
            actionMenuView.mo960B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1119g() {
        if (this.f839u == null) {
            C0246m mVar = new C0246m(getContext(), (AttributeSet) null, C1435a.toolbarNavigationButtonStyle);
            this.f839u = mVar;
            mVar.setImageDrawable(this.f837s);
            this.f839u.setContentDescription(this.f838t);
            C0184e m = generateDefaultLayoutParams();
            m.f215a = 8388611 | (this.f804A & 112);
            m.f851b = 2;
            this.f839u.setLayoutParams(m);
            this.f839u.setOnClickListener(new C0182c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f839u;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f839u;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0257o0 o0Var = this.f810G;
        if (o0Var != null) {
            return o0Var.mo1585a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f812I;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0257o0 o0Var = this.f810G;
        if (o0Var != null) {
            return o0Var.mo1586b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0257o0 o0Var = this.f810G;
        if (o0Var != null) {
            return o0Var.mo1587c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0257o0 o0Var = this.f810G;
        if (o0Var != null) {
            return o0Var.mo1588d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f811H;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo970N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f832f
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo970N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f812I
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C1988t.m8417y(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C1988t.m8417y(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f811H, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f836r;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f836r;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m924j();
        return this.f832f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f835q;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f835q;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0201c getOuterActionMenuPresenter() {
        return this.f826W;
    }

    public Drawable getOverflowIcon() {
        m924j();
        return this.f832f.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f841w;
    }

    public int getPopupTheme() {
        return this.f842x;
    }

    public CharSequence getSubtitle() {
        return this.f815L;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f834p;
    }

    public CharSequence getTitle() {
        return this.f814K;
    }

    public int getTitleMarginBottom() {
        return this.f809F;
    }

    public int getTitleMarginEnd() {
        return this.f807D;
    }

    public int getTitleMarginStart() {
        return this.f806C;
    }

    public int getTitleMarginTop() {
        return this.f808E;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f833o;
    }

    public C0212d0 getWrapper() {
        if (this.f825V == null) {
            this.f825V = new C0295y0(this, true);
        }
        return this.f825V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0184e generateDefaultLayoutParams() {
        return new C0184e(-2, -2);
    }

    /* renamed from: n */
    public C0184e generateLayoutParams(AttributeSet attributeSet) {
        return new C0184e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0184e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0184e ? new C0184e((C0184e) layoutParams) : layoutParams instanceof C0058a.C0059a ? new C0184e((C0058a.C0059a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0184e((ViewGroup.MarginLayoutParams) layoutParams) : new C0184e(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f831e0);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f819P = false;
        }
        if (!this.f819P) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f819P = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f819P = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f0 A[LOOP:2: B:117:0x02ee->B:118:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p027c.p064i.p072j.C1988t.m8417y(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f822S
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p027c.p064i.p072j.C1988t.m8419z(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f835q
            boolean r13 = r0.m919N(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.f835q
            if (r1 == 0) goto L_0x004e
            int r13 = r0.m914C(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.m913B(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.f839u
            boolean r15 = r0.m919N(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.f839u
            if (r1 == 0) goto L_0x0066
            int r14 = r0.m914C(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.m913B(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f832f
            boolean r15 = r0.m919N(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f832f
            if (r1 == 0) goto L_0x007b
            int r13 = r0.m913B(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.m914C(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f840v
            boolean r13 = r0.m919N(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.f840v
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.m914C(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.m913B(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.f836r
            boolean r13 = r0.m919N(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.f836r
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.m914C(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.m913B(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.f833o
            boolean r13 = r0.m919N(r13)
            android.widget.TextView r14 = r0.f834p
            boolean r14 = r0.m919N(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.f833o
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0184e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f833o
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.f834p
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0184e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f834p
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r18 = r6
            r22 = r12
        L_0x011e:
            r1 = 0
            goto L_0x0286
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.f833o
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.f834p
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.f834p
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.f833o
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0184e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0184e) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.f833o
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0152
            android.widget.TextView r15 = r0.f834p
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0152
        L_0x014f:
            r17 = 1
            goto L_0x0154
        L_0x0152:
            r17 = 0
        L_0x0154:
            int r15 = r0.f813J
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019c
            r6 = 80
            if (r15 == r6) goto L_0x018e
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f808E
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0177
            int r6 = r15 + r12
            goto L_0x018c
        L_0x0177:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f809F
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018c
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018c:
            int r8 = r8 + r6
            goto L_0x01ab
        L_0x018e:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f809F
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ab
        L_0x019c:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f808E
            int r8 = r2 + r3
        L_0x01ab:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b2
            int r1 = r0.f806C
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.f833o
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0184e) r1
            android.widget.TextView r2 = r0.f833o
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f833o
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f833o
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f807D
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01eb
        L_0x01ea:
            r2 = r10
        L_0x01eb:
            if (r14 == 0) goto L_0x0211
            android.widget.TextView r1 = r0.f834p
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0184e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f834p
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f834p
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f834p
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f807D
            int r1 = r10 - r1
            goto L_0x0212
        L_0x0211:
            r1 = r10
        L_0x0212:
            if (r17 == 0) goto L_0x0219
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0219:
            r2 = r24
            goto L_0x011e
        L_0x021d:
            if (r17 == 0) goto L_0x0223
            int r7 = r0.f806C
            r1 = 0
            goto L_0x0225
        L_0x0223:
            r1 = 0
            r7 = 0
        L_0x0225:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x025a
            android.widget.TextView r3 = r0.f833o
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0184e) r3
            android.widget.TextView r4 = r0.f833o
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f833o
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f833o
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f807D
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x025b
        L_0x025a:
            r4 = r2
        L_0x025b:
            if (r14 == 0) goto L_0x027f
            android.widget.TextView r3 = r0.f834p
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.C0184e) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f834p
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f834p
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f834p
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f807D
            int r3 = r3 + r5
            goto L_0x0280
        L_0x027f:
            r3 = r2
        L_0x0280:
            if (r17 == 0) goto L_0x0286
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0286:
            java.util.ArrayList<android.view.View> r3 = r0.f820Q
            r4 = 3
            r0.m920b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f820Q
            int r3 = r3.size()
            r7 = 0
        L_0x0293:
            if (r7 >= r3) goto L_0x02a6
            java.util.ArrayList<android.view.View> r4 = r0.f820Q
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.m913B(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x0293
        L_0x02a6:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f820Q
            r4 = 5
            r0.m920b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f820Q
            int r3 = r3.size()
            r7 = 0
        L_0x02b5:
            if (r7 >= r3) goto L_0x02c6
            java.util.ArrayList<android.view.View> r4 = r0.f820Q
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m914C(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02b5
        L_0x02c6:
            java.util.ArrayList<android.view.View> r3 = r0.f820Q
            r4 = 1
            r0.m920b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f820Q
            int r3 = r0.m932u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02e1
            goto L_0x02e8
        L_0x02e1:
            if (r3 <= r10) goto L_0x02e7
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02e8
        L_0x02e7:
            r2 = r6
        L_0x02e8:
            java.util.ArrayList<android.view.View> r3 = r0.f820Q
            int r3 = r3.size()
        L_0x02ee:
            if (r1 >= r3) goto L_0x02ff
            java.util.ArrayList<android.view.View> r4 = r0.f820Q
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m913B(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02ee
        L_0x02ff:
            java.util.ArrayList<android.view.View> r1 = r0.f820Q
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f822S;
        int i10 = 0;
        if (C0213d1.m1104b(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m919N(this.f835q)) {
            m916E(this.f835q, i, 0, i2, 0, this.f805B);
            i5 = this.f835q.getMeasuredWidth() + m930s(this.f835q);
            i4 = Math.max(0, this.f835q.getMeasuredHeight() + m931t(this.f835q));
            i3 = View.combineMeasuredStates(0, this.f835q.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m919N(this.f839u)) {
            m916E(this.f839u, i, 0, i2, 0, this.f805B);
            i5 = this.f839u.getMeasuredWidth() + m930s(this.f839u);
            i4 = Math.max(i4, this.f839u.getMeasuredHeight() + m931t(this.f839u));
            i3 = View.combineMeasuredStates(i3, this.f839u.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m919N(this.f832f)) {
            m916E(this.f832f, i, max, i2, 0, this.f805B);
            i6 = this.f832f.getMeasuredWidth() + m930s(this.f832f);
            i4 = Math.max(i4, this.f832f.getMeasuredHeight() + m931t(this.f832f));
            i3 = View.combineMeasuredStates(i3, this.f832f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m919N(this.f840v)) {
            max2 += m915D(this.f840v, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f840v.getMeasuredHeight() + m931t(this.f840v));
            i3 = View.combineMeasuredStates(i3, this.f840v.getMeasuredState());
        }
        if (m919N(this.f836r)) {
            max2 += m915D(this.f836r, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f836r.getMeasuredHeight() + m931t(this.f836r));
            i3 = View.combineMeasuredStates(i3, this.f836r.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0184e) childAt.getLayoutParams()).f851b == 0 && m919N(childAt)) {
                max2 += m915D(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m931t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f808E + this.f809F;
        int i13 = this.f806C + this.f807D;
        if (m919N(this.f833o)) {
            m915D(this.f833o, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f833o.getMeasuredWidth() + m930s(this.f833o);
            i7 = this.f833o.getMeasuredHeight() + m931t(this.f833o);
            i9 = View.combineMeasuredStates(i3, this.f833o.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m919N(this.f834p)) {
            int i14 = i7 + i12;
            i8 = Math.max(i8, m915D(this.f834p, i, max2 + i13, i2, i14, iArr));
            i7 += this.f834p.getMeasuredHeight() + m931t(this.f834p);
            i9 = View.combineMeasuredStates(i9, this.f834p.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m918M()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0186g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0186g gVar = (C0186g) parcelable;
        super.onRestoreInstanceState(gVar.mo6726a());
        ActionMenuView actionMenuView = this.f832f;
        C0124g N = actionMenuView != null ? actionMenuView.mo970N() : null;
        int i = gVar.f852p;
        if (!(i == 0 || this.f827a0 == null || N == null || (findItem = N.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f853q) {
            m917F();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m922h();
        C0257o0 o0Var = this.f810G;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        o0Var.mo1590f(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0128i iVar;
        C0186g gVar = new C0186g(super.onSaveInstanceState());
        C0183d dVar = this.f827a0;
        if (!(dVar == null || (iVar = dVar.f849o) == null)) {
            gVar.f852p = iVar.getItemId();
        }
        gVar.f853q = mo1106A();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f818O = false;
        }
        if (!this.f818O) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f818O = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f818O = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1119g();
        }
        ImageButton imageButton = this.f839u;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C1445a.m6446d(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1119g();
            this.f839u.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f839u;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f837s);
        }
    }

    public void setCollapsible(boolean z) {
        this.f830d0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f812I) {
            this.f812I = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f811H) {
            this.f811H = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C1445a.m6446d(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m923i();
            if (!m933y(this.f836r)) {
                m921c(this.f836r, true);
            }
        } else {
            ImageView imageView = this.f836r;
            if (imageView != null && m933y(imageView)) {
                removeView(this.f836r);
                this.f821R.remove(this.f836r);
            }
        }
        ImageView imageView2 = this.f836r;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m923i();
        }
        ImageView imageView = this.f836r;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m926l();
        }
        ImageButton imageButton = this.f835q;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C1445a.m6446d(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m926l();
            if (!m933y(this.f835q)) {
                m921c(this.f835q, true);
            }
        } else {
            ImageButton imageButton = this.f835q;
            if (imageButton != null && m933y(imageButton)) {
                removeView(this.f835q);
                this.f821R.remove(this.f835q);
            }
        }
        ImageButton imageButton2 = this.f835q;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m926l();
        this.f835q.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0185f fVar) {
        this.f823T = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m924j();
        this.f832f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f842x != i) {
            this.f842x = i;
            if (i == 0) {
                this.f841w = getContext();
            } else {
                this.f841w = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f834p == null) {
                Context context = getContext();
                C0298z zVar = new C0298z(context);
                this.f834p = zVar;
                zVar.setSingleLine();
                this.f834p.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f844z;
                if (i != 0) {
                    this.f834p.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f817N;
                if (colorStateList != null) {
                    this.f834p.setTextColor(colorStateList);
                }
            }
            if (!m933y(this.f834p)) {
                m921c(this.f834p, true);
            }
        } else {
            TextView textView = this.f834p;
            if (textView != null && m933y(textView)) {
                removeView(this.f834p);
                this.f821R.remove(this.f834p);
            }
        }
        TextView textView2 = this.f834p;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f815L = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f817N = colorStateList;
        TextView textView = this.f834p;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f833o == null) {
                Context context = getContext();
                C0298z zVar = new C0298z(context);
                this.f833o = zVar;
                zVar.setSingleLine();
                this.f833o.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f843y;
                if (i != 0) {
                    this.f833o.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f816M;
                if (colorStateList != null) {
                    this.f833o.setTextColor(colorStateList);
                }
            }
            if (!m933y(this.f833o)) {
                m921c(this.f833o, true);
            }
        } else {
            TextView textView = this.f833o;
            if (textView != null && m933y(textView)) {
                removeView(this.f833o);
                this.f821R.remove(this.f833o);
            }
        }
        TextView textView2 = this.f833o;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f814K = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f809F = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f807D = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f806C = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f808E = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f816M = colorStateList;
        TextView textView = this.f833o;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: v */
    public boolean mo1195v() {
        C0183d dVar = this.f827a0;
        return (dVar == null || dVar.f849o == null) ? false : true;
    }

    /* renamed from: w */
    public boolean mo1196w() {
        ActionMenuView actionMenuView = this.f832f;
        return actionMenuView != null && actionMenuView.mo966H();
    }

    /* renamed from: x */
    public void mo1197x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: z */
    public boolean mo1198z() {
        ActionMenuView actionMenuView = this.f832f;
        return actionMenuView != null && actionMenuView.mo967I();
    }
}
