package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0139m;
import p027c.p064i.p072j.C1915d;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.view.menu.l */
public class C0137l {

    /* renamed from: a */
    private final Context f597a;

    /* renamed from: b */
    private final C0124g f598b;

    /* renamed from: c */
    private final boolean f599c;

    /* renamed from: d */
    private final int f600d;

    /* renamed from: e */
    private final int f601e;

    /* renamed from: f */
    private View f602f;

    /* renamed from: g */
    private int f603g;

    /* renamed from: h */
    private boolean f604h;

    /* renamed from: i */
    private C0139m.C0140a f605i;

    /* renamed from: j */
    private C0136k f606j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f607k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f608l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    class C0138a implements PopupWindow.OnDismissListener {
        C0138a() {
        }

        public void onDismiss() {
            C0137l.this.mo799e();
        }
    }

    public C0137l(Context context, C0124g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public C0137l(Context context, C0124g gVar, View view, boolean z, int i, int i2) {
        this.f603g = 8388611;
        this.f608l = new C0138a();
        this.f597a = context;
        this.f598b = gVar;
        this.f602f = view;
        this.f599c = z;
        this.f600d = i;
        this.f601e = i2;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0136k m723a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f597a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f597a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p027c.p028a.C1438d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f597a
            android.view.View r3 = r14.f602f
            int r4 = r14.f600d
            int r5 = r14.f601e
            boolean r6 = r14.f599c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r8 = r14.f597a
            androidx.appcompat.view.menu.g r9 = r14.f598b
            android.view.View r10 = r14.f602f
            int r11 = r14.f600d
            int r12 = r14.f601e
            boolean r13 = r14.f599c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f598b
            r0.mo548l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f608l
            r0.mo556u(r1)
            android.view.View r1 = r14.f602f
            r0.mo552p(r1)
            androidx.appcompat.view.menu.m$a r1 = r14.f605i
            r0.mo528h(r1)
            boolean r1 = r14.f604h
            r0.mo553r(r1)
            int r1 = r14.f603g
            r0.mo554s(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0137l.m723a():androidx.appcompat.view.menu.k");
    }

    /* renamed from: l */
    private void m724l(int i, int i2, boolean z, boolean z2) {
        C0136k c = mo797c();
        c.mo557v(z2);
        if (z) {
            if ((C1915d.m8012b(this.f603g, C1988t.m8417y(this.f602f)) & 7) == 5) {
                i -= this.f602f.getWidth();
            }
            c.mo555t(i);
            c.mo558w(i2);
            int i3 = (int) ((this.f597a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo795q(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo543a();
    }

    /* renamed from: b */
    public void mo796b() {
        if (mo798d()) {
            this.f606j.dismiss();
        }
    }

    /* renamed from: c */
    public C0136k mo797c() {
        if (this.f606j == null) {
            this.f606j = m723a();
        }
        return this.f606j;
    }

    /* renamed from: d */
    public boolean mo798d() {
        C0136k kVar = this.f606j;
        return kVar != null && kVar.mo544b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo799e() {
        this.f606j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f607k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo800f(View view) {
        this.f602f = view;
    }

    /* renamed from: g */
    public void mo801g(boolean z) {
        this.f604h = z;
        C0136k kVar = this.f606j;
        if (kVar != null) {
            kVar.mo553r(z);
        }
    }

    /* renamed from: h */
    public void mo802h(int i) {
        this.f603g = i;
    }

    /* renamed from: i */
    public void mo803i(PopupWindow.OnDismissListener onDismissListener) {
        this.f607k = onDismissListener;
    }

    /* renamed from: j */
    public void mo804j(C0139m.C0140a aVar) {
        this.f605i = aVar;
        C0136k kVar = this.f606j;
        if (kVar != null) {
            kVar.mo528h(aVar);
        }
    }

    /* renamed from: k */
    public void mo805k() {
        if (!mo806m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean mo806m() {
        if (mo798d()) {
            return true;
        }
        if (this.f602f == null) {
            return false;
        }
        m724l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean mo807n(int i, int i2) {
        if (mo798d()) {
            return true;
        }
        if (this.f602f == null) {
            return false;
        }
        m724l(i, i2, true, true);
        return true;
    }
}
