package p027c.p100v;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1269v;
import java.util.ArrayList;
import java.util.List;
import p027c.p100v.C2214x;

@SuppressLint({"RestrictedApi"})
/* renamed from: c.v.h */
public class C2160h extends C1269v {

    /* renamed from: c.v.h$a */
    class C2161a extends C2214x.C2219e {

        /* renamed from: a */
        final /* synthetic */ Rect f6341a;

        C2161a(Rect rect) {
            this.f6341a = rect;
        }

        /* renamed from: a */
        public Rect mo7275a(C2214x xVar) {
            return this.f6341a;
        }
    }

    /* renamed from: c.v.h$b */
    class C2162b implements C2214x.C2220f {

        /* renamed from: a */
        final /* synthetic */ View f6343a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f6344b;

        C2162b(View view, ArrayList arrayList) {
            this.f6343a = view;
            this.f6344b = arrayList;
        }

        /* renamed from: a */
        public void mo7208a(C2214x xVar) {
        }

        /* renamed from: b */
        public void mo7238b(C2214x xVar) {
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            xVar.mo7177Z(this);
            this.f6343a.setVisibility(8);
            int size = this.f6344b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f6344b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: d */
        public void mo7239d(C2214x xVar) {
        }

        /* renamed from: e */
        public void mo7240e(C2214x xVar) {
        }
    }

    /* renamed from: c.v.h$c */
    class C2163c extends C2222y {

        /* renamed from: a */
        final /* synthetic */ Object f6346a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f6347b;

        /* renamed from: c */
        final /* synthetic */ Object f6348c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f6349d;

        /* renamed from: e */
        final /* synthetic */ Object f6350e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f6351f;

        C2163c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6346a = obj;
            this.f6347b = arrayList;
            this.f6348c = obj2;
            this.f6349d = arrayList2;
            this.f6350e = obj3;
            this.f6351f = arrayList3;
        }

        /* renamed from: a */
        public void mo7208a(C2214x xVar) {
            Object obj = this.f6346a;
            if (obj != null) {
                C2160h.this.mo4270q(obj, this.f6347b, (ArrayList<View>) null);
            }
            Object obj2 = this.f6348c;
            if (obj2 != null) {
                C2160h.this.mo4270q(obj2, this.f6349d, (ArrayList<View>) null);
            }
            Object obj3 = this.f6350e;
            if (obj3 != null) {
                C2160h.this.mo4270q(obj3, this.f6351f, (ArrayList<View>) null);
            }
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            xVar.mo7177Z(this);
        }
    }

    /* renamed from: c.v.h$d */
    class C2164d extends C2214x.C2219e {

        /* renamed from: a */
        final /* synthetic */ Rect f6353a;

        C2164d(Rect rect) {
            this.f6353a = rect;
        }

        /* renamed from: a */
        public Rect mo7275a(C2214x xVar) {
            Rect rect = this.f6353a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f6353a;
        }
    }

    /* renamed from: C */
    private static boolean m9174C(C2214x xVar) {
        return !C1269v.m5225l(xVar.mo7375F()) || !C1269v.m5225l(xVar.mo7376G()) || !C1269v.m5225l(xVar.mo7377H());
    }

