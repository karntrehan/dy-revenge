package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.p113d0.C2706a;
import com.facebook.react.uimanager.p123m1.C3007e;
import com.facebook.react.uimanager.p123m1.C3011f;
import com.facebook.systrace.C3294a;
import com.facebook.systrace.C3296b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.react.uimanager.n */
public class C3022n {

    /* renamed from: a */
    private static final String f8391a = "n";

    /* renamed from: b */
    private final boolean f8392b;

    /* renamed from: c */
    private final SparseArray<View> f8393c;

    /* renamed from: d */
    private final SparseArray<ViewManager> f8394d;

    /* renamed from: e */
    private final SparseBooleanArray f8395e;

    /* renamed from: f */
    private final C2941e1 f8396f;

    /* renamed from: g */
    private final C2706a f8397g;

    /* renamed from: h */
    private final RootViewManager f8398h;

    /* renamed from: i */
    private final C3007e f8399i;

    /* renamed from: j */
    private final RectF f8400j;

    /* renamed from: k */
    private boolean f8401k;

    /* renamed from: l */
    private PopupMenu f8402l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public HashMap<Integer, Set<Integer>> f8403m;

    /* renamed from: com.facebook.react.uimanager.n$a */
    class C3023a implements C3011f {

        /* renamed from: a */
        final /* synthetic */ ViewGroupManager f8404a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f8405b;

        /* renamed from: c */
        final /* synthetic */ View f8406c;

        /* renamed from: d */
        final /* synthetic */ Set f8407d;

        /* renamed from: e */
        final /* synthetic */ int f8408e;

        C3023a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i) {
            this.f8404a = viewGroupManager;
            this.f8405b = viewGroup;
            this.f8406c = view;
            this.f8407d = set;
            this.f8408e = i;
        }

