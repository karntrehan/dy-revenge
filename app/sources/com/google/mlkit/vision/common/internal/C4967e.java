package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.internal.C3705r;
import com.google.firebase.p162p.C4927b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.mlkit.vision.common.internal.e */
public class C4967e {

    /* renamed from: a */
    private final Map<Class<?>, C4927b<?>> f13856a = new HashMap();

    /* renamed from: com.google.mlkit.vision.common.internal.e$a */
    public static class C4968a {

        /* renamed from: a */
        private final Class<?> f13857a;

        /* renamed from: b */
        private final C4927b<?> f13858b;

        /* renamed from: c */
        private final int f13859c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo14984a() {
            return this.f13859c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C4927b<?> mo14985b() {
            return this.f13858b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final Class<?> mo14986c() {
            return this.f13857a;
        }
    }

    C4967e(Set<C4968a> set) {
        HashMap hashMap = new HashMap();
        for (C4968a next : set) {
            Class<?> c = next.mo14986c();
            if (!this.f13856a.containsKey(c) || next.mo14984a() >= ((Integer) C3705r.m14346k((Integer) hashMap.get(c))).intValue()) {
                this.f13856a.put(c, next.mo14985b());
                hashMap.put(c, Integer.valueOf(next.mo14984a()));
            }
        }
    }
}
