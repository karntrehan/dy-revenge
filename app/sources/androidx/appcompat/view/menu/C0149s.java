package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p027c.p064i.p066e.p067a.C1846c;

/* renamed from: androidx.appcompat.view.menu.s */
class C0149s extends C0143o implements SubMenu {

    /* renamed from: e */
    private final C1846c f636e;

    C0149s(Context context, C1846c cVar) {
        super(context, cVar);
        this.f636e = cVar;
    }

    public void clearHeader() {
        this.f636e.clearHeader();
    }

    public MenuItem getItem() {
        return mo538c(this.f636e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f636e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f636e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f636e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f636e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f636e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f636e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f636e.setIcon(drawable);
        return this;
    }
}
