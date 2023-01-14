package p027c.p028a.p035o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p027c.p028a.p035o.C1466b;

/* renamed from: c.a.o.e */
public class C1470e extends C1466b implements C0124g.C0125a {

    /* renamed from: p */
    private Context f4563p;

    /* renamed from: q */
    private ActionBarContextView f4564q;

    /* renamed from: r */
    private C1466b.C1467a f4565r;

    /* renamed from: s */
    private WeakReference<View> f4566s;

    /* renamed from: t */
    private boolean f4567t;

    /* renamed from: u */
    private boolean f4568u;

    /* renamed from: v */
    private C0124g f4569v;

    public C1470e(Context context, ActionBarContextView actionBarContextView, C1466b.C1467a aVar, boolean z) {
        this.f4563p = context;
        this.f4564q = actionBarContextView;
        this.f4565r = aVar;
        C0124g S = new C0124g(actionBarContextView.getContext()).mo601S(1);
        this.f4569v = S;
        S.mo600R(this);
        this.f4568u = z;
    }

    /* renamed from: a */
    public boolean mo299a(C0124g gVar, MenuItem menuItem) {
        return this.f4565r.mo331d(this, menuItem);
    }

    /* renamed from: b */
    public void mo301b(C0124g gVar) {
        mo417k();
        this.f4564q.mo885l();
    }

    /* renamed from: c */
    public void mo411c() {
        if (!this.f4567t) {
            this.f4567t = true;
            this.f4564q.sendAccessibilityEvent(32);
            this.f4565r.mo328a(this);
        }
    }

    /* renamed from: d */
    public View mo412d() {
        WeakReference<View> weakReference = this.f4566s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo413e() {
        return this.f4569v;
    }

    /* renamed from: f */
    public MenuInflater mo414f() {
        return new C1473g(this.f4564q.getContext());
    }

    /* renamed from: g */
    public CharSequence mo415g() {
        return this.f4564q.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo416i() {
        return this.f4564q.getTitle();
    }

    /* renamed from: k */
    public void mo417k() {
        this.f4565r.mo330c(this, this.f4569v);
    }

    /* renamed from: l */
    public boolean mo418l() {
        return this.f4564q.mo883j();
    }

    /* renamed from: m */
    public void mo419m(View view) {
        this.f4564q.setCustomView(view);
        this.f4566s = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: n */
    public void mo420n(int i) {
        mo421o(this.f4563p.getString(i));
    }

    /* renamed from: o */
    public void mo421o(CharSequence charSequence) {
        this.f4564q.setSubtitle(charSequence);
    }

    /* renamed from: q */
    public void mo422q(int i) {
        mo423r(this.f4563p.getString(i));
    }

    /* renamed from: r */
    public void mo423r(CharSequence charSequence) {
        this.f4564q.setTitle(charSequence);
    }

    /* renamed from: s */
    public void mo424s(boolean z) {
        super.mo424s(z);
        this.f4564q.setTitleOptional(z);
    }
}
