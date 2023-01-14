package p027c.p100v;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p027c.p060f.C1788a;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.v.z */
public class C2224z {

    /* renamed from: a */
    private static C2214x f6489a = new C2126b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C1788a<ViewGroup, ArrayList<C2214x>>>> f6490b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f6491c = new ArrayList<>();

    /* renamed from: c.v.z$a */
    private static class C2225a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        C2214x f6492f;

        /* renamed from: o */
        ViewGroup f6493o;

        /* renamed from: c.v.z$a$a */
        class C2226a extends C2222y {

            /* renamed from: a */
            final /* synthetic */ C1788a f6494a;

            C2226a(C1788a aVar) {
                this.f6494a = aVar;
            }

            /* renamed from: c */
            public void mo7207c(C2214x xVar) {
                ((ArrayList) this.f6494a.get(C2225a.this.f6493o)).remove(xVar);
                xVar.mo7177Z(this);
            }
        }

        C2225a(C2214x xVar, ViewGroup viewGroup) {
            this.f6492f = xVar;
            this.f6493o = viewGroup;
        }

        /* renamed from: a */
        private void m9419a() {
            this.f6493o.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6493o.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m9419a();
            if (!C2224z.f6491c.remove(this.f6493o)) {
                return true;
            }
            C1788a<ViewGroup, ArrayList<C2214x>> b = C2224z.m9416b();
            ArrayList arrayList = b.get(this.f6493o);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f6493o, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f6492f);
            this.f6492f.mo7180c(new C2226a(b));
            this.f6492f.mo7384m(this.f6493o, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C2214x) it.next()).mo7179b0(this.f6493o);
                }
            }
            this.f6492f.mo7381Y(this.f6493o);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m9419a();
            C2224z.f6491c.remove(this.f6493o);
            ArrayList arrayList = C2224z.m9416b().get(this.f6493o);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2214x) it.next()).mo7179b0(this.f6493o);
                }
            }
            this.f6492f.mo7386n(true);
        }
    }

    /* renamed from: a */
    public static void m9415a(ViewGroup viewGroup, C2214x xVar) {
        if (!f6491c.contains(viewGroup) && C1988t.m8361S(viewGroup)) {
            f6491c.add(viewGroup);
            if (xVar == null) {
                xVar = f6489a;
            }
            C2214x p = xVar.clone();
            m9418d(viewGroup, p);
            C2196u.m9290c(viewGroup, (C2196u) null);
            m9417c(viewGroup, p);
        }
    }

    /* renamed from: b */
    static C1788a<ViewGroup, ArrayList<C2214x>> m9416b() {
        C1788a<ViewGroup, ArrayList<C2214x>> aVar;
        WeakReference weakReference = f6490b.get();
        if (weakReference != null && (aVar = (C1788a) weakReference.get()) != null) {
            return aVar;
        }
        C1788a<ViewGroup, ArrayList<C2214x>> aVar2 = new C1788a<>();
        f6490b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: c */
    private static void m9417c(ViewGroup viewGroup, C2214x xVar) {
        if (xVar != null && viewGroup != null) {
            C2225a aVar = new C2225a(xVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m9418d(ViewGroup viewGroup, C2214x xVar) {
        ArrayList arrayList = m9416b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C2214x) it.next()).mo7176V(viewGroup);
            }
        }
        if (xVar != null) {
            xVar.mo7384m(viewGroup, true);
        }
        C2196u b = C2196u.m9289b(viewGroup);
        if (b != null) {
            b.mo7357a();
        }
    }
}
