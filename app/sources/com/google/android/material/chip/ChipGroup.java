package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.internal.C4265c;
import com.google.android.material.internal.C4273g;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.C9024k;

public class ChipGroup extends C4265c {

    /* renamed from: q */
    private int f11730q;

    /* renamed from: r */
    private int f11731r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f11732s;

    /* renamed from: t */
    private C4186d f11733t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C4184b f11734u;

    /* renamed from: v */
    private C4187e f11735v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f11736w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f11737x;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C4184b implements CompoundButton.OnCheckedChangeListener {
        private C4184b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f11737x) {
                int id = compoundButton.getId();
                if (z) {
                    if (!(ChipGroup.this.f11736w == -1 || ChipGroup.this.f11736w == id || !ChipGroup.this.f11732s)) {
                        ChipGroup chipGroup = ChipGroup.this;
                        chipGroup.m15868k(chipGroup.f11736w, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                } else if (ChipGroup.this.f11736w == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C4185c extends ViewGroup.MarginLayoutParams {
        public C4185c(int i, int i2) {
            super(i, i2);
        }

        public C4185c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C4185c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C4186d {
        /* renamed from: a */
        void mo13010a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    private class C4187e implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public ViewGroup.OnHierarchyChangeListener f11739f;

        private C4187e() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f11734u);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f11739f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f11739f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9013b.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11734u = new C4184b();
        this.f11735v = new C4187e();
        this.f11736w = -1;
        this.f11737x = false;
        TypedArray k = C4273g.m16429k(context, attributeSet, C9024k.f24564G0, i, C9023j.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = k.getDimensionPixelOffset(C9024k.f24574I0, 0);
        setChipSpacingHorizontal(k.getDimensionPixelOffset(C9024k.f24579J0, dimensionPixelOffset));
        setChipSpacingVertical(k.getDimensionPixelOffset(C9024k.f24584K0, dimensionPixelOffset));
        setSingleLine(k.getBoolean(C9024k.f24589L0, false));
        setSingleSelection(k.getBoolean(C9024k.f24594M0, false));
        int resourceId = k.getResourceId(C9024k.f24569H0, -1);
        if (resourceId != -1) {
            this.f11736w = resourceId;
        }
        k.recycle();
        super.setOnHierarchyChangeListener(this.f11735v);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m15868k(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f11737x = true;
            ((Chip) findViewById).setChecked(z);
            this.f11737x = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f11736w = i;
        C4186d dVar = this.f11733t;
        if (dVar != null && this.f11732s) {
            dVar.mo13010a(this, i);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f11736w;
                if (i2 != -1 && this.f11732s) {
                    m15868k(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public boolean mo12982b() {
        return super.mo12982b();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C4185c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4185c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4185c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C4185c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f11732s) {
            return this.f11736w;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f11730q;
    }

    public int getChipSpacingVertical() {
        return this.f11731r;
    }

    /* renamed from: j */
    public void mo12990j() {
        this.f11737x = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f11737x = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f11736w;
        if (i != -1) {
            m15868k(i, true);
            setCheckedId(this.f11736w);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f11730q != i) {
            this.f11730q = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f11731r != i) {
            this.f11731r = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C4186d dVar) {
        this.f11733t = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f11735v.f11739f = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f11732s != z) {
            this.f11732s = z;
            mo12990j();
        }
    }
}
