package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p064i.p072j.p073g0.C1960d;

/* renamed from: androidx.recyclerview.widget.k */
public class C1405k extends C1904a {

    /* renamed from: d */
    final RecyclerView f4129d;

    /* renamed from: e */
    private final C1406a f4130e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    public static class C1406a extends C1904a {

        /* renamed from: d */
        final C1405k f4131d;

        /* renamed from: e */
        private Map<View, C1904a> f4132e = new WeakHashMap();

        public C1406a(C1405k kVar) {
            this.f4131d = kVar;
        }

        /* renamed from: a */
        public boolean mo5206a(View view, AccessibilityEvent accessibilityEvent) {
            C1904a aVar = this.f4132e.get(view);
            return aVar != null ? aVar.mo5206a(view, accessibilityEvent) : super.mo5206a(view, accessibilityEvent);
        }

        /* renamed from: b */
        public C1960d mo5207b(View view) {
            C1904a aVar = this.f4132e.get(view);
            return aVar != null ? aVar.mo5207b(view) : super.mo5207b(view);
        }

        /* renamed from: f */
        public void mo3775f(View view, AccessibilityEvent accessibilityEvent) {
            C1904a aVar = this.f4132e.get(view);
            if (aVar != null) {
                aVar.mo3775f(view, accessibilityEvent);
            } else {
                super.mo3775f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            if (!this.f4131d.mo5205o() && this.f4131d.f4129d.getLayoutManager() != null) {
                this.f4131d.f4129d.getLayoutManager().mo4841O0(view, cVar);
                C1904a aVar = this.f4132e.get(view);
                if (aVar != null) {
                    aVar.mo3776g(view, cVar);
                    return;
                }
            }
            super.mo3776g(view, cVar);
        }

        /* renamed from: h */
        public void mo5208h(View view, AccessibilityEvent accessibilityEvent) {
            C1904a aVar = this.f4132e.get(view);
            if (aVar != null) {
                aVar.mo5208h(view, accessibilityEvent);
            } else {
                super.mo5208h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo5209i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1904a aVar = this.f4132e.get(viewGroup);
            return aVar != null ? aVar.mo5209i(viewGroup, view, accessibilityEvent) : super.mo5209i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo3777j(View view, int i, Bundle bundle) {
            if (this.f4131d.mo5205o() || this.f4131d.f4129d.getLayoutManager() == null) {
                return super.mo3777j(view, i, bundle);
            }
            C1904a aVar = this.f4132e.get(view);
            if (aVar != null) {
                if (aVar.mo3777j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo3777j(view, i, bundle)) {
                return true;
            }
            return this.f4131d.f4129d.getLayoutManager().mo4876i1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo5210l(View view, int i) {
            C1904a aVar = this.f4132e.get(view);
            if (aVar != null) {
                aVar.mo5210l(view, i);
            } else {
                super.mo5210l(view, i);
            }
        }

        /* renamed from: m */
        public void mo5211m(View view, AccessibilityEvent accessibilityEvent) {
            C1904a aVar = this.f4132e.get(view);
            if (aVar != null) {
                aVar.mo5211m(view, accessibilityEvent);
            } else {
                super.mo5211m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C1904a mo5212n(View view) {
            return this.f4132e.remove(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo5213o(View view) {
            C1904a j = C1988t.m8387j(view);
            if (j != null && j != this) {
                this.f4132e.put(view, j);
            }
        }
    }

    public C1405k(RecyclerView recyclerView) {
        this.f4129d = recyclerView;
        C1904a n = mo5204n();
        this.f4130e = (n == null || !(n instanceof C1406a)) ? new C1406a(this) : (C1406a) n;
    }

    /* renamed from: f */
    public void mo3775f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3775f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo5205o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo4443K0(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo3776g(View view, C1955c cVar) {
        super.mo3776g(view, cVar);
        if (!mo5205o() && this.f4129d.getLayoutManager() != null) {
            this.f4129d.getLayoutManager().mo4838M0(cVar);
        }
    }

    /* renamed from: j */
    public boolean mo3777j(View view, int i, Bundle bundle) {
        if (super.mo3777j(view, i, bundle)) {
            return true;
        }
        if (mo5205o() || this.f4129d.getLayoutManager() == null) {
            return false;
        }
        return this.f4129d.getLayoutManager().mo4871g1(i, bundle);
    }

    /* renamed from: n */
    public C1904a mo5204n() {
        return this.f4130e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo5205o() {
        return this.f4129d.hasPendingAdapterUpdates();
    }
}
