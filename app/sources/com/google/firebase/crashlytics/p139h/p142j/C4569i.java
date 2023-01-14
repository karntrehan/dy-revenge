package com.google.firebase.crashlytics.p139h.p142j;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.io.File;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.h.j.i */
final class C4569i extends C4603t {

    /* renamed from: a */
    private final C4655a0 f12917a;

    /* renamed from: b */
    private final String f12918b;

    /* renamed from: c */
    private final File f12919c;

    C4569i(C4655a0 a0Var, String str, File file) {
        Objects.requireNonNull(a0Var, "Null report");
        this.f12917a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f12918b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f12919c = file;
    }

    /* renamed from: b */
    public C4655a0 mo14143b() {
        return this.f12917a;
    }

    /* renamed from: c */
    public File mo14144c() {
        return this.f12919c;
    }

    /* renamed from: d */
    public String mo14145d() {
        return this.f12918b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4603t)) {
            return false;
        }
        C4603t tVar = (C4603t) obj;
        return this.f12917a.equals(tVar.mo14143b()) && this.f12918b.equals(tVar.mo14145d()) && this.f12919c.equals(tVar.mo14144c());
    }

    public int hashCode() {
        return ((((this.f12917a.hashCode() ^ 1000003) * 1000003) ^ this.f12918b.hashCode()) * 1000003) ^ this.f12919c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f12917a + ", sessionId=" + this.f12918b + ", reportFile=" + this.f12919c + "}";
    }
}
