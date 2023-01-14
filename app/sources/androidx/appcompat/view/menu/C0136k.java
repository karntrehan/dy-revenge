package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.view.menu.k */
abstract class C0136k implements C0144p, C0139m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private Rect f596f;

    C0136k() {
    }

    /* renamed from: o */
    protected static int m706o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: x */
    protected static boolean m707x(C0124g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    protected static C0123f m708y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0123f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0123f) listAdapter;
    }

    /* renamed from: f */
    public boolean mo526f(C0124g gVar, C0128i iVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo527g(C0124g gVar, C0128i iVar) {
        return false;
    }

    /* renamed from: i */
    public void mo529i(Context context, C0124g gVar) {
    }

    /* renamed from: l */
    public abstract void mo548l(C0124g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo549m() {
        return true;
    }

    /* renamed from: n */
    public Rect mo793n() {
        return this.f596f;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m708y(listAdapter).f516f.mo596M((MenuItem) listAdapter.getItem(i), this, mo549m() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo552p(View view);

    /* renamed from: q */
    public void mo795q(Rect rect) {
        this.f596f = rect;
    }

    /* renamed from: r */
    public abstract void mo553r(boolean z);

    /* renamed from: s */
    public abstract void mo554s(int i);

    /* renamed from: t */
    public abstract void mo555t(int i);

    /* renamed from: u */
    public abstract void mo556u(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: v */
    public abstract void mo557v(boolean z);

    /* renamed from: w */
    public abstract void mo558w(int i);
}
