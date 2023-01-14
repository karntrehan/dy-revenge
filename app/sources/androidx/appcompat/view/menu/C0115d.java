package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0139m;
import androidx.appcompat.widget.C0242k0;
import androidx.appcompat.widget.C0244l0;
import java.util.ArrayList;
import java.util.List;
import p027c.p028a.C1438d;
import p027c.p028a.C1441g;
import p027c.p064i.p072j.C1915d;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.view.menu.d */
final class C0115d extends C0136k implements C0139m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: o */
    private static final int f468o = C1441g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private int f469A = 0;

    /* renamed from: B */
    private int f470B = 0;

    /* renamed from: C */
    private View f471C;

    /* renamed from: D */
    View f472D;

    /* renamed from: E */
    private int f473E;

    /* renamed from: F */
    private boolean f474F;

    /* renamed from: G */
    private boolean f475G;

    /* renamed from: H */
    private int f476H;

    /* renamed from: I */
    private int f477I;

    /* renamed from: J */
    private boolean f478J;

    /* renamed from: K */
    private boolean f479K;

    /* renamed from: L */
    private C0139m.C0140a f480L;

    /* renamed from: M */
    ViewTreeObserver f481M;

    /* renamed from: N */
    private PopupWindow.OnDismissListener f482N;

    /* renamed from: O */
    boolean f483O;

    /* renamed from: p */
    private final Context f484p;

    /* renamed from: q */
    private final int f485q;

    /* renamed from: r */
    private final int f486r;

    /* renamed from: s */
    private final int f487s;

    /* renamed from: t */
    private final boolean f488t;

    /* renamed from: u */
    final Handler f489u;

    /* renamed from: v */
    private final List<C0124g> f490v = new ArrayList();

    /* renamed from: w */
    final List<C0120d> f491w = new ArrayList();

    /* renamed from: x */
    final ViewTreeObserver.OnGlobalLayoutListener f492x = new C0116a();

    /* renamed from: y */
    private final View.OnAttachStateChangeListener f493y = new C0117b();

    /* renamed from: z */
    private final C0242k0 f494z = new C0118c();

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class C0116a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0116a() {
        }

        public void onGlobalLayout() {
            if (C0115d.this.mo544b() && C0115d.this.f491w.size() > 0 && !C0115d.this.f491w.get(0).f502a.mo1475x()) {
                View view = C0115d.this.f472D;
                if (view == null || !view.isShown()) {
                    C0115d.this.dismiss();
                    return;
                }
                for (C0120d dVar : C0115d.this.f491w) {
                    dVar.f502a.mo543a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class C0117b implements View.OnAttachStateChangeListener {
        C0117b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0115d.this.f481M;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0115d.this.f481M = view.getViewTreeObserver();
                }
                C0115d dVar = C0115d.this;
                dVar.f481M.removeGlobalOnLayoutListener(dVar.f492x);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class C0118c implements C0242k0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class C0119a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C0120d f498f;

            /* renamed from: o */
            final /* synthetic */ MenuItem f499o;

            /* renamed from: p */
            final /* synthetic */ C0124g f500p;

            C0119a(C0120d dVar, MenuItem menuItem, C0124g gVar) {
                this.f498f = dVar;
                this.f499o = menuItem;
                this.f500p = gVar;
            }

            public void run() {
                C0120d dVar = this.f498f;
                if (dVar != null) {
                    C0115d.this.f483O = true;
                    dVar.f503b.mo627e(false);
                    C0115d.this.f483O = false;
                }
                if (this.f499o.isEnabled() && this.f499o.hasSubMenu()) {
                    this.f500p.mo595L(this.f499o, 4);
                }
            }
        }

        C0118c() {
        }

        /* renamed from: e */
        public void mo562e(C0124g gVar, MenuItem menuItem) {
            C0120d dVar = null;
            C0115d.this.f489u.removeCallbacksAndMessages((Object) null);
            int size = C0115d.this.f491w.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == C0115d.this.f491w.get(i).f503b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0115d.this.f491w.size()) {
                    dVar = C0115d.this.f491w.get(i2);
                }
                C0115d.this.f489u.postAtTime(new C0119a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: h */
        public void mo563h(C0124g gVar, MenuItem menuItem) {
            C0115d.this.f489u.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class C0120d {

        /* renamed from: a */
        public final C0244l0 f502a;

        /* renamed from: b */
        public final C0124g f503b;

        /* renamed from: c */
        public final int f504c;

        public C0120d(C0244l0 l0Var, C0124g gVar, int i) {
            this.f502a = l0Var;
            this.f503b = gVar;
            this.f504c = i;
        }

        /* renamed from: a */
        public ListView mo565a() {
            return this.f502a.mo547j();
        }
    }

    public C0115d(Context context, View view, int i, int i2, boolean z) {
        this.f484p = context;
        this.f471C = view;
        this.f486r = i;
        this.f487s = i2;
        this.f488t = z;
        this.f478J = false;
        this.f473E = m563D();
        Resources resources = context.getResources();
        this.f485q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1438d.abc_config_prefDialogWidth));
        this.f489u = new Handler();
    }

    /* renamed from: A */
    private int m560A(C0124g gVar) {
        int size = this.f491w.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f491w.get(i).f503b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: B */
    private MenuItem m561B(C0124g gVar, C0124g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: C */
    private View m562C(C0120d dVar, C0124g gVar) {
        int i;
        C0123f fVar;
        int firstVisiblePosition;
        MenuItem B = m561B(dVar.f503b, gVar);
        if (B == null) {
            return null;
        }
        ListView a = dVar.mo565a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0123f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0123f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (B == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: D */
    private int m563D() {
        return C1988t.m8417y(this.f471C) == 1 ? 0 : 1;
    }

    /* renamed from: E */
    private int m564E(int i) {
        List<C0120d> list = this.f491w;
        ListView a = list.get(list.size() - 1).mo565a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f472D.getWindowVisibleDisplayFrame(rect);
        return this.f473E == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: F */
    private void m565F(C0124g gVar) {
        View view;
        C0120d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f484p);
        C0123f fVar = new C0123f(gVar, from, this.f488t, f468o);
        if (!mo544b() && this.f478J) {
            fVar.mo579d(true);
        } else if (mo544b()) {
            fVar.mo579d(C0136k.m707x(gVar));
        }
        int o = C0136k.m706o(fVar, (ViewGroup) null, this.f484p, this.f485q);
        C0244l0 z = m566z();
        z.mo1469p(fVar);
        z.mo1452B(o);
        z.mo1453C(this.f470B);
        if (this.f491w.size() > 0) {
            List<C0120d> list = this.f491w;
            dVar = list.get(list.size() - 1);
            view = m562C(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z.mo1499Q(false);
            z.mo1496N((Object) null);
            int E = m564E(o);
            boolean z2 = E == 1;
            this.f473E = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z.mo1476z(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f471C.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f470B & 7) == 5) {
                    iArr[0] = iArr[0] + this.f471C.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f470B & 5) != 5) {
                if (z2) {
                    o = view.getWidth();
                }
                i3 = i - o;
                z.mo1465f(i3);
                z.mo1459I(true);
                z.mo1467l(i2);
            } else if (!z2) {
                o = view.getWidth();
                i3 = i - o;
                z.mo1465f(i3);
                z.mo1459I(true);
                z.mo1467l(i2);
            }
            i3 = i + o;
            z.mo1465f(i3);
            z.mo1459I(true);
            z.mo1467l(i2);
        } else {
            if (this.f474F) {
                z.mo1465f(this.f476H);
            }
            if (this.f475G) {
                z.mo1467l(this.f477I);
            }
            z.mo1454D(mo793n());
        }
        this.f491w.add(new C0120d(z, gVar, this.f473E));
        z.mo543a();
        ListView j = z.mo547j();
        j.setOnKeyListener(this);
        if (dVar == null && this.f479K && gVar.mo656x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C1441g.abc_popup_menu_header_item_layout, j, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo656x());
            j.addHeaderView(frameLayout, (Object) null, false);
            z.mo543a();
        }
    }

    /* renamed from: z */
    private C0244l0 m566z() {
        C0244l0 l0Var = new C0244l0(this.f484p, (AttributeSet) null, this.f486r, this.f487s);
        l0Var.mo1498P(this.f494z);
        l0Var.mo1458H(this);
        l0Var.mo1457G(this);
        l0Var.mo1476z(this.f471C);
        l0Var.mo1453C(this.f470B);
        l0Var.mo1456F(true);
        l0Var.mo1455E(2);
        return l0Var;
    }

    /* renamed from: a */
    public void mo543a() {
        if (!mo544b()) {
            for (C0124g F : this.f490v) {
                m565F(F);
            }
            this.f490v.clear();
            View view = this.f471C;
            this.f472D = view;
            if (view != null) {
                boolean z = this.f481M == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f481M = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f492x);
                }
                this.f472D.addOnAttachStateChangeListener(this.f493y);
            }
        }
    }

    /* renamed from: b */
    public boolean mo544b() {
        return this.f491w.size() > 0 && this.f491w.get(0).f502a.mo544b();
    }

    /* renamed from: c */
    public void mo524c(C0124g gVar, boolean z) {
        int A = m560A(gVar);
        if (A >= 0) {
            int i = A + 1;
            if (i < this.f491w.size()) {
                this.f491w.get(i).f503b.mo627e(false);
            }
            C0120d remove = this.f491w.remove(A);
            remove.f503b.mo597O(this);
            if (this.f483O) {
                remove.f502a.mo1497O((Object) null);
                remove.f502a.mo1451A(0);
            }
            remove.f502a.dismiss();
            int size = this.f491w.size();
            this.f473E = size > 0 ? this.f491w.get(size - 1).f504c : m563D();
            if (size == 0) {
                dismiss();
                C0139m.C0140a aVar = this.f480L;
                if (aVar != null) {
                    aVar.mo326c(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f481M;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f481M.removeGlobalOnLayoutListener(this.f492x);
                    }
                    this.f481M = null;
                }
                this.f472D.removeOnAttachStateChangeListener(this.f493y);
                this.f482N.onDismiss();
            } else if (z) {
                this.f491w.get(0).f503b.mo627e(false);
            }
        }
    }

    /* renamed from: d */
    public void mo525d(boolean z) {
        for (C0120d a : this.f491w) {
            C0136k.m708y(a.mo565a().getAdapter()).notifyDataSetChanged();
        }
    }

    public void dismiss() {
        int size = this.f491w.size();
        if (size > 0) {
            C0120d[] dVarArr = (C0120d[]) this.f491w.toArray(new C0120d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0120d dVar = dVarArr[i];
                if (dVar.f502a.mo544b()) {
                    dVar.f502a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo546e() {
        return false;
    }

    /* renamed from: h */
    public void mo528h(C0139m.C0140a aVar) {
        this.f480L = aVar;
    }

    /* renamed from: j */
    public ListView mo547j() {
        if (this.f491w.isEmpty()) {
            return null;
        }
        List<C0120d> list = this.f491w;
        return list.get(list.size() - 1).mo565a();
    }

    /* renamed from: k */
    public boolean mo531k(C0148r rVar) {
        for (C0120d next : this.f491w) {
            if (rVar == next.f503b) {
                next.mo565a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo548l(rVar);
        C0139m.C0140a aVar = this.f480L;
        if (aVar != null) {
            aVar.mo327d(rVar);
        }
        return true;
    }

    /* renamed from: l */
    public void mo548l(C0124g gVar) {
        gVar.mo620c(this, this.f484p);
        if (mo544b()) {
            m565F(gVar);
        } else {
            this.f490v.add(gVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo549m() {
        return false;
    }

    public void onDismiss() {
        C0120d dVar;
        int size = this.f491w.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f491w.get(i);
            if (!dVar.f502a.mo544b()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f503b.mo627e(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public void mo552p(View view) {
        if (this.f471C != view) {
            this.f471C = view;
            this.f470B = C1915d.m8012b(this.f469A, C1988t.m8417y(view));
        }
    }

    /* renamed from: r */
    public void mo553r(boolean z) {
        this.f478J = z;
    }

    /* renamed from: s */
    public void mo554s(int i) {
        if (this.f469A != i) {
            this.f469A = i;
            this.f470B = C1915d.m8012b(i, C1988t.m8417y(this.f471C));
        }
    }

    /* renamed from: t */
    public void mo555t(int i) {
        this.f474F = true;
        this.f476H = i;
    }

    /* renamed from: u */
    public void mo556u(PopupWindow.OnDismissListener onDismissListener) {
        this.f482N = onDismissListener;
    }

    /* renamed from: v */
    public void mo557v(boolean z) {
        this.f479K = z;
    }

    /* renamed from: w */
    public void mo558w(int i) {
        this.f475G = true;
        this.f477I = i;
    }
}
