package com.google.firebase.crashlytics.p139h.p143k;

import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import java.io.File;

/* renamed from: com.google.firebase.crashlytics.h.k.e */
public class C4618e {

    /* renamed from: a */
    private static final C4620b f13067a = new C4620b();

    /* renamed from: b */
    private final C4782f f13068b;

    /* renamed from: c */
    private C4616c f13069c;

    /* renamed from: com.google.firebase.crashlytics.h.k.e$b */
    private static final class C4620b implements C4616c {
        private C4620b() {
        }

        /* renamed from: a */
        public void mo14238a() {
        }

        /* renamed from: b */
        public String mo14239b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo14240c() {
            return null;
        }

        /* renamed from: d */
        public void mo14241d() {
        }

        /* renamed from: e */
        public void mo14242e(long j, String str) {
        }
    }

    public C4618e(C4782f fVar) {
        this.f13068b = fVar;
        this.f13069c = f13067a;
    }

    public C4618e(C4782f fVar, String str) {
        this(fVar);
        mo14249e(str);
    }

    /* renamed from: d */
    private File m17568d(String str) {
        return this.f13068b.mo14683o(str, "userlog");
    }

    /* renamed from: a */
    public void mo14246a() {
        this.f13069c.mo14241d();
    }

    /* renamed from: b */
    public byte[] mo14247b() {
        return this.f13069c.mo14240c();
    }

    /* renamed from: c */
    public String mo14248c() {
        return this.f13069c.mo14239b();
    }

    /* renamed from: e */
    public final void mo14249e(String str) {
        this.f13069c.mo14238a();
        this.f13069c = f13067a;
        if (str != null) {
            mo14250f(m17568d(str), 65536);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo14250f(File file, int i) {
        this.f13069c = new C4628h(file, i);
    }

    /* renamed from: g */
    public void mo14251g(long j, String str) {
        this.f13069c.mo14242e(j, str);
    }
}
