package com.google.firebase.p164r;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.r.e */
public class C4933e {

    /* renamed from: a */
    private static volatile C4933e f13792a;

    /* renamed from: b */
    private final Set<C4935g> f13793b = new HashSet();

    C4933e() {
    }

    /* renamed from: a */
    public static C4933e m18800a() {
        C4933e eVar = f13792a;
        if (eVar == null) {
            synchronized (C4933e.class) {
                eVar = f13792a;
                if (eVar == null) {
                    eVar = new C4933e();
                    f13792a = eVar;
                }
            }
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<C4935g> mo14943b() {
        Set<C4935g> unmodifiableSet;
        synchronized (this.f13793b) {
            unmodifiableSet = Collections.unmodifiableSet(this.f13793b);
        }
        return unmodifiableSet;
    }
}
