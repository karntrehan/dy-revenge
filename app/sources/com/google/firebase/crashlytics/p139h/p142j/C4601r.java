package com.google.firebase.crashlytics.p139h.p142j;

import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.firebase.crashlytics.h.j.r */
class C4601r {

    /* renamed from: a */
    private final String f13024a;

    /* renamed from: b */
    private final C4782f f13025b;

    public C4601r(String str, C4782f fVar) {
        this.f13024a = str;
        this.f13025b = fVar;
    }

    /* renamed from: b */
    private File m17499b() {
        return this.f13025b.mo14674e(this.f13024a);
    }

    /* renamed from: a */
    public boolean mo14220a() {
        try {
            return m17499b().createNewFile();
        } catch (IOException e) {
            C4542f f = C4542f.m17259f();
            f.mo14107e("Error creating marker: " + this.f13024a, e);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo14221c() {
        return m17499b().exists();
    }

    /* renamed from: d */
    public boolean mo14222d() {
        return m17499b().delete();
    }
}
