package androidx.camera.core;

import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.a2 */
public final class C0606a2 {

    /* renamed from: a */
    private final List<C0958q2> f1970a;

    /* renamed from: b */
    private final List<C0958q2> f1971b;

    /* renamed from: c */
    private final List<C0958q2> f1972c;

    /* renamed from: d */
    private final long f1973d;

    /* renamed from: androidx.camera.core.a2$a */
    public static class C0607a {

        /* renamed from: a */
        final List<C0958q2> f1974a = new ArrayList();

        /* renamed from: b */
        final List<C0958q2> f1975b = new ArrayList();

        /* renamed from: c */
        final List<C0958q2> f1976c = new ArrayList();

        /* renamed from: d */
        long f1977d = 5000;

        public C0607a(C0958q2 q2Var, int i) {
            mo2555a(q2Var, i);
        }

        /* renamed from: a */
        public C0607a mo2555a(C0958q2 q2Var, int i) {
            boolean z = false;
            C1177h.m4580b(q2Var != null, "Point cannot be null.");
            if (i >= 1 && i <= 7) {
                z = true;
            }
            C1177h.m4580b(z, "Invalid metering mode " + i);
            if ((i & 1) != 0) {
                this.f1974a.add(q2Var);
            }
            if ((i & 2) != 0) {
                this.f1975b.add(q2Var);
            }
            if ((i & 4) != 0) {
                this.f1976c.add(q2Var);
            }
            return this;
        }

        /* renamed from: b */
        public C0606a2 mo2556b() {
            return new C0606a2(this);
        }

        /* renamed from: c */
        public C0607a mo2557c(long j, TimeUnit timeUnit) {
            C1177h.m4580b(j >= 1, "autoCancelDuration must be at least 1");
            this.f1977d = timeUnit.toMillis(j);
            return this;
        }
    }

    C0606a2(C0607a aVar) {
        this.f1970a = Collections.unmodifiableList(aVar.f1974a);
        this.f1971b = Collections.unmodifiableList(aVar.f1975b);
        this.f1972c = Collections.unmodifiableList(aVar.f1976c);
        this.f1973d = aVar.f1977d;
    }

    /* renamed from: a */
    public long mo2550a() {
        return this.f1973d;
    }

    /* renamed from: b */
    public List<C0958q2> mo2551b() {
        return this.f1971b;
    }

    /* renamed from: c */
    public List<C0958q2> mo2552c() {
        return this.f1970a;
    }

    /* renamed from: d */
    public List<C0958q2> mo2553d() {
        return this.f1972c;
    }

    /* renamed from: e */
    public boolean mo2554e() {
        return this.f1973d > 0;
    }
}
