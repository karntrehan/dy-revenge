package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0113b;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.view.menu.C0128i;
import androidx.appcompat.view.menu.C0137l;
import androidx.appcompat.view.menu.C0139m;
import androidx.appcompat.view.menu.C0141n;
import androidx.appcompat.view.menu.C0144p;
import androidx.appcompat.view.menu.C0148r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C1164a;
import java.util.ArrayList;
import p027c.p028a.C1435a;
import p027c.p028a.C1441g;
import p027c.p028a.p035o.C1465a;
import p027c.p064i.p072j.C1907b;

/* renamed from: androidx.appcompat.widget.c */
class C0201c extends C0113b implements C1907b.C1908a {

    /* renamed from: A */
    private boolean f906A;

    /* renamed from: B */
    private boolean f907B;

    /* renamed from: C */
    private int f908C;

    /* renamed from: D */
    private int f909D;

    /* renamed from: E */
    private int f910E;

    /* renamed from: F */
    private boolean f911F;

    /* renamed from: G */
    private boolean f912G;

    /* renamed from: H */
    private boolean f913H;

    /* renamed from: I */
    private boolean f914I;

    /* renamed from: J */
    private int f915J;

    /* renamed from: K */
    private final SparseBooleanArray f916K = new SparseBooleanArray();

    /* renamed from: L */
    C0207e f917L;

    /* renamed from: M */
    C0202a f918M;

    /* renamed from: N */
    C0204c f919N;

    /* renamed from: O */
    private C0203b f920O;

    /* renamed from: P */
    final C0208f f921P = new C0208f();

    /* renamed from: Q */
    int f922Q;

    /* renamed from: x */
    C0205d f923x;

    /* renamed from: y */
    private Drawable f924y;

