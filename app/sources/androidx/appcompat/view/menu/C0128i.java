package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0141n;
import androidx.core.graphics.drawable.C1164a;
import okhttp3.HttpUrl;
import p027c.p028a.C1442h;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p066e.p067a.C1845b;
import p027c.p064i.p072j.C1907b;

/* renamed from: androidx.appcompat.view.menu.i */
public final class C0128i implements C1845b {

    /* renamed from: A */
    private View f553A;

    /* renamed from: B */
    private C1907b f554B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f555C;

    /* renamed from: D */
    private boolean f556D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f557E;

    /* renamed from: a */
    private final int f558a;

    /* renamed from: b */
    private final int f559b;

    /* renamed from: c */
    private final int f560c;

    /* renamed from: d */
    private final int f561d;

    /* renamed from: e */
    private CharSequence f562e;

    /* renamed from: f */
    private CharSequence f563f;

    /* renamed from: g */
    private Intent f564g;

    /* renamed from: h */
    private char f565h;

    /* renamed from: i */
    private int f566i = 4096;

    /* renamed from: j */
    private char f567j;

    /* renamed from: k */
    private int f568k = 4096;

    /* renamed from: l */
    private Drawable f569l;

    /* renamed from: m */
    private int f570m = 0;

    /* renamed from: n */
    C0124g f571n;

    /* renamed from: o */
    private C0148r f572o;

    /* renamed from: p */
    private Runnable f573p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f574q;

    /* renamed from: r */
    private CharSequence f575r;

    /* renamed from: s */
    private CharSequence f576s;

    /* renamed from: t */
    private ColorStateList f577t = null;

    /* renamed from: u */
    private PorterDuff.Mode f578u = null;

    /* renamed from: v */
    private boolean f579v = false;

    /* renamed from: w */
    private boolean f580w = false;

    /* renamed from: x */
    private boolean f581x = false;

    /* renamed from: y */
    private int f582y = 16;

