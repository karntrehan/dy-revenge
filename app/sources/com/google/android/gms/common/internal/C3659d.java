package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p027c.p060f.C1790b;
import p174e.p319f.p320a.p335c.p360g.C8921a;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C3659d {

    /* renamed from: a */
    private final Account f10259a;

    /* renamed from: b */
    private final Set<Scope> f10260b;

    /* renamed from: c */
    private final Set<Scope> f10261c;

    /* renamed from: d */
    private final Map<C3469a<?>, C3664e0> f10262d;

    /* renamed from: e */
    private final int f10263e;

    /* renamed from: f */
    private final View f10264f;

    /* renamed from: g */
    private final String f10265g;

    /* renamed from: h */
    private final String f10266h;

    /* renamed from: i */
    private final C8921a f10267i;

    /* renamed from: j */
    private Integer f10268j;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class C3660a {

        /* renamed from: a */
        private Account f10269a;

        /* renamed from: b */
        private C1790b<Scope> f10270b;

        /* renamed from: c */
        private String f10271c;

        /* renamed from: d */
        private String f10272d;

        /* renamed from: e */
        private C8921a f10273e = C8921a.f24313f;

        /* renamed from: a */
        public C3659d mo11580a() {
            return new C3659d(this.f10269a, this.f10270b, (Map<C3469a<?>, C3664e0>) null, 0, (View) null, this.f10271c, this.f10272d, this.f10273e, false);
        }

        /* renamed from: b */
        public C3660a mo11581b(String str) {
            this.f10271c = str;
            return this;
        }

        /* renamed from: c */
        public final C3660a mo11582c(Collection<Scope> collection) {
            if (this.f10270b == null) {
                this.f10270b = new C1790b<>();
            }
            this.f10270b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final C3660a mo11583d(Account account) {
            this.f10269a = account;
            return this;
        }

        /* renamed from: e */
        public final C3660a mo11584e(String str) {
            this.f10272d = str;
            return this;
        }
    }

    public C3659d(Account account, Set<Scope> set, Map<C3469a<?>, C3664e0> map, int i, View view, String str, String str2, C8921a aVar, boolean z) {
        this.f10259a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f10260b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f10262d = map;
        this.f10264f = view;
        this.f10263e = i;
        this.f10265g = str;
        this.f10266h = str2;
        this.f10267i = aVar == null ? C8921a.f24313f : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (C3664e0 e0Var : map.values()) {
            hashSet.addAll(e0Var.f10284a);
        }
        this.f10261c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account mo11568a() {
        return this.f10259a;
    }

    @Deprecated
    /* renamed from: b */
    public String mo11569b() {
        Account account = this.f10259a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account mo11570c() {
        Account account = this.f10259a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public Set<Scope> mo11571d() {
        return this.f10261c;
    }

    /* renamed from: e */
    public Set<Scope> mo11572e(C3469a<?> aVar) {
        C3664e0 e0Var = this.f10262d.get(aVar);
        if (e0Var == null || e0Var.f10284a.isEmpty()) {
            return this.f10260b;
        }
        HashSet hashSet = new HashSet(this.f10260b);
        hashSet.addAll(e0Var.f10284a);
        return hashSet;
    }

    /* renamed from: f */
    public String mo11573f() {
        return this.f10265g;
    }

    /* renamed from: g */
    public Set<Scope> mo11574g() {
        return this.f10260b;
    }

    /* renamed from: h */
    public final C8921a mo11575h() {
        return this.f10267i;
    }

    /* renamed from: i */
    public final Integer mo11576i() {
        return this.f10268j;
    }

    /* renamed from: j */
    public final String mo11577j() {
        return this.f10266h;
    }

    /* renamed from: k */
    public final Map<C3469a<?>, C3664e0> mo11578k() {
        return this.f10262d;
    }

    /* renamed from: l */
    public final void mo11579l(Integer num) {
        this.f10268j = num;
    }
}
