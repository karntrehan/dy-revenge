package p027c.p064i.p072j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p027c.p064i.p066e.p067a.C1845b;

/* renamed from: c.i.j.h */
public final class C1974h {
    /* renamed from: a */
    public static MenuItem m8290a(MenuItem menuItem, C1907b bVar) {
        if (menuItem instanceof C1845b) {
            return ((C1845b) menuItem).mo463a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m8291b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C1845b) {
            ((C1845b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: c */
    public static void m8292c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C1845b) {
            ((C1845b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: d */
    public static void m8293d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C1845b) {
            ((C1845b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: e */
    public static void m8294e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C1845b) {
            ((C1845b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: f */
    public static void m8295f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C1845b) {
            ((C1845b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: g */
    public static void m8296g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C1845b) {
            ((C1845b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
