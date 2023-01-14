package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C1135a;
import androidx.core.graphics.drawable.C1164a;
import p027c.p064i.p066e.p067a.C1845b;
import p027c.p064i.p072j.C1907b;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0112a implements C1845b {

    /* renamed from: a */
    private final int f435a;

    /* renamed from: b */
    private final int f436b;

    /* renamed from: c */
    private final int f437c;

    /* renamed from: d */
    private CharSequence f438d;

    /* renamed from: e */
    private CharSequence f439e;

    /* renamed from: f */
    private Intent f440f;

    /* renamed from: g */
    private char f441g;

    /* renamed from: h */
    private int f442h = 4096;

    /* renamed from: i */
    private char f443i;

    /* renamed from: j */
    private int f444j = 4096;

    /* renamed from: k */
    private Drawable f445k;

    /* renamed from: l */
    private Context f446l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f447m;

    /* renamed from: n */
    private CharSequence f448n;

    /* renamed from: o */
    private CharSequence f449o;

    /* renamed from: p */
    private ColorStateList f450p = null;

    /* renamed from: q */
    private PorterDuff.Mode f451q = null;

    /* renamed from: r */
    private boolean f452r = false;

    /* renamed from: s */
    private boolean f453s = false;

    /* renamed from: t */
    private int f454t = 16;

    public C0112a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f446l = context;
        this.f435a = i2;
        this.f436b = i;
        this.f437c = i4;
        this.f438d = charSequence;
    }

    /* renamed from: c */
    private void m533c() {
        Drawable drawable = this.f445k;
        if (drawable == null) {
            return;
        }
        if (this.f452r || this.f453s) {
            Drawable r = C1164a.m4554r(drawable);
            this.f445k = r;
            Drawable mutate = r.mutate();
            this.f445k = mutate;
            if (this.f452r) {
                C1164a.m4551o(mutate, this.f450p);
            }
            if (this.f453s) {
                C1164a.m4552p(this.f445k, this.f451q);
            }
        }
    }

    /* renamed from: a */
    public C1845b mo463a(C1907b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C1907b mo464b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C1845b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C1845b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C1845b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f444j;
    }

    public char getAlphabeticShortcut() {
        return this.f443i;
    }

    public CharSequence getContentDescription() {
        return this.f448n;
    }

    public int getGroupId() {
        return this.f436b;
    }

    public Drawable getIcon() {
        return this.f445k;
    }

    public ColorStateList getIconTintList() {
        return this.f450p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f451q;
    }

    public Intent getIntent() {
        return this.f440f;
    }

    public int getItemId() {
        return this.f435a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f442h;
    }

    public char getNumericShortcut() {
        return this.f441g;
    }

    public int getOrder() {
        return this.f437c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f438d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f439e;
        return charSequence != null ? charSequence : this.f438d;
    }

    public CharSequence getTooltipText() {
        return this.f449o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f454t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f454t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f454t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f454t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f443i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f443i = Character.toLowerCase(c);
        this.f444j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f454t = z | (this.f454t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f454t = (z ? 2 : 0) | (this.f454t & -3);
        return this;
    }

    public C1845b setContentDescription(CharSequence charSequence) {
        this.f448n = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f454t = (z ? 16 : 0) | (this.f454t & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f445k = C1135a.m4419e(this.f446l, i);
        m533c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f445k = drawable;
        m533c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f450p = colorStateList;
        this.f452r = true;
        m533c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f451q = mode;
        this.f453s = true;
        m533c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f440f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f441g = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f441g = c;
        this.f442h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f447m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f441g = c;
        this.f443i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f441g = c;
        this.f442h = KeyEvent.normalizeMetaState(i);
        this.f443i = Character.toLowerCase(c2);
        this.f444j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(int i) {
        this.f438d = this.f446l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f438d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f439e = charSequence;
        return this;
    }

    public C1845b setTooltipText(CharSequence charSequence) {
        this.f449o = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f454t & 8;
        if (z) {
            i = 0;
        }
        this.f454t = i2 | i;
        return this;
    }
}
