package com.swmansion.reanimated.layoutReanimation;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C2920a1;
import com.facebook.react.uimanager.C2941e1;
import com.facebook.react.uimanager.C2981h;
import com.facebook.react.uimanager.C3022n;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p123m1.C3007e;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.swmansion.reanimated.layoutReanimation.g */
public class C9945g extends C3022n {

    /* renamed from: n */
    private final HashMap<Integer, ArrayList<View>> f26622n = new HashMap<>();

    /* renamed from: o */
    private final HashMap<Integer, Runnable> f26623o = new HashMap<>();

    /* renamed from: p */
    private C3007e f26624p = null;

    /* renamed from: q */
    private HashMap<Integer, Set<Integer>> f26625q = new HashMap<>();

    /* renamed from: r */
    private boolean f26626r = true;

    /* renamed from: com.swmansion.reanimated.layoutReanimation.g$a */
    class C9946a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f26627f;

        /* renamed from: o */
        final /* synthetic */ View f26628o;

        /* renamed from: p */
        final /* synthetic */ ViewGroupManager f26629p;

        /* renamed from: q */
        final /* synthetic */ ViewGroup f26630q;

        C9946a(ArrayList arrayList, View view, ViewGroupManager viewGroupManager, ViewGroup viewGroup) {
            this.f26627f = arrayList;
            this.f26628o = view;
            this.f26629p = viewGroupManager;
            this.f26630q = viewGroup;
        }

