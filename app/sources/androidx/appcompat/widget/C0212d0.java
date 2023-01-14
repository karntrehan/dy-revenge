package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.view.menu.C0139m;
import p027c.p064i.p072j.C2008y;

/* renamed from: androidx.appcompat.widget.d0 */
public interface C0212d0 {
    /* renamed from: a */
    Context mo1286a();

    /* renamed from: b */
    void mo1287b(Menu menu, C0139m.C0140a aVar);

    /* renamed from: c */
    boolean mo1288c();

    void collapseActionView();

    /* renamed from: d */
    void mo1290d();

    /* renamed from: e */
    boolean mo1291e();

    /* renamed from: f */
    boolean mo1292f();

    /* renamed from: g */
    boolean mo1293g();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo1295h();

    /* renamed from: i */
    void mo1296i();

    /* renamed from: j */
    void mo1297j(C0259p0 p0Var);

    /* renamed from: k */
    boolean mo1298k();

    /* renamed from: l */
    void mo1299l(int i);

    /* renamed from: m */
    Menu mo1300m();

    /* renamed from: n */
    void mo1301n(int i);

    /* renamed from: o */
    int mo1302o();

    /* renamed from: p */
    C2008y mo1303p(int i, long j);

    /* renamed from: q */
    void mo1304q(C0139m.C0140a aVar, C0124g.C0125a aVar2);

    /* renamed from: r */
    ViewGroup mo1305r();

    /* renamed from: s */
    void mo1306s(boolean z);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    int mo1313t();

    /* renamed from: u */
    void mo1314u();

    /* renamed from: v */
    void mo1315v();

    /* renamed from: w */
    void mo1316w(Drawable drawable);

    /* renamed from: x */
    void mo1317x(boolean z);
}
