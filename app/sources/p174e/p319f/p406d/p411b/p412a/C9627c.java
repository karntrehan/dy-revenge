package p174e.p319f.p406d.p411b.p412a;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3697p;
import java.util.concurrent.Executor;

/* renamed from: e.f.d.b.a.c */
public class C9627c {

    /* renamed from: a */
    private final int f25741a;

    /* renamed from: b */
    private final Executor f25742b;

    /* renamed from: e.f.d.b.a.c$a */
    public static class C9628a {

        /* renamed from: a */
        private int f25743a = 0;

        /* renamed from: b */
        private Executor f25744b;

        /* renamed from: a */
        public C9627c mo24125a() {
            return new C9627c(this.f25743a, this.f25744b, (C9630e) null);
        }

        /* renamed from: b */
        public C9628a mo24126b(int i, @RecentlyNonNull int... iArr) {
            this.f25743a = i;
            if (iArr != null) {
                for (int i2 : iArr) {
                    this.f25743a = i2 | this.f25743a;
                }
            }
            return this;
        }
    }

    /* synthetic */ C9627c(int i, Executor executor, C9630e eVar) {
        this.f25741a = i;
        this.f25742b = executor;
    }

    /* renamed from: a */
    public final int mo24121a() {
        return this.f25741a;
    }

    @RecentlyNullable
    /* renamed from: b */
    public final Executor mo24122b() {
        return this.f25742b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9627c)) {
            return false;
        }
        C9627c cVar = (C9627c) obj;
        return this.f25741a == cVar.f25741a && C3697p.m14323b(this.f25742b, cVar.f25742b);
    }

    public int hashCode() {
        return C3697p.m14324c(Integer.valueOf(this.f25741a), this.f25742b);
    }
}
