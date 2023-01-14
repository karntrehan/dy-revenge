package androidx.camera.extensions.p017f;

import androidx.camera.core.C0949o2;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* renamed from: androidx.camera.extensions.f.j */
public abstract class C1040j {

    /* renamed from: a */
    private static volatile C1040j f2913a;

    /* renamed from: androidx.camera.extensions.f.j$a */
    private static class C1041a extends C1040j {
        C1041a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1051o mo3335c() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo3336e() {
            return false;
        }
    }

    /* renamed from: androidx.camera.extensions.f.j$b */
    private static class C1042b extends C1040j {

        /* renamed from: b */
        private static ExtensionVersionImpl f2914b;

        /* renamed from: c */
        private C1051o f2915c;

        C1042b() {
            if (f2914b == null) {
                f2914b = new ExtensionVersionImpl();
            }
            C1051o D = C1051o.m4061D(f2914b.checkApiVersion(C1052p.m4069a().mo3347c()));
            if (D != null && C1052p.m4069a().mo3346b().mo3329z() == D.mo3329z()) {
                this.f2915c = D;
            }
            C0949o2.m3688a("ExtenderVersion", "Selected vendor runtime: " + this.f2915c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1051o mo3335c() {
            return this.f2915c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo3336e() {
            try {
                return f2914b.isAdvancedExtenderImplemented();
            } catch (NoSuchMethodError unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    private static C1040j m4028a() {
        if (f2913a != null) {
            return f2913a;
        }
        synchronized (C1040j.class) {
            if (f2913a == null) {
                try {
                    f2913a = new C1042b();
                } catch (NoClassDefFoundError unused) {
                    C0949o2.m3688a("ExtenderVersion", "No versioning extender found. Falling back to default.");
                    f2913a = new C1041a();
                }
            }
        }
        return f2913a;
    }

    /* renamed from: b */
    public static C1051o m4029b() {
        return m4028a().mo3335c();
    }

    /* renamed from: d */
    public static boolean m4030d() {
        return m4028a().mo3336e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C1051o mo3335c();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract boolean mo3336e();
}
