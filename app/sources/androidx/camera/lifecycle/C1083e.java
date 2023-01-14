package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0629c3;
import androidx.camera.core.C0930k1;
import androidx.camera.core.C0952p1;
import androidx.camera.core.C0957q1;
import androidx.camera.core.C0961r1;
import androidx.camera.core.C0965s1;
import androidx.camera.core.C0989v1;
import androidx.camera.core.C0994w1;
import androidx.camera.core.impl.C0831k1;
import androidx.camera.core.impl.C0848n0;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.p014a3.C0722e;
import androidx.camera.core.impl.p014a3.C0743m;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0766e;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.camera.core.p009e3.C0649e;
import androidx.core.util.C1177h;
import androidx.lifecycle.C1291g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.lifecycle.e */
public final class C1083e implements C0961r1 {

    /* renamed from: a */
    private static final C1083e f3000a = new C1083e();

    /* renamed from: b */
    private final Object f3001b = new Object();

    /* renamed from: c */
    private C0994w1.C0996b f3002c = null;

    /* renamed from: d */
    private C9172b<C0989v1> f3003d;

    /* renamed from: e */
    private C9172b<Void> f3004e = C0768f.m3081g(null);

    /* renamed from: f */
    private final LifecycleCameraRepository f3005f = new LifecycleCameraRepository();

    /* renamed from: g */
    private C0989v1 f3006g;

    /* renamed from: h */
    private Context f3007h;

    /* renamed from: androidx.camera.lifecycle.e$a */
    class C1084a implements C0765d<Void> {

        /* renamed from: a */
        final /* synthetic */ C1814b.C1815a f3008a;

        /* renamed from: b */
        final /* synthetic */ C0989v1 f3009b;

        C1084a(C1814b.C1815a aVar, C0989v1 v1Var) {
            this.f3008a = aVar;
            this.f3009b = v1Var;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            this.f3008a.mo6310f(th);
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
            this.f3008a.mo6308c(this.f3009b);
        }
    }

    private C1083e() {
    }

    /* renamed from: d */
    public static C9172b<C1083e> m4160d(Context context) {
        C1177h.m4583e(context);
        return C0768f.m3088n(f3000a.m4161e(context), new C1081c(context), C0744a.m3044a());
    }

    /* renamed from: e */
    private C9172b<C0989v1> m4161e(Context context) {
        synchronized (this.f3001b) {
            C9172b<C0989v1> bVar = this.f3003d;
            if (bVar != null) {
                return bVar;
            }
            C9172b<C0989v1> a = C1814b.m7736a(new C1080b(this, new C0989v1(context, this.f3002c)));
            this.f3003d = a;
            return a;
        }
    }

    /* renamed from: f */
    static /* synthetic */ C1083e m4162f(Context context, C0989v1 v1Var) {
        C1083e eVar = f3000a;
        eVar.m4165j(v1Var);
        eVar.m4166k(C0722e.m2978a(context));
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object mo3414i(C0989v1 v1Var, C1814b.C1815a aVar) {
        synchronized (this.f3001b) {
            C0768f.m3075a(C0766e.m3068a(this.f3004e).mo2920f(new C1079a(v1Var), C0744a.m3044a()), new C1084a(aVar, v1Var), C0744a.m3044a());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* renamed from: j */
    private void m4165j(C0989v1 v1Var) {
        this.f3006g = v1Var;
    }

    /* renamed from: k */
    private void m4166k(Context context) {
        this.f3007h = context;
    }

    /* renamed from: a */
    public List<C0957q1> mo3206a() {
        ArrayList arrayList = new ArrayList();
        for (C0899w0 a : this.f3006g.mo3262b().mo3145a()) {
            arrayList.add(a.mo2380a());
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0930k1 mo3412b(C1291g gVar, C0965s1 s1Var, C0629c3 c3Var, C0608a3... a3VarArr) {
        C0848n0 n0Var;
        C0848n0 a;
        C0743m.m3042a();
        C0965s1.C0966a c = C0965s1.C0966a.m3744c(s1Var);
        int length = a3VarArr.length;
        int i = 0;
        while (true) {
            n0Var = null;
            if (i >= length) {
                break;
            }
            C0965s1 B = a3VarArr[i].mo2571f().mo2491B((C0965s1) null);
            if (B != null) {
                Iterator it = B.mo3214c().iterator();
                while (it.hasNext()) {
                    c.mo3217a((C0952p1) it.next());
                }
            }
            i++;
        }
        LinkedHashSet<C0899w0> a2 = c.mo3218b().mo3212a(this.f3006g.mo3262b().mo3145a());
        if (!a2.isEmpty()) {
            LifecycleCamera c2 = this.f3005f.mo3397c(gVar, C0649e.m2744t(a2));
            Collection<LifecycleCamera> e = this.f3005f.mo3398e();
            for (C0608a3 a3Var : a3VarArr) {
                for (LifecycleCamera next : e) {
                    if (next.mo3391q(a3Var) && next != c2) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", new Object[]{a3Var}));
                    }
                }
            }
            if (c2 == null) {
                c2 = this.f3005f.mo3396b(gVar, new C0649e(a2, this.f3006g.mo3261a(), this.f3006g.mo3263d()));
            }
            Iterator it2 = s1Var.mo3214c().iterator();
            while (it2.hasNext()) {
                C0952p1 p1Var = (C0952p1) it2.next();
                if (!(p1Var.mo3139a() == C0952p1.f2675a || (a = C0831k1.m3262b(p1Var.mo3139a()).mo2796a(c2.mo2380a(), this.f3007h)) == null)) {
                    if (n0Var == null) {
                        n0Var = a;
                    } else {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                }
            }
            c2.mo3382e(n0Var);
            if (a3VarArr.length == 0) {
                return c2;
            }
            this.f3005f.mo3395a(c2, c3Var, Arrays.asList(a3VarArr));
            return c2;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }

    /* renamed from: c */
    public C0930k1 mo3413c(C1291g gVar, C0965s1 s1Var, C0608a3... a3VarArr) {
        return mo3412b(gVar, s1Var, (C0629c3) null, a3VarArr);
    }

    /* renamed from: l */
    public void mo3415l() {
        C0743m.m3042a();
        this.f3005f.mo3401k();
    }
}
