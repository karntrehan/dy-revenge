package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.widget.C1191f;
import java.lang.reflect.Field;
import p027c.p028a.C1435a;
import p027c.p028a.p031l.p032a.C1459c;
import p027c.p064i.p072j.C2008y;

/* renamed from: androidx.appcompat.widget.f0 */
class C0218f0 extends ListView {

    /* renamed from: A */
    C0220b f953A;

    /* renamed from: f */
    private final Rect f954f = new Rect();

    /* renamed from: o */
    private int f955o = 0;

    /* renamed from: p */
    private int f956p = 0;

    /* renamed from: q */
    private int f957q = 0;

    /* renamed from: r */
    private int f958r = 0;

    /* renamed from: s */
    private int f959s;

    /* renamed from: t */
    private Field f960t;

    /* renamed from: u */
    private C0219a f961u;

    /* renamed from: v */
    private boolean f962v;

    /* renamed from: w */
    private boolean f963w;

    /* renamed from: x */
    private boolean f964x;

    /* renamed from: y */
    private C2008y f965y;

    /* renamed from: z */
    private C1191f f966z;

    /* renamed from: androidx.appcompat.widget.f0$a */
    private static class C0219a extends C1459c {

        /* renamed from: o */
        private boolean f967o = true;

        C0219a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1364c(boolean z) {
            this.f967o = z;
        }

        public void draw(Canvas canvas) {
            if (this.f967o) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f967o) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f967o) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f967o) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f967o) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$b */
    private class C0220b implements Runnable {
        C0220b() {
        }

        /* renamed from: a */
        public void mo1370a() {
            C0218f0 f0Var = C0218f0.this;
            f0Var.f953A = null;
            f0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo1371b() {
            C0218f0.this.post(this);
        }

        public void run() {
            C0218f0 f0Var = C0218f0.this;
            f0Var.f953A = null;
            f0Var.drawableStateChanged();
        }
    }

    C0218f0(Context context, boolean z) {
        super(context, (AttributeSet) null, C1435a.dropDownListViewStyle);
        this.f963w = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f960t = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1123a() {
        this.f964x = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f959s - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C2008y yVar = this.f965y;
        if (yVar != null) {
            yVar.mo6697b();
            this.f965y = null;
        }
    }

    /* renamed from: b */
    private void m1124b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m1125c(Canvas canvas) {
        Drawable selector;
        if (!this.f954f.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f954f);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m1126f(int i, View view) {
        Rect rect = this.f954f;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f955o;
        rect.top -= this.f956p;
        rect.right += this.f957q;
        rect.bottom += this.f958r;
        try {
            boolean z = this.f960t.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f960t.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m1127g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1126f(i, view);
        if (z2) {
            Rect rect = this.f954f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C1164a.m4547k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m1128h(int i, View view, float f, float f2) {
        m1127g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C1164a.m4547k(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m1129i(View view, int i, float f, float f2) {
        View childAt;
        this.f964x = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f959s;
        if (!(i3 == -1 || (childAt = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f959s = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (i2 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1128h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m1130j() {
        return this.f964x;
    }

    /* renamed from: k */
    private void m1131k() {
        Drawable selector = getSelector();
        if (selector != null && m1130j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0219a aVar = this.f961u;
        if (aVar != null) {
            aVar.mo1364c(z);
        }
    }

    /* renamed from: d */
    public int mo1351d(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1125c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f953A == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1131k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1354e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1129i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m1124b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m1123a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f966z
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f966z = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f966z
            r9.mo3790m(r2)
            androidx.core.widget.f r9 = r7.f966z
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f966z
            if (r8 == 0) goto L_0x006c
            r8.mo3790m(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0218f0.mo1354e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f963w || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f963w || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f963w || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f963w && this.f962v) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f953A = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f953A == null) {
            C0220b bVar = new C0220b();
            this.f953A = bVar;
            bVar.mo1371b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1131k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f959s = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0220b bVar = this.f953A;
        if (bVar != null) {
            bVar.mo1370a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f962v = z;
    }

    public void setSelector(Drawable drawable) {
        C0219a aVar = drawable != null ? new C0219a(drawable) : null;
        this.f961u = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f955o = rect.left;
        this.f956p = rect.top;
        this.f957q = rect.right;
        this.f958r = rect.bottom;
    }
}
