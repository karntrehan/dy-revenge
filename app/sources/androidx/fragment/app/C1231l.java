package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0043b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.util.C1172c;
import androidx.fragment.app.C1216d;
import androidx.fragment.app.C1254t;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1311s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p027c.p060f.C1790b;
import p027c.p064i.p069g.C1849b;
import p027c.p086o.C2061b;

/* renamed from: androidx.fragment.app.l */
public abstract class C1231l {

    /* renamed from: a */
    private static boolean f3501a = false;

    /* renamed from: A */
    private ArrayList<C1211a> f3502A;

    /* renamed from: B */
    private ArrayList<Boolean> f3503B;

    /* renamed from: C */
    private ArrayList<Fragment> f3504C;

    /* renamed from: D */
    private ArrayList<C1241j> f3505D;

    /* renamed from: E */
    private C1245o f3506E;

    /* renamed from: F */
    private Runnable f3507F = new C1235d();

    /* renamed from: b */
    private final ArrayList<C1239h> f3508b = new ArrayList<>();

    /* renamed from: c */
    private boolean f3509c;

    /* renamed from: d */
    private final C1251r f3510d = new C1251r();

    /* renamed from: e */
    ArrayList<C1211a> f3511e;

    /* renamed from: f */
    private ArrayList<Fragment> f3512f;

    /* renamed from: g */
    private final C1228j f3513g = new C1228j(this);

    /* renamed from: h */
    private OnBackPressedDispatcher f3514h;

    /* renamed from: i */
    private final C0043b f3515i = new C1232a(false);

    /* renamed from: j */
    private final AtomicInteger f3516j = new AtomicInteger();

    /* renamed from: k */
    private ArrayList<C1238g> f3517k;

    /* renamed from: l */
    private ConcurrentHashMap<Fragment, HashSet<C1849b>> f3518l = new ConcurrentHashMap<>();

    /* renamed from: m */
    private final C1254t.C1261g f3519m = new C1233b();

    /* renamed from: n */
    private final C1229k f3520n = new C1229k(this);

    /* renamed from: o */
    int f3521o = -1;

    /* renamed from: p */
    C1227i<?> f3522p;

    /* renamed from: q */
    C1223e f3523q;

    /* renamed from: r */
    private Fragment f3524r;

    /* renamed from: s */
    Fragment f3525s;

    /* renamed from: t */
    private C1226h f3526t = null;

    /* renamed from: u */
    private C1226h f3527u = new C1234c();

    /* renamed from: v */
    private boolean f3528v;

    /* renamed from: w */
    private boolean f3529w;

    /* renamed from: x */
    private boolean f3530x;

    /* renamed from: y */
    private boolean f3531y;

    /* renamed from: z */
    private boolean f3532z;

    /* renamed from: androidx.fragment.app.l$a */
    class C1232a extends C0043b {
        C1232a(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo144b() {
            C1231l.this.mo4151p0();
        }
    }

    /* renamed from: androidx.fragment.app.l$b */
    class C1233b implements C1254t.C1261g {
        C1233b() {
        }

        /* renamed from: a */
        public void mo4169a(Fragment fragment, C1849b bVar) {
            if (!bVar.mo6350b()) {
                C1231l.this.mo4114L0(fragment, bVar);
            }
        }

        /* renamed from: b */
        public void mo4170b(Fragment fragment, C1849b bVar) {
            C1231l.this.mo4134c(fragment, bVar);
        }
    }

    /* renamed from: androidx.fragment.app.l$c */
    class C1234c extends C1226h {
        C1234c() {
        }

