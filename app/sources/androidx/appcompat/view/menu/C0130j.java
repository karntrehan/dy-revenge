package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p027c.p028a.p035o.C1468c;
import p027c.p064i.p066e.p067a.C1845b;
import p027c.p064i.p072j.C1907b;

/* renamed from: androidx.appcompat.view.menu.j */
public class C0130j extends C0114c implements MenuItem {

    /* renamed from: d */
    private final C1845b f585d;

    /* renamed from: e */
    private Method f586e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    private class C0131a extends C1907b {

        /* renamed from: d */
        final ActionProvider f587d;

        C0131a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f587d = actionProvider;
        }

        /* renamed from: a */
        public boolean mo778a() {
            return this.f587d.hasSubMenu();
        }

        /* renamed from: c */
        public View mo779c() {
            return this.f587d.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo780e() {
            return this.f587d.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo781f(SubMenu subMenu) {
            this.f587d.onPrepareSubMenu(C0130j.this.mo539d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    private class C0132b extends C0131a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private C1907b.C1909b f589f;

        C0132b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo782b() {
            return this.f587d.isVisible();
        }

        /* renamed from: d */
        public View mo783d(MenuItem menuItem) {
            return this.f587d.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo784g() {
            return this.f587d.overridesItemVisibility();
        }

        /* renamed from: j */
        public void mo785j(C1907b.C1909b bVar) {
            this.f589f = bVar;
            this.f587d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C1907b.C1909b bVar = this.f589f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    static class C0133c extends FrameLayout implements C1468c {

        /* renamed from: f */
        final CollapsibleActionView f591f;

        C0133c(View view) {
            super(view.getContext());
            this.f591f = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo787a() {
            return (View) this.f591f;
        }

        /* renamed from: c */
        public void mo788c() {
            this.f591f.onActionViewExpanded();
        }

        /* renamed from: f */
        public void mo789f() {
            this.f591f.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    private class C0134d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f592a;

        C0134d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f592a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f592a.onMenuItemActionCollapse(C0130j.this.mo538c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f592a.onMenuItemActionExpand(C0130j.this.mo538c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    private class C0135e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f594a;

        C0135e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f594a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f594a.onMenuItemClick(C0130j.this.mo538c(menuItem));
        }
    }

    public C0130j(Context context, C1845b bVar) {
        super(context);
        if (bVar != null) {
            this.f585d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f585d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f585d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C1907b b = this.f585d.mo464b();
        if (b instanceof C0131a) {
            return ((C0131a) b).f587d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f585d.getActionView();
        return actionView instanceof C0133c ? ((C0133c) actionView).mo787a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f585d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f585d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f585d.getContentDescription();
    }

    public int getGroupId() {
        return this.f585d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f585d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f585d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f585d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f585d.getIntent();
    }

    public int getItemId() {
        return this.f585d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f585d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f585d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f585d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f585d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo539d(this.f585d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f585d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f585d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f585d.getTooltipText();
    }

    /* renamed from: h */
    public void mo744h(boolean z) {
        try {
            if (this.f586e == null) {
                this.f586e = this.f585d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f586e.invoke(this.f585d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean hasSubMenu() {
        return this.f585d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f585d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f585d.isCheckable();
    }

    public boolean isChecked() {
        return this.f585d.isChecked();
    }

    public boolean isEnabled() {
        return this.f585d.isEnabled();
    }

    public boolean isVisible() {
        return this.f585d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C1907b bVar = Build.VERSION.SDK_INT >= 16 ? new C0132b(this.f465a, actionProvider) : new C0131a(this.f465a, actionProvider);
        C1845b bVar2 = this.f585d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo463a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f585d.setActionView(i);
        View actionView = this.f585d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f585d.setActionView((View) new C0133c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0133c(view);
        }
        this.f585d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f585d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f585d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f585d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f585d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f585d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f585d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f585d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f585d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f585d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f585d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f585d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f585d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f585d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f585d.setOnActionExpandListener(onActionExpandListener != null ? new C0134d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f585d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0135e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f585d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f585d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f585d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f585d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f585d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f585d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f585d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f585d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f585d.setVisible(z);
    }
}
