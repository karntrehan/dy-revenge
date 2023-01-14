package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C1130o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p027c.p060f.C1788a;
import p027c.p064i.p069g.C1849b;
import p027c.p064i.p072j.C1986r;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.fragment.app.t */
class C1254t {

    /* renamed from: a */
    private static final int[] f3606a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final C1269v f3607b = (Build.VERSION.SDK_INT >= 21 ? new C1263u() : null);

    /* renamed from: c */
    private static final C1269v f3608c = m5198w();

    /* renamed from: androidx.fragment.app.t$a */
    static class C1255a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1261g f3609f;

        /* renamed from: o */
        final /* synthetic */ Fragment f3610o;

        /* renamed from: p */
        final /* synthetic */ C1849b f3611p;

        C1255a(C1261g gVar, Fragment fragment, C1849b bVar) {
            this.f3609f = gVar;
            this.f3610o = fragment;
            this.f3611p = bVar;
        }

        public void run() {
            this.f3609f.mo4169a(this.f3610o, this.f3611p);
        }
    }

    /* renamed from: androidx.fragment.app.t$b */
    static class C1256b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3612f;

        C1256b(ArrayList arrayList) {
            this.f3612f = arrayList;
        }

        public void run() {
            C1254t.m5174A(this.f3612f, 4);
        }
    }

    /* renamed from: androidx.fragment.app.t$c */
    static class C1257c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1261g f3613f;

        /* renamed from: o */
        final /* synthetic */ Fragment f3614o;

        /* renamed from: p */
        final /* synthetic */ C1849b f3615p;

        C1257c(C1261g gVar, Fragment fragment, C1849b bVar) {
            this.f3613f = gVar;
            this.f3614o = fragment;
            this.f3615p = bVar;
        }

        public void run() {
            this.f3613f.mo4169a(this.f3614o, this.f3615p);
        }
    }

    /* renamed from: androidx.fragment.app.t$d */
    static class C1258d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f3616f;

        /* renamed from: o */
        final /* synthetic */ C1269v f3617o;

        /* renamed from: p */
        final /* synthetic */ View f3618p;

        /* renamed from: q */
        final /* synthetic */ Fragment f3619q;

        /* renamed from: r */
        final /* synthetic */ ArrayList f3620r;

        /* renamed from: s */
        final /* synthetic */ ArrayList f3621s;

        /* renamed from: t */
        final /* synthetic */ ArrayList f3622t;

        /* renamed from: u */
        final /* synthetic */ Object f3623u;

        C1258d(Object obj, C1269v vVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3616f = obj;
            this.f3617o = vVar;
            this.f3618p = view;
            this.f3619q = fragment;
            this.f3620r = arrayList;
            this.f3621s = arrayList2;
            this.f3622t = arrayList3;
            this.f3623u = obj2;
        }

        public void run() {
            Object obj = this.f3616f;
            if (obj != null) {
                this.f3617o.mo4269p(obj, this.f3618p);
                this.f3621s.addAll(C1254t.m5186k(this.f3617o, this.f3616f, this.f3619q, this.f3620r, this.f3618p));
            }
            if (this.f3622t != null) {
                if (this.f3623u != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f3618p);
                    this.f3617o.mo4270q(this.f3623u, this.f3622t, arrayList);
                }
                this.f3622t.clear();
                this.f3622t.add(this.f3618p);
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$e */
    static class C1259e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Fragment f3624f;

        /* renamed from: o */
        final /* synthetic */ Fragment f3625o;

        /* renamed from: p */
        final /* synthetic */ boolean f3626p;

        /* renamed from: q */
        final /* synthetic */ C1788a f3627q;

        /* renamed from: r */
        final /* synthetic */ View f3628r;

        /* renamed from: s */
        final /* synthetic */ C1269v f3629s;

        /* renamed from: t */
        final /* synthetic */ Rect f3630t;

        C1259e(Fragment fragment, Fragment fragment2, boolean z, C1788a aVar, View view, C1269v vVar, Rect rect) {
            this.f3624f = fragment;
            this.f3625o = fragment2;
            this.f3626p = z;
            this.f3627q = aVar;
            this.f3628r = view;
            this.f3629s = vVar;
            this.f3630t = rect;
        }

        public void run() {
            C1254t.m5181f(this.f3624f, this.f3625o, this.f3626p, this.f3627q, false);
            View view = this.f3628r;
            if (view != null) {
                this.f3629s.mo4296k(view, this.f3630t);
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$f */
    static class C1260f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1269v f3631f;

        /* renamed from: o */
        final /* synthetic */ C1788a f3632o;

        /* renamed from: p */
        final /* synthetic */ Object f3633p;

        /* renamed from: q */
        final /* synthetic */ C1262h f3634q;

        /* renamed from: r */
        final /* synthetic */ ArrayList f3635r;

        /* renamed from: s */
        final /* synthetic */ View f3636s;

        /* renamed from: t */
        final /* synthetic */ Fragment f3637t;

        /* renamed from: u */
        final /* synthetic */ Fragment f3638u;

        /* renamed from: v */
        final /* synthetic */ boolean f3639v;

        /* renamed from: w */
        final /* synthetic */ ArrayList f3640w;

        /* renamed from: x */
        final /* synthetic */ Object f3641x;

        /* renamed from: y */
        final /* synthetic */ Rect f3642y;

        C1260f(C1269v vVar, C1788a aVar, Object obj, C1262h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3631f = vVar;
            this.f3632o = aVar;
            this.f3633p = obj;
            this.f3634q = hVar;
            this.f3635r = arrayList;
            this.f3636s = view;
            this.f3637t = fragment;
            this.f3638u = fragment2;
            this.f3639v = z;
            this.f3640w = arrayList2;
            this.f3641x = obj2;
            this.f3642y = rect;
        }

        public void run() {
            C1788a<String, View> h = C1254t.m5183h(this.f3631f, this.f3632o, this.f3633p, this.f3634q);
            if (h != null) {
                this.f3635r.addAll(h.values());
                this.f3635r.add(this.f3636s);
            }
            C1254t.m5181f(this.f3637t, this.f3638u, this.f3639v, h, false);
            Object obj = this.f3633p;
            if (obj != null) {
                this.f3631f.mo4260A(obj, this.f3640w, this.f3635r);
                View s = C1254t.m5194s(h, this.f3634q, this.f3641x, this.f3639v);
                if (s != null) {
                    this.f3631f.mo4296k(s, this.f3642y);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$g */
    interface C1261g {
        /* renamed from: a */
        void mo4169a(Fragment fragment, C1849b bVar);

        /* renamed from: b */
        void mo4170b(Fragment fragment, C1849b bVar);
    }

    /* renamed from: androidx.fragment.app.t$h */
    static class C1262h {

        /* renamed from: a */
        public Fragment f3643a;

        /* renamed from: b */
        public boolean f3644b;

        /* renamed from: c */
        public C1211a f3645c;

        /* renamed from: d */
        public Fragment f3646d;

        /* renamed from: e */
        public boolean f3647e;

        /* renamed from: f */
        public C1211a f3648f;

        C1262h() {
        }
    }

    /* renamed from: A */
    static void m5174A(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: B */
    static void m5175B(C1231l lVar, ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, C1261g gVar) {
        C1231l lVar2 = lVar;
        ArrayList<C1211a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i3 = i2;
        boolean z2 = z;
        if (lVar2.f3521o >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i4 = i; i4 < i3; i4++) {
                C1211a aVar = arrayList3.get(i4);
                if (arrayList4.get(i4).booleanValue()) {
                    m5180e(aVar, sparseArray, z2);
                } else {
                    m5178c(aVar, sparseArray, z2);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(lVar2.f3522p.mo4078f());
                int size = sparseArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = sparseArray.keyAt(i5);
                    C1788a<String, String> d = m5179d(keyAt, arrayList3, arrayList4, i, i3);
                    C1262h hVar = (C1262h) sparseArray.valueAt(i5);
                    C1231l lVar3 = lVar;
                    View view2 = view;
                    C1261g gVar2 = gVar;
                    if (z2) {
                        m5190o(lVar3, keyAt, hVar, view2, d, gVar2);
                    } else {
                        m5189n(lVar3, keyAt, hVar, view2, d, gVar2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m5176a(ArrayList<View> arrayList, C1788a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m = aVar.mo6263m(size);
            if (collection.contains(C1988t.m8347H(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f3403y != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.f3369M == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5177b(androidx.fragment.app.C1211a r8, androidx.fragment.app.C1252s.C1253a r9, android.util.SparseArray<androidx.fragment.app.C1254t.C1262h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f3599b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f3367K
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f3606a
            int r9 = r9.f3598a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f3598a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = 0
        L_0x0029:
            r4 = 0
            r5 = 0
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.f3383a0
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.f3369M
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f3403y
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.f3369M
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.f3383a0
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f3403y
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f3369M
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f3403y
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f3369M
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            boolean r9 = r0.f3403y
            if (r12 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.f3377U
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.f3384b0
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x0079
        L_0x0070:
            r9 = 0
            goto L_0x0079
        L_0x0072:
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f3369M
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x0079:
            r5 = r9
            r9 = 0
            r4 = 1
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.f3382Z
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.f3403y
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f3369M
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r2 = r9
            r9 = 1
            goto L_0x0029
        L_0x0090:
            java.lang.Object r6 = r10.get(r1)
            androidx.fragment.app.t$h r6 = (androidx.fragment.app.C1254t.C1262h) r6
            if (r2 == 0) goto L_0x00a2
            androidx.fragment.app.t$h r6 = m5191p(r6, r10, r1)
            r6.f3643a = r0
            r6.f3644b = r11
            r6.f3645c = r8
        L_0x00a2:
            r2 = 0
            if (r12 != 0) goto L_0x00c3
            if (r9 == 0) goto L_0x00c3
            if (r6 == 0) goto L_0x00af
            androidx.fragment.app.Fragment r9 = r6.f3646d
            if (r9 != r0) goto L_0x00af
            r6.f3646d = r2
        L_0x00af:
            androidx.fragment.app.l r9 = r8.f3440t
            int r7 = r0.f3393o
            if (r7 >= r3) goto L_0x00c3
            int r7 = r9.f3521o
            if (r7 < r3) goto L_0x00c3
            boolean r7 = r8.f3596r
            if (r7 != 0) goto L_0x00c3
            r9.mo4166x0(r0)
            r9.mo4102D0(r0, r3)
        L_0x00c3:
            if (r5 == 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00cb
            androidx.fragment.app.Fragment r9 = r6.f3646d
            if (r9 != 0) goto L_0x00d5
        L_0x00cb:
            androidx.fragment.app.t$h r6 = m5191p(r6, r10, r1)
            r6.f3646d = r0
            r6.f3647e = r11
            r6.f3648f = r8
        L_0x00d5:
            if (r12 != 0) goto L_0x00e1
            if (r4 == 0) goto L_0x00e1
            if (r6 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r8 = r6.f3643a
            if (r8 != r0) goto L_0x00e1
            r6.f3643a = r2
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1254t.m5177b(androidx.fragment.app.a, androidx.fragment.app.s$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m5178c(C1211a aVar, SparseArray<C1262h> sparseArray, boolean z) {
        int size = aVar.f3581c.size();
        for (int i = 0; i < size; i++) {
            m5177b(aVar, aVar.f3581c.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C1788a<String, String> m5179d(int i, ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C1788a<String, String> aVar = new C1788a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C1211a aVar2 = arrayList.get(i4);
            if (aVar2.mo3964B(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f3594p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f3594p;
                        arrayList4 = aVar2.f3595q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f3594p;
                        arrayList3 = aVar2.f3595q;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static void m5180e(C1211a aVar, SparseArray<C1262h> sparseArray, boolean z) {
        if (aVar.f3440t.f3523q.mo3956d()) {
            for (int size = aVar.f3581c.size() - 1; size >= 0; size--) {
                m5177b(aVar, aVar.f3581c.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    static void m5181f(Fragment fragment, Fragment fragment2, boolean z, C1788a<String, View> aVar, boolean z2) {
        if ((z ? fragment2.mo3939u() : fragment.mo3939u()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.mo6258i(i));
                arrayList.add(aVar.mo6263m(i));
            }
            throw null;
        }
    }

    /* renamed from: g */
    private static boolean m5182g(C1269v vVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!vVar.mo4265e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C1788a<String, View> m5183h(C1269v vVar, C1788a<String, String> aVar, Object obj, C1262h hVar) {
        C1130o oVar;
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f3643a;
        View N = fragment.mo3861N();
        if (aVar.isEmpty() || obj == null || N == null) {
            aVar.clear();
            return null;
        }
        C1788a<String, View> aVar2 = new C1788a<>();
        vVar.mo4295j(aVar2, N);
        C1211a aVar3 = hVar.f3645c;
        if (hVar.f3644b) {
            oVar = fragment.mo3945w();
            arrayList = aVar3.f3594p;
        } else {
            oVar = fragment.mo3939u();
            arrayList = aVar3.f3595q;
        }
        if (arrayList != null) {
            aVar2.mo6128o(arrayList);
            aVar2.mo6128o(aVar.values());
        }
        if (oVar == null) {
            m5199x(aVar, aVar2);
            return aVar2;
        }
        throw null;
    }

    /* renamed from: i */
    private static C1788a<String, View> m5184i(C1269v vVar, C1788a<String, String> aVar, Object obj, C1262h hVar) {
        C1130o oVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f3646d;
        C1788a<String, View> aVar2 = new C1788a<>();
        vVar.mo4295j(aVar2, fragment.mo3903i1());
        C1211a aVar3 = hVar.f3648f;
        if (hVar.f3647e) {
            oVar = fragment.mo3939u();
            arrayList = aVar3.f3595q;
        } else {
            oVar = fragment.mo3945w();
            arrayList = aVar3.f3594p;
        }
        if (arrayList != null) {
            aVar2.mo6128o(arrayList);
        }
        if (oVar == null) {
            aVar.mo6128o(aVar2.keySet());
            return aVar2;
        }
        throw null;
    }

    /* renamed from: j */
    private static C1269v m5185j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object v = fragment.mo3942v();
            if (v != null) {
                arrayList.add(v);
            }
            Object H = fragment.mo3849H();
            if (H != null) {
                arrayList.add(H);
            }
            Object J = fragment.mo3853J();
            if (J != null) {
                arrayList.add(J);
            }
        }
        if (fragment2 != null) {
            Object t = fragment2.mo3935t();
            if (t != null) {
                arrayList.add(t);
            }
            Object E = fragment2.mo3845E();
            if (E != null) {
                arrayList.add(E);
            }
            Object I = fragment2.mo3851I();
            if (I != null) {
                arrayList.add(I);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1269v vVar = f3607b;
        if (vVar != null && m5182g(vVar, arrayList)) {
            return vVar;
        }
        C1269v vVar2 = f3608c;
        if (vVar2 != null && m5182g(vVar2, arrayList)) {
            return vVar2;
        }
        if (vVar == null && vVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m5186k(C1269v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View N = fragment.mo3861N();
        if (N != null) {
            vVar.mo4294f(arrayList2, N);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        vVar.mo4263b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m5187l(C1269v vVar, ViewGroup viewGroup, View view, C1788a<String, String> aVar, C1262h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C1788a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C1269v vVar2 = vVar;
        C1262h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3643a;
        Fragment fragment2 = hVar2.f3646d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3644b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m5195t(vVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C1788a<String, View> i = m5184i(vVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m5181f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            vVar2.mo4276z(obj4, view, arrayList3);
            m5201z(vVar, obj4, obj2, i, hVar2.f3647e, hVar2.f3648f);
            if (obj5 != null) {
                vVar2.mo4273u(obj5, rect);
            }
        } else {
            rect = null;
        }
        C1260f fVar = r0;
        C1260f fVar2 = new C1260f(vVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C1986r.m8331a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: m */
    private static Object m5188m(C1269v vVar, ViewGroup viewGroup, View view, C1788a<String, String> aVar, C1262h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        C1269v vVar2 = vVar;
        View view3 = view;
        C1788a<String, String> aVar2 = aVar;
        C1262h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = hVar2.f3643a;
        Fragment fragment2 = hVar2.f3646d;
        if (fragment != null) {
            fragment.mo3903i1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3644b;
        Object t = aVar.isEmpty() ? null : m5195t(vVar, fragment, fragment2, z);
        C1788a<String, View> i = m5184i(vVar, aVar2, t, hVar2);
        C1788a<String, View> h = m5183h(vVar, aVar2, t, hVar2);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj3 = null;
        } else {
            m5176a(arrayList3, i, aVar.keySet());
            m5176a(arrayList4, h, aVar.values());
            obj3 = t;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        m5181f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            vVar.mo4276z(obj3, view3, arrayList3);
            m5201z(vVar, obj3, obj2, i, hVar2.f3647e, hVar2.f3648f);
            Rect rect2 = new Rect();
            View s = m5194s(h, hVar2, obj4, z);
            if (s != null) {
                vVar.mo4273u(obj4, rect2);
            }
            rect = rect2;
            view2 = s;
        } else {
            view2 = null;
            rect = null;
        }
        C1986r.m8331a(viewGroup, new C1259e(fragment, fragment2, z, h, view2, vVar, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m5189n(C1231l lVar, int i, C1262h hVar, View view, C1788a<String, String> aVar, C1261g gVar) {
        Fragment fragment;
        Fragment fragment2;
        C1269v j;
        Object obj;
        C1231l lVar2 = lVar;
        C1262h hVar2 = hVar;
        View view2 = view;
        C1788a<String, String> aVar2 = aVar;
        C1261g gVar2 = gVar;
        ViewGroup viewGroup = lVar2.f3523q.mo3956d() ? (ViewGroup) lVar2.f3523q.mo3955c(i) : null;
        if (viewGroup != null && (j = m5185j(fragment2, fragment)) != null) {
            boolean z = hVar2.f3644b;
            boolean z2 = hVar2.f3647e;
            Object q = m5192q(j, (fragment = hVar2.f3643a), z);
            Object r = m5193r(j, (fragment2 = hVar2.f3646d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = r;
            Object obj3 = q;
            C1269v vVar = j;
            Fragment fragment3 = fragment2;
            Object l = m5187l(j, viewGroup, view, aVar, hVar, arrayList3, arrayList2, obj3, obj2);
            Object obj4 = obj3;
            if (obj4 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k = m5186k(vVar, obj, fragment3, arrayList4, view2);
            Object obj5 = (k == null || k.isEmpty()) ? null : obj;
            vVar.mo4262a(obj4, view2);
            Object u = m5196u(vVar, obj4, obj5, l, fragment, hVar2.f3644b);
            if (!(fragment3 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                C1849b bVar = new C1849b();
                gVar2.mo4170b(fragment3, bVar);
                vVar.mo4275w(fragment3, u, bVar, new C1257c(gVar2, fragment3, bVar));
            }
            if (u != null) {
                ArrayList arrayList5 = new ArrayList();
                C1269v vVar2 = vVar;
                vVar2.mo4272t(u, obj4, arrayList5, obj5, k, l, arrayList2);
                m5200y(vVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList5, obj5, k);
                ArrayList arrayList6 = arrayList2;
                C1788a<String, String> aVar3 = aVar;
                vVar.mo4299x(viewGroup, arrayList6, aVar3);
                vVar.mo4264c(viewGroup, u);
                vVar.mo4298s(viewGroup, arrayList6, aVar3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r12 = r4.f3643a;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5190o(androidx.fragment.app.C1231l r17, int r18, androidx.fragment.app.C1254t.C1262h r19, android.view.View r20, p027c.p060f.C1788a<java.lang.String, java.lang.String> r21, androidx.fragment.app.C1254t.C1261g r22) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            r10 = r22
            androidx.fragment.app.e r1 = r0.f3523q
            boolean r1 = r1.mo3956d()
            if (r1 == 0) goto L_0x001b
            androidx.fragment.app.e r0 = r0.f3523q
            r1 = r18
            android.view.View r0 = r0.mo3955c(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r11 = r0
            if (r11 != 0) goto L_0x0020
            return
        L_0x0020:
            androidx.fragment.app.Fragment r12 = r4.f3643a
            androidx.fragment.app.Fragment r13 = r4.f3646d
            androidx.fragment.app.v r14 = m5185j(r13, r12)
            if (r14 != 0) goto L_0x002b
            return
        L_0x002b:
            boolean r15 = r4.f3644b
            boolean r0 = r4.f3647e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Object r6 = m5192q(r14, r12, r15)
            java.lang.Object r5 = m5193r(r14, r13, r0)
            r0 = r14
            r1 = r11
            r2 = r20
            r3 = r21
            r4 = r19
            r17 = r5
            r5 = r7
            r18 = r6
            r6 = r8
            r16 = r11
            r11 = r7
            r7 = r18
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m5188m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0066
            if (r8 != 0) goto L_0x0066
            r7 = r17
            if (r7 != 0) goto L_0x0068
            return
        L_0x0066:
            r7 = r17
        L_0x0068:
            java.util.ArrayList r5 = m5186k(r14, r7, r13, r11, r9)
            java.util.ArrayList r9 = m5186k(r14, r6, r12, r10, r9)
            r0 = 4
            m5174A(r9, r0)
            r0 = r14
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r12
            r12 = r5
            r5 = r15
            java.lang.Object r15 = m5196u(r0, r1, r2, r3, r4, r5)
            if (r13 == 0) goto L_0x00a1
            if (r12 == 0) goto L_0x00a1
            int r0 = r12.size()
            if (r0 > 0) goto L_0x008f
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x00a1
        L_0x008f:
            c.i.g.b r0 = new c.i.g.b
            r0.<init>()
            r1 = r22
            r1.mo4170b(r13, r0)
            androidx.fragment.app.t$a r2 = new androidx.fragment.app.t$a
            r2.<init>(r1, r13, r0)
            r14.mo4275w(r13, r15, r0, r2)
        L_0x00a1:
            if (r15 == 0) goto L_0x00cb
            m5197v(r14, r7, r13, r12)
            java.util.ArrayList r13 = r14.mo4297o(r10)
            r0 = r14
            r1 = r15
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r12
            r6 = r8
            r7 = r10
            r0.mo4272t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r14.mo4264c(r0, r15)
            r1 = r14
            r2 = r0
            r3 = r11
            r4 = r10
            r5 = r13
            r6 = r21
            r1.mo4300y(r2, r3, r4, r5, r6)
            r0 = 0
            m5174A(r9, r0)
            r14.mo4260A(r8, r11, r10)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1254t.m5190o(androidx.fragment.app.l, int, androidx.fragment.app.t$h, android.view.View, c.f.a, androidx.fragment.app.t$g):void");
    }

    /* renamed from: p */
    private static C1262h m5191p(C1262h hVar, SparseArray<C1262h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C1262h hVar2 = new C1262h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static Object m5192q(C1269v vVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return vVar.mo4266g(z ? fragment.mo3845E() : fragment.mo3935t());
    }

    /* renamed from: r */
    private static Object m5193r(C1269v vVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return vVar.mo4266g(z ? fragment.mo3849H() : fragment.mo3942v());
    }

    /* renamed from: s */
    static View m5194s(C1788a<String, View> aVar, C1262h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C1211a aVar2 = hVar.f3645c;
        if (obj == null || aVar == null || (arrayList = aVar2.f3594p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f3594p : aVar2.f3595q).get(0));
    }

    /* renamed from: t */
    private static Object m5195t(C1269v vVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return vVar.mo4261B(vVar.mo4266g(z ? fragment2.mo3853J() : fragment.mo3851I()));
    }

    /* renamed from: u */
    private static Object m5196u(C1269v vVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.mo3915n() : fragment.mo3912m() ? vVar.mo4268n(obj2, obj, obj3) : vVar.mo4267m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m5197v(C1269v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f3403y && fragment.f3369M && fragment.f3383a0) {
            fragment.mo3924p1(true);
            vVar.mo4271r(obj, fragment.mo3861N(), arrayList);
            C1986r.m8331a(fragment.f3376T, new C1256b(arrayList));
        }
    }

    /* renamed from: w */
    private static C1269v m5198w() {
        try {
            return (C1269v) Class.forName("c.v.h").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    private static void m5199x(C1788a<String, String> aVar, C1788a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo6263m(size))) {
                aVar.mo6261k(size);
            }
        }
    }

    /* renamed from: y */
    private static void m5200y(C1269v vVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        C1986r.m8331a(viewGroup, new C1258d(obj, vVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m5201z(C1269v vVar, Object obj, Object obj2, C1788a<String, View> aVar, boolean z, C1211a aVar2) {
        ArrayList<String> arrayList = aVar2.f3594p;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.f3595q : aVar2.f3594p).get(0));
            vVar.mo4274v(obj, view);
            if (obj2 != null) {
                vVar.mo4274v(obj2, view);
            }
        }
    }
}
