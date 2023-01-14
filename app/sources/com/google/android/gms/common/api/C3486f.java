package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.C1214c;
import com.google.android.gms.common.C3629e;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.internal.C3511d;
import com.google.android.gms.common.api.internal.C3516e;
import com.google.android.gms.common.api.internal.C3526g;
import com.google.android.gms.common.api.internal.C3540i2;
import com.google.android.gms.common.api.internal.C3550l;
import com.google.android.gms.common.api.internal.C3562o;
import com.google.android.gms.common.api.internal.C3573q2;
import com.google.android.gms.common.api.internal.C3588u0;
import com.google.android.gms.common.api.internal.C3610z2;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3664e0;
import com.google.android.gms.common.internal.C3705r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p027c.p060f.C1788a;
import p174e.p319f.p320a.p335c.p360g.C8921a;
import p174e.p319f.p320a.p335c.p360g.C8938f;
import p174e.p319f.p320a.p335c.p360g.C8939g;

@Deprecated
/* renamed from: com.google.android.gms.common.api.f */
public abstract class C3486f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set<C3486f> f9852a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$a */
    public static final class C3487a {

        /* renamed from: a */
        private Account f9853a;

        /* renamed from: b */
        private final Set<Scope> f9854b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f9855c = new HashSet();

        /* renamed from: d */
        private int f9856d;

        /* renamed from: e */
        private View f9857e;

        /* renamed from: f */
        private String f9858f;

        /* renamed from: g */
        private String f9859g;

        /* renamed from: h */
        private final Map<C3469a<?>, C3664e0> f9860h = new C1788a();

        /* renamed from: i */
        private final Context f9861i;

        /* renamed from: j */
        private final Map<C3469a<?>, C3469a.C3473d> f9862j = new C1788a();

        /* renamed from: k */
        private C3526g f9863k;

        /* renamed from: l */
        private int f9864l = -1;

        /* renamed from: m */
        private C3489c f9865m;

        /* renamed from: n */
        private Looper f9866n;

        /* renamed from: o */
        private C3629e f9867o = C3629e.m14086q();

        /* renamed from: p */
        private C3469a.C3470a<? extends C8939g, C8921a> f9868p = C8938f.f24340c;

        /* renamed from: q */
        private final ArrayList<C3488b> f9869q = new ArrayList<>();

        /* renamed from: r */
        private final ArrayList<C3489c> f9870r = new ArrayList<>();

        public C3487a(Context context) {
            this.f9861i = context;
            this.f9866n = context.getMainLooper();
            this.f9858f = context.getPackageName();
            this.f9859g = context.getClass().getName();
        }

        /* renamed from: a */
        public C3487a mo11228a(C3469a<?> aVar) {
            C3705r.m14347l(aVar, "Api must not be null");
            this.f9862j.put(aVar, (Object) null);
            List<Scope> a = ((C3469a.C3477e) C3705r.m14347l(aVar.mo11178c(), "Base client builder must not be null")).mo11184a(null);
            this.f9855c.addAll(a);
            this.f9854b.addAll(a);
            return this;
        }

        /* renamed from: b */
        public C3487a mo11229b(C3488b bVar) {
            C3705r.m14347l(bVar, "Listener must not be null");
            this.f9869q.add(bVar);
            return this;
        }

        /* renamed from: c */
        public C3486f mo11230c() {
            C3705r.m14337b(!this.f9862j.isEmpty(), "must call addApi() to add at least one API");
            C3659d f = mo11233f();
            Map<C3469a<?>, C3664e0> k = f.mo11578k();
            C1788a aVar = new C1788a();
            C1788a aVar2 = new C1788a();
            ArrayList arrayList = new ArrayList();
            C3469a aVar3 = null;
            boolean z = false;
            for (C3469a next : this.f9862j.keySet()) {
                C3469a.C3473d dVar = this.f9862j.get(next);
                boolean z2 = k.get(next) != null;
                aVar.put(next, Boolean.valueOf(z2));
                C3610z2 z2Var = new C3610z2(next, z2);
                arrayList.add(z2Var);
                C3469a.C3470a aVar4 = (C3469a.C3470a) C3705r.m14346k(next.mo11176a());
                C3469a aVar5 = next;
                C3469a.C3478f c = aVar4.mo11180c(this.f9861i, this.f9866n, f, dVar, z2Var, z2Var);
                aVar2.put(aVar5.mo11177b(), c);
                if (aVar4.mo11185b() == 1) {
                    z = dVar != null;
                }
                if (c.mo11135b()) {
                    if (aVar3 == null) {
                        aVar3 = aVar5;
                    } else {
                        String d = aVar5.mo11179d();
                        String d2 = aVar3.mo11179d();
                        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 21 + String.valueOf(d2).length());
                        sb.append(d);
                        sb.append(" cannot be used with ");
                        sb.append(d2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar3 != null) {
                if (!z) {
                    C3705r.m14351p(this.f9853a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.mo11179d());
                    C3705r.m14351p(this.f9854b.equals(this.f9855c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.mo11179d());
                } else {
                    String d3 = aVar3.mo11179d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(d3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            C3588u0 u0Var = new C3588u0(this.f9861i, new ReentrantLock(), this.f9866n, f, this.f9867o, this.f9868p, aVar, this.f9869q, this.f9870r, aVar2, this.f9864l, C3588u0.m13958s(aVar2.values(), true), arrayList);
            synchronized (C3486f.f9852a) {
                C3486f.f9852a.add(u0Var);
            }
            if (this.f9864l >= 0) {
                C3573q2.m13893t(this.f9863k).mo11402u(this.f9864l, u0Var, this.f9865m);
            }
            return u0Var;
        }

        /* renamed from: d */
        public C3487a mo11231d(C1214c cVar, int i, C3489c cVar2) {
            C3526g gVar = new C3526g(cVar);
            C3705r.m14337b(i >= 0, "clientId must be non-negative");
            this.f9864l = i;
            this.f9865m = cVar2;
            this.f9863k = gVar;
            return this;
        }

        /* renamed from: e */
        public C3487a mo11232e(C1214c cVar, C3489c cVar2) {
            mo11231d(cVar, 0, cVar2);
            return this;
        }

        /* renamed from: f */
        public final C3659d mo11233f() {
            C8921a aVar = C8921a.f24313f;
            Map<C3469a<?>, C3469a.C3473d> map = this.f9862j;
            C3469a<C8921a> aVar2 = C8938f.f24344g;
            if (map.containsKey(aVar2)) {
                aVar = (C8921a) this.f9862j.get(aVar2);
            }
            return new C3659d(this.f9853a, this.f9854b, this.f9860h, this.f9856d, this.f9857e, this.f9858f, this.f9859g, aVar, false);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$b */
    public interface C3488b extends C3516e {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$c */
    public interface C3489c extends C3550l {
    }

    /* renamed from: h */
    public static Set<C3486f> m13551h() {
        Set<C3486f> set = f9852a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: d */
    public abstract void mo11216d();

    /* renamed from: e */
    public abstract void mo11217e();

    /* renamed from: f */
    public abstract void mo11218f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: g */
    public <A extends C3469a.C3471b, T extends C3511d<? extends C3612k, A>> T mo11219g(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public <C extends C3469a.C3478f> C mo11220i(C3469a.C3472c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public Context mo11221j() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public Looper mo11222k() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    public boolean mo11223l(C3562o oVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: m */
    public void mo11224m() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    public abstract void mo11225n(C3489c cVar);

    /* renamed from: o */
    public abstract void mo11226o(C3489c cVar);

    /* renamed from: p */
    public void mo11227p(C3540i2 i2Var) {
        throw new UnsupportedOperationException();
    }
}
