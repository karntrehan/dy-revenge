package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0124g;

/* renamed from: androidx.appcompat.view.menu.r */
public class C0148r extends C0124g implements SubMenu {

    /* renamed from: B */
    private C0124g f634B;

    /* renamed from: C */
    private C0128i f635C;

    public C0148r(Context context, C0124g gVar, C0128i iVar) {
        super(context);
        this.f634B = gVar;
        this.f635C = iVar;
    }

    /* renamed from: D */
    public C0124g mo587D() {
        return this.f634B.mo587D();
    }

    /* renamed from: F */
    public boolean mo589F() {
        return this.f634B.mo589F();
    }

    /* renamed from: G */
    public boolean mo590G() {
        return this.f634B.mo590G();
    }

    /* renamed from: H */
    public boolean mo591H() {
        return this.f634B.mo591H();
    }

    /* renamed from: R */
    public void mo600R(C0124g.C0125a aVar) {
        this.f634B.mo600R(aVar);
    }

    /* renamed from: e0 */
    public Menu mo838e0() {
        return this.f634B;
    }

    /* renamed from: f */
    public boolean mo628f(C0128i iVar) {
        return this.f634B.mo628f(iVar);
    }

    public MenuItem getItem() {
        return this.f635C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo631h(C0124g gVar, MenuItem menuItem) {
        return super.mo631h(gVar, menuItem) || this.f634B.mo631h(gVar, menuItem);
    }

    /* renamed from: k */
    public boolean mo634k(C0128i iVar) {
        return this.f634B.mo634k(iVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f634B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo603U(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo604V(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo605X(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo606Y(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo607Z(view);
    }

    public SubMenu setIcon(int i) {
        this.f635C.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f635C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f634B.setQwertyMode(z);
    }

    /* renamed from: t */
    public String mo652t() {
        C0128i iVar = this.f635C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo652t() + ":" + itemId;
    }
}
