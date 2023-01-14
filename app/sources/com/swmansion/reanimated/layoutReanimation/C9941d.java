package com.swmansion.reanimated.layoutReanimation;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C2981h;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3041s0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.reanimated.Scheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.swmansion.reanimated.layoutReanimation.d */
public class C9941d {

    /* renamed from: a */
    private static final String[] f26596a = {"originX", "originY", "width", "height"};

    /* renamed from: b */
    private WeakReference<Scheduler> f26597b;

    /* renamed from: c */
    private ReactContext f26598c;

    /* renamed from: d */
    private C3041s0 f26599d;

    /* renamed from: e */
    private UIManagerModule f26600e;

    /* renamed from: f */
    private C9943e f26601f;

    /* renamed from: g */
    private HashMap<Integer, C9942a> f26602g;

    /* renamed from: h */
    private HashMap<Integer, View> f26603h;

    /* renamed from: i */
    private HashSet<Integer> f26604i;

    /* renamed from: j */
    private HashMap<Integer, ViewManager> f26605j;

    /* renamed from: k */
    private HashMap<Integer, ViewManager> f26606k;

    /* renamed from: l */
    private HashMap<Integer, View> f26607l;

    /* renamed from: m */
    private HashMap<Integer, Runnable> f26608m;

    /* renamed from: n */
    private boolean f26609n = false;

    /* renamed from: o */
    private C9945g f26610o;

    /* renamed from: p */
    private boolean f26611p = false;

    /* renamed from: com.swmansion.reanimated.layoutReanimation.d$a */
    public enum C9942a {
        Inactive,
        Appearing,
        Disappearing,
        Layout,
        ToRemove
    }

    public C9941d(ReactContext reactContext, C3041s0 s0Var, UIManagerModule uIManagerModule) {
        this.f26598c = reactContext;
        this.f26599d = s0Var;
        this.f26600e = uIManagerModule;
        this.f26602g = new HashMap<>();
        this.f26603h = new HashMap<>();
        this.f26604i = new HashSet<>();
        this.f26605j = new HashMap<>();
        this.f26606k = new HashMap<>();
        this.f26607l = new HashMap<>();
        this.f26608m = new HashMap<>();
        this.f26611p = false;
    }

