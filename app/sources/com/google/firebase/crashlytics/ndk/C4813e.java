package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.p139h.C4535c;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.C4543g;
import com.google.firebase.crashlytics.p139h.p144l.C4703c0;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;

/* renamed from: com.google.firebase.crashlytics.ndk.e */
class C4813e implements C4535c {

    /* renamed from: a */
    private static C4813e f13558a;

    /* renamed from: b */
    private final C4812d f13559b;

    /* renamed from: c */
    private boolean f13560c;

    /* renamed from: d */
    private String f13561d;

    /* renamed from: e */
    private C4814a f13562e;

    /* renamed from: com.google.firebase.crashlytics.ndk.e$a */
    private interface C4814a {
        /* renamed from: a */
        void mo14708a();
    }

    C4813e(C4812d dVar, boolean z) {
        this.f13559b = dVar;
        this.f13560c = z;
    }

    /* renamed from: e */
    static C4813e m18390e(Context context, boolean z) {
        C4813e eVar = new C4813e(new C4812d(context, new JniNativeApi(context), new C4782f(context)), z);
        f13558a = eVar;
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void mo14717g(String str, String str2, long j, C4703c0 c0Var) {
        C4542f f = C4542f.m17259f();
        f.mo14104b("Initializing native session: " + str);
        if (!this.f13559b.mo14712d(str, str2, j, c0Var)) {
            C4542f f2 = C4542f.m17259f();
            f2.mo14112k("Failed to initialize Crashlytics NDK for session " + str);
        }
    }

    /* renamed from: a */
    public C4543g mo14091a(String str) {
        return new C4819h(this.f13559b.mo14710a(str));
    }

    /* renamed from: b */
    public boolean mo14092b() {
        String str = this.f13561d;
        return str != null && mo14094d(str);
    }

    /* renamed from: c */
    public synchronized void mo14093c(String str, String str2, long j, C4703c0 c0Var) {
        this.f13561d = str;
        C4810b bVar = new C4810b(this, str, str2, j, c0Var);
        this.f13562e = bVar;
        if (this.f13560c) {
            bVar.mo14708a();
        }
    }

    /* renamed from: d */
    public boolean mo14094d(String str) {
        return this.f13559b.mo14711c(str);
    }
}
