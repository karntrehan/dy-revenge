package com.google.firebase.crashlytics.p139h;

import com.google.firebase.crashlytics.p139h.p144l.C4703c0;
import com.google.firebase.p162p.C4925a;
import com.google.firebase.p162p.C4927b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.crashlytics.h.d */
public final class C4536d implements C4535c {

    /* renamed from: a */
    private static final C4543g f12868a = new C4538b();

    /* renamed from: b */
    private final C4925a<C4535c> f12869b;

    /* renamed from: c */
    private final AtomicReference<C4535c> f12870c = new AtomicReference<>((Object) null);

    /* renamed from: com.google.firebase.crashlytics.h.d$b */
    private static final class C4538b implements C4543g {
        private C4538b() {
        }

        /* renamed from: a */
        public File mo14096a() {
            return null;
        }

        /* renamed from: b */
        public File mo14097b() {
            return null;
        }

        /* renamed from: c */
        public File mo14098c() {
            return null;
        }

        /* renamed from: d */
        public File mo14099d() {
            return null;
        }

        /* renamed from: e */
        public File mo14100e() {
            return null;
        }

        /* renamed from: f */
        public File mo14101f() {
            return null;
        }
    }

    public C4536d(C4925a<C4535c> aVar) {
        this.f12869b = aVar;
        aVar.mo14011a(new C4533a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void mo14095f(C4927b bVar) {
        C4542f.m17259f().mo14104b("Crashlytics native component now available.");
        this.f12870c.set((C4535c) bVar.get());
    }

    /* renamed from: a */
    public C4543g mo14091a(String str) {
        C4535c cVar = this.f12870c.get();
        return cVar == null ? f12868a : cVar.mo14091a(str);
    }

    /* renamed from: b */
    public boolean mo14092b() {
        C4535c cVar = this.f12870c.get();
        return cVar != null && cVar.mo14092b();
    }

    /* renamed from: c */
    public void mo14093c(String str, String str2, long j, C4703c0 c0Var) {
        C4542f f = C4542f.m17259f();
        f.mo14110i("Deferring native open session: " + str);
        this.f12869b.mo14011a(new C4534b(str, str2, j, c0Var));
    }

    /* renamed from: d */
    public boolean mo14094d(String str) {
        C4535c cVar = this.f12870c.get();
        return cVar != null && cVar.mo14094d(str);
    }
}
