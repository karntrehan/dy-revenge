package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p027c.p060f.C1801g;
import p027c.p064i.p066e.p067a.C1845b;
import p027c.p064i.p066e.p067a.C1846c;

/* renamed from: androidx.appcompat.view.menu.c */
abstract class C0114c {

    /* renamed from: a */
    final Context f465a;

    /* renamed from: b */
    private C1801g<C1845b, MenuItem> f466b;

    /* renamed from: c */
    private C1801g<C1846c, SubMenu> f467c;

    C0114c(Context context) {
        this.f465a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem mo538c(MenuItem menuItem) {
        if (!(menuItem instanceof C1845b)) {
            return menuItem;
        }
        C1845b bVar = (C1845b) menuItem;
        if (this.f466b == null) {
            this.f466b = new C1801g<>();
        }
        MenuItem menuItem2 = this.f466b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0130j jVar = new C0130j(this.f465a, bVar);
        this.f466b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu mo539d(SubMenu subMenu) {
        if (!(subMenu instanceof C1846c)) {
            return subMenu;
        }
        C1846c cVar = (C1846c) subMenu;
        if (this.f467c == null) {
            this.f467c = new C1801g<>();
        }
        SubMenu subMenu2 = this.f467c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0149s sVar = new C0149s(this.f465a, cVar);
        this.f467c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo540e() {
        C1801g<C1845b, MenuItem> gVar = this.f466b;
        if (gVar != null) {
            gVar.clear();
        }
        C1801g<C1846c, SubMenu> gVar2 = this.f467c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo541f(int i) {
        if (this.f466b != null) {
            int i2 = 0;
            while (i2 < this.f466b.size()) {
                if (this.f466b.mo6258i(i2).getGroupId() == i) {
                    this.f466b.mo6261k(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo542g(int i) {
        if (this.f466b != null) {
            for (int i2 = 0; i2 < this.f466b.size(); i2++) {
                if (this.f466b.mo6258i(i2).getItemId() == i) {
                    this.f466b.mo6261k(i2);
                    return;
                }
            }
        }
    }
}
