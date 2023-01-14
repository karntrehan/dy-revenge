package androidx.camera.core.p009e3;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0629c3;
import androidx.camera.core.C0693h2;
import androidx.camera.core.C0930k1;
import androidx.camera.core.C0938m1;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0957q1;
import androidx.camera.core.C0967s2;
import androidx.camera.core.C1011z2;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0848n0;
import androidx.camera.core.impl.C0861q0;
import androidx.camera.core.impl.C0868r0;
import androidx.camera.core.impl.C0875s0;
import androidx.camera.core.impl.C0888u0;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.C0915y2;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.core.e3.e */
public final class C0649e implements C0930k1 {

    /* renamed from: f */
    private C0899w0 f2099f;

    /* renamed from: o */
    private final LinkedHashSet<C0899w0> f2100o;

    /* renamed from: p */
    private final C0875s0 f2101p;

    /* renamed from: q */
    private final C0915y2 f2102q;

    /* renamed from: r */
    private final C0651b f2103r;

    /* renamed from: s */
    private final List<C0608a3> f2104s = new ArrayList();

    /* renamed from: t */
    private C0629c3 f2105t;

    /* renamed from: u */
    private C0848n0 f2106u = C0861q0.m3400a();

    /* renamed from: v */
    private final Object f2107v = new Object();

    /* renamed from: w */
    private boolean f2108w = true;

    /* renamed from: x */
    private C0809g1 f2109x = null;

    /* renamed from: y */
    private List<C0608a3> f2110y = new ArrayList();

    /* renamed from: androidx.camera.core.e3.e$a */
    public static final class C0650a extends Exception {
        public C0650a(String str) {
            super(str);
        }
    }

    /* renamed from: androidx.camera.core.e3.e$b */
    public static final class C0651b {

        /* renamed from: a */
        private final List<String> f2111a = new ArrayList();

        C0651b(LinkedHashSet<C0899w0> linkedHashSet) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f2111a.add(((C0899w0) it.next()).mo2400m().mo2453a());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0651b) {
                return this.f2111a.equals(((C0651b) obj).f2111a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2111a.hashCode() * 53;
        }
    }

    /* renamed from: androidx.camera.core.e3.e$c */
    private static class C0652c {

        /* renamed from: a */
        C0908x2<?> f2112a;

        /* renamed from: b */
        C0908x2<?> f2113b;

        C0652c(C0908x2<?> x2Var, C0908x2<?> x2Var2) {
            this.f2112a = x2Var;
            this.f2113b = x2Var2;
        }
    }

    public C0649e(LinkedHashSet<C0899w0> linkedHashSet, C0875s0 s0Var, C0915y2 y2Var) {
        this.f2099f = (C0899w0) linkedHashSet.iterator().next();
        LinkedHashSet<C0899w0> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f2100o = linkedHashSet2;
        this.f2103r = new C0651b(linkedHashSet2);
        this.f2101p = s0Var;
        this.f2102q = y2Var;
    }

    /* renamed from: A */
    private boolean m2731A(C0608a3 a3Var) {
        return a3Var instanceof C0693h2;
    }

    /* renamed from: B */
    private boolean m2732B(C0608a3 a3Var) {
        return a3Var instanceof C0967s2;
    }

    /* renamed from: C */
    static /* synthetic */ void m2733C(Surface surface, SurfaceTexture surfaceTexture, C1011z2.C1017f fVar) {
        surface.release();
        surfaceTexture.release();
    }

