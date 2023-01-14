package p027c.p064i.p072j;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: c.i.j.b */
public abstract class C1907b {

    /* renamed from: a */
    private final Context f5601a;

    /* renamed from: b */
    private C1908a f5602b;

    /* renamed from: c */
    private C1909b f5603c;

    /* renamed from: c.i.j.b$a */
    public interface C1908a {
    }

    /* renamed from: c.i.j.b$b */
    public interface C1909b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C1907b(Context context) {
        this.f5601a = context;
    }

    /* renamed from: a */
    public boolean mo778a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo782b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo779c();

    /* renamed from: d */
    public View mo783d(MenuItem menuItem) {
        return mo779c();
    }

    /* renamed from: e */
    public boolean mo780e() {
        return false;
    }

    /* renamed from: f */
    public void mo781f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo784g() {
        return false;
    }

    /* renamed from: h */
    public void mo6448h() {
        this.f5603c = null;
        this.f5602b = null;
    }

    /* renamed from: i */
    public void mo6449i(C1908a aVar) {
        this.f5602b = aVar;
    }

    /* renamed from: j */
    public void mo785j(C1909b bVar) {
        if (!(this.f5603c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f5603c = bVar;
    }
}
