package p027c.p100v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p027c.p060f.C1788a;
import p027c.p060f.C1793d;
import p027c.p060f.C1801g;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.v.x */
public abstract class C2214x implements Cloneable {

    /* renamed from: f */
    private static final int[] f6443f = {2, 1, 3, 4};

    /* renamed from: o */
    private static final C2186p f6444o = new C2215a();

    /* renamed from: p */
    private static ThreadLocal<C1788a<Animator, C2218d>> f6445p = new ThreadLocal<>();

    /* renamed from: A */
    private ArrayList<Class<?>> f6446A = null;

    /* renamed from: B */
    private ArrayList<String> f6447B = null;

    /* renamed from: C */
    private ArrayList<Integer> f6448C = null;

    /* renamed from: D */
    private ArrayList<View> f6449D = null;

    /* renamed from: E */
    private ArrayList<Class<?>> f6450E = null;

    /* renamed from: F */
    private C2152e0 f6451F = new C2152e0();

    /* renamed from: G */
    private C2152e0 f6452G = new C2152e0();

    /* renamed from: H */
    C2127b0 f6453H = null;

    /* renamed from: I */
    private int[] f6454I = f6443f;

    /* renamed from: J */
    private ArrayList<C2144d0> f6455J;

    /* renamed from: K */
    private ArrayList<C2144d0> f6456K;

    /* renamed from: L */
    private ViewGroup f6457L = null;

    /* renamed from: M */
    boolean f6458M = false;

    /* renamed from: N */
    ArrayList<Animator> f6459N = new ArrayList<>();

    /* renamed from: O */
    private int f6460O = 0;

    /* renamed from: P */
    private boolean f6461P = false;

    /* renamed from: Q */
    private boolean f6462Q = false;

    /* renamed from: R */
    private ArrayList<C2220f> f6463R = null;

    /* renamed from: S */
    private ArrayList<Animator> f6464S = new ArrayList<>();

    /* renamed from: T */
    C2125a0 f6465T;

    /* renamed from: U */
    private C2219e f6466U;

    /* renamed from: V */
    private C1788a<String, String> f6467V;

    /* renamed from: W */
    private C2186p f6468W = f6444o;

    /* renamed from: q */
    private String f6469q = getClass().getName();

    /* renamed from: r */
    private long f6470r = -1;

    /* renamed from: s */
    long f6471s = -1;

    /* renamed from: t */
    private TimeInterpolator f6472t = null;

    /* renamed from: u */
    ArrayList<Integer> f6473u = new ArrayList<>();

    /* renamed from: v */
    ArrayList<View> f6474v = new ArrayList<>();

    /* renamed from: w */
    private ArrayList<String> f6475w = null;

    /* renamed from: x */
    private ArrayList<Class<?>> f6476x = null;

    /* renamed from: y */
    private ArrayList<Integer> f6477y = null;

    /* renamed from: z */
    private ArrayList<View> f6478z = null;

    /* renamed from: c.v.x$a */
    static class C2215a extends C2186p {
        C2215a() {
        }

        /* renamed from: a */
        public Path mo7341a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: c.v.x$b */
    class C2216b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1788a f6479a;

        C2216b(C1788a aVar) {
            this.f6479a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6479a.remove(animator);
            C2214x.this.f6459N.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C2214x.this.f6459N.add(animator);
        }
    }

    /* renamed from: c.v.x$c */
    class C2217c extends AnimatorListenerAdapter {
        C2217c() {
        }

        public void onAnimationEnd(Animator animator) {
            C2214x.this.mo7387s();
            animator.removeListener(this);
        }
    }

    /* renamed from: c.v.x$d */
    private static class C2218d {

        /* renamed from: a */
        View f6482a;

        /* renamed from: b */
        String f6483b;

        /* renamed from: c */
        C2144d0 f6484c;

        /* renamed from: d */
        C2227z0 f6485d;

        /* renamed from: e */
        C2214x f6486e;

        C2218d(View view, String str, C2214x xVar, C2227z0 z0Var, C2144d0 d0Var) {
            this.f6482a = view;
            this.f6483b = str;
            this.f6484c = d0Var;
            this.f6485d = z0Var;
            this.f6486e = xVar;
        }
    }

    /* renamed from: c.v.x$e */
    public static abstract class C2219e {
        /* renamed from: a */
        public abstract Rect mo7275a(C2214x xVar);
    }

