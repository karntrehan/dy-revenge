package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.recyclerview.widget.c */
public class C1377c extends C1408m {

    /* renamed from: h */
    private static TimeInterpolator f4004h;

    /* renamed from: i */
    private ArrayList<RecyclerView.C1328d0> f4005i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<RecyclerView.C1328d0> f4006j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C1387j> f4007k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C1386i> f4008l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<RecyclerView.C1328d0>> f4009m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C1387j>> f4010n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<ArrayList<C1386i>> f4011o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.C1328d0> f4012p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.C1328d0> f4013q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.C1328d0> f4014r = new ArrayList<>();

    /* renamed from: s */
    ArrayList<RecyclerView.C1328d0> f4015s = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    class C1378a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f4016f;

        C1378a(ArrayList arrayList) {
            this.f4016f = arrayList;
        }

        public void run() {
            Iterator it = this.f4016f.iterator();
            while (it.hasNext()) {
                C1387j jVar = (C1387j) it.next();
                C1377c.this.mo5123S(jVar.f4050a, jVar.f4051b, jVar.f4052c, jVar.f4053d, jVar.f4054e);
            }
            this.f4016f.clear();
            C1377c.this.f4010n.remove(this.f4016f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    class C1379b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f4018f;

        C1379b(ArrayList arrayList) {
            this.f4018f = arrayList;
        }

        public void run() {
            Iterator it = this.f4018f.iterator();
            while (it.hasNext()) {
                C1377c.this.mo5122R((C1386i) it.next());
            }
            this.f4018f.clear();
            C1377c.this.f4011o.remove(this.f4018f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    class C1380c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f4020f;

        C1380c(ArrayList arrayList) {
            this.f4020f = arrayList;
        }

        public void run() {
            Iterator it = this.f4020f.iterator();
            while (it.hasNext()) {
                C1377c.this.mo5121Q((RecyclerView.C1328d0) it.next());
            }
            this.f4020f.clear();
            C1377c.this.f4009m.remove(this.f4020f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$d */
    class C1381d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1328d0 f4022a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4023b;

        /* renamed from: c */
        final /* synthetic */ View f4024c;

        C1381d(RecyclerView.C1328d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4022a = d0Var;
            this.f4023b = viewPropertyAnimator;
            this.f4024c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4023b.setListener((Animator.AnimatorListener) null);
            this.f4024c.setAlpha(1.0f);
            C1377c.this.mo5220G(this.f4022a);
            C1377c.this.f4014r.remove(this.f4022a);
            C1377c.this.mo5125V();
        }

        public void onAnimationStart(Animator animator) {
            C1377c.this.mo5221H(this.f4022a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    class C1382e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1328d0 f4026a;

        /* renamed from: b */
        final /* synthetic */ View f4027b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f4028c;

        C1382e(RecyclerView.C1328d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4026a = d0Var;
            this.f4027b = view;
            this.f4028c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4027b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f4028c.setListener((Animator.AnimatorListener) null);
            C1377c.this.mo5214A(this.f4026a);
            C1377c.this.f4012p.remove(this.f4026a);
            C1377c.this.mo5125V();
        }

        public void onAnimationStart(Animator animator) {
            C1377c.this.mo5215B(this.f4026a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$f */
    class C1383f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C1328d0 f4030a;

        /* renamed from: b */
        final /* synthetic */ int f4031b;

        /* renamed from: c */
        final /* synthetic */ View f4032c;

        /* renamed from: d */
        final /* synthetic */ int f4033d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f4034e;

        C1383f(RecyclerView.C1328d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4030a = d0Var;
            this.f4031b = i;
            this.f4032c = view;
            this.f4033d = i2;
            this.f4034e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f4031b != 0) {
                this.f4032c.setTranslationX(0.0f);
            }
            if (this.f4033d != 0) {
                this.f4032c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f4034e.setListener((Animator.AnimatorListener) null);
            C1377c.this.mo5218E(this.f4030a);
            C1377c.this.f4013q.remove(this.f4030a);
            C1377c.this.mo5125V();
        }

        public void onAnimationStart(Animator animator) {
            C1377c.this.mo5219F(this.f4030a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$g */
    class C1384g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1386i f4036a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4037b;

        /* renamed from: c */
        final /* synthetic */ View f4038c;

        C1384g(C1386i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4036a = iVar;
            this.f4037b = viewPropertyAnimator;
            this.f4038c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4037b.setListener((Animator.AnimatorListener) null);
            this.f4038c.setAlpha(1.0f);
            this.f4038c.setTranslationX(0.0f);
            this.f4038c.setTranslationY(0.0f);
            C1377c.this.mo5216C(this.f4036a.f4044a, true);
            C1377c.this.f4015s.remove(this.f4036a.f4044a);
            C1377c.this.mo5125V();
        }

        public void onAnimationStart(Animator animator) {
            C1377c.this.mo5217D(this.f4036a.f4044a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$h */
    class C1385h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1386i f4040a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4041b;

        /* renamed from: c */
        final /* synthetic */ View f4042c;

        C1385h(C1386i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4040a = iVar;
            this.f4041b = viewPropertyAnimator;
            this.f4042c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4041b.setListener((Animator.AnimatorListener) null);
            this.f4042c.setAlpha(1.0f);
            this.f4042c.setTranslationX(0.0f);
            this.f4042c.setTranslationY(0.0f);
            C1377c.this.mo5216C(this.f4040a.f4045b, false);
            C1377c.this.f4015s.remove(this.f4040a.f4045b);
            C1377c.this.mo5125V();
        }

        public void onAnimationStart(Animator animator) {
            C1377c.this.mo5217D(this.f4040a.f4045b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$i */
    private static class C1386i {

        /* renamed from: a */
        public RecyclerView.C1328d0 f4044a;

        /* renamed from: b */
        public RecyclerView.C1328d0 f4045b;

        /* renamed from: c */
        public int f4046c;

        /* renamed from: d */
        public int f4047d;

        /* renamed from: e */
        public int f4048e;

        /* renamed from: f */
        public int f4049f;

        private C1386i(RecyclerView.C1328d0 d0Var, RecyclerView.C1328d0 d0Var2) {
            this.f4044a = d0Var;
            this.f4045b = d0Var2;
        }

        C1386i(RecyclerView.C1328d0 d0Var, RecyclerView.C1328d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f4046c = i;
            this.f4047d = i2;
            this.f4048e = i3;
            this.f4049f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4044a + ", newHolder=" + this.f4045b + ", fromX=" + this.f4046c + ", fromY=" + this.f4047d + ", toX=" + this.f4048e + ", toY=" + this.f4049f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$j */
    private static class C1387j {

        /* renamed from: a */
        public RecyclerView.C1328d0 f4050a;

        /* renamed from: b */
        public int f4051b;

        /* renamed from: c */
        public int f4052c;

        /* renamed from: d */
        public int f4053d;

        /* renamed from: e */
        public int f4054e;

        C1387j(RecyclerView.C1328d0 d0Var, int i, int i2, int i3, int i4) {
            this.f4050a = d0Var;
            this.f4051b = i;
            this.f4052c = i2;
            this.f4053d = i3;
            this.f4054e = i4;
        }
    }

    /* renamed from: T */
    private void m6121T(RecyclerView.C1328d0 d0Var) {
        View view = d0Var.f3838b;
        ViewPropertyAnimator animate = view.animate();
        this.f4014r.add(d0Var);
        animate.setDuration(mo4796o()).alpha(0.0f).setListener(new C1381d(d0Var, animate, view)).start();
    }

    /* renamed from: W */
    private void m6122W(List<C1386i> list, RecyclerView.C1328d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1386i iVar = list.get(size);
            if (m6124Y(iVar, d0Var) && iVar.f4044a == null && iVar.f4045b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: X */
    private void m6123X(C1386i iVar) {
        RecyclerView.C1328d0 d0Var = iVar.f4044a;
        if (d0Var != null) {
            m6124Y(iVar, d0Var);
        }
        RecyclerView.C1328d0 d0Var2 = iVar.f4045b;
        if (d0Var2 != null) {
            m6124Y(iVar, d0Var2);
        }
    }

    /* renamed from: Y */
    private boolean m6124Y(C1386i iVar, RecyclerView.C1328d0 d0Var) {
        boolean z = false;
        if (iVar.f4045b == d0Var) {
            iVar.f4045b = null;
        } else if (iVar.f4044a != d0Var) {
            return false;
        } else {
            iVar.f4044a = null;
            z = true;
        }
        d0Var.f3838b.setAlpha(1.0f);
        d0Var.f3838b.setTranslationX(0.0f);
        d0Var.f3838b.setTranslationY(0.0f);
        mo5216C(d0Var, z);
        return true;
    }

    /* renamed from: Z */
    private void m6125Z(RecyclerView.C1328d0 d0Var) {
        if (f4004h == null) {
            f4004h = new ValueAnimator().getInterpolator();
        }
        d0Var.f3838b.animate().setInterpolator(f4004h);
        mo4791j(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo5121Q(RecyclerView.C1328d0 d0Var) {
        View view = d0Var.f3838b;
        ViewPropertyAnimator animate = view.animate();
        this.f4012p.add(d0Var);
        animate.alpha(1.0f).setDuration(mo4793l()).setListener(new C1382e(d0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo5122R(C1386i iVar) {
        RecyclerView.C1328d0 d0Var = iVar.f4044a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f3838b;
        RecyclerView.C1328d0 d0Var2 = iVar.f4045b;
        if (d0Var2 != null) {
            view = d0Var2.f3838b;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(mo4794m());
            this.f4015s.add(iVar.f4044a);
            duration.translationX((float) (iVar.f4048e - iVar.f4046c));
            duration.translationY((float) (iVar.f4049f - iVar.f4047d));
            duration.alpha(0.0f).setListener(new C1384g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f4015s.add(iVar.f4045b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4794m()).alpha(1.0f).setListener(new C1385h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo5123S(RecyclerView.C1328d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3838b;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4013q.add(d0Var);
        animate.setDuration(mo4795n()).setListener(new C1383f(d0Var, i5, view, i6, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo5124U(List<RecyclerView.C1328d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3838b.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo5125V() {
        if (!mo4797p()) {
            mo4790i();
        }
    }

    /* renamed from: g */
    public boolean mo4788g(RecyclerView.C1328d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo4788g(d0Var, list);
    }

    /* renamed from: j */
    public void mo4791j(RecyclerView.C1328d0 d0Var) {
        View view = d0Var.f3838b;
        view.animate().cancel();
        int size = this.f4007k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f4007k.get(size).f4050a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5218E(d0Var);
                this.f4007k.remove(size);
            }
        }
        m6122W(this.f4008l, d0Var);
        if (this.f4005i.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo5220G(d0Var);
        }
        if (this.f4006j.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo5214A(d0Var);
        }
        for (int size2 = this.f4011o.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f4011o.get(size2);
            m6122W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f4011o.remove(size2);
            }
        }
        for (int size3 = this.f4010n.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f4010n.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1387j) arrayList2.get(size4)).f4050a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5218E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4010n.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4009m.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f4009m.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo5214A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f4009m.remove(size5);
                }
            }
        }
        this.f4014r.remove(d0Var);
        this.f4012p.remove(d0Var);
        this.f4015s.remove(d0Var);
        this.f4013q.remove(d0Var);
        mo5125V();
    }

    /* renamed from: k */
    public void mo4792k() {
        int size = this.f4007k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1387j jVar = this.f4007k.get(size);
            View view = jVar.f4050a.f3838b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5218E(jVar.f4050a);
            this.f4007k.remove(size);
        }
        for (int size2 = this.f4005i.size() - 1; size2 >= 0; size2--) {
            mo5220G(this.f4005i.get(size2));
            this.f4005i.remove(size2);
        }
        int size3 = this.f4006j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C1328d0 d0Var = this.f4006j.get(size3);
            d0Var.f3838b.setAlpha(1.0f);
            mo5214A(d0Var);
            this.f4006j.remove(size3);
        }
        for (int size4 = this.f4008l.size() - 1; size4 >= 0; size4--) {
            m6123X(this.f4008l.get(size4));
        }
        this.f4008l.clear();
        if (mo4797p()) {
            for (int size5 = this.f4010n.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f4010n.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1387j jVar2 = (C1387j) arrayList.get(size6);
                    View view2 = jVar2.f4050a.f3838b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5218E(jVar2.f4050a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4010n.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4009m.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f4009m.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C1328d0 d0Var2 = (RecyclerView.C1328d0) arrayList2.get(size8);
                    d0Var2.f3838b.setAlpha(1.0f);
                    mo5214A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4009m.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4011o.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f4011o.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m6123X((C1386i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4011o.remove(arrayList3);
                    }
                }
            }
            mo5124U(this.f4014r);
            mo5124U(this.f4013q);
            mo5124U(this.f4012p);
            mo5124U(this.f4015s);
            mo4790i();
        }
    }

    /* renamed from: p */
    public boolean mo4797p() {
        return !this.f4006j.isEmpty() || !this.f4008l.isEmpty() || !this.f4007k.isEmpty() || !this.f4005i.isEmpty() || !this.f4013q.isEmpty() || !this.f4014r.isEmpty() || !this.f4012p.isEmpty() || !this.f4015s.isEmpty() || !this.f4010n.isEmpty() || !this.f4009m.isEmpty() || !this.f4011o.isEmpty();
    }

    /* renamed from: u */
    public void mo4802u() {
        boolean z = !this.f4005i.isEmpty();
        boolean z2 = !this.f4007k.isEmpty();
        boolean z3 = !this.f4008l.isEmpty();
        boolean z4 = !this.f4006j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C1328d0> it = this.f4005i.iterator();
            while (it.hasNext()) {
                m6121T(it.next());
            }
            this.f4005i.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f4007k);
                this.f4010n.add(arrayList);
                this.f4007k.clear();
                C1378a aVar = new C1378a(arrayList);
                if (z) {
                    C1988t.m8380f0(((C1387j) arrayList.get(0)).f4050a.f3838b, aVar, mo4796o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f4008l);
                this.f4011o.add(arrayList2);
                this.f4008l.clear();
                C1379b bVar = new C1379b(arrayList2);
                if (z) {
                    C1988t.m8380f0(((C1386i) arrayList2.get(0)).f4044a.f3838b, bVar, mo4796o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f4006j);
                this.f4009m.add(arrayList3);
                this.f4006j.clear();
                C1380c cVar = new C1380c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? mo4796o() : 0;
                    long n = z2 ? mo4795n() : 0;
                    if (z3) {
                        j = mo4794m();
                    }
                    C1988t.m8380f0(((RecyclerView.C1328d0) arrayList3.get(0)).f3838b, cVar, o + Math.max(n, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: w */
    public boolean mo5126w(RecyclerView.C1328d0 d0Var) {
        m6125Z(d0Var);
        d0Var.f3838b.setAlpha(0.0f);
        this.f4006j.add(d0Var);
        return true;
    }

    /* renamed from: x */
    public boolean mo5127x(RecyclerView.C1328d0 d0Var, RecyclerView.C1328d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo5128y(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.f3838b.getTranslationX();
        float translationY = d0Var.f3838b.getTranslationY();
        float alpha = d0Var.f3838b.getAlpha();
        m6125Z(d0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        d0Var.f3838b.setTranslationX(translationX);
        d0Var.f3838b.setTranslationY(translationY);
        d0Var.f3838b.setAlpha(alpha);
        if (d0Var2 != null) {
            m6125Z(d0Var2);
            d0Var2.f3838b.setTranslationX((float) (-i5));
            d0Var2.f3838b.setTranslationY((float) (-i6));
            d0Var2.f3838b.setAlpha(0.0f);
        }
        this.f4008l.add(new C1386i(d0Var, d0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: y */
    public boolean mo5128y(RecyclerView.C1328d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3838b;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f3838b.getTranslationY());
        m6125Z(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo5218E(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f4007k.add(new C1387j(d0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: z */
    public boolean mo5129z(RecyclerView.C1328d0 d0Var) {
        m6125Z(d0Var);
        this.f4005i.add(d0Var);
        return true;
    }
}
