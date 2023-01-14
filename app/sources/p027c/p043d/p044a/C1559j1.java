package p027c.p043d.p044a;

import android.util.Range;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import p027c.p043d.p044a.C1699p0;

/* renamed from: c.d.a.j1 */
public abstract class C1559j1 {

    /* renamed from: a */
    public static final Range<Integer> f4840a;

    /* renamed from: b */
    public static final Range<Integer> f4841b;

    /* renamed from: c */
    public static final C1731z0 f4842c;

    /* renamed from: c.d.a.j1$a */
    public static abstract class C1560a {
        C1560a() {
        }

        /* renamed from: a */
        public abstract C1559j1 mo5714a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C1560a mo5715b(int i);

        /* renamed from: c */
        public abstract C1560a mo5716c(Range<Integer> range);

        /* renamed from: d */
        public abstract C1560a mo5717d(Range<Integer> range);

        /* renamed from: e */
        public abstract C1560a mo5718e(C1731z0 z0Var);
    }

    static {
        Integer valueOf = Integer.valueOf(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
        f4840a = new Range<>(0, valueOf);
        f4841b = new Range<>(0, valueOf);
        C1727y0 y0Var = C1727y0.f5142c;
        f4842c = C1731z0.m7390f(Arrays.asList(new C1727y0[]{y0Var, C1727y0.f5141b, C1727y0.f5140a}), C1703q0.m7333a(y0Var));
    }

    C1559j1() {
    }

    /* renamed from: a */
    public static C1560a m6930a() {
        return new C1699p0.C1701b().mo5718e(f4842c).mo5717d(f4840a).mo5716c(f4841b).mo5715b(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo5709b();

    /* renamed from: c */
    public abstract Range<Integer> mo5710c();

    /* renamed from: d */
    public abstract Range<Integer> mo5711d();

    /* renamed from: e */
    public abstract C1731z0 mo5712e();

    /* renamed from: f */
    public abstract C1560a mo5713f();
}
