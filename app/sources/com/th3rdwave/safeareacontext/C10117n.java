package com.th3rdwave.safeareacontext;

import java.util.EnumSet;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.th3rdwave.safeareacontext.n */
public final class C10117n {

    /* renamed from: a */
    private final C10107e f26962a;

    /* renamed from: b */
    private final C10118o f26963b;

    /* renamed from: c */
    private final EnumSet<C10116m> f26964c;

    public C10117n(C10107e eVar, C10118o oVar, EnumSet<C10116m> enumSet) {
        C10457l.m35320e(eVar, "insets");
        C10457l.m35320e(oVar, "mode");
        C10457l.m35320e(enumSet, "edges");
        this.f26962a = eVar;
        this.f26963b = oVar;
        this.f26964c = enumSet;
    }

    /* renamed from: a */
    public final EnumSet<C10116m> mo25184a() {
        return this.f26964c;
    }

    /* renamed from: b */
    public final C10107e mo25185b() {
        return this.f26962a;
    }

    /* renamed from: c */
    public final C10118o mo25186c() {
        return this.f26963b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10117n)) {
            return false;
        }
        C10117n nVar = (C10117n) obj;
        return C10457l.m35316a(this.f26962a, nVar.f26962a) && this.f26963b == nVar.f26963b && C10457l.m35316a(this.f26964c, nVar.f26964c);
    }

    public int hashCode() {
        return (((this.f26962a.hashCode() * 31) + this.f26963b.hashCode()) * 31) + this.f26964c.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f26962a + ", mode=" + this.f26963b + ", edges=" + this.f26964c + ')';
    }
}
