package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0062b;
import androidx.appcompat.view.menu.C0139m;
import p027c.p028a.C1441g;

/* renamed from: androidx.appcompat.view.menu.h */
class C0127h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0139m.C0140a {

    /* renamed from: f */
    private C0124g f549f;

    /* renamed from: o */
    private C0062b f550o;

    /* renamed from: p */
    C0121e f551p;

    /* renamed from: q */
    private C0139m.C0140a f552q;

    public C0127h(C0124g gVar) {
        this.f549f = gVar;
    }

    /* renamed from: a */
    public void mo659a() {
        C0062b bVar = this.f550o;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: b */
    public void mo660b(IBinder iBinder) {
        C0124g gVar = this.f549f;
        C0062b.C0063a aVar = new C0062b.C0063a(gVar.mo653u());
        C0121e eVar = new C0121e(aVar.mo213b(), C1441g.abc_list_menu_item_layout);
        this.f551p = eVar;
        eVar.mo528h(this);
        this.f549f.mo619b(this.f551p);
        aVar.mo214c(this.f551p.mo566a(), this);
        View y = gVar.mo657y();
        if (y != null) {
            aVar.mo215d(y);
        } else {
            aVar.mo216e(gVar.mo655w()).mo219h(gVar.mo656x());
        }
        aVar.mo217f(this);
        C0062b a = aVar.mo212a();
        this.f550o = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f550o.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f550o.show();
    }

    /* renamed from: c */
    public void mo326c(C0124g gVar, boolean z) {
        if (z || gVar == this.f549f) {
            mo659a();
        }
        C0139m.C0140a aVar = this.f552q;
        if (aVar != null) {
            aVar.mo326c(gVar, z);
        }
    }

    /* renamed from: d */
    public boolean mo327d(C0124g gVar) {
        C0139m.C0140a aVar = this.f552q;
        if (aVar != null) {
            return aVar.mo327d(gVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f549f.mo595L((C0128i) this.f551p.mo566a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f551p.mo524c(this.f549f, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f550o.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f550o.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f549f.mo627e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f549f.performShortcut(i, keyEvent, 0);
    }
}
