package p027c.p043d.p044a;

import androidx.core.util.C1177h;
import java.io.File;
import p027c.p043d.p044a.C1546i0;

/* renamed from: c.d.a.s0 */
public final class C1710s0 extends C1721v0 {

    /* renamed from: a */
    private final C1712b f5121a;

    /* renamed from: c.d.a.s0$a */
    public static final class C1711a {

        /* renamed from: a */
        private final C1712b.C1713a f5122a;

        public C1711a(File file) {
            C1712b.C1713a c = new C1546i0.C1548b().mo5690c(0);
            this.f5122a = c;
            C1177h.m4584f(file, "File can't be null.");
            c.mo5689b(file);
        }

        /* renamed from: a */
        public C1710s0 mo5944a() {
            return new C1710s0(this.f5122a.mo5688a());
        }
    }

    /* renamed from: c.d.a.s0$b */
    static abstract class C1712b {

        /* renamed from: c.d.a.s0$b$a */
        static abstract class C1713a {
            C1713a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public abstract C1712b mo5688a();

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public abstract C1713a mo5689b(File file);
        }

        C1712b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract File mo5683a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo5684b();
    }

    C1710s0(C1712b bVar) {
        C1177h.m4584f(bVar, "FileOutputOptionsInternal can't be null.");
        this.f5121a = bVar;
    }

    /* renamed from: a */
    public long mo5934a() {
        return this.f5121a.mo5684b();
    }

    /* renamed from: b */
    public File mo5940b() {
        return this.f5121a.mo5683a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1710s0)) {
            return false;
        }
        return this.f5121a.equals(((C1710s0) obj).f5121a);
    }

    public int hashCode() {
        return this.f5121a.hashCode();
    }

    public String toString() {
        return this.f5121a.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
