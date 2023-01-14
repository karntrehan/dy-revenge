package androidx.camera.camera2.p003e.p004j3.p005r0;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* renamed from: androidx.camera.camera2.e.j3.r0.a */
public final class C0431a {

    /* renamed from: a */
    private final C0434c f1564a;

    /* renamed from: androidx.camera.camera2.e.j3.r0.a$a */
    private static class C0432a implements C0434c {

        /* renamed from: a */
        private final InputConfiguration f1565a;

        C0432a(Object obj) {
            this.f1565a = (InputConfiguration) obj;
        }

        /* renamed from: b */
        public Object mo2165b() {
            return this.f1565a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0434c)) {
                return false;
            }
            return Objects.equals(this.f1565a, ((C0434c) obj).mo2165b());
        }

        public int hashCode() {
            return this.f1565a.hashCode();
        }

        public String toString() {
            return this.f1565a.toString();
        }
    }

    /* renamed from: androidx.camera.camera2.e.j3.r0.a$b */
    private static final class C0433b extends C0432a {
        C0433b(Object obj) {
            super(obj);
        }
    }

    /* renamed from: androidx.camera.camera2.e.j3.r0.a$c */
    private interface C0434c {
        /* renamed from: b */
        Object mo2165b();
    }

    private C0431a(C0434c cVar) {
        this.f1564a = cVar;
    }

    /* renamed from: b */
    public static C0431a m1905b(Object obj) {
        int i;
        if (obj != null && (i = Build.VERSION.SDK_INT) >= 23) {
            return i >= 31 ? new C0431a(new C0433b(obj)) : new C0431a(new C0432a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Object mo2161a() {
        return this.f1564a.mo2165b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0431a)) {
            return false;
        }
        return this.f1564a.equals(((C0431a) obj).f1564a);
    }

    public int hashCode() {
        return this.f1564a.hashCode();
    }

    public String toString() {
        return this.f1564a.toString();
    }
}
