package p174e.p319f.p406d.p411b.p414c;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3697p;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p335c.p345f.p356k.C8054vb;
import p174e.p319f.p320a.p335c.p345f.p356k.C8067wb;

/* renamed from: e.f.d.b.c.e */
public class C9637e {

    /* renamed from: a */
    private final int f25765a;

    /* renamed from: b */
    private final int f25766b;

    /* renamed from: c */
    private final int f25767c;

    /* renamed from: d */
    private final int f25768d;

    /* renamed from: e */
    private final boolean f25769e;

    /* renamed from: f */
    private final float f25770f;

    /* renamed from: g */
    private final Executor f25771g;

    /* renamed from: e.f.d.b.c.e$a */
    public static class C9638a {

        /* renamed from: a */
        private int f25772a = 1;

        /* renamed from: b */
        private int f25773b = 1;

        /* renamed from: c */
        private int f25774c = 1;

        /* renamed from: d */
        private int f25775d = 1;

        /* renamed from: e */
        private boolean f25776e = false;

        /* renamed from: f */
        private float f25777f = 0.1f;

        /* renamed from: g */
        private Executor f25778g;

        /* renamed from: a */
        public C9637e mo24166a() {
            return new C9637e(this.f25772a, this.f25773b, this.f25774c, this.f25775d, this.f25776e, this.f25777f, this.f25778g, (C9640g) null);
        }

        /* renamed from: b */
        public C9638a mo24167b() {
            this.f25776e = true;
            return this;
        }

        /* renamed from: c */
        public C9638a mo24168c(int i) {
            this.f25774c = i;
            return this;
        }

        /* renamed from: d */
        public C9638a mo24169d(int i) {
            this.f25773b = i;
            return this;
        }

        /* renamed from: e */
        public C9638a mo24170e(int i) {
            this.f25772a = i;
            return this;
        }

        /* renamed from: f */
        public C9638a mo24171f(float f) {
            this.f25777f = f;
            return this;
        }

        /* renamed from: g */
        public C9638a mo24172g(int i) {
            this.f25775d = i;
            return this;
        }
    }

    /* synthetic */ C9637e(int i, int i2, int i3, int i4, boolean z, float f, Executor executor, C9640g gVar) {
        this.f25765a = i;
        this.f25766b = i2;
        this.f25767c = i3;
        this.f25768d = i4;
        this.f25769e = z;
        this.f25770f = f;
        this.f25771g = executor;
    }

    /* renamed from: a */
    public final float mo24156a() {
        return this.f25770f;
    }

    /* renamed from: b */
    public final int mo24157b() {
        return this.f25767c;
    }

    /* renamed from: c */
    public final int mo24158c() {
        return this.f25766b;
    }

    /* renamed from: d */
    public final int mo24159d() {
        return this.f25765a;
    }

    /* renamed from: e */
    public final int mo24160e() {
        return this.f25768d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9637e)) {
            return false;
        }
        C9637e eVar = (C9637e) obj;
        return Float.floatToIntBits(this.f25770f) == Float.floatToIntBits(eVar.f25770f) && C3697p.m14323b(Integer.valueOf(this.f25765a), Integer.valueOf(eVar.f25765a)) && C3697p.m14323b(Integer.valueOf(this.f25766b), Integer.valueOf(eVar.f25766b)) && C3697p.m14323b(Integer.valueOf(this.f25768d), Integer.valueOf(eVar.f25768d)) && C3697p.m14323b(Boolean.valueOf(this.f25769e), Boolean.valueOf(eVar.f25769e)) && C3697p.m14323b(Integer.valueOf(this.f25767c), Integer.valueOf(eVar.f25767c)) && C3697p.m14323b(this.f25771g, eVar.f25771g);
    }

    @RecentlyNullable
    /* renamed from: f */
    public final Executor mo24162f() {
        return this.f25771g;
    }

    /* renamed from: g */
    public final boolean mo24163g() {
        return this.f25769e;
    }

    public int hashCode() {
        return C3697p.m14324c(Integer.valueOf(Float.floatToIntBits(this.f25770f)), Integer.valueOf(this.f25765a), Integer.valueOf(this.f25766b), Integer.valueOf(this.f25768d), Boolean.valueOf(this.f25769e), Integer.valueOf(this.f25767c), this.f25771g);
    }

    @RecentlyNonNull
    public String toString() {
        C8054vb a = C8067wb.m28281a("FaceDetectorOptions");
        a.mo21626b("landmarkMode", this.f25765a);
        a.mo21626b("contourMode", this.f25766b);
        a.mo21626b("classificationMode", this.f25767c);
        a.mo21626b("performanceMode", this.f25768d);
        a.mo21628d("trackingEnabled", this.f25769e);
        a.mo21625a("minFaceSize", this.f25770f);
        return a.toString();
    }
}
