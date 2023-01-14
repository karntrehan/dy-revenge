package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0139m;
import androidx.appcompat.widget.C0244l0;
import p027c.p028a.C1438d;
import p027c.p028a.C1441g;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.view.menu.q */
final class C0145q extends C0136k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0139m, View.OnKeyListener {

    /* renamed from: o */
    private static final int f611o = C1441g.abc_popup_menu_item_layout;

    /* renamed from: A */
    private View f612A;

    /* renamed from: B */
    View f613B;

    /* renamed from: C */
    private C0139m.C0140a f614C;

    /* renamed from: D */
    ViewTreeObserver f615D;

    /* renamed from: E */
    private boolean f616E;

    /* renamed from: F */
    private boolean f617F;

    /* renamed from: G */
    private int f618G;

    /* renamed from: H */
    private int f619H = 0;

    /* renamed from: I */
    private boolean f620I;

    /* renamed from: p */
    private final Context f621p;

    /* renamed from: q */
    private final C0124g f622q;

    /* renamed from: r */
    private final C0123f f623r;

    /* renamed from: s */
    private final boolean f624s;

    /* renamed from: t */
    private final int f625t;

    /* renamed from: u */
    private final int f626u;

    /* renamed from: v */
    private final int f627v;

    /* renamed from: w */
    final C0244l0 f628w;

    /* renamed from: x */
    final ViewTreeObserver.OnGlobalLayoutListener f629x = new C0146a();

    /* renamed from: y */
    private final View.OnAttachStateChangeListener f630y = new C0147b();

    /* renamed from: z */
    private PopupWindow.OnDismissListener f631z;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    class C0146a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0146a() {
        }

        public void onGlobalLayout() {
            if (C0145q.this.mo544b() && !C0145q.this.f628w.mo1475x()) {
                View view = C0145q.this.f613B;
                if (view == null || !view.isShown()) {
                    C0145q.this.dismiss();
                } else {
                    C0145q.this.f628w.mo543a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    class C0147b implements View.OnAttachStateChangeListener {
        C0147b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0145q.this.f615D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0145q.this.f615D = view.getViewTreeObserver();
                }
                C0145q qVar = C0145q.this;
                qVar.f615D.removeGlobalOnLayoutListener(qVar.f629x);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0145q(Context context, C0124g gVar, View view, int i, int i2, boolean z) {
        this.f621p = context;
        this.f622q = gVar;
        this.f624s = z;
        this.f623r = new C0123f(gVar, LayoutInflater.from(context), z, f611o);
        this.f626u = i;
        this.f627v = i2;
        Resources resources = context.getResources();
        this.f625t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1438d.abc_config_prefDialogWidth));
        this.f612A = view;
        this.f628w = new C0244l0(context, (AttributeSet) null, i, i2);
        gVar.mo620c(this, context);
    }

    /* renamed from: z */
    private boolean m753z() {
        View view;
        if (mo544b()) {
            return true;
        }
        if (this.f616E || (view = this.f612A) == null) {
            return false;
        }
        this.f613B = view;
        this.f628w.mo1457G(this);
        this.f628w.mo1458H(this);
        this.f628w.mo1456F(true);
        View view2 = this.f613B;
        boolean z = this.f615D == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f615D = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f629x);
        }
        view2.addOnAttachStateChangeListener(this.f630y);
        this.f628w.mo1476z(view2);
        this.f628w.mo1453C(this.f619H);
        if (!this.f617F) {
            this.f618G = C0136k.m706o(this.f623r, (ViewGroup) null, this.f621p, this.f625t);
            this.f617F = true;
        }
        this.f628w.mo1452B(this.f618G);
        this.f628w.mo1455E(2);
        this.f628w.mo1454D(mo793n());
        this.f628w.mo543a();
        ListView j = this.f628w.mo547j();
        j.setOnKeyListener(this);
        if (this.f620I && this.f622q.mo656x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f621p).inflate(C1441g.abc_popup_menu_header_item_layout, j, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f622q.mo656x());
            }
            frameLayout.setEnabled(false);
            j.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f628w.mo1469p(this.f623r);
        this.f628w.mo543a();
        return true;
    }

    /* renamed from: a */
    public void mo543a() {
        if (!m753z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public boolean mo544b() {
        return !this.f616E && this.f628w.mo544b();
    }

    /* renamed from: c */
    public void mo524c(C0124g gVar, boolean z) {
        if (gVar == this.f622q) {
            dismiss();
            C0139m.C0140a aVar = this.f614C;
            if (aVar != null) {
                aVar.mo326c(gVar, z);
            }
        }
    }

    /* renamed from: d */
    public void mo525d(boolean z) {
        this.f617F = false;
        C0123f fVar = this.f623r;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public void dismiss() {
        if (mo544b()) {
            this.f628w.dismiss();
        }
    }

    /* renamed from: e */
    public boolean mo546e() {
        return false;
    }

    /* renamed from: h */
    public void mo528h(C0139m.C0140a aVar) {
        this.f614C = aVar;
    }

    /* renamed from: j */
    public ListView mo547j() {
        return this.f628w.mo547j();
    }

    /* renamed from: k */
    public boolean mo531k(C0148r rVar) {
        if (rVar.hasVisibleItems()) {
            C0137l lVar = new C0137l(this.f621p, rVar, this.f613B, this.f624s, this.f626u, this.f627v);
            lVar.mo804j(this.f614C);
            lVar.mo801g(C0136k.m707x(rVar));
            lVar.mo803i(this.f631z);
            this.f631z = null;
            this.f622q.mo627e(false);
            int d = this.f628w.mo1464d();
            int o = this.f628w.mo1468o();
            if ((Gravity.getAbsoluteGravity(this.f619H, C1988t.m8417y(this.f612A)) & 7) == 5) {
                d += this.f612A.getWidth();
            }
            if (lVar.mo807n(d, o)) {
                C0139m.C0140a aVar = this.f614C;
                if (aVar == null) {
                    return true;
                }
                aVar.mo327d(rVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public void mo548l(C0124g gVar) {
    }

    public void onDismiss() {
        this.f616E = true;
        this.f622q.close();
        ViewTreeObserver viewTreeObserver = this.f615D;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f615D = this.f613B.getViewTreeObserver();
            }
            this.f615D.removeGlobalOnLayoutListener(this.f629x);
            this.f615D = null;
        }
        this.f613B.removeOnAttachStateChangeListener(this.f630y);
        PopupWindow.OnDismissListener onDismissListener = this.f631z;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f612A = view;
    }

    /* renamed from: r */
    public void mo553r(boolean z) {
        this.f623r.mo579d(z);
    }

    /* renamed from: s */
    public void mo554s(int i) {
        this.f619H = i;
    }

    /* renamed from: t */
    public void mo555t(int i) {
        this.f628w.mo1465f(i);
    }

    /* renamed from: u */
    public void mo556u(PopupWindow.OnDismissListener onDismissListener) {
        this.f631z = onDismissListener;
    }

    /* renamed from: v */
    public void mo557v(boolean z) {
        this.f620I = z;
    }

    /* renamed from: w */
    public void mo558w(int i) {
        this.f628w.mo1467l(i);
    }
}