    /* renamed from: D */
    static /* synthetic */ void m2734D(C1011z2 z2Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(z2Var.mo3295d().getWidth(), z2Var.mo3295d().getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        z2Var.mo3298o(surface, C0744a.m3044a(), new C0646b(surface, surfaceTexture));
    }

    /* renamed from: F */
    private void m2735F() {
        synchronized (this.f2107v) {
            if (this.f2109x != null) {
                this.f2099f.mo2395i().mo2322b(this.f2109x);
            }
        }
    }

    /* renamed from: H */
    private void m2736H(Map<C0608a3, Size> map, Collection<C0608a3> collection) {
        synchronized (this.f2107v) {
            if (this.f2105t != null) {
                Map<C0608a3, Rect> a = C0661n.m2771a(this.f2099f.mo2395i().mo2326d(), this.f2099f.mo2400m().mo2455c().intValue() == 0, this.f2105t.mo2626a(), this.f2099f.mo2400m().mo2457e(this.f2105t.mo2628c()), this.f2105t.mo2629d(), this.f2105t.mo2627b(), map);
                for (C0608a3 next : collection) {
                    next.mo2564H((Rect) C1177h.m4583e(a.get(next)));
                    next.mo2562F(m2739n(this.f2099f.mo2395i().mo2326d(), map.get(next)));
                }
            }
        }
    }

    /* renamed from: f */
    private void m2737f() {
        synchronized (this.f2107v) {
            C0868r0 i = this.f2099f.mo2395i();
            this.f2109x = i.mo2332g();
            i.mo2334h();
        }
    }

    /* renamed from: h */
    private List<C0608a3> m2738h(List<C0608a3> list, List<C0608a3> list2) {
        ArrayList arrayList = new ArrayList(list2);
        boolean z = m2748z(list);
        boolean y = m2747y(list);
        C0608a3 a3Var = null;
        C0608a3 a3Var2 = null;
        for (C0608a3 next : list2) {
            if (m2732B(next)) {
                a3Var = next;
            } else if (m2731A(next)) {
                a3Var2 = next;
            }
        }
        if (z && a3Var == null) {
            arrayList.add(m2742q());
        } else if (!z && a3Var != null) {
            arrayList.remove(a3Var);
        }
        if (y && a3Var2 == null) {
            arrayList.add(m2741p());
        } else if (!y && a3Var2 != null) {
            arrayList.remove(a3Var2);
        }
        return arrayList;
    }

    /* renamed from: n */
    private static Matrix m2739n(Rect rect, Size size) {
        C1177h.m4580b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* renamed from: o */
    private Map<C0608a3, Size> m2740o(C0888u0 u0Var, List<C0608a3> list, List<C0608a3> list2, Map<C0608a3, C0652c> map) {
        ArrayList arrayList = new ArrayList();
        String a = u0Var.mo2453a();
        HashMap hashMap = new HashMap();
        for (C0608a3 next : list2) {
            arrayList.add(this.f2101p.mo1962a(a, next.mo2573h(), next.mo2567b()));
            hashMap.put(next, next.mo2567b());
        }
        if (!list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (C0608a3 next2 : list) {
                C0652c cVar = map.get(next2);
                hashMap2.put(next2.mo2581p(u0Var, cVar.f2112a, cVar.f2113b), next2);
            }
            Map<C0908x2<?>, Size> b = this.f2101p.mo1963b(a, arrayList, new ArrayList(hashMap2.keySet()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((C0608a3) entry.getValue(), b.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    /* renamed from: p */
    private C0693h2 m2741p() {
        return new C0693h2.C0698e().mo2772p("ImageCapture-Extra").mo2762e();
    }

    /* renamed from: q */
    private C0967s2 m2742q() {
        C0967s2 e = new C0967s2.C0969b().mo3235n("Preview-Extra").mo3227e();
        e.mo3223S(C0645a.f2091a);
        return e;
    }

    /* renamed from: r */
    private void m2743r(List<C0608a3> list) {
        synchronized (this.f2107v) {
            if (!list.isEmpty()) {
                this.f2099f.mo2399l(list);
                for (C0608a3 next : list) {
                    if (this.f2104s.contains(next)) {
                        next.mo2590y(this.f2099f);
                    } else {
                        C0949o2.m3690c("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + next);
                    }
                }
                this.f2104s.removeAll(list);
            }
        }
    }

    /* renamed from: t */
    public static C0651b m2744t(LinkedHashSet<C0899w0> linkedHashSet) {
        return new C0651b(linkedHashSet);
    }

    /* renamed from: v */
    private Map<C0608a3, C0652c> m2745v(List<C0608a3> list, C0915y2 y2Var, C0915y2 y2Var2) {
        HashMap hashMap = new HashMap();
        for (C0608a3 next : list) {
            hashMap.put(next, new C0652c(next.mo2572g(false, y2Var), next.mo2572g(true, y2Var2)));
        }
        return hashMap;
    }

    /* renamed from: x */
    private boolean m2746x() {
        boolean z;
        synchronized (this.f2107v) {
            z = true;
            if (this.f2106u.mo3060u() != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: y */
    private boolean m2747y(List<C0608a3> list) {
        boolean z = false;
        boolean z2 = false;
        for (C0608a3 next : list) {
            if (m2732B(next)) {
                z = true;
            } else if (m2731A(next)) {
                z2 = true;
            }
        }
        return z && !z2;
    }

    /* renamed from: z */
    private boolean m2748z(List<C0608a3> list) {
        boolean z = false;
        boolean z2 = false;
        for (C0608a3 next : list) {
            if (m2732B(next)) {
                z2 = true;
            } else if (m2731A(next)) {
                z = true;
            }
        }
        return z && !z2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2696E(java.util.Collection<androidx.camera.core.C0608a3> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2107v
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0028 }
            r1.<init>(r3)     // Catch:{ all -> 0x0028 }
            r2.m2743r(r1)     // Catch:{ all -> 0x0028 }
            boolean r1 = r2.m2746x()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026
            java.util.List<androidx.camera.core.a3> r1 = r2.f2110y     // Catch:{ all -> 0x0028 }
            r1.removeAll(r3)     // Catch:{ all -> 0x0028 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ a -> 0x001e }
            r2.mo2698b(r3)     // Catch:{ a -> 0x001e }
            goto L_0x0026
        L_0x001e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "Failed to add extra fake Preview or ImageCapture use case!"
            r3.<init>(r1)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p009e3.C0649e.mo2696E(java.util.Collection):void");
    }

    /* renamed from: G */
    public void mo2697G(C0629c3 c3Var) {
        synchronized (this.f2107v) {
            this.f2105t = c3Var;
        }
    }

    /* renamed from: a */
    public C0957q1 mo2380a() {
        return this.f2099f.mo2400m();
    }

    /* renamed from: b */
    public void mo2698b(Collection<C0608a3> collection) {
        synchronized (this.f2107v) {
            ArrayList<C0608a3> arrayList = new ArrayList<>();
            for (C0608a3 next : collection) {
                if (this.f2104s.contains(next)) {
                    C0949o2.m3688a("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(this.f2104s);
            List<C0608a3> emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            if (m2746x()) {
                arrayList2.removeAll(this.f2110y);
                arrayList2.addAll(arrayList);
                emptyList = m2738h(arrayList2, new ArrayList(this.f2110y));
                ArrayList arrayList3 = new ArrayList(emptyList);
                arrayList3.removeAll(this.f2110y);
                arrayList.addAll(arrayList3);
                emptyList2 = new ArrayList(this.f2110y);
                emptyList2.removeAll(emptyList);
            }
            Map<C0608a3, C0652c> v = m2745v(arrayList, this.f2106u.mo3059g(), this.f2102q);
            try {
                ArrayList arrayList4 = new ArrayList(this.f2104s);
                arrayList4.removeAll(emptyList2);
                Map<C0608a3, Size> o = m2740o(this.f2099f.mo2400m(), arrayList, arrayList4, v);
                m2736H(o, collection);
                this.f2110y = emptyList;
                m2743r(emptyList2);
                for (C0608a3 a3Var : arrayList) {
                    C0652c cVar = v.get(a3Var);
                    a3Var.mo2587v(this.f2099f, cVar.f2112a, cVar.f2113b);
                    a3Var.mo2566J((Size) C1177h.m4583e(o.get(a3Var)));
                }
                this.f2104s.addAll(arrayList);
                if (this.f2108w) {
                    this.f2099f.mo2398k(arrayList);
                }
                for (C0608a3 t : arrayList) {
                    t.mo2585t();
                }
            } catch (IllegalArgumentException e) {
                throw new C0650a(e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public C0938m1 mo2384c() {
        return this.f2099f.mo2395i();
    }

    /* renamed from: d */
    public void mo2699d() {
        synchronized (this.f2107v) {
            if (!this.f2108w) {
                this.f2099f.mo2398k(this.f2104s);
                m2735F();
                for (C0608a3 t : this.f2104s) {
                    t.mo2585t();
                }
                this.f2108w = true;
            }
        }
    }

    /* renamed from: e */
    public void mo2700e(C0848n0 n0Var) {
        synchronized (this.f2107v) {
            if (n0Var == null) {
                n0Var = C0861q0.m3400a();
            }
            if (!this.f2104s.isEmpty()) {
                if (!this.f2106u.mo3061z().equals(n0Var.mo3061z())) {
                    throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
                }
            }
            this.f2106u = n0Var;
            this.f2099f.mo2387e(n0Var);
        }
    }

    /* renamed from: j */
    public void mo2701j(boolean z) {
        this.f2099f.mo2397j(z);
    }

    /* renamed from: s */
    public void mo2702s() {
        synchronized (this.f2107v) {
            if (this.f2108w) {
                this.f2099f.mo2399l(new ArrayList(this.f2104s));
                m2737f();
                this.f2108w = false;
            }
        }
    }

    /* renamed from: u */
    public C0651b mo2703u() {
        return this.f2103r;
    }

    /* renamed from: w */
    public List<C0608a3> mo2704w() {
        ArrayList arrayList;
        synchronized (this.f2107v) {
            arrayList = new ArrayList(this.f2104s);
        }
        return arrayList;
    }
}
