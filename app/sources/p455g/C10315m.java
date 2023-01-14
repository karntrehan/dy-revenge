package p455g;

import java.io.Serializable;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.m */
public final class C10315m<T> implements Serializable {

    /* renamed from: f */
    public static final C10316a f27541f = new C10316a((C10452g) null);

    /* renamed from: g.m$a */
    public static final class C10316a {
        private C10316a() {
        }

        public /* synthetic */ C10316a(C10452g gVar) {
            this();
        }
    }

    /* renamed from: g.m$b */
    public static final class C10317b implements Serializable {

        /* renamed from: f */
        public final Throwable f27542f;

        public C10317b(Throwable th) {
            C10457l.m35320e(th, "exception");
            this.f27542f = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C10317b) && C10457l.m35316a(this.f27542f, ((C10317b) obj).f27542f);
        }

        public int hashCode() {
            return this.f27542f.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f27542f + ')';
        }
    }

    /* renamed from: a */
    public static <T> Object m35012a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m35013b(Object obj) {
        if (obj instanceof C10317b) {
            return ((C10317b) obj).f27542f;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m35014c(Object obj) {
        return obj instanceof C10317b;
    }

    /* renamed from: d */
    public static final boolean m35015d(Object obj) {
        return !(obj instanceof C10317b);
    }
}