    /* renamed from: A */
    public void mo4260A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C2127b0 b0Var = (C2127b0) obj;
        if (b0Var != null) {
            b0Var.mo7378J().clear();
            b0Var.mo7378J().addAll(arrayList2);
            mo4270q(b0Var, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo4261B(Object obj) {
        if (obj == null) {
            return null;
        }
        C2127b0 b0Var = new C2127b0();
        b0Var.mo7197q0((C2214x) obj);
        return b0Var;
    }

    /* renamed from: a */
    public void mo4262a(Object obj, View view) {
        if (obj != null) {
            ((C2214x) obj).mo7182d(view);
        }
    }

    /* renamed from: b */
    public void mo4263b(Object obj, ArrayList<View> arrayList) {
        C2214x xVar = (C2214x) obj;
        if (xVar != null) {
            int i = 0;
            if (xVar instanceof C2127b0) {
                C2127b0 b0Var = (C2127b0) xVar;
                int t0 = b0Var.mo7200t0();
                while (i < t0) {
                    mo4263b(b0Var.mo7199s0(i), arrayList);
                    i++;
                }
            } else if (!m9174C(xVar) && C1269v.m5225l(xVar.mo7378J())) {
                int size = arrayList.size();
                while (i < size) {
                    xVar.mo7182d(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4264c(ViewGroup viewGroup, Object obj) {
        C2224z.m9415a(viewGroup, (C2214x) obj);
    }

    /* renamed from: e */
    public boolean mo4265e(Object obj) {
        return obj instanceof C2214x;
    }

    /* renamed from: g */
    public Object mo4266g(Object obj) {
        if (obj != null) {
            return ((C2214x) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo4267m(Object obj, Object obj2, Object obj3) {
        C2214x xVar = (C2214x) obj;
        C2214x xVar2 = (C2214x) obj2;
        C2214x xVar3 = (C2214x) obj3;
        if (xVar != null && xVar2 != null) {
            xVar = new C2127b0().mo7197q0(xVar).mo7197q0(xVar2).mo7205y0(1);
        } else if (xVar == null) {
            xVar = xVar2 != null ? xVar2 : null;
        }
        if (xVar3 == null) {
            return xVar;
        }
        C2127b0 b0Var = new C2127b0();
        if (xVar != null) {
            b0Var.mo7197q0(xVar);
        }
        b0Var.mo7197q0(xVar3);
        return b0Var;
    }

    /* renamed from: n */
    public Object mo4268n(Object obj, Object obj2, Object obj3) {
        C2127b0 b0Var = new C2127b0();
        if (obj != null) {
            b0Var.mo7197q0((C2214x) obj);
        }
        if (obj2 != null) {
            b0Var.mo7197q0((C2214x) obj2);
        }
        if (obj3 != null) {
            b0Var.mo7197q0((C2214x) obj3);
        }
        return b0Var;
    }

    /* renamed from: p */
    public void mo4269p(Object obj, View view) {
        if (obj != null) {
            ((C2214x) obj).mo7178a0(view);
        }
    }

    /* renamed from: q */
    public void mo4270q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C2214x xVar = (C2214x) obj;
        int i = 0;
        if (xVar instanceof C2127b0) {
            C2127b0 b0Var = (C2127b0) xVar;
            int t0 = b0Var.mo7200t0();
            while (i < t0) {
                mo4270q(b0Var.mo7199s0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m9174C(xVar)) {
            List<View> J = xVar.mo7378J();
            if (J.size() == arrayList.size() && J.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    xVar.mo7182d(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    xVar.mo7178a0(arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: r */
    public void mo4271r(Object obj, View view, ArrayList<View> arrayList) {
        ((C2214x) obj).mo7180c(new C2162b(view, arrayList));
    }

    /* renamed from: t */
    public void mo4272t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C2214x) obj).mo7180c(new C2163c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo4273u(Object obj, Rect rect) {
        if (obj != null) {
            ((C2214x) obj).mo7185g0(new C2164d(rect));
        }
    }

    /* renamed from: v */
    public void mo4274v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo4296k(view, rect);
            ((C2214x) obj).mo7185g0(new C2161a(rect));
        }
    }

    /* renamed from: z */
    public void mo4276z(Object obj, View view, ArrayList<View> arrayList) {
        C2127b0 b0Var = (C2127b0) obj;
        List<View> J = b0Var.mo7378J();
        J.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1269v.m5222d(J, arrayList.get(i));
        }
        J.add(view);
        arrayList.add(view);
        mo4263b(b0Var, arrayList);
    }
}
