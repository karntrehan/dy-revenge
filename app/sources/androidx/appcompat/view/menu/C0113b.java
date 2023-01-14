package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0139m;
import androidx.appcompat.view.menu.C0141n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class C0113b implements C0139m {

    /* renamed from: f */
    protected Context f455f;

    /* renamed from: o */
    protected Context f456o;

    /* renamed from: p */
    protected C0124g f457p;

    /* renamed from: q */
    protected LayoutInflater f458q;

    /* renamed from: r */
    protected LayoutInflater f459r;

    /* renamed from: s */
    private C0139m.C0140a f460s;

    /* renamed from: t */
    private int f461t;

    /* renamed from: u */
    private int f462u;

    /* renamed from: v */
    protected C0141n f463v;

    /* renamed from: w */
    private int f464w;

    public C0113b(Context context, int i, int i2) {
        this.f455f = context;
        this.f458q = LayoutInflater.from(context);
        this.f461t = i;
        this.f462u = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo522a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f463v).addView(view, i);
    }

    /* renamed from: b */
    public abstract void mo523b(C0128i iVar, C0141n.C0142a aVar);

    /* renamed from: c */
    public void mo524c(C0124g gVar, boolean z) {
        C0139m.C0140a aVar = this.f460s;
        if (aVar != null) {
            aVar.mo326c(gVar, z);
        }
    }

    /* renamed from: d */
    public void mo525d(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f463v;
        if (viewGroup != null) {
            C0124g gVar = this.f457p;
            int i = 0;
            if (gVar != null) {
                gVar.mo642r();
                ArrayList<C0128i> E = this.f457p.mo588E();
                int size = E.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0128i iVar = E.get(i3);
                    if (mo537q(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0128i itemData = childAt instanceof C0141n.C0142a ? ((C0141n.C0142a) childAt).getItemData() : null;
                        View n = mo534n(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            n.setPressed(false);
                            n.jumpDrawablesToCurrentState();
                        }
                        if (n != childAt) {
                            mo522a(n, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo532l(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: f */
    public boolean mo526f(C0124g gVar, C0128i iVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo527g(C0124g gVar, C0128i iVar) {
        return false;
    }

    /* renamed from: h */
    public void mo528h(C0139m.C0140a aVar) {
        this.f460s = aVar;
    }

    /* renamed from: i */
    public void mo529i(Context context, C0124g gVar) {
        this.f456o = context;
        this.f459r = LayoutInflater.from(context);
        this.f457p = gVar;
    }

    /* renamed from: j */
    public C0141n.C0142a mo530j(ViewGroup viewGroup) {
        return (C0141n.C0142a) this.f458q.inflate(this.f462u, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo531k(androidx.appcompat.view.menu.C0148r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f460s
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f457p
        L_0x0009:
            boolean r2 = r0.mo327d(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0113b.mo531k(androidx.appcompat.view.menu.r):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo532l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: m */
    public C0139m.C0140a mo533m() {
        return this.f460s;
    }

    /* renamed from: n */
    public View mo534n(C0128i iVar, View view, ViewGroup viewGroup) {
        C0141n.C0142a j = view instanceof C0141n.C0142a ? (C0141n.C0142a) view : mo530j(viewGroup);
        mo523b(iVar, j);
        return (View) j;
    }

    /* renamed from: o */
    public C0141n mo535o(ViewGroup viewGroup) {
        if (this.f463v == null) {
            C0141n nVar = (C0141n) this.f458q.inflate(this.f461t, viewGroup, false);
            this.f463v = nVar;
            nVar.mo449b(this.f457p);
            mo525d(true);
        }
        return this.f463v;
    }

    /* renamed from: p */
    public void mo536p(int i) {
        this.f464w = i;
    }

    /* renamed from: q */
    public abstract boolean mo537q(int i, C0128i iVar);
}
