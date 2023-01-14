package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0139m;
import androidx.appcompat.view.menu.C0141n;
import java.util.ArrayList;
import p027c.p028a.C1441g;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0121e implements C0139m, AdapterView.OnItemClickListener {

    /* renamed from: f */
    Context f505f;

    /* renamed from: o */
    LayoutInflater f506o;

    /* renamed from: p */
    C0124g f507p;

    /* renamed from: q */
    ExpandedMenuView f508q;

    /* renamed from: r */
    int f509r;

    /* renamed from: s */
    int f510s;

    /* renamed from: t */
    int f511t;

    /* renamed from: u */
    private C0139m.C0140a f512u;

    /* renamed from: v */
    C0122a f513v;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class C0122a extends BaseAdapter {

        /* renamed from: f */
        private int f514f = -1;

        public C0122a() {
            mo569a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo569a() {
            C0128i v = C0121e.this.f507p.mo654v();
            if (v != null) {
                ArrayList<C0128i> z = C0121e.this.f507p.mo658z();
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    if (z.get(i) == v) {
                        this.f514f = i;
                        return;
                    }
                }
            }
            this.f514f = -1;
        }

        /* renamed from: b */
        public C0128i getItem(int i) {
            ArrayList<C0128i> z = C0121e.this.f507p.mo658z();
            int i2 = i + C0121e.this.f509r;
            int i3 = this.f514f;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return z.get(i2);
        }

        public int getCount() {
            int size = C0121e.this.f507p.mo658z().size() - C0121e.this.f509r;
            return this.f514f < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0121e eVar = C0121e.this;
                view = eVar.f506o.inflate(eVar.f511t, viewGroup, false);
            }
            ((C0141n.C0142a) view).mo429e(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo569a();
            super.notifyDataSetChanged();
        }
    }

    public C0121e(int i, int i2) {
        this.f511t = i;
        this.f510s = i2;
    }

    public C0121e(Context context, int i) {
        this(i, 0);
        this.f505f = context;
        this.f506o = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo566a() {
        if (this.f513v == null) {
            this.f513v = new C0122a();
        }
        return this.f513v;
    }

    /* renamed from: b */
    public C0141n mo567b(ViewGroup viewGroup) {
        if (this.f508q == null) {
            this.f508q = (ExpandedMenuView) this.f506o.inflate(C1441g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f513v == null) {
                this.f513v = new C0122a();
            }
            this.f508q.setAdapter(this.f513v);
            this.f508q.setOnItemClickListener(this);
        }
        return this.f508q;
    }

    /* renamed from: c */
    public void mo524c(C0124g gVar, boolean z) {
        C0139m.C0140a aVar = this.f512u;
        if (aVar != null) {
            aVar.mo326c(gVar, z);
        }
    }

    /* renamed from: d */
    public void mo525d(boolean z) {
        C0122a aVar = this.f513v;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    public boolean mo546e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo526f(C0124g gVar, C0128i iVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo527g(C0124g gVar, C0128i iVar) {
        return false;
    }

    /* renamed from: h */
    public void mo528h(C0139m.C0140a aVar) {
        this.f512u = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo529i(android.content.Context r3, androidx.appcompat.view.menu.C0124g r4) {
        /*
            r2 = this;
            int r0 = r2.f510s
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f510s
            r0.<init>(r3, r1)
            r2.f505f = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f506o = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f505f
            if (r0 == 0) goto L_0x0023
            r2.f505f = r3
            android.view.LayoutInflater r0 = r2.f506o
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f507p = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f513v
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0121e.mo529i(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    /* renamed from: k */
    public boolean mo531k(C0148r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new C0127h(rVar).mo660b((IBinder) null);
        C0139m.C0140a aVar = this.f512u;
        if (aVar == null) {
            return true;
        }
        aVar.mo327d(rVar);
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f507p.mo596M(this.f513v.getItem(i), this, 0);
    }
}
