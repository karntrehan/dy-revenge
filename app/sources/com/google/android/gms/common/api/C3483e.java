package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3469a.C3473d;
import com.google.android.gms.common.api.internal.C3495a;
import com.google.android.gms.common.api.internal.C3500b;
import com.google.android.gms.common.api.internal.C3509c2;
import com.google.android.gms.common.api.internal.C3511d;
import com.google.android.gms.common.api.internal.C3521f;
import com.google.android.gms.common.api.internal.C3528g1;
import com.google.android.gms.common.api.internal.C3546k;
import com.google.android.gms.common.api.internal.C3552l1;
import com.google.android.gms.common.api.internal.C3566p;
import com.google.android.gms.common.api.internal.C3574r;
import com.google.android.gms.common.api.internal.C3599x;
import com.google.android.gms.common.internal.C3651c;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.util.C3765l;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.api.e */
public abstract class C3483e<O extends C3469a.C3473d> {

    /* renamed from: a */
    private final Context f9837a;

    /* renamed from: b */
    private final String f9838b;

    /* renamed from: c */
    private final C3469a<O> f9839c;

    /* renamed from: d */
    private final O f9840d;

    /* renamed from: e */
    private final C3500b<O> f9841e;

    /* renamed from: f */
    private final Looper f9842f;

    /* renamed from: g */
    private final int f9843g;

    /* renamed from: h */
    private final C3486f f9844h;

    /* renamed from: i */
    private final C3566p f9845i;

    /* renamed from: j */
    protected final C3521f f9846j;

    /* renamed from: com.google.android.gms.common.api.e$a */
    public static class C3484a {

        /* renamed from: a */
        public static final C3484a f9847a = new C3485a().mo11214a();

        /* renamed from: b */
        public final C3566p f9848b;

        /* renamed from: c */
        public final Looper f9849c;

        /* renamed from: com.google.android.gms.common.api.e$a$a */
        public static class C3485a {

            /* renamed from: a */
            private C3566p f9850a;

            /* renamed from: b */
            private Looper f9851b;

            /* renamed from: a */
            public C3484a mo11214a() {
                if (this.f9850a == null) {
                    this.f9850a = new C3495a();
                }
                if (this.f9851b == null) {
                    this.f9851b = Looper.getMainLooper();
                }
                return new C3484a(this.f9850a, this.f9851b);
            }

            /* renamed from: b */
            public C3485a mo11215b(C3566p pVar) {
                C3705r.m14347l(pVar, "StatusExceptionMapper must not be null.");
                this.f9850a = pVar;
                return this;
            }
        }

        private C3484a(C3566p pVar, Account account, Looper looper) {
            this.f9848b = pVar;
            this.f9849c = looper;
        }
    }

    private C3483e(Context context, Activity activity, C3469a<O> aVar, O o, C3484a aVar2) {
        C3705r.m14347l(context, "Null context is not permitted.");
        C3705r.m14347l(aVar, "Api must not be null.");
        C3705r.m14347l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f9837a = context.getApplicationContext();
        String str = null;
        if (C3765l.m14533k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f9838b = str;
        this.f9839c = aVar;
        this.f9840d = o;
        this.f9842f = aVar2.f9849c;
        C3500b<O> a = C3500b.m13607a(aVar, o, str);
        this.f9841e = a;
        this.f9844h = new C3552l1(this);
        C3521f y = C3521f.m13672y(this.f9837a);
        this.f9846j = y;
        this.f9843g = y.mo11321n();
        this.f9845i = aVar2.f9848b;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C3599x.m14013u(activity, y, a);
        }
        y.mo11315c(this);
    }

    public C3483e(Context context, C3469a<O> aVar, O o, C3484a aVar2) {
        this(context, (Activity) null, aVar, o, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3483e(android.content.Context r2, com.google.android.gms.common.api.C3469a<O> r3, O r4, com.google.android.gms.common.api.internal.C3566p r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.mo11215b(r5)
            com.google.android.gms.common.api.e$a r5 = r0.mo11214a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.C3483e.C3484a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C3483e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.p):void");
    }

    /* renamed from: n */
    private final <A extends C3469a.C3471b, T extends C3511d<? extends C3612k, A>> T m13535n(int i, T t) {
        t.mo11243l();
        this.f9846j.mo11310E(this, i, t);
        return t;
    }

    /* renamed from: o */
    private final <TResult, A extends C3469a.C3471b> C8963l<TResult> m13536o(int i, C3574r<A, TResult> rVar) {
        C8965m mVar = new C8965m();
        this.f9846j.mo11311F(this, i, rVar, mVar, this.f9845i);
        return mVar.mo22782a();
    }

    /* renamed from: b */
    public C3486f mo11202b() {
        return this.f9844h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C3659d.C3660a mo11203c() {
        Account account;
        GoogleSignInAccount b;
        GoogleSignInAccount b2;
        C3659d.C3660a aVar = new C3659d.C3660a();
        O o = this.f9840d;
        if (!(o instanceof C3469a.C3473d.C3475b) || (b2 = ((C3469a.C3473d.C3475b) o).mo11183b()) == null) {
            O o2 = this.f9840d;
            account = o2 instanceof C3469a.C3473d.C3474a ? ((C3469a.C3473d.C3474a) o2).mo11182j() : null;
        } else {
            account = b2.mo11074j();
        }
        aVar.mo11583d(account);
        O o3 = this.f9840d;
        aVar.mo11582c((!(o3 instanceof C3469a.C3473d.C3475b) || (b = ((C3469a.C3473d.C3475b) o3).mo11183b()) == null) ? Collections.emptySet() : b.mo11068I());
        aVar.mo11584e(this.f9837a.getClass().getName());
        aVar.mo11581b(this.f9837a.getPackageName());
        return aVar;
    }

    /* renamed from: d */
    public <TResult, A extends C3469a.C3471b> C8963l<TResult> mo11204d(C3574r<A, TResult> rVar) {
        return m13536o(2, rVar);
    }

    /* renamed from: e */
    public <A extends C3469a.C3471b, T extends C3511d<? extends C3612k, A>> T mo11205e(T t) {
        m13535n(1, t);
        return t;
    }

    /* renamed from: f */
    public <TResult, A extends C3469a.C3471b> C8963l<TResult> mo11206f(C3574r<A, TResult> rVar) {
        return m13536o(1, rVar);
    }

    /* renamed from: g */
    public final C3500b<O> mo11207g() {
        return this.f9841e;
    }

    /* renamed from: h */
    public Context mo11208h() {
        return this.f9837a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo11209i() {
        return this.f9838b;
    }

    /* renamed from: j */
    public Looper mo11210j() {
        return this.f9842f;
    }

    /* renamed from: k */
    public final int mo11211k() {
        return this.f9843g;
    }

    /* renamed from: l */
    public final C3469a.C3478f mo11212l(Looper looper, C3528g1<O> g1Var) {
        Looper looper2 = looper;
        C3469a.C3478f c = ((C3469a.C3470a) C3705r.m14346k(this.f9839c.mo11176a())).mo11180c(this.f9837a, looper2, mo11203c().mo11580a(), this.f9840d, g1Var, g1Var);
        String i = mo11209i();
        if (i != null && (c instanceof C3651c)) {
            ((C3651c) c).mo11542U(i);
        }
        if (i != null && (c instanceof C3546k)) {
            ((C3546k) c).mo11380w(i);
        }
        return c;
    }

    /* renamed from: m */
    public final C3509c2 mo11213m(Context context, Handler handler) {
        return new C3509c2(context, handler, mo11203c().mo11580a());
    }
}