        /* renamed from: a */
        public Fragment mo4076a(ClassLoader classLoader, String str) {
            C1227i<?> iVar = C1231l.this.f3522p;
            return iVar.mo4035a(iVar.mo4078f(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.l$d */
    class C1235d implements Runnable {
        C1235d() {
        }

        public void run() {
            C1231l.this.mo4119Q(true);
        }
    }

    /* renamed from: androidx.fragment.app.l$e */
    class C1236e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3537a;

        /* renamed from: b */
        final /* synthetic */ View f3538b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3539c;

        C1236e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3537a = viewGroup;
            this.f3538b = view;
            this.f3539c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3537a.endViewTransition(this.f3538b);
            animator.removeListener(this);
            Fragment fragment = this.f3539c;
            View view = fragment.f3377U;
            if (view != null && fragment.f3369M) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$f */
    public static abstract class C1237f {
    }

    /* renamed from: androidx.fragment.app.l$g */
    public interface C1238g {
        /* renamed from: a */
        void mo4173a();
    }

    /* renamed from: androidx.fragment.app.l$h */
    interface C1239h {
        /* renamed from: a */
        boolean mo3970a(ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.l$i */
    private class C1240i implements C1239h {

        /* renamed from: a */
        final String f3541a;

        /* renamed from: b */
        final int f3542b;

        /* renamed from: c */
        final int f3543c;

        C1240i(String str, int i, int i2) {
            this.f3541a = str;
            this.f3542b = i;
            this.f3543c = i2;
        }

        /* renamed from: a */
        public boolean mo3970a(ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C1231l.this.f3525s;
            if (fragment != null && this.f3542b < 0 && this.f3541a == null && fragment.mo3927r().mo4110H0()) {
                return false;
            }
            return C1231l.this.mo4112J0(arrayList, arrayList2, this.f3541a, this.f3542b, this.f3543c);
        }
    }

    /* renamed from: androidx.fragment.app.l$j */
    static class C1241j implements Fragment.C1208f {

        /* renamed from: a */
        final boolean f3545a;

        /* renamed from: b */
        final C1211a f3546b;

        /* renamed from: c */
        private int f3547c;

        C1241j(C1211a aVar, boolean z) {
            this.f3545a = z;
            this.f3546b = aVar;
        }

        /* renamed from: a */
        public void mo3957a() {
            this.f3547c++;
        }

        /* renamed from: b */
        public void mo3958b() {
            int i = this.f3547c - 1;
            this.f3547c = i;
            if (i == 0) {
                this.f3546b.f3440t.mo4123T0();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4174c() {
            C1211a aVar = this.f3546b;
            aVar.f3440t.mo4149n(aVar, this.f3545a, false, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4175d() {
            boolean z = this.f3547c > 0;
            for (Fragment next : this.f3546b.f3440t.mo4143i0()) {
                next.mo3932s1((Fragment.C1208f) null);
                if (z && next.mo3875V()) {
                    next.mo3944v1();
                }
            }
            C1211a aVar = this.f3546b;
            aVar.f3440t.mo4149n(aVar, this.f3545a, !z, true);
        }

        /* renamed from: e */
        public boolean mo4176e() {
            return this.f3547c == 0;
        }
    }

    /* renamed from: C */
    private void m4984C(Fragment fragment) {
        if (fragment != null && fragment.equals(mo4127W(fragment.f3397s))) {
            fragment.mo3886a1();
        }
    }

    /* renamed from: I0 */
    private boolean m4985I0(String str, int i, int i2) {
        mo4119Q(false);
        m4991P(true);
        Fragment fragment = this.f3525s;
        if (fragment != null && i < 0 && str == null && fragment.mo3927r().mo4110H0()) {
            return true;
        }
        boolean J0 = mo4112J0(this.f3502A, this.f3503B, str, i, i2);
        if (J0) {
            this.f3509c = true;
            try {
                m4990N0(this.f3502A, this.f3503B);
            } finally {
                m5009m();
            }
        }
        m5001a1();
        m4988L();
        this.f3510d.mo4223b();
        return J0;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: J */
    private void m4986J(int i) {
        try {
            this.f3509c = true;
            this.f3510d.mo4225d(i);
            mo4099B0(i, false);
            this.f3509c = false;
            mo4119Q(true);
        } catch (Throwable th) {
            this.f3509c = false;
            throw th;
        }
    }

    /* renamed from: K0 */
    private int m4987K0(ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C1790b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C1211a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.mo3966E() && !aVar.mo3965C(arrayList, i4 + 1, i2)) {
                if (this.f3505D == null) {
                    this.f3505D = new ArrayList<>();
                }
                C1241j jVar = new C1241j(aVar, booleanValue);
                this.f3505D.add(jVar);
                aVar.mo3968G(jVar);
                if (booleanValue) {
                    aVar.mo3982x();
                } else {
                    aVar.mo3983y(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m5000a(bVar);
            }
        }
        return i3;
    }

    /* renamed from: L */
    private void m4988L() {
        if (this.f3532z) {
            this.f3532z = false;
            m4999Z0();
        }
    }

    /* renamed from: N */
    private void m4989N() {
        if (!this.f3518l.isEmpty()) {
            for (Fragment next : this.f3518l.keySet()) {
                m5007j(next);
                mo4102D0(next, next.mo3855K());
            }
        }
    }

    /* renamed from: N0 */
    private void m4990N0(ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m4996V(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f3596r) {
                        if (i2 != i) {
                            m4995T(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3596r) {
                                i2++;
                            }
                        }
                        m4995T(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m4995T(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: P */
    private void m4991P(boolean z) {
        if (this.f3509c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3522p == null) {
            if (this.f3531y) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3522p.mo4079h().getLooper()) {
            if (!z) {
                m5008l();
            }
            if (this.f3502A == null) {
                this.f3502A = new ArrayList<>();
                this.f3503B = new ArrayList<>();
            }
            this.f3509c = true;
            try {
                m4996V((ArrayList<C1211a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f3509c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: P0 */
    private void m4992P0() {
        if (this.f3517k != null) {
            for (int i = 0; i < this.f3517k.size(); i++) {
                this.f3517k.get(i).mo4173a();
            }
        }
    }

    /* renamed from: R0 */
    static int m4993R0(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: S */
    private static void m4994S(ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C1211a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo3977t(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo3983y(z);
            } else {
                aVar.mo3977t(1);
                aVar.mo3982x();
            }
            i++;
        }
    }

    /* renamed from: T */
    private void m4995T(ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C1211a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = arrayList3.get(i4).f3596r;
        ArrayList<Fragment> arrayList5 = this.f3504C;
        if (arrayList5 == null) {
            this.f3504C = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f3504C.addAll(this.f3510d.mo4234m());
        Fragment m0 = mo4148m0();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C1211a aVar = arrayList3.get(i6);
            m0 = !arrayList4.get(i6).booleanValue() ? aVar.mo3984z(this.f3504C, m0) : aVar.mo3969H(this.f3504C, m0);
            z2 = z2 || aVar.f3587i;
        }
        this.f3504C.clear();
        if (!z) {
            C1254t.m5175B(this, arrayList, arrayList2, i, i2, false, this.f3519m);
        }
        m4994S(arrayList, arrayList2, i, i2);
        if (z) {
            C1790b bVar = new C1790b();
            m5000a(bVar);
            int K0 = m4987K0(arrayList, arrayList2, i, i2, bVar);
            m5016z0(bVar);
            i3 = K0;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C1254t.m5175B(this, arrayList, arrayList2, i, i3, true, this.f3519m);
            mo4099B0(this.f3521o, true);
        }
        while (i4 < i5) {
            C1211a aVar2 = arrayList3.get(i4);
            if (arrayList4.get(i4).booleanValue() && aVar2.f3442v >= 0) {
                aVar2.f3442v = -1;
            }
            aVar2.mo3967F();
            i4++;
        }
        if (z2) {
            m4992P0();
        }
    }

    /* renamed from: V */
    private void m4996V(ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C1241j> arrayList3 = this.f3505D;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C1241j jVar = this.f3505D.get(i);
            if (arrayList == null || jVar.f3545a || (indexOf2 = arrayList.indexOf(jVar.f3546b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (jVar.mo4176e() || (arrayList != null && jVar.f3546b.mo3965C(arrayList, 0, arrayList.size()))) {
                    this.f3505D.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || jVar.f3545a || (indexOf = arrayList.indexOf(jVar.f3546b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        jVar.mo4175d();
                    }
                }
                i++;
            } else {
                this.f3505D.remove(i);
                i--;
                size--;
            }
            jVar.mo4174c();
            i++;
        }
    }

    /* renamed from: X */
    public static <F extends Fragment> F m4997X(View view) {
        F b0 = m5002b0(view);
        if (b0 != null) {
            return b0;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    /* renamed from: X0 */
    private void m4998X0(Fragment fragment) {
        ViewGroup g0 = m5006g0(fragment);
        if (g0 != null) {
            int i = C2061b.visible_removing_fragment_view_tag;
            if (g0.getTag(i) == null) {
                g0.setTag(i, fragment);
            }
            ((Fragment) g0.getTag(i)).mo3926q1(fragment.mo3838A());
        }
    }

    /* renamed from: Z0 */
    private void m4999Z0() {
        for (Fragment next : this.f3510d.mo4232k()) {
            if (next != null) {
                mo4106F0(next);
            }
        }
    }

    /* renamed from: a */
    private void m5000a(C1790b<Fragment> bVar) {
        int i = this.f3521o;
        if (i >= 1) {
            int min = Math.min(i, 3);
            for (Fragment next : this.f3510d.mo4234m()) {
                if (next.f3393o < min) {
                    mo4102D0(next, min);
                    if (next.f3377U != null && !next.f3369M && next.f3382Z) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo4137e0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo4160u0(r3.f3524r) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo148f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3515i;
     */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5001a1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.l$h> r0 = r3.f3508b
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.l$h> r1 = r3.f3508b     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f3515i     // Catch:{ all -> 0x002a }
            r1.mo148f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f3515i
            int r1 = r3.mo4137e0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3524r
            boolean r1 = r3.mo4160u0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo148f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1231l.m5001a1():void");
    }

    /* renamed from: b0 */
    private static Fragment m5002b0(View view) {
        while (view != null) {
            Fragment n0 = m5010n0(view);
            if (n0 != null) {
                return n0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* renamed from: c0 */
    private void m5003c0() {
        if (this.f3505D != null) {
            while (!this.f3505D.isEmpty()) {
                this.f3505D.remove(0).mo4175d();
            }
        }
    }

    /* renamed from: d0 */
    private boolean m5004d0(ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3508b) {
            if (this.f3508b.isEmpty()) {
                return false;
            }
            int size = this.f3508b.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f3508b.get(i).mo3970a(arrayList, arrayList2);
            }
            this.f3508b.clear();
            this.f3522p.mo4079h().removeCallbacks(this.f3507F);
            return z;
        }
    }

    /* renamed from: f0 */
    private C1245o m5005f0(Fragment fragment) {
        return this.f3506E.mo4188h(fragment);
    }

    /* renamed from: g0 */
    private ViewGroup m5006g0(Fragment fragment) {
        if (fragment.f3367K > 0 && this.f3523q.mo3956d()) {
            View c = this.f3523q.mo3955c(fragment.f3367K);
            if (c instanceof ViewGroup) {
                return (ViewGroup) c;
            }
        }
        return null;
    }

    /* renamed from: j */
    private void m5007j(Fragment fragment) {
        HashSet hashSet = this.f3518l.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C1849b) it.next()).mo6349a();
            }
            hashSet.clear();
            m5012p(fragment);
            this.f3518l.remove(fragment);
        }
    }

    /* renamed from: l */
    private void m5008l() {
        if (mo4164w0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: m */
    private void m5009m() {
        this.f3509c = false;
        this.f3503B.clear();
        this.f3502A.clear();
    }

    /* renamed from: n0 */
    static Fragment m5010n0(View view) {
        Object tag = view.getTag(C2061b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: o */
    private void m5011o(Fragment fragment) {
        Animator animator;
        if (fragment.f3377U != null) {
            C1216d.C1221d b = C1216d.m4921b(this.f3522p.mo4078f(), this.f3523q, fragment, !fragment.f3369M);
            if (b == null || (animator = b.f3480b) == null) {
                if (b != null) {
                    fragment.f3377U.startAnimation(b.f3479a);
                    b.f3479a.start();
                }
                fragment.f3377U.setVisibility((!fragment.f3369M || fragment.mo3871T()) ? 0 : 8);
                if (fragment.mo3871T()) {
                    fragment.mo3924p1(false);
                }
            } else {
                animator.setTarget(fragment.f3377U);
                if (!fragment.f3369M) {
                    fragment.f3377U.setVisibility(0);
                } else if (fragment.mo3871T()) {
                    fragment.mo3924p1(false);
                } else {
                    ViewGroup viewGroup = fragment.f3376T;
                    View view = fragment.f3377U;
                    viewGroup.startViewTransition(view);
                    b.f3480b.addListener(new C1236e(viewGroup, view, fragment));
                }
                b.f3480b.start();
            }
        }
        if (fragment.f3403y && m5014t0(fragment)) {
            this.f3528v = true;
        }
        fragment.f3383a0 = false;
        fragment.mo3928r0(fragment.f3369M);
    }

    /* renamed from: p */
    private void m5012p(Fragment fragment) {
        fragment.mo3866Q0();
        this.f3520n.mo4095n(fragment, false);
        fragment.f3376T = null;
        fragment.f3377U = null;
        fragment.f3389g0 = null;
        fragment.f3390h0.mo4316n(null);
        fragment.f3358B = false;
    }

    /* renamed from: s0 */
    static boolean m5013s0(int i) {
        return f3501a || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: t0 */
    private boolean m5014t0(Fragment fragment) {
        return (fragment.f3373Q && fragment.f3374R) || fragment.f3364H.mo4145k();
    }

    /* renamed from: y0 */
    private void m5015y0(C1249q qVar) {
        Fragment i = qVar.mo4212i();
        if (this.f3510d.mo4224c(i.f3397s)) {
            if (m5013s0(2)) {
                Log.v("FragmentManager", "Removed fragment from active set " + i);
            }
            this.f3510d.mo4236o(qVar);
            mo4118O0(i);
        }
    }

    /* renamed from: z0 */
    private void m5016z0(C1790b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment r = bVar.mo6152r(i);
            if (!r.f3403y) {
                View i1 = r.mo3903i1();
                r.f3384b0 = i1.getAlpha();
                i1.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo4096A(MenuItem menuItem) {
        if (this.f3521o < 1) {
            return false;
        }
        for (Fragment next : this.f3510d.mo4234m()) {
            if (next != null && next.mo3876V0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        r0 = r0.f3377U;
        r1 = r4.f3376T;
        r0 = r1.indexOfChild(r0);
     */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4097A0(androidx.fragment.app.Fragment r4) {
        /*
            r3 = this;
            androidx.fragment.app.r r0 = r3.f3510d
            java.lang.String r1 = r4.f3397s
            boolean r0 = r0.mo4224c(r1)
            if (r0 != 0) goto L_0x003a
            r0 = 3
            boolean r0 = m5013s0(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to state "
            r0.append(r4)
            int r4 = r3.f3521o
            r0.append(r4)
            java.lang.String r4 = "since it is not added to "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r4)
        L_0x0039:
            return
        L_0x003a:
            r3.mo4100C0(r4)
            android.view.View r0 = r4.f3377U
            if (r0 == 0) goto L_0x009f
            androidx.fragment.app.r r0 = r3.f3510d
            androidx.fragment.app.Fragment r0 = r0.mo4231j(r4)
            if (r0 == 0) goto L_0x0061
            android.view.View r0 = r0.f3377U
            android.view.ViewGroup r1 = r4.f3376T
            int r0 = r1.indexOfChild(r0)
            android.view.View r2 = r4.f3377U
            int r2 = r1.indexOfChild(r2)
            if (r2 >= r0) goto L_0x0061
            r1.removeViewAt(r2)
            android.view.View r2 = r4.f3377U
            r1.addView(r2, r0)
        L_0x0061:
            boolean r0 = r4.f3382Z
            if (r0 == 0) goto L_0x009f
            android.view.ViewGroup r0 = r4.f3376T
            if (r0 == 0) goto L_0x009f
            float r0 = r4.f3384b0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0075
            android.view.View r2 = r4.f3377U
            r2.setAlpha(r0)
        L_0x0075:
            r4.f3384b0 = r1
            r0 = 0
            r4.f3382Z = r0
            androidx.fragment.app.i<?> r0 = r3.f3522p
            android.content.Context r0 = r0.mo4078f()
            androidx.fragment.app.e r1 = r3.f3523q
            r2 = 1
            androidx.fragment.app.d$d r0 = androidx.fragment.app.C1216d.m4921b(r0, r1, r4, r2)
            if (r0 == 0) goto L_0x009f
            android.view.animation.Animation r1 = r0.f3479a
            if (r1 == 0) goto L_0x0093
            android.view.View r0 = r4.f3377U
            r0.startAnimation(r1)
            goto L_0x009f
        L_0x0093:
            android.animation.Animator r1 = r0.f3480b
            android.view.View r2 = r4.f3377U
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f3480b
            r0.start()
        L_0x009f:
            boolean r0 = r4.f3383a0
            if (r0 == 0) goto L_0x00a6
            r3.m5011o(r4)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1231l.mo4097A0(androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo4098B(Menu menu) {
        if (this.f3521o >= 1) {
            for (Fragment next : this.f3510d.mo4234m()) {
                if (next != null) {
                    next.mo3878W0(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo4099B0(int i, boolean z) {
        C1227i<?> iVar;
        if (this.f3522p == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3521o) {
            this.f3521o = i;
            for (Fragment A0 : this.f3510d.mo4234m()) {
                mo4097A0(A0);
            }
            for (Fragment next : this.f3510d.mo4232k()) {
                if (next != null && !next.f3382Z) {
                    mo4097A0(next);
                }
            }
            m4999Z0();
            if (this.f3528v && (iVar = this.f3522p) != null && this.f3521o == 4) {
                iVar.mo4024q();
                this.f3528v = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo4100C0(Fragment fragment) {
        mo4102D0(fragment, this.f3521o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo4101D() {
        m4986J(3);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r2 != 3) goto L_0x01f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4102D0(androidx.fragment.app.Fragment r13, int r14) {
        /*
            r12 = this;
            androidx.fragment.app.r r0 = r12.f3510d
            java.lang.String r1 = r13.f3397s
            androidx.fragment.app.q r0 = r0.mo4233l(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0015
            androidx.fragment.app.q r0 = new androidx.fragment.app.q
            androidx.fragment.app.k r2 = r12.f3520n
            r0.<init>(r2, r13)
            r0.mo4219q(r1)
        L_0x0015:
            int r2 = r0.mo4206c()
            int r14 = java.lang.Math.min(r14, r2)
            int r2 = r13.f3393o
            r3 = 0
            java.lang.String r4 = "FragmentManager"
            r5 = -1
            r6 = 2
            r7 = 3
            if (r2 > r14) goto L_0x0102
            if (r2 >= r14) goto L_0x0034
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<c.i.g.b>> r2 = r12.f3518l
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0034
            r12.m5007j(r13)
        L_0x0034:
            int r2 = r13.f3393o
            if (r2 == r5) goto L_0x0042
            if (r2 == 0) goto L_0x00df
            if (r2 == r1) goto L_0x00e4
            if (r2 == r6) goto L_0x00f6
            if (r2 == r7) goto L_0x00fb
            goto L_0x01f5
        L_0x0042:
            if (r14 <= r5) goto L_0x00df
            boolean r2 = m5013s0(r7)
            if (r2 == 0) goto L_0x005e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "moveto ATTACHED: "
            r2.append(r8)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x005e:
            androidx.fragment.app.Fragment r2 = r13.f3399u
            java.lang.String r8 = " that does not belong to this FragmentManager!"
            java.lang.String r9 = " declared target fragment "
            java.lang.String r10 = "Fragment "
            if (r2 == 0) goto L_0x00a6
            java.lang.String r11 = r2.f3397s
            androidx.fragment.app.Fragment r11 = r12.mo4127W(r11)
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x0086
            androidx.fragment.app.Fragment r2 = r13.f3399u
            int r11 = r2.f3393o
            if (r11 >= r1) goto L_0x007d
            r12.mo4102D0(r2, r1)
        L_0x007d:
            androidx.fragment.app.Fragment r2 = r13.f3399u
            java.lang.String r2 = r2.f3397s
            r13.f3400v = r2
            r13.f3399u = r3
            goto L_0x00a6
        L_0x0086:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            androidx.fragment.app.Fragment r13 = r13.f3399u
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00a6:
            java.lang.String r2 = r13.f3400v
            if (r2 == 0) goto L_0x00d8
            androidx.fragment.app.Fragment r2 = r12.mo4127W(r2)
            if (r2 == 0) goto L_0x00b8
            int r3 = r2.f3393o
            if (r3 >= r1) goto L_0x00d8
            r12.mo4102D0(r2, r1)
            goto L_0x00d8
        L_0x00b8:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r13 = r13.f3400v
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00d8:
            androidx.fragment.app.i<?> r2 = r12.f3522p
            androidx.fragment.app.Fragment r3 = r12.f3524r
            r0.mo4205b(r2, r12, r3)
        L_0x00df:
            if (r14 <= 0) goto L_0x00e4
            r0.mo4207d()
        L_0x00e4:
            if (r14 <= r5) goto L_0x00e9
            r0.mo4211h()
        L_0x00e9:
            if (r14 <= r1) goto L_0x00f6
            androidx.fragment.app.e r1 = r12.f3523q
            r0.mo4208e(r1)
            r0.mo4204a()
            r0.mo4215l()
        L_0x00f6:
            if (r14 <= r6) goto L_0x00fb
            r0.mo4220r()
        L_0x00fb:
            if (r14 <= r7) goto L_0x01f5
            r0.mo4216m()
            goto L_0x01f5
        L_0x0102:
            if (r2 <= r14) goto L_0x01f5
            if (r2 == 0) goto L_0x01ec
            r8 = 0
            if (r2 == r1) goto L_0x01ab
            if (r2 == r6) goto L_0x011c
            if (r2 == r7) goto L_0x0117
            r9 = 4
            if (r2 == r9) goto L_0x0112
            goto L_0x01f5
        L_0x0112:
            if (r14 >= r9) goto L_0x0117
            r0.mo4213j()
        L_0x0117:
            if (r14 >= r7) goto L_0x011c
            r0.mo4221s()
        L_0x011c:
            if (r14 >= r6) goto L_0x01ab
            boolean r2 = m5013s0(r7)
            if (r2 == 0) goto L_0x0138
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r2.append(r6)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x0138:
            android.view.View r2 = r13.f3377U
            if (r2 == 0) goto L_0x014b
            androidx.fragment.app.i<?> r2 = r12.f3522p
            boolean r2 = r2.mo4021n(r13)
            if (r2 == 0) goto L_0x014b
            android.util.SparseArray<android.os.Parcelable> r2 = r13.f3395q
            if (r2 != 0) goto L_0x014b
            r0.mo4218p()
        L_0x014b:
            android.view.View r2 = r13.f3377U
            if (r2 == 0) goto L_0x019c
            android.view.ViewGroup r6 = r13.f3376T
            if (r6 == 0) goto L_0x019c
            r6.endViewTransition(r2)
            android.view.View r2 = r13.f3377U
            r2.clearAnimation()
            boolean r2 = r13.mo3879X()
            if (r2 != 0) goto L_0x019c
            int r2 = r12.f3521o
            r6 = 0
            if (r2 <= r5) goto L_0x0184
            boolean r2 = r12.f3531y
            if (r2 != 0) goto L_0x0184
            android.view.View r2 = r13.f3377U
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0184
            float r2 = r13.f3384b0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0184
            androidx.fragment.app.i<?> r2 = r12.f3522p
            android.content.Context r2 = r2.mo4078f()
            androidx.fragment.app.e r3 = r12.f3523q
            androidx.fragment.app.d$d r3 = androidx.fragment.app.C1216d.m4921b(r2, r3, r13, r8)
        L_0x0184:
            r13.f3384b0 = r6
            android.view.ViewGroup r2 = r13.f3376T
            android.view.View r5 = r13.f3377U
            if (r3 == 0) goto L_0x0194
            r13.mo3937t1(r14)
            androidx.fragment.app.t$g r6 = r12.f3519m
            androidx.fragment.app.C1216d.m4920a(r13, r3, r6)
        L_0x0194:
            r2.removeView(r5)
            android.view.ViewGroup r3 = r13.f3376T
            if (r2 == r3) goto L_0x019c
            return
        L_0x019c:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<c.i.g.b>> r2 = r12.f3518l
            java.lang.Object r2 = r2.get(r13)
            if (r2 != 0) goto L_0x01a8
            r12.m5012p(r13)
            goto L_0x01ab
        L_0x01a8:
            r13.mo3937t1(r14)
        L_0x01ab:
            if (r14 >= r1) goto L_0x01ec
            boolean r2 = r13.f3404z
            if (r2 == 0) goto L_0x01b8
            boolean r2 = r13.mo3873U()
            if (r2 != 0) goto L_0x01b8
            r8 = 1
        L_0x01b8:
            if (r8 != 0) goto L_0x01d6
            androidx.fragment.app.o r2 = r12.f3506E
            boolean r2 = r2.mo4194n(r13)
            if (r2 == 0) goto L_0x01c3
            goto L_0x01d6
        L_0x01c3:
            java.lang.String r2 = r13.f3400v
            if (r2 == 0) goto L_0x01d9
            androidx.fragment.app.Fragment r2 = r12.mo4127W(r2)
            if (r2 == 0) goto L_0x01d9
            boolean r3 = r2.mo3847G()
            if (r3 == 0) goto L_0x01d9
            r13.f3399u = r2
            goto L_0x01d9
        L_0x01d6:
            r12.m5015y0(r0)
        L_0x01d9:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<c.i.g.b>> r2 = r12.f3518l
            java.lang.Object r2 = r2.get(r13)
            if (r2 == 0) goto L_0x01e5
            r13.mo3937t1(r14)
            goto L_0x01ed
        L_0x01e5:
            androidx.fragment.app.i<?> r1 = r12.f3522p
            androidx.fragment.app.o r2 = r12.f3506E
            r0.mo4209f(r1, r2)
        L_0x01ec:
            r1 = r14
        L_0x01ed:
            if (r1 >= 0) goto L_0x01f4
            androidx.fragment.app.o r14 = r12.f3506E
            r0.mo4210g(r14)
        L_0x01f4:
            r14 = r1
        L_0x01f5:
            int r0 = r13.f3393o
            if (r0 == r14) goto L_0x0227
            boolean r0 = m5013s0(r7)
            if (r0 == 0) goto L_0x0225
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r13.f3393o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
        L_0x0225:
            r13.f3393o = r14
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1231l.mo4102D0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo4103E(boolean z) {
        for (Fragment next : this.f3510d.mo4234m()) {
            if (next != null) {
                next.mo3882Y0(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo4104E0() {
        if (this.f3522p != null) {
            this.f3529w = false;
            this.f3530x = false;
            for (Fragment next : this.f3510d.mo4234m()) {
                if (next != null) {
                    next.mo3885a0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo4105F(Menu menu) {
        boolean z = false;
        if (this.f3521o < 1) {
            return false;
        }
        for (Fragment next : this.f3510d.mo4234m()) {
            if (next != null && next.mo3884Z0(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void mo4106F0(Fragment fragment) {
        if (!fragment.f3378V) {
            return;
        }
        if (this.f3509c) {
            this.f3532z = true;
            return;
        }
        fragment.f3378V = false;
        mo4102D0(fragment, this.f3521o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo4107G() {
        m5001a1();
        m4984C(this.f3525s);
    }

    /* renamed from: G0 */
    public void mo4108G0(int i, int i2) {
        if (i >= 0) {
            mo4117O(new C1240i((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo4109H() {
        this.f3529w = false;
        this.f3530x = false;
        m4986J(4);
    }

    /* renamed from: H0 */
    public boolean mo4110H0() {
        return m4985I0((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo4111I() {
        this.f3529w = false;
        this.f3530x = false;
        m4986J(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public boolean mo4112J0(ArrayList<C1211a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C1211a> arrayList3 = this.f3511e;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3511e.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1211a aVar = this.f3511e.get(size2);
                    if ((str != null && str.equals(aVar.mo3963A())) || (i >= 0 && i == aVar.f3442v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1211a aVar2 = this.f3511e.get(size2);
                        if ((str == null || !str.equals(aVar2.mo3963A())) && (i < 0 || i != aVar2.f3442v)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f3511e.size() - 1) {
                return false;
            }
            for (int size3 = this.f3511e.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f3511e.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo4113K() {
        this.f3530x = true;
        m4986J(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo4114L0(Fragment fragment, C1849b bVar) {
        HashSet hashSet = this.f3518l.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f3518l.remove(fragment);
            if (fragment.f3393o < 3) {
                m5012p(fragment);
                mo4102D0(fragment, fragment.mo3855K());
            }
        }
    }

    /* renamed from: M */
    public void mo4115M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3510d.mo4226e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3512f;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3512f.get(i).toString());
            }
        }
        ArrayList<C1211a> arrayList2 = this.f3511e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C1211a aVar = this.f3511e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo3980v(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3516j.get());
        synchronized (this.f3508b) {
            int size3 = this.f3508b.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f3508b.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3522p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3523q);
        if (this.f3524r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3524r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3521o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3529w);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3530x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3531y);
        if (this.f3528v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3528v);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo4116M0(Fragment fragment) {
        if (m5013s0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3361E);
        }
        boolean z = !fragment.mo3873U();
        if (!fragment.f3370N || z) {
            this.f3510d.mo4237p(fragment);
            if (m5014t0(fragment)) {
                this.f3528v = true;
            }
            fragment.f3404z = true;
            m4998X0(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo4117O(C1239h hVar, boolean z) {
        if (!z) {
            if (this.f3522p != null) {
                m5008l();
            } else if (this.f3531y) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3508b) {
            if (this.f3522p != null) {
                this.f3508b.add(hVar);
                mo4123T0();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo4118O0(Fragment fragment) {
        if (mo4164w0()) {
            if (m5013s0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f3506E.mo4193m(fragment) && m5013s0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo4119Q(boolean z) {
        m4991P(z);
        boolean z2 = false;
        while (m5004d0(this.f3502A, this.f3503B)) {
            this.f3509c = true;
            try {
                m4990N0(this.f3502A, this.f3503B);
                m5009m();
                z2 = true;
            } catch (Throwable th) {
                m5009m();
                throw th;
            }
        }
        m5001a1();
        m4988L();
        this.f3510d.mo4223b();
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo4120Q0(Parcelable parcelable) {
        C1249q qVar;
        if (parcelable != null) {
            C1243n nVar = (C1243n) parcelable;
            if (nVar.f3548f != null) {
                this.f3510d.mo4238q();
                Iterator<C1247p> it = nVar.f3548f.iterator();
                while (it.hasNext()) {
                    C1247p next = it.next();
                    if (next != null) {
                        Fragment g = this.f3506E.mo4187g(next.f3561o);
                        if (g != null) {
                            if (m5013s0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g);
                            }
                            qVar = new C1249q(this.f3520n, g, next);
                        } else {
                            qVar = new C1249q(this.f3520n, this.f3522p.mo4078f().getClassLoader(), mo4141h0(), next);
                        }
                        Fragment i = qVar.mo4212i();
                        i.f3362F = this;
                        if (m5013s0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + i.f3397s + "): " + i);
                        }
                        qVar.mo4214k(this.f3522p.mo4078f().getClassLoader());
                        this.f3510d.mo4235n(qVar);
                        qVar.mo4219q(this.f3521o);
                    }
                }
                for (Fragment next2 : this.f3506E.mo4190j()) {
                    if (!this.f3510d.mo4224c(next2.f3397s)) {
                        if (m5013s0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + nVar.f3548f);
                        }
                        mo4102D0(next2, 1);
                        next2.f3404z = true;
                        mo4102D0(next2, -1);
                    }
                }
                this.f3510d.mo4239r(nVar.f3549o);
                if (nVar.f3550p != null) {
                    this.f3511e = new ArrayList<>(nVar.f3550p.length);
                    int i2 = 0;
                    while (true) {
                        C1212b[] bVarArr = nVar.f3550p;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        C1211a a = bVarArr[i2].mo3985a(this);
                        if (m5013s0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a.f3442v + "): " + a);
                            PrintWriter printWriter = new PrintWriter(new C1172c("FragmentManager"));
                            a.mo3981w("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3511e.add(a);
                        i2++;
                    }
                } else {
                    this.f3511e = null;
                }
                this.f3516j.set(nVar.f3551q);
                String str = nVar.f3552r;
                if (str != null) {
                    Fragment W = mo4127W(str);
                    this.f3525s = W;
                    m4984C(W);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo4121R(C1239h hVar, boolean z) {
        if (!z || (this.f3522p != null && !this.f3531y)) {
            m4991P(z);
            if (hVar.mo3970a(this.f3502A, this.f3503B)) {
                this.f3509c = true;
                try {
                    m4990N0(this.f3502A, this.f3503B);
                } finally {
                    m5009m();
                }
            }
            m5001a1();
            m4988L();
            this.f3510d.mo4223b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public Parcelable mo4122S0() {
        int size;
        m5003c0();
        m4989N();
        mo4119Q(true);
        this.f3529w = true;
        ArrayList<C1247p> s = this.f3510d.mo4240s();
        C1212b[] bVarArr = null;
        if (s.isEmpty()) {
            if (m5013s0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> t = this.f3510d.mo4241t();
        ArrayList<C1211a> arrayList = this.f3511e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new C1212b[size];
            for (int i = 0; i < size; i++) {
                bVarArr[i] = new C1212b(this.f3511e.get(i));
                if (m5013s0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f3511e.get(i));
                }
            }
        }
        C1243n nVar = new C1243n();
        nVar.f3548f = s;
        nVar.f3549o = t;
        nVar.f3550p = bVarArr;
        nVar.f3551q = this.f3516j.get();
        Fragment fragment = this.f3525s;
        if (fragment != null) {
            nVar.f3552r = fragment.f3397s;
        }
        return nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo4123T0() {
        synchronized (this.f3508b) {
            ArrayList<C1241j> arrayList = this.f3505D;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f3508b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f3522p.mo4079h().removeCallbacks(this.f3507F);
                this.f3522p.mo4079h().post(this.f3507F);
                m5001a1();
            }
        }
    }

    /* renamed from: U */
    public boolean mo4124U() {
        boolean Q = mo4119Q(true);
        m5003c0();
        return Q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo4125U0(Fragment fragment, boolean z) {
        ViewGroup g0 = m5006g0(fragment);
        if (g0 != null && (g0 instanceof C1224f)) {
            ((C1224f) g0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo4126V0(Fragment fragment, C1286d.C1288b bVar) {
        if (!fragment.equals(mo4127W(fragment.f3397s)) || !(fragment.f3363G == null || fragment.f3362F == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f3387e0 = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public Fragment mo4127W(String str) {
        return this.f3510d.mo4227f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo4128W0(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo4127W(fragment.f3397s)) && (fragment.f3363G == null || fragment.f3362F == this))) {
            Fragment fragment2 = this.f3525s;
            this.f3525s = fragment;
            m4984C(fragment2);
            m4984C(this.f3525s);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: Y */
    public Fragment mo4129Y(int i) {
        return this.f3510d.mo4228g(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo4130Y0(Fragment fragment) {
        if (m5013s0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f3369M) {
            fragment.f3369M = false;
            fragment.f3383a0 = !fragment.f3383a0;
        }
    }

    /* renamed from: Z */
    public Fragment mo4131Z(String str) {
        return this.f3510d.mo4229h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public Fragment mo4132a0(String str) {
        return this.f3510d.mo4230i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4133b(C1211a aVar) {
        if (this.f3511e == null) {
            this.f3511e = new ArrayList<>();
        }
        this.f3511e.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4134c(Fragment fragment, C1849b bVar) {
        if (this.f3518l.get(fragment) == null) {
            this.f3518l.put(fragment, new HashSet());
        }
        this.f3518l.get(fragment).add(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4135d(Fragment fragment) {
        if (m5013s0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        mo4166x0(fragment);
        if (!fragment.f3370N) {
            this.f3510d.mo4222a(fragment);
            fragment.f3404z = false;
            if (fragment.f3377U == null) {
                fragment.f3383a0 = false;
            }
            if (m5014t0(fragment)) {
                this.f3528v = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4136e(Fragment fragment) {
        if (mo4164w0()) {
            if (m5013s0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f3506E.mo4184e(fragment) && m5013s0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* renamed from: e0 */
    public int mo4137e0() {
        ArrayList<C1211a> arrayList = this.f3511e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo4138f() {
        return this.f3516j.getAndIncrement();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4139g(androidx.fragment.app.C1227i<?> r3, androidx.fragment.app.C1223e r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.i<?> r0 = r2.f3522p
            if (r0 != 0) goto L_0x0046
            r2.f3522p = r3
            r2.f3523q = r4
            r2.f3524r = r5
            if (r5 == 0) goto L_0x000f
            r2.m5001a1()
        L_0x000f:
            boolean r4 = r3 instanceof androidx.activity.C0044c
            if (r4 == 0) goto L_0x0024
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.C0044c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.mo128b()
            r2.f3514h = r0
            if (r5 == 0) goto L_0x001f
            r4 = r5
        L_0x001f:
            androidx.activity.b r1 = r2.f3515i
            r0.mo139a(r4, r1)
        L_0x0024:
            if (r5 == 0) goto L_0x002f
            androidx.fragment.app.l r3 = r5.f3362F
            androidx.fragment.app.o r3 = r3.m5005f0(r5)
        L_0x002c:
            r2.f3506E = r3
            goto L_0x0045
        L_0x002f:
            boolean r4 = r3 instanceof androidx.lifecycle.C1312t
            if (r4 == 0) goto L_0x003e
            androidx.lifecycle.t r3 = (androidx.lifecycle.C1312t) r3
            androidx.lifecycle.s r3 = r3.mo129g()
            androidx.fragment.app.o r3 = androidx.fragment.app.C1245o.m5103i(r3)
            goto L_0x002c
        L_0x003e:
            androidx.fragment.app.o r3 = new androidx.fragment.app.o
            r4 = 0
            r3.<init>(r4)
            goto L_0x002c
        L_0x0045:
            return
        L_0x0046:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1231l.mo4139g(androidx.fragment.app.i, androidx.fragment.app.e, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4140h(Fragment fragment) {
        if (m5013s0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f3370N) {
            fragment.f3370N = false;
            if (!fragment.f3403y) {
                this.f3510d.mo4222a(fragment);
                if (m5013s0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m5014t0(fragment)) {
                    this.f3528v = true;
                }
            }
        }
    }

    /* renamed from: h0 */
    public C1226h mo4141h0() {
        C1226h hVar = this.f3526t;
        if (hVar != null) {
            return hVar;
        }
        Fragment fragment = this.f3524r;
        return fragment != null ? fragment.f3362F.mo4141h0() : this.f3527u;
    }

    /* renamed from: i */
    public C1252s mo4142i() {
        return new C1211a(this);
    }

    /* renamed from: i0 */
    public List<Fragment> mo4143i0() {
        return this.f3510d.mo4234m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public LayoutInflater.Factory2 mo4144j0() {
        return this.f3513g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo4145k() {
        boolean z = false;
        for (Fragment next : this.f3510d.mo4232k()) {
            if (next != null) {
                z = m5014t0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public C1229k mo4146k0() {
        return this.f3520n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public Fragment mo4147l0() {
        return this.f3524r;
    }

    /* renamed from: m0 */
    public Fragment mo4148m0() {
        return this.f3525s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4149n(C1211a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo3983y(z3);
        } else {
            aVar.mo3982x();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C1254t.m5175B(this, arrayList, arrayList2, 0, 1, true, this.f3519m);
        }
        if (z3) {
            mo4099B0(this.f3521o, true);
        }
        for (Fragment next : this.f3510d.mo4232k()) {
            if (next != null && next.f3377U != null && next.f3382Z && aVar.mo3964B(next.f3367K)) {
                float f = next.f3384b0;
                if (f > 0.0f) {
                    next.f3377U.setAlpha(f);
                }
                if (z3) {
                    next.f3384b0 = 0.0f;
                } else {
                    next.f3384b0 = -1.0f;
                    next.f3382Z = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public C1311s mo4150o0(Fragment fragment) {
        return this.f3506E.mo4191k(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo4151p0() {
        mo4119Q(true);
        if (this.f3515i.mo145c()) {
            mo4110H0();
        } else {
            this.f3514h.mo141c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4152q(Fragment fragment) {
        if (m5013s0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f3370N) {
            fragment.f3370N = true;
            if (fragment.f3403y) {
                if (m5013s0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f3510d.mo4237p(fragment);
                if (m5014t0(fragment)) {
                    this.f3528v = true;
                }
                m4998X0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo4153q0(Fragment fragment) {
        if (m5013s0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f3369M) {
            fragment.f3369M = true;
            fragment.f3383a0 = true ^ fragment.f3383a0;
            m4998X0(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4154r() {
        this.f3529w = false;
        this.f3530x = false;
        m4986J(2);
    }

    /* renamed from: r0 */
    public boolean mo4155r0() {
        return this.f3531y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4156s(Configuration configuration) {
        for (Fragment next : this.f3510d.mo4234m()) {
            if (next != null) {
                next.mo3856K0(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo4157t(MenuItem menuItem) {
        if (this.f3521o < 1) {
            return false;
        }
        for (Fragment next : this.f3510d.mo4234m()) {
            if (next != null && next.mo3858L0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3524r;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f3524r;
        } else {
            C1227i<?> iVar = this.f3522p;
            if (iVar != null) {
                sb.append(iVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f3522p;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4159u() {
        this.f3529w = false;
        this.f3530x = false;
        m4986J(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public boolean mo4160u0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        C1231l lVar = fragment.f3362F;
        return fragment.equals(lVar.mo4148m0()) && mo4160u0(lVar.f3524r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo4161v(Menu menu, MenuInflater menuInflater) {
        if (this.f3521o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f3510d.mo4234m()) {
            if (next != null && next.mo3862N0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f3512f != null) {
            for (int i = 0; i < this.f3512f.size(); i++) {
                Fragment fragment = this.f3512f.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.mo3916n0();
                }
            }
        }
        this.f3512f = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public boolean mo4162v0(int i) {
        return this.f3521o >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo4163w() {
        this.f3531y = true;
        mo4119Q(true);
        m4989N();
        m4986J(-1);
        this.f3522p = null;
        this.f3523q = null;
        this.f3524r = null;
        if (this.f3514h != null) {
            this.f3515i.mo146d();
            this.f3514h = null;
        }
    }

    /* renamed from: w0 */
    public boolean mo4164w0() {
        return this.f3529w || this.f3530x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4165x() {
        m4986J(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo4166x0(Fragment fragment) {
        if (!this.f3510d.mo4224c(fragment.f3397s)) {
            C1249q qVar = new C1249q(this.f3520n, fragment);
            qVar.mo4214k(this.f3522p.mo4078f().getClassLoader());
            this.f3510d.mo4235n(qVar);
            if (fragment.f3372P) {
                if (fragment.f3371O) {
                    mo4136e(fragment);
                } else {
                    mo4118O0(fragment);
                }
                fragment.f3372P = false;
            }
            qVar.mo4219q(this.f3521o);
            if (m5013s0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4167y() {
        for (Fragment next : this.f3510d.mo4234m()) {
            if (next != null) {
                next.mo3872T0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo4168z(boolean z) {
        for (Fragment next : this.f3510d.mo4234m()) {
            if (next != null) {
                next.mo3874U0(z);
            }
        }
    }
}
