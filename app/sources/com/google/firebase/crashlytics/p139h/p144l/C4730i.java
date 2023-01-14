package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;

/* renamed from: com.google.firebase.crashlytics.h.l.i */
final class C4730i extends C4655a0.C4665e.C4666a.C4668b {

    /* renamed from: a */
    private final String f13316a;

    /* renamed from: a */
    public String mo14384a() {
        return this.f13316a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4655a0.C4665e.C4666a.C4668b) {
            return this.f13316a.equals(((C4655a0.C4665e.C4666a.C4668b) obj).mo14384a());
        }
        return false;
    }

    public int hashCode() {
        return this.f13316a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f13316a + "}";
    }
}
