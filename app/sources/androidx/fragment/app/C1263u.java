package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p027c.p064i.p069g.C1849b;

/* renamed from: androidx.fragment.app.u */
class C1263u extends C1269v {

    /* renamed from: androidx.fragment.app.u$a */
    class C1264a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3649a;

        C1264a(Rect rect) {
            this.f3649a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f3649a;
        }
    }

    /* renamed from: androidx.fragment.app.u$b */
    class C1265b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f3651a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3652b;

        C1265b(View view, ArrayList arrayList) {
            this.f3651a = view;
            this.f3652b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3651a.setVisibility(8);
            int size = this.f3652b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3652b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.u$c */
    class C1266c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f3654a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3655b;

        /* renamed from: c */
        final /* synthetic */ Object f3656c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3657d;

        /* renamed from: e */
        final /* synthetic */ Object f3658e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3659f;

        C1266c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3654a = obj;
            this.f3655b = arrayList;
            this.f3656c = obj2;
            this.f3657d = arrayList2;
            this.f3658e = obj3;
            this.f3659f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f3654a;
            if (obj != null) {
                C1263u.this.mo4270q(obj, this.f3655b, (ArrayList<View>) null);
            }
            Object obj2 = this.f3656c;
            if (obj2 != null) {
                C1263u.this.mo4270q(obj2, this.f3657d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3658e;
            if (obj3 != null) {
                C1263u.this.mo4270q(obj3, this.f3659f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.u$d */
    class C1267d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f3661a;

        C1267d(Runnable runnable) {
            this.f3661a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f3661a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.u$e */
    class C1268e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3663a;

        C1268e(Rect rect) {
            this.f3663a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3663a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3663a;
        }
    }

    C1263u() {
    }

    /* renamed from: C */
    private static boolean m5204C(Transition transition) {
        return !C1269v.m5225l(transition.getTargetIds()) || !C1269v.m5225l(transition.getTargetNames()) || !C1269v.m5225l(transition.getTargetTypes());
    }

    /* renamed from: A */
    public void mo4260A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo4270q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo4261B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo4262a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo4263b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo4263b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m5204C(transition) && C1269v.m5225l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo4264c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo4265e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo4266g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo4267m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: n */
    public Object mo4268n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo4269p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: q */
    public void mo4270q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo4270q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m5204C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: r */
    public void mo4271r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1265b(view, arrayList));
    }

    /* renamed from: t */
    public void mo4272t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C1266c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo4273u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1268e(rect));
        }
    }

    /* renamed from: v */
    public void mo4274v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo4296k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1264a(rect));
        }
    }

    /* renamed from: w */
    public void mo4275w(Fragment fragment, Object obj, C1849b bVar, Runnable runnable) {
        ((Transition) obj).addListener(new C1267d(runnable));
    }

    /* renamed from: z */
    public void mo4276z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1269v.m5222d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo4263b(transitionSet, arrayList);
    }
}
