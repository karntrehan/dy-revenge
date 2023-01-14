package p027c.p043d.p044a;

import android.annotation.SuppressLint;
import androidx.core.util.C1170a;
import java.util.Objects;
import p027c.p043d.p044a.C1556j0;
import p027c.p043d.p044a.C1559j1;
import p027c.p043d.p044a.p046l1.p050o.C1673w0;

/* renamed from: c.d.a.t0 */
public abstract class C1715t0 {

    /* renamed from: c.d.a.t0$a */
    public static abstract class C1716a {
        C1716a() {
        }

        /* renamed from: a */
        public abstract C1715t0 mo5704a();

        /* renamed from: b */
        public C1716a mo5946b(C1170a<C1559j1.C1560a> aVar) {
            C1559j1.C1560a f = mo5705c().mo5713f();
            aVar.mo2687a(f);
            mo5708f(f.mo5714a());
            return this;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"KotlinPropertyAccess"})
        /* renamed from: c */
        public abstract C1559j1 mo5705c();

        /* renamed from: d */
        public abstract C1716a mo5706d(C1521d0 d0Var);

        /* renamed from: e */
        public abstract C1716a mo5707e(int i);

        /* renamed from: f */
        public abstract C1716a mo5708f(C1559j1 j1Var);
    }

    C1715t0() {
    }

    /* renamed from: a */
    public static C1716a m7347a() {
        return new C1556j0.C1558b().mo5707e(-1).mo5706d(C1521d0.m6805a().mo5639a()).mo5708f(C1559j1.m6930a().mo5714a());
    }

    /* renamed from: e */
    static String m7348e(int i) {
        return i != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    /* renamed from: f */
    static int m7349f(int i) {
        if (Objects.equals(m7348e(i), "audio/mp4a-latm")) {
            return 2;
        }
        return C1673w0.f5020a;
    }

    /* renamed from: g */
    static int m7350g(int i) {
        return i != 1 ? 0 : 1;
    }

    /* renamed from: h */
    static String m7351h(int i) {
        return i != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    /* renamed from: b */
    public abstract C1521d0 mo5697b();

    /* renamed from: c */
    public abstract int mo5698c();

    /* renamed from: d */
    public abstract C1559j1 mo5699d();

    /* renamed from: i */
    public abstract C1716a mo5702i();
}
