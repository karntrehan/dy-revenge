package com.mrousavy.camera.frameprocessor;

import p455g.C10323s;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.frameprocessor.d */
public final class C5151d {

    /* renamed from: a */
    private final C10419a<C10323s> f14644a;

    public C5151d(C10419a<C10323s> aVar) {
        C10457l.m35320e(aVar, "endPerformanceSampleCollection");
        this.f14644a = aVar;
    }

    /* renamed from: a */
    public final C10419a<C10323s> mo15768a() {
        return this.f14644a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5151d) && C10457l.m35316a(this.f14644a, ((C5151d) obj).f14644a);
    }

    public int hashCode() {
        return this.f14644a.hashCode();
    }

    public String toString() {
        return "PerformanceSampleCollection(endPerformanceSampleCollection=" + this.f14644a + ')';
    }
}
