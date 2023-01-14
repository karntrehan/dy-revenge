package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0123f;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.view.menu.C0128i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.l0 */
public class C0244l0 extends C0233j0 implements C0242k0 {

    /* renamed from: W */
    private static Method f1062W;

    /* renamed from: X */
    private C0242k0 f1063X;

    /* renamed from: androidx.appcompat.widget.l0$a */
    public static class C0245a extends C0218f0 {

        /* renamed from: B */
        final int f1064B;

        /* renamed from: C */
        final int f1065C;

        /* renamed from: D */
        private C0242k0 f1066D;

        /* renamed from: E */
        private MenuItem f1067E;

        public C0245a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1064B = 22;
                this.f1065C = 21;
                return;
            }
            this.f1064B = 21;
            this.f1065C = 22;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo1351d(int i, int i2, int i3, int i4, int i5) {
            return super.mo1351d(i, i2, i3, i4, i5);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo1354e(MotionEvent motionEvent, int i) {
            return super.mo1354e(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f1066D != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0123f fVar = (C0123f) adapter;
                C0128i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f1067E;
                if (menuItem != iVar) {
                    C0124g b = fVar.mo577b();
                    if (menuItem != null) {
                        this.f1066D.mo563h(b, menuItem);
                    }
                    this.f1067E = iVar;
                    if (iVar != null) {
                        this.f1066D.mo562e(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1064B) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1065C) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0123f) getAdapter()).mo577b().mo627e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C0242k0 k0Var) {
            this.f1066D = k0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1062W = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0244l0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: N */
    public void mo1496N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1041V.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: O */
    public void mo1497O(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1041V.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: P */
    public void mo1498P(C0242k0 k0Var) {
        this.f1063X = k0Var;
    }

    /* renamed from: Q */
    public void mo1499Q(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1062W;
            if (method != null) {
                try {
                    method.invoke(this.f1041V, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1041V.setTouchModal(z);
        }
    }

    /* renamed from: e */
    public void mo562e(C0124g gVar, MenuItem menuItem) {
        C0242k0 k0Var = this.f1063X;
        if (k0Var != null) {
            k0Var.mo562e(gVar, menuItem);
        }
    }

    /* renamed from: h */
    public void mo563h(C0124g gVar, MenuItem menuItem) {
        C0242k0 k0Var = this.f1063X;
        if (k0Var != null) {
            k0Var.mo563h(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0218f0 mo1471s(Context context, boolean z) {
        C0245a aVar = new C0245a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