    /* renamed from: c.v.x$f */
    public interface C2220f {
        /* renamed from: a */
        void mo7208a(C2214x xVar);

        /* renamed from: b */
        void mo7238b(C2214x xVar);

        /* renamed from: c */
        void mo7207c(C2214x xVar);

        /* renamed from: d */
        void mo7239d(C2214x xVar);

        /* renamed from: e */
        void mo7240e(C2214x xVar);
    }

    /* renamed from: C */
    private static C1788a<Animator, C2218d> m9350C() {
        C1788a<Animator, C2218d> aVar = f6445p.get();
        if (aVar != null) {
            return aVar;
        }
        C1788a<Animator, C2218d> aVar2 = new C1788a<>();
        f6445p.set(aVar2);
        return aVar2;
    }

    /* renamed from: P */
    private static boolean m9351P(C2144d0 d0Var, C2144d0 d0Var2, String str) {
        Object obj = d0Var.f6290a.get(str);
        Object obj2 = d0Var2.f6290a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: Q */
    private void m9352Q(C1788a<View, C2144d0> aVar, C1788a<View, C2144d0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo7380O(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo7380O(view)) {
                C2144d0 d0Var = aVar.get(valueAt);
                C2144d0 d0Var2 = aVar2.get(view);
                if (!(d0Var == null || d0Var2 == null)) {
                    this.f6455J.add(d0Var);
                    this.f6456K.add(d0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: R */
    private void m9353R(C1788a<View, C2144d0> aVar, C1788a<View, C2144d0> aVar2) {
        C2144d0 remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i = aVar.mo6258i(size);
            if (i != null && mo7380O(i) && (remove = aVar2.remove(i)) != null && mo7380O(remove.f6291b)) {
                this.f6455J.add(aVar.mo6261k(size));
                this.f6456K.add(remove);
            }
        }
    }

    /* renamed from: S */
    private void m9354S(C1788a<View, C2144d0> aVar, C1788a<View, C2144d0> aVar2, C1793d<View> dVar, C1793d<View> dVar2) {
        View i;
        int q = dVar.mo6172q();
        for (int i2 = 0; i2 < q; i2++) {
            View r = dVar.mo6173r(i2);
            if (r != null && mo7380O(r) && (i = dVar2.mo6165i(dVar.mo6168l(i2))) != null && mo7380O(i)) {
                C2144d0 d0Var = aVar.get(r);
                C2144d0 d0Var2 = aVar2.get(i);
                if (!(d0Var == null || d0Var2 == null)) {
                    this.f6455J.add(d0Var);
                    this.f6456K.add(d0Var2);
                    aVar.remove(r);
                    aVar2.remove(i);
                }
            }
        }
    }

    /* renamed from: T */
    private void m9355T(C1788a<View, C2144d0> aVar, C1788a<View, C2144d0> aVar2, C1788a<String, View> aVar3, C1788a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View m = aVar3.mo6263m(i);
            if (m != null && mo7380O(m) && (view = aVar4.get(aVar3.mo6258i(i))) != null && mo7380O(view)) {
                C2144d0 d0Var = aVar.get(m);
                C2144d0 d0Var2 = aVar2.get(view);
                if (!(d0Var == null || d0Var2 == null)) {
                    this.f6455J.add(d0Var);
                    this.f6456K.add(d0Var2);
                    aVar.remove(m);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: U */
    private void m9356U(C2152e0 e0Var, C2152e0 e0Var2) {
        C1788a aVar = new C1788a((C1801g) e0Var.f6323a);
        C1788a aVar2 = new C1788a((C1801g) e0Var2.f6323a);
        int i = 0;
        while (true) {
            int[] iArr = this.f6454I;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m9353R(aVar, aVar2);
                } else if (i2 == 2) {
                    m9355T(aVar, aVar2, e0Var.f6326d, e0Var2.f6326d);
                } else if (i2 == 3) {
                    m9352Q(aVar, aVar2, e0Var.f6324b, e0Var2.f6324b);
                } else if (i2 == 4) {
                    m9354S(aVar, aVar2, e0Var.f6325c, e0Var2.f6325c);
                }
                i++;
            } else {
                m9358e(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: c0 */
    private void m9357c0(Animator animator, C1788a<Animator, C2218d> aVar) {
        if (animator != null) {
            animator.addListener(new C2216b(aVar));
            mo7383g(animator);
        }
    }

    /* renamed from: e */
    private void m9358e(C1788a<View, C2144d0> aVar, C1788a<View, C2144d0> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C2144d0 m = aVar.mo6263m(i);
            if (mo7380O(m.f6291b)) {
                this.f6455J.add(m);
                this.f6456K.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C2144d0 m2 = aVar2.mo6263m(i2);
            if (mo7380O(m2.f6291b)) {
                this.f6456K.add(m2);
                this.f6455J.add((Object) null);
            }
        }
    }

    /* renamed from: f */
    private static void m9359f(C2152e0 e0Var, View view, C2144d0 d0Var) {
        e0Var.f6323a.put(view, d0Var);
        int id = view.getId();
        if (id >= 0) {
            if (e0Var.f6324b.indexOfKey(id) >= 0) {
                e0Var.f6324b.put(id, (Object) null);
            } else {
                e0Var.f6324b.put(id, view);
            }
        }
        String H = C1988t.m8347H(view);
        if (H != null) {
            if (e0Var.f6326d.containsKey(H)) {
                e0Var.f6326d.put(H, null);
            } else {
                e0Var.f6326d.put(H, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (e0Var.f6325c.mo6167k(itemIdAtPosition) >= 0) {
                    View i = e0Var.f6325c.mo6165i(itemIdAtPosition);
                    if (i != null) {
                        C1988t.m8412v0(i, false);
                        e0Var.f6325c.mo6169m(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C1988t.m8412v0(view, true);
                e0Var.f6325c.mo6169m(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: j */
    private void m9360j(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f6477y;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f6478z;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f6446A;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f6446A.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C2144d0 d0Var = new C2144d0(view);
                        if (z) {
                            mo7191l(d0Var);
                        } else {
                            mo7187i(d0Var);
                        }
                        d0Var.f6292c.add(this);
                        mo7189k(d0Var);
                        m9359f(z ? this.f6451F : this.f6452G, view, d0Var);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f6448C;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f6449D;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f6450E;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f6450E.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m9360j(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: B */
    public C2125a0 mo7373B() {
        return this.f6465T;
    }

    /* renamed from: D */
    public long mo7374D() {
        return this.f6470r;
    }

    /* renamed from: F */
    public List<Integer> mo7375F() {
        return this.f6473u;
    }

    /* renamed from: G */
    public List<String> mo7376G() {
        return this.f6475w;
    }

    /* renamed from: H */
    public List<Class<?>> mo7377H() {
        return this.f6476x;
    }

    /* renamed from: J */
    public List<View> mo7378J() {
        return this.f6474v;
    }

    /* renamed from: K */
    public String[] mo7209K() {
        return null;
    }

    /* renamed from: M */
    public C2144d0 mo7379M(View view, boolean z) {
        C2127b0 b0Var = this.f6453H;
        if (b0Var != null) {
            return b0Var.mo7379M(view, z);
        }
        return (z ? this.f6451F : this.f6452G).f6323a.get(view);
    }

    /* renamed from: N */
    public boolean mo7359N(C2144d0 d0Var, C2144d0 d0Var2) {
        if (d0Var == null || d0Var2 == null) {
            return false;
        }
        String[] K = mo7209K();
        if (K != null) {
            int length = K.length;
            int i = 0;
            while (i < length) {
                if (!m9351P(d0Var, d0Var2, K[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String P : d0Var.f6290a.keySet()) {
            if (m9351P(d0Var, d0Var2, P)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean mo7380O(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f6477y;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f6478z;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f6446A;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f6446A.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f6447B != null && C1988t.m8347H(view) != null && this.f6447B.contains(C1988t.m8347H(view))) {
            return false;
        }
        if ((this.f6473u.size() == 0 && this.f6474v.size() == 0 && (((arrayList = this.f6476x) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6475w) == null || arrayList2.isEmpty()))) || this.f6473u.contains(Integer.valueOf(id)) || this.f6474v.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f6475w;
        if (arrayList6 != null && arrayList6.contains(C1988t.m8347H(view))) {
            return true;
        }
        if (this.f6476x != null) {
            for (int i2 = 0; i2 < this.f6476x.size(); i2++) {
                if (this.f6476x.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: V */
    public void mo7176V(View view) {
        if (!this.f6462Q) {
            C1788a<Animator, C2218d> C = m9350C();
            int size = C.size();
            C2227z0 d = C2183o0.m9256d(view);
            for (int i = size - 1; i >= 0; i--) {
                C2218d m = C.mo6263m(i);
                if (m.f6482a != null && d.equals(m.f6485d)) {
                    C2123a.m9064b(C.mo6258i(i));
                }
            }
            ArrayList<C2220f> arrayList = this.f6463R;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6463R.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C2220f) arrayList2.get(i2)).mo7238b(this);
                }
            }
            this.f6461P = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo7381Y(ViewGroup viewGroup) {
        C2218d dVar;
        this.f6455J = new ArrayList<>();
        this.f6456K = new ArrayList<>();
        m9356U(this.f6451F, this.f6452G);
        C1788a<Animator, C2218d> C = m9350C();
        int size = C.size();
        C2227z0 d = C2183o0.m9256d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator i2 = C.mo6258i(i);
            if (!(i2 == null || (dVar = C.get(i2)) == null || dVar.f6482a == null || !d.equals(dVar.f6485d))) {
                C2144d0 d0Var = dVar.f6484c;
                View view = dVar.f6482a;
                C2144d0 M = mo7379M(view, true);
                C2144d0 x = mo7393x(view, true);
                if (M == null && x == null) {
                    x = this.f6452G.f6323a.get(view);
                }
                if (!(M == null && x == null) && dVar.f6486e.mo7359N(d0Var, x)) {
                    if (i2.isRunning() || i2.isStarted()) {
                        i2.cancel();
                    } else {
                        C.remove(i2);
                    }
                }
            }
        }
        mo7198r(viewGroup, this.f6451F, this.f6452G, this.f6455J, this.f6456K);
        mo7183d0();
    }

    /* renamed from: Z */
    public C2214x mo7177Z(C2220f fVar) {
        ArrayList<C2220f> arrayList = this.f6463R;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f6463R.size() == 0) {
            this.f6463R = null;
        }
        return this;
    }

    /* renamed from: a0 */
    public C2214x mo7178a0(View view) {
        this.f6474v.remove(view);
        return this;
    }

    /* renamed from: b0 */
    public void mo7179b0(View view) {
        if (this.f6461P) {
            if (!this.f6462Q) {
                C1788a<Animator, C2218d> C = m9350C();
                int size = C.size();
                C2227z0 d = C2183o0.m9256d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C2218d m = C.mo6263m(i);
                    if (m.f6482a != null && d.equals(m.f6485d)) {
                        C2123a.m9065c(C.mo6258i(i));
                    }
                }
                ArrayList<C2220f> arrayList = this.f6463R;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f6463R.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C2220f) arrayList2.get(i2)).mo7240e(this);
                    }
                }
            }
            this.f6461P = false;
        }
    }

    /* renamed from: c */
    public C2214x mo7180c(C2220f fVar) {
        if (this.f6463R == null) {
            this.f6463R = new ArrayList<>();
        }
        this.f6463R.add(fVar);
        return this;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f6459N.size() - 1; size >= 0; size--) {
            this.f6459N.get(size).cancel();
        }
        ArrayList<C2220f> arrayList = this.f6463R;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f6463R.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C2220f) arrayList2.get(i)).mo7239d(this);
            }
        }
    }

    /* renamed from: d */
    public C2214x mo7182d(View view) {
        this.f6474v.add(view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo7183d0() {
        mo7385m0();
        C1788a<Animator, C2218d> C = m9350C();
        Iterator<Animator> it = this.f6464S.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (C.containsKey(next)) {
                mo7385m0();
                m9357c0(next, C);
            }
        }
        this.f6464S.clear();
        mo7387s();
    }

    /* renamed from: f0 */
    public C2214x mo7184f0(long j) {
        this.f6471s = j;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7383g(Animator animator) {
        if (animator == null) {
            mo7387s();
            return;
        }
        if (mo7388t() >= 0) {
            animator.setDuration(mo7388t());
        }
        if (mo7374D() >= 0) {
            animator.setStartDelay(mo7374D() + animator.getStartDelay());
        }
        if (mo7392w() != null) {
            animator.setInterpolator(mo7392w());
        }
        animator.addListener(new C2217c());
        animator.start();
    }

    /* renamed from: g0 */
    public void mo7185g0(C2219e eVar) {
        this.f6466U = eVar;
    }

    /* renamed from: h0 */
    public C2214x mo7186h0(TimeInterpolator timeInterpolator) {
        this.f6472t = timeInterpolator;
        return this;
    }

    /* renamed from: i */
    public abstract void mo7187i(C2144d0 d0Var);

    /* renamed from: j0 */
    public void mo7188j0(C2186p pVar) {
        if (pVar == null) {
            pVar = f6444o;
        }
        this.f6468W = pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo7189k(C2144d0 d0Var) {
        String[] b;
        if (this.f6465T != null && !d0Var.f6290a.isEmpty() && (b = this.f6465T.mo7174b()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= b.length) {
                    z = true;
                    break;
                } else if (!d0Var.f6290a.containsKey(b[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f6465T.mo7173a(d0Var);
            }
        }
    }

    /* renamed from: k0 */
    public void mo7190k0(C2125a0 a0Var) {
        this.f6465T = a0Var;
    }

    /* renamed from: l */
    public abstract void mo7191l(C2144d0 d0Var);

    /* renamed from: l0 */
    public C2214x mo7192l0(long j) {
        this.f6470r = j;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo7384m(ViewGroup viewGroup, boolean z) {
        C1788a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo7386n(z);
        if ((this.f6473u.size() > 0 || this.f6474v.size() > 0) && (((arrayList = this.f6475w) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6476x) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f6473u.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f6473u.get(i).intValue());
                if (findViewById != null) {
                    C2144d0 d0Var = new C2144d0(findViewById);
                    if (z) {
                        mo7191l(d0Var);
                    } else {
                        mo7187i(d0Var);
                    }
                    d0Var.f6292c.add(this);
                    mo7189k(d0Var);
                    m9359f(z ? this.f6451F : this.f6452G, findViewById, d0Var);
                }
            }
            for (int i2 = 0; i2 < this.f6474v.size(); i2++) {
                View view = this.f6474v.get(i2);
                C2144d0 d0Var2 = new C2144d0(view);
                if (z) {
                    mo7191l(d0Var2);
                } else {
                    mo7187i(d0Var2);
                }
                d0Var2.f6292c.add(this);
                mo7189k(d0Var2);
                m9359f(z ? this.f6451F : this.f6452G, view, d0Var2);
            }
        } else {
            m9360j(viewGroup, z);
        }
        if (!z && (aVar = this.f6467V) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f6451F.f6326d.remove(this.f6467V.mo6258i(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f6451F.f6326d.put(this.f6467V.mo6263m(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public void mo7385m0() {
        if (this.f6460O == 0) {
            ArrayList<C2220f> arrayList = this.f6463R;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6463R.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C2220f) arrayList2.get(i)).mo7208a(this);
                }
            }
            this.f6462Q = false;
        }
        this.f6460O++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo7386n(boolean z) {
        C2152e0 e0Var;
        if (z) {
            this.f6451F.f6323a.clear();
            this.f6451F.f6324b.clear();
            e0Var = this.f6451F;
        } else {
            this.f6452G.f6323a.clear();
            this.f6452G.f6324b.clear();
            e0Var = this.f6452G;
        }
        e0Var.f6325c.mo6162d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public String mo7193n0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f6471s != -1) {
            str2 = str2 + "dur(" + this.f6471s + ") ";
        }
        if (this.f6470r != -1) {
            str2 = str2 + "dly(" + this.f6470r + ") ";
        }
        if (this.f6472t != null) {
            str2 = str2 + "interp(" + this.f6472t + ") ";
        }
        if (this.f6473u.size() <= 0 && this.f6474v.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f6473u.size() > 0) {
            for (int i = 0; i < this.f6473u.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6473u.get(i);
            }
        }
        if (this.f6474v.size() > 0) {
            for (int i2 = 0; i2 < this.f6474v.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6474v.get(i2);
            }
        }
        return str3 + ")";
    }

    /* renamed from: p */
    public C2214x clone() {
        try {
            C2214x xVar = (C2214x) super.clone();
            xVar.f6464S = new ArrayList<>();
            xVar.f6451F = new C2152e0();
            xVar.f6452G = new C2152e0();
            xVar.f6455J = null;
            xVar.f6456K = null;
            return xVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: q */
    public Animator mo7210q(ViewGroup viewGroup, C2144d0 d0Var, C2144d0 d0Var2) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo7198r(ViewGroup viewGroup, C2152e0 e0Var, C2152e0 e0Var2, ArrayList<C2144d0> arrayList, ArrayList<C2144d0> arrayList2) {
        int i;
        int i2;
        Animator q;
        View view;
        Animator animator;
        C2144d0 d0Var;
        C2144d0 d0Var2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C1788a<Animator, C2218d> C = m9350C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C2144d0 d0Var3 = arrayList.get(i3);
            C2144d0 d0Var4 = arrayList2.get(i3);
            if (d0Var3 != null && !d0Var3.f6292c.contains(this)) {
                d0Var3 = null;
            }
            if (d0Var4 != null && !d0Var4.f6292c.contains(this)) {
                d0Var4 = null;
            }
            if (!(d0Var3 == null && d0Var4 == null)) {
                if ((d0Var3 == null || d0Var4 == null || mo7359N(d0Var3, d0Var4)) && (q = mo7210q(viewGroup2, d0Var3, d0Var4)) != null) {
                    if (d0Var4 != null) {
                        view = d0Var4.f6291b;
                        String[] K = mo7209K();
                        if (K != null && K.length > 0) {
                            d0Var2 = new C2144d0(view);
                            Animator animator3 = q;
                            i2 = size;
                            C2144d0 d0Var5 = e0Var2.f6323a.get(view);
                            if (d0Var5 != null) {
                                int i4 = 0;
                                while (i4 < K.length) {
                                    d0Var2.f6290a.put(K[i4], d0Var5.f6290a.get(K[i4]));
                                    i4++;
                                    ArrayList<C2144d0> arrayList3 = arrayList2;
                                    i3 = i3;
                                    d0Var5 = d0Var5;
                                }
                            }
                            i = i3;
                            int size2 = C.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C2218d dVar = C.get(C.mo6258i(i5));
                                if (dVar.f6484c != null && dVar.f6482a == view && dVar.f6483b.equals(mo7394y()) && dVar.f6484c.equals(d0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = q;
                            d0Var2 = null;
                        }
                        animator = animator2;
                        d0Var = d0Var2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = d0Var3.f6291b;
                        animator = q;
                        d0Var = null;
                    }
                    if (animator != null) {
                        C2125a0 a0Var = this.f6465T;
                        if (a0Var != null) {
                            long c = a0Var.mo7175c(viewGroup2, this, d0Var3, d0Var4);
                            sparseIntArray.put(this.f6464S.size(), (int) c);
                            j = Math.min(c, j);
                        }
                        C.put(animator, new C2218d(view, mo7394y(), this, C2183o0.m9256d(viewGroup), d0Var));
                        this.f6464S.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f6464S.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo7387s() {
        int i = this.f6460O - 1;
        this.f6460O = i;
        if (i == 0) {
            ArrayList<C2220f> arrayList = this.f6463R;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6463R.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C2220f) arrayList2.get(i2)).mo7207c(this);
                }
            }
            for (int i3 = 0; i3 < this.f6451F.f6325c.mo6172q(); i3++) {
                View r = this.f6451F.f6325c.mo6173r(i3);
                if (r != null) {
                    C1988t.m8412v0(r, false);
                }
            }
            for (int i4 = 0; i4 < this.f6452G.f6325c.mo6172q(); i4++) {
                View r2 = this.f6452G.f6325c.mo6173r(i4);
                if (r2 != null) {
                    C1988t.m8412v0(r2, false);
                }
            }
            this.f6462Q = true;
        }
    }

    /* renamed from: t */
    public long mo7388t() {
        return this.f6471s;
    }

    public String toString() {
        return mo7193n0(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: u */
    public Rect mo7390u() {
        C2219e eVar = this.f6466U;
        if (eVar == null) {
            return null;
        }
        return eVar.mo7275a(this);
    }

    /* renamed from: v */
    public C2219e mo7391v() {
        return this.f6466U;
    }

    /* renamed from: w */
    public TimeInterpolator mo7392w() {
        return this.f6472t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C2144d0 mo7393x(View view, boolean z) {
        C2127b0 b0Var = this.f6453H;
        if (b0Var != null) {
            return b0Var.mo7393x(view, z);
        }
        ArrayList<C2144d0> arrayList = z ? this.f6455J : this.f6456K;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C2144d0 d0Var = arrayList.get(i2);
            if (d0Var == null) {
                return null;
            }
            if (d0Var.f6291b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f6456K : this.f6455J).get(i);
    }

    /* renamed from: y */
    public String mo7394y() {
        return this.f6469q;
    }

    /* renamed from: z */
    public C2186p mo7395z() {
        return this.f6468W;
    }
}
