package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import p027c.p086o.C2062c;

/* renamed from: androidx.fragment.app.f */
public final class C1224f extends FrameLayout {

    /* renamed from: f */
    private ArrayList<View> f3486f;

    /* renamed from: o */
    private ArrayList<View> f3487o;

    /* renamed from: p */
    private boolean f3488p = true;

    C1224f(Context context, AttributeSet attributeSet, C1231l lVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2062c.f6015h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C2062c.f6016i) : classAttribute;
        String string = obtainStyledAttributes.getString(C2062c.f6017j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment Y = lVar.mo4129Y(id);
        if (classAttribute != null && Y == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = lVar.mo4141h0().mo4076a(context.getClassLoader(), classAttribute);
            a.mo3936t0(context, attributeSet, (Bundle) null);
            lVar.mo4142i().mo4253s(true).mo4244d(this, a, string).mo3974j();
        }
    }

    /* renamed from: a */
    private void m4927a(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f3487o) != null && arrayList.contains(view))) {
            if (this.f3486f == null) {
                this.f3486f = new ArrayList<>();
            }
            this.f3486f.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (C1231l.m5010n0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (C1231l.m5010n0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f3488p && this.f3486f != null) {
            for (int i = 0; i < this.f3486f.size(); i++) {
                super.drawChild(canvas, this.f3486f.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f3488p || (arrayList = this.f3486f) == null || arrayList.size() <= 0 || !this.f3486f.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3487o;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3486f;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3488p = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m4927a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m4927a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        m4927a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        m4927a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        m4927a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m4927a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m4927a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f3488p = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3487o == null) {
                this.f3487o = new ArrayList<>();
            }
            this.f3487o.add(view);
        }
        super.startViewTransition(view);
    }
}
