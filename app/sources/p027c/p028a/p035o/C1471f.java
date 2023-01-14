package p027c.p028a.p035o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0130j;
import androidx.appcompat.view.menu.C0143o;
import java.util.ArrayList;
import p027c.p028a.p035o.C1466b;
import p027c.p060f.C1801g;
import p027c.p064i.p066e.p067a.C1844a;
import p027c.p064i.p066e.p067a.C1845b;

/* renamed from: c.a.o.f */
public class C1471f extends ActionMode {

    /* renamed from: a */
    final Context f4570a;

    /* renamed from: b */
    final C1466b f4571b;

    /* renamed from: c.a.o.f$a */
    public static class C1472a implements C1466b.C1467a {

        /* renamed from: a */
        final ActionMode.Callback f4572a;

        /* renamed from: b */
        final Context f4573b;

        /* renamed from: c */
        final ArrayList<C1471f> f4574c = new ArrayList<>();

        /* renamed from: d */
        final C1801g<Menu, Menu> f4575d = new C1801g<>();

        public C1472a(Context context, ActionMode.Callback callback) {
            this.f4573b = context;
            this.f4572a = callback;
        }

        /* renamed from: f */
        private Menu m6583f(Menu menu) {
            Menu menu2 = this.f4575d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0143o oVar = new C0143o(this.f4573b, (C1844a) menu);
            this.f4575d.put(menu, oVar);
            return oVar;
        }

        /* renamed from: a */
        public void mo328a(C1466b bVar) {
            this.f4572a.onDestroyActionMode(mo5480e(bVar));
        }

        /* renamed from: b */
        public boolean mo329b(C1466b bVar, Menu menu) {
            return this.f4572a.onCreateActionMode(mo5480e(bVar), m6583f(menu));
        }

        /* renamed from: c */
        public boolean mo330c(C1466b bVar, Menu menu) {
            return this.f4572a.onPrepareActionMode(mo5480e(bVar), m6583f(menu));
        }

        /* renamed from: d */
        public boolean mo331d(C1466b bVar, MenuItem menuItem) {
            return this.f4572a.onActionItemClicked(mo5480e(bVar), new C0130j(this.f4573b, (C1845b) menuItem));
        }

        /* renamed from: e */
        public ActionMode mo5480e(C1466b bVar) {
            int size = this.f4574c.size();
            for (int i = 0; i < size; i++) {
                C1471f fVar = this.f4574c.get(i);
                if (fVar != null && fVar.f4571b == bVar) {
                    return fVar;
                }
            }
            C1471f fVar2 = new C1471f(this.f4573b, bVar);
            this.f4574c.add(fVar2);
            return fVar2;
        }
    }

    public C1471f(Context context, C1466b bVar) {
        this.f4570a = context;
        this.f4571b = bVar;
    }

    public void finish() {
        this.f4571b.mo411c();
    }

    public View getCustomView() {
        return this.f4571b.mo412d();
    }

    public Menu getMenu() {
        return new C0143o(this.f4570a, (C1844a) this.f4571b.mo413e());
    }

    public MenuInflater getMenuInflater() {
        return this.f4571b.mo414f();
    }

    public CharSequence getSubtitle() {
        return this.f4571b.mo415g();
    }

    public Object getTag() {
        return this.f4571b.mo5451h();
    }

    public CharSequence getTitle() {
        return this.f4571b.mo416i();
    }

    public boolean getTitleOptionalHint() {
        return this.f4571b.mo5452j();
    }

    public void invalidate() {
        this.f4571b.mo417k();
    }

    public boolean isTitleOptional() {
        return this.f4571b.mo418l();
    }

    public void setCustomView(View view) {
        this.f4571b.mo419m(view);
    }

    public void setSubtitle(int i) {
        this.f4571b.mo420n(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4571b.mo421o(charSequence);
    }

    public void setTag(Object obj) {
        this.f4571b.mo5453p(obj);
    }

    public void setTitle(int i) {
        this.f4571b.mo422q(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4571b.mo423r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f4571b.mo424s(z);
    }
}