    /* renamed from: a */
    private boolean m33850a(View view, View view2, HashSet<Integer> hashSet) {
        ViewGroup viewGroup;
        boolean z;
        if (!hashSet.contains(Integer.valueOf(view2.getId())) && this.f26602g.containsKey(Integer.valueOf(view2.getId()))) {
            return true;
        }
        boolean z2 = false;
        if ((view2 instanceof ViewGroup) && (this.f26605j.get(Integer.valueOf(view2.getId())) instanceof ViewGroupManager)) {
            ViewGroup viewGroup2 = (ViewGroup) view2;
            ViewGroupManager viewGroupManager = (ViewGroupManager) this.f26605j.get(Integer.valueOf(viewGroup2.getId()));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup2); i++) {
                arrayList.add(viewGroupManager.getChildAt(viewGroup2, i));
            }
            Iterator it = arrayList.iterator();
            loop1:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop1;
                    }
                    View view3 = (View) it.next();
                    if (z || m33850a(view, view3, hashSet)) {
                        z = true;
                    }
                }
            }
            z2 = z;
        }
        if (!z2) {
            View view4 = (View) view2.getParent();
            if (this.f26608m.containsKey(Integer.valueOf(view2.getId()))) {
                this.f26608m.remove(Integer.valueOf(view2.getId()));
                this.f26608m.get(Integer.valueOf(view2.getId())).run();
            }
            if (this.f26607l.containsKey(Integer.valueOf(view2.getId())) && (viewGroup = (ViewGroup) this.f26607l.get(Integer.valueOf(view2.getId()))) != null) {
                viewGroup.removeView(view2);
            }
            this.f26602g.remove(Integer.valueOf(view2.getId()));
            this.f26603h.remove(Integer.valueOf(view2.getId()));
            this.f26605j.remove(Integer.valueOf(view2.getId()));
            this.f26606k.remove(Integer.valueOf(view2.getId()));
            this.f26607l.remove(Integer.valueOf(view2.getId()));
            this.f26601f.mo24764a(view2.getId());
            this.f26604i.remove(Integer.valueOf(view2.getId()));
        }
        return z2;
    }

    /* renamed from: b */
    private void m33851b(View view, HashSet<Integer> hashSet) {
        int i = -1;
        while (view != null) {
            C9942a aVar = this.f26602g.get(Integer.valueOf(view.getId()));
            if (aVar != C9942a.Disappearing) {
                if (aVar == C9942a.ToRemove) {
                    i = view.getId();
                }
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
            } else {
                return;
            }
        }
        if (i != -1) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void mo24837e(WeakReference weakReference) {
        this.f26609n = false;
        if (((C9941d) weakReference.get()) != null) {
            m33853k();
        }
    }

    /* renamed from: k */
    private void m33853k() {
        if (this.f26604i != null) {
            HashSet hashSet = new HashSet();
            Iterator<Integer> it = this.f26604i.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                View view = this.f26603h.get(Integer.valueOf(intValue));
                if (view == null) {
                    try {
                        view = this.f26600e.resolveView(intValue);
                        this.f26603h.put(Integer.valueOf(intValue), view);
                    } catch (C2981h unused) {
                    }
                }
                m33851b(view, hashSet);
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                View view2 = this.f26603h.get(Integer.valueOf(((Integer) it2.next()).intValue()));
                if (view2 != null) {
                    m33850a(view2, view2, this.f26604i);
                }
            }
        }
    }

    /* renamed from: l */
    private void m33854l() {
        if (!this.f26609n) {
            this.f26609n = true;
            this.f26598c.runOnUiQueueThread(new C9938a(this, new WeakReference(this)));
        }
    }

    /* renamed from: c */
    public boolean mo24836c() {
        C9943e eVar = this.f26601f;
        return eVar != null && eVar.mo24765b();
    }

    /* renamed from: f */
    public void mo24838f() {
        this.f26611p = true;
        this.f26601f = null;
        this.f26598c = null;
        this.f26599d = null;
        this.f26600e = null;
        this.f26602g = null;
        this.f26604i = null;
        this.f26603h = null;
        this.f26605j = null;
        this.f26607l = null;
        this.f26606k = null;
        this.f26608m = null;
    }

    /* renamed from: g */
    public void mo24839g(View view, ViewGroup viewGroup, C9947h hVar) {
        if (!this.f26611p) {
            Scheduler scheduler = (Scheduler) this.f26597b.get();
            if (scheduler != null) {
                scheduler.triggerUI();
            }
            if (!this.f26602g.containsKey(Integer.valueOf(view.getId()))) {
                this.f26602g.put(Integer.valueOf(view.getId()), C9942a.Inactive);
                this.f26603h.put(Integer.valueOf(view.getId()), view);
                this.f26605j.put(Integer.valueOf(view.getId()), hVar.f26636e);
                this.f26606k.put(Integer.valueOf(view.getId()), hVar.f26637f);
                this.f26607l.put(Integer.valueOf(view.getId()), hVar.f26635d);
            }
            Integer valueOf = Integer.valueOf(view.getId());
            HashMap<String, Object> d = hVar.mo24851d();
            if (this.f26602g.get(Integer.valueOf(view.getId())) == C9942a.Inactive && d != null) {
                this.f26601f.mo24766c(valueOf.intValue(), "entering", mo24842j(d, true));
            }
        }
    }

    /* renamed from: h */
    public void mo24840h(View view, ViewGroup viewGroup, C9947h hVar, Runnable runnable) {
        C9942a aVar;
        if (!this.f26611p) {
            Integer valueOf = Integer.valueOf(view.getId());
            HashMap<String, Object> c = hVar.mo24850c();
            C9942a aVar2 = this.f26602g.get(Integer.valueOf(view.getId()));
            C9942a aVar3 = C9942a.Disappearing;
            if (aVar2 != aVar3 && aVar2 != (aVar = C9942a.ToRemove)) {
                this.f26608m.put(valueOf, runnable);
                if (aVar2 != C9942a.Inactive && aVar2 != null) {
                    this.f26602g.put(valueOf, aVar3);
                    this.f26601f.mo24766c(valueOf.intValue(), "exiting", mo24842j(c, false));
                } else if (c != null) {
                    this.f26602g.put(Integer.valueOf(view.getId()), aVar);
                    this.f26604i.add(Integer.valueOf(view.getId()));
                    m33854l();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo24841i(View view, C9947h hVar, C9947h hVar2) {
        if (!this.f26611p) {
            Integer valueOf = Integer.valueOf(view.getId());
            HashMap<String, Object> d = hVar2.mo24851d();
            HashMap<String, Object> c = hVar.mo24850c();
            C9942a aVar = this.f26602g.get(Integer.valueOf(view.getId()));
            if (aVar != null && aVar != C9942a.Disappearing && aVar != C9942a.ToRemove && aVar != C9942a.Inactive) {
                if (aVar == C9942a.Appearing) {
                    boolean z = true;
                    for (int i = 0; i < C9947h.f26632a.size(); i++) {
                        if (((Number) c.get(C9947h.f26633b.get(i))).doubleValue() != ((Number) d.get(C9947h.f26632a.get(i))).doubleValue()) {
                            z = false;
                        }
                    }
                    if (z) {
                        return;
                    }
                }
                this.f26602g.put(Integer.valueOf(view.getId()), C9942a.Layout);
                HashMap<String, Float> j = mo24842j(c, false);
                HashMap hashMap = new HashMap(mo24842j(d, true));
                for (String next : j.keySet()) {
                    hashMap.put(next, j.get(next));
                }
                this.f26601f.mo24766c(valueOf.intValue(), "layout", hashMap);
            }
        }
    }

    /* renamed from: j */
    public HashMap<String, Float> mo24842j(HashMap<String, Object> hashMap, boolean z) {
        float f;
        HashMap<String, Float> hashMap2 = new HashMap<>();
        Iterator<String> it = (z ? C9947h.f26632a : C9947h.f26633b).iterator();
        while (it.hasNext()) {
            String next = it.next();
            hashMap2.put(next, Float.valueOf(C3038r.m12004a((float) ((Integer) hashMap.get(next)).intValue())));
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Activity currentActivity = this.f26598c.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            hashMap2.put("windowWidth", Float.valueOf(C3038r.m12004a((float) displayMetrics.widthPixels)));
            f = (float) i;
        } else {
            f = 0.0f;
            hashMap2.put("windowWidth", Float.valueOf(C3038r.m12004a(0.0f)));
        }
        hashMap2.put("windowHeight", Float.valueOf(C3038r.m12004a(f)));
        return hashMap2;
    }

    /* renamed from: m */
    public void mo24843m(C9943e eVar) {
        this.f26601f = eVar;
    }

    /* renamed from: n */
    public void mo24844n(C9945g gVar) {
        this.f26610o = gVar;
    }

    /* renamed from: o */
    public void mo24845o(Scheduler scheduler) {
        this.f26597b = new WeakReference<>(scheduler);
    }
}