        /* renamed from: a */
        public void mo9756a() {
            UiThreadUtil.assertOnUiThread();
            this.f8404a.removeView(this.f8405b, this.f8406c);
            C3022n.this.mo9780n(this.f8406c);
            this.f8407d.remove(Integer.valueOf(this.f8406c.getId()));
            if (this.f8407d.isEmpty()) {
                C3022n.this.f8403m.remove(Integer.valueOf(this.f8408e));
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.n$b */
    private static class C3024b implements PopupMenu.OnMenuItemClickListener, PopupMenu.OnDismissListener {

        /* renamed from: a */
        final Callback f8410a;

        /* renamed from: b */
        boolean f8411b;

        private C3024b(Callback callback) {
            this.f8411b = false;
            this.f8410a = callback;
        }

        /* synthetic */ C3024b(Callback callback, C3023a aVar) {
            this(callback);
        }

        public void onDismiss(PopupMenu popupMenu) {
            if (!this.f8411b) {
                this.f8410a.invoke("dismissed");
                this.f8411b = true;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.f8411b) {
                return false;
            }
            this.f8410a.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.f8411b = true;
            return true;
        }
    }

    public C3022n(C2941e1 e1Var) {
        this(e1Var, new RootViewManager());
    }

    public C3022n(C2941e1 e1Var, RootViewManager rootViewManager) {
        this.f8392b = false;
        this.f8397g = new C2706a();
        this.f8399i = new C3007e();
        this.f8400j = new RectF();
        this.f8396f = e1Var;
        this.f8393c = new SparseArray<>();
        this.f8394d = new SparseArray<>();
        this.f8395e = new SparseBooleanArray();
        this.f8398h = rootViewManager;
    }

    /* renamed from: D */
    private void m11924D(View view, int i, int i2, int i3, int i4) {
        if (!this.f8401k || !this.f8399i.mo9748h(view)) {
            view.layout(i, i2, i3 + i, i4 + i2);
        } else {
            this.f8399i.mo9744b(view, i, i2, i3, i4);
        }
    }

    /* renamed from: d */
    private boolean m11926d(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m11927g(View view, int[] iArr) {
        this.f8400j.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        m11931s(view, this.f8400j);
        iArr[0] = Math.round(this.f8400j.left);
        iArr[1] = Math.round(this.f8400j.top);
        RectF rectF = this.f8400j;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.f8400j;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    /* renamed from: i */
    private static String m11928i(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, C2920a1[] a1VarArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  children(");
            sb2.append(viewGroupManager.getChildCount(viewGroup));
            sb2.append("): [\n");
            sb.append(sb2.toString());
            for (int i = 0; viewGroupManager.getChildAt(viewGroup, i) != null; i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (viewGroupManager.getChildAt(viewGroup, i3) == null || i2 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(viewGroupManager.getChildAt(viewGroup, i3).getId() + ",");
                        i2++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= iArr.length || i5 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(iArr[i6] + ",");
                        i5++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (a1VarArr != null) {
            sb.append("  viewsToAdd(" + a1VarArr.length + "): [\n");
            for (int i7 = 0; i7 < a1VarArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 >= a1VarArr.length || i8 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append("[" + a1VarArr[i9].f8200c + "," + a1VarArr[i9].f8199b + "],");
                        i8++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= iArr2.length || i11 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(iArr2[i12] + ",");
                        i11++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    /* renamed from: p */
    private Set<Integer> m11929p(int i) {
        if (this.f8403m == null) {
            this.f8403m = new HashMap<>();
        }
        if (!this.f8403m.containsKey(Integer.valueOf(i))) {
            this.f8403m.put(Integer.valueOf(i), new HashSet());
        }
        return this.f8403m.get(Integer.valueOf(i));
    }

    /* renamed from: q */
    private C3031o0 m11930q(int i) {
        View view = this.f8393c.get(i);
        if (view != null) {
            return (C3031o0) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003e A[SYNTHETIC] */
    /* renamed from: s */
    private void m11931s(android.view.View r3, android.graphics.RectF r4) {
        /*
            r2 = this;
            android.graphics.Matrix r0 = r3.getMatrix()
            boolean r1 = r0.isIdentity()
            if (r1 != 0) goto L_0x000d
        L_0x000a:
            r0.mapRect(r4)
        L_0x000d:
            int r0 = r3.getLeft()
            float r0 = (float) r0
            int r1 = r3.getTop()
            float r1 = (float) r1
            r4.offset(r0, r1)
            android.view.ViewParent r3 = r3.getParent()
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L_0x003e
            android.view.View r3 = (android.view.View) r3
            int r0 = r3.getScrollX()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r3.getScrollY()
            int r1 = -r1
            float r1 = (float) r1
            r4.offset(r0, r1)
            android.graphics.Matrix r0 = r3.getMatrix()
            boolean r1 = r0.isIdentity()
            if (r1 != 0) goto L_0x000d
            goto L_0x000a
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3022n.m11931s(android.view.View, android.graphics.RectF):void");
    }

    /* renamed from: A */
    public void mo9766A(boolean z) {
        this.f8401k = z;
    }

    /* renamed from: B */
    public synchronized void mo9767B(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f8393c.get(i);
        if (view == null) {
            callback2.invoke("Can't display popup. Could not find view with tag " + i);
            return;
        }
        PopupMenu popupMenu = new PopupMenu(m11930q(i), view);
        this.f8402l = popupMenu;
        Menu menu = popupMenu.getMenu();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            menu.add(0, 0, i2, readableArray.getString(i2));
        }
        C3024b bVar = new C3024b(callback, (C3023a) null);
        this.f8402l.setOnMenuItemClickListener(bVar);
        this.f8402l.setOnDismissListener(bVar);
        this.f8402l.show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (r11.needsCustomLayoutForChildren() == false) goto L_0x0055;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo9768C(int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "NativeViewHierarchyManager_updateLayout"
            r1 = 0
            com.facebook.systrace.b$b r0 = com.facebook.systrace.C3296b.m12892a(r1, r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = "parentTag"
            com.facebook.systrace.b$b r0 = r0.mo10750a(r3, r10)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = "tag"
            com.facebook.systrace.b$b r0 = r0.mo10750a(r3, r11)     // Catch:{ all -> 0x0084 }
            r0.mo10752c()     // Catch:{ all -> 0x0084 }
            android.view.View r4 = r9.mo9786w(r11)     // Catch:{ all -> 0x007f }
            r11 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r11)     // Catch:{ all -> 0x007f }
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r11)     // Catch:{ all -> 0x007f }
            r4.measure(r0, r11)     // Catch:{ all -> 0x007f }
            android.view.ViewParent r11 = r4.getParent()     // Catch:{ all -> 0x007f }
            boolean r0 = r11 instanceof com.facebook.react.uimanager.C2990j0     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0037
            r11.requestLayout()     // Catch:{ all -> 0x007f }
        L_0x0037:
            android.util.SparseBooleanArray r11 = r9.f8395e     // Catch:{ all -> 0x007f }
            boolean r11 = r11.get(r10)     // Catch:{ all -> 0x007f }
            if (r11 != 0) goto L_0x0055
            android.util.SparseArray<com.facebook.react.uimanager.ViewManager> r11 = r9.f8394d     // Catch:{ all -> 0x007f }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x007f }
            com.facebook.react.uimanager.ViewManager r11 = (com.facebook.react.uimanager.ViewManager) r11     // Catch:{ all -> 0x007f }
            boolean r0 = r11 instanceof com.facebook.react.uimanager.C2964g     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x005e
            com.facebook.react.uimanager.g r11 = (com.facebook.react.uimanager.C2964g) r11     // Catch:{ all -> 0x007f }
            if (r11 == 0) goto L_0x007a
            boolean r10 = r11.needsCustomLayoutForChildren()     // Catch:{ all -> 0x007f }
            if (r10 != 0) goto L_0x007a
        L_0x0055:
            r3 = r9
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r3.m11924D(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x007f }
            goto L_0x007a
        L_0x005e:
            com.facebook.react.uimanager.h r11 = new com.facebook.react.uimanager.h     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r12.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r13 = "Trying to use view with tag "
            r12.append(r13)     // Catch:{ all -> 0x007f }
            r12.append(r10)     // Catch:{ all -> 0x007f }
            java.lang.String r10 = " as a parent, but its Manager doesn't implement IViewManagerWithChildren"
            r12.append(r10)     // Catch:{ all -> 0x007f }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x007f }
            r11.<init>(r10)     // Catch:{ all -> 0x007f }
            throw r11     // Catch:{ all -> 0x007f }
        L_0x007a:
            com.facebook.systrace.C3294a.m12885g(r1)     // Catch:{ all -> 0x0084 }
            monitor-exit(r9)
            return
        L_0x007f:
            r10 = move-exception
            com.facebook.systrace.C3294a.m12885g(r1)     // Catch:{ all -> 0x0084 }
            throw r10     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3022n.mo9768C(int, int, int, int, int, int):void");
    }

    /* renamed from: E */
    public synchronized void mo9769E(int i, C2962f0 f0Var) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager x = mo9787x(i);
            View w = mo9786w(i);
            if (f0Var != null) {
                x.updateProperties(w, f0Var);
            }
        } catch (C2981h e) {
            String str = f8391a;
            C6071a.m22876j(str, "Unable to update properties for view tag " + i, e);
        }
        return;
    }

    /* renamed from: F */
    public synchronized void mo9770F(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        mo9787x(i).updateExtraData(mo9786w(i), obj);
    }

    /* renamed from: b */
    public synchronized void mo9771b(int i, View view) {
        mo9772c(i, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final synchronized void mo9772c(int i, View view) {
        if (view.getId() != -1) {
            String str = f8391a;
            C6071a.m22875i(str, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
        this.f8393c.put(i, view);
        this.f8394d.put(i, this.f8398h);
        this.f8395e.put(i, true);
        view.setId(i);
    }

    /* renamed from: e */
    public void mo9773e() {
        this.f8397g.mo8856b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9774f() {
        this.f8399i.mo9747f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9775h(ReadableMap readableMap, Callback callback) {
        this.f8399i.mo9746e(readableMap, callback);
    }

    /* renamed from: j */
    public synchronized void mo9776j(C3031o0 o0Var, int i, String str, C2962f0 f0Var) {
        UiThreadUtil.assertOnUiThread();
        C3296b.m12892a(0, "NativeViewHierarchyManager_createView").mo10750a("tag", i).mo10751b("className", str).mo10752c();
        try {
            ViewManager a = this.f8396f.mo9624a(str);
            this.f8393c.put(i, a.createView(i, o0Var, f0Var, (C3025n0) null, this.f8397g));
            this.f8394d.put(i, a);
        } finally {
            C3294a.m12885g(0);
        }
    }

    /* renamed from: k */
    public void mo9777k() {
        PopupMenu popupMenu = this.f8402l;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    @Deprecated
    /* renamed from: l */
    public synchronized void mo9778l(int i, int i2, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f8393c.get(i);
        if (view != null) {
            mo9787x(i).receiveCommand(view, i2, readableArray);
        } else {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i + "] and command " + i2);
        }
    }

    /* renamed from: m */
    public synchronized void mo9779m(int i, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f8393c.get(i);
        if (view != null) {
            ViewManager x = mo9787x(i);
            C2928c1 delegate = x.getDelegate();
            if (delegate != null) {
                delegate.mo8907a(view, str, readableArray);
            } else {
                x.receiveCommand(view, str, readableArray);
            }
        } else {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i + "] and command " + str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public synchronized void mo9780n(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            if (this.f8394d.get(view.getId()) != null) {
                if (!this.f8395e.get(view.getId())) {
                    mo9787x(view.getId()).onDropViewInstance(view);
                }
                ViewManager viewManager = this.f8394d.get(view.getId());
                if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                    for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                        View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                        if (childAt == null) {
                            C6071a.m22875i(f8391a, "Unable to drop null child view");
                        } else if (this.f8393c.get(childAt.getId()) != null) {
                            mo9780n(childAt);
                        }
                    }
                    viewGroupManager.removeAllViews(viewGroup);
                }
                this.f8393c.remove(view.getId());
                this.f8394d.remove(view.getId());
            }
        }
    }

    /* renamed from: o */
    public synchronized int mo9781o(int i, float f, float f2) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.f8393c.get(i);
        if (view != null) {
        } else {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
        }
        return C3033p0.m11989c(f, f2, (ViewGroup) view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01db, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo9782r(int r18, int[] r19, com.facebook.react.uimanager.C2920a1[] r20, int[] r21) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            monitor-enter(r17)
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()     // Catch:{ all -> 0x0202 }
            java.util.Set r12 = r17.m11929p(r18)     // Catch:{ all -> 0x0202 }
            android.util.SparseArray<android.view.View> r1 = r8.f8393c     // Catch:{ all -> 0x0202 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0202 }
            r13 = r1
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13     // Catch:{ all -> 0x0202 }
            com.facebook.react.uimanager.ViewManager r1 = r17.mo9787x(r18)     // Catch:{ all -> 0x0202 }
            r14 = r1
            com.facebook.react.uimanager.ViewGroupManager r14 = (com.facebook.react.uimanager.ViewGroupManager) r14     // Catch:{ all -> 0x0202 }
            if (r13 == 0) goto L_0x01dc
            int r1 = r14.getChildCount(r13)     // Catch:{ all -> 0x0202 }
            if (r9 == 0) goto L_0x00ee
            int r2 = r9.length     // Catch:{ all -> 0x0202 }
            int r2 = r2 + -1
        L_0x002d:
            if (r2 < 0) goto L_0x00ee
            r3 = r9[r2]     // Catch:{ all -> 0x0202 }
            if (r3 < 0) goto L_0x00c3
            android.view.View r4 = r14.getChildAt(r13, r3)     // Catch:{ all -> 0x0202 }
            if (r4 != 0) goto L_0x0074
            android.util.SparseBooleanArray r1 = r8.f8395e     // Catch:{ all -> 0x0202 }
            boolean r1 = r1.get(r0)     // Catch:{ all -> 0x0202 }
            if (r1 == 0) goto L_0x0049
            int r1 = r14.getChildCount(r13)     // Catch:{ all -> 0x0202 }
            if (r1 != 0) goto L_0x0049
            monitor-exit(r17)
            return
        L_0x0049:
            com.facebook.react.uimanager.h r1 = new com.facebook.react.uimanager.h     // Catch:{ all -> 0x0202 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0202 }
            r2.<init>()     // Catch:{ all -> 0x0202 }
            java.lang.String r4 = "Trying to remove a view index above child count "
            r2.append(r4)     // Catch:{ all -> 0x0202 }
            r2.append(r3)     // Catch:{ all -> 0x0202 }
            java.lang.String r3 = " view tag: "
            r2.append(r3)     // Catch:{ all -> 0x0202 }
            r2.append(r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "\n detail: "
            r2.append(r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = m11928i(r13, r14, r9, r10, r11)     // Catch:{ all -> 0x0202 }
            r2.append(r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0202 }
            r1.<init>(r0)     // Catch:{ all -> 0x0202 }
            throw r1     // Catch:{ all -> 0x0202 }
        L_0x0074:
            if (r3 >= r1) goto L_0x0098
            android.view.View r1 = r14.getChildAt(r13, r3)     // Catch:{ all -> 0x0202 }
            boolean r4 = r8.f8401k     // Catch:{ all -> 0x0202 }
            if (r4 == 0) goto L_0x0091
            com.facebook.react.uimanager.m1.e r4 = r8.f8399i     // Catch:{ all -> 0x0202 }
            boolean r4 = r4.mo9748h(r1)     // Catch:{ all -> 0x0202 }
            if (r4 == 0) goto L_0x0091
            int r1 = r1.getId()     // Catch:{ all -> 0x0202 }
            boolean r1 = r8.m11926d(r11, r1)     // Catch:{ all -> 0x0202 }
            if (r1 == 0) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r14.removeViewAt(r13, r3)     // Catch:{ all -> 0x0202 }
        L_0x0094:
            int r2 = r2 + -1
            r1 = r3
            goto L_0x002d
        L_0x0098:
            com.facebook.react.uimanager.h r1 = new com.facebook.react.uimanager.h     // Catch:{ all -> 0x0202 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0202 }
            r2.<init>()     // Catch:{ all -> 0x0202 }
            java.lang.String r4 = "Trying to remove an out of order view index:"
            r2.append(r4)     // Catch:{ all -> 0x0202 }
            r2.append(r3)     // Catch:{ all -> 0x0202 }
            java.lang.String r3 = " view tag: "
            r2.append(r3)     // Catch:{ all -> 0x0202 }
            r2.append(r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "\n detail: "
            r2.append(r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = m11928i(r13, r14, r9, r10, r11)     // Catch:{ all -> 0x0202 }
            r2.append(r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0202 }
            r1.<init>(r0)     // Catch:{ all -> 0x0202 }
            throw r1     // Catch:{ all -> 0x0202 }
        L_0x00c3:
            com.facebook.react.uimanager.h r1 = new com.facebook.react.uimanager.h     // Catch:{ all -> 0x0202 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0202 }
            r2.<init>()     // Catch:{ all -> 0x0202 }
            java.lang.String r4 = "Trying to remove a negative view index:"
            r2.append(r4)     // Catch:{ all -> 0x0202 }
            r2.append(r3)     // Catch:{ all -> 0x0202 }
            java.lang.String r3 = " view tag: "
            r2.append(r3)     // Catch:{ all -> 0x0202 }
            r2.append(r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "\n detail: "
            r2.append(r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = m11928i(r13, r14, r9, r10, r11)     // Catch:{ all -> 0x0202 }
            r2.append(r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0202 }
            r1.<init>(r0)     // Catch:{ all -> 0x0202 }
            throw r1     // Catch:{ all -> 0x0202 }
        L_0x00ee:
            if (r11 == 0) goto L_0x015f
            r7 = 0
        L_0x00f1:
            int r1 = r11.length     // Catch:{ all -> 0x0202 }
            if (r7 >= r1) goto L_0x015f
            r1 = r11[r7]     // Catch:{ all -> 0x0202 }
            android.util.SparseArray<android.view.View> r2 = r8.f8393c     // Catch:{ all -> 0x0202 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0202 }
            r6 = r2
            android.view.View r6 = (android.view.View) r6     // Catch:{ all -> 0x0202 }
            if (r6 == 0) goto L_0x013a
            boolean r2 = r8.f8401k     // Catch:{ all -> 0x0202 }
            if (r2 == 0) goto L_0x012d
            com.facebook.react.uimanager.m1.e r2 = r8.f8399i     // Catch:{ all -> 0x0202 }
            boolean r2 = r2.mo9748h(r6)     // Catch:{ all -> 0x0202 }
            if (r2 == 0) goto L_0x012d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0202 }
            r12.add(r1)     // Catch:{ all -> 0x0202 }
            com.facebook.react.uimanager.m1.e r5 = r8.f8399i     // Catch:{ all -> 0x0202 }
            com.facebook.react.uimanager.n$a r4 = new com.facebook.react.uimanager.n$a     // Catch:{ all -> 0x0202 }
            r1 = r4
            r2 = r17
            r3 = r14
            r15 = r4
            r4 = r13
            r0 = r5
            r5 = r6
            r9 = r6
            r6 = r12
            r16 = r7
            r7 = r18
            r1.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0202 }
            r0.mo9745c(r9, r15)     // Catch:{ all -> 0x0202 }
            goto L_0x0133
        L_0x012d:
            r9 = r6
            r16 = r7
            r8.mo9780n(r9)     // Catch:{ all -> 0x0202 }
        L_0x0133:
            int r7 = r16 + 1
            r0 = r18
            r9 = r19
            goto L_0x00f1
        L_0x013a:
            com.facebook.react.uimanager.h r0 = new com.facebook.react.uimanager.h     // Catch:{ all -> 0x0202 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0202 }
            r2.<init>()     // Catch:{ all -> 0x0202 }
            java.lang.String r3 = "Trying to destroy unknown view tag: "
            r2.append(r3)     // Catch:{ all -> 0x0202 }
            r2.append(r1)     // Catch:{ all -> 0x0202 }
            java.lang.String r1 = "\n detail: "
            r2.append(r1)     // Catch:{ all -> 0x0202 }
            r1 = r19
            java.lang.String r1 = m11928i(r13, r14, r1, r10, r11)     // Catch:{ all -> 0x0202 }
            r2.append(r1)     // Catch:{ all -> 0x0202 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0202 }
            r0.<init>(r1)     // Catch:{ all -> 0x0202 }
            throw r0     // Catch:{ all -> 0x0202 }
        L_0x015f:
            r1 = r9
            if (r10 == 0) goto L_0x01cb
            r0 = 0
        L_0x0163:
            int r2 = r10.length     // Catch:{ all -> 0x0202 }
            if (r0 >= r2) goto L_0x01cb
            r2 = r10[r0]     // Catch:{ all -> 0x0202 }
            android.util.SparseArray<android.view.View> r3 = r8.f8393c     // Catch:{ all -> 0x0202 }
            int r4 = r2.f8199b     // Catch:{ all -> 0x0202 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0202 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0202 }
            if (r3 == 0) goto L_0x01a6
            int r4 = r2.f8200c     // Catch:{ all -> 0x0202 }
            boolean r5 = r12.isEmpty()     // Catch:{ all -> 0x0202 }
            if (r5 != 0) goto L_0x01a0
            r4 = 0
            r5 = 0
        L_0x017e:
            int r6 = r13.getChildCount()     // Catch:{ all -> 0x0202 }
            if (r4 >= r6) goto L_0x01a0
            int r6 = r2.f8200c     // Catch:{ all -> 0x0202 }
            if (r5 != r6) goto L_0x0189
            goto L_0x01a0
        L_0x0189:
            android.view.View r6 = r13.getChildAt(r4)     // Catch:{ all -> 0x0202 }
            int r6 = r6.getId()     // Catch:{ all -> 0x0202 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0202 }
            boolean r6 = r12.contains(r6)     // Catch:{ all -> 0x0202 }
            if (r6 != 0) goto L_0x019d
            int r5 = r5 + 1
        L_0x019d:
            int r4 = r4 + 1
            goto L_0x017e
        L_0x01a0:
            r14.addView(r13, r3, r4)     // Catch:{ all -> 0x0202 }
            int r0 = r0 + 1
            goto L_0x0163
        L_0x01a6:
            com.facebook.react.uimanager.h r0 = new com.facebook.react.uimanager.h     // Catch:{ all -> 0x0202 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0202 }
            r3.<init>()     // Catch:{ all -> 0x0202 }
            java.lang.String r4 = "Trying to add unknown view tag: "
            r3.append(r4)     // Catch:{ all -> 0x0202 }
            int r2 = r2.f8199b     // Catch:{ all -> 0x0202 }
            r3.append(r2)     // Catch:{ all -> 0x0202 }
            java.lang.String r2 = "\n detail: "
            r3.append(r2)     // Catch:{ all -> 0x0202 }
            java.lang.String r1 = m11928i(r13, r14, r1, r10, r11)     // Catch:{ all -> 0x0202 }
            r3.append(r1)     // Catch:{ all -> 0x0202 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0202 }
            r0.<init>(r1)     // Catch:{ all -> 0x0202 }
            throw r0     // Catch:{ all -> 0x0202 }
        L_0x01cb:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x01da
            java.util.HashMap<java.lang.Integer, java.util.Set<java.lang.Integer>> r0 = r8.f8403m     // Catch:{ all -> 0x0202 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0202 }
            r0.remove(r1)     // Catch:{ all -> 0x0202 }
        L_0x01da:
            monitor-exit(r17)
            return
        L_0x01dc:
            r1 = r9
            com.facebook.react.uimanager.h r0 = new com.facebook.react.uimanager.h     // Catch:{ all -> 0x0202 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0202 }
            r2.<init>()     // Catch:{ all -> 0x0202 }
            java.lang.String r3 = "Trying to manageChildren view with tag "
            r2.append(r3)     // Catch:{ all -> 0x0202 }
            r3 = r18
            r2.append(r3)     // Catch:{ all -> 0x0202 }
            java.lang.String r3 = " which doesn't exist\n detail: "
            r2.append(r3)     // Catch:{ all -> 0x0202 }
            java.lang.String r1 = m11928i(r13, r14, r1, r10, r11)     // Catch:{ all -> 0x0202 }
            r2.append(r1)     // Catch:{ all -> 0x0202 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0202 }
            r0.<init>(r1)     // Catch:{ all -> 0x0202 }
            throw r0     // Catch:{ all -> 0x0202 }
        L_0x0202:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C3022n.mo9782r(int, int[], com.facebook.react.uimanager.a1[], int[]):void");
    }

    /* renamed from: t */
    public synchronized void mo9783t(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f8393c.get(i);
        if (view != null) {
            View view2 = (View) C2995k0.m11876a(view);
            if (view2 != null) {
                m11927g(view2, iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                m11927g(view, iArr);
                iArr[0] = iArr[0] - i2;
                iArr[1] = iArr[1] - i3;
            } else {
                throw new C3032p("Native view " + i + " is no longer on screen");
            }
        } else {
            throw new C3032p("No native view for " + i + " currently exists");
        }
    }

    /* renamed from: u */
    public synchronized void mo9784u(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f8393c.get(i);
        if (view != null) {
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = iArr[0] - rect.left;
            iArr[1] = iArr[1] - rect.top;
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } else {
            throw new C3032p("No native view for " + i + " currently exists");
        }
    }

    /* renamed from: v */
    public synchronized void mo9785v(int i) {
        UiThreadUtil.assertOnUiThread();
        if (!this.f8395e.get(i)) {
            SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
        }
        mo9780n(this.f8393c.get(i));
        this.f8395e.delete(i);
    }

    /* renamed from: w */
    public final synchronized View mo9786w(int i) {
        View view;
        view = this.f8393c.get(i);
        if (view == null) {
            throw new C2981h("Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    /* renamed from: x */
    public final synchronized ViewManager mo9787x(int i) {
        ViewManager viewManager;
        viewManager = this.f8394d.get(i);
        if (viewManager == null) {
            throw new C2981h("ViewManager for tag " + i + " could not be found.\n");
        }
        return viewManager;
    }

    /* renamed from: y */
    public void mo9788y(int i, int i2) {
        View view = this.f8393c.get(i);
        if (view != null) {
            view.sendAccessibilityEvent(i2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    /* renamed from: z */
    public synchronized void mo9789z(int i, int i2, boolean z) {
        if (!z) {
            this.f8397g.mo8857d(i2, (ViewParent) null);
            return;
        }
        View view = this.f8393c.get(i);
        if (i2 == i || !(view instanceof ViewParent)) {
            if (this.f8395e.get(i)) {
                SoftAssertions.assertUnreachable("Cannot block native responder on " + i + " that is a root view");
            }
            this.f8397g.mo8857d(i2, view.getParent());
            return;
        }
        this.f8397g.mo8857d(i2, (ViewParent) view);
    }
}
