package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import p174e.p446g.p448b.C10200h;
import p174e.p446g.p448b.C10208k;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.gesturehandler.react.h */
public final class C9880h implements C10208k {

    /* renamed from: a */
    private final SparseArray<C10200h<?>> f26431a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<Integer> f26432b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<ArrayList<C10200h<?>>> f26433c = new SparseArray<>();

    /* renamed from: c */
    private final synchronized void m33675c(C10200h<?> hVar) {
        Integer num = this.f26432b.get(hVar.mo25428O());
        if (num != null) {
            this.f26432b.remove(hVar.mo25428O());
            ArrayList arrayList = this.f26433c.get(num.intValue());
            if (arrayList != null) {
                synchronized (arrayList) {
                    arrayList.remove(hVar);
                }
                if (arrayList.size() == 0) {
                    this.f26433c.remove(num.intValue());
                }
            }
        }
        if (hVar.mo25431R() != null) {
            UiThreadUtil.runOnUiThread(new C9872b(hVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m33676d(C10200h hVar) {
        C10457l.m35320e(hVar, "$handler");
        hVar.mo25448o();
    }

    /* renamed from: k */
    private final synchronized void m33678k(int i, C10200h<?> hVar) {
        if (this.f26432b.get(hVar.mo25428O()) == null) {
            this.f26432b.put(hVar.mo25428O(), Integer.valueOf(i));
            ArrayList<C10200h<?>> arrayList = this.f26433c.get(i);
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(hVar);
                this.f26433c.put(i, arrayList2);
            } else {
                synchronized (arrayList) {
                    arrayList.add(hVar);
                }
            }
        } else {
            throw new IllegalStateException(("Handler " + hVar + " already attached").toString());
        }
    }

    /* renamed from: a */
    public synchronized ArrayList<C10200h<?>> mo24729a(View view) {
        C10457l.m35320e(view, "view");
        return mo24734h(view.getId());
    }

    /* renamed from: b */
    public final synchronized boolean mo24730b(int i, int i2, int i3) {
        boolean z;
        C10200h hVar = this.f26431a.get(i);
        if (hVar == null) {
            z = false;
        } else {
            C10457l.m35319d(hVar, "handler");
            m33675c(hVar);
            hVar.mo25445m0(i3);
            m33678k(i2, hVar);
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public final synchronized void mo24731e() {
        this.f26431a.clear();
        this.f26432b.clear();
        this.f26433c.clear();
    }

    /* renamed from: f */
    public final synchronized void mo24732f(int i) {
        C10200h hVar = this.f26431a.get(i);
        if (hVar != null) {
            m33675c(hVar);
            this.f26431a.remove(i);
        }
    }

    /* renamed from: g */
    public final synchronized C10200h<?> mo24733g(int i) {
        return this.f26431a.get(i);
    }

    /* renamed from: h */
    public final synchronized ArrayList<C10200h<?>> mo24734h(int i) {
        return this.f26433c.get(i);
    }

    /* renamed from: j */
    public final synchronized void mo24735j(C10200h<?> hVar) {
        C10457l.m35320e(hVar, "handler");
        this.f26431a.put(hVar.mo25428O(), hVar);
    }
}