    /* renamed from: z */
    private int f583z = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    class C0129a implements C1907b.C1909b {
        C0129a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0128i iVar = C0128i.this;
            iVar.f571n.mo593J(iVar);
        }
    }

    C0128i(C0124g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f571n = gVar;
        this.f558a = i2;
        this.f559b = i;
        this.f560c = i3;
        this.f561d = i4;
        this.f562e = charSequence;
        this.f583z = i5;
    }

    /* renamed from: d */
    private static void m666d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m667e(Drawable drawable) {
        if (drawable != null && this.f581x && (this.f579v || this.f580w)) {
            drawable = C1164a.m4554r(drawable).mutate();
            if (this.f579v) {
                C1164a.m4551o(drawable, this.f577t);
            }
            if (this.f580w) {
                C1164a.m4552p(drawable, this.f578u);
            }
            this.f581x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo664A() {
        return this.f571n.mo591H() && mo668g() != 0;
    }

    /* renamed from: B */
    public boolean mo665B() {
        return (this.f583z & 4) == 4;
    }

    /* renamed from: a */
    public C1845b mo463a(C1907b bVar) {
        C1907b bVar2 = this.f554B;
        if (bVar2 != null) {
            bVar2.mo6448h();
        }
        this.f553A = null;
        this.f554B = bVar;
        this.f571n.mo594K(true);
        C1907b bVar3 = this.f554B;
        if (bVar3 != null) {
            bVar3.mo785j(new C0129a());
        }
        return this;
    }

    /* renamed from: b */
    public C1907b mo464b() {
        return this.f554B;
    }

    /* renamed from: c */
    public void mo666c() {
        this.f571n.mo592I(this);
    }

    public boolean collapseActionView() {
        if ((this.f583z & 8) == 0) {
            return false;
        }
        if (this.f553A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f555C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f571n.mo628f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!mo688j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f555C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f571n.mo634k(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo667f() {
        return this.f561d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public char mo668g() {
        return this.f571n.mo590G() ? this.f567j : this.f565h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f553A;
        if (view != null) {
            return view;
        }
        C1907b bVar = this.f554B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo783d(this);
        this.f553A = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f568k;
    }

    public char getAlphabeticShortcut() {
        return this.f567j;
    }

    public CharSequence getContentDescription() {
        return this.f575r;
    }

    public int getGroupId() {
        return this.f559b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f569l;
        if (drawable != null) {
            return m667e(drawable);
        }
        if (this.f570m == 0) {
            return null;
        }
        Drawable d = C1445a.m6446d(this.f571n.mo653u(), this.f570m);
        this.f570m = 0;
        this.f569l = d;
        return m667e(d);
    }

    public ColorStateList getIconTintList() {
        return this.f577t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f578u;
    }

    public Intent getIntent() {
        return this.f564g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f558a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f557E;
    }

    public int getNumericModifiers() {
        return this.f566i;
    }

    public char getNumericShortcut() {
        return this.f565h;
    }

    public int getOrder() {
        return this.f560c;
    }

    public SubMenu getSubMenu() {
        return this.f572o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f562e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f563f;
        if (charSequence == null) {
            charSequence = this.f562e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f576s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo681h() {
        int i;
        char g = mo668g();
        if (g == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Resources resources = this.f571n.mo653u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f571n.mo653u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C1442h.abc_prepend_shortcut_label));
        }
        int i2 = this.f571n.mo590G() ? this.f568k : this.f566i;
        m666d(sb, i2, 65536, resources.getString(C1442h.abc_menu_meta_shortcut_label));
        m666d(sb, i2, 4096, resources.getString(C1442h.abc_menu_ctrl_shortcut_label));
        m666d(sb, i2, 2, resources.getString(C1442h.abc_menu_alt_shortcut_label));
        m666d(sb, i2, 1, resources.getString(C1442h.abc_menu_shift_shortcut_label));
        m666d(sb, i2, 4, resources.getString(C1442h.abc_menu_sym_shortcut_label));
        m666d(sb, i2, 8, resources.getString(C1442h.abc_menu_function_shortcut_label));
        if (g == 8) {
            i = C1442h.abc_menu_delete_shortcut_label;
        } else if (g == 10) {
            i = C1442h.abc_menu_enter_shortcut_label;
        } else if (g != ' ') {
            sb.append(g);
            return sb.toString();
        } else {
            i = C1442h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f572o != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo683i(C0141n.C0142a aVar) {
        return (aVar == null || !aVar.mo428d()) ? getTitle() : getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f556D;
    }

    public boolean isCheckable() {
        return (this.f582y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f582y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f582y & 16) != 0;
    }

    public boolean isVisible() {
        C1907b bVar = this.f554B;
        return (bVar == null || !bVar.mo784g()) ? (this.f582y & 8) == 0 : (this.f582y & 8) == 0 && this.f554B.mo782b();
    }

    /* renamed from: j */
    public boolean mo688j() {
        C1907b bVar;
        if ((this.f583z & 8) == 0) {
            return false;
        }
        if (this.f553A == null && (bVar = this.f554B) != null) {
            this.f553A = bVar.mo783d(this);
        }
        return this.f553A != null;
    }

    /* renamed from: k */
    public boolean mo689k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f574q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0124g gVar = this.f571n;
        if (gVar.mo631h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f573p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f564g != null) {
            try {
                this.f571n.mo653u().startActivity(this.f564g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C1907b bVar = this.f554B;
        return bVar != null && bVar.mo780e();
    }

    /* renamed from: l */
    public boolean mo690l() {
        return (this.f582y & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo691m() {
        return (this.f582y & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo692n() {
        return (this.f583z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo693o() {
        return (this.f583z & 2) == 2;
    }

    /* renamed from: p */
    public C1845b setActionView(int i) {
        Context u = this.f571n.mo653u();
        setActionView(LayoutInflater.from(u).inflate(i, new LinearLayout(u), false));
        return this;
    }

    /* renamed from: q */
    public C1845b setActionView(View view) {
        int i;
        this.f553A = view;
        this.f554B = null;
        if (view != null && view.getId() == -1 && (i = this.f558a) > 0) {
            view.setId(i);
        }
        this.f571n.mo592I(this);
        return this;
    }

    /* renamed from: r */
    public void mo696r(boolean z) {
        this.f556D = z;
        this.f571n.mo594K(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo697s(boolean z) {
        int i = this.f582y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f582y = i2;
        if (i != i2) {
            this.f571n.mo594K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f567j == c) {
            return this;
        }
        this.f567j = Character.toLowerCase(c);
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f567j == c && this.f568k == i) {
            return this;
        }
        this.f567j = Character.toLowerCase(c);
        this.f568k = KeyEvent.normalizeMetaState(i);
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f582y;
        boolean z2 = z | (i & true);
        this.f582y = z2 ? 1 : 0;
        if (i != z2) {
            this.f571n.mo594K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f582y & 4) != 0) {
            this.f571n.mo602T(this);
        } else {
            mo697s(z);
        }
        return this;
    }

    public C1845b setContentDescription(CharSequence charSequence) {
        this.f575r = charSequence;
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f582y = z ? this.f582y | 16 : this.f582y & -17;
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f569l = null;
        this.f570m = i;
        this.f581x = true;
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f570m = 0;
        this.f569l = drawable;
        this.f581x = true;
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f577t = colorStateList;
        this.f579v = true;
        this.f581x = true;
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f578u = mode;
        this.f580w = true;
        this.f581x = true;
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f564g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f565h == c) {
            return this;
        }
        this.f565h = c;
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f565h == c && this.f566i == i) {
            return this;
        }
        this.f565h = c;
        this.f566i = KeyEvent.normalizeMetaState(i);
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f555C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f574q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f565h = c;
        this.f567j = Character.toLowerCase(c2);
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f565h = c;
        this.f566i = KeyEvent.normalizeMetaState(i);
        this.f567j = Character.toLowerCase(c2);
        this.f568k = KeyEvent.normalizeMetaState(i2);
        this.f571n.mo594K(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f583z = i;
            this.f571n.mo592I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f571n.mo653u().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f562e = charSequence;
        this.f571n.mo594K(false);
        C0148r rVar = this.f572o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f563f = charSequence;
        this.f571n.mo594K(false);
        return this;
    }

    public C1845b setTooltipText(CharSequence charSequence) {
        this.f576s = charSequence;
        this.f571n.mo594K(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo720y(z)) {
            this.f571n.mo593J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo714t(boolean z) {
        this.f582y = (z ? 4 : 0) | (this.f582y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f562e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo716u(boolean z) {
        this.f582y = z ? this.f582y | 32 : this.f582y & -33;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo717v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f557E = contextMenuInfo;
    }

    /* renamed from: w */
    public C1845b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo719x(C0148r rVar) {
        this.f572o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo720y(boolean z) {
        int i = this.f582y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f582y = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean mo721z() {
        return this.f571n.mo585A();
    }
}
