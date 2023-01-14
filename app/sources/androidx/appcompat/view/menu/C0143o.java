package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p027c.p064i.p066e.p067a.C1844a;

/* renamed from: androidx.appcompat.view.menu.o */
public class C0143o extends C0114c implements Menu {

    /* renamed from: d */
    private final C1844a f610d;

    public C0143o(Context context, C1844a aVar) {
        super(context);
        if (aVar != null) {
            this.f610d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return mo538c(this.f610d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo538c(this.f610d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo538c(this.f610d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo538c(this.f610d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f610d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo538c(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo539d(this.f610d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo539d(this.f610d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo539d(this.f610d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo539d(this.f610d.addSubMenu(charSequence));
    }

    public void clear() {
        mo540e();
        this.f610d.clear();
    }

    public void close() {
        this.f610d.close();
    }

    public MenuItem findItem(int i) {
        return mo538c(this.f610d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo538c(this.f610d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f610d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f610d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f610d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f610d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo541f(i);
        this.f610d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo542g(i);
        this.f610d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f610d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f610d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f610d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f610d.setQwertyMode(z);
    }

    public int size() {
        return this.f610d.size();
    }
}