    /* renamed from: z */
    private boolean f925z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class C0202a extends C0137l {
        public C0202a(Context context, C0148r rVar, View view) {
            super(context, rVar, view, false, C1435a.actionOverflowMenuStyle);
            if (!((C0128i) rVar.getItem()).mo690l()) {
                View view2 = C0201c.this.f923x;
                mo800f(view2 == null ? (View) C0201c.this.f463v : view2);
            }
            mo804j(C0201c.this.f921P);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo799e() {
            C0201c cVar = C0201c.this;
            cVar.f918M = null;
            cVar.f922Q = 0;
            super.mo799e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class C0203b extends ActionMenuItemView.C0111b {
        C0203b() {
        }

        /* renamed from: a */
        public C0144p mo447a() {
            C0202a aVar = C0201c.this.f918M;
            if (aVar != null) {
                return aVar.mo797c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    private class C0204c implements Runnable {

        /* renamed from: f */
        private C0207e f928f;

        public C0204c(C0207e eVar) {
            this.f928f = eVar;
        }

        public void run() {
            if (C0201c.this.f457p != null) {
                C0201c.this.f457p.mo625d();
            }
            View view = (View) C0201c.this.f463v;
            if (!(view == null || view.getWindowToken() == null || !this.f928f.mo806m())) {
                C0201c.this.f917L = this.f928f;
            }
            C0201c.this.f919N = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class C0205d extends C0256o implements ActionMenuView.C0156a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class C0206a extends C0225h0 {

            /* renamed from: w */
            final /* synthetic */ C0201c f931w;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0206a(View view, C0201c cVar) {
                super(view);
                this.f931w = cVar;
            }

            /* renamed from: b */
            public C0144p mo445b() {
                C0207e eVar = C0201c.this.f917L;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo797c();
            }

            /* renamed from: c */
            public boolean mo446c() {
                C0201c.this.mo1268K();
                return true;
            }

            /* renamed from: d */
            public boolean mo1273d() {
                C0201c cVar = C0201c.this;
                if (cVar.f919N != null) {
                    return false;
                }
                cVar.mo1259B();
                return true;
            }
        }

        public C0205d(Context context) {
            super(context, (AttributeSet) null, C1435a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0299z0.m1497a(this, getContentDescription());
            setOnTouchListener(new C0206a(this, C0201c.this));
        }

        /* renamed from: a */
        public boolean mo426a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo427b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0201c.this.mo1268K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C1164a.m4548l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class C0207e extends C0137l {
        public C0207e(Context context, C0124g gVar, View view, boolean z) {
            super(context, gVar, view, z, C1435a.actionOverflowMenuStyle);
            mo802h(8388613);
            mo804j(C0201c.this.f921P);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo799e() {
            if (C0201c.this.f457p != null) {
                C0201c.this.f457p.close();
            }
            C0201c.this.f917L = null;
            super.mo799e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class C0208f implements C0139m.C0140a {
        C0208f() {
        }

        /* renamed from: c */
        public void mo326c(C0124g gVar, boolean z) {
            if (gVar instanceof C0148r) {
                gVar.mo587D().mo627e(false);
            }
            C0139m.C0140a m = C0201c.this.mo533m();
            if (m != null) {
                m.mo326c(gVar, z);
            }
        }

        /* renamed from: d */
        public boolean mo327d(C0124g gVar) {
            if (gVar == C0201c.this.f457p) {
                return false;
            }
            C0201c.this.f922Q = ((C0148r) gVar).getItem().getItemId();
            C0139m.C0140a m = C0201c.this.mo533m();
            if (m != null) {
                return m.mo327d(gVar);
            }
            return false;
        }
    }

    public C0201c(Context context) {
        super(context, C1441g.abc_action_menu_layout, C1441g.abc_action_menu_item_layout);
    }

    /* renamed from: z */
    private View m1033z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f463v;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0141n.C0142a) && ((C0141n.C0142a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public Drawable mo1258A() {
        C0205d dVar = this.f923x;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f925z) {
            return this.f924y;
        }
        return null;
    }

    /* renamed from: B */
    public boolean mo1259B() {
        C0141n nVar;
        C0204c cVar = this.f919N;
        if (cVar == null || (nVar = this.f463v) == null) {
            C0207e eVar = this.f917L;
            if (eVar == null) {
                return false;
            }
            eVar.mo796b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f919N = null;
        return true;
    }

    /* renamed from: C */
    public boolean mo1260C() {
        C0202a aVar = this.f918M;
        if (aVar == null) {
            return false;
        }
        aVar.mo796b();
        return true;
    }

    /* renamed from: D */
    public boolean mo1261D() {
        return this.f919N != null || mo1262E();
    }

    /* renamed from: E */
    public boolean mo1262E() {
        C0207e eVar = this.f917L;
        return eVar != null && eVar.mo798d();
    }

    /* renamed from: F */
    public void mo1263F(Configuration configuration) {
        if (!this.f911F) {
            this.f910E = C1465a.m6531b(this.f456o).mo5446d();
        }
        C0124g gVar = this.f457p;
        if (gVar != null) {
            gVar.mo594K(true);
        }
    }

    /* renamed from: G */
    public void mo1264G(boolean z) {
        this.f914I = z;
    }

    /* renamed from: H */
    public void mo1265H(ActionMenuView actionMenuView) {
        this.f463v = actionMenuView;
        actionMenuView.mo449b(this.f457p);
    }

    /* renamed from: I */
    public void mo1266I(Drawable drawable) {
        C0205d dVar = this.f923x;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f925z = true;
        this.f924y = drawable;
    }

    /* renamed from: J */
    public void mo1267J(boolean z) {
        this.f906A = z;
        this.f907B = true;
    }

    /* renamed from: K */
    public boolean mo1268K() {
        C0124g gVar;
        if (!this.f906A || mo1262E() || (gVar = this.f457p) == null || this.f463v == null || this.f919N != null || gVar.mo658z().isEmpty()) {
            return false;
        }
        C0204c cVar = new C0204c(new C0207e(this.f456o, this.f457p, this.f923x, true));
        this.f919N = cVar;
        ((View) this.f463v).post(cVar);
        return true;
    }

    /* renamed from: b */
    public void mo523b(C0128i iVar, C0141n.C0142a aVar) {
        aVar.mo429e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f463v);
        if (this.f920O == null) {
            this.f920O = new C0203b();
        }
        actionMenuItemView.setPopupCallback(this.f920O);
    }

    /* renamed from: c */
    public void mo524c(C0124g gVar, boolean z) {
        mo1269y();
        super.mo524c(gVar, z);
    }

    /* renamed from: d */
    public void mo525d(boolean z) {
        C0141n nVar;
        super.mo525d(z);
        ((View) this.f463v).requestLayout();
        C0124g gVar = this.f457p;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<C0128i> s = gVar.mo645s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                C1907b b = s.get(i).mo464b();
                if (b != null) {
                    b.mo6449i(this);
                }
            }
        }
        C0124g gVar2 = this.f457p;
        ArrayList<C0128i> z3 = gVar2 != null ? gVar2.mo658z() : null;
        if (this.f906A && z3 != null) {
            int size2 = z3.size();
            if (size2 == 1) {
                z2 = !z3.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0205d dVar = this.f923x;
        if (z2) {
            if (dVar == null) {
                this.f923x = new C0205d(this.f455f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f923x.getParent();
            if (viewGroup != this.f463v) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f923x);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f463v;
                actionMenuView.addView(this.f923x, actionMenuView.mo964F());
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.f463v)) {
            ((ViewGroup) nVar).removeView(this.f923x);
        }
        ((ActionMenuView) this.f463v).setOverflowReserved(this.f906A);
    }

    /* renamed from: e */
    public boolean mo546e() {
        int i;
        ArrayList<C0128i> arrayList;
        int i2;
        int i3;
        int i4;
        C0201c cVar = this;
        C0124g gVar = cVar.f457p;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo588E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.f910E;
        int i7 = cVar.f909D;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f463v;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0128i iVar = arrayList.get(i10);
            if (iVar.mo693o()) {
                i8++;
            } else if (iVar.mo692n()) {
                i9++;
            } else {
                z = true;
            }
            if (cVar.f914I && iVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (cVar.f906A && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = cVar.f916K;
        sparseBooleanArray.clear();
        if (cVar.f912G) {
            int i12 = cVar.f915J;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0128i iVar2 = arrayList.get(i13);
            if (iVar2.mo693o()) {
                View n = cVar.mo534n(iVar2, view, viewGroup);
                if (cVar.f912G) {
                    i2 -= ActionMenuView.m823L(n, i3, i2, makeMeasureSpec, i5);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo716u(true);
                i4 = i;
            } else if (iVar2.mo692n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!cVar.f912G || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View n2 = cVar.mo534n(iVar2, (View) null, viewGroup);
                    if (cVar.f912G) {
                        int L = ActionMenuView.m823L(n2, i3, i2, makeMeasureSpec, 0);
                        i2 -= L;
                        if (L == 0) {
                            z4 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!cVar.f912G ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        C0128i iVar3 = arrayList.get(i15);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo690l()) {
                                i11++;
                            }
                            iVar3.mo716u(false);
                        }
                        i15++;
                    }
                }
                if (z3) {
                    i11--;
                }
                iVar2.mo716u(z3);
            } else {
                i4 = i;
                iVar2.mo716u(false);
                i13++;
                view = null;
                cVar = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            cVar = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: i */
    public void mo529i(Context context, C0124g gVar) {
        super.mo529i(context, gVar);
        Resources resources = context.getResources();
        C1465a b = C1465a.m6531b(context);
        if (!this.f907B) {
            this.f906A = b.mo5450h();
        }
        if (!this.f913H) {
            this.f908C = b.mo5445c();
        }
        if (!this.f911F) {
            this.f910E = b.mo5446d();
        }
        int i = this.f908C;
        if (this.f906A) {
            if (this.f923x == null) {
                C0205d dVar = new C0205d(this.f455f);
                this.f923x = dVar;
                if (this.f925z) {
                    dVar.setImageDrawable(this.f924y);
                    this.f924y = null;
                    this.f925z = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f923x.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f923x.getMeasuredWidth();
        } else {
            this.f923x = null;
        }
        this.f909D = i;
        this.f915J = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: k */
    public boolean mo531k(C0148r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C0148r rVar2 = rVar;
        while (rVar2.mo838e0() != this.f457p) {
            rVar2 = (C0148r) rVar2.mo838e0();
        }
        View z2 = m1033z(rVar2.getItem());
        if (z2 == null) {
            return false;
        }
        this.f922Q = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0202a aVar = new C0202a(this.f456o, rVar, z2);
        this.f918M = aVar;
        aVar.mo801g(z);
        this.f918M.mo805k();
        super.mo531k(rVar);
        return true;
    }

    /* renamed from: l */
    public boolean mo532l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f923x) {
            return false;
        }
        return super.mo532l(viewGroup, i);
    }

    /* renamed from: n */
    public View mo534n(C0128i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo688j()) {
            actionView = super.mo534n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo984o(layoutParams));
        }
        return actionView;
    }

    /* renamed from: o */
    public C0141n mo535o(ViewGroup viewGroup) {
        C0141n nVar = this.f463v;
        C0141n o = super.mo535o(viewGroup);
        if (nVar != o) {
            ((ActionMenuView) o).setPresenter(this);
        }
        return o;
    }

    /* renamed from: q */
    public boolean mo537q(int i, C0128i iVar) {
        return iVar.mo690l();
    }

    /* renamed from: y */
    public boolean mo1269y() {
        return mo1259B() | mo1260C();
    }
}
