package p027c.p100v;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: c.v.j */
class C2168j extends FrameLayout {

    /* renamed from: f */
    private ViewGroup f6356f;

    /* renamed from: o */
    private boolean f6357o = true;

    C2168j(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f6356f = viewGroup;
        viewGroup.setTag(C2192s.ghost_view_holder, this);
        C2169j0.m9215b(this.f6356f).mo7273c(this);
    }

    /* renamed from: b */
    static C2168j m9207b(ViewGroup viewGroup) {
        return (C2168j) viewGroup.getTag(C2192s.ghost_view_holder);
    }

    /* renamed from: c */
    private int m9208c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m9209d(((C2173l) getChildAt(i2)).f6375p, arrayList2);
            if (m9211f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: d */
    private static void m9209d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m9209d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    private static boolean m9210e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Build.VERSION.SDK_INT >= 21 && view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(C2169j0.m9214a(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m9211f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return m9210e(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7280a(C2173l lVar) {
        ArrayList arrayList = new ArrayList();
        m9209d(lVar.f6375p, arrayList);
        int c = m9208c(arrayList);
        if (c < 0 || c >= getChildCount()) {
            addView(lVar);
        } else {
            addView(lVar, c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo7281g() {
        if (this.f6357o) {
            C2169j0.m9215b(this.f6356f).mo7274d(this);
            C2169j0.m9215b(this.f6356f).mo7273c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewAdded(View view) {
        if (this.f6357o) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f6356f.setTag(C2192s.ghost_view_holder, (Object) null);
            C2169j0.m9215b(this.f6356f).mo7274d(this);
            this.f6357o = false;
        }
    }
}
