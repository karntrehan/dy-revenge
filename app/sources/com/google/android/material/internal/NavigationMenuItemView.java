package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0128i;
import androidx.appcompat.view.menu.C0141n;
import androidx.appcompat.widget.C0229i0;
import androidx.appcompat.widget.C0299z0;
import androidx.core.content.p022d.C1154f;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.widget.C1194i;
import p027c.p028a.C1435a;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p174e.p319f.p320a.p363d.C9017d;
import p174e.p319f.p320a.p363d.C9018e;
import p174e.p319f.p320a.p363d.C9019f;
import p174e.p319f.p320a.p363d.C9021h;

public class NavigationMenuItemView extends C4266d implements C0141n.C0142a {

    /* renamed from: I */
    private static final int[] f12030I = {16842912};

    /* renamed from: J */
    private int f12031J;

    /* renamed from: K */
    private boolean f12032K;

    /* renamed from: L */
    boolean f12033L;

    /* renamed from: M */
    private final CheckedTextView f12034M;

    /* renamed from: N */
    private FrameLayout f12035N;

    /* renamed from: O */
    private C0128i f12036O;

    /* renamed from: P */
    private ColorStateList f12037P;

    /* renamed from: Q */
    private boolean f12038Q;

    /* renamed from: R */
    private Drawable f12039R;

    /* renamed from: S */
    private final C1904a f12040S;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C4261a extends C1904a {
        C4261a() {
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            super.mo3776g(view, cVar);
            cVar.mo6575Y(NavigationMenuItemView.this.f12033L);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4261a aVar = new C4261a();
        this.f12040S = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C9021h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C9017d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C9019f.design_menu_item_text);
        this.f12034M = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1988t.m8394m0(checkedTextView, aVar);
    }

    /* renamed from: B */
    private void m16340B() {
        int i;
        C0229i0.C0230a aVar;
        if (m16342D()) {
            this.f12034M.setVisibility(8);
            FrameLayout frameLayout = this.f12035N;
            if (frameLayout != null) {
                aVar = (C0229i0.C0230a) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.f12034M.setVisibility(0);
            FrameLayout frameLayout2 = this.f12035N;
            if (frameLayout2 != null) {
                aVar = (C0229i0.C0230a) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        aVar.width = i;
        this.f12035N.setLayoutParams(aVar);
    }

    /* renamed from: C */
    private StateListDrawable m16341C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C1435a.f4190v, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f12030I, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: D */
    private boolean m16342D() {
        return this.f12036O.getTitle() == null && this.f12036O.getIcon() == null && this.f12036O.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f12035N == null) {
                this.f12035N = (FrameLayout) ((ViewStub) findViewById(C9019f.design_menu_item_action_area_stub)).inflate();
            }
            this.f12035N.removeAllViews();
            this.f12035N.addView(view);
        }
    }

    /* renamed from: d */
    public boolean mo428d() {
        return false;
    }

    /* renamed from: e */
    public void mo429e(C0128i iVar, int i) {
        this.f12036O = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C1988t.m8400p0(this, m16341C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        C0299z0.m1497a(this, iVar.getTooltipText());
        m16340B();
    }

    public C0128i getItemData() {
        return this.f12036O;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0128i iVar = this.f12036O;
        if (iVar != null && iVar.isCheckable() && this.f12036O.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f12030I);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f12033L != z) {
            this.f12033L = z;
            this.f12040S.mo5210l(this.f12034M, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f12034M.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f12038Q) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C1164a.m4554r(drawable).mutate();
                C1164a.m4551o(drawable, this.f12037P);
            }
            int i = this.f12031J;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f12032K) {
            if (this.f12039R == null) {
                Drawable e = C1154f.m4492e(getResources(), C9018e.navigation_empty_icon, getContext().getTheme());
                this.f12039R = e;
                if (e != null) {
                    int i2 = this.f12031J;
                    e.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f12039R;
        }
        C1194i.m4702i(this.f12034M, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f12034M.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f12031J = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f12037P = colorStateList;
        this.f12038Q = colorStateList != null;
        C0128i iVar = this.f12036O;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f12034M.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f12032K = z;
    }

    public void setTextAppearance(int i) {
        C1194i.m4707n(this.f12034M, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f12034M.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12034M.setText(charSequence);
    }
}