        public void run() {
            this.f26627f.remove(this.f26628o);
            this.f26629p.removeView(this.f26630q, this.f26628o);
        }
    }

    public C9945g(C2941e1 e1Var, ReactApplicationContext reactApplicationContext) {
        super(e1Var);
        this.f26624p = new C9944f(reactApplicationContext, this);
        Class<? super C9945g> superclass = C9945g.class.getSuperclass();
        if (superclass == null) {
            Log.e("reanimated", "unable to resolve super class of ReanimatedNativeHierarchyManager");
            return;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mLayoutAnimator");
            declaredField.setAccessible(true);
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                    declaredField2.setAccessible(true);
                    declaredField2.setInt(declaredField, declaredField.getModifiers() & -17);
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }
            declaredField.set(this, this.f26624p);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            this.f26626r = false;
            e2.printStackTrace();
        }
        try {
            Field declaredField3 = superclass.getDeclaredField("mPendingDeletionsForTag");
            declaredField3.setAccessible(true);
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Field declaredField4 = Field.class.getDeclaredField("accessFlags");
                    declaredField4.setAccessible(true);
                    declaredField4.setInt(declaredField3, declaredField3.getModifiers() & -17);
                } catch (IllegalAccessException | NoSuchFieldException e3) {
                    e3.printStackTrace();
                }
            }
            declaredField3.set(this, this.f26625q);
        } catch (IllegalAccessException | NoSuchFieldException e4) {
            this.f26626r = false;
            e4.printStackTrace();
        }
        if (this.f26626r) {
            mo9766A(true);
        }
    }

    /* renamed from: G */
    private boolean m33876G() {
        return !this.f26626r || !((C9944f) this.f26624p).mo24846j();
    }

    /* renamed from: C */
    public synchronized void mo9768C(int i, int i2, int i3, int i4, int i5, int i6) {
        C3007e eVar;
        super.mo9768C(i, i2, i3, i4, i5, i6);
        if (!m33876G()) {
            try {
                View w = mo9786w(i2);
                String name = mo9787x(i2).getName();
                View w2 = mo9786w(i);
                if (!(w2 == null || !name.equals(ScreenViewManager.REACT_CLASS) || (eVar = this.f26624p) == null)) {
                    eVar.mo9744b(w, (int) w2.getX(), (int) w2.getY(), w2.getWidth(), w2.getHeight());
                }
            } catch (C2981h e) {
                e.printStackTrace();
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: H */
    public void mo24848H(View view) {
        mo9780n(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public synchronized void mo9780n(View view) {
        if (m33876G()) {
            super.mo9780n(view);
            return;
        }
        if (this.f26622n.containsKey(Integer.valueOf(view.getId()))) {
            this.f26622n.remove(Integer.valueOf(view.getId()));
        }
        if (this.f26623o.containsKey(Integer.valueOf(view.getId()))) {
            this.f26623o.remove(Integer.valueOf(view.getId()));
            this.f26623o.get(Integer.valueOf(view.getId())).run();
        }
        super.mo9780n(view);
    }

    /* renamed from: r */
    public synchronized void mo9782r(int i, int[] iArr, C2920a1[] a1VarArr, int[] iArr2) {
        Set set;
        ArrayList arrayList;
        int i2 = i;
        int[] iArr3 = iArr2;
        synchronized (this) {
            if (m33876G()) {
                super.mo9782r(i, iArr, a1VarArr, iArr2);
                return;
            }
            try {
                ViewGroup viewGroup = (ViewGroup) mo9786w(i);
                ViewGroupManager viewGroupManager = (ViewGroupManager) mo9787x(i);
                if (viewGroupManager.getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                    super.mo9782r(i, iArr, a1VarArr, iArr2);
                    return;
                }
                if (this.f26622n.containsKey(Integer.valueOf(i))) {
                    HashSet hashSet = new HashSet();
                    Iterator it = this.f26622n.get(Integer.valueOf(i)).iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(((View) it.next()).getId()));
                    }
                    while (viewGroupManager.getChildCount(viewGroup) != 0 && hashSet.contains(Integer.valueOf(viewGroupManager.getChildAt(viewGroup, viewGroupManager.getChildCount(viewGroup) - 1).getId()))) {
                        viewGroupManager.removeViewAt(viewGroup, viewGroupManager.getChildCount(viewGroup) - 1);
                    }
                }
                if (iArr3 != null) {
                    if (!this.f26622n.containsKey(Integer.valueOf(i))) {
                        this.f26622n.put(Integer.valueOf(i), new ArrayList());
                    }
                    ArrayList arrayList2 = this.f26622n.get(Integer.valueOf(i));
                    int length = iArr3.length;
                    int i3 = 0;
                    while (i3 < length) {
                        try {
                            View w = mo9786w(Integer.valueOf(iArr3[i3]).intValue());
                            arrayList2.add(w);
                            HashMap<Integer, Runnable> hashMap = this.f26623o;
                            Integer valueOf = Integer.valueOf(w.getId());
                            arrayList = arrayList2;
                            C9946a aVar = r1;
                            C9946a aVar2 = new C9946a(arrayList2, w, viewGroupManager, viewGroup);
                            hashMap.put(valueOf, aVar);
                        } catch (C2981h e) {
                            arrayList = arrayList2;
                            e.printStackTrace();
                        }
                        i3++;
                        arrayList2 = arrayList;
                    }
                }
                HashMap<Integer, Set<Integer>> hashMap2 = this.f26625q;
                if (!(hashMap2 == null || (set = hashMap2.get(Integer.valueOf(i))) == null)) {
                    set.clear();
                }
                super.mo9782r(i2, iArr, a1VarArr, (int[]) null);
                if (this.f26622n.containsKey(Integer.valueOf(i))) {
                    Iterator it2 = this.f26622n.get(Integer.valueOf(i)).iterator();
                    while (it2.hasNext()) {
                        viewGroupManager.addView(viewGroup, (View) it2.next(), viewGroupManager.getChildCount(viewGroup));
                    }
                }
                super.mo9782r(i2, (int[]) null, (C2920a1[]) null, iArr3);
            } catch (C2981h e2) {
                int[] iArr4 = iArr;
                C2920a1[] a1VarArr2 = a1VarArr;
                e2.printStackTrace();
                super.mo9782r(i, iArr, a1VarArr, iArr2);
            }
        }
    }
}
