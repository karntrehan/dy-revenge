package p027c.p043d.p044a;

import android.util.Range;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p027c.p043d.p044a.C1529f0;

/* renamed from: c.d.a.d0 */
public abstract class C1521d0 {

    /* renamed from: a */
    public static final Range<Integer> f4767a;

    /* renamed from: b */
    public static final Range<Integer> f4768b;

    /* renamed from: c */
    public static final C1521d0 f4769c = m6805a().mo5641c(0).mo5639a();

    /* renamed from: c.d.a.d0$a */
    public static abstract class C1522a {
        C1522a() {
        }

        /* renamed from: a */
        public abstract C1521d0 mo5639a();

        /* renamed from: b */
        public abstract C1522a mo5640b(Range<Integer> range);

        /* renamed from: c */
        public abstract C1522a mo5641c(int i);

        /* renamed from: d */
        public abstract C1522a mo5642d(Range<Integer> range);

        /* renamed from: e */
        public abstract C1522a mo5643e(int i);
    }

    static {
        Integer valueOf = Integer.valueOf(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
        f4767a = new Range<>(0, valueOf);
        f4768b = new Range<>(0, valueOf);
    }

    C1521d0() {
    }

    /* renamed from: a */
    public static C1522a m6805a() {
        return new C1529f0.C1531b().mo5655f(-1).mo5643e(-1).mo5641c(-1).mo5640b(f4767a).mo5642d(f4768b);
    }

    /* renamed from: b */
    public abstract Range<Integer> mo5634b();

    /* renamed from: c */
    public abstract int mo5635c();

    /* renamed from: d */
    public abstract Range<Integer> mo5636d();

    /* renamed from: e */
    public abstract int mo5637e();

    /* renamed from: f */
    public abstract int mo5638f();
}
