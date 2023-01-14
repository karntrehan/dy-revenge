package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0141n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0123f extends BaseAdapter {

    /* renamed from: f */
    C0124g f516f;

    /* renamed from: o */
    private int f517o = -1;

    /* renamed from: p */
    private boolean f518p;

    /* renamed from: q */
    private final boolean f519q;

    /* renamed from: r */
    private final LayoutInflater f520r;

    /* renamed from: s */
    private final int f521s;

    public C0123f(C0124g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f519q = z;
        this.f520r = layoutInflater;
        this.f516f = gVar;
        this.f521s = i;
        mo576a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo576a() {
        C0128i v = this.f516f.mo654v();
        if (v != null) {
            ArrayList<C0128i> z = this.f516f.mo658z();
            int size = z.size();
            for (int i = 0; i < size; i++) {
                if (z.get(i) == v) {
                    this.f517o = i;
                    return;
                }
            }
        }
        this.f517o = -1;
    }

    /* renamed from: b */
    public C0124g mo577b() {
        return this.f516f;
    }

    /* renamed from: c */
    public C0128i getItem(int i) {
        ArrayList<C0128i> z = this.f519q ? this.f516f.mo658z() : this.f516f.mo588E();
        int i2 = this.f517o;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return z.get(i);
    }

    /* renamed from: d */
    public void mo579d(boolean z) {
        this.f518p = z;
    }

    public int getCount() {
        ArrayList<C0128i> z = this.f519q ? this.f516f.mo658z() : this.f516f.mo588E();
        int i = this.f517o;
        int size = z.size();
        return i < 0 ? size : size - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f520r.inflate(this.f521s, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f516f.mo589F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0141n.C0142a aVar = (C0141n.C0142a) view;
        if (this.f518p) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo429e(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo576a();
        super.notifyDataSetChanged();
    }
}
