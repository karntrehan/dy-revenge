package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4703c0;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.h.l.w */
final class C4770w extends C4703c0 {

    /* renamed from: a */
    private final C4703c0.C4704a f13429a;

    /* renamed from: b */
    private final C4703c0.C4706c f13430b;

    /* renamed from: c */
    private final C4703c0.C4705b f13431c;

    C4770w(C4703c0.C4704a aVar, C4703c0.C4706c cVar, C4703c0.C4705b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f13429a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f13430b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f13431c = bVar;
    }

    /* renamed from: a */
    public C4703c0.C4704a mo14558a() {
        return this.f13429a;
    }

    /* renamed from: c */
    public C4703c0.C4705b mo14559c() {
        return this.f13431c;
    }

    /* renamed from: d */
    public C4703c0.C4706c mo14560d() {
        return this.f13430b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4703c0)) {
            return false;
        }
        C4703c0 c0Var = (C4703c0) obj;
        return this.f13429a.equals(c0Var.mo14558a()) && this.f13430b.equals(c0Var.mo14560d()) && this.f13431c.equals(c0Var.mo14559c());
    }

    public int hashCode() {
        return ((((this.f13429a.hashCode() ^ 1000003) * 1000003) ^ this.f13430b.hashCode()) * 1000003) ^ this.f13431c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f13429a + ", osData=" + this.f13430b + ", deviceData=" + this.f13431c + "}";
    }
}
